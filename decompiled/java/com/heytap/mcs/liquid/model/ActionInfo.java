package com.heytap.mcs.liquid.model;

import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public class ActionInfo implements Parcelable {
    public static final Parcelable.Creator<ActionInfo> CREATOR = new C854630Xfp(15);
    public String actionActivity;
    public String actionParams;
    public String actionUrl;
    public int clickType;
    public String targetPkgName;

    public ActionInfo(Parcel parcel) {
        this.clickType = parcel.readInt();
        this.actionActivity = parcel.readString();
        this.actionUrl = parcel.readString();
        this.actionParams = parcel.readString();
        this.targetPkgName = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ActionInfo{clickType=" + this.clickType + ", actionActivity='" + this.actionActivity + "', actionUrl='" + this.actionUrl + "', actionParams='" + this.actionParams + "', targetPkgName='" + this.targetPkgName + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.clickType);
        parcel.writeString(this.actionActivity);
        parcel.writeString(this.actionUrl);
        parcel.writeString(this.actionParams);
        parcel.writeString(this.targetPkgName);
    }
}
