package kotlin.jvm.internal;

import X.C09AY;
import X.C0PBJ;
import X.C0PH8;
import X.C1666310tSn;
import X.C1671390taz;
import X.C1689210u3j;
import X.C341440Da2;
import X.EnumC631410Opf;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class AwS176S0101000_9 extends C09AY implements Function2 {
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
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS176S0101000_9(int i, C0PBJ c0pbj, int i2) {
        super(2);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c0pbj;
    }

    public static final Object invoke$0(AwS176S0101000_9 awS176S0101000_9, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1689210u3j.LJFF((Function0) awS176S0101000_9.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS176S0101000_9.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS176S0101000_9 awS176S0101000_9, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1671390taz.LJIIIZ((EnumC631410Opf) awS176S0101000_9.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS176S0101000_9.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS176S0101000_9 awS176S0101000_9, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666310tSn.LIZJ((InterfaceC1685750ty9) awS176S0101000_9.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS176S0101000_9.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS176S0101000_9 awS176S0101000_9, Object obj, Object obj2) {
        Aweme aweme;
        SearchMixFeed searchMixFeed = (SearchMixFeed) obj2;
        boolean z = false;
        if (((Number) obj).intValue() > awS176S0101000_9.i1 && !((C0PBJ) awS176S0101000_9.l0).LJ.contains(Integer.valueOf(searchMixFeed.retrieveIncrementalId())) && (Intrinsics.LJFF(C0PH8.LIZLLL(searchMixFeed, null, 3), Boolean.TRUE) || (searchMixFeed.isAweme() && (aweme = searchMixFeed.getAweme()) != null && !aweme.isAd()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AwS176S0101000_9 awS176S0101000_9, Object obj, Object obj2) {
        Aweme aweme;
        SearchMixFeed searchMixFeed = (SearchMixFeed) obj2;
        boolean z = false;
        if (((Number) obj).intValue() > awS176S0101000_9.i1 && !((C0PBJ) awS176S0101000_9.l0).LJ.contains(Integer.valueOf(searchMixFeed.retrieveIncrementalId())) && (Intrinsics.LJFF(C0PH8.LIZLLL(searchMixFeed, null, 3), Boolean.TRUE) || (searchMixFeed.isAweme() && (aweme = searchMixFeed.getAweme()) != null && !aweme.isAd()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS176S0101000_9(int i, Function0 function0, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = function0;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS176S0101000_9(EnumC631410Opf enumC631410Opf, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = enumC631410Opf;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS176S0101000_9(InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC1685750ty9;
        this.i1 = i;
    }
}
