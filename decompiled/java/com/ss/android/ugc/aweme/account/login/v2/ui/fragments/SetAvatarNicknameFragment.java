package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0I7D;
import X.C0WZX;
import X.C0XGR;
import X.C0XIR;
import X.C0XQ7;
import X.C1169960gYE;
import X.C11NJ;
import X.C11PQ;
import X.C11S5;
import X.C1237010iIN;
import X.C1239130iLn;
import X.C1266020j3A;
import X.C1389890mGx;
import X.C1494690ozz;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C21405318pn;
import X.C2204961BRm;
import X.C2252408s6;
import X.C452501pT;
import X.C516201zk;
import X.EnumC1238710iL7;
import X.EnumC638250P1r;
import X.EnumC852910Xd3;
import X.InterfaceC1261900iwW;
import X.InterfaceC742230T9p;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.KeyBoardListenerWindow;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SetAvatarNicknameFragment extends CommonSetAvatarFragment implements InterfaceC742230T9p, InterfaceC1261900iwW {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiP3HELIOS19PSxiLz0yLygpJzsgZhYpPQ4lKTEtOwE6Ky4iKCI2DjctLiI2JjE=";
    public EditText LLLLIILLL;
    public TuxTextView LLLLIL;
    public FrameLayout LLLLILI;
    public View LLLLJ;
    public final C01GW LLLLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 313));
    public final C11PQ<Object> LLLLL = new C11PQ<>();
    public final C11NJ LLLLLIL = new C11NJ();
    public int LLLLLILLIL = 48;
    public boolean LLLLLJIL = true;
    public boolean LLLLLJLJLL;
    public int LLLLLL;

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String ZR() {
        return "SetAvatarNicknameFragment";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0p;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void LLIIIZ() {
        View view = this.LLLLJ;
        if (view == null) {
            view = null;
        }
        view.scrollBy(0, -this.LLLLLL);
        this.LLLLLL = 0;
    }

    public final void VS() {
        C1169960gYE.LIZ.getClass();
        C1169960gYE.LJ.put(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putInt("next_page", EnumC852910Xd3.OPTIONAL_SIGNUP_PAGES.getValue());
            arguments.putInt("previous_page", EnumC852910Xd3.CREATE_AVATAR_AND_NICKNAME.getValue());
            fo(arguments);
        }
    }

    public final EditText XS() {
        EditText editText = this.LLLLIILLL;
        if (editText != null) {
            return editText;
        }
        return null;
    }

    public final void ZS() {
        C1169960gYE c1169960gYE = C1169960gYE.LIZ;
        EditText editTextXS = XS();
        c1169960gYE.getClass();
        boolean zLIZIZ = C1169960gYE.LIZIZ(editTextXS);
        if (zLIZIZ) {
            this.LLLLL.onNext("");
        }
        Context context = getContext();
        TuxTextView tuxTextView = this.LLLLIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C1169960gYE.LIZ(XS().length(), context, tuxTextView, zLIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LIZ = getString(2131829374);
        c1237010iIN.LIZIZ = getString(2131847626);
        c1237010iIN.LIZJ = EnumC638250P1r.PRIMARY;
        c1237010iIN.LJIIJ = true;
        c1237010iIN.LJIIJJI = "set_avatar_and_nickname";
        c1237010iIN.LJIILJJIL = true;
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Window window;
        this.LLLLLIL.LJ();
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(this.LLLLLILLIL);
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void ES() {
        super.ES();
        this.LLLLLJIL = false;
        C20684815ws.LJIILLIIL("set_nickname_skip", PS().LIZ);
        VS();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        if (C2204961BRm.LLJILLL(XS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAAvz31nMECa0XqdqF3XLX4wszi+tq++OOyA=", null)).length() > 0) {
            QS().setLoading(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        QS().setLoading(false);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return this.LLLLLJIL;
    }

    public static String YS(int i) {
        if (i == 2550) {
            return "sensitive_case";
        }
        if (C1697810uHb.LJIIJJI(2079, 3002265).contains(Integer.valueOf(i))) {
            return "rule_break";
        }
        return "server_error";
    }

    @Override // X.InterfaceC742230T9p
    public final void handleMsg(Message message) {
        String str;
        String string;
        UserResponse userResponse;
        LogPbBean logPbBean;
        String imprId;
        String str2;
        QS().setLoading(false);
        if (message != null) {
            if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
                Exception exc = (Exception) HandlerHook.getMessageObj(message.obj);
                int iLJ = -1;
                String str3 = "";
                if (exc instanceof C1494690ozz) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this);
                    c1389890mGx.LJIIIZ(2131829645);
                    c1389890mGx.LJIIJJI();
                    str = "";
                } else if (exc instanceof C0XIR) {
                    C0XIR c0xir = (C0XIR) exc;
                    if (c0xir.getRawResponse() != null) {
                        Object rawResponse = c0xir.getRawResponse();
                        if (!(rawResponse instanceof BaseResponse)) {
                            str = "";
                            string = getString(2131829645);
                            C1389890mGx c1389890mGx2 = new C1389890mGx(this);
                            c1389890mGx2.LJIIJ(string);
                            c1389890mGx2.LJIIJJI();
                        } else {
                            BaseResponse baseResponse = (BaseResponse) rawResponse;
                            iLJ = baseResponse.status_code;
                            String strYS = YS(iLJ);
                            string = baseResponse.status_msg;
                            BaseResponse.ServerTimeExtra serverTimeExtra = baseResponse.extra;
                            if (serverTimeExtra != null && (str2 = serverTimeExtra.logid) != null) {
                                str3 = str2;
                            } else if ((rawResponse instanceof UserResponse) && (userResponse = (UserResponse) rawResponse) != null && (logPbBean = userResponse.logPb) != null && (imprId = logPbBean.getImprId()) != null) {
                                str3 = imprId;
                            }
                            str = str3;
                            str3 = strYS;
                        }
                    } else {
                        iLJ = c0xir.getErrorCode();
                        String strYS2 = YS(iLJ);
                        int errorCode = c0xir.getErrorCode();
                        if (errorCode == 2550) {
                            string = getString(2131829646);
                        } else if (C1697810uHb.LJIIJJI(2079, 3002265).contains(Integer.valueOf(errorCode))) {
                            string = c0xir.getErrorMsg();
                        } else {
                            string = getString(2131829645);
                        }
                        str = "";
                        str3 = strYS2;
                    }
                    if (string == null || string.length() == 0) {
                        string = getString(2131829645);
                    }
                    C1389890mGx c1389890mGx22 = new C1389890mGx(this);
                    c1389890mGx22.LJIIJ(string);
                    c1389890mGx22.LJIIJJI();
                } else {
                    iLJ = C2252408s6.LJ(exc);
                    C1389890mGx c1389890mGx3 = new C1389890mGx(this);
                    c1389890mGx3.LJIIIZ(2131829645);
                    c1389890mGx3.LJIIJJI();
                    str = "";
                    str3 = "server_error";
                }
                C0XGR c0xgrPS = PS();
                c0xgrPS.LIZ(iLJ, "error_code");
                c0xgrPS.LIZLLL("error_type", str3);
                c0xgrPS.LIZLLL("error_log_id", str);
                C20684815ws.LJIILLIIL("set_nickname_error", c0xgrPS.LIZ);
                return;
            }
            if (HandlerHook.getMessageObj(message.obj) instanceof UserResponse) {
                UserResponse userResponse2 = (UserResponse) HandlerHook.getMessageObj(message.obj);
                VS();
                User user = userResponse2.getUser();
                C1169960gYE.LIZ.getClass();
                C1169960gYE.LJ.put(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), null);
                C20684815ws.LJIILLIIL("set_nickname_success", PS().LIZ);
                ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJJZ(user.getNickname());
                ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().setNickNameModifyTs((int) (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                Bundle arguments = getArguments();
                if (arguments != null) {
                    arguments.putInt("next_page", EnumC852910Xd3.OPTIONAL_SIGNUP_PAGES.getValue());
                    arguments.putInt("previous_page", EnumC852910Xd3.CREATE_AVATAR_AND_NICKNAME.getValue());
                    arguments.putBoolean("has_set_nickname", true);
                    fo(arguments);
                }
            }
        }
    }

    @Override // X.InterfaceC1261900iwW
    public final void kp(int i) {
        C1169960gYE c1169960gYE = C1169960gYE.LIZ;
        C197039127h c197039127hQS = QS();
        c1169960gYE.getClass();
        try {
            C01GW c01gw = C1169960gYE.LIZJ;
            ((Rect) c01gw.getValue()).setEmpty();
            c197039127hQS.getGlobalVisibleRect((Rect) c01gw.getValue());
            int i2 = ((Rect) c01gw.getValue()).bottom - (i - C1169960gYE.LIZIZ);
            if (i2 > 0) {
                this.LLLLLL += i2;
                View view = this.LLLLJ;
                if (view == null) {
                    view = null;
                }
                view.scrollBy(0, i2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C0I7D c0i7d;
        super.onViewCreated(view, bundle);
        this.LLLLJ = view.findViewById(R.id.tqy);
        this.LLLLIL = (TuxTextView) view.findViewById(R.id.p9f);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.uui);
        Context context = getContext();
        Drawable drawable = null;
        if (context != null) {
            drawable = context.getDrawable(R.drawable.ad1);
        }
        frameLayout.setBackground(drawable);
        this.LLLLILI = frameLayout;
        EditText editText = ((C21405318pn) view.findViewById(R.id.kq_)).getEditText();
        if ((editText instanceof C0I7D) && (c0i7d = (C0I7D) editText) != null) {
            c0i7d.setTuxFont(41);
        }
        this.LLLLIILLL = editText;
        EditText editTextXS = XS();
        editTextXS.setNextFocusDownId(getId());
        editTextXS.setHint(getString(2131848240));
        editTextXS.addTextChangedListener(new C1266020j3A(this, 17));
        ZS();
        this.LLLLLIL.LIZ(this.LLLLL.LJLIL(3000L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516201zk(view, 144), new C09JN() { // from class: X.00NQ
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SetAvatarNicknameFragment@4954.initEditText$3");
                C1C7U.LIZIZ("SetAvatarNicknameFragment@4954.initEditText$3");
            }
        }));
        QS().setEnabled(false);
        GS(new ACListenerS154S0100000_19(this, 72), QS());
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
            C1239130iLn.LIZ.getClass();
            if (C1239130iLn.LIZIZ) {
                ComplianceServiceProvider.LJIJ().LIZIZ(EnumC1238710iL7.GRANTED);
            }
        }
        C0XGR c0xgrPS = PS();
        c0xgrPS.LIZ(0, "is_binding_enabled");
        C20684815ws.LJIILLIIL("set_nickname_show", c0xgrPS.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            this.LLLLLILLIL = window.getAttributes().softInputMode;
            window.setSoftInputMode(48);
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            new KeyBoardListenerWindow(this, activity2, this);
        }
        C19GS c19gs = null;
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity3 = getActivity();
                if (activity3 instanceof C19GS) {
                    c19gs = (C19GS) activity3;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }
}
