package kotlin.jvm.internal;

import X.C09AY;
import X.C15SM;
import X.C15SN;
import X.C1623706Xj;
import X.C20359714lX;
import X.C20610415ks;
import X.C20611915l7;
import X.C20612215lA;
import X.C291001Au;
import X.C627260Oiy;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedComponent;
import com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS23S0111000_31 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS23S0111000_31 awS23S0111000_31, Object obj) {
        return C20612215lA.LIZ((C20612215lA) obj, false, new C291001Au(new C20610415ks(((C20611915l7) awS23S0111000_31.l0).LIZ, awS23S0111000_31.i2, awS23S0111000_31.z1, false, 16)), null, 0, null, false, 61);
    }

    public static final Object invoke$1(AwS23S0111000_31 awS23S0111000_31, Object obj) {
        C15SM c15sm = (C15SM) obj;
        if (awS23S0111000_31.i2 > 0 && !awS23S0111000_31.z1) {
            c15sm.getClass();
            if (!(C627260Oiy.LIZLLL(c15sm) instanceof C1623706Xj) && !(C627260Oiy.LIZJ(c15sm) instanceof C1623706Xj)) {
                ((ExploreFeedComponent) awS23S0111000_31.l0).ip().GQ2(true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS23S0111000_31 awS23S0111000_31, Object obj) {
        ((C20359714lX) awS23S0111000_31.l0).LJIIJJI(awS23S0111000_31.i2, "noTask", awS23S0111000_31.z1, true);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS23S0111000_31 awS23S0111000_31, Object obj) {
        C15SN c15sn = (C15SN) obj;
        if (awS23S0111000_31.i2 > 0 && !awS23S0111000_31.z1) {
            c15sn.getClass();
            if (!(C627260Oiy.LIZLLL(c15sn) instanceof C1623706Xj) && !(C627260Oiy.LIZJ(c15sn) instanceof C1623706Xj) && ((ExploreTopicGeneralFeedListComponent) awS23S0111000_31.l0).ip().LLJLIL != 0) {
                ((ExploreTopicGeneralFeedListComponent) awS23S0111000_31.l0).ip().MQ2(true);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0111000_31(int i, boolean z, ExploreFeedComponent exploreFeedComponent, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.z1 = z;
        this.l0 = exploreFeedComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0111000_31(int i, boolean z, ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.z1 = z;
        this.l0 = exploreTopicGeneralFeedListComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0111000_31(C20359714lX c20359714lX, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c20359714lX;
        this.i2 = i;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0111000_31(C20611915l7 c20611915l7, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c20611915l7;
        this.i2 = i;
        this.z1 = z;
    }
}
