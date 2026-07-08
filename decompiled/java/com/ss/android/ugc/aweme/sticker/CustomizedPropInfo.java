package com.ss.android.ugc.aweme.sticker;

import X.C860600XpS;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.CustomizedPropInfo;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class CustomizedPropInfo implements Serializable, Parcelable {
    public static final C860600XpS CREATOR = new Parcelable.Creator<CustomizedPropInfo>() { // from class: X.0XpS
        @Override // android.os.Parcelable.Creator
        public final CustomizedPropInfo createFromParcel(Parcel parcel) {
            return new CustomizedPropInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CustomizedPropInfo[] newArray(int i) {
            return new CustomizedPropInfo[i];
        }
    };
    public String businessExtra;
    public String customizedPropIconPath;
    public String customizedPropId;
    public String customizedPropPath;
    public String diyType;
    public String templatePropId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CustomizedPropInfo() {
    }

    public final String getBusinessExtra() {
        return this.businessExtra;
    }

    public final String getCustomizedPropIconPath() {
        return this.customizedPropIconPath;
    }

    public final String getCustomizedPropId() {
        return this.customizedPropId;
    }

    public final String getCustomizedPropPath() {
        return this.customizedPropPath;
    }

    public final String getDiyType() {
        return this.diyType;
    }

    public final String getTemplatePropId() {
        return this.templatePropId;
    }

    public CustomizedPropInfo(Parcel parcel) {
        this();
        this.templatePropId = parcel.readString();
        this.customizedPropId = parcel.readString();
        this.customizedPropIconPath = parcel.readString();
        this.customizedPropPath = parcel.readString();
        this.diyType = parcel.readString();
        this.businessExtra = parcel.readString();
    }

    public final Object getBusinessExtra(String str) {
        String str2 = this.businessExtra;
        Object objOpt = null;
        if (str2 != null) {
            try {
                objOpt = new JSONObject(str2).opt(str);
                return objOpt;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return objOpt;
    }

    public final void setBusinessExtra(String str) {
        this.businessExtra = str;
    }

    public final void setCustomizedPropIconPath(String str) {
        this.customizedPropIconPath = str;
    }

    public final void setCustomizedPropId(String str) {
        this.customizedPropId = str;
    }

    public final void setCustomizedPropPath(String str) {
        this.customizedPropPath = str;
    }

    public final void setDiyType(String str) {
        this.diyType = str;
    }

    public final void setTemplatePropId(String str) {
        this.templatePropId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templatePropId);
        parcel.writeString(this.customizedPropId);
        parcel.writeString(this.customizedPropIconPath);
        parcel.writeString(this.customizedPropPath);
        parcel.writeString(this.diyType);
        parcel.writeString(this.businessExtra);
    }
}
