package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TTSAudioBean implements Parcelable {

    @C09CT("challenge_ids")
    public final List<String> challengeIds;
    public static final Parcelable.Creator<TTSAudioBean> CREATOR = new Parcelable.Creator<TTSAudioBean>() { // from class: X.0F7a
        @Override // android.os.Parcelable.Creator
        public final TTSAudioBean createFromParcel(Parcel parcel) {
            return new TTSAudioBean(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final TTSAudioBean[] newArray(int i) {
            return new TTSAudioBean[i];
        }
    };
    public static final int $stable = 8;

    public TTSAudioBean() {
        this(null, 1, null);
    }

    public final TTSAudioBean copy(List<String> list) {
        return new TTSAudioBean(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TTSAudioBean) && Intrinsics.LJFF(this.challengeIds, ((TTSAudioBean) obj).challengeIds);
    }

    public int hashCode() {
        return this.challengeIds.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTSAudioBean(challengeIds=");
        sbLIZ.append(this.challengeIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.challengeIds);
    }

    public final List<String> getChallengeIds() {
        return this.challengeIds;
    }

    public TTSAudioBean(List<String> list) {
        this.challengeIds = list;
    }

    public TTSAudioBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
