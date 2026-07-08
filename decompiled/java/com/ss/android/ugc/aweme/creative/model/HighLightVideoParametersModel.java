package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class HighLightVideoParametersModel implements Parcelable {
    public static final Parcelable.Creator<HighLightVideoParametersModel> CREATOR = new Parcelable.Creator<HighLightVideoParametersModel>() { // from class: X.0KsP
        @Override // android.os.Parcelable.Creator
        public final HighLightVideoParametersModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Integer numValueOf;
            boolean z3;
            boolean z4;
            boolean z5;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string7 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new HighLightVideoParametersModel(string, string2, string3, string4, z, string5, string6, z2, string7, arrayList, string8, string9, numValueOf, string10, string11, string12, z3, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, z4, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final HighLightVideoParametersModel[] newArray(int i) {
            return new HighLightVideoParametersModel[i];
        }
    };

    @C09CT("album_fragment_ids")
    public List<String> albumFragmentIds;

    @C09CT("album_fragment_types")
    public List<String> albumFragmentTypes;

    @C09CT("auto_add_music_enable")
    public boolean autoAddMusicEnable;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("enter_from_page")
    public String enterFromPage;

    @C09CT("video_fragment_id")
    public String fragmentId;

    @C09CT("video_fragment_type")
    public String fragmentType;

    @C09CT("from_album")
    public boolean fromLiveRecordingsAlbum;

    @C09CT("gifter_ranking")
    public Integer gifterRanking;

    @C09CT("is_ecom")
    public boolean isEcom;

    @C09CT("item_anchor_id")
    public String itemAnchorId;

    @C09CT("landing_to_record")
    public boolean landingToRecord;

    @C09CT("need_change_volume")
    public boolean needChangeVolume;

    @C09CT("publisher_identity")
    public String publisherIdentity;

    @C09CT("replay_title")
    public String replayTitle;

    @C09CT("room_id")
    public String roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("suggest_video_toast")
    public String stickerHint;

    @C09CT("suggest_video_title")
    public String stickerText;

    @C09CT("to_user_id")
    public String toUserId;

    @C09CT("utterance_list")
    public List<Utterance> utteranceList;

    public HighLightVideoParametersModel() {
        this(null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, false, false, 2097151, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.fragmentId);
        parcel.writeString(this.fragmentType);
        parcel.writeString(this.roomId);
        parcel.writeString(this.replayTitle);
        parcel.writeInt(this.isEcom ? 1 : 0);
        parcel.writeString(this.stickerText);
        parcel.writeString(this.stickerHint);
        parcel.writeInt(this.landingToRecord ? 1 : 0);
        parcel.writeString(this.itemAnchorId);
        List<Utterance> list = this.utteranceList;
        parcel.writeInt(list.size());
        Iterator<Utterance> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
        parcel.writeString(this.scene);
        parcel.writeString(this.toUserId);
        Integer num = this.gifterRanking;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.publisherIdentity);
        parcel.writeString(this.enterFromPage);
        parcel.writeInt(this.autoAddMusicEnable ? 1 : 0);
        parcel.writeStringList(this.albumFragmentIds);
        parcel.writeStringList(this.albumFragmentTypes);
        parcel.writeInt(this.fromLiveRecordingsAlbum ? 1 : 0);
        parcel.writeInt(this.needChangeVolume ? 1 : 0);
    }

    public final void LIZ(List<String> list) {
        this.albumFragmentIds = list;
    }

    public final void LIZIZ(List<String> list) {
        this.albumFragmentTypes = list;
    }

    public final void LIZJ(String str) {
        this.publisherIdentity = str;
    }

    public HighLightVideoParametersModel(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, String str7, List<Utterance> list, String str8, String str9, Integer num, String str10, String str11, String str12, boolean z3, List<String> list2, List<String> list3, boolean z4, boolean z5) {
        this.fragmentId = str;
        this.fragmentType = str2;
        this.roomId = str3;
        this.replayTitle = str4;
        this.isEcom = z;
        this.stickerText = str5;
        this.stickerHint = str6;
        this.landingToRecord = z2;
        this.itemAnchorId = str7;
        this.utteranceList = list;
        this.scene = str8;
        this.toUserId = str9;
        this.gifterRanking = num;
        this.enterFrom = str10;
        this.publisherIdentity = str11;
        this.enterFromPage = str12;
        this.autoAddMusicEnable = z3;
        this.albumFragmentIds = list2;
        this.albumFragmentTypes = list3;
        this.fromLiveRecordingsAlbum = z4;
        this.needChangeVolume = z5;
    }

    public HighLightVideoParametersModel(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, String str7, List list, String str8, String str9, Integer num, String str10, String str11, String str12, boolean z3, List list2, List list3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? new ArrayList() : list, (i & 1024) != 0 ? "" : str8, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str9, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (32768 & i) == 0 ? str12 : "", (65536 & i) != 0 ? false : z3, (131072 & i) != 0 ? C13BV.INSTANCE : list2, (262144 & i) != 0 ? C13BV.INSTANCE : list3, (524288 & i) != 0 ? false : z4, (i & 1048576) != 0 ? false : z5);
    }
}
