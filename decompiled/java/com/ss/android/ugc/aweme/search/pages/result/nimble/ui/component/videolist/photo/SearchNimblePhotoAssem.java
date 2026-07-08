package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.photo;

import X.C01GW;
import X.C452501pT;
import X.C656290Poh;
import X.C657420PqW;
import X.C786410Ut5;
import X.InterfaceC657870PrF;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.base.SearchNimbleDocBaseAssem;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNimblePhotoAssem extends SearchNimbleDocBaseAssem {
    public final C01GW LLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 588));
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(293));

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.base.SearchNimbleDocBaseAssem
    public final InterfaceC657870PrF sp() {
        return new C657420PqW(new AwS589S0100000_10(this, 244));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.base.SearchNimbleDocBaseAssem
    /* JADX INFO: renamed from: op */
    public final void tp(C656290Poh c656290Poh) {
        int i;
        super.tp(c656290Poh);
        View view = (View) this.LLL.getValue();
        if (AwemeExtKt.isPhotoMode(c656290Poh.getAweme())) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.base.SearchNimbleDocBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C656290Poh c656290Poh) {
        tp(c656290Poh);
    }
}
