package sda.com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class Testing {
    @Mock
    private Calculator calculator;
@Test
    public void testadd(){
        when(calculator.add(eq(1),eq(2))).thenReturn(5);
       verify(calculator).add(1,3);
    }

}
