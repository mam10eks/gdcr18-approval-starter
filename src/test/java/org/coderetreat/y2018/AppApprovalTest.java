package org.coderetreat.y2018;

import java.util.HashMap;
import java.util.Map;

import org.approvaltests.Approvals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppApprovalTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void approveHelloWorldString()
    {
    	Approvals.verify("Hello World!");
    }
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void approveMapWhereHelloMapsToWorld()
    {
    	Map<String, String> exampleMap = new HashMap<>();
    	exampleMap.put("hello", "world");

    	Approvals.verifyAsJson(exampleMap);
    }
}
