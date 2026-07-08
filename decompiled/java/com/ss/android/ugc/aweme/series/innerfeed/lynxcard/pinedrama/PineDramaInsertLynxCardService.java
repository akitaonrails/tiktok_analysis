package com.ss.android.ugc.aweme.series.innerfeed.lynxcard.pinedrama;

import X.C12854051g;
import X.C1697810uHb;
import X.C2087508Ft;
import X.C2087608Fu;
import com.ss.android.ugc.aweme.service.IPineDramaLynxCardService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class PineDramaInsertLynxCardService implements IPineDramaLynxCardService {
    public final C12854051g LIZIZ = new C12854051g();

    public static PineDramaLynxCardInsertConfig LJFF() {
        return (PineDramaLynxCardInsertConfig) C2087508Ft.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IPineDramaLynxCardService
    public final boolean LIZIZ() {
        if (!C2087608Fu.LIZ()) {
            return false;
        }
        long j = LJFF().notInterestCooldownThresholdMs;
        if (j <= 0) {
            return true;
        }
        long j2 = this.LIZIZ.LIZ().getLong("drama_mid_insert_last_completion_not_interest_ts", 0L);
        return j2 <= 0 || System.currentTimeMillis() - j2 > j;
    }

    @Override // com.ss.android.ugc.aweme.service.IPineDramaLynxCardService
    public final boolean LIZJ() {
        if (!LJFF().enable) {
            return false;
        }
        long j = LJFF().notInterestCooldownThresholdMs;
        if (j > 0) {
            long j2 = this.LIZIZ.LIZ().getLong("drama_mid_insert_last_non_completion_not_interest_ts", 0L);
            if (j2 > 0 && System.currentTimeMillis() - j2 <= j) {
                return false;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.LIZIZ.LIZ().getInt("drama_mid_insert_show_no_click_count", 0);
        long j3 = this.LIZIZ.LIZ().getLong("drama_mid_insert_last_card_shown_ts", 0L);
        int i2 = LJFF().noClickCooldownTriggerCount;
        if (1 <= i2 && i2 <= i && j3 > 0 && jCurrentTimeMillis - j3 <= LJFF().noClickCooldownMs) {
            return false;
        }
        int i3 = LJFF().timeWindowShowLimit;
        if (i3 <= 0) {
            return true;
        }
        List<Long> listLIZIZ = this.LIZIZ.LIZIZ();
        if (!(listLIZIZ instanceof Collection) || !listLIZIZ.isEmpty()) {
            Iterator<Long> it2 = listLIZIZ.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                if (jCurrentTimeMillis - it2.next().longValue() <= LJFF().timeWindowMs && (i4 = i4 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
            if (i4 >= i3) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPineDramaLynxCardService
    public final void LIZLLL() {
        if (LJFF().enable) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            simpleDateFormat.format(new Date(jCurrentTimeMillis));
            List<Long> listLIZIZ = this.LIZIZ.LIZIZ();
            ArrayList arrayList = new ArrayList();
            for (Long l : listLIZIZ) {
                if (jCurrentTimeMillis - l.longValue() <= LJFF().timeWindowMs) {
                    arrayList.add(l);
                }
            }
            this.LIZIZ.LIZJ(arrayList);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPineDramaLynxCardService
    public final void LJ() {
        if (LJFF().enable) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList(this.LIZIZ.LIZIZ());
            arrayList.add(Long.valueOf(jCurrentTimeMillis));
            this.LIZIZ.LIZJ(arrayList);
            this.LIZIZ.LIZ().storeInt("drama_mid_insert_show_no_click_count", this.LIZIZ.LIZ().getInt("drama_mid_insert_show_no_click_count", 0) + 1);
            this.LIZIZ.LIZ().storeLong("drama_mid_insert_last_card_shown_ts", jCurrentTimeMillis);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r4.equals("mid_insert_blocking_card") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r4.equals("mid_insert_non_blocking_card") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r9.LIZIZ.LIZ().storeInt("drama_mid_insert_show_no_click_count", 0);
        r9.LIZIZ.LIZ().storeLong("drama_mid_insert_last_card_shown_ts", 0);
        r1 = X.C2188811AlT.LIZ();
        r1.append("[handleClick] reset noClickCount cardType=");
        r1.append(r4);
        X.C2188811AlT.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        if (r4.equals("mid_insert_blocking_card") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        if (r4.equals("mid_insert_non_blocking_card") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        r9.LIZIZ.LIZ().storeLong("drama_mid_insert_last_non_completion_not_interest_ts", java.lang.System.currentTimeMillis());
        r1 = X.C2188811AlT.LIZ();
        r1.append("[handleNotInterest] saved non-completion cardType=");
        r1.append(r4);
        X.C2188811AlT.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
    
        return;
     */
    @Override // com.ss.android.ugc.aweme.service.IPineDramaLynxCardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC1107590evd r10) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.innerfeed.lynxcard.pinedrama.PineDramaInsertLynxCardService.LIZ(X.0evd):void");
    }
}
