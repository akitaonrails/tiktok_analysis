package com.ss.android.ugc.aweme.ecommerce.base.osp.subpage;

import X.C019F;
import X.C01D1;
import X.C049Z;
import X.C098200Yq;
import X.C0OM1;
import X.C10508049a;
import X.C10513049f;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1713070ugD;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C1748770vbn;
import X.C1748780vbo;
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
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C821503Iv;
import X.C960203pA;
import X.C987103tV;
import X.InterfaceC1164530gPT;
import X.InterfaceC1748810vbr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USHalfProductWithGiftFragment extends ECBaseFragment implements InterfaceC1164530gPT {
    public static final C821503Iv LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyHELIOSAgOGs/PC0jKSIpZxoAACQgLx8hJyE5KjsEITEkDiY1PAM+KCg+LSs4";
    public TuxNavBar LLILLL;
    public long LLILZ;
    public final String LLILZIL = "return";
    public final AssemVMLazy LLILZLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.03Iv] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USHalfProductWithGiftFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = new Object() { // from class: X.03Iv
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "order_submit";
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
    }

    public USHalfProductWithGiftFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1283);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(277);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1284), aFwS228S0000000_1, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new AwS545S0100000_1((Fragment) this, 1285), aFwS228S0000000_1, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1286), aFwS228S0000000_1, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZLL = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1748720vbi.LIZIZ(this, new C10508049a(), new AwS580S0100000_1(this, 220));
        C1713070ugD.LIZIZ(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1(this, 219));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLILZ = System.currentTimeMillis();
        C1748720vbi.LIZIZ(this, new C10513049f(), AFwS228S0000000_1.get$arr$(275));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        LaneParams laneParamsLIZIZ;
        Object obj;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1f, context)) != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.us_half_product_with_gift_fragment_title);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (TuxNavBar) viewFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1282));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ(C960203pA.LIZ(R.attr.a1f, view.getContext()));
        C1250250idj c1250250idj = new C1250250idj();
        InterfaceC1748810vbr interfaceC1748810vbrD8 = d8();
        if (interfaceC1748810vbrD8 == null || (laneParamsLIZIZ = C1748730vbj.LIZIZ(interfaceC1748810vbrD8, "lib_track_builtin_lane_business")) == null || (obj = laneParamsLIZIZ.get((Object) "item_and_free_gift")) == null || (string = obj.toString()) == null) {
            string = "Item&free gift";
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        View viewFindViewById2 = this.LLILLL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.us_half_product_with_gift_fragment_title);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLL = (TuxNavBar) viewFindViewById2;
        }
        ((TuxNavBar) viewFindViewById2).LJIIZILJ(true);
        C1748720vbi.LIZIZ(this, new C049Z(), AFwS228S0000000_1.get$arr$(276));
        C723850SaN.LIZ(this, false, null, new AwS580S0100000_1(this, 221), 3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.b0z, viewGroup, false);
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
