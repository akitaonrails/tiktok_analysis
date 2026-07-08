package com.bytedance.im.core.message.media.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class IMEncryptedImageContentExtra implements Serializable {

    @C09CT("img_format")
    public final String format;

    @C09CT("img_height")
    public final int height;

    @C09CT("img_width")
    public final int width;

    public IMEncryptedImageContentExtra() {
        this(0, 0, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMEncryptedImageContentExtra)) {
            return false;
        }
        IMEncryptedImageContentExtra iMEncryptedImageContentExtra = (IMEncryptedImageContentExtra) obj;
        return this.width == iMEncryptedImageContentExtra.width && this.height == iMEncryptedImageContentExtra.height && Intrinsics.LJFF(this.format, iMEncryptedImageContentExtra.format);
    }

    public int hashCode() {
        int i = ((this.width * 31) + this.height) * 31;
        String str = this.format;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMEncryptedImageContentExtra(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", format=");
        sbLIZ.append(this.format);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMEncryptedImageContentExtra(int i, int i2, String str) {
        this.width = i;
        this.height = i2;
        this.format = str;
    }
}
