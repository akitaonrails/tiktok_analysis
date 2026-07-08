package com.ss.android.ugc.aweme.creative.model.common;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class LogPbBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<LogPbBean> CREATOR = new Parcelable.Creator<LogPbBean>() { // from class: X.119F
        @Override // android.os.Parcelable.Creator
        public final LogPbBean createFromParcel(Parcel parcel) {
            return new LogPbBean(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LogPbBean[] newArray(int i) {
            return new LogPbBean[i];
        }
    };

    @C09CT("impr_id")
    public String imprId;

    public LogPbBean() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imprId);
    }

    public final String getImprId() {
        return this.imprId;
    }

    public LogPbBean(String str) {
        this.imprId = str;
    }

    public final void setImprId(String str) {
        this.imprId = str;
    }
}
