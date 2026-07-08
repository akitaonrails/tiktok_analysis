package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class FansGiftInfo {

    @C09CT("gift_id")
    public long giftId;

    @C09CT("gift_image")
    public ImageModel giftImage;

    @C09CT("gift_name")
    public String giftName = "";

    @C09CT("gift_price")
    public long giftPrice;

    @C09CT("gift_type")
    public int giftType;

    @C09CT("is_available")
    public boolean isAvailable;
}
