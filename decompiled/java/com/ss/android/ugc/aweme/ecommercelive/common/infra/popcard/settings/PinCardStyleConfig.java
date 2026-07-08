package com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class PinCardStyleConfig {

    @C09CT("anchor_list_card_show_time")
    public long anchorListCardShowTime;

    @C09CT("anchor_show_time")
    public long anchorShowTime;

    @C09CT("list_card_show_time")
    public long listCardShowTime;

    @C09CT("real_time_refresh")
    public boolean realTimeRefresh;

    @C09CT("show_time")
    public long showTime;

    public PinCardStyleConfig() {
        this(30000L, 0L, 30000L, 0L, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZ(java.lang.Integer r6) {
        /*
            r5 = this;
            r3 = 0
            if (r6 == 0) goto L12
            int r1 = r6.intValue()
            r0 = 2
            if (r1 != r0) goto L12
            long r1 = r5.anchorListCardShowTime
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L12
        L11:
            return r1
        L12:
            long r1 = r5.anchorShowTime
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L11
            long r0 = r5.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings.PinCardStyleConfig.LIZ(java.lang.Integer):long");
    }

    public final long LIZIZ(Integer num) {
        if (num != null && num.intValue() == 2) {
            long j = this.listCardShowTime;
            if (j > 0) {
                return j;
            }
        }
        return this.showTime;
    }

    public PinCardStyleConfig(long j, long j2, long j3, long j4, boolean z) {
        this.showTime = j;
        this.listCardShowTime = j2;
        this.anchorShowTime = j3;
        this.anchorListCardShowTime = j4;
        this.realTimeRefresh = z;
    }
}
