package com.ss.pusher.core.engine;

import X.C1268030j6P;
import X.C1278660jNY;
import X.C1278760jNi;
import X.C1278910jNx;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1270070j9h;
import X.EnumC1277950jMP;
import X.InterfaceC1278410jN9;
import X.InterfaceC1278620jNU;
import Y.ARunnableS120S0100000_20;
import android.os.Handler;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.params.StrategyConfiguration;
import com.ss.pusher.core.utils.AVLog;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public class AdaptiveController {
    public InterfaceC1278410jN9 LIZ;
    public final InterfaceC1278620jNU LIZIZ;
    public final StrategyConfiguration LIZJ;
    public final Handler LIZLLL;
    public final LiveSdkSetting LJ;
    public long LJFF;
    public boolean LJI;

    private native int nativeCheckStrategyAccuracy(long j, int i);

    private native long nativeCreate(int i, int i2, int i3, int i4, String str);

    private native String nativeGetLevelDuration(long j);

    private native void nativeGetLevelInfo(long j, int i, int i2, int i3);

    private native void nativeInsertStandardLevel(long j, int i, int i2, int i3, int i4);

    private native void nativeNotifyConnectStarted(long j);

    private native void nativeRelease(long j);

    private native void nativeSetOutputImageSize(long j, int i, int i2, int i3);

    private native int nativeSetPerformanceMaxLevel(long j, int i, int i2, int i3, int[] iArr, int[] iArr2);

    private native int nativeTrigger(long j, int i, int[] iArr, int[] iArr2);

    public final void LJFF() {
        AVLog.iod("AdaptiveController", "notifyConnectStarted");
        long j = this.LJFF;
        if (j > 0) {
            nativeNotifyConnectStarted(j);
        }
    }

    public final void LJII() {
        Handler handler = this.LIZLLL;
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 93);
        if (handler.getLooper().getThread() == C786410Ut5.u3()) {
            aRunnableS120S0100000_20.run();
        } else {
            C786410Ut5.LJJZZIII(handler, aRunnableS120S0100000_20);
        }
    }

    public final void LJIIJJI() {
        if (this.LJI) {
            this.LJI = false;
            this.LIZLLL.removeCallbacks(new ARunnableS120S0100000_20(this, 94));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stop scheduler: ");
            sbLIZ.append(this);
            AVLog.iod("AdaptiveController", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJIIJ() {
        StrategyConfiguration strategyConfiguration;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start called: ");
        sbLIZ.append(this);
        sbLIZ.append(", nativeObj=");
        sbLIZ.append(this.LJFF);
        AVLog.iod("AdaptiveController", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJFF <= 0 || (strategyConfiguration = this.LIZJ) == null) {
            return;
        }
        if (strategyConfiguration.onlyUsePerfStrategy) {
            AVLog.iod("AdaptiveController", "only use performance strategy");
            return;
        }
        long j = ((long) strategyConfiguration.strategyInterval) * 1000;
        if (this.LJI) {
            return;
        }
        this.LJI = true;
        C786410Ut5.LJLIIL(j, this.LIZLLL, new ARunnableS120S0100000_20(this, 94));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("start scheduler: ");
        sbLIZ2.append(this);
        AVLog.iod("AdaptiveController", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static /* synthetic */ String LIZ(AdaptiveController adaptiveController) {
        adaptiveController.getClass();
        C1C7U.LIZ("AdaptiveController@49ad.getLevelDuration$1L");
        long j = adaptiveController.LJFF;
        if (j > 0) {
            String strNativeGetLevelDuration = adaptiveController.nativeGetLevelDuration(j);
            C1C7U.LIZIZ("AdaptiveController@49ad.getLevelDuration$1L");
            return strNativeGetLevelDuration;
        }
        C1C7U.LIZIZ("AdaptiveController@49ad.getLevelDuration$1L");
        return "";
    }

    public static /* synthetic */ Integer LIZIZ(AdaptiveController adaptiveController) {
        adaptiveController.getClass();
        C1C7U.LIZ("AdaptiveController@49ad.checkStrategyAccuracy$1L");
        long j = adaptiveController.LJFF;
        if (j > 0) {
            Integer numValueOf = Integer.valueOf(adaptiveController.nativeCheckStrategyAccuracy(j, adaptiveController.LIZIZ.LIZ()));
            C1C7U.LIZIZ("AdaptiveController@49ad.checkStrategyAccuracy$1L");
            return numValueOf;
        }
        C1C7U.LIZIZ("AdaptiveController@49ad.checkStrategyAccuracy$1L");
        return -10;
    }

    public static void LIZJ(AdaptiveController adaptiveController) {
        adaptiveController.getClass();
        C1C7U.LIZ("AdaptiveController@49ad.release$1L");
        if (adaptiveController.LJFF > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("released: ");
            sbLIZ.append(adaptiveController);
            AVLog.iod("AdaptiveController", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("registerObserver: ");
            sbLIZ2.append((Object) null);
            AVLog.iod("AdaptiveController", C2188811AlT.LIZIZ(sbLIZ2));
            adaptiveController.LIZ = null;
            adaptiveController.LJIIJJI();
            adaptiveController.nativeRelease(adaptiveController.LJFF);
            adaptiveController.LJFF = 0L;
        }
        C1C7U.LIZIZ("AdaptiveController@49ad.release$1L");
    }

    public static void LJ(AdaptiveController adaptiveController) {
        int iNativeTrigger;
        C1C7U.LIZ("AdaptiveController@49ad.stopScheduler$1L");
        StrategyConfiguration strategyConfiguration = adaptiveController.LIZJ;
        if (strategyConfiguration != null && adaptiveController.LJI) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[6];
            if (strategyConfiguration.strategyInputType == 1) {
                iNativeTrigger = adaptiveController.nativeTrigger(adaptiveController.LJFF, adaptiveController.LIZIZ.LIZ(), iArr, iArr2);
            } else {
                iNativeTrigger = adaptiveController.nativeTrigger(adaptiveController.LJFF, adaptiveController.LIZIZ.LIZIZ(), iArr, iArr2);
            }
            if (iNativeTrigger == 0) {
                adaptiveController.LJI(iArr, iArr2);
            }
            if (adaptiveController.LJI) {
                C786410Ut5.LJLIIL(((long) adaptiveController.LIZJ.strategyInterval) * 1000, adaptiveController.LIZLLL, new ARunnableS120S0100000_20(adaptiveController, 94));
            }
        }
        C1C7U.LIZIZ("AdaptiveController@49ad.stopScheduler$1L");
    }

    public final void LJI(int[] iArr, int[] iArr2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAdjustResult: ");
        sbLIZ.append(Arrays.toString(iArr));
        sbLIZ.append(",");
        sbLIZ.append(Arrays.toString(iArr2));
        AVLog.iod("AdaptiveController", C2188811AlT.LIZIZ(sbLIZ));
        EnumC1270070j9h enumC1270070j9hFromCode = EnumC1270070j9h.fromCode(iArr[0]);
        if (this.LIZ != null && enumC1270070j9hFromCode.isValid()) {
            this.LIZ.LIZ(enumC1270070j9hFromCode, new C1268030j6P(iArr2[0], iArr2[1], iArr2[2]), new C1278660jNY(iArr2[3], iArr2[4], iArr2[5]));
        }
    }

    public final void LJIIIIZZ(int i, int i2) {
        long j = this.LJFF;
        if (j > 0) {
            nativeSetOutputImageSize(j, i, i2, this.LJ.mPushBase.fps);
        }
    }

    public AdaptiveController(C1278910jNx c1278910jNx, String str, C1278760jNi c1278760jNi) {
        this.LIZLLL = c1278910jNx.LIZ;
        this.LIZIZ = c1278760jNi;
        LiveSdkSetting liveSdkSetting = c1278910jNx.LIZJ.LJI;
        this.LJ = liveSdkSetting;
        StrategyConfiguration strategyConfiguration = liveSdkSetting.strategyConfiguration;
        this.LIZJ = strategyConfiguration;
        if (strategyConfiguration != null) {
            PushBase pushBase = liveSdkSetting.mPushBase;
            this.LJFF = nativeCreate(pushBase.width, pushBase.height, pushBase.fps, pushBase.LIZ, str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("created: ");
        sbLIZ.append(this);
        sbLIZ.append(", native: ");
        sbLIZ.append(this.LJFF);
        AVLog.iod("AdaptiveController", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final EnumC1277950jMP LJIIIZ(int i, int i2, int i3) {
        if (this.LJFF > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setPerformanceMaxLevel: ");
            sbLIZ.append(i);
            sbLIZ.append(", ");
            sbLIZ.append(i2);
            AVLog.iod("AdaptiveController", C2188811AlT.LIZIZ(sbLIZ));
            int[] iArr = new int[1];
            int[] iArr2 = new int[6];
            EnumC1277950jMP enumC1277950jMPFromCode = EnumC1277950jMP.fromCode(nativeSetPerformanceMaxLevel(this.LJFF, i, i2, i3, iArr, iArr2));
            if (enumC1277950jMPFromCode == EnumC1277950jMP.Success) {
                LJI(iArr, iArr2);
            }
            return enumC1277950jMPFromCode;
        }
        return EnumC1277950jMP.OtherError;
    }

    public final void LIZLLL(int i, int i2, int i3, int i4) {
        long j = this.LJFF;
        if (j > 0) {
            nativeInsertStandardLevel(j, i, i2, i3, i4);
        }
    }
}
