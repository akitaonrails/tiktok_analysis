package com.ss.android.ugc.aweme.series.feed.tab.v2;

import X.C01GW;
import X.C098200Yq;
import X.C0SZ8;
import X.C1567810qtv;
import X.C1567850qtz;
import X.C1577250r99;
import X.C189200o6;
import X.C452501pT;
import X.C622680Oba;
import X.C627660Ojc;
import X.C729980SkG;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS130S0101000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaPicksVM extends AssemSingleListViewModel<Aweme, C1567810qtv, Long> {
    public Aweme LLILLL;
    public C1567850qtz LLILZ;
    public Function0<? extends C0SZ8> LLJ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(307));
    public final List<Aweme> LLILLJJLI = new CopyOnWriteArrayList();
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(306));
    public final List<String> LLILZLL = new ArrayList();
    public final List<String> LLIZ = new ArrayList();
    public String LLIZLLLIL = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1567810qtv(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1567850qtz c1567850qtz = this.LLILZ;
        if (c1567850qtz != null) {
            C622680Oba.LIZLLL(c1567850qtz);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<Aweme> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 229));
    }

    public final List<Aweme> vQ2(List<? extends Aweme> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (Aweme aweme : list) {
                try {
                    if (C729980SkG.LJFF(aweme, this.LLILLJJLI) < 0) {
                        ((CopyOnWriteArrayList) this.LLILLJJLI).add(aweme);
                        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                        if (iAwemeService != null) {
                            iAwemeService.LLILLL(aweme);
                        }
                        arrayList.add(aweme);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return arrayList;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
            return arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean wQ2(Aweme aweme) {
        int iIndexOf;
        List<Aweme> listItemState = ((C1567810qtv) getState()).getListItemState();
        if (listItemState != null && (iIndexOf = listItemState.indexOf(aweme)) != -1) {
            super.listRemoveItem(aweme);
            ((CopyOnWriteArrayList) this.LLILLJJLI).remove(aweme);
            setState(new AwS130S0101000_24(iIndexOf, aweme, 3));
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8 A[LOOP:0: B:29:0x00f2->B:31:0x00f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142 A[LOOP:2: B:40:0x013c->B:42:0x0142, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bd  */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object whenRefresh(X.InterfaceC1364105Vn<? super X.AbstractC1264080j02<com.ss.android.ugc.aweme.feed.model.Aweme>> r24) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.v2.DramaPicksVM.whenRefresh(X.05Vn):java.lang.Object");
    }

    public final void xQ2(String str) {
        String aid;
        C1577250r99 c1577250r99 = C1577250r99.LIZ;
        Aweme aweme = this.LLILLL;
        String authorUid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = this.LLILLL;
        if (aweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme2);
        }
        c1577250r99.LIZIZ(str, aid, authorUid);
        manualListRefresh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[Catch: Exception -> 0x028a, PHI: r10
      0x006a: PHI (r10v1 boolean) = (r10v0 boolean), (r10v13 boolean) binds: [B:16:0x0060, B:18:0x0063] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x028a, blocks: (B:4:0x0031, B:6:0x0037, B:7:0x003b, B:9:0x0041, B:11:0x004d, B:12:0x0055, B:21:0x006a, B:22:0x0077, B:24:0x007d, B:25:0x008b, B:32:0x00aa, B:34:0x00bf, B:35:0x00c1, B:36:0x00ee, B:38:0x00f4, B:40:0x0101, B:41:0x0105, B:42:0x010f, B:44:0x0115, B:46:0x0121, B:48:0x0126, B:30:0x00a2, B:31:0x00a6), top: B:108:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d A[Catch: Exception -> 0x028a, LOOP:7: B:22:0x0077->B:24:0x007d, LOOP_END, TryCatch #0 {Exception -> 0x028a, blocks: (B:4:0x0031, B:6:0x0037, B:7:0x003b, B:9:0x0041, B:11:0x004d, B:12:0x0055, B:21:0x006a, B:22:0x0077, B:24:0x007d, B:25:0x008b, B:32:0x00aa, B:34:0x00bf, B:35:0x00c1, B:36:0x00ee, B:38:0x00f4, B:40:0x0101, B:41:0x0105, B:42:0x010f, B:44:0x0115, B:46:0x0121, B:48:0x0126, B:30:0x00a2, B:31:0x00a6), top: B:108:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf A[Catch: Exception -> 0x028a, TryCatch #0 {Exception -> 0x028a, blocks: (B:4:0x0031, B:6:0x0037, B:7:0x003b, B:9:0x0041, B:11:0x004d, B:12:0x0055, B:21:0x006a, B:22:0x0077, B:24:0x007d, B:25:0x008b, B:32:0x00aa, B:34:0x00bf, B:35:0x00c1, B:36:0x00ee, B:38:0x00f4, B:40:0x0101, B:41:0x0105, B:42:0x010f, B:44:0x0115, B:46:0x0121, B:48:0x0126, B:30:0x00a2, B:31:0x00a6), top: B:108:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4 A[Catch: Exception -> 0x028a, TryCatch #0 {Exception -> 0x028a, blocks: (B:4:0x0031, B:6:0x0037, B:7:0x003b, B:9:0x0041, B:11:0x004d, B:12:0x0055, B:21:0x006a, B:22:0x0077, B:24:0x007d, B:25:0x008b, B:32:0x00aa, B:34:0x00bf, B:35:0x00c1, B:36:0x00ee, B:38:0x00f4, B:40:0x0101, B:41:0x0105, B:42:0x010f, B:44:0x0115, B:46:0x0121, B:48:0x0126, B:30:0x00a2, B:31:0x00a6), top: B:108:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115 A[Catch: Exception -> 0x028a, TryCatch #0 {Exception -> 0x028a, blocks: (B:4:0x0031, B:6:0x0037, B:7:0x003b, B:9:0x0041, B:11:0x004d, B:12:0x0055, B:21:0x006a, B:22:0x0077, B:24:0x007d, B:25:0x008b, B:32:0x00aa, B:34:0x00bf, B:35:0x00c1, B:36:0x00ee, B:38:0x00f4, B:40:0x0101, B:41:0x0105, B:42:0x010f, B:44:0x0115, B:46:0x0121, B:48:0x0126, B:30:0x00a2, B:31:0x00a6), top: B:108:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object whenLoadMore(java.lang.Long r24, X.InterfaceC1364105Vn<? super X.AbstractC1264080j02<com.ss.android.ugc.aweme.feed.model.Aweme>> r25) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.v2.DramaPicksVM.whenLoadMore(java.lang.Object, X.05Vn):java.lang.Object");
    }
}
