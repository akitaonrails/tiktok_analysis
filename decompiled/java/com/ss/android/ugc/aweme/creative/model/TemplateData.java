package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CameraSlotModel;
import com.ss.android.ugc.aweme.creative.model.TemplateData;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateData implements Parcelable, Serializable {
    public static final Parcelable.Creator<TemplateData> CREATOR = new Parcelable.Creator<TemplateData>() { // from class: X.0Kqz
        @Override // android.os.Parcelable.Creator
        public final TemplateData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TemplateData(numValueOf, parcel.readString(), parcel.readString(), CameraSlotModel.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateData[] newArray(int i) {
            return new TemplateData[i];
        }
    };

    @C040H
    public CameraSlotModel cameraSlotModel;

    @C040H
    public String mvId;

    @C040H
    public Integer templateType;

    @C040H
    public String templateTypeInternal;

    @C040H
    public String ttTemplateType;

    public TemplateData() {
        this(null, null, null, new CameraSlotModel(new ArrayList(), -1, new ArrayList(), -1, null, false), null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.templateType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.ttTemplateType);
        parcel.writeString(this.mvId);
        this.cameraSlotModel.writeToParcel(parcel, i);
        parcel.writeString(this.templateTypeInternal);
    }

    public final CameraSlotModel getCameraSlotModel() {
        return this.cameraSlotModel;
    }

    public final String getMvId() {
        return this.mvId;
    }

    public final Integer getTemplateType() {
        return this.templateType;
    }

    public final String getTemplateTypeInternal() {
        return this.templateTypeInternal;
    }

    public final String getTtTemplateType() {
        return this.ttTemplateType;
    }

    public final void setCameraSlotModel(CameraSlotModel cameraSlotModel) {
        this.cameraSlotModel = cameraSlotModel;
    }

    public final void setMvId(String str) {
        this.mvId = str;
    }

    public final void setTemplateType(Integer num) {
        this.templateType = num;
    }

    public final void setTemplateTypeInternal(String str) {
        this.templateTypeInternal = str;
    }

    public final void setTtTemplateType(String str) {
        this.ttTemplateType = str;
    }

    public TemplateData(Integer num, String str, String str2, CameraSlotModel cameraSlotModel, String str3) {
        this.templateType = num;
        this.ttTemplateType = str;
        this.mvId = str2;
        this.cameraSlotModel = cameraSlotModel;
        this.templateTypeInternal = str3;
    }
}
