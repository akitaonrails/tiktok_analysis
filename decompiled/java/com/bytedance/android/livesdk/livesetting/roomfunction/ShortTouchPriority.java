package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C13LQ;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_short_touch_type_priority")
public final class ShortTouchPriority {
    public static final ShortTouchPriority INSTANCE = new ShortTouchPriority();
    public static final String[] DEFAULT = {"shortTouchCollabGifting", "shortTouchEcommerceLuckyBag", "shortTouchEcommerceUg", "shortTouchEcommerceVoucher", "shortTouchMatchItemsStrike", "shortTouchMatchItemsSmoke", "shortTouchActivityShell", "shortTouchTreasureBox", "shortTouchVirtualTicketBox", "shortTouchCustomPoll"};

    private final String[] getPriorityArray() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_short_touch_type_priority", DEFAULT);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }

    public final int getPriority(String str) {
        String[] priorityArray = getPriorityArray();
        if (TextUtils.isEmpty(str) || priorityArray.length == 0 || C13LQ.LJJIJIIJI(str, priorityArray) < 0) {
            return Integer.MAX_VALUE;
        }
        return C13LQ.LJJIJIIJI(str, priorityArray);
    }
}
