package com.ss.android.ugc.aweme.search.pages.result.common.statusview.ui;

import X.C01GW;
import X.C07E5;
import X.C0R02;
import X.C1558520qew;
import X.C452501pT;
import X.C723580SZw;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$TuxStatus$ITuxStatusControlAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardTuxStatusAssem extends ReusedUISlotAssem<SearchCardTuxStatusAssem> implements SearchComponentCenter$TuxStatus$ITuxStatusControlAbility {
    public final C01GW LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.evc;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() throws IllegalAccessException {
        C1558520qew.LJIIJ(this, SearchCardScope.class, SearchComponentCenter$TuxStatus$ITuxStatusControlAbility.class, null);
    }

    public SearchCardTuxStatusAssem() {
        checkSupervisorPrepared();
        new C723580SZw(this, C0R02.class, null);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 548));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C1558520qew.LJI(this, SearchCardScope.class, this, SearchComponentCenter$TuxStatus$ITuxStatusControlAbility.class, null, null);
    }
}
