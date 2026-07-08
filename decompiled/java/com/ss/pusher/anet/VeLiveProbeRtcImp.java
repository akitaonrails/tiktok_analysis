package com.ss.pusher.anet;

import X.C098200Yq;
import X.C1278000jMU;
import X.C1282810jUF;
import X.C1282850jUJ;
import X.C189200o6;
import X.C1954807lC;
import X.EnumC1282790jUD;
import X.InterfaceC1282840jUI;
import X.InterfaceC1283000jUY;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.bytertc.engine.livepusher.ILiveProberEventHandler;
import com.ss.bytertc.engine.livepusher.LiveProbeBandwidthCalcType;
import com.ss.bytertc.engine.livepusher.LiveProbeResult;
import com.ss.bytertc.engine.livepusher.LiveProber;
import com.ss.bytertc.engine.livepusher.LiveProberConfig;
import com.ss.bytertc.engine.livepusher.RTMPProbeBandwidthResult;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.UploadBWProbeParams;
import com.ss.pusher.core.utils.GsonHolder;

/* JADX INFO: loaded from: classes21.dex */
public final class VeLiveProbeRtcImp implements InterfaceC1283000jUY, ILiveProberEventHandler {
    public final C1282810jUF config;
    public final LiveProber probe;

    @Override // X.InterfaceC1283000jUY
    public C1282850jUJ getBandwidthResult() {
        if (this.probe == null) {
            return null;
        }
        RTMPProbeBandwidthResult rTMPProbeBandwidthResult = new RTMPProbeBandwidthResult();
        this.probe.getBandwidthResult(rTMPProbeBandwidthResult);
        return new C1282850jUJ(rTMPProbeBandwidthResult.event1, rTMPProbeBandwidthResult.event2, rTMPProbeBandwidthResult.event3, rTMPProbeBandwidthResult.msg);
    }

    @Override // X.InterfaceC1283000jUY
    public void release() {
        LiveProber.destroyLiveProber(this.probe);
    }

    @Override // X.InterfaceC1283000jUY
    public void start() {
        LiveProber liveProber = this.probe;
        if (liveProber != null) {
            liveProber.startProbe();
        }
    }

    @Override // X.InterfaceC1283000jUY
    public void stop() {
        LiveProber liveProber = this.probe;
        if (liveProber != null) {
            liveProber.stopProbe();
        }
    }

    public VeLiveProbeRtcImp(C1282810jUF c1282810jUF) {
        Object c098200Yq;
        String string;
        this.config = c1282810jUF;
        this.probe = LiveProber.createLiveProber(c1282810jUF.LIZ, c1282810jUF.LIZIZ, c1282810jUF.LJ, this, c1282810jUF.LJFF, c1282810jUF.LJI);
        try {
            Gson gson = GsonHolder.LIZ;
            c098200Yq = ((LiveSdkSetting) GsonHolder.LIZ.LJII(c1282810jUF.LIZJ, LiveSdkSetting.class)).uploadBWProbeParams;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        UploadBWProbeParams uploadBWProbeParams = (UploadBWProbeParams) (C189200o6.m7isFailureimpl(c098200Yq) ? new UploadBWProbeParams() : c098200Yq);
        LiveProberConfig liveProberConfig = new LiveProberConfig();
        liveProberConfig.probeDurationMs = uploadBWProbeParams.bWTestTimeMS;
        liveProberConfig.probeValidTimeMs = uploadBWProbeParams.packetSendValidTimeMS;
        liveProberConfig.netInfoLogIntervalMs = uploadBWProbeParams.logIntervalMS;
        liveProberConfig.bottomLine540pKbps = uploadBWProbeParams.bottomLine540pBwe;
        liveProberConfig.bottomLine720pKbps = uploadBWProbeParams.bottomLine720pBwe;
        liveProberConfig.bottomLine1080pKbps = uploadBWProbeParams.bottomLine1080pBwe;
        liveProberConfig.probeBottomLevel = uploadBWProbeParams.bWProbeBottomLevel;
        liveProberConfig.probeAimLevel = uploadBWProbeParams.bWProbeAimLevel;
        liveProberConfig.probeTargetBwKbps = uploadBWProbeParams.bwProbeTargetKbps;
        liveProberConfig.probeBandwidthCalcType = LiveProbeBandwidthCalcType.fromId(uploadBWProbeParams.probeBandwidthCalcType);
        liveProberConfig.firstOrderFilterParam = uploadBWProbeParams.firstOrderFilterParam;
        liveProberConfig.peakAvgCount = uploadBWProbeParams.peakAvgCount;
        n nVar = uploadBWProbeParams.rtcProbeParam;
        if (nVar != null) {
            string = nVar.toString();
        } else {
            string = null;
        }
        liveProberConfig.clientNetwork = string;
        LiveProber liveProber = this.probe;
        if (liveProber != null) {
            liveProber.setLiveProberConfig(liveProberConfig);
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.ILiveProberEventHandler
    public void onLogMonitor(String str) {
        if (str != null) {
            this.config.LIZLLL.onLogMonitor(str);
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.ILiveProberEventHandler
    public void onEvent(LiveProbeResult liveProbeResult, int i, String str) {
        EnumC1282790jUD enumC1282790jUD;
        InterfaceC1282840jUI interfaceC1282840jUI = this.config.LIZLLL;
        int i2 = C1278000jMU.LJ[liveProbeResult.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    enumC1282790jUD = EnumC1282790jUD.STOPPED_MANUALLY;
                } else {
                    throw new C1954807lC();
                }
            } else {
                enumC1282790jUD = EnumC1282790jUD.SUCCESS;
            }
        } else {
            enumC1282790jUD = EnumC1282790jUD.FAILED;
        }
        if (str == null) {
            str = "";
        }
        interfaceC1282840jUI.LIZ(enumC1282790jUD, i, str);
    }
}
