package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes29.dex */
public final class ShopData {

    @C09CT("content_text")
    public Text contentText;

    @C09CT("end_time_ms")
    public long endTimeMs;

    @C09CT("shop_activated")
    public boolean shopActivated;

    @C09CT("shop_id")
    public String shopId = "";

    @C09CT("shop_progress_score")
    public long shopProgressScore;

    @C09CT("start_time_ms")
    public long startTimeMs;

    @C09CT("user_joined")
    public boolean userJoined;
}
