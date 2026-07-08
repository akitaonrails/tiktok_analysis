package com.lynx.animax.util;

import X.C1285850jZ9;
import X.C1288390jdF;
import X.C2188811AlT;
import X.InterfaceC1288400jdG;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes21.dex */
public class AnimaX {
    public static volatile AnimaX LIZLLL;
    public volatile boolean LIZ;
    public InterfaceC1288400jdG LIZIZ;
    public Context LIZJ;

    private native void nativeRegisterLogger(long j);

    public static long LIZ() {
        try {
            return ((Long) Class.forName("com.ss.android.agilelogger.ALog").getMethod("getALogSimpleWriteFuncAddr", new Class[0]).invoke(null, new Object[0])).longValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("No ALog found in the host [ ");
            sbLIZ.append(e.getMessage());
            sbLIZ.append(" ]");
            AnimaXLog.LIZ("AnimaX", C2188811AlT.LIZIZ(sbLIZ));
            return 0L;
        }
    }

    public static AnimaX LIZJ() {
        if (LIZLLL == null) {
            synchronized (AnimaX.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new AnimaX();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZIZ(C1288390jdF c1288390jdF) {
        if (!this.LIZ) {
            synchronized (this) {
                if (this.LIZ) {
                    return;
                }
                this.LIZIZ = c1288390jdF;
                if (!LIZLLL("lynxbase")) {
                    AnimaXLog.LIZ("AnimaX", "AnimaX failed to load liblynxbase.so");
                    return;
                }
                if (!LIZLLL("animax")) {
                    AnimaXLog.LIZ("AnimaX", "AnimaX failed to load libanimax.so");
                    return;
                }
                LIZLLL("animax_textra");
                LIZLLL("animax_bytevc1");
                nativeRegisterLogger(LIZ());
                this.LIZ = true;
            }
        }
    }

    public final boolean LIZLLL(String str) {
        try {
            InterfaceC1288400jdG interfaceC1288400jdG = this.LIZIZ;
            if (interfaceC1288400jdG != null) {
                ((C1288390jdF) interfaceC1288400jdG).LIZ.loadLibrary(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Native library load ");
                sbLIZ.append(str);
                sbLIZ.append(" success with native library loader");
                AnimaXLog.LIZIZ("AnimaX", C2188811AlT.LIZIZ(sbLIZ));
                return true;
            }
            LoadSoLancet.LIZJ(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF(str);
            LoadSoLancet.LJ(jUptimeMillis, str);
            LoadSoLancet.LIZLLL(jUptimeMillis, str);
            LoadSoLancet.LIZIZ(str);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Native library load ");
            sbLIZ2.append(str);
            sbLIZ2.append(" success with System.loadLibrary");
            AnimaXLog.LIZIZ("AnimaX", C2188811AlT.LIZIZ(sbLIZ2));
            return true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            if (this.LIZIZ == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Native library load ");
                sbLIZ3.append(str);
                sbLIZ3.append(" from system with error message ");
                sbLIZ3.append(e.getMessage());
                AnimaXLog.LIZ("AnimaX", C2188811AlT.LIZIZ(sbLIZ3));
                return false;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Native Library load from ");
            sbLIZ4.append(this.LIZIZ.getClass().getName());
            sbLIZ4.append(" with error message ");
            sbLIZ4.append(e.getMessage());
            AnimaXLog.LIZ("AnimaX", C2188811AlT.LIZIZ(sbLIZ4));
            return false;
        }
    }

    public final void LJ(Context context) {
        float f;
        boolean z;
        if (this.LIZJ == null && context != null) {
            this.LIZJ = context;
            Context context2 = LIZJ().LIZJ;
            if (context2 != null) {
                f = context2.getResources().getDisplayMetrics().density;
            } else {
                AnimaXLog.LIZ("AnimaX", "getDensity failed, context is null");
                f = 1.0f;
            }
            if (!C1285850jZ9.LJFF) {
                if (f < 2.0f && f > 0.01f) {
                    z = true;
                } else {
                    z = false;
                }
                C1285850jZ9.LJI = z;
                C1285850jZ9.LJFF = true;
            }
        }
    }
}
