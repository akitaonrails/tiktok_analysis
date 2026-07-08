package com.ss.android.ugc.aweme.authorize;

import X.ActivityC2196911AyX;
import X.C08A4;
import X.C098200Yq;
import X.C0CLW;
import X.C0FNV;
import X.C0JEF;
import X.C0N0A;
import X.C0OM1;
import X.C0WI6;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1233040iBy;
import X.C1236610iHj;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1326305Gz;
import X.C1391280mJC;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LP;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C1701330uNH;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C19H6;
import X.C19H7;
import X.C1B35;
import X.C1B3C;
import X.C1B3J;
import X.C1B3O;
import X.C1B3Q;
import X.C1B3S;
import X.C1B3V;
import X.C1B3X;
import X.C1B3Y;
import X.C1B3Z;
import X.C20684815ws;
import X.C2132508Xb;
import X.C21521219Kg;
import X.C2193691AtL;
import X.C2193701AtM;
import X.C2197221Az2;
import X.C2197371AzH;
import X.C2198601B3a;
import X.C2198701B3k;
import X.C2344009Gk;
import X.C2429209fW;
import X.C2487409ou;
import X.C703302op;
import X.C778860Ugu;
import X.C786410Ut5;
import X.C985403tE;
import X.DialogC1389620mGW;
import X.EnumC19415410xc;
import X.EnumC21632119lH;
import X.EnumC2193681AtK;
import X.InterfaceC586170Myt;
import Y.AComparatorS28S0000000_9;
import Y.AObserverS234S0100000_32;
import Y.AObserverS236S0100000_34;
import Y.ARunnableS103S0200000_34;
import Y.ARunnableS132S0100000_32;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedCheckResult;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage;
import com.ss.android.ugc.aweme.openauthorize.entity.CheckResultInfo;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthClientInfo;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPageDetail;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScopeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes35.dex */
public final class BaseI18nAuthorizedFragment extends Fragment implements C0JEF, InterfaceC586170Myt {
    public static Fragment LLJLLL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQ5PSc8OiHELIOSw2LGERKTYpAH5rJgQ5PSc8Oiw2LCsVOiQrJCo9PA==";
    public C1391280mJC LL;
    public AwemeAuthorizePlatformDepend LLILLJJLI;
    public C19H7 LLILLL;
    public AuthCommonViewModel LLILZ;
    public C1B3S LLILZIL;
    public C1B3J LLILZLL;
    public DialogC1389620mGW LLIZ;
    public int LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public Boolean LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public String LLJJJJLIIL;
    public AwS588S0100000_9 LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public String LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public String LLJJIII = "";
    public Boolean LLJJJIL = Boolean.FALSE;

    public final C1391280mJC NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bbq) : null;
            this.LL = (C1391280mJC) viewFindViewById;
        }
        return (C1391280mJC) viewFindViewById;
    }

    public final C2344009Gk OR() {
        C1B3Q c1b3q = C1B3Q.LIZ;
        String str = this.LLJJ;
        String strUR = UR();
        boolean z = this.LLJJI;
        String str2 = this.LLJ;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = this.LLJI;
        String str4 = str3 != null ? str3 : null;
        String str5 = this.LLJLILLLLZIIL;
        String str6 = this.LLJLIL;
        String str7 = this.LLJJ;
        c1b3q.getClass();
        return C1B3Q.LIZ(str, strUR, str2, str4, str5, str6, str7, z);
    }

    public final String SR() {
        return this.LLJJLIIIJLLLLLLLZ ? getString(2131826791) : EnumC2193681AtK.ACCESS_DENIED.getValue();
    }

    public final String UR() {
        C1B3S c1b3s = this.LLILZIL;
        if (c1b3s == null) {
            c1b3s = null;
        }
        return c1b3s.LIZJ;
    }

    public final void rS() {
        DialogC1389620mGW dialogC1389620mGW = this.LLIZ;
        if (dialogC1389620mGW == null) {
            dialogC1389620mGW = null;
        }
        C0FNV.LIZJ(dialogC1389620mGW);
        C2487409ou.LIZLLL(5L, new ARunnableS132S0100000_32(this, 25));
    }

    public final void wS() {
        if (this.LLJL) {
            if (LLJLLL instanceof I18nAuthorizedScopesListFragment) {
                C1391280mJC c1391280mJCNR = NR();
                if (c1391280mJCNR != null) {
                    C0OM1 c0om1 = new C0OM1();
                    C1251150ifB c1251150ifB = new C1251150ifB();
                    c1251150ifB.LIZLLL();
                    c1251150ifB.LIZJ = R.raw.icon_chevron_left_small_fill_ltr;
                    c1251150ifB.LIZJ(new AwS578S0100000_34(this, 29));
                    c0om1.LJ(c1251150ifB);
                    C1250250idj c1250250idj = new C1250250idj();
                    c1250250idj.LIZJ = getString(2131826807);
                    c0om1.LIZJ = c1250250idj;
                    c0om1.LIZLLL = true;
                    c1391280mJCNR.setNavActions(c0om1);
                    return;
                }
                return;
            }
            C1391280mJC c1391280mJCNR2 = NR();
            if (c1391280mJCNR2 != null) {
                C0OM1 c0om12 = new C0OM1();
                C1250250idj c1250250idj2 = new C1250250idj();
                c1250250idj2.LIZJ = "";
                c0om12.LIZJ = c1250250idj2;
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB2.LIZJ(new AwS578S0100000_34(this, 30));
                c0om12.LIZIZ(c1251150ifB2);
                c0om12.LIZLLL = false;
                c1391280mJCNR2.setNavActions(c0om12);
            }
        }
    }

    public final void yS() {
        Fragment fragment = LLJLLL;
        if (fragment == null || !((fragment instanceof I18nAuthorizedScopesListFragment) || (fragment instanceof AwemeAuthLearnMoreFullSizeFragment))) {
            ZR(C1B3Y.LIZIZ(-2, EnumC2193681AtK.ACCESS_DENIED, SR()));
            return;
        }
        AuthCommonViewModel authCommonViewModel = this.LLILZ;
        if (authCommonViewModel == null) {
            authCommonViewModel = null;
        }
        authCommonViewModel.LLJJ.observe(this, new AObserverS236S0100000_34(this, 7));
    }

    public final String PR() {
        String str;
        Context contextRequireContext = requireContext();
        C1B3S c1b3s = this.LLILZIL;
        if (c1b3s == null) {
            c1b3s = null;
        }
        String callingPackage = c1b3s.callerPackage;
        if (callingPackage == null) {
            callingPackage = requireActivity().getCallingPackage();
        }
        List<String> listLIZ = C2132508Xb.LIZ(contextRequireContext, callingPackage);
        return (listLIZ == null || (str = (String) C13LP.LJJJLL(listLIZ)) == null) ? "" : str;
    }

    public final String RR() {
        return C0WI6.LIZ(requireContext().getPackageManager(), requireActivity().getCallingPackage());
    }

    public final String VR() {
        Bundle arguments = getArguments();
        return Intrinsics.LJFF(arguments != null ? arguments.getString("_bytedance_params_source") : null, "jsb") ? "" : "android";
    }

    public final C1B35 WR() {
        String string;
        Bundle arguments = getArguments();
        C1B35 c1b35 = null;
        if (Intrinsics.LJFF(arguments != null ? arguments.getString("_bytedance_params_source") : null, "jsb")) {
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string = arguments2.getString("_bytedance_params_source")) == null) {
                string = "";
            }
            c1b35 = new C1B35(string);
        }
        return c1b35;
    }

    public final boolean kS() {
        return ((!isAdded() || isDetached() || getActivity() == null) ? null : getActivity()) instanceof ActivityC2196911AyX;
    }

    public final void nS() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("toggledOnScopes", "") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("toggledOffScopes", "") : null;
        HashMap map = new HashMap();
        map.putAll(OR().LIZ);
        if (string == null) {
            string = "";
        }
        map.put("toggled_scope", string);
        map.put("untoggled_scope", string2 != null ? string2 : "");
        map.put("close", 1);
        C1326305Gz.LIZ.getClass();
        C1326305Gz.LIZ("auth_page_button_click", map, null);
        String strUR = UR();
        Bundle arguments3 = getArguments();
        C1236610iHj.LIZIZ(strUR, "auth_page_close_btn_click", "30003", C1236610iHj.LIZ(UR(), Intrinsics.LJFF(arguments3 != null ? arguments3.getString("_bytedance_params_source") : null, "jsb"), kS()), EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DialogC1389620mGW dialogC1389620mGW = this.LLIZ;
        if (dialogC1389620mGW == null) {
            dialogC1389620mGW = null;
        }
        if (dialogC1389620mGW.isShowing()) {
            DialogC1389620mGW dialogC1389620mGW2 = this.LLIZ;
            C786410Ut5.LJIIJ(dialogC1389620mGW2 != null ? dialogC1389620mGW2 : null);
        }
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    public final void ZR(C1B3O c1b3o) {
        String strUR = UR();
        String str = this.LLJ;
        if (str == null) {
            str = null;
        }
        String str2 = this.LLJI;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = this.LLJIJIL;
        if (str3 == null) {
            str3 = null;
        }
        String str4 = this.LLJILJIL;
        if (str4 == null) {
            str4 = null;
        }
        C0N0A.LIZ("", 2, 0, strUR, str, str2, str3, str4);
        C2344009Gk c2344009GkOR = OR();
        c2344009GkOR.LJIIIIZZ("result", "fail");
        C20684815ws.LJIILLIIL("platform_auth_code", c2344009GkOR.LIZ);
        mS(c1b3o.errorCode, c1b3o.errorMsg, false);
        sS(c1b3o, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.09Gk] */
    public final void cS(C1B3O c1b3o) {
        ?? BooleanValue;
        String str;
        Boolean isNewUser;
        String strUR = UR();
        String str2 = this.LLJ;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = this.LLJI;
        if (str3 == null) {
            str3 = null;
        }
        String str4 = this.LLJIJIL;
        if (str4 == null) {
            str4 = null;
        }
        String str5 = this.LLJILJIL;
        if (str5 == null) {
            str5 = null;
        }
        C0N0A.LIZ("", 0, 0, strUR, str2, str3, str4, str5);
        ?? OR = OR();
        OR.LJ(Boolean.TRUE, "is_login");
        C1B3S c1b3s = this.LLILZIL;
        if (c1b3s == null) {
            c1b3s = null;
        }
        OR.LJIIIIZZ("auth_scope", c1b3s.LJII);
        OR.LJIIIIZZ("disabled_scope", null);
        OR.LIZJ(0, "is_mobile_show");
        OR.LIZJ(0, "is_mobile");
        OR.LJIIIIZZ("platform", "native_click");
        try {
            isNewUser = C0CLW.LIZIZ.LIZ.getAwemeActivitySetting().getIsNewUser();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (isNewUser != null) {
            BooleanValue = isNewUser.booleanValue();
        } else {
            BooleanValue = 0;
        }
        OR.LIZJ(BooleanValue, "is_register");
        C1B3S c1b3s2 = this.LLILZIL;
        if (c1b3s2 == null) {
            c1b3s2 = null;
        }
        if (a0.LJJIIZI(c1b3s2.LJII, "user.info.open_id", false)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        OR.LJIIIIZZ("is_silent_auth", str);
        C20684815ws.LJIILLIIL("auth_success", OR.LIZ);
        C20684815ws.LJIILLIIL("platform_auth_result", OR().LIZ);
        mS(0, null, true);
        sS(c1b3o, null);
    }

    public final boolean dS(AuthorizedPage authorizedPage) {
        boolean z = authorizedPage.showSwitchAccount;
        AuthorizedCheckResult authorizedCheckResult = authorizedPage.checkResult;
        if (authorizedCheckResult == null || getActivity() == null) {
            return false;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(getActivity());
        c1397580mTM.LJI(getString(2131836831));
        c1397580mTM.LIZIZ(authorizedCheckResult.resultMsg);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new C1B3V(this, z, authorizedPage, z ? 1 : 0, authorizedCheckResult));
        new C1397510mTF(c1397580mTM).LIZLLL();
        C2344009Gk c2344009GkOR = OR();
        c2344009GkOR.LIZJ(z ? 1 : 0, "has_switch_account_button");
        c2344009GkOR.LJ(C778860Ugu.LIZ, "error_code");
        C20684815ws.LJIILLIIL("show_auth_error_toast", c2344009GkOR.LIZ);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gS(com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage r11) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment.gS(com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage):void");
    }

    public final void hS(AuthorizedPage authorizedPage) {
        boolean zBooleanValue;
        boolean z;
        Fragment fragment;
        Bundle arguments = getArguments();
        DialogC1389620mGW dialogC1389620mGW = null;
        String string = null;
        if (arguments == null) {
            aS(this, C1B3Y.LIZIZ(-1, EnumC2193681AtK.INVALID_REQUEST, null));
            String strUR = UR();
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                string = arguments2.getString("_bytedance_params_source");
            }
            C1236610iHj.LIZIZ(strUR, "auth_page_params_error", "30001", C1236610iHj.LIZ(UR(), Intrinsics.LJFF(string, "jsb"), kS()), EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
            return;
        }
        C786410Ut5.LJJIZ(arguments, "auth_page_info", authorizedPage);
        DialogC1389620mGW dialogC1389620mGW2 = this.LLIZ;
        if (dialogC1389620mGW2 != null) {
            dialogC1389620mGW = dialogC1389620mGW2;
        }
        C786410Ut5.LJIIJ(dialogC1389620mGW);
        Boolean boolIsLite = authorizedPage.isLite();
        if (boolIsLite != null) {
            zBooleanValue = boolIsLite.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            I18nLiteAuthorizeFragment i18nLiteAuthorizeFragment = new I18nLiteAuthorizeFragment();
            i18nLiteAuthorizeFragment.setArguments(arguments);
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.drh, i18nLiteAuthorizeFragment);
            c19ehLJIIJ.LJIIJ();
            fragment = i18nLiteAuthorizeFragment;
        } else {
            C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
            Fragment fragment2 = LLJLLL;
            if (fragment2 != null) {
                boolean z2 = fragment2 instanceof I18nAuthorizeFragment;
                if (Intrinsics.LJFF(fragment2.getFragmentManager(), getChildFragmentManager())) {
                    c19ehLJIIJ2.LJIIZILJ(fragment2);
                }
            }
            if (this.LLJJIJI != null) {
                z = true;
            } else {
                z = false;
            }
            I18nAuthorizeFragment i18nAuthorizeFragmentLIZ = C1B3Z.LIZ(arguments, z, false);
            i18nAuthorizeFragmentLIZ.LLLLLZL = this.LLJL;
            c19ehLJIIJ2.LIZIZ(R.id.drh, i18nAuthorizeFragmentLIZ);
            c19ehLJIIJ2.LJIIIZ();
            fragment = i18nAuthorizeFragmentLIZ;
        }
        LLJLLL = fragment;
    }

    public final void iS(OAuthPage oAuthPage) {
        boolean zBooleanValue;
        boolean z;
        C1391280mJC c1391280mJCNR;
        Fragment fragment;
        OAuthClientInfo clientInfo;
        Boolean boolIsLite;
        Bundle arguments = getArguments();
        DialogC1389620mGW dialogC1389620mGW = null;
        if (arguments == null) {
            aS(this, C1B3Y.LIZIZ(-1, EnumC2193681AtK.INVALID_REQUEST, null));
            return;
        }
        OAuthPageDetail oAuthPageDetail = oAuthPage.pageDetail;
        if (oAuthPageDetail != null && (clientInfo = oAuthPageDetail.getClientInfo()) != null && (boolIsLite = clientInfo.isLite()) != null) {
            zBooleanValue = boolIsLite.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C786410Ut5.LJJIZ(arguments, "auth_page_info", oAuthPage);
        DialogC1389620mGW dialogC1389620mGW2 = this.LLIZ;
        if (dialogC1389620mGW2 != null) {
            dialogC1389620mGW = dialogC1389620mGW2;
        }
        C786410Ut5.LJIIJ(dialogC1389620mGW);
        if (zBooleanValue) {
            I18nLiteAuthorizeFragment i18nLiteAuthorizeFragment = new I18nLiteAuthorizeFragment();
            i18nLiteAuthorizeFragment.setArguments(arguments);
            try {
                C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZIZ(R.id.drh, i18nLiteAuthorizeFragment);
                c19ehLJIIJ.LJIIJ();
                fragment = i18nLiteAuthorizeFragment;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1233040iBy c1233040iBy = new C1233040iBy(getActivity());
                c1233040iBy.LIZJ("Unknown error");
                c1233040iBy.LIZLLL();
                fragment = i18nLiteAuthorizeFragment;
            }
        } else {
            C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
            Fragment fragment2 = LLJLLL;
            if (fragment2 != null) {
                boolean z2 = fragment2 instanceof I18nAuthorizeFragment;
                if (Intrinsics.LJFF(fragment2.getFragmentManager(), getChildFragmentManager())) {
                    c19ehLJIIJ2.LJIIZILJ(fragment2);
                }
            }
            if (C2197221Az2.LIZ(UR()) && (c1391280mJCNR = NR()) != null) {
                int visibility = c1391280mJCNR.getVisibility();
                c1391280mJCNR.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c1391280mJCNR);
            }
            if (this.LLJJIJI != null) {
                z = true;
            } else {
                z = false;
            }
            I18nAuthorizeFragment i18nAuthorizeFragmentLIZ = C1B3Z.LIZ(arguments, z, false);
            i18nAuthorizeFragmentLIZ.LLLLLZL = this.LLJL;
            c19ehLJIIJ2.LIZIZ(R.id.drh, i18nAuthorizeFragmentLIZ);
            c19ehLJIIJ2.LJIIIZ();
            fragment = i18nAuthorizeFragmentLIZ;
        }
        LLJLLL = fragment;
    }

    public final void oS(boolean z) {
        String strRR;
        String strPR;
        Boolean bool;
        Boolean bool2;
        C1B3S c1b3s;
        C1B3S c1b3s2;
        C1B3S c1b3s3;
        C1B3S c1b3s4 = null;
        AuthCommonViewModel authCommonViewModel = null;
        C1B3S c1b3s5 = null;
        if (this.LLJJI && this.LLJJIJI == null && this.LLJJIJIIJIL == null) {
            String str = this.LLJJIII;
            Integer numValueOf = Integer.valueOf(this.LLIZLLLIL);
            C1B3S c1b3s6 = this.LLILZIL;
            if (c1b3s6 == null) {
                c1b3s = null;
            } else {
                c1b3s = c1b3s6;
            }
            String str2 = c1b3s.LIZJ;
            if (c1b3s6 == null) {
                c1b3s2 = null;
            } else {
                c1b3s2 = c1b3s6;
            }
            String str3 = c1b3s2.LIZLLL;
            if (c1b3s6 == null) {
                c1b3s3 = null;
            } else {
                c1b3s3 = c1b3s6;
            }
            String str4 = c1b3s3.LJII;
            if (c1b3s6 == null) {
                c1b3s6 = null;
            }
            C1B3C c1b3c = new C1B3C(numValueOf, str, str2, str3, str4, c1b3s6.LJ);
            AuthCommonViewModel authCommonViewModel2 = this.LLILZ;
            if (authCommonViewModel2 != null) {
                authCommonViewModel = authCommonViewModel2;
            }
            authCommonViewModel.yQ2(c1b3c);
            return;
        }
        String str5 = "";
        if (z && this.LLJJIJI == null) {
            rS();
            AuthCommonViewModel authCommonViewModel3 = this.LLILZ;
            if (authCommonViewModel3 == null) {
                authCommonViewModel3 = null;
            }
            String strUR = UR();
            if (strUR == null) {
                strUR = "";
            }
            C1B3S c1b3s7 = this.LLILZIL;
            if (c1b3s7 == null) {
                c1b3s7 = null;
            }
            String strLIZ = C21521219Kg.LIZ(c1b3s7);
            String str6 = this.LLJJJ;
            String str7 = this.LLJJIJI;
            String strRR2 = RR();
            String strPR2 = PR();
            if (this.LLJJI) {
                bool2 = Boolean.TRUE;
            } else {
                bool2 = this.LLJJJIL;
            }
            C1B3S c1b3s8 = this.LLILZIL;
            if (c1b3s8 == null) {
                c1b3s8 = null;
            }
            String str8 = c1b3s8.callerPackage;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = this.LLJJJJ;
            if (str9 != null) {
                str5 = str9;
            }
            String strVR = VR();
            String str10 = this.LLJJJJLIIL;
            C1B35 c1b35WR = WR();
            C1B3S c1b3s9 = this.LLILZIL;
            if (c1b3s9 != null) {
                c1b3s5 = c1b3s9;
            }
            authCommonViewModel3.xQ2(strUR, strLIZ, str6, str7, strRR2, strPR2, bool2, str8, str5, strVR, str10, c1b35WR, c1b3s5.LIZ, kS());
            return;
        }
        rS();
        if (getActivity() == null) {
            strRR = "";
        } else {
            strRR = RR();
        }
        if (getContext() == null) {
            strPR = "";
        } else {
            strPR = PR();
        }
        AuthCommonViewModel authCommonViewModel4 = this.LLILZ;
        if (authCommonViewModel4 == null) {
            authCommonViewModel4 = null;
        }
        String strUR2 = UR();
        if (strUR2 == null) {
            strUR2 = "";
        }
        String str11 = this.LLJJJJJIL;
        if (str11 == null) {
            str11 = null;
        }
        String str12 = this.LLJJJ;
        String str13 = this.LLJJIJI;
        if (this.LLJJI) {
            bool = Boolean.TRUE;
        } else {
            bool = this.LLJJJIL;
        }
        C1B3S c1b3s10 = this.LLILZIL;
        if (c1b3s10 != null) {
            c1b3s4 = c1b3s10;
        }
        String str14 = c1b3s4.callerPackage;
        if (str14 == null) {
            str14 = "";
        }
        String str15 = this.LLJJJJ;
        if (str15 != null) {
            str5 = str15;
        }
        authCommonViewModel4.xQ2(strUR2, str11, str12, str13, strRR, strPR, bool, str14, str5, VR(), this.LLJJJJLIIL, WR(), this.LLJJIJIL, kS());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        String string;
        String string2;
        String string3;
        int i;
        boolean z;
        String string4;
        String string5;
        String string6;
        String string7;
        Boolean boolValueOf;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        super.onCreate(bundle);
        this.LLILLJJLI = new AwemeAuthorizePlatformDepend(this);
        getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.LLILLJJLI;
        if (awemeAuthorizePlatformDepend == null) {
            awemeAuthorizePlatformDepend = null;
        }
        this.LLILLL = new C19H7(awemeAuthorizePlatformDepend);
        this.LLILZIL = new C1B3S(getArguments());
        this.LLILZLL = C1B3X.LIZ(getArguments());
        C1B3S c1b3s = this.LLILZIL;
        if (c1b3s == null) {
            c1b3s = null;
        }
        if (c1b3s.callerPackage == null) {
            c1b3s.callerPackage = requireActivity().getCallingPackage();
        }
        C1B3S c1b3s2 = this.LLILZIL;
        if (c1b3s2 == null) {
            c1b3s2 = null;
        }
        String str = c1b3s2.LJII;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        this.LLJJJJJIL = str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            bundle2 = arguments.getBundle("_bytedance_params_extra");
        } else {
            bundle2 = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("_aweme_params_caller_open_sdk_common_name")) == null) {
            string = "";
        }
        this.LLJIJIL = string;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString("_aweme_params_caller_open_sdk_common_version")) == null) {
            string2 = "";
        }
        this.LLJILJIL = string2;
        this.LLJ = C2198601B3a.LIZ(getArguments());
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string3 = arguments4.getString("_aweme_params_caller_open_sdk_version")) == null) {
            string3 = "";
        }
        this.LLJI = string3;
        if (bundle2 != null) {
            i = bundle2.getInt("authType");
        } else {
            i = 0;
        }
        this.LLIZLLLIL = i;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            z = arguments5.getBoolean("key_qrcode_auth", false);
        } else {
            z = false;
        }
        this.LLJJI = z;
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (string14 = arguments6.getString("key_qrcode_token")) != null) {
            str2 = string14;
        }
        this.LLJJIII = str2;
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            string4 = arguments7.getString("key_qrcode_bc_params");
        } else {
            string4 = null;
        }
        this.LLJJIJI = string4;
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            string5 = arguments8.getString("key_qrcode_redirect_uri");
        } else {
            string5 = null;
        }
        this.LLJJIJIIJIL = string5;
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            string6 = arguments9.getString("key_qrcode_state");
        } else {
            string6 = null;
        }
        this.LLJJIJIL = string6;
        Bundle arguments10 = getArguments();
        if (arguments10 != null) {
            string7 = arguments10.getString("_bytedance_params_redirect_uri");
        } else {
            string7 = null;
        }
        this.LLJJJ = string7;
        Bundle arguments11 = getArguments();
        if (arguments11 != null) {
            boolValueOf = Boolean.valueOf(arguments11.getBoolean("_bytedance_params_auto_auth_disabled", false));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        this.LLJJJIL = boolValueOf;
        Bundle arguments12 = getArguments();
        if (arguments12 != null) {
            string8 = arguments12.getString("_bytedance_params_code_challenge");
        } else {
            string8 = null;
        }
        this.LLJJJJ = string8;
        Bundle arguments13 = getArguments();
        if (arguments13 != null) {
            string9 = arguments13.getString("_bytedance_params_initiate_url");
        } else {
            string9 = null;
        }
        this.LLJJJJLIIL = string9;
        Bundle arguments14 = getArguments();
        if (arguments14 != null) {
            string10 = arguments14.getString("_bytedance_params_enter_source");
        } else {
            string10 = null;
        }
        this.LLJLIL = string10;
        Bundle arguments15 = getArguments();
        if (arguments15 != null) {
            string11 = arguments15.getString("_bytedance_params_enter_method");
        } else {
            string11 = null;
        }
        this.LLJLILLLLZIIL = string11;
        Bundle arguments16 = getArguments();
        if (arguments16 != null) {
            string12 = arguments16.getString("_bytedance_params_enter_from");
        } else {
            string12 = null;
        }
        this.LLJLL = string12;
        Bundle arguments17 = getArguments();
        if (arguments17 != null) {
            string13 = arguments17.getString("ttoclid");
        } else {
            string13 = null;
        }
        this.LLJLLIL = string13;
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(requireActivity());
        dialogC1389620mGW.LJJLJ(R.string.txr);
        this.LLIZ = dialogC1389620mGW;
        Application application = requireActivity().getApplication();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.LLILLJJLI;
        if (awemeAuthorizePlatformDepend2 == null) {
            awemeAuthorizePlatformDepend2 = null;
        }
        C19H7 c19h7 = this.LLILLL;
        if (c19h7 == null) {
            c19h7 = null;
        }
        C1B3S c1b3s3 = this.LLILZIL;
        if (c1b3s3 == null) {
            c1b3s3 = null;
        }
        C1B3J c1b3j = this.LLILZLL;
        if (c1b3j == null) {
            c1b3j = null;
        }
        AuthCommonViewModel authCommonViewModel = (AuthCommonViewModel) ViewModelProviders.of(requireActivity(), new C19H6(application, awemeAuthorizePlatformDepend2, c19h7, c1b3s3, c1b3j)).get(AuthCommonViewModel.class);
        this.LLILZ = authCommonViewModel;
        if (authCommonViewModel == null) {
            authCommonViewModel = null;
        }
        authCommonViewModel.LLJJJIL.setValue(new C2198701B3k(false, false));
        authCommonViewModel.LLJJJJLIIL.setValue(null);
        authCommonViewModel.LLILZLL.setValue(null);
    }

    public final void qS(OAuthPage oAuthPage) {
        String str;
        String str2;
        CheckResultInfo checkResultInfo;
        Integer num;
        List<OAuthScope> list;
        List<OAuthScope> list2;
        OAuthScopeStruct scopeListStruct;
        OAuthScopeStruct scopeListStruct2;
        List<OAuthScope> bcScopeList;
        OAuthClientInfo clientInfo;
        OAuthPageDetail oAuthPageDetail = oAuthPage.pageDetail;
        C1B3S c1b3s = null;
        if (oAuthPageDetail != null && (clientInfo = oAuthPageDetail.getClientInfo()) != null) {
            str = clientInfo.clientName;
        } else {
            str = null;
        }
        this.LLJILJILJ = str;
        Integer num2 = oAuthPage.statusCode;
        if (num2 != null && num2.intValue() == 0 && !C08A4.LIZ(oAuthPage.errorCode)) {
            OAuthPageDetail oAuthPageDetail2 = oAuthPage.pageDetail;
            int i = 0;
            if (oAuthPageDetail2 != null && (checkResultInfo = oAuthPageDetail2.getCheckResultInfo()) != null && (num = checkResultInfo.resultCode) != null && num.intValue() == 0) {
                if (this.LLJJI && C703302op.LIZ(this.LLJJIJI)) {
                    OAuthPageDetail oAuthPageDetail3 = oAuthPage.pageDetail;
                    if (oAuthPageDetail3 != null && (bcScopeList = oAuthPageDetail3.getBcScopeList()) != null) {
                        int size = bcScopeList.size();
                        String strLIZIZ = null;
                        while (i < size) {
                            C2197371AzH.LIZ.getClass();
                            strLIZIZ = C2197371AzH.LIZIZ(i, strLIZIZ, bcScopeList);
                            i++;
                        }
                        C1B3S c1b3s2 = this.LLILZIL;
                        if (c1b3s2 != null) {
                            c1b3s = c1b3s2;
                        }
                        c1b3s.LJII = strLIZIZ;
                        Bundle arguments = getArguments();
                        if (arguments != null) {
                            C786410Ut5.LJJJI("_bytedance_params_scope", strLIZIZ, arguments);
                        }
                        iS(oAuthPage);
                        return;
                    }
                    return;
                }
                C2197371AzH c2197371AzH = C2197371AzH.LIZ;
                OAuthPageDetail oAuthPageDetail4 = oAuthPage.pageDetail;
                if (oAuthPageDetail4 != null && (scopeListStruct2 = oAuthPageDetail4.getScopeListStruct()) != null) {
                    list = scopeListStruct2.authorizedScopeList;
                } else {
                    list = null;
                }
                OAuthPageDetail oAuthPageDetail5 = oAuthPage.pageDetail;
                if (oAuthPageDetail5 != null && (scopeListStruct = oAuthPageDetail5.getScopeListStruct()) != null) {
                    list2 = scopeListStruct.requestScopeList;
                } else {
                    list2 = null;
                }
                c2197371AzH.getClass();
                List listLIZJ = C2197371AzH.LIZJ(list, list2);
                int size2 = ((ArrayList) listLIZJ).size();
                String strLIZIZ2 = null;
                while (i < size2) {
                    C2197371AzH.LIZ.getClass();
                    strLIZIZ2 = C2197371AzH.LIZIZ(i, strLIZIZ2, listLIZJ);
                    i++;
                }
                AuthCommonViewModel authCommonViewModel = this.LLILZ;
                if (authCommonViewModel == null) {
                    authCommonViewModel = null;
                }
                authCommonViewModel.LLJILLL.postValue(C13LP.LJLLLL(new AComparatorS28S0000000_9(33), listLIZJ));
                C1B3S c1b3s3 = this.LLILZIL;
                if (c1b3s3 != null) {
                    c1b3s = c1b3s3;
                }
                c1b3s.LJII = strLIZIZ2;
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    C786410Ut5.LJJJI("_bytedance_params_scope", strLIZIZ2, arguments2);
                }
                iS(oAuthPage);
                return;
            }
            if (this.LLJL) {
                C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0200000_34(this, oAuthPage, 5));
            } else {
                gS(oAuthPage);
            }
            AuthCommonViewModel authCommonViewModel2 = this.LLILZ;
            if (authCommonViewModel2 == null) {
                authCommonViewModel2 = null;
            }
            authCommonViewModel2.LLILZLL.postValue(null);
            C1B3Q c1b3q = C1B3Q.LIZ;
            C2344009Gk c2344009GkOR = OR();
            c1b3q.getClass();
            C1B3Q.LIZLLL(c2344009GkOR, "/passport/open/auth_info/v2/");
            return;
        }
        C2193701AtM c2193701AtMLIZ = C2193691AtL.LIZ(oAuthPage.errorCode);
        int i2 = c2193701AtMLIZ.LIZ;
        EnumC2193681AtK enumC2193681AtK = c2193701AtMLIZ.LIZIZ;
        if (i2 == 0) {
            C2193701AtM c2193701AtMLIZ2 = C2193691AtL.LIZ(oAuthPage.statusCode);
            i2 = c2193701AtMLIZ2.LIZ;
            enumC2193681AtK = c2193701AtMLIZ2.LIZIZ;
        }
        String value = oAuthPage.error;
        if (value == null) {
            value = enumC2193681AtK.getValue();
        }
        String str3 = oAuthPage.errorDesc;
        if (str3 == null) {
            str2 = oAuthPage.statusMsg;
            str3 = oAuthPage.statusMsg;
        } else {
            str2 = str3;
        }
        C1B3O c1b3oLIZ = C1B3Y.LIZ(i2, value, str2, str3);
        try {
            C1B3Q c1b3q2 = C1B3Q.LIZ;
            C2344009Gk c2344009GkOR2 = OR();
            Integer num3 = oAuthPage.statusCode;
            String str4 = oAuthPage.statusMsg;
            Context contextRequireContext = requireContext();
            c1b3q2.getClass();
            C1B3Q.LIZJ(c2344009GkOR2, num3, str4, "/tiktok/v2/oauth/page/detail/", contextRequireContext);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1233040iBy c1233040iBy = new C1233040iBy(getActivity());
            c1233040iBy.LIZJ("Unknown error");
            c1233040iBy.LIZLLL();
        }
        aS(this, c1b3oLIZ);
    }

    public static void MR(BaseI18nAuthorizedFragment baseI18nAuthorizedFragment, Intent intent) throws Throwable {
        Intent intent2 = intent;
        Fragment fragment = baseI18nAuthorizedFragment;
        C1701330uNH.LIZ(intent2, fragment);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu9d5fBzjv//UXOg08/nzG/a6/y+Q/Xj8/U1lCvJFyxPQmIVA==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11088, "com/ss/android/ugc/aweme/authorize/BaseI18nAuthorizedFragment", "startActivity", fragment, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11088, "com/ss/android/ugc/aweme/authorize/BaseI18nAuthorizedFragment", "startActivity", null, objArr, fragment, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (Fragment) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        fragment.startActivity(intent2);
        c0wst.LIZ(11088, "com/ss/android/ugc/aweme/authorize/BaseI18nAuthorizedFragment", "startActivity", null, objArr, fragment, c0wzw, true);
    }

    public static void aS(BaseI18nAuthorizedFragment baseI18nAuthorizedFragment, C1B3O c1b3o) {
        baseI18nAuthorizedFragment.getClass();
        int i = c1b3o.errorCode;
        String str = c1b3o.LIZLLL;
        String strUR = baseI18nAuthorizedFragment.UR();
        String str2 = baseI18nAuthorizedFragment.LLJ;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = baseI18nAuthorizedFragment.LLJI;
        if (str3 == null) {
            str3 = null;
        }
        String str4 = baseI18nAuthorizedFragment.LLJIJIL;
        if (str4 == null) {
            str4 = null;
        }
        String str5 = baseI18nAuthorizedFragment.LLJILJIL;
        if (str5 == null) {
            str5 = null;
        }
        C0N0A.LIZ(str, 1, i, strUR, str2, str3, str4, str5);
        baseI18nAuthorizedFragment.mS(c1b3o.errorCode, c1b3o.LIZLLL, false);
        C2344009Gk c2344009GkOR = baseI18nAuthorizedFragment.OR();
        c2344009GkOR.LJIIIIZZ("result", "fail");
        C20684815ws.LJIILLIIL("platform_auth_code", c2344009GkOR.LIZ);
        baseI18nAuthorizedFragment.sS(c1b3o, null);
    }

    public final void bS(int i, String str) {
        DialogC1389620mGW dialogC1389620mGW = this.LLIZ;
        if (dialogC1389620mGW == null) {
            dialogC1389620mGW = null;
        }
        dialogC1389620mGW.hide();
        C19EG c19egRequireActivity = requireActivity();
        if (!TextUtils.isEmpty(str)) {
            C1233040iBy c1233040iBy = new C1233040iBy(c19egRequireActivity);
            c1233040iBy.LIZJ(str);
            c1233040iBy.LIZLLL();
        }
        mS(i, str, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        OAuthPage oAuthPage;
        C1B3S c1b3s;
        C1B3S c1b3s2;
        C1B3S c1b3s3;
        super.onViewCreated(view, bundle);
        if (this.LLJL) {
            C1391280mJC c1391280mJCNR = NR();
            int visibility = c1391280mJCNR.getVisibility();
            c1391280mJCNR.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c1391280mJCNR);
            C1391280mJC c1391280mJCNR2 = NR();
            if (c1391280mJCNR2 != null) {
                C0OM1 c0om1 = new C0OM1();
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZJ(new AwS578S0100000_34(this, 28));
                c0om1.LIZIZ(c1251150ifB);
                c0om1.LIZLLL = false;
                c1391280mJCNR2.setNavActions(c0om1);
            }
        }
        DialogC1389620mGW dialogC1389620mGW = this.LLIZ;
        AuthCommonViewModel authCommonViewModel = null;
        if (dialogC1389620mGW == null) {
            dialogC1389620mGW = null;
        }
        C0FNV.LIZJ(dialogC1389620mGW);
        if (this.LLJJI && this.LLJJIJI == null && this.LLJJIJIIJIL == null) {
            String str = this.LLJJIII;
            Integer numValueOf = Integer.valueOf(this.LLIZLLLIL);
            C1B3S c1b3s4 = this.LLILZIL;
            if (c1b3s4 == null) {
                c1b3s = null;
            } else {
                c1b3s = c1b3s4;
            }
            String str2 = c1b3s.LIZJ;
            if (c1b3s4 == null) {
                c1b3s2 = null;
            } else {
                c1b3s2 = c1b3s4;
            }
            String str3 = c1b3s2.LIZLLL;
            if (c1b3s4 == null) {
                c1b3s3 = null;
            } else {
                c1b3s3 = c1b3s4;
            }
            String str4 = c1b3s3.LJII;
            if (c1b3s4 == null) {
                c1b3s4 = null;
            }
            C1B3C c1b3c = new C1B3C(numValueOf, str, str2, str3, str4, c1b3s4.LJ);
            AuthCommonViewModel authCommonViewModel2 = this.LLILZ;
            if (authCommonViewModel2 == null) {
                authCommonViewModel2 = null;
            }
            authCommonViewModel2.yQ2(c1b3c);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("auth_page_info");
            } else {
                serializable = null;
            }
            if ((serializable instanceof OAuthPage) && (oAuthPage = (OAuthPage) serializable) != null) {
                qS(oAuthPage);
            } else {
                rS();
                AuthCommonViewModel authCommonViewModel3 = this.LLILZ;
                if (authCommonViewModel3 == null) {
                    authCommonViewModel3 = null;
                }
                String strUR = UR();
                if (strUR == null) {
                    strUR = "";
                }
                String str5 = this.LLJJJJJIL;
                if (str5 == null) {
                    str5 = null;
                }
                String str6 = this.LLJJJ;
                String str7 = this.LLJJIJI;
                String strRR = RR();
                String strPR = PR();
                Boolean bool = this.LLJJJIL;
                C1B3S c1b3s5 = this.LLILZIL;
                if (c1b3s5 == null) {
                    c1b3s5 = null;
                }
                String str8 = c1b3s5.callerPackage;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = this.LLJJJJ;
                if (str9 == null) {
                    str9 = "";
                }
                authCommonViewModel3.xQ2(strUR, str5, str6, str7, strRR, strPR, bool, str8, str9, VR(), this.LLJJJJLIIL, WR(), this.LLJJIJIL, kS());
            }
        }
        AuthCommonViewModel authCommonViewModel4 = this.LLILZ;
        if (authCommonViewModel4 == null) {
            authCommonViewModel4 = null;
        }
        authCommonViewModel4.LLILZ.observe(this, new AObserverS236S0100000_34(this, 2));
        AuthCommonViewModel authCommonViewModel5 = this.LLILZ;
        if (authCommonViewModel5 == null) {
            authCommonViewModel5 = null;
        }
        authCommonViewModel5.LLILZIL.observe(this, new AObserverS236S0100000_34(this, 3));
        AuthCommonViewModel authCommonViewModel6 = this.LLILZ;
        if (authCommonViewModel6 == null) {
            authCommonViewModel6 = null;
        }
        authCommonViewModel6.LLJ.observe(this, new AObserverS234S0100000_32(this, 7));
        AuthCommonViewModel authCommonViewModel7 = this.LLILZ;
        if (authCommonViewModel7 == null) {
            authCommonViewModel7 = null;
        }
        authCommonViewModel7.LLJIJIL.observe(this, new AObserverS236S0100000_34(this, 4));
        AuthCommonViewModel authCommonViewModel8 = this.LLILZ;
        if (authCommonViewModel8 == null) {
            authCommonViewModel8 = null;
        }
        authCommonViewModel8.LLIZ.observe(this, new AObserverS236S0100000_34(this, 5));
        AuthCommonViewModel authCommonViewModel9 = this.LLILZ;
        if (authCommonViewModel9 == null) {
            authCommonViewModel9 = null;
        }
        authCommonViewModel9.LLJJJ.observe(this, new AObserverS234S0100000_32(this, 8));
        AuthCommonViewModel authCommonViewModel10 = this.LLILZ;
        if (authCommonViewModel10 == null) {
            authCommonViewModel10 = null;
        }
        authCommonViewModel10.LLJJIII.observe(this, new AObserverS236S0100000_34(this, 6));
        AuthCommonViewModel authCommonViewModel11 = this.LLILZ;
        if (authCommonViewModel11 == null) {
            authCommonViewModel11 = null;
        }
        authCommonViewModel11.LLJJIJIIJIL.observe(this, new AObserverS234S0100000_32(this, 9));
        AuthCommonViewModel authCommonViewModel12 = this.LLILZ;
        if (authCommonViewModel12 == null) {
            authCommonViewModel12 = null;
        }
        authCommonViewModel12.LLJJJJJIL.observe(this, new AObserverS234S0100000_32(this, 6));
        AuthCommonViewModel authCommonViewModel13 = this.LLILZ;
        if (authCommonViewModel13 == null) {
            authCommonViewModel13 = null;
        }
        authCommonViewModel13.LLJJL.observe(this, new AObserverS236S0100000_34(this, 0));
        AuthCommonViewModel authCommonViewModel14 = this.LLILZ;
        if (authCommonViewModel14 != null) {
            authCommonViewModel = authCommonViewModel14;
        }
        authCommonViewModel.LLJJJJ.observe(this, new AObserverS236S0100000_34(this, 1));
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0005, B:16:0x0027, B:22:0x0036, B:24:0x003a, B:25:0x003c, B:27:0x0048, B:28:0x004e, B:30:0x0070, B:33:0x007b, B:35:0x0086, B:37:0x008e, B:39:0x009c, B:40:0x00a2, B:52:0x00d6, B:55:0x00db, B:68:0x010d, B:71:0x0112, B:73:0x0116, B:75:0x0120, B:78:0x012f, B:81:0x0137, B:83:0x013d, B:85:0x015b, B:86:0x0160, B:87:0x0174, B:89:0x0179, B:18:0x002d, B:21:0x0032, B:7:0x0013, B:9:0x0019, B:11:0x001d, B:13:0x0021), top: B:125:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0005, B:16:0x0027, B:22:0x0036, B:24:0x003a, B:25:0x003c, B:27:0x0048, B:28:0x004e, B:30:0x0070, B:33:0x007b, B:35:0x0086, B:37:0x008e, B:39:0x009c, B:40:0x00a2, B:52:0x00d6, B:55:0x00db, B:68:0x010d, B:71:0x0112, B:73:0x0116, B:75:0x0120, B:78:0x012f, B:81:0x0137, B:83:0x013d, B:85:0x015b, B:86:0x0160, B:87:0x0174, B:89:0x0179, B:18:0x002d, B:21:0x0032, B:7:0x0013, B:9:0x0019, B:11:0x001d, B:13:0x0021), top: B:125:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d A[Catch: all -> 0x01b2, TRY_ENTER, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0005, B:16:0x0027, B:22:0x0036, B:24:0x003a, B:25:0x003c, B:27:0x0048, B:28:0x004e, B:30:0x0070, B:33:0x007b, B:35:0x0086, B:37:0x008e, B:39:0x009c, B:40:0x00a2, B:52:0x00d6, B:55:0x00db, B:68:0x010d, B:71:0x0112, B:73:0x0116, B:75:0x0120, B:78:0x012f, B:81:0x0137, B:83:0x013d, B:85:0x015b, B:86:0x0160, B:87:0x0174, B:89:0x0179, B:18:0x002d, B:21:0x0032, B:7:0x0013, B:9:0x0019, B:11:0x001d, B:13:0x0021), top: B:125:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sS(X.C1B3O r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment.sS(X.1B3O, java.lang.String):void");
    }

    public final void uS(C1B3O c1b3o, String str) throws Throwable {
        Intent intent = new Intent("android.intent.action.VIEW");
        String str2 = c1b3o.LJFF;
        if (str2 != null) {
            intent.setData(UriProtector.parse(str2));
        } else if (c1b3o.LIZ.length() > 0) {
            intent.setData(UriProtector.parse(str));
            Bundle bundle = new Bundle();
            c1b3o.toBundle(bundle);
            intent.putExtras(bundle);
            intent.addFlags(67108864);
            intent.addFlags(268435456);
        } else {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("error", c1b3o.LIZLLL);
            builderBuildUpon.appendQueryParameter("errCode", String.valueOf(c1b3o.errorCode));
            String str3 = c1b3o.LJ;
            if (str3 != null) {
                builderBuildUpon.appendQueryParameter("error_description", str3);
            }
            intent.setData(builderBuildUpon.build());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            intent.setIdentifier("third_party_app_identifier");
        }
        C2429209fW.LIZ().appendDataFlowId(intent, 1207969290);
        try {
            MR(this, intent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public final void mS(int i, String str, boolean z) {
        int i2;
        String str2;
        String str3;
        String string;
        Bundle arguments = getArguments();
        String str4 = "";
        if (arguments != null && (string = arguments.getString("pattern", "")) != null) {
            str4 = string;
        }
        Boolean bool = this.LLJILLL;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2) && !Intrinsics.LJFF(this.LLJJJIL, bool2)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        HashMap map = new HashMap();
        map.putAll(OR().LIZ);
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        map.put("result", str2);
        map.put("auto_auth", Integer.valueOf(i2));
        if (C703302op.LIZ(str4)) {
            map.put("pattern", str4);
        }
        if (!z) {
            map.put("error_code", Integer.valueOf(i));
            map.put("error_message", str);
        }
        String str5 = this.LLJLLIL;
        if (str5 != null) {
            map.put("ttoclid", str5);
        }
        String str6 = this.LLJLIL;
        if (str6 != null) {
            map.put("enter_source", str6);
        }
        String str7 = this.LLJLILLLLZIIL;
        if (str7 != null) {
            map.put("enter_method", str7);
        }
        String str8 = this.LLJILJILJ;
        if (str8 != null) {
            map.put("auth_app", str8);
        }
        C1B3S c1b3s = this.LLILZIL;
        if (c1b3s == null) {
            c1b3s = null;
        }
        String str9 = c1b3s.LJII;
        if (str9 != null) {
            if (a0.LJJIIZI(str9, "user.info.open_id", false)) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_silent_auth", str3);
        }
        C1326305Gz.LIZ.getClass();
        C1326305Gz.LIZ("auth_result", map, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        View viewSd = C786410Ut5.Sd(R.layout.id, layoutInflater, null);
        if (!(viewSd instanceof View)) {
            viewSd = null;
        }
        if (viewSd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewSd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewSd, this);
                viewSd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewSd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewSd;
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z) {
            try {
                oS(false);
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
