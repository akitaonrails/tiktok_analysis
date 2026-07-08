package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBAnchorSwitch;

/* JADX INFO: loaded from: classes4.dex */
public final class SMBAnchorSwitchStatusResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_switch")
        public SMBAnchorSwitch anchorSwitch;
    }
}
