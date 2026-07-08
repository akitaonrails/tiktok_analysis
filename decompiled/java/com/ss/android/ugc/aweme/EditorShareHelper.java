package com.ss.android.ugc.aweme;

import X.C0LAB;
import X.C13BV;
import X.C13DA;
import X.C13LP;
import X.C1428470nHB;
import X.C1431840nMc;
import X.C1440005kM;
import X.C1441980ncy;
import X.C14D2;
import X.C15438062q;
import X.C1599690rjL;
import X.C1697810uHb;
import X.C558800Lvq;
import X.C571330Max;
import X.C572310McX;
import X.C573570MeZ;
import X.InterfaceC1428690nHX;
import X.InterfaceC1429470nIn;
import X.InterfaceC1446740nke;
import X.InterfaceC20619215mI;
import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.services.dm.DMCreativeMobConstants;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes23.dex */
public final class EditorShareHelper implements IEditorShareHelper {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v82, types: [com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v86, types: [java.lang.Object[], java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v88, types: [java.lang.Object[], java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.IEditorShareHelper
    public final void LIZ(VideoPublishEditModel videoPublishEditModel, Activity activity, InterfaceC1446740nke interfaceC1446740nke, Function1<? super VideoPublishEditModel, Unit> function1) {
        VideoPublishEditModel videoPublishEditModelMakeCopy;
        DMMediaModel dMMediaModel;
        int i;
        InterfaceC20619215mI interfaceC20619215mI;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        ?? arrayList;
        List<SingleImageData> imageList2;
        String realImportPath;
        String path;
        String path2;
        File fileLIZLLL;
        File fileLIZJ;
        File fileLJFF;
        Integer num;
        Object objLJJJLZIJ;
        Object objLJJJLZIJ2;
        Object objLJJJLZIJ3;
        List<SingleImageData> imageList3;
        SingleImageData singleImageData;
        ImportVideoInfo originAlbumImageData;
        InterfaceC1429470nIn interfaceC1429470nInLJFF;
        String realImportPath2;
        List<SingleImageData> imageList4;
        SingleImageData singleImageData2;
        ImportVideoInfo originAlbumImageData2;
        if (interfaceC1446740nke != null) {
            interfaceC1446740nke.RF0();
            videoPublishEditModelMakeCopy = VideoPublishEditModel.makeCopy(videoPublishEditModel);
            function1.invoke(videoPublishEditModel);
        } else {
            videoPublishEditModelMakeCopy = VideoPublishEditModel.makeCopy(videoPublishEditModel);
        }
        CreativeModel creativeModel = videoPublishEditModelMakeCopy.creativeModel;
        String str = "";
        if (C1428470nHB.LJJZZI(videoPublishEditModelMakeCopy)) {
            ImageAlbumData imageAlbumData2 = videoPublishEditModelMakeCopy.getImageAlbumData();
            if (imageAlbumData2 == null || (imageList4 = imageAlbumData2.getImageList()) == null || (singleImageData2 = (SingleImageData) C13LP.LJJJLL(imageList4)) == null || (originAlbumImageData2 = singleImageData2.getOriginAlbumImageData()) == null || (realImportPath2 = originAlbumImageData2.getRealImportPath()) == null) {
                realImportPath2 = "";
            }
            dMMediaModel = new DMMediaModel(2, realImportPath2, "", "", false, true, true, null);
        } else {
            dMMediaModel = new DMMediaModel(3, "", "", "", false, false, true, null);
        }
        creativeModel.dmMediaModel = dMMediaModel;
        C13DA c13da = new C13DA();
        c13da.put("enter_from", DMCreativeMobConstants.EnterFrom.VIDEO_EDIT_PAGE.getValue());
        c13da.put("enter_method", "exit_video_shoot_send_to_friends");
        String str2 = CardStruct.IStatusCode.DEFAULT;
        c13da.put("is_shoot_upload", CardStruct.IStatusCode.DEFAULT);
        c13da.put("creation_id", videoPublishEditModel.getCreationId());
        if (videoPublishEditModel.getAILivePhotoModel().LJII()) {
            str2 = "1";
        }
        c13da.put("is_ai_alive", str2);
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService != null && (interfaceC1429470nInLJFF = iAiChatFeatureService.LJFF()) != null && interfaceC1429470nInLJFF.LJFF(videoPublishEditModel.creativeModel, videoPublishEditModel.getPreviewInfo(), C1428470nHB.LJJZZI(videoPublishEditModel))) {
            c13da.put("is_visual_poet", "1");
        }
        int i2 = C558800Lvq.LIZ[videoPublishEditModel.getAILivePhotoModel().LJ().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    i = 4;
                    if (i2 != 4) {
                        i = 0;
                    }
                }
            } else {
                i = 2;
            }
        } else {
            i = 1;
        }
        c13da.put("ai_livephoto_status", String.valueOf(i));
        String str3 = videoPublishEditModel.mShootWay;
        if (str3 == null) {
            str3 = "";
        }
        c13da.put("shoot_way", str3);
        String shootEnterMethod = videoPublishEditModel.getShootEnterMethod();
        if (shootEnterMethod == null) {
            shootEnterMethod = "";
        }
        c13da.put("shoot_enter_method", shootEnterMethod);
        c13da.put("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c13da.put("is_draft", String.valueOf(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0));
        C0LAB c0lab = new C0LAB();
        C572310McX.LJ(videoPublishEditModel, c0lab);
        c13da.putAll(c0lab.LIZ);
        Map<String, String> mapBuild = c13da.build();
        EventBus.LIZLLL().LJIJJLI(C1431840nMc.class);
        if (C1428470nHB.LJJZZI(videoPublishEditModelMakeCopy) && (imageAlbumData = videoPublishEditModelMakeCopy.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null && imageList.size() > 1) {
            ImageAlbumData imageAlbumData3 = videoPublishEditModelMakeCopy.getImageAlbumData();
            if (imageAlbumData3 != null && (imageList2 = imageAlbumData3.getImageList()) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(imageList2, 10));
                int i3 = 0;
                for (SingleImageData singleImageData3 : imageList2) {
                    int i4 = i3 + 1;
                    String path3 = null;
                    if (i3 >= 0) {
                        VideoPublishEditModel videoPublishEditModelMakeCopy2 = VideoPublishEditModel.makeCopy(videoPublishEditModelMakeCopy);
                        CreativeInfo creativeInfo = videoPublishEditModelMakeCopy2.getCreativeInfo();
                        videoPublishEditModelMakeCopy2.setCreativeInfo(creativeInfo.copy(UUID.randomUUID().toString(), creativeInfo.version, creativeInfo.sessionId));
                        videoPublishEditModelMakeCopy2.setWorkspace(C14D2.LIZ(videoPublishEditModelMakeCopy2.getCreativeInfo()));
                        ImageAlbumData imageAlbumData4 = (ImageAlbumData) C571330Max.LIZ(imageAlbumData3);
                        imageAlbumData4.setImageList(Collections.singletonList(singleImageData3));
                        videoPublishEditModelMakeCopy2.setImageAlbumData(imageAlbumData4);
                        CreativeModel creativeModel2 = videoPublishEditModelMakeCopy2.creativeModel;
                        ImageAlbumData imageAlbumData5 = videoPublishEditModelMakeCopy2.getImageAlbumData();
                        if (imageAlbumData5 == null || (imageList3 = imageAlbumData5.getImageList()) == null || (singleImageData = (SingleImageData) C13LP.LJJJLL(imageList3)) == null || (originAlbumImageData = singleImageData.getOriginAlbumImageData()) == null || (realImportPath = originAlbumImageData.getRealImportPath()) == null) {
                            realImportPath = "";
                        }
                        creativeModel2.dmMediaModel = new DMMediaModel(2, realImportPath, "", "", false, true, true, null);
                        MvCreateVideoData mvCreateVideoData = videoPublishEditModelMakeCopy2.getMvCreateVideoData();
                        if (mvCreateVideoData != null) {
                            ArrayList<String> arrayList2 = mvCreateVideoData.selectMediaList;
                            if (arrayList2 != null && (objLJJJLZIJ3 = C13LP.LJJJLZIJ(i3, arrayList2)) != null) {
                                mvCreateVideoData.selectMediaList = C1697810uHb.LJ(new String[]{objLJJJLZIJ3});
                            }
                            ArrayList<String> arrayList3 = mvCreateVideoData.srcSelectMediaList;
                            if (arrayList3 != null && (objLJJJLZIJ2 = C13LP.LJJJLZIJ(i3, arrayList3)) != null) {
                                mvCreateVideoData.srcSelectMediaList = C1697810uHb.LJ(new String[]{objLJJJLZIJ2});
                            }
                        }
                        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModelMakeCopy2.getImportInfoList();
                        if (importInfoList != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(i3, importInfoList)) != null) {
                            videoPublishEditModelMakeCopy2.setImportInfoList(C1697810uHb.LJ(new ImportVideoInfo[]{objLJJJLZIJ}));
                        }
                        ArrayList<Integer> segmentLoudness = videoPublishEditModelMakeCopy2.getSegmentLoudness();
                        if (segmentLoudness != null && (num = (Integer) C13LP.LJJJLZIJ(i3, segmentLoudness)) != null) {
                            videoPublishEditModelMakeCopy2.setSegmentLoudness(C1697810uHb.LJ(Integer.valueOf(num.intValue())));
                        }
                        Workspace workspace = videoPublishEditModelMakeCopy2.getWorkspace();
                        if (workspace != null && (fileLJFF = workspace.LJFF()) != null) {
                            path = fileLJFF.getPath();
                        } else {
                            path = null;
                        }
                        videoPublishEditModelMakeCopy2.setOutputFile(path);
                        Workspace workspace2 = videoPublishEditModelMakeCopy2.getWorkspace();
                        if (workspace2 != null && (fileLIZJ = workspace2.LIZJ()) != null) {
                            path2 = fileLIZJ.getPath();
                        } else {
                            path2 = null;
                        }
                        videoPublishEditModelMakeCopy2.setEncodedAudioOutputFile(path2);
                        Workspace workspace3 = videoPublishEditModelMakeCopy2.getWorkspace();
                        if (workspace3 != null && (fileLIZLLL = workspace3.LIZLLL()) != null) {
                            path3 = fileLIZLLL.getPath();
                        }
                        videoPublishEditModelMakeCopy2.setParallelUploadOutputFile(path3);
                        DraftEditTransferModel draftEditTransferModel = videoPublishEditModelMakeCopy2.draftEditTransferModel;
                        if (draftEditTransferModel != null) {
                            videoPublishEditModelMakeCopy2.draftEditTransferModel = draftEditTransferModel.copy(videoPublishEditModelMakeCopy2.getCreationId(), draftEditTransferModel.videoSegmentsCopy);
                        }
                        arrayList.add(videoPublishEditModelMakeCopy2);
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new IMMediaPublishEvent.MultiEditModel((BaseShortVideoContext) it2.next(), null, null, true));
            }
            interfaceC20619215mI = null;
            C1440005kM.LIZIZ(new C1431840nMc(new IMMediaPublishEvent.DMRecordMultiMediaPublishEvent("", arrayList4, true, false, !videoPublishEditModelMakeCopy.creativeModel.stickerModel.textStickerModels.isEmpty(), null, mapBuild)));
        } else {
            interfaceC20619215mI = null;
            C1440005kM.LIZIZ(new C1431840nMc(new IMMediaPublishEvent.DMRecordMediaPublishEvent("", videoPublishEditModelMakeCopy, true, true, null, null, false, !videoPublishEditModelMakeCopy.creativeModel.stickerModel.textStickerModels.isEmpty(), null, null, null, false, false, false, mapBuild)));
        }
        IMSharePanelApi.LIZ.getClass();
        InterfaceC1428690nHX interfaceC1428690nHXLIZ = C1599690rjL.LIZ().LIZ();
        String str4 = videoPublishEditModelMakeCopy.creativeModel.editSaveLocalModel.flowId;
        boolean zLIZJ = C573570MeZ.LIZJ(videoPublishEditModelMakeCopy);
        boolean zLJJZZI = C1428470nHB.LJJZZI(videoPublishEditModelMakeCopy);
        boolean zLIZIZ = C1441980ncy.LIZIZ(videoPublishEditModelMakeCopy);
        boolean zLJFF = Intrinsics.LJFF("editor_tab", videoPublishEditModel.creativeModel.landingModel.landingTab);
        String str5 = videoPublishEditModelMakeCopy.creativeModel.landingModel.dataComeFrom;
        if (str5 != null) {
            str = str5;
        }
        interfaceC1428690nHXLIZ.LIZ(activity, false, str4, false, false, true, false, false, false, mapBuild, interfaceC20619215mI, false, UUID.randomUUID().toString(), "", "", zLIZJ, zLJFF, str, false, zLJJZZI, zLIZIZ, new AwS601S0100000_22(interfaceC1446740nke, 32));
    }
}
