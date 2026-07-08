package kotlin.jvm.internal;

import X.C09AY;
import X.C0N2S;
import X.C1002190cBd;
import X.C1009980cOC;
import X.C1009990cOD;
import X.C1011150cQ5;
import X.C1018400cbm;
import X.C1018410cbn;
import X.C1022820ciu;
import X.C1023640ckE;
import X.C1030200cuo;
import X.C1030210cup;
import X.C1030240cus;
import X.C1030250cut;
import X.C1030850cvr;
import X.C1035880d3y;
import X.C1038500d8C;
import X.C1040110dAn;
import X.C1040180dAu;
import X.C1040440dBK;
import X.C1040740dBo;
import X.C1043500dGG;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2266111Dmr;
import X.C2268021Dpw;
import X.C2510609se;
import X.InterfaceC1041500dD2;
import X.RunnableC587560N2s;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.detail.SearchInflowProductShopCardService;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition;
import com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS50S0100100_16 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

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
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("transformOpenCallback success = ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        if (zBooleanValue) {
            SearchAdEventLogger searchAdEventLogger = ((C1011150cQ5) awS50S0100100_16.l0).LLJI;
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger.logAd(C1009980cOC.LJJIJL, new AwS31S0000100_16(awS50S0100100_16.j1, 5));
        } else {
            SearchAdEventLogger searchAdEventLogger2 = ((C1011150cQ5) awS50S0100100_16.l0).LLJI;
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger2.logAd(C1009980cOC.LJJIJLIJ, new AwS31S0000100_16(awS50S0100100_16.j1, 6));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("transformOpenCallback success = ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        if (zBooleanValue) {
            SearchAdEventLogger searchAdEventLogger = ((C1011150cQ5) awS50S0100100_16.l0).LLJI;
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger.logAd(C1009980cOC.LJJJ, new AwS31S0000100_16(awS50S0100100_16.j1, 7));
        } else {
            SearchAdEventLogger searchAdEventLogger2 = ((C1011150cQ5) awS50S0100100_16.l0).LLJI;
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger2.logAd(C1009980cOC.LJJJI, new AwS31S0000100_16(awS50S0100100_16.j1, 8));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2268021Dpw.LIZ.getClass();
        c1023640ckE.withParam(C2268021Dpw.LJIILIIL, Long.valueOf(((C1040740dBo) awS50S0100100_16.l0).LLILLL));
        c1023640ckE.withParam(C2268021Dpw.LJJII, ((C1040740dBo) awS50S0100100_16.l0).LLJI);
        c1023640ckE.withParam(C2268021Dpw.LJIIJ, Long.valueOf(((C1040740dBo) awS50S0100100_16.l0).LLJJIII));
        c1023640ckE.withParam(C2268021Dpw.LJI, "iab");
        c1023640ckE.withParam(C2268021Dpw.LJFF, Long.valueOf(((C1040740dBo) awS50S0100100_16.l0).LLJJIJIL));
        c1023640ckE.withParam(C2268021Dpw.LJJIIZI, ((C1040740dBo) awS50S0100100_16.l0).LLJI);
        c1023640ckE.withParam(C2268021Dpw.LJJ, Long.valueOf(awS50S0100100_16.j1));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        AwemeRawAd awemeRawAd;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        Aweme aweme = ((SearchInflowProductShopCardService) awS50S0100100_16.l0).LIZLLL;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c1023640ckE.withContext(awemeRawAd);
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJIJIL, String.valueOf(awS50S0100100_16.j1));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        long j;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1040440dBK.LIZ.getClass();
        c1023640ckE.withParam(C1040440dBK.LIZIZ, "AI_AUTOFILL");
        C1002190cBd c1002190cBd = C1040440dBK.LIZJ;
        if (((C1040180dAu) awS50S0100100_16.l0).LIZ) {
            j = 1;
        } else {
            j = 0;
        }
        c1023640ckE.withParam(c1002190cBd, Long.valueOf(j));
        c1023640ckE.withParam(C1040440dBK.LIZLLL, ((C1040180dAu) awS50S0100100_16.l0).LIZIZ);
        c1023640ckE.withParam(C1040440dBK.LJ, ((C1040180dAu) awS50S0100100_16.l0).LIZJ);
        c1023640ckE.withParam(C1040440dBK.LJFF, C1040110dAn.LLILZIL.LIZJ(awS50S0100100_16.j1));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1040440dBK.LIZ.getClass();
        c1023640ckE.withParam(C1040440dBK.LIZIZ, "AI_AUTOFILL");
        c1023640ckE.withParam(C1040440dBK.LIZJ, 0L);
        c1023640ckE.withParam(C1040440dBK.LIZLLL, ((IJSInjectCallback$ErrorCode) awS50S0100100_16.l0).name());
        c1023640ckE.withParam(C1040440dBK.LJ, ((IJSInjectCallback$ErrorCode) awS50S0100100_16.l0).name());
        c1023640ckE.withParam(C1040440dBK.LJFF, C1040110dAn.LLILZIL.LIZJ(awS50S0100100_16.j1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1030850cvr.LIZ.getClass();
        c1023640ckE.withParam(C1030850cvr.LJIIL, (C0N2S) awS50S0100100_16.l0);
        c1023640ckE.withParam(C1030850cvr.LJIILJJIL, Long.valueOf(awS50S0100100_16.j1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1018410cbn.LIZ.getClass();
        c1023640ckE.withParam(C1018410cbn.LIZJ, Long.valueOf(awS50S0100100_16.j1));
        c1023640ckE.withParam(C1018410cbn.LIZLLL, ((C1018400cbm) awS50S0100100_16.l0).LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        Long lValueOf;
        long j;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1038500d8C.LIZ.getClass();
        c1023640ckE.withParam(C1038500d8C.LIZJ, Long.valueOf(awS50S0100100_16.j1));
        AbsAdExternalGuideHandler absAdExternalGuideHandler = (AbsAdExternalGuideHandler) awS50S0100100_16.l0;
        Integer type = absAdExternalGuideHandler.LIZ.getType();
        int value = AdExternalGuideTriggerCondition.Type.DELAY.getValue();
        if (type != null && type.intValue() == value) {
            if (absAdExternalGuideHandler.LIZJ instanceof RunnableC587560N2s) {
                j = 2;
            } else {
                j = 1;
            }
            lValueOf = Long.valueOf(j);
        } else {
            int value2 = AdExternalGuideTriggerCondition.Type.LOGIN.getValue();
            if (type != null && type.intValue() == value2) {
                lValueOf = 3L;
            } else {
                int value3 = AdExternalGuideTriggerCondition.Type.FRONT_END.getValue();
                if (type != null && type.intValue() == value3) {
                    lValueOf = 3L;
                }
                return Unit.LIZ;
            }
        }
        if (lValueOf != null) {
            c1023640ckE.withParam(C1038500d8C.LIZIZ, Long.valueOf(lValueOf.longValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2266111Dmr.LIZ.getClass();
        c1023640ckE.withParam(C2266111Dmr.LJIIZILJ, Long.valueOf(awS50S0100100_16.j1));
        c1023640ckE.withParam(C2266111Dmr.LJIJI, Long.valueOf(((C1040740dBo) awS50S0100100_16.l0).LL.getWebLoadStatusModel().loadingStatus));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LJIIZILJ, Long.valueOf(awS50S0100100_16.j1));
        c1023640ckE.withParam(C1043500dGG.LJJJZ, Integer.valueOf(((C1040740dBo) awS50S0100100_16.l0).LL.getWebLoadStatusModel().loadingStatus));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        Long creativeId;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1030250cut.LIZ.getClass();
        c1023640ckE.withParam(C1030250cut.LIZIZ, Long.valueOf(awS50S0100100_16.j1));
        C1002190cBd c1002190cBd = C1030250cut.LIZJ;
        AwemeRawAd awemeRawAd = ((C1030210cup) awS50S0100100_16.l0).LIZIZ;
        if (awemeRawAd != null) {
            creativeId = awemeRawAd.getCreativeId();
        } else {
            creativeId = null;
        }
        c1023640ckE.withParam(c1002190cBd, creativeId);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("ad_wap_stat", "gecko_hit_status", String.valueOf(awS50S0100100_16.j1), ((InterfaceC1041500dD2) awS50S0100100_16.l0).getRealLogExtra(), null);
        c1022820ciuLJ.LIZIZ("pixel_preload", "gecko_channel");
        c1022820ciuLJ.LIZIZ(obj, "url");
        c1022820ciuLJ.LJII();
        return null;
    }

    public static final Object invoke$9(AwS50S0100100_16 awS50S0100100_16, Object obj) {
        Long creativeId;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1030240cus.LIZ.getClass();
        c1023640ckE.withParam(C1030240cus.LIZIZ, Long.valueOf(awS50S0100100_16.j1));
        C1002190cBd c1002190cBd = C1030240cus.LIZJ;
        AwemeRawAd awemeRawAd = ((C1030200cuo) awS50S0100100_16.l0).LIZIZ;
        if (awemeRawAd != null) {
            creativeId = awemeRawAd.getCreativeId();
        } else {
            creativeId = null;
        }
        c1023640ckE.withParam(c1002190cBd, creativeId);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS50S0100100_16(long r3, X.C1040740dBo r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 5: goto Lf;
                case 6: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.j1 = r3
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.j1 = r3
            r1.l0 = r5
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS50S0100100_16.<init>(long, X.0dBo, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0100100_16(long j, C1018400cbm c1018400cbm, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = c1018400cbm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0100100_16(long j, C1030200cuo c1030200cuo, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = c1030200cuo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0100100_16(long j, C1030210cup c1030210cup, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = c1030210cup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0100100_16(long j, C1035880d3y c1035880d3y, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = c1035880d3y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0100100_16(long j, AbsAdExternalGuideHandler absAdExternalGuideHandler, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = absAdExternalGuideHandler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0100100_16(C0N2S c0n2s, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0n2s;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0100100_16(C1011150cQ5 c1011150cQ5, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1011150cQ5;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0100100_16(C1040180dAu c1040180dAu, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1040180dAu;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0100100_16(IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = iJSInjectCallback$ErrorCode;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0100100_16(SearchInflowProductShopCardService searchInflowProductShopCardService, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchInflowProductShopCardService;
        this.j1 = j;
    }
}
