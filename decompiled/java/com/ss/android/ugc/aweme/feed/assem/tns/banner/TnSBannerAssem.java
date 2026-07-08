package com.ss.android.ugc.aweme.feed.assem.tns.banner;

import X.C1558520qew;
import X.C707140RoW;
import X.C724270Sb3;
import X.EnumC700430Rdh;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class TnSBannerAssem extends BaseCellSlotComponent<TnSBannerAssem> implements TnSBannerAssemAbility, InterfaceC1554640qYg {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bb0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -242179478) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.banner.TnSBannerAssemAbility
    public final void OZ1() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        up((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    public final boolean tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C707140RoW.LIZIZ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Bp, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r17) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.tns.banner.TnSBannerAssem.up(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        setComponentClickStatusExperimental(getContentView(), EnumC700430Rdh.POSITIVE);
    }
}
