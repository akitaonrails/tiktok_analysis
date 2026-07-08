package com.ss.android.ugc.aweme.compliance.business.settings;

import X.C11NZ;
import X.C191807102b;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.compliance.api.model.CmplRespForEncrypt;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.UltimateCmplSettings;

/* JADX INFO: loaded from: classes29.dex */
public interface ComplianceApi {
    public static final C191807102b LIZ = C191807102b.LIZ;

    @InterfaceC1501200pAU("/tiktok/v1/ultimate/cmpl/settings/")
    C11NZ<UltimateCmplSettings> LIZ();

    @InterfaceC1501200pAU("/aweme/v1/compliance/settings/")
    C11NZ<ComplianceSetting> getComplianceSetting(@InterfaceC1501070pAH("teen_mode_status") int i, @InterfaceC1501070pAH("ftc_child_mode") int i2, @InterfaceC1501070pAH("is_new_user") int i3);

    @InterfaceC1501240pAY("/aweme/v1/cmpl/set/settings/")
    C11NZ<CmplRespForEncrypt> setComplianceSettings(@InterfaceC1501070pAH("settings") String str, @InterfaceC1501070pAH("from_nuj") String str2);
}
