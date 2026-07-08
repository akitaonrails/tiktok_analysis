package com.ss.android.ugc.aweme.compliance.business.gatekeeper.lancet;

import X.AbstractC2211791BhR;
import X.C01GW;
import X.C08GP;
import X.C0C64;
import X.C1AF0;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2238791Cjt;
import X.C282310B4r;
import X.C452501pT;
import X.C799520VXy;
import X.C821850WLv;
import X.C828420Wee;
import android.view.View;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityLynxService;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebNavigationService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IComplianceFeatureService;
import com.ss.android.ugc.aweme.compliance.business.gatekeeper.lancet.ComplianceFeatureServiceImpl;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.experiments.ComplianceActivityProcessorAB;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.experiments.LiveIntegrationAB;
import java.lang.reflect.Field;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class ComplianceFeatureServiceImpl implements IComplianceFeatureService {
    public long LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2238791Cjt());

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IComplianceFeatureService
    public final void LIZ() {
        SparkSecurityServiceCenter sparkSecurityServiceCenter = SparkSecurityServiceCenter.INSTANCE;
        sparkSecurityServiceCenter.registerService(SparkSecurityWebNavigationService.class, new SparkSecurityWebNavigationService() { // from class: com.ss.android.ugc.aweme.compliance.business.gatekeeper.lancet.ComplianceFeatureServiceImpl$configGatekeeperCrossPlatformSignal$1
            @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
            public boolean interceptable() {
                return false;
            }

            @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebNavigationService
            public C821850WLv handleWebViewWillStartNavigation(C828420Wee c828420Wee) {
                this.LIZ.LIZLLL(c828420Wee);
                return null;
            }
        });
        sparkSecurityServiceCenter.registerService(SparkSecurityLynxService.class, new SparkSecurityLynxService() { // from class: com.ss.android.ugc.aweme.compliance.business.gatekeeper.lancet.ComplianceFeatureServiceImpl$configGatekeeperCrossPlatformSignal$2
            @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityLynxService
            public C821850WLv handleLynxTemplateVerify(C828420Wee c828420Wee) {
                return null;
            }

            @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
            public boolean interceptable() {
                return false;
            }

            @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityLynxService
            public C821850WLv handleWillLoadLynxTemplateWithEvent(C828420Wee c828420Wee) {
                this.LIZ.LIZLLL(c828420Wee);
                return null;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IComplianceFeatureService
    public final boolean LIZIZ() {
        return ComplianceActivityProcessorAB.INSTANCE.isEnabled();
    }

    public static String LIZJ(Object obj) {
        String str;
        try {
            Field declaredField = obj.getClass().getDeclaredField("_pnsPageId");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            if (str != null) {
                return C08GP.LIZ(str);
            }
            return "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getPnsPageId failed, Exception = ");
            sbLIZ.append(th);
            C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
            String canonicalName = obj.getClass().getCanonicalName();
            if (canonicalName != null) {
                return canonicalName;
            }
            return "";
        }
    }

    public final void LIZLLL(C828420Wee c828420Wee) {
        Object obj = c828420Wee.LJFF.get("URL");
        IGatekeeperService iGatekeeperService = (IGatekeeperService) this.LIZIZ.getValue();
        if (iGatekeeperService != null) {
            iGatekeeperService.LJIIIIZZ("GeneralUITransitionSignal", C799520VXy.LIZ(new Pair("pnsWebPageUrl", obj)), null);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IComplianceFeatureService
    public final void triggerComplianceCheck(View view, final String str, final Object obj) {
        if ((Intrinsics.LJFF(str, "tiktok_live_play") || Intrinsics.LJFF(str, "tiktok_live_broadcast")) && !LiveIntegrationAB.INSTANCE.isEnabled()) {
            return;
        }
        if (Intrinsics.LJFF(str, "general_compliance_enforcement") && !C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "consentbox_userlogin_experiment_android", true, false)) {
            return;
        }
        if (((Boolean) C282310B4r.LIZ.getValue()).booleanValue()) {
            final String strLIZJ = LIZJ(obj);
            C2211631BhB.LIZLLL(view, new AbstractC2211791BhR(str, this, strLIZJ) { // from class: X.1Cjr
                public final C2238761Cjq LJ;

                @Override // X.AbstractC2211791BhR
                public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                    return this.LJ;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.1Cjq] */
                {
                    this.LJ = new InterfaceC2211931Bhf() { // from class: X.1Cjq
                        @Override // X.InterfaceC2211931Bhf
                        public final void LIZ(View view2, String str2) {
                            if (Intrinsics.LJFF(str, "general_compliance_enforcement")) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                ComplianceFeatureServiceImpl complianceFeatureServiceImpl = this;
                                if (jCurrentTimeMillis - complianceFeatureServiceImpl.LIZ <= 500) {
                                    return;
                                }
                                IGatekeeperService iGatekeeperService = (IGatekeeperService) complianceFeatureServiceImpl.LIZIZ.getValue();
                                if (iGatekeeperService != null) {
                                    iGatekeeperService.LJIIIIZZ("GeneralUITransitionSignal", C799520VXy.LIZ(new Pair("pnsPageId", strLIZJ)), null);
                                }
                                this.LIZ = jCurrentTimeMillis;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("General ui transition signal for ");
                                sbLIZ.append(strLIZJ);
                                sbLIZ.append(" triggered");
                                C2188811AlT.LIZIZ(sbLIZ);
                                return;
                            }
                            IGatekeeperService iGatekeeperService2 = (IGatekeeperService) this.LIZIZ.getValue();
                            if (iGatekeeperService2 != null) {
                                iGatekeeperService2.LJIIIIZZ("FeatureAccessTaskSignal", C799520VXy.LIZ(new Pair("fid", str)), null);
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Gatekeeper feature signal for ");
                            sbLIZ2.append(str);
                            sbLIZ2.append(" triggered");
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                    };
                }
            });
        } else {
            C2211631BhB.LIZLLL(view, new AbstractC2211791BhR(str, this, obj) { // from class: X.1Cjs
                public final C2238751Cjp LJ;

                @Override // X.AbstractC2211791BhR
                public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                    return this.LJ;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.1Cjp] */
                {
                    this.LJ = new InterfaceC2211931Bhf() { // from class: X.1Cjp
                        @Override // X.InterfaceC2211931Bhf
                        public final void LIZ(View view2, String str2) {
                            if (Intrinsics.LJFF(str, "general_compliance_enforcement")) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (jCurrentTimeMillis - this.LIZ <= 500) {
                                    return;
                                }
                                String strLIZJ2 = ComplianceFeatureServiceImpl.LIZJ(obj);
                                IGatekeeperService iGatekeeperService = (IGatekeeperService) this.LIZIZ.getValue();
                                if (iGatekeeperService != null) {
                                    iGatekeeperService.LJIIIIZZ("GeneralUITransitionSignal", C799520VXy.LIZ(new Pair("pnsPageId", strLIZJ2)), null);
                                }
                                this.LIZ = jCurrentTimeMillis;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("General ui transition signal for ");
                                sbLIZ.append(strLIZJ2);
                                sbLIZ.append(" triggered");
                                C2188811AlT.LIZIZ(sbLIZ);
                                return;
                            }
                            IGatekeeperService iGatekeeperService2 = (IGatekeeperService) this.LIZIZ.getValue();
                            if (iGatekeeperService2 != null) {
                                iGatekeeperService2.LJIIIIZZ("FeatureAccessTaskSignal", C799520VXy.LIZ(new Pair("fid", str)), null);
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Gatekeeper feature signal for ");
                            sbLIZ2.append(str);
                            sbLIZ2.append(" triggered");
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                    };
                }
            });
        }
    }
}
