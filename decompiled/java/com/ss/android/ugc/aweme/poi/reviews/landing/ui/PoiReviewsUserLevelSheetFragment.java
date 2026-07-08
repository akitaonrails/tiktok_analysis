package com.ss.android.ugc.aweme.poi.reviews.landing.ui;

import X.AbstractC1338480kw2;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0NBH;
import X.C0OM1;
import X.C1172760gck;
import X.C1191160h6Q;
import X.C1191780h7Q;
import X.C1251150ifB;
import X.C13LE;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C338490DOt;
import X.C427660Gpo;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AfS187S0100000_18;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsUserLevelRightsCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsUserLevelSheetViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsUserLevelSheetFragment extends BasePage implements InterfaceC344240DeY {
    public static final C1191780h7Q LLJJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEhLTMlLDggZiktJyHELIOSs6JiJiPCZ9GColGyolISA7OhogLTcALDk2JBYkLConDjctLiI2JjE=";
    public final AssemVMLazy LLIZLLLIL;
    public ViewGroup LLJ;
    public SmartImageView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJILLL;
    public TuxTextView LLJJ;
    public C197039127h LLJJI;
    public GridLayout LLJJIII;
    public ViewGroup LLJJIJI;
    public C427660Gpo LLJJIJIIJIL;
    public SmartImageView LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public String LLJJJJJIL;
    public boolean LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewsUserLevelSheetFragment.class, "sheetVM", "getSheetVM()Lcom/ss/android/ugc/aweme/poi/reviews/landing/viewmodel/PoiReviewsUserLevelSheetViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJL = new C1191780h7Q();
    }

    public PoiReviewsUserLevelSheetFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiReviewsUserLevelSheetViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1846);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(600);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1847), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 1848), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1849), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
        this.LLJJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(601), "reviews_to_user_id", String.class);
        this.LLJJJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(598), "reviews_poi_id", String.class);
        this.LLJJJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(599), "reviews_review_id", String.class);
        this.LLJJJJLIIL = true;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 563));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLJJJJLIIL) {
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            String str = (String) this.LLJJJIL.getValue();
            String str2 = (String) this.LLJJJJ.getValue();
            String str3 = (String) this.LLJJJ.getValue();
            String str4 = this.LLJJJJJIL;
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
            PageFinder pageFinderVia = PageFinder.via((Fragment) this);
            c1191160h6Q.getClass();
            C1191160h6Q.LJJIL("exit", str, str2, str3, str4, interfaceC665370Q7zLJFF, pageFinderVia);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJ = (ViewGroup) view.findViewById(R.id.user_level_container);
        this.LLJI = (SmartImageView) view.findViewById(R.id.user_level_icon);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.user_level_title);
        this.LLJILJIL = (TuxTextView) view.findViewById(R.id.user_level_subtitle);
        this.LLJILJILJ = (TuxIconView) view.findViewById(R.id.user_level_question_mark);
        this.LLJILLL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.tmx);
        this.LLJJ = (TuxTextView) view.findViewById(R.id.user_level_guidance);
        this.LLJJI = (C197039127h) view.findViewById(R.id.dqb);
        this.LLJJIII = (GridLayout) view.findViewById(R.id.tmu);
        this.LLJJIJI = (ViewGroup) view.findViewById(R.id.user_level_avatar_holder);
        this.LLJJIJIIJIL = (C427660Gpo) view.findViewById(R.id.user_avatar);
        this.LLJJIJIL = (SmartImageView) view.findViewById(R.id.user_avatar_little_icon);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILLL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiReviewsUserLevelRightsCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
            viewOnAttachStateChangeListenerC20604515jv.setOnFlingListener(new AbstractC1338480kw2() { // from class: X.0h7x
                @Override // X.AbstractC1338480kw2
                public final boolean LIZ(int i, int i2) {
                    return true;
                }
            });
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        PoiReviewsUserLevelSheetViewModel poiReviewsUserLevelSheetViewModel = (PoiReviewsUserLevelSheetViewModel) assemVMLazy.getValue();
        String strValueOf = String.valueOf(this.LLJJJ.getValue());
        PoiReviewsApi.LIZ.getClass();
        C0NBH.LIZ(C1172760gck.LIZ().LIZ(strValueOf)).LJJLJLI(new AfS187S0100000_18(poiReviewsUserLevelSheetViewModel, 70));
        AssemViewModel.asyncSubscribe$default(this.LLIZLLLIL.getValue(), new C2217371BqR() { // from class: X.0h4E
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158810gGF) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1158810gGF) obj).LL = (AbstractC1623806Xk) obj2;
            }
        }, this, null, null, null, new AwS597S0100000_18(this, 471), 28, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e86, viewGroup, false);
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
