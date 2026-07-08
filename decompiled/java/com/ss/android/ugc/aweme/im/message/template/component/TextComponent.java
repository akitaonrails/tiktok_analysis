package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C2188811AlT;
import X.C2243491CrT;
import X.C2243511CrV;
import X.C2243521CrW;
import X.C2243561Cra;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class TextComponent implements BaseComponent<C2243521CrW> {
    public final String receiverStarlingKey;
    public final String senderStarlingKey;
    public final String text;
    public static final C2243491CrT Companion = new C2243491CrT();
    public static final Parcelable.Creator<TextComponent> CREATOR = new Parcelable.Creator<TextComponent>() { // from class: X.1CrY
        @Override // android.os.Parcelable.Creator
        public final TextComponent createFromParcel(Parcel parcel) {
            return new TextComponent(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextComponent[] newArray(int i) {
            return new TextComponent[i];
        }
    };
    public static final C01GW<TextComponent> EMPTY_TEXT_COMPONENT$delegate = C452501pT.LIZIZ(new C2243561Cra());

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextComponent)) {
            return false;
        }
        TextComponent textComponent = (TextComponent) obj;
        return Intrinsics.LJFF(this.text, textComponent.text) && Intrinsics.LJFF(this.senderStarlingKey, textComponent.senderStarlingKey) && Intrinsics.LJFF(this.receiverStarlingKey, textComponent.receiverStarlingKey);
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.senderStarlingKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.receiverStarlingKey;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextComponent(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", senderStarlingKey=");
        sbLIZ.append(this.senderStarlingKey);
        sbLIZ.append(", receiverStarlingKey=");
        sbLIZ.append(this.receiverStarlingKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.senderStarlingKey);
        parcel.writeString(this.receiverStarlingKey);
    }

    public final C2243521CrW LIZ() {
        C2243511CrV c2243511CrV = new C2243511CrV();
        c2243511CrV.LIZLLL = this.text;
        c2243511CrV.LJ = this.senderStarlingKey;
        c2243511CrV.LJFF = this.receiverStarlingKey;
        return c2243511CrV.build();
    }

    public TextComponent(String str, String str2, String str3) {
        this.text = str;
        this.senderStarlingKey = str2;
        this.receiverStarlingKey = str3;
    }
}
