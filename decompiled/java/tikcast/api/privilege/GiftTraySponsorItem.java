package tikcast.api.privilege;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftTraySponsorItem {

    @C09CT("asset_sub_type")
    public int assetSubType;

    @C09CT("gift_icon")
    public ImageModel giftIcon;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("gift_name")
    public Text giftName;

    @C09CT("is_lock")
    public boolean isLock;

    @C09CT("right_tag_bg_img")
    public ImageModel rightTagBgImg;

    @C09CT("right_tag_text")
    public Text rightTagText;

    @C09CT("tray_normal_bg_img")
    public ImageModel trayNormalBgImg;

    @C09CT("tray_normal_bg_color")
    public List<String> trayNormalBgColor = new ArrayList();

    @C09CT("right_tag_bg_colour")
    public List<String> rightTagBgColour = new ArrayList();
}
