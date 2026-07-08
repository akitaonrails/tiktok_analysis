package tikcast.api.creator_succ;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class UpgradeCelebrationInfo {

    @C09CT("is_upgraded")
    public boolean isUpgraded;

    @C09CT("level")
    public int level;

    @C09CT("opt_out")
    public boolean optOut;

    @C09CT("show_goodybag")
    public boolean showGoodybag;

    @C09CT("sticker_image")
    public ImageModel stickerImage;

    @C09CT("sticker_id")
    public String stickerId = "";

    @C09CT("sticker_celebration_text")
    public String stickerCelebrationText = "";

    @C09CT("goodybag_celebration_text")
    public String goodybagCelebrationText = "";

    @C09CT("action_page_sub_title")
    public String actionPageSubTitle = "";

    @C09CT("upgrade_gift_info_list")
    public List<CelebrationGift> upgradeGiftInfoList = new ArrayList();
}
