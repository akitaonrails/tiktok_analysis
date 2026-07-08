package kotlin.jvm.internal;

import X.C09AY;
import X.C0C64;
import X.C1002190cBd;
import X.C1009990cOD;
import X.C1023640ckE;
import X.C1040740dBo;
import X.C1047370dMV;
import X.C1053400dWE;
import X.C1053410dWF;
import X.C1389700mGe;
import X.C2268001Dpu;
import X.EnumC1070410dxf;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommerceVideoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class AwS101S0201000_16 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS101S0201000_16 r10, java.lang.Object r11) {
        /*
            X.0daz r11 = (X.C1056350daz) r11
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "on "
            r1.append(r0)
            java.lang.Object r0 = r10.l0
            X.0dxf r0 = (X.EnumC1070410dxf) r0
            r1.append(r0)
            java.lang.String r0 = " auth sync complete!"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "[ffp]_RecFriends"
            X.C1720106oR.LJI(r0, r1)
            java.util.List<X.0zJl> r1 = r11.LLILLL
            java.lang.Object r8 = r10.l0
            X.0dxf r8 = (X.EnumC1070410dxf) r8
            int r7 = r10.i2
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r5.<init>(r0)
            java.util.Iterator r9 = r1.iterator()
        L39:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r6 = r9.next()
            X.0zJl r6 = (X.InterfaceC1891350zJl) r6
            boolean r0 = r6 instanceof X.C1069700dwW
            if (r0 == 0) goto L6d
            r4 = r6
            X.0dwW r4 = (X.C1069700dwW) r4
            X.0dxf r0 = r4.LL
            if (r0 != r8) goto L6d
            X.0dxf r0 = X.EnumC1070410dxf.CONTACT
            r3 = 1
            if (r8 != r0) goto L71
            X.01GW r0 = X.C295680BiQ.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 0
            if (r0 == 0) goto L71
        L64:
            X.0dxf r1 = r4.LL
            X.0e3P r0 = r4.LLILZ
            X.0dwW r6 = new X.0dwW
            r6.<init>(r1, r3, r2, r0)
        L6d:
            r5.add(r6)
            goto L39
        L71:
            r2 = r7
            goto L64
        L73:
            java.lang.Object r2 = r10.l1
            com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM r2 = (com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM) r2
            kotlin.jvm.internal.AwS595S0100000_16 r1 = new kotlin.jvm.internal.AwS595S0100000_16
            r0 = 1
            r1.<init>(r5, r0)
            r2.setState(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS101S0201000_16.invoke$0(kotlin.jvm.internal.AwS101S0201000_16, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS101S0201000_16 awS101S0201000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext(((Aweme) awS101S0201000_16.l0).getAwemeRawAd());
        C1009990cOD.LIZ.getClass();
        int i = 1;
        c1023640ckE.withParam(C1009990cOD.LJJIJL, Integer.valueOf(awS101S0201000_16.i2 + 1));
        C1002190cBd c1002190cBd = C1009990cOD.LJJIJLIJ;
        AwemeRawAd awemeRawAd = (AwemeRawAd) awS101S0201000_16.l1;
        if (awemeRawAd == null || !awemeRawAd.isReshowAd()) {
            i = 0;
        }
        c1023640ckE.withParam(c1002190cBd, Integer.valueOf(i));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS101S0201000_16 awS101S0201000_16, Object obj) {
        int iIntValue;
        Integer numValueOf;
        long j;
        LandingPageConfig landingPageConfig;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2268001Dpu.LIZ.getClass();
        c1023640ckE.withParam(C2268001Dpu.LJII, "iab");
        c1023640ckE.withParam(C2268001Dpu.LJI, Long.valueOf(awS101S0201000_16.i2));
        C1002190cBd c1002190cBd = C2268001Dpu.LJIILL;
        Integer num = (Integer) awS101S0201000_16.l0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        c1023640ckE.withParam(c1002190cBd, Long.valueOf(iIntValue));
        c1023640ckE.withParam(C2268001Dpu.LJJIIZI, ((C1040740dBo) awS101S0201000_16.l1).LL.getUrl());
        C1002190cBd c1002190cBd2 = C2268001Dpu.LJJJI;
        AwemeRawAd awemeRawAd = ((C1040740dBo) awS101S0201000_16.l1).LL.getAwemeRawAd();
        if (awemeRawAd != null && (landingPageConfig = awemeRawAd.getLandingPageConfig()) != null) {
            numValueOf = Integer.valueOf(landingPageConfig.isAutofillNoneffective());
        } else {
            numValueOf = null;
        }
        c1023640ckE.withParam(c1002190cBd2, numValueOf);
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_log_iab_permission", true, true)) {
            C2268001Dpu.LIZ.getClass();
            c1023640ckE.withParam(C2268001Dpu.LIZIZ, Long.valueOf(C1047370dMV.LIZ(((C1040740dBo) awS101S0201000_16.l1).LL, "camera")));
            c1023640ckE.withParam(C2268001Dpu.LIZJ, Long.valueOf(C1047370dMV.LIZ(((C1040740dBo) awS101S0201000_16.l1).LL, "audio")));
            c1023640ckE.withParam(C2268001Dpu.LIZLLL, Long.valueOf(C1047370dMV.LIZ(((C1040740dBo) awS101S0201000_16.l1).LL, "location")));
        }
        C2268001Dpu.LIZ.getClass();
        c1023640ckE.withParam(C2268001Dpu.LJJJIL, Long.valueOf(((C1040740dBo) awS101S0201000_16.l1).LL.getAlphaLoadingEffectiveScene()));
        ICommerceVideoService iCommerceVideoService = (ICommerceVideoService) PluggableExtentionKt.pluggableSpi$default(ICommerceVideoService.class, false, false, false, 14, null);
        if (iCommerceVideoService != null) {
            boolean zIsPlaying = iCommerceVideoService.isPlaying();
            C1002190cBd c1002190cBd3 = C2268001Dpu.LJJJJ;
            if (zIsPlaying) {
                j = 1;
            } else {
                j = 0;
            }
            c1023640ckE.withParam(c1002190cBd3, Long.valueOf(j));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS101S0201000_16 awS101S0201000_16, Object obj) {
        int iIntValue;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2268001Dpu.LIZ.getClass();
        c1023640ckE.withParam(C2268001Dpu.LJII, "iab");
        c1023640ckE.withParam(C2268001Dpu.LJI, Long.valueOf(awS101S0201000_16.i2));
        C1002190cBd c1002190cBd = C2268001Dpu.LJIILL;
        Integer num = (Integer) awS101S0201000_16.l0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        c1023640ckE.withParam(c1002190cBd, Long.valueOf(iIntValue));
        c1023640ckE.withParam(C2268001Dpu.LJJIIZI, ((C1040740dBo) awS101S0201000_16.l1).LL.getUrl());
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS101S0201000_16 awS101S0201000_16, Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tapIndex", awS101S0201000_16.i2);
        ((C1389700mGe) awS101S0201000_16.l0).LJFF((Number) awS101S0201000_16.l1, jSONObject);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS101S0201000_16 awS101S0201000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1053400dWE.LIZ.getClass();
        c1023640ckE.withParam(C1053400dWE.LIZIZ, ((C1053410dWF) awS101S0201000_16.l0).LIZIZ);
        c1023640ckE.withParam(C1053400dWE.LIZJ, (Integer) awS101S0201000_16.l1);
        c1023640ckE.withParam(C1053400dWE.LJ, Integer.valueOf(awS101S0201000_16.i2));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0201000_16(int i, C1053410dWF c1053410dWF, Integer num, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1053410dWF;
        this.l1 = num;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0201000_16(int i, Aweme aweme, AwemeRawAd awemeRawAd, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.i2 = i;
        this.l1 = awemeRawAd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0201000_16(int i, Integer num, C1040740dBo c1040740dBo, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = num;
        this.l1 = c1040740dBo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0201000_16(EnumC1070410dxf enumC1070410dxf, RecFriendsVM recFriendsVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = enumC1070410dxf;
        this.l1 = recFriendsVM;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0201000_16(C1389700mGe c1389700mGe, Number number, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1389700mGe;
        this.l1 = number;
        this.i2 = i;
    }
}
