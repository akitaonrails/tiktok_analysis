package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.AbstractC1549150qPp;
import X.AbstractC1916470zyH;
import X.AbstractC20656215sG;
import X.AbstractC20660815t0;
import X.AbstractC666100QAu;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03GZ;
import X.C06MW;
import X.C0ADK;
import X.C0C64;
import X.C0CCZ;
import X.C0FNV;
import X.C0HTT;
import X.C0QBA;
import X.C0TGX;
import X.C0TSC;
import X.C0WT3;
import X.C0XQ7;
import X.C100Z;
import X.C102F;
import X.C102T;
import X.C102U;
import X.C1057820ddM;
import X.C108800b8;
import X.C10F0;
import X.C10FJ;
import X.C11NZ;
import X.C11S5;
import X.C123100dR;
import X.C1260870iur;
import X.C1390810mIR;
import X.C1390920mIc;
import X.C1391850mK7;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C1518520pcQ;
import X.C15438062q;
import X.C15560067i;
import X.C1668306g5;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1852020yIK;
import X.C1852060yIO;
import X.C1873390yqn;
import X.C1902600zbu;
import X.C1915520zwk;
import X.C1915530zwl;
import X.C1916250zxv;
import X.C1916360zy6;
import X.C1916380zy8;
import X.C1916400zyA;
import X.C1916450zyF;
import X.C1916920zz0;
import X.C1916970zz5;
import X.C19296410eQ;
import X.C1954807lC;
import X.C19EG;
import X.C201955140j;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C23250099c;
import X.C276190As5;
import X.C288110BQz;
import X.C294570Bgd;
import X.C436540H9w;
import X.C452501pT;
import X.C547860LeC;
import X.C729980SkG;
import X.C786410Ut5;
import X.C985403tE;
import X.DialogC1389620mGW;
import X.DialogInterfaceOnDismissListenerC19333210kM;
import X.EnumC1916460zyG;
import X.InterfaceC1220300hrQ;
import X.InterfaceC1915490zwh;
import X.InterfaceC1916320zy2;
import X.InterfaceC855080XgY;
import Y.AObjectS289S0200000_14;
import Y.ARunnableS128S0100000_28;
import Y.AfS171S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.experiments.TrashBinExperiment;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.compliance.business.banappeal.ComplianceBusinessActivityAssem;
import com.ss.android.ugc.aweme.compliance.business.consent.PNSDeviceConsentMainActivityAssem;
import com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedfeed.ManageFeedsPanelFragment;
import com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedsearch.SearchPersonalizedPanelFragment;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVStatusPreloadTask;
import com.ss.android.ugc.aweme.compliance.business.gatekeeper.ComplianceBackgroundLegoTask;
import com.ss.android.ugc.aweme.compliance.business.gatekeeper.ComplianceFirstFocusLegoTask;
import com.ss.android.ugc.aweme.compliance.business.popup.StemWelcomePopupFragment;
import com.ss.android.ugc.aweme.compliance.business.statemachine.PNSNormalStateMachineInitTask;
import com.ss.android.ugc.aweme.compliance.business.trashbin.DeleteCheckItemRecyclableResponse;
import com.ss.android.ugc.aweme.compliance.business.trashbin.TrashBinApiManager;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.InitHydrogenTask;
import com.ss.android.ugc.aweme.creative.model.tns.AnsaPromptModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import com.ss.android.ugc.tiktok.tns.audiencecontrol.UserRecordActionApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS60S0210000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public class ComplianceBusinessServiceImpl implements IComplianceBusinessService {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1916380zy8());
    public final C01GW LJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(120));
    public boolean LJFF;
    public ScheduledExecutorService LJI;
    public int LJII;
    public boolean LJIIIIZZ;

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final C13IQ<? extends AbstractC738140SxQ> LJIILL() {
        return C13LE.LIZ(PNSDeviceConsentMainActivityAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final C13IQ<? extends AbstractC738140SxQ> LJJIIZ() {
        return C13LE.LIZ(ComplianceBusinessActivityAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        return C1697810uHb.LJIIJJI(C1873390yqn.class, C1057820ddM.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJFF() {
        C19EG c19eg;
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        Activity activityLJFF = C2214201BlK.LJFF();
        if (!(activityLJFF instanceof C19EG) || (c19eg = (C19EG) activityLJFF) == null) {
            return;
        }
        if (C294570Bgd.LIZ()) {
            PopupManager.LJIIZILJ(new C0TSC(c19eg), new C1668306g5("pns_compliance_store_region_change_trigger"));
        } else {
            PopupManager.LJIJI(new C0TSC(c19eg), true);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final int LJI() {
        int stopAutoPlayTimesThreshold;
        C102U.LIZ.getClass();
        ComplianceSetting complianceSettingLIZ = C102U.LIZJ.LIZ();
        if (complianceSettingLIZ == null || (stopAutoPlayTimesThreshold = complianceSettingLIZ.getStopAutoPlayTimesThreshold()) <= 0) {
            return 0;
        }
        return stopAutoPlayTimesThreshold;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final Object LJII() {
        return new C10FJ() { // from class: X.0zy7
            @Override // X.C10FJ
            public final void onFailed(Exception exc) {
            }

            @Override // X.C10FJ
            public final void Hl(PushSettings pushSettings) {
                C102U c102u = C102U.LIZ;
                int i = pushSettings.removePhotosensitiveContent;
                c102u.getClass();
                C102U.LJFF(i);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJIIJJI() {
        PopupManager.LIZJ(C1852060yIO.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final String LJIILJJIL() {
        String impressumUrl;
        C102U.LIZ.getClass();
        ComplianceSetting complianceSettingLIZ = C102U.LIZJ.LIZ();
        return (complianceSettingLIZ == null || (impressumUrl = complianceSettingLIZ.getImpressumUrl()) == null) ? "" : impressumUrl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final int LJIJ() {
        C102U.LIZ.getClass();
        C102T c102t = C102U.LIZJ;
        Integer numValueOf = c102t.LJ;
        if (numValueOf == null && (numValueOf = Integer.valueOf(c102t.LIZIZ.getInt("remove_photo_sensitive_status", 0))) == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJIFFI() {
        C1915520zwk c1915520zwk = C1915520zwk.LL;
        return C1915530zwl.LLILZ || ((Boolean) C0ADK.LIZ.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJII() {
        Boolean bool = (Boolean) C1915520zwk.LLIZLLLIL.getValue();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJIIJZLJL() {
        C102U.LIZ.getClass();
        return C102U.LJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJIIZI() {
        C1915520zwk c1915520zwk = C1915520zwk.LL;
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_non_personalized_search_widget", false) == 1 && C288110BQz.LIZ() && C1915520zwk.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJIJ() {
        List<C13IQ<?>> list = C1916920zz0.LIZ;
        AbstractC20656215sG abstractC20656215sGLJ = PopupManager.LJ();
        if (abstractC20656215sGLJ == null) {
            return false;
        }
        List<C13IQ<?>> list2 = C1916920zz0.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C13IQ<?>> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Boolean.valueOf(Intrinsics.LJFF(C13LE.LIZ(abstractC20656215sGLJ.getClass()), it2.next())));
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = Boolean.valueOf(((Boolean) next).booleanValue() || ((Boolean) it3.next()).booleanValue());
        }
        return ((Boolean) next).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final C0CCZ LJJIJIIJI() {
        if (((Boolean) C276190As5.LIZ.getValue()).booleanValue()) {
            return new FBVStatusPreloadTask();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final C0WT3 LJJJJ() {
        return new C0WT3() { // from class: X.0X0L
            public static String LIZ;
            public static final Keva LIZIZ = KevaImpl.getRepo("x-tt-cmpl-token", 1);

            @Override // X.C0WT3
            public final int LIZIZ() {
                return 0;
            }

            @Override // X.C0WT3
            public final int priority() {
                return 0;
            }

            public static String LIZJ(String str) {
                if (a0.LJJJIL(str)) {
                    return "x-tt-cmpl-token";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("x-tt-cmpl-token_");
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x00ac A[PHI: r1
              0x00ac: PHI (r1v9 java.lang.String) = (r1v8 java.lang.String), (r1v4 java.lang.String) binds: [B:43:0x00aa, B:35:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C0WT3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.InterfaceC823460WSa r8) {
                /*
                    Method dump skipped, instruction units count: 346
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0X0L.LIZ(X.0WSa):void");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final List<C0CCZ> LJJJJZ() {
        return ((Boolean) C108800b8.LIZ.getValue()).booleanValue() ? C1697810uHb.LJIIJJI(new InitHydrogenTask(), new PNSNormalStateMachineInitTask(), new ComplianceBackgroundLegoTask(), new ComplianceFirstFocusLegoTask()) : C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean P9() {
        C1915520zwk c1915520zwk = C1915520zwk.LL;
        return C1915530zwl.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJIJI() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("enable_aigc_switch", false);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJJ() {
        return C0XQ7.LJFF().isLogin();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJJI() {
        return true == C0C64.LJIILLIIL().LJIIIZ(31744, "enable_non_personalized_feed_control_second", false, false) ? Intrinsics.LJFF(C1915520zwk.LLILZLL.getValue(), Boolean.TRUE) : LJJII() && C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_non_personalized_search_second", false) == 1 && C288110BQz.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final int LJJJJIZL() {
        return C0XQ7.LJFF().isLogin() ? 2 : 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final MutableLiveData LJJIII() {
        return C1915520zwk.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final Class<?> LJJIJIIJIL() {
        return C1916970zz5.class;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final Object LJJIJL() {
        return new C10FJ() { // from class: X.0zyJ
            @Override // X.C10FJ
            public final void onFailed(Exception exc) {
            }

            @Override // X.C10FJ
            public final void Hl(PushSettings pushSettings) {
                C1703840uRK.LIZIZ.LIZ(pushSettings.audienceControlEnabled);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final MutableLiveData LJJJJZI() {
        return C1915520zwk.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LIZ(String str) {
        IClientSecurityService iClientSecurityService = (IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class);
        if (iClientSecurityService != null) {
            return iClientSecurityService.LIZ(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LIZIZ(String str) {
        IClientSecurityService iClientSecurityService;
        LocalTestApi localTestApi = (LocalTestApi) PluggableExtentionKt.pluggableSpi$default(LocalTestApi.class, false, false, false, 14, null);
        if ((localTestApi == null || !localTestApi.bypassUrlForWebViewIsolation(str)) && ((iClientSecurityService = (IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class)) == null || !iClientSecurityService.LIZIZ(str))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LIZJ(String str) {
        IClientSecurityService iClientSecurityService = (IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class);
        if (iClientSecurityService != null) {
            return iClientSecurityService.LIZJ(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LIZLLL(String str) {
        IClientSecurityService iClientSecurityService = (IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class);
        if (iClientSecurityService != null) {
            return iClientSecurityService.LJIILJJIL(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJ(String str) {
        IClientSecurityService iClientSecurityService = (IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class);
        if (iClientSecurityService != null) {
            return iClientSecurityService.LJ(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJIIIIZZ(String str) {
        IClientSecurityService iClientSecurityService = (IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class);
        if (iClientSecurityService != null) {
            return iClientSecurityService.LJIILL();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJIIJ(boolean z) {
        boolean z2;
        C1915520zwk c1915520zwk = C1915520zwk.LL;
        if (z) {
            z2 = C1915530zwl.LLILZ;
        } else {
            z2 = C1915530zwl.LLILZIL;
        }
        if (!z2) {
            C1902600zbu.LIZ.getClass();
            if (!C1902600zbu.LIZ()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJIIL(C19EG c19eg) {
        LJJJJL(C0QBA.DEFAULT);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJIILIIL(EnumC1916460zyG enumC1916460zyG) {
        int i = C1916450zyF.LIZ[enumC1916460zyG.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                return this.LIZJ;
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJIIZILJ(Context context) {
        C20684815ws.LJIILLIIL("click_app_trans_mstv", C2097608Jq.LJIIJ(new Pair("enter_from", "personal_homepage"), new Pair("is_login", String.valueOf(0))));
        if (context != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview");
            smartRouteBuildRoute.withParam("url", "https://www.tiktok.com/transparency/de-de/german-state-treaty/");
            smartRouteBuildRoute.withParam("use_spark", true);
            smartRouteBuildRoute.open();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJIJJ(boolean z) {
        C1915520zwk c1915520zwk = C1915520zwk.LL;
        return C1915520zwk.LJFF(z);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJIJLIJ(boolean z) {
        boolean z2;
        C1915520zwk c1915520zwk = C1915520zwk.LL;
        if (z) {
            z2 = C1915530zwl.LLILZ;
        } else {
            z2 = C1915530zwl.LLILZIL;
        }
        if (!z2 && !C288110BQz.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJIZ(Context context) {
        C15560067i.LIZIZ.getClass();
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        C0FNV.LIZJ(dialogC1389620mGW);
        C23250099c.LIZLLL(C15560067i.LIZLLL, null, null, new C102F(dialogC1389620mGW, context, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJJIL(boolean z) {
        C1915520zwk c1915520zwk = C1915520zwk.LL;
        C1915520zwk.LJI(z);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJJJI(AObjectS289S0200000_14 aObjectS289S0200000_14) {
        C1916360zy6 c1916360zy6 = new AbstractC1916470zyH() { // from class: X.0zy6
            public static final String LIZJ = "video_creation_intervention_prompt";

            @Override // X.AbstractC1916470zyH
            public final long LIZIZ() {
                return TimeUnit.SECONDS.toMillis(C0C64.LJIILLIIL().LJIJ(31744, 432000, "tns_video_intervention_frequency_control", true));
            }

            @Override // X.AbstractC191755100b
            public final String LIZ() {
                return LIZJ;
            }
        };
        if (c1916360zy6.LIZJ()) {
            aObjectS289S0200000_14.invoke();
            C20684815ws.onEventV3("tns_video_creation_intervention_prompt_show");
            C100Z.LJ(c1916360zy6.LIZ());
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final InterfaceC855080XgY LJJJJJ(AnsaPromptModel ansaPromptModel) {
        if (!(ansaPromptModel instanceof AnsaPromptModel)) {
            return null;
        }
        return new C436540H9w(ansaPromptModel);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJJJL(C0QBA c0qba) {
        IGatekeeperService iGatekeeperService;
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        List<DecisionMakerNetworkApi.PPFActionModel> list;
        TTKUserCommunicationService tTKUserCommunicationService;
        if (C1915530zwl.LLILZLL.getBoolean("is_eligible", false) && (iGatekeeperService = (IGatekeeperService) C1915530zwl.LLILLJJLI.getValue()) != null && (eligibilityModelLIZ = iGatekeeperService.LIZ("personalized_feeds")) != null && (list = eligibilityModelLIZ.actionList) != null && (!list.isEmpty()) && (tTKUserCommunicationService = (TTKUserCommunicationService) C1915530zwl.LLILLL.getValue()) != null) {
            tTKUserCommunicationService.LJIIIZ(list, C2097908Jt.LIZJ(new Pair("enter_from", c0qba.getEnterFrom())));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJIIIZ(EnumC1916460zyG enumC1916460zyG, boolean z) {
        int i = C1916450zyF.LIZ[enumC1916460zyG.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LIZJ = z;
                    return;
                }
                throw new C1954807lC();
            }
            this.LIZIZ = z;
            return;
        }
        this.LIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJIILLIIL(int i, final Function0<Unit> function0) {
        final int iIntValue;
        C102U.LIZ.getClass();
        C102T c102t = C102U.LIZJ;
        Integer numValueOf = c102t.LJ;
        if (numValueOf == null && (numValueOf = Integer.valueOf(c102t.LIZIZ.getInt("remove_photo_sensitive_status", 0))) == null) {
            iIntValue = 0;
        } else {
            iIntValue = numValueOf.intValue();
        }
        C102U.LJFF(i);
        C1260870iur<AbstractC666100QAu<BaseResponse>, C10F0> c1260870iurProvidePushSettingChangePresenter = C19296410eQ.LIZIZ.providePushSettingChangePresenter();
        c1260870iurProvidePushSettingChangePresenter.LJIIJJI(new C10F0() { // from class: X.0zy5
            @Override // X.C10F0
            public final void A() {
            }

            @Override // X.C10F0
            public final void rY() {
                C102U c102u = C102U.LIZ;
                int i2 = iIntValue;
                c102u.getClass();
                C102U.LJFF(i2);
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // X.C10F0
            public final void t00(int i2) {
                rY();
            }
        });
        c1260870iurProvidePushSettingChangePresenter.LIZJ("photosensitive_videos_setting", Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJIJJLI(final ViewGroup viewGroup, final C0TGX c0tgx) {
        if (C294570Bgd.LIZ()) {
            PopupManager.LJIIZILJ(new AbstractC20660815t0(viewGroup, c0tgx) { // from class: X.0TWN
                public final ViewGroup LL;

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 0;
                }

                {
                    super(c0tgx);
                    this.LL = viewGroup;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [T, X.15Pi] */
                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    C259800zU c259800zU = new C259800zU();
                    C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                    if (c19egLIZIZ != null) {
                        c259800zU.element = new C1257230ioz(this.LL, true).LIZ;
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0g);
                        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
                        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
                        float fLIZIZ = C418440Gaw.LIZIZ(999);
                        c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
                        c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
                        c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
                        c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
                        Drawable drawableLIZ = c384050F3z.LIZ(c19egLIZIZ);
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        c419910GdJ.LIZ = R.raw.icon_gear;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a0d);
                        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(c419910GdJ.LIZ(c19egLIZIZ), drawableLIZ);
                        C20515215Pi c20515215Pi = (C20515215Pi) c259800zU.element;
                        c20515215Pi.LJI(new AwS378S0200000_12(c19egLIZIZ, layerDrawableLJIILIIL, 38));
                        String strLJIIJ = C1383370m6R.LJIIJ(2131826730);
                        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                        c1057450dcl.LJ = strLJIIJ;
                        c1057450dcl.LIZJ = false;
                        String strLJIIJ2 = C1383370m6R.LJIIJ(2131826728);
                        String strLIZIZ = C1710306mr.LIZIZ(2131826729, strLJIIJ2);
                        SpannableString spannableString = new SpannableString(strLIZIZ);
                        int iLJJJ = a0.LJJJ(strLIZIZ, strLJIIJ2, 0, false, 6);
                        int length = strLJIIJ2.length() + iLJJJ;
                        C786410Ut5.p2(spannableString, new C785790Us5(c259800zU, c19egLIZIZ, c688120Qyw, 4), iLJJJ, length, 33);
                        C786410Ut5.p2(spannableString, new C444920HcY(82, true), iLJJJ, length, 33);
                        C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
                        c1057450dcl2.LJFF = spannableString;
                        c1057450dcl2.LJIIJ = 0;
                        c20515215Pi.LIZ.LJIILJJIL = new AwS591S0100000_12(c20656615sK, 657);
                        C20684815ws.onEventV3("aac_prompt_shown");
                        UserRecordActionApi.LIZ.getClass();
                        C632140Oqq.LIZLLL(C0TWQ.LIZIZ.recordAction("audience_control_prompt"), "/tiktok/v1/user/record_action", null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0TWO
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("CreatorLevelAudienceControlPopTask@ef63.showPopup$1$3");
                                C1C7U.LIZIZ("CreatorLevelAudienceControlPopTask@ef63.showPopup$1$3");
                            }
                        }, new C09JN() { // from class: X.0TWP
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("CreatorLevelAudienceControlPopTask@ef63.showPopup$1$4");
                                C1C7U.LIZIZ("CreatorLevelAudienceControlPopTask@ef63.showPopup$1$4");
                            }
                        });
                        ((C20515215Pi) c259800zU.element).LJ();
                    }
                }
            }, new C1668306g5("pns_compliance_creator_level_audience_control_banner_trigger"));
        } else {
            PopupManager.LJIJI(new AbstractC20660815t0(viewGroup, c0tgx) { // from class: X.0TWN
                public final ViewGroup LL;

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 0;
                }

                {
                    super(c0tgx);
                    this.LL = viewGroup;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [T, X.15Pi] */
                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    C259800zU c259800zU = new C259800zU();
                    C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                    if (c19egLIZIZ != null) {
                        c259800zU.element = new C1257230ioz(this.LL, true).LIZ;
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0g);
                        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
                        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
                        float fLIZIZ = C418440Gaw.LIZIZ(999);
                        c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
                        c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
                        c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
                        c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
                        Drawable drawableLIZ = c384050F3z.LIZ(c19egLIZIZ);
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        c419910GdJ.LIZ = R.raw.icon_gear;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a0d);
                        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(c419910GdJ.LIZ(c19egLIZIZ), drawableLIZ);
                        C20515215Pi c20515215Pi = (C20515215Pi) c259800zU.element;
                        c20515215Pi.LJI(new AwS378S0200000_12(c19egLIZIZ, layerDrawableLJIILIIL, 38));
                        String strLJIIJ = C1383370m6R.LJIIJ(2131826730);
                        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                        c1057450dcl.LJ = strLJIIJ;
                        c1057450dcl.LIZJ = false;
                        String strLJIIJ2 = C1383370m6R.LJIIJ(2131826728);
                        String strLIZIZ = C1710306mr.LIZIZ(2131826729, strLJIIJ2);
                        SpannableString spannableString = new SpannableString(strLIZIZ);
                        int iLJJJ = a0.LJJJ(strLIZIZ, strLJIIJ2, 0, false, 6);
                        int length = strLJIIJ2.length() + iLJJJ;
                        C786410Ut5.p2(spannableString, new C785790Us5(c259800zU, c19egLIZIZ, c688120Qyw, 4), iLJJJ, length, 33);
                        C786410Ut5.p2(spannableString, new C444920HcY(82, true), iLJJJ, length, 33);
                        C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
                        c1057450dcl2.LJFF = spannableString;
                        c1057450dcl2.LJIIJ = 0;
                        c20515215Pi.LIZ.LJIILJJIL = new AwS591S0100000_12(c20656615sK, 657);
                        C20684815ws.onEventV3("aac_prompt_shown");
                        UserRecordActionApi.LIZ.getClass();
                        C632140Oqq.LIZLLL(C0TWQ.LIZIZ.recordAction("audience_control_prompt"), "/tiktok/v1/user/record_action", null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0TWO
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("CreatorLevelAudienceControlPopTask@ef63.showPopup$1$3");
                                C1C7U.LIZIZ("CreatorLevelAudienceControlPopTask@ef63.showPopup$1$3");
                            }
                        }, new C09JN() { // from class: X.0TWP
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("CreatorLevelAudienceControlPopTask@ef63.showPopup$1$4");
                                C1C7U.LIZIZ("CreatorLevelAudienceControlPopTask@ef63.showPopup$1$4");
                            }
                        });
                        ((C20515215Pi) c259800zU.element).LJ();
                    }
                }
            }, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final Spanned LJIL(Context context, TextWithInlineLink textWithInlineLink) {
        return C03GZ.LIZ(textWithInlineLink, context, null, 6);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final Fragment LJJI(boolean z, C1916400zyA c1916400zyA) {
        C1902600zbu.LIZ.getClass();
        if (!C1902600zbu.LIZ()) {
            return null;
        }
        ManageFeedsPanelFragment manageFeedsPanelFragment = new ManageFeedsPanelFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_in_sheet", z);
        manageFeedsPanelFragment.setArguments(bundle);
        manageFeedsPanelFragment.LLIZ = c1916400zyA;
        manageFeedsPanelFragment.LLIZLLLIL = null;
        return manageFeedsPanelFragment;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJJJLL(Aweme aweme, Function1<? super Boolean, Unit> function1) {
        if (!C729980SkG.LJIIIIZZ(aweme)) {
            C547860LeC.LIZ.getClass();
            if (C547860LeC.LIZLLL().LIZIZ(aweme)) {
                function1.invoke(Boolean.FALSE);
                return;
            }
        }
        TrashBinExperiment.TrashBinConfig trashBinConfig = (TrashBinExperiment.TrashBinConfig) C0C64.LJIILLIIL().LJJII(TrashBinExperiment.TrashBinConfig.class, TrashBinExperiment.LIZ, "post_trash_bin", true);
        if (trashBinConfig != null && trashBinConfig.enable) {
            C11NZ<DeleteCheckItemRecyclableResponse> c11nzCheckItemRecyclable = ((TrashBinApiManager.TrashBinApi) TrashBinApiManager.LIZ.getValue()).checkItemRecyclable(aweme.getAid(), 1);
            if (ComplianceServiceProvider.LJIJJ().LJJ()) {
                c11nzCheckItemRecyclable = C11NZ.LJIJJLI(new C1852020yIK(c11nzCheckItemRecyclable, "/aweme/v1/aweme/deletion/constraints/", null));
            }
            c11nzCheckItemRecyclable.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS171S0100000_2(function1, 2), new AfS171S0100000_2(function1, 3));
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0hrQ, X.0zvj, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJJJJL(final C19EG c19eg, final String str, final String str2) {
        String str3 = ManageFeedsPanelFragment._pnsPageId;
        ?? r3 = new InterfaceC1220300hrQ() { // from class: X.0zvj
            @Override // X.InterfaceC1220300hrQ
            public final void LJ(String str4) {
            }

            @Override // X.InterfaceC1220300hrQ
            public final void LIZ() {
                FragmentManager supportFragmentManager;
                Fragment fragmentLJJJJZI;
                FragmentManager childFragmentManager;
                Fragment fragmentLJJJJZI2;
                C19EG c19eg2 = c19eg;
                if (c19eg2 == null || (supportFragmentManager = c19eg2.getSupportFragmentManager()) == null || (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("ManageFeedsSheet")) == null || (childFragmentManager = fragmentLJJJJZI.getChildFragmentManager()) == null || (fragmentLJJJJZI2 = childFragmentManager.LJJJJZI("sheet_content_fragment")) == null) {
                    return;
                }
                String str4 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(fragmentLJJJJZI2, C343980De8.LIZ);
            }

            public final void LJFF() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_method", str2);
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("login_type", ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() ? "1" : CardStruct.IStatusCode.DEFAULT);
                C20684815ws.LJIILLIIL("manage_feeds_pop_up", c2344009Gk.LIZ);
            }

            @Override // X.InterfaceC1220300hrQ
            public final void LIZIZ(String str4) {
                String str5;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_method", str2);
                c2344009Gk.LJIIIIZZ("enter_from", str);
                if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    str5 = "1";
                } else {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("login_type", str5);
                C20684815ws.LJIILLIIL("close_manage_feeds_pop_up", c2344009Gk.LIZ);
            }

            @Override // X.InterfaceC1220300hrQ
            public final void LIZJ(boolean z) {
                String str4;
                String str5;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_method", str2);
                c2344009Gk.LJIIIIZZ("enter_from", str);
                if (z) {
                    str4 = "on";
                } else {
                    str4 = "off";
                }
                c2344009Gk.LJIIIIZZ("value", str4);
                if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    str5 = "1";
                } else {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("login_type", str5);
                C20684815ws.LJIILLIIL("switch_personalization_toggle", c2344009Gk.LIZ);
            }

            @Override // X.InterfaceC1220300hrQ
            public final void LIZLLL(boolean z) {
                String str4;
                String str5;
                FragmentManager supportFragmentManager;
                Fragment fragmentLJJJJZI;
                FragmentManager childFragmentManager;
                Fragment fragmentLJJJJZI2;
                C19EG c19eg2 = c19eg;
                if (c19eg2 != null && (supportFragmentManager = c19eg2.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("ManageFeedsSheet")) != null && (childFragmentManager = fragmentLJJJJZI.getChildFragmentManager()) != null && (fragmentLJJJJZI2 = childFragmentManager.LJJJJZI("sheet_content_fragment")) != null) {
                    String str6 = TuxSheet._pnsPageId;
                    C1391190mJ3.LJFF(fragmentLJJJJZI2, C1914900zvk.LIZ);
                }
                int i = 1;
                if (z == (!Intrinsics.LJFF(C1915520zwk.LLILZLL.getValue(), Boolean.TRUE))) {
                    i = 0;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_method", str2);
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LIZJ(i, "flag");
                if (z) {
                    str4 = "on";
                } else {
                    str4 = "off";
                }
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str4);
                if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    str5 = "1";
                } else {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("login_type", str5);
                C20684815ws.LJIILLIIL("confirm_personalization_status_change", c2344009Gk.LIZ);
            }
        };
        if (c19eg != null) {
            C1915520zwk c1915520zwk = C1915520zwk.LL;
            if (!C1915530zwl.LLILZ) {
                C1902600zbu.LIZ.getClass();
                if (!C1902600zbu.LIZ()) {
                    return;
                }
            }
            ManageFeedsPanelFragment manageFeedsPanelFragment = new ManageFeedsPanelFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_in_sheet", true);
            manageFeedsPanelFragment.setArguments(bundle);
            manageFeedsPanelFragment.LLIZ = r3;
            manageFeedsPanelFragment.LLIZLLLIL = null;
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = manageFeedsPanelFragment;
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC19333210kM(r3, 4);
            C1391850mK7.LIZIZ(tuxSheet, "fyp_non_personalized_feeds_nscreen");
            tuxSheet.show(c19eg.getSupportFragmentManager(), "ManageFeedsSheet");
            r3.LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJ(String str, String str2, String str3, String str4) {
        if (!Intrinsics.LJFF(str, str3) && Intrinsics.LJFF(str2, str4) && C123100dR.LIZ(str4)) {
            ScheduledExecutorService scheduledExecutorServiceF4 = C786410Ut5.f4(1);
            this.LJI = scheduledExecutorServiceF4;
            this.LJII = 0;
            this.LJIIIIZZ = false;
            scheduledExecutorServiceF4.scheduleAtFixedRate(new ARunnableS128S0100000_28(this, 4), 0L, 2L, TimeUnit.SECONDS);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJIIJ(Context context, C0HTT<? extends IEvent> c0htt, Aweme aweme, boolean z) {
        int i;
        C20684815ws.onEventV3("tns_video_delete_notice_popup_show");
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131830518);
        if (z) {
            i = 2131844934;
        } else {
            i = 2131830517;
        }
        c1397580mTM.LIZ(i);
        C985403tE.LIZ(c1397580mTM, new AwS60S0210000_6((C0HTT) c0htt, (C0HTT<? extends IEvent>) aweme, (Aweme) z, false));
        c1397580mTM.LJ(AFwS271S0000000_28.get$arr$(38));
        c1397580mTM.LIZLLL(AFwS271S0000000_28.get$arr$(39));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJIJIL(C19EG c19eg, C1390810mIR c1390810mIR, boolean z, boolean z2) {
        String str = StemWelcomePopupFragment._pnsPageId;
        if (c19eg != null) {
            StemWelcomePopupFragment stemWelcomePopupFragment = new StemWelcomePopupFragment();
            stemWelcomePopupFragment.LLIZ = c1390810mIR;
            stemWelcomePopupFragment.LLJ = z2;
            stemWelcomePopupFragment.LLIZLLLIL = z;
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = stemWelcomePopupFragment;
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0zyC
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                }
            };
            tuxSheet.show(c19eg.getSupportFragmentManager(), "StemPopupSheet");
            c1390810mIR.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final C06MW LJJJJLI(Context context, int i, String str, String str2, String str3, InterfaceC1916320zy2 interfaceC1916320zy2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFBVObserver called from ");
        sbLIZ.append(str2);
        C201955140j.LIZIZ("ComplianceBusinessServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        return new FBVNoticeObserver(context, i, (C1916250zxv) this.LIZLLL.getValue(), (C1518520pcQ) this.LJ.getValue(), str, str2, str3, interfaceC1916320zy2);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0zvi, X.0zwh, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJIL(final Fragment fragment, C19EG c19eg, final String str, final String str2, final View view, final String str3, final Function0<Unit> function0) {
        String str4 = SearchPersonalizedPanelFragment._pnsPageId;
        ?? r5 = new InterfaceC1915490zwh() { // from class: X.0zvi
            public boolean LIZ;
            public boolean LIZIZ;

            @Override // X.InterfaceC1915490zwh
            public final void LIZ() {
            }

            @Override // X.InterfaceC1915490zwh
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1915490zwh
            public final void LJ() {
            }

            @Override // X.InterfaceC1915490zwh
            public final void LIZIZ() {
                if (this.LIZIZ) {
                    return;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("button_type", "click_close");
                c2344009Gk.LJIIIIZZ("search_id", str2);
                String str5 = str3;
                if (str5 != null) {
                    c2344009Gk.LJFF("enter_method", str5);
                }
                C20684815ws.LJIILLIIL("manage_search_popup_click", c2344009Gk.LIZ);
                View view2 = view;
                if (view2 != null) {
                    C658190Prl.LIZ(fragment, view2, Lifecycle.State.RESUMED);
                }
            }

            public final void LJFF() {
                String str5 = Intrinsics.LJFF(C1915520zwk.LLIZLLLIL.getValue(), Boolean.TRUE) ? "off" : "on";
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("switch_status", str5);
                c2344009Gk.LJIIIIZZ("search_id", str2);
                String str6 = str3;
                if (str6 != null) {
                    c2344009Gk.LJFF("enter_method", str6);
                }
                C20684815ws.LJIILLIIL("manage_search_popup_show", c2344009Gk.LIZ);
                View view2 = view;
                if (view2 != null) {
                    C658190Prl.LIZ(fragment, view2, Lifecycle.State.STARTED);
                }
            }

            @Override // X.InterfaceC1915490zwh
            public final void LIZLLL(boolean z) {
                int i = 1;
                this.LIZIZ = true;
                boolean z2 = !this.LIZ;
                if (z2 != z) {
                    function0.invoke();
                }
                if (z2) {
                    if (z) {
                        i = 4;
                    }
                } else if (z) {
                    i = 2;
                } else {
                    i = 3;
                }
                this.LIZ = z;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("button_type", "click_done");
                c2344009Gk.LJIIIIZZ("search_id", str2);
                c2344009Gk.LIZJ(i, "switch_event");
                String str5 = str3;
                if (str5 != null) {
                    c2344009Gk.LJFF("enter_method", str5);
                }
                C20684815ws.LJIILLIIL("manage_search_popup_click", c2344009Gk.LIZ);
                View view2 = view;
                if (view2 != null) {
                    C658190Prl.LIZ(fragment, view2, Lifecycle.State.RESUMED);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                boolean zBooleanValue;
                Boolean bool = (Boolean) C1915520zwk.LLIZLLLIL.getValue();
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                this.LIZ = zBooleanValue;
            }
        };
        if (c19eg != null && C288110BQz.LIZ()) {
            SearchPersonalizedPanelFragment searchPersonalizedPanelFragment = new SearchPersonalizedPanelFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_in_sheet", true);
            searchPersonalizedPanelFragment.setArguments(bundle);
            searchPersonalizedPanelFragment.LLIZ = r5;
            searchPersonalizedPanelFragment.LLIZLLLIL = null;
            SAFHelper.LIZ.getClass();
            FragmentManager fragmentManagerLJIILJJIL = SAFHelper.LJIILJJIL(fragment, c19eg);
            if (fragmentManagerLJIILJJIL != null) {
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJJIJI = searchPersonalizedPanelFragment;
                c1390920mIc.LJIIIIZZ(1);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJIIJIL = true;
                tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC19333210kM(r5, 5);
                tuxSheet.show(fragmentManagerLJIILJJIL, "ManageSearchSheet");
            }
            r5.LJFF();
        }
    }
}
