package tikcast.api.privilege.user_level;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class HighlightTime {

    @C09CT("cover")
    public ImageModel cover;

    @C09CT("event_time")
    public long eventTime;

    @C09CT("fragment_id")
    public long fragmentId;

    @C09CT("title")
    public Text title;

    @C09CT("url")
    public String url = "";

    @C09CT("user")
    public User user;
}
