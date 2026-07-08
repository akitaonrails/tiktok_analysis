package com.ss.android.ugc.aweme.toptab;

import X.C1578630rBN;
import X.C1AKK;
import X.C295730BiV;
import X.C786410Ut5;
import X.EnumC1583970rJz;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.toptab.ui.LiveDualFeedFragment;
import com.ss.android.ugc.aweme.toptab.ui.LiveSingleFeedFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveTabProtocol extends TopTabProtocol {
    public final String LLILZIL;
    public final String LLILZLL;
    public final Class<? extends Fragment> LLIZ;
    public final int LLIZLLLIL;
    public final String LLJ;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return Intrinsics.LJFF(this.LLILZIL, "live_tab_single") || Intrinsics.LJFF(this.LLILZIL, "live_tab_double");
    }

    public LiveTabProtocol() {
        C1AKK liteService = Live.getLiteService();
        String strI0 = (liteService == null || (strI0 = liteService.i0()) == null) ? "" : strI0;
        this.LLILZIL = strI0;
        this.LLILZLL = "Live";
        this.LLIZ = Intrinsics.LJFF(strI0, "live_tab_single") ? LiveSingleFeedFragment.class : LiveDualFeedFragment.class;
        EnumC1583970rJz enumC1583970rJz = EnumC1583970rJz.X_TAB;
        this.LLIZLLLIL = 37;
        this.LLJ = "homepage_live";
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIILL() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJII() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getMob() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LLIZLLLIL);
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_live", bundle);
        C1578630rBN.LJIIIIZZ(bundle, "Live");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String mc(Context context) {
        int i;
        if (C295730BiV.LIZ()) {
            i = 2131850688;
        } else {
            i = 2131843031;
        }
        return context.getString(i);
    }
}
