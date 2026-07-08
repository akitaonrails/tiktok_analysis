package com.ss.android.ugc.aweme.im.b2c.replies.vm;

import X.C01GW;
import X.C051N;
import X.C13BV;
import X.C1753306tn;
import X.C1784220wWy;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C452501pT;
import X.C866950Xzh;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class BusinessQuickReplyPanelVM extends AssemViewModel<InterfaceC0148002o> {
    public final C2252321DDq LL;
    public final C2252321DDq LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;
    public final C01GW LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0wX3
        };
    }

    public BusinessQuickReplyPanelVM() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C13BV.INSTANCE);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(null);
        this.LLILLL = c2252321DDqLIZ2;
        this.LLILZ = c2252321DDqLIZ2;
        this.LLILZIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(119));
    }

    public final void wQ2(String str, boolean z) {
        List listLIZ = C051N.LIZ(str);
        Iterator it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        this.LL.setValue(listLIZ);
        ((C1753306tn) this.LLILZIL.getValue()).LIZ = C866950Xzh.LIZIZ((Collection) this.LL.getValue());
        if (z) {
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1784220wWy(str, this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(java.lang.String r10, java.util.List<com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply> r11, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C1784240wX0
            if (r0 == 0) goto L23
            r6 = r12
            X.0wX0 r6 = (X.C1784240wX0) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r5 = 1
            r8 = 0
            if (r0 == 0) goto L31
            if (r0 != r5) goto L29
            java.lang.Object r11 = r6.LL
            goto L81
        L23:
            X.0wX0 r6 = new X.0wX0
            r6.<init>(r9, r12)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r1)
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r10)     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L8b
            long r2 = r0.longValue()     // Catch: java.lang.Exception -> L8c
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L8c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L8c
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r11, r0)     // Catch: java.lang.Exception -> L8c
            r4.<init>(r0)     // Catch: java.lang.Exception -> L8c
            java.util.Iterator r1 = r11.iterator()     // Catch: java.lang.Exception -> L8c
        L50:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L62
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> L8c
            com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply r0 = (com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply) r0     // Catch: java.lang.Exception -> L8c
            java.lang.String r0 = r0.id     // Catch: java.lang.Exception -> L8c
            r4.add(r0)     // Catch: java.lang.Exception -> L8c
            goto L50
        L62:
            java.lang.String r4 = X.C0178003s.LIZ(r4)     // Catch: java.lang.Exception -> L8c
            if (r4 != 0) goto L6a
            java.lang.String r4 = ""
        L6a:
            X.0wuh r0 = com.ss.android.ugc.aweme.im.b2c.replies.api.IMQuickReplyNetAPI.LIZ     // Catch: java.lang.Exception -> L8c
            r0.getClass()     // Catch: java.lang.Exception -> L8c
            com.ss.android.ugc.aweme.im.b2c.replies.api.IMQuickReplyNetAPI r1 = X.C1798930wuh.LIZIZ     // Catch: java.lang.Exception -> L8c
            com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplyIdListRequest r0 = new com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplyIdListRequest     // Catch: java.lang.Exception -> L8c
            r0.<init>(r2, r4)     // Catch: java.lang.Exception -> L8c
            r6.LL = r11     // Catch: java.lang.Exception -> L8c
            r6.LLILZ = r5     // Catch: java.lang.Exception -> L8c
            java.lang.Object r1 = r1.deleteQuickReply(r0, r6)     // Catch: java.lang.Exception -> L8c
            if (r1 != r7) goto L84
            return r7
        L81:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L8c
        L84:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Exception -> L8c
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L8c
            if (r0 != 0) goto L8b
            return r11
        L8b:
            return r8
        L8c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0.getMessage()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b2c.replies.vm.BusinessQuickReplyPanelVM.vQ2(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(java.lang.String r9, java.util.List<com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply> r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C1784250wX1
            if (r0 == 0) goto L20
            r6 = r11
            X.0wX1 r6 = (X.C1784250wX1) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 1
            if (r0 == 0) goto L2e
            if (r0 != r5) goto L26
            goto L79
        L20:
            X.0wX1 r6 = new X.0wX1
            r6.<init>(r8, r11)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r9)
            if (r0 == 0) goto Laa
            long r2 = r0.longValue()
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L8d
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r10, r0)     // Catch: java.lang.Exception -> L8d
            r4.<init>(r0)     // Catch: java.lang.Exception -> L8d
            java.util.Iterator r1 = r10.iterator()     // Catch: java.lang.Exception -> L8d
        L4a:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L8d
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> L8d
            com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply r0 = (com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply) r0     // Catch: java.lang.Exception -> L8d
            java.lang.String r0 = r0.id     // Catch: java.lang.Exception -> L8d
            r4.add(r0)     // Catch: java.lang.Exception -> L8d
            goto L4a
        L5c:
            java.lang.String r4 = X.C0178003s.LIZ(r4)     // Catch: java.lang.Exception -> L8d
            if (r4 != 0) goto L64
            java.lang.String r4 = ""
        L64:
            X.0wuh r0 = com.ss.android.ugc.aweme.im.b2c.replies.api.IMQuickReplyNetAPI.LIZ     // Catch: java.lang.Exception -> L8d
            r0.getClass()     // Catch: java.lang.Exception -> L8d
            com.ss.android.ugc.aweme.im.b2c.replies.api.IMQuickReplyNetAPI r1 = X.C1798930wuh.LIZIZ     // Catch: java.lang.Exception -> L8d
            com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplyIdListRequest r0 = new com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplyIdListRequest     // Catch: java.lang.Exception -> L8d
            r0.<init>(r2, r4)     // Catch: java.lang.Exception -> L8d
            r6.LLILLL = r5     // Catch: java.lang.Exception -> L8d
            java.lang.Object r1 = r1.reorderQuickReply(r0, r6)     // Catch: java.lang.Exception -> L8d
            if (r1 != r7) goto L7c
            return r7
        L79:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L8d
        L7c:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Exception -> L8d
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L8d
            if (r0 == 0) goto L88
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L8d
            return r0
        L88:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L8d
            return r0
        L8d:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "reorderQuickReplyItems error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        Laa:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b2c.replies.vm.BusinessQuickReplyPanelVM.xQ2(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(java.lang.String r11, com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply r12, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplySaveResponse> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C1784230wWz
            if (r0 == 0) goto L20
            r3 = r13
            X.0wWz r3 = (X.C1784230wWz) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L59
        L20:
            X.0wWz r3 = new X.0wWz
            r3.<init>(r10, r13)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r11)
            if (r0 == 0) goto L63
            long r5 = r0.longValue()
            java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplySaveRequest r4 = new com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplySaveRequest
            java.lang.String r7 = r12.id
            int r8 = r12.type
            com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReplyContent r9 = r12.content
            r4.<init>(r5, r7, r8, r9)
            X.0wuh r0 = com.ss.android.ugc.aweme.im.b2c.replies.api.IMQuickReplyNetAPI.LIZ     // Catch: java.lang.Exception -> L5f
            r0.getClass()     // Catch: java.lang.Exception -> L5f
            com.ss.android.ugc.aweme.im.b2c.replies.api.IMQuickReplyNetAPI r0 = X.C1798930wuh.LIZIZ     // Catch: java.lang.Exception -> L5f
            r3.LLILLL = r1     // Catch: java.lang.Exception -> L5f
            java.lang.Object r4 = r0.saveQuickReply(r4, r3)     // Catch: java.lang.Exception -> L5f
            if (r4 != r2) goto L5c
            return r2
        L59:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L5f
        L5c:
            com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplySaveResponse r4 = (com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplySaveResponse) r4     // Catch: java.lang.Exception -> L5f
            return r4
        L5f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L63:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b2c.replies.vm.BusinessQuickReplyPanelVM.yQ2(java.lang.String, com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply, X.05Vn):java.lang.Object");
    }
}
