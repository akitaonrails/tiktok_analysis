package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes18.dex */
public final class UserBaseData {

    @C09CT("avatar_large")
    public ImageModel avatarLarge;

    @C09CT("avatar_medium")
    public ImageModel avatarMedium;

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("tag")
    public int tag;

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("nick_name")
    public String nickName = "";

    @C09CT("display_id")
    public String displayId = "";

    @C09CT("alias")
    public String alias = "";
}
