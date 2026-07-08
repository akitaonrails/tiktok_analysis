package com.ss.android.ugc.aweme.specact;

import X.C01U6;
import X.C786410Ut5;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class DramaSpecActServiceImpl extends SpecActServiceImpl {
    @Override // com.ss.android.ugc.aweme.specact.SpecActServiceImpl, com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final String LJJJZ() {
        return "incentive_redbag";
    }

    @Override // com.ss.android.ugc.aweme.specact.SpecActServiceImpl, com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final Bundle LJJLIIIJLLLLLLLZ() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("show_coin_tips", "1", bundle);
        C786410Ut5.LJJJI("enter_method", "incentive_redbag", bundle);
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.specact.SpecActServiceImpl, com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final Aweme LJJLL() {
        return (Aweme) C01U6.LJ(AFwS199S0000000_12.get$arr$(207), null);
    }
}
