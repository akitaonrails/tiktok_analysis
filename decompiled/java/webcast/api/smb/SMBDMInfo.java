package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBDailyData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBDMInfo {

    @C09CT("dm_count")
    public long dmCount;

    @C09CT("support_dm")
    public boolean supportDm;

    @C09CT("display_text")
    public String displayText = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT("daily_data")
    public List<SMBDailyData> dailyData = new ArrayList();
}
