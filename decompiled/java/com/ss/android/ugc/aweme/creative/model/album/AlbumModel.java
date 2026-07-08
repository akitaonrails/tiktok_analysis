package com.ss.android.ugc.aweme.creative.model.album;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.album.AlbumModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumModel implements Parcelable {
    public static final Parcelable.Creator<AlbumModel> CREATOR = new Parcelable.Creator<AlbumModel>() { // from class: X.0KxC
        @Override // android.os.Parcelable.Creator
        public final AlbumModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            Integer numValueOf;
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(AlbumModel.class.getClassLoader()));
                }
            }
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            int i5 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                linkedHashSet.add(parcel.readString());
            }
            int i7 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                linkedHashSet2.add(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new AlbumModel(string, arrayList, i3, i4, z, arrayListCreateStringArrayList, string2, numValueOf, linkedHashSet, linkedHashSet2, numValueOf2, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumModel[] newArray(int i) {
            return new AlbumModel[i];
        }
    };

    @C040H
    public String albumPreviewNextMethod;

    @C09CT("is_album_memory_selection")
    public Integer albumSelectionRestoreState;

    @C040H
    public Set<String> enteredAlbum;

    @C040H
    public Set<String> enteredTab;

    @C040H
    public ArrayList<ImportVideoInfo> importInfoList;

    @C040H
    public boolean isMultiVideo;

    @C040H
    public Integer maxSelectItemRank;

    @C040H
    public int photoCount;

    @C040H
    public int totalShowItemCnt;

    @C09CT("upload_method")
    public String uploadMethod;

    @C040H
    public List<String> uploadTabNameList;

    @C040H
    public int videoCount;

    public AlbumModel() {
        this(null, new ArrayList(), 0, 0, false, null, "", null, new LinkedHashSet(), new LinkedHashSet(), null, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadMethod);
        ArrayList<ImportVideoInfo> arrayList = this.importInfoList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<ImportVideoInfo> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeInt(this.videoCount);
        parcel.writeInt(this.photoCount);
        parcel.writeInt(this.isMultiVideo ? 1 : 0);
        parcel.writeStringList(this.uploadTabNameList);
        parcel.writeString(this.albumPreviewNextMethod);
        Integer num = this.albumSelectionRestoreState;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Set<String> set = this.enteredAlbum;
        parcel.writeInt(set.size());
        Iterator<String> it3 = set.iterator();
        while (it3.hasNext()) {
            parcel.writeString(it3.next());
        }
        Set<String> set2 = this.enteredTab;
        parcel.writeInt(set2.size());
        Iterator<String> it4 = set2.iterator();
        while (it4.hasNext()) {
            parcel.writeString(it4.next());
        }
        Integer num2 = this.maxSelectItemRank;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.totalShowItemCnt);
    }

    public AlbumModel(String str, ArrayList<ImportVideoInfo> arrayList, int i, int i2, boolean z, List<String> list, String str2, Integer num, Set<String> set, Set<String> set2, Integer num2, int i3) {
        this.uploadMethod = str;
        this.importInfoList = arrayList;
        this.videoCount = i;
        this.photoCount = i2;
        this.isMultiVideo = z;
        this.uploadTabNameList = list;
        this.albumPreviewNextMethod = str2;
        this.albumSelectionRestoreState = num;
        this.enteredAlbum = set;
        this.enteredTab = set2;
        this.maxSelectItemRank = num2;
        this.totalShowItemCnt = i3;
    }
}
