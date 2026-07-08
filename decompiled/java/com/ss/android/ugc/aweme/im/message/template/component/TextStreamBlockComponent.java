package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C2188811AlT;
import X.C2240101Cm0;
import X.C2240131Cm3;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.TextStreamBlockComponent;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class TextStreamBlockComponent implements BaseComponent<C2240101Cm0> {
    public final String text;
    public static final C2240131Cm3 Companion = new Object() { // from class: X.1Cm3
    };
    public static final Parcelable.Creator<TextStreamBlockComponent> CREATOR = new Parcelable.Creator<TextStreamBlockComponent>() { // from class: X.1Cm2
        @Override // android.os.Parcelable.Creator
        public final TextStreamBlockComponent createFromParcel(Parcel parcel) {
            return new TextStreamBlockComponent(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextStreamBlockComponent[] newArray(int i) {
            return new TextStreamBlockComponent[i];
        }
    };
    public static final C01GW<TextStreamBlockComponent> EMPTY$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(77));

    public TextStreamBlockComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextStreamBlockComponent) && Intrinsics.LJFF(this.text, ((TextStreamBlockComponent) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextStreamBlockComponent(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }

    public /* synthetic */ TextStreamBlockComponent(int i) {
        this("");
    }

    public TextStreamBlockComponent(String str) {
        this.text = str;
    }
}
