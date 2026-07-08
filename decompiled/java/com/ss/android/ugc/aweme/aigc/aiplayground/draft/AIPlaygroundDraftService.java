package com.ss.android.ugc.aweme.aigc.aiplayground.draft;

import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0CHQ;
import X.C0F1Y;
import X.C0VSJ;
import X.C13LP;
import X.C1428470nHB;
import X.C15438062q;
import X.C1697810uHb;
import X.C1AF0;
import X.C2188811AlT;
import X.C23260099m;
import X.C2354709Kn;
import X.C2471909mP;
import X.C2536809ws;
import X.C2536909wt;
import X.C274150Aon;
import X.C307450C3j;
import X.C377740ErU;
import X.C786410Ut5;
import X.EnumC20228214Cy;
import X.InterfaceC1364105Vn;
import X.InterfaceC545580LaW;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundDraftService;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.AlgoRaw;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.tools.utils.FileIdentifierModel;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AIPlaygroundDraftService implements IAIPlaygroundDraftService {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundDraftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel r9, java.util.List r10) {
        /*
            r8 = this;
            java.lang.String r4 = ""
            if (r10 == 0) goto L10
            java.lang.Object r0 = X.C13LP.LJJJLL(r10)
            X.0LSZ r0 = (X.C0LSZ) r0
            if (r0 == 0) goto L10
            java.lang.String r2 = r0.LIZ
            if (r2 != 0) goto L11
        L10:
            r2 = r4
        L11:
            r6 = 0
            if (r10 == 0) goto L46
            java.util.Iterator r5 = r10.iterator()
        L18:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r3 = r5.next()
            r0 = r3
            X.0LSZ r0 = (X.C0LSZ) r0
            java.lang.String r1 = r0.LJI
            java.lang.String r0 = "DOWNLOAD"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L18
            r6 = r3
        L30:
            X.0LSZ r6 = (X.C0LSZ) r6
            if (r6 == 0) goto L38
            java.lang.String r1 = r6.LJIILIIL
            if (r1 != 0) goto L47
        L38:
            if (r10 == 0) goto L46
            java.lang.Object r0 = X.C13LP.LJJJJZI(r10)
            X.0LSZ r0 = (X.C0LSZ) r0
            if (r0 == 0) goto L46
            java.lang.String r1 = r0.LJIILIIL
            if (r1 != 0) goto L47
        L46:
            r1 = r4
        L47:
            java.lang.Class<com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput> r0 = com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput.class
            java.lang.Object r6 = X.C377740ErU.LJI(r1, r0)
            com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r6 = (com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput) r6
            if (r6 != 0) goto L52
            return
        L52:
            com.ss.android.ugc.aweme.aigc.asynctask.models.ChildTaskOutput r1 = r6.childTaskOutPut
            com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadListTaskOutput r0 = r1.creationDownloadListTaskOutput
            if (r0 == 0) goto Lc4
            java.util.List<com.ss.android.ugc.aweme.aigc.asynctask.DownloadItemResult> r5 = r0.downloadItemList
            if (r5 == 0) goto Lc4
            com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskOutput r0 = r1.faceDetectTaskOutput
            if (r0 == 0) goto L64
            java.util.List<java.lang.Integer> r3 = r0.faceCountList
            if (r3 != 0) goto L66
        L64:
            X.13BV r3 = X.C13BV.INSTANCE
        L66:
            com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput r0 = r1.imageUploadTaskOutput
            if (r0 == 0) goto L6e
            java.util.List<java.lang.String> r7 = r0.imageXIdList
            if (r7 != 0) goto L70
        L6e:
            X.13BV r7 = X.C13BV.INSTANCE
        L70:
            com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput r0 = r1.i2VServerTaskOutput
            if (r0 == 0) goto L78
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.uriMigrationMap
            if (r1 != 0) goto L7c
        L78:
            java.util.Map r1 = X.C2097608Jq.LJ()
        L7c:
            r0 = 0
            java.lang.Object r5 = X.C13LP.LJJJLZIJ(r0, r5)
            com.ss.android.ugc.aweme.aigc.asynctask.DownloadItemResult r5 = (com.ss.android.ugc.aweme.aigc.asynctask.DownloadItemResult) r5
            if (r5 == 0) goto Lc4
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r0 = r9.param
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType r0 = r0.mediaType
            X.C377780ErY.LIZ(r5, r9, r0, r7)
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r0 = r9.param
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType r0 = r0.mediaType
            r9.type = r0
            r0 = 1120403456(0x42c80000, float:100.0)
            r9.progress = r0
            r0 = 1
            r9.isSelected = r0
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus r0 = com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus.COMPLETE
            r9.status = r0
            com.ss.android.ugc.aweme.aigc.asynctask.models.ChildTaskOutput r0 = r6.childTaskOutPut
            com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput r0 = r0.i2VServerTaskOutput
            if (r0 == 0) goto La8
            java.lang.String r0 = r0.serverTaskId
            if (r0 == 0) goto La8
            r4 = r0
        La8:
            r9.serverTaskId = r4
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r9.epAIGCId = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r9.itemID = r0
            r9.epAIGCAsyncTaskId = r2
            r9.faceCountList = r3
            r9.uriMigrationMap = r1
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.aiplayground.draft.AIPlaygroundDraftService.LIZIZ(com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel, java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundDraftService
    public final void LIZJ(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot) throws Throwable {
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel;
        String strLIZ;
        NLEResourceAV aVFile;
        NLEResourceNode resource;
        String first;
        long jLongValue;
        if (!C1428470nHB.LJFF(videoPublishEditModel) || (editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJJLZIJ(0, videoPublishEditModel.creativeModel.editorProAIGCInfoModel.editorProAIGCMediaItemModelList)) == null) {
            return;
        }
        editorProAIGCMediaItemModel.slotId = nLETrackSlot.getUUID();
        AIGCGenerationParam aIGCGenerationParam = editorProAIGCMediaItemModel.param;
        String str = aIGCGenerationParam.imagePath;
        List<String> listSingletonList = aIGCGenerationParam.imagePathList;
        if (C307450C3j.LIZ() && (!a0.LJJJIL(aIGCGenerationParam.generateReqKey))) {
            strLIZ = aIGCGenerationParam.generateReqKey;
        } else if (!listSingletonList.isEmpty()) {
            strLIZ = (String) C2536809ws.LIZ.getValue();
        } else if (str.length() > 0) {
            strLIZ = (String) C274150Aon.LIZ.getValue();
        } else {
            strLIZ = C2536909wt.LIZ();
        }
        editorProAIGCMediaItemModel.algoRequestKey = strLIZ;
        if (!(!listSingletonList.isEmpty())) {
            listSingletonList = Collections.singletonList(str);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", 5);
        jSONObject.put("ratio", aIGCGenerationParam.aspectRatio);
        AlgoRaw algoRaw = new AlgoRaw(strLIZ, C786410Ut5.J3(jSONObject));
        String str2 = aIGCGenerationParam.promptDescription;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSingletonList, 10));
        for (String str3 : listSingletonList) {
            C2471909mP c2471909mP = C2471909mP.LIZ;
            Pair<String, Long> pairLJI = c2471909mP.LJI(str3);
            if (pairLJI == null || (first = pairLJI.getFirst()) == null) {
                first = "";
            }
            Pair<String, Long> pairLJI2 = c2471909mP.LJI(str3);
            if (pairLJI2 != null) {
                jLongValue = pairLJI2.getSecond().longValue();
            } else {
                jLongValue = 0;
            }
            arrayList.add(new FileIdentifierModel(first, jLongValue));
        }
        EditorProAIGCTemplateModel editorProAIGCTemplateModel = new EditorProAIGCTemplateModel("ep_aigc_t2v", "ai_video", null, algoRaw, arrayList, listSingletonList, str2, 0, null, 388, null);
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
            resource.setExtra("ep_ai_generated", "1");
        }
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null) {
            aVFile.setHasAudio(false);
        }
        C377740ErU.LJII(nLETrackSlot, editorProAIGCTemplateModel);
        nLETrackSlot.setExtra("ai_playground_generated", "1");
        C377740ErU.LJIIIIZZ(nLETrackSlot, editorProAIGCMediaItemModel.epAIGCId, editorProAIGCMediaItemModel.epAIGCAsyncTaskId, editorProAIGCMediaItemModel.itemID);
        EditVideoSegment editVideoSegmentLIZIZ = C0F1Y.LIZIZ(nLETrackSlot);
        if (editVideoSegmentLIZIZ != null) {
            videoPublishEditModel.getEditorProModel().setEpAIGCVideoSegments(C1697810uHb.LJIILJJIL(editVideoSegmentLIZIZ));
        }
        AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
        audioRecorderParam.setHasOriginalSound(false);
        audioRecorderParam.setNeedOriginalSound(false);
        videoPublishEditModel.setVeAudioRecorderParam(audioRecorderParam);
    }

    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundDraftService
    public final Object LIZ(String str, String str2, String str3, CreativeModel creativeModel, String str4, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String str5 = str3;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C0VSJ c0vsj = new C0VSJ(str2);
        if (!c0vsj.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Result file ");
            sbLIZ.append(str2);
            sbLIZ.append(" not found");
            C1AF0.LJ(new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ)));
        }
        try {
            String absolutePath = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZJ(new CreativeInfo(str, 0, null, 4, null), EnumC20228214Cy.EDITOR_PRO_AIGC, c0vsj.getName(), true).getAbsolutePath();
            C2354709Kn.LIZLLL(str2, absolutePath);
            InterfaceC545580LaW interfaceC545580LaWLIZIZ = C0CHQ.LIZ().LJI().LIZIZ();
            ArrayList arrayListLJ = C1697810uHb.LJ(absolutePath);
            if (str5 == null) {
                str5 = "";
            }
            interfaceC545580LaWLIZIZ.LIZ(new IAVDraftService.SaveDraftByPathParam(arrayListLJ, str, str5, new ISaveVideoToDraftListener() { // from class: X.0Erf
                @Override // com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener
                public final void onSuccess() {
                    InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 = c23260099m;
                    Unit unit = Unit.LIZ;
                    C189200o6.m2constructorimpl(unit);
                    interfaceC1364105Vn2.resumeWith(unit);
                }

                @Override // com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener
                public final void onFailed(Exception exc) {
                    InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 = c23260099m;
                    if (exc == null) {
                        exc = new Exception("Unknown error during saving draft");
                    }
                    C098200Yq c098200Yq = new C098200Yq(exc);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn2.resumeWith(c098200Yq);
                }
            }, null, creativeModel, true, str4, null, null, false, 1808, null));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(new IllegalArgumentException("Illegal argument exception during saving draft"));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
