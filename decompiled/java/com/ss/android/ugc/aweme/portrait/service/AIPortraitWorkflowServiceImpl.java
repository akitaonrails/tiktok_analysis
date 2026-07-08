package com.ss.android.ugc.aweme.portrait.service;

import X.C099R;
import X.C0C64;
import X.C545330La7;
import X.EnumC2398509aZ;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.ab.AIPortraitWorkflowInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitConsumptionModel;
import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitWorkflowServiceImpl implements IPortraitWorkflowService {
    public final AIPortraitWorkflowInfo LIZ = (AIPortraitWorkflowInfo) C0C64.LJIILLIIL().LJJII(AIPortraitWorkflowInfo.class, null, "studio_ai_portrait_server_workflow_info", true);
    public final AIPortraitWorkflowInfo LIZIZ = (AIPortraitWorkflowInfo) C0C64.LJIILLIIL().LJJII(AIPortraitWorkflowInfo.class, null, "studio_ai_portrait_no_image_server_workflow_info", true);
    public final AIGCWorkflowManagementApi LIZJ = (AIGCWorkflowManagementApi) PluggableExtentionKt.pluggableSpi$default(AIGCWorkflowManagementApi.class, false, false, false, 14, null);

    public static boolean LJII(AIPortraitConsumptionModel aIPortraitConsumptionModel, HashMap map) {
        if (aIPortraitConsumptionModel != null) {
            int i = aIPortraitConsumptionModel.genType;
            if (i == 0 || i == 1 || i != 2) {
                return false;
            }
            return true;
        }
        if (!map.containsKey("image_0") && !map.containsKey("template_id")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService
    public final Object LIZ(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        AIGCWorkflowManagementApi aIGCWorkflowManagementApi = this.LIZJ;
        if (aIGCWorkflowManagementApi != null) {
            Object objLIZJ = aIGCWorkflowManagementApi.LIZJ(str, EnumC2398509aZ.CANCEL, interfaceC1364105Vn);
            if (objLIZJ == C099R.LJFF()) {
                return objLIZJ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService
    public final Object LIZIZ(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        AIGCWorkflowManagementApi aIGCWorkflowManagementApi = this.LIZJ;
        if (aIGCWorkflowManagementApi != null) {
            Object objLIZIZ = aIGCWorkflowManagementApi.LIZIZ(str, C545330La7.LIZ, interfaceC1364105Vn);
            if (objLIZIZ == C099R.LJFF()) {
                return objLIZIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    @Override // com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.portrait.model.GenerateFailedInfo> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C550380LiG
            if (r0 == 0) goto L46
            r5 = r8
            X.0LiG r5 = (X.C550380LiG) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r3 = r5.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L36
            if (r0 != r1) goto La2
            X.C155000ia.LIZIZ(r3)
        L23:
            X.0LiW r3 = (X.InterfaceC550540LiW) r3
            if (r3 == 0) goto Laa
            java.lang.Object r1 = X.C550520LiU.LIZ(r3)
            X.05Ou r1 = (X.C1346605Ou) r1
            if (r1 == 0) goto Laa
            boolean r0 = X.C542430LPd.LIZ(r1)
            if (r0 != 0) goto L4c
            return r4
        L36:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r0 = r6.LIZJ
            if (r0 == 0) goto Laa
            r5.LLILLL = r1
            java.lang.Object r3 = r0.LIZ(r7, r5)
            if (r3 != r2) goto L23
            return r2
        L46:
            X.0LiG r5 = new X.0LiG
            r5.<init>(r6, r8)
            goto L12
        L4c:
            java.util.Map<java.lang.String, X.05f1> r0 = r1.LIZ
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L5b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C1406605ey
            if (r0 == 0) goto L5b
            r3.add(r1)
            goto L5b
        L6d:
            java.lang.Object r3 = X.C13LP.LJJJLL(r3)
            X.05ey r3 = (X.C1406605ey) r3
            if (r3 != 0) goto L76
            return r4
        L76:
            java.lang.String r0 = r3.LIZIZ
            X.07fc r2 = X.C1920107fb.LIZIZ(r0)
            java.lang.String r0 = r2.LIZ
            java.lang.String r1 = "violation"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L98
            java.lang.String r0 = r2.LIZLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L98
            com.ss.android.ugc.aweme.portrait.model.GenerateFailedInfo r2 = new com.ss.android.ugc.aweme.portrait.model.GenerateFailedInfo
            X.0Lhs r1 = X.EnumC550140Lhs.OTHERS
            int r0 = r3.LIZ
            r2.<init>(r1, r0)
            return r2
        L98:
            com.ss.android.ugc.aweme.portrait.model.GenerateFailedInfo r2 = new com.ss.android.ugc.aweme.portrait.model.GenerateFailedInfo
            X.0Lhs r1 = X.EnumC550140Lhs.TNS_INTERCEPT
            int r0 = r3.LIZ
            r2.<init>(r1, r0)
            return r2
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Laa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r8, X.InterfaceC1364105Vn<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C550400LiI
            if (r0 == 0) goto L53
            r6 = r9
            X.0LiI r6 = (X.C550400LiI) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L3a
            if (r0 != r3) goto L59
            X.C155000ia.LIZIZ(r1)
        L23:
            X.0LiW r1 = (X.InterfaceC550540LiW) r1
            if (r1 == 0) goto L39
            java.lang.Object r0 = X.C550520LiU.LIZ(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L39
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            X.0LmO r0 = (X.C552940LmO) r0
            if (r0 == 0) goto L39
            java.lang.String r4 = r0.LIZ
        L39:
            return r4
        L3a:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r2 = r7.LIZJ
            if (r2 == 0) goto L39
            X.00tW r1 = new X.00tW
            java.util.List r0 = java.util.Collections.singletonList(r8)
            r1.<init>(r0)
            r6.LLILLL = r3
            java.lang.Object r1 = r2.LJFF(r1, r6)
            if (r1 != r5) goto L23
            return r5
        L53:
            X.0LiI r6 = new X.0LiI
            r6.<init>(r7, r9)
            goto L12
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl.LIZLLL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r9, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.portrait.model.AIPortraitResultItem>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C550410LiJ
            if (r0 == 0) goto L99
            r6 = r10
            X.0LiJ r6 = (X.C550410LiJ) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L99
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 2
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L5b
            if (r0 == r2) goto L6d
            if (r0 != r5) goto La0
            X.C155000ia.LIZIZ(r1)
        L26:
            boolean r0 = r1 instanceof java.util.List
            if (r0 != 0) goto L2b
            r1 = r4
        L2b:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto La8
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L3e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r6.next()
            com.ss.android.ugc.aweme.aigc.graph.nodes.slot.DownloadItemResult r0 = (com.ss.android.ugc.aweme.aigc.graph.nodes.slot.DownloadItemResult) r0
            com.ss.android.ugc.aweme.portrait.model.AIPortraitResultItem r5 = new com.ss.android.ugc.aweme.portrait.model.AIPortraitResultItem
            java.lang.String r3 = r0.url
            java.lang.String r2 = r0.localFilePath
            java.lang.String r1 = r0.thumbnailUrl
            java.lang.String r0 = r0.thumbnailLocalFilePath
            r5.<init>(r3, r2, r1, r0)
            r4.add(r5)
            goto L3e
        L5b:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r1 = r8.LIZJ
            if (r1 == 0) goto La8
            X.0Lle r0 = X.C552480Lle.INSTANCE
            r6.LLILLL = r2
            java.lang.Object r1 = r1.LJIILL(r9, r0, r6)
            if (r1 != r7) goto L70
            return r7
        L6d:
            X.C155000ia.LIZIZ(r1)
        L70:
            X.0LiW r1 = (X.InterfaceC550540LiW) r1
            if (r1 == 0) goto La8
            java.lang.Object r3 = X.C550520LiU.LIZ(r1)
            X.05et r3 = (X.InterfaceC1406105et) r3
            if (r3 == 0) goto La8
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory> r1 = com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory.class
            r0 = 0
            java.lang.Object r1 = r2.getService(r1, r0, r0)
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory r1 = (com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory) r1
            X.0LiT r0 = new X.0LiT
            r0.<init>()
            java.lang.reflect.Type r0 = r0.LIZ
            r6.LLILLL = r5
            java.lang.Object r1 = r1.LIZIZ(r3, r0, r6)
            if (r1 != r7) goto L26
            return r7
        L99:
            X.0LiJ r6 = new X.0LiJ
            r6.<init>(r8, r10)
            goto L12
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    @Override // com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r9, X.InterfaceC1364105Vn<? super java.lang.String> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C550390LiH
            if (r0 == 0) goto L69
            r6 = r10
            X.0LiH r6 = (X.C550390LiH) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 2
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L3d
            if (r0 != r5) goto L6f
            X.C155000ia.LIZIZ(r1)
        L26:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L77
            return r1
        L2b:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r1 = r8.LIZJ
            if (r1 == 0) goto L77
            X.0Llu r0 = X.C552640Llu.INSTANCE
            r6.LLILLL = r2
            java.lang.Object r1 = r1.LJIILL(r9, r0, r6)
            if (r1 != r7) goto L40
            return r7
        L3d:
            X.C155000ia.LIZIZ(r1)
        L40:
            X.0LiW r1 = (X.InterfaceC550540LiW) r1
            if (r1 == 0) goto L77
            java.lang.Object r3 = X.C550520LiU.LIZ(r1)
            X.05et r3 = (X.InterfaceC1406105et) r3
            if (r3 == 0) goto L77
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory> r1 = com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory.class
            r0 = 0
            java.lang.Object r1 = r2.getService(r1, r0, r0)
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory r1 = (com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory) r1
            X.0LiV r0 = new X.0LiV
            r0.<init>()
            java.lang.reflect.Type r0 = r0.LIZ
            r6.LLILLL = r5
            java.lang.Object r1 = r1.LIZIZ(r3, r0, r6)
            if (r1 != r7) goto L26
            return r7
        L69:
            X.0LiH r6 = new X.0LiH
            r6.<init>(r8, r10)
            goto L12
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl.LJI(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ea A[PHI: r22
      0x02ea: PHI (r22v3 java.lang.String) = (r22v2 java.lang.String), (r22v6 java.lang.String) binds: [B:176:0x02e6, B:139:0x0203] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0320 A[PHI: r10
      0x0320: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v8 java.lang.String) binds: [B:197:0x031c, B:118:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x039c  */
    @Override // com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.portrait.model.AIPortraitModel r37, com.ss.android.ugc.aweme.creative.model.CreativeInfo r38, X.InterfaceC1364105Vn<? super java.lang.String> r39) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowServiceImpl.LJ(com.ss.android.ugc.aweme.portrait.model.AIPortraitModel, com.ss.android.ugc.aweme.creative.model.CreativeInfo, X.05Vn):java.lang.Object");
    }
}
