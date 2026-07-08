package com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.workflowbuilder;

import X.C09JG;
import X.C09JK;
import X.C0LM6;
import X.C0LMO;
import X.C0LNO;
import X.C0LNP;
import X.C0LQC;
import X.C0LRS;
import X.C0LST;
import X.C0LVI;
import X.C1195504m1;
import X.C1195604m2;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C541400LLe;
import X.C541500LLo;
import X.C542680LQc;
import X.C543560LTm;
import X.C543820LUm;
import X.InterfaceC543000LRi;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VPostProcessingTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.AigcArchFixParentTaskParamExperiment;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.AigcArchFixWorkflowGraphNotClear;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VPostProcessingTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.ITaskScheduler;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class TaskScheduler implements ITaskScheduler {
    public final C1195504m1 LIZ = new C1195504m1();

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.ITaskScheduler
    public final List<InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput>> LIZIZ() {
        C0LRS c0lrsLJ;
        C1195504m1 c1195504m1 = this.LIZ;
        c1195504m1.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        Set setKeySet = ((LinkedHashMap) c1195504m1.LIZ).keySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : setKeySet) {
            if (!c1195504m1.LIZJ.containsKey(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C1195504m1.LIZIZ(linkedHashSet, c1195504m1, arrayList, ((Number) it2.next()).intValue());
        }
        Iterator it3 = ((LinkedHashMap) c1195504m1.LIZ).keySet().iterator();
        while (it3.hasNext()) {
            C1195504m1.LIZIZ(linkedHashSet, c1195504m1, arrayList, ((Number) it3.next()).intValue());
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.isEmpty()) {
            return arrayList3;
        }
        if (Intrinsics.LJFF(((C542680LQc) C13LP.LJJJJZI(arrayList)).LIZ, "server")) {
            LIZLLL(arrayList3);
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next = it4.next();
                if (Intrinsics.LJFF(((C542680LQc) next).LIZ, "postProcessing")) {
                    if (next != null && (c0lrsLJ = LJ("postProcessing")) != null) {
                        arrayList3.add(c0lrsLJ);
                    }
                }
            }
        } else {
            int i = 0;
            for (Object obj2 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C0LRS c0lrsLJ2 = LJ(((C542680LQc) obj2).LIZ);
                if (c0lrsLJ2 != null) {
                    arrayList3.add(c0lrsLJ2);
                }
                i = i2;
            }
        }
        return arrayList3;
    }

    public static void LIZLLL(List list) {
        C0LRS c0lrsLJ = LJ("quota");
        if (c0lrsLJ != null) {
            ((ArrayList) list).add(c0lrsLJ);
        }
        C0LRS c0lrsLJ2 = LJ("upload");
        if (c0lrsLJ2 != null) {
            ((ArrayList) list).add(c0lrsLJ2);
        }
        C0LRS c0lrsLJ3 = LJ("server");
        if (c0lrsLJ3 != null) {
            ((ArrayList) list).add(c0lrsLJ3);
        }
        C0LRS c0lrsLJ4 = LJ("progress");
        if (c0lrsLJ4 != null) {
            ((ArrayList) list).add(c0lrsLJ4);
        }
        C0LRS c0lrsLJ5 = LJ("download");
        if (c0lrsLJ5 != null) {
            ((ArrayList) list).add(c0lrsLJ5);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C0LRS LJ(String str) {
        switch (str.hashCode()) {
            case -1203610669:
                if (str.equals("postProcessing")) {
                    final C543560LTm c543560LTm = new C543560LTm();
                    final C0LM6 c0lm6 = C0LM6.POST_PROCESS;
                    return new C0LRS<GeneralI2VPostProcessingTaskInput, GeneralI2VPostProcessingTaskOutput>(c543560LTm, c0lm6) { // from class: X.0LQi
                        public final C0LTN<GeneralI2VPostProcessingTaskInput, GeneralI2VPostProcessingTaskOutput> LIZLLL;
                        public final C0LM6 LJ;

                        @Override // X.C0LRS
                        public final C0LM6 LIZIZ() {
                            return this.LJ;
                        }

                        @Override // X.C0LRS
                        public final C0LTN<GeneralI2VPostProcessingTaskInput, GeneralI2VPostProcessingTaskOutput> LIZLLL() {
                            return this.LIZLLL;
                        }

                        @Override // X.C0LRS
                        public final C0LSZ LIZ(C0LSZ c0lsz) {
                            if (!C542750LQj.LIZ() || c0lsz.LJJ.templateImgPath.length() <= 0 || c0lsz.LJJ.templateResourceId.length() <= 0 || c0lsz.LJJ.templateType == 0) {
                                return c0lsz;
                            }
                            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "POST_PROCESSING", 99, this.LIZLLL.getTaskId(), null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268435007);
                        }

                        {
                            super(c543560LTm, c0lm6);
                            this.LIZLLL = c543560LTm;
                            this.LJ = c0lm6;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.C0LRS
                        public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
                            boolean z;
                            String str2;
                            boolean z2 = false;
                            if (c0lsz.LJJ.templateImgPath.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            String str3 = null;
                            Object[] objArr = 0;
                            if (!z && c0lsz.LJJ.templateResourceId.length() != 0 && c0lsz.LJJ.templateType != 0 && c0lsz.LJIILIIL.length() != 0) {
                                String strLJ = C2298208zU.LJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), new CreativeInfo(c0lsz.LJIIJ, c0lsz.LJIIJJI, str3, 4, objArr == true ? 1 : 0), C0MI0.OFFLINE_PROCESSING, null, 12);
                                if (AigcArchFixParentTaskParamExperiment.isEnabled()) {
                                    CreationDownloadTaskOutput creationDownloadTaskOutput = publicTaskInput.childTaskOutPut.creationDownloadTaskOutput;
                                    if (creationDownloadTaskOutput == null || (str2 = creationDownloadTaskOutput.fileLocalPath) == null) {
                                        str2 = "";
                                    }
                                } else {
                                    str2 = c0lsz.LJIILIIL;
                                }
                                TaskLogExtra taskLogExtra = c0lsz.LJJ;
                                String str4 = taskLogExtra.templateImgPath;
                                String str5 = taskLogExtra.templateResourceId;
                                int i = taskLogExtra.templateType;
                                Source source = c0lsz.LJIIL;
                                CommonParentTaskInput commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput;
                                if (commonParentTaskInput != null && !commonParentTaskInput.ignorePostProcessingFailure) {
                                    z2 = true;
                                }
                                return new GeneralI2VPostProcessingTaskInput(str2, str4, str5, i, strLJ, source, new CommonParentTaskInput(null, null, null, null, 0, 0, null, null, null, null, null, c0lsz.LJIJI, c0lsz.LJIJJLI, c0lsz.LJIIJ, null, 0, null, null, null, null, false, 0, null, null, null, false, false, null, 0, null, 1073727487, null), !z2);
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("template info is empty: templateImgPath ");
                            sbLIZ.append(c0lsz.LJJ.templateImgPath);
                            sbLIZ.append(" templateResourceId ");
                            sbLIZ.append(c0lsz.LJJ.templateResourceId);
                            sbLIZ.append(" templateType ");
                            sbLIZ.append(c0lsz.LJJ.templateType);
                            sbLIZ.append(" param ");
                            sbLIZ.append(c0lsz.LJIILIIL);
                            C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }

                        @Override // X.C0LRS
                        public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
                            GeneralI2VPostProcessingTaskOutput generalI2VPostProcessingTaskOutput = (GeneralI2VPostProcessingTaskOutput) absTaskOutput;
                            if (generalI2VPostProcessingTaskOutput != null) {
                                if (AigcArchFixParentTaskParamExperiment.isEnabled()) {
                                    publicTaskInput.childTaskOutPut.generalI2VPostProcessingTaskOutput = generalI2VPostProcessingTaskOutput;
                                    TaskLogExtra taskLogExtra = c0lsz.LJJ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(c0lsz.LJJ.aigcWorkflowStatus);
                                    sbLIZ.append(", postprocess: finished");
                                    return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, TaskLogExtra.LIZ(taskLogExtra, null, null, null, C2188811AlT.LIZIZ(sbLIZ), 0, null, null, null, null, false, null, 1046527), null, null, 0, null, 260046847);
                                }
                                String str2 = generalI2VPostProcessingTaskOutput.fileLocalPath;
                                if (str2 != null) {
                                    TaskLogExtra taskLogExtra2 = c0lsz.LJJ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(c0lsz.LJJ.aigcWorkflowStatus);
                                    sbLIZ2.append(", postprocess: finished");
                                    return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, str2, null, 0, null, null, null, 0L, null, 0L, TaskLogExtra.LIZ(taskLogExtra2, null, null, null, C2188811AlT.LIZIZ(sbLIZ2), 0, null, null, null, null, false, null, 1046527), null, null, 0, null, 260038655);
                                }
                                return null;
                            }
                            return null;
                        }
                    };
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    return new C0LNP(new C0LVI(), C0LM6.PROGRESS);
                }
                break;
            case -905826493:
                if (str.equals("server")) {
                    return new C0LNO(new C543820LUm(), C0LM6.SERVER);
                }
                break;
            case -838595071:
                if (str.equals("upload")) {
                    return new C541500LLo(new C541400LLe(), C0LM6.IMAGE_UPLOAD);
                }
                break;
            case 107953784:
                if (str.equals("quota")) {
                    return new C0LQC(new C0LST(), C0LM6.QUOTA);
                }
                break;
            case 1427818632:
                if (str.equals("download")) {
                    final C0LMO c0lmo = new C0LMO();
                    final C0LM6 c0lm62 = C0LM6.DOWNLOAD;
                    return new C0LRS<CreationDownloadTaskInput, CreationDownloadTaskOutput>(c0lmo, c0lm62) { // from class: X.0LMM
                        public final C0LTN<CreationDownloadTaskInput, CreationDownloadTaskOutput> LIZLLL;
                        public final C0LM6 LJ;

                        @Override // X.C0LRS
                        public final C0LM6 LIZIZ() {
                            return this.LJ;
                        }

                        @Override // X.C0LRS
                        public final C0LTN<CreationDownloadTaskInput, CreationDownloadTaskOutput> LIZLLL() {
                            return this.LIZLLL;
                        }

                        @Override // X.C0LRS
                        public final C0LSZ LIZ(C0LSZ c0lsz) {
                            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "DOWNLOAD", 0, this.LIZLLL.getTaskId(), null, null, 0, null, null, null, 0, null, null, null, 0L, null, 1000L, null, null, null, 0, null, 264240831);
                        }

                        {
                            super(c0lmo, c0lm62);
                            this.LIZLLL = c0lmo;
                            this.LJ = c0lm62;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:22:0x0030 A[PHI: r7
                          0x0030: PHI (r7v3 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:21:0x002e, B:19:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:24:0x0034 A[PHI: r7
                          0x0034: PHI (r7v2 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:21:0x002e, B:23:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // X.C0LRS
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final X.C09JG LIZJ(X.C0LSZ r23, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r24) {
                            /*
                                r22 = this;
                                r1 = r23
                                java.lang.String r0 = r1.LJIIJ
                                r2 = 0
                                if (r0 == 0) goto L12
                                int r0 = r0.length()
                                if (r0 == 0) goto L12
                                int r0 = r1.LJIIJJI
                                if (r0 < 0) goto L12
                                r2 = 1
                            L12:
                                r5 = 0
                                if (r2 == 0) goto L8b
                                r2 = r24
                                com.ss.android.ugc.aweme.aigc.asynctask.models.ChildTaskOutput r0 = r2.childTaskOutPut
                                com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput r0 = r0.i2VServerTaskOutput
                                if (r0 == 0) goto L21
                                java.util.List<com.ss.android.ugc.aweme.aigc.asynctask.AIGCServerTaskOutput> r11 = r0.videoUrlList
                                if (r11 != 0) goto L23
                            L21:
                                X.13BV r11 = X.C13BV.INSTANCE
                            L23:
                                com.ss.android.ugc.aweme.aigc.asynctask.Source r6 = r1.LJIIL
                                java.lang.String r9 = ""
                                if (r0 == 0) goto L2d
                                java.lang.String r7 = r0.videoUrl
                                if (r7 != 0) goto L30
                            L2d:
                                r7 = r9
                                if (r0 == 0) goto L34
                            L30:
                                com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType r13 = r0.videoUrlType
                                if (r13 != 0) goto L36
                            L34:
                                com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType r13 = com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType.VIDEO
                            L36:
                                X.1Ds4 r0 = X.C0CHQ.LIZ()
                                X.0Moe r0 = r0.LJJIIJZLJL()
                                X.0MYj r4 = r0.getPathService()
                                com.ss.android.ugc.aweme.creative.model.CreativeInfo r14 = new com.ss.android.ugc.aweme.creative.model.CreativeInfo
                                java.lang.String r15 = r1.LJIIJ
                                int r0 = r1.LJIIJJI
                                r18 = 4
                                r17 = r5
                                r19 = r5
                                r16 = r0
                                r14.<init>(r15, r16, r17, r18, r19)
                                X.0MI0 r3 = X.C0MI0.OFFLINE_PROCESSING
                                r0 = 12
                                java.lang.String r8 = X.C2298208zU.LJ(r4, r14, r3, r5, r0)
                                com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput r0 = r2.parentTaskInput
                                com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r0.creativeInfo
                                if (r0 == 0) goto L68
                                java.lang.String r0 = r0.getCreationId()
                                if (r0 == 0) goto L68
                                r9 = r0
                            L68:
                                int r10 = r1.LJIIJJI
                                com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput r0 = r2.parentTaskInput
                                com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r14 = r0.commonParentTaskInput
                                if (r14 == 0) goto L85
                                java.lang.String r15 = r1.LJIJI
                                java.lang.String r0 = r1.LJIJJLI
                                r18 = 0
                                r21 = 1073735679(0x3fffe7ff, float:1.9992675)
                                r17 = r5
                                r19 = r18
                                r20 = r5
                                r16 = r0
                                com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r5 = com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput.LIZ(r14, r15, r16, r17, r18, r19, r20, r21)
                            L85:
                                r12 = r5
                                com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadTaskInput r5 = new com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadTaskInput
                                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
                            L8b:
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0LMM.LIZJ(X.0LSZ, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput):X.09JG");
                        }

                        @Override // X.C0LRS
                        public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
                            CreationDownloadTaskOutput creationDownloadTaskOutput = (CreationDownloadTaskOutput) absTaskOutput;
                            if (creationDownloadTaskOutput != null) {
                                publicTaskInput.childTaskOutPut.creationDownloadTaskOutput = new CreationDownloadTaskOutput(c0lsz.LJ, c0lsz.LJIILL, c0lsz.LJIILLIIL, creationDownloadTaskOutput.fileLocalPath, "");
                                String str2 = creationDownloadTaskOutput.fileLocalPath;
                                TaskLogExtra taskLogExtra = c0lsz.LJJ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(c0lsz.LJJ.aigcWorkflowStatus);
                                sbLIZ.append(", download: finished");
                                return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, str2, null, 0, null, null, null, 0L, null, 0L, TaskLogExtra.LIZ(taskLogExtra, null, null, null, C2188811AlT.LIZIZ(sbLIZ), 0, null, null, null, null, false, null, 1046527), null, null, 0, null, 260038655);
                            }
                            return null;
                        }
                    };
                }
                break;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid type ");
        sbLIZ.append(str);
        C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public static List LJFF(JSONArray jSONArray) {
        final ArrayList arrayList;
        if (jSONArray == null) {
            return C13BV.INSTANCE;
        }
        int length = jSONArray.length();
        ArrayList arrayList2 = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
            JSONObjectProtectorUtils.getString(jSONObject, "name");
            JSONObjectProtectorUtils.getString(jSONObject, "type");
            JSONObjectProtectorUtils.getInt(jSONObject, "slot_index");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("links");
            if (jSONArrayOptJSONArray == null) {
                arrayList = null;
            } else {
                int length2 = jSONArrayOptJSONArray.length();
                arrayList = new ArrayList(length2);
                for (int i2 = 0; i2 < length2; i2++) {
                    arrayList.add(Integer.valueOf(JSONArrayProtectorUtils.getInt(jSONArrayOptJSONArray, i2)));
                }
            }
            arrayList2.add(new Object(arrayList) { // from class: X.0LQd
                public final List<Integer> LIZ;

                {
                    this.LIZ = arrayList;
                }
            });
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.ITaskScheduler
    public final void LIZ(String str) {
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "nodes");
            if (AigcArchFixWorkflowGraphNotClear.isEnabled()) {
                C1195504m1 c1195504m1 = this.LIZ;
                ((LinkedHashMap) c1195504m1.LIZ).clear();
                ((LinkedHashMap) c1195504m1.LIZIZ).clear();
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                int i2 = JSONObjectProtectorUtils.getInt(jSONObject2, FollowStatusChangeMethod.PARAM_UID);
                this.LIZ.LIZ.put(Integer.valueOf(i2), new C542680LQc(i2, JSONObjectProtectorUtils.getString(jSONObject2, "type"), LJFF(jSONObject2.optJSONArray("inputs")), LJFF(jSONObject2.optJSONArray("outputs"))));
            }
            JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject, "links");
            int length2 = jSONArray2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                JSONArray jSONArray3 = JSONArrayProtectorUtils.getJSONArray(jSONArray2, i3);
                int i4 = JSONArrayProtectorUtils.getInt(jSONArray3, 0);
                int i5 = JSONArrayProtectorUtils.getInt(jSONArray3, 1);
                JSONArrayProtectorUtils.getInt(jSONArray3, 2);
                int i6 = JSONArrayProtectorUtils.getInt(jSONArray3, 3);
                JSONArrayProtectorUtils.getInt(jSONArray3, 4);
                JSONArrayProtectorUtils.getString(jSONArray3, 5);
                this.LIZ.LIZ(new C1195604m2(i4, i5, i6));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid workflow json: ");
            sbLIZ.append(e);
            C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.ITaskScheduler
    public final List<InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput>> LIZJ(String str) {
        ArrayList arrayList = new ArrayList();
        LIZLLL(arrayList);
        if (str != null) {
            arrayList.add(LJ("postProcessing"));
        }
        return arrayList;
    }
}
