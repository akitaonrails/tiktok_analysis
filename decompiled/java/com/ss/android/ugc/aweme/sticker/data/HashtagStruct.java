package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class HashtagStruct implements Serializable {

    @C09CT("hashtag_id")
    public String hashtagId;

    @C09CT("hashtag_name")
    public String hashtagName;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("sticker_id")
    public String stickerId;

    public HashtagStruct() {
        this.hashtagId = "";
        this.hashtagName = "";
        this.stickerId = "";
    }

    public String getHashtagId() {
        return this.hashtagId;
    }

    public String getHashtagName() {
        return this.hashtagName;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public void setHashtagId(String str) {
        this.hashtagId = str;
    }

    public void setHashtagName(String str) {
        this.hashtagName = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public HashtagStruct(String str, String str2) {
        this.stickerId = "";
        this.hashtagId = str;
        this.hashtagName = str2;
    }
}
