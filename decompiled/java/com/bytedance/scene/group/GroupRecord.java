package com.bytedance.scene.group;

import X.C19BL;
import X.C21523519Ld;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes33.dex */
public class GroupRecord implements Parcelable {
    public static final Parcelable.Creator<GroupRecord> CREATOR = new C21523519Ld(6);
    public int LL;
    public Scene LLILLJJLI;
    public String LLILLL;
    public final boolean LLILZ;
    public String LLILZIL;
    public Bundle LLILZLL;
    public boolean isHidden;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public GroupRecord() {
        this.LL = -1;
    }

    public GroupRecord(Parcel parcel) {
        boolean z;
        this.LL = -1;
        this.LL = parcel.readInt();
        String string = parcel.readString();
        C19BL.LJI(string, "tag not found in Parcel");
        this.LLILLL = string;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isHidden = z;
        this.LLILZ = parcel.readByte() != 0;
        String string2 = parcel.readString();
        C19BL.LJI(string2, "class name not found in Parcel");
        this.LLILZIL = string2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LL);
        parcel.writeString(this.LLILLL);
        parcel.writeByte(this.isHidden ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.LLILZ ? (byte) 1 : (byte) 0);
        parcel.writeString(this.LLILZIL);
    }
}
