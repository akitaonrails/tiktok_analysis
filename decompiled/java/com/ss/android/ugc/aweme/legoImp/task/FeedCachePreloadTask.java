package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VY3;
import X.C0VZ0;
import X.C123100dR;
import X.C1601440rmA;
import X.C1602860roS;
import X.C1602870roT;
import X.C19254610Um;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1604690rrP;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ForbidPreRenderAfterNUJExp;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.feed.cache.IFeedApi;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedCachePreloadTask implements C0CCZ, InterfaceC799590VYf {
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FeedCachePreloadTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public final boolean LJ() {
        int i = this.LLILLJJLI;
        if (i != 4 && i != 5) {
            return true;
        }
        boolean zLIZLLL = C19254610Um.LIZIZ.LIZLLL();
        C1602860roS.LIZ.getClass();
        return (C1602860roS.LJ() && ForbidPreRenderAfterNUJExp.INSTANCE.isForbid() && zLIZLLL) ? false : true;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return this.LL == 2 ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.IO;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0VY3.LIZJ(new AwS553S0100000_9(this, 889));
    }

    public final FeedItemList LIZ(int i, boolean z) {
        String cdid;
        try {
            C1601440rmA c1601440rmA = new C1601440rmA();
            c1601440rmA.LIZ = 0;
            c1601440rmA.LIZJ(0L);
            c1601440rmA.LIZLLL(0L);
            c1601440rmA.LJJIZ = "feed_cache_preload";
            c1601440rmA.LIZIZ(6);
            c1601440rmA.LIZIZ = i;
            c1601440rmA.LJIIJ = new InterfaceC1604690rrP() { // from class: X.0NFM
                @Override // X.InterfaceC1604690rrP
                public final String LIZ() {
                    return "";
                }

                @Override // X.InterfaceC1604690rrP
                public final String LIZIZ() {
                    return "";
                }
            };
            c1601440rmA.LJIJ = this.LLILLJJLI;
            c1601440rmA.LJJI = false;
            C1602860roS.LIZ.getClass();
            String str = "";
            if (C1602860roS.LJ()) {
                c1601440rmA.LJJIJLIJ = z;
                if (z && (cdid = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCdid()) != null) {
                    c1601440rmA.LJJ = cdid;
                }
                int i2 = this.LLILLJJLI;
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4 && i2 != 5) {
                            if (i2 != 6) {
                                if (i2 == 30) {
                                    str = "paid_ads";
                                }
                            } else {
                                str = "pre_is";
                            }
                        } else {
                            str = "before_swipeup";
                        }
                    } else {
                        str = "after_login";
                    }
                } else {
                    str = "after_did";
                }
                if (C123100dR.LIZ(str)) {
                    c1601440rmA.LJJJJ = str;
                }
                C1602870roT.LIZIZ(str);
            }
            FeedItemList feedItemListFetchFeedList = ((IFeedApi) ServiceManager.get().getService(IFeedApi.class)).fetchFeedList(c1601440rmA.LIZ());
            if (i == 4) {
                Feed0VVManager.LJ(0, feedItemListFetchFeedList.getRequestId(), feedItemListFetchFeedList.getItems(), false);
            }
            C1602870roT.LIZ(str, feedItemListFetchFeedList.getItems());
            return feedItemListFetchFeedList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public FeedCachePreloadTask(int i, int i2, boolean z) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
    }
}
