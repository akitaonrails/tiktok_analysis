package com.ss.android.ugc.aweme.tako.ccl.impl;

import X.AbstractC596640Nag;
import X.C054G;
import X.C09IR;
import X.C0PEM;
import X.C0XK4;
import X.C1302080jzK;
import X.C1697810uHb;
import X.C1954807lC;
import X.C19990113Jj;
import X.C2252331DDr;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C596520NaU;
import X.C596610Nad;
import X.C596620Nae;
import X.C596630Naf;
import X.C596660Nai;
import X.C596670Naj;
import X.C596680Nak;
import X.C596690Nal;
import X.C596710Nan;
import X.C596720Nao;
import X.C596780Nau;
import X.C596870Nb3;
import X.C596900Nb6;
import X.C597040NbK;
import X.C639060P4u;
import X.InterfaceC1364105Vn;
import X.InterfaceC596800Naw;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandResponse;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes10.dex */
public final class TakoClientAgentServiceImpl implements TakoClientAgentService {
    public final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()).plus(new C639060P4u(CoroutineExceptionHandler.LJJLIL, 8)));
    public final List<InterfaceC596800Naw> LIZIZ = C1697810uHb.LJIIJJI(new C596870Nb3(), new C596900Nb6());
    public final CopyOnWriteArrayList<Function2<AgentClientEnv, InterfaceC1364105Vn<? super AgentClientEnv>, Object>> LIZJ = new CopyOnWriteArrayList<>();
    public final C2252331DDr LIZLLL = C09IR.LIZIZ(0, 0, null, 7);

    @Override // com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService
    public final Unit init() {
        Iterator<InterfaceC596800Naw> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().Lf(this.LIZ, new C596780Nau(this));
        }
        C23250099c.LIZLLL(this.LIZ, null, null, new C596520NaU(this, null), 3);
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService
    public final C2252331DDr LIZ() {
        return this.LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006c -> B:22:0x0072). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv> r21) {
        /*
            r20 = this;
            r3 = r21
            boolean r0 = r3 instanceof X.C596570NaZ
            r7 = r20
            if (r0 == 0) goto L2a
            r5 = r3
            X.0NaZ r5 = (X.C596570NaZ) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L16:
            java.lang.Object r6 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 != r3) goto L30
            com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv r7 = r5.LLILLJJLI
            java.lang.Object r2 = r5.LL
            java.util.Iterator r2 = (java.util.Iterator) r2
            goto L6f
        L2a:
            X.0NaZ r5 = new X.0NaZ
            r5.<init>(r7, r3)
            goto L16
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r6)
            java.util.concurrent.CopyOnWriteArrayList<kotlin.jvm.functions.Function2<com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv, X.05Vn<? super com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv>, java.lang.Object>> r0 = r7.LIZJ
            com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv r7 = new com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv
            r8 = 0
            r13 = 0
            r18 = 511(0x1ff, float:7.16E-43)
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r19 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19)
            java.util.Iterator r2 = r0.iterator()
        L56:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r2.next()
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r5.LL = r2     // Catch: java.lang.Throwable -> L78
            r5.LLILLJJLI = r7     // Catch: java.lang.Throwable -> L78
            r5.LLILZIL = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r6 = r0.invoke(r7, r5)     // Catch: java.lang.Throwable -> L78
            if (r6 != r4) goto L72
            goto L94
        L6f:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Throwable -> L78
        L72:
            com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv r6 = (com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv) r6     // Catch: java.lang.Throwable -> L78
            X.C189200o6.m2constructorimpl(r6)     // Catch: java.lang.Throwable -> L78
            goto L84
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r6 = new X.00Yq
            r6.<init>(r0)
            X.C189200o6.m2constructorimpl(r6)
        L84:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r6)
            if (r1 == 0) goto L90
            java.lang.String r0 = "getAgentClientEnv error, fallback to last result"
            X.C1AF0.LJFF(r1, r0)
            r6 = r7
        L90:
            r7 = r6
            com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv r7 = (com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv) r7
            goto L56
        L94:
            return r4
        L95:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJFF(com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest r10, X.InterfaceC1364105Vn<? super X.AbstractC596640Nag> r11) {
        /*
            boolean r0 = r11 instanceof X.C596590Nab
            if (r0 == 0) goto L76
            r7 = r11
            X.0Nab r7 = (X.C596590Nab) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r8 = 1
            if (r0 == 0) goto L37
            if (r0 != r8) goto L82
            X.C155000ia.LIZIZ(r1)
        L22:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L74
            java.lang.Object r1 = X.C13LP.LJJJLL(r1)
            X.00C2 r1 = (X.C00C2) r1
        L2c:
            java.util.Objects.toString(r1)
            if (r1 != 0) goto L7c
            X.0Naf r0 = new X.0Naf
            r0.<init>()
            return r0
        L37:
            X.C155000ia.LIZIZ(r1)
            java.lang.Class<com.ss.android.ugc.aweme.agent.tools.spi.TarsAgentToolService> r0 = com.ss.android.ugc.aweme.agent.tools.spi.TarsAgentToolService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r9 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.agent.tools.spi.TarsAgentToolService r9 = (com.ss.android.ugc.aweme.agent.tools.spi.TarsAgentToolService) r9
            if (r9 == 0) goto L74
            X.006Z r5 = new X.006Z
            java.lang.String r4 = r10.id
            java.lang.String r3 = r10.command
            com.google.gson.Gson r2 = X.C597040NbK.LIZ()
            java.lang.String r1 = r10.arguments
            if (r1 != 0) goto L5a
            java.lang.String r1 = "{}"
        L5a:
            java.lang.Class<com.google.gson.n> r0 = com.google.gson.n.class
            java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r1, r0)
            com.google.gson.k r0 = (com.google.gson.k) r0
            r5.<init>(r4, r0, r3)
            java.util.List r1 = java.util.Collections.singletonList(r5)
            r7.LLILLJJLI = r8
            java.lang.String r0 = "service-main"
            java.lang.Object r1 = r9.LIZIZ(r0, r1)
            if (r1 != r6) goto L22
            return r6
        L74:
            r1 = 0
            goto L2c
        L76:
            X.0Nab r7 = new X.0Nab
            r7.<init>(r11)
            goto L12
        L7c:
            X.0Nad r0 = new X.0Nad
            r0.<init>(r1)
            return r0
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl.LJFF(com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    @Override // com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(kotlin.jvm.functions.Function2<? super com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv, ? super X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv>, ? extends java.lang.Object> r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C596560NaY
            if (r0 == 0) goto L27
            r5 = r8
            X.0NaY r5 = (X.C596560NaY) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 == r3) goto L2d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L27:
            X.0NaY r5 = new X.0NaY
            r5.<init>(r6, r8)
            goto L12
        L2d:
            X.0NaT r2 = r5.LL
            goto L59
        L30:
            X.C155000ia.LIZIZ(r1)
            kotlin.coroutines.CoroutineContext r1 = r5.getContext()
            X.1DFR r0 = X.AbstractC2252651DEx.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r0)
            X.1DEx r1 = (X.AbstractC2252651DEx) r1
            if (r1 != 0) goto L43
            X.1DFB r1 = X.C0PEM.LIZJ
        L43:
            X.0NaT r2 = new X.0NaT
            r0 = 0
            r2.<init>(r1, r7, r0)
            java.util.concurrent.CopyOnWriteArrayList<kotlin.jvm.functions.Function2<com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv, X.05Vn<? super com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv>, java.lang.Object>> r0 = r6.LIZJ
            r0.add(r2)
            r5.LL = r2     // Catch: java.lang.Throwable -> L64
            r5.LLILZ = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = X.AnonymousClass0958.LIZ(r5)     // Catch: java.lang.Throwable -> L64
            if (r0 != r4) goto L5c
            return r4
        L59:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L62
        L5c:
            X.08jB r0 = new X.08jB     // Catch: java.lang.Throwable -> L62
            r0.<init>()     // Catch: java.lang.Throwable -> L62
            throw r0     // Catch: java.lang.Throwable -> L62
        L62:
            r1 = move-exception
            goto L65
        L64:
            r1 = move-exception
        L65:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L69
            goto L6b
        L69:
            r1 = move-exception
            goto L65
        L6b:
            java.util.concurrent.CopyOnWriteArrayList<kotlin.jvm.functions.Function2<com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv, X.05Vn<? super com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv>, java.lang.Object>> r0 = r6.LIZJ
            r0.remove(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl.LIZJ(kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest r12, X.InterfaceC1364105Vn<? super X.AbstractC596640Nag> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl.LJ(com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest, X.05Vn):java.lang.Object");
    }

    public static AgentCommandResponse LIZLLL(AgentCommandRequest agentCommandRequest, AbstractC596640Nag abstractC596640Nag, long j, long j2) {
        String json = null;
        if (abstractC596640Nag instanceof C596610Nad) {
            String str = agentCommandRequest.id;
            AgentCommandResponse.ResultStatus resultStatus = AgentCommandResponse.ResultStatus.RESULT_STATUS_SUCCESS;
            Object obj = ((C596610Nad) abstractC596640Nag).LIZIZ.LIZIZ;
            if (obj != null) {
                json = GsonProtectorUtils.toJson(C597040NbK.LIZ(), obj);
            }
            return new AgentCommandResponse(str, resultStatus, json, null, Long.valueOf(C19990113Jj.LJIIIZ(j)), Long.valueOf(C0XK4.LIZIZ()));
        }
        if (abstractC596640Nag instanceof C596630Naf) {
            return new AgentCommandResponse(agentCommandRequest.id, AgentCommandResponse.ResultStatus.RESULT_STATUS_FAILURE, "{\"success\": false, \"message\": \"service error\"}", new AgentCommandResponse.ErrorInfo("ServiceError", ((C596630Naf) abstractC596640Nag).LIZIZ, null, Long.valueOf(C0XK4.LIZIZ())), Long.valueOf(C19990113Jj.LJIIIZ(j)), Long.valueOf(C0XK4.LIZIZ()));
        }
        if (abstractC596640Nag instanceof C596620Nae) {
            String str2 = agentCommandRequest.id;
            AgentCommandResponse.ResultStatus resultStatus2 = AgentCommandResponse.ResultStatus.RESULT_STATUS_FAILURE;
            long jLJIIIZ = C19990113Jj.LJIIIZ(j);
            long jLIZIZ = C0XK4.LIZIZ();
            String message = ((C596620Nae) abstractC596640Nag).LIZIZ.getMessage();
            if (message == null) {
                message = "";
            }
            return new AgentCommandResponse(str2, resultStatus2, "{\"success\": false, \"message\": \"service error\"}", new AgentCommandResponse.ErrorInfo("ExecutionError", message, null, Long.valueOf(C0XK4.LIZIZ())), Long.valueOf(jLJIIIZ), Long.valueOf(jLIZIZ));
        }
        if (Intrinsics.LJFF(abstractC596640Nag, C596710Nan.LIZIZ)) {
            return new AgentCommandResponse(agentCommandRequest.id, AgentCommandResponse.ResultStatus.RESULT_STATUS_TIMEOUT, "{\"success\": false, \"message\": \"time out\"}", null, Long.valueOf(C19990113Jj.LJIIIZ(j)), Long.valueOf(C0XK4.LIZIZ()));
        }
        if (Intrinsics.LJFF(abstractC596640Nag, C596680Nak.LIZIZ)) {
            return null;
        }
        if (Intrinsics.LJFF(abstractC596640Nag, C596660Nai.LIZIZ)) {
            return new AgentCommandResponse(agentCommandRequest.id, AgentCommandResponse.ResultStatus.RESULT_STATUS_FAILURE, "{\"success\": false, \"message\": \"service error\"}", new AgentCommandResponse.ErrorInfo("DebugError", "client debug, disable all tool", null, Long.valueOf(C0XK4.LIZIZ())), Long.valueOf(C19990113Jj.LJIIIZ(C1302080jzK.LIZJ(j2))), Long.valueOf(C0XK4.LIZIZ()));
        }
        if (Intrinsics.LJFF(abstractC596640Nag, C596690Nal.LIZIZ)) {
            return new AgentCommandResponse(agentCommandRequest.id, AgentCommandResponse.ResultStatus.RESULT_STATUS_FAILURE, "{\"success\": false, \"message\": \"Switched to new video. Previous command canceled.\"}", new AgentCommandResponse.ErrorInfo("NotCurrentAweme", "Switched to new video. Previous command canceled.", null, Long.valueOf(C0XK4.LIZIZ())), Long.valueOf(C19990113Jj.LJIIIZ(C1302080jzK.LIZJ(j2))), Long.valueOf(C0XK4.LIZIZ()));
        }
        if (Intrinsics.LJFF(abstractC596640Nag, C596670Naj.LIZIZ)) {
            return new AgentCommandResponse(agentCommandRequest.id, AgentCommandResponse.ResultStatus.RESULT_STATUS_FAILURE, "{\"success\": false, \"message\": \"service error\"}", new AgentCommandResponse.ErrorInfo("ByteSyncIgnored", "Command cost too long, ignored.", null, Long.valueOf(C0XK4.LIZIZ())), Long.valueOf(C19990113Jj.LJIIIZ(C1302080jzK.LIZJ(j2))), Long.valueOf(C0XK4.LIZIZ()));
        }
        if (abstractC596640Nag instanceof C596720Nao) {
            return null;
        }
        throw new C1954807lC();
    }
}
