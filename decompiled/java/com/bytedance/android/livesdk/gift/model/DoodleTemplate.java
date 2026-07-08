package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public class DoodleTemplate {

    @C09CT("template_id")
    public long id;

    @C09CT("image")
    public ImageModel image;
    public boolean selected;

    public long getId() {
        return this.id;
    }

    public ImageModel getImage() {
        return this.image;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setImage(ImageModel imageModel) {
        this.image = imageModel;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }
}
