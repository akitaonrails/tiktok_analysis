package com.ss.android.ugc.aweme.poi.albummix.cell;

import X.C1183810guZ;
import X.C2211631BhB;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS597S0100000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumMixAccCategoryMediumAssem extends BasePoiAlbumMixCardAssem<PoiAlbumMixAccCategoryMediumAssem> {
    public SmartImageView LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dy_;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLILLLLZIIL = (SmartImageView) view.findViewById(R.id.ld7);
        C2211631BhB.LJ(view, new AwS597S0100000_18(this, 234));
        C786410Ut5.I7(new AbS699S0100000_18(this, 13, 42), view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1183810guZ c1183810guZ) {
        sp(this.LLJLILLLLZIIL, c1183810guZ.LLILLJJLI.getCropAwemeCover());
    }
}
