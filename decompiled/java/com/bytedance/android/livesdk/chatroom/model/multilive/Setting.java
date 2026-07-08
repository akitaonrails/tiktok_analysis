package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class Setting {

    @C09CT("allow_request_from_follower_only")
    public int allowRequestFromFollowerOnly;

    @C09CT("allow_request_from_followers")
    public int allowRequestFromFollowers;

    @C09CT("allow_request_from_friends")
    public int allowRequestFromFriends;

    @C09CT("allow_request_from_others")
    public int allowRequestFromOthers;

    @C09CT("allow_request_from_user")
    public int allowRequestFromUser;

    @C09CT("applier_gift_score_threshold")
    public long applierGiftScoreThreshold;

    @C09CT("applier_sort_setting")
    public int applierSortSetting;

    @C09CT("background_sticker_id")
    public String backgroundStickerId = "";

    @C09CT("enable_show_multi_guest_layout")
    public int enableShowMultiGuestLayout;

    @C09CT("fix_mic_num")
    public int fixMicNum;

    @C09CT("layout")
    public int layout;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", layout=");
        sb.append(this.layout);
        sb.append(", fix_mic_num=");
        sb.append(this.fixMicNum);
        sb.append(", allow_request_from_user=");
        sb.append(this.allowRequestFromUser);
        sb.append(", allow_request_from_follower_only=");
        sb.append(this.allowRequestFromFollowerOnly);
        sb.replace(0, 2, "Setting{");
        sb.append('}');
        return sb.toString();
    }
}
