package com.ss.android.ugc.aweme.requesttask.p0;

import X.C0CO3;
import X.C0CSA;
import X.C1150504el;
import X.C1601310rlx;
import X.C1616470sAP;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC1601220rlo;
import X.InterfaceC800130Va7;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.IFeedRequestExService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedPreloadRequest implements InterfaceC800130Va7 {
    public static volatile boolean LLJI;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FeedPreloadRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.P0;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        IFeedRequestExService iFeedRequestExService = (IFeedRequestExService) PluggableExtentionKt.pluggableSpi$default(IFeedRequestExService.class, false, false, false, 14, null);
        if (iFeedRequestExService != null) {
            iFeedRequestExService.LIZ();
        }
        if (LLJI) {
            return;
        }
        LLJI = true;
        if (C0CSA.LIZJ != null) {
            C0CSA.LIZIZ = null;
            C0CSA.LIZJ = null;
            C0CSA.LIZ = null;
        }
        C0CSA.LIZ = Long.valueOf(System.currentTimeMillis());
        C1150504el.LIZ().LJI("feed_boot_to_feed_request", true);
        if (!C1150504el.LIZ().LJIIIIZZ("feed_request_to_network")) {
            C1150504el.LIZ().LIZLLL("feed_request_to_network", true);
        }
        if (C1150504el.LIZ().LJII) {
            C1150504el.LIZ().LJI("feed_lego_add_to_request", false);
            C1150504el.LIZ().LIZLLL("feed_request_to_feed_api", false);
        }
        C1616470sAP.LIZ.getClass();
        C1616470sAP.LIZIZ.LJI(null);
        InterfaceC1601220rlo interfaceC1601220rloLIZ = C1601310rlx.LIZIZ.LIZ();
        if (interfaceC1601220rloLIZ != null) {
            interfaceC1601220rloLIZ.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, Integer.valueOf(this.LLILZLL), this.LLIZ, Boolean.valueOf(this.LLIZLLLIL), Boolean.valueOf(this.LLJ));
        }
    }

    public FeedPreloadRequest(String str, String str2, String str3, String str4, String str5, int i, String str6, boolean z, boolean z2, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        str3 = (i2 & 4) != 0 ? null : str3;
        str4 = (i2 & 8) != 0 ? null : str4;
        str5 = (i2 & 16) != 0 ? null : str5;
        i = (i2 & 32) != 0 ? 0 : i;
        str6 = (i2 & 64) != 0 ? null : str6;
        z = (i2 & 128) != 0 ? false : z;
        z2 = (i2 & 256) != 0 ? false : z2;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = i;
        this.LLIZ = str6;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
    }
}
