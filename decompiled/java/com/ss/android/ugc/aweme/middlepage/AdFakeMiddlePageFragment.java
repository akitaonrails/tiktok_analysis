package com.ss.android.ugc.aweme.middlepage;

import X.C098200Yq;
import X.C0OM1;
import X.C1017520caM;
import X.C1023500ck0;
import X.C1023960ckk;
import X.C1037380d6O;
import X.C1037480d6Y;
import X.C1037670d6r;
import X.C1037680d6s;
import X.C1037690d6t;
import X.C1041160dCU;
import X.C1041170dCV;
import X.C11JF;
import X.C11N2;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2214201BlK;
import X.C786410Ut5;
import X.InterfaceC1023650ckF;
import X.InterfaceC1037460d6W;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.middlepage.AdFakeMiddlePageFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdFakeMiddlePageFragment extends AmeBaseFragment implements InterfaceC1037460d6W {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglLSs/HELIOSLTUtLip9CSEKKCQ2BSwoLSM2GCQrLAkhKSIhLCEn";
    public TuxTextView LL;
    public TuxNavBar LLILLJJLI;
    public TuxIconView LLILLL;
    public C197039127h LLILZ;
    public Runnable LLILZIL;
    public C1037480d6Y LLILZLL;
    public C11JF LLIZ;
    public TuxImmersionBar LLJI;
    public long LLIZLLLIL = 3;
    public String LLJ = "full_screen_slide";
    public final C1037670d6r LLJIJIL = new C11N2<Boolean>() { // from class: X.0d6r
        @Override // X.InterfaceC626120Oh8
        public final void onComplete() {
        }

        @Override // X.InterfaceC626120Oh8
        public final void onError(Throwable th) {
        }

        @Override // X.InterfaceC626120Oh8
        public final void onNext(Object obj) {
            C1037480d6Y c1037480d6Y;
            if (((Boolean) obj).booleanValue()) {
                C11JF c11jf = this.LLILLJJLI.LLIZ;
                if (c11jf != null) {
                    c11jf.dispose();
                    return;
                }
                return;
            }
            AdFakeMiddlePageFragment adFakeMiddlePageFragment = this.LLILLJJLI;
            C1037480d6Y c1037480d6Y2 = null;
            if (adFakeMiddlePageFragment.LLIZLLLIL > 0) {
                Context context = adFakeMiddlePageFragment.getContext();
                AdFakeMiddlePageFragment adFakeMiddlePageFragment2 = this.LLILLJJLI;
                C1037480d6Y c1037480d6Y3 = adFakeMiddlePageFragment2.LLILZLL;
                if (c1037480d6Y3 == null) {
                    c1037480d6Y = null;
                } else {
                    c1037480d6Y = c1037480d6Y3;
                }
                C1017520caM c1017520caM = c1037480d6Y.LIZIZ;
                if (c1037480d6Y3 == null) {
                    c1037480d6Y3 = null;
                }
                AwemeRawAd awemeRawAd = c1037480d6Y3.LIZ;
                TuxTextView tuxTextViewMR = adFakeMiddlePageFragment2.MR();
                Context context2 = this.LLILLJJLI.getContext();
                C1037480d6Y c1037480d6Y4 = this.LLILLJJLI.LLILZLL;
                if (c1037480d6Y4 != null) {
                    c1037480d6Y2 = c1037480d6Y4;
                }
                String strLIZ = C1037380d6O.LIZ(context2, c1037480d6Y2.LIZIZ);
                AdFakeMiddlePageFragment adFakeMiddlePageFragment3 = this.LLILLJJLI;
                adFakeMiddlePageFragment.LLIZ = C1037380d6O.LJII(context, c1017520caM, awemeRawAd, null, null, tuxTextViewMR, strLIZ, adFakeMiddlePageFragment3.LLIZ, adFakeMiddlePageFragment3.LLIZLLLIL, new AwS595S0100000_16(adFakeMiddlePageFragment3, 118));
                return;
            }
            TuxTextView tuxTextViewMR2 = adFakeMiddlePageFragment.MR();
            C1037480d6Y c1037480d6Y5 = this.LLILLJJLI.LLILZLL;
            if (c1037480d6Y5 != null) {
                c1037480d6Y2 = c1037480d6Y5;
            }
            C1037380d6O.LJIIIIZZ(tuxTextViewMR2, c1037480d6Y2.LIZIZ);
        }
    };

    @Override // X.InterfaceC1037460d6W
    public final void onShow() {
        TuxImmersionBar tuxImmersionBar = this.LLJI;
        if (tuxImmersionBar != null) {
            tuxImmersionBar.LJIIIIZZ(R.attr.bx);
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LJ(R.attr.bx);
            tuxImmersionBar.LIZLLL();
        }
        this.LLIZLLLIL = 3L;
        Context context = getContext();
        C1037480d6Y c1037480d6Y = this.LLILZLL;
        C1017520caM c1017520caM = (c1037480d6Y == null ? null : c1037480d6Y).LIZIZ;
        if (c1037480d6Y == null) {
            c1037480d6Y = null;
        }
        AwemeRawAd awemeRawAd = c1037480d6Y.LIZ;
        TuxTextView tuxTextViewMR = MR();
        Context context2 = getContext();
        C1037480d6Y c1037480d6Y2 = this.LLILZLL;
        if (c1037480d6Y2 == null) {
            c1037480d6Y2 = null;
        }
        this.LLIZ = C1037380d6O.LJII(context, c1017520caM, awemeRawAd, null, null, tuxTextViewMR, C1037380d6O.LIZ(context2, c1037480d6Y2.LIZIZ), this.LLIZ, this.LLIZLLLIL, new AwS595S0100000_16(this, 117));
        C1037480d6Y c1037480d6Y3 = null;
        C1041160dCU c1041160dCU = new C1041160dCU(new C1041170dCV(1, 0, null, null, null, 62));
        C1037680d6s.LIZ.getClass();
        C1023960ckk c1023960ckk = C1037680d6s.LIZIZ;
        C1037480d6Y c1037480d6Y4 = this.LLILZLL;
        if (c1037480d6Y4 != null) {
            c1037480d6Y3 = c1037480d6Y4;
        }
        c1041160dCU.logAd(c1023960ckk, c1037480d6Y3.LIZ);
        this.LLJ = "full_screen_slide";
    }

    public final TuxTextView MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.m17) : null;
            this.LL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // X.InterfaceC1037460d6W
    public final boolean onBackPress() {
        this.LLJ = "full_screen_system_click";
        Runnable runnable = this.LLILZIL;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    @Override // X.InterfaceC1037460d6W
    public final void onHide() {
        TuxImmersionBar tuxImmersionBar = this.LLJI;
        if (tuxImmersionBar != null) {
            tuxImmersionBar.LJIIIIZZ(R.attr.e1);
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LJ(R.attr.e1);
            tuxImmersionBar.LIZLLL();
        }
        C1041160dCU c1041160dCU = new C1041160dCU(new C1041170dCV(1, 0, null, null, null, 62));
        C1037680d6s c1037680d6s = C1037680d6s.LIZ;
        String str = this.LLJ;
        c1037680d6s.getClass();
        C1037690d6t.LIZ.getClass();
        C1023960ckk c1023960ckkLIZJ = C1023500ck0.LIZJ("middle_page_ad", "close", str, new InterfaceC1023650ckF[]{c1037680d6s.LJI(C1037690d6t.LIZIZ)});
        C1037480d6Y c1037480d6Y = this.LLILZLL;
        if (c1037480d6Y == null) {
            c1037480d6Y = null;
        }
        c1041160dCU.logAd(c1023960ckkLIZJ, c1037480d6Y.LIZ);
        C11JF c11jf = this.LLIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        TuxTextView tuxTextViewMR = MR();
        C1037480d6Y c1037480d6Y2 = this.LLILZLL;
        C1037380d6O.LJIIIIZZ(tuxTextViewMR, (c1037480d6Y2 != null ? c1037480d6Y2 : null).LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        dispose();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // X.InterfaceC1037460d6W
    public final void LLJI(Runnable runnable) {
        this.LLILZIL = runnable;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2214201BlK.LIZLLL().LIZIZ(this.LLJIJIL);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1037480d6Y c1037480d6Y;
        super.onViewCreated(view, bundle);
        this.LLJI = C1766560w4U.LIZLLL(this);
        View viewFindViewById = this.LLILLJJLI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.xzp);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (TuxNavBar) viewFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_thin_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS560S0100000_16(this, 824));
        c0om1.LJ(c1251150ifB);
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        C1037480d6Y c1037480d6Y2 = this.LLILZLL;
        if (c1037480d6Y2 == null) {
            c1037480d6Y = null;
        } else {
            c1037480d6Y = c1037480d6Y2;
        }
        C1017520caM c1017520caM = c1037480d6Y.LIZIZ;
        if (c1037480d6Y2 == null) {
            c1037480d6Y2 = null;
        }
        AwemeRawAd awemeRawAd = c1037480d6Y2.LIZ;
        View viewFindViewById3 = this.LLILLL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.m16);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLL = (TuxIconView) viewFindViewById3;
        }
        TuxIconView tuxIconView = (TuxIconView) viewFindViewById3;
        TuxTextView tuxTextViewMR = MR();
        View view4 = this.LLILZ;
        if (view4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById2 = view5.findViewById(R.id.m15);
            }
            this.LLILZ = (C197039127h) viewFindViewById2;
            view4 = viewFindViewById2;
        }
        C1037380d6O.LIZLLL(c1017520caM, awemeRawAd, tuxIconView, tuxTextViewMR, (C197039127h) view4, this.LLIZ, null, null, new AwS595S0100000_16(this, 320));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.l3, viewGroup, false);
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
