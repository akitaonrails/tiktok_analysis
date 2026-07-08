package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC848400XPy;
import X.AnonymousClass0988;
import X.C01GW;
import X.C09JN;
import X.C0WZX;
import X.C0XGR;
import X.C0XIR;
import X.C0XQ7;
import X.C0XZ4;
import X.C1169960gYE;
import X.C11NJ;
import X.C11NU;
import X.C11OP;
import X.C11PQ;
import X.C1232150iAX;
import X.C1236870iI9;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1237690iJT;
import X.C1239110iLl;
import X.C1239380iMC;
import X.C1389890mGx;
import X.C1494690ozz;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C19487811Me;
import X.C197039127h;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2204961BRm;
import X.C2252408s6;
import X.C452501pT;
import X.C616540OGe;
import X.C844470XAv;
import X.C852150Xbp;
import X.C853750XeP;
import X.EnumC852910Xd3;
import X.InterfaceC1487280oo2;
import X.InterfaceC742230T9p;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.push.WeakHandler;
import com.ss.android.ugc.aweme.account.login.v2.network.CommitUserNameData;
import com.ss.android.ugc.aweme.account.login.v2.network.CommitUserNameResponse;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class SetNicknameFragment extends BaseI18nLoginFragment implements InterfaceC742230T9p {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0ISHELIOStiP319PSxiLz0yLygpJzsgZhYpPQE6Ky4iKCI2DjctLiI2JjE=";
    public C1237690iJT LLLIILIL;
    public ConstraintLayout LLLIL;
    public TuxTextView LLLILZ;
    public EditText LLLILZLLLI;
    public boolean LLLL;
    public long LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIL;
    public boolean LLLLILI;
    public C197039127h LLLLJ;
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new C1239110iLl(this));
    public boolean LLLIZZ = true;
    public final C11PQ<Object> LLLJ = new C11PQ<>();
    public final C11NJ LLLJIL = new C11NJ();
    public final WeakHandler LLLJL = new WeakHandler(this);
    public String LLLLII = "";
    public long LLLLIIIILLL = SystemClock.elapsedRealtime();
    public final String LLLLIILLL = "";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void ES() {
        this.LLLIZZ = false;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", getEnterFrom());
        c0xgr.LIZLLL("enter_method", getEnterMethod());
        c0xgr.LIZLLL("platform", this.LLLLII);
        c0xgr.LIZLLL("login_panel_type", "signup");
        c0xgr.LIZ(this.LLLLIILL ? 1 : 0, "has_pre_fill");
        c0xgr.LIZ(this.LLLLILI ? 1 : 0, "has_keyboard_suggest");
        C20684815ws.LJIILLIIL("set_nickname_skip", c0xgr.LIZ);
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(2131829644);
        c1389890mGx.LJIIJJI();
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putInt("next_page", EnumC852910Xd3.OPTIONAL_SIGNUP_PAGES.getValue());
            arguments.putInt("previous_page", EnumC852910Xd3.CREATE_NICKNAME.getValue());
            fo(arguments);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String ZR() {
        return "NicknameFragment";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0q;
    }

    public final EditText NS() {
        EditText editText = this.LLLILZLLLI;
        if (editText != null) {
            return editText;
        }
        return null;
    }

    public final void PS() {
        if (Build.VERSION.SDK_INT >= 26) {
            NS().setInputType(65537);
            NS().setAutofillHints(new String[]{"name"});
            NS().setImportantForAutofill(1);
            AutofillManager autofillManager = (AutofillManager) this.LLLILZJ.getValue();
            if (autofillManager != null) {
                autofillManager.notifyViewEntered(NS());
            }
        }
    }

    public final void QS() {
        C1169960gYE c1169960gYE = C1169960gYE.LIZ;
        EditText editTextNS = NS();
        c1169960gYE.getClass();
        boolean zLIZIZ = C1169960gYE.LIZIZ(editTextNS);
        if (zLIZIZ) {
            this.LLLJ.onNext("");
        }
        Context context = getContext();
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gnk) : null;
            this.LLLILZ = (TuxTextView) viewFindViewById;
        }
        C1169960gYE.LIZ(NS().length(), context, (TuxTextView) viewFindViewById, zLIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return C852150Xbp.LIZ(EnumC852910Xd3.CREATE_NICKNAME);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIIIZZ = getString(2131848241);
        c1237010iIN.LJIIIZ = getString(2131848239);
        c1237010iIN.LIZIZ = getString(2131847626);
        c1237010iIN.LJFF = true;
        c1237010iIN.LJIIJ = true;
        c1237010iIN.LJIIJJI = "set_nickname";
        c1237010iIN.LJIILJJIL = true;
        c1237010iIN.LJIJ = new C1237030iIP(null, C1236870iI9.LIZ(true), C1236870iI9.LIZIZ(true), null, 9);
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        AutofillManager autofillManager;
        this.LLLJIL.LJ();
        super.onDestroy();
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = (AutofillManager) this.LLLILZJ.getValue()) == null) {
            return;
        }
        autofillManager.cancel();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.LLLLIIL += SystemClock.elapsedRealtime() - this.LLLLIIIILLL;
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final List<View> qS() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p9a) : null;
            this.LLLIL = (ConstraintLayout) viewFindViewById;
        }
        return Collections.singletonList(viewFindViewById);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        C197039127h c197039127hNS;
        if (C2204961BRm.LLJILLL(NS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAAvz31bTEjm7TbY2VSROuwjZ8+o=", null)).length() <= 0 || (c197039127hNS = nS()) == null) {
            return;
        }
        c197039127hNS.setLoading(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        C197039127h c197039127hNS;
        if (C2204961BRm.LLJILLL(NS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAAvz31bTEjm7TbY2VSROuwjZ8+o=", null)).length() <= 0 || (c197039127hNS = nS()) == null) {
            return;
        }
        c197039127hNS.setLoading(false);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SetNicknameFragment.class.getName());
        }
        super.onResume();
        C01GW<Boolean> c01gw = AccountKeyBoardHelper.LLJ;
        if (C853750XeP.LIZ()) {
            C1232150iAX.LIZ(NS());
        } else {
            NS().requestFocus();
        }
        this.LLLLIIIILLL = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return this.LLLIZZ;
    }

    @Override // X.InterfaceC742230T9p
    public final void handleMsg(Message message) {
        String string;
        if (message != null) {
            if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
                aS();
                Exception exc = (Exception) HandlerHook.getMessageObj(message.obj);
                int iLJ = -1;
                String str = "";
                if (exc instanceof C1494690ozz) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this);
                    c1389890mGx.LJIIIZ(2131829645);
                    c1389890mGx.LJIIJJI();
                } else {
                    String str2 = "server_error";
                    if (exc instanceof C0XIR) {
                        C0XIR c0xir = (C0XIR) exc;
                        if (C1697810uHb.LJIIJJI(3002390, 3002395).contains(Integer.valueOf(c0xir.getErrorCode()))) {
                            C197039127h c197039127h = this.LLLLJ;
                            if (c197039127h != null) {
                                c197039127h.setEnabled(false);
                            }
                            iLJ = c0xir.getErrorCode();
                            string = getString(2131838132);
                            str = "empty_nickname_rule";
                        } else if (c0xir.getRawResponse() != null) {
                            Object rawResponse = c0xir.getRawResponse();
                            if (rawResponse instanceof BaseResponse) {
                                string = ((BaseResponse) rawResponse).status_msg;
                            }
                            string = getString(2131829645);
                            C1389890mGx c1389890mGx2 = new C1389890mGx(this);
                            c1389890mGx2.LJIIJ(string);
                            c1389890mGx2.LJIIJJI();
                        } else {
                            int errorCode = c0xir.getErrorCode();
                            if (errorCode == 2550) {
                                string = getString(2131829646);
                                str2 = "sensitive_case";
                            } else if (C1697810uHb.LJIIJJI(2079, 3002265).contains(Integer.valueOf(errorCode))) {
                                string = c0xir.getErrorMsg();
                                str2 = "rule_break";
                            } else {
                                string = getString(2131829645);
                            }
                            iLJ = c0xir.getErrorCode();
                            str = str2;
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
                        str = "server_error";
                    }
                }
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("enter_from", getEnterFrom());
                c0xgr.LIZLLL("enter_method", getEnterMethod());
                c0xgr.LIZLLL("platform", this.LLLLII);
                c0xgr.LIZLLL("login_panel_type", "signup");
                c0xgr.LIZ(iLJ, "error_code");
                c0xgr.LIZLLL("error_type", str);
                C20684815ws.LJIILLIIL("set_nickname_error", c0xgr.LIZ);
                return;
            }
            if (HandlerHook.getMessageObj(message.obj) instanceof UserResponse) {
                C0XGR c0xgr2 = new C0XGR();
                c0xgr2.LIZLLL("enter_from", getEnterFrom());
                c0xgr2.LIZLLL("enter_method", getEnterMethod());
                c0xgr2.LIZLLL("platform", this.LLLLII);
                c0xgr2.LIZLLL("login_panel_type", "signup");
                c0xgr2.LIZIZ((SystemClock.elapsedRealtime() - this.LLLLIIIILLL) + this.LLLLIIL, "duration");
                C20684815ws.LJIILLIIL("set_nickname_success", c0xgr2.LIZ);
                User user = ((UserResponse) HandlerHook.getMessageObj(message.obj)).getUser();
                ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJJZ(user.getNickname());
                ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().setNickNameModifyTs((int) (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                Bundle arguments = getArguments();
                if (arguments != null) {
                    arguments.putInt("next_page", EnumC852910Xd3.OPTIONAL_SIGNUP_PAGES.getValue());
                    arguments.putInt("previous_page", EnumC852910Xd3.CREATE_NICKNAME.getValue());
                    arguments.putBoolean("has_set_nickname", true);
                    fo(arguments);
                }
                C0XZ4 c0xz4 = C0XZ4.LIZ;
                C844470XAv.LIZ.getClass();
                int i = C844470XAv.LJIIJ;
                String nickname = user.getNickname();
                c0xz4.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("aid", String.valueOf(i));
                linkedHashMap.put("login_name", nickname);
                linkedHashMap.put("is_from_nickname", String.valueOf(true));
                NetworkProxyAccount.LIZ.getClass();
                C11OP c11opLJIIJ = NetworkProxyAccount.LJ("/passport/login_name/register/", linkedHashMap).LJ(new InterfaceC1487280oo2() { // from class: X.0iLm
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        final String str3 = (String) obj;
                        return new C11LE() { // from class: X.0iLu
                            @Override // X.C11LE
                            public final void subscribe(C11M9<? super CommitUserNameResponse> c11m9) {
                                int iIntValue;
                                String str4;
                                Integer num;
                                CommitUserNameResponse commitUserNameResponse = (CommitUserNameResponse) GsonProtectorUtils.fromJson(NetworkProxyAccount.LIZ.LJII(), str3, CommitUserNameResponse.class);
                                if (TextUtils.equals(commitUserNameResponse.message, "success")) {
                                    c11m9.onNext(commitUserNameResponse);
                                } else {
                                    CommitUserNameData commitUserNameData = commitUserNameResponse.data;
                                    if (commitUserNameData != null && (num = commitUserNameData.error_code) != null) {
                                        iIntValue = num.intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                    CommitUserNameData commitUserNameData2 = commitUserNameResponse.data;
                                    if (commitUserNameData2 != null) {
                                        str4 = commitUserNameData2.description;
                                    } else {
                                        str4 = null;
                                    }
                                    c11m9.onError(new C0XZJ(iIntValue, str4, EnumC852660Xce.SIGN_UP, EnumC852910Xd3.NONE, null, ""));
                                }
                                c11m9.onComplete();
                            }
                        };
                    }
                }).LJIIJ(C1701940uOG.LIZIZ());
                C09JN c09jn = new C09JN() { // from class: X.00NO
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("NetworkHelper@8b8f.commitUserName$2");
                        C1C7U.LIZIZ("NetworkHelper@8b8f.commitUserName$2");
                    }
                };
                AnonymousClass0988 anonymousClass0988 = C19487811Me.LIZLLL;
                C1239380iMC c1239380iMC = C19487811Me.LIZJ;
                c11opLJIIJ.LIZIZ(anonymousClass0988, c09jn, c1239380iMC).LIZIZ(new C09JN() { // from class: X.0iLt
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        CommitUserNameData commitUserNameData;
                        String str3;
                        C1C7U.LIZ("NetworkHelper@8b8f.commitUserName$3");
                        CommitUserNameResponse commitUserNameResponse = (CommitUserNameResponse) obj;
                        if (commitUserNameResponse != null && (commitUserNameData = commitUserNameResponse.data) != null && (str3 = commitUserNameData.login_name) != null) {
                            C0XQ7.LJFF().getCurUser().setUniqueId(str3);
                            C0XUE.LIZ.LJIILIIL(C0XQ5.LIZLLL(), str3);
                        }
                        C1C7U.LIZIZ("NetworkHelper@8b8f.commitUserName$3");
                    }
                }, anonymousClass0988, c1239380iMC).LJIILJJIL(anonymousClass0988, C19487811Me.LJFF, c1239380iMC, C11NU.INSTANCE);
            }
        }
        aS();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("platform_profile", "")) != null) {
            str = string;
        }
        this.LLLLII = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetNicknameFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.p9e);
            } else {
                viewFindViewById = null;
            }
            this.LLLIILIL = (C1237690iJT) viewFindViewById;
        }
        ((C1237690iJT) viewFindViewById).LIZIZ(str);
    }
}
