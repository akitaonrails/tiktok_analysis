package com.ss.android.ugc.aweme.legoImp.task;

import X.C01GW;
import X.C075U;
import X.C0AD3;
import X.C0AGF;
import X.C0B5J;
import X.C0CCZ;
import X.C0VZ0;
import X.C2187411AjD;
import X.C2187451AjH;
import X.C2187461AjI;
import X.C2187471AjJ;
import X.C2187491AjL;
import X.C2187501AjM;
import X.C2187511AjN;
import X.C2187541AjQ;
import X.C2187551AjR;
import X.C2187571AjT;
import X.C2366809Pe;
import X.C2515609tS;
import X.C2537609x0;
import X.C273920AoQ;
import X.C304800Bx8;
import X.C304810Bx9;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2187601AjW;
import Y.ARunnableS83S0000000_3;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.PosionDeadObjectOpt;
import com.bytedance.common.jato.boost.SoftReferenceLruOpt;
import com.bytedance.common.jato.jit.JitCodeCacheExpand;
import com.bytedance.common.jato.jit.ProfileSaverOpt;
import com.bytedance.common.jato.memory.MinFreeHeapOpt;
import com.bytedance.common.jato.memory.TlabOpt;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import com.bytedance.otis.optimise.system.jit.JitProfileSaverOpt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.DexCacheExpandConfig;
import com.ss.android.ugc.aweme.experiment.JitProfileSaverConfig;
import com.ss.android.ugc.aweme.experiment.LaunchDexReclaimPara;
import com.ss.android.ugc.aweme.experiment.NonMovingExpandConfig;
import com.ss.android.ugc.aweme.experiment.SoftReferenceLruConfig;
import com.ss.android.ugc.aweme.experiment.TlabExpandConfig;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public class ArtSystemOptTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ArtSystemOptTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        SoftReferenceLruConfig softReferenceLruConfig;
        String[] strArr;
        int iLIZ;
        DexCacheExpandConfig dexCacheExpandConfig;
        NonMovingExpandConfig nonMovingExpandConfig;
        int i;
        int i2;
        boolean z;
        int iLIZ2;
        int i3 = 0;
        try {
            if (C304800Bx8.LIZIZ) {
                PosionDeadObjectOpt.LIZ();
            }
            C2187451AjH.LIZLLL();
            C2187451AjH.LIZIZ();
            C2187451AjH.LIZ();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29) {
                if (i4 <= 34) {
                    C01GW c01gw = C2187471AjJ.LIZJ;
                    if (!Intrinsics.LJFF((JitProfileSaverConfig) c01gw.getValue(), C2187471AjJ.LIZIZ) || C2187451AjH.LJIIJ() || !Intrinsics.LJFF((JitProfileSaverConfig) C2187411AjD.LIZJ.getValue(), C2187411AjD.LIZIZ)) {
                        JitProfileSaverOpt.setProfileSaverOptions(((JitProfileSaverConfig) c01gw.getValue()).minSavePeriodMs, ((JitProfileSaverConfig) c01gw.getValue()).minMethodsToSave, ((JitProfileSaverConfig) c01gw.getValue()).minClassesToSave);
                    }
                }
                if (C2515609tS.LIZ) {
                    ProfileSaverOpt.LIZ();
                }
            }
            if (C273920AoQ.LIZIZ) {
                C2187451AjH.LJJ();
            }
            boolean z2 = true;
            if (i4 >= 24) {
                C01GW c01gw2 = C2187551AjR.LIZ;
                if (((LaunchDexReclaimPara) c01gw2.getValue()) != null && ((LaunchDexReclaimPara) c01gw2.getValue()).getEnableWhen() == 2) {
                    C2187451AjH.LJJIIJ();
                    z = true;
                } else {
                    z = false;
                    C01GW c01gw3 = C2187571AjT.LIZ;
                    if (((LaunchDexReclaimPara) c01gw3.getValue()) != null && ((LaunchDexReclaimPara) c01gw3.getValue()).getEnableWhen() == 2) {
                        C2187451AjH.LJJIII();
                    }
                    if (i4 <= 34 && (iLIZ2 = DeviceInfoUtils.LIZ()) >= 24 && iLIZ2 <= 34 && C075U.LIZIZ && !z2 && !z) {
                        C2187451AjH.LJJII();
                    }
                }
                z2 = false;
                if (i4 <= 34) {
                    C2187451AjH.LJJII();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C2187451AjH.LJJIIZI(false);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 30) {
            double dFloatValue = ((Number) C0AD3.LIZ.getValue()).floatValue();
            if (dFloatValue >= 0.0d && dFloatValue < 1.0d) {
                int i6 = MinFreeHeapOpt.LIZ;
                if (Process.is64Bit()) {
                    MinFreeHeapOpt.nativeSetMinFreeHeapPecent(dFloatValue);
                }
            }
        }
        if (i5 >= 26 && Process.is64Bit() && (nonMovingExpandConfig = (NonMovingExpandConfig) C2187511AjN.LIZ.getValue()) != null && (i = nonMovingExpandConfig.freeThreshold) >= 0 && (i2 = nonMovingExpandConfig.gcThreshold) >= 0) {
            InterfaceC2187601AjW interfaceC2187601AjW = new InterfaceC2187601AjW() { // from class: X.1AjV
            };
            new WeakReference(new C2187461AjI(0));
            C2187461AjI.LIZ = i;
            C2187461AjI.LIZIZ = i2;
            C2187461AjI.LIZJ = interfaceC2187601AjW;
        }
        if (i5 >= 29) {
            if (i5 > 33) {
                if (i5 <= 34) {
                }
            } else if (DeviceInfoUtils.LIZ() <= 33 && (dexCacheExpandConfig = (DexCacheExpandConfig) C2187491AjL.LIZ.getValue()) != null) {
                int i7 = dexCacheExpandConfig.methodField;
                int i8 = dexCacheExpandConfig.clazz;
                int i9 = dexCacheExpandConfig.string;
                int i10 = dexCacheExpandConfig.methodType;
                if (i7 != 0 || i8 != 0 || i9 != 0 || i10 != 0) {
                    JatoXL.dexCacheExpand(i7, i8, i9, i10);
                }
            }
            if (C2366809Pe.LIZ() <= 0 && (softReferenceLruConfig = (SoftReferenceLruConfig) C2187541AjQ.LIZ.getValue()) != null) {
                SoftReferenceLruOpt.LIZ(softReferenceLruConfig.lruSoftEpoch, softReferenceLruConfig.lruSoftInterval);
            }
        } else if (i5 >= 26) {
            if (C2366809Pe.LIZ() <= 0) {
                SoftReferenceLruOpt.LIZ(softReferenceLruConfig.lruSoftEpoch, softReferenceLruConfig.lruSoftInterval);
            }
        }
        if (C2366809Pe.LIZ() == 2) {
            C2187451AjH.LJIL();
        }
        if (i5 >= 29 && i5 <= 34) {
            if (((Boolean) C0B5J.LIZ.getValue()).booleanValue()) {
                JitCodeCacheExpand.keepAlive();
            }
            if (i5 >= 33 && (iLIZ = DeviceInfoUtils.LIZ()) >= 33 && iLIZ <= 34 && !C2187451AjH.LJIIJ() && ((Boolean) C0AGF.LIZ.getValue()).booleanValue()) {
                C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS83S0000000_3(19));
            }
        }
        if (C304810Bx9.LIZIZ) {
            if (i5 >= 29) {
                Process.is64Bit();
            } else {
                return;
            }
        } else if (i5 < 29) {
            return;
        }
        if (i5 <= 35 && Process.is64Bit() && C2537609x0.LIZ) {
            C01GW c01gw4 = C2187501AjM.LIZ;
            TlabExpandConfig tlabExpandConfig = (TlabExpandConfig) c01gw4.getValue();
            int[] iArr = null;
            if (tlabExpandConfig != null) {
                strArr = tlabExpandConfig.threadNameArr;
            } else {
                strArr = null;
            }
            TlabExpandConfig tlabExpandConfig2 = (TlabExpandConfig) c01gw4.getValue();
            if (tlabExpandConfig2 != null) {
                iArr = tlabExpandConfig2.threadtlabSizeDiff;
            }
            TlabExpandConfig tlabExpandConfig3 = (TlabExpandConfig) c01gw4.getValue();
            if (tlabExpandConfig3 != null) {
                i3 = tlabExpandConfig3.allThreadTlabSizeDiff;
            }
            TlabOpt.LIZ(i3, strArr, iArr);
        }
    }
}
