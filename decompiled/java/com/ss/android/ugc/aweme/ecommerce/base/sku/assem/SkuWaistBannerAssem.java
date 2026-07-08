package com.ss.android.ugc.aweme.ecommerce.base.sku.assem;

import X.C1762630vy9;
import X.C2217381BqS;
import X.C736680Sv4;
import X.InterfaceC1763080vys;
import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistJumpSchema;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS45S2100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SkuWaistBannerAssem extends SkuPanelBaseAssem {
    public FrameLayout LLJJIJI;
    public final C1762630vy9 LLJJIJIIJIL = new InterfaceC1763080vys() { // from class: X.0vy9
        @Override // X.InterfaceC1763080vys
        public final void LIZIZ(String str, String str2) {
            C1748720vbi.LIZLLL(this.LIZ.getContentView(), new C049G(), new AwS45S2100000_26(str, this.LIZ, str2, 7));
        }

        @Override // X.InterfaceC1763080vys
        public final void LIZ(Context context, WaistJumpSchema waistJumpSchema, String str, String str2) {
            C1748720vbi.LIZLLL(this.LIZ.getContentView(), new C049H(), new AwS45S2100000_26(str, this.LIZ, str2, 6));
            C10288040o c10288040o = this.LIZ.getViewModel().LLLF;
            BaseSkuFragment<?> baseSkuFragmentIp = this.LIZ.ip();
            SkuPanelStarter skuPanelStarter = SkuPanelStarter.LIZ;
            SkuPanelStarter.SkuEnterParams skuEnterParams = this.LIZ.getViewModel().LLJI;
            skuPanelStarter.getClass();
            c10288040o.LIZ(baseSkuFragmentIp, context, SkuPanelStarter.LIZIZ(skuEnterParams, null), waistJumpSchema, "sku", str2);
        }
    };

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.az5;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem
    public final void lp() {
        C736680Sv4.LJIIIIZZ(this, getViewModel(), new C2217381BqS() { // from class: X.0vxh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getPromotionWaist();
            }
        }, null, new AwS640S0100000_26(this, 27), 6);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem
    public final void mp() {
        this.LLJJIJI = (FrameLayout) getContentView().findViewById(R.id.ei4);
    }
}
