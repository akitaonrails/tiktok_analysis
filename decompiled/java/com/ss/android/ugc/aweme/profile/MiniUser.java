package com.ss.android.ugc.aweme.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.model.ShopTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes20.dex */
public final class MiniUser implements Parcelable {
    public static final Parcelable.Creator<MiniUser> CREATOR = new Parcelable.Creator<MiniUser>() { // from class: X.0iqY
        @Override // android.os.Parcelable.Creator
        public final MiniUser createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new MiniUser(i, i2, i3, string, string2, string3, string4, string5, string6, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final MiniUser[] newArray(int i) {
            return new MiniUser[i];
        }
    };
    public final String bioSecureUrl;
    public final String bioUrl;
    public final int followStatus;
    public int followerStatus;
    public final String id;
    public final boolean isBlock;
    public final boolean isLive;
    public final String nickname;
    public final String secId;
    public final String shopRouter;
    public final int tabType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.secId);
        parcel.writeString(this.nickname);
        parcel.writeInt(this.followStatus);
        parcel.writeInt(this.followerStatus);
        parcel.writeInt(this.tabType);
        parcel.writeString(this.shopRouter);
        parcel.writeInt(this.isLive ? 1 : 0);
        parcel.writeString(this.bioUrl);
        parcel.writeString(this.bioSecureUrl);
        parcel.writeInt(this.isBlock ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MiniUser(User user) {
        ShopTab shopTab;
        String uid = user.getUid();
        uid = uid == null ? "" : uid;
        String secUid = user.getSecUid();
        secUid = secUid == null ? "" : secUid;
        String nickname = user.getNickname();
        nickname = nickname == null ? "" : nickname;
        int followStatus = user.getFollowStatus();
        int followerStatus = user.getFollowerStatus();
        int i = user.tabType;
        TabSetting tabSetting = user.getTabSetting();
        String str = (tabSetting == null || (shopTab = tabSetting.shopTab) == null || (str = shopTab.shopSchemaV2) == null) ? "" : str;
        boolean zIsLive = user.isLive();
        String bioUrl = user.getBioUrl();
        bioUrl = bioUrl == null ? "" : bioUrl;
        String bioSecureUrl = user.getBioSecureUrl();
        this(followStatus, followerStatus, i, uid, secUid, nickname, str, bioUrl, bioSecureUrl != null ? bioSecureUrl : "", zIsLive, user.isBlock);
    }

    public MiniUser(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.id = str;
        this.secId = str2;
        this.nickname = str3;
        this.followStatus = i;
        this.followerStatus = i2;
        this.tabType = i3;
        this.shopRouter = str4;
        this.isLive = z;
        this.bioUrl = str5;
        this.bioSecureUrl = str6;
        this.isBlock = z2;
    }
}
