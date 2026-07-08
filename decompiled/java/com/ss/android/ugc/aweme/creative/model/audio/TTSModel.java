package com.ss.android.ugc.aweme.creative.model.audio;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.TTSExtraModel;
import com.ss.android.ugc.aweme.creative.model.audio.TTSModel;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class TTSModel implements Parcelable {
    public static final Parcelable.Creator<TTSModel> CREATOR = new Parcelable.Creator<TTSModel>() { // from class: X.0FWa
        @Override // android.os.Parcelable.Creator
        public final TTSModel createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), TTSExtraModel.CREATOR.createFromParcel(parcel));
            }
            return new TTSModel(linkedHashMap, parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TTSModel[] newArray(int i) {
            return new TTSModel[i];
        }
    };

    @C040H
    public int applyVoiceToAllTextSwitch;

    @C040H
    public String enterMethod;

    @C09CT("tts_result")
    public Map<String, TTSExtraModel> ttsExtraMap;

    public TTSModel() {
        this(Collections.synchronizedMap(new LinkedHashMap()), 0, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<String, TTSExtraModel> map = this.ttsExtraMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, TTSExtraModel> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.applyVoiceToAllTextSwitch);
        parcel.writeString(this.enterMethod);
    }

    public TTSModel(Map<String, TTSExtraModel> map, int i, String str) {
        this.ttsExtraMap = map;
        this.applyVoiceToAllTextSwitch = i;
        this.enterMethod = str;
    }
}
