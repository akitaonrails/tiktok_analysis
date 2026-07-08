package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class BaseText implements Serializable {

    @C09CT("receiver_starling")
    public final String receiverStarling;

    @C09CT("sender_starling")
    public final String senderStarling;

    @C09CT("text")
    public final String text;

    public BaseText() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseText)) {
            return false;
        }
        BaseText baseText = (BaseText) obj;
        return Intrinsics.LJFF(this.text, baseText.text) && Intrinsics.LJFF(this.senderStarling, baseText.senderStarling) && Intrinsics.LJFF(this.receiverStarling, baseText.receiverStarling);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.senderStarling;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.receiverStarling;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseText(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", senderStarling=");
        sbLIZ.append(this.senderStarling);
        sbLIZ.append(", receiverStarling=");
        sbLIZ.append(this.receiverStarling);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BaseText(String str, String str2, String str3) {
        this.text = str;
        this.senderStarling = str2;
        this.receiverStarling = str3;
    }
}
