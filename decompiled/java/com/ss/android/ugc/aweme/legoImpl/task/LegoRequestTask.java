package com.ss.android.ugc.aweme.legoImpl.task;

import X.AbstractC848400XPy;
import X.C069P;
import X.C0C64;
import X.C0CCZ;
import X.C0CO3;
import X.C0CPH;
import X.C0HZE;
import X.C0VZ0;
import X.C0XQ7;
import X.C1041800dDW;
import X.C1071540dzU;
import X.C1076010e6h;
import X.C10EU;
import X.C10R5;
import X.C10RS;
import X.C1370970lmR;
import X.C1906090zhX;
import X.C19212010Ec;
import X.C2277881EDy;
import X.C2277891EDz;
import X.C259440AEs;
import X.C312960COo;
import X.C799890VZj;
import X.C799900VZk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1369310ljl;
import X.InterfaceC19252710Tt;
import X.InterfaceC800130Va7;
import android.content.Context;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactRelatedRequest;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.internalshare.impl.data.loader.FetchShareSortedListRequest;
import com.ss.android.ugc.aweme.legoImp.task.InitServiceSettingTask;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchComplianceSettingRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.SecSdkRequest;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.aweme.user.lego.FetchUserInfoRequest;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class LegoRequestTask implements C0CCZ {
    public static volatile boolean LL = true;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LegoRequestTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean z;
        boolean z2 = LL;
        if (z2) {
            LL = false;
        }
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        C0XQ7.LJFF().getClass();
        c799890VZj.LIZ(new FetchUserInfoRequest());
        c799890VZj.LIZ(new SecSdkRequest());
        c799890VZj.LIZ(new AbSdkCommonRequest());
        c799890VZj.LIZ(C1076010e6h.LIZJ.LJJIJIIJIL());
        c799890VZj.LIZ(new PNSConsentServiceLegoRequest());
        if (!z2 && ((Boolean) C259440AEs.LIZ.getValue()).booleanValue()) {
            c799890VZj.LIZ(((ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class)).LJIILJJIL());
        }
        c799890VZj.LIZIZ();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "use_new_app_alert", true) == 1) {
            C312960COo c312960COo = new C312960COo();
            c312960COo.LIZ(new AppAlertRequest());
            c312960COo.LIZIZ();
        }
        InterfaceC1369310ljl interfaceC1369310ljlLIZIZ = C1041800dDW.LIZ().LIZIZ();
        C2277891EDz c2277891EDz = C2277891EDz.LIZIZ;
        c2277891EDz.LIZIZ();
        InterfaceC800130Va7 interfaceC800130Va7LJIILIIL = c2277891EDz.LJIILIIL();
        if (interfaceC800130Va7LJIILIIL != null) {
            C799890VZj c799890VZj2 = new C799890VZj();
            c799890VZj2.LIZ(interfaceC800130Va7LJIILIIL);
            c799890VZj2.LIZIZ();
        }
        InterfaceC800130Va7 interfaceC800130Va7LJIILIIL2 = C0HZE.LIZIZ.LJIILIIL();
        if (interfaceC800130Va7LJIILIIL2 != null) {
            C799890VZj c799890VZj3 = new C799890VZj();
            c799890VZj3.LIZ(interfaceC800130Va7LJIILIIL2);
            c799890VZj3.LIZIZ();
        }
        InterfaceC800130Va7 campusEducationSheetStatusRequestLegoTask = C2277881EDy.LIZIZ.getCampusEducationSheetStatusRequestLegoTask();
        if (campusEducationSheetStatusRequestLegoTask != null) {
            C799890VZj c799890VZj4 = new C799890VZj();
            c799890VZj4.LIZ(campusEducationSheetStatusRequestLegoTask);
            c799890VZj4.LIZIZ();
        }
        IMContactApi.LIZ.getClass();
        IMContactRelatedRequest iMContactRelatedRequestLJIIJ = C069P.LIZ().LIZ().LJIIJ();
        if (iMContactRelatedRequestLJIIJ != null) {
            C799890VZj c799890VZj5 = new C799890VZj();
            c799890VZj5.LIZ(iMContactRelatedRequestLJIIJ);
            c799890VZj5.LIZIZ();
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1369310ljlLIZIZ != null) {
            IInternalShareApi.LIZ.getClass();
            FetchShareSortedListRequest fetchShareSortedListRequestLJJJJI = C1370970lmR.LIZ().LIZIZ().LJJJJI();
            C799890VZj c799890VZj6 = new C799890VZj();
            c799890VZj6.LIZ(fetchShareSortedListRequestLJJJJI);
            c799890VZj6.LIZIZ();
        }
        IMandatoryLoginService iMandatoryLoginService = (IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class);
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        if (C10RS.LIZ().LIZJ() != 0 && iMandatoryLoginService.shouldShowForcedLogin(false) && !iMandatoryLoginService.getHasRequestComplianceApi()) {
            iMandatoryLoginService.setHasRequestComplianceApi(true);
            C312960COo c312960COo2 = new C312960COo();
            c312960COo2.LIZ(new FetchComplianceSettingRequest(C0CO3.NORMAL));
            c312960COo2.LIZIZ();
        }
        ComplianceServiceProvider.LJJIII().initialize();
        C0CPH c0cph = new C0CPH();
        c0cph.LIZ(new GeckoHighPriorityCheckInRequest());
        c0cph.LIZ(new GeckoCheckInRequest());
        c0cph.LIZ(new InitServiceSettingTask());
        c0cph.LIZIZ();
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && !C10EU.LJIIIIZZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "inbox_has_top_msg", true, false)) {
            InterfaceC19252710Tt interfaceC19252710Tt = (InterfaceC19252710Tt) C1906090zhX.LIZ(InterfaceC19252710Tt.class);
            if (interfaceC19252710Tt != null) {
                interfaceC19252710Tt.LJ("");
                interfaceC19252710Tt.LIZ("");
                interfaceC19252710Tt.LIZJ("");
                interfaceC19252710Tt.LIZIZ("");
                interfaceC19252710Tt.LJFF("");
                interfaceC19252710Tt.LIZLLL("");
            }
            C312960COo c312960COo3 = new C312960COo();
            c312960COo3.LIZ(C19212010Ec.LIZJ.LJLZ());
            c312960COo3.LIZIZ();
        }
        List<InterfaceC800130Va7> listLJIIJJI = c2277891EDz.LJIIJJI(!z);
        List<InterfaceC800130Va7> listLJIIIIZZ = C1071540dzU.LIZIZ.LJIIIIZZ();
        C799890VZj c799890VZj7 = new C799890VZj();
        Iterator<InterfaceC800130Va7> it2 = listLJIIJJI.iterator();
        while (it2.hasNext()) {
            c799890VZj7.LIZ(it2.next());
        }
        Iterator<InterfaceC800130Va7> it3 = listLJIIIIZZ.iterator();
        while (it3.hasNext()) {
            c799890VZj7.LIZ(it3.next());
        }
        c799890VZj7.LIZIZ();
    }
}
