package com.ss.android.ugc.aweme.mix.addfeed.viewmodel;

import X.C01GW;
import X.C1168620gW4;
import X.C1168650gW7;
import X.C452501pT;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class GetMixListViewModel extends ViewModel {
    public C1168650gW7 LLILLJJLI;
    public boolean LLILZ;
    public Aweme LLIZ;
    public boolean LLJI;
    public int LL = -1;
    public boolean LLILLL = true;
    public final List<C1168620gW4> LLILZIL = new ArrayList();
    public String LLILZLL = "";
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 408));

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C1168650gW7> vQ2(java.util.List<com.ss.android.ugc.aweme.mix.model.MixStruct> r10, boolean r11) {
        /*
            r9 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2 = 0
            r4 = 1
            if (r10 == 0) goto L86
            boolean r0 = r9.LLILLL
            if (r0 == 0) goto L71
            if (r11 != 0) goto L71
            X.0gW4 r0 = new X.0gW4
            r0.<init>(r2)
            r0.LLILZ = r2
            r3.add(r0)
        L19:
            java.util.Iterator r8 = r10.iterator()
            r6 = 0
        L1e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L80
            int r7 = r6 + 1
            java.lang.Object r1 = r8.next()
            com.ss.android.ugc.aweme.mix.model.MixStruct r1 = (com.ss.android.ugc.aweme.mix.model.MixStruct) r1
            X.0gW4 r5 = new X.0gW4
            r5.<init>(r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r1.getIcon()
            r5.LLILLL = r0
            java.lang.String r0 = r1.getMixName()
            r5.LLILLJJLI = r0
            java.lang.String r0 = r1.mixId
            r5.LLILZIL = r0
            int r0 = r1.getMixLabel()
            r5.LLILZLL = r0
            r5.LLILZ = r4
            if (r11 != 0) goto L6c
            java.lang.String r0 = r9.LLILZLL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6c
            java.lang.String r1 = r1.mixId
            java.lang.String r0 = r9.LLILZLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6c
            r5.LLIZ = r4
            boolean r0 = r9.LLILLL
            if (r0 != 0) goto L67
            boolean r0 = r9.LLILZ
            if (r0 == 0) goto L68
        L67:
            r6 = r7
        L68:
            r9.LL = r6
            r9.LLILLJJLI = r5
        L6c:
            r3.add(r5)
            r6 = r7
            goto L1e
        L71:
            boolean r0 = r9.LLILZ
            if (r0 == 0) goto L19
            if (r11 != 0) goto L19
            X.0gW6 r0 = new X.0gW6
            r0.<init>(r2)
            r3.add(r0)
            goto L19
        L80:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L94
        L86:
            boolean r0 = r9.LLILZ
            if (r0 == 0) goto L94
            if (r11 != 0) goto L94
            X.0gW6 r0 = new X.0gW6
            r0.<init>(r2)
            r3.add(r0)
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel.vQ2(java.util.List, boolean):java.util.List");
    }
}
