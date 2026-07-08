package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel;

import X.C0NOH;
import X.C0NOI;
import X.C0NOL;
import X.C1730740v8i;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardActivityInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.FlashDealTemplateItem;
import kotlin.jvm.internal.AwS16S0002000_26;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS675S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class FlashDealTemplateEditViewModel extends AssemViewModel<C1730740v8i> {
    public FlashDealTemplateItem LL = new FlashDealTemplateItem(null, null, null, null, null, null, null, false, false, false, false, null, null, null, 262143);
    public C0NOH LLILLJJLI;
    public long LLILLL;
    public long LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1730740v8i(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[PHI: r4
      0x004d: PHI (r4v9 java.lang.String) = (r4v3 java.lang.String), (r4v10 java.lang.String) binds: [B:18:0x004b, B:16:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[PHI: r4
      0x0051: PHI (r4v8 java.lang.String) = (r4v3 java.lang.String), (r4v9 java.lang.String) binds: [B:18:0x004b, B:20:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[PHI: r2 r4
      0x0054: PHI (r2v11 java.lang.String) = (r2v15 java.lang.String), (r2v16 java.lang.String) binds: [B:22:0x0052, B:20:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r4v4 java.lang.String) = (r4v8 java.lang.String), (r4v9 java.lang.String) binds: [B:22:0x0052, B:20:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[PHI: r2 r4
      0x0058: PHI (r2v14 java.lang.String) = (r2v11 java.lang.String), (r2v15 java.lang.String) binds: [B:24:0x0056, B:22:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r4v7 java.lang.String) = (r4v4 java.lang.String), (r4v8 java.lang.String) binds: [B:24:0x0056, B:22:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0131 A[PHI: r1 r2 r4
      0x0131: PHI (r1v11 java.lang.String) = (r1v10 java.lang.String), (r1v13 java.lang.String) binds: [B:24:0x0056, B:26:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r2v12 java.lang.String) = (r2v11 java.lang.String), (r2v14 java.lang.String) binds: [B:24:0x0056, B:26:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v7 java.lang.String) binds: [B:24:0x0056, B:26:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.FlashDealTemplateItem wQ2() {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.FlashDealTemplateEditViewModel.wQ2():com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.FlashDealTemplateItem");
    }

    public final void vQ2(BillboardActivityInfo billboardActivityInfo) {
        long jLongValue;
        C0NOH c0noh = this.LLILLJJLI;
        if (c0noh != null) {
            c0noh.LIZJ();
        }
        this.LLILLJJLI = null;
        if (billboardActivityInfo != null && billboardActivityInfo.activityStatus != 3) {
            Long l = billboardActivityInfo.beginTime;
            long jLongValue2 = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Long l2 = billboardActivityInfo.endTime;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            }
            C0NOI c0noiLIZ = C0NOL.LIZ(jLongValue, jLongValue2, this.LLILZ, this.LLILLL);
            if (c0noiLIZ != null) {
                C0NOH c0noh2 = new C0NOH();
                this.LLILLJJLI = c0noh2;
                c0noh2.LIZ(new AwS675S0100000_26(this, 5));
                C0NOH c0noh3 = this.LLILLJJLI;
                if (c0noh3 != null) {
                    c0noh3.LIZLLL(c0noiLIZ);
                }
                C0NOH c0noh4 = this.LLILLJJLI;
                if (c0noh4 != null) {
                    setState(new AwS38S0001000_26(c0noh4.LIZJ, 3));
                }
                C0NOH c0noh5 = this.LLILLJJLI;
                if (c0noh5 != null) {
                    C0NOH.LJ(c0noh5);
                }
            }
        }
    }

    public final void xQ2(int i) {
        int i2;
        if (i == 3) {
            i2 = getState().LLIZ - 1;
        } else {
            i2 = getState().LLIZ;
        }
        setState(new AwS16S0002000_26(i, i2, 3));
    }
}
