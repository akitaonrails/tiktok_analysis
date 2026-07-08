package com.ss.android.ugc.aweme.im.sticker.api.socialavatar;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes7.dex */
public final class AiMojiByteSyncData {

    @C09CT("aimoji_creation_status")
    public final Integer status;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status_2;

    @C09CT("Status")
    public final Integer status_3;

    @C09CT("UID")
    public final String uid;

    public AiMojiByteSyncData() {
        this(null, null, null, null);
    }

    public AiMojiByteSyncData(String str, Integer num, Integer num2, Integer num3) {
        this.uid = str;
        this.status = num;
        this.status_2 = num2;
        this.status_3 = num3;
    }
}
