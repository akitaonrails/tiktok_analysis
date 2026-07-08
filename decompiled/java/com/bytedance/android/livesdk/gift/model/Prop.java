package com.bytedance.android.livesdk.gift.model;

import X.AnonymousClass0054;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Prop extends AnonymousClass0054 {

    @C09CT("banner")
    public BannerInRoom banner;

    @C09CT("count")
    public int count;

    @C09CT("description")
    public String description;

    @C09CT("diamond")
    public int diamond;

    @C09CT("diamond_icon")
    public ImageModel diamondLabel;

    @C09CT("fragments_compound_count")
    public Long fragmentsCompoundCount;

    @C09CT("gift")
    public Gift gift = new Gift();

    @C09CT("gifts")
    public List<HotfixGiftDataForProp> gifts;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("prop_def_id")
    public long id;

    @C09CT("is_aweme_free_gift")
    public int isAwemeFreeGift;

    @C09CT("is_fragment")
    public Boolean isFragment;

    @C09CT("label_icon")
    public ImageModel labelIcon;

    @C09CT("manual")
    public String manual;

    @C09CT("name")
    public String name;

    @C09CT("next_expire")
    public long nextExpire;
    public long nowTimeDiff;

    @C09CT("primary_effect_id")
    public int primaryEffectId;

    @C09CT("prop_def_type")
    public long propType;

    @C09CT("reddot_tip")
    public boolean reddotTip;

    @C09CT("scheme_url")
    public String schemeUrl;

    public long getNowTimeDiff() {
        return this.nowTimeDiff;
    }

    public static Prop newInstance(Prop prop) {
        Prop prop2 = new Prop();
        if (prop == null) {
            return prop2;
        }
        prop2.primaryEffectId = prop.primaryEffectId;
        prop2.nextExpire = prop.nextExpire;
        prop2.description = prop.description;
        prop2.id = prop.id;
        prop2.manual = prop.manual;
        prop2.diamond = prop.diamond;
        prop2.reddotTip = prop.reddotTip;
        prop2.icon = prop.icon;
        prop2.count = prop.count;
        prop2.name = prop.name;
        prop2.gift = prop.gift;
        prop2.labelIcon = prop.labelIcon;
        prop2.diamondLabel = prop.diamondLabel;
        prop2.isAwemeFreeGift = prop.isAwemeFreeGift;
        prop2.nowTimeDiff = prop.nowTimeDiff;
        prop2.banner = prop.banner;
        return prop2;
    }

    public void setNowTimeDiff(long j) {
        this.nowTimeDiff = j;
    }
}
