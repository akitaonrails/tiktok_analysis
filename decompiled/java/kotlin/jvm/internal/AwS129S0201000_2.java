package kotlin.jvm.internal;

import X.AbstractC1690640u62;
import X.C09AY;
import X.C1161040gJq;
import X.C118300cf;
import X.C1378505aR;
import X.C1397505dV;
import X.C1397705dX;
import X.C189200o6;
import X.C2188811AlT;
import X.C2252611DEt;
import X.InterfaceC20236714Gf;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS129S0201000_2 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS129S0201000_2 awS129S0201000_2) {
        int iIntValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMore consume pending raw response rawSessionId=");
        Integer num = (Integer) awS129S0201000_2.l0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        sbLIZ.append(iIntValue);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS129S0201000_2.l1).fT(Integer.valueOf(awS129S0201000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS129S0201000_2 awS129S0201000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performInsert ignore missing insertStartIndex responseSessionId=");
        sbLIZ.append(awS129S0201000_2.i2);
        sbLIZ.append(" components.size=");
        sbLIZ.append(((List) awS129S0201000_2.l0).size());
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS129S0201000_2.l1).fT(Integer.valueOf(awS129S0201000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS129S0201000_2 awS129S0201000_2) {
        Object[] objArr = (String[]) ((Object[]) awS129S0201000_2.l0);
        objArr[awS129S0201000_2.i2] = ((Function1) awS129S0201000_2.l1).invoke(objArr[awS129S0201000_2.i2]);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS129S0201000_2 awS129S0201000_2) {
        List list = (List) awS129S0201000_2.l0;
        Object objInvoke = ((Function1) awS129S0201000_2.l1).invoke(ListProtector.get(list, awS129S0201000_2.i2));
        if (!Intrinsics.LJFF(objInvoke, ListProtector.get(list, awS129S0201000_2.i2))) {
            ListProtector.set(list, awS129S0201000_2.i2, objInvoke);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS129S0201000_2 awS129S0201000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("manual load more onNext merged sessionId=");
        sbLIZ.append(awS129S0201000_2.i2);
        sbLIZ.append(" currentItems.size=");
        sbLIZ.append(((List) awS129S0201000_2.l0).size());
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS129S0201000_2.l1).fT(Integer.valueOf(awS129S0201000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$13(AwS129S0201000_2 awS129S0201000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("manual load more error sessionId=");
        sbLIZ.append(awS129S0201000_2.i2);
        sbLIZ.append(" throwable=");
        sbLIZ.append((Throwable) awS129S0201000_2.l0);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS129S0201000_2.l1).fT(Integer.valueOf(awS129S0201000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$14(AwS129S0201000_2 awS129S0201000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performDelete enter responseSessionId=");
        sbLIZ.append(awS129S0201000_2.i2);
        sbLIZ.append(" deleteIds=");
        sbLIZ.append((List) awS129S0201000_2.l0);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS129S0201000_2.l1).fT(Integer.valueOf(awS129S0201000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$15(AwS129S0201000_2 awS129S0201000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performDelete done responseSessionId=");
        sbLIZ.append(awS129S0201000_2.i2);
        sbLIZ.append(" bodySize=");
        sbLIZ.append(((List) awS129S0201000_2.l0).size());
        sbLIZ.append(" handlers=");
        sbLIZ.append(RavenFragment.PT((RavenFragment) awS129S0201000_2.l1));
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS129S0201000_2.l1).fT(Integer.valueOf(awS129S0201000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$16(AwS129S0201000_2 awS129S0201000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("manual load more onNext sessionId=");
        sbLIZ.append(awS129S0201000_2.i2);
        sbLIZ.append(" response=");
        sbLIZ.append(((C1161040gJq) awS129S0201000_2.l0).LL);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS129S0201000_2.l1).fT(Integer.valueOf(awS129S0201000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS129S0201000_2 awS129S0201000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performInsert error responseSessionId=");
        sbLIZ.append(awS129S0201000_2.i2);
        sbLIZ.append(" throwable=");
        sbLIZ.append((Throwable) awS129S0201000_2.l0);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS129S0201000_2.l1).fT(Integer.valueOf(awS129S0201000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS129S0201000_2 awS129S0201000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMore subscribe onNext sessionId=");
        sbLIZ.append(awS129S0201000_2.i2);
        sbLIZ.append(" isAllComponentsReady=");
        sbLIZ.append(((C1161040gJq) awS129S0201000_2.l0).LLILLJJLI);
        sbLIZ.append(" response = ");
        sbLIZ.append(((C1161040gJq) awS129S0201000_2.l0).LL);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS129S0201000_2.l1).fT(Integer.valueOf(awS129S0201000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS129S0201000_2 awS129S0201000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMore subscribe onNext merged sessionId=");
        sbLIZ.append(awS129S0201000_2.i2);
        sbLIZ.append(" currentItems.size=");
        sbLIZ.append(((List) awS129S0201000_2.l0).size());
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS129S0201000_2.l1).fT(Integer.valueOf(awS129S0201000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS129S0201000_2 awS129S0201000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMore error sessionId=");
        sbLIZ.append(awS129S0201000_2.i2);
        sbLIZ.append(" throwable=");
        sbLIZ.append((Throwable) awS129S0201000_2.l0);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS129S0201000_2.l1).fT(Integer.valueOf(awS129S0201000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS129S0201000_2 awS129S0201000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: mergeMixData: replace section id=");
        sbLIZ.append(((C1397705dX) awS129S0201000_2.l0).LIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(awS129S0201000_2.i2);
        sbLIZ.append(", old section items.size=");
        sbLIZ.append(((C1397505dV) awS129S0201000_2.l1).LIZ.get(awS129S0201000_2.i2).LIZLLL.size());
        sbLIZ.append(", new section items.size=");
        sbLIZ.append(((C1397705dX) awS129S0201000_2.l0).LIZLLL.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS129S0201000_2 awS129S0201000_2) {
        if (((InterfaceC20236714Gf) awS129S0201000_2.l0).isActive() && ((AtomicBoolean) awS129S0201000_2.l1).compareAndSet(false, true)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onEnd: id=");
            sbLIZ.append(awS129S0201000_2.i2);
            sbLIZ.append(" resumed");
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS129S0201000_2.l0;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS129S0201000_2 awS129S0201000_2) {
        boolean z;
        Boolean boolValueOf = Boolean.valueOf(((Boolean) ((C1378505aR) awS129S0201000_2.l0).LIZJ.getValue()).booleanValue());
        if (((AbstractC1690640u62) awS129S0201000_2.l1).LJIIIZ() == awS129S0201000_2.i2) {
            z = true;
        } else {
            z = false;
        }
        return new Pair(boolValueOf, Boolean.valueOf(z));
    }

    public static final Object invoke$9(AwS129S0201000_2 awS129S0201000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartTypeByOrder: found target position (filter/sort or GS), order=");
        sbLIZ.append(((C118300cf) awS129S0201000_2.l0).element);
        sbLIZ.append(", sectionType=");
        sbLIZ.append(((C1397705dX) awS129S0201000_2.l1).LIZIZ);
        sbLIZ.append(", startType=");
        sbLIZ.append(awS129S0201000_2.i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS129S0201000_2(int i, int i2, C1161040gJq c1161040gJq, RavenFragment<Object> ravenFragment) {
        super(0);
        this.$t = ravenFragment;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = c1161040gJq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0201000_2(int i, RavenFragment ravenFragment, List list, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = list;
        this.l1 = ravenFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS129S0201000_2(int i, int i2, Throwable th, RavenFragment<Object> ravenFragment) {
        super(0);
        this.$t = ravenFragment;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0201000_2(C118300cf c118300cf, C1397705dX c1397705dX, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c118300cf;
        this.l1 = c1397705dX;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0201000_2(C1378505aR c1378505aR, AbstractC1690640u62 abstractC1690640u62, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1378505aR;
        this.l1 = abstractC1690640u62;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0201000_2(C1397705dX c1397705dX, int i, C1397505dV c1397505dV, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1397705dX;
        this.i2 = i;
        this.l1 = c1397505dV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0201000_2(C2252611DEt c2252611DEt, AtomicBoolean atomicBoolean, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c2252611DEt;
        this.l1 = atomicBoolean;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS129S0201000_2(Integer num, Integer num2, RavenFragment<Object> ravenFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = num;
        this.l1 = num2;
        this.i2 = ravenFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0201000_2(List list, int i, AwS93S1200000_8 awS93S1200000_8, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = list;
        this.i2 = i;
        this.l1 = awS93S1200000_8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0201000_2(Object[] objArr, AwS93S1200000_8 awS93S1200000_8, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = objArr;
        this.l1 = awS93S1200000_8;
        this.i2 = i;
    }
}
