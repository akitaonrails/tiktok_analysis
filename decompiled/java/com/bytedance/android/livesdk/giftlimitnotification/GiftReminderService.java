package com.bytedance.android.livesdk.giftlimitnotification;

import X.C250000xu;
import X.C250500xz;
import com.bytedance.android.live.gift.IGiftReminderService;

/* JADX INFO: loaded from: classes.dex */
public class GiftReminderService implements IGiftReminderService {
    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final GiftLimitSettingDialog B00() {
        return new GiftLimitSettingDialog();
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final void Bo2() {
        C250000xu.LIZ.getClass();
        C250000xu.LIZLLL();
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final boolean Hg2() {
        C250000xu.LIZ.getClass();
        return C250000xu.LJJIIJ;
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final boolean TM0() {
        C250000xu.LIZ.getClass();
        return C250000xu.LIZJ();
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final void wN() {
        C250000xu.LIZ.getClass();
        C250000xu.LJJIJIIJI = "settings";
        C250500xz.LIZ(C250000xu.LJ() ? 1 : 0, "settings", C250000xu.LJJIIJ ? "enhanced" : "basic");
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final LiveGiftReminderFragment WD1(int i) {
        LiveGiftReminderFragment liveGiftReminderFragment = new LiveGiftReminderFragment();
        liveGiftReminderFragment.LLJILJILJ = i;
        return liveGiftReminderFragment;
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final void tt2(int i) {
        C250000xu.LIZ.getClass();
        C250000xu.LJI(i);
    }
}
