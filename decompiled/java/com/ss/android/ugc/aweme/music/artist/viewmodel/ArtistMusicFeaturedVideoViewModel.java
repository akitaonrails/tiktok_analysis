package com.ss.android.ugc.aweme.music.artist.viewmodel;

import X.AbstractC316870CbV;
import X.C09R9;
import X.C1164770gPr;
import X.C1165730gRP;
import X.C1165750gRR;
import X.C13BV;
import X.C13LE;
import X.C1559260qg8;
import X.C316640Cb8;
import X.C317290CcB;
import X.C614640O8w;
import X.C627660Ojc;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class ArtistMusicFeaturedVideoViewModel extends AssemListViewModel<C1165750gRR, InterfaceC1891350zJl, Long> {
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C614640O8w.class));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C1164770gPr.class, "hierarchy_data_artist_music"), true);
    public String LLILLL = "";
    public final ArrayList<InterfaceC1891350zJl> LLILZ = new ArrayList<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1165750gRR(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 194));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1165840gRa
            if (r0 == 0) goto L5b
            r5 = r7
            X.0gRa r5 = (X.C1165840gRa) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r0 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILZ
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 != r3) goto L61
            X.0CcB r1 = r5.LL
            X.C155000ia.LIZIZ(r0)
        L24:
            java.util.List r0 = (java.util.List) r0
            r1.getClass()
            X.0Cb8 r1 = new X.0Cb8
            r1.<init>(r0)
            return r1
        L2f:
            X.C155000ia.LIZIZ(r0)
            X.0qg8 r0 = r6.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            X.0gPr r0 = (X.C1164770gPr) r0
            if (r0 == 0) goto L40
            java.lang.String r2 = r0.LLILLL
            if (r2 != 0) goto L42
        L40:
            java.lang.String r2 = ""
        L42:
            kotlin.jvm.internal.AwS69S1000000_18 r1 = new kotlin.jvm.internal.AwS69S1000000_18
            r0 = 13
            r1.<init>(r2, r0)
            r6.setState(r1)
            r6.LLILLL = r2
            X.0CcB r1 = X.AbstractC316870CbV.LIZ
            r5.LL = r1
            r5.LLILZ = r3
            java.lang.Object r0 = r6.vQ2(r5)
            if (r0 != r4) goto L24
            return r4
        L5b:
            X.0gRa r5 = new X.0gRa
            r5.<init>(r6, r7)
            goto L12
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC1891350zJl>> r13) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel.vQ2(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        l.longValue();
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        c317290CcB.getClass();
        return new C316640Cb8(c13bv);
    }
}
