package com.ss.android.ugc.aweme.component.register;

import X.C0XE4;
import X.C1238130iKB;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13EO;
import X.C13LP;
import X.C1716550ulp;
import X.C1717080umg;
import X.C1717190umr;
import X.C1717260umy;
import X.C1948507kB;
import X.C1976907ol;
import X.C19EG;
import X.C2188811AlT;
import X.EnumC1717460unI;
import X.InterfaceC1717160umo;
import X.InterfaceC1717200ums;
import X.InterfaceC1717210umt;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.ttpay.onboarding.TTPayOnBoardingManagerIDTemplate;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.biz.wallet.network.model.PopOutExtraInfo;
import com.ss.android.ugc.aweme.biz.wallet.network.model.PopOutInfo;
import com.ss.android.ugc.aweme.biz.wallet.network.model.Step;
import com.ss.android.ugc.aweme.biz.wallet.network.model.StepAttr;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.phone.change.ChangePhoneManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS109S1200000_26;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public abstract class BaseRegisterManager implements IInterceptor {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final String LL;
    public final String LLILLJJLI;
    public final WalletFlowDecision LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final ArrayList<InterfaceC1717200ums> LLIZLLLIL;
    public final ArrayList<InterfaceC1717200ums> LLJ;
    public final C0XE4 LLJI;
    public InterfaceC1717210umt LLJIJIL;
    public String LLJILJIL;

    public boolean LIZ() {
        return true;
    }

    public void LJIIJ(InterfaceC1717200ums interfaceC1717200ums, Object obj) {
    }

    public void LJIIJJI(InterfaceC1717200ums interfaceC1717200ums, Object obj) {
    }

    public void LJIIL(InterfaceC1717200ums interfaceC1717200ums) {
    }

    public boolean LJIILLIIL() {
        return !(this instanceof TTPayOnBoardingManagerIDTemplate);
    }

    public boolean LJIIZILJ() {
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public Function0<String> LIZLLL() {
        String str = this.LLILZIL;
        return (str == null || str.length() == 0) ? AFwS215S0000000_26.get$arr$(53) : new AwS570S0100000_26(this, 152);
    }

    public final String LJFF() {
        String str;
        ArrayList<Step> arrayList = this.LLILLL.allSteps;
        if (arrayList == null) {
            return "";
        }
        Iterator it2 = new C13EO(arrayList).iterator();
        while (it2.hasNext()) {
            StepAttr stepAttr = ((Step) it2.next()).stepAttr;
            if (stepAttr != null && (str = stepAttr.pipoInformationCollectionSuccessToast) != null && C1948507kB.LIZ(str)) {
                return str;
            }
        }
        return "";
    }

    public final boolean LJIIIIZZ() {
        PopOutInfo popOutInfo = this.LLILLL.popOut;
        return C1948507kB.LIZ(popOutInfo != null ? popOutInfo.title : null) && u.LJIJI(this.LLILLL.extraOperation, "phone_conflict_change", true);
    }

    public final void LJIILJJIL() {
        this.LLJ.clear();
    }

    public EnumC1717460unI LJ() {
        return EnumC1717460unI.CHANGE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public String LJI(String str) {
        switch (str.hashCode()) {
            case -1766622087:
                if (!str.equals("VERIFY")) {
                    return "";
                }
                return "bnpl_activate_otp";
            case -1373412826:
                if (!str.equals("OPEN_CA_ACCOUNT_NEED_SYNC")) {
                    return "";
                }
                return "open_ca_account";
            case 74901:
                if (!str.equals("KYC")) {
                    return "";
                }
                return "kyc_page";
            case 869340811:
                if (!str.equals("COLLECT_INFO_PAGE")) {
                    return "";
                }
                return "collect_info_page";
            case 941345857:
                if (!str.equals("OPEN_CA_ACCOUNT")) {
                    return "";
                }
                return "open_ca_account";
            case 1052877671:
                if (!str.equals("SET_PIN_CREATE_USER")) {
                    return "";
                }
                return "bnpl_pin_set";
            case 1782266989:
                if (!str.equals("COLLECT_MOBILE_FROM_TT")) {
                    return "";
                }
                return "auto_get_phone_number";
            case 1855579941:
                if (!str.equals("CREATE_BIO")) {
                    return "";
                }
                return "bio";
            default:
                return "";
        }
    }

    public String LJII(String str) {
        String strLJI;
        if (this.LLJ.size() > 0) {
            strLJI = ((InterfaceC1717200ums) ListProtector.get(this.LLJ, r1.size() - 1)).LJI();
        } else {
            strLJI = "";
        }
        return LJI(strLJI);
    }

    public void LJIIIZ(InterfaceC1717160umo interfaceC1717160umo) {
        LJIILJJIL();
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF(host, "pipo");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean LJIILL(Step step, List<Step> list) {
        if (list != null) {
            int iIndexOf = list.indexOf(step);
            if (iIndexOf == 0) {
                return true;
            }
            int i = iIndexOf - 1;
            if (i >= 0) {
                String str = ((Step) ListProtector.get(list, i)).stepName;
                switch (str.hashCode()) {
                    case -621897403:
                        if (!str.equals("CREATE_MOBILE")) {
                            return false;
                        }
                        return true;
                    case 33356210:
                        if (!str.equals("RESET_MOBILE")) {
                            return false;
                        }
                        return true;
                    case 941345857:
                        if (!str.equals("OPEN_CA_ACCOUNT")) {
                            return false;
                        }
                        return true;
                    case 1169877480:
                        if (!str.equals("SIGN_AGREEMENT")) {
                            return false;
                        }
                        return true;
                    case 1688978734:
                        if (!str.equals("CREATE_USER")) {
                            return false;
                        }
                        return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String path;
        PopOutExtraInfo popOutExtraInfo;
        String str;
        if (routeIntent != null) {
            path = routeIntent.getPath();
        } else {
            path = null;
        }
        if (!Intrinsics.LJFF(path, "/phone_management/change_phone") || !(context instanceof C19EG)) {
            return false;
        }
        PopOutInfo popOutInfo = this.LLILLL.popOut;
        if (popOutInfo != null && (popOutExtraInfo = popOutInfo.extraInfo) != null && (str = popOutExtraInfo.scene) != null) {
            C1716550ulp c1716550ulp = C1716550ulp.LIZ;
            String str2 = this.LL;
            c1716550ulp.getClass();
            C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str2);
            if (c1717080umgLJFF != null) {
                C1716550ulp.LIZIZ(str, c1717080umgLJFF);
            }
            String str3 = this.LLILLL.popOut.extraInfo.sessionId;
            if (str3 == null) {
                str3 = "";
            }
            C1716550ulp.LIZ(str, str3);
            AwS109S1200000_26 awS109S1200000_26 = new AwS109S1200000_26(context, this, str, 2);
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJIIIIZZ = true;
            c1397580mTM.LIZLLL(new AwS392S0200000_26(context, this, 16));
            c1397580mTM.LJI(this.LLILLL.popOut.title);
            c1397580mTM.LJII = false;
            c1397580mTM.LIZIZ(this.LLILLL.popOut.content);
            C1238130iKB.LIZ(c1397580mTM, new AwS235S0300000_26(context, this, awS109S1200000_26, 6));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        return true;
    }

    public void LIZJ(C19EG c19eg, InterfaceC1717210umt interfaceC1717210umt, String str) {
        String str2;
        this.LLJIJIL = interfaceC1717210umt;
        this.LLJILJIL = str;
        if (LJIIIIZZ()) {
            SmartRouter.addInterceptor(this);
            if (LJIIZILJ()) {
                str2 = "//pipo/common/transparent";
            } else {
                str2 = "//pipo/common/blank";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("?real_jump_schema=");
            sbLIZ.append(Uri.encode("//pipo/phone_management/change_phone"));
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, C2188811AlT.LIZIZ(sbLIZ));
            smartRouteBuildRoute.withAnimation(0, 0);
            smartRouteBuildRoute.open();
            return;
        }
        new C1717190umr(this, c19eg, C13LP.LLIIII(this.LLJ), 0, interfaceC1717210umt, (String) null, 96).LIZJ(null, str, null);
    }

    public void LIZIZ(String str, C19EG c19eg, WalletFlowDecision walletFlowDecision, C1717260umy c1717260umy) {
        new ChangePhoneManager(walletFlowDecision, str, this.LLILLJJLI, this.LLILZIL).LIZJ(c19eg, c1717260umy, this.LLJILJIL);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:169:0x030c A[PHI: r17
      0x030c: PHI (r17v5 java.lang.String) = (r17v2 java.lang.String), (r17v6 java.lang.String) binds: [B:168:0x030a, B:166:0x0306] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0312 A[PHI: r17
      0x0312: PHI (r17v4 java.lang.String) = (r17v2 java.lang.String), (r17v5 java.lang.String) binds: [B:168:0x030a, B:170:0x0310] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3 A[PHI: r17
      0x00d3: PHI (r17v11 java.lang.String) = (r17v8 java.lang.String), (r17v12 java.lang.String) binds: [B:48:0x00d1, B:46:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9 A[PHI: r17
      0x00d9: PHI (r17v10 java.lang.String) = (r17v8 java.lang.String), (r17v11 java.lang.String) binds: [B:48:0x00d1, B:50:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.InterfaceC1717200ums LJIILIIL(final java.lang.String r66, com.ss.android.ugc.aweme.biz.wallet.network.model.Step r67, java.util.List<com.ss.android.ugc.aweme.biz.wallet.network.model.Step> r68, final com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision r69) {
        /*
            Method dump skipped, instruction units count: 2096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.component.register.BaseRegisterManager.LJIILIIL(java.lang.String, com.ss.android.ugc.aweme.biz.wallet.network.model.Step, java.util.List, com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision):X.0ums");
    }

    public BaseRegisterManager(String str, String str2, WalletFlowDecision walletFlowDecision, String str3, String str4, String str5, String str6, int i) {
        String str7;
        str5 = (i & 32) != 0 ? "" : str5;
        str6 = (i & 64) != 0 ? "" : str6;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = walletFlowDecision;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        ArrayList<InterfaceC1717200ums> arrayList = new ArrayList<>();
        this.LLIZLLLIL = arrayList;
        ArrayList<InterfaceC1717200ums> arrayList2 = new ArrayList<>();
        this.LLJ = arrayList2;
        arrayList.clear();
        arrayList2.clear();
        ArrayList<Step> arrayList3 = new ArrayList();
        ArrayList<Step> arrayList4 = walletFlowDecision.allSteps;
        C0XE4 c0xe4 = null;
        if (arrayList4 != null) {
            Step step = null;
            for (Step step2 : arrayList4) {
                step = TextUtils.equals(step2.stepName, "LANDING_PAGE") ? step2 : step;
                if (C1948507kB.LIZ(step2.parentStep) && step != null) {
                    if (step.childSteps == null) {
                        step.setChildSteps(new ArrayList<>());
                    }
                    ArrayList<String> arrayList5 = step.childSteps;
                    if (arrayList5 != null) {
                        arrayList5.add(step2.stepName);
                    }
                } else {
                    arrayList3.add(step2);
                }
            }
        }
        for (Step step3 : arrayList3) {
            InterfaceC1717200ums interfaceC1717200umsLJIILIIL = LJIILIIL(this.LL, step3, arrayList3, this.LLILLL);
            if (interfaceC1717200umsLJIILIIL != null) {
                interfaceC1717200umsLJIILIIL.LJ(step3.stepInfo);
                interfaceC1717200umsLJIILIIL.LIZIZ(step3.skipable);
                this.LLJ.add(interfaceC1717200umsLJIILIIL);
                this.LLIZLLLIL.add(interfaceC1717200umsLJIILIIL);
            }
        }
        Map<String, String> map = this.LLILLL.extra;
        if (map != null && (str7 = map.get("std_user_level_state")) != null) {
            C0XE4.Companion.getClass();
            Iterator<C0XE4> it2 = C0XE4.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C0XE4 next = it2.next();
                if (Intrinsics.LJFF(next.getLevel(), str7)) {
                    c0xe4 = next;
                    break;
                }
            }
            this.LLJI = c0xe4;
        }
    }
}
