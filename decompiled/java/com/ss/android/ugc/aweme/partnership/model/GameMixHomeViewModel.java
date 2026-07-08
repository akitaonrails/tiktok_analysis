package com.ss.android.ugc.aweme.partnership.model;

import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C0KBN;
import X.C11NZ;
import X.C13BV;
import X.C15438062q;
import X.C1697810uHb;
import X.C1882020z4i;
import X.C1885250z9v;
import X.C1885310zA1;
import X.C1885320zA2;
import X.C1885680zAc;
import X.C1886290zBb;
import X.C20600815jK;
import X.C207700r5;
import X.C2189821An6;
import X.C326220Cqa;
import X.C470590Icr;
import X.C627660Ojc;
import X.C687540Qy0;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1885100z9g;
import X.InterfaceC1891350zJl;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game_station.GameDetailVideosRequest;
import webcast.api.game_station.GameDetailVideosResponse;

/* JADX INFO: loaded from: classes29.dex */
public final class GameMixHomeViewModel extends BaseDetailShareVM<C326220Cqa, C207700r5, C1886290zBb> implements InterfaceC1885100z9g {
    public Function1<? super C1885320zA2, Unit> LLILZLL;
    public C1886290zBb LLIZ;
    public Function0<? extends C11NZ<C470590Icr<GameDetailVideosResponse.ResponseData>>> LLIZLLLIL;
    public boolean LLJIJIL;
    public boolean LLILZIL = true;
    public final String LLJ = "";
    public final String LLJI = "";
    public GameDetailVideosRequest LLJILJIL = new GameDetailVideosRequest();

    @Override // X.InterfaceC1885100z9g
    public final void Lz1(C1885680zAc c1885680zAc) {
    }

    @Override // X.InterfaceC1885100z9g
    public final void gZ0(C1885250z9v c1885250z9v) {
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 61;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326220Cqa(0);
    }

    @Override // X.InterfaceC1885100z9g
    public final AbstractC329610Cw3<?> G12() {
        return getConfig();
    }

    public final List<InterfaceC1891350zJl> BQ2(List<? extends Aweme> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (Aweme aweme : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(new C207700r5(aweme, 0L, this.LLJ, this.LLJI));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1886290zBb>> r10) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.partnership.model.GameMixHomeViewModel.CQ2(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1885100z9g
    public final void Et1(C1885310zA1 c1885310zA1) {
        this.LLILZLL = c1885310zA1;
    }

    @Override // X.InterfaceC1885100z9g
    public final C687540Qy0 F51(Context context) {
        return new C687540Qy0(context);
    }

    @Override // X.InterfaceC1885100z9g
    public final void Fl1(C1882020z4i c1882020z4i) {
        this.LLIZLLLIL = c1882020z4i;
        this.LLJIJIL = false;
    }

    @Override // X.InterfaceC1885100z9g
    public final void nT1(GameDetailVideosRequest gameDetailVideosRequest) {
        this.LLJILJIL = gameDetailVideosRequest;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C207700r5> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 97));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1886290zBb>> interfaceC1364105Vn) {
        GameDetailVideosRequest gameDetailVideosRequest = this.LLJILJIL;
        gameDetailVideosRequest.pullScore = 0L;
        gameDetailVideosRequest.pullType = 0;
        return CQ2(interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        String aid;
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Aweme aweme = ((C207700r5) it2.next()).LL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str)) {
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
        return ((C207700r5) interfaceC1891350zJl).LL;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        this.LLJILJIL.pullType = 1;
        return CQ2(interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1885100z9g
    public final void pQ(Fragment fragment, C20600815jK c20600815jK) {
        AQ2(fragment);
        setListState(c20600815jK);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C1886290zBb yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        C1886290zBb c1886290zBb = this.LLIZ;
        if (c1886290zBb == null) {
            return new C1886290zBb();
        }
        return c1886290zBb;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void DQ2(com.ss.android.ugc.aweme.partnership.model.GameMixHomeViewModel r12, boolean r13, X.C1886330zBf r14, java.lang.Throwable r15, int r16) {
        /*
            r9 = 1
            r10 = 0
            r0 = r16 & 8
            r11 = 0
            if (r0 == 0) goto L8
            r14 = r11
        L8:
            r0 = r16 & 16
            if (r0 != 0) goto Ld
            r11 = r15
        Ld:
            kotlin.jvm.functions.Function1<? super X.0zA2, kotlin.Unit> r4 = r12.LLILZLL
            if (r4 == 0) goto L67
            X.0zA2 r6 = new X.0zA2
            if (r14 == 0) goto L68
            java.util.List<com.bytedance.android.livesdk.game.model.ItemInfo> r1 = r14.LIZIZ
            if (r1 == 0) goto L68
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r14.LIZ
            if (r0 != 0) goto L1f
            X.13BV r0 = X.C13BV.INSTANCE
        L1f:
            java.util.List r1 = X.C13LP.LLIILII(r1, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r5.<init>(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r3 = r1.iterator()
        L34:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r3.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            X.0zA9 r2 = new X.0zA9
            java.lang.Object r1 = r0.getFirst()
            com.bytedance.android.livesdk.game.model.ItemInfo r1 = (com.bytedance.android.livesdk.game.model.ItemInfo) r1
            java.lang.Object r0 = r0.getSecond()
            r2.<init>(r1, r0)
            r5.add(r2)
            goto L34
        L53:
            java.util.List r1 = X.C13LP.LLIIII(r5)
            if (r1 == 0) goto L68
            r0 = 4
            java.util.List r8 = X.C13LP.LL(r1, r0)
            if (r8 == 0) goto L68
        L60:
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r4.invoke(r6)
        L67:
            return
        L68:
            X.13BV r8 = X.C13BV.INSTANCE
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.partnership.model.GameMixHomeViewModel.DQ2(com.ss.android.ugc.aweme.partnership.model.GameMixHomeViewModel, boolean, X.0zBf, java.lang.Throwable, int):void");
    }
}
