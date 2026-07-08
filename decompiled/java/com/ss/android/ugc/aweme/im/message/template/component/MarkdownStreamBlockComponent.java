package com.ss.android.ugc.aweme.im.message.template.component;

import X.C01GW;
import X.C2188811AlT;
import X.C2240191Cm9;
import X.C2240241CmE;
import X.C452501pT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.MarkdownStreamBlockComponent;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class MarkdownStreamBlockComponent implements BaseComponent<C2240191Cm9> {
    public final String text;
    public static final C2240241CmE Companion = new Object() { // from class: X.1CmE
    };
    public static final Parcelable.Creator<MarkdownStreamBlockComponent> CREATOR = new Parcelable.Creator<MarkdownStreamBlockComponent>() { // from class: X.1CmD
        @Override // android.os.Parcelable.Creator
        public final MarkdownStreamBlockComponent createFromParcel(Parcel parcel) {
            return new MarkdownStreamBlockComponent(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarkdownStreamBlockComponent[] newArray(int i) {
            return new MarkdownStreamBlockComponent[i];
        }
    };
    public static final C01GW<MarkdownStreamBlockComponent> EMPTY$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(75));

    public MarkdownStreamBlockComponent() {
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
        return (obj instanceof MarkdownStreamBlockComponent) && Intrinsics.LJFF(this.text, ((MarkdownStreamBlockComponent) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MarkdownStreamBlockComponent(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }

    public /* synthetic */ MarkdownStreamBlockComponent(int i) {
        this("");
    }

    public MarkdownStreamBlockComponent(String str) {
        this.text = str;
    }
}
