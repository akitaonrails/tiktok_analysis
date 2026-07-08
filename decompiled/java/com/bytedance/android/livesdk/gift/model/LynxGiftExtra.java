package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LynxGiftExtra {

    @C09CT("code")
    public long code;

    @C09CT("extra")
    public String extra = "";

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("params")
    public List<String> params;

    @C09CT("type")
    public long type;
}
