package webcast.fans_platform;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class FieldDefinition {

    @C09CT("editable")
    public boolean editable;

    @C09CT("is_required")
    public boolean isRequired;

    @C09CT("sub_type")
    public int subType;

    @C09CT("type")
    public int type;

    @C09CT("value")
    public FieldValue value;

    @C09CT("name")
    public String name = "";

    @C09CT("description")
    public String description = "";

    @C09CT("options")
    public List<FieldValue> options = new ArrayList();

    @C09CT("meta")
    public Map<String, String> meta = new LinkedHashMap();
}
