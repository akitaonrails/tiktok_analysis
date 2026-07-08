package kotlin.jvm.internal;

import X.C09AY;
import X.C1666370tSt;
import X.C1666630tTJ;
import X.C1669850tYV;
import X.C1672240tcM;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchoption.MatchOptionViewModel;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchoption.aihistory.MatchAIHistoryViewModel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.commonguide.CommonGuideViewModel;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.base.settingview.UpRightIconViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AwS178S0101000_15 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S0101000_15(MatchOptionViewModel matchOptionViewModel, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = matchOptionViewModel;
        this.i1 = i;
    }

    public static final Object invoke$0(AwS178S0101000_15 awS178S0101000_15, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1672240tcM.LIZIZ((UpRightIconViewModel) awS178S0101000_15.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS178S0101000_15.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS178S0101000_15 awS178S0101000_15, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669850tYV.LIZLLL((MatchOptionViewModel) awS178S0101000_15.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS178S0101000_15.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS178S0101000_15 awS178S0101000_15, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666630tTJ.LIZ((MatchAIHistoryViewModel) awS178S0101000_15.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS178S0101000_15.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS178S0101000_15 awS178S0101000_15, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666370tSt.LIZ((CommonGuideViewModel) awS178S0101000_15.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS178S0101000_15.i1 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S0101000_15(MatchAIHistoryViewModel matchAIHistoryViewModel, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = matchAIHistoryViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S0101000_15(CommonGuideViewModel commonGuideViewModel, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = commonGuideViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS178S0101000_15(UpRightIconViewModel upRightIconViewModel, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = upRightIconViewModel;
        this.i1 = i;
    }
}
