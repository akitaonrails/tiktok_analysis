package com.ss.android.ugc.aweme.im.message.template.component;

import X.C18U7;
import X.C2188811AlT;
import X.C2240711Cmz;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetBotTextComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class VisualPoetBotTextComponent implements BaseComponent<C2240711Cmz> {
    public final String text;
    public static final C18U7 Companion = new Object() { // from class: X.18U7
    };
    public static final Parcelable.Creator<VisualPoetBotTextComponent> CREATOR = new Parcelable.Creator<VisualPoetBotTextComponent>() { // from class: X.18UN
        @Override // android.os.Parcelable.Creator
        public final VisualPoetBotTextComponent createFromParcel(Parcel parcel) {
            return new VisualPoetBotTextComponent(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VisualPoetBotTextComponent[] newArray(int i) {
            return new VisualPoetBotTextComponent[i];
        }
    };
    public static final VisualPoetBotTextComponent EMPTY_VISUAL_POET_BOT_TEXT = new VisualPoetBotTextComponent(0);

    public VisualPoetBotTextComponent() {
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
        return (obj instanceof VisualPoetBotTextComponent) && Intrinsics.LJFF(this.text, ((VisualPoetBotTextComponent) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualPoetBotTextComponent(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }

    public /* synthetic */ VisualPoetBotTextComponent(int i) {
        this("");
    }

    public VisualPoetBotTextComponent(String str) {
        this.text = str;
    }
}
