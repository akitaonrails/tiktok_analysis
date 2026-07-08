package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import android.os.Parcel;

/* JADX INFO: loaded from: classes36.dex */
public class VEVideoLensOneKeyHdrParam extends VEBaseFilterParam {
    public int asf_mode;
    public int hdr_mode;
    public String kernel_path;
    public String model_path;
    public int power_level = 3;
    public int scene_case = 20001;
    public int disable_denoise = 1;

    public VEVideoLensOneKeyHdrParam() {
        this.filterName = "lens one key hdr";
        this.filterType = 35;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoAjustmentFilterParam{, model_path=");
        sbLIZ.append(this.model_path);
        sbLIZ.append(", kernel_path=");
        sbLIZ.append(this.kernel_path);
        sbLIZ.append(", power_level=");
        sbLIZ.append(this.power_level);
        sbLIZ.append(", scene_case=");
        sbLIZ.append(this.scene_case);
        sbLIZ.append(", disable_denoise=");
        sbLIZ.append(this.disable_denoise);
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

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
