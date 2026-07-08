package com.ss.android.ugc.aweme.staticimage;

import X.InterfaceC1294060jmO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1294060jmO
public final class StaticImageVideoContext implements Serializable {
    public final int duration;
    public final int imageHeight;
    public String imagePath;
    public final int imageWidth;
    public final boolean isFromAvatarChanging;
    public final boolean isFromBackgroundChanging;
    public final boolean isFromShoot;
    public String uploadFrameImagePath;

    public final boolean isFromAvatarChanging() {
        return this.isFromAvatarChanging;
    }

    public final boolean isFromBackgroundChanging() {
        return this.isFromBackgroundChanging;
    }

    public final boolean isFromShoot() {
        return this.isFromShoot;
    }

    public final void setImagePath(String str) {
        this.imagePath = str;
    }

    public final void setUploadFrameImagePath(String str) {
        this.uploadFrameImagePath = str;
    }

    public StaticImageVideoContext(String str, boolean z, int i, boolean z2, boolean z3, int i2, int i3, String str2) {
        this.imagePath = str;
        this.isFromShoot = z;
        this.duration = i;
        this.isFromAvatarChanging = z2;
        this.isFromBackgroundChanging = z3;
        this.imageWidth = i2;
        this.imageHeight = i3;
        this.uploadFrameImagePath = str2;
    }
}
