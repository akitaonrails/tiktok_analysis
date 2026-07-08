package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class SkinHostAccount {

    @C09CT("bg_image")
    public ImageModel bgImage;

    public SkinHostAccount() {
        this(null);
    }

    public SkinHostAccount(ImageModel imageModel) {
        this.bgImage = imageModel;
    }
}
