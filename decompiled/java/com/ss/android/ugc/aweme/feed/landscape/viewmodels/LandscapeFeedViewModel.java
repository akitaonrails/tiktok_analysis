package com.ss.android.ugc.aweme.feed.landscape.viewmodels;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C1157130gDX;
import X.C1218140hnw;
import X.C1279404zY;
import X.C1345905On;
import X.C1697810uHb;
import X.C2189821An6;
import X.C452501pT;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC726620Seq;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class LandscapeFeedViewModel extends BaseDetailShareVM<C1218140hnw, C1279404zY, Long> implements InterfaceC726620Seq {
    public long LLILZLL;
    public final int LLILZIL = 10;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(247));

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 26000;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1218140hnw(0);
    }

    @Override // X.InterfaceC726620Seq
    public final List<Aweme> p01() {
        List<Aweme> arrayList;
        Aweme aweme;
        List<Aweme> list = C1345905On.LIZIZ;
        if (((ArrayList) list).size() <= 0 || (aweme = (Aweme) ListProtector.get(list, 0)) == null) {
            arrayList = new ArrayList<>();
        } else {
            AwemeExtKt.appendMobParam(aweme, "landscape_screen_item_soure", "enter_group");
            arrayList = C1697810uHb.LJIILJJIL(aweme);
        }
        withState(new AwS385S0200000_19((List) arrayList, (List<Aweme>) this, (LandscapeFeedViewModel) 31));
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1279404zY> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 159));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(0L, interfaceC1364105Vn);
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
                if (Intrinsics.LJFF(((C1279404zY) it2.next()).LL.getAid(), str)) {
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
        return ((C1279404zY) interfaceC1891350zJl).LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[Catch: Exception -> 0x00b3, LOOP:0: B:26:0x0082->B:28:0x0088, LOOP_END, TryCatch #0 {Exception -> 0x00b3, blocks: (B:24:0x006c, B:25:0x006f, B:26:0x0082, B:28:0x0088, B:29:0x0097, B:31:0x009b, B:33:0x00a8, B:20:0x005c, B:21:0x005f, B:17:0x003a), top: B:38:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[Catch: Exception -> 0x00b3, TryCatch #0 {Exception -> 0x00b3, blocks: (B:24:0x006c, B:25:0x006f, B:26:0x0082, B:28:0x0088, B:29:0x0097, B:31:0x009b, B:33:0x00a8, B:20:0x005c, B:21:0x005f, B:17:0x003a), top: B:38:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8 A[Catch: Exception -> 0x00b3, TryCatch #0 {Exception -> 0x00b3, blocks: (B:24:0x006c, B:25:0x006f, B:26:0x0082, B:28:0x0088, B:29:0x0097, B:31:0x009b, B:33:0x00a8, B:20:0x005c, B:21:0x005f, B:17:0x003a), top: B:38:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(long r9, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C1218830hp3
            if (r0 == 0) goto L26
            r3 = r11
            X.0hp3 r3 = (X.C1218830hp3) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r6 = r3.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r5 = 0
            r4 = 1
            r2 = 2
            if (r0 == 0) goto L37
            if (r0 == r4) goto L34
            if (r0 != r2) goto L2c
            long r9 = r3.LL
            goto L6c
        L26:
            X.0hp3 r3 = new X.0hp3
            r3.<init>(r8, r11)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            long r9 = r3.LL
            goto L5c
        L37:
            X.C155000ia.LIZIZ(r6)
            int r0 = r8.LLILZIL     // Catch: java.lang.Exception -> Lb3
            long r0 = (long) r0     // Catch: java.lang.Exception -> Lb3
            long r9 = r9 + r0
            X.01GW r0 = r8.LLIZ     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> Lb3
            X.0hp4 r0 = (X.C1218840hp4) r0     // Catch: java.lang.Exception -> Lb3
            r3.LL = r9     // Catch: java.lang.Exception -> Lb3
            r3.LLILZ = r4     // Catch: java.lang.Exception -> Lb3
            X.0hp5 r0 = r0.LL     // Catch: java.lang.Exception -> Lb3
            r0.getClass()     // Catch: java.lang.Exception -> Lb3
            X.05Om r0 = new X.05Om     // Catch: java.lang.Exception -> Lb3
            r0.<init>(r9, r5)     // Catch: java.lang.Exception -> Lb3
            X.095D r6 = new X.095D     // Catch: java.lang.Exception -> Lb3
            r6.<init>(r0)     // Catch: java.lang.Exception -> Lb3
            if (r6 != r7) goto L5f
            return r7
        L5c:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> Lb3
        L5f:
            X.01Wa r6 = (X.InterfaceC346201Wa) r6     // Catch: java.lang.Exception -> Lb3
            r3.LL = r9     // Catch: java.lang.Exception -> Lb3
            r3.LLILZ = r2     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r6 = X.C09IC.LJIIZILJ(r6, r3)     // Catch: java.lang.Exception -> Lb3
            if (r6 != r7) goto L6f
            return r7
        L6c:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> Lb3
        L6f:
            X.05Oo r6 = (X.C1346005Oo) r6     // Catch: java.lang.Exception -> Lb3
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r6.LIZ     // Catch: java.lang.Exception -> Lb3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb3
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)     // Catch: java.lang.Exception -> Lb3
            r3.<init>(r0)     // Catch: java.lang.Exception -> Lb3
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> Lb3
        L82:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lb3
            if (r0 == 0) goto L97
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Lb3
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch: java.lang.Exception -> Lb3
            X.04zY r0 = new X.04zY     // Catch: java.lang.Exception -> Lb3
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lb3
            r3.add(r0)     // Catch: java.lang.Exception -> Lb3
            goto L82
        L97:
            boolean r0 = r6.LIZIZ     // Catch: java.lang.Exception -> Lb3
            if (r0 == 0) goto La8
            X.0CcB r1 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> Lb3
            java.lang.Long r0 = X.C2286608xc.LJFF(r9)     // Catch: java.lang.Exception -> Lb3
            X.0Cm0 r0 = X.C317290CcB.LJ(r1, r5, r0, r3, r4)     // Catch: java.lang.Exception -> Lb3
            r8.LLILZLL = r9     // Catch: java.lang.Exception -> Lb3
            return r0
        La8:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> Lb3
            r0.getClass()     // Catch: java.lang.Exception -> Lb3
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> Lb3
            r0.<init>(r3)     // Catch: java.lang.Exception -> Lb3
            return r0
        Lb3:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFeedViewModel.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return onLoadMore(((Number) obj).longValue(), (InterfaceC1364105Vn<? super AbstractC316870CbV<Long>>) interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return Long.valueOf(this.LLILZLL);
    }
}
