package com.ss.android.ugc.aweme.commercialize.profile.impl.ad;

import X.C04TD;
import X.C1010170cOV;
import X.C1034740d28;
import X.C1034760d2A;
import X.C1053070dVh;
import X.C1216340hl2;
import X.InterfaceC1034730d27;
import X.InterfaceC1053190dVt;
import com.ss.android.ugc.aweme.commercialize.profile.api.ad.ICommerceProfileService;
import com.ss.android.ugc.aweme.commercialize.profile.impl.ad.ProfileFeedAdsPageWatchEvent;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceProfileService implements ICommerceProfileService {
    public static ICommerceProfileService LIZLLL() {
        Object objLIZ = C04TD.LIZ(ICommerceProfileService.class, false);
        if (objLIZ != null) {
            return (ICommerceProfileService) objLIZ;
        }
        if (C04TD.LLLILZ == null) {
            synchronized (ICommerceProfileService.class) {
                if (C04TD.LLLILZ == null) {
                    C04TD.LLLILZ = new CommerceProfileService();
                }
            }
        }
        return C04TD.LLLILZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.ad.ICommerceProfileService
    public final InterfaceC1053190dVt LIZ() {
        return (InterfaceC1053190dVt) C1010170cOV.LIZIZ(InterfaceC1053190dVt.class);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.ad.ICommerceProfileService
    public final C1053070dVh LIZIZ(C1216340hl2 c1216340hl2) {
        C1053070dVh c1053070dVh = new C1053070dVh(c1216340hl2);
        C1010170cOV.LIZJ(c1053070dVh);
        return c1053070dVh;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0cP5, X.0d28] */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.ad.ICommerceProfileService
    public final C1034740d28 LIZJ(final C1034760d2A c1034760d2A) {
        ?? r0 = new InterfaceC1034730d27(c1034760d2A) { // from class: X.0d28
            public final InterfaceC1034930d2R LL;
            public Set<String> LLILLJJLI = new LinkedHashSet();
            public final C1034750d29 LLILLL = new C1034750d29(new Object[0]);

            @Override // X.InterfaceC1010530cP5
            public final /* bridge */ /* synthetic */ InterfaceC1034930d2R Mh() {
                return this.LL;
            }

            @Override // X.InterfaceC1037910d7F
            public final void initialize() {
                C1010170cOV.LIZJ(this);
            }

            {
                this.LL = c1034760d2A;
            }

            @Override // X.InterfaceC1034730d27
            public final void Yn1(boolean z) {
                int size;
                LinkedHashSet linkedHashSet;
                if (z) {
                    linkedHashSet = new LinkedHashSet();
                } else {
                    C1034750d29 c1034750d29 = this.LLILLL;
                    ProfileFeedAdsPageWatchEvent profileFeedAdsPageWatchEvent = new ProfileFeedAdsPageWatchEvent();
                    Set<String> set = this.LLILLJJLI;
                    if (set != null) {
                        size = set.size();
                    } else {
                        size = 0;
                    }
                    profileFeedAdsPageWatchEvent.LJI(Integer.valueOf(size), "count");
                    c1034750d29.logWithEvent(profileFeedAdsPageWatchEvent);
                    Set<String> set2 = this.LLILLJJLI;
                    if (set2 != null) {
                        set2.clear();
                    }
                    linkedHashSet = null;
                }
                this.LLILLJJLI = linkedHashSet;
            }

            @Override // X.InterfaceC1034730d27
            public final void hA0(String str) {
                Set<String> set = this.LLILLJJLI;
                if (set != null) {
                    set.add(str);
                }
            }
        };
        C1010170cOV.LIZJ(r0);
        return r0;
    }
}
