package webcast.fans_platform;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ModelUpdatePayload {

    @C09CT("value_schema")
    public ModelSchema valueSchema;

    @C09CT("business_id")
    public String businessId = "";

    @C09CT("name")
    public String name = "";

    @C09CT("description")
    public String description = "";

    @C09CT("value_json")
    public String valueJson = "";

    @C09CT("meta")
    public Map<String, String> meta = new LinkedHashMap();
}
