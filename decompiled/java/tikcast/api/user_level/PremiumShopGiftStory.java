package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PremiumShopGiftStory {

    @C09CT("story_img")
    public ImageModel storyImg;

    @C09CT("story_content")
    public List<Text> storyContent = new ArrayList();

    @C09CT("gift_hub_schema")
    public String giftHubSchema = "";
}
