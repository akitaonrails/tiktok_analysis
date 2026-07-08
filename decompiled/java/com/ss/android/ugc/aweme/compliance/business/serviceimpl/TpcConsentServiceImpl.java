package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.C01GW;
import X.C052A;
import X.C102E;
import X.C1697810uHb;
import X.C1916110zxh;
import X.C1916120zxi;
import X.C1916130zxj;
import X.C1916140zxk;
import X.C452501pT;
import X.EnumC1915930zxP;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AutobackupService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes29.dex */
public final class TpcConsentServiceImpl implements ITpcConsentService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C052A());

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LIZIZ() {
        C1916120zxi.LIZLLL.getValue().LIZ(false);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final boolean LIZJ() {
        C01GW<C1916120zxi> c01gw = C1916120zxi.LIZLLL;
        boolean z = AutobackupService.LIZJ().LIZIZ().getBoolean("consent_acceptance_from_backup", false);
        String str = C1916120zxi.LJFF;
        return Keva.getRepo(str).getBoolean("is_consent_accepted", false) || (z && Keva.getRepo(str).contains("ug_should_show")) || !C1916140zxk.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LIZLLL() {
        C1916120zxi value = C1916120zxi.LIZLLL.getValue();
        if (value.LIZIZ == -1) {
            value.LIZIZ = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final boolean LJ() {
        C01GW<C1916120zxi> c01gw = C1916120zxi.LIZLLL;
        if (!((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode()) {
            if ((!C1697810uHb.LJIIJJI("DE", "FR", "IT", "AT", "HU").contains(C1916120zxi.LJIIIIZZ.getStoreRegionUpperCase()) || !C102E.LIZ()) && C1916110zxh.LIZJ().LJIIL() != EnumC1915930zxP.ROW && C1916110zxh.LIZJ().LJIIL() != EnumC1915930zxP.KR) {
                return false;
            }
        }
        return (C1916110zxh.LIZ() || C1916120zxi.LJIIIIZZ.LJIIJ().isLogin()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void initialize() {
        if (C1916120zxi.LJII) {
            return;
        }
        C1916120zxi.LJII = true;
        C1916120zxi value = C1916120zxi.LIZLLL.getValue();
        value.getClass();
        C1916110zxh.LIZJ().LIZ((C1916130zxj) value.LIZJ.getValue());
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LIZ(String str) {
        C1916120zxi.LIZLLL.getValue().LIZ = str;
        if (!C1697810uHb.LJIIJJI("deeplink", "homepage_hot", "shortcut").contains(str)) {
            C1916110zxh.LIZJ().LJI(true);
        }
    }
}
