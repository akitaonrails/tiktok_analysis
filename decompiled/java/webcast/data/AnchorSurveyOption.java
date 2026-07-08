package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorSurveyOption {

    @C09CT("input_type")
    public int inputType;

    @C09CT("option_index")
    public int optionIndex;

    @C09CT("option_text")
    public String optionText = "";

    @C09CT("help_text")
    public String helpText = "";

    @C09CT("sub_options")
    public List<AnchorSurveyOption> subOptions = new ArrayList();
}
