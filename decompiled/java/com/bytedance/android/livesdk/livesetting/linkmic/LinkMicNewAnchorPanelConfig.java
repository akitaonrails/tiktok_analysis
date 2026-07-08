package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicNewAnchorPanelConfig {
    public static final TypeAdapter ADAPTER = new LinkMicNewAnchorPanelConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("apply_list_expand_count")
    public int applyListExpandCount;

    @C09CT("apply_list_fold_threshold")
    public int applyListFoldThreshold;

    @C09CT("enable")
    public boolean enable;

    @C09CT("friend_list_expand_count")
    public int friendListExpandCount;

    @C09CT("friend_list_fold_threshold")
    public int friendListFoldThreshold;

    @C09CT("live_event_reservation_list_expand_count")
    public int liveEventReservationListExpandCount;

    @C09CT("live_event_reservation_list_fold_threshold")
    public int liveEventReservationListFoldThreshold;

    @C09CT("suggest_list_in_real_time")
    public boolean suggestListInRealTime;

    @C09CT("viewer_list_expand_count")
    public int viewerListExpandCount;

    @C09CT("viewer_list_fold_threshold")
    public int viewerListFoldThreshold;

    public LinkMicNewAnchorPanelConfig() {
        this(false, 20, 20, 3, 3, 3, 3, 3, 3, false);
    }

    public LinkMicNewAnchorPanelConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2) {
        this.enable = z;
        this.applyListFoldThreshold = i;
        this.applyListExpandCount = i2;
        this.viewerListFoldThreshold = i3;
        this.viewerListExpandCount = i4;
        this.liveEventReservationListFoldThreshold = i5;
        this.liveEventReservationListExpandCount = i6;
        this.friendListFoldThreshold = i7;
        this.friendListExpandCount = i8;
        this.suggestListInRealTime = z2;
    }
}
