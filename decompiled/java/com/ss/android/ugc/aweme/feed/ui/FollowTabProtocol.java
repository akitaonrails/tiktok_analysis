package com.ss.android.ugc.aweme.feed.ui;

import X.AbstractC1584410rKh;
import X.AbstractC581530MrP;
import X.C0C8D;
import X.C1578630rBN;
import X.C1583120rIc;
import X.C20684815ws;
import X.C2097908Jt;
import X.C295730BiV;
import X.C786410Ut5;
import X.EnumC1570580qyO;
import X.EnumC1583970rJz;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowTabProtocol extends TopTabProtocol {
    public final String LLILZIL = "homepage_follow";
    public final String LLILZLL = "Following";
    public final Class<? extends Fragment> LLIZ = FeedFollowFragment.class;
    public final int LLIZLLLIL;
    public final EnumC1570580qyO LLJ;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final C1583120rIc LIZJ() {
        return new C1583120rIc() { // from class: X.0rL0
            @Override // X.C1583120rIc
            public final AbstractC1584410rKh LIZJ() {
                return new FollowTabViewLifecycleObserver();
            }

            @Override // X.C1583120rIc
            public final InterfaceC1583070rIX LIZ(InterfaceC1583080rIY interfaceC1583080rIY, C1584440rKk c1584440rKk) {
                int i;
                C128Y c128y;
                Context sceneContext;
                Object objLIZ;
                if (C303460Buy.LIZ()) {
                    i = R.layout.cdp;
                } else {
                    i = R.layout.cdo;
                }
                Activity activityLIZ = C1388190mED.LIZ(c1584440rKk.LIZ);
                if (activityLIZ != null) {
                    InterfaceC1670800ta2 interfaceC1670800ta2LIZIZ = C1388190mED.LIZIZ(c1584440rKk.LIZ);
                    if (interfaceC1670800ta2LIZIZ != null && (interfaceC1670800ta2LIZIZ instanceof C199Y) && (objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) interfaceC1670800ta2LIZIZ)) != null && (objLIZ instanceof C0J5E)) {
                        c128y = (Fragment) objLIZ;
                    } else {
                        c128y = null;
                    }
                    InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) c128y;
                    SAFFragmentRootScene sAFFragmentRootSceneIb = interfaceC214902198i.ib();
                    if (sAFFragmentRootSceneIb != null && (sceneContext = sAFFragmentRootSceneIb.getSceneContext()) != null) {
                        return new C1584610rL1(SAFExtensionKt.LJJII(activityLIZ, sceneContext, i, C682840QqQ.LIZ(interfaceC214902198i, activityLIZ)), c1584440rKk.LIZJ);
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        };
    }

    public FollowTabProtocol() {
        EnumC1583970rJz enumC1583970rJz = EnumC1583970rJz.X_TAB;
        this.LLIZLLLIL = 1;
        this.LLJ = EnumC1570580qyO.FOLLOW;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
        LJI().LIZIZ();
        C20684815ws.LJIILLIIL("homepage_follow_click", C2097908Jt.LIZJ(new Pair("network_status", String.valueOf(((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getEffectiveConnectionType()))));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return !C0C8D.LIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC1570580qyO LJFF() {
        return this.LLJ;
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
        return this.LLILZIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LLIZLLLIL);
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_follow", bundle);
        C1578630rBN.LJIIIIZZ(bundle, "Following");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String mc(Context context) {
        int i;
        if (C295730BiV.LIZ()) {
            i = 2131850683;
        } else {
            i = R.string.vch;
        }
        return context.getResources().getString(i);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJIIIZ(String str, String str2) {
        AbstractC1584410rKh abstractC1584410rKhLIZIZ = LJI().LIZIZ();
        if (abstractC1584410rKhLIZIZ != null) {
            abstractC1584410rKhLIZIZ.LIZLLL();
        }
        AbstractC581530MrP.LIZIZ = true;
    }
}
