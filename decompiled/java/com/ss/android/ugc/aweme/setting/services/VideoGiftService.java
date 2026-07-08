package com.ss.android.ugc.aweme.setting.services;

import X.C04TD;
import X.C19291110dZ;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.GiftSettings;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoGiftService implements IVideoGiftService {
    public static IVideoGiftService LJI() {
        Object objLIZ = C04TD.LIZ(IVideoGiftService.class, false);
        if (objLIZ != null) {
            return (IVideoGiftService) objLIZ;
        }
        if (C04TD.U4 == null) {
            synchronized (IVideoGiftService.class) {
                if (C04TD.U4 == null) {
                    C04TD.U4 = new VideoGiftService();
                }
            }
        }
        return C04TD.U4;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final void LIZIZ() {
        C19291110dZ c19291110dZ = C19291110dZ.LIZ;
        Keva repo = Keva.getRepo("video_gift_settings_keva_repo");
        C19291110dZ.LIZ.getClass();
        repo.storeBoolean(C19291110dZ.LIZIZ("vgv_first_gift_sent"), true);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final boolean LIZJ() {
        C19291110dZ c19291110dZ = C19291110dZ.LIZ;
        Keva repo = Keva.getRepo("video_gift_settings_keva_repo");
        C19291110dZ.LIZ.getClass();
        if (repo.getBoolean(C19291110dZ.LIZIZ("vgv_is_new_user_account"), true)) {
            return true;
        }
        return Keva.getRepo("video_gift_settings_keva_repo").getBoolean(C19291110dZ.LIZIZ("vgv_first_gift_sent"), false);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final boolean LIZLLL() {
        try {
            SettingsManager.LIZLLL().getClass();
            GiftSettings giftSettings = (GiftSettings) SettingsManager.LJII("non_live_gifting_viewer_setting", GiftSettings.class);
            return giftSettings != null && giftSettings.isSendGiftAfterRechargeEnabled;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final void LJ() {
        C19291110dZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final boolean LIZ(Aweme aweme) {
        GiftSettings giftSettings;
        try {
            SettingsManager.LIZLLL().getClass();
            giftSettings = (GiftSettings) SettingsManager.LJII("non_live_gifting_viewer_setting", GiftSettings.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            giftSettings = null;
        }
        if (giftSettings != null && giftSettings.enableVideoGift) {
            return true;
        }
        if (aweme == null) {
            return false;
        }
        return aweme.getAllowGift();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final void LJFF(boolean z) {
        C19291110dZ c19291110dZ = C19291110dZ.LIZ;
        Keva repo = Keva.getRepo("video_gift_settings_keva_repo");
        C19291110dZ.LIZ.getClass();
        repo.storeBoolean(C19291110dZ.LIZIZ("vgc_accept_gifting"), z);
    }
}
