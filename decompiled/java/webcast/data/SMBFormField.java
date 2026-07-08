package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class SMBFormField {

    @C09CT("field_type")
    public int fieldType;

    @C09CT("input_type")
    public int inputType;

    @C09CT("is_optional")
    public boolean isOptional;

    @C09CT("brick_index")
    public String brickIndex = "";

    @C09CT("label_text")
    public String labelText = "";

    @C09CT("label_desc")
    public String labelDesc = "";

    @C09CT("options")
    public List<String> options = new ArrayList();

    @C09CT("validation")
    public String validation = "";

    @C09CT("default_value")
    public String defaultValue = "";

    @C09CT("placeholder")
    public String placeholder = "";
}
