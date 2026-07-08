package tikcast.api.privilege.creator_points;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RewardSection {

    @C09CT("body_text_parts")
    public List<Text> bodyTextParts = new ArrayList();

    @C09CT("images")
    public List<ImageModel> images = new ArrayList();

    @C09CT("jump_url")
    public String jumpUrl = "";

    @C09CT("style")
    public int style;

    @C09CT("title")
    public Text title;
}
