package com.ss.android.ugc.aweme.wave.graph;

import X.AnonymousClass0950;
import X.C054G;
import X.C09A1;
import X.C09IC;
import X.C0LX3;
import X.C0PEM;
import X.C1264904xD;
import X.C1518305wz;
import X.C1954807lC;
import X.C201955140j;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C326340Cqm;
import X.C326350Cqn;
import X.C365090ETb;
import X.C545300La4;
import X.C550590Lib;
import X.C552640Llu;
import X.C556460Ls4;
import X.C556740LsW;
import X.InterfaceC346201Wa;
import X.InterfaceC383701eN;
import X.InterfaceC550540LiW;
import X.InterfaceC556470Ls5;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowCompatApi;
import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowManagementApiImpl implements AIGCWorkflowManagementApi, AIGCWorkflowCompatApi {
    public final C054G LIZ;
    public final C556460Ls4 LIZIZ;
    public final ConcurrentHashMap<String, InterfaceC383701eN> LIZJ;

    public AIGCWorkflowManagementApiImpl() {
        C365090ETb.LIZIZ();
        this.LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
        this.LIZIZ = new C556460Ls4(new C1264904xD(true));
        this.LIZJ = new ConcurrentHashMap<>();
    }

    public static String LJIJJ(InterfaceC550540LiW interfaceC550540LiW) {
        if (interfaceC550540LiW instanceof C550590Lib) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Success(result=");
            sbLIZ.append(((C550590Lib) interfaceC550540LiW).LIZ);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (interfaceC550540LiW instanceof C326350Cqn) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed(code=");
            C326350Cqn c326350Cqn = (C326350Cqn) interfaceC550540LiW;
            sbLIZ2.append(c326350Cqn.LIZ);
            sbLIZ2.append(", msg=");
            sbLIZ2.append(c326350Cqn.LIZIZ);
            sbLIZ2.append(')');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        throw new C1954807lC();
    }

    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi
    public final InterfaceC550540LiW LJIIJJI(String str) {
        String strLIZIZ;
        InterfaceC550540LiW c550590Lib;
        String strConcat;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0LX3 c0lx3 = C0LX3.LIZIZ;
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(", workflowId=");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        String str2 = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        C201955140j.LJIILL(c0lx3, "AIGCWorkflowManagementApiImpl", "pauseWorkflow start".concat(strLIZIZ));
        if (!C545300La4.LIZ()) {
            c550590Lib = C556740LsW.LIZ();
        } else {
            InterfaceC556470Ls5 interfaceC556470Ls5LIZ = this.LIZIZ.LIZ(str);
            if (interfaceC556470Ls5LIZ == null) {
                c550590Lib = C556740LsW.LIZIZ(str);
            } else {
                interfaceC556470Ls5LIZ.LIZ().LIZIZ();
                c550590Lib = new C550590Lib(interfaceC556470Ls5LIZ.LIZIZ());
            }
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        String strLJIJJ = LJIJJ(c550590Lib);
        StringBuilder sb = new StringBuilder("pauseWorkflow end");
        if (str != null && (strConcat = ", workflowId=".concat(str)) != null) {
            str2 = strConcat;
        }
        sb.append(str2);
        sb.append(", cost=");
        sb.append(jElapsedRealtime2);
        sb.append("ms, result=");
        sb.append(strLJIJJ);
        C201955140j.LJIILL(c0lx3, "AIGCWorkflowManagementApiImpl", sb.toString());
        C23250099c.LIZLLL(this.LIZ, null, null, new C326340Cqm("pauseWorkflow", !(c550590Lib instanceof C326350Cqn), jElapsedRealtime2, str, c550590Lib, null), 3);
        return c550590Lib;
    }

    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi
    public final InterfaceC550540LiW LJIILJJIL(String str) {
        String strLIZIZ;
        InterfaceC550540LiW c550590Lib;
        String strConcat;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0LX3 c0lx3 = C0LX3.LIZIZ;
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(", workflowId=");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        String str2 = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        C201955140j.LJIILL(c0lx3, "AIGCWorkflowManagementApiImpl", "resumeWorkflow start".concat(strLIZIZ));
        if (!C545300La4.LIZ()) {
            c550590Lib = C556740LsW.LIZ();
        } else {
            InterfaceC556470Ls5 interfaceC556470Ls5LIZ = this.LIZIZ.LIZ(str);
            if (interfaceC556470Ls5LIZ == null) {
                c550590Lib = C556740LsW.LIZIZ(str);
            } else {
                interfaceC556470Ls5LIZ.LIZ().LIZJ();
                c550590Lib = new C550590Lib(interfaceC556470Ls5LIZ.LIZIZ());
            }
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        String strLJIJJ = LJIJJ(c550590Lib);
        StringBuilder sb = new StringBuilder("resumeWorkflow end");
        if (str != null && (strConcat = ", workflowId=".concat(str)) != null) {
            str2 = strConcat;
        }
        sb.append(str2);
        sb.append(", cost=");
        sb.append(jElapsedRealtime2);
        sb.append("ms, result=");
        sb.append(strLJIJJ);
        C201955140j.LJIILL(c0lx3, "AIGCWorkflowManagementApiImpl", sb.toString());
        C23250099c.LIZLLL(this.LIZ, null, null, new C326340Cqm("resumeWorkflow", !(c550590Lib instanceof C326350Cqn), jElapsedRealtime2, str, c550590Lib, null), 3);
        return c550590Lib;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r21, X.InterfaceC1364105Vn<? super X.InterfaceC550540LiW<X.C1346605Ou>> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowCompatApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r19, X.InterfaceC1364105Vn<? super java.lang.Integer> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LIZLLL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r23, X.InterfaceC1364105Vn<? super X.InterfaceC550540LiW<X.C552940LmO>> r24) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C0LPX r21, X.InterfaceC1364105Vn<? super X.InterfaceC550540LiW<java.util.List<X.C552940LmO>>> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LJFF(X.0LPX, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi
    public final InterfaceC346201Wa LJI(String str, C552640Llu c552640Llu) {
        if (!C545300La4.LIZ()) {
            return C1518305wz.LL;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0LX3 c0lx3 = C0LX3.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeArtifact start, workflowId=");
        sbLIZ.append(str);
        C201955140j.LJIILL(c0lx3, "AIGCWorkflowManagementApiImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.LIZ(str);
        C556460Ls4 c556460Ls4 = this.LIZIZ;
        c552640Llu.getClass();
        AnonymousClass0950 anonymousClass0950LIZ = C09IC.LIZ(c556460Ls4.LIZIZ(str, "server_task_id"));
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("observeArtifact end, workflowId=");
        sbLIZ2.append(str);
        sbLIZ2.append(", cost=");
        sbLIZ2.append(jElapsedRealtime2);
        sbLIZ2.append("ms, result=");
        sbLIZ2.append(anonymousClass0950LIZ);
        C201955140j.LJIILL(c0lx3, "AIGCWorkflowManagementApiImpl", C2188811AlT.LIZIZ(sbLIZ2));
        return anonymousClass0950LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r11, X.InterfaceC1364105Vn<? super X.InterfaceC346201Wa<X.C1346605Ou>> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LJII(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowCompatApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.lang.String r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LJIIIIZZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a8 A[Catch: all -> 0x0323, TryCatch #1 {all -> 0x0323, blocks: (B:15:0x004f, B:53:0x0195, B:54:0x0198, B:56:0x019c, B:62:0x01a8, B:64:0x01db, B:70:0x01e7, B:71:0x0218), top: B:126:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0237 A[Catch: all -> 0x0321, TryCatch #0 {all -> 0x0321, blocks: (B:75:0x0233, B:77:0x0237, B:78:0x023d), top: B:124:0x0233 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023d A[Catch: all -> 0x0321, TryCatch #0 {all -> 0x0321, blocks: (B:75:0x0233, B:77:0x0237, B:78:0x023d), top: B:124:0x0233 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e2 A[Catch: all -> 0x031b, TryCatch #4 {all -> 0x031b, blocks: (B:96:0x02de, B:98:0x02e2, B:99:0x02e8), top: B:127:0x02de }] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v15, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v20, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.String r26, X.InterfaceC1364105Vn<? super X.InterfaceC550540LiW<X.C552940LmO>> r27) {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LJIIIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowCompatApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(java.lang.String r21, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.migration.model.OldFrameworkInputModel> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LJIIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowCompatApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(java.lang.String r19, X.InterfaceC1364105Vn<? super java.lang.String> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LJIILLIIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0065 -> B:12:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0145 -> B:65:0x015b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0148 -> B:68:0x0160). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(X.C0LPX r12, X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC556470Ls5>> r13) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LJIJI(X.0LPX, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c4  */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r21, X.InterfaceC545310La5 r22, X.InterfaceC1364105Vn<? super X.InterfaceC550540LiW<X.C552940LmO>> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LIZIZ(java.lang.String, X.0La5, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0168 A[Catch: all -> 0x01c1, TryCatch #0 {all -> 0x01c1, blocks: (B:55:0x018a, B:56:0x018d, B:49:0x0160, B:51:0x0168, B:52:0x016d, B:62:0x01bd), top: B:67:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d A[Catch: all -> 0x01c1, TryCatch #0 {all -> 0x01c1, blocks: (B:55:0x018a, B:56:0x018d, B:49:0x0160, B:51:0x0168, B:52:0x016d, B:62:0x01bd), top: B:67:0x002c }] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v22, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r23, X.EnumC2398509aZ r24, X.InterfaceC1364105Vn<? super X.InterfaceC550540LiW<X.C552940LmO>> r25) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LIZJ(java.lang.String, X.09aZ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fc  */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.lang.String r22, java.util.Map<X.InterfaceC553010LmV, ? extends X.InterfaceC1406105et> r23, X.InterfaceC1364105Vn<? super X.InterfaceC550540LiW<X.C552940LmO>> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LJIIJ(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0246  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.13BV] */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(X.C552940LmO r19, com.ss.android.ugc.aweme.aigc.migration.model.OldFrameworkInputModel r20, X.InterfaceC1364105Vn<? super X.InterfaceC550540LiW<java.lang.String>> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LJIILIIL(X.0LmO, com.ss.android.ugc.aweme.aigc.migration.model.OldFrameworkInputModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    @Override // com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(java.lang.String r21, X.InterfaceC553010LmV r22, X.InterfaceC1364105Vn<? super X.InterfaceC550540LiW<X.InterfaceC1406105et>> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LJIILL(java.lang.String, X.0LmV, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(java.lang.String r23, X.InterfaceC1364105Vn r24, X.C555420LqO r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LJIIZILJ(java.lang.String, X.05Vn, X.0LqO):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(X.C0LPX r10, java.util.Set<java.lang.String> r11, X.InterfaceC1364105Vn<? super java.util.List<X.C552940LmO>> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl.LJIJ(X.0LPX, java.util.Set, X.05Vn):java.lang.Object");
    }
}
