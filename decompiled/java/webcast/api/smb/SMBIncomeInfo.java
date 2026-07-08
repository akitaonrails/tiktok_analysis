package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBDailyData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBIncomeInfo {

    @C09CT("show_course_tab")
    public boolean showCourseTab;

    @C09CT("revenue_str")
    public String revenueStr = "";

    @C09CT("display_text")
    public String displayText = "";

    @C09CT("currency_symbol")
    public String currencySymbol = "";

    @C09CT("daily_data")
    public List<SMBDailyData> dailyData = new ArrayList();
}
