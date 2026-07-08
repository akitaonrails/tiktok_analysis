package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C0MY0;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TTSModel implements Parcelable {

    @C09CT("audio_path_list")
    @C0MY0
    public List<String> audioPathList;

    @C09CT("old_text")
    public String audioText;

    @C09CT("audio_track_duration")
    public int audioTrackDuration;

    @C09CT("audio_track_file_path")
    @C0MY0
    public String audioTrackFilePath;

    @C09CT("audio_track_index")
    public int audioTrackIndex;

    @C09CT("auto_add_tts_flag")
    public boolean autoAddTtsFlag;

    @C09CT("editorpro_tts_tone_id")
    public String editorProTTSID;

    @C09CT("has_read_text_audio")
    public boolean hasReadTextAudio;

    @C09CT("is_creator")
    public boolean isCreatorVoice;

    @C09CT("is_editorpro_tts")
    public boolean isEditorProTTS;

    @C09CT("is_instant_clone")
    public boolean isInstantClone;

    @C09CT("nle_uuid")
    public String nleUuid;

    @C09CT("speaker_id")
    public String speakerID;

    @C09CT("speaker_name")
    public String speakerName;

    @C09CT("tts_anchor_release_date")
    public long ttsAnchorReleaseDate;

    @C09CT("tts_audio_bean")
    public TTSAudioBean ttsAudioBean;

    @C09CT("tts_extra")
    public final Map<String, String> ttsExtraMap;

    @C09CT("tts_hash_tag_ids")
    public List<String> ttsHashTagIds;

    @C09CT("tts_release_date")
    public long ttsReleaseDate;

    @C09CT("tts_voice_model")
    public TTSVoiceModel ttsVoiceModel;

    @C09CT("voice_anchor_name")
    public String voiceAnchorName;

    @C09CT("creator_user_id")
    public String voiceCreatorUserId;

    @C09CT("creator_user_name")
    public String voiceCreatorUserName;

    @C09CT("voice_effect_icon_url")
    public String voiceEffectIconUrl;

    @C09CT("voice_effect_id")
    public String voiceEffectId;

    @C09CT("voice_effect_resource_id")
    public String voiceEffectResourceId;
    public static final Parcelable.Creator<TTSModel> CREATOR = new Parcelable.Creator<TTSModel>() { // from class: X.0F7X
        @Override // android.os.Parcelable.Creator
        public final TTSModel createFromParcel(Parcel parcel) {
            boolean z;
            TTSVoiceModel tTSVoiceModelCreateFromParcel;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                tTSVoiceModelCreateFromParcel = null;
            } else {
                tTSVoiceModelCreateFromParcel = TTSVoiceModel.CREATOR.createFromParcel(parcel);
            }
            TTSVoiceModel tTSVoiceModel = tTSVoiceModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            TTSAudioBean tTSAudioBeanCreateFromParcel = TTSAudioBean.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String string12 = parcel.readString();
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new TTSModel(z, i, string, string2, string3, string4, i2, string5, arrayListCreateStringArrayList, tTSVoiceModel, z2, string6, string7, string8, string9, string10, string11, z3, j, j2, arrayListCreateStringArrayList2, tTSAudioBeanCreateFromParcel, z4, string12, linkedHashMap, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final TTSModel[] newArray(int i) {
            return new TTSModel[i];
        }
    };
    public static final int $stable = 8;

    public TTSModel() {
        this(false, -1, "", null, null, null, 0, null, new ArrayList(), null, false, null, null, null, null, "", "", false, 0L, 0L, new ArrayList(), new TTSAudioBean(null, 1, null), false, "", new LinkedHashMap(), false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTSModel)) {
            return false;
        }
        TTSModel tTSModel = (TTSModel) obj;
        return this.hasReadTextAudio == tTSModel.hasReadTextAudio && this.audioTrackIndex == tTSModel.audioTrackIndex && Intrinsics.LJFF(this.nleUuid, tTSModel.nleUuid) && Intrinsics.LJFF(this.audioTrackFilePath, tTSModel.audioTrackFilePath) && Intrinsics.LJFF(this.speakerID, tTSModel.speakerID) && Intrinsics.LJFF(this.speakerName, tTSModel.speakerName) && this.audioTrackDuration == tTSModel.audioTrackDuration && Intrinsics.LJFF(this.audioText, tTSModel.audioText) && Intrinsics.LJFF(this.audioPathList, tTSModel.audioPathList) && Intrinsics.LJFF(this.ttsVoiceModel, tTSModel.ttsVoiceModel) && this.autoAddTtsFlag == tTSModel.autoAddTtsFlag && Intrinsics.LJFF(this.voiceEffectId, tTSModel.voiceEffectId) && Intrinsics.LJFF(this.voiceEffectResourceId, tTSModel.voiceEffectResourceId) && Intrinsics.LJFF(this.voiceAnchorName, tTSModel.voiceAnchorName) && Intrinsics.LJFF(this.voiceEffectIconUrl, tTSModel.voiceEffectIconUrl) && Intrinsics.LJFF(this.voiceCreatorUserId, tTSModel.voiceCreatorUserId) && Intrinsics.LJFF(this.voiceCreatorUserName, tTSModel.voiceCreatorUserName) && this.isCreatorVoice == tTSModel.isCreatorVoice && this.ttsAnchorReleaseDate == tTSModel.ttsAnchorReleaseDate && this.ttsReleaseDate == tTSModel.ttsReleaseDate && Intrinsics.LJFF(this.ttsHashTagIds, tTSModel.ttsHashTagIds) && Intrinsics.LJFF(this.ttsAudioBean, tTSModel.ttsAudioBean) && this.isEditorProTTS == tTSModel.isEditorProTTS && Intrinsics.LJFF(this.editorProTTSID, tTSModel.editorProTTSID) && Intrinsics.LJFF(this.ttsExtraMap, tTSModel.ttsExtraMap) && this.isInstantClone == tTSModel.isInstantClone;
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.hasReadTextAudio) * 31) + this.audioTrackIndex) * 31) + this.nleUuid.hashCode()) * 31;
        String str = this.audioTrackFilePath;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.speakerID;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.speakerName;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.audioTrackDuration) * 31;
        String str4 = this.audioText;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.audioPathList.hashCode()) * 31;
        TTSVoiceModel tTSVoiceModel = this.ttsVoiceModel;
        int iHashCode5 = (((iHashCode4 + (tTSVoiceModel == null ? 0 : tTSVoiceModel.hashCode())) * 31) + C786410Ut5.Z2(this.autoAddTtsFlag)) * 31;
        String str5 = this.voiceEffectId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.voiceEffectResourceId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.voiceAnchorName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.voiceEffectIconUrl;
        return ((((((((((((((((((((((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.voiceCreatorUserId.hashCode()) * 31) + this.voiceCreatorUserName.hashCode()) * 31) + C786410Ut5.Z2(this.isCreatorVoice)) * 31) + C786410Ut5.Y2(this.ttsAnchorReleaseDate)) * 31) + C786410Ut5.Y2(this.ttsReleaseDate)) * 31) + this.ttsHashTagIds.hashCode()) * 31) + this.ttsAudioBean.hashCode()) * 31) + C786410Ut5.Z2(this.isEditorProTTS)) * 31) + this.editorProTTSID.hashCode()) * 31) + this.ttsExtraMap.hashCode()) * 31) + C786410Ut5.Z2(this.isInstantClone);
    }

    public final String toString() {
        return "TTSModel(hasReadTextAudio=" + this.hasReadTextAudio + ", audioTrackIndex=" + this.audioTrackIndex + ", nleUuid=" + this.nleUuid + ", audioTrackFilePath=" + this.audioTrackFilePath + ", speakerID=" + this.speakerID + ", speakerName=" + this.speakerName + ", audioTrackDuration=" + this.audioTrackDuration + ", audioText=" + this.audioText + ", audioPathList=" + this.audioPathList + ", ttsVoiceModel=" + this.ttsVoiceModel + ", autoAddTtsFlag=" + this.autoAddTtsFlag + ", voiceEffectId=" + this.voiceEffectId + ", voiceEffectResourceId=" + this.voiceEffectResourceId + ", voiceAnchorName=" + this.voiceAnchorName + ", voiceEffectIconUrl=" + this.voiceEffectIconUrl + ", voiceCreatorUserId=" + this.voiceCreatorUserId + ", voiceCreatorUserName=" + this.voiceCreatorUserName + ", isCreatorVoice=" + this.isCreatorVoice + ", ttsAnchorReleaseDate=" + this.ttsAnchorReleaseDate + ", ttsReleaseDate=" + this.ttsReleaseDate + ", ttsHashTagIds=" + this.ttsHashTagIds + ", ttsAudioBean=" + this.ttsAudioBean + ", isEditorProTTS=" + this.isEditorProTTS + ", editorProTTSID=" + this.editorProTTSID + ", ttsExtraMap=" + this.ttsExtraMap + ", isInstantClone=" + this.isInstantClone + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasReadTextAudio ? 1 : 0);
        parcel.writeInt(this.audioTrackIndex);
        parcel.writeString(this.nleUuid);
        parcel.writeString(this.audioTrackFilePath);
        parcel.writeString(this.speakerID);
        parcel.writeString(this.speakerName);
        parcel.writeInt(this.audioTrackDuration);
        parcel.writeString(this.audioText);
        parcel.writeStringList(this.audioPathList);
        TTSVoiceModel tTSVoiceModel = this.ttsVoiceModel;
        if (tTSVoiceModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tTSVoiceModel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.autoAddTtsFlag ? 1 : 0);
        parcel.writeString(this.voiceEffectId);
        parcel.writeString(this.voiceEffectResourceId);
        parcel.writeString(this.voiceAnchorName);
        parcel.writeString(this.voiceEffectIconUrl);
        parcel.writeString(this.voiceCreatorUserId);
        parcel.writeString(this.voiceCreatorUserName);
        parcel.writeInt(this.isCreatorVoice ? 1 : 0);
        parcel.writeLong(this.ttsAnchorReleaseDate);
        parcel.writeLong(this.ttsReleaseDate);
        parcel.writeStringList(this.ttsHashTagIds);
        this.ttsAudioBean.writeToParcel(parcel, i);
        parcel.writeInt(this.isEditorProTTS ? 1 : 0);
        parcel.writeString(this.editorProTTSID);
        Map<String, String> map = this.ttsExtraMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeInt(this.isInstantClone ? 1 : 0);
    }

    public static TTSModel LIZ(TTSModel tTSModel) {
        return new TTSModel(tTSModel.hasReadTextAudio, tTSModel.audioTrackIndex, tTSModel.nleUuid, tTSModel.audioTrackFilePath, tTSModel.speakerID, tTSModel.speakerName, tTSModel.audioTrackDuration, tTSModel.audioText, tTSModel.audioPathList, tTSModel.ttsVoiceModel, tTSModel.autoAddTtsFlag, tTSModel.voiceEffectId, tTSModel.voiceEffectResourceId, tTSModel.voiceAnchorName, tTSModel.voiceEffectIconUrl, tTSModel.voiceCreatorUserId, tTSModel.voiceCreatorUserName, tTSModel.isCreatorVoice, tTSModel.ttsAnchorReleaseDate, tTSModel.ttsReleaseDate, tTSModel.ttsHashTagIds, tTSModel.ttsAudioBean, tTSModel.isEditorProTTS, tTSModel.editorProTTSID, tTSModel.ttsExtraMap, tTSModel.isInstantClone);
    }

    public TTSModel(boolean z, int i, String str, String str2, String str3, String str4, int i2, String str5, List<String> list, TTSVoiceModel tTSVoiceModel, boolean z2, String str6, String str7, String str8, String str9, String str10, String str11, boolean z3, long j, long j2, List<String> list2, TTSAudioBean tTSAudioBean, boolean z4, String str12, Map<String, String> map, boolean z5) {
        this.hasReadTextAudio = z;
        this.audioTrackIndex = i;
        this.nleUuid = str;
        this.audioTrackFilePath = str2;
        this.speakerID = str3;
        this.speakerName = str4;
        this.audioTrackDuration = i2;
        this.audioText = str5;
        this.audioPathList = list;
        this.ttsVoiceModel = tTSVoiceModel;
        this.autoAddTtsFlag = z2;
        this.voiceEffectId = str6;
        this.voiceEffectResourceId = str7;
        this.voiceAnchorName = str8;
        this.voiceEffectIconUrl = str9;
        this.voiceCreatorUserId = str10;
        this.voiceCreatorUserName = str11;
        this.isCreatorVoice = z3;
        this.ttsAnchorReleaseDate = j;
        this.ttsReleaseDate = j2;
        this.ttsHashTagIds = list2;
        this.ttsAudioBean = tTSAudioBean;
        this.isEditorProTTS = z4;
        this.editorProTTSID = str12;
        this.ttsExtraMap = map;
        this.isInstantClone = z5;
    }
}
