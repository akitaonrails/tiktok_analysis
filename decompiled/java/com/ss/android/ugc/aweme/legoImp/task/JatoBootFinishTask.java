package com.ss.android.ugc.aweme.legoImp.task;

import X.C01GW;
import X.C09CT;
import X.C0CCZ;
import X.C0VZ0;
import X.C1702420uP2;
import X.C20664087q;
import X.C20665087r;
import X.C2075908Bh;
import X.C2188051AkF;
import X.C2188061AkG;
import X.C261240ALq;
import X.C261250ALr;
import X.C277700AuW;
import X.C587360N1y;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.memory.SweepInterpreterCacheOpt;
import com.bytedance.common.jato.memory.los.HeapLargeObjectExclusion;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class JatoBootFinishTask implements C0CCZ {
    public final EnumC799870VZh LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "JatoBootFinishTask";
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
        return this.LL;
    }

    public static final class LosOptConfig {
        public static final int $stable = 8;

        @C09CT("gc_block")
        public boolean enableGcBlock;

        @C09CT("use_new_free")
        public boolean useNewFree;

        public LosOptConfig() {
            this(false, false);
        }

        public final void setEnableGcBlock(boolean z) {
            this.enableGcBlock = z;
        }

        public final void setUseNewFree(boolean z) {
            this.useNewFree = z;
        }

        public LosOptConfig(boolean z, boolean z2) {
            this.useNewFree = z;
            this.enableGcBlock = z2;
        }
    }

    public JatoBootFinishTask(EnumC799870VZh enumC799870VZh) {
        this.LL = enumC799870VZh;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        int iLIZ;
        C01GW c01gw = C2188061AkG.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 0 && ((Boolean) C277700AuW.LIZ.getValue()).booleanValue()) {
            JatoXL.setGCThreadPriorityWhenBlockGC(((Number) c01gw.getValue()).intValue(), ((Number) C277700AuW.LIZIZ.getValue()).intValue());
        } else {
            C01GW c01gw2 = C2188061AkG.LIZIZ;
            if (((Number) c01gw2.getValue()).intValue() != 0) {
                JatoXL.boostWaitForGC(((Number) c01gw2.getValue()).intValue());
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i <= 35 && Process.is64Bit() && ((Boolean) C261250ALr.LIZ.getValue()).booleanValue()) {
            try {
                SweepInterpreterCacheOpt.enable();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (Build.VERSION.SDK_INT <= 36 && 23 <= (iLIZ = DeviceInfoUtils.LIZ()) && iLIZ < 37) {
            LosOptConfig losOptConfig = (LosOptConfig) C2188051AkF.LIZ.getValue();
            if (losOptConfig != null) {
                try {
                    Npth.addTag("native_exclude_los", "1");
                    if (losOptConfig.enableGcBlock) {
                        HeapLargeObjectExclusion.needGcBlock(true);
                    }
                    if (losOptConfig.useNewFree) {
                        HeapLargeObjectExclusion.nativeUseNewFree();
                    }
                    HeapLargeObjectExclusion.nativeExcludeLOS();
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            int iIntValue = ((Number) C261240ALq.LIZ.getValue()).intValue();
            if (iIntValue > 0) {
                HeapLargeObjectExclusion.nativeSetLargeObjectThresholdByByteSize(iIntValue);
            }
        }
        if (C587360N1y.LIZ().otherThreadBindCoreTime == 2) {
            C1702420uP2.LIZ();
        }
        synchronized (C2075908Bh.class) {
            if (!C2075908Bh.LL) {
                return;
            }
            C2075908Bh c2075908Bh = C2075908Bh.LLILLJJLI;
            C20665087r c20665087r = C20664087q.LJII;
            if (c20665087r != null) {
                c20665087r.removeMessageObserver(c2075908Bh);
            }
        }
    }
}
