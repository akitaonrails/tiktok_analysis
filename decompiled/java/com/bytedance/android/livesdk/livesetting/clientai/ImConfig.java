package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class ImConfig {
    public static final TypeAdapter ADAPTER = new ImConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("anchor_enable")
    public boolean anchorSideEnable;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_list")
    public List<String> enableList;

    @C09CT("frequency")
    public int frequency;

    @C09CT("im_no_freq_allow_list")
    public List<String> imNoFreqAllowList;

    public ImConfig() {
        this(false, 0, null, false, null, 31, null);
    }

    public ImConfig(boolean z, int i, List<String> list, boolean z2, List<String> list2) {
        this.enable = z;
        this.frequency = i;
        this.enableList = list;
        this.anchorSideEnable = z2;
        this.imNoFreqAllowList = list2;
    }

    public ImConfig(boolean z, int i, List list, boolean z2, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 2 : i, (i2 & 4) != 0 ? C1697810uHb.LJIIJJI("WebcastLikeMessage", "WebcastGiftMessage", "WebcastRankUpdateMessage", "WebcastChatMessage", "WebcastGiftGuideMessage") : list, (i2 & 8) == 0 ? z2 : false, (i2 & 16) != 0 ? Collections.singletonList("WebcastGiftGuideMessage") : list2);
    }
}
