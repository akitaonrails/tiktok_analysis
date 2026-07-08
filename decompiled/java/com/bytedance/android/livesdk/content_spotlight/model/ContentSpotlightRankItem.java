package com.bytedance.android.livesdk.content_spotlight.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class ContentSpotlightRankItem {

    @C09CT("avatar")
    public ImageModel avatar;

    @C09CT("cover_image")
    public ImageModel coverImage;

    @C09CT("followed")
    public boolean followed;

    @C09CT("insert_description")
    public Text insertDescription;

    @C09CT("rank_index")
    public long rankIndex;

    @C09CT("room_id")
    public long roomId;

    @C09CT("score")
    public long score;

    @C09CT("style")
    public int style;

    @C09CT("user_id")
    public long userId;

    @C09CT("nick_name")
    public String nickName = "";

    @C09CT("user_id_str")
    public String userIdStr = "";
}
