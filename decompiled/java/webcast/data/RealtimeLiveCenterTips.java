package webcast.data;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class RealtimeLiveCenterTips {

    @C09CT("show_feedback")
    public boolean showFeedback;

    @C09CT("show_tips")
    public boolean showTips;

    @C09CT("tip_type")
    public long tipType;

    @C09CT("tip_text")
    public String tipText = "";

    @C09CT("random_tip_key")
    public String randomTipKey = "";

    @C09CT("tips_schema")
    public String tipsSchema = "";

    @C09CT("button_name")
    public String buttonName = "";

    @C09CT("button_event_track")
    public String buttonEventTrack = "";

    @C09CT("type_event_track")
    public String typeEventTrack = "";

    @C09CT("tips_starling_key")
    public String tipsStarlingKey = "";

    @C09CT("suggestion_record_id")
    public String suggestionRecordId = "";

    @C09CT("event_track_params")
    public Map<String, String> eventTrackParams = new LinkedHashMap();

    @C09CT("title")
    public String title = "";
}
