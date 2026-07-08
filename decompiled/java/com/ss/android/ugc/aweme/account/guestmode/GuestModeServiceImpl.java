package com.ss.android.ugc.aweme.account.guestmode;

import X.C100F;
import X.C19241810Po;
import X.C20684815ws;
import X.C2097908Jt;
import X.EnumC1518670pcf;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INUJAgeRangeService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class GuestModeServiceImpl implements IGuestModeService {
    public boolean LIZIZ;
    public final Keva LIZ = Keva.getRepo("guest_mode");
    public final INUJAgeRangeService LIZJ = (INUJAgeRangeService) PluggableExtentionKt.pluggableSpi$default(INUJAgeRangeService.class, false, false, false, 14, null);

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LIZLLL() {
        this.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LIZ() {
        this.LIZ.storeBoolean("age_gate_consent_start", true);
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LJII() {
        this.LIZ.storeBoolean("consent_accepted_in_hu", false);
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final boolean LJIIIZ() {
        return this.LIZ.getBoolean("age_gate_consent_start", false);
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final boolean isGuestMode() {
        return this.LIZ.getBoolean("age_gate_consent_complete", false) && !((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final String LIZJ() {
        if (!isGuestMode()) {
            return null;
        }
        String string = this.LIZ.getString("age_gate_consent_birthday", "");
        if (string.length() == 0 || LJIIJJI()) {
            return null;
        }
        return string;
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LJ() {
        if (isGuestMode()) {
            TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
            if (tTKUserCommunicationService != null) {
                tTKUserCommunicationService.LJIIJJI(EnumC1518670pcf.SCENE_COLD_LAUNCH.getValue(), null, null);
            }
            ComplianceServiceProvider.LJJI().LJIJJLI(new C100F() { // from class: X.0zxr
                @Override // X.C100F
                public final void LIZIZ(boolean z) {
                    ComplianceServiceProvider.LJJI().LJIIJ();
                }
            }, 0);
        }
    }

    public final boolean LJIIJJI() {
        if (System.currentTimeMillis() - this.LIZ.getLong("age_gate_consent_birthday_entry_time", 0L) <= 432000000) {
            return false;
        }
        this.LIZ.erase("age_gate_consent_birthday");
        this.LIZ.erase("age_gate_consent_birthday_entry_time");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final boolean LIZIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LJFF() {
        LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LJI(String str) {
        if (str.length() == 0) {
            return;
        }
        this.LIZ.storeString("age_gate_consent_birthday", str);
        this.LIZ.storeLong("age_gate_consent_birthday_entry_time", System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LJIIIIZZ(String str) {
        String storeRegionUpperCase;
        IGuestModeService iGuestModeService;
        this.LIZ.storeBoolean("age_gate_consent_complete", false);
        this.LIZ.storeBoolean("age_gate_consent_start", false);
        this.LIZ.erase("age_gate_consent_birthday");
        this.LIZ.erase("age_gate_consent_birthday_entry_time");
        this.LIZIZ = false;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            storeRegionUpperCase = iAccountService.getStoreRegionUpperCase();
        } else {
            storeRegionUpperCase = null;
        }
        if (Intrinsics.LJFF(storeRegionUpperCase, "HU")) {
            C19241810Po.LIZ.getClass();
            if (C19241810Po.LIZIZ() && (iGuestModeService = (IGuestModeService) PluggableExtentionKt.pluggableSpi$default(IGuestModeService.class, false, false, false, 14, null)) != null) {
                iGuestModeService.LJII();
            }
        }
        C20684815ws.LJIILLIIL("exit_guest_mode", C2097908Jt.LIZJ(new Pair("enter_from", str)));
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LJIIJ(Integer num) {
        String string;
        this.LIZ.storeBoolean("age_gate_consent_complete", true);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        C20684815ws.LJIILLIIL("enter_guest_mode", C2097908Jt.LIZJ(new Pair("register_age_gate_action", string)));
    }
}
