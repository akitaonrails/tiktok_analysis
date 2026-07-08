package webcast.api.interaction;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.NewPinMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import webcast.data.InteractionConflict;

/* JADX INFO: loaded from: classes18.dex */
public final class PinResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("interaction_conflict")
        public InteractionConflict interactionConflict;

        @C09CT("pin_msg")
        public PinMessage pinMsg;

        @C09CT("pin_msg_v2")
        public NewPinMessage pinMsgV2;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }
}
