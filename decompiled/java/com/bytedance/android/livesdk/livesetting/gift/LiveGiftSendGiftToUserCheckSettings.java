package com.bytedance.android.livesdk.livesetting.gift;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_send_gift_to_user_check")
public final class LiveGiftSendGiftToUserCheckSettings {
    public static final HashMap<String, Boolean> DEFAULT;
    public static final LiveGiftSendGiftToUserCheckSettings INSTANCE = new LiveGiftSendGiftToUserCheckSettings();

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT = C2097608Jq.LJI(new Pair("is_open_fix_normal_link", bool), new Pair("is_open_fix_guest_link_host", bool), new Pair("is_open_fix_guest_link_guest", bool));
    }

    private final Map<String, Boolean> getValue() {
        try {
            Map<String, Boolean> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveGiftSendGiftToUserCheckSettings.class);
            return map == null ? DEFAULT : map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return DEFAULT;
        }
    }

    public final boolean blockForGuestLinkGuest() {
        Boolean bool = getValue().get("is_open_fix_guest_link_guest");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean blockForGuestLinkHost() {
        Boolean bool = getValue().get("is_open_fix_guest_link_host");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean blockForNormalLink() {
        Boolean bool = getValue().get("is_open_fix_normal_link");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
