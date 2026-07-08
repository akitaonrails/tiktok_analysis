package com.ss.android.ugc.aweme.feed.ui.foryoutab;

import X.C0C64;
import X.C1567040qsg;
import X.C1583200rIk;
import X.C295730BiV;
import X.C786410Ut5;
import X.EnumC1570580qyO;
import X.EnumC1583970rJz;
import X.InterfaceC1566990qsb;
import X.InterfaceC1582900rIG;
import X.InterfaceC1583070rIX;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.feed.api.IFeedRecommendAppDiffProtocol;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes25.dex */
public final class ForYouTabProtocol extends TopTabProtocol implements InterfaceC1566990qsb {
    public final String LLILZIL = "homepage_hot";
    public final String LLILZLL = "For You";
    public final Class<? extends Fragment> LLIZ = FeedRecommendFragment.class;
    public final EnumC1570580qyO LLIZLLLIL = EnumC1570580qyO.FOR_YOU;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJII() {
        return 0;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return true;
    }

    public ForYouTabProtocol() {
        EnumC1583970rJz enumC1583970rJz = EnumC1583970rJz.X_TAB;
    }

    @Override // X.InterfaceC1566990qsb
    public final void LIZ() {
        InterfaceC1583070rIX interfaceC1583070rIX = LJI().LIZ;
        if (interfaceC1583070rIX != null) {
            interfaceC1583070rIX.setText(mc(interfaceC1583070rIX.getView().getContext()));
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC1570580qyO LJFF() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getMob() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0);
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_hot", bundle);
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "For You", bundle);
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String mc(Context context) {
        String string;
        IFeedRecommendAppDiffProtocol.LIZ.getClass();
        IFeedRecommendAppDiffProtocol value = C1583200rIk.LIZIZ.getValue();
        if (C1567040qsg.LIZIZ()) {
            string = context.getResources().getString(2131844880);
        } else if (C295730BiV.LIZ()) {
            string = context.getResources().getString(2131850685);
        } else if (C0C64.LJIILLIIL().LJIIIZ(31744, "for_you_new_translations", true, false)) {
            string = context.getResources().getString(R.string.vck);
        } else {
            string = context.getResources().getString(R.string.jsn);
        }
        value.LJIIIIZZ(string);
        return string;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJIIIZ(String str, String str2) {
        InterfaceC1583070rIX interfaceC1583070rIX = LJI().LIZ;
        if (interfaceC1583070rIX == null) {
            interfaceC1583070rIX = null;
        }
        InterfaceC1582900rIG interfaceC1582900rIG = (InterfaceC1582900rIG) interfaceC1583070rIX;
        if (interfaceC1582900rIG != null) {
            interfaceC1582900rIG.LIZIZ();
        }
    }
}
