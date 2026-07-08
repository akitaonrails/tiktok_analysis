package com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary;

import X.C01GW;
import X.C1829707Ep;
import X.C452501pT;
import X.C657420PqW;
import X.C723830SaL;
import X.InterfaceC657870PrF;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSinglePhotoDocAssem extends SearchSingleDocAssem {
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(297));

    @Override // com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchSingleDocAssem
    public final void sp() {
        C723830SaL.LJ(this, ((SearchComponentCenter.SoundIcon) this.LLJZ.getValue()).LIZ(), true, null);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchSingleDocAssem
    public final InterfaceC657870PrF tp() {
        return new C657420PqW(AFwS241S0000000_10.get$arr$(289));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchSingleDocAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (C1829707Ep.LIZ()) {
            C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 263));
        }
    }
}
