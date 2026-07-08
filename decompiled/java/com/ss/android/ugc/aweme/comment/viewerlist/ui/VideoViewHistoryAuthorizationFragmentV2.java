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
import X.C21411818qq;
import X.C2344009Gk;
import X.C431200GvW;
import X.C452501pT;
import X.C729510SjV;
import X.C745620TMq;
import X.C785990UsP;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS72S0110000_12;
import Y.AObserverS216S0100000_12;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class VideoViewHistoryAuthorizationFragmentV2 extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjFiPyY2PyA+JSYgPGHELIOSs5IGEFISEpJhk6LTIEIDwnJzc1CDonICo+IDUyPCwjJwkhKSIhLCEnHnc=";
    public C197039127h LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public C21411818qq LLIZ;
    public boolean LLJI;
    public String LLJILJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 396));
    public String LLJ = "";
    public Boolean LLJIJIL = Boolean.FALSE;
    public boolean LLJILJILJ = true;

    public final C197039127h MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cuk) : null;
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

    public final C21411818qq RR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.video_view_auth_switch) : null;
            this.LLIZ = (C21411818qq) viewFindViewById;
        }
        return (C21411818qq) viewFindViewById;
    }

    public final VideoViewAuthorizationViewModel SR() {
        return (VideoViewAuthorizationViewModel) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 395));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    public final String PR() {
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
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        Boolean boolValueOf;
        super.onCreate(bundle);
        SR().LL.observe(this, new AObserverS216S0100000_12(this, 31));
        Bundle arguments = getArguments();
        String string2 = null;
        if (arguments != null) {
            string = arguments.getString("page_type", "");
        } else {
            string = null;
        }
        this.LLJ = string;
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
        CharSequence spannableStringBuilder;
        String str2;
        super.onViewCreated(view, bundle);
        String str3 = this.LLJ;
        if (Intrinsics.LJFF(this.LLJIJIL, Boolean.TRUE)) {
            str = "auto_scene";
        } else {
            str = "click_bar";
        }
        C1350920lG6.LJIL("video_views_pop_up_show", str3, str, null, null, PR(), "one_button", null, null, 408);
        View viewFindViewById = null;
        if (SR().wQ2()) {
            View viewFindViewById2 = this.LLILLJJLI;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.tv_title);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLJJLI = (TuxTextView) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(getString(2131837198));
            View viewFindViewById3 = this.LLILLL;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.video_view_auth_switch_desc);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLL = (TuxTextView) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(getString(2131837213));
        }
        boolean zLIZJ = ComplianceServiceProvider.LJIJJ().LIZJ();
        if (!Intrinsics.LJFF(this.LLJ, "personal_homepage")) {
            if (SR().wQ2()) {
                TuxTextView tuxTextViewNR = NR();
                if (tuxTextViewNR != null) {
                    tuxTextViewNR.setText(2131837195);
                }
                TuxTextView tuxTextViewOR = OR();
                if (tuxTextViewOR != null) {
                    tuxTextViewOR.setText(2131837196);
                }
            } else if (zLIZJ) {
                TuxTextView tuxTextViewNR2 = NR();
                if (tuxTextViewNR2 != null) {
                    tuxTextViewNR2.setText(2131837180);
                }
                TuxTextView tuxTextViewOR2 = OR();
                if (tuxTextViewOR2 != null) {
                    tuxTextViewOR2.setText(2131837181);
                }
            } else {
                TuxTextView tuxTextViewNR3 = NR();
                if (tuxTextViewNR3 != null) {
                    tuxTextViewNR3.setText(2131844969);
                }
                TuxTextView tuxTextViewOR3 = OR();
                if (tuxTextViewOR3 != null) {
                    tuxTextViewOR3.setText(2131844970);
                }
            }
        } else if (SR().wQ2()) {
            NR().setText(2131837205);
            OR().setText(2131837195);
        }
        if (!Intrinsics.LJFF(this.LLJ, "personal_homepage") && !SR().wQ2() && zLIZJ) {
            z = true;
            View viewFindViewById4 = view.findViewById(R.id.g3n);
            if (viewFindViewById4 != null) {
                int visibility = viewFindViewById4.getVisibility();
                viewFindViewById4.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, viewFindViewById4);
            }
            View viewFindViewById5 = this.LLILLJJLI;
            if (viewFindViewById5 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById5 = view4.findViewById(R.id.tv_title);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLILLJJLI = (TuxTextView) viewFindViewById5;
            }
            TextView textView = (TextView) viewFindViewById5;
            if (textView != null) {
                textView.setText(2131837182);
            }
            View view5 = this.LLILLL;
            if (view5 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById = view6.findViewById(R.id.video_view_auth_switch_desc);
                }
                this.LLILLL = (TuxTextView) viewFindViewById;
                view5 = viewFindViewById;
            }
            TextView textView2 = (TextView) view5;
            if (textView2 != null) {
                textView2.setText(2131837213);
            }
        } else {
            z = false;
            View viewFindViewById6 = this.LLILZLL;
            if (viewFindViewById6 == null) {
                View view7 = getView();
                if (view7 != null) {
                    viewFindViewById6 = view7.findViewById(R.id.fmg);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLILZLL = (TuxTextView) viewFindViewById6;
            }
            TextView textView3 = (TextView) viewFindViewById6;
            if (SR().wQ2()) {
                spannableStringBuilder = getString(2131837197);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(getString(2131844971, getString(2131844972)));
            }
            textView3.setText(spannableStringBuilder);
            View view8 = this.LLILZLL;
            if (view8 == null) {
                View view9 = getView();
                if (view9 != null) {
                    viewFindViewById = view9.findViewById(R.id.fmg);
                }
                this.LLILZLL = (TuxTextView) viewFindViewById;
                view8 = viewFindViewById;
            }
            ((TextView) view8).setMovementMethod(new C431200GvW());
        }
        C786410Ut5.C7(RR(), new C785990UsP(this, 24));
        if (SR().wQ2()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (Intrinsics.LJFF(this.LLJ, "personal_homepage")) {
                str2 = "video_views_page_self";
            } else {
                str2 = "video_views_page_others";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            C20684815ws.LJIILLIIL("load_viewers_permission", c2344009Gk.LIZ);
        }
        C786410Ut5.U8(MR(), new ACListenerS72S0110000_12(this, z, 7));
        C19EG activity = getActivity();
        if (activity != null) {
            activity.hashCode();
        }
        C1440005kM.LIZ(new C745620TMq(1));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a5c, viewGroup, false);
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
