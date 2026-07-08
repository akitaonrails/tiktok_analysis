package com.ss.android.ugc.aweme.poi.collect.detailfeed;

import X.C01GW;
import X.C1308910kAL;
import X.C452501pT;
import android.graphics.drawable.GradientDrawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiFeedBottomCircleFavoriteAssem extends PoiFeedBottomBaseFavoriteAssem {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 942));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 943));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 944));

    @Override // com.ss.android.ugc.aweme.poi.collect.detailfeed.PoiFeedBottomBaseFavoriteAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e19;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View zp() {
        return (View) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Jp(boolean z) {
        if (z) {
            ((TuxIconView) this.LLJL.getValue()).setIconRes(R.raw.icon_bookmark_fill);
        } else {
            ((TuxIconView) this.LLJL.getValue()).setIconRes(R.raw.icon_bookmark);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.detailfeed.PoiFeedBottomBaseFavoriteAssem, com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), R.style.y0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0p, contextThemeWrapper);
        if (numLIZJ != null) {
            ((TuxIconView) this.LLJL.getValue()).setTintColor(numLIZJ.intValue());
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, contextThemeWrapper);
        if (numLIZJ2 != null) {
            int iIntValue = numLIZJ2.intValue();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(iIntValue);
            zp().setBackground(gradientDrawable);
        }
    }
}
