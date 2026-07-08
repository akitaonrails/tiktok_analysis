package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LivePodcastResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("anchor_level_permission")
        public AnchorLevelPermission anchorLevelPermission;

        @C09CT("can_be_live_podcast")
        public boolean canBeLivePodcast;

        @C09CT("can_be_pico_live_podcast")
        public boolean canBePicoLivePodcast;

        @C09CT("can_be_social_live")
        public boolean canBeSocialLive;

        @C09CT("can_cache")
        public long canCache;

        @C09CT("conditions_popup")
        public EntranceConditionsPopup conditionsPopup;

        @C09CT("go_live_event_tracing")
        public GoLiveEventTracing goLiveEventTracing;

        @C09CT("golive_locale_restricted")
        public boolean goliveLocaleRestricted;

        @C09CT("is_first_time_having_live_permission")
        public boolean isFirstTimeHavingLivePermission;

        @C09CT("is_pro_anchor")
        public boolean isProAnchor;

        @C09CT("live_permission_apply")
        public LivePermissionApply livePermissionApply;

        @C09CT("live_scenario")
        public LiveScenario liveScenario;

        @C09CT("live_studio_permission_status")
        public LiveStudioPermissionStatus liveStudioPermissionStatus;

        @C09CT("show_live_studio")
        public boolean showLiveStudio;

        @C09CT("show_mock_live_tab")
        public boolean showMockLiveTab;

        @C09CT("stream")
        public Stream stream;

        @C09CT("try_mode")
        public TryMode tryMode;

        @C09CT("watched_live_for_the_past_n_days")
        public boolean watchedLiveForThePastNDays;
    }
}
