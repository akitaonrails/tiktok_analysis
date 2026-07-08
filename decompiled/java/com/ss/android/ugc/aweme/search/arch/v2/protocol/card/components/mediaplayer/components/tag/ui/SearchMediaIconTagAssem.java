package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.tag.ui;

import X.C1559260qg8;
import X.C1954807lC;
import X.C418440Gaw;
import X.C426750GoL;
import X.C654550Plt;
import X.C656260Poe;
import X.C656270Pof;
import X.C720360SNm;
import X.C723580SZw;
import X.C814420VxA;
import X.EnumC656280Pog;
import X.InterfaceC655790Pnt;
import X.InterfaceC657240PqE;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaIconTagAssem extends BaseSearchMediaOptionalAssem {
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL = new C1559260qg8(new C723580SZw(this, C654550Plt.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eua;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        op(view);
        C426750GoL.LJIIIZ(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 24);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final void op(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) view.findViewById(R.id.u92);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC657240PqE interfaceC657240PqE) {
        up(interfaceC657240PqE);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    /* JADX INFO: renamed from: tp */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        C656260Poe c656260Poe;
        EnumC656280Pog enumC656280Pog;
        int iIntValue;
        Integer num;
        super.up(interfaceC657240PqE);
        InterfaceC655790Pnt tag = interfaceC657240PqE.getTag();
        if ((tag instanceof C656260Poe) && (c656260Poe = (C656260Poe) tag) != null && (enumC656280Pog = c656260Poe.LIZ) != null) {
            Aweme aweme = interfaceC657240PqE.getAweme();
            TuxIconView tuxIconView = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView != null) {
                int i = C656270Pof.LIZ[enumC656280Pog.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        iIntValue = R.raw.icon_bag_fill;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C654550Plt c654550Plt = (C654550Plt) this.LLJL.getValue();
                    if (c654550Plt != null && (num = c654550Plt.LLIZLLLIL) != null) {
                        iIntValue = num.intValue();
                    } else if (C720360SNm.LJIIL(aweme)) {
                        iIntValue = R.raw.icon_horizontal_bars;
                    } else {
                        iIntValue = R.raw.icon_image_alt_1_fill;
                    }
                }
                tuxIconView.setIconRes(iIntValue);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final boolean up(InterfaceC657240PqE interfaceC657240PqE) {
        return interfaceC657240PqE.getTag() instanceof C656260Poe;
    }
}
