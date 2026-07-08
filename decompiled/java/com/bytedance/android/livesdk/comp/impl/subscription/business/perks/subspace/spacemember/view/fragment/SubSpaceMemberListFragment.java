package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.spacemember.view.fragment;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C474270Iin;
import X.C497740JfY;
import X.C501220JlA;
import X.C501230JlB;
import X.C501240JlC;
import X.C501250JlD;
import X.C501260JlE;
import X.C501270JlF;
import X.C501290JlH;
import X.C502790Jnh;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.spacemember.vm.SubSpaceMemberVM;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceMemberListFragment extends SubSpaceBaseFragment {
    public static final C501220JlA LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2s8LDHELIOS04O2s/PC0gOCQvLGEgOCQvLCI2JScpO2ElISA7ZykhKSIhLCEnZhY5KxwjKSYpBCo+KiA+BSYgPAM+KCg+LSs4";
    public final AssemVMLazy LLILZLL;
    public long LLIZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0JlA] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceMemberListFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/spacemember/vm/SubSpaceMemberVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = new Object() { // from class: X.0JlA
        };
    }

    public SubSpaceMemberListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceMemberVM.class);
        C501230JlB c501230JlB = new C501230JlB(c19719912DlLIZ);
        C501290JlH c501290JlH = new C501290JlH();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c501230JlB, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C501240JlC(this), c501290JlH, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c501230JlB, new C501250JlD(this), c501290JlH, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c501230JlB, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C501260JlE(this), c501290JlH, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZLL = assemVMLazy;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment
    public final String OR() {
        return C786410Ut5.j4(C497740JfY.LJIJI(this.LLILZ ? 2131856641 : 2131844283), Arrays.copyOf(new Object[]{C474270Iin.LIZIZ(this.LLIZ)}, 1));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment
    public final void NR(LiveIconView liveIconView) {
        C786410Ut5.LLJJIJIL(liveIconView, 8);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C502790Jnh(), C502790Jnh.class, "source_default_key");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        ((SubSpaceMemberVM) assemVMLazy.getValue()).LL = C1558360qeg.LJFF(this, null);
        ((SubSpaceMemberVM) this.LLILZLL.getValue()).LLILLJJLI = this.LLILZ;
        C723850SaN.LIZ(this, false, null, new C501270JlF(this), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.glp, viewGroup, false);
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
