package webcast.data.host_board;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ImageStyle {

    @C09CT("radius")
    public int radius;

    @C09CT("radius_bottom_left")
    public int radiusBottomLeft;

    @C09CT("radius_bottom_right")
    public int radiusBottomRight;

    @C09CT("radius_top_left")
    public int radiusTopLeft;

    @C09CT("radius_top_right")
    public int radiusTopRight;

    @C09CT("round")
    public boolean round;

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.round) * 31) + this.radius) * 31) + this.radiusTopLeft) * 31) + this.radiusTopRight) * 31) + this.radiusBottomLeft) * 31) + this.radiusBottomRight;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(ImageStyle.class, cls)) {
            return false;
        }
        ImageStyle imageStyle = (ImageStyle) obj;
        if (this.round == imageStyle.round && this.radius == imageStyle.radius && this.radiusTopLeft == imageStyle.radiusTopLeft && this.radiusTopRight == imageStyle.radiusTopRight && this.radiusBottomLeft == imageStyle.radiusBottomLeft && this.radiusBottomRight == imageStyle.radiusBottomRight) {
            return true;
        }
        return false;
    }
}
