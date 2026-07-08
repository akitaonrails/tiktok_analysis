package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBDailyData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBBookingInfo {

    @C09CT("support_booking")
    public boolean supportBooking;

    @C09CT("booking_count")
    public String bookingCount = "";

    @C09CT("display_text")
    public String displayText = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT("daily_data")
    public List<SMBDailyData> dailyData = new ArrayList();
}
