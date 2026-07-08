package com.bytedance.im.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public class SendMessageCheck implements Serializable {

    @C09CT("check_code")
    public int checkCode;

    @C09CT("check_message")
    public String checkMsg;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
