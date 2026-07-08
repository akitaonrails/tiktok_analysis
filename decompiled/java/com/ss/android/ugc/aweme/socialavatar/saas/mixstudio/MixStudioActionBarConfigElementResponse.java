package com.ss.android.ugc.aweme.socialavatar.saas.mixstudio;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioActionBarConfigElementResponse implements Serializable {

    @C09CT("data")
    public final String elementData;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String elementId;

    @C09CT("sticker_type")
    public final Integer elementStickerType;

    @C09CT("type")
    public final Integer elementType;

    @C09CT("url")
    public final String elementUrl;

    public MixStudioActionBarConfigElementResponse() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixStudioActionBarConfigElementResponse)) {
            return false;
        }
        MixStudioActionBarConfigElementResponse mixStudioActionBarConfigElementResponse = (MixStudioActionBarConfigElementResponse) obj;
        return Intrinsics.LJFF(this.elementType, mixStudioActionBarConfigElementResponse.elementType) && Intrinsics.LJFF(this.elementData, mixStudioActionBarConfigElementResponse.elementData) && Intrinsics.LJFF(this.elementId, mixStudioActionBarConfigElementResponse.elementId) && Intrinsics.LJFF(this.elementUrl, mixStudioActionBarConfigElementResponse.elementUrl) && Intrinsics.LJFF(this.elementStickerType, mixStudioActionBarConfigElementResponse.elementStickerType);
    }

    public int hashCode() {
        Integer num = this.elementType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.elementData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.elementId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.elementUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.elementStickerType;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStudioActionBarConfigElementResponse(elementType=");
        sbLIZ.append(this.elementType);
        sbLIZ.append(", elementData=");
        sbLIZ.append(this.elementData);
        sbLIZ.append(", elementId=");
        sbLIZ.append(this.elementId);
        sbLIZ.append(", elementUrl=");
        sbLIZ.append(this.elementUrl);
        sbLIZ.append(", elementStickerType=");
        sbLIZ.append(this.elementStickerType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MixStudioActionBarConfigElementResponse(Integer num, String str, String str2, String str3, Integer num2) {
        this.elementType = num;
        this.elementData = str;
        this.elementId = str2;
        this.elementUrl = str3;
        this.elementStickerType = num2;
    }
}
