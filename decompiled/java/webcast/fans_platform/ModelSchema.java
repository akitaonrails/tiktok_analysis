package webcast.fans_platform;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ModelSchema {

    @C09CT("model_type")
    public String modelType = "";

    @C09CT("fields")
    public List<FieldDefinition> fields = new ArrayList();

    @C09CT("meta")
    public Map<String, String> meta = new LinkedHashMap();
}
