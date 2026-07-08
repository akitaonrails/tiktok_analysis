package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1421105hJ;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1729250v6J;
import X.C1729570v6p;
import X.C1730580v8S;
import X.C1730880v8w;
import X.C1731670vAD;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20642515q3;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
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
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.viewmodel.ProductListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductImageSelectFragment extends Fragment implements InterfaceC344240DeY {
    public static final C1730580v8S LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final String LLJ;
    public static final String LLJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiLyMmLSsvLD19LSYjJCI2OiYpJSYlLWsvJiHELIOSI+JytiKzogISspOjx9ODcjLTowPCklOjt9GDcjLTowPAwhKCg2GyAgLCwnDjctLiI2JjE=";
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public Function1<? super C1730880v8w, Unit> LLILLL;
    public final C01GW LLILZ;
    public long LLILZIL;
    public long LLILZLL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0v8S] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProductImageSelectFragment.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(ProductImageSelectFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/productlist/viewmodel/ProductListViewModel;", 0)};
        LLIZ = new Object() { // from class: X.0v8S
        };
        LLJ = ProductImageSelectFragment.class.getName();
        LLJI = C20642515q3.LJI(2131847258);
    }

    public ProductImageSelectFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BillboardGlobalViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 894);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(378);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 895), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new AwS570S0100000_26((Fragment) this, 896), aFwS268S0000000_26, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 897), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LL = assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq2 = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ProductListViewModel.class);
        AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26(c19719912DlLIZ2, 898);
        AFwS268S0000000_26 aFwS268S0000000_262 = AFwS268S0000000_26.get$arr$(379);
        if (Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS570S0100000_262, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 899), aFwS268S0000000_262, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq2 instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq2, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS570S0100000_262, new AwS570S0100000_26((Fragment) this, 900), aFwS268S0000000_262, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq2)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS570S0100000_262, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 893), aFwS268S0000000_262, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLILLJJLI = assemVMLazy2;
        this.LLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 892));
    }

    public final RootData MR() {
        return (RootData) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        Integer numLIZJ;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = LLJI;
        c0om1.LIZJ = c1250250idj;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            c0om1.LIZJ(numLIZJ.intValue());
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 891));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        String str = MR().roomId;
        String str2 = MR().authorId;
        boolean z = MR().isNewUser;
        String strLIZ = MR().LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZIL;
        Map mapLIZ = C1729250v6J.LIZ(str, str2, strLIZ, z, "template_product_list", null);
        mapLIZ.put("stay_time", Long.valueOf(jCurrentTimeMillis));
        C1421105hJ.LIZJ("livesdk_tiktokec_stay_page", mapLIZ);
        C1731670vAD.LIZ = 0L;
        C1731670vAD.LIZIZ = 0L;
        C1731670vAD.LIZJ = 0L;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        this.LLILZIL = System.currentTimeMillis();
        C1421105hJ.LIZJ("livesdk_tiktokec_enter_page", C1729250v6J.LIZ(MR().roomId, MR().authorId, MR().LIZ(), MR().isNewUser, "template_product_list", null));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLILZLL = arguments.getLong("start_click_time");
        }
        long j = this.LLILZLL;
        C1731670vAD.LIZ = j;
        C1729570v6p.LIZLLL(System.currentTimeMillis() - j, "template_product_list", "notice_board_edit");
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        ((ProductListViewModel) assemVMLazy.getValue()).LLILLJJLI = new AwS605S0100000_26(this, 905);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 115), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.buv, viewGroup, false);
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
