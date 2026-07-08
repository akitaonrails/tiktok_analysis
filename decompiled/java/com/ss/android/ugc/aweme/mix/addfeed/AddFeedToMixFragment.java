package com.ss.android.ugc.aweme.mix.addfeed;

import X.AbstractC329610Cw3;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0XF1;
import X.C1168660gW8;
import X.C1168680gWA;
import X.C1168690gWB;
import X.C1250250idj;
import X.C1251150ifB;
import X.C14EU;
import X.C1626990sRN;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C1893080zMY;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20509915Nh;
import X.C20607315kN;
import X.C298190BmT;
import X.C418440Gaw;
import X.C452501pT;
import X.C739760T0c;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1168540gVw;
import X.InterfaceC1168720gWE;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel;
import com.ss.android.ugc.aweme.servicimpl.SplitVideoServiceImpl;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import wh6.AbS508S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class AddFeedToMixFragment extends Fragment implements InterfaceC1168720gWE {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglMWHELIOSEyLCEqLCo3ZgQoLQk2LSEYJgI6MAM+KCg+LSs4";
    public C1749280vcc LL;
    public C197039127h LLILLJJLI;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLL;
    public View LLILZ;
    public TuxNavBar LLILZIL;
    public Aweme LLIZ;
    public boolean LLJI;
    public InterfaceC1168540gVw LLJIJIL;
    public int LLJILJILJ;
    public boolean LLJJI;
    public C0OM1 LLJJIII;
    public boolean LLJJIJI;
    public C20509915Nh LLJJIJIIJIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 381));
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public String LLJILJIL = "";
    public String LLJILLL = "";
    public String LLJJ = "";
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(177));
    public final AwS597S0100000_18 LLJJJ = new AwS597S0100000_18(this, 123);

    public final void retry() {
        this.LLJJIJI = false;
        MR().LJ();
        ((PowerPageSource) PR().LLJIJIL.getValue()).getOperator().refresh();
    }

    public final C1749280vcc MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.af4) : null;
            this.LL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C197039127h NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cmo) : null;
            this.LLILLJJLI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv OR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sjh) : null;
            this.LLILLL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final GetMixListViewModel PR() {
        return (GetMixListViewModel) this.LLILZLL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C20509915Nh c20509915Nh = this.LLJJIJIIJIL;
        if (c20509915Nh != null) {
            c20509915Nh.LIZIZ();
        }
        this.LLJJIJIIJIL = null;
        super.onDestroy();
    }

    public final void RR() {
        Pair<String, String> pairLIZ = C1626990sRN.LIZ(MR().getContext());
        if (this.LLJJIJIIJIL == null) {
            this.LLJJIJIIJIL = new C20509915Nh(new AwS562S0100000_18(this, 378), new AwS562S0100000_18(this, 379), true);
        }
        C20509915Nh c20509915Nh = this.LLJJIJIIJIL;
        if (c20509915Nh != null) {
            c20509915Nh.LIZ();
        }
        C1749280vcc c1749280vccMR = MR();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        String first = pairLIZ.getFirst();
        String second = pairLIZ.getSecond();
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 380);
        Double dValueOf = Double.valueOf(72.0d);
        C1893080zMY.LIZJ(c1722300uv6, first, second, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), R.raw.icon_large_refresh, awS562S0100000_18);
        c1749280vccMR.setStatus(c1722300uv6);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.setOnKeyListener(new View.OnKeyListener() { // from class: X.0gWD
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                    if (i == 4) {
                        if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                            Fragment fragment = this.LL;
                            fragment.getClass();
                            try {
                                FragmentManager fragmentManager = fragment.getFragmentManager();
                                if (fragmentManager != null) {
                                    C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
                                    c19ehLJIIJ.LJIJJ(R.anim.fv, R.anim.g2);
                                    c19ehLJIIJ.LJIIZILJ(fragment);
                                    c19ehLJIIJ.LJIIJJI();
                                    return true;
                                }
                            } catch (IllegalStateException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    } else if (i != 4) {
                        return false;
                    }
                    return true;
                }
            });
        }
    }

    @Override // X.InterfaceC1168720gWE
    public final void fM1(C1168660gW8 c1168660gW8) {
        this.LLJJJ.invoke(c1168660gW8);
    }

    @Override // X.InterfaceC1168720gWE
    public final void ii1(C1168690gWB c1168690gWB) {
        C197039127h c197039127hNR = NR();
        if (c197039127hNR != null) {
            c197039127hNR.setEnabled(c1168690gWB.LIZ);
        }
    }

    @Override // X.InterfaceC1168720gWE
    public final void ks2(C1168680gWA c1168680gWA) {
        if (c1168680gWA.LIZ) {
            this.LLJILJIL = c1168680gWA.LIZIZ;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String string;
        boolean z;
        String string2;
        String string3;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string4 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("key_add_mix_aweme");
        } else {
            serializable = null;
        }
        this.LLIZ = (Aweme) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string = arguments2.getString("key_choosed_mix_id");
        } else {
            string = null;
        }
        this.LLIZLLLIL = string;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string4 = arguments3.getString("key_choosed_mix_name");
        }
        this.LLJILJIL = string4;
        PR().LLIZ = this.LLIZ;
        GetMixListViewModel getMixListViewModelPR = PR();
        String str = this.LLIZLLLIL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        getMixListViewModelPR.LLILZLL = str;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            z = arguments4.getBoolean("key_full_scrren", false);
        } else {
            z = false;
        }
        this.LLJI = z;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (string2 = arguments5.getString("enter_from")) == null) {
            string2 = "";
        }
        this.LLJILLL = string2;
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (string3 = arguments6.getString("enter_method")) != null) {
            str2 = string3;
        }
        this.LLJJ = str2;
        GetMixListViewModel getMixListViewModelPR2 = PR();
        String str3 = this.LLJILLL;
        String str4 = this.LLJJ;
        getMixListViewModelPR2.LLIZLLLIL = str3;
        getMixListViewModelPR2.LLJ = str4;
        if (this.LLJI) {
            PR().LLILLL = false;
            PR().LLJI = true;
        }
        if (SplitVideoServiceImpl.LIZ().showPlayList() || SplitVideoServiceImpl.LIZ().playListAutoTake()) {
            PR().LLILZ = true;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCreateMixListSuccess(C739760T0c c739760T0c) {
        if (!c739760T0c.LJ && c739760T0c.LIZ && !TextUtils.isEmpty(c739760T0c.LIZJ) && !TextUtils.isEmpty(c739760T0c.LIZIZ)) {
            MR().LJ();
            C786410Ut5.LLLZLZ(MR(), 0);
            GetMixListViewModel getMixListViewModelPR = PR();
            getMixListViewModelPR.LLILZLL = c739760T0c.LIZJ;
            getMixListViewModelPR.LL = -1;
            getMixListViewModelPR.LLILLJJLI = null;
            ((PowerPageSource) PR().LLJIJIL.getValue()).getOperator().refresh();
            if (!TextUtils.isEmpty(c739760T0c.LIZJ)) {
                String str = c739760T0c.LIZJ;
                this.LLJ = str;
                this.LLIZLLLIL = str;
                this.LLJILJIL = c739760T0c.LIZIZ;
                NR().setEnabled(true);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zLIZLLL;
        super.onViewCreated(view, bundle);
        if (!C298190BmT.LIZ()) {
            MR().setOnTouchListener(new View.OnTouchListener() { // from class: X.0gW9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        MR().LJ();
        C786410Ut5.LLLZLZ(MR(), 0);
        C0OM1 c0om1 = new C0OM1();
        this.LLJJIII = c0om1;
        if (this.LLJI) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS562S0100000_18(this, 2676));
            c0om1.LIZIZ(c1251150ifB);
            View viewFindViewById = this.LLILZ;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.d7o);
                } else {
                    viewFindViewById = null;
                }
                this.LLILZ = viewFindViewById;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            NR().setText(getResources().getText(R.string.hz2));
        } else {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_x_mark;
            c1251150ifB2.LIZLLL = true;
            c1251150ifB2.LIZJ(new AwS562S0100000_18(this, 2677));
            c0om1.LIZIZ(c1251150ifB2);
            View viewFindViewById2 = this.LLILZ;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.d7o);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILZ = viewFindViewById2;
            }
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131825158);
        c0om1.LIZJ = c1250250idj;
        View viewFindViewById3 = this.LLILZIL;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.p15);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZIL = (TuxNavBar) viewFindViewById3;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById3;
        C0OM1 c0om12 = this.LLJJIII;
        if (c0om12 == null) {
            c0om12 = null;
        }
        tuxNavBar.setNavActions(c0om12);
        View viewFindViewById4 = this.LLILZIL;
        if (viewFindViewById4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById4 = view5.findViewById(R.id.p15);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILZIL = (TuxNavBar) viewFindViewById4;
        }
        ((TuxNavBar) viewFindViewById4).LJIIZILJ(true);
        if (!TextUtils.isEmpty(this.LLIZLLLIL) && !TextUtils.isEmpty(this.LLJILJIL)) {
            NR().setEnabled(true);
            this.LLJJI = true;
        }
        ((PowerAdapter) OR().getAdapter()).LLLLII(this, AddFeedToMixFragment.class);
        OR().LJIILJJIL(AddFeedToMixListCell.class, DefaultMixListCell.class);
        OR().LJIIL((AbstractC329610Cw3) PR().LLJIJIL.getValue());
        OR().setItemAnimator(null);
        C786410Ut5.I7(new AbS508S0200000_18(this, view, 28, 42), NR());
        OR().LJII(new C20607315kN() { // from class: X.0gW5
            @Override // X.C20607315kN
            public final void LJII(Exception exc) {
                boolean zLIZLLL2;
                Context context = this.LL.getContext();
                if (context != null) {
                    zLIZLLL2 = C0XF1.LIZLLL(context);
                } else {
                    zLIZLLL2 = true;
                }
                if (C298190BmT.LIZ() && !zLIZLLL2) {
                    AddFeedToMixFragment addFeedToMixFragment = this.LL;
                    addFeedToMixFragment.LLJJIJI = true;
                    addFeedToMixFragment.RR();
                    return;
                }
                C1749280vcc c1749280vccMR = this.LL.MR();
                if (c1749280vccMR != null) {
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    C1893080zMY.LJFF(c1722300uv6, new AwS562S0100000_18(this.LL, 2678));
                    c1749280vccMR.setStatus(c1722300uv6);
                }
                C1749280vcc c1749280vccMR2 = this.LL.MR();
                if (c1749280vccMR2 == null) {
                    return;
                }
                C786410Ut5.LLLZLZ(c1749280vccMR2, 0);
            }

            @Override // X.C20607315kN
            public final void LJIIIZ(boolean z) {
                C1749280vcc c1749280vccMR = this.LL.MR();
                if (c1749280vccMR != null) {
                    C786410Ut5.LLLZLZ(c1749280vccMR, 8);
                }
            }
        });
        Context context = getContext();
        if (context != null) {
            zLIZLLL = C0XF1.LIZLLL(context);
        } else {
            zLIZLLL = true;
        }
        if (C298190BmT.LIZ() && !zLIZLLL) {
            this.LLJJIJI = true;
            RR();
        } else {
            ((PowerPageSource) PR().LLJIJIL.getValue()).getOperator().refresh();
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.do5, viewGroup, false);
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
