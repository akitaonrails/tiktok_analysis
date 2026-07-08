package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class BeaconBubbleModel {

    @C09CT("action_type")
    public long actionType;

    @C09CT("bubble_background")
    public TouchPointBackground bubbleBackground;

    @C09CT("image")
    public ImageModel image;

    @C09CT("schema_url")
    public String schemaUrl = "";

    @C09CT("title")
    public Text title;
}
