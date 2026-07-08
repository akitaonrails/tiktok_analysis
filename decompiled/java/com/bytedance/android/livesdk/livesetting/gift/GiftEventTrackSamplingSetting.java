package com.bytedance.android.livesdk.livesetting.gift;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdkapi.host.IHostUser;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_event_track_sampling_enable")
public final class GiftEventTrackSamplingSetting {
    public static final int DEFAULT = 0;
    public static final GiftEventTrackSamplingSetting INSTANCE = new GiftEventTrackSamplingSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_event_track_sampling_enable", DEFAULT) == 1;
    }

    public static final boolean hit() {
        if (enable()) {
            return ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId() % 100 < ((long) GiftEventTrackSamplingRatio.INSTANCE.getValue());
        }
        return true;
    }

    public static final boolean shouldBlock(GiftMessage giftMessage) {
        Long lValueOf;
        boolean z;
        long id;
        if (giftMessage != null) {
            User user = giftMessage.toUser;
            if (user != null) {
                id = user.getId();
            } else {
                GiftMonitorInfo giftMonitorInfo = giftMessage.giftMonitorInfo;
                if (giftMonitorInfo != null) {
                    id = giftMonitorInfo.to_user_id;
                }
                lValueOf = null;
            }
            lValueOf = Long.valueOf(id);
        } else {
            lValueOf = null;
        }
        long curUserId = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId();
        if (lValueOf != null && lValueOf.longValue() == curUserId) {
            z = true;
        } else {
            z = false;
        }
        return shouldBlock(z);
    }

    public static final boolean shouldBlock(Long l) {
        boolean z;
        long curUserId = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId();
        if (l != null && l.longValue() == curUserId) {
            z = true;
        } else {
            z = false;
        }
        return shouldBlock(z);
    }

    public static final boolean shouldBlock(boolean z) {
        if (!z) {
            return !hit();
        }
        return false;
    }
}
