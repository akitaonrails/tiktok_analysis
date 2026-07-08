package com.ss.android.ugc.nearby.service;

import X.AbstractC1585770rMt;
import X.AbstractC738140SxQ;
import X.C0BXK;
import X.C0CCZ;
import X.C1205170hT1;
import X.C1205250hT9;
import X.C1205260hTA;
import X.C13IQ;
import X.C13LE;
import X.C266810Acx;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import com.ss.android.ugc.nearby.api.INearbyMobService;
import com.ss.android.ugc.nearby.component.NearbyFeedDetailQuitComponent;
import com.ss.android.ugc.nearby.component.NearbyFeedNonPersonalizedComponent;
import com.ss.android.ugc.nearby.component.NearbyNonPersonalizedUIComponent;
import com.ss.android.ugc.nearby.container.NearbyFragment;
import com.ss.android.ugc.nearby.inittask.InitNearbyTask;
import com.ss.android.ugc.nearby.route.NearbyRouterInterceptor;
import com.ss.android.ugc.nearby.tab.NearbyTabProtocol;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyServiceImpl implements INearbyFeedService, INearbyMobService {
    public final /* synthetic */ C1205250hT9 LIZ = C1205250hT9.LIZIZ;

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final void LIZJ(String str, HashMap<String, String> map, Aweme aweme, boolean z) {
        this.LIZ.LIZJ(str, map, aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJ() {
        return true;
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final Map<String, String> LJFF(String str) {
        return this.LIZ.LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final C13IQ<? extends AbstractC738140SxQ> LJI() {
        return C13LE.LIZ(NearbyFeedDetailQuitComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final C13IQ<? extends AbstractC738140SxQ> LJIIIIZZ() {
        return C13LE.LIZ(NearbyFeedNonPersonalizedComponent.class);
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final void LJIIJ(String str, Map<String, String> map) {
        this.LIZ.LJIIJ(str, map);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final C13IQ<? extends UIContentAssem> LJIILIIL() {
        return C13LE.LIZ(NearbyNonPersonalizedUIComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final void LJIILL() {
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final Long LIZLLL() {
        C1205260hTA.LIZ.getClass();
        return C1205260hTA.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJII() {
        C1205170hT1.LIZ.getClass();
        return C1205170hT1.LIZIZ();
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final int LJIIIZ() {
        C1205260hTA.LIZ.getClass();
        return C1205260hTA.LJ;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final IInterceptor LJIIL() {
        return new NearbyRouterInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final C0CCZ LJIILJJIL() {
        if (((Boolean) C266810Acx.LIZ.getValue()).booleanValue()) {
            return new InitNearbyTask();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final AbstractC1585770rMt LJIILLIIL() {
        return new AbstractC1585770rMt() { // from class: X.0qZP
            public static boolean LIZLLL;

            @Override // X.AbstractC1585770rMt
            public final TopTabProtocol LIZLLL() {
                return new NearbyTabProtocol();
            }

            {
                if (!LIZLLL) {
                    C0S78.LIZJ(AnonymousClass0206.get$arr$(292), true);
                }
                LIZLLL = true;
            }

            @Override // X.AbstractC1585770rMt
            public final EnumC1584360rKc LIZIZ() {
                return EnumC1584360rKc.NEARBY;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJIIZILJ() {
        return C0BXK.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LIZIZ(Fragment fragment) {
        return fragment instanceof NearbyFragment;
    }
}
