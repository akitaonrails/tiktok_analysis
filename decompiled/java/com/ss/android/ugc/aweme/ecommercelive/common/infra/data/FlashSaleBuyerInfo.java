package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FlashSaleBuyerInfo {

    @C09CT("avatar")
    public final ECImage avatar;

    @C09CT("is_winner")
    public final boolean isWinner;

    @C09CT("nick_name")
    public final String nickName;

    @C09CT("user_id")
    public final long userId;

    public FlashSaleBuyerInfo() {
        this(0L, "", null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashSaleBuyerInfo)) {
            return false;
        }
        FlashSaleBuyerInfo flashSaleBuyerInfo = (FlashSaleBuyerInfo) obj;
        return this.userId == flashSaleBuyerInfo.userId && Intrinsics.LJFF(this.nickName, flashSaleBuyerInfo.nickName) && Intrinsics.LJFF(this.avatar, flashSaleBuyerInfo.avatar) && this.isWinner == flashSaleBuyerInfo.isWinner;
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.userId) * 31) + this.nickName.hashCode()) * 31;
        ECImage eCImage = this.avatar;
        return ((iY2 + (eCImage == null ? 0 : eCImage.hashCode())) * 31) + C786410Ut5.Z2(this.isWinner);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashSaleBuyerInfo(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", nickName=");
        sbLIZ.append(this.nickName);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(", isWinner=");
        sbLIZ.append(this.isWinner);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FlashSaleBuyerInfo(long j, String str, ECImage eCImage, boolean z) {
        this.userId = j;
        this.nickName = str;
        this.avatar = eCImage;
        this.isWinner = z;
    }
}
