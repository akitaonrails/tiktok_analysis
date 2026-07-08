package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBBookingEvent;

/* JADX INFO: loaded from: classes8.dex */
public final class SMBBookingEventResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("event")
        public SMBBookingEvent event;

        @C09CT("need_to_queue")
        public boolean needToQueue;

        @C09CT("sku_title")
        public String skuTitle = "";

        @C09CT("sku_description")
        public String skuDescription = "";

        @C09CT("booking_event_url")
        public String bookingEventUrl = "";

        @C09CT("dm_schema")
        public String dmSchema = "";

        @C09CT("event_template_id")
        public String eventTemplateId = "";
    }
}
