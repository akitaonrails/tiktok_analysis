package com.bytedance.android.livesdk.sei;

import X.C09CT;
import java.util.Objects;

/* JADX INFO: loaded from: classes27.dex */
public class SeiCanvas {

    @C09CT("background")
    public String background;

    @C09CT("backgroundImage")
    public String backgroundImage;

    @C09CT("height")
    public int height;

    @C09CT("width")
    public int width;

    public final int hashCode() {
        return Objects.hash(this.background, Integer.valueOf(this.height), Integer.valueOf(this.width), this.backgroundImage);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeiCanvas)) {
            return false;
        }
        SeiCanvas seiCanvas = (SeiCanvas) obj;
        if (this.height == seiCanvas.height && this.width == seiCanvas.width && Objects.equals(this.background, seiCanvas.background) && Objects.equals(this.backgroundImage, seiCanvas.backgroundImage)) {
            return true;
        }
        return false;
    }
}
