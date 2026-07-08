package com.ss.android.ugc.aweme.stemfeed.ui.tab;

import X.C10EU;
import X.C1578630rBN;
import X.C295730BiV;
import X.C786410Ut5;
import X.EnumC1570580qyO;
import X.EnumC1583970rJz;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.stemfeed.ui.StemFeedFragment;

/* JADX INFO: loaded from: classes25.dex */
public final class StemTabProtocol extends TopTabProtocol {
    public final String LLILZIL = "Stem";
    public final Class<? extends Fragment> LLILZLL = StemFeedFragment.class;
    public final EnumC1570580qyO LLIZ = EnumC1570580qyO.STEM;
    public final int LLIZLLLIL;
    public final String LLJ;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return true;
    }

    public StemTabProtocol() {
        EnumC1583970rJz enumC1583970rJz = EnumC1583970rJz.X_TAB;
        this.LLIZLLLIL = 36;
        this.LLJ = "homepage_topic_stem";
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIILL() {
        return ComplianceServiceProvider.LJJI().LJJIJ().isOn() && ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin() && !C10EU.LJIILIIL();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC1570580qyO LJFF() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJII() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getMob() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LLIZLLLIL);
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_topic_stem", bundle);
        C1578630rBN.LJIIIIZZ(bundle, "Stem");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String mc(Context context) {
        if (C295730BiV.LIZ()) {
            return context.getResources().getString(2131850691);
        }
        return context.getResources().getString(2131848800);
    }
}
