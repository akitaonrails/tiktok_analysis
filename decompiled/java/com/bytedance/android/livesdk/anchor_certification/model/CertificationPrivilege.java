package com.bytedance.android.livesdk.anchor_certification.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CertificationPrivilege {

    @C09CT("description")
    public Text description;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("image")
    public ImageModel image;

    @C09CT("name")
    public Text name;

    @C09CT("type")
    public int type;

    @C09CT("special_gifts")
    public List<CertificationGift> specialGifts = new ArrayList();

    @C09CT("activity_banners")
    public List<ActivityBanner> activityBanners = new ArrayList();
}
