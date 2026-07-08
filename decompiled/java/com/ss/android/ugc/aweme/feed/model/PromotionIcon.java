package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.model.Image;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class PromotionIcon implements Serializable {

    @C09CT("dark")
    public Image labelImageDark;

    @C09CT("light")
    public Image labelImageLight;

    public PromotionIcon() {
        this(null, null);
    }

    public final void setLabelImageDark(Image image) {
        this.labelImageDark = image;
    }

    public final void setLabelImageLight(Image image) {
        this.labelImageLight = image;
    }

    public PromotionIcon(Image image, Image image2) {
        this.labelImageLight = image;
        this.labelImageDark = image2;
    }
}
