package com.ss.android.ugc.aweme.detail.jsb;

import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C099F;
import X.C0KBN;
import X.C20603715jn;
import X.C208500rD;
import X.C2189821An6;
import X.C2217401BqU;
import X.C264760AZe;
import X.C325930Cq7;
import X.C326480Cr0;
import X.C627660Ojc;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class JSBVideoDetailShareVM extends BaseDetailShareVM<C325930Cq7, C208500rD, Unit> {
    public C099F LLILZIL;
    public String LLILZLL;
    public C326480Cr0 LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 71;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325930Cq7(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C099F c099f = this.LLILZIL;
        if (c099f != null) {
            if (!c099f.isCompleted()) {
                c099f.LIZIZ(null);
            }
            this.LLILZIL = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(X.InterfaceC1364105Vn r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C326430Cqv
            if (r0 == 0) goto L5e
            r4 = r8
            X.0Cqv r4 = (X.C326430Cqv) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r6 = 1
            if (r0 == 0) goto L52
            if (r0 != r6) goto L97
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0Cr0 r3 = (X.C326480Cr0) r3
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r3.LIZ
            boolean r1 = r3.LIZIZ
            r0 = 10
            if (r1 == 0) goto L6a
            X.0CcB r5 = X.AbstractC316870CbV.LIZ
            kotlin.Unit r4 = kotlin.Unit.LIZ
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = X.C15438062q.LJIJJ(r2, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L3d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            X.00rD r0 = new X.00rD
            r0.<init>(r1)
            r3.add(r0)
            goto L3d
        L52:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r6
            java.lang.Object r3 = r7.DQ2(r4)
            if (r3 != r1) goto L22
            return r1
        L5e:
            X.0Cqv r4 = new X.0Cqv
            r4.<init>(r7, r8)
            goto L12
        L64:
            r0 = 0
            X.0Cm0 r0 = X.C317290CcB.LJ(r5, r0, r4, r3, r6)
            return r0
        L6a:
            X.0CcB r4 = X.AbstractC316870CbV.LIZ
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = X.C15438062q.LJIJJ(r2, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L79:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            X.00rD r0 = new X.00rD
            r0.<init>(r1)
            r3.add(r0)
            goto L79
        L8e:
            r4.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r3)
            return r0
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.jsb.JSBVideoDetailShareVM.BQ2(X.05Vn):java.lang.Object");
    }

    public final void CQ2(Context context) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        if (((Boolean) C264760AZe.LIZ.getValue()).booleanValue()) {
            viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(C786410Ut5.N3(context), null);
        } else {
            viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        }
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LJIIJ = true;
        c20603715jn.LIZ = 1;
        viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
        setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
        viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) new C2217401BqU(this) { // from class: X.0Cqz
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DQ2(X.InterfaceC1364105Vn<? super X.C326480Cr0> r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C326460Cqy
            if (r0 == 0) goto L82
            r8 = r11
            X.0Cqy r8 = (X.C326460Cqy) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r2 = r8.LL
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L30
            if (r0 != r6) goto L88
            X.C155000ia.LIZIZ(r2)
        L23:
            if (r2 != 0) goto L2d
        L25:
            X.0Cr0 r2 = new X.0Cr0
            X.13BV r1 = X.C13BV.INSTANCE
            r0 = 0
            r2.<init>(r1, r0)
        L2d:
            r10.LLILZIL = r7
            return r2
        L30:
            X.C155000ia.LIZIZ(r2)
            X.099F r1 = r10.LLILZIL
            if (r1 == 0) goto L42
            boolean r0 = r1.isCompleted()
            if (r0 != 0) goto L40
            r1.LIZIZ(r7)
        L40:
            r10.LLILZIL = r7
        L42:
            X.0Cr0 r0 = r10.LLIZ
            if (r0 == 0) goto L49
            r10.LLIZ = r7
            return r0
        L49:
            X.099F r0 = X.C090F.LIZIZ()
            r10.LLILZIL = r0
            boolean r0 = r10.isDataEmpty()
            if (r0 != 0) goto L75
            long r3 = java.lang.System.currentTimeMillis()
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r1 = "uniqueKey"
            java.lang.String r0 = r10.LLILZLL
            r5.put(r1, r0)
            X.0kYO r2 = new X.0kYO
            r2.<init>(r5)
            X.01gf r1 = new X.01gf
            java.lang.String r0 = "onJSBVideoDetailLoadMore"
            r1.<init>(r3, r2, r0)
            X.C1548820qPI.LIZIZ(r1)
        L75:
            X.099F r0 = r10.LLILZIL
            if (r0 == 0) goto L25
            r8.LLILLL = r6
            java.lang.Object r2 = r0.LJLIIIL(r8)
            if (r2 != r9) goto L23
            return r9
        L82:
            X.0Cqy r8 = new X.0Cqy
            r8.<init>(r10, r11)
            goto L12
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.jsb.JSBVideoDetailShareVM.DQ2(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C208500rD> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 67));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Unit>> interfaceC1364105Vn) {
        return BQ2(interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((C208500rD) it2.next()).LL.getAid(), str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        return ((C208500rD) interfaceC1891350zJl).LL;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return BQ2(interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final /* bridge */ /* synthetic */ Unit yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return Unit.LIZ;
    }
}
