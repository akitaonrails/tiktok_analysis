package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class SubInfoPopup {

    @C09CT("cover_url")
    public ImageModel coverUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("popup_type")
    public int popupType;

    @C09CT("priority")
    public long priority;

    @C09CT("video_url")
    public String videoUrl = "";

    @C09CT("lynx_url")
    public String lynxUrl = "";

    @C09CT("title")
    public String title = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("learn_more_url")
    public String learnMoreUrl = "";
}
