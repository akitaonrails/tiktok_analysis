package com.ss.android.ugc.aweme.ecommerce.search.page.mix;

import X.C1390410mHn;
import X.C678120Qio;
import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.arch.MixReusedUIAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes11.dex */
public final class RefreshBallLoadingAssem extends MixReusedUIAssem<RefreshBallLoadingAssem, C678120Qio> {
    public C1390410mHn LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bp8;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.arch.MixReusedUIAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        C1390410mHn c1390410mHn = this.LLJLIL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C1390410mHn c1390410mHn2 = this.LLJLIL;
        if (c1390410mHn2 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn2, 8);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLIL = (C1390410mHn) view.findViewById(R.id.oi1);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C1390410mHn c1390410mHn = this.LLJLIL;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
        }
        C1390410mHn c1390410mHn2 = this.LLJLIL;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
    }
}
