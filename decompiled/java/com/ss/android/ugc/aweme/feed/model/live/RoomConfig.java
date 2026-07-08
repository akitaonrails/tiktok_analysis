package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class RoomConfig implements Serializable {

    @C09CT("enable_emoji")
    public int enableEmoji;

    @C09CT("enable_fans_club")
    public int enableFansClub;

    @C09CT("enable_hourly_list")
    public int enableHourRank;

    @C09CT("enable_send_barrage")
    public int enableSendBarrage;

    @C09CT("enable_send_comment")
    public int enableSendComment;

    @C09CT("enable_send_gift")
    public int enableSendGift;

    @C09CT("enable_send_gift_guide")
    public int enableSendGiftGuide;

    @C09CT("enable_send_shortcut_gift")
    public int enableSendShortcutGift;

    @C09CT("enable_share")
    public int enableShare;

    private boolean calc(int i, int i2) {
        int i3 = i2 == 0 ? 1 : 2;
        return (i & i3) == i3;
    }

    public boolean enableHourRank(int i) {
        return calc(this.enableHourRank, i);
    }

    public boolean isEnableEmoji(int i) {
        return calc(this.enableEmoji, i);
    }

    public boolean isEnableFansClub(int i) {
        return calc(this.enableFansClub, i);
    }

    public boolean isEnableSendBarrage(int i) {
        return calc(this.enableSendBarrage, i);
    }

    public boolean isEnableSendComment(int i) {
        return calc(this.enableSendComment, i);
    }

    public boolean isEnableSendGift(int i) {
        return calc(this.enableSendGift, i);
    }

    public boolean isEnableSendGiftGuide(int i) {
        return calc(this.enableSendGiftGuide, i);
    }

    public boolean isEnableShare(int i) {
        return calc(this.enableShare, i);
    }

    public boolean isEnableShortcutGift(int i) {
        return calc(this.enableSendShortcutGift, i);
    }
}
