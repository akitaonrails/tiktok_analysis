package com.ss.android.ugc.aweme.settingsrequest;

import X.C0C64;
import X.C0CO9;
import X.C0CPZ;
import X.C10FG;
import X.C1697810uHb;
import X.C1BVK;
import X.C310720CFy;
import X.C313080CPa;
import X.InterfaceC313090CPb;
import X.InterfaceC345370DgN;
import Y.ACallableS94S0101000_4;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class SettingsLegacyImpl implements ISettingsLegacyApi {
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final List<InterfaceC345370DgN> LIZ() {
        return C1697810uHb.LJIIJJI(new ImageStorage(), new MobStorage());
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final C310720CFy LIZIZ() {
        C310720CFy c310720CFy = C0CO9.LIZIZ().LL;
        return c310720CFy == null ? ((ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class)).LIZLLL() : c310720CFy;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final int LJ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "ins_share_type", true);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final boolean shouldUseRecyclerPartialUpdate() {
        return ((ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class)).shouldUseRecyclerPartialUpdate();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final void preloadPushSettingsManager() {
        C10FG c10fg = C10FG.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final PopupSetting LIZLLL(String str) {
        InterfaceC313090CPb interfaceC313090CPb = C313080CPa.LLILZIL;
        C313080CPa c313080CPa = C0CPZ.LIZ;
        c313080CPa.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        PopupSetting popupSetting = (PopupSetting) ((HashMap) c313080CPa.LLILLL).get(str);
        ((HashMap) c313080CPa.LLILLL).put(str, null);
        return popupSetting;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final void LIZJ(WeakHandler weakHandler, int i, int i2) {
        if (weakHandler == null) {
            return;
        }
        InterfaceC313090CPb interfaceC313090CPb = C313080CPa.LLILZIL;
        C313080CPa c313080CPa = C0CPZ.LIZ;
        ((ConcurrentHashMap) c313080CPa.LLILLJJLI).put(weakHandler, Integer.valueOf(i));
        synchronized (c313080CPa) {
            try {
                if (c313080CPa.LLILZ) {
                    return;
                }
                c313080CPa.LLILZ = true;
                C1BVK.LIZIZ().LIZ(c313080CPa.LL, new ACallableS94S0101000_4(c313080CPa, i2, 0), 1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
