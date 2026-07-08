package com.ss.android.ugc.aweme.draft.model;

import X.C08IE;
import X.C09CT;
import X.C0AFU;
import X.C0MJ9;
import X.C13LP;
import X.C2188811AlT;
import X.C258600ABm;
import X.C295990Biv;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class AwemeDraft {
    public CreativeModel LIZ;
    public boolean LIZIZ;
    public transient int LIZJ;
    public String LIZLLL;
    public AVMusic LJ;
    public boolean LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public String LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public int LJIJI;
    public final transient C08IE<String, String> LJIJJ;
    public String LJIJJLI;
    public int LJIL;
    public int LJJ;
    public long LJJI;
    public int LJJIFFI;
    public EffectListModel LJJII;
    public long LJJIII;
    public int LJJIIJ;
    public String LJJIIJZLJL;
    public String LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public String LJJIJIIJI;
    public String LJJIJIIJIL;
    public final float[] LJJIJIL;
    public String LJJIJL;
    public int LJJIJLIJ;
    public float LJJIL;
    public String LJJIZ;
    public String LJJJ;
    public boolean LJJJI;
    public long LJJJIL;
    public String LJJJJ;
    public boolean LJJJJI;
    public AVDraftExtras LJJJJIZL;

    @C09CT("aweme")
    public AVDraftAwemeCompat aweme;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public int id;

    @C09CT("time")
    public long lastEditTime;

    @C09CT("save_time")
    public long saveTime;

    /* JADX WARN: Multi-variable type inference failed */
    public AwemeDraft() {
        int i = -1;
        Object[] objArr = null == true ? 1 : 0;
        Object[] objArr2 = null == true ? 1 : 0;
        Object[] objArr3 = null == true ? 1 : 0;
        Object[] objArr4 = null == true ? 1 : 0;
        Object[] objArr5 = null == true ? 1 : 0;
        Object[] objArr6 = null == true ? 1 : 0;
        Object[] objArr7 = null == true ? 1 : 0;
        Object[] objArr8 = null == true ? 1 : 0;
        Object[] objArr9 = null == true ? 1 : 0;
        Object[] objArr10 = null == true ? 1 : 0;
        Object[] objArr11 = null == true ? 1 : 0;
        Object[] objArr12 = null == true ? 1 : 0;
        Object[] objArr13 = null == true ? 1 : 0;
        Object[] objArr14 = null == true ? 1 : 0;
        Object[] objArr15 = null == true ? 1 : 0;
        Object[] objArr16 = null == true ? 1 : 0;
        Object[] objArr17 = null == true ? 1 : 0;
        Object[] objArr18 = null == true ? 1 : 0;
        Object[] objArr19 = null == true ? 1 : 0;
        Object[] objArr20 = null == true ? 1 : 0;
        Object[] objArr21 = null == true ? 1 : 0;
        Object[] objArr22 = null == true ? 1 : 0;
        Object[] objArr23 = null == true ? 1 : 0;
        Object[] objArr24 = null == true ? 1 : 0;
        Object[] objArr25 = null == true ? 1 : 0;
        Object[] objArr26 = null == true ? 1 : 0;
        Object[] objArr27 = null == true ? 1 : 0;
        Object[] objArr28 = null == true ? 1 : 0;
        Object[] objArr29 = null == true ? 1 : 0;
        Object[] objArr30 = null == true ? 1 : 0;
        Object[] objArr31 = null == true ? 1 : 0;
        Object[] objArr32 = null == true ? 1 : 0;
        Object[] objArr33 = null == true ? 1 : 0;
        Object[] objArr34 = null == true ? 1 : 0;
        Object[] objArr35 = null == true ? 1 : 0;
        Object[] objArr36 = null == true ? 1 : 0;
        Object[] objArr37 = null == true ? 1 : 0;
        Object[] objArr38 = null == true ? 1 : 0;
        Object[] objArr39 = null == true ? 1 : 0;
        Object[] objArr40 = null == true ? 1 : 0;
        Object[] objArr41 = null == true ? 1 : 0;
        Object[] objArr42 = null == true ? 1 : 0;
        Object[] objArr43 = null == true ? 1 : 0;
        Object[] objArr44 = null == true ? 1 : 0;
        Object[] objArr45 = null == true ? 1 : 0;
        Object[] objArr46 = null == true ? 1 : 0;
        Object[] objArr47 = null == true ? 1 : 0;
        Object[] objArr48 = null == true ? 1 : 0;
        Object[] objArr49 = null == true ? 1 : 0;
        Object[] objArr50 = null == true ? 1 : 0;
        Object[] objArr51 = null == true ? 1 : 0;
        Object[] objArr52 = null == true ? 1 : 0;
        Object[] objArr53 = null == true ? 1 : 0;
        Object[] objArr54 = null == true ? 1 : 0;
        Object[] objArr55 = null == true ? 1 : 0;
        Object[] objArr56 = null == true ? 1 : 0;
        Object[] objArr57 = null == true ? 1 : 0;
        Object[] objArr58 = null == true ? 1 : 0;
        Object[] objArr59 = null == true ? 1 : 0;
        Object[] objArr60 = null == true ? 1 : 0;
        Object[] objArr61 = null == true ? 1 : 0;
        Object[] objArr62 = null == true ? 1 : 0;
        Object[] objArr63 = null == true ? 1 : 0;
        Object[] objArr64 = null == true ? 1 : 0;
        Object[] objArr65 = null == true ? 1 : 0;
        Object[] objArr66 = null == true ? 1 : 0;
        Object[] objArr67 = null == true ? 1 : 0;
        Object[] objArr68 = null == true ? 1 : 0;
        Object[] objArr69 = null == true ? 1 : 0;
        Object[] objArr70 = null == true ? 1 : 0;
        Object[] objArr71 = null == true ? 1 : 0;
        Object[] objArr72 = null == true ? 1 : 0;
        Object[] objArr73 = null == true ? 1 : 0;
        Object[] objArr74 = null == true ? 1 : 0;
        Object[] objArr75 = null == true ? 1 : 0;
        Object[] objArr76 = null == true ? 1 : 0;
        Object[] objArr77 = null == true ? 1 : 0;
        Object[] objArr78 = null == true ? 1 : 0;
        Object[] objArr79 = null == true ? 1 : 0;
        Object[] objArr80 = null == true ? 1 : 0;
        Object[] objArr81 = null == true ? 1 : 0;
        Object[] objArr82 = null == true ? 1 : 0;
        Object[] objArr83 = null == true ? 1 : 0;
        Object[] objArr84 = null == true ? 1 : 0;
        Object[] objArr85 = null == true ? 1 : 0;
        Object[] objArr86 = null == true ? 1 : 0;
        Object[] objArr87 = null == true ? 1 : 0;
        Object[] objArr88 = null == true ? 1 : 0;
        Object[] objArr89 = null == true ? 1 : 0;
        Object[] objArr90 = null == true ? 1 : 0;
        Object[] objArr91 = null == true ? 1 : 0;
        Object[] objArr92 = null == true ? 1 : 0;
        Object[] objArr93 = null == true ? 1 : 0;
        Object[] objArr94 = null == true ? 1 : 0;
        Object[] objArr95 = null == true ? 1 : 0;
        Object[] objArr96 = null == true ? 1 : 0;
        Object[] objArr97 = null == true ? 1 : 0;
        Object[] objArr98 = null == true ? 1 : 0;
        Object[] objArr99 = null == true ? 1 : 0;
        Object[] objArr100 = null == true ? 1 : 0;
        Object[] objArr101 = null == true ? 1 : 0;
        Object[] objArr102 = null == true ? 1 : 0;
        Object[] objArr103 = null == true ? 1 : 0;
        Object[] objArr104 = null == true ? 1 : 0;
        Object[] objArr105 = null == true ? 1 : 0;
        Object[] objArr106 = null == true ? 1 : 0;
        Object[] objArr107 = null == true ? 1 : 0;
        Object[] objArr108 = null == true ? 1 : 0;
        Object[] objArr109 = null == true ? 1 : 0;
        Object[] objArr110 = null == true ? 1 : 0;
        Object[] objArr111 = null == true ? 1 : 0;
        Object[] objArr112 = null == true ? 1 : 0;
        Object[] objArr113 = null == true ? 1 : 0;
        Object[] objArr114 = null == true ? 1 : 0;
        Object[] objArr115 = null == true ? 1 : 0;
        Object[] objArr116 = null == true ? 1 : 0;
        Object[] objArr117 = null == true ? 1 : 0;
        Object[] objArr118 = null == true ? 1 : 0;
        Object[] objArr119 = null == true ? 1 : 0;
        Object[] objArr120 = null == true ? 1 : 0;
        Object[] objArr121 = null == true ? 1 : 0;
        Object[] objArr122 = null == true ? 1 : 0;
        Object[] objArr123 = null == true ? 1 : 0;
        Object[] objArr124 = null == true ? 1 : 0;
        Object[] objArr125 = null == true ? 1 : 0;
        Object[] objArr126 = null == true ? 1 : 0;
        Object[] objArr127 = null == true ? 1 : 0;
        Object[] objArr128 = null == true ? 1 : 0;
        Object[] objArr129 = null == true ? 1 : 0;
        Object[] objArr130 = null == true ? 1 : 0;
        Object[] objArr131 = null == true ? 1 : 0;
        Object[] objArr132 = null == true ? 1 : 0;
        Object[] objArr133 = null == true ? 1 : 0;
        Object[] objArr134 = null == true ? 1 : 0;
        Object[] objArr135 = null == true ? 1 : 0;
        Object[] objArr136 = null == true ? 1 : 0;
        Object[] objArr137 = null == true ? 1 : 0;
        Object[] objArr138 = null == true ? 1 : 0;
        Object[] objArr139 = null == true ? 1 : 0;
        Object[] objArr140 = null == true ? 1 : 0;
        Object[] objArr141 = null == true ? 1 : 0;
        Object[] objArr142 = null == true ? 1 : 0;
        Object[] objArr143 = null == true ? 1 : 0;
        Object[] objArr144 = null == true ? 1 : 0;
        Object[] objArr145 = null == true ? 1 : 0;
        Object[] objArr146 = null == true ? 1 : 0;
        Object[] objArr147 = null == true ? 1 : 0;
        Object[] objArr148 = null == true ? 1 : 0;
        Object[] objArr149 = null == true ? 1 : 0;
        Object[] objArr150 = null == true ? 1 : 0;
        Object[] objArr151 = null == true ? 1 : 0;
        Object[] objArr152 = null == true ? 1 : 0;
        Object[] objArr153 = null == true ? 1 : 0;
        Object[] objArr154 = null == true ? 1 : 0;
        Object[] objArr155 = null == true ? 1 : 0;
        Object[] objArr156 = null == true ? 1 : 0;
        Object[] objArr157 = null == true ? 1 : 0;
        Object[] objArr158 = null == true ? 1 : 0;
        Object[] objArr159 = null == true ? 1 : 0;
        Object[] objArr160 = null == true ? 1 : 0;
        Object[] objArr161 = null == true ? 1 : 0;
        Object[] objArr162 = null == true ? 1 : 0;
        Object[] objArr163 = null == true ? 1 : 0;
        Object[] objArr164 = null == true ? 1 : 0;
        Object[] objArr165 = null == true ? 1 : 0;
        Object[] objArr166 = null == true ? 1 : 0;
        Object[] objArr167 = null == true ? 1 : 0;
        Object[] objArr168 = null == true ? 1 : 0;
        Object[] objArr169 = null == true ? 1 : 0;
        Object[] objArr170 = null == true ? 1 : 0;
        Object[] objArr171 = null == true ? 1 : 0;
        Object[] objArr172 = null == true ? 1 : 0;
        Object[] objArr173 = null == true ? 1 : 0;
        Object[] objArr174 = null == true ? 1 : 0;
        Object[] objArr175 = null == true ? 1 : 0;
        Object[] objArr176 = null == true ? 1 : 0;
        Object[] objArr177 = null == true ? 1 : 0;
        Object[] objArr178 = null == true ? 1 : 0;
        Object[] objArr179 = null == true ? 1 : 0;
        Object[] objArr180 = null == true ? 1 : 0;
        Object[] objArr181 = null == true ? 1 : 0;
        Object[] objArr182 = null == true ? 1 : 0;
        Object[] objArr183 = null == true ? 1 : 0;
        Object[] objArr184 = null == true ? 1 : 0;
        Object[] objArr185 = null == true ? 1 : 0;
        Object[] objArr186 = null == true ? 1 : 0;
        Object[] objArr187 = null == true ? 1 : 0;
        Object[] objArr188 = null == true ? 1 : 0;
        Object[] objArr189 = null == true ? 1 : 0;
        Object[] objArr190 = null == true ? 1 : 0;
        Object[] objArr191 = null == true ? 1 : 0;
        Object[] objArr192 = null == true ? 1 : 0;
        Object[] objArr193 = null == true ? 1 : 0;
        Object[] objArr194 = null == true ? 1 : 0;
        Object[] objArr195 = null == true ? 1 : 0;
        Object[] objArr196 = null == true ? 1 : 0;
        Object[] objArr197 = null == true ? 1 : 0;
        Object[] objArr198 = null == true ? 1 : 0;
        Object[] objArr199 = null == true ? 1 : 0;
        Object[] objArr200 = null == true ? 1 : 0;
        Object[] objArr201 = null == true ? 1 : 0;
        Object[] objArr202 = null == true ? 1 : 0;
        Object[] objArr203 = null == true ? 1 : 0;
        Object[] objArr204 = null == true ? 1 : 0;
        Object[] objArr205 = null == true ? 1 : 0;
        Object[] objArr206 = null == true ? 1 : 0;
        Object[] objArr207 = null == true ? 1 : 0;
        this.LIZ = new CreativeModel(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, objArr27, objArr28, objArr29, objArr30, objArr31, objArr32, objArr33, objArr34, objArr35, objArr36, objArr37, objArr38, objArr39, 0, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, objArr46, objArr47, objArr48, objArr49, objArr50, objArr51, objArr52, objArr53, null == true ? 1 : 0, objArr54, objArr55, objArr56, objArr57, objArr58, objArr59, objArr60, objArr61, objArr62, objArr63, objArr64, objArr65, objArr66, objArr67, objArr68, objArr69, objArr70, objArr71, objArr72, objArr73, objArr74, objArr75, objArr76, objArr77, objArr78, objArr79, objArr80, objArr81, objArr82, objArr83, objArr84, objArr85, objArr86, objArr87, objArr88, objArr89, null == true ? 1 : 0, objArr90, objArr91, objArr92, objArr93, objArr94, objArr95, objArr96, objArr97, objArr98, objArr99, objArr100, objArr101, objArr102, objArr103, objArr104, objArr105, objArr106, objArr107, objArr108, objArr109, objArr110, objArr111, objArr112, objArr113, objArr114, objArr115, objArr116, objArr117, objArr118, objArr119, objArr120, objArr121, objArr122, objArr123, objArr124, objArr125, objArr126, objArr127, objArr128, objArr129, objArr130, objArr131, objArr132, objArr133, objArr134, objArr135, objArr136, objArr137, objArr138, objArr139, objArr140, objArr141, objArr142, objArr143, objArr144, objArr145, objArr146, objArr147, objArr148, objArr149, objArr150, objArr151, objArr152, objArr153, objArr154, objArr155, objArr156, objArr157, objArr158, objArr159, objArr160, objArr161, objArr162, objArr163, objArr164, objArr165, objArr166, objArr167, objArr168, objArr169, objArr170, objArr171, objArr172, objArr173, objArr174, objArr175, objArr176, objArr177, objArr178, objArr179, objArr180, objArr181, objArr182, null == true ? 1 : 0, null == true ? 1 : 0, objArr183, null == true ? 1 : 0, objArr184, objArr185, objArr186, objArr187, objArr188, objArr189, objArr190, objArr191, objArr192, objArr193, objArr194, objArr195, objArr196, objArr197, objArr198, objArr199, objArr200, objArr201, objArr202, objArr203, objArr204, objArr205, objArr206, i, i, i, i, i, i, 2097151, objArr207);
        this.LIZJ = -1;
        this.LJFF = true;
        this.LJIJJ = new C08IE<>();
        this.LJJIJIL = new float[0];
        this.LJJJJIZL = new AVDraftExtras(0, 3, UUID.randomUUID().toString(), null, "", 0, "", false, false, 0, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 1, null, null, null, null, null, false, "720*1280", null, null, null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, null, null, false, null, null, null, null, null, 0, 0, -1.0f, "", 0, false, true, null, false, null, null, null, null, true, false, 0, 0, null, 0, null, false, null, null, false, false, null, null, 0, false, false, null, null, null, false, null, null, false, false, false, 0, -1.0f, null, null, null, -1, 0, null, new DuetExtraInfo("", "", 0, 0, "", 0), 0, null, null, null, new LoudnessBalanceParam(0.0d, 0.0d, 0.0d), "", null, 0L, null, "", "", new AudioEnhanceParam(false, false, false, false), false, false, null, false, null, null, false, "", "", null, 0L, "", 0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CreativeInfo LIZIZ() {
        AVDraftExtras aVDraftExtras = this.LJJJJIZL;
        if (aVDraftExtras.creativeInfo == null) {
            aVDraftExtras.creativeInfo = new CreativeInfo(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }
        return this.LJJJJIZL.creativeInfo;
    }

    public final String LIZJ() {
        if (TextUtils.isEmpty(this.LIZLLL)) {
            this.LIZLLL = LIZ();
        }
        return this.LIZLLL;
    }

    public final DraftVEAudioEffectParam LIZLLL() {
        AVDraftExtras aVDraftExtras = this.LJJJJIZL;
        if (aVDraftExtras != null) {
            return aVDraftExtras.draftVEAudioEffectParam;
        }
        return null;
    }

    public final List<EffectPointModel> LJ() {
        return this.LIZ.editEffectModel.effectList;
    }

    public final InfoStickerModel LJFF() {
        AVDraftExtras aVDraftExtras = this.LJJJJIZL;
        if (aVDraftExtras != null) {
            return aVDraftExtras.infoStickerModel;
        }
        return null;
    }

    public final String LJI() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.LJJJJIZL.multiEditVideoData;
        if (multiEditVideoStatusRecordData == null) {
            return null;
        }
        return multiEditVideoStatusRecordData.coverImagePath;
    }

    public final String LJII() {
        CreativeModel creativeModel = this.LIZ;
        return creativeModel.migrateModel.isEditModelPartitionPhase1Draft ? creativeModel.recordData.videoSegmentsDesc : this.LJJIIZ;
    }

    public final boolean LJIIIIZZ() {
        int i;
        AutoCutModel autoCutModel = this.LIZ.autoCutModel;
        return autoCutModel.curIndexFromSource >= 0 && (i = autoCutModel.curSource) >= 0 && i < C0MJ9.values().length;
    }

    public final boolean LJIIIZ() {
        return this.LJJJJIZL.canvasVideoData != null;
    }

    public final boolean LJIIJ() {
        if (this.LIZ.storyModel.isStoryEntrance()) {
            return true;
        }
        AVDraftExtras aVDraftExtras = this.LJJJJIZL;
        if (aVDraftExtras.shootMode == 20 || Intrinsics.LJFF(aVDraftExtras.shootWay, "story") || Intrinsics.LJFF(this.LJJJJIZL.shootWay, "ai_livephoto_anchor") || this.LIZ.commonMobModel.isFromIMShareToStory) {
            return true;
        }
        if (Intrinsics.LJFF(this.LJJJJIZL.shootWay, "general_search") && Intrinsics.LJFF(this.LIZ.eventData.shootEnterMethod, "ai_livephoto_search_card")) {
            return true;
        }
        return Intrinsics.LJFF(this.LJJJJIZL.shootWay, "notification_page") && Intrinsics.LJFF(this.LIZ.eventData.shootEnterMethod, "ai_livephoto_inbox_banner");
    }

    public final boolean LJIIJJI() {
        return this.LIZ.pugcTemplateData.isFromCreateTemplate;
    }

    public final boolean LJIIL() {
        AVDraftExtras aVDraftExtras = this.LJJJJIZL;
        return aVDraftExtras.imageAlbumData != null && aVDraftExtras.creationMode == 2;
    }

    public final boolean LJIILL() {
        return this.LJJJJIZL.lighteningExtraInfo != null;
    }

    public final boolean LJIILLIIL() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.LJJJJIZL.multiEditVideoData;
        return multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.isSupportMultiEdit;
    }

    public final boolean LJIIZILJ() {
        return this.LJJJJIZL.mvCreateVideoData != null;
    }

    public final boolean LJIJ() {
        return this.LJJJJIZL.creationMode == 3;
    }

    public final String toString() {
        String strLIZIZ;
        StringBuilder sb = new StringBuilder("AwemeDraft{id=");
        sb.append(this.id);
        sb.append("creationId=");
        sb.append(LIZ());
        sb.append("previewInfo=");
        EditPreviewInfo editPreviewInfo = this.LJJJJIZL.previewInfo;
        if (editPreviewInfo == null) {
            strLIZIZ = null;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(editPreviewInfo.getVideoList().size());
            sbLIZ.append("][videoFileInfo:");
            sbLIZ.append(C13LP.LJJLIIIJ(editPreviewInfo.getVideoList(), null, null, null, 0, null, AFwS239S0000000_8.get$arr$(165), 31));
            sbLIZ.append("][videoCutInfo:");
            sbLIZ.append(C13LP.LJJLIIIJ(editPreviewInfo.getVideoList(), null, null, null, 0, null, AFwS239S0000000_8.get$arr$(166), 31));
            sbLIZ.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        sb.append(strLIZIZ);
        sb.append(", aweme=");
        sb.append(this.aweme);
        sb.append(", musicModel=");
        sb.append(this.LJ);
        sb.append(", videoPath='");
        sb.append(this.LJI);
        sb.append("', musicPath='");
        sb.append(this.LJII);
        sb.append("', voicePath='");
        sb.append(this.LJIIIIZZ);
        sb.append("', videoVolume=");
        sb.append(this.LJIIIZ);
        sb.append(", musicVolume=");
        sb.append(this.LJIIJ);
        sb.append(", filter=");
        sb.append(this.LJIILIIL);
        sb.append(", musicStart=");
        sb.append(this.LJIILJJIL);
        sb.append(", effect=");
        sb.append(this.LJIILL);
        sb.append(", origin=");
        sb.append(this.LJIILLIIL);
        sb.append(", mReversePath='");
        sb.append(this.LJIIZILJ);
        sb.append("', videoSpeed='");
        sb.append(this.LJIJ);
        sb.append("', fiterLabel='");
        sb.append(this.LJIJJLI);
        sb.append("', cameraPos=");
        sb.append(this.LJIL);
        sb.append(", useBeauty=");
        sb.append(this.LJJ);
        sb.append(", type=0, isWidthDivider=false, privateVideo=");
        sb.append(this.LJJIFFI);
        sb.append(", mEffectListModel=");
        sb.append(this.LJJII);
        sb.append(", maxDuration=");
        sb.append(this.LJJIII);
        sb.append(", faceBeauty=");
        sb.append(this.LJJIIJ);
        sb.append(", userId='");
        sb.append(this.LJJIIJZLJL);
        sb.append("', time=");
        sb.append(this.lastEditTime);
        sb.append(", videoSegmentsDesc='");
        sb.append(LJII());
        sb.append("', hardEncode=");
        sb.append(this.LJJIIZI);
        sb.append(", specialPoints=");
        sb.append(this.LJJIJ);
        sb.append(", stickerPath='");
        sb.append(this.LJJIJIIJI);
        sb.append("', stickerID='");
        sb.append(this.LJJIJIIJIL);
        sb.append("', volumeTaps=");
        sb.append(Arrays.toString(this.LJJIJIL));
        sb.append(", musicEffectSegments='");
        sb.append(this.LJJIJL);
        sb.append("', newVersion=");
        sb.append(this.LJJIJLIJ);
        sb.append(", customCoverStart=");
        sb.append(this.LJJIL);
        sb.append(", duetFrom='");
        sb.append(this.LJJIZ);
        sb.append("', syncPlatforms='");
        sb.append(this.LJJJ);
        sb.append("', from='0', extras=");
        sb.append(this.LJJJJIZL);
        sb.append('}');
        return sb.toString();
    }

    public final String LIZ() {
        return LIZIZ().getCreationId();
    }

    public final boolean LJIILIIL() {
        ImageAlbumData imageAlbumData;
        LivePhotoModel livePhotoModel;
        CreativeFlowData creativeFlowData;
        EditorProModel editorProModel;
        String str;
        LivePhotoModel livePhotoModel2;
        ImageAlbumData imageAlbumData2;
        if (!LJIIL() || (((imageAlbumData = this.LJJJJIZL.imageAlbumData) != null && imageAlbumData.isTextModeWhenInit()) || (((livePhotoModel = this.LIZ.livePhotoModel) != null && livePhotoModel.previewMode == LivePhotoPreviewMode.STATIC && (!((Boolean) C258600ABm.LIZ.getValue()).booleanValue() || ((livePhotoModel2 = this.LIZ.livePhotoModel) != null && livePhotoModel2.previewMode == LivePhotoPreviewMode.STATIC && (imageAlbumData2 = this.LJJJJIZL.imageAlbumData) != null && imageAlbumData2.isCanvasConverted()))) || this.LIZ.aiLivePhotoModel.LJI() || !(!((Boolean) C0AFU.LIZ.getValue()).booleanValue() || (str = this.LIZ.editorProDraftModel.nleData) == null || a0.LJJJIL(str))))) {
            return false;
        }
        return !C295990Biv.LIZ() || (creativeFlowData = this.LJJJJIZL.creativeFlowData) == null || (editorProModel = creativeFlowData.getEditorProModel()) == null || !editorProModel.isAdvancedEditDraft();
    }

    public static boolean LJIILJJIL(float f) {
        double d = f;
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return false;
        }
        return true;
    }

    public final void LJIJI(CreativeInfo creativeInfo) {
        this.LJJJJIZL.creationId = creativeInfo.getCreationId();
        this.LJJJJIZL.creativeInfo = creativeInfo;
    }

    public final void LJIJJ(String str) {
        this.LJIIJJI = str;
        this.LIZ.nleInfoModel.nleDataChange = true;
    }
}
