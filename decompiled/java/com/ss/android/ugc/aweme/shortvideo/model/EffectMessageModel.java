package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class EffectMessageModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EffectMessageModel> CREATOR = new Creator();

    @C09CT("effectMessages")
    public List<String> effectMessages;

    public static final class Creator implements Parcelable.Creator<EffectMessageModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EffectMessageModel createFromParcel(Parcel parcel) {
            return new EffectMessageModel(parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EffectMessageModel[] newArray(int i) {
            return new EffectMessageModel[i];
        }
    }

    public final EffectMessageModel copy(List<String> list) {
        return new EffectMessageModel(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EffectMessageModel) && Intrinsics.LJFF(this.effectMessages, ((EffectMessageModel) obj).effectMessages);
    }

    public int hashCode() {
        return this.effectMessages.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectMessageModel(effectMessages=");
        sbLIZ.append(this.effectMessages);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.effectMessages);
    }

    public final List<String> getEffectMessages() {
        return this.effectMessages;
    }

    public EffectMessageModel(List<String> list) {
        this.effectMessages = list;
    }

    public final void setEffectMessages(List<String> list) {
        this.effectMessages = list;
    }
}
