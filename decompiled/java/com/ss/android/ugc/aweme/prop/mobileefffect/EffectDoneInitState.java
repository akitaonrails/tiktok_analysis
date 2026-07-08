package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.C2188811AlT;
import X.InterfaceC0148002o;
import X.InterfaceC111300bX;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneInitState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class EffectDoneInitState implements InterfaceC0148002o, Parcelable, InterfaceC111300bX {
    public final String author;
    public final Uri editedImage;
    public final String effectName;
    public final UrlModel originalEffectImage;
    public static final Parcelable.Creator<EffectDoneInitState> CREATOR = new Parcelable.Creator<EffectDoneInitState>() { // from class: X.0r7s
        @Override // android.os.Parcelable.Creator
        public final EffectDoneInitState createFromParcel(Parcel parcel) {
            return new EffectDoneInitState(parcel.readString(), parcel.readString(), (UrlModel) parcel.readSerializable(), (Uri) parcel.readParcelable(EffectDoneInitState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EffectDoneInitState[] newArray(int i) {
            return new EffectDoneInitState[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectDoneInitState)) {
            return false;
        }
        EffectDoneInitState effectDoneInitState = (EffectDoneInitState) obj;
        return Intrinsics.LJFF(this.effectName, effectDoneInitState.effectName) && Intrinsics.LJFF(this.author, effectDoneInitState.author) && Intrinsics.LJFF(this.originalEffectImage, effectDoneInitState.originalEffectImage) && Intrinsics.LJFF(this.editedImage, effectDoneInitState.editedImage);
    }

    public final int hashCode() {
        int iHashCode = ((((this.effectName.hashCode() * 31) + this.author.hashCode()) * 31) + this.originalEffectImage.hashCode()) * 31;
        Uri uri = this.editedImage;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectDoneInitState(effectName=");
        sbLIZ.append(this.effectName);
        sbLIZ.append(", author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", originalEffectImage=");
        sbLIZ.append(this.originalEffectImage);
        sbLIZ.append(", editedImage=");
        sbLIZ.append(this.editedImage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectName);
        parcel.writeString(this.author);
        parcel.writeSerializable(this.originalEffectImage);
        parcel.writeParcelable(this.editedImage, i);
    }

    public EffectDoneInitState(String str, String str2, UrlModel urlModel, Uri uri) {
        this.effectName = str;
        this.author = str2;
        this.originalEffectImage = urlModel;
        this.editedImage = uri;
    }
}
