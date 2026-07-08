package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.StylePrompt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class StylePrompt implements Parcelable {
    public static final Parcelable.Creator<StylePrompt> CREATOR = new Parcelable.Creator<StylePrompt>() { // from class: X.0EKN
        @Override // android.os.Parcelable.Creator
        public final StylePrompt createFromParcel(Parcel parcel) {
            return new StylePrompt(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StylePrompt[] newArray(int i) {
            return new StylePrompt[i];
        }
    };

    @C09CT("style_prompt")
    public final String defaultPrompt;

    @C09CT("style_prompt_i2i")
    public final String i2iPrompt;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylePrompt)) {
            return false;
        }
        StylePrompt stylePrompt = (StylePrompt) obj;
        return Intrinsics.LJFF(this.defaultPrompt, stylePrompt.defaultPrompt) && Intrinsics.LJFF(this.i2iPrompt, stylePrompt.i2iPrompt);
    }

    public final int hashCode() {
        return (this.defaultPrompt.hashCode() * 31) + this.i2iPrompt.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StylePrompt(defaultPrompt=");
        sbLIZ.append(this.defaultPrompt);
        sbLIZ.append(", i2iPrompt=");
        sbLIZ.append(this.i2iPrompt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.defaultPrompt);
        parcel.writeString(this.i2iPrompt);
    }

    public StylePrompt() {
        this("", "");
    }

    public StylePrompt(String str, String str2) {
        this.defaultPrompt = str;
        this.i2iPrompt = str2;
    }
}
