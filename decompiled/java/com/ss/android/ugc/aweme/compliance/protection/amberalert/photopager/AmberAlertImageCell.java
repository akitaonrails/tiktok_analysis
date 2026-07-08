package com.ss.android.ugc.aweme.compliance.protection.amberalert.photopager;

import X.C0HFW;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class AmberAlertImageCell extends PowerCell<C0HFW> implements InterfaceC20631915oL {
    public SmartImageView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.bf5;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.drf);
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageUnselected: ");
        sbLIZ.append(getLayoutPosition());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0HFW c0hfw = (C0HFW) interfaceC1891350zJl;
        super.onBindItemView(c0hfw);
        if (this.LL != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(c0hfw.LL);
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJIIIZ.LIZLLL("AmberAlertImageCell");
            c1331670kl3LJIIIZ.LJJ(this.LL);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
