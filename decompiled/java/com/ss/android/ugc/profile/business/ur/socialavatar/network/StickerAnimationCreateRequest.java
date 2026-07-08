package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StickerAnimationCreateRequest {

    @C09CT("entrance")
    public final Integer entrance;

    @C09CT("sticker_id")
    public final Long stickerId;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("uri")
    public final String uri;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerAnimationCreateRequest)) {
            return false;
        }
        StickerAnimationCreateRequest stickerAnimationCreateRequest = (StickerAnimationCreateRequest) obj;
        return Intrinsics.LJFF(this.stickerId, stickerAnimationCreateRequest.stickerId) && Intrinsics.LJFF(this.uri, stickerAnimationCreateRequest.uri) && Intrinsics.LJFF(this.entrance, stickerAnimationCreateRequest.entrance) && Intrinsics.LJFF(this.stickerType, stickerAnimationCreateRequest.stickerType);
    }

    public final int hashCode() {
        Long l = this.stickerId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.uri;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.entrance;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.stickerType;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerAnimationCreateRequest(stickerId=");
        sbLIZ.append(this.stickerId);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", entrance=");
        sbLIZ.append(this.entrance);
        sbLIZ.append(", stickerType=");
        sbLIZ.append(this.stickerType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StickerAnimationCreateRequest(Long l, String str, Integer num, Integer num2) {
        this.stickerId = l;
        this.uri = str;
        this.entrance = num;
        this.stickerType = num2;
    }
}
