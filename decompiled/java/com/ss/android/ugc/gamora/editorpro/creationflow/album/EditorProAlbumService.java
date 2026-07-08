package com.ss.android.ugc.gamora.editorpro.creationflow.album;

import X.C0E48;
import X.C0E6K;
import X.C0EWZ;
import X.C0L91;
import X.C0LGY;
import X.C0LGZ;
import X.C0LJN;
import X.C0LJP;
import X.C0LJQ;
import X.C13LP;
import X.C1403010mc7;
import X.C1416310mxZ;
import X.C1428470nHB;
import X.C1533950q1J;
import X.C19EG;
import X.C2188811AlT;
import X.C350870DpF;
import X.C351220Dpo;
import X.C352310DrZ;
import X.C356530DyN;
import X.C523800KgU;
import X.C537520L6g;
import X.C566050MHz;
import X.C703302op;
import X.C786410Ut5;
import X.InterfaceC540100LGe;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.EditorProRecordVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.components.base.api.IAlbumService;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: loaded from: classes9.dex */
public class EditorProAlbumService implements IAlbumService {
    public static final int $stable = 0;

    @Override // com.ss.ugc.android.editor.components.base.api.IAlbumService
    public int getResultCode() {
        return 1024;
    }

    private final int calculatePipMaxRecordDuration(C0E48 c0e48) {
        int iLIZ = C352310DrZ.LIZ(c0e48.Rn().getMaxEnd());
        int iJh = (int) c0e48.getPlayer().Jh();
        if (iJh >= 0 && iJh <= iLIZ) {
            return iLIZ - iJh;
        }
        return 0;
    }

    private final boolean shouldHideRecordEntrance(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        boolean zLIZ = C0EWZ.LIZ(C350870DpF.LJI(c0e48), videoPublishEditModel.getEditorProModel());
        if (videoPublishEditModel.getShootMode() == 16 && !zLIZ && !C1533950q1J.LJ(C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, true))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IAlbumService
    public List<EditMedia> parseIntentData(C19EG c19eg, Intent intent, Integer num) {
        ArrayList<MediaModel> parcelableArrayListExtra;
        if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) == null || parcelableArrayListExtra.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : parcelableArrayListExtra) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.W3().getPath());
            sbLIZ.append(File.separator);
            sbLIZ.append(mediaModel.relativePath);
            sbLIZ.append(mediaModel.fileName);
            arrayList.add(new EditMedia(mediaModel.LJFF(), mediaModel.LJIILJJIL(), C2188811AlT.LIZIZ(sbLIZ), null, Long.valueOf(mediaModel.startTime), Long.valueOf(mediaModel.endTime), mediaModel.aigcInfo, Boolean.FALSE, mediaModel.mimeType));
        }
        return arrayList;
    }

    private final EditorProRecordVideoContext generateEditorProRecordVideoContext(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, Integer num, boolean z) {
        NLETrack next;
        NLETrackSlot nLETrackSlot;
        NLEResourceNode resource;
        String resourceFile;
        long startTime;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        int musicDuration;
        EditorProRecordVideoContext editorProRecordVideoContext = new EditorProRecordVideoContext(videoPublishEditModel.getCreativeInfo());
        CreativeModel creativeModelLIZIZ = CreativeModel.LIZIZ(videoPublishEditModel.creativeModel, null, null, null, null, -1, -1, -1, 2097151);
        editorProRecordVideoContext.creativeModel = creativeModelLIZIZ;
        editorProRecordVideoContext.isPip = z;
        editorProRecordVideoContext.shootWay = videoPublishEditModel.mShootWay;
        creativeModelLIZIZ.editorProSchemeModel = new EditorProSchemeModel(null, null, false, null);
        if (z) {
            editorProRecordVideoContext.disableBGM = true;
            editorProRecordVideoContext.maxDuration = calculatePipMaxRecordDuration(c0e48);
            return editorProRecordVideoContext;
        }
        VecNLETrackSPtr tracks = C350870DpF.LJI(c0e48).getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C351220Dpo.LLILLL(next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack = next;
            if (nLETrack != null) {
                VecNLETrackSlotSPtr sortedSlots = nLETrack.getSortedSlots();
                if (sortedSlots != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots)) != null) {
                    long endTime = nLETrackSlot.getEndTime();
                    long maxEnd = c0e48.Rn().getMaxEnd();
                    if (endTime != -2 && nLETrack.getEndTime() != -2 && Math.abs(maxEnd - endTime) > TimeUnit.MILLISECONDS.toMicros(60L)) {
                        editorProRecordVideoContext.disableBGM = true;
                        return editorProRecordVideoContext;
                    }
                    NLESegment nLESegment = (NLESegment) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
                    if (nLESegment != null && (resource = nLESegment.getResource()) != null && (resourceFile = resource.getResourceFile()) != null) {
                        NLETrack nLETrackRn = c0e48.Rn();
                        if (num != null && num.intValue() >= 0 && num.intValue() <= nLETrackRn.getSlots().size()) {
                            if (num.intValue() == nLETrackRn.getSlots().size()) {
                                startTime = nLETrackRn.getMaxEnd();
                            } else {
                                startTime = nLETrackRn.getSortedSlots().get(num.intValue()).getStartTime();
                            }
                        } else {
                            NLETrack nLETrackPt = c0e48.Pt();
                            if (nLETrackPt != null && nLETrackPt.getMainTrack() && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
                                startTime = nLETrackSlotLLLLLLIL.getStartTime();
                            } else {
                                startTime = 0;
                            }
                        }
                        long startTime2 = startTime - nLETrackSlot.getStartTime();
                        if (startTime2 < 0) {
                            editorProRecordVideoContext.disableBGM = true;
                            return editorProRecordVideoContext;
                        }
                        int millis = (int) TimeUnit.MICROSECONDS.toMillis(startTime2);
                        if (C703302op.LIZ(resourceFile) && (musicDuration = C1403010mc7.LIZ.getMusicService().getMusicDuration(resourceFile)) > 0 && musicDuration - millis < 1000) {
                            editorProRecordVideoContext.disableBGM = true;
                            return editorProRecordVideoContext;
                        }
                        editorProRecordVideoContext.musicPath = resourceFile;
                        editorProRecordVideoContext.musicOrigin = videoPublishEditModel.getMusicOrigin();
                        editorProRecordVideoContext.musicTrimIn = millis;
                        editorProRecordVideoContext.disableBGM = false;
                        return editorProRecordVideoContext;
                    }
                    editorProRecordVideoContext.disableBGM = true;
                    return editorProRecordVideoContext;
                }
                editorProRecordVideoContext.disableBGM = true;
                return editorProRecordVideoContext;
            }
        }
        editorProRecordVideoContext.disableBGM = true;
        return editorProRecordVideoContext;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IAlbumService
    public void startSelectMedia(C19EG c19eg, C0E48 c0e48, int i, C0LJQ c0ljq, Function0<Unit> function0) {
        startSelectMediaWithInsertIndex(c19eg, c0e48, i, c0ljq, null, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterAllow(X.C19EG r17, X.C0E48 r18, int r19, X.C0LJQ r20, java.lang.Integer r21, kotlin.jvm.functions.Function0<kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.creationflow.album.EditorProAlbumService.afterAllow(X.19EG, X.0E48, int, X.0LJQ, java.lang.Integer, kotlin.jvm.functions.Function0):void");
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IAlbumService
    public void startSelectMediaWithInsertIndex(final C19EG c19eg, C0E48 c0e48, int i, C0LJQ c0ljq, Integer num, Function0<Unit> function0) {
        if (c19eg.isFinishing()) {
            C356530DyN.LIZLLL("album", "startSelectMedia::activity isFinishing");
            return;
        }
        C523800KgU c523800KgU = new C523800KgU();
        c523800KgU.LIZ = "bpea-tools_request_storage_permission_editor_pro_select_media_target34";
        c523800KgU.LIZIZ = "bpea-tools_request_storage_permission_editor_pro_select_media_target33";
        c523800KgU.LIZJ = "bpea-tools_request_storage_permission_editor_pro_select_media";
        TokenCert tokenCertLIZ = c523800KgU.LIZ().LIZ();
        C0LJN c0ljn = new C0LJN(this, c19eg, c0e48, i, c0ljq, num, function0);
        AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(522);
        C0LGY c0lgy = C0LGY.LIZ;
        C0L91 c0l91 = C0L91.IMAGE_AND_VIDEO;
        c0lgy.getClass();
        if (C0LGY.LIZIZ(c0l91)) {
            c0ljn.invoke();
            aFwS194S0000000_8.getClass();
            return;
        }
        C0LJP c0ljp = C0LJP.LIZ;
        final AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(c0ljn, (Function0<Unit>) aFwS194S0000000_8, (Function0<Unit>) 137);
        final AwS409S0200000_8 awS409S0200000_82 = new AwS409S0200000_8(c0ljn, (Function0<Unit>) aFwS194S0000000_8, (Function0<Unit>) 138);
        final AFwS194S0000000_8 aFwS194S0000000_82 = AFwS194S0000000_8.get$arr$(16);
        c0ljp.getClass();
        C0L91 c0l912 = C0L91.IMAGE_AND_VIDEO;
        InterfaceC540100LGe interfaceC540100LGe = new InterfaceC540100LGe() { // from class: X.0LJO
            @Override // X.InterfaceC540100LGe
            public final void LIZ(int[] iArr, String[] strArr) {
                C0LJP c0ljp2 = C0LJP.LIZ;
                C19EG c19eg2 = c19eg;
                Function0<Unit> function02 = aFwS194S0000000_82;
                Function0<Unit> function03 = awS409S0200000_82;
                c0ljp2.getClass();
                C0LJP.LIZIZ(c19eg2, c19eg2.getString(2131849191), c19eg2.getString(2131849190), function02, function03);
            }
        };
        C0LGZ c0lgz = new C0LGZ() { // from class: X.0LJR
            @Override // X.C0LGZ
            public final void LIZ(C0L9U c0l9u, String[] strArr, int[] iArr) {
                awS409S0200000_8.invoke();
            }
        };
        c0lgy.getClass();
        C0LGY.LJIIJ(c19eg, tokenCertLIZ, c0l912, interfaceC540100LGe, c0lgz);
    }

    private final Bundle createChooseMediaBundle(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, long j, int i, int i2, C0LJQ c0ljq, Integer num, int i3) {
        String musicId;
        MusicObject musicObject;
        Bundle bundle = new Bundle();
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.creativeInfo = videoPublishEditModel.getCreativeInfo();
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            shortVideoContext.creativeModel.pugcTemplateData.isFromCreateTemplate = true;
        }
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
        bundle.putInt("key_support_flag", i3);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putLong("Key_min_duration", C566050MHz.LIZIZ());
        bundle.putInt("key_photo_select_max_count", i2);
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", i2);
        bundle.putInt("key_video_select_min_count", 1);
        if (i3 == 1) {
            C786410Ut5.LJJJI("key_mv_hint_text", " ", bundle);
        }
        C0E6K c0e6k = c0ljq.LIZJ;
        C0E6K c0e6k2 = C0E6K.REPLACE;
        if (c0e6k == c0e6k2) {
            bundle.putBoolean("Key_replace_item", true);
            Long l = c0ljq.LIZIZ;
            if (l != null) {
                bundle.putLong("Key_replace_item_duration", l.longValue());
            }
        } else if (c0e6k == C0E6K.CANVASBG) {
            bundle.putBoolean("key_video_bg", true);
        }
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        C786410Ut5.LJJJI("shoot_way", videoPublishEditModel.mShootWay, bundle);
        C786410Ut5.LJJJI("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel), bundle);
        C786410Ut5.LJJJI("content_type", C1428470nHB.LJIILL(videoPublishEditModel), bundle);
        C786410Ut5.LJJJI("enter_from", "video_edit_page", bundle);
        C786410Ut5.LJJJI("shoot_enter_from", C1428470nHB.LJJIIJ(videoPublishEditModel, false), bundle);
        C786410Ut5.LJJJI("shoot_enter_method", videoPublishEditModel.getShootEnterMethod(), bundle);
        bundle.putLong("creation_duration", j);
        if (videoPublishEditModel.mDraftToEditFrom == 0) {
            C786410Ut5.LJJJI("draft_way", "general_draft_list", bundle);
        }
        bundle.putInt("key_choose_scene", 14);
        bundle.putInt("key_choose_request_code", i);
        bundle.putBoolean("is_pip", c0ljq.LIZLLL);
        bundle.putBoolean("is_from_editor_pro", true);
        if (c0ljq.LJ) {
            bundle.putBoolean("is_compress_force", true);
        }
        MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
        if (musicBuzModel != null && (musicObject = musicBuzModel.music) != null) {
            musicId = MusicBeanUtilKt.getMusicId(musicObject);
        } else {
            musicId = null;
        }
        C786410Ut5.LJJJI("music_id", musicId, bundle);
        C537520L6g.LJFF(bundle, videoPublishEditModel.getCreativeInfo());
        C786410Ut5.LJJIJL(bundle, "creative_flow_data", videoPublishEditModel.getCreativeFlowData());
        if (!videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate && !shouldHideRecordEntrance(videoPublishEditModel, c0e48)) {
            C0E6K c0e6k3 = c0ljq.LIZJ;
            if (c0e6k3 == C0E6K.ADD) {
                bundle.putBoolean("key_show_editor_pro_record_entrance", true);
                C786410Ut5.LJJIJL(bundle, "key_album_tab_editor_record_info", generateEditorProRecordVideoContext(videoPublishEditModel, c0e48, num, c0ljq.LIZLLL));
            } else if (c0e6k3 == c0e6k2 && (!c0ljq.LJI || C1533950q1J.LJ(C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, true)))) {
                bundle.putBoolean("key_show_editor_pro_record_entrance", true);
                EditorProRecordVideoContext editorProRecordVideoContextGenerateEditorProRecordVideoContext = generateEditorProRecordVideoContext(videoPublishEditModel, c0e48, num, c0ljq.LIZLLL);
                editorProRecordVideoContextGenerateEditorProRecordVideoContext.isRetake = true;
                editorProRecordVideoContextGenerateEditorProRecordVideoContext.isRetakeOriginUploadSource = true;
                C786410Ut5.LJJIJL(bundle, "key_album_tab_editor_record_info", editorProRecordVideoContextGenerateEditorProRecordVideoContext);
                return bundle;
            }
        }
        return bundle;
    }
}
