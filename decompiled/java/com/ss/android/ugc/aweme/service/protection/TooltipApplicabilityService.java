package com.ss.android.ugc.aweme.service.protection;

import X.C04TD;
import X.C0XQ7;
import X.C1911930zqx;
import X.C19243310Qd;
import X.C19243710Qh;
import X.C2188811AlT;
import X.InterfaceC19244510Qp;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection;

/* JADX INFO: loaded from: classes29.dex */
public final class TooltipApplicabilityService implements ITooltipApplicabilityService {
    public static ITooltipApplicabilityService LJII() {
        Object objLIZ = C04TD.LIZ(ITooltipApplicabilityService.class, false);
        if (objLIZ != null) {
            return (ITooltipApplicabilityService) objLIZ;
        }
        if (C04TD.t4 == null) {
            synchronized (ITooltipApplicabilityService.class) {
                if (C04TD.t4 == null) {
                    C04TD.t4 = new TooltipApplicabilityService();
                }
            }
        }
        return C04TD.t4;
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final int LIZIZ() {
        C1911930zqx.LIZ.getClass();
        return Keva.getRepo("tooltip_protection").getInt("active_days", 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b A[PHI: r1
      0x005b: PHI (r1v2 boolean) = (r1v1 boolean), (r1v4 boolean), (r1v4 boolean), (r1v4 boolean) binds: [B:26:0x0058, B:15:0x0043, B:17:0x0047, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection r0 = X.C19243710Qh.LIZ
            X.C19243310Qd.LIZ()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.plugin.IPluginService> r0 = com.ss.android.ugc.aweme.plugin.IPluginService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.plugin.IPluginService r0 = (com.ss.android.ugc.aweme.plugin.IPluginService) r0
            java.util.List r0 = r0.getCurrentPluginListPluginData()
            java.util.Iterator r4 = r0.iterator()
        L19:
            boolean r0 = r4.hasNext()
            r3 = 0
            if (r0 == 0) goto L5d
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r0
            int r1 = r0.id
            X.10Pl r0 = X.EnumC19241510Pl.TOOLTIP_PROTECTION
            int r0 = r0.getValue()
            if (r1 != r0) goto L19
        L31:
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r2 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r2
            if (r2 == 0) goto L55
            com.ss.android.ugc.aweme.plugin.IPluginService$ShowConfig r0 = r2.showConfig
            if (r0 == 0) goto L57
            java.lang.Boolean r0 = r0.shouldShow
            if (r0 == 0) goto L57
            boolean r1 = r0.booleanValue()
        L41:
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r2.configData
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection r0 = r0.tooltipDataProtection
            if (r0 == 0) goto L5b
            java.lang.Boolean r0 = r0.enabled
            if (r0 == 0) goto L5b
            boolean r0 = r0.booleanValue()
        L51:
            if (r1 == 0) goto L56
            if (r0 == 0) goto L56
        L55:
            r3 = 1
        L56:
            return r3
        L57:
            r1 = 1
            if (r2 == 0) goto L5b
            goto L41
        L5b:
            r0 = 1
            goto L51
        L5d:
            r2 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.protection.TooltipApplicabilityService.LJ():boolean");
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final boolean LJFF() {
        C1911930zqx.LIZ.getClass();
        return C1911930zqx.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final boolean isNewUser() {
        C1911930zqx.LIZ.getClass();
        return C1911930zqx.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final boolean LIZ() {
        return C0XQ7.LJFF().isLogin();
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final int LIZJ(InterfaceC19244510Qp interfaceC19244510Qp) {
        TooltipProtectionModel$TooltipDataProtection tooltipProtectionModel$TooltipDataProtection = C19243710Qh.LIZ;
        return C19243310Qd.LIZ().LIZ(interfaceC19244510Qp);
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final boolean LIZLLL(InterfaceC19244510Qp interfaceC19244510Qp) {
        TooltipProtectionModel$TooltipDataProtection tooltipProtectionModel$TooltipDataProtection = C19243710Qh.LIZ;
        return C19243310Qd.LIZ().LIZIZ(interfaceC19244510Qp);
    }

    @Override // com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService
    public final void LJI(String str) {
        C1911930zqx.LIZ.getClass();
        Keva keva = C1911930zqx.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new_user_");
        sbLIZ.append(str);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }
}
