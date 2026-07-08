package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09AY;
import X.C2188811AlT;
import X.InterfaceC754220TiG;
import X.InterfaceC965150bDt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class RTCClientData {
    public static final Companion Companion = new Companion();
    public final String background;
    public final boolean businessSideEnableIndependentMixStreamParams;
    public final InterfaceC754220TiG client;
    public final Function0<String> generateRTCParamByRole;
    public final boolean initInBackground;
    public final MixInfo mixerInfo;
    public final boolean pushAdvance;
    public final List<String> pushUrls;
    public final InterfaceC965150bDt renderResProvider;
    public final RtcLiveVideoParam rtcVideoParamInfo;
    public final String sharedBgUrl;
    public final boolean shouldMixStream;

    public static final class Builder {
        public String background;
        public boolean businessSideEnableIndependentMixStreamParams;
        public InterfaceC754220TiG client;
        public boolean initInBackground;
        public MixInfo mixerInfo;
        public List<String> pushUrls;
        public InterfaceC965150bDt renderResProvider;
        public RtcLiveVideoParam rtcVideoParamInfo;
        public String sharedBgUrl;
        public boolean shouldMixStream;
        public boolean pushAdvance = true;
        public Function0<String> generateRTCParamByRole = AFwS203S0000000_15.get$arr$(162);

        public final RTCClientData build() {
            return new RTCClientData(this);
        }

        public final String getBackground() {
            return this.background;
        }

        public final boolean getBusinessSideEnableIndependentMixStreamParams() {
            return this.businessSideEnableIndependentMixStreamParams;
        }

        public final InterfaceC754220TiG getClient() {
            return this.client;
        }

        public final Function0<String> getGenerateRTCParamByRole() {
            return this.generateRTCParamByRole;
        }

        public final boolean getInitInBackground() {
            return this.initInBackground;
        }

        public final MixInfo getMixerInfo() {
            return this.mixerInfo;
        }

        public final boolean getPushAdvance() {
            return this.pushAdvance;
        }

        public final List<String> getPushUrls() {
            return this.pushUrls;
        }

        public final InterfaceC965150bDt getRenderResProvider() {
            return this.renderResProvider;
        }

        public final RtcLiveVideoParam getRtcVideoParamInfo() {
            return this.rtcVideoParamInfo;
        }

        public final String getSharedBgUrl() {
            return this.sharedBgUrl;
        }

        public final boolean getShouldMixStream() {
            return this.shouldMixStream;
        }

        public final void setBackground(String str) {
            this.background = str;
        }

        public final void setBusinessSideEnableIndependentMixStreamParams(boolean z) {
            this.businessSideEnableIndependentMixStreamParams = z;
        }

        public final void setClient(InterfaceC754220TiG interfaceC754220TiG) {
            this.client = interfaceC754220TiG;
        }

        public final void setGenerateRTCParamByRole(Function0<String> function0) {
            this.generateRTCParamByRole = function0;
        }

        public final void setInitInBackground(boolean z) {
            this.initInBackground = z;
        }

        public final void setMixerInfo(MixInfo mixInfo) {
            this.mixerInfo = mixInfo;
        }

        public final void setPushAdvance(boolean z) {
            this.pushAdvance = z;
        }

        public final void setPushUrls(List<String> list) {
            this.pushUrls = list;
        }

        public final void setRenderResProvider(InterfaceC965150bDt interfaceC965150bDt) {
            this.renderResProvider = interfaceC965150bDt;
        }

        public final void setRtcVideoParamInfo(RtcLiveVideoParam rtcLiveVideoParam) {
            this.rtcVideoParamInfo = rtcLiveVideoParam;
        }

        public final void setSharedBgUrl(String str) {
            this.sharedBgUrl = str;
        }

        public final void setShouldMixStream(boolean z) {
            this.shouldMixStream = z;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RTCClientData(shouldMixStream=");
        sbLIZ.append(this.shouldMixStream);
        sbLIZ.append(", client=");
        sbLIZ.append(this.client);
        sbLIZ.append(", pushAdvance=");
        sbLIZ.append(this.pushAdvance);
        sbLIZ.append(", initInBackground=");
        sbLIZ.append(this.initInBackground);
        sbLIZ.append(", businessSideEnableIndependentMixStreamParams=");
        sbLIZ.append(this.businessSideEnableIndependentMixStreamParams);
        sbLIZ.append(" ,renderResProvider=");
        InterfaceC965150bDt interfaceC965150bDt = this.renderResProvider;
        sbLIZ.append(interfaceC965150bDt != null ? interfaceC965150bDt.hashCode() : 0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX INFO: renamed from: com.bytedance.android.livesdk.comp.api.linkcore.model.RTCClientData$1, reason: invalid class name */
    public final class AnonymousClass1 extends C09AY implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return "";
        }
    }

    public final String getBackground() {
        return this.background;
    }

    public final boolean getBusinessSideEnableIndependentMixStreamParams() {
        return this.businessSideEnableIndependentMixStreamParams;
    }

    public final InterfaceC754220TiG getClient() {
        return this.client;
    }

    public final Function0<String> getGenerateRTCParamByRole() {
        return this.generateRTCParamByRole;
    }

    public final boolean getInitInBackground() {
        return this.initInBackground;
    }

    public final MixInfo getMixerInfo() {
        return this.mixerInfo;
    }

    public final boolean getPushAdvance() {
        return this.pushAdvance;
    }

    public final List<String> getPushUrls() {
        return this.pushUrls;
    }

    public final InterfaceC965150bDt getRenderResProvider() {
        return this.renderResProvider;
    }

    public final RtcLiveVideoParam getRtcVideoParamInfo() {
        return this.rtcVideoParamInfo;
    }

    public final String getSharedBgUrl() {
        return this.sharedBgUrl;
    }

    public final boolean getShouldMixStream() {
        return this.shouldMixStream;
    }

    public static final class Companion {
        public final RTCClientData build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public RTCClientData(Builder builder) {
        this(builder.getShouldMixStream(), builder.getMixerInfo(), builder.getClient(), builder.getRtcVideoParamInfo(), builder.getPushAdvance(), builder.getInitInBackground(), builder.getBackground(), builder.getGenerateRTCParamByRole(), builder.getBusinessSideEnableIndependentMixStreamParams(), builder.getSharedBgUrl(), builder.getPushUrls(), builder.getRenderResProvider());
    }

    public RTCClientData(boolean z, MixInfo mixInfo, InterfaceC754220TiG interfaceC754220TiG, RtcLiveVideoParam rtcLiveVideoParam, boolean z2, boolean z3, String str, Function0<String> function0, boolean z4, String str2, List<String> list, InterfaceC965150bDt interfaceC965150bDt) {
        this.shouldMixStream = z;
        this.mixerInfo = mixInfo;
        this.client = interfaceC754220TiG;
        this.rtcVideoParamInfo = rtcLiveVideoParam;
        this.pushAdvance = z2;
        this.initInBackground = z3;
        this.background = str;
        this.generateRTCParamByRole = function0;
        this.businessSideEnableIndependentMixStreamParams = z4;
        this.sharedBgUrl = str2;
        this.pushUrls = list;
        this.renderResProvider = interfaceC965150bDt;
    }
}
