package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PreviewVideoInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<PreviewVideoInfo> CREATOR = new Creator();

    @C09CT("file_size")
    public final String file_size;

    @C09CT("file_type")
    public final String file_type;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> url_list;

    @C09CT("video_bitrate")
    public final List<VideoBitrate> video_bitrate_list;

    public static final class Creator implements Parcelable.Creator<PreviewVideoInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreviewVideoInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(VideoBitrate.CREATOR.createFromParcel(parcel));
                }
            }
            return new PreviewVideoInfo(string, string2, string3, arrayListCreateStringArrayList, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreviewVideoInfo[] newArray(int i) {
            return new PreviewVideoInfo[i];
        }
    }

    public final PreviewVideoInfo copy(String str, String str2, String str3, List<String> list, List<VideoBitrate> list2) {
        return new PreviewVideoInfo(str, str2, str3, list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewVideoInfo)) {
            return false;
        }
        PreviewVideoInfo previewVideoInfo = (PreviewVideoInfo) obj;
        return Intrinsics.LJFF(this.uri, previewVideoInfo.uri) && Intrinsics.LJFF(this.file_size, previewVideoInfo.file_size) && Intrinsics.LJFF(this.file_type, previewVideoInfo.file_type) && Intrinsics.LJFF(this.url_list, previewVideoInfo.url_list) && Intrinsics.LJFF(this.video_bitrate_list, previewVideoInfo.video_bitrate_list);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.file_size;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.file_type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.url_list;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoBitrate> list2 = this.video_bitrate_list;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewVideoInfo(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", file_size=");
        sbLIZ.append(this.file_size);
        sbLIZ.append(", file_type=");
        sbLIZ.append(this.file_type);
        sbLIZ.append(", url_list=");
        sbLIZ.append(this.url_list);
        sbLIZ.append(", video_bitrate_list=");
        sbLIZ.append(this.video_bitrate_list);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.file_size);
        parcel.writeString(this.file_type);
        parcel.writeStringList(this.url_list);
        List<VideoBitrate> list = this.video_bitrate_list;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<VideoBitrate> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public final String getFile_size() {
        return this.file_size;
    }

    public final String getFile_type() {
        return this.file_type;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrl_list() {
        return this.url_list;
    }

    public final List<VideoBitrate> getVideo_bitrate_list() {
        return this.video_bitrate_list;
    }

    public PreviewVideoInfo(String str, String str2, String str3, List<String> list, List<VideoBitrate> list2) {
        this.uri = str;
        this.file_size = str2;
        this.file_type = str3;
        this.url_list = list;
        this.video_bitrate_list = list2;
    }
}
