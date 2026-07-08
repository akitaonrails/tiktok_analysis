package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SocialModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<SocialModel> CREATOR = new Parcelable.Creator<SocialModel>() { // from class: com.ss.android.ugc.aweme.shortvideo.model.SocialModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SocialModel createFromParcel(Parcel parcel) {
            return new SocialModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SocialModel[] newArray(int i) {
            return new SocialModel[i];
        }
    };

    @C09CT("friends")
    public List<String> friends;

    @C09CT("rec_users")
    public List<String> recUsers;

    @C09CT("recommend")
    public int recommend;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getFriends() {
        List<String> list = this.friends;
        if (list == null || list.size() == 0) {
            return null;
        }
        return TextUtils.join(",", this.friends);
    }

    public String getRecUsers() {
        List<String> list = this.recUsers;
        if (list == null || list.size() == 0) {
            return null;
        }
        return TextUtils.join(",", this.recUsers);
    }

    public SocialModel() {
    }

    public SocialModel(Parcel parcel) {
        this.recommend = parcel.readInt();
        this.friends = parcel.createStringArrayList();
        this.recUsers = parcel.createStringArrayList();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.recommend);
        parcel.writeStringList(this.friends);
        parcel.writeStringList(this.recUsers);
    }
}
