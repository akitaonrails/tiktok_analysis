package com.bytedance.android.livesdk.module;

import X.AbstractC1538680q8w;
import X.C1106330etb;
import X.C1161920gLG;
import X.C1533020pzo;
import X.C1533900q1E;
import X.C1535590q3x;
import X.C1542740qFU;
import X.C1547730qNX;
import X.C1547760qNa;
import X.C520730KbX;
import com.bytedance.android.live.browser.IHybridPerformanceService;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes24.dex */
public class LiveSparkService implements ILiveSparkService {
    public final CopyOnWriteArrayList<AbstractC1538680q8w> LL = new CopyOnWriteArrayList<>();
    public boolean LLILLJJLI;
    public boolean LLILLL;

    @Override // com.bytedance.android.live.browser.ILiveSparkService
    public final void YH0() {
        this.LLILLJJLI = false;
    }

    @Override // com.bytedance.android.live.browser.ILiveSparkService
    public final void er2() {
        this.LLILLJJLI = true;
    }

    @Override // com.bytedance.android.live.browser.ILiveSparkService
    public final void UT0() {
        C1547760qNa.LIZJ();
    }

    @Override // com.bytedance.android.live.browser.ILiveSparkService
    public final void io0() {
        C1535590q3x.LIZIZ();
    }

    @Override // com.bytedance.android.live.browser.ILiveSparkService
    public final void Cw(SparkContext sparkContext) {
        sparkContext.bid = "live";
        sparkContext.vaid = ((IHostHybrid) C1161920gLG.LIZJ(IHostHybrid.class)).bg1();
        C1547730qNX.LIZ(sparkContext);
        C1106330etb.LIZ(sparkContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d9  */
    @Override // com.bytedance.android.live.browser.ILiveSparkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GJ0(com.bytedance.hybrid.spark.SparkContext r18) {
        /*
            Method dump skipped, instruction units count: 1168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.module.LiveSparkService.GJ0(com.bytedance.hybrid.spark.SparkContext):void");
    }

    @Override // com.bytedance.android.live.browser.ILiveSparkService
    public final void Nv1(boolean z) {
        if (z) {
            this.LLILLL = false;
        }
        C520730KbX.LIZ.LIZJ(false);
        if (!z) {
            ((IHybridPerformanceService) C1161920gLG.LIZJ(IHybridPerformanceService.class)).nY1();
            C1542740qFU.LIZ.getClass();
            C1533020pzo c1533020pzo = C1542740qFU.LIZJ;
            if (c1533020pzo != null) {
                c1533020pzo.LJFF("exit_live", true);
            }
            C1542740qFU.LIZJ = null;
            C1533900q1E c1533900q1E = C1542740qFU.LIZIZ;
            if (c1533900q1E != null) {
                C1533900q1E.LIZ(c1533900q1E, true, 2);
                C1542740qFU.LIZIZ = null;
            }
        }
    }

    @Override // com.bytedance.android.live.browser.ILiveSparkService
    public final void dh0(AbstractC1538680q8w abstractC1538680q8w) {
        if (!this.LL.contains(abstractC1538680q8w)) {
            this.LL.add(abstractC1538680q8w);
        }
    }

    @Override // com.bytedance.android.live.browser.ILiveSparkService
    public final void mT1(boolean z) {
        if (z) {
            this.LLILLL = true;
        } else {
            ((IHybridPerformanceService) C1161920gLG.LIZJ(IHybridPerformanceService.class)).WP1();
        }
        C520730KbX.LIZ.LIZJ(true);
    }
}
