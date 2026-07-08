package webcast.api.ranklist_class;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class TileRewardConfig {

    @C09CT("background")
    public String background = "";

    @C09CT("description")
    public Text description;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("price")
    public long price;

    @C09CT("title")
    public Text title;
}
