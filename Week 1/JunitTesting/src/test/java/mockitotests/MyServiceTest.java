package mockitotests;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import mockitotestclasses.ExternalApi;
import mockitotestclasses.MyService;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Use in service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert
        assertEquals("Mock Data", result);
    }
    
    @Test
    public void testVerifyInteraction() {
        // Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Inject mock
        MyService service = new MyService(mockApi);

        // Act
        service.fetchData();

        // Verify that getData() was called
        verify(mockApi).getData();
    }

}
