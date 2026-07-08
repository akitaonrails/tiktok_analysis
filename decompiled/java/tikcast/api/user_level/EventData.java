package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes8.dex */
public final class EventData {

    @C09CT("end_time_ms")
    public long endTimeMs;

    @C09CT("main_text")
    public Text mainText;

    @C09CT("num_gifts_left")
    public int numGiftsLeft;

    @C09CT("right_img")
    public ImageModel rightImg;

    @C09CT("start_time_ms")
    public long startTimeMs;

    @C09CT("sub_text")
    public Text subText;

    @C09CT("user_activated")
    public boolean userActivated;

    @C09CT("user_eligible")
    public boolean userEligible;

    @C09CT("schema_url")
    public String schemaUrl = "";

    @C09CT("type")
    public String type = "";

    @C09CT("extra")
    public String extra = "";
}
