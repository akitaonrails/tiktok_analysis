package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell;

import X.C1157100gDU;
import X.C16F5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class MainPageHeaderCell extends PowerCell<C1157100gDU> {
    public LinearLayout LL;
    public ImageView LLILLJJLI;
    public C16F5 LLILLL;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r12) {
        /*
            r11 = this;
            X.0gDU r12 = (X.C1157100gDU) r12
            super.onBindItemView(r12)
            boolean r0 = r12.LL
            if (r0 == 0) goto L6a
            android.widget.LinearLayout r3 = r11.LL
            if (r3 == 0) goto L3c
            r0 = 1115684864(0x42800000, float:64.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            X.C500260Jjc.LJLJL(r0, r3)
            X.16F5 r2 = r11.LLILLL
            if (r2 == 0) goto L21
            r1 = 1
            r0 = 1107820544(0x42080000, float:34.0)
            r2.setTextSize(r1, r0)
        L21:
            r9 = 0
            android.view.View r4 = r3.getChildAt(r9)
            boolean r0 = r4 instanceof android.widget.ImageView
            if (r0 == 0) goto L3c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r6 = 0
            r10 = 30
            r7 = r6
            r8 = r6
            X.C426750GoL.LJIIIZ(r4, r5, r6, r7, r8, r9, r10)
            X.C786410Ut5.LJJLJ(r9, r3)
            r3.addView(r4)
        L3c:
            boolean r1 = r12.LL
            if (r1 == 0) goto L60
            boolean r0 = r12.LLILLJJLI
            if (r0 == 0) goto L59
            java.lang.String r4 = "pcs_oss_header_dark_large.png"
        L46:
            android.widget.ImageView r3 = r11.LLILLJJLI
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER
            if (r1 == 0) goto L57
            X.0xUC r1 = new X.0xUC
            r1.<init>()
        L51:
            java.lang.String r0 = "tiktok_live_subscription_demand_1"
            X.C1143680frq.LJFF(r3, r0, r4, r2, r1)
            return
        L57:
            r1 = 0
            goto L51
        L59:
            boolean r0 = r12.LLILLJJLI
            if (r0 != 0) goto L67
            java.lang.String r4 = "pcs_oss_header_light_large.png"
            goto L46
        L60:
            boolean r0 = r12.LLILLJJLI
            if (r0 == 0) goto L67
            java.lang.String r4 = "pcs_oss_header_dark_small.png"
            goto L46
        L67:
            java.lang.String r4 = "pcs_oss_header_light_small.png"
            goto L46
        L6a:
            android.widget.ImageView r1 = r11.LLILLJJLI
            if (r1 == 0) goto L3c
            r0 = 1125187584(0x43110000, float:145.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            X.C500260Jjc.LJJZ(r0, r1)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell.MainPageHeaderCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.gtq, false, 4, null);
        this.LL = (LinearLayout) viewInflateItemView$default.findViewById(R.id.jit);
        this.LLILLJJLI = (ImageView) viewInflateItemView$default.findViewById(R.id.jjh);
        this.LLILLL = (C16F5) viewInflateItemView$default.findViewById(R.id.title);
        return viewInflateItemView$default;
    }
}
