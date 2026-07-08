package com.ss.android.ugc.aweme.creative.model.editorpro;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C13LP;
import X.C376060Eom;
import X.InterfaceC2270808v4;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCInfoModel;
import com.ss.android.ugc.aweme.creative.model.magic.MagicCombineEffectModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
public final class EditorProDraftModel implements Parcelable {

    @C09CT("can_undo")
    public volatile boolean canUndo;

    @C09CT("canvas_cover_path")
    @C0MY0
    @InterfaceC2270808v4
    public String canvasCoverPath;

    @C040H
    public ConcurrentHashMap<String, String> copyResMap;

    @C09CT("editor_pro_aigc_info_for_restore")
    public EditorProAIGCInfoModel editorProAIGCInfoForRestore;

    @C09CT("editor_pro_magic_info_for_restore")
    public MagicCombineEffectModel editorProMagicInfoForRestore;

    @InterfaceC2270908v5
    @C09CT("effects_info")
    public CopyOnWriteArrayList<EditorProEffectInfo> effectsInfo;

    @C09CT("is_canvas_to_editor_pro")
    public volatile boolean isCanvasToEditorPro;

    @C09CT("is_enter_from_album")
    public volatile boolean isEnterFromAlbum;

    @C09CT("is_enter_from_editor_tab_draft")
    public volatile boolean isEnterFromEditorTabDraft;

    @C09CT("is_enter_from_record_tab")
    public volatile boolean isEnterFromRecordTab;

    @C040H
    public boolean isEoyCreateTabOn;

    @C040H
    public int isLandingEditorPro;

    @C09CT("is_photo_to_video")
    public volatile boolean isPhotoToVideo;

    @C09CT("editor_pro_music_business_model")
    public MusicBuzModel musicBuzModel;

    @C09CT("mv_create_video_data")
    public volatile MvCreateVideoData mvCreateVideoData;

    @C09CT("nle_draft_creative_res_paths")
    @C0MY0
    public CopyOnWriteArraySet<String> nleCreativeResPaths;

    @C040H
    public volatile String nleData;

    @C09CT("nle_draft_data_path")
    @C0MY0
    public volatile String nleDataPath;

    @C09CT("nle_draft_persistent_res_paths")
    @InterfaceC2270808v4
    public CopyOnWriteArraySet<String> nlePersistentResPaths;

    @InterfaceC2270908v5
    @C09CT("nle_draft_public_res_paths")
    public CopyOnWriteArraySet<String> nlePublicResPaths;
    public static final C376060Eom Companion = new Object() { // from class: X.0Eom
    };
    public static final Parcelable.Creator<EditorProDraftModel> CREATOR = new Parcelable.Creator<EditorProDraftModel>() { // from class: X.0Eol
        @Override // android.os.Parcelable.Creator
        public final EditorProDraftModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            EditorProDraftModel.Companion.getClass();
            String string = parcel.readString();
            int i = parcel.readInt();
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            for (int i2 = 0; i2 < i; i2++) {
                String string2 = parcel.readString();
                if (string2 != null) {
                    copyOnWriteArraySet.add(string2);
                }
            }
            int i3 = parcel.readInt();
            CopyOnWriteArraySet copyOnWriteArraySet2 = new CopyOnWriteArraySet();
            for (int i4 = 0; i4 < i3; i4++) {
                String string3 = parcel.readString();
                if (string3 != null) {
                    copyOnWriteArraySet2.add(string3);
                }
            }
            int i5 = parcel.readInt();
            CopyOnWriteArraySet copyOnWriteArraySet3 = new CopyOnWriteArraySet();
            for (int i6 = 0; i6 < i5; i6++) {
                String string4 = parcel.readString();
                if (string4 != null) {
                    copyOnWriteArraySet3.add(string4);
                }
            }
            int i7 = parcel.readInt();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            for (int i8 = 0; i8 < i7; i8++) {
                Parcelable parcelable = parcel.readParcelable(EditorProEffectInfo.class.getClassLoader());
                if (parcelable != null) {
                    copyOnWriteArrayList.add(parcelable);
                }
            }
            MusicBuzModel musicBuzModel = (MusicBuzModel) parcel.readParcelable(EditorProDraftModel.class.getClassLoader());
            EditorProAIGCInfoModel editorProAIGCInfoModel = (EditorProAIGCInfoModel) parcel.readParcelable(EditorProDraftModel.class.getClassLoader());
            MagicCombineEffectModel magicCombineEffectModel = (MagicCombineEffectModel) parcel.readParcelable(EditorProDraftModel.class.getClassLoader());
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i9 = parcel.readInt();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(i9);
            for (int i10 = 0; i10 < i9; i10++) {
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (string6 != null && string7 != null) {
                    concurrentHashMap.put(string6, string7);
                }
            }
            int i11 = parcel.readInt();
            MvCreateVideoData mvCreateVideoData = (MvCreateVideoData) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String string8 = parcel.readString();
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
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new EditorProDraftModel(string, copyOnWriteArraySet, copyOnWriteArraySet2, copyOnWriteArraySet3, copyOnWriteArrayList, musicBuzModel, editorProAIGCInfoModel, magicCombineEffectModel, string5, z, concurrentHashMap, i11, mvCreateVideoData, z2, z3, string8, z4, z5, z6, z7);
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProDraftModel[] newArray(int i) {
            return new EditorProDraftModel[i];
        }
    };

    public EditorProDraftModel() {
        this(null, new CopyOnWriteArraySet(), new CopyOnWriteArraySet(), new CopyOnWriteArraySet(), new CopyOnWriteArrayList(), null, null, null, null, false, new ConcurrentHashMap(), 0, null, false, false, null, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Companion.getClass();
        parcel.writeString(this.nleDataPath);
        Set setLLIIIZ = C13LP.LLIIIZ(this.nleCreativeResPaths);
        parcel.writeInt(setLLIIIZ.size());
        Iterator it2 = setLLIIIZ.iterator();
        while (it2.hasNext()) {
            parcel.writeString((String) it2.next());
        }
        Set setLLIIIZ2 = C13LP.LLIIIZ(this.nlePublicResPaths);
        parcel.writeInt(setLLIIIZ2.size());
        Iterator it3 = setLLIIIZ2.iterator();
        while (it3.hasNext()) {
            parcel.writeString((String) it3.next());
        }
        Set setLLIIIZ3 = C13LP.LLIIIZ(this.nlePersistentResPaths);
        parcel.writeInt(setLLIIIZ3.size());
        Iterator it4 = setLLIIIZ3.iterator();
        while (it4.hasNext()) {
            parcel.writeString((String) it4.next());
        }
        ArrayList arrayList = new ArrayList(this.effectsInfo);
        parcel.writeInt(arrayList.size());
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            parcel.writeParcelable((EditorProEffectInfo) it5.next(), i);
        }
        parcel.writeParcelable(this.musicBuzModel, i);
        parcel.writeParcelable(this.editorProAIGCInfoForRestore, i);
        parcel.writeParcelable(this.editorProMagicInfoForRestore, i);
        parcel.writeString(this.nleData);
        parcel.writeInt(this.canUndo ? 1 : 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.copyResMap);
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
        parcel.writeInt(this.isLandingEditorPro);
        parcel.writeSerializable(this.mvCreateVideoData);
        parcel.writeInt(this.isPhotoToVideo ? 1 : 0);
        parcel.writeInt(this.isCanvasToEditorPro ? 1 : 0);
        parcel.writeString(this.canvasCoverPath);
        parcel.writeInt(this.isEnterFromRecordTab ? 1 : 0);
        parcel.writeInt(this.isEnterFromAlbum ? 1 : 0);
        parcel.writeInt(this.isEnterFromEditorTabDraft ? 1 : 0);
        parcel.writeInt(this.isEoyCreateTabOn ? 1 : 0);
    }

    public EditorProDraftModel(String str, CopyOnWriteArraySet<String> copyOnWriteArraySet, CopyOnWriteArraySet<String> copyOnWriteArraySet2, CopyOnWriteArraySet<String> copyOnWriteArraySet3, CopyOnWriteArrayList<EditorProEffectInfo> copyOnWriteArrayList, MusicBuzModel musicBuzModel, EditorProAIGCInfoModel editorProAIGCInfoModel, MagicCombineEffectModel magicCombineEffectModel, String str2, boolean z, ConcurrentHashMap<String, String> concurrentHashMap, int i, MvCreateVideoData mvCreateVideoData, boolean z2, boolean z3, String str3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.nleDataPath = str;
        this.nleCreativeResPaths = copyOnWriteArraySet;
        this.nlePublicResPaths = copyOnWriteArraySet2;
        this.nlePersistentResPaths = copyOnWriteArraySet3;
        this.effectsInfo = copyOnWriteArrayList;
        this.musicBuzModel = musicBuzModel;
        this.editorProAIGCInfoForRestore = editorProAIGCInfoModel;
        this.editorProMagicInfoForRestore = magicCombineEffectModel;
        this.nleData = str2;
        this.canUndo = z;
        this.copyResMap = concurrentHashMap;
        this.isLandingEditorPro = i;
        this.mvCreateVideoData = mvCreateVideoData;
        this.isPhotoToVideo = z2;
        this.isCanvasToEditorPro = z3;
        this.canvasCoverPath = str3;
        this.isEnterFromRecordTab = z4;
        this.isEnterFromAlbum = z5;
        this.isEnterFromEditorTabDraft = z6;
        this.isEoyCreateTabOn = z7;
    }
}
