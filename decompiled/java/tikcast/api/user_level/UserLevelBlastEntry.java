package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class UserLevelBlastEntry {

    @C09CT("activation_prompt")
    public Text activationPrompt;

    @C09CT("currently_activated")
    public boolean currentlyActivated;

    @C09CT("ship_icon")
    public ImageModel shipIcon;

    @C09CT("jump_url")
    public String jumpUrl = "";

    @C09CT("show_id")
    public String showId = "";
}
