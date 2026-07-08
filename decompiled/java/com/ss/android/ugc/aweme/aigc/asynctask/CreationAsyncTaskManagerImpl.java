package com.ss.android.ugc.aweme.aigc.asynctask;

import X.AbstractC543030LRl;
import X.AnonymousClass0913;
import X.AnonymousClass0956;
import X.C054G;
import X.C099R;
import X.C09AE;
import X.C09IC;
import X.C09J2;
import X.C09J3;
import X.C09J4;
import X.C09J5;
import X.C09J6;
import X.C09J7;
import X.C09J8;
import X.C09J9;
import X.C09JA;
import X.C09JD;
import X.C09JE;
import X.C09JG;
import X.C09JI;
import X.C09JK;
import X.C0LCT;
import X.C0LM6;
import X.C0LNJ;
import X.C0LNK;
import X.C0LQK;
import X.C0LQP;
import X.C0LRR;
import X.C0LRS;
import X.C0LSZ;
import X.C0LTN;
import X.C0LU1;
import X.C0LX2;
import X.C0PEM;
import X.C15438062q;
import X.C1697810uHb;
import X.C201955140j;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C382090EyV;
import X.C382220Eyi;
import X.C382230Eyj;
import X.C385300F8u;
import X.C453001pY;
import X.C557860LuK;
import X.C558070Luf;
import X.C581160Mqo;
import X.EnumC1987107qP;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import X.InterfaceC497601wk;
import X.InterfaceC539460LDs;
import X.InterfaceC542770LQl;
import X.InterfaceC543000LRi;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.net.QuotaRefreshBody;
import com.ss.android.ugc.aweme.aigc.asynctask.net.ReportTaskBody;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.ITaskScheduler;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.IWorkflowManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CreationAsyncTaskManagerImpl implements ICreationAsyncTaskManager {
    public C382090EyV LIZLLL;
    public AnonymousClass0956 LJ;
    public C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final ConcurrentHashMap<String, InterfaceC542770LQl<C09JG, AbsTaskOutput>> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, List<C09AE>> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Boolean> LJFF = new ConcurrentHashMap<>();
    public final C558070Luf LJI = new C558070Luf();
    public final C557860LuK LJII = new C557860LuK();

    public final InterfaceC497601wk LIZIZ() {
        if (!C2296808zG.LJI(this.LIZ)) {
            this.LIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final C0LCT LJIILIIL() {
        return C0LCT.LIZ;
    }

    public final void LIZ(List<String> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.LIZIZ.get(it2.next()));
        }
        Iterator<String> it3 = list.iterator();
        while (it3.hasNext()) {
            this.LIZIZ.remove(it3.next());
        }
        C23250099c.LIZLLL(LIZIZ(), null, null, new C09J7(arrayList, list, this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJII(String str) {
        C23250099c.LIZLLL(LIZIZ(), null, null, new C09J3(this, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJIIIIZZ(String str) {
        C23250099c.LIZLLL(LIZIZ(), null, null, new C09J4(this, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.InterfaceC1364105Vn<? super java.util.List<X.C0LSZ>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C544360LWo
            if (r0 == 0) goto L39
            r4 = r6
            X.0LWo r4 = (X.C544360LWo) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L3f
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            java.util.List r0 = X.C0LXK.LIZLLL(r3)
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.0LX1 r0 = X.C0LX2.LIZ()
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZIZ(r4)
            if (r3 != r2) goto L22
            return r2
        L39:
            X.0LWo r4 = new X.0LWo
            r4.<init>(r5, r6)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJIIL(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJJ(List<String> list) {
        C23250099c.LIZLLL(LIZIZ(), null, null, new C09J8(this, list, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final C0LSZ LJJII(String str) {
        InterfaceC542770LQl<C09JG, AbsTaskOutput> interfaceC542770LQl = this.LIZIZ.get(str);
        if (interfaceC542770LQl != null) {
            return interfaceC542770LQl.LJIIIIZZ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJJIII(String str) {
        C385300F8u c385300F8u = C385300F8u.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelTaskByTaskId : ");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c385300F8u, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
        LIZ(Collections.singletonList(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJZLJL(X.InterfaceC1364105Vn r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof X.C544470LWz
            if (r0 == 0) goto L51
            r10 = r15
            X.0LWz r10 = (X.C544470LWz) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r6 = r10.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto Lb9
            X.C155000ia.LIZIZ(r6)
        L23:
            com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsResponse r6 = (com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsResponse) r6
            if (r6 != 0) goto L57
            r0 = 0
            return r0
        L29:
            X.C155000ia.LIZIZ(r6)
            X.0EyV r0 = r14.LIZLLL
            if (r0 == 0) goto L3f
            java.util.List<X.0Et3> r0 = r0.LIZ
            if (r0 == 0) goto L3f
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r1) goto L3f
            X.0EyV r0 = r14.LIZLLL
            return r0
        L3f:
            X.0LuK r5 = r14.LJII
            r10.LLILLL = r1
            java.lang.String r0 = X.C557860LuK.LIZIZ
            r6 = 5
            r7 = 20
            r8 = 0
            r9 = r8
            java.lang.Object r6 = r5.LJII(r6, r7, r8, r9, r10)
            if (r6 != r2) goto L23
            return r2
        L51:
            X.0LWz r10 = new X.0LWz
            r10.<init>(r14, r15)
            goto L12
        L57:
            java.util.List r1 = r6.getPrompts()
            if (r1 == 0) goto L8d
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r7.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L6c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r5.next()
            com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsResponse$PromptItem r0 = (com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsResponse.PromptItem) r0
            X.0Et3 r3 = new X.0Et3
            java.lang.Integer r2 = r0.getId()
            java.lang.String r1 = r0.getText()
            java.lang.String r0 = r0.getTitle()
            r3.<init>(r2, r1, r0)
            r7.add(r3)
            goto L6c
        L8d:
            X.13BV r7 = X.C13BV.INSTANCE
        L8f:
            com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsResponse$DefaultPrompt r0 = r6.getDefaultPrompt()
            if (r0 == 0) goto Lb3
            X.0Et3 r8 = new X.0Et3
            java.lang.Integer r2 = r0.getId()
            java.lang.String r1 = r0.getText()
            java.lang.String r0 = r0.getTitle()
            r8.<init>(r2, r1, r0)
        La6:
            X.0EyV r6 = new X.0EyV
            r9 = 1
            r10 = 0
            r12 = 0
            r11 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r14.LIZLLL = r6
            return r6
        Lb3:
            X.0Et3 r8 = new X.0Et3
            r8.<init>(r4)
            goto La6
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJJIIJZLJL(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final InterfaceC346201Wa LJJIIZI(List list) {
        return C09IC.LJIILL(new C581160Mqo(C0LX2.LIZ().LIZ(list), 10));
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final C0LTN LJJIJIIJIL(C0LQP c0lqp) {
        AbstractC543030LRl abstractC543030LRl;
        C0LQK c0lqk = C0LQK.LIZ;
        String typeName = c0lqp.getTypeName();
        c0lqk.getClass();
        C0LTN c0ltnLIZ = C0LQK.LIZ(typeName);
        if ((c0ltnLIZ instanceof AbstractC543030LRl) && (abstractC543030LRl = (AbstractC543030LRl) c0ltnLIZ) != null) {
            abstractC543030LRl.LJJLI();
        }
        return c0ltnLIZ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJJIJIL(String str) {
        C23250099c.LIZLLL(LIZIZ(), null, null, new C09JI(this, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJJIL(String str) {
        C23250099c.LIZLLL(LIZIZ(), null, null, new C09J5(this, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJJJIL(String str) {
        C23250099c.LIZLLL(LIZIZ(), null, null, new C09J6(this, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final Object LJJJJIZL(InterfaceC1364105Vn interfaceC1364105Vn) {
        return this.LJII.LJIIIIZZ(new QuotaRefreshBody("camera_aigc", "image2video"), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJJJJJL(List<String> list) {
        C23250099c.LIZLLL(LIZIZ(), null, null, new C09J9(this, list, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final InterfaceC346201Wa<C0LSZ> LJJJJL(String str) {
        return C09IC.LJIILL(new C581160Mqo(C0LX2.LIZ().LJIIIZ(str), 9));
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final InterfaceC346201Wa<List<C0LSZ>> LJJJJLI(String str) {
        return C09IC.LJIILL(new C581160Mqo(C0LX2.LIZ().LJIIIIZZ(Collections.singletonList(str)), 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C544450LWx
            if (r0 == 0) goto L76
            r5 = r8
            X.0LWx r5 = (X.C544450LWx) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L27
            if (r0 != r4) goto L7c
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig r1 = (com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig) r1
            com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig r0 = r1.aigcAvatarAuthConfig
            return r0
        L27:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = X.C297690Blf.LIZ()
            if (r0 == 0) goto L40
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L40
            r0 = 0
            return r0
        L40:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0niP r2 = r0.getNetworkService()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.tools.AVApi> r0 = com.ss.android.ugc.aweme.tools.AVApi.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.tools.AVApi r0 = (com.ss.android.ugc.aweme.tools.AVApi) r0
            java.lang.String r1 = r0.LIZ()
            java.lang.Class<com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService> r0 = com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService.class
            java.lang.Object r3 = r2.createRetrofit(r1, r4, r0)
            com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService r3 = (com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService) r3
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "purpose"
            java.lang.String r0 = "aigc_avatar"
            r2.<init>(r1, r0)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r2)
            r5.LLILLL = r4
            java.lang.Object r1 = r3.LIZ(r0, r5)
            if (r1 != r6) goto L22
            return r6
        L76:
            X.0LWx r5 = new X.0LWx
            r5.<init>(r7, r8)
            goto L12
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJJJJZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r9, X.InterfaceC1364105Vn<? super X.C0LSZ> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C544410LWt
            if (r0 == 0) goto Laf
            r5 = r10
            X.0LWt r5 = (X.C544410LWt) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laf
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r7 = 0
            r1 = 0
            r4 = 1
            if (r0 == 0) goto L4e
            if (r0 != r4) goto Lb7
            X.C155000ia.LIZIZ(r2)
        L24:
            java.util.List r2 = (java.util.List) r2
            java.util.List r0 = X.C0LXK.LIZLLL(r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L30:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.0LSZ r1 = (X.C0LSZ) r1
            java.lang.String r0 = r1.LJIIJ
            int r0 = r0.length()
            if (r0 <= 0) goto L30
            java.lang.String r0 = r1.LJIIIZ
            int r0 = r0.length()
            if (r0 != 0) goto L30
            return r2
        L4e:
            X.C155000ia.LIZIZ(r2)
            int r0 = r9.length()
            if (r0 != 0) goto L67
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "aigc_empty_server_task_id_guard_killswitch"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r1)
            if (r0 != 0) goto L67
            return r7
        L67:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0LQl<X.09JG, com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput>> r0 = r8.LIZIZ
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L71:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.0LQl r1 = (X.InterfaceC542770LQl) r1
            X.0LSZ r0 = r1.LJIIIIZZ()
            java.lang.String r0 = r0.LJIJJLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)
            if (r0 == 0) goto L71
            X.0LSZ r0 = r1.LJIIIIZZ()
            java.lang.String r0 = r0.LJIIIZ
            int r0 = r0.length()
            if (r0 != 0) goto L71
        L96:
            X.0LQl r2 = (X.InterfaceC542770LQl) r2
            if (r2 == 0) goto La0
            X.0LSZ r0 = r2.LJIIIIZZ()
            if (r0 != 0) goto Lbf
        La0:
            X.0LX1 r0 = X.C0LX2.LIZ()
            r5.LLILLL = r4
            java.lang.Object r2 = r0.LJFF(r9, r5)
            if (r2 != r6) goto L24
            return r6
        Lad:
            r2 = r7
            goto L96
        Laf:
            X.0LWt r5 = new X.0LWt
            r5.<init>(r8, r10)
            goto L12
        Lb6:
            return r7
        Lb7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<java.lang.String> r8, X.InterfaceC1364105Vn<? super java.util.List<java.lang.String>> r9) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LIZLLL(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C0LSZ> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C544420LWu
            if (r0 == 0) goto L3a
            r4 = r7
            X.0LWu r4 = (X.C544420LWu) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L40
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r3)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r3)
            java.util.List r0 = java.util.Collections.singletonList(r6)
            r4.LLILLL = r1
            java.lang.Object r3 = r5.LJIJJ(r0, r4)
            if (r3 != r2) goto L22
            return r2
        L3a:
            X.0LWu r4 = new X.0LWu
            r4.<init>(r5, r7)
            goto L12
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    @InterfaceC1294060jmO
    public final Object LJIIIZ(List list, C0LU1 c0lu1) throws Throwable {
        if (list.isEmpty()) {
            return Unit.LIZ;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC542770LQl<C09JG, AbsTaskOutput> interfaceC542770LQlRemove = this.LIZIZ.remove(it2.next());
            if (interfaceC542770LQlRemove != null) {
                arrayList.add(interfaceC542770LQlRemove);
            }
        }
        Object objLJI = C23250099c.LJI(c0lu1, C0PEM.LIZJ, new C09JA(list, arrayList, this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.util.List<java.lang.String> r6, X.InterfaceC1364105Vn<? super java.util.List<X.C0LSZ>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C544430LWv
            if (r0 == 0) goto L39
            r4 = r7
            X.0LWv r4 = (X.C544430LWv) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L3f
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            java.util.List r0 = X.C0LXK.LIZLLL(r3)
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.0LX1 r0 = X.C0LX2.LIZ()
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJI(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L39:
            X.0LWv r4 = new X.0LWv
            r4.<init>(r5, r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJIIJ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String r7, X.InterfaceC1364105Vn r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0LX0
            if (r0 == 0) goto L5a
            r5 = r8
            X.0LX0 r5 = (X.C0LX0) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L3e
            if (r0 != r2) goto L60
            X.C155000ia.LIZIZ(r4)
        L22:
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r1 = r0 ^ 1
            r0 = 0
            if (r1 != 0) goto L2f
            r4 = r0
        L2f:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L3b
            java.lang.Object r1 = X.C13LP.LJJJJZI(r4)
            X.0LDs r1 = (X.InterfaceC539460LDs) r1
            if (r1 != 0) goto L68
        L3b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            X.C155000ia.LIZIZ(r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0LQl<X.09JG, com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput>> r0 = r6.LIZIZ
            java.lang.Object r1 = r0.get(r7)
            X.0LDs r1 = (X.InterfaceC539460LDs) r1
            if (r1 != 0) goto L68
            X.0LQK r1 = X.C0LQK.LIZ
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r5.LLILLL = r2
            java.lang.Object r4 = r1.LIZLLL(r0, r5)
            if (r4 != r3) goto L22
            return r3
        L5a:
            X.0LX0 r5 = new X.0LX0
            r5.<init>(r6, r8)
            goto L12
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L68:
            X.0LKX r0 = new X.0LKX
            r0.<init>(r2, r2)
            r6.LJJJ(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJIIJJI(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(X.C0LQP r6, X.InterfaceC1364105Vn<? super java.util.List<X.C0LSZ>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C544320LWk
            if (r0 == 0) goto L41
            r4 = r7
            X.0LWk r4 = (X.C544320LWk) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L47
            X.C155000ia.LIZIZ(r1)
        L22:
            java.util.List r1 = (java.util.List) r1
            java.util.List r0 = X.C0LXK.LIZLLL(r1)
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.0LX1 r1 = X.C0LX2.LIZ()
            java.lang.String r0 = r6.getTypeName()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r4.LLILLL = r2
            java.lang.Object r1 = r1.LIZJ(r0, r4)
            if (r1 != r3) goto L22
            return r3
        L41:
            X.0LWk r4 = new X.0LWk
            r4.<init>(r5, r7)
            goto L12
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJIILL(X.0LQP, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJIILLIIL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCreationIdByTaskId: taskid=");
        sbLIZ.append(str);
        sbLIZ.append(", newCreationId=");
        sbLIZ.append(str2);
        C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(LIZIZ(), null, null, new C0LNJ(this, str, str2, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(java.util.List<java.lang.String> r6, X.InterfaceC1364105Vn<? super java.util.List<java.lang.Integer>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C544460LWy
            if (r0 == 0) goto L63
            r4 = r7
            X.0LWy r4 = (X.C544460LWy) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L53
            if (r0 != r2) goto L6c
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.aigc.asynctask.net.TasksDetailResponse r1 = (com.ss.android.ugc.aweme.aigc.asynctask.net.TasksDetailResponse) r1
            if (r1 == 0) goto L69
            java.util.List r1 = r1.getTaskStatuses()
            if (r1 == 0) goto L69
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail r0 = (com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail) r0
            int r0 = r0.getJobStatus()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r2.add(r0)
            goto L3b
        L53:
            X.C155000ia.LIZIZ(r1)
            X.0LuK r1 = r5.LJII
            r4.LLILLL = r2
            java.lang.String r0 = X.C557860LuK.LIZIZ
            java.lang.Object r1 = r1.LJFF(r6, r2, r4)
            if (r1 != r3) goto L22
            return r3
        L63:
            X.0LWy r4 = new X.0LWy
            r4.<init>(r5, r7)
            goto L12
        L69:
            X.13BV r2 = X.C13BV.INSTANCE
        L6b:
            return r2
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJIJ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJ(java.util.List<java.lang.String> r6, X.InterfaceC1364105Vn<? super java.util.List<X.C0LSZ>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C544440LWw
            if (r0 == 0) goto L39
            r4 = r7
            X.0LWw r4 = (X.C544440LWw) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L3f
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            java.util.List r0 = X.C0LXK.LIZLLL(r3)
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.0LX1 r0 = X.C0LX2.LIZ()
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJIIJ(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L39:
            X.0LWw r4 = new X.0LWw
            r4.<init>(r5, r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJIJJ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIL(java.lang.String r6, X.InterfaceC1364105Vn<? super X.InterfaceC539460LDs<? super X.C09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C544380LWq
            if (r0 == 0) goto L4d
            r4 = r7
            X.0LWq r4 = (X.C544380LWq) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L53
            X.C155000ia.LIZIZ(r1)
        L22:
            return r1
        L23:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0LQl<X.09JG, com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput>> r0 = r5.LIZIZ
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L2f
            return r0
        L2f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getTask from db: taskid="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C09JK.LIZ(r0)
            X.0LQK r0 = X.C0LQK.LIZ
            r4.LLILLL = r2
            java.lang.Object r1 = r0.LIZJ(r6, r4)
            if (r1 != r3) goto L22
            return r3
        L4d:
            X.0LWq r4 = new X.0LWq
            r4.<init>(r5, r7)
            goto L12
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e0 -> B:44:0x00fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ee -> B:44:0x00fe). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJI(java.lang.String r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJJI(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x008b -> B:41:0x0091). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C544340LWm
            if (r0 == 0) goto L24
            r3 = r8
            X.0LWm r3 = (X.C544340LWm) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r1 = r3.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            java.lang.Object r5 = r3.LL
            java.util.Iterator r5 = (java.util.Iterator) r5
            goto L8e
        L24:
            X.0LWm r3 = new X.0LWm
            r3.<init>(r6, r8)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            if (r7 == 0) goto L46
            int r0 = r7.length()
            if (r0 == 0) goto L46
            r0 = 0
        L3e:
            if (r0 == 0) goto L48
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L46:
            r0 = 1
            goto L3e
        L48:
            java.lang.Class<X.0LXL[]> r0 = X.C0LXL[].class
            java.util.List r1 = X.C2292508yZ.LIZLLL(r0, r7)     // Catch: java.lang.Throwable -> L52
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L52
            goto L5e
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L5e:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L65
            r1 = 0
        L65:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L6f
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L6f:
            java.util.Iterator r5 = r1.iterator()
        L73:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r1 = r5.next()
            X.0LXL r1 = (X.C0LXL) r1
            X.0LX1 r0 = X.C0LX2.LIZ()     // Catch: java.lang.Throwable -> L97
            r3.LL = r5     // Catch: java.lang.Throwable -> L97
            r3.LLILZ = r2     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r0.LJIIJJI(r1, r3)     // Catch: java.lang.Throwable -> L97
            if (r0 != r4) goto L91
            goto La4
        L8e:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L97
        L91:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L97
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L97
            goto L73
        L97:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            goto L73
        La4:
            return r4
        La5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJJIIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJJIJ(String str, String str2) {
        C23250099c.LIZLLL(LIZIZ(), null, null, new C09JE(this, str, str2, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJJIJIIJI(String str, String str2) {
        if (Intrinsics.LJFF(str, str2)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCreationIdByOldId: oldCreationId=");
        sbLIZ.append(str);
        sbLIZ.append(", newCreationId=");
        sbLIZ.append(str2);
        C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(LIZIZ(), null, null, new C0LNK(this, str, str2, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final Object LJJIJLIJ(String str, InterfaceC1364105Vn<? super List<C0LSZ>> interfaceC1364105Vn) {
        return LJIIJ(Collections.singletonList(str), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJJJ(InterfaceC539460LDs<? super C09JG, ? extends AbsTaskOutput> interfaceC539460LDs, C09JG c09jg) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submitTask: ");
        sbLIZ.append(c09jg);
        C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC542770LQl interfaceC542770LQl = (InterfaceC542770LQl) interfaceC539460LDs;
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(LIZIZ(), null, null, new C09JD(this.LIZIZ.get(interfaceC542770LQl.getTaskId()), this, interfaceC542770LQl, c09jg, null), 3);
        String taskId = interfaceC542770LQl.getTaskId();
        List<C09AE> list = this.LIZJ.get(taskId);
        if (list != null) {
            synchronized (list) {
                try {
                    list.add(anonymousClass0956LIZLLL);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        this.LIZJ.put(taskId, C1697810uHb.LJIILJJIL(anonymousClass0956LIZLLL));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJ(java.lang.String r6, X.InterfaceC1364105Vn<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C544370LWp
            if (r0 == 0) goto L40
            r4 = r7
            X.0LWp r4 = (X.C544370LWp) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L62
            X.C155000ia.LIZIZ(r1)
        L22:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            r2 = 0
            if (r0 == 0) goto L46
            return r2
        L2c:
            X.C155000ia.LIZIZ(r1)
            X.0LX1 r1 = X.C0LX2.LIZ()
            java.util.List r0 = java.util.Collections.singletonList(r6)
            r4.LLILLL = r2
            java.lang.Object r1 = r1.LJI(r0, r4)
            if (r1 != r3) goto L22
            return r3
        L40:
            X.0LWp r4 = new X.0LWp
            r4.<init>(r5, r7)
            goto L12
        L46:
            java.lang.String r1 = X.C2292508yZ.LIZJ(r1)     // Catch: java.lang.Throwable -> L4e
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L4e
            goto L5a
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L5a:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L61
            return r1
        L61:
            return r2
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJJJJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0045 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLL(java.util.List<java.lang.String> r7, X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC539460LDs<? super X.C09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput>>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C544310LWj
            if (r0 == 0) goto L55
            r5 = r8
            X.0LWj r5 = (X.C544310LWj) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r0 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILZIL
            r3 = 1
            if (r1 == 0) goto L48
            if (r1 != r3) goto L5c
            java.lang.Object r2 = r5.LLILLJJLI
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r5.LL
            java.util.Collection r1 = (java.util.Collection) r1
            X.C155000ia.LIZIZ(r0)
        L2a:
            if (r0 == 0) goto L2f
            r1.add(r0)
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            r5.LL = r1
            r5.LLILLJJLI = r2
            r5.LLILZIL = r3
            java.lang.Object r0 = r6.LJIL(r0, r5)
            if (r0 != r4) goto L2a
            return r4
        L48:
            X.C155000ia.LIZIZ(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
            goto L2f
        L55:
            X.0LWj r5 = new X.0LWj
            r5.<init>(r6, r8)
            goto L12
        L5b:
            return r1
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJJJJLL(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZI(java.util.List<java.lang.String> r10, X.InterfaceC1364105Vn<? super X.C0LNM> r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJJJJZI(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a A[Catch: Exception -> 0x016f, TryCatch #0 {Exception -> 0x016f, blocks: (B:36:0x00ef, B:37:0x00f2, B:39:0x00f6, B:41:0x00fc, B:42:0x0109, B:44:0x010f, B:46:0x012c, B:48:0x0136, B:50:0x013c, B:56:0x0149, B:59:0x0152, B:60:0x0156, B:45:0x012a), top: B:67:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149 A[Catch: Exception -> 0x016f, TryCatch #0 {Exception -> 0x016f, blocks: (B:36:0x00ef, B:37:0x00f2, B:39:0x00f6, B:41:0x00fc, B:42:0x0109, B:44:0x010f, B:46:0x012c, B:48:0x0136, B:50:0x013c, B:56:0x0149, B:59:0x0152, B:60:0x0156, B:45:0x012a), top: B:67:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152 A[Catch: Exception -> 0x016f, TryCatch #0 {Exception -> 0x016f, blocks: (B:36:0x00ef, B:37:0x00f2, B:39:0x00f6, B:41:0x00fc, B:42:0x0109, B:44:0x010f, B:46:0x012c, B:48:0x0136, B:50:0x013c, B:56:0x0149, B:59:0x0152, B:60:0x0156, B:45:0x012a), top: B:67:0x00ef }] */
    /* JADX WARN: Type inference failed for: r13v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl] */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(int r21, java.util.List<java.lang.String> r22, X.InterfaceC1364105Vn<? super X.C382090EyV> r23) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJ(int, java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJI(String str, Function0 function0, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopManager, stop from ");
        sbLIZ.append(str);
        C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C385300F8u c385300F8u = C385300F8u.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("stop from ");
        sbLIZ2.append(str);
        C201955140j.LIZLLL(c385300F8u, "EditorProAIGCComponent", C2188811AlT.LIZIZ(sbLIZ2));
        this.LJFF.remove(str);
        AnonymousClass0913.LIZJ(str);
        if (this.LJFF.isEmpty()) {
            if (!z || (AnonymousClass0913.LJI.isEmpty() && AnonymousClass0913.LIZLLL.isEmpty() && AnonymousClass0913.LJ.isEmpty())) {
                C09JK.LIZ("stopManager, really stop !!!!!");
                this.LJ = C23250099c.LIZLLL(LIZIZ(), null, null, new C09J2(this, function0, str, null), 3);
                return;
            } else {
                function0.invoke();
                return;
            }
        }
        function0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.InterfaceC539460LDs r13, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r14, X.InterfaceC1364105Vn r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.C544260LWe
            if (r0 == 0) goto Lb6
            r7 = r15
            X.0LWe r7 = (X.C544260LWe) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb6
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r0 = r7.LLILLL
            java.lang.Object r8 = X.C099R.LJFF()
            int r1 = r7.LLILZIL
            r6 = 1
            java.lang.String r5 = "CreationAsyncTask"
            if (r1 == 0) goto L51
            if (r1 != r6) goto Lbd
            long r1 = r7.LLILLJJLI
            java.lang.Object r4 = r7.LL
            java.lang.String r4 = (java.lang.String) r4
            X.C155000ia.LIZIZ(r0)
        L2a:
            if (r0 != 0) goto L4e
            X.0LX3 r6 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "submitTaskAwait: task "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = " timed out after "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "ms, proceeding without confirmation"
            r3.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            X.C201955140j.LJIIIIZZ(r6, r5, r0)
        L4e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L51:
            X.C155000ia.LIZIZ(r0)
            java.lang.String r4 = r13.getTaskId()
            X.099F r9 = X.C090F.LIZIZ()
            boolean r0 = r13 instanceof X.InterfaceC542770LQl
            r3 = 0
            if (r0 == 0) goto Lc5
            r2 = r13
            X.0LQl r2 = (X.InterfaceC542770LQl) r2
            if (r2 == 0) goto Lc5
            kotlin.jvm.internal.AwS152S1100000_3 r1 = new kotlin.jvm.internal.AwS152S1100000_3
            r0 = 9
            r1.<init>(r4, r9, r0)
            r2.LIZLLL(r1)
            r12.LJJJ(r13, r14)
            X.0C64 r10 = X.C0C64.LJIILLIIL()
            r2 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r1 = "studio_aigc_grade_down_await_timeout_ms"
            r0 = 31744(0x7c00, float:4.4483E-41)
            int r0 = r10.LJIJ(r0, r2, r1, r6)
            long r1 = (long) r0
            X.0LX3 r11 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r10 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "submitTaskAwait: waiting for "
            r10.append(r0)
            r10.append(r4)
            java.lang.String r0 = ", timeout="
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = "ms"
            r10.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r10)
            X.C201955140j.LIZLLL(r11, r5, r0)
            X.01pZ r0 = new X.01pZ
            r0.<init>(r9, r3)
            r7.LL = r4
            r7.LLILLJJLI = r1
            r7.LLILZIL = r6
            java.lang.Object r0 = X.C099A.LIZJ(r1, r0, r7)
            if (r0 != r8) goto L2a
            return r8
        Lb6:
            X.0LWe r7 = new X.0LWe
            r7.<init>(r12, r15)
            goto L12
        Lbd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc5:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJIILJJIL(X.0LDs, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2 A[LOOP:0: B:38:0x00ec->B:40:0x00f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(java.lang.String r11, java.util.List r12, X.InterfaceC1364105Vn r13) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJIJI(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(java.lang.String r7, java.util.List r8, X.InterfaceC1364105Vn r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C544350LWn
            if (r0 == 0) goto L74
            r5 = r9
            X.0LWn r5 = (X.C544350LWn) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L51
            if (r0 != r3) goto L7a
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "restoreTasksByCreationIds: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", sceneName: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C09JK.LIZ(r0)
            r5.LL = r7
            r5.LLILZ = r2
            java.lang.Object r1 = r6.LIZLLL(r8, r5)
            if (r1 != r4) goto L58
            return r4
        L51:
            java.lang.Object r7 = r5.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r1)
        L58:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L68
            java.lang.String r0 = "restoreTasksByCreationIds: no tasks to restore"
            X.C09JK.LIZ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L68:
            r0 = 0
            r5.LL = r0
            r5.LLILZ = r3
            java.lang.Object r0 = r6.LJIJI(r7, r1, r5)
            if (r0 != r4) goto L25
            return r4
        L74:
            X.0LWn r5 = new X.0LWn
            r5.<init>(r6, r9)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJIJJLI(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final C0LTN LJJIFFI(C0LQP c0lqp, String str, boolean z) {
        C0LRR c0lrr;
        ITaskScheduler iTaskSchedulerLIZ;
        C0LQK c0lqk = C0LQK.LIZ;
        String typeName = c0lqp.getTypeName();
        c0lqk.getClass();
        C0LTN c0ltnLIZ = C0LQK.LIZ(typeName);
        if ((c0ltnLIZ instanceof C0LRR) && (c0lrr = (C0LRR) c0ltnLIZ) != null) {
            if (c0lrr.LJIIJJI) {
                c0lrr.LJJJJIZL("Already init, return");
            } else {
                c0lrr.LJIIJJI = true;
                int i = 0;
                if (str != null && str.length() != 0) {
                    IWorkflowManager iWorkflowManager = c0lrr.LJIIL;
                    if (iWorkflowManager != null && (iTaskSchedulerLIZ = iWorkflowManager.LIZ()) != null) {
                        iTaskSchedulerLIZ.LIZ(str);
                        List<InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput>> listLIZIZ = iTaskSchedulerLIZ.LIZIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Build execution order from workflow JSON: ");
                        sbLIZ.append(listLIZIZ);
                        c0lrr.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
                        for (InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput> interfaceC543000LRi : listLIZIZ) {
                            if (interfaceC543000LRi instanceof C0LRS) {
                                ((ArrayList) c0lrr.LJIIIIZZ).add(interfaceC543000LRi);
                            }
                        }
                    }
                } else {
                    List<InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput>> listLJJJJLI = c0lrr.LJJJJLI(null);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Null or empty workflow JSON, build default tasks: ");
                    sbLIZ2.append(listLJJJJLI);
                    c0lrr.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ2));
                    if (listLJJJJLI != null) {
                        for (InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput> interfaceC543000LRi2 : listLJJJJLI) {
                            if (interfaceC543000LRi2 instanceof C0LRS) {
                                ((ArrayList) c0lrr.LJIIIIZZ).add(interfaceC543000LRi2);
                            }
                        }
                    }
                    c0lrr.LJJLIIIIJ();
                }
                if (z) {
                    c0lrr.LJJJJIZL("Skip quota, remove quota node");
                    Iterator it2 = ((ArrayList) c0lrr.LJIIIIZZ).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((C0LRS) it2.next()).LIZIZ() == C0LM6.QUOTA) {
                            c0lrr.LJJJJIZL("Quota node removed");
                            it2.remove();
                            break;
                        }
                    }
                }
                for (Object obj : (ArrayList) c0lrr.LJIIIIZZ) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C0LRS c0lrs = (C0LRS) obj;
                        if (i == 0) {
                            c0lrs.LIZJ = C0LM6.STEP_DEFAULT;
                        } else {
                            c0lrs.LIZJ = ((C0LRS) ListProtector.get(c0lrr.LJIIIIZZ, i - 1)).LIZIZ();
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Init completed, tasks: ");
                sbLIZ3.append(c0lrr.LJIIIIZZ);
                c0lrr.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ3));
                return c0ltnLIZ;
            }
        }
        return c0ltnLIZ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final Object LJJIJL(EnumC1987107qP enumC1987107qP, List list, C382220Eyi c382220Eyi) {
        return this.LJII.LIZLLL(enumC1987107qP, list, c382220Eyi);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0191  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJI(java.lang.String r50, java.util.List<com.ss.android.ugc.aweme.creative.model.aigc.AIGCPushResult> r51, X.InterfaceC1364105Vn<? super kotlin.Unit> r52) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJJJI(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super java.util.List<X.C0LSZ>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C544400LWs
            if (r0 == 0) goto L39
            r4 = r8
            X.0LWs r4 = (X.C544400LWs) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L3f
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            java.util.List r0 = X.C0LXK.LIZLLL(r3)
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.0LX1 r0 = X.C0LX2.LIZ()
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZLLL(r6, r7, r4)
            if (r3 != r2) goto L22
            return r2
        L39:
            X.0LWs r4 = new X.0LWs
            r4.<init>(r5, r8)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl.LJJJJJ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final Object LJIIZILJ(List<Long> list, String str, String str2, InterfaceC1364105Vn<? super QuotaResult> interfaceC1364105Vn) {
        return this.LJII.LJ(list, str, str2, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final void LJJIZ(String str, String str2, String str3, AwS217S0300000_8 awS217S0300000_8) {
        C23250099c.LIZLLL(LIZIZ(), null, null, new C453001pY(this, str, str2, str3, awS217S0300000_8, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final Object LJJJJI(String str, String str2, String str3, InterfaceC1364105Vn<? super Pair<Integer, Integer>> interfaceC1364105Vn) {
        return this.LJI.LIZJ(str, str2, str3, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager
    public final Object LJJIIJ(Integer num, String str, String str2, String str3, String str4, String str5, List list, C382230Eyj c382230Eyj) {
        return this.LJII.LJIIJ(new ReportTaskBody(num, str, str2, str3, str4, str5, list), c382230Eyj);
    }
}
