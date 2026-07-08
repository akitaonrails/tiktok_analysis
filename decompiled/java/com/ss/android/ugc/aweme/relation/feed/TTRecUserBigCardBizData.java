package com.ss.android.ugc.aweme.relation.feed;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes34.dex */
public final class TTRecUserBigCardBizData {

    @C09CT("count")
    public final Integer count;

    @C09CT("device_score")
    public final Float deviceScore;

    @C09CT("is_kids_mode")
    public final Boolean isKidsMode;

    @C09CT("is_non_personalized")
    public final Boolean isNonPersonalized;

    @C09CT("page_token")
    public final String pageToken;

    @C09CT("rec_impr_users")
    public final String recImprUsers;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public TTRecUserBigCardBizData() {
        this(null, null, null, null, null, null, null);
    }

    public TTRecUserBigCardBizData(Integer num, Integer num2, String str, String str2, Boolean bool, Float f, Boolean bool2) {
        this.scene = num;
        this.count = num2;
        this.pageToken = str;
        this.recImprUsers = str2;
        this.isNonPersonalized = bool;
        this.deviceScore = f;
        this.isKidsMode = bool2;
    }
}
