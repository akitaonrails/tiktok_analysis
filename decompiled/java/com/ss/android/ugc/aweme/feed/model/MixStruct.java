package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.AutoMixAuthorInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class MixStruct implements Serializable {

    @C09CT("author")
    public User author;

    @C09CT("auto_mix_author_info")
    public AutoMixAuthorInfo autoMixAuthorInfo;

    @C09CT("cover_url")
    public UrlModel cover;

    @C09CT("create_time")
    public long createTime;

    @C09CT("desc")
    public String desc;

    @C09CT("extra")
    public String extra;

    @C09CT("icon_url")
    public UrlModel icon;

    @C09CT("mix_id")
    public String mixId;

    @C09CT("mix_name")
    public String mixName;

    @C09CT("mix_type")
    public int mixType;

    @C09CT("share_info")
    public ShareInfo shareInfo;

    @C09CT("statis")
    public MixStatisStruct statis;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public MixStatusStruct status;

    @C09CT("update_time")
    public long updateTime;
}
