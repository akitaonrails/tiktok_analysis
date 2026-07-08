package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AwemeRelationRecommendModel implements Serializable {

    @C09CT("friend_type_str")
    public String friendTypeStr;

    @C09CT("rec_type")
    public String recType;

    @C09CT("recommend_type")
    public long recommendType;

    @C09CT("relation_text_key")
    public String relationTextKey;

    public AwemeRelationRecommendModel() {
    }

    public final void setFriendTypeStr(String str) {
        this.friendTypeStr = str;
    }

    public final void setRecType(String str) {
        this.recType = str;
    }

    public final void setRecommendType(long j) {
        this.recommendType = j;
    }

    public final void setRelationTextKey(String str) {
        this.relationTextKey = str;
    }

    public AwemeRelationRecommendModel(long j, String str, String str2, String str3) {
        this.recommendType = j;
        this.relationTextKey = str;
        this.recType = str2;
        this.friendTypeStr = str3;
    }
}
