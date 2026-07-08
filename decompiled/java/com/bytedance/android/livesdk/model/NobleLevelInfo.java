package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class NobleLevelInfo {

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("noble_background")
    public ImageModel nobleBackground;

    @C09CT("noble_background_color")
    public List<String> nobleBackgroundColor;

    @C09CT("noble_big_icon")
    public ImageModel nobleBigIcon;

    @C09CT("noble_boarder")
    public ImageModel nobleBoarder;

    @C09CT("noble_icon")
    public ImageModel nobleIcon;

    @C09CT("noble_icon_with_back")
    public ImageModel nobleIconWithBack;

    @C09CT("noble_level")
    public long nobleLevel;

    @C09CT("noble_name")
    public String nobleName;

    public long getExpireTime() {
        return this.expireTime;
    }

    public ImageModel getNobleBackground() {
        return this.nobleBackground;
    }

    public List<String> getNobleBackgroundColor() {
        return this.nobleBackgroundColor;
    }

    public ImageModel getNobleBigIcon() {
        return this.nobleBigIcon;
    }

    public ImageModel getNobleBoarder() {
        return this.nobleBoarder;
    }

    public ImageModel getNobleIcon() {
        return this.nobleIcon;
    }

    public ImageModel getNobleIconWithBack() {
        return this.nobleIconWithBack;
    }

    public long getNobleLevel() {
        return this.nobleLevel;
    }

    public String getNobleName() {
        return this.nobleName;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setNobleBackground(ImageModel imageModel) {
        this.nobleBackground = imageModel;
    }

    public void setNobleBackgroundColor(List<String> list) {
        this.nobleBackgroundColor = list;
    }

    public void setNobleBigIcon(ImageModel imageModel) {
        this.nobleBigIcon = imageModel;
    }

    public void setNobleBoarder(ImageModel imageModel) {
        this.nobleBoarder = imageModel;
    }

    public void setNobleIcon(ImageModel imageModel) {
        this.nobleIcon = imageModel;
    }

    public void setNobleIconWithBack(ImageModel imageModel) {
        this.nobleIconWithBack = imageModel;
    }

    public void setNobleLevel(long j) {
        this.nobleLevel = j;
    }

    public void setNobleName(String str) {
        this.nobleName = str;
    }
}
