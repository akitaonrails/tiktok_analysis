package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.GiftPanelBanner;

/* JADX INFO: loaded from: classes18.dex */
public final class BagItem {

    @C09CT("activate_at")
    public long activateAt;

    @C09CT("available")
    public boolean available;

    @C09CT("banner")
    public GiftPanelBanner banner;

    @C09CT("combo")
    public boolean combo;

    @C09CT("count")
    public long count;

    @C09CT("gift_price")
    public long giftPrice;

    @C09CT("group_id")
    public long groupId;

    @C09CT("image")
    public ImageModel image;

    @C09CT("item_id")
    public long itemId;

    @C09CT("item_type")
    public int itemType;

    @C09CT("min_expire_at")
    public long minExpireAt;

    @C09CT("pre_update_info")
    public BagItemPreUpdateInfo preUpdateInfo;

    @C09CT("preview_image")
    public ImageModel previewImage;

    @C09CT("name")
    public String name = "";

    @C09CT("toast")
    public String toast = "";
}
