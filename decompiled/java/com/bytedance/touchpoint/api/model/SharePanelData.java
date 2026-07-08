package com.bytedance.touchpoint.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SharePanelData {

    @C09CT("action_hint")
    public final Title actionHint;

    @C09CT("background_image")
    public final String backgroundImage;

    @C09CT("inapp_share_info")
    public final InAppShareInfo inAppShareInfo;

    @C09CT("inviter_code")
    public final Title inviterCode;

    @C09CT("inviter_icon")
    public final String inviterIcon;

    @C09CT("nickname")
    public final Title nickname;

    @C09CT("related_touchpoints")
    public final List<Integer> relatedTouchpoints;

    @C09CT("share_link")
    public final String shareLink;

    @C09CT("title")
    public final Title title;

    @C09CT("user_avatar")
    public final String userAvatar;

    public SharePanelData(List<Integer> list, InAppShareInfo inAppShareInfo, String str, String str2, Title title, Title title2, String str3, Title title3, Title title4, String str4) {
        this.relatedTouchpoints = list;
        this.inAppShareInfo = inAppShareInfo;
        this.shareLink = str;
        this.userAvatar = str2;
        this.nickname = title;
        this.title = title2;
        this.inviterIcon = str3;
        this.actionHint = title3;
        this.inviterCode = title4;
        this.backgroundImage = str4;
    }
}
