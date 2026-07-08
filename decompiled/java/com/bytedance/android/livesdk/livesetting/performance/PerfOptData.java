package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PerfOptData {
    public static final TypeAdapter ADAPTER = new PerfOptData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("fixClearAudioFocusListenerLeak")
    public boolean enableFixClearAudioFocusListenerLeak;

    @C09CT("enableLowMemStringGCOpt")
    public boolean enableLowMemStringGCOpt;

    @C09CT("sampleRate")
    public double sampleRate;

    public PerfOptData() {
        this(0.1d, false, false);
    }

    public PerfOptData(double d, boolean z, boolean z2) {
        this.sampleRate = d;
        this.enableLowMemStringGCOpt = z;
        this.enableFixClearAudioFocusListenerLeak = z2;
    }
}
