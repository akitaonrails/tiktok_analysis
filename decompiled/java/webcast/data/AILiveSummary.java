package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AILiveSummary {

    @C09CT("ai_live_summary_switch")
    public int aiLiveSummarySwitch;

    @C09CT("ai_live_summary_type")
    public int aiLiveSummaryType;

    @C09CT("create_timestamp")
    public long createTimestamp;

    @C09CT("highlight_required")
    public boolean highlightRequired;

    @C09CT("open_ai_summary")
    public int openAiSummary;

    @C09CT("room_llm_title")
    public String roomLlmTitle = "";

    @C09CT("result_key")
    public String resultKey = "";

    @C09CT("ai_summary_list")
    public List<String> aiSummaryList = new ArrayList();

    @C09CT("ai_live_summary_versions")
    public String aiLiveSummaryVersions = "";

    @C09CT("audience_side_title_language")
    public String audienceSideTitleLanguage = "";
}
