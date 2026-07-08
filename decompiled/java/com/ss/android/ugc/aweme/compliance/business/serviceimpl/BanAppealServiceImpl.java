package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.AbstractC848400XPy;
import X.C04TD;
import X.C09JN;
import X.C0C64;
import X.C0XQ7;
import X.C102T;
import X.C102U;
import X.C11S5;
import X.C1390920mIc;
import X.C1518550pcT;
import X.C1701940uOG;
import X.C1916910zyz;
import X.C1917160zzO;
import X.C1917180zzQ;
import X.C1917200zzS;
import X.C19633311rf;
import X.C19EG;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2105908Mv;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2512309sv;
import X.C312110CLh;
import X.C786410Ut5;
import X.InterfaceC1519250pdb;
import X.InterfaceC1917190zzR;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.compliance.api.model.AccountBannedDetail;
import com.ss.android.ugc.aweme.compliance.api.model.BanInfo;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.GradientPunishWarning;
import com.ss.android.ugc.aweme.compliance.business.banappeal.warninginfo.AgsWarningInfoFragment;
import com.ss.android.ugc.aweme.compliance.business.banappeal.warninginfo.AgsWarningInfoSet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class BanAppealServiceImpl implements IBanAppealService {
    public static IBanAppealService LJIILJJIL() {
        Object objLIZ = C04TD.LIZ(IBanAppealService.class, false);
        if (objLIZ != null) {
            return (IBanAppealService) objLIZ;
        }
        if (C04TD.LLLLIL == null) {
            synchronized (IBanAppealService.class) {
                if (C04TD.LLLLIL == null) {
                    C04TD.LLLLIL = new BanAppealServiceImpl();
                }
            }
        }
        return C04TD.LLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final boolean LJFF() {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        boolean z = C2512309sv.LIZ;
        boolean z2 = false;
        if (C2512309sv.LIZ) {
            return false;
        }
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService != null && (eligibilityModelLIZ = iGatekeeperService.LIZ("tiktok_social_comments")) != null && !eligibilityModelLIZ.isEligible()) {
            z2 = true;
        }
        boolean z3 = !z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Au16 block feature ppf: ");
        sbLIZ.append(!z3);
        C2188811AlT.LIZIZ(sbLIZ);
        return !z3;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void LJI() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("violation_bubble_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final boolean LJIIIIZZ() {
        C1917160zzO.LIZ.getClass();
        return C1917160zzO.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final long LJIIIZ() {
        Long l;
        Integer num;
        C102U.LIZ.getClass();
        List listLIZIZ = C102U.LIZIZ();
        Object obj = null;
        if (listLIZIZ == null) {
            return 0L;
        }
        Iterator it2 = listLIZIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            BanInfo banInfo = (BanInfo) next;
            Integer num2 = banInfo.banType;
            if (num2 != null && num2.intValue() == 3 && (num = banInfo.banPlatform) != null && num.intValue() == 1) {
                obj = next;
                break;
            }
        }
        BanInfo banInfo2 = (BanInfo) obj;
        if (banInfo2 == null || (l = banInfo2.banExpireTimeMs) == null) {
            return 0L;
        }
        return l.longValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void LJIIL() {
        C102U.LIZ.getClass();
        C102T c102t = C102U.LIZJ;
        ArrayList arrayList = new ArrayList();
        c102t.LIZJ = arrayList;
        c102t.LIZIZ.storeString("account_banned_detail", GsonProtectorUtils.toJson(new Gson(), arrayList));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final boolean LJIILIIL() {
        C1917160zzO.LIZ.getClass();
        return C1917160zzO.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void LIZLLL() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_account_status", true, false)) {
            boolean zLJI = MethodIDManager.LJI(196687);
            InterfaceC1917190zzR.LIZ.getClass();
            C1917180zzQ.LIZIZ.LIZ().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0X1n
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AccountBannedDetailManager@7f8b.syncAccountBannedDetail$1");
                    AccountBannedDetail accountBannedDetail = (AccountBannedDetail) obj;
                    if (accountBannedDetail.status_code == 0 && accountBannedDetail.getBanInfos() != null) {
                        C102U c102u = C102U.LIZ;
                        List<BanInfo> banInfos = accountBannedDetail.getBanInfos();
                        c102u.getClass();
                        C102T c102t = C102U.LIZJ;
                        c102t.LIZJ = banInfos;
                        c102t.LIZIZ.storeString("account_banned_detail", GsonProtectorUtils.toJson(new Gson(), banInfos));
                    }
                    C1C7U.LIZIZ("AccountBannedDetailManager@7f8b.syncAccountBannedDetail$1");
                }
            }, new C09JN() { // from class: X.00Ne
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("AccountBannedDetailManager@7f8b.syncAccountBannedDetail$2");
                    C1C7U.LIZIZ("AccountBannedDetailManager@7f8b.syncAccountBannedDetail$2");
                }
            });
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final AgsWarningInfo LJ() {
        AgsWarningInfoSet agsWarningInfoSetLIZ = C1917200zzS.LIZ();
        if (agsWarningInfoSetLIZ != null) {
            return agsWarningInfoSetLIZ.itemPostWarningInfo;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final boolean LJII() {
        int i;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        GradientPunishWarning gradientPunishWarningLIZ = C1916910zyz.LIZ();
        if (gradientPunishWarningLIZ == null || (i = gradientPunishWarningLIZ.warnType) == 0) {
            C19633311rf c19633311rf = C1916910zyz.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("has_click_warning_bubble_");
            sbLIZ.append(curUserId);
            c19633311rf.LJI(C2188811AlT.LIZIZ(sbLIZ), false);
            return false;
        }
        if (i < 2 || C2105908Mv.LIZ(gradientPunishWarningLIZ.bubbleText) || C2105908Mv.LIZ(gradientPunishWarningLIZ.detailUrl)) {
            return false;
        }
        String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C19633311rf c19633311rf2 = C1916910zyz.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("has_click_warning_bubble_");
        sbLIZ2.append(curUserId2);
        return !c19633311rf2.LIZJ(C2188811AlT.LIZIZ(sbLIZ2), false);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final String LJIIJJI() {
        String str;
        GradientPunishWarning gradientPunishWarningLIZ = C1916910zyz.LIZ();
        return (gradientPunishWarningLIZ == null || (str = gradientPunishWarningLIZ.bubbleText) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void LIZ(C19EG c19eg) {
        C1916910zyz.LIZIZ(c19eg, "float_warning");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C19633311rf c19633311rf = C1916910zyz.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_click_warning_bubble_");
        sbLIZ.append(curUserId);
        c19633311rf.LJI(C2188811AlT.LIZIZ(sbLIZ), true);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "bubble");
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("enter_violation_record", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void LIZIZ(final String str) {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        TTKUserCommunicationService tTKUserCommunicationService;
        C1518550pcT c1518550pcTLJI;
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService != null && (eligibilityModelLIZ = iGatekeeperService.LIZ("tiktok_social_comments")) != null) {
            for (DecisionMakerNetworkApi.PPFActionModel pPFActionModel : eligibilityModelLIZ.actionList) {
                if (Intrinsics.LJFF(pPFActionModel.actionId, "PopupAPIProcessor") && (tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null)) != null && (c1518550pcTLJI = tTKUserCommunicationService.LJI()) != null) {
                    UserCommunicationProcessorModel userCommunicationProcessorModel = new UserCommunicationProcessorModel(pPFActionModel.actionId, pPFActionModel.actionParams, null);
                    Map mapLIZJ = C2097908Jt.LIZJ(new Pair("popup_provider", new InterfaceC1519250pdb() { // from class: X.0zzP
                        @Override // X.InterfaceC1519250pdb
                        public final InterfaceC1519200pdW LIZ() {
                            return null;
                        }

                        @Override // X.InterfaceC1519250pdb
                        public final InterfaceC1914220zue LIZJ() {
                            return null;
                        }

                        @Override // X.InterfaceC1519250pdb
                        public final Map<String, String> LIZIZ() {
                            return C2097908Jt.LIZJ(new Pair("enter_from", str));
                        }
                    }));
                    c1518550pcTLJI.getClass();
                    C1518550pcT.LJI(userCommunicationProcessorModel, null, mapLIZJ);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final boolean LIZJ(int i) {
        Integer num;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_account_status", true, false)) {
            C102U.LIZ.getClass();
            List<BanInfo> listLIZIZ = C102U.LIZIZ();
            if (listLIZIZ != null && !listLIZIZ.isEmpty()) {
                for (BanInfo banInfo : listLIZIZ) {
                    Integer num2 = banInfo.banType;
                    if (num2 != null && num2.intValue() == i && (num = banInfo.banPlatform) != null && num.intValue() == 1) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void LJIIJ(C19EG c19eg) {
        AgsWarningInfo agsWarningInfo;
        C1917160zzO.LIZ.getClass();
        AgsWarningInfoSet agsWarningInfoSetLIZ = C1917200zzS.LIZ();
        if (agsWarningInfoSetLIZ != null && (agsWarningInfo = agsWarningInfoSetLIZ.itemPostWarningInfo) != null && C1917160zzO.LIZ()) {
            AgsWarningInfoFragment agsWarningInfoFragment = new AgsWarningInfoFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "warningInfo", agsWarningInfo);
            agsWarningInfoFragment.setArguments(bundle);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(agsWarningInfo.warningLevel, "warning_level");
            C20684815ws.LJIILLIIL("tns_profile_page_ags_warning_window_show", c2344009Gk.LIZ);
            TuxSheet tuxSheet = new C1390920mIc(false, 0).LIZ;
            tuxSheet.LLJJIJI = agsWarningInfoFragment;
            tuxSheet.LLJLLL = false;
            tuxSheet.LLJLLIL = false;
            tuxSheet.LLILLL = false;
            tuxSheet.show(c19eg.getSupportFragmentManager(), "AgsItemPostWarningSheet");
            C312110CLh c312110CLh = C312110CLh.LIZ;
            int i = agsWarningInfo.warningLevel;
            c312110CLh.getClass();
            C312110CLh.LIZIZ(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void jumpToAgsStatusPage(Context context, String str) {
        C1916910zyz.LIZIZ(context, str);
    }
}
