package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBBookingEvent;

/* JADX INFO: loaded from: classes8.dex */
public final class SMBBookingEventStatusUpdateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("event")
        public SMBBookingEvent event;
    }
}
