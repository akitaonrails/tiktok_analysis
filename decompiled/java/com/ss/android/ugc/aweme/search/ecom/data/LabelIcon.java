package com.ss.android.ugc.aweme.search.ecom.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.model.Image;

/* JADX INFO: loaded from: classes11.dex */
public final class LabelIcon {

    @C09CT("label_image_dark")
    public final Image labelImageDark;

    @C09CT("label_image_light")
    public final Image labelImageLight;

    @C09CT("suffix_dark_icon")
    public final Image suffixDarkIcon;

    @C09CT("suffix_light_icon")
    public final Image suffixLightIcon;

    public LabelIcon() {
        this(null, null, null, null);
    }

    public LabelIcon(Image image, Image image2, Image image3, Image image4) {
        this.labelImageLight = image;
        this.labelImageDark = image2;
        this.suffixLightIcon = image3;
        this.suffixDarkIcon = image4;
    }
}
