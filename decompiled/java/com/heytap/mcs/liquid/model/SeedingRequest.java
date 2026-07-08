package com.heytap.mcs.liquid.model;

import X.AbstractBinderC814350Vx3;
import X.C854630Xfp;
import X.InterfaceC814360Vx4;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public class SeedingRequest implements Parcelable {
    public static final Parcelable.Creator<SeedingRequest> CREATOR = new C854630Xfp(17);
    public ActionInfo action;
    public InterfaceC814360Vx4 callback;
    public String callerPackageName;
    public String desc;
    public int loadingType;
    public ActionInfo managerAction;
    public int percent;
    public String requestId;
    public int status;
    public String targetName;
    public String token;
    public String traceId;

    public SeedingRequest() {
    }

    public SeedingRequest(Parcel parcel) {
        this.requestId = parcel.readString();
        this.callerPackageName = parcel.readString();
        this.loadingType = parcel.readInt();
        this.targetName = parcel.readString();
        this.traceId = parcel.readString();
        this.token = parcel.readString();
        this.status = parcel.readInt();
        this.desc = parcel.readString();
        this.action = (ActionInfo) parcel.readParcelable(ActionInfo.class.getClassLoader());
        this.managerAction = (ActionInfo) parcel.readParcelable(ActionInfo.class.getClassLoader());
        this.percent = parcel.readInt();
        this.callback = AbstractBinderC814350Vx3.asInterface(parcel.readStrongBinder());
    }

    public SeedingRequest(String str, String str2, int i, String str3, String str4, String str5, int i2, String str6, ActionInfo actionInfo, ActionInfo actionInfo2, int i3, InterfaceC814360Vx4 interfaceC814360Vx4) {
        this.requestId = str;
        this.callerPackageName = str2;
        this.loadingType = i;
        this.targetName = str3;
        this.traceId = str4;
        this.token = str5;
        this.status = i2;
        this.desc = str6;
        this.action = actionInfo;
        this.managerAction = actionInfo2;
        this.percent = i3;
        this.callback = interfaceC814360Vx4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.requestId);
        parcel.writeString(this.callerPackageName);
        parcel.writeInt(this.loadingType);
        parcel.writeString(this.targetName);
        parcel.writeString(this.traceId);
        parcel.writeString(this.token);
        parcel.writeInt(this.status);
        parcel.writeString(this.desc);
        parcel.writeParcelable(this.action, i);
        parcel.writeParcelable(this.managerAction, i);
        parcel.writeInt(this.percent);
        InterfaceC814360Vx4 interfaceC814360Vx4 = this.callback;
        parcel.writeStrongBinder(interfaceC814360Vx4 != null ? interfaceC814360Vx4.asBinder() : null);
    }
}
