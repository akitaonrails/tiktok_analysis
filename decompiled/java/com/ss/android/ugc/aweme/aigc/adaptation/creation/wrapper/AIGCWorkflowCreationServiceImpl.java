package com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper;

import X.C08QT;
import X.C098200Yq;
import X.C099R;
import X.C09RB;
import X.C0LY5;
import X.C13LP;
import X.C15438062q;
import X.C189200o6;
import X.C1939607ik;
import X.C470601sO;
import X.C539070LCf;
import X.C542730LQh;
import X.C545120LZm;
import X.C545130LZn;
import X.C553670LnZ;
import X.EnumC2398509aZ;
import X.EnumC545550LaT;
import X.InterfaceC1364105Vn;
import X.InterfaceC545310La5;
import X.InterfaceC553510LnJ;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowCompatApi;
import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowCreationServiceImpl implements AIGCWorkflowCreationService {
    public final AIGCWorkflowManagementApi LIZ;
    public final AIGCWorkflowCompatApi LIZIZ;
    public final ConcurrentHashMap<String, Set<String>> LIZJ;

    public AIGCWorkflowCreationServiceImpl() {
        Object c098200Yq;
        Object c098200Yq2;
        C470601sO c470601sO = C470601sO.LIZ;
        try {
            c098200Yq = (AIGCWorkflowManagementApi) PluggableExtentionKt.pluggableSpi$default(AIGCWorkflowManagementApi.class, false, false, false, 14, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (th instanceof CancellationException) {
                throw th;
            }
            c470601sO.getClass();
            C470601sO.LIZ(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LIZ = (AIGCWorkflowManagementApi) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        C470601sO c470601sO2 = C470601sO.LIZ;
        try {
            c098200Yq2 = (AIGCWorkflowCompatApi) PluggableExtentionKt.pluggableSpi$default(AIGCWorkflowCompatApi.class, false, false, false, 14, null);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (th2 instanceof CancellationException) {
                throw th2;
            }
            c470601sO2.getClass();
            C470601sO.LIZ(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        this.LIZIZ = (AIGCWorkflowCompatApi) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
        this.LIZJ = new ConcurrentHashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    public final void LJIILJJIL(LifecycleOwner lifecycleOwner) {
        AIGCWorkflowManagementApi aIGCWorkflowManagementApi;
        InterfaceC553510LnJ interfaceC553510LnJLIZ;
        String name = lifecycleOwner.getClass().getName();
        C470601sO c470601sO = C470601sO.LIZ;
        try {
            Set<String> setRemove = this.LIZJ.remove(name);
            if (setRemove != null && (aIGCWorkflowManagementApi = this.LIZ) != null && (interfaceC553510LnJLIZ = C553670LnZ.LIZ(aIGCWorkflowManagementApi)) != null) {
                Iterator<String> it2 = setRemove.iterator();
                while (it2.hasNext()) {
                    interfaceC553510LnJLIZ.LIZ(it2.next(), name);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!(th instanceof CancellationException)) {
                c470601sO.getClass();
                C470601sO.LIZ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C1346605Ou> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C554630Lp7
            if (r0 == 0) goto L3b
            r4 = r7
            X.0Lp7 r4 = (X.C554630Lp7) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L41
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0LiW r3 = (X.InterfaceC550540LiW) r3
            if (r3 == 0) goto L49
            java.lang.Object r0 = X.C550520LiU.LIZ(r3)
            return r0
        L2b:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r0 = r5.LIZ
            if (r0 == 0) goto L49
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZ(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L3b:
            X.0Lp7 r4 = new X.0Lp7
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L49:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r8, X.InterfaceC1364105Vn<? super X.C552940LmO> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C554530Lox
            if (r0 == 0) goto L7e
            r6 = r9
            X.0Lox r6 = (X.C554530Lox) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            java.lang.String r4 = "AIGCWorkflowCreationServiceImpl"
            r3 = 1
            if (r0 == 0) goto L50
            if (r0 != r3) goto L84
            java.lang.Object r8 = r6.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r1)
        L28:
            X.0LiW r1 = (X.InterfaceC550540LiW) r1
            if (r1 == 0) goto L7c
            java.lang.Object r0 = X.C550520LiU.LIZ(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L7c
            java.lang.Object r3 = X.C13LP.LJJJLL(r0)
            if (r3 != 0) goto L4f
        L3a:
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getTaskInfoByServerTaskId returned null, serverTaskId="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r2, r4, r0)
        L4f:
            return r3
        L50:
            X.C155000ia.LIZIZ(r1)
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getTaskInfoByServerTaskId serverTaskId="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r2, r4, r0)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r1 = r7.LIZ
            if (r1 == 0) goto L7c
            X.0LPG r0 = new X.0LPG
            r0.<init>(r8)
            r6.LL = r8
            r6.LLILZ = r3
            java.lang.Object r1 = r1.LJFF(r0, r6)
            if (r1 != r5) goto L28
            return r5
        L7c:
            r3 = 0
            goto L3a
        L7e:
            X.0Lox r6 = new X.0Lox
            r6.<init>(r7, r9)
            goto L12
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r6, X.InterfaceC1364105Vn<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C554610Lp5
            if (r0 == 0) goto L3f
            r4 = r7
            X.0Lp5 r4 = (X.C554610Lp5) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L45
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
        L28:
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowCompatApi r0 = r5.LIZIZ
            if (r0 == 0) goto L3d
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZLLL(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L3d:
            r0 = 0
            goto L28
        L3f:
            X.0Lp5 r4 = new X.0Lp5
            r4.<init>(r5, r7)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LIZLLL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C552940LmO> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C554580Lp2
            if (r0 == 0) goto L48
            r4 = r7
            X.0Lp2 r4 = (X.C554580Lp2) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0LiW r1 = (X.InterfaceC550540LiW) r1
            if (r1 == 0) goto L56
            java.lang.Object r0 = X.C550520LiU.LIZ(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L56
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            return r0
        L33:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r1 = r5.LIZ
            if (r1 == 0) goto L56
            X.0LPQ r0 = new X.0LPQ
            r0.<init>(r6)
            r4.LLILLL = r2
            java.lang.Object r1 = r1.LJFF(r0, r4)
            if (r1 != r3) goto L22
            return r3
        L48:
            X.0Lp2 r4 = new X.0Lp2
            r4.<init>(r5, r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L56:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    public final Object LJIIIIZZ(String str, C545130LZn c545130LZn) {
        AIGCWorkflowCompatApi aIGCWorkflowCompatApi = this.LIZIZ;
        if (aIGCWorkflowCompatApi != null) {
            Object objLJIIIIZZ = aIGCWorkflowCompatApi.LJIIIIZZ(str, c545130LZn);
            if (objLJIIIIZZ == C099R.LJFF()) {
                return objLJIIIIZZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0061 -> B:12:0x002f). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(java.util.List<java.lang.String> r9, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, ? extends java.util.List<X.C552940LmO>>> r10) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJIIL(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.String r8, X.InterfaceC1364105Vn<? super X.C0LZU> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C554550Loz
            if (r0 == 0) goto L66
            r6 = r9
            X.0Loz r6 = (X.C554550Loz) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 0
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 == r1) goto L47
            if (r0 != r2) goto L6f
            X.C155000ia.LIZIZ(r5)
        L26:
            java.util.List r5 = (java.util.List) r5
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L6c
            X.0LZU r0 = X.C0LZU.NEW_FRAMEWORK
            return r0
        L33:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = X.C09BV.LIZ()
            if (r0 == 0) goto L5b
            r6.LL = r8
            r6.LLILZ = r1
            java.lang.Object r5 = r0.LJJIJLIJ(r8, r6)
            if (r5 != r4) goto L4e
            return r4
        L47:
            java.lang.Object r8 = r6.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r5)
        L4e:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L5b
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L5b
            X.0LZU r0 = X.C0LZU.OLD_FRAMEWORK
            return r0
        L5b:
            r6.LL = r3
            r6.LLILZ = r2
            java.lang.Object r5 = r7.LJIILL(r8, r6)
            if (r5 != r4) goto L26
            return r4
        L66:
            X.0Loz r6 = new X.0Loz
            r6.<init>(r7, r9)
            goto L12
        L6c:
            X.0LZU r0 = X.C0LZU.NONE
            return r0
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJIILIIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(java.lang.String r7, X.InterfaceC1364105Vn<? super java.util.List<X.C552940LmO>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C554620Lp6
            if (r0 == 0) goto L48
            r5 = r8
            X.0Lp6 r5 = (X.C554620Lp6) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0LiW r1 = (X.InterfaceC550540LiW) r1
            if (r1 == 0) goto L2c
            java.lang.Object r0 = X.C550520LiU.LIZ(r1)
            if (r0 != 0) goto L2e
        L2c:
            X.13BV r0 = X.C13BV.INSTANCE
        L2e:
            return r0
        L2f:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r2 = r6.LIZ
            if (r2 == 0) goto L2c
            X.00tW r1 = new X.00tW
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r1.<init>(r0)
            r5.LLILLL = r3
            java.lang.Object r1 = r2.LJFF(r1, r5)
            if (r1 != r4) goto L22
            return r4
        L48:
            X.0Lp6 r5 = new X.0Lp6
            r5.<init>(r6, r8)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJIILL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(java.lang.String r8, X.InterfaceC1364105Vn<? super X.C0LZU> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C554570Lp1
            if (r0 == 0) goto L85
            r6 = r9
            X.0Lp1 r6 = (X.C554570Lp1) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r2 = 2
            r1 = 1
            java.lang.String r3 = "AIGCWorkflowCreationServiceImpl"
            if (r0 == 0) goto L45
            if (r0 == r1) goto L59
            if (r0 != r2) goto La3
            java.lang.Object r8 = r6.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r5)
        L2b:
            if (r5 == 0) goto L8b
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getFrameworkTypeByServerTaskId result=NEW_FRAMEWORK, serverTaskId="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r2, r3, r0)
            X.0LZU r0 = X.C0LZU.NEW_FRAMEWORK
            return r0
        L45:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = X.C09BV.LIZ()
            if (r0 == 0) goto L7a
            r6.LL = r8
            r6.LLILZ = r1
            java.lang.Object r5 = r0.LIZJ(r8, r6)
            if (r5 != r4) goto L60
            return r4
        L59:
            java.lang.Object r8 = r6.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r5)
        L60:
            if (r5 == 0) goto L7a
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getFrameworkTypeByServerTaskId result=OLD_FRAMEWORK, serverTaskId="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r2, r3, r0)
            X.0LZU r0 = X.C0LZU.OLD_FRAMEWORK
            return r0
        L7a:
            r6.LL = r8
            r6.LLILZ = r2
            java.lang.Object r5 = r7.LIZJ(r8, r6)
            if (r5 != r4) goto L2b
            return r4
        L85:
            X.0Lp1 r6 = new X.0Lp1
            r6.<init>(r7, r9)
            goto L12
        L8b:
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getFrameworkTypeByServerTaskId result=NONE, serverTaskId="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r2, r3, r0)
            X.0LZU r0 = X.C0LZU.NONE
            return r0
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJIILLIIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007a -> B:15:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0082 -> B:15:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0094 -> B:13:0x0039). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(java.lang.String r12, X.InterfaceC1364105Vn<? super X.C539070LCf> r13) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJIJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    public final Object LJIJI(String str, C545120LZm c545120LZm) {
        AIGCWorkflowCompatApi aIGCWorkflowCompatApi = this.LIZIZ;
        if (aIGCWorkflowCompatApi != null) {
            return aIGCWorkflowCompatApi.LJIIL(str, c545120LZm);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJ(java.lang.String r8, X.InterfaceC1364105Vn<? super X.C0LZU> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C554560Lp0
            if (r0 == 0) goto L56
            r6 = r9
            X.0Lp0 r6 = (X.C554560Lp0) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 0
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 == r1) goto L3f
            if (r0 != r2) goto L5f
            X.C155000ia.LIZIZ(r5)
        L26:
            if (r5 == 0) goto L5c
            X.0LZU r0 = X.C0LZU.NEW_FRAMEWORK
            return r0
        L2b:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = X.C09BV.LIZ()
            if (r0 == 0) goto L4b
            r6.LL = r8
            r6.LLILZ = r1
            java.lang.Object r5 = r0.LJFF(r8, r6)
            if (r5 != r4) goto L46
            return r4
        L3f:
            java.lang.Object r8 = r6.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r5)
        L46:
            if (r5 == 0) goto L4b
            X.0LZU r0 = X.C0LZU.OLD_FRAMEWORK
            return r0
        L4b:
            r6.LL = r3
            r6.LLILZ = r2
            java.lang.Object r5 = r7.LJFF(r8, r6)
            if (r5 != r4) goto L26
            return r4
        L56:
            X.0Lp0 r6 = new X.0Lp0
            r6.<init>(r7, r9)
            goto L12
        L5c:
            X.0LZU r0 = X.C0LZU.NONE
            return r0
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJIJJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    public final Object LJIJJLI(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        AIGCWorkflowManagementApi aIGCWorkflowManagementApi = this.LIZ;
        if (aIGCWorkflowManagementApi != null) {
            Object objLIZJ = aIGCWorkflowManagementApi.LIZJ(str, EnumC2398509aZ.CANCEL, interfaceC1364105Vn);
            if (objLIZJ == C099R.LJFF()) {
                return objLIZJ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJ(java.lang.String r12, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>> r13) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    public final Object LJJI(String str, C545130LZn c545130LZn) {
        AIGCWorkflowCompatApi aIGCWorkflowCompatApi = this.LIZIZ;
        if (aIGCWorkflowCompatApi != null) {
            return aIGCWorkflowCompatApi.LJIILLIIL(str, c545130LZn);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIFFI(java.lang.String r9, X.InterfaceC1364105Vn<? super java.lang.String> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C554600Lp4
            if (r0 == 0) goto L69
            r6 = r10
            X.0Lp4 r6 = (X.C554600Lp4) r6
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
            r5 = 0
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L3d
            if (r0 != r4) goto L6f
            X.C155000ia.LIZIZ(r1)
        L26:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L77
            return r1
        L2b:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r1 = r8.LIZ
            if (r1 == 0) goto L77
            X.0Lm5 r0 = X.C552750Lm5.INSTANCE
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
            X.0LpC r0 = new X.0LpC
            r0.<init>()
            java.lang.reflect.Type r0 = r0.LIZ
            r6.LLILLL = r4
            java.lang.Object r1 = r1.LIZIZ(r3, r0, r6)
            if (r1 != r7) goto L26
            return r7
        L69:
            X.0Lp4 r6 = new X.0Lp4
            r6.<init>(r8, r10)
            goto L12
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L77:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJJIFFI(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static C539070LCf LJ(String str, List list, List list2) {
        boolean z;
        boolean z2;
        boolean z3;
        EnumC545550LaT enumC545550LaT;
        float fLJJJ;
        Source sourceLIZ;
        if (list.isEmpty()) {
            return new C539070LCf(str, EnumC545550LaT.NONE, 10);
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((C0LY5) it2.next()).LJ, "FAILED")) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (!list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C0LY5 c0ly5 = (C0LY5) it3.next();
                if (!Intrinsics.LJFF(c0ly5.LJ, "FINISHED") && !Intrinsics.LJFF(c0ly5.LJ, "CANCELED")) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
        } else {
            z2 = true;
        }
        if (!list.isEmpty()) {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                if (!Intrinsics.LJFF(((C0LY5) it4.next()).LJ, "CANCELED")) {
                    z3 = false;
                    break;
                }
            }
            z3 = true;
        } else {
            z3 = true;
        }
        if (z) {
            enumC545550LaT = EnumC545550LaT.FAILED;
        } else if (z2) {
            if (z3) {
                enumC545550LaT = EnumC545550LaT.NONE;
            } else {
                enumC545550LaT = EnumC545550LaT.COMPLETE;
            }
        } else {
            enumC545550LaT = EnumC545550LaT.PROCESSING;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C0LY5 c0ly52 = (C0LY5) obj;
            if (!Intrinsics.LJFF(c0ly52.LJ, "FINISHED") && !Intrinsics.LJFF(c0ly52.LJ, "FAILED") && !Intrinsics.LJFF(c0ly52.LJ, "CANCELED")) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            if (z2) {
                fLJJJ = 100.0f;
            } else {
                fLJJJ = 20.0f;
            }
        } else {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                arrayList2.add(Integer.valueOf(((C0LY5) it5.next()).LJIIIZ));
            }
            fLJJJ = (float) C13LP.LJJJ(arrayList2);
        }
        C08QT c08qt = new C08QT(C09RB.LJIJI(new C1939607ik(list2), AFwS239S0000000_8.get$arr$(20)));
        while (true) {
            if (c08qt.hasNext()) {
                sourceLIZ = C542730LQh.LIZ(((String) c08qt.next()).toUpperCase(Locale.ROOT));
                if (sourceLIZ != null) {
                    break;
                }
            } else {
                sourceLIZ = Source.SHOOTING_I2V;
                break;
            }
        }
        return new C539070LCf(str, fLJJJ, enumC545550LaT, sourceLIZ);
    }

    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    public final Object LIZIZ(String str, InterfaceC545310La5 interfaceC545310La5, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        AIGCWorkflowManagementApi aIGCWorkflowManagementApi = this.LIZ;
        if (aIGCWorkflowManagementApi != null) {
            Object objLIZIZ = aIGCWorkflowManagementApi.LIZIZ(str, interfaceC545310La5, interfaceC1364105Vn);
            if (objLIZIZ == C099R.LJFF()) {
                return objLIZIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(androidx.lifecycle.LifecycleOwner r8, java.lang.String r9, X.InterfaceC1364105Vn r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C554510Lov
            if (r0 == 0) goto L72
            r5 = r10
            X.0Lov r5 = (X.C554510Lov) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r2 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L3c
            if (r0 != r6) goto L78
            X.C155000ia.LIZIZ(r2)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r2)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r0 = r7.LIZ
            if (r0 == 0) goto L45
            r5.LL = r9
            r5.LLILLJJLI = r8
            r5.LLILZIL = r1
            java.lang.Object r0 = r0.LJIIIZ(r9, r5)
            if (r0 != r4) goto L45
            return r4
        L3c:
            androidx.lifecycle.LifecycleOwner r8 = r5.LLILLJJLI
            java.lang.Object r9 = r5.LL
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r2)
        L45:
            if (r8 == 0) goto L80
            java.lang.Class r0 = r8.getClass()
            java.lang.String r3 = r0.getName()
            r2 = 0
            r5.LL = r2
            r5.LLILLJJLI = r2
            r5.LLILZIL = r6
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r1 = r0.LLIILII()
            X.0LnY r0 = new X.0LnY
            r0.<init>(r7, r3, r9, r2)
            java.lang.Object r1 = X.C23250099c.LJI(r5, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L6f
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L6f:
            if (r1 != r4) goto L25
            return r4
        L72:
            X.0Lov r5 = new X.0Lov
            r5.<init>(r7, r10)
            goto L12
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L80:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJI(androidx.lifecycle.LifecycleOwner, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0184  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a3 -> B:15:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00be -> B:14:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x016e -> B:43:0x013c). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r17, X.C545530LaR r18, X.InterfaceC1364105Vn<? super X.InterfaceC346201Wa<X.C539070LCf>> r19) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJII(java.lang.String, X.0LaR, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0033, code lost:
    
        if (r8 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0033, code lost:
    
        if (r1 != r7) goto L59;
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0033 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.util.List<java.lang.String> r11, androidx.lifecycle.LifecycleOwner r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJIIIZ(java.util.List, androidx.lifecycle.LifecycleOwner, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.lang.String r8, X.EnumC2398509aZ r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C554490Lot
            if (r0 == 0) goto L79
            r5 = r10
            X.0Lot r5 = (X.C554490Lot) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L48
            if (r0 == r3) goto L63
            if (r0 != r4) goto L82
            java.lang.Object r2 = r5.LLILLJJLI
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.09aZ r9 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L2b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r2.next()
            X.0LmO r0 = (X.C552940LmO) r0
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r1 = r7.LIZ
            java.lang.String r0 = r0.LIZ
            r5.LL = r9
            r5.LLILLJJLI = r2
            r5.LLILZIL = r4
            java.lang.Object r0 = r1.LIZJ(r0, r9, r5)
            if (r0 != r6) goto L2b
            return r6
        L48:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r2 = r7.LIZ
            if (r2 == 0) goto L8a
            X.00tW r1 = new X.00tW
            java.util.List r0 = java.util.Collections.singletonList(r8)
            r1.<init>(r0)
            r5.LL = r9
            r5.LLILZIL = r3
            java.lang.Object r1 = r2.LJFF(r1, r5)
            if (r1 != r6) goto L68
            return r6
        L63:
            X.09aZ r9 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L68:
            X.0LiW r1 = (X.InterfaceC550540LiW) r1
            if (r1 == 0) goto L8a
            java.lang.Object r0 = X.C550520LiU.LIZ(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L8a
            java.util.Iterator r2 = r0.iterator()
            goto L2b
        L79:
            X.0Lot r5 = new X.0Lot
            r5.<init>(r7, r10)
            goto L12
        L7f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJIIJ(java.lang.String, X.09aZ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[PHI: r6
      0x002a: PHI (r6v8 java.lang.Object) = (r6v7 java.lang.Object), (r6v0 java.lang.Object) binds: [B:31:0x0092, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String r14, X.C545530LaR r15, X.InterfaceC1364105Vn<? super X.InterfaceC346201Wa<X.C0LY5>> r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C554500Lou
            if (r0 == 0) goto L95
            r12 = r3
            X.0Lou r12 = (X.C554500Lou) r12
            int r2 = r12.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r12.LLILZIL = r2
        L14:
            java.lang.Object r6 = r12.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r12.LLILZIL
            r1 = 3
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L2b
            if (r0 == r4) goto L44
            if (r0 == r5) goto L72
            if (r0 != r1) goto L9c
            X.C155000ia.LIZIZ(r6)
        L2a:
            return r6
        L2b:
            X.C155000ia.LIZIZ(r6)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r3 = r13.LIZ
            if (r3 == 0) goto La4
            X.0LPQ r0 = new X.0LPQ
            r0.<init>(r14)
            r12.LL = r14
            r12.LLILLJJLI = r15
            r12.LLILZIL = r4
            java.lang.Object r6 = r3.LJFF(r0, r12)
            if (r6 != r2) goto L4f
            return r2
        L44:
            java.lang.Object r15 = r12.LLILLJJLI
            X.0LaR r15 = (X.C545530LaR) r15
            java.lang.Object r14 = r12.LL
            java.lang.String r14 = (java.lang.String) r14
            X.C155000ia.LIZIZ(r6)
        L4f:
            X.0LiW r6 = (X.InterfaceC550540LiW) r6
            if (r6 == 0) goto La4
            java.lang.Object r0 = X.C550520LiU.LIZ(r6)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto La4
            java.lang.Object r8 = X.C13LP.LJJJLL(r0)
            X.0LmO r8 = (X.C552940LmO) r8
            if (r8 == 0) goto La4
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r0 = r13.LIZ
            r12.LL = r15
            r12.LLILLJJLI = r8
            r12.LLILZIL = r5
            java.lang.Object r6 = r0.LJII(r14, r12)
            if (r6 != r2) goto L7d
            return r2
        L72:
            java.lang.Object r8 = r12.LLILLJJLI
            X.0LmO r8 = (X.C552940LmO) r8
            java.lang.Object r15 = r12.LL
            X.0LaR r15 = (X.C545530LaR) r15
            X.C155000ia.LIZIZ(r6)
        L7d:
            X.01Wa r6 = (X.InterfaceC346201Wa) r6
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r7 = r13.LIZ
            androidx.lifecycle.Lifecycle r9 = r15.LIZ
            boolean r10 = r15.LIZIZ
            boolean r11 = r15.LIZJ
            r0 = 0
            r12.LL = r0
            r12.LLILLJJLI = r0
            r12.LLILZIL = r1
            java.lang.Object r6 = X.C553330Ln1.LIZIZ(r6, r7, r8, r9, r10, r11, r12)
            if (r6 != r2) goto L2a
            return r2
        L95:
            X.0Lou r12 = new X.0Lou
            r12.<init>(r13, r3)
            goto L14
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La4:
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "workflow "
            r1.<init>(r0)
            r1.append(r14)
            java.lang.String r0 = " cannot be found"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "AIGCWorkflowCreationServiceImpl"
            X.C201955140j.LJIIIIZZ(r2, r0, r1)
            X.05wz r0 = X.C1518305wz.LL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJIIJJI(java.lang.String, X.0LaR, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(com.ss.android.ugc.aweme.aigc.migration.model.OldFrameworkInputModel r9, kotlin.jvm.internal.AwS16S1110000_8 r10, X.InterfaceC1364105Vn r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C554480Los
            if (r0 == 0) goto L92
            r7 = r11
            X.0Los r7 = (X.C554480Los) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L92
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r5 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r2 = 1
            java.lang.String r3 = ""
            java.lang.String r4 = "AIGCWorkflowCreationServiceImpl"
            if (r0 == 0) goto L72
            if (r0 != r2) goto L99
            X.C155000ia.LIZIZ(r5)
        L26:
            X.0LiW r5 = (X.InterfaceC550540LiW) r5
            boolean r0 = r5 instanceof X.C550590Lib
            if (r0 == 0) goto L4a
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Workflow submitted successfully, id: "
            r1.append(r0)
            X.0Lib r5 = (X.C550590Lib) r5
            T r0 = r5.LIZ
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIILL(r2, r4, r0)
            T r3 = r5.LIZ
        L49:
            return r3
        L4a:
            boolean r0 = r5 instanceof X.C326350Cqn
            if (r0 == 0) goto L49
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Workflow submit failed: "
            r1.append(r0)
            X.0Cqn r5 = (X.C326350Cqn) r5
            int r0 = r5.LIZ
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = r5.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIIIIZZ(r2, r4, r0)
            return r3
        L72:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r0 = r8.LIZ
            if (r0 != 0) goto L81
            X.0LX3 r1 = X.C0LX3.LIZIZ
            java.lang.String r0 = "AIGCWorkflowManagementApi not available"
            X.C201955140j.LJIIIIZZ(r1, r4, r0)
            return r3
        L81:
            java.lang.Object r1 = r10.invoke()
            X.0LmO r1 = (X.C552940LmO) r1
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r0 = r8.LIZ
            r7.LLILLL = r2
            java.lang.Object r5 = r0.LJIILIIL(r1, r9, r7)
            if (r5 != r6) goto L26
            return r6
        L92:
            X.0Los r7 = new X.0Los
            r7.<init>(r8, r11)
            goto L12
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJIIZILJ(com.ss.android.ugc.aweme.aigc.migration.model.OldFrameworkInputModel, kotlin.jvm.internal.AwS16S1110000_8, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    @Override // com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIL(java.lang.String r10, java.lang.String r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C554540Loy
            if (r0 == 0) goto L88
            r7 = r12
            X.0Loy r7 = (X.C554540Loy) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L88
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r1 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r8 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L43
            if (r0 != r8) goto L8e
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r2 = r9.LIZ
            if (r2 == 0) goto L96
            X.00tW r1 = new X.00tW
            java.util.List r0 = java.util.Collections.singletonList(r10)
            r1.<init>(r0)
            r7.LL = r11
            r7.LLILZ = r3
            java.lang.Object r1 = r2.LJFF(r1, r7)
            if (r1 != r6) goto L48
            return r6
        L43:
            java.lang.Object r11 = r7.LL
            X.C155000ia.LIZIZ(r1)
        L48:
            X.0LiW r1 = (X.InterfaceC550540LiW) r1
            if (r1 == 0) goto L96
            java.lang.Object r0 = X.C550520LiU.LIZ(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L96
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            X.0LmO r0 = (X.C552940LmO) r0
            if (r0 == 0) goto L96
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r5 = r9.LIZ
            java.lang.String r4 = r0.LIZ
            X.0Lm5 r3 = X.C552750Lm5.INSTANCE
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory> r1 = com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory.class
            r0 = 0
            java.lang.Object r0 = r2.getService(r1, r0, r0)
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory r0 = (com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory) r0
            X.09Eo r1 = r0.LIZ(r11)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r1)
            java.util.Map r1 = X.C2097908Jt.LIZJ(r0)
            r0 = 0
            r7.LL = r0
            r7.LLILZ = r8
            java.lang.Object r0 = r5.LJIIJ(r4, r1, r7)
            if (r0 != r6) goto L25
            return r6
        L88:
            X.0Loy r7 = new X.0Loy
            r7.<init>(r9, r12)
            goto L12
        L8e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L96:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJIL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
