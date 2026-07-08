package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class ActivityStruct {

    @C09CT("activity_name")
    public String activityName;

    @C09CT("comment_icon")
    public UrlModel commentIcon;

    @C09CT("digg_icon")
    public UrlModel diggIcon;

    @C09CT("in_activity")
    public Boolean inActivity;

    @C09CT("share_icon")
    public UrlModel shareIcon;

    @C09CT("share_tip_icon")
    public UrlModel shareTipIcon;

    @C09CT("shot_icon")
    public UrlModel shotIcon;

    @C09CT("undigg_icon")
    public UrlModel undiggIcon;

    @C09CT("watermark_struct")
    public WatermarkStruct watermarkStruct;

    @C09CT("hash_tags")
    public List<String> hashTags = new ArrayList();

    @C09CT("activity_sticker_id_array")
    public List<String> activityStickerIdArray = new ArrayList();

    public String getActivityName() throws C316660CbA {
        String str = this.activityName;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public UrlModel getCommentIcon() throws C316660CbA {
        UrlModel urlModel = this.commentIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C316660CbA();
    }

    public UrlModel getDiggIcon() throws C316660CbA {
        UrlModel urlModel = this.diggIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C316660CbA();
    }

    public Boolean getInActivity() throws C316660CbA {
        Boolean bool = this.inActivity;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public UrlModel getShareIcon() throws C316660CbA {
        UrlModel urlModel = this.shareIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C316660CbA();
    }

    public UrlModel getShareTipIcon() throws C316660CbA {
        UrlModel urlModel = this.shareTipIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C316660CbA();
    }

    public UrlModel getShotIcon() throws C316660CbA {
        UrlModel urlModel = this.shotIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C316660CbA();
    }

    public UrlModel getUndiggIcon() throws C316660CbA {
        UrlModel urlModel = this.undiggIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C316660CbA();
    }

    public WatermarkStruct getWatermarkStruct() throws C316660CbA {
        WatermarkStruct watermarkStruct = this.watermarkStruct;
        if (watermarkStruct != null) {
            return watermarkStruct;
        }
        throw new C316660CbA();
    }

    public List<String> getActivityStickerIdArray() {
        return this.activityStickerIdArray;
    }

    public List<String> getHashTags() {
        return this.hashTags;
    }
}
