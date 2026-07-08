package kotlin.jvm.internal;

import X.C05YD;
import X.C09AY;
import X.C440370HOp;
import X.C454770HsR;
import X.C454780HsS;
import X.C823170WQx;
import X.EnumC440400HOs;
import X.EnumC440990HQz;
import X.EnumC441640HTm;
import X.InterfaceC440090HNn;
import android.content.Context;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS43S0100100_6 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS43S0100100_6 awS43S0100100_6, Object obj) {
        C823170WQx<String> c823170WQxLIZLLL;
        C05YD<InterfaceC440090HNn> c05ydLIZ;
        InterfaceC440090HNn value;
        ((Number) obj).intValue();
        MixStudioStatusRepository mixStudioStatusRepositoryZQ2 = ((MixStudioResultsPageViewModel) awS43S0100100_6.l0).zQ2();
        if (mixStudioStatusRepositoryZQ2 != null && (c05ydLIZ = mixStudioStatusRepositoryZQ2.LIZ()) != null && (value = c05ydLIZ.getValue()) != null) {
            MixStudioResultsPageViewModel mixStudioResultsPageViewModel = (MixStudioResultsPageViewModel) awS43S0100100_6.l0;
            C440370HOp c440370HOp = C440370HOp.LIZ;
            EnumC441640HTm enumC441640HTm = mixStudioResultsPageViewModel.yQ2().LLIZLLLIL;
            c440370HOp.getClass();
            C440370HOp.LJIIJ(enumC441640HTm, C440370HOp.LJIILIIL(value), EnumC440990HQz.FAVORITE_STICKER, EnumC440400HOs.FAIL_FAVORITE);
        }
        MixStudioStatusRepository mixStudioStatusRepositoryZQ22 = ((MixStudioResultsPageViewModel) awS43S0100100_6.l0).zQ2();
        if (mixStudioStatusRepositoryZQ22 != null && (c823170WQxLIZLLL = mixStudioStatusRepositoryZQ22.LIZLLL()) != null) {
            c823170WQxLIZLLL.remove(String.valueOf(awS43S0100100_6.j1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS43S0100100_6 awS43S0100100_6, Object obj) {
        Context context = (Context) obj;
        C454770HsR c454770HsR = (C454770HsR) awS43S0100100_6.l0;
        long j = awS43S0100100_6.j1;
        if (c454770HsR.LIZ == j) {
            return context.getString(2131831945, C454780HsS.LIZ(c454770HsR.LIZLLL));
        }
        if (c454770HsR.LIZJ == j) {
            return context.getString(2131831944, C454780HsS.LIZ(c454770HsR.LIZIZ));
        }
        return context.getString(2131831943, C454780HsS.LIZ(c454770HsR.LIZIZ), C454780HsS.LIZ(((C454770HsR) awS43S0100100_6.l0).LIZLLL));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0100100_6(C454770HsR c454770HsR, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c454770HsR;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0100100_6(MixStudioResultsPageViewModel mixStudioResultsPageViewModel, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = mixStudioResultsPageViewModel;
        this.j1 = j;
    }
}
