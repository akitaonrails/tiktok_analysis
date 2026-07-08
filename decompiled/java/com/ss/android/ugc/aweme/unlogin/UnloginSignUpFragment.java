package com.ss.android.ugc.aweme.unlogin;

import X.AbstractC848400XPy;
import X.C098200Yq;
import X.C0BMS;
import X.C0I7Z;
import X.C0OBG;
import X.C0XPD;
import X.C0XQ7;
import X.C1075690e6B;
import X.C1077490e95;
import X.C10S5;
import X.C11NZ;
import X.C1247530iZL;
import X.C1256070in7;
import X.C1390850mIV;
import X.C13BV;
import X.C14EU;
import X.C1585030rLh;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2018307vR;
import X.C2035607yE;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2211631BhB;
import X.C343710Ddh;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C446900Hfk;
import X.C446980Hfs;
import X.C497820Jfg;
import X.C616540OGe;
import X.C627150Oin;
import X.C664270Q3t;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1055110dYz;
import Y.ACListenerS151S0100000_16;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS85S0200000_16;
import Y.AfS185S0100000_16;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hox.Hox;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class UnloginSignUpFragment extends CommonPageFragment implements View.OnClickListener, InterfaceC1055110dYz, C10S5 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjAiHELIOSJSA0IStiHCE/JyIlJxw6LysZOQkhKSIhLCEn";
    public View LL;
    public TuxIconView LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public ImageView LLILZLL;
    public TuxIconView LLIZ;
    public C197039127h LLIZLLLIL;
    public FrameLayout LLJ;
    public LinearLayout LLJI;
    public ViewStub LLJIJIL;
    public C197039127h LLJILJIL;
    public FrameLayout LLJILJILJ;
    public View LLJILLL;
    public ScrollView LLJJ;
    public C1075690e6B LLJJI;
    public boolean LLJJIII = true;
    public View LLJJIJI;

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
    }

    @Override // X.C10S5
    public final String pO() {
        return "MainTabPage";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final TuxIconView OR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bnh) : null;
            this.LLILLJJLI = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final TuxIconView PR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bnk) : null;
            this.LLILLL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final C197039127h RR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cv8) : null;
            this.LLIZLLLIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxTextView SR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jok) : null;
            this.LLILZIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ImageView UR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kfu) : null;
            this.LLILZLL = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final LinearLayout VR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.unlogin_inbox_group_view) : null;
            this.LLJI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final FrameLayout WR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.unlogin_marquee) : null;
            this.LLJILJILJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final FrameLayout ZR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.unlogin_marquee_login) : null;
            this.LLJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1075690e6B c1075690e6B = this.LLJJI;
        if (c1075690e6B != null) {
            c1075690e6B.LIZJ.dispose();
            if (((AnimatorSet) c1075690e6B.LIZLLL.getValue()).isRunning()) {
                ((AnimatorSet) c1075690e6B.LIZLLL.getValue()).cancel();
            }
            Handler handler = c1075690e6B.LIZ.getHandler();
            if (handler != null) {
                ARunnableS116S0100000_16 aRunnableS116S0100000_16 = c1075690e6B.LJIILIIL;
                if (aRunnableS116S0100000_16 == null) {
                    aRunnableS116S0100000_16 = null;
                }
                handler.removeCallbacks(aRunnableS116S0100000_16);
            }
        }
        super.onDestroy();
    }

    @Override // X.C10S5, X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return "UnloginSignUpFragment";
        }
        String string = arguments.getString("tab");
        return Intrinsics.LJFF("UNLOGIN_NOTIFICATION", string) ? "b3426" : Intrinsics.LJFF("UNLOGIN_PROFILE", string) ? "b2706" : string == null ? "UnloginSignUpFragment" : string;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
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
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(UnloginSignUpFragment.class.getName());
        }
        super.onResume();
        C19EG activity = getActivity();
        if (activity == null || !Intrinsics.LJFF(C343710Ddh.LIZ(activity).BQ2(), this)) {
            return;
        }
        C2211631BhB.LJIIL(this, null);
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS85S0200000_16(this, activity, 18));
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return C664270Q3t.LIZ(this);
    }

    public final List<String> NR(int i) {
        if (i != 0) {
            if (i != 1) {
                return C13BV.INSTANCE;
            }
            return C1697810uHb.LJIIJJI(getString(2131837478), getString(2131837479), getString(2131837480));
        }
        return C1697810uHb.LJIIJJI(getString(2131837474), getString(2131837475), getString(2131837476));
    }

    public final void aS(int i) {
        String str;
        String str2;
        boolean z = this.LLJJIII;
        String str3 = "message";
        if (z) {
            str = "message";
        } else {
            str = "personal_homepage";
        }
        String str4 = "";
        if (i != 0) {
            if (i != 1) {
                str2 = "";
            } else {
                str2 = "click_area";
            }
        } else if (z) {
            str2 = "click_message";
        } else {
            str2 = "click_mine";
        }
        C627150Oin c627150Oin = new C627150Oin();
        c627150Oin.LIZ.putBoolean("show_login_page_first", true);
        C0XPD.LIZJ(this, str, str2, c627150Oin.LIZ, new C1077490e95(this, 1));
        C2018307vR c2018307vR = C2018307vR.LIZ;
        boolean z2 = this.LLJJIII;
        if (!z2) {
            str3 = "personal_homepage";
        }
        if (i != 0) {
            if (i == 1) {
                str4 = "click_area";
            }
        } else if (z2) {
            str4 = "click_message";
        } else {
            str4 = "click_mine";
        }
        c2018307vR.getClass();
        C2018307vR.LIZ(str3, str4);
    }

    public final void bS(int i) {
        View viewFindViewById = this.LLJILJIL;
        View view = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.unlogin_btn_login_signup);
            } else {
                viewFindViewById = null;
            }
            this.LLJILJIL = (C197039127h) viewFindViewById;
        }
        ((TuxTextView) viewFindViewById).setTuxFont(33);
        C786410Ut5.LJZI(8, UR());
        C786410Ut5.LLLLZLL(SR(), 8);
        C786410Ut5.LLLLLLJ(RR(), 8);
        View viewFindViewById2 = this.LLJILLL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.y0k);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJILLL = viewFindViewById2;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        if (i == 0 || i == 1) {
            this.LLJJI = new C1075690e6B(WR(), NR(i));
        }
        C1075690e6B c1075690e6B = this.LLJJI;
        if (c1075690e6B == null) {
            c1075690e6B = null;
        }
        c1075690e6B.getClass();
        c1075690e6B.LIZJ.LIZ(C11NZ.LJJJJLI(1700L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS185S0100000_16(c1075690e6B, 46)));
        C786410Ut5.LJZ(0, ZR());
        if (i != 0) {
            if (i == 1) {
                View viewFindViewById3 = this.LLJIJIL;
                if (viewFindViewById3 == null) {
                    View view4 = getView();
                    if (view4 != null) {
                        viewFindViewById3 = view4.findViewById(R.id.unlogin_profile_content_layout_exp);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLJIJIL = (ViewStub) viewFindViewById3;
                }
                View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) viewFindViewById3);
                this.LLJJIJI = viewLJLLLL;
                if (viewLJLLLL != null) {
                    view = viewLJLLLL;
                }
                C786410Ut5.LJLLLLLL(0, view);
                C0I7Z.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), ZR());
                return;
            }
            return;
        }
        C786410Ut5.LJZL(0, VR());
        VR().addView(MR(R.raw.icon_color_comment_circle, true));
        VR().addView(MR(R.raw.icon_color_like_circle_inbox, true));
        VR().addView(MR(R.raw.icon_color_two_person_circle, true));
        VR().addView(MR(R.raw.icon_color_paperplane_circle, false));
        C0I7Z.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), ZR());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentManager fragmentManager;
        if (view == null || C0OBG.LIZIZ(view)) {
            return;
        }
        int id = view.getId();
        if (id != R.id.unlogin_btn_login_signup && id != R.id.cv8) {
            if (id == R.id.uuw) {
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("app_trans_mstv_de", false)) {
                    SmartRouter.buildRoute(getActivity(), "//setting").open();
                    return;
                }
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI == null || (fragmentManager = fragmentLJI.getFragmentManager()) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                Context context = getContext();
                if (context != null) {
                    C1247530iZL c1247530iZL = new C1247530iZL();
                    c1247530iZL.LIZJ(R.raw.icon_document_umbrella);
                    c1247530iZL.LIZ = context.getString(2131826609);
                    c1247530iZL.LIZ(new AwS595S0100000_16(this, 359));
                    arrayList.add(c1247530iZL);
                    sb.append("transparency_mstv,");
                }
                Context context2 = getContext();
                if (context2 != null) {
                    C1247530iZL c1247530iZL2 = new C1247530iZL();
                    c1247530iZL2.LIZJ(R.raw.icon_gear);
                    c1247530iZL2.LIZ = context2.getString(2131829013);
                    c1247530iZL2.LIZ(new AwS595S0100000_16(this, 360));
                    arrayList.add(c1247530iZL2);
                    sb.append("settings,");
                }
                C20684815ws.LJIJ("setting_panel_show", new JSONObject(C2097608Jq.LJIIJ(new Pair("enter_from", "personal_homepage"), new Pair("list", sb), new Pair("is_login", 0), new Pair("profile_entrance_id", Long.valueOf(C1256070in7.LIZ)))));
                C1390850mIV c1390850mIV = new C1390850mIV();
                c1390850mIV.LJFF(arrayList);
                c1390850mIV.LIZJ().show(fragmentManager, "unlogin_popup_panel");
                return;
            }
            return;
        }
        aS(0);
    }

    @C14EU
    public final void onEvent(C2035607yE c2035607yE) {
        if (!this.LLJJIII) {
            if (C1585030rLh.LJJI() && C1585030rLh.LJIIJ("USER") == 1) {
                C19EG activity = getActivity();
                if (activity != null) {
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("fromStart", "RootNode", bundle);
                    bundle.putBoolean("isSmoothScroll", true);
                    Hox.LLJILJIL.LIZ(activity).TQ2(bundle, "page_feed", false);
                    return;
                }
                return;
            }
            TabChangeManager.xQ2(C343710Ddh.LIZ(getActivity()), "HOME", false, null, 30);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        C2211631BhB.LJIIL(this, null);
    }

    public final View MR(int i, boolean z) {
        View viewSd = C786410Ut5.Sd(R.layout.cdf, C786410Ut5.ne(getActivity()), null);
        C786410Ut5.W5(viewSd, new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))));
        viewSd.findViewById(R.id.j4o).setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{C446980Hfs.LIZ(getActivity(), R.color.nc), C446980Hfs.LIZ(getActivity(), R.color.nb)}));
        View viewFindViewById = viewSd.findViewById(R.id.fzj);
        if (z) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        } else {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.k55);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c419910GdJ.LIZ = i;
        tuxIconView.setTuxIcon(c419910GdJ);
        return viewSd;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        int iLIZJ;
        super.onViewCreated(view, bundle);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0e68
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        Bundle arguments = getArguments();
        View viewFindViewById = null;
        if (arguments != null) {
            string = arguments.getString("tab");
        } else {
            string = null;
        }
        this.LLJJIII = TextUtils.equals(string, "UNLOGIN_NOTIFICATION");
        Context context = getContext();
        if (context != null) {
            iLIZJ = C497820Jfg.LIZJ(context);
        } else {
            iLIZJ = 0;
        }
        if (iLIZJ > 0) {
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.iso);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = viewFindViewById2;
            }
            viewFindViewById2.getLayoutParams().height = iLIZJ;
        } else {
            View viewFindViewById3 = this.LL;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.iso);
                } else {
                    viewFindViewById3 = null;
                }
                this.LL = viewFindViewById3;
            }
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
        }
        if (this.LLJJIII) {
            if (!C1585030rLh.LJIJ("NOTIFICATION") && C1585030rLh.LJIIJ("NOTIFICATION") == 1) {
                TuxIconView tuxIconViewOR = OR();
                C786410Ut5.LJLLLLLL(0, tuxIconViewOR);
                C786410Ut5.I7(new ACListenerS151S0100000_16(this, 133), tuxIconViewOR);
            } else if (!C1585030rLh.LJIJ("NOTIFICATION") && C1585030rLh.LJIIJ("NOTIFICATION") == 0) {
                TuxIconView tuxIconViewPR = PR();
                C786410Ut5.LJLLLLLL(0, tuxIconViewPR);
                C786410Ut5.I7(new ACListenerS151S0100000_16(this, 133), tuxIconViewPR);
            } else {
                C786410Ut5.LLLLLLZZ(OR(), 8);
                C786410Ut5.LLLLLLZZ(PR(), 8);
            }
            View viewFindViewById4 = this.LLILZ;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.tv_title);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILZ = (TuxTextView) viewFindViewById4;
            }
            ((TextView) viewFindViewById4).setText(view.getContext().getText(2131838282));
            if (C0BMS.LIZ()) {
                bS(0);
            } else {
                SR().setText(view.getContext().getText(2131830630));
                UR().setImageResource(R.drawable.bvl);
            }
        } else {
            if (!C1585030rLh.LJIILL() && !C1585030rLh.LJIILLIIL()) {
                C786410Ut5.LLLLLLZZ(OR(), 8);
                C786410Ut5.LLLLLLZZ(PR(), 8);
            } else {
                TuxIconView tuxIconViewOR2 = OR();
                C786410Ut5.LJLLLLLL(0, tuxIconViewOR2);
                C786410Ut5.I7(new ACListenerS151S0100000_16(this, 133), tuxIconViewOR2);
            }
            View viewFindViewById5 = this.LLILZ;
            if (viewFindViewById5 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById5 = view5.findViewById(R.id.tv_title);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLILZ = (TuxTextView) viewFindViewById5;
            }
            ((TextView) viewFindViewById5).setText(view.getContext().getText(2131845500));
            View viewFindViewById6 = this.LLIZ;
            if (viewFindViewById6 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById6 = view6.findViewById(R.id.uuw);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLIZ = (TuxIconView) viewFindViewById6;
            }
            C786410Ut5.LLLLLLZZ((TuxIconView) viewFindViewById6, 0);
            if (C0BMS.LIZ()) {
                bS(1);
            } else {
                SR().setText(view.getContext().getText(2131830630));
                UR().setImageResource(R.drawable.bvl);
            }
        }
        RR().setText(getString(2131847816));
        C786410Ut5.U8(RR(), this);
        View viewFindViewById7 = this.LLIZ;
        if (viewFindViewById7 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById7 = view7.findViewById(R.id.uuw);
            } else {
                viewFindViewById7 = null;
            }
            this.LLIZ = (TuxIconView) viewFindViewById7;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById7, this);
        if (C0BMS.LIZ()) {
            ArrayList arrayList = new ArrayList();
            View view8 = this.LLJJIJI;
            if (view8 != null) {
                arrayList.add(view8.findViewById(R.id.unlogin_profile_avatar_placeholder));
                View view9 = this.LLJJIJI;
                if (view9 == null) {
                    view9 = null;
                }
                arrayList.add(view9.findViewById(R.id.unlogin_profile_user_id));
                View view10 = this.LLJJIJI;
                if (view10 == null) {
                    view10 = null;
                }
                arrayList.add(view10.findViewById(R.id.unlogin_profile_ll_relation));
            }
            arrayList.add(WR());
            arrayList.add(VR());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C786410Ut5.I7(new ACListenerS151S0100000_16(this, 134), (View) it2.next());
            }
            View viewFindViewById8 = this.LLJJ;
            if (viewFindViewById8 == null) {
                View view11 = getView();
                if (view11 != null) {
                    viewFindViewById8 = view11.findViewById(R.id.unlogin_scroll_marquee);
                } else {
                    viewFindViewById8 = null;
                }
                this.LLJJ = (ScrollView) viewFindViewById8;
            }
            viewFindViewById8.setOnTouchListener(new View.OnTouchListener() { // from class: X.0e69
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view12, MotionEvent motionEvent) {
                    return true;
                }
            });
            View view12 = this.LLJILJIL;
            if (view12 == null) {
                View view13 = getView();
                if (view13 != null) {
                    viewFindViewById = view13.findViewById(R.id.unlogin_btn_login_signup);
                }
                this.LLJILJIL = (C197039127h) viewFindViewById;
                view12 = viewFindViewById;
            }
            C786410Ut5.U8((C197039127h) view12, this);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments;
        C19EG activity = getActivity();
        if (activity != null && (arguments = getArguments()) != null) {
            String string = arguments.getString("tab");
            if (Intrinsics.LJFF("UNLOGIN_NOTIFICATION", string)) {
                C446900Hfk c446900Hfk = Hox.LLJILJIL;
                c446900Hfk.LIZ(activity).PQ2("NOTIFICATION", this);
                c446900Hfk.LIZ(activity).wQ2("NOTIFICATION", this);
            } else if (Intrinsics.LJFF("UNLOGIN_PROFILE", string)) {
                C446900Hfk c446900Hfk2 = Hox.LLJILJIL;
                c446900Hfk2.LIZ(activity).PQ2("USER", this);
                c446900Hfk2.LIZ(activity).wQ2("USER", this);
            }
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cdd, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
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
