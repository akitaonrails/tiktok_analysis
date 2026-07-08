package com.ss.android.ugc.aweme.landpage.externalguide;

import X.AbstractC1038360d7y;
import X.C01GW;
import X.C09CT;
import X.C1023960ckk;
import X.C1035880d3y;
import X.C1038270d7p;
import X.C1038290d7r;
import X.C1038300d7s;
import X.C1038490d8B;
import X.C1038520d8E;
import X.C1041160dCU;
import X.C1041170dCV;
import X.C452501pT;
import X.InterfaceC1038370d7z;
import X.InterfaceC1038550d8H;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS4S0000200_16;
import kotlin.jvm.internal.AwS50S0100100_16;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AbsAdExternalGuideHandler implements InterfaceC1038370d7z {
    public final AdExternalGuideTriggerCondition LIZ;
    public final AbstractC1038360d7y LIZIZ;
    public InterfaceC1038550d8H LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(395));

    public abstract boolean LJ();

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    @Override // X.InterfaceC1038370d7z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ() {
        /*
            r8 = this;
            X.0d8H r0 = r8.LIZJ
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition r0 = r8.LIZ
            java.lang.Integer r5 = r0.getType()
            com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition$Type r2 = com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition.Type.DELAY
            int r1 = r2.getValue()
            r7 = 0
            r4 = 1
            r3 = 0
            if (r5 == 0) goto L4d
            int r0 = r5.intValue()
            if (r0 != r1) goto L4d
            com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition r0 = r8.LIZ
            java.lang.Integer r0 = r0.getType()
            int r1 = r2.getValue()
            r5 = 0
            if (r0 == 0) goto Lc5
            int r0 = r0.intValue()
            if (r0 != r1) goto Lc5
            X.04rF r0 = X.C1227904rF.LIZ     // Catch: java.lang.Throwable -> L75
            r0.getClass()     // Catch: java.lang.Throwable -> L75
            com.google.gson.Gson r2 = X.C1227904rF.LIZLLL()     // Catch: java.lang.Throwable -> L75
            com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition r0 = r8.LIZ     // Catch: java.lang.Throwable -> L75
            com.google.gson.k r1 = r0.getParams()     // Catch: java.lang.Throwable -> L75
            java.lang.Class<com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler$DelayConditionParam> r0 = com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler.DelayConditionParam.class
            java.lang.Object r1 = r2.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L75
            com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler$DelayConditionParam r1 = (com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler.DelayConditionParam) r1     // Catch: java.lang.Throwable -> L75
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L75
            goto L81
        L4d:
            com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition$Type r0 = com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition.Type.LOGIN
            int r1 = r0.getValue()
            if (r5 == 0) goto L61
            int r0 = r5.intValue()
            if (r0 != r1) goto L61
            X.0N2t r3 = new X.0N2t
            r3.<init>(r8)
            goto Lb3
        L61:
            com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition$Type r0 = com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition.Type.FRONT_END
            int r1 = r0.getValue()
            if (r5 == 0) goto Lb3
            int r0 = r5.intValue()
            if (r0 != r1) goto Lb3
            X.0N2t r3 = new X.0N2t
            r3.<init>(r8)
            goto Lb3
        L75:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L81:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L88
            r1 = r3
        L88:
            com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler$DelayConditionParam r1 = (com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler.DelayConditionParam) r1
            if (r1 == 0) goto Lc5
            java.lang.Long r3 = r1.getTime()
            if (r3 == 0) goto Lc5
            long r1 = r3.longValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto Lc5
            long r0 = r3.longValue()
        L9e:
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            long r1 = r3.longValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lbf
            long r0 = r3.longValue()
            X.0N2s r3 = new X.0N2s
            r3.<init>(r0, r8)
        Lb3:
            r8.LIZJ = r3
            if (r3 == 0) goto Lbe
            boolean r0 = r3.LIZ()
            if (r0 != r4) goto Lbe
            r7 = 1
        Lbe:
            return r7
        Lbf:
            X.0N2t r3 = new X.0N2t
            r3.<init>(r8)
            goto Lb3
        Lc5:
            r0 = 0
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler.LIZ():boolean");
    }

    @Override // X.InterfaceC1038370d7z
    public void LIZIZ() {
        InterfaceC1038550d8H interfaceC1038550d8H = this.LIZJ;
        if (interfaceC1038550d8H != null) {
            interfaceC1038550d8H.cancel();
        }
        if (LJI() != null) {
            C1038270d7p.LIZIZ = false;
        }
        if (LJI() != null) {
            C1038270d7p.LIZJ = false;
        }
    }

    public final C1035880d3y LJFF() {
        SparkContext sparkContext;
        AbstractC1038360d7y abstractC1038360d7y = this.LIZIZ;
        if (abstractC1038360d7y instanceof C1038290d7r) {
            sparkContext = ((C1038290d7r) abstractC1038360d7y).LIZ;
        } else {
            if (!(abstractC1038360d7y instanceof C1038300d7s)) {
                return null;
            }
            sparkContext = ((C1038300d7s) abstractC1038360d7y).LIZIZ;
        }
        if (sparkContext != null) {
            return (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
        }
        return null;
    }

    public final C1038270d7p LJI() {
        return (C1038270d7p) this.LIZLLL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            r4 = this;
            X.0d7y r2 = r4.LIZIZ
            boolean r0 = r2 instanceof X.C1038290d7r
            if (r0 == 0) goto L11
            r0 = r2
            X.0d7r r0 = (X.C1038290d7r) r0
            java.lang.Runnable r0 = r0.LIZIZ
            if (r0 == 0) goto L11
            r0.run()
            return
        L11:
            boolean r0 = r2 instanceof X.C1038290d7r
            r1 = 0
            if (r0 == 0) goto L2a
            X.0d7r r2 = (X.C1038290d7r) r2
            com.bytedance.hybrid.spark.SparkContext r2 = r2.LIZ
        L1a:
            if (r2 == 0) goto L33
            java.lang.Class<X.0d8G> r0 = X.InterfaceC1038540d8G.class
            java.lang.Object r0 = r2.LJFF(r0)
            X.0d8G r0 = (X.InterfaceC1038540d8G) r0
            if (r0 == 0) goto L33
            r0.LIZIZ()
            return
        L2a:
            boolean r0 = r2 instanceof X.C1038300d7s
            if (r0 == 0) goto L33
            X.0d7s r2 = (X.C1038300d7s) r2
            com.bytedance.hybrid.spark.SparkContext r2 = r2.LIZIZ
            goto L1a
        L33:
            X.0d7y r2 = r4.LIZIZ
            boolean r0 = r2 instanceof X.C1038290d7r
            if (r0 == 0) goto L58
            X.0d7r r2 = (X.C1038290d7r) r2
            com.bytedance.hybrid.spark.SparkContext r0 = r2.LIZ
        L3d:
            if (r0 == 0) goto L49
            X.0qEH r0 = r0.LJIJJ()
            if (r0 == 0) goto L49
            android.view.View r1 = r0.e1()
        L49:
            boolean r0 = r1 instanceof android.webkit.WebView
            if (r0 == 0) goto L78
            android.webkit.WebView r1 = (android.webkit.WebView) r1
            if (r1 == 0) goto L78
            android.content.Context r3 = r1.getContext()
            if (r3 != 0) goto L61
            return
        L58:
            boolean r0 = r2 instanceof X.C1038300d7s
            if (r0 == 0) goto L49
            X.0d7s r2 = (X.C1038300d7s) r2
            com.bytedance.hybrid.spark.SparkContext r0 = r2.LIZIZ
            goto L3d
        L61:
            java.lang.String r2 = r1.getUrl()
            if (r2 != 0) goto L68
            return
        L68:
            X.0d3y r1 = r4.LJFF()
            if (r1 != 0) goto L6f
            return
        L6f:
            X.0d6O r0 = X.C1037380d6O.LIZ
            r0.getClass()
            X.C1037380d6O.LJ(r1, r2, r3)
            return
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler.LJII():void");
    }

    public static final class DelayConditionParam implements Serializable {
        public static final int $stable = 0;

        @C09CT("time")
        public final Long time;

        public DelayConditionParam() {
            this(null);
        }

        public final Long getTime() {
            return this.time;
        }

        public DelayConditionParam(Long l) {
            this.time = l;
        }
    }

    public final void LJIIIZ(long j) {
        AwemeRawAd awemeRawAd;
        C1041160dCU c1041160dCU = new C1041160dCU(new C1041170dCV(0, 0, null, null, LJFF(), 31));
        C1023960ckk c1023960ckk = C1038490d8B.LIZ;
        C1035880d3y c1035880d3yLJFF = LJFF();
        if (c1035880d3yLJFF != null) {
            awemeRawAd = c1035880d3yLJFF.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c1041160dCU.logAd(c1023960ckk, awemeRawAd, new AwS50S0100100_16(j, this, 4));
    }

    public AbsAdExternalGuideHandler(AdExternalGuideTriggerCondition adExternalGuideTriggerCondition, AbstractC1038360d7y abstractC1038360d7y) {
        this.LIZ = adExternalGuideTriggerCondition;
        this.LIZIZ = abstractC1038360d7y;
    }

    public final void LJIIIIZZ(long j, long j2) {
        AwemeRawAd awemeRawAd;
        C1041160dCU c1041160dCU = new C1041160dCU(new C1041170dCV(0, 0, null, null, LJFF(), 31));
        C1023960ckk c1023960ckk = C1038520d8E.LIZ;
        C1035880d3y c1035880d3yLJFF = LJFF();
        if (c1035880d3yLJFF != null) {
            awemeRawAd = c1035880d3yLJFF.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c1041160dCU.logAd(c1023960ckk, awemeRawAd, new AwS4S0000200_16(j, j2, 0));
    }
}
