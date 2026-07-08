package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxTextStruct {

    @C09CT("color")
    public final String color;

    @C09CT("font")
    public final String font;

    @C09CT("text")
    public final String text;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxTextStruct)) {
            return false;
        }
        InboxTextStruct inboxTextStruct = (InboxTextStruct) obj;
        return Intrinsics.LJFF(this.text, inboxTextStruct.text) && Intrinsics.LJFF(this.color, inboxTextStruct.color) && Intrinsics.LJFF(this.font, inboxTextStruct.font);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.color.hashCode()) * 31) + this.font.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxTextStruct(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", font=");
        sbLIZ.append(this.font);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InboxTextStruct() {
        this("", "", "");
    }

    public InboxTextStruct(String str, String str2, String str3) {
        this.text = str;
        this.color = str2;
        this.font = str3;
    }
}
