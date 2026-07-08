package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkMicAudioSelectionPriorityConfig {
    public static final TypeAdapter ADAPTER = new LinkMicAudioSelectionPriorityConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("linkmic_downlink_select_priority_anchor")
    public int anchorPriority;

    @C09CT("linkmic_downlink_select_priority_enable")
    public boolean enable;

    @C09CT("linkmic_downlink_select_priority_guest")
    public int guestPriority;

    public LinkMicAudioSelectionPriorityConfig() {
        this(false, 2, 0);
    }

    public LinkMicAudioSelectionPriorityConfig(boolean z, int i, int i2) {
        this.enable = z;
        this.anchorPriority = i;
        this.guestPriority = i2;
    }
}
