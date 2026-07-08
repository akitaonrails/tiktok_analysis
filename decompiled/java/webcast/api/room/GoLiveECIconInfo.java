package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class GoLiveECIconInfo {

    @C09CT("bubble_metadata")
    public BubbleMetadata bubbleMetadata;

    @C09CT("bubble_text")
    public String bubbleText = "";

    @C09CT("display_ec_icon")
    public boolean displayEcIcon;

    @C09CT("display_red_dot")
    public boolean displayRedDot;

    @C09CT("has_ec_live_permission")
    public boolean hasEcLivePermission;

    @C09CT("independent_display_ec_icon")
    public boolean independentDisplayEcIcon;

    @C09CT("old_ec_icon_logic")
    public boolean oldEcIconLogic;

    public static final class BubbleMetadata {

        @C09CT("live_task_id")
        public String liveTaskId = "";

        @C09CT("live_task_status")
        public int liveTaskStatus;
    }
}
