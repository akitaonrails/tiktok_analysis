package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0L9M;
import X.C0MJ9;
import X.C0MY0;
import X.C13BV;
import X.EnumC1157310gDp;
import X.EnumC1417150myv;
import X.InterfaceC2270808v4;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.AutoCutAsyncRenderModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutSoundSyncModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.AutoCutTitle;
import com.ss.android.ugc.aweme.creative.model.ReusedMusicInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoCutModel implements Parcelable {
    public static final Parcelable.Creator<AutoCutModel> CREATOR = new Parcelable.Creator<AutoCutModel>() { // from class: X.0Mis
        @Override // android.os.Parcelable.Creator
        public final AutoCutModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            ArrayList arrayList;
            ArrayList arrayList2;
            Integer numValueOf;
            Long lValueOf;
            boolean z4;
            boolean z5;
            boolean z6;
            int i = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList3.add(AutoCutThemeData.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList4.add(AutoCutMediaModel.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList5.add(AutoCutMediaModel.CREATOR.createFromParcel(parcel));
            }
            String string = parcel.readString();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
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
            int i9 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList6.add(AutoCutMediaModel.CREATOR.createFromParcel(parcel));
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AutoCutSoundSyncModel autoCutSoundSyncModelCreateFromParcel = AutoCutSoundSyncModel.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            AutoCutAsyncRenderModel autoCutAsyncRenderModelCreateFromParcel = AutoCutAsyncRenderModel.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            ReusedMusicInfo reusedMusicInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(AutoCutMediaModel.CREATOR.createFromParcel(parcel));
                }
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList2.add(AutoCutTitle.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i17 = parcel.readInt();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String string9 = parcel.readString();
            int i18 = parcel.readInt();
            int i19 = parcel.readInt();
            int i20 = parcel.readInt();
            HashSet hashSet = new HashSet(i20);
            for (int i21 = 0; i21 != i20; i21++) {
                hashSet.add(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                reusedMusicInfoCreateFromParcel = ReusedMusicInfo.CREATOR.createFromParcel(parcel);
            }
            ReusedMusicInfo reusedMusicInfo = reusedMusicInfoCreateFromParcel;
            int i22 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i22);
            for (int i23 = 0; i23 != i22; i23++) {
                linkedHashSet.add(parcel.readString());
            }
            return new AutoCutModel(arrayList3, arrayList4, arrayList5, string, i7, i8, z, z2, arrayList6, string2, string3, autoCutSoundSyncModelCreateFromParcel, i11, i12, z3, autoCutAsyncRenderModelCreateFromParcel, string4, arrayList, string5, arrayList2, numValueOf, string6, string7, string8, i17, lValueOf, z4, string9, i18, i19, hashSet, z5, z6, reusedMusicInfo, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final AutoCutModel[] newArray(int i) {
            return new AutoCutModel[i];
        }
    };

    @C09CT("autocut_apply_scenario")
    public int applyScenario;

    @C040H
    public AutoCutAsyncRenderModel asyncRenderModel;

    @C040H
    public boolean backwardAutoCutProcess;

    @C09CT("autocut_click_from")
    public String clickFrom;

    @C09CT("autocut_click_from_most_recent")
    public String clickFromMostRecent;

    @C09CT("autocut_generate_type")
    public int curGenerateType;

    @C09CT("autocut_current_index")
    public int curIndexFromSource;

    @C040H
    public List<AutoCutMediaModel> curMediaList;

    @C09CT("autocut_cur_recommend_titles")
    public List<AutoCutTitle> curRecommendTitleList;

    @C09CT("autocut_scene_type")
    public String curSceneType;

    @C09CT("autocut_current_source")
    public int curSource;

    @C09CT("autocut_template_group_id")
    public String curTemplateGroupId;

    @C09CT("autocut_template_id")
    public String curTemplateId;

    @C09CT("autocut_template_tag")
    public String curTemplateTag;

    @C09CT("autocut_template_type")
    public int curTemplateType;

    @C09CT("from_auto_cut_in_album")
    public boolean fromAutoCutInAlbum;

    @C09CT("has_try_template_set")
    public final HashSet<String> hasTryTemplateSet;

    @C09CT("autocut_i2i_resource_paths")
    @C0MY0(blockCreative = false)
    @InterfaceC2270808v4
    public Set<String> i2iResourcePaths;

    @C09CT("autocut_insert_media_list")
    public List<AutoCutMediaModel> insertMediaList;

    @C040H
    public boolean isAutoCutPopupShow;

    @C040H
    public boolean isMockFirstItem;

    @C09CT("auto_cut_none")
    public boolean isNone;

    @C09CT("photo_mode_none")
    public boolean isPhotoModeNone;

    @C040H
    public int lastIndexFromSourceWhenChangeMusic;

    @C09CT("autocut_media_list")
    public List<AutoCutMediaModel> mediaList;

    @C040H
    public String musicLogId;

    @C040H
    public Long optimizeLargeNLEId;

    @C09CT("auto_cut_ori_media_list")
    public List<AutoCutMediaModel> oriMediaList;

    @C09CT("request_source")
    public int requestSource;

    @C09CT("reuse_music_type")
    public String reuseMusicType;

    @C09CT("reused_music_info")
    public ReusedMusicInfo reusedMusicInfo;

    @C09CT("autocut_sound_sync_model")
    public AutoCutSoundSyncModel soundSyncModel;

    @C09CT("autocut_speed_variation_type")
    public Integer speedVariationType;

    @C09CT("autocut_task_id")
    public String taskId;

    @C09CT("autocut_music_list")
    public List<AutoCutThemeData> templateList;

    public AutoCutModel() {
        this(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AutoCutThemeData> list = this.templateList;
        parcel.writeInt(list.size());
        Iterator<AutoCutThemeData> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<AutoCutMediaModel> list2 = this.mediaList;
        parcel.writeInt(list2.size());
        Iterator<AutoCutMediaModel> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        List<AutoCutMediaModel> list3 = this.insertMediaList;
        parcel.writeInt(list3.size());
        Iterator<AutoCutMediaModel> it4 = list3.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.taskId);
        parcel.writeInt(this.curIndexFromSource);
        parcel.writeInt(this.curSource);
        parcel.writeInt(this.isNone ? 1 : 0);
        parcel.writeInt(this.isPhotoModeNone ? 1 : 0);
        List<AutoCutMediaModel> list4 = this.oriMediaList;
        parcel.writeInt(list4.size());
        Iterator<AutoCutMediaModel> it5 = list4.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.clickFrom);
        parcel.writeString(this.clickFromMostRecent);
        this.soundSyncModel.writeToParcel(parcel, i);
        parcel.writeInt(this.curTemplateType);
        parcel.writeInt(this.applyScenario);
        parcel.writeInt(this.backwardAutoCutProcess ? 1 : 0);
        this.asyncRenderModel.writeToParcel(parcel, i);
        parcel.writeString(this.reuseMusicType);
        List<AutoCutMediaModel> list5 = this.curMediaList;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            Iterator<AutoCutMediaModel> it6 = list5.iterator();
            while (it6.hasNext()) {
                it6.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.curTemplateId);
        List<AutoCutTitle> list6 = this.curRecommendTitleList;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list6.size());
            Iterator<AutoCutTitle> it7 = list6.iterator();
            while (it7.hasNext()) {
                it7.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.speedVariationType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.curTemplateGroupId);
        parcel.writeString(this.curTemplateTag);
        parcel.writeString(this.curSceneType);
        parcel.writeInt(this.curGenerateType);
        Long l = this.optimizeLargeNLEId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.isAutoCutPopupShow ? 1 : 0);
        parcel.writeString(this.musicLogId);
        parcel.writeInt(this.requestSource);
        parcel.writeInt(this.lastIndexFromSourceWhenChangeMusic);
        HashSet<String> hashSet = this.hasTryTemplateSet;
        parcel.writeInt(hashSet.size());
        Iterator<String> it8 = hashSet.iterator();
        while (it8.hasNext()) {
            parcel.writeString(it8.next());
        }
        parcel.writeInt(this.fromAutoCutInAlbum ? 1 : 0);
        parcel.writeInt(this.isMockFirstItem ? 1 : 0);
        ReusedMusicInfo reusedMusicInfo = this.reusedMusicInfo;
        if (reusedMusicInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reusedMusicInfo.writeToParcel(parcel, i);
        }
        Set<String> set = this.i2iResourcePaths;
        parcel.writeInt(set.size());
        Iterator<String> it9 = set.iterator();
        while (it9.hasNext()) {
            parcel.writeString(it9.next());
        }
    }

    public AutoCutModel(List<AutoCutThemeData> list, List<AutoCutMediaModel> list2, List<AutoCutMediaModel> list3, String str, int i, int i2, boolean z, boolean z2, List<AutoCutMediaModel> list4, String str2, String str3, AutoCutSoundSyncModel autoCutSoundSyncModel, int i3, int i4, boolean z3, AutoCutAsyncRenderModel autoCutAsyncRenderModel, String str4, List<AutoCutMediaModel> list5, String str5, List<AutoCutTitle> list6, Integer num, String str6, String str7, String str8, int i5, Long l, boolean z4, String str9, int i6, int i7, HashSet<String> hashSet, boolean z5, boolean z6, ReusedMusicInfo reusedMusicInfo, Set<String> set) {
        this.templateList = list;
        this.mediaList = list2;
        this.insertMediaList = list3;
        this.taskId = str;
        this.curIndexFromSource = i;
        this.curSource = i2;
        this.isNone = z;
        this.isPhotoModeNone = z2;
        this.oriMediaList = list4;
        this.clickFrom = str2;
        this.clickFromMostRecent = str3;
        this.soundSyncModel = autoCutSoundSyncModel;
        this.curTemplateType = i3;
        this.applyScenario = i4;
        this.backwardAutoCutProcess = z3;
        this.asyncRenderModel = autoCutAsyncRenderModel;
        this.reuseMusicType = str4;
        this.curMediaList = list5;
        this.curTemplateId = str5;
        this.curRecommendTitleList = list6;
        this.speedVariationType = num;
        this.curTemplateGroupId = str6;
        this.curTemplateTag = str7;
        this.curSceneType = str8;
        this.curGenerateType = i5;
        this.optimizeLargeNLEId = l;
        this.isAutoCutPopupShow = z4;
        this.musicLogId = str9;
        this.requestSource = i6;
        this.lastIndexFromSourceWhenChangeMusic = i7;
        this.hasTryTemplateSet = hashSet;
        this.fromAutoCutInAlbum = z5;
        this.isMockFirstItem = z6;
        this.reusedMusicInfo = reusedMusicInfo;
        this.i2iResourcePaths = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutoCutModel(List list, List list2, List list3, String str, int i, int i2, boolean z, boolean z2, List list4, String str2, String str3, AutoCutSoundSyncModel autoCutSoundSyncModel, int i3, int i4, boolean z3, AutoCutAsyncRenderModel autoCutAsyncRenderModel, String str4, List list5, String str5, List list6, Integer num, String str6, String str7, String str8, int i5, Long l, boolean z4, String str9, int i6, int i7, HashSet hashSet, boolean z5, boolean z6, ReusedMusicInfo reusedMusicInfo, Set set, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z7;
        AutoCutSoundSyncModel autoCutSoundSyncModel2 = autoCutSoundSyncModel;
        AutoCutAsyncRenderModel autoCutAsyncRenderModel2 = autoCutAsyncRenderModel;
        list = (i8 & 1) != 0 ? new ArrayList() : list;
        list2 = (i8 & 2) != 0 ? new ArrayList() : list2;
        list3 = (i8 & 4) != 0 ? C13BV.INSTANCE : list3;
        str = (i8 & 8) != 0 ? null : str;
        i = (i8 & 16) != 0 ? -1 : i;
        i2 = (i8 & 32) != 0 ? C0MJ9.AUTO_CUT.ordinal() : i2;
        z = (i8 & 64) != 0 ? false : z;
        z2 = (i8 & 128) != 0 ? false : z2;
        list4 = (i8 & 256) != 0 ? C13BV.INSTANCE : list4;
        str2 = (i8 & 512) != 0 ? null : str2;
        str3 = (i8 & 1024) != 0 ? null : str3;
        autoCutSoundSyncModel2 = (i8 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new AutoCutSoundSyncModel(null, null, 0) : autoCutSoundSyncModel2;
        i3 = (i8 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? -1 : i3;
        i4 = (i8 & 8192) != 0 ? EnumC1417150myv.UNSET.getCode() : i4;
        z3 = (i8 & 16384) != 0 ? false : z3;
        if ((32768 & i8) != 0) {
            z7 = false;
            autoCutAsyncRenderModel2 = new AutoCutAsyncRenderModel(0 == true ? 1 : 0);
        } else {
            z7 = false;
        }
        this(list, list2, list3, str, i, i2, z, z2, list4, str2, str3, autoCutSoundSyncModel2, i3, i4, z3, autoCutAsyncRenderModel2, (65536 & i8) != 0 ? "other" : str4, (131072 & i8) != 0 ? null : list5, (262144 & i8) != 0 ? null : str5, (524288 & i8) != 0 ? null : list6, (1048576 & i8) != 0 ? null : num, (2097152 & i8) != 0 ? null : str6, (4194304 & i8) != 0 ? null : str7, (8388608 & i8) != 0 ? null : str8, (16777216 & i8) != 0 ? C0L9M.FIRST_GENERATE_AUTOCUT.getValue() : i5, (33554432 & i8) != 0 ? null : l, (67108864 & i8) != 0 ? false : z4, (134217728 & i8) != 0 ? null : str9, (268435456 & i8) != 0 ? EnumC1157310gDp.MANUAL.ordinal() : i6, (536870912 & i8) != 0 ? -1 : i7, (1073741824 & i8) != 0 ? new HashSet() : hashSet, (i8 & Integer.MIN_VALUE) != 0 ? false : z5, (i9 & 1) == 0 ? z6 : z7, (i9 & 2) != 0 ? null : reusedMusicInfo, (i9 & 4) != 0 ? new CopyOnWriteArraySet() : set);
    }
}
