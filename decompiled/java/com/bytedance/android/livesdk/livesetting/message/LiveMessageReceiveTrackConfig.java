package com.bytedance.android.livesdk.livesetting.message;

import X.C001A;
import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveMessageReceiveTrackConfig extends LiveMessageServerSample {
    public static final TypeAdapter ADAPTER = new LiveMessageReceiveTrackConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("allow_method_list")
    public List<String> allowedMethods;

    @C09CT("allow_p2p_method_list")
    public List<String> allowedP2PMethods;

    @C09CT("p2p_sampling_rate")
    public double p2pFullSampling;

    @C09CT("common_sampling_rate")
    public double samplingRate;

    public LiveMessageReceiveTrackConfig() {
        this(0.0d, 0.0d, null, null, 15, null);
    }

    public final List<String> getAllowedMethods() {
        return this.allowedMethods;
    }

    public final List<String> getAllowedP2PMethods() {
        return this.allowedP2PMethods;
    }

    public final double getP2pFullSampling() {
        return this.p2pFullSampling;
    }

    public final double getSamplingRate() {
        return this.samplingRate;
    }

    public final void setAllowedMethods(List<String> list) {
        this.allowedMethods = list;
    }

    public final void setAllowedP2PMethods(List<String> list) {
        this.allowedP2PMethods = list;
    }

    public final void setP2pFullSampling(double d) {
        this.p2pFullSampling = d;
    }

    public final void setSamplingRate(double d) {
        this.samplingRate = d;
    }

    public LiveMessageReceiveTrackConfig(double d, double d2, List<String> list, List<String> list2) {
        super(new LiveMessageSampleType(new LiveMessageSampleRatio(0L, 0L, 0L, 1000L), new LiveMessageSampleRatio(0L, 0L, 0L, 1000L)), new LiveMessageSampleType(new LiveMessageSampleRatio(0L, 0L, 0L, 1000L), new LiveMessageSampleRatio(0L, 0L, 0L, 1000L)));
        this.samplingRate = d;
        this.p2pFullSampling = d2;
        this.allowedMethods = list;
        this.allowedP2PMethods = list2;
    }

    public LiveMessageReceiveTrackConfig(double d, double d2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0E-4d : d, (i & 2) != 0 ? 1.0d : d2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C1697810uHb.LJIIJJI(C001A.LINK_MESSAGE.wsMethod, C001A.LINK_AUDIENCE_NOTICE.wsMethod, C001A.BASE_LINK_LAYER_MESSAGE.wsMethod, C001A.LINK_MIC.wsMethod, C001A.LINK_MIC_BATTLE_ARMIES.wsMethod) : list2);
    }
}
