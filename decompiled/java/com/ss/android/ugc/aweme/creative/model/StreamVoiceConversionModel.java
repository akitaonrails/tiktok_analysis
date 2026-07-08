package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class StreamVoiceConversionModel implements Parcelable {
    public static final Parcelable.Creator<StreamVoiceConversionModel> CREATOR = new Parcelable.Creator<StreamVoiceConversionModel>() { // from class: X.0mcM
        @Override // android.os.Parcelable.Creator
        public final StreamVoiceConversionModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            HashMap map = new HashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                map.put(parcel.readString(), parcel.readString());
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new StreamVoiceConversionModel(string, string2, string3, map, string4, string5, z, string6, string7, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamVoiceConversionModel[] newArray(int i) {
            return new StreamVoiceConversionModel[i];
        }
    };

    @C040H
    public boolean isSVCSelected;

    @C09CT("stream_vc_effect_id")
    public String vcEffectId;

    @C09CT("stream_vc_effect_name")
    public String vcEffectName;

    @C09CT("stream_vc_effect_speaker_id")
    public String vcEffectSpeakerId;

    @C09CT("stream_vc_has_apply")
    public boolean vcHasApply;

    @C09CT("stream_vc_segment_effect_id_from_map")
    public HashMap<String, String> vcSegmentEffectIdFromMap;

    @C09CT("stream_vc_shooting_effect_id")
    public String vcShootingEffectId;

    @C09CT("stream_vc_shooting_effect_id_from")
    public String vcShootingEffectIdFrom;

    @C09CT("stream_vc_id")
    public String vcVoiceId;

    @C09CT("stream_vc_name")
    public String vcVoiceName;

    public StreamVoiceConversionModel() {
        this(null, null, "", new HashMap(), "", "", false, "", "", false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.vcVoiceId);
        parcel.writeString(this.vcVoiceName);
        parcel.writeString(this.vcEffectId);
        HashMap<String, String> map = this.vcSegmentEffectIdFromMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.vcEffectSpeakerId);
        parcel.writeString(this.vcEffectName);
        parcel.writeInt(this.vcHasApply ? 1 : 0);
        parcel.writeString(this.vcShootingEffectId);
        parcel.writeString(this.vcShootingEffectIdFrom);
        parcel.writeInt(this.isSVCSelected ? 1 : 0);
    }

    public StreamVoiceConversionModel(String str, String str2, String str3, HashMap<String, String> map, String str4, String str5, boolean z, String str6, String str7, boolean z2) {
        this.vcVoiceId = str;
        this.vcVoiceName = str2;
        this.vcEffectId = str3;
        this.vcSegmentEffectIdFromMap = map;
        this.vcEffectSpeakerId = str4;
        this.vcEffectName = str5;
        this.vcHasApply = z;
        this.vcShootingEffectId = str6;
        this.vcShootingEffectIdFrom = str7;
        this.isSVCSelected = z2;
    }
}
