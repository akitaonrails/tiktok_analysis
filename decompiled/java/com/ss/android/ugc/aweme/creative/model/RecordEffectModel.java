package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.creative.model.effect.ApplyRecordEffectInfo;
import com.ss.android.ugc.aweme.creative.model.recordeffect.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.EffectMessageModel;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class RecordEffectModel implements Parcelable {
    public static final Parcelable.Creator<RecordEffectModel> CREATOR = new Parcelable.Creator<RecordEffectModel>() { // from class: X.0nWJ
        @Override // android.os.Parcelable.Creator
        public final RecordEffectModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            SharedARModel sharedARModelCreateFromParcel;
            boolean z3;
            ArrayList arrayList2;
            boolean z4;
            ApplyRecordEffectInfo applyRecordEffectInfoCreateFromParcel;
            boolean z5;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(RecordEffectModel.class.getClassLoader()));
                }
            }
            StickerInfo stickerInfo = (StickerInfo) parcel.readSerializable();
            SimpleEffect simpleEffect = (SimpleEffect) parcel.readParcelable(RecordEffectModel.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            if (parcel.readInt() == 0) {
                sharedARModelCreateFromParcel = null;
            } else {
                sharedARModelCreateFromParcel = SharedARModel.CREATOR.createFromParcel(parcel);
            }
            SharedARModel sharedARModel = sharedARModelCreateFromParcel;
            int i3 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string5 = parcel.readString();
            int i4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList2.add(GreenScreenMaterial.CREATOR.createFromParcel(parcel));
                }
            }
            String string6 = parcel.readString();
            EffectMessageModel effectMessageModel = (EffectMessageModel) parcel.readParcelable(RecordEffectModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() == 0) {
                applyRecordEffectInfoCreateFromParcel = null;
            } else {
                applyRecordEffectInfoCreateFromParcel = ApplyRecordEffectInfo.CREATOR.createFromParcel(parcel);
            }
            ApplyRecordEffectInfo applyRecordEffectInfo = applyRecordEffectInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new RecordEffectModel(arrayList, stickerInfo, simpleEffect, string, string2, z, z2, sharedARModel, i3, string3, string4, arrayListCreateStringArrayList, string5, i4, z3, arrayList2, string6, effectMessageModel, z4, applyRecordEffectInfo, z5, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final RecordEffectModel[] newArray(int i) {
            return new RecordEffectModel[i];
        }
    };

    @C040H
    public ApplyRecordEffectInfo applyRecordEffectInfo;

    @C040H
    public Effect autoApplyEffect;

    @C040H
    public boolean autoShowStickerPanel;

    @C040H
    public boolean containDiyPropVideo;

    @C040H
    public String designerIdList;

    @C09CT("effect_info")
    public SimpleEffect effectInfo;

    @C09CT("effect_message_model")
    public final EffectMessageModel effectMessageModel;

    @C040H
    public List<String> effectReuseFlowStickerIds;

    @C040H
    public String enterFrom;

    @C09CT("enter_method")
    public String enterMethodFromEffect;

    @C040H
    public String firstStickerMusicIdsJson;

    @C040H
    public int gameScore;

    @C040H
    public ArrayList<String> gradeKey;

    @C040H
    public ArrayList<GreenScreenMaterial> greenScreenMaterialList;

    @C040H
    public boolean hasAutoApplyEffect;

    @C040H
    public boolean isAigcPropSelected;

    @C040H
    public boolean isAutoApplied;

    @C040H
    public boolean isStoryRecording;

    @C040H
    public boolean musicConstrictionOnRecordDurationRemovedByGameEffect;

    @C040H
    public int originalStickerCount;

    @C040H
    public SharedARModel sharedARModel;

    @C040H
    public List<? extends AVChallenge> stickerChallenges;

    @C040H
    public transient String stickerFrom;

    @C040H
    public String stickerID;

    @C09CT("sticker_info")
    public StickerInfo stickerInfo;

    @C040H
    public List<String> stickerPhotoList;

    public RecordEffectModel() {
        this(null, null, null, null, null, false, false, null, 0, null, null, null, null, 0, false, null, null, null, false, null, false, null, 4194303, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<? extends AVChallenge> list = this.stickerChallenges;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<? extends AVChallenge> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeSerializable(this.stickerInfo);
        parcel.writeParcelable(this.effectInfo, i);
        parcel.writeString(this.stickerFrom);
        parcel.writeString(this.enterFrom);
        parcel.writeInt(this.hasAutoApplyEffect ? 1 : 0);
        parcel.writeInt(this.isStoryRecording ? 1 : 0);
        SharedARModel sharedARModel = this.sharedARModel;
        if (sharedARModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sharedARModel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.gameScore);
        parcel.writeString(this.firstStickerMusicIdsJson);
        parcel.writeString(this.stickerID);
        parcel.writeStringList(this.effectReuseFlowStickerIds);
        parcel.writeString(this.designerIdList);
        parcel.writeInt(this.originalStickerCount);
        parcel.writeInt(this.containDiyPropVideo ? 1 : 0);
        ArrayList<GreenScreenMaterial> arrayList = this.greenScreenMaterialList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<GreenScreenMaterial> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.enterMethodFromEffect);
        parcel.writeParcelable(this.effectMessageModel, i);
        parcel.writeInt(this.musicConstrictionOnRecordDurationRemovedByGameEffect ? 1 : 0);
        ApplyRecordEffectInfo applyRecordEffectInfo = this.applyRecordEffectInfo;
        if (applyRecordEffectInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            applyRecordEffectInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isAigcPropSelected ? 1 : 0);
        parcel.writeStringList(this.stickerPhotoList);
    }

    public RecordEffectModel(List<? extends AVChallenge> list, StickerInfo stickerInfo, SimpleEffect simpleEffect, String str, String str2, boolean z, boolean z2, SharedARModel sharedARModel, int i, String str3, String str4, List<String> list2, String str5, int i2, boolean z3, ArrayList<GreenScreenMaterial> arrayList, String str6, EffectMessageModel effectMessageModel, boolean z4, ApplyRecordEffectInfo applyRecordEffectInfo, boolean z5, List<String> list3) {
        this.stickerChallenges = list;
        this.stickerInfo = stickerInfo;
        this.effectInfo = simpleEffect;
        this.stickerFrom = str;
        this.enterFrom = str2;
        this.hasAutoApplyEffect = z;
        this.isStoryRecording = z2;
        this.sharedARModel = sharedARModel;
        this.gameScore = i;
        this.firstStickerMusicIdsJson = str3;
        this.stickerID = str4;
        this.effectReuseFlowStickerIds = list2;
        this.designerIdList = str5;
        this.originalStickerCount = i2;
        this.containDiyPropVideo = z3;
        this.greenScreenMaterialList = arrayList;
        this.enterMethodFromEffect = str6;
        this.effectMessageModel = effectMessageModel;
        this.musicConstrictionOnRecordDurationRemovedByGameEffect = z4;
        this.applyRecordEffectInfo = applyRecordEffectInfo;
        this.isAigcPropSelected = z5;
        this.stickerPhotoList = list3;
        this.gradeKey = new ArrayList<>();
    }

    public RecordEffectModel(List list, StickerInfo stickerInfo, SimpleEffect simpleEffect, String str, String str2, boolean z, boolean z2, SharedARModel sharedARModel, int i, String str3, String str4, List list2, String str5, int i2, boolean z3, ArrayList arrayList, String str6, EffectMessageModel effectMessageModel, boolean z4, ApplyRecordEffectInfo applyRecordEffectInfo, boolean z5, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? null : stickerInfo, (i3 & 4) != 0 ? null : simpleEffect, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? null : sharedARModel, (i3 & 256) != 0 ? 0 : i, (i3 & 512) != 0 ? null : str3, (i3 & 1024) != 0 ? null : str4, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : list2, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str5, (i3 & 8192) != 0 ? 0 : i2, (i3 & 16384) != 0 ? false : z3, (32768 & i3) != 0 ? new ArrayList() : arrayList, (65536 & i3) != 0 ? null : str6, (131072 & i3) != 0 ? new EffectMessageModel(C13BV.INSTANCE) : effectMessageModel, (262144 & i3) != 0 ? false : z4, (524288 & i3) != 0 ? null : applyRecordEffectInfo, (1048576 & i3) != 0 ? false : z5, (i3 & 2097152) != 0 ? null : list3);
    }
}
