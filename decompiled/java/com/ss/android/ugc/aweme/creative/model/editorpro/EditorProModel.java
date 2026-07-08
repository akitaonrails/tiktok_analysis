package com.ss.android.ugc.aweme.creative.model.editorpro;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.InterfaceC2270808v4;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class EditorProModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditorProModel> CREATOR = new Parcelable.Creator<EditorProModel>() { // from class: X.09Kl
        @Override // android.os.Parcelable.Creator
        public final EditorProModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Long lValueOf;
            Long lValueOf2;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            Integer numValueOf;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            ArrayList arrayList;
            ArrayList arrayList2;
            EditorProEffectInfo editorProEffectInfoCreateFromParcel;
            EditorProEffectInfo editorProEffectInfoCreateFromParcel2;
            boolean z19;
            Boolean boolValueOf;
            boolean z20;
            boolean z21;
            boolean z22;
            boolean z23;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
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
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            long j = parcel.readLong();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList3.add(parcel.readParcelable(EditorProModel.class.getClassLoader()));
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
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
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (parcel.readInt() != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList5 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList6 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList7 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList8 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList9 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (parcel.readInt() != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                arrayList = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList.add(parcel.readParcelable(EditorProModel.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i9 = parcel.readInt();
                arrayList2 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList2.add(parcel.readParcelable(EditorProModel.class.getClassLoader()));
                }
            }
            int i11 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList4.add(Long.valueOf(parcel.readLong()));
            }
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList10 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList11 = parcel.createStringArrayList();
            int i13 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList5.add(EditorProEffectInfo.CREATOR.createFromParcel(parcel));
            }
            int i15 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                linkedHashMap.put(parcel.readString(), parcel.readParcelable(EditorProModel.class.getClassLoader()));
            }
            int i17 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList6.add(EditorProEffectInfo.CREATOR.createFromParcel(parcel));
            }
            int i19 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i19);
            for (int i20 = 0; i20 != i19; i20++) {
                arrayList7.add(EditorProEffectInfo.CREATOR.createFromParcel(parcel));
            }
            int i21 = parcel.readInt();
            ArrayList arrayList8 = new ArrayList(i21);
            for (int i22 = 0; i22 != i21; i22++) {
                arrayList8.add(EditorProEffectInfo.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                editorProEffectInfoCreateFromParcel = null;
            } else {
                editorProEffectInfoCreateFromParcel = EditorProEffectInfo.CREATOR.createFromParcel(parcel);
            }
            EditorProEffectInfo editorProEffectInfo = editorProEffectInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                editorProEffectInfoCreateFromParcel2 = null;
            } else {
                editorProEffectInfoCreateFromParcel2 = EditorProEffectInfo.CREATOR.createFromParcel(parcel);
            }
            EditorProEffectInfo editorProEffectInfo2 = editorProEffectInfoCreateFromParcel2;
            int i23 = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(i23);
            for (int i24 = 0; i24 != i23; i24++) {
                arrayList9.add(parcel.readParcelable(EditorProModel.class.getClassLoader()));
            }
            ArrayList<String> arrayListCreateStringArrayList12 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList13 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList14 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolValueOf = Boolean.valueOf(z19);
            }
            ArrayList<String> arrayListCreateStringArrayList15 = parcel.createStringArrayList();
            int i25 = parcel.readInt();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(i25);
            for (int i26 = 0; i26 != i25; i26++) {
                concurrentHashMap.put(parcel.readString(), parcel.readParcelable(EditorProModel.class.getClassLoader()));
            }
            ArrayList<String> arrayListCreateStringArrayList16 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (parcel.readInt() != 0) {
                z21 = true;
            } else {
                z21 = false;
            }
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z22 = true;
            } else {
                z22 = false;
            }
            long j2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z23 = true;
            } else {
                z23 = false;
            }
            return new EditorProModel(z, string, z2, z3, string2, z4, j, lValueOf, lValueOf2, z5, arrayList3, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, z6, z7, z8, i3, z9, z10, z11, z12, i4, z13, z14, numValueOf, z15, arrayListCreateStringArrayList4, arrayListCreateStringArrayList5, arrayListCreateStringArrayList6, arrayListCreateStringArrayList7, arrayListCreateStringArrayList8, arrayListCreateStringArrayList9, z16, i5, i6, string3, z17, z18, arrayList, arrayList2, arrayList4, string4, arrayListCreateStringArrayList10, arrayListCreateStringArrayList11, arrayList5, linkedHashMap, arrayList6, arrayList7, arrayList8, editorProEffectInfo, editorProEffectInfo2, arrayList9, arrayListCreateStringArrayList12, arrayListCreateStringArrayList13, arrayListCreateStringArrayList14, boolValueOf, arrayListCreateStringArrayList15, concurrentHashMap, arrayListCreateStringArrayList16, z20, z21, string5, z22, j2, z23, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProModel[] newArray(int i) {
            return new EditorProModel[i];
        }
    };

    @C040H
    public String actionsViaEPMoreOptions;

    @InterfaceC2270908v5
    @C09CT("adjust_filter_resource_paths")
    public List<String> adjustFilterResourcePaths;

    @C09CT("album_upload_video_segments")
    public List<EditVideoSegment> albumUploadVideoSegments;

    @C09CT("audio_edit_tip_title")
    public String audioEditTipTitle;

    @C09CT("back_from_publish_timestamp")
    public long backFromPublishTimestamp;

    @C09CT("blend_cutout_resource")
    public EditorProEffectInfo blendCutoutEffect;

    @C09CT("blend_mask_resource")
    public EditorProEffectInfo blendMaskEffect;

    @C09CT("origin_canvas_shoot_image_segments")
    public List<EditVideoSegment> canvasShootImageSegments;

    @C09CT("caption_click_from_edit_tab")
    public boolean captionClickFromEditTab;

    @C09CT("chroma_effect_resource_list")
    public List<EditorProEffectInfo> chromaEffects;

    @InterfaceC2270908v5
    @C09CT("chroma_key_path_list")
    public List<String> chromaKeyPathList;

    @C040H
    public long clickBackSaveTime;

    @C09CT("click_from")
    public String clickFrom;

    @InterfaceC2270908v5
    @C09CT("cutout_blend_res_list")
    public List<String> cutoutBlendResList;

    @InterfaceC2270908v5
    @C09CT("cutout_mask_path_list")
    public List<String> cutoutMaskPathList;

    @C09CT("cutout_stroke_resource_list")
    public List<EditorProEffectInfo> cutoutStrokeEffects;

    @C09CT("edit_mode")
    public int editMode;

    @C09CT("edit_page_normal_ui_style")
    public boolean editorProEntryForceNormalStyle;

    @C09CT("editor_pro_pip_filter_enter_way")
    public String editorProPipFilterEnterWay;

    @C09CT("enable_origin_audio")
    public boolean enableOriginAudio;

    @C09CT("ep_aigc_video_segments")
    public List<EditVideoSegment> epAIGCVideoSegments;

    @C09CT("favorite_effect_search_info")
    public Map<String, EffectSearchModel> favoriteEffectSearchInfo;

    @InterfaceC2270908v5
    @C09CT("filter_resource_paths")
    public List<String> filterResourcePaths;

    @C09CT("from_album_type")
    public int fromAlbumType;

    @C09CT("from_edit_type")
    public int fromEditType;

    @C09CT("from_editor_pro_album_entry")
    public boolean fromEditorProEntranceInAlbum;

    @C09CT("from_photo_canvas")
    public boolean fromPhotoCanvas;

    @C09CT("has_audio_in_advance_edit")
    public boolean hasAudioInAdvanceEdit;

    @C09CT("is_draft_again")
    public boolean hasDraftAgain;

    @C040H
    public boolean hasSavedDraftInEPMore;

    @C09CT("is_advanced_edit")
    public boolean isAdvancedEdit;

    @C09CT("is_advanced_edit_draft")
    public boolean isAdvancedEditDraft;

    @C09CT("is_caption_mix_track_used")
    public boolean isCaptionMixTrackUsed;

    @C09CT("is_caption_motion_used")
    public boolean isCaptionMotionUsed;

    @C09CT("is_editorpro_remove_filler_words")
    public boolean isEditorProRemoveFillerWords;

    @C09CT("is_from_restore")
    public boolean isFromSystemRestore;

    @C040H
    public boolean isMediaUnchangedAfterEP;

    @C09CT("is_original_from_upload_page")
    public Boolean isOriginalUploadPage;

    @C09CT("is_pip_used")
    public boolean isPipUsed;

    @C09CT("is_text_motion_used")
    public boolean isTextMotionUsed;

    @C09CT("isVideoCompressed")
    public boolean isVideoCompressed;

    @C040H
    public ConcurrentHashMap<String, Effect> magicCache;

    @InterfaceC2270908v5
    @C09CT("magic_combine_effect_algo_paths")
    public List<String> magicCombineEffectAlgoCachePaths;

    @InterfaceC2270908v5
    @C09CT("magic_effect_resource_paths")
    public List<String> magicEffectResourcePaths;

    @InterfaceC2270908v5
    @C09CT("magic_resource_paths")
    public List<String> magicResourcePaths;

    @InterfaceC2270908v5
    @C09CT("magic_video_paths")
    @InterfaceC2270808v4
    public List<String> magicVideoPaths;

    @C09CT("mask_resource_list")
    public List<EditorProEffectInfo> maskEffects;

    @C09CT("model_mute")
    public boolean modelMute;

    @C09CT("old_effect_draft")
    public boolean oldEffectDraft;

    @C09CT("open_edit_tool_type")
    public String openEditToolType;

    @InterfaceC2270908v5
    @InterfaceC2270808v4
    @C09CT("pip_resource_paths")
    @C0MY0(blockCreative = true)
    public List<String> pipResourcePaths;

    @C09CT("pip_slot_uuids")
    public List<String> pipSlotUuidList;

    @C09CT("real_origin")
    public Integer realOrigin;

    @C09CT("remove_filler_words_clips_status")
    public int removeFillerWordsClips;

    @InterfaceC2270908v5
    @C09CT("retouch_res_list")
    public List<String> retouchResPathList;

    @InterfaceC2270908v5
    @InterfaceC2270808v4
    @C09CT("reverse_origin_paths")
    @C0MY0(blockCreative = true)
    public List<String> reverseOriginPaths;

    @C09CT("show_audio_edit_tip")
    public boolean showAudioEditTip;

    @C09CT("show_multi_music_entrance")
    public boolean showMultiMusicEntrance;

    @C09CT("start_enter_time")
    public Long startEnterTime;

    @InterfaceC2270908v5
    @C09CT("transition_resource_paths")
    public List<String> transitionResourcePaths;

    @C09CT("")
    public Long veFirstFrameTimeStamp;

    @C09CT("video_anim_effect_duration_list")
    public List<Long> videoAnimDurationList;

    @C09CT("video_anim_effect_ids")
    public List<String> videoAnimEffectIds;

    @InterfaceC2270908v5
    @C09CT("video_anim_resource_paths")
    public List<String> videoAnimResourcePaths;

    @C09CT("video_anim_selection_list_str")
    public String videoAnimSelectionListStr;

    @C09CT("video_bg_resource_list")
    public List<EditVideoSegment> videoBgSegments;

    @C09CT("segment_effects")
    public List<EditorProEffectInfo> videoSegmentEffects;

    public EditorProModel() {
        this(false, null, false, false, "", false, 0L, null, null, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), false, false, false, 0, false, false, false, false, 0, false, false, null, true, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), false, -1, -1, "", false, false, null, null, new ArrayList(), null, new ArrayList(), new ArrayList(), new ArrayList(), new LinkedHashMap(), new ArrayList(), new ArrayList(), new ArrayList(), null, null, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null, new ArrayList(), new ConcurrentHashMap(), new ArrayList(), false, false, "", false, -1L, false, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.showAudioEditTip ? 1 : 0);
        parcel.writeString(this.audioEditTipTitle);
        parcel.writeInt(this.showMultiMusicEntrance ? 1 : 0);
        parcel.writeInt(this.hasAudioInAdvanceEdit ? 1 : 0);
        parcel.writeString(this.clickFrom);
        parcel.writeInt(this.captionClickFromEditTab ? 1 : 0);
        parcel.writeLong(this.backFromPublishTimestamp);
        Long l = this.startEnterTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.veFirstFrameTimeStamp;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeInt(this.isFromSystemRestore ? 1 : 0);
        List<EditVideoSegment> list = this.albumUploadVideoSegments;
        parcel.writeInt(list.size());
        Iterator<EditVideoSegment> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeStringList(this.pipResourcePaths);
        parcel.writeStringList(this.pipSlotUuidList);
        parcel.writeStringList(this.reverseOriginPaths);
        parcel.writeInt(this.isAdvancedEditDraft ? 1 : 0);
        parcel.writeInt(this.isAdvancedEdit ? 1 : 0);
        parcel.writeInt(this.hasDraftAgain ? 1 : 0);
        parcel.writeInt(this.editMode);
        parcel.writeInt(this.enableOriginAudio ? 1 : 0);
        parcel.writeInt(this.isPipUsed ? 1 : 0);
        parcel.writeInt(this.isTextMotionUsed ? 1 : 0);
        parcel.writeInt(this.isEditorProRemoveFillerWords ? 1 : 0);
        parcel.writeInt(this.removeFillerWordsClips);
        parcel.writeInt(this.isCaptionMotionUsed ? 1 : 0);
        parcel.writeInt(this.isCaptionMixTrackUsed ? 1 : 0);
        Integer num = this.realOrigin;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.oldEffectDraft ? 1 : 0);
        parcel.writeStringList(this.transitionResourcePaths);
        parcel.writeStringList(this.adjustFilterResourcePaths);
        parcel.writeStringList(this.magicResourcePaths);
        parcel.writeStringList(this.magicVideoPaths);
        parcel.writeStringList(this.magicEffectResourcePaths);
        parcel.writeStringList(this.magicCombineEffectAlgoCachePaths);
        parcel.writeInt(this.fromEditorProEntranceInAlbum ? 1 : 0);
        parcel.writeInt(this.fromAlbumType);
        parcel.writeInt(this.fromEditType);
        parcel.writeString(this.openEditToolType);
        parcel.writeInt(this.fromPhotoCanvas ? 1 : 0);
        parcel.writeInt(this.editorProEntryForceNormalStyle ? 1 : 0);
        List<EditVideoSegment> list2 = this.canvasShootImageSegments;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<EditVideoSegment> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeParcelable(it3.next(), i);
            }
        }
        List<EditVideoSegment> list3 = this.epAIGCVideoSegments;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<EditVideoSegment> it4 = list3.iterator();
            while (it4.hasNext()) {
                parcel.writeParcelable(it4.next(), i);
            }
        }
        List<Long> list4 = this.videoAnimDurationList;
        parcel.writeInt(list4.size());
        Iterator<Long> it5 = list4.iterator();
        while (it5.hasNext()) {
            parcel.writeLong(it5.next().longValue());
        }
        parcel.writeString(this.videoAnimSelectionListStr);
        parcel.writeStringList(this.videoAnimEffectIds);
        parcel.writeStringList(this.videoAnimResourcePaths);
        List<EditorProEffectInfo> list5 = this.videoSegmentEffects;
        parcel.writeInt(list5.size());
        Iterator<EditorProEffectInfo> it6 = list5.iterator();
        while (it6.hasNext()) {
            it6.next().writeToParcel(parcel, i);
        }
        Map<String, EffectSearchModel> map = this.favoriteEffectSearchInfo;
        parcel.writeInt(map.size());
        for (Map.Entry<String, EffectSearchModel> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeParcelable(entry.getValue(), i);
        }
        List<EditorProEffectInfo> list6 = this.maskEffects;
        parcel.writeInt(list6.size());
        Iterator<EditorProEffectInfo> it7 = list6.iterator();
        while (it7.hasNext()) {
            it7.next().writeToParcel(parcel, i);
        }
        List<EditorProEffectInfo> list7 = this.cutoutStrokeEffects;
        parcel.writeInt(list7.size());
        Iterator<EditorProEffectInfo> it8 = list7.iterator();
        while (it8.hasNext()) {
            it8.next().writeToParcel(parcel, i);
        }
        List<EditorProEffectInfo> list8 = this.chromaEffects;
        parcel.writeInt(list8.size());
        Iterator<EditorProEffectInfo> it9 = list8.iterator();
        while (it9.hasNext()) {
            it9.next().writeToParcel(parcel, i);
        }
        EditorProEffectInfo editorProEffectInfo = this.blendCutoutEffect;
        if (editorProEffectInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            editorProEffectInfo.writeToParcel(parcel, i);
        }
        EditorProEffectInfo editorProEffectInfo2 = this.blendMaskEffect;
        if (editorProEffectInfo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            editorProEffectInfo2.writeToParcel(parcel, i);
        }
        List<EditVideoSegment> list9 = this.videoBgSegments;
        parcel.writeInt(list9.size());
        Iterator<EditVideoSegment> it10 = list9.iterator();
        while (it10.hasNext()) {
            parcel.writeParcelable(it10.next(), i);
        }
        parcel.writeStringList(this.cutoutMaskPathList);
        parcel.writeStringList(this.chromaKeyPathList);
        parcel.writeStringList(this.cutoutBlendResList);
        Boolean bool = this.isOriginalUploadPage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeStringList(this.filterResourcePaths);
        ConcurrentHashMap<String, Effect> concurrentHashMap = this.magicCache;
        parcel.writeInt(concurrentHashMap.size());
        for (Map.Entry<String, Effect> entry2 : concurrentHashMap.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeParcelable(entry2.getValue(), i);
        }
        parcel.writeStringList(this.retouchResPathList);
        parcel.writeInt(this.isVideoCompressed ? 1 : 0);
        parcel.writeInt(this.hasSavedDraftInEPMore ? 1 : 0);
        parcel.writeString(this.actionsViaEPMoreOptions);
        parcel.writeInt(this.isMediaUnchangedAfterEP ? 1 : 0);
        parcel.writeLong(this.clickBackSaveTime);
        parcel.writeInt(this.modelMute ? 1 : 0);
        parcel.writeString(this.editorProPipFilterEnterWay);
    }

    public final String getActionsViaEPMoreOptions() {
        return this.actionsViaEPMoreOptions;
    }

    public final List<String> getAdjustFilterResourcePaths() {
        return this.adjustFilterResourcePaths;
    }

    public final List<EditVideoSegment> getAlbumUploadVideoSegments() {
        return this.albumUploadVideoSegments;
    }

    public final String getAudioEditTipTitle() {
        return this.audioEditTipTitle;
    }

    public final long getBackFromPublishTimestamp() {
        return this.backFromPublishTimestamp;
    }

    public final EditorProEffectInfo getBlendCutoutEffect() {
        return this.blendCutoutEffect;
    }

    public final EditorProEffectInfo getBlendMaskEffect() {
        return this.blendMaskEffect;
    }

    public final List<EditVideoSegment> getCanvasShootImageSegments() {
        return this.canvasShootImageSegments;
    }

    public final boolean getCaptionClickFromEditTab() {
        return this.captionClickFromEditTab;
    }

    public final List<EditorProEffectInfo> getChromaEffects() {
        return this.chromaEffects;
    }

    public final List<String> getChromaKeyPathList() {
        return this.chromaKeyPathList;
    }

    public final long getClickBackSaveTime() {
        return this.clickBackSaveTime;
    }

    public final String getClickFrom() {
        return this.clickFrom;
    }

    public final List<String> getCutoutBlendResList() {
        return this.cutoutBlendResList;
    }

    public final List<String> getCutoutMaskPathList() {
        return this.cutoutMaskPathList;
    }

    public final List<EditorProEffectInfo> getCutoutStrokeEffects() {
        return this.cutoutStrokeEffects;
    }

    public final int getEditMode() {
        return this.editMode;
    }

    public final boolean getEditorProEntryForceNormalStyle() {
        return this.editorProEntryForceNormalStyle;
    }

    public final String getEditorProPipFilterEnterWay() {
        return this.editorProPipFilterEnterWay;
    }

    public final boolean getEnableOriginAudio() {
        return this.enableOriginAudio;
    }

    public final List<EditVideoSegment> getEpAIGCVideoSegments() {
        return this.epAIGCVideoSegments;
    }

    public final Map<String, EffectSearchModel> getFavoriteEffectSearchInfo() {
        return this.favoriteEffectSearchInfo;
    }

    public final List<String> getFilterResourcePaths() {
        return this.filterResourcePaths;
    }

    public final int getFromAlbumType() {
        return this.fromAlbumType;
    }

    public final int getFromEditType() {
        return this.fromEditType;
    }

    public final boolean getFromEditorProEntranceInAlbum() {
        return this.fromEditorProEntranceInAlbum;
    }

    public final boolean getFromPhotoCanvas() {
        return this.fromPhotoCanvas;
    }

    public final boolean getHasAudioInAdvanceEdit() {
        return this.hasAudioInAdvanceEdit;
    }

    public final boolean getHasDraftAgain() {
        return this.hasDraftAgain;
    }

    public final boolean getHasSavedDraftInEPMore() {
        return this.hasSavedDraftInEPMore;
    }

    public final ConcurrentHashMap<String, Effect> getMagicCache() {
        return this.magicCache;
    }

    public final List<String> getMagicCombineEffectAlgoCachePaths() {
        return this.magicCombineEffectAlgoCachePaths;
    }

    public final List<String> getMagicEffectResourcePaths() {
        return this.magicEffectResourcePaths;
    }

    public final List<String> getMagicResourcePaths() {
        return this.magicResourcePaths;
    }

    public final List<String> getMagicVideoPaths() {
        return this.magicVideoPaths;
    }

    public final List<EditorProEffectInfo> getMaskEffects() {
        return this.maskEffects;
    }

    public final boolean getModelMute() {
        return this.modelMute;
    }

    public final boolean getOldEffectDraft() {
        return this.oldEffectDraft;
    }

    public final String getOpenEditToolType() {
        return this.openEditToolType;
    }

    public final List<String> getPipResourcePaths() {
        return this.pipResourcePaths;
    }

    public final List<String> getPipSlotUuidList() {
        return this.pipSlotUuidList;
    }

    public final Integer getRealOrigin() {
        return this.realOrigin;
    }

    public final int getRemoveFillerWordsClips() {
        return this.removeFillerWordsClips;
    }

    public final List<String> getRetouchResPathList() {
        return this.retouchResPathList;
    }

    public final List<String> getReverseOriginPaths() {
        return this.reverseOriginPaths;
    }

    public final boolean getShowAudioEditTip() {
        return this.showAudioEditTip;
    }

    public final boolean getShowMultiMusicEntrance() {
        return this.showMultiMusicEntrance;
    }

    public final Long getStartEnterTime() {
        return this.startEnterTime;
    }

    public final List<String> getTransitionResourcePaths() {
        return this.transitionResourcePaths;
    }

    public final Long getVeFirstFrameTimeStamp() {
        return this.veFirstFrameTimeStamp;
    }

    public final List<Long> getVideoAnimDurationList() {
        return this.videoAnimDurationList;
    }

    public final List<String> getVideoAnimEffectIds() {
        return this.videoAnimEffectIds;
    }

    public final List<String> getVideoAnimResourcePaths() {
        return this.videoAnimResourcePaths;
    }

    public final String getVideoAnimSelectionListStr() {
        return this.videoAnimSelectionListStr;
    }

    public final List<EditVideoSegment> getVideoBgSegments() {
        return this.videoBgSegments;
    }

    public final List<EditorProEffectInfo> getVideoSegmentEffects() {
        return this.videoSegmentEffects;
    }

    public final boolean isAdvancedEdit() {
        return this.isAdvancedEdit;
    }

    public final boolean isAdvancedEditDraft() {
        return this.isAdvancedEditDraft;
    }

    public final boolean isCaptionMixTrackUsed() {
        return this.isCaptionMixTrackUsed;
    }

    public final boolean isCaptionMotionUsed() {
        return this.isCaptionMotionUsed;
    }

    public final boolean isEditorProRemoveFillerWords() {
        return this.isEditorProRemoveFillerWords;
    }

    public final boolean isFromSystemRestore() {
        return this.isFromSystemRestore;
    }

    public final boolean isMediaUnchangedAfterEP() {
        return this.isMediaUnchangedAfterEP;
    }

    public final Boolean isOriginalUploadPage() {
        return this.isOriginalUploadPage;
    }

    public final boolean isPipUsed() {
        return this.isPipUsed;
    }

    public final boolean isTextMotionUsed() {
        return this.isTextMotionUsed;
    }

    public final boolean isVideoCompressed() {
        return this.isVideoCompressed;
    }

    public final void setActionsViaEPMoreOptions(String str) {
        this.actionsViaEPMoreOptions = str;
    }

    public final void setAdjustFilterResourcePaths(List<String> list) {
        this.adjustFilterResourcePaths = list;
    }

    public final void setAdvancedEdit(boolean z) {
        this.isAdvancedEdit = z;
    }

    public final void setAdvancedEditDraft(boolean z) {
        this.isAdvancedEditDraft = z;
    }

    public final void setAlbumUploadVideoSegments(List<EditVideoSegment> list) {
        this.albumUploadVideoSegments = list;
    }

    public final void setAudioEditTipTitle(String str) {
        this.audioEditTipTitle = str;
    }

    public final void setBackFromPublishTimestamp(long j) {
        this.backFromPublishTimestamp = j;
    }

    public final void setBlendCutoutEffect(EditorProEffectInfo editorProEffectInfo) {
        this.blendCutoutEffect = editorProEffectInfo;
    }

    public final void setBlendMaskEffect(EditorProEffectInfo editorProEffectInfo) {
        this.blendMaskEffect = editorProEffectInfo;
    }

    public final void setCanvasShootImageSegments(List<EditVideoSegment> list) {
        this.canvasShootImageSegments = list;
    }

    public final void setCaptionClickFromEditTab(boolean z) {
        this.captionClickFromEditTab = z;
    }

    public final void setCaptionMixTrackUsed(boolean z) {
        this.isCaptionMixTrackUsed = z;
    }

    public final void setCaptionMotionUsed(boolean z) {
        this.isCaptionMotionUsed = z;
    }

    public final void setChromaEffects(List<EditorProEffectInfo> list) {
        this.chromaEffects = list;
    }

    public final void setChromaKeyPathList(List<String> list) {
        this.chromaKeyPathList = list;
    }

    public final void setClickBackSaveTime(long j) {
        this.clickBackSaveTime = j;
    }

    public final void setClickFrom(String str) {
        this.clickFrom = str;
    }

    public final void setCutoutBlendResList(List<String> list) {
        this.cutoutBlendResList = list;
    }

    public final void setCutoutMaskPathList(List<String> list) {
        this.cutoutMaskPathList = list;
    }

    public final void setCutoutStrokeEffects(List<EditorProEffectInfo> list) {
        this.cutoutStrokeEffects = list;
    }

    public final void setEditMode(int i) {
        this.editMode = i;
    }

    public final void setEditorProEntryForceNormalStyle(boolean z) {
        this.editorProEntryForceNormalStyle = z;
    }

    public final void setEditorProPipFilterEnterWay(String str) {
        this.editorProPipFilterEnterWay = str;
    }

    public final void setEditorProRemoveFillerWords(boolean z) {
        this.isEditorProRemoveFillerWords = z;
    }

    public final void setEnableOriginAudio(boolean z) {
        this.enableOriginAudio = z;
    }

    public final void setEpAIGCVideoSegments(List<EditVideoSegment> list) {
        this.epAIGCVideoSegments = list;
    }

    public final void setFavoriteEffectSearchInfo(Map<String, EffectSearchModel> map) {
        this.favoriteEffectSearchInfo = map;
    }

    public final void setFilterResourcePaths(List<String> list) {
        this.filterResourcePaths = list;
    }

    public final void setFromAlbumType(int i) {
        this.fromAlbumType = i;
    }

    public final void setFromEditType(int i) {
        this.fromEditType = i;
    }

    public final void setFromEditorProEntranceInAlbum(boolean z) {
        this.fromEditorProEntranceInAlbum = z;
    }

    public final void setFromPhotoCanvas(boolean z) {
        this.fromPhotoCanvas = z;
    }

    public final void setFromSystemRestore(boolean z) {
        this.isFromSystemRestore = z;
    }

    public final void setHasAudioInAdvanceEdit(boolean z) {
        this.hasAudioInAdvanceEdit = z;
    }

    public final void setHasDraftAgain(boolean z) {
        this.hasDraftAgain = z;
    }

    public final void setHasSavedDraftInEPMore(boolean z) {
        this.hasSavedDraftInEPMore = z;
    }

    public final void setMagicCache(ConcurrentHashMap<String, Effect> concurrentHashMap) {
        this.magicCache = concurrentHashMap;
    }

    public final void setMagicCombineEffectAlgoCachePaths(List<String> list) {
        this.magicCombineEffectAlgoCachePaths = list;
    }

    public final void setMagicEffectResourcePaths(List<String> list) {
        this.magicEffectResourcePaths = list;
    }

    public final void setMagicResourcePaths(List<String> list) {
        this.magicResourcePaths = list;
    }

    public final void setMagicVideoPaths(List<String> list) {
        this.magicVideoPaths = list;
    }

    public final void setMaskEffects(List<EditorProEffectInfo> list) {
        this.maskEffects = list;
    }

    public final void setMediaUnchangedAfterEP(boolean z) {
        this.isMediaUnchangedAfterEP = z;
    }

    public final void setModelMute(boolean z) {
        this.modelMute = z;
    }

    public final void setOldEffectDraft(boolean z) {
        this.oldEffectDraft = z;
    }

    public final void setOpenEditToolType(String str) {
        this.openEditToolType = str;
    }

    public final void setOriginalUploadPage(Boolean bool) {
        this.isOriginalUploadPage = bool;
    }

    public final void setPipResourcePaths(List<String> list) {
        this.pipResourcePaths = list;
    }

    public final void setPipSlotUuidList(List<String> list) {
        this.pipSlotUuidList = list;
    }

    public final void setPipUsed(boolean z) {
        this.isPipUsed = z;
    }

    public final void setRealOrigin(Integer num) {
        this.realOrigin = num;
    }

    public final void setRemoveFillerWordsClips(int i) {
        this.removeFillerWordsClips = i;
    }

    public final void setRetouchResPathList(List<String> list) {
        this.retouchResPathList = list;
    }

    public final void setReverseOriginPaths(List<String> list) {
        this.reverseOriginPaths = list;
    }

    public final void setShowAudioEditTip(boolean z) {
        this.showAudioEditTip = z;
    }

    public final void setShowMultiMusicEntrance(boolean z) {
        this.showMultiMusicEntrance = z;
    }

    public final void setStartEnterTime(Long l) {
        this.startEnterTime = l;
    }

    public final void setTextMotionUsed(boolean z) {
        this.isTextMotionUsed = z;
    }

    public final void setTransitionResourcePaths(List<String> list) {
        this.transitionResourcePaths = list;
    }

    public final void setVeFirstFrameTimeStamp(Long l) {
        this.veFirstFrameTimeStamp = l;
    }

    public final void setVideoAnimDurationList(List<Long> list) {
        this.videoAnimDurationList = list;
    }

    public final void setVideoAnimEffectIds(List<String> list) {
        this.videoAnimEffectIds = list;
    }

    public final void setVideoAnimResourcePaths(List<String> list) {
        this.videoAnimResourcePaths = list;
    }

    public final void setVideoAnimSelectionListStr(String str) {
        this.videoAnimSelectionListStr = str;
    }

    public final void setVideoBgSegments(List<EditVideoSegment> list) {
        this.videoBgSegments = list;
    }

    public final void setVideoCompressed(boolean z) {
        this.isVideoCompressed = z;
    }

    public final void setVideoSegmentEffects(List<EditorProEffectInfo> list) {
        this.videoSegmentEffects = list;
    }

    public EditorProModel(boolean z, String str, boolean z2, boolean z3, String str2, boolean z4, long j, Long l, Long l2, boolean z5, List<EditVideoSegment> list, List<String> list2, List<String> list3, List<String> list4, boolean z6, boolean z7, boolean z8, int i, boolean z9, boolean z10, boolean z11, boolean z12, int i2, boolean z13, boolean z14, Integer num, boolean z15, List<String> list5, List<String> list6, List<String> list7, List<String> list8, List<String> list9, List<String> list10, boolean z16, int i3, int i4, String str3, boolean z17, boolean z18, List<EditVideoSegment> list11, List<EditVideoSegment> list12, List<Long> list13, String str4, List<String> list14, List<String> list15, List<EditorProEffectInfo> list16, Map<String, EffectSearchModel> map, List<EditorProEffectInfo> list17, List<EditorProEffectInfo> list18, List<EditorProEffectInfo> list19, EditorProEffectInfo editorProEffectInfo, EditorProEffectInfo editorProEffectInfo2, List<EditVideoSegment> list20, List<String> list21, List<String> list22, List<String> list23, Boolean bool, List<String> list24, ConcurrentHashMap<String, Effect> concurrentHashMap, List<String> list25, boolean z19, boolean z20, String str5, boolean z21, long j2, boolean z22, String str6) {
        this.showAudioEditTip = z;
        this.audioEditTipTitle = str;
        this.showMultiMusicEntrance = z2;
        this.hasAudioInAdvanceEdit = z3;
        this.clickFrom = str2;
        this.captionClickFromEditTab = z4;
        this.backFromPublishTimestamp = j;
        this.startEnterTime = l;
        this.veFirstFrameTimeStamp = l2;
        this.isFromSystemRestore = z5;
        this.albumUploadVideoSegments = list;
        this.pipResourcePaths = list2;
        this.pipSlotUuidList = list3;
        this.reverseOriginPaths = list4;
        this.isAdvancedEditDraft = z6;
        this.isAdvancedEdit = z7;
        this.hasDraftAgain = z8;
        this.editMode = i;
        this.enableOriginAudio = z9;
        this.isPipUsed = z10;
        this.isTextMotionUsed = z11;
        this.isEditorProRemoveFillerWords = z12;
        this.removeFillerWordsClips = i2;
        this.isCaptionMotionUsed = z13;
        this.isCaptionMixTrackUsed = z14;
        this.realOrigin = num;
        this.oldEffectDraft = z15;
        this.transitionResourcePaths = list5;
        this.adjustFilterResourcePaths = list6;
        this.magicResourcePaths = list7;
        this.magicVideoPaths = list8;
        this.magicEffectResourcePaths = list9;
        this.magicCombineEffectAlgoCachePaths = list10;
        this.fromEditorProEntranceInAlbum = z16;
        this.fromAlbumType = i3;
        this.fromEditType = i4;
        this.openEditToolType = str3;
        this.fromPhotoCanvas = z17;
        this.editorProEntryForceNormalStyle = z18;
        this.canvasShootImageSegments = list11;
        this.epAIGCVideoSegments = list12;
        this.videoAnimDurationList = list13;
        this.videoAnimSelectionListStr = str4;
        this.videoAnimEffectIds = list14;
        this.videoAnimResourcePaths = list15;
        this.videoSegmentEffects = list16;
        this.favoriteEffectSearchInfo = map;
        this.maskEffects = list17;
        this.cutoutStrokeEffects = list18;
        this.chromaEffects = list19;
        this.blendCutoutEffect = editorProEffectInfo;
        this.blendMaskEffect = editorProEffectInfo2;
        this.videoBgSegments = list20;
        this.cutoutMaskPathList = list21;
        this.chromaKeyPathList = list22;
        this.cutoutBlendResList = list23;
        this.isOriginalUploadPage = bool;
        this.filterResourcePaths = list24;
        this.magicCache = concurrentHashMap;
        this.retouchResPathList = list25;
        this.isVideoCompressed = z19;
        this.hasSavedDraftInEPMore = z20;
        this.actionsViaEPMoreOptions = str5;
        this.isMediaUnchangedAfterEP = z21;
        this.clickBackSaveTime = j2;
        this.modelMute = z22;
        this.editorProPipFilterEnterWay = str6;
    }
}
