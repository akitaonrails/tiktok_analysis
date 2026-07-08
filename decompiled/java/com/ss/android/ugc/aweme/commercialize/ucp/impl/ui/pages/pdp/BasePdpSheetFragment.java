package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp;

import X.AbstractC343940De4;
import X.C01GW;
import X.C098200Yq;
import X.C0DHB;
import X.C0DHT;
import X.C1281004zo;
import X.C1281204zq;
import X.C1391190mJ3;
import X.C1524305xx;
import X.C16BC;
import X.C1766560w4U;
import X.C189200o6;
import X.C19719612Di;
import X.C19EG;
import X.C19V8;
import X.C335830DEn;
import X.C343970De7;
import X.C452501pT;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1058150ddt;
import X.InterfaceC335820DEm;
import Y.ARunnableS8S1100000_2;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.commercialize.ucp.api.callback.IUCPWatchWhileLoadingTuxSheetProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BasePdpSheetFragment extends Fragment implements InterfaceC1058150ddt, DialogInterface.OnDismissListener {
    public static final /* synthetic */ int LLIZ = 0;
    public boolean LL;
    public String LLILLL;
    public C1281204zq LLILZ;
    public boolean LLILZIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 97));
    public AbstractC343940De4 LLILZLL = C343970De7.LIZ;

    public abstract C19V8 MR();

    public final void OR() {
        this.LLILZIL = false;
        C1281204zq c1281204zq = this.LLILZ;
        if (c1281204zq == null) {
            return;
        }
        this.LLILZ = null;
        C1524305xx c1524305xx = C1524305xx.LIZ;
        C19EG activity = getActivity();
        c1524305xx.getClass();
        C1524305xx.LJ(c1281204zq, activity);
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    public final boolean NR() {
        String str = TuxSheet._pnsPageId;
        C16BC c16bcLJIIIZ = C1391190mJ3.LJIIIZ(this);
        return (c16bcLJIIIZ instanceof BottomSheetBehavior) && c16bcLJIIIZ != null;
    }

    private final void RR() {
        DialogFragment dialogFragment;
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof TuxSheet) || (dialogFragment = (DialogFragment) parentFragment) == null || dialogFragment.getDialog() == null) {
            return;
        }
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(dialogFragment, false);
        tuxImmersionBarLIZJ.LIZIZ.LJIIL();
        tuxImmersionBarLIZJ.LIZ(true);
        tuxImmersionBarLIZJ.LIZLLL();
    }

    public final void PR() {
        LinkedHashMap<String, C1281004zo> linkedHashMap;
        C1281004zo c1281004zo;
        OR();
        C1524305xx c1524305xx = C1524305xx.LIZ;
        String str = this.LLILLL;
        String str2 = (String) this.LLILLJJLI.getValue();
        C19EG activity = getActivity();
        c1524305xx.getClass();
        C1524305xx.LJFF();
        if (str == null || a0.LJJJIL(str) || (c1281004zo = (linkedHashMap = C1524305xx.LIZIZ).get(str)) == null) {
            return;
        }
        if (C19719612Di.LJJIII(c1281004zo.LIZJ, new AwS53S1000000_2(str2, 29), true)) {
            C1524305xx.LIZLLL("release_owner", str, str2, null, c1281004zo.LIZJ.size());
            C1524305xx.LIZIZ(activity);
        } else if (c1281004zo.LIZJ.isEmpty()) {
            linkedHashMap.remove(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        PR();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        InterfaceC335820DEm interfaceC335820DEm;
        super.onDestroyView();
        if (NR()) {
            Fragment parentFragment = getParentFragment();
            if ((parentFragment instanceof TuxSheet) && parentFragment != null && (interfaceC335820DEm = C335830DEn.LIZ) != null) {
                interfaceC335820DEm.h0();
            }
        }
        IUCPWatchWhileLoadingTuxSheetProvider iUCPWatchWhileLoadingTuxSheetProvider = (IUCPWatchWhileLoadingTuxSheetProvider) PluggableExtentionKt.pluggableSpi$default(IUCPWatchWhileLoadingTuxSheetProvider.class, false, false, false, 14, null);
        if (iUCPWatchWhileLoadingTuxSheetProvider != null) {
            iUCPWatchWhileLoadingTuxSheetProvider.LIZ(C0DHB.OUT_FLOW);
        }
        PR();
    }

    private final void SR(boolean z) {
        if (z) {
            if (isResumed() && this.LLILZ == null) {
                this.LLILZIL = true;
                String strLIZJ = this.LLILLL;
                if (strLIZJ == null) {
                    C1524305xx c1524305xx = C1524305xx.LIZ;
                    getActivity();
                    Bundle arguments = getArguments();
                    c1524305xx.getClass();
                    strLIZJ = C1524305xx.LIZJ(arguments);
                    this.LLILLL = strLIZJ;
                }
                View view = getView();
                if (view != null) {
                    HandlerHook.viewPost(view, new ARunnableS8S1100000_2(this, strLIZJ, 2));
                    return;
                }
                return;
            }
            return;
        }
        OR();
    }

    private final void UR(float f) {
        C19V8 c19v8MR = MR();
        if (c19v8MR == null) {
            return;
        }
        if (f == 1.0f) {
            C786410Ut5.LJLLLLLL(0, c19v8MR);
        } else {
            C786410Ut5.LJLLLLLL(8, c19v8MR);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        boolean z;
        TuxSheet tuxSheet;
        InterfaceC335820DEm interfaceC335820DEm;
        String str = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJ = C1391190mJ3.LJIIJ(dialogInterface);
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (abstractC343940De4LJIIJ instanceof C343970De7) {
            abstractC343940De4LJIIJ = abstractC343940De4LJIIJJI;
        }
        this.LLILZLL = abstractC343940De4LJIIJ;
        C19EG activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            z = true;
        } else {
            z = false;
        }
        OR();
        if (z) {
            try {
                Fragment parentFragment = getParentFragment();
                if ((parentFragment instanceof TuxSheet) && (tuxSheet = (TuxSheet) parentFragment) != null && (interfaceC335820DEm = C335830DEn.LIZ) != null) {
                    interfaceC335820DEm.LLLLIIIILLL(tuxSheet, 5);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // X.InterfaceC1058150ddt
    public void LLLFFI(TuxSheet tuxSheet, float f) {
        InterfaceC335820DEm interfaceC335820DEm;
        if (!this.LL && (interfaceC335820DEm = C335830DEn.LIZ) != null) {
            interfaceC335820DEm.LLLFFI(tuxSheet, f);
        }
        if (f > 1.0f) {
            return;
        }
        UR(f);
    }

    @Override // X.InterfaceC1058150ddt
    public void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        InterfaceC335820DEm interfaceC335820DEm;
        boolean z;
        DialogFragment dialogFragment;
        if ((!this.LL || i == 5) && (interfaceC335820DEm = C335830DEn.LIZ) != null) {
            interfaceC335820DEm.LLLLIIIILLL(tuxSheet, i);
        }
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    RR();
                    SR(false);
                    return;
                }
                return;
            }
            RR();
            UR(0.0f);
            SR(false);
            return;
        }
        Context context = getContext();
        if (context != null && C960203pA.LIZIZ(context)) {
            z = true;
        } else {
            z = false;
        }
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof TuxSheet) && (dialogFragment = (DialogFragment) parentFragment) != null && dialogFragment.getDialog() != null) {
            TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(dialogFragment, false);
            boolean z2 = !z;
            tuxImmersionBarLIZJ.LIZIZ.LJIIJ(z2);
            tuxImmersionBarLIZJ.LJIIIIZZ(R.attr.zq);
            tuxImmersionBarLIZJ.LJ(R.attr.zq);
            tuxImmersionBarLIZJ.LIZIZ.LJII(z2);
            tuxImmersionBarLIZJ.LIZ(false);
            tuxImmersionBarLIZJ.LIZLLL();
        }
        UR(1.0f);
        SR(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TuxSheet tuxSheet;
        super.onViewCreated(view, bundle);
        C1524305xx c1524305xx = C1524305xx.LIZ;
        getActivity();
        Bundle arguments = getArguments();
        c1524305xx.getClass();
        this.LLILLL = C1524305xx.LIZJ(arguments);
        boolean z = C0DHT.LIZJ;
        C0DHT.LIZJ = false;
        this.LL = z;
        if (NR()) {
            UR(0.0f);
            Fragment parentFragment = getParentFragment();
            if ((parentFragment instanceof TuxSheet) && (tuxSheet = (TuxSheet) parentFragment) != null && !this.LL) {
                IUCPWatchWhileLoadingTuxSheetProvider iUCPWatchWhileLoadingTuxSheetProvider = (IUCPWatchWhileLoadingTuxSheetProvider) PluggableExtentionKt.pluggableSpi$default(IUCPWatchWhileLoadingTuxSheetProvider.class, false, false, false, 14, null);
                if (iUCPWatchWhileLoadingTuxSheetProvider != null) {
                    iUCPWatchWhileLoadingTuxSheetProvider.LIZIZ(C0DHB.OUT_FLOW, null);
                }
                InterfaceC335820DEm interfaceC335820DEm = C335830DEn.LIZ;
                if (interfaceC335820DEm != null) {
                    interfaceC335820DEm.Ai(tuxSheet);
                }
            }
        }
    }
}
