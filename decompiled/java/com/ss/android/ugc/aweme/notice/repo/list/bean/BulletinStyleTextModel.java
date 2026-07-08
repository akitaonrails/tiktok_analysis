package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinStyleTextModel {

    @C09CT("color")
    public final String color;

    @C09CT("font")
    public final String font;

    public BulletinStyleTextModel() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinStyleTextModel)) {
            return false;
        }
        BulletinStyleTextModel bulletinStyleTextModel = (BulletinStyleTextModel) obj;
        return Intrinsics.LJFF(this.font, bulletinStyleTextModel.font) && Intrinsics.LJFF(this.color, bulletinStyleTextModel.color);
    }

    public final int hashCode() {
        String str = this.font;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinStyleTextModel(font=");
        sbLIZ.append(this.font);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinStyleTextModel(String str, String str2) {
        this.font = str;
        this.color = str2;
    }
}
