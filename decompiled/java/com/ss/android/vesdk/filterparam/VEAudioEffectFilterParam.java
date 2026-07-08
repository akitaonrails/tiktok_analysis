package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.vesdk.VEAudioEffectBean;

/* JADX INFO: loaded from: classes36.dex */
public class VEAudioEffectFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioEffectFilterParam> CREATOR = new C2325341G0m(22);
    public VEAudioEffectBean audioEffectBean;

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEAudioEffectFilterParam() {
        this.filterName = "audio effect";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAudioEffectFilterParam{audioEffectBean=");
        sbLIZ.append(this.audioEffectBean);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append('\'');
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEAudioEffectFilterParam(Parcel parcel) {
        this.audioEffectBean = (VEAudioEffectBean) parcel.readParcelable(VEAudioEffectBean.class.getClassLoader());
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.audioEffectBean, i);
    }
}
