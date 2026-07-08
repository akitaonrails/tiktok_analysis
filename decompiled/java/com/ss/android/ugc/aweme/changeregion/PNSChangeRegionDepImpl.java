package com.ss.android.ugc.aweme.changeregion;

import X.C1916220zxs;
import X.C2222691Bz1;
import X.InterfaceC1119904Zp;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionDep;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IJsbBroadcastService;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS392S0200000_26;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSChangeRegionDepImpl implements IPNSChangeRegionDep {
    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionDep
    public final void LJI() {
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionDep
    public final void LJFF() {
        IComplianceBusinessService iComplianceBusinessService = (IComplianceBusinessService) PluggableExtentionKt.pluggableSpi$default(IComplianceBusinessService.class, false, false, false, 14, null);
        if (iComplianceBusinessService != null) {
            iComplianceBusinessService.LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionDep
    public final void LJIIJ() {
        ISettingManagerService iSettingManagerService = (ISettingManagerService) PluggableExtentionKt.pluggableSpi$default(ISettingManagerService.class, false, false, false, 14, null);
        if (iSettingManagerService != null) {
            iSettingManagerService.LIZIZ(3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0uRP] */
    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionDep
    public final void init() {
        IJsbBroadcastService iJsbBroadcastService = (IJsbBroadcastService) PluggableExtentionKt.pluggableSpi$default(IJsbBroadcastService.class, false, false, false, 14, null);
        if (iJsbBroadcastService != 0) {
            iJsbBroadcastService.LJIIIZ(new InterfaceC1119904Zp() { // from class: X.0uRP
                @Override // X.InterfaceC1119904Zp
                public final void LIZ(Map<String, String> map) {
                    C20684815ws.LJIILLIIL("set_signup_region", C2097908Jt.LIZJ(new Pair("region_selected", map.get("countryCode"))));
                    IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
                    if (iPNSChangeRegionService != null) {
                        iPNSChangeRegionService.LJIIIZ(1, map.get("countryCode"), map.get("localizedCountryName"), "user_selected");
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionDep
    public final String getCurrentRegionCode() {
        return C2222691Bz1.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionDep
    public final void LJIIIIZZ() {
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionDep
    public final void LJII(AwS392S0200000_26 awS392S0200000_26) {
        IComplianceSettingsService iComplianceSettingsService = (IComplianceSettingsService) PluggableExtentionKt.pluggableSpi$default(IComplianceSettingsService.class, false, false, false, 14, null);
        if (iComplianceSettingsService != null) {
            iComplianceSettingsService.LJIJJLI(new C1916220zxs(awS392S0200000_26), 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionDep
    public final void LJIIIZ(boolean z) {
        ComplianceServiceProvider.LJJII().LIZLLL(z);
    }
}
