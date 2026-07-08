package com.ss.ttlivestreamer.livestreamv2.videoquality.controler;

import X.C0UWQ;
import X.C1D41;
import X.C1D46;
import X.C1D47;
import X.C1D49;
import X.C2249361D2g;
import X.C783730Uol;
import X.EnumC1283150jUn;
import X.EnumC773550UWb;
import X.EnumC783720Uok;
import com.ss.solution.gear_center.LyraxGearCenterListener;
import com.ss.solution.gear_center.LyraxGearLiveType;
import com.ss.solution.gear_center.LyraxGearStrategyResult;
import com.ss.solution.gear_center.LyraxNetProbeProgress;
import com.ss.solution.gear_center.LyraxNetProbeResult;
import com.ss.solution.gear_center.LyraxProbeErrorCode;
import com.ss.solution.gear_center.LyraxProbeOriginType;
import com.ss.ttlivestreamer.livestreamv2.videoquality.controler.VideoQualityStrategyManagerV2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public final class VideoQualityStrategyManagerV2$gearCenterListener$1 implements LyraxGearCenterListener {
    public final /* synthetic */ VideoQualityStrategyManagerV2 LIZ;

    public VideoQualityStrategyManagerV2$gearCenterListener$1(VideoQualityStrategyManagerV2 videoQualityStrategyManagerV2) {
        this.LIZ = videoQualityStrategyManagerV2;
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenterListener
    public final void onGearStrategyResult(LyraxGearStrategyResult lyraxGearStrategyResult) {
        C1D47 c1d47LJIL = this.LIZ.LJIL(lyraxGearStrategyResult);
        C1D41 c1d41 = this.LIZ.LJI;
        if (c1d41 != null) {
            c1d41.LIZLLL(c1d47LJIL);
        }
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenterListener
    public final void onProbeError(LyraxProbeErrorCode lyraxProbeErrorCode) {
        C1D41 c1d41;
        EnumC783720Uok enumC783720Uok;
        if (lyraxProbeErrorCode == LyraxProbeErrorCode.StartSuccess && (c1d41 = this.LIZ.LJI) != null) {
            EnumC773550UWb enumC773550UWb = EnumC773550UWb.TESTING;
            C783730Uol c783730Uol = this.LIZ.LJIIIIZZ;
            if (c783730Uol != null) {
                enumC783720Uok = c783730Uol.LIZ;
            } else {
                enumC783720Uok = null;
            }
            c1d41.LIZJ(enumC773550UWb, enumC783720Uok);
        }
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenterListener
    public final void onProbeProgress(LyraxNetProbeProgress lyraxNetProbeProgress) {
        this.LIZ.getClass();
        C2249361D2g c2249361D2g = new C2249361D2g();
        c2249361D2g.LIZIZ = lyraxNetProbeProgress.bandwidth;
        c2249361D2g.LIZJ = lyraxNetProbeProgress.index;
        c2249361D2g.LIZ = -1;
        C1D41 c1d41 = this.LIZ.LJI;
        if (c1d41 != null) {
            c1d41.LIZIZ(c2249361D2g);
        }
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenterListener
    public final void onProbeResult(LyraxNetProbeResult lyraxNetProbeResult) {
        EnumC1283150jUn enumC1283150jUn;
        int i;
        EnumC783720Uok enumC783720Uok;
        C0UWQ c0uwq;
        EnumC1283150jUn enumC1283150jUn2;
        EnumC783720Uok enumC783720Uok2;
        if (!lyraxNetProbeResult.succeed && this.LIZ.LIZLLL != LyraxGearLiveType.Game) {
            C1D41 c1d41 = this.LIZ.LJI;
            if (c1d41 != null) {
                EnumC773550UWb enumC773550UWb = EnumC773550UWb.PROBE_FAILED;
                VideoQualityStrategyManagerV2 videoQualityStrategyManagerV2 = this.LIZ;
                LyraxProbeOriginType lyraxProbeOriginType = lyraxNetProbeResult.probeOrigin;
                videoQualityStrategyManagerV2.getClass();
                int i2 = VideoQualityStrategyManagerV2.WhenMappings.LIZJ[lyraxProbeOriginType.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        enumC783720Uok2 = EnumC783720Uok.DEFAULT;
                    } else {
                        enumC783720Uok2 = EnumC783720Uok.MANUAL;
                    }
                } else {
                    enumC783720Uok2 = EnumC783720Uok.AUTO;
                }
                c1d41.LIZJ(enumC773550UWb, enumC783720Uok2);
                return;
            }
            return;
        }
        VideoQualityStrategyManagerV2 videoQualityStrategyManagerV22 = this.LIZ;
        videoQualityStrategyManagerV22.getClass();
        C1D49 c1d49 = new C1D49();
        LyraxGearLiveType lyraxGearLiveType = videoQualityStrategyManagerV22.LIZLLL;
        LyraxGearLiveType lyraxGearLiveType2 = LyraxGearLiveType.Game;
        if (lyraxGearLiveType == lyraxGearLiveType2) {
            enumC1283150jUn = EnumC1283150jUn.GAME;
        } else {
            enumC1283150jUn = EnumC1283150jUn.STAGE;
        }
        c1d49.LJIILIIL = enumC1283150jUn;
        if (lyraxNetProbeResult.succeed) {
            i = 1;
        } else {
            i = 2;
        }
        c1d49.LJIILJJIL = i;
        c1d49.LIZIZ = lyraxNetProbeResult.bandwidth;
        int i3 = VideoQualityStrategyManagerV2.WhenMappings.LIZJ[lyraxNetProbeResult.probeOrigin.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                enumC783720Uok = EnumC783720Uok.DEFAULT;
            } else {
                enumC783720Uok = EnumC783720Uok.MANUAL;
            }
        } else {
            enumC783720Uok = EnumC783720Uok.AUTO;
        }
        c1d49.LJIIJJI = enumC783720Uok;
        int i4 = VideoQualityStrategyManagerV2.WhenMappings.LJ[lyraxNetProbeResult.networkGrade.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    c0uwq = C0UWQ.DEFAULT;
                } else {
                    c0uwq = C0UWQ.GOOD_NETWORK;
                }
            } else {
                c0uwq = C0UWQ.NORMAL_NETWORK;
            }
        } else {
            c0uwq = C0UWQ.POOR_NETWORK;
        }
        c1d49.LJIIJ = c0uwq;
        int i5 = lyraxNetProbeResult.gearLevel;
        if (videoQualityStrategyManagerV22.LIZLLL == lyraxGearLiveType2) {
            enumC1283150jUn2 = EnumC1283150jUn.GAME;
        } else {
            enumC1283150jUn2 = EnumC1283150jUn.STAGE;
        }
        c1d49.LIZ = new C1D46(i5, enumC1283150jUn2);
        C1D41 c1d412 = this.LIZ.LJI;
        if (c1d412 == null) {
            return;
        }
        c1d412.LIZ(c1d49);
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenterListener
    public final void onReportEvent(String str, JSONObject jSONObject) {
        C1D41 c1d41 = this.LIZ.LJI;
        if (c1d41 != null) {
            c1d41.onEvent(str, jSONObject);
        }
    }
}
