package com.ss.android.ugc.aweme.creative.model.photomode;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeDefaultMusicModel;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModePostContentModel;
import com.ss.android.ugc.aweme.shortvideo.model.TransAnchorData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PhotoModePostContentModel implements Parcelable {
    public static final Parcelable.Creator<PhotoModePostContentModel> CREATOR = new Parcelable.Creator<PhotoModePostContentModel>() { // from class: X.0MP4
        @Override // android.os.Parcelable.Creator
        public final PhotoModePostContentModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            PhotoModeDefaultMusicModel photoModeDefaultMusicModelCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(PhotoModePostContentModel.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                photoModeDefaultMusicModelCreateFromParcel = PhotoModeDefaultMusicModel.CREATOR.createFromParcel(parcel);
            }
            return new PhotoModePostContentModel(string, string2, numValueOf, arrayListCreateStringArrayList, arrayList, photoModeDefaultMusicModelCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoModePostContentModel[] newArray(int i) {
            return new PhotoModePostContentModel[i];
        }
    };

    @C09CT("photo_mode_post_anchors")
    public final ArrayList<TransAnchorData> anchors;

    @C040H
    public final Integer coverIndex;

    @C040H
    public final PhotoModeDefaultMusicModel defaultMusic;

    @C040H
    public final String description;

    @C09CT("photo_mode_post_hashtags")
    public final ArrayList<String> hashtags;

    @C040H
    public final String title;

    public PhotoModePostContentModel() {
        this("", "", 0, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModePostContentModel)) {
            return false;
        }
        PhotoModePostContentModel photoModePostContentModel = (PhotoModePostContentModel) obj;
        return Intrinsics.LJFF(this.title, photoModePostContentModel.title) && Intrinsics.LJFF(this.description, photoModePostContentModel.description) && Intrinsics.LJFF(this.coverIndex, photoModePostContentModel.coverIndex) && Intrinsics.LJFF(this.hashtags, photoModePostContentModel.hashtags) && Intrinsics.LJFF(this.anchors, photoModePostContentModel.anchors) && Intrinsics.LJFF(this.defaultMusic, photoModePostContentModel.defaultMusic);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.coverIndex;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ArrayList<String> arrayList = this.hashtags;
        int iHashCode4 = (iHashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<TransAnchorData> arrayList2 = this.anchors;
        int iHashCode5 = (iHashCode4 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        PhotoModeDefaultMusicModel photoModeDefaultMusicModel = this.defaultMusic;
        return iHashCode5 + (photoModeDefaultMusicModel != null ? photoModeDefaultMusicModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModePostContentModel(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", coverIndex=");
        sbLIZ.append(this.coverIndex);
        sbLIZ.append(", hashtags=");
        sbLIZ.append(this.hashtags);
        sbLIZ.append(", anchors=");
        sbLIZ.append(this.anchors);
        sbLIZ.append(", defaultMusic=");
        sbLIZ.append(this.defaultMusic);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Integer num = this.coverIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.hashtags);
        ArrayList<TransAnchorData> arrayList = this.anchors;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<TransAnchorData> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        PhotoModeDefaultMusicModel photoModeDefaultMusicModel = this.defaultMusic;
        if (photoModeDefaultMusicModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoModeDefaultMusicModel.writeToParcel(parcel, i);
        }
    }

    public PhotoModePostContentModel(String str, String str2, Integer num, ArrayList<String> arrayList, ArrayList<TransAnchorData> arrayList2, PhotoModeDefaultMusicModel photoModeDefaultMusicModel) {
        this.title = str;
        this.description = str2;
        this.coverIndex = num;
        this.hashtags = arrayList;
        this.anchors = arrayList2;
        this.defaultMusic = photoModeDefaultMusicModel;
    }
}
