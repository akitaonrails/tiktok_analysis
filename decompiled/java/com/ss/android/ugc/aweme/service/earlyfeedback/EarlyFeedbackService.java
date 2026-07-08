package com.ss.android.ugc.aweme.service.earlyfeedback;

import X.C0S78;
import X.C1514430pVp;
import X.C1DD8;
import X.C1DDV;
import X.C1DDW;
import X.C1DDX;
import X.C20018813Uk;
import X.C20638815pS;
import X.C21151317pv;
import X.C2252171DDb;
import X.C2267951Dpp;
import X.EnumC1877260yx2;
import X.InterfaceC20638715pR;
import X.InterfaceC20639315pX;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.interest.IInterestReselectionService;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes36.dex */
public final class EarlyFeedbackService implements IEarlyFeedbackService {
    public final IInterestReselectionService LIZ = (IInterestReselectionService) PluggableExtentionKt.pluggableSpi$default(IInterestReselectionService.class, false, false, false, 14, null);
    public final Map<String, InterfaceC20639315pX> LIZIZ = new LinkedHashMap();
    public final Map<String, Boolean> LIZJ;

    public static boolean LJIILJJIL() {
        EarlyFeedbackButtonData earlyFeedbackButtonDataLIZ;
        int i = (!C2252171DDb.LIZ || (earlyFeedbackButtonDataLIZ = C21151317pv.LIZ()) == null) ? C1DDV.LIZIZ().vvThreshold : earlyFeedbackButtonDataLIZ.vvThreshold;
        C20018813Uk.LIZ.getClass();
        return C20018813Uk.LIZIZ() <= ((long) i);
    }

    public final boolean LJIILIIL() {
        C1DDW c1ddw = C1DDW.LIZ;
        return !C1DDW.LJFF().getBoolean("disable_feature", false) && LJIIJ() && LJIILJJIL();
    }

    public EarlyFeedbackService() {
        C20018813Uk.LIZ.getClass();
        long j = C20018813Uk.LIZ().getLong("vv_count_install", 0L);
        C20018813Uk.LIZIZ = j;
        if (j <= 0 && C20018813Uk.LIZ().contains("vv_records_set")) {
            C20018813Uk.LIZIZ = C20018813Uk.LIZ().getStringSet("vv_records_set", new LinkedHashSet()).size();
            C20018813Uk.LIZ().erase("vv_records_set");
        }
        this.LIZJ = new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final boolean LJI() {
        return LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final boolean LJIIJ() {
        EarlyFeedbackButtonData earlyFeedbackButtonDataLIZ;
        EarlyFeedbackButtonData earlyFeedbackButtonDataLIZ2;
        long jLIZ = C1514430pVp.LIZ();
        long j = ((!C2252171DDb.LIZ || (earlyFeedbackButtonDataLIZ2 = C21151317pv.LIZ()) == null) ? C1DDV.LIZIZ().expirationOffsetHoursStart : earlyFeedbackButtonDataLIZ2.expirationOffsetHoursStart) * ((long) 3600000);
        long j2 = ((!C2252171DDb.LIZ || (earlyFeedbackButtonDataLIZ = C21151317pv.LIZ()) == null) ? C1DDV.LIZIZ().expirationOffsetHoursEnd : earlyFeedbackButtonDataLIZ.expirationOffsetHoursEnd) * ((long) 3600000);
        long jCurrentTimeMillis = System.currentTimeMillis();
        return j + jLIZ < jCurrentTimeMillis && jLIZ + j2 > jCurrentTimeMillis;
    }

    public final boolean LJIIJJI() {
        return LJIILIIL() && C1DDV.LIZIZ().abGroup > 0 && C1DDV.LIZIZ().isEnable;
    }

    public final boolean LJIIL() {
        if (LJIIJJI()) {
            return false;
        }
        C1DDX c1ddx = C1DDX.LIZ;
        return !C1DDX.LJFF().getBoolean("disable_feature_low_active", false);
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final void LJFF() {
        LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final InterfaceC20639315pX LJ(String str) {
        return (InterfaceC20639315pX) ((LinkedHashMap) this.LIZIZ).get(str);
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final boolean LJII(String str) {
        Boolean bool = (Boolean) ((LinkedHashMap) this.LIZJ).get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final void LJIIIIZZ(String str) {
        if (!LJIILIIL() && !LJIIL()) {
            return;
        }
        C20018813Uk c20018813Uk = C20018813Uk.LIZ;
        c20018813Uk.getClass();
        if (str != null) {
            C20018813Uk.LIZJ.add(str);
            c20018813Uk.getClass();
            C0S78.LIZ(AFwS219S0000000_30.get$arr$(279), ((Boolean) C2267951Dpp.LJ.getValue()).booleanValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final void LJIIIZ(String str) {
        if (str != null) {
            this.LIZJ.put(str, Boolean.TRUE);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final InterfaceC20638715pR LIZIZ(String str, boolean z) {
        InterfaceC20639315pX interfaceC20639315pX = (InterfaceC20639315pX) ((LinkedHashMap) this.LIZIZ).get(str);
        if (interfaceC20639315pX != null) {
            return interfaceC20639315pX.LIZIZ(str, z);
        }
        return C20638815pS.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(java.lang.String r4, X.C1155610gB5 r5) {
        /*
            r3 = this;
            boolean r0 = r3.LJIIJJI()
            r2 = 1
            r1 = 0
            if (r0 != 0) goto L19
            boolean r0 = r3.LJIIL()
            if (r0 == 0) goto L5b
            X.10St r0 = X.C19250110St.LIZ
            r0.getClass()
            boolean r0 = X.C19250110St.LIZLLL()
            if (r0 == 0) goto L5b
        L19:
            com.ss.android.ugc.aweme.service.interest.IInterestReselectionService r0 = r3.LIZ
            if (r0 == 0) goto L24
            boolean r0 = r0.LJIIZILJ()
            if (r0 != r2) goto L24
        L23:
            return r1
        L24:
            if (r4 == 0) goto L23
            java.util.Map<java.lang.String, X.15pX> r0 = r3.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r1 = r0.get(r4)
            X.15pX r1 = (X.InterfaceC20639315pX) r1
            if (r1 != 0) goto L3f
            boolean r0 = r3.LJIIJJI()
            if (r0 == 0) goto L44
            X.1DDW r1 = X.C1DDW.LIZ
        L3a:
            java.util.Map<java.lang.String, X.15pX> r0 = r3.LIZIZ
            r0.put(r4, r1)
        L3f:
            boolean r1 = r1.LIZJ(r4, r5)
            return r1
        L44:
            boolean r0 = r3.LJIIL()
            if (r0 == 0) goto L58
            X.10St r0 = X.C19250110St.LIZ
            r0.getClass()
            boolean r0 = X.C19250110St.LIZLLL()
            if (r0 == 0) goto L58
            X.1DDX r1 = X.C1DDX.LIZ
            goto L3a
        L58:
            X.1DDU r1 = X.C1DDU.LIZ
            goto L3a
        L5b:
            boolean r0 = LJIILJJIL()
            if (r0 == 0) goto L67
            boolean r0 = r3.LJIIJ()
            if (r0 != 0) goto L23
        L67:
            X.10St r0 = X.C19250110St.LIZ
            r0.getClass()
            boolean r0 = X.C19250110St.LIZLLL()
            if (r0 != 0) goto L23
            com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackButtonData r0 = X.C21151417pw.LIZ()
            boolean r0 = r0.isEnable
            if (r0 == 0) goto L23
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackService.LIZJ(java.lang.String, X.0gB5):boolean");
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final void LIZ(String str, String str2, EnumC1877260yx2 enumC1877260yx2) {
        InterfaceC20639315pX interfaceC20639315pX = (InterfaceC20639315pX) ((LinkedHashMap) this.LIZIZ).get(str);
        if (interfaceC20639315pX != null) {
            interfaceC20639315pX.LIZ(str, str2, enumC1877260yx2);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService
    public final void LIZLLL(String str, String str2, EnumC1877260yx2 enumC1877260yx2, C1DD8 c1dd8, long j) {
        InterfaceC20639315pX interfaceC20639315pX = (InterfaceC20639315pX) ((LinkedHashMap) this.LIZIZ).get(str);
        if (interfaceC20639315pX != null) {
            interfaceC20639315pX.LIZLLL(str, str2, enumC1877260yx2, c1dd8, j);
        }
    }
}
