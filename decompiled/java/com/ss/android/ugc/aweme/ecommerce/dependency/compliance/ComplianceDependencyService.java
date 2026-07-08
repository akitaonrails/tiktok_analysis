package com.ss.android.ugc.aweme.ecommerce.dependency.compliance;

import X.C04TD;
import X.C1876860ywO;
import X.C1887750zDx;
import X.C1906200zhi;
import X.C1906210zhj;
import X.C1915720zx4;
import X.C2429209fW;
import X.EnumC1876780ywG;
import X.EnumC992703uP;
import X.InterfaceC1631620sYq;
import X.InterfaceC1915880zxK;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IComplianceFeatureService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS40S0010000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class ComplianceDependencyService implements IComplianceDependencyService {
    public String convertComplianceKey(String str) {
        return str;
    }

    public void initService() {
    }

    public static IComplianceDependencyService createIComplianceDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IComplianceDependencyService.class, z);
        if (objLIZ != null) {
            return (IComplianceDependencyService) objLIZ;
        }
        if (C04TD.f == null) {
            synchronized (IComplianceDependencyService.class) {
                if (C04TD.f == null) {
                    C04TD.f = new ComplianceDependencyService();
                }
            }
        }
        return C04TD.f;
    }

    private final EnumC1876780ywG getConsentStatus(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return EnumC1876780ywG.NOTDETERMINED;
                    }
                    return EnumC1876780ywG.REJECT;
                }
                return EnumC1876780ywG.APPROVE;
            }
            return EnumC1876780ywG.UNSUPPORTED;
        }
        return EnumC1876780ywG.CONSENT_NOT_PRESENT_IN_CACHE;
    }

    public String convertDataFlowId(EnumC992703uP enumC992703uP) {
        return enumC992703uP.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService
    public Bundle appendDataFlowId(Bundle bundle, EnumC992703uP enumC992703uP) {
        return C2429209fW.LIZ().appendDataFlowId(bundle, convertDataFlowId(enumC992703uP));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService
    public Bundle appendDataFlowId(Bundle bundle, String str) {
        return C2429209fW.LIZ().appendDataFlowId(bundle, str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService
    public void appendDataFlowId(Intent intent, int i) {
        C2429209fW.LIZ().appendDataFlowId(intent, i);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService
    public void triggerComplianceCheck(View view, String str, Object obj) {
        IComplianceFeatureService iComplianceFeatureService = (IComplianceFeatureService) PluggableExtentionKt.pluggableSpi$default(IComplianceFeatureService.class, false, false, false, 14, null);
        if (iComplianceFeatureService != null) {
            convertComplianceKey(str);
            iComplianceFeatureService.triggerComplianceCheck(view, str, obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService
    public boolean addSystemCalendarEvent(Activity activity, long j, long j2, String str) {
        return C1906200zhi.LIZ(new C1906200zhi(), new C1906210zhj(str, "", j, j2, "", -1, -1, false), activity);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService
    public void updatePNSConsentStatus(List<C1887750zDx> list, String str, boolean z, final InterfaceC1631620sYq<? super Boolean, ? super Integer, ? super String, Unit> interfaceC1631620sYq) {
        ArrayList arrayList = new ArrayList();
        for (C1887750zDx c1887750zDx : list) {
            EnumC1876780ywG consentStatus = getConsentStatus(c1887750zDx.LIZIZ);
            if (consentStatus != null) {
                arrayList.add(new C1876860ywO(c1887750zDx.LIZ, consentStatus, c1887750zDx.LIZJ, c1887750zDx.LIZLLL, new AwS40S0010000_28(z, 4), null, 80));
            }
        }
        IPNSConsentSDKConfigService iPNSConsentSDKConfigService = (IPNSConsentSDKConfigService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentSDKConfigService.class, false, false, false, 14, null);
        if (iPNSConsentSDKConfigService != null && iPNSConsentSDKConfigService.LIZ() != null) {
            if (str == null) {
                str = "";
            }
            C1915720zx4.LJIIIIZZ(new InterfaceC1915880zxK() { // from class: X.0zDw
                @Override // X.InterfaceC1915880zxK
                public final void LIZ(int i, String str2) {
                    InterfaceC1631620sYq<Boolean, Integer, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                    if (interfaceC1631620sYq2 != null) {
                        interfaceC1631620sYq2.invoke(Boolean.TRUE, Integer.valueOf(i), str2);
                    }
                }

                @Override // X.InterfaceC1915880zxK
                public final void onFailure(int i, String str2) {
                    InterfaceC1631620sYq<Boolean, Integer, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                    if (interfaceC1631620sYq2 != null) {
                        interfaceC1631620sYq2.invoke(Boolean.FALSE, Integer.valueOf(i), str2);
                    }
                }
            }, str, arrayList);
        }
    }
}
