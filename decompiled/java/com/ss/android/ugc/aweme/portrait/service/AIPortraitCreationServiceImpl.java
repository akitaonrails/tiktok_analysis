package com.ss.android.ugc.aweme.portrait.service;

import X.C0C64;
import X.C0L0S;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1390920mIc;
import X.C13LP;
import X.C1444940nhk;
import X.C19EG;
import X.C547790Le5;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigc;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.model.GenerateStatus;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitCreationServiceImpl implements IAIPortraitCreationService {
    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService
    public final boolean LJFF() {
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        return iAIPortraitFeatureServiceLIZ != null && iAIPortraitFeatureServiceLIZ.isFeatureEnabled() && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_portrait_anchor_enable", true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService
    public final <T> boolean LIZ(T t) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        List<EditVideoSegment> videoList;
        AIGCInfo aIGCInfo;
        List<SingleImageData> imageList;
        AIPortraitGeneratingModel aIPortraitGeneratingModel;
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ == null || !iAIPortraitFeatureServiceLIZ.isFeatureEnabled() || !(t instanceof AwemeDraft)) {
            return false;
        }
        AwemeDraft awemeDraft = (AwemeDraft) t;
        AIPortraitModel aIPortraitModel = awemeDraft.LIZ.aigcBusinessModel.aiPortraitModel;
        if (aIPortraitModel == null) {
            return false;
        }
        AIPortraitContextModel aIPortraitContextModel = aIPortraitModel.contextModel;
        GenerateStatus generateStatus = null;
        if (aIPortraitContextModel != null && (aIPortraitGeneratingModel = aIPortraitContextModel.generatingModel) != null) {
            generateStatus = aIPortraitGeneratingModel.status;
        }
        if (generateStatus != GenerateStatus.APPLIED) {
            return true;
        }
        if (awemeDraft.LJIIL()) {
            ImageAlbumData imageAlbumData = awemeDraft.LJJJJIZL.imageAlbumData;
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                for (SingleImageData singleImageData : imageList) {
                    AIGCInfo aigcInfo = singleImageData.getAigcInfo();
                    if (aigcInfo != null && C0L0S.LIZ(aigcInfo)) {
                        if (singleImageData != null) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        if (C1444940nhk.LJII(awemeDraft.LJJJJIZL.canvasVideoData)) {
            CanvasVideoData canvasVideoData = awemeDraft.LJJJJIZL.canvasVideoData;
            if (canvasVideoData != null && (aIGCInfo = canvasVideoData.aigcInfo) != null && C0L0S.LIZ(aIGCInfo)) {
                return true;
            }
            return false;
        }
        EditPreviewInfo editPreviewInfo = awemeDraft.LJJJJIZL.previewInfo;
        if (editPreviewInfo != null && (videoList = editPreviewInfo.getVideoList()) != null) {
            for (EditVideoSegment editVideoSegment : videoList) {
                AIGCInfo aigcInfo2 = editVideoSegment.getAigcInfo();
                if (aigcInfo2 != null && C0L0S.LIZ(aigcInfo2)) {
                    if (editVideoSegment != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = awemeDraft.LJJJJIZL.multiEditVideoData;
        if (multiEditVideoStatusRecordData == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) == null || (list = multiEditVideoRecordData.segmentDataList) == null) {
            return false;
        }
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            AIGCInfo aIGCInfo2 = multiEditVideoSegmentRecordData.aigcInfo;
            if (aIGCInfo2 != null && C0L0S.LIZ(aIGCInfo2)) {
                if (multiEditVideoSegmentRecordData != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService
    public final ArrayList<String> LIZIZ(CreativeModel creativeModel) {
        CanvasVideoData canvasVideoData;
        AIGCInfo aIGCInfo;
        String uuid;
        AlbumAigc albumAigc;
        List<EditVideoSegment> videoList;
        List<AlbumAigc> albumAigc2;
        AlbumAigc albumAigc3;
        String uuid2;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        List<AlbumAigc> albumAigc4;
        AlbumAigc albumAigc5;
        String uuid3;
        List<SingleImageData> imageList;
        List<AlbumAigc> albumAigc6;
        AlbumAigc albumAigc7;
        String uuid4;
        ArrayList arrayList = new ArrayList();
        if (creativeModel.creationTypeModel.creationMode == 2) {
            ImageAlbumData imageAlbumData = creativeModel.imageAlbumModel;
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (SingleImageData singleImageData : imageList) {
                    AIGCInfo aigcInfo = singleImageData.getAigcInfo();
                    if (aigcInfo != null && C0L0S.LIZ(aigcInfo)) {
                        arrayList2.add(singleImageData);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    AIGCInfo aigcInfo2 = ((SingleImageData) it2.next()).getAigcInfo();
                    if (aigcInfo2 != null && (albumAigc6 = aigcInfo2.getAlbumAigc()) != null && (albumAigc7 = (AlbumAigc) C13LP.LJJJLL(albumAigc6)) != null && (uuid4 = albumAigc7.getUuid()) != null) {
                        arrayList.add(uuid4);
                    }
                }
            }
            return new ArrayList<>(C13LP.LJJJJI(arrayList));
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = creativeModel.editModel.multiEditVideoStatusRecordData;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                AIGCInfo aIGCInfo2 = multiEditVideoSegmentRecordData.aigcInfo;
                if (aIGCInfo2 != null && C0L0S.LIZ(aIGCInfo2)) {
                    arrayList3.add(multiEditVideoSegmentRecordData);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                AIGCInfo aIGCInfo3 = ((MultiEditVideoSegmentRecordData) it3.next()).aigcInfo;
                if (aIGCInfo3 != null && (albumAigc4 = aIGCInfo3.getAlbumAigc()) != null && (albumAigc5 = (AlbumAigc) C13LP.LJJJLL(albumAigc4)) != null && (uuid3 = albumAigc5.getUuid()) != null) {
                    arrayList.add(uuid3);
                }
            }
        }
        EditPreviewInfo editPreviewInfo = creativeModel.editModel.editPreviewInfo;
        if (editPreviewInfo != null && (videoList = editPreviewInfo.getVideoList()) != null) {
            ArrayList arrayList4 = new ArrayList();
            for (EditVideoSegment editVideoSegment : videoList) {
                AIGCInfo aigcInfo3 = editVideoSegment.getAigcInfo();
                if (aigcInfo3 != null && C0L0S.LIZ(aigcInfo3)) {
                    arrayList4.add(editVideoSegment);
                }
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                AIGCInfo aigcInfo4 = ((EditVideoSegment) it4.next()).getAigcInfo();
                if (aigcInfo4 != null && (albumAigc2 = aigcInfo4.getAlbumAigc()) != null && (albumAigc3 = (AlbumAigc) C13LP.LJJJLL(albumAigc2)) != null && (uuid2 = albumAigc3.getUuid()) != null) {
                    arrayList.add(uuid2);
                }
            }
        }
        if (C1444940nhk.LJII(creativeModel.canvasVideoData) && (canvasVideoData = creativeModel.canvasVideoData) != null && (aIGCInfo = canvasVideoData.aigcInfo) != null && C0L0S.LIZ(aIGCInfo)) {
            List<AlbumAigc> albumAigc8 = aIGCInfo.getAlbumAigc();
            if (albumAigc8 == null || (albumAigc = (AlbumAigc) C13LP.LJJJLL(albumAigc8)) == null || (uuid = albumAigc.getUuid()) == null) {
                uuid = "";
            }
            arrayList.add(uuid);
        }
        return new ArrayList<>(C13LP.LJJJJI(arrayList));
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService
    public final void LIZJ(C19EG c19eg) {
        if (!c19eg.isFinishing() && !c19eg.isDestroyed() && !c19eg.getSupportFragmentManager().LJLJJI()) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.f858n2, null, false);
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = c19eg.getString(2131825810);
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZIZ(c1251150ifB);
            c0om1.LIZLLL = true;
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIL = c0om1;
            tuxSheet.LLJJJ = null;
            tuxSheet.LLJJIII = viewTd;
            tuxSheet.LLJJIJIIJIL = true;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJLLL = true;
            tuxSheet2.LLJLILLLLZIIL = true;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, c19eg);
            TuxSheet tuxSheet3 = c1390920mIc.LIZ;
            tuxSheet3.LLJI = numLIZJ;
            tuxSheet3.show(c19eg.getSupportFragmentManager(), "AboutAIPortrait");
            c1251150ifB.LIZJ(new AwS552S0100000_8(tuxSheet3, 163));
        }
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService
    public final boolean LIZLLL(CreativeModel creativeModel) {
        boolean z;
        boolean z2;
        boolean z3;
        CanvasVideoData canvasVideoData;
        AIGCInfo aIGCInfo;
        List<EditVideoSegment> videoList;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        List<SingleImageData> imageList;
        if (creativeModel.creationTypeModel.creationMode == 2) {
            ImageAlbumData imageAlbumData = creativeModel.imageAlbumModel;
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                for (SingleImageData singleImageData : imageList) {
                    AIGCInfo aigcInfo = singleImageData.getAigcInfo();
                    if (aigcInfo != null && C0L0S.LIZ(aigcInfo)) {
                        if (singleImageData != null) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = creativeModel.editModel.multiEditVideoStatusRecordData;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null && !list.isEmpty()) {
            Iterator<MultiEditVideoSegmentRecordData> it2 = list.iterator();
            while (it2.hasNext()) {
                AIGCInfo aIGCInfo2 = it2.next().aigcInfo;
                if (aIGCInfo2 != null && C0L0S.LIZ(aIGCInfo2)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        EditPreviewInfo editPreviewInfo = creativeModel.editModel.editPreviewInfo;
        if (editPreviewInfo != null && (videoList = editPreviewInfo.getVideoList()) != null && !videoList.isEmpty()) {
            Iterator<EditVideoSegment> it3 = videoList.iterator();
            while (it3.hasNext()) {
                AIGCInfo aigcInfo2 = it3.next().getAigcInfo();
                if (aigcInfo2 != null && C0L0S.LIZ(aigcInfo2)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        if (C1444940nhk.LJII(creativeModel.canvasVideoData) && (canvasVideoData = creativeModel.canvasVideoData) != null && (aIGCInfo = canvasVideoData.aigcInfo) != null && C0L0S.LIZ(aIGCInfo)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z || z2 || z3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService
    public final boolean LJ(CreativeModel creativeModel, int i) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        AIGCInfo aigcInfo;
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ != null && iAIPortraitFeatureServiceLIZ.isFeatureEnabled() && (imageAlbumData = creativeModel.imageAlbumModel) != null && (imageList = imageAlbumData.getImageList()) != null && (singleImageData = (SingleImageData) C13LP.LJJJLZIJ(i, imageList)) != null && (aigcInfo = singleImageData.getAigcInfo()) != null && C0L0S.LIZ(aigcInfo)) {
            return true;
        }
        return false;
    }
}
