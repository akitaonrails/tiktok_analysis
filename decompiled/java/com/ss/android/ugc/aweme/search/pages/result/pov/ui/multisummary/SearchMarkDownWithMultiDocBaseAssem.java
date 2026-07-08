package com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary;

import X.C01GW;
import X.C07GH;
import X.C339190DRl;
import X.C452501pT;
import X.C684760QtW;
import X.C684950Qtp;
import X.C723830SaL;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchMarkDownWithMultiDocBaseAssem extends SearchMultiSummaryBaseAssem<C684760QtW> {
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 654));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eyh;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseAssem
    /* JADX INFO: renamed from: Ap, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void up(C684760QtW c684760QtW) {
        super.up(c684760QtW);
        if (C07GH.LIZ()) {
            if (C684950Qtp.LIZIZ(c684760QtW)) {
                C339190DRl.LIZLLL((View) this.LLJLLL.getValue());
                yp(true);
            } else {
                C339190DRl.LIZIZ((View) this.LLJLLL.getValue());
                yp(false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseAssem
    public final void tp(View view) {
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 259));
    }
}
