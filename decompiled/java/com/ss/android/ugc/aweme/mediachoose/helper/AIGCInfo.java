package com.ss.android.ugc.aweme.mediachoose.helper;

import X.C09CT;
import X.C0EP3;
import X.C0MY0;
import X.C13BV;
import X.C140C;
import X.C786410Ut5;
import X.InterfaceC2270808v4;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class AIGCInfo implements Serializable, Parcelable {

    @C09CT("ai_generated_source")
    public String aiGeneratedSource;

    @C09CT("album_aigc")
    public List<AlbumAigc> albumAigc;

    @C09CT("bucket_task_id")
    public String bucketTaskId;

    @C09CT("c2pa_path")
    @C0MY0
    @InterfaceC2270808v4
    public String c2paPath;

    @C09CT("contain_format_list")
    public List<String> containFormatList;

    @C09CT("error_code")
    public Set<Integer> errorCode;

    @C09CT("et_map")
    public Map<String, String> etMap;

    @C09CT("extra_element_c2pas")
    public HashMap<String, String> extraElementC2pas;

    @C09CT("image_watermark_path")
    public String imageWatermarkPath;

    @C09CT("is_audio_resource")
    public Boolean isAudioResource;

    @C09CT("is_fully_aigc")
    public boolean isFullyAIGC;

    @C09CT("is_image_resource")
    public Boolean isImageResource;

    @C09CT("is_minor_edit")
    public boolean isMinorEdit;

    @C09CT("is_v2_format")
    public boolean isV2Format;

    @C09CT("media_system_id")
    public String mediaSystemId;
    public transient String resultJson;

    @C09CT("type")
    public int type;
    public static final C0EP3 Companion = new C0EP3();
    public static final Parcelable.Creator<AIGCInfo> CREATOR = new Parcelable.Creator<AIGCInfo>() { // from class: X.0L0T
        @Override // android.os.Parcelable.Creator
        public final AIGCInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            HashMap map;
            boolean z3;
            boolean z4;
            ArrayList arrayList;
            boolean z5;
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
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
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashSet.add(Integer.valueOf(parcel.readInt()));
            }
            int i4 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i6 = parcel.readInt();
                map = new HashMap(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    map.put(parcel.readString(), parcel.readString());
                }
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i8 = parcel.readInt();
                arrayList = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList.add(AlbumAigc.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new AIGCInfo(i, string, string2, string3, string4, boolValueOf, linkedHashSet, linkedHashMap, string5, boolValueOf2, map, arrayListCreateStringArrayList, string6, z3, z4, arrayList, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCInfo[] newArray(int i) {
            return new AIGCInfo[i];
        }
    };

    public AIGCInfo() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 131071, null);
    }

    public final AIGCInfo copy(int i, String str, String str2, String str3, String str4, Boolean bool, Set<Integer> set, Map<String, String> map, String str5, Boolean bool2, HashMap<String, String> map2, List<String> list, String str6, boolean z, boolean z2, List<AlbumAigc> list2, boolean z3) {
        return new AIGCInfo(i, str, str2, str3, str4, bool, set, map, str5, bool2, map2, list, str6, z, z2, list2, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCInfo)) {
            return false;
        }
        AIGCInfo aIGCInfo = (AIGCInfo) obj;
        return this.type == aIGCInfo.type && Intrinsics.LJFF(this.c2paPath, aIGCInfo.c2paPath) && Intrinsics.LJFF(this.resultJson, aIGCInfo.resultJson) && Intrinsics.LJFF(this.mediaSystemId, aIGCInfo.mediaSystemId) && Intrinsics.LJFF(this.imageWatermarkPath, aIGCInfo.imageWatermarkPath) && Intrinsics.LJFF(this.isImageResource, aIGCInfo.isImageResource) && Intrinsics.LJFF(this.errorCode, aIGCInfo.errorCode) && Intrinsics.LJFF(this.etMap, aIGCInfo.etMap) && Intrinsics.LJFF(this.bucketTaskId, aIGCInfo.bucketTaskId) && Intrinsics.LJFF(this.isAudioResource, aIGCInfo.isAudioResource) && Intrinsics.LJFF(this.extraElementC2pas, aIGCInfo.extraElementC2pas) && Intrinsics.LJFF(this.containFormatList, aIGCInfo.containFormatList) && Intrinsics.LJFF(this.aiGeneratedSource, aIGCInfo.aiGeneratedSource) && this.isFullyAIGC == aIGCInfo.isFullyAIGC && this.isMinorEdit == aIGCInfo.isMinorEdit && Intrinsics.LJFF(this.albumAigc, aIGCInfo.albumAigc) && this.isV2Format == aIGCInfo.isV2Format;
    }

    public int hashCode() {
        int iHashCode = ((this.type * 31) + this.c2paPath.hashCode()) * 31;
        String str = this.resultJson;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mediaSystemId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageWatermarkPath;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isImageResource;
        int iHashCode5 = (((((((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31) + this.errorCode.hashCode()) * 31) + this.etMap.hashCode()) * 31) + this.bucketTaskId.hashCode()) * 31;
        Boolean bool2 = this.isAudioResource;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        HashMap<String, String> map = this.extraElementC2pas;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list = this.containFormatList;
        int iHashCode8 = (((((((iHashCode7 + (list == null ? 0 : list.hashCode())) * 31) + this.aiGeneratedSource.hashCode()) * 31) + C786410Ut5.Z2(this.isFullyAIGC)) * 31) + C786410Ut5.Z2(this.isMinorEdit)) * 31;
        List<AlbumAigc> list2 = this.albumAigc;
        return ((iHashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isV2Format);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeString(this.c2paPath);
        parcel.writeString(this.resultJson);
        parcel.writeString(this.mediaSystemId);
        parcel.writeString(this.imageWatermarkPath);
        Boolean bool = this.isImageResource;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Set<Integer> set = this.errorCode;
        parcel.writeInt(set.size());
        Iterator<Integer> it2 = set.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
        Map<String, String> map = this.etMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.bucketTaskId);
        Boolean bool2 = this.isAudioResource;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        HashMap<String, String> map2 = this.extraElementC2pas;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
        parcel.writeStringList(this.containFormatList);
        parcel.writeString(this.aiGeneratedSource);
        parcel.writeInt(this.isFullyAIGC ? 1 : 0);
        parcel.writeInt(this.isMinorEdit ? 1 : 0);
        List<AlbumAigc> list = this.albumAigc;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AlbumAigc> it3 = list.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.isV2Format ? 1 : 0);
    }

    public String toString() {
        return C140C.LIZJ(this);
    }

    public final String getAiGeneratedSource() {
        return this.aiGeneratedSource;
    }

    public final List<AlbumAigc> getAlbumAigc() {
        return this.albumAigc;
    }

    public final String getBucketTaskId() {
        return this.bucketTaskId;
    }

    public final String getC2paPath() {
        return this.c2paPath;
    }

    public final List<String> getContainFormatList() {
        return this.containFormatList;
    }

    public final Set<Integer> getErrorCode() {
        return this.errorCode;
    }

    public final Map<String, String> getEtMap() {
        return this.etMap;
    }

    public final HashMap<String, String> getExtraElementC2pas() {
        return this.extraElementC2pas;
    }

    public final String getImageWatermarkPath() {
        return this.imageWatermarkPath;
    }

    public final String getMediaSystemId() {
        return this.mediaSystemId;
    }

    public final String getResultJson() {
        return this.resultJson;
    }

    public final int getType() {
        return this.type;
    }

    public final Boolean isAudioResource() {
        return this.isAudioResource;
    }

    public final boolean isFullyAIGC() {
        return this.isFullyAIGC;
    }

    public final Boolean isImageResource() {
        return this.isImageResource;
    }

    public final boolean isMinorEdit() {
        return this.isMinorEdit;
    }

    public final boolean isV2Format() {
        return this.isV2Format;
    }

    public final void setAiGeneratedSource(String str) {
        this.aiGeneratedSource = str;
    }

    public final void setAlbumAigc(List<AlbumAigc> list) {
        this.albumAigc = list;
    }

    public final void setAudioResource(Boolean bool) {
        this.isAudioResource = bool;
    }

    public final void setBucketTaskId(String str) {
        this.bucketTaskId = str;
    }

    public final void setC2paPath(String str) {
        this.c2paPath = str;
    }

    public final void setContainFormatList(List<String> list) {
        this.containFormatList = list;
    }

    public final void setErrorCode(Set<Integer> set) {
        this.errorCode = set;
    }

    public final void setEtMap(Map<String, String> map) {
        this.etMap = map;
    }

    public final void setExtraElementC2pas(HashMap<String, String> map) {
        this.extraElementC2pas = map;
    }

    public final void setFullyAIGC(boolean z) {
        this.isFullyAIGC = z;
    }

    public final void setImageResource(Boolean bool) {
        this.isImageResource = bool;
    }

    public final void setImageWatermarkPath(String str) {
        this.imageWatermarkPath = str;
    }

    public final void setMediaSystemId(String str) {
        this.mediaSystemId = str;
    }

    public final void setMinorEdit(boolean z) {
        this.isMinorEdit = z;
    }

    public final void setResultJson(String str) {
        this.resultJson = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setV2Format(boolean z) {
        this.isV2Format = z;
    }

    public AIGCInfo(int i, String str, String str2, String str3, String str4, Boolean bool, Set<Integer> set, Map<String, String> map, String str5, Boolean bool2, HashMap<String, String> map2, List<String> list, String str6, boolean z, boolean z2, List<AlbumAigc> list2, boolean z3) {
        this.type = i;
        this.c2paPath = str;
        this.resultJson = str2;
        this.mediaSystemId = str3;
        this.imageWatermarkPath = str4;
        this.isImageResource = bool;
        this.errorCode = set;
        this.etMap = map;
        this.bucketTaskId = str5;
        this.isAudioResource = bool2;
        this.extraElementC2pas = map2;
        this.containFormatList = list;
        this.aiGeneratedSource = str6;
        this.isFullyAIGC = z;
        this.isMinorEdit = z2;
        this.albumAigc = list2;
        this.isV2Format = z3;
    }

    public AIGCInfo(int i, String str, String str2, String str3, String str4, Boolean bool, Set set, Map map, String str5, Boolean bool2, HashMap map2, List list, String str6, boolean z, boolean z2, List list2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? new LinkedHashSet() : set, (i2 & 128) != 0 ? new LinkedHashMap() : map, (i2 & 256) != 0 ? UUID.randomUUID().toString() : str5, (i2 & 512) == 0 ? bool2 : null, (i2 & 1024) != 0 ? new HashMap() : map2, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new ArrayList() : list, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str6 : "", (i2 & 8192) != 0 ? false : z, (i2 & 16384) != 0 ? false : z2, (32768 & i2) != 0 ? C13BV.INSTANCE : list2, (i2 & 65536) != 0 ? false : z3);
    }
}
