package com.ss.android.ugc.gamora.editor.experiment;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.editor.experiment.LyricsEffectConfig;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class LyricsEffectConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator<LyricsEffectConfig> CREATOR = new Parcelable.Creator<LyricsEffectConfig>() { // from class: X.0F4c
        @Override // android.os.Parcelable.Creator
        public final LyricsEffectConfig createFromParcel(Parcel parcel) {
            return new LyricsEffectConfig(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LyricsEffectConfig[] newArray(int i) {
            return new LyricsEffectConfig[i];
        }
    };

    @C09CT("default_apply_resource_id")
    public final String defaultApplyResId;

    public final LyricsEffectConfig copy(String str) {
        return new LyricsEffectConfig(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LyricsEffectConfig) && Intrinsics.LJFF(this.defaultApplyResId, ((LyricsEffectConfig) obj).defaultApplyResId);
    }

    public int hashCode() {
        return this.defaultApplyResId.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricsEffectConfig(defaultApplyResId=");
        sbLIZ.append(this.defaultApplyResId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.defaultApplyResId);
    }

    public LyricsEffectConfig() {
        this("");
    }

    public final String getDefaultApplyResId() {
        return this.defaultApplyResId;
    }

    public LyricsEffectConfig(String str) {
        this.defaultApplyResId = str;
    }
}
