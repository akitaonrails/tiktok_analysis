package com.ss.android.ugc.aweme.account.popup.popuphelper;

import X.C064E;
import X.C064F;
import X.C0XQ5;
import X.C13LP;
import X.C19EG;
import X.C7740030o;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.IPasskeyPopUpHelper;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import defpackage.PasskeyFrequencySettingsModel;
import defpackage.j3;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public final class PasskeyPopUpHelper implements IPasskeyPopUpHelper {
    public final synchronized PasskeyFrequency LIZ() {
        Gson gson = C7740030o.LIZ().getGson();
        String string = Keva.getRepo("passkey_keva_repo").getString(C0XQ5.LIZLLL(), GsonProtectorUtils.toJson(gson, new PasskeyFrequency(new ArrayList(), false)));
        if (string == null) {
            return new PasskeyFrequency(new ArrayList(), false);
        }
        try {
            PasskeyFrequency passkeyFrequency = (PasskeyFrequency) gson.LJII(string, PasskeyFrequency.class);
            if (passkeyFrequency == null) {
                passkeyFrequency = new PasskeyFrequency(new ArrayList(), false);
            }
            return passkeyFrequency;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new PasskeyFrequency(new ArrayList(), false);
        }
    }

    @Override // com.ss.android.ugc.aweme.IPasskeyPopUpHelper
    public final synchronized void LIZIZ() {
        PasskeyFrequency passkeyFrequencyLIZ = LIZ();
        passkeyFrequencyLIZ.doesUserExist = true;
        LJFF(passkeyFrequencyLIZ);
    }

    @Override // com.ss.android.ugc.aweme.IPasskeyPopUpHelper
    public final synchronized boolean LIZJ() {
        if (!((ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class)).LJFF()) {
            return false;
        }
        if (!C0XQ5.LIZ().isLogin()) {
            return false;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PasskeyFrequencySettingsModel passkeyFrequencySettingsModel = j3.LIZ;
        PasskeyFrequencySettingsModel passkeyFrequencySettingsModel2 = (PasskeyFrequencySettingsModel) settingsManagerLIZLLL.LJIIIIZZ("passkey_frequency_settings", PasskeyFrequencySettingsModel.class, passkeyFrequencySettingsModel);
        if (passkeyFrequencySettingsModel2 != null) {
            passkeyFrequencySettingsModel = passkeyFrequencySettingsModel2;
        }
        PasskeyFrequency passkeyFrequencyLIZ = LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (passkeyFrequencyLIZ.doesUserExist) {
            return false;
        }
        if (passkeyFrequencySettingsModel.coolDown == 3) {
            return false;
        }
        if (passkeyFrequencyLIZ.showTime.isEmpty()) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit.toDays(jCurrentTimeMillis - ((Number) C13LP.LJJLIIIJJI(passkeyFrequencyLIZ.showTime)).longValue()) < passkeyFrequencySettingsModel.coolDown) {
            return false;
        }
        if (passkeyFrequencyLIZ.showTime.size() >= passkeyFrequencySettingsModel.impressions) {
            return false;
        }
        return timeUnit.toDays(jCurrentTimeMillis - ((Number) C13LP.LJJJJZI(passkeyFrequencyLIZ.showTime)).longValue()) < ((long) passkeyFrequencySettingsModel.timeFrame);
    }

    @Override // com.ss.android.ugc.aweme.IPasskeyPopUpHelper
    public final synchronized int LJ() {
        return LIZ().showTime.size();
    }

    public final synchronized void LJI() {
        PasskeyFrequency passkeyFrequencyLIZ = LIZ();
        passkeyFrequencyLIZ.showTime.add(Long.valueOf(System.currentTimeMillis()));
        LJFF(passkeyFrequencyLIZ);
    }

    public final synchronized void LJFF(PasskeyFrequency passkeyFrequency) {
        Keva.getRepo("passkey_keva_repo").storeString(C0XQ5.LIZLLL(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), passkeyFrequency));
    }

    @Override // com.ss.android.ugc.aweme.IPasskeyPopUpHelper
    public final synchronized void LIZLLL(C19EG c19eg, C064F c064f) {
        if (!LIZJ()) {
            return;
        }
        if (c19eg == null) {
            return;
        }
        LJI();
        ((ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class)).LJIIIZ(c19eg, new C064E(c19eg, this, c064f), true, "", "account_settings");
    }
}
