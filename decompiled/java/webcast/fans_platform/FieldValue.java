package webcast.fans_platform;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class FieldValue {

    @C09CT("bool_value")
    public boolean boolValue;

    @C09CT("date_value")
    public long dateValue;

    @C09CT("int64_value")
    public long int64Value;

    @C09CT("model_ref_ins")
    public ModelInstance modelRefIns;

    @C09CT("string_value")
    public String stringValue = "";

    @C09CT("list_value")
    public List<FieldValue> listValue = new ArrayList();

    @C09CT("map_value")
    public Map<String, FieldValue> mapValue = new LinkedHashMap();

    @C09CT("json_value")
    public String jsonValue = "";

    @C09CT("starling_key_value")
    public String starlingKeyValue = "";

    @C09CT("image_value")
    public String imageValue = "";

    @C09CT("model_ref_value")
    public String modelRefValue = "";

    @C09CT("image_value_url")
    public String imageValueUrl = "";

    @C09CT("starling_value_text")
    public String starlingValueText = "";
}
