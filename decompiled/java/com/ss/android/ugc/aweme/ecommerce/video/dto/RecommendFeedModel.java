package com.ss.android.ugc.aweme.ecommerce.video.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes3.dex */
public final class RecommendFeedModel {

    @C09CT("extra")
    public final RecommendFeedExtra feedExtra;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("type")
    public final int type;

    @C09CT("video")
    public final RecommendVideoModel video;

    public RecommendFeedModel(String str, int i, RecommendVideoModel recommendVideoModel, RecommendFeedExtra recommendFeedExtra) {
        this.id = str;
        this.type = i;
        this.video = recommendVideoModel;
        this.feedExtra = recommendFeedExtra;
    }
}
