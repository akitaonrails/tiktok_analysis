package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC384940F7k;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class EcommerceStickerStruct implements Serializable, InterfaceC384940F7k {

    @C09CT("bg")
    public final EcommerceStickerBg bg;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("title")
    public final EcommerceStickerTitle title;

    public EcommerceStickerStruct() {
        this(null, null, null);
    }

    public final EcommerceStickerStruct copy(EcommerceStickerBg ecommerceStickerBg, EcommerceStickerTitle ecommerceStickerTitle, String str) {
        return new EcommerceStickerStruct(ecommerceStickerBg, ecommerceStickerTitle, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcommerceStickerStruct)) {
            return false;
        }
        EcommerceStickerStruct ecommerceStickerStruct = (EcommerceStickerStruct) obj;
        return Intrinsics.LJFF(this.bg, ecommerceStickerStruct.bg) && Intrinsics.LJFF(this.title, ecommerceStickerStruct.title) && Intrinsics.LJFF(this.daInfo, ecommerceStickerStruct.daInfo);
    }

    public int hashCode() {
        EcommerceStickerBg ecommerceStickerBg = this.bg;
        int iHashCode = (ecommerceStickerBg == null ? 0 : ecommerceStickerBg.hashCode()) * 31;
        EcommerceStickerTitle ecommerceStickerTitle = this.title;
        int iHashCode2 = (iHashCode + (ecommerceStickerTitle == null ? 0 : ecommerceStickerTitle.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcommerceStickerStruct(bg=");
        sbLIZ.append(this.bg);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EcommerceStickerBg getBg() {
        return this.bg;
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    public final EcommerceStickerTitle getTitle() {
        return this.title;
    }

    public EcommerceStickerStruct(EcommerceStickerBg ecommerceStickerBg, EcommerceStickerTitle ecommerceStickerTitle, String str) {
        this.bg = ecommerceStickerBg;
        this.title = ecommerceStickerTitle;
        this.daInfo = str;
    }
}
