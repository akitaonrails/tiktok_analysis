package com.ss.android.ugc.aweme.commercialize.profile.impl.ad.profilepage;

import X.C01GW;
import X.C1026080coA;
import X.C1026150coH;
import X.C19719512Dh;
import X.C452501pT;
import X.InterfaceC1026140coG;
import X.InterfaceC1034510d1l;
import X.InterfaceC1034910d2P;
import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.profile.api.ad.profilepage.ICommerceProfilePageService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceProfilePageService implements ICommerceProfilePageService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(206));

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.ad.profilepage.ICommerceProfilePageService
    public final List<InterfaceC1034910d2P> LIZ() {
        return Collections.singletonList(new EmbeddedLandingPageProfilePageScrollObserver());
    }

    public final Map<String, Pair<String, InterfaceC1034510d1l>> LJ() {
        return (Map) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.ad.profilepage.ICommerceProfilePageService
    public final void LIZJ(String str) {
        C19719512Dh.LIZJ(LJ()).remove(str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0coP] */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.ad.profilepage.ICommerceProfilePageService
    public final InterfaceC1034510d1l LIZIZ(Context context, Aweme aweme, String str) {
        if (context == null || str == null || aweme == null) {
            return null;
        }
        Pair<String, InterfaceC1034510d1l> pair = LJ().get(str);
        if (pair == null || !Intrinsics.LJFF(pair.getFirst(), aweme.getAid())) {
            C1026150coH c1026150coH = new C1026150coH(new InterfaceC1026140coG(context, aweme) { // from class: X.0coP
                public final Context LIZ;
                public final Aweme LIZIZ;

                @Override // X.InterfaceC1026140coG
                public final Aweme getAweme() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC1026140coG
                public final Context getContext() {
                    return this.LIZ;
                }

                {
                    this.LIZ = context;
                    this.LIZIZ = aweme;
                }
            }, str);
            c1026150coH.initialize();
            LJ().put(str, new Pair<>(aweme.getAid(), c1026150coH));
        }
        Pair<String, InterfaceC1034510d1l> pair2 = LJ().get(str);
        if (pair2 == null) {
            return null;
        }
        return pair2.getSecond();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0coO] */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.ad.profilepage.ICommerceProfilePageService
    public final InterfaceC1034510d1l LIZLLL(Context context, Aweme aweme, String str) {
        if (context == null || str == null || aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return null;
        }
        Pair<String, InterfaceC1034510d1l> pair = LJ().get(str);
        if (pair == null || !Intrinsics.LJFF(pair.getFirst(), aweme.getAid())) {
            C1026080coA c1026080coA = new C1026080coA(new InterfaceC1026140coG(context, aweme) { // from class: X.0coO
                public final Context LIZ;
                public final Aweme LIZIZ;

                @Override // X.InterfaceC1026140coG
                public final Aweme getAweme() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC1026140coG
                public final Context getContext() {
                    return this.LIZ;
                }

                {
                    this.LIZ = context;
                    this.LIZIZ = aweme;
                }
            });
            c1026080coA.initialize();
            LJ().put(str, new Pair<>(aweme.getAid(), c1026080coA));
        }
        Pair<String, InterfaceC1034510d1l> pair2 = LJ().get(str);
        if (pair2 == null) {
            return null;
        }
        return pair2.getSecond();
    }
}
