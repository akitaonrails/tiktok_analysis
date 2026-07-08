package com.bytedance.android.livesdk.model;

import X.C09CT;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes36.dex */
public class FraternityInfo {

    @C09CT("background")
    public ImageModel background;

    @C09CT("font_color")
    public String fontColor;

    @C09CT("level")
    public long level;

    @C09CT("name")
    public String name;

    public boolean isValid() {
        return (TextUtils.isEmpty(this.name) || this.level <= 0 || this.background == null) ? false : true;
    }

    public ImageModel getBackground() {
        return this.background;
    }

    public String getFontColor() {
        return this.fontColor;
    }

    public long getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public void setBackground(ImageModel imageModel) {
        this.background = imageModel;
    }

    public void setFontColor(String str) {
        this.fontColor = str;
    }

    public void setLevel(long j) {
        this.level = j;
    }

    public void setName(String str) {
        this.name = str;
    }
}
