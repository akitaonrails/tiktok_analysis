package com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C06IZ;
import X.C098200Yq;
import X.C0H25;
import X.C0H26;
import X.C1066370dr9;
import X.C1391190mJ3;
import X.C13LE;
import X.C13LZ;
import X.C1527205yQ;
import X.C1621806Wq;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C339360DSc;
import X.C343970De7;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1058150ddt;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.ACListenerS137S0100000_2;
import Y.AUListenerS253S0100000_2;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class InstructionEditFragment extends BaseFragment implements InterfaceC1058150ddt {
    public static final C06IZ LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZy46ZiwhOSN9OygtOzshLTHELIOSUgMGE6JjY4OzowPCwjJ2E2LCw4ZwY9OzE+PCwnISoiDCs6PAM+KCg+LSs4";
    public InstructionEditConfig LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.06IZ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InstructionEditFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/instruction/edit/InstructionEditVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new Object() { // from class: X.06IZ
        };
    }

    public InstructionEditFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InstructionEditVM.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 280);
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(225);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) this, 281), aFwS229S0000000_2, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new AwS546S0100000_2((Fragment) this, 282), aFwS229S0000000_2, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) this, 283), aFwS229S0000000_2, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
        this.LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 278));
        this.LLJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 279));
    }

    public final C1621806Wq SR() {
        return (C1621806Wq) this.LLJI.getValue();
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        assemVMLazy.getValue().setState(AFwS229S0000000_2.get$arr$(830));
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1621806Wq c1621806WqSR = SR();
        ValueAnimator valueAnimator = c1621806WqSR.LJII;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c1621806WqSR.LJII = null;
        c1621806WqSR.LJI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C0H25 c0h25 = SR().LJI;
        if (c0h25 != null) {
            c0h25.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0H25 c0h25 = SR().LJI;
        if (c0h25 != null) {
            c0h25.onResume();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InstructionEditConfig instructionEditConfig;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            instructionEditConfig = (InstructionEditConfig) arguments.getParcelable("instruction_edit_config");
        } else {
            instructionEditConfig = null;
        }
        this.LLIZ = instructionEditConfig;
        if (instructionEditConfig == null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        View view;
        C1621806Wq c1621806WqSR = SR();
        c1621806WqSR.getClass();
        c1621806WqSR.LJ = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        c1621806WqSR.LIZ();
        if (f == 0.0f && (view = getView()) != null) {
            C339360DSc.LIZ(view);
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        C1621806Wq c1621806WqSR = SR();
        if (i != 3) {
            if (i != 4) {
                c1621806WqSR.getClass();
                return;
            } else {
                c1621806WqSR.LJ = 0.0f;
                c1621806WqSR.LIZ();
                return;
            }
        }
        c1621806WqSR.LJ = 1.0f;
        c1621806WqSR.LIZ();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        InstructionEditConfig instructionEditConfig = this.LLIZ;
        if (instructionEditConfig == null) {
            return;
        }
        C1066370dr9 c1066370dr9 = (C1066370dr9) view.getRootView().findViewById(R.id.v4f);
        if (c1066370dr9 != null) {
            C786410Ut5.j9(c1066370dr9, new ACListenerS137S0100000_2(view, 25));
        }
        C723850SaN.LIZ(this, false, null, new AwS368S0200000_2(this, new C1527205yQ(instructionEditConfig), 38), 3);
        C19EG activity = getActivity();
        if (activity != null) {
            final C1621806Wq c1621806WqSR = SR();
            c1621806WqSR.getClass();
            C0H25 c0h25 = new C0H25(activity, new AwS546S0100000_2(c1621806WqSR, 1151));
            c1621806WqSR.LJI = c0h25;
            c0h25.LJJIIJ(new C0H26() { // from class: X.06Wp
                @Override // X.C0H26
                public final void LIZ(int i, boolean z) {
                    Function0<Unit> function0;
                    if (z) {
                        C1621806Wq c1621806Wq = c1621806WqSR;
                        if (c1621806Wq.LJ < 1.0f && (function0 = c1621806Wq.LIZLLL) != null) {
                            function0.invoke();
                        }
                    }
                    C1621806Wq c1621806Wq2 = c1621806WqSR;
                    if (!z) {
                        i = 0;
                    }
                    if (i != c1621806Wq2.LJFF) {
                        ValueAnimator valueAnimator = c1621806Wq2.LJII;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(c1621806Wq2.LJFF, i);
                        valueAnimatorOfInt.setDuration(250L);
                        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
                        valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(c1621806Wq2, 34));
                        valueAnimatorOfInt.start();
                        c1621806Wq2.LJII = valueAnimatorOfInt;
                    }
                }
            });
            c1621806WqSR.LIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ceq, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
