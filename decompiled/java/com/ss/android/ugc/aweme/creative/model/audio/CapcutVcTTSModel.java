package com.ss.android.ugc.aweme.creative.model.audio;

import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.CapcutVcTTSModel;
import com.ss.android.ugc.aweme.creative.model.audio.CapcutVoiceAnchorModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class CapcutVcTTSModel implements Parcelable {
    public static final Parcelable.Creator<CapcutVcTTSModel> CREATOR = new Parcelable.Creator<CapcutVcTTSModel>() { // from class: X.0nWQ
        @Override // android.os.Parcelable.Creator
        public final CapcutVcTTSModel createFromParcel(Parcel parcel) {
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            int i = parcel.readInt();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                concurrentHashMap.put(parcel.readString(), CapcutVoiceAnchorModel.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                concurrentHashMap2.put(parcel.readString(), CapcutVoiceAnchorModel.CREATOR.createFromParcel(parcel));
            }
            return new CapcutVcTTSModel(arrayListCreateStringArrayList, arrayListCreateStringArrayList2, concurrentHashMap, concurrentHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final CapcutVcTTSModel[] newArray(int i) {
            return new CapcutVcTTSModel[i];
        }
    };

    @C09CT("capcut_tts_anchor_models")
    public ConcurrentHashMap<String, CapcutVoiceAnchorModel> ttsAnchorModels;

    @C09CT("capcut_tts_speakerids")
    public List<String> ttsSpeakerIds;

    @C09CT("capcut_vc_anchor_models")
    public ConcurrentHashMap<String, CapcutVoiceAnchorModel> vcAnchorModels;

    @C09CT("capcut_vc_speakerids")
    public List<String> vcSpeakerIds;

    public CapcutVcTTSModel() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.vcSpeakerIds);
        parcel.writeStringList(this.ttsSpeakerIds);
        ConcurrentHashMap<String, CapcutVoiceAnchorModel> concurrentHashMap = this.vcAnchorModels;
        parcel.writeInt(concurrentHashMap.size());
        for (Map.Entry<String, CapcutVoiceAnchorModel> entry : concurrentHashMap.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
        ConcurrentHashMap<String, CapcutVoiceAnchorModel> concurrentHashMap2 = this.ttsAnchorModels;
        parcel.writeInt(concurrentHashMap2.size());
        for (Map.Entry<String, CapcutVoiceAnchorModel> entry2 : concurrentHashMap2.entrySet()) {
            parcel.writeString(entry2.getKey());
            entry2.getValue().writeToParcel(parcel, i);
        }
    }

    public CapcutVcTTSModel(List<String> list, List<String> list2, ConcurrentHashMap<String, CapcutVoiceAnchorModel> concurrentHashMap, ConcurrentHashMap<String, CapcutVoiceAnchorModel> concurrentHashMap2) {
        this.vcSpeakerIds = list;
        this.ttsSpeakerIds = list2;
        this.vcAnchorModels = concurrentHashMap;
        this.ttsAnchorModels = concurrentHashMap2;
    }

    public CapcutVcTTSModel(List list, List list2, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? new ConcurrentHashMap() : concurrentHashMap, (i & 8) != 0 ? new ConcurrentHashMap() : concurrentHashMap2);
    }
}
