package com.bytedance.android.livesdk.livesetting.gift;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_send_become_guest_black_list")
public final class LiveGiftSendBecomeGuestBlackList {
    public static final LiveGiftSendBecomeGuestBlackList INSTANCE = new LiveGiftSendBecomeGuestBlackList();
    public static final FindGiftBlackList DEFAULT = new FindGiftBlackList(C1697810uHb.LJIIJJI(8275L, 7775L, 7099L));

    public final FindGiftBlackList getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        FindGiftBlackList findGiftBlackList = DEFAULT;
        FindGiftBlackList findGiftBlackList2 = (FindGiftBlackList) settingsManager.getValueSafely("gift_send_become_guest_black_list", findGiftBlackList);
        return findGiftBlackList2 != null ? findGiftBlackList2 : findGiftBlackList;
    }
}
