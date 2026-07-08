package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AIGCExtraModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCExtraModel implements Parcelable {
    public static final Parcelable.Creator<AIGCExtraModel> CREATOR = new Parcelable.Creator<AIGCExtraModel>() { // from class: X.0L3C
        @Override // android.os.Parcelable.Creator
        public final AIGCExtraModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(AIGCExtraModel.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(AIGCExtraModel.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new AIGCExtraModel(arrayList, arrayList2, z, arrayListCreateStringArrayList, string, z2, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCExtraModel[] newArray(int i) {
            return new AIGCExtraModel[i];
        }
    };

    @C09CT("ai_creation_id")
    public String aiCreationId;

    @C09CT("last_has_aigc_editing")
    public boolean aigcEdited;

    @C09CT("aigc_infos_from_now_screen")
    public final List<com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> aigcInfosFromNowGreenScreen;

    @C09CT("aigc_infos_from_subtrack")
    public final List<com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> aigcInfosFromSubTrack;

    @C09CT("aigc_server_task_id_acquired")
    public boolean aigcServerTaskIdAcquired;

    @C09CT("aigc_server_task_id_list")
    public List<String> aigcServerTaskIds;

    @C040H
    public final List<String> sourceFileWithoutAIGCInfo;

    public AIGCExtraModel() {
        this(null, null, false, null, null, false, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> list = this.aigcInfosFromSubTrack;
        parcel.writeInt(list.size());
        Iterator<com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        List<com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> list2 = this.aigcInfosFromNowGreenScreen;
        parcel.writeInt(list2.size());
        Iterator<com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeParcelable(it3.next(), i);
        }
        parcel.writeInt(this.aigcEdited ? 1 : 0);
        parcel.writeStringList(this.sourceFileWithoutAIGCInfo);
        parcel.writeString(this.aiCreationId);
        parcel.writeInt(this.aigcServerTaskIdAcquired ? 1 : 0);
        parcel.writeStringList(this.aigcServerTaskIds);
    }

    public AIGCExtraModel(List<com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> list, List<com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> list2, boolean z, List<String> list3, String str, boolean z2, List<String> list4) {
        this.aigcInfosFromSubTrack = list;
        this.aigcInfosFromNowGreenScreen = list2;
        this.aigcEdited = z;
        this.sourceFileWithoutAIGCInfo = list3;
        this.aiCreationId = str;
        this.aigcServerTaskIdAcquired = z2;
        this.aigcServerTaskIds = list4;
    }

    public AIGCExtraModel(List list, List list2, boolean z, List list3, String str, boolean z2, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new ArrayList() : list3, (i & 16) != 0 ? UUID.randomUUID().toString() : str, (i & 32) == 0 ? z2 : false, (i & 64) != 0 ? C13BV.INSTANCE : list4);
    }
}
