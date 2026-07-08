package com.ss.android.ugc.aweme.legoImp.inflate;

import X.C0CCZ;
import X.C0CPH;
import X.C0VZ0;
import X.C0VZ7;
import X.C20742916Ex;
import X.C2139508Zt;
import X.C786410Ut5;
import X.C799710VYr;
import X.C799900VZk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799850VZf;
import Y.ARunnableS113S0100000_13;
import Y.AfS81S0101000_13;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CActivityMain;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public abstract class X2CBaseInflate implements InterfaceC799850VZf {
    public boolean LLILLL;
    public int LL = -1;
    public final List<SparseArray<View>> LLILLJJLI = new ArrayList();
    public final X2CBaseInflate$inflateReleaseTask$1 LLILZ = new C0CCZ() { // from class: com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate$inflateReleaseTask$1
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "X2CBaseInflate$inflateReleaseTask$1";
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
        public final /* synthetic */ int targetProcess() {
            return C0VZ0.LIZ();
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
            X2CBaseInflate x2CBaseInflate = this.LL;
            x2CBaseInflate.LLILLL = true;
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS113S0100000_13(x2CBaseInflate, 203));
        }
    };

    public abstract int[] LIZ();

    @Override // X.InterfaceC799850VZf
    public final int LIZJ() {
        return R.style.xm;
    }

    public boolean LJ() {
        return this instanceof X2CActivityMain;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C799710VYr.LIZ();
    }

    @Override // X.InterfaceC799850VZf
    public final Class<? extends Activity> LIZIZ() {
        return C2139508Zt.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final EnumC799980VZs triggerType() {
        return EnumC799980VZs.INFLATE;
    }

    @Override // X.InterfaceC799850VZf
    public final void LJII(Activity activity, Context context) {
        if (activity != null) {
            if (this.LL == -1) {
                this.LL = C0VZ7.LIZIZ;
            }
            if (this.LL == 2) {
                SparseArray sparseArray = new SparseArray();
                synchronized (this.LLILLJJLI) {
                    try {
                        ((ArrayList) this.LLILLJJLI).add(sparseArray);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                for (SparseArray sparseArray2 : (ArrayList) this.LLILLJJLI) {
                    for (int i : LIZ()) {
                        sparseArray2.put(i, C20742916Ex.LIZ(activity, i, new FrameLayout(activity), false, -1));
                    }
                }
                if (LJ()) {
                    C2139508Zt.LIZ.LIZ().LJJLJLI(new AfS81S0101000_13(activity.hashCode(), this, 6));
                } else {
                    C799900VZk.LIZ.getClass();
                    C0CPH c0cph = new C0CPH();
                    c0cph.LIZ(this.LLILZ);
                    c0cph.LIZIZ();
                }
            }
        }
    }
}
