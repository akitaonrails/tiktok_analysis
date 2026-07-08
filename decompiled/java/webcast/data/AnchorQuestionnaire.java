package webcast.data;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorQuestionnaire {

    @C09CT("biz_type")
    public int bizType;

    @C09CT("display_mode")
    public int displayMode;

    @C09CT("questionnaire_id")
    public String questionnaireId = "";

    @C09CT("question_map")
    public Map<Integer, AnchorQuestion> questionMap = new LinkedHashMap();

    @C09CT("legal_reminder")
    public String legalReminder = "";

    @C09CT("extra")
    public String extra = "";

    @C09CT("name")
    public String name = "";

    @C09CT("termination_options")
    public Map<String, OptionIdxList> terminationOptions = new LinkedHashMap();

    @C09CT("legal_page")
    public String legalPage = "";
}
