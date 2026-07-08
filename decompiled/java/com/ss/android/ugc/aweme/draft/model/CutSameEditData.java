package com.ss.android.ugc.aweme.draft.model;

import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class CutSameEditData implements Parcelable {
    public static final Parcelable.Creator<CutSameEditData> CREATOR = new Parcelable.Creator<CutSameEditData>() { // from class: X.0L8F
        @Override // android.os.Parcelable.Creator
        public final CutSameEditData createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArrayList arrayList = null;
            boolean z2 = false;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(CutSameEditData.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new CutSameEditData(string, string2, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, string3, string4, string5, boolValueOf, arrayList, z2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameEditData[] newArray(int i) {
            return new CutSameEditData[i];
        }
    };

    @C09CT("conactFilePath")
    public final String conactFilePath;

    @C09CT("conactWorksapceId")
    public final String conactWorksapceId;

    @C09CT("cutsame_id")
    public final String cutSameMvId;

    @C09CT("is_h5")
    public final boolean isH5From;

    @C09CT("lastTextList")
    public final List<String> lastTextList;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("music_post_unavailable")
    public final Boolean musicPostUnavailable;

    @C09CT("music_url")
    public final String musicUrl;

    @C09CT("open_client_key")
    public final String openClientKey;

    @C09CT("open_sdk_share_id")
    public final String openSdkShareId;

    @C09CT("originTextList")
    public final List<String> originTextList;

    @C09CT("src_video_data_list")
    public final List<EditVideoSegment> videoSegmentDataList;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutSameEditData)) {
            return false;
        }
        CutSameEditData cutSameEditData = (CutSameEditData) obj;
        return Intrinsics.LJFF(this.conactFilePath, cutSameEditData.conactFilePath) && Intrinsics.LJFF(this.conactWorksapceId, cutSameEditData.conactWorksapceId) && Intrinsics.LJFF(this.originTextList, cutSameEditData.originTextList) && Intrinsics.LJFF(this.lastTextList, cutSameEditData.lastTextList) && Intrinsics.LJFF(this.cutSameMvId, cutSameEditData.cutSameMvId) && Intrinsics.LJFF(this.musicId, cutSameEditData.musicId) && Intrinsics.LJFF(this.musicUrl, cutSameEditData.musicUrl) && Intrinsics.LJFF(this.musicPostUnavailable, cutSameEditData.musicPostUnavailable) && Intrinsics.LJFF(this.videoSegmentDataList, cutSameEditData.videoSegmentDataList) && this.isH5From == cutSameEditData.isH5From && Intrinsics.LJFF(this.openSdkShareId, cutSameEditData.openSdkShareId) && Intrinsics.LJFF(this.openClientKey, cutSameEditData.openClientKey);
    }

    public final int hashCode() {
        String str = this.conactFilePath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.conactWorksapceId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.originTextList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.lastTextList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.cutSameMvId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.musicId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.musicUrl;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.musicPostUnavailable;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<EditVideoSegment> list3 = this.videoSegmentDataList;
        int iHashCode9 = (((iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31) + C786410Ut5.Z2(this.isH5From)) * 31;
        String str6 = this.openSdkShareId;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.openClientKey;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        return "CutSameEditData(conactFilePath=" + this.conactFilePath + ", conactWorksapceId=" + this.conactWorksapceId + ", originTextList=" + this.originTextList + ", lastTextList=" + this.lastTextList + ", cutSameMvId=" + this.cutSameMvId + ", musicId=" + this.musicId + ", musicUrl=" + this.musicUrl + ", musicPostUnavailable=" + this.musicPostUnavailable + ", videoSegmentDataList=" + this.videoSegmentDataList + ", isH5From=" + this.isH5From + ", openSdkShareId=" + this.openSdkShareId + ", openClientKey=" + this.openClientKey + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.conactFilePath);
        parcel.writeString(this.conactWorksapceId);
        parcel.writeStringList(this.originTextList);
        parcel.writeStringList(this.lastTextList);
        parcel.writeString(this.cutSameMvId);
        parcel.writeString(this.musicId);
        parcel.writeString(this.musicUrl);
        Boolean bool = this.musicPostUnavailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<EditVideoSegment> list = this.videoSegmentDataList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<EditVideoSegment> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeInt(this.isH5From ? 1 : 0);
        parcel.writeString(this.openSdkShareId);
        parcel.writeString(this.openClientKey);
    }

    public final String LIZIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("infoStickerId", "");
        jSONObject.put("musicId", this.musicId);
        jSONObject.put("product", "lv");
        jSONObject.put("stickerId", this.cutSameMvId);
        jSONObject.put("videoEffectId", "");
        jSONObject.put("videoId", "");
        return C786410Ut5.J3(jSONObject);
    }

    public final List<String> LIZJ() {
        List<String> list = this.lastTextList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<String> list2 = this.originTextList;
        if (list2 == null || list2.isEmpty()) {
            return this.lastTextList;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.lastTextList) {
            if (!this.originTextList.contains(str) && !TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final void LIZ(LinkedHashMap<String, String> linkedHashMap) {
        String str;
        String str2 = this.openClientKey;
        if (str2 != null && str2.length() != 0) {
            str = this.openClientKey;
        } else {
            str = "aw7c4z4ej0o3efzd";
        }
        linkedHashMap.put("open_platform_key", str);
        String str3 = this.openSdkShareId;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("open_platform_share_id", str3);
        linkedHashMap.put("open_platform_extra", "");
    }

    public CutSameEditData(String str, String str2, List<String> list, List<String> list2, String str3, String str4, String str5, Boolean bool, List<EditVideoSegment> list3, boolean z, String str6, String str7) {
        this.conactFilePath = str;
        this.conactWorksapceId = str2;
        this.originTextList = list;
        this.lastTextList = list2;
        this.cutSameMvId = str3;
        this.musicId = str4;
        this.musicUrl = str5;
        this.musicPostUnavailable = bool;
        this.videoSegmentDataList = list3;
        this.isH5From = z;
        this.openSdkShareId = str6;
        this.openClientKey = str7;
    }
}
