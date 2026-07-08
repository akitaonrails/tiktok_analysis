package com.ss.android.ugc.aweme.editSticker.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.RecCoverTitleBean;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class RecCoverTitleBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecCoverTitleBean> CREATOR = new Parcelable.Creator<RecCoverTitleBean>() { // from class: X.0wVT
        @Override // android.os.Parcelable.Creator
        public final RecCoverTitleBean createFromParcel(Parcel parcel) {
            return new RecCoverTitleBean(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecCoverTitleBean[] newArray(int i) {
            return new RecCoverTitleBean[i];
        }
    };

    @C09CT("content")
    public String content;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.content);
    }

    public RecCoverTitleBean() {
        this(0L, "");
    }

    public final String getContent() {
        return this.content;
    }

    public final long getId() {
        return this.id;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public RecCoverTitleBean(long j, String str) {
        this.id = j;
        this.content = str;
    }
}
