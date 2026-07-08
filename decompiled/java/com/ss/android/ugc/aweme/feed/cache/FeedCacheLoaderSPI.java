package com.ss.android.ugc.aweme.feed.cache;

import X.C013C;
import X.C0N9C;
import X.C0NDV;
import X.C0NEM;
import X.C0NEN;
import X.C0NET;
import X.C0NH6;
import X.C0NHD;
import X.C0S4J;
import X.C283780BAi;
import X.C294340BgG;
import X.C5186020i;
import X.C590410NDr;
import X.C590440NDu;
import X.C590610NEl;
import X.C590760NFa;
import X.C591300NHc;
import X.C608640Nu2;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import com.ss.android.ugc.tiktok.ConvertHelper;
import java.util.List;
import kotlin.jvm.internal.AwS158S1100000_9;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedCacheLoaderSPI implements IFeedCacheLoaderService {
    @Override // com.ss.android.ugc.aweme.util.IFeedCacheLoaderService
    public final boolean LIZIZ() {
        C0NET.LIZ.getClass();
        return C0NET.LJI();
    }

    @Override // com.ss.android.ugc.aweme.util.IFeedCacheLoaderService
    public final void LIZJ() {
        C608640Nu2 c608640Nu2 = C608640Nu2.LIZ;
        if (((Boolean) C590610NEl.LJI.getValue()).booleanValue() && C608640Nu2.LIZJ && EventBus.LIZLLL().LJIIJ(c608640Nu2)) {
            EventBus.LIZLLL().LJJI(c608640Nu2);
        }
    }

    @Override // com.ss.android.ugc.aweme.util.IFeedCacheLoaderService
    public final boolean LIZLLL() {
        C0NET.LIZ.getClass();
        return C0NET.LJIIZILJ(false);
    }

    @Override // com.ss.android.ugc.aweme.util.IFeedCacheLoaderService
    public final void LJI() {
        C0NET c0net = C0NET.LIZ;
        c0net.getClass();
        if (C294340BgG.LIZ()) {
            C590440NDu.LIZ = "";
            C590440NDu.LIZLLL = false;
            C590440NDu.LJ = false;
            C590440NDu.LIZJ = false;
            C590440NDu.LJFF = false;
            C590440NDu.LJI = false;
            C590440NDu.LIZIZ = false;
        }
        C590440NDu.LIZIZ = true;
        C0NET.LJIIIZ = false;
        c0net.getClass();
        C0NET.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.util.IFeedCacheLoaderService
    public final boolean LJII() {
        C0NET.LIZ.getClass();
        return C0NET.LJIIZILJ(true);
    }

    @Override // com.ss.android.ugc.aweme.util.IFeedCacheLoaderService
    public final List<Aweme> LJIIIZ() {
        C0NET.LIZ.getClass();
        return C0NET.LJIJJLI;
    }

    @Override // com.ss.android.ugc.aweme.util.IFeedCacheLoaderService
    public final int LJIILIIL() {
        C0NEM c0nem = C0NEM.LIZ;
        C0NEN c0nen = C0NEN.COLD_START;
        C590760NFa c590760NFaLIZ = c0nem.LIZ(c0nen, C0N9C.GOLDEN_HOUSE);
        if (c590760NFaLIZ != null) {
            return c590760NFaLIZ.LJI(c0nen);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.util.IFeedCacheLoaderService
    public final void LJFF(boolean z) {
        C590410NDr.LIZ.getClass();
        C590410NDr.LIZIZ = false;
        C0NET.LIZ.getClass();
        C0NET.LJIJI(z);
    }

    @Override // com.ss.android.ugc.aweme.util.IFeedCacheLoaderService
    public final Aweme LJIIIIZZ(C5186020i c5186020i) {
        return ConvertHelper.com$ss$ugc$tiktok$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(c5186020i, null);
    }

    @Override // com.ss.android.ugc.aweme.util.IFeedCacheLoaderService
    public final void LJIIJ(List<? extends Aweme> list) {
        C0NET.LIZ.getClass();
        if (((Number) C283780BAi.LIZ.getValue()).intValue() > 0 && C0NHD.LIZIZ()) {
            C0S4J c0s4j = C0NH6.LJIILLIIL;
            C591300NHc.LIZ().LJIILJJIL("cold_cache_remain", list, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.util.IFeedCacheLoaderService
    public final boolean LJIIJJI(Aweme aweme) {
        C0NET.LIZ.getClass();
        return ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJJZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.util.IFeedCacheLoaderService
    public final boolean LJIIL(String str) {
        C0NDV.LIZ.getClass();
        C013C c013c = new C013C();
        if (str.length() == 0) {
            return false;
        }
        if (!C0NDV.LJIIJ()) {
            return c013c.element;
        }
        C0NDV.LJIILIIL(new AwS158S1100000_9(str, c013c, 38));
        return c013c.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01cd  */
    @Override // com.ss.android.ugc.aweme.util.IFeedCacheLoaderService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.feed.model.Aweme r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.cache.FeedCacheLoaderSPI.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean):void");
    }
}
