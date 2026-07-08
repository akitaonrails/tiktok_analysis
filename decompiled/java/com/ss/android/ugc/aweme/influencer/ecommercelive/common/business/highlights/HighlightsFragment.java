package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1421105hJ;
import X.C1622206Wu;
import X.C1623606Xi;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20642515q3;
import X.C2217381BqS;
import X.C338490DOt;
import X.C416901jj;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C608170NtH;
import X.C612590O0z;
import X.C617930OLn;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C960203pA;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.net.Uri;
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
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightsFragment extends Fragment implements InterfaceC344240DeY {
    public static final C617930OLn LLILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiLyMmLSsvLD19LSYjJCI2OiYpJSYlHELIOSLWsvJiI+JytiKzogISspOjx9ICwrISM6Ly04OmEbISIkJSY0IDE/Dz0yLygpJzs=";
    public final AssemVMLazy LL;
    public long LLILLJJLI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0OLn] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighlightsFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/highlights/viewmodel/HighlightsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILLL = new Object() { // from class: X.0OLn
        };
    }

    public HighlightsFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HighlightsListViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 852);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(398);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 853), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS553S0100000_9((Fragment) this, 854), aFwS240S0000000_9, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 855), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LL = assemVMLazy;
    }

    public final HighlightsListViewModel MR() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (HighlightsListViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C20642515q3.LJI(2131832861);
        c0om1.LIZJ = c1250250idj;
        Context context = getContext();
        if (context != null) {
            Integer numLIZJ = C960203pA.LIZIZ(context) ? C1308910kAL.LIZJ(R.attr.c3, context) : C1308910kAL.LIZJ(R.attr.zp, context);
            if (numLIZJ != null) {
                c0om1.LIZJ(numLIZJ.intValue());
            }
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 851));
        c0om1.LJ(c1251150ifB);
        return c0om1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        HighlightsListViewModel highlightsListViewModelMR = MR();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI;
        String str = highlightsListViewModelMR.LLILLJJLI;
        String str2 = highlightsListViewModelMR.LLILLL;
        boolean zLJFF = Intrinsics.LJFF(((C612590O0z) highlightsListViewModelMR.getState()).LL, new C1623606Xi(Boolean.TRUE));
        boolean z = highlightsListViewModelMR.LLILZIL;
        boolean z2 = highlightsListViewModelMR.LLJILJILJ;
        Map mapLIZIZ = C608170NtH.LIZIZ(str, str2, highlightsListViewModelMR.LLILZ, zLJFF, z);
        mapLIZIZ.put("stay_time", Long.valueOf(jCurrentTimeMillis));
        mapLIZIZ.put("is_auto_post", z2 ? "1" : CardStruct.IStatusCode.DEFAULT);
        C1421105hJ.LIZJ("livesdk_tiktokec_stay_page", mapLIZIZ);
        HighlightsListViewModel.yQ2(MR(), "exit_page_highlight", null, null, 14);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLILLJJLI = System.currentTimeMillis();
        HighlightsListViewModel.yQ2(MR(), "enter_page_highlight", null, null, 14);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Uri uri;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (uri = (Uri) arguments.getParcelable("uri")) != null) {
            String strLIZ = C416901jj.LIZ(uri, "room_id");
            if (strLIZ == null) {
                strLIZ = CardStruct.IStatusCode.DEFAULT;
            }
            String strLIZ2 = C416901jj.LIZ(uri, "author_id");
            String str = "";
            if (strLIZ2 == null && (strLIZ2 = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID()) == null) {
                strLIZ2 = "";
            }
            String strLIZ3 = C416901jj.LIZ(uri, "enter_from");
            if (strLIZ3 != null) {
                str = strLIZ3;
            }
            HighlightsListViewModel highlightsListViewModelMR = MR();
            highlightsListViewModelMR.LLILLJJLI = strLIZ;
            highlightsListViewModelMR.LLILLL = strLIZ2;
            MR().LLILZ = str;
        }
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 242), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bu4, viewGroup, false);
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
