package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class FixCtlOptions {
    public static final TypeAdapter ADAPTER = new FixCtlOptions_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_data_channel_leak_fix")
    public boolean enableDataChannelLeakFix;

    @C09CT("enable_likeable_view_leak_opt")
    public boolean enableLikeableViewLeakOpt;

    @C09CT("live_dialog_leak_fix")
    public boolean enableLiveDialogLeakFix;

    @C09CT("portrait_audience_fragment_leak_fix")
    public boolean enablePortraitAudienceFragmentLeakFix;

    @C09CT("root_view_reuse_leak_fix")
    public boolean enableReuseLeakFix;

    public FixCtlOptions() {
        this(false, false, false, false, false);
    }

    public FixCtlOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enableLiveDialogLeakFix = z;
        this.enablePortraitAudienceFragmentLeakFix = z2;
        this.enableLikeableViewLeakOpt = z3;
        this.enableDataChannelLeakFix = z4;
        this.enableReuseLeakFix = z5;
    }
}
