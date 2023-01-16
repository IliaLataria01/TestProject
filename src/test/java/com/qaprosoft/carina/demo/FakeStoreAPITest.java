package com.qaprosoft.carina.demo;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.api.GetAllProductMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class FakeStoreAPITest implements IAbstractTest {

    @Test
    public void getAllProductsTest() {
        GetAllProductMethod getAllMethod = new GetAllProductMethod();
        getAllMethod.callAPIExpectSuccess();
        getAllMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getAllMethod.validateResponseAgainstSchema("api/products/_get/rs.schema");
    }
}
