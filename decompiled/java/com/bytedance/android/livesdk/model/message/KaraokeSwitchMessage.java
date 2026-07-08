package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class KaraokeSwitchMessage extends AbstractC1136060ffY {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("type")
    public int type;

    public KaraokeSwitchMessage() {
        super.type = C001A.KARAOKE_SWITCH_MESSAGE;
    }
}
