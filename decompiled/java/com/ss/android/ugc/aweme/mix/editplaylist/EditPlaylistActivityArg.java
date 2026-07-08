package com.ss.android.ugc.aweme.mix.editplaylist;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivityArg;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class EditPlaylistActivityArg implements IRouteArg {
    public final UrlModel cover;
    public final String enterFrom;
    public final String enterMethod;
    public final Boolean isFromLiveReplay;
    public final Integer mixLabel;
    public final Integer partCount;
    public final String playlistId;
    public final String playlistName;
    public final String secUid;
    public final ShareInfo shareInfo;
    public final String uid;
    public static final Parcelable.Creator<EditPlaylistActivityArg> CREATOR = new Parcelable.Creator<EditPlaylistActivityArg>() { // from class: X.0TYJ
        @Override // android.os.Parcelable.Creator
        public final EditPlaylistActivityArg createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            ShareInfo shareInfo = (ShareInfo) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new EditPlaylistActivityArg(string, string2, string3, urlModel, numValueOf, numValueOf2, string4, string5, string6, shareInfo, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final EditPlaylistActivityArg[] newArray(int i) {
            return new EditPlaylistActivityArg[i];
        }
    };
    public static final int $stable = 8;

    public EditPlaylistActivityArg() {
        this("", "", null, null, null, null, null, null, null, null, null);
    }

    public final EditPlaylistActivityArg copy(String str, String str2, String str3, UrlModel urlModel, Integer num, Integer num2, String str4, String str5, String str6, ShareInfo shareInfo, Boolean bool) {
        return new EditPlaylistActivityArg(str, str2, str3, urlModel, num, num2, str4, str5, str6, shareInfo, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditPlaylistActivityArg)) {
            return false;
        }
        EditPlaylistActivityArg editPlaylistActivityArg = (EditPlaylistActivityArg) obj;
        return Intrinsics.LJFF(this.enterMethod, editPlaylistActivityArg.enterMethod) && Intrinsics.LJFF(this.enterFrom, editPlaylistActivityArg.enterFrom) && Intrinsics.LJFF(this.playlistId, editPlaylistActivityArg.playlistId) && Intrinsics.LJFF(this.cover, editPlaylistActivityArg.cover) && Intrinsics.LJFF(this.partCount, editPlaylistActivityArg.partCount) && Intrinsics.LJFF(this.mixLabel, editPlaylistActivityArg.mixLabel) && Intrinsics.LJFF(this.playlistName, editPlaylistActivityArg.playlistName) && Intrinsics.LJFF(this.uid, editPlaylistActivityArg.uid) && Intrinsics.LJFF(this.secUid, editPlaylistActivityArg.secUid) && Intrinsics.LJFF(this.shareInfo, editPlaylistActivityArg.shareInfo) && Intrinsics.LJFF(this.isFromLiveReplay, editPlaylistActivityArg.isFromLiveReplay);
    }

    public int hashCode() {
        int iHashCode = ((this.enterMethod.hashCode() * 31) + this.enterFrom.hashCode()) * 31;
        String str = this.playlistId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        int iHashCode3 = (iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Integer num = this.partCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.mixLabel;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.playlistName;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uid;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secUid;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ShareInfo shareInfo = this.shareInfo;
        int iHashCode9 = (iHashCode8 + (shareInfo == null ? 0 : shareInfo.hashCode())) * 31;
        Boolean bool = this.isFromLiveReplay;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "EditPlaylistActivityArg(enterMethod=" + this.enterMethod + ", enterFrom=" + this.enterFrom + ", playlistId=" + this.playlistId + ", cover=" + this.cover + ", partCount=" + this.partCount + ", mixLabel=" + this.mixLabel + ", playlistName=" + this.playlistName + ", uid=" + this.uid + ", secUid=" + this.secUid + ", shareInfo=" + this.shareInfo + ", isFromLiveReplay=" + this.isFromLiveReplay + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.playlistId);
        parcel.writeSerializable(this.cover);
        Integer num = this.partCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.mixLabel;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.playlistName);
        parcel.writeString(this.uid);
        parcel.writeString(this.secUid);
        parcel.writeSerializable(this.shareInfo);
        Boolean bool = this.isFromLiveReplay;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final Integer getMixLabel() {
        return this.mixLabel;
    }

    public final Integer getPartCount() {
        return this.partCount;
    }

    public final String getPlaylistId() {
        return this.playlistId;
    }

    public final String getPlaylistName() {
        return this.playlistName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final String getUid() {
        return this.uid;
    }

    public final Boolean isFromLiveReplay() {
        return this.isFromLiveReplay;
    }

    public EditPlaylistActivityArg(String str) {
        this(str, "", null, null, null, null, null, null, null, null, null);
    }

    public static EditPlaylistActivityArg __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        UrlModel urlModel;
        Integer num;
        Integer num2;
        String str4;
        String str5;
        String str6;
        ShareInfo shareInfo;
        Boolean bool = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("enter_method")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("enter_from")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("playlist_id")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("playlist_id"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (bundle.containsKey("cover")) {
            urlModel = (UrlModel) RouteParser.INSTANCE.parse(bundle.get("cover"), UrlModel.class);
        } else {
            i += 8;
            urlModel = null;
        }
        if (bundle.containsKey("part_count")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("part_count"), Integer.class);
        } else {
            i += 16;
            num = null;
        }
        if (bundle.containsKey("mix_label")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("mix_label"), Integer.class);
        } else {
            i += 32;
            num2 = null;
        }
        if (bundle.containsKey("playlist_name")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("playlist_name"), String.class);
        } else {
            i += 64;
            str4 = null;
        }
        if (bundle.containsKey("uid")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("uid"), String.class);
        } else {
            i += 128;
            str5 = null;
        }
        if (bundle.containsKey("secUid")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("secUid"), String.class);
        } else {
            i += 256;
            str6 = null;
        }
        if (bundle.containsKey("shareInfo")) {
            shareInfo = (ShareInfo) RouteParser.INSTANCE.parse(bundle.get("shareInfo"), ShareInfo.class);
        } else {
            i += 512;
            shareInfo = null;
        }
        if (bundle.containsKey("isFromLiveReplay")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("isFromLiveReplay"), Boolean.class);
        } else {
            i += 1024;
        }
        ShareInfo shareInfo2 = null;
        String str7 = "";
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) == 0) {
            str7 = str2;
        }
        Boolean bool2 = null;
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            urlModel = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        if ((i & 128) != 0) {
            str5 = null;
        }
        if ((i & 256) != 0) {
            str6 = null;
        }
        if ((i & 512) == 0) {
            shareInfo2 = shareInfo;
        }
        if ((i & 1024) == 0) {
            bool2 = bool;
        }
        return new EditPlaylistActivityArg(str, str7, str3, urlModel, num, num2, str4, str5, str6, shareInfo2, bool2);
    }

    public EditPlaylistActivityArg(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, null, null, null);
    }

    public EditPlaylistActivityArg(String str, String str2, String str3) {
        this(str, str2, str3, null, null, null, null, null, null, null, null);
    }

    public EditPlaylistActivityArg(String str, String str2, String str3, UrlModel urlModel) {
        this(str, str2, str3, urlModel, null, null, null, null, null, null, null);
    }

    public EditPlaylistActivityArg(String str, String str2, String str3, UrlModel urlModel, Integer num) {
        this(str, str2, str3, urlModel, num, null, null, null, null, null, null);
    }

    public EditPlaylistActivityArg(String str, String str2, String str3, UrlModel urlModel, Integer num, Integer num2) {
        this(str, str2, str3, urlModel, num, num2, null, null, null, null, null);
    }

    public EditPlaylistActivityArg(String str, String str2, String str3, UrlModel urlModel, Integer num, Integer num2, String str4) {
        this(str, str2, str3, urlModel, num, num2, str4, null, null, null, null);
    }

    public EditPlaylistActivityArg(String str, String str2, String str3, UrlModel urlModel, Integer num, Integer num2, String str4, String str5) {
        this(str, str2, str3, urlModel, num, num2, str4, str5, null, null, null);
    }

    public EditPlaylistActivityArg(String str, String str2, String str3, UrlModel urlModel, Integer num, Integer num2, String str4, String str5, String str6) {
        this(str, str2, str3, urlModel, num, num2, str4, str5, str6, null, null);
    }

    public EditPlaylistActivityArg(String str, String str2, String str3, UrlModel urlModel, Integer num, Integer num2, String str4, String str5, String str6, ShareInfo shareInfo) {
        this(str, str2, str3, urlModel, num, num2, str4, str5, str6, shareInfo, null);
    }

    public EditPlaylistActivityArg(String str, String str2, String str3, UrlModel urlModel, Integer num, Integer num2, String str4, String str5, String str6, ShareInfo shareInfo, Boolean bool) {
        this.enterMethod = str;
        this.enterFrom = str2;
        this.playlistId = str3;
        this.cover = urlModel;
        this.partCount = num;
        this.mixLabel = num2;
        this.playlistName = str4;
        this.uid = str5;
        this.secUid = str6;
        this.shareInfo = shareInfo;
        this.isFromLiveReplay = bool;
    }
}
