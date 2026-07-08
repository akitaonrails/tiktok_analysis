package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TextBlock {

    @C09CT("receiver_starling")
    public final String receiverStarling;

    @C09CT("sender_starling")
    public final String senderStarling;

    @C09CT("text")
    public final String text;

    public TextBlock() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextBlock)) {
            return false;
        }
        TextBlock textBlock = (TextBlock) obj;
        return Intrinsics.LJFF(this.text, textBlock.text) && Intrinsics.LJFF(this.senderStarling, textBlock.senderStarling) && Intrinsics.LJFF(this.receiverStarling, textBlock.receiverStarling);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.senderStarling;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.receiverStarling;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextBlock(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", senderStarling=");
        sbLIZ.append(this.senderStarling);
        sbLIZ.append(", receiverStarling=");
        sbLIZ.append(this.receiverStarling);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TextBlock(String str, String str2, String str3) {
        this.text = str;
        this.senderStarling = str2;
        this.receiverStarling = str3;
    }
}
