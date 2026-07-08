package com.ss.android.ugc.aweme.comment.viewerlist.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1350920lG6;
import X.C1440005kM;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.C729510SjV;
import X.C745620TMq;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS72S0110000_12;
import Y.AObserverS216S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class VideoViewHistoryAuthorizationFragment extends Fragment implements InterfaceC344240DeY {
    public static final C01GW<Boolean> LLJILJILJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(170));
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjFiPyY2PyA+JSYgHELIOSPGs5IGEFISEpJhk6LTIEIDwnJzc1CDonICo+IDUyPCwjJwkhKSIhLCEn";
    public C197039127h LL;
    public TuxIconView LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public C197039127h LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 394));
    public String LLJI = "";
    public Boolean LLJIJIL = Boolean.FALSE;
    public String LLJILJIL;

    public final C197039127h MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cwc) : null;
            this.LL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxTextView NR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fmd) : null;
            this.LLILZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView OR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fmf) : null;
            this.LLILZIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView PR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fmg) : null;
            this.LLILZLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView SR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tv_title) : null;
            this.LLIZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 393));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    public final VideoViewAuthorizationViewModel UR() {
        return (VideoViewAuthorizationViewModel) this.LLJ.getValue();
    }

    public final void VR() {
        C1350920lG6.LJIL("video_views_pop_up_click", this.LLJI, Intrinsics.LJFF(this.LLJIJIL, Boolean.TRUE) ? "auto_scene" : "click_bar", "close", CardStruct.IStatusCode.DEFAULT, RR(), "two_button", null, null, 384);
    }

    public final String RR() {
        return C729510SjV.LJJ(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(this.LLJILJIL)) ? "story" : "post";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        Boolean boolValueOf;
        super.onCreate(bundle);
        UR().LL.observe(this, new AObserverS216S0100000_12(this, 30));
        Bundle arguments = getArguments();
        String string2 = null;
        if (arguments != null) {
            string = arguments.getString("page_type", "");
        } else {
            string = null;
        }
        this.LLJI = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            boolValueOf = Boolean.valueOf(arguments2.getBoolean("is_auto_pop", false));
        } else {
            boolValueOf = null;
        }
        this.LLJIJIL = boolValueOf;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string2 = arguments3.getString("aid", "");
        }
        this.LLJILJIL = string2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        String str2;
        super.onViewCreated(view, bundle);
        String str3 = this.LLJI;
        Boolean bool = this.LLJIJIL;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            str = "auto_scene";
        } else {
            str = "click_bar";
        }
        View viewFindViewById = null;
        C1350920lG6.LJIL("video_views_pop_up_show", str3, str, null, null, RR(), "two_button", null, null, 408);
        boolean zLIZJ = ComplianceServiceProvider.LJIJJ().LIZJ();
        if (!Intrinsics.LJFF(this.LLJI, "personal_homepage") && Intrinsics.LJFF(this.LLJIJIL, bool2)) {
            View viewFindViewById2 = this.LLILLJJLI;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.fna);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLJJLI = (TuxIconView) viewFindViewById2;
            }
            ((TuxIconView) viewFindViewById2).setIconRes(R.raw.icon_person_tick);
            View viewFindViewById3 = this.LLILLL;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.fnb);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLL = (TuxIconView) viewFindViewById3;
            }
            ((TuxIconView) viewFindViewById3).setIconRes(R.raw.icon_eye);
            if (UR().wQ2()) {
                TuxTextView tuxTextViewNR = NR();
                if (tuxTextViewNR != null) {
                    tuxTextViewNR.setText(2131837199);
                }
                TuxTextView tuxTextViewOR = OR();
                if (tuxTextViewOR != null) {
                    tuxTextViewOR.setText(2131837196);
                }
                TuxTextView tuxTextViewPR = PR();
                if (tuxTextViewPR != null) {
                    tuxTextViewPR.setText(2131837197);
                }
                TuxTextView tuxTextViewSR = SR();
                if (tuxTextViewSR != null) {
                    tuxTextViewSR.setText(2131837200);
                }
            } else if (zLIZJ) {
                View viewFindViewById4 = view.findViewById(R.id.kwy);
                if (viewFindViewById4 != null) {
                    int visibility = viewFindViewById4.getVisibility();
                    viewFindViewById4.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, viewFindViewById4);
                }
                TuxTextView tuxTextViewNR2 = NR();
                if (tuxTextViewNR2 != null) {
                    tuxTextViewNR2.setText(2131837180);
                }
                TuxTextView tuxTextViewOR2 = OR();
                if (tuxTextViewOR2 != null) {
                    tuxTextViewOR2.setText(2131837181);
                }
                TuxTextView tuxTextViewSR2 = SR();
                if (tuxTextViewSR2 != null) {
                    tuxTextViewSR2.setText(2131837182);
                }
                View viewFindViewById5 = this.LLIZLLLIL;
                if (viewFindViewById5 == null) {
                    View view4 = getView();
                    if (view4 != null) {
                        viewFindViewById5 = view4.findViewById(R.id.csi);
                    } else {
                        viewFindViewById5 = null;
                    }
                    this.LLIZLLLIL = (C197039127h) viewFindViewById5;
                }
                TextView textView = (TextView) viewFindViewById5;
                if (textView != null) {
                    textView.setText(2131837183);
                }
            } else {
                TuxTextView tuxTextViewNR3 = NR();
                if (tuxTextViewNR3 != null) {
                    tuxTextViewNR3.setText(2131858186);
                }
                TuxTextView tuxTextViewOR3 = OR();
                if (tuxTextViewOR3 != null) {
                    tuxTextViewOR3.setText(2131858187);
                }
                TuxTextView tuxTextViewPR2 = PR();
                if (tuxTextViewPR2 != null) {
                    tuxTextViewPR2.setText(2131858188);
                }
                TuxTextView tuxTextViewSR3 = SR();
                if (tuxTextViewSR3 != null) {
                    tuxTextViewSR3.setText(2131858190);
                }
            }
        } else if (UR().wQ2()) {
            NR().setText(2131837205);
            OR().setText(2131837199);
            PR().setText(2131837203);
            SR().setText(2131837204);
        }
        if (UR().wQ2()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (Intrinsics.LJFF(this.LLJI, "personal_homepage")) {
                str2 = "video_views_page_self";
            } else {
                str2 = "video_views_page_others";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            C20684815ws.LJIILLIIL("load_viewers_permission", c2344009Gk.LIZ);
        }
        if (!Intrinsics.LJFF(this.LLJI, "personal_homepage") && Intrinsics.LJFF(this.LLJIJIL, bool2) && !UR().wQ2() && zLIZJ) {
            z = true;
        } else {
            z = false;
        }
        View view5 = this.LLIZLLLIL;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById = view6.findViewById(R.id.csi);
            }
            this.LLIZLLLIL = (C197039127h) viewFindViewById;
            view5 = viewFindViewById;
        }
        C786410Ut5.U8((C197039127h) view5, new ACListenerS72S0110000_12(this, z, 5));
        C786410Ut5.U8(MR(), new ACListenerS72S0110000_12(this, z, 6));
        C19EG activity = getActivity();
        if (activity != null) {
            activity.hashCode();
        }
        C1440005kM.LIZ(new C745620TMq(1));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a5b, viewGroup, false);
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
