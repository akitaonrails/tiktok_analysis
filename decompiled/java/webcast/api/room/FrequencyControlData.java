package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes8.dex */
public final class FrequencyControlData {

    @C09CT("negative_feedback_times")
    public long negativeFeedbackTimes;

    @C09CT("result")
    public boolean result;

    @C09CT("room")
    public Room room;

    @C09CT("avoid_reason")
    public String avoidReason = "";

    @C09CT("toplive_page_guide_scene")
    public String toplivePageGuideScene = "";
}
