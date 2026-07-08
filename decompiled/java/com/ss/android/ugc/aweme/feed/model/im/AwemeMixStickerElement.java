package com.ss.android.ugc.aweme.feed.model.im;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AwemeMixStickerElement implements Serializable {

    @C09CT("data")
    public String data;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("sticker_type")
    public Integer stickerType;

    @C09CT("type")
    public Integer type;

    @C09CT("url")
    public String url;

    public AwemeMixStickerElement() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeMixStickerElement)) {
            return false;
        }
        AwemeMixStickerElement awemeMixStickerElement = (AwemeMixStickerElement) obj;
        return Intrinsics.LJFF(this.type, awemeMixStickerElement.type) && Intrinsics.LJFF(this.id, awemeMixStickerElement.id) && Intrinsics.LJFF(this.data, awemeMixStickerElement.data) && Intrinsics.LJFF(this.url, awemeMixStickerElement.url) && Intrinsics.LJFF(this.stickerType, awemeMixStickerElement.stickerType);
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.data;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.stickerType;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeMixStickerElement(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", stickerType=");
        sbLIZ.append(this.stickerType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AwemeMixStickerElement(Integer num, String str, String str2, String str3, Integer num2) {
        this.type = num;
        this.id = str;
        this.data = str2;
        this.url = str3;
        this.stickerType = num2;
    }
}
