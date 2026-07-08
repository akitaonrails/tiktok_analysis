package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class TaskMentionedUser implements Serializable, Parcelable {
    public static final Parcelable.Creator<TaskMentionedUser> CREATOR = new Parcelable.Creator<TaskMentionedUser>() { // from class: com.ss.android.ugc.aweme.discover.model.TaskMentionedUser.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TaskMentionedUser createFromParcel(Parcel parcel) {
            return new TaskMentionedUser(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TaskMentionedUser[] newArray(int i) {
            return new TaskMentionedUser[i];
        }
    };

    @C09CT("nickname")
    public String nickname;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("uid")
    public String userId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getUserId() {
        return this.userId;
    }

    public TaskMentionedUser(Parcel parcel) {
        this.userId = "";
        this.secUid = "";
        this.userId = parcel.readString();
        this.secUid = parcel.readString();
        this.nickname = parcel.readString();
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeString(this.secUid);
        parcel.writeString(this.nickname);
    }
}
