package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C1402640mbW;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ReuseAwemeTTSAndVCRefIDsModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class ReuseAwemeTTSAndVCRefIDsModel implements Parcelable {

    @C09CT("current_music_tts_voice_ref_ids")
    public ArrayList<String> curMusicTTSRedIDs;

    @C09CT("origin_music_remove_tts")
    public Boolean originMusicRemoveTTS;

    @C09CT("tts_voice_ids")
    public ArrayList<String> ttsVoiceIDs;

    @C09CT("tts_voice_ref_ids")
    public ArrayList<String> ttsVoiceRefIDs;

    @C09CT("vc_voice_ids")
    public ArrayList<String> vcVoiceIDs;

    @C09CT("vc_voice_ref_ids")
    public ArrayList<String> vcVoiceRefIDs;
    public static final C1402640mbW Companion = new C1402640mbW();
    public static final Parcelable.Creator<ReuseAwemeTTSAndVCRefIDsModel> CREATOR = new Parcelable.Creator<ReuseAwemeTTSAndVCRefIDsModel>() { // from class: X.0mcb
        @Override // android.os.Parcelable.Creator
        public final ReuseAwemeTTSAndVCRefIDsModel createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList5 = parcel.createStringArrayList();
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
            return new ReuseAwemeTTSAndVCRefIDsModel(arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, arrayListCreateStringArrayList4, arrayListCreateStringArrayList5, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ReuseAwemeTTSAndVCRefIDsModel[] newArray(int i) {
            return new ReuseAwemeTTSAndVCRefIDsModel[i];
        }
    };

    public ReuseAwemeTTSAndVCRefIDsModel() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeStringList(this.ttsVoiceIDs);
        parcel.writeStringList(this.ttsVoiceRefIDs);
        parcel.writeStringList(this.curMusicTTSRedIDs);
        parcel.writeStringList(this.vcVoiceIDs);
        parcel.writeStringList(this.vcVoiceRefIDs);
        Boolean bool = this.originMusicRemoveTTS;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public static final ArrayList<String> LIZ(List<String> list, List<String> list2) {
        Companion.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public ReuseAwemeTTSAndVCRefIDsModel(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4, ArrayList<String> arrayList5, Boolean bool) {
        this.ttsVoiceIDs = arrayList;
        this.ttsVoiceRefIDs = arrayList2;
        this.curMusicTTSRedIDs = arrayList3;
        this.vcVoiceIDs = arrayList4;
        this.vcVoiceRefIDs = arrayList5;
        this.originMusicRemoveTTS = bool;
    }
}
