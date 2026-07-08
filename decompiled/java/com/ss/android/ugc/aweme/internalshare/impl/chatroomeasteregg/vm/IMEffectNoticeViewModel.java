package com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm;

import X.C01GW;
import X.C0HNT;
import X.C0NP0;
import X.C0NPA;
import X.C0PEM;
import X.C2188811AlT;
import X.C23250099c;
import X.C291001Au;
import X.C452501pT;
import X.C593330NOx;
import X.InterfaceC0148002o;
import X.InterfaceC593210NOl;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class IMEffectNoticeViewModel extends AssemViewModel<C0HNT> implements InterfaceC593210NOl {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(210));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0HNT(new C291001Au(null), new C291001Au(null));
    }

    public final void xQ2() {
        String str;
        String str2 = this.LL;
        if (str2 == null || (str = this.LLILLJJLI) == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C593330NOx(str2, this, str, null), 2);
    }

    public final IAwemeEffectRepository yQ2() {
        return (IAwemeEffectRepository) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        IAwemeEffectRepository iAwemeEffectRepositoryYQ2;
        super.onCleared();
        String str = this.LL;
        if (str != null && (iAwemeEffectRepositoryYQ2 = yQ2()) != null) {
            iAwemeEffectRepositoryYQ2.LJIIIZ(str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCleared: unregistered callback for convId=");
        sbLIZ.append(this.LL);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC593210NOl
    public final void hx(C0NPA c0npa) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNewMessageForEffect: msgUuid=");
        sbLIZ.append(c0npa.LIZIZ);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(c0npa.LIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        String str2 = this.LL;
        if (str2 != null && (str = this.LLILLJJLI) != null && Intrinsics.LJFF(str, str)) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0NP0(this, c0npa, str2, str, null), 2);
        }
    }

    @Override // X.InterfaceC593210NOl
    public final void o50(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadOlderComplete: convId=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        xQ2();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(X.C0NPA r7, java.util.List<java.lang.String> r8, java.lang.String r9, X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C436640HAg
            if (r0 == 0) goto L7c
            r4 = r10
            X.0HAg r4 = (X.C436640HAg) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 != r2) goto L82
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L27:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = r6.LLILLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
            if (r0 == 0) goto L4c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "tryTriggerExplosion: triggerId="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " already triggered in this session"
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L4c:
            r6.LLILLL = r9
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Triggered Explosion! triggerId="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", pendingIds="
            r1.append(r0)
            int r0 = r8.size()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0HAf r5 = new X.0HAf
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r4.LLILLL = r2
            java.lang.Object r0 = X.C23250099c.LJI(r4, r0, r5)
            if (r0 != r3) goto L22
            return r3
        L7c:
            X.0HAg r4 = new X.0HAg
            r4.<init>(r6, r10)
            goto L12
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel.AQ2(X.0NPA, java.util.List, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(java.lang.String r19, long r20, java.lang.String r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel.wQ2(java.lang.String, long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(java.lang.String r13, java.util.List r14, java.util.List r15, X.InterfaceC1364105Vn r16) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel.zQ2(java.lang.String, java.util.List, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.C0NPA r14, java.lang.String r15, long r16, long r18, java.lang.String r20, X.InterfaceC1364105Vn<? super java.lang.Boolean> r21) {
        /*
            r13 = this;
            r4 = r21
            r1 = r20
            boolean r0 = r4 instanceof X.C0NP4
            if (r0 == 0) goto L8c
            r12 = r4
            X.0NP4 r12 = (X.C0NP4) r12
            int r3 = r12.LLILZIL
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L8c
            int r3 = r3 - r2
            r12.LLILZIL = r3
        L16:
            java.lang.Object r5 = r12.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r2 = r12.LLILZIL
            r3 = 2
            r0 = 1
            if (r2 == 0) goto L2a
            if (r2 == r0) goto L47
            if (r2 != r3) goto L92
            X.C155000ia.LIZIZ(r5)
        L29:
            return r5
        L2a:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository r5 = r13.yQ2()
            if (r5 == 0) goto La0
            java.lang.String r11 = r14.LIZLLL
            r12.LL = r14
            r12.LLILLJJLI = r1
            r12.LLILZIL = r0
            r8 = r18
            r6 = r16
            r10 = r15
            java.lang.Object r5 = r5.LJIIIIZZ(r6, r8, r10, r11, r12)
            if (r5 != r4) goto L4e
            return r4
        L47:
            java.lang.Object r1 = r12.LLILLJJLI
            X.0NPA r14 = r12.LL
            X.C155000ia.LIZIZ(r5)
        L4e:
            X.0NOg r5 = (X.C593160NOg) r5
            if (r5 == 0) goto La0
            java.util.List<X.0NPA> r0 = r5.LIZ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L9a
            java.util.List<java.lang.String> r0 = r5.LIZIZ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L9a
            java.util.List<java.lang.String> r0 = r5.LIZIZ
            java.lang.Object r2 = X.C13LP.LJJLIIIJJI(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = r13.LLILLJJLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L7c
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L7c:
            java.util.List<java.lang.String> r1 = r5.LIZIZ
            r0 = 0
            r12.LL = r0
            r12.LLILLJJLI = r0
            r12.LLILZIL = r3
            java.lang.Object r5 = r13.AQ2(r14, r1, r2, r12)
            if (r5 != r4) goto L29
            return r4
        L8c:
            X.0NP4 r12 = new X.0NP4
            r12.<init>(r13, r4)
            goto L16
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9a:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        La0:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel.vQ2(X.0NPA, java.lang.String, long, long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
