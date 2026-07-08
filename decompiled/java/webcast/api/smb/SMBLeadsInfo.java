package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBDailyData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBLeadsInfo {

    @C09CT("form_switch_on")
    public boolean formSwitchOn;

    @C09CT("is_ba")
    public boolean isBa;

    @C09CT("leads_count")
    public long leadsCount;

    @C09CT("support_form")
    public boolean supportForm;

    @C09CT("display_text")
    public String displayText = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT("daily_data")
    public List<SMBDailyData> dailyData = new ArrayList();
}
