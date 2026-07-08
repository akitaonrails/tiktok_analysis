package kotlin.jvm.internal;

import X.C09AY;
import X.C0HD9;
import X.C1340400kz8;
import X.C1345760l7m;
import X.C1360460lVU;
import X.C1387280mCk;
import X.C1558360qeg;
import X.C20642515q3;
import X.C735080SsU;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS60S2100000_21 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS60S2100000_21 awS60S2100000_21) {
        C0HD9 c0hd9LJIL = C1360460lVU.LIZIZ.LJIL(awS60S2100000_21.s0, awS60S2100000_21.s1);
        ICommentListVMAbility iCommentListVMAbilityLJ = C1345760l7m.LJ(((BaseCommentCell) awS60S2100000_21.l2).getFragment(), C1558360qeg.LJ(((BaseCommentCell) awS60S2100000_21.l2).itemView, null));
        if (iCommentListVMAbilityLJ != null) {
            iCommentListVMAbilityLJ.aV(awS60S2100000_21.s1, c0hd9LJIL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS60S2100000_21 awS60S2100000_21) {
        String logExtra;
        Long adId;
        C1387280mCk c1387280mCk = new C1387280mCk();
        c1387280mCk.LIZ = ((Aweme) awS60S2100000_21.l2).getAid();
        c1387280mCk.LIZIZ = 1;
        c1387280mCk.LJ = ((Aweme) awS60S2100000_21.l2).getAwemeType();
        c1387280mCk.LJI = 1;
        c1387280mCk.LJII = awS60S2100000_21.s0;
        if (AwemeExtKt.isMonetizationTraffic((Aweme) awS60S2100000_21.l2)) {
            Context contextLIZ = C20642515q3.LIZ();
            AwemeRawAd monetizationData = AwemeExtKt.getMonetizationData((Aweme) awS60S2100000_21.l2);
            Long creativeId = null;
            if (monetizationData != null) {
                logExtra = monetizationData.getLogExtra();
            } else {
                logExtra = null;
            }
            AwemeRawAd monetizationData2 = AwemeExtKt.getMonetizationData((Aweme) awS60S2100000_21.l2);
            if (monetizationData2 != null) {
                adId = monetizationData2.getAdId();
            } else {
                adId = null;
            }
            String strValueOf = String.valueOf(adId);
            AwemeRawAd monetizationData3 = AwemeExtKt.getMonetizationData((Aweme) awS60S2100000_21.l2);
            if (monetizationData3 != null) {
                creativeId = monetizationData3.getCreativeId();
            }
            C735080SsU.LIZIZ(contextLIZ, logExtra, strValueOf, String.valueOf(creativeId), c1387280mCk);
        } else {
            String str = awS60S2100000_21.s1;
            if (str != null) {
                c1387280mCk.LJJIJ = str;
            }
        }
        try {
            AwemeStatsApi.LIZ(c1387280mCk.LIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS60S2100000_21(Aweme aweme, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = aweme;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS60S2100000_21(String str, String str2, String str3, BaseCommentCell<C1340400kz8> baseCommentCell) {
        super(0);
        this.$t = baseCommentCell;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
    }
}
