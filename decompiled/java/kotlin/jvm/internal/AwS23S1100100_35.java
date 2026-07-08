package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1D2N;
import X.C1DXY;
import X.C1DXZ;
import X.C2257481DXm;
import X.C2257491DXn;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommerceVideoService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS23S1100100_35 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS23S1100100_35 awS23S1100100_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1D2N.LIZ.getClass();
        c1023640ckE.withParam(C1D2N.LIZIZ, Long.valueOf(awS23S1100100_35.j2));
        c1023640ckE.withParam(C1D2N.LIZJ, Long.valueOf(((AwemeRawAd) awS23S1100100_35.l1).getBocIntervalSeconds()));
        c1023640ckE.withParam(C1D2N.LIZLLL, awS23S1100100_35.s0);
        c1023640ckE.withParam(C1D2N.LJ, "boc");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS23S1100100_35 awS23S1100100_35, Object obj) {
        long j;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2257481DXm.LIZ.getClass();
        c1023640ckE.withParam(C2257481DXm.LIZLLL, Long.valueOf(awS23S1100100_35.j2));
        C1002190cBd c1002190cBd = C2257481DXm.LIZIZ;
        long j2 = 1;
        if (((C1DXY) awS23S1100100_35.l1).LJII) {
            j = 1;
        } else {
            j = 0;
        }
        c1023640ckE.withParam(c1002190cBd, Long.valueOf(j));
        c1023640ckE.withParam(C2257481DXm.LIZJ, awS23S1100100_35.s0);
        C2257491DXn.LIZ.getClass();
        c1023640ckE.withParam(C2257491DXn.LIZLLL, Long.valueOf(((C1DXY) awS23S1100100_35.l1).LIZ.getAlphaLoadingEffectiveScene()));
        ICommerceVideoService iCommerceVideoService = (ICommerceVideoService) PluggableExtentionKt.pluggableSpi$default(ICommerceVideoService.class, false, false, false, 14, null);
        if (iCommerceVideoService != null) {
            boolean zIsPlaying = iCommerceVideoService.isPlaying();
            C1002190cBd c1002190cBd2 = C2257491DXn.LJ;
            if (!zIsPlaying) {
                j2 = 0;
            }
            c1023640ckE.withParam(c1002190cBd2, Long.valueOf(j2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS23S1100100_35 awS23S1100100_35, Object obj) {
        long j;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2257491DXn.LIZ.getClass();
        c1023640ckE.withParam(C2257491DXn.LIZJ, Long.valueOf(awS23S1100100_35.j2));
        c1023640ckE.withParam(C2257491DXn.LIZIZ, awS23S1100100_35.s0);
        c1023640ckE.withParam(C2257491DXn.LIZLLL, Long.valueOf(((C1DXZ) awS23S1100100_35.l1).LIZ.getAlphaLoadingEffectiveScene()));
        ICommerceVideoService iCommerceVideoService = (ICommerceVideoService) PluggableExtentionKt.pluggableSpi$default(ICommerceVideoService.class, false, false, false, 14, null);
        if (iCommerceVideoService != null) {
            boolean zIsPlaying = iCommerceVideoService.isPlaying();
            C1002190cBd c1002190cBd = C2257491DXn.LJ;
            if (zIsPlaying) {
                j = 1;
            } else {
                j = 0;
            }
            c1023640ckE.withParam(c1002190cBd, Long.valueOf(j));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S1100100_35(long j, C1DXY c1dxy, String str, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.l1 = c1dxy;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S1100100_35(long j, AwemeRawAd awemeRawAd, String str, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.l1 = awemeRawAd;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S1100100_35(long j, String str, C1DXZ c1dxz, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.s0 = str;
        this.l1 = c1dxz;
    }
}
