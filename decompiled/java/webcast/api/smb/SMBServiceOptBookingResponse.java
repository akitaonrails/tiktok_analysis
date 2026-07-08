package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBBookingEventTemplate;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBServiceOptBookingResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("create_success")
        public boolean createSuccess;

        @C09CT("template")
        public SMBBookingEventTemplate template;
    }
}
