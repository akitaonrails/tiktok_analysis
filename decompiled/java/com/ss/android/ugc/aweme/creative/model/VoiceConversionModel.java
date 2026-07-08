package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C0MY0;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class VoiceConversionModel implements Parcelable {
    public static final Parcelable.Creator<VoiceConversionModel> CREATOR = new Parcelable.Creator<VoiceConversionModel>() { // from class: X.0mcv
        @Override // android.os.Parcelable.Creator
        public final VoiceConversionModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(parcel.readString());
            }
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new VoiceConversionModel(string, string2, string3, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, z, z2, linkedHashSet, arrayListCreateStringArrayList3, arrayListCreateStringArrayList4, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceConversionModel[] newArray(int i) {
            return new VoiceConversionModel[i];
        }
    };

    @C09CT("has_dub_voice_conversion_param")
    public boolean hasDubVoiceConversion;

    @C09CT("has_origin_voice_conversion")
    public boolean hasOriginVoiceConversion;

    @C09CT("has_style_conversion")
    public boolean hasStyleConversion;

    @C09CT("original_record_path")
    @C0MY0
    public String originalRecordPath;

    @C09CT("vc_filter_creator_uids")
    public ArrayList<String> vcCreatorIDs;

    @C09CT("voice_conversion_multi_origin_path")
    @C0MY0
    public List<String> vcMultiOriginPathList;

    @C09CT("voice_conversion_multi_record_path")
    @C0MY0
    public List<String> vcMultiRecordPathList;

    @C09CT("voice_conversion_origin_path")
    @C0MY0
    public String vcOriginPath;

    @C09CT("voice_conversion_record_path")
    @C0MY0
    public String vcRecordPath;

    @C09CT("vc_voice_ids")
    public ArrayList<String> vcVoiceIDs;

    @C09CT("voice_modify_id")
    public Set<String> voiceModifyIds;

    public VoiceConversionModel() {
        this(null, null, null, null, null, false, false, null, null, null, false, 2047, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.originalRecordPath);
        parcel.writeString(this.vcOriginPath);
        parcel.writeString(this.vcRecordPath);
        parcel.writeStringList(this.vcMultiRecordPathList);
        parcel.writeStringList(this.vcMultiOriginPathList);
        parcel.writeInt(this.hasOriginVoiceConversion ? 1 : 0);
        parcel.writeInt(this.hasDubVoiceConversion ? 1 : 0);
        Set<String> set = this.voiceModifyIds;
        parcel.writeInt(set.size());
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next());
        }
        parcel.writeStringList(this.vcVoiceIDs);
        parcel.writeStringList(this.vcCreatorIDs);
        parcel.writeInt(this.hasStyleConversion ? 1 : 0);
    }

    public VoiceConversionModel(String str, String str2, String str3, List<String> list, List<String> list2, boolean z, boolean z2, Set<String> set, ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z3) {
        this.originalRecordPath = str;
        this.vcOriginPath = str2;
        this.vcRecordPath = str3;
        this.vcMultiRecordPathList = list;
        this.vcMultiOriginPathList = list2;
        this.hasOriginVoiceConversion = z;
        this.hasDubVoiceConversion = z2;
        this.voiceModifyIds = set;
        this.vcVoiceIDs = arrayList;
        this.vcCreatorIDs = arrayList2;
        this.hasStyleConversion = z3;
    }

    public VoiceConversionModel(String str, String str2, String str3, List list, List list2, boolean z, boolean z2, Set set, ArrayList arrayList, ArrayList arrayList2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? C13BV.INSTANCE : list2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? new LinkedHashSet() : set, (i & 256) != 0 ? new ArrayList() : arrayList, (i & 512) != 0 ? new ArrayList() : arrayList2, (i & 1024) == 0 ? z3 : false);
    }
}
