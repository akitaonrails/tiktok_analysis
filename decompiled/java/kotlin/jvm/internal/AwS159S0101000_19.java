package kotlin.jvm.internal;

import X.C09AY;
import X.C0P0T;
import X.C1219900hqm;
import X.C1247120iYg;
import X.C1253900ijc;
import X.C1260960iv0;
import X.C1440005kM;
import X.C19719612Di;
import X.C19Y5;
import X.C21578619ce;
import X.C426770GoN;
import X.C427690Gpr;
import X.C586090Myl;
import X.C786410Ut5;
import X.EnumC1231460i9Q;
import X.EnumC1245890iWh;
import X.InterfaceC1219340hps;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.GroupCreationFormAssem;
import com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsTabFragment;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS159S0101000_19 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS159S0101000_19 awS159S0101000_19) {
        C0P0T c0p0t;
        if (awS159S0101000_19.i1 == 2) {
            C1253900ijc c1253900ijc = (C1253900ijc) awS159S0101000_19.l0;
            if (c1253900ijc != null) {
                c1253900ijc.LIZ();
            }
        } else {
            C1253900ijc c1253900ijc2 = (C1253900ijc) awS159S0101000_19.l0;
            if (c1253900ijc2 != null && (c0p0t = c1253900ijc2.LLJIJIL) != null) {
                c0p0t.dismiss();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS159S0101000_19 awS159S0101000_19) {
        C427690Gpr.LIZLLL(((AbsRecUserCell) awS159S0101000_19.l0).itemView, awS159S0101000_19.i1);
        ((AbsRecUserCell) awS159S0101000_19.l0).itemView.setBackgroundColor(awS159S0101000_19.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS159S0101000_19 awS159S0101000_19) {
        return new C1260960iv0(EnumC1231460i9Q.SCHOOL_COMMUNITY_PAGE.getParamValue(), (User) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (Boolean) null, 0, (String) null, false, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, 0, (String) null, (Boolean) null, (Map) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, 0, (String) null, (Long) null, 0, (Integer) null, (String) null, (String) null, 0, 0, (Integer) null, (Map) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, ((EnumC1245890iWh) awS159S0101000_19.l0).getParamValue(), Integer.valueOf(awS159S0101000_19.i1), (Integer) null, (String) null, (C1247120iYg) null, (Map) null, -2, -1, 15615);
    }

    public static final Object invoke$3(AwS159S0101000_19 awS159S0101000_19) {
        ((NavbarBaseUIComponent) awS159S0101000_19.l0).LLJILLL = awS159S0101000_19.i1;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS159S0101000_19 awS159S0101000_19) {
        ((NavbarBaseUIComponent) awS159S0101000_19.l0).Ip(awS159S0101000_19.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS159S0101000_19 awS159S0101000_19) {
        ((InterfaceC1219340hps) awS159S0101000_19.l0).LIZIZ(awS159S0101000_19.i1, 0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS159S0101000_19 awS159S0101000_19) {
        C19719612Di.LJJIIJ(((Aweme) awS159S0101000_19.l0).getAnchors(), new AwS30S0001000_16(awS159S0101000_19.i1, 14), true);
        C1440005kM.LIZ(new C1219900hqm());
        C1440005kM.LIZ(new C586090Myl((Aweme) awS159S0101000_19.l0));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS159S0101000_19 awS159S0101000_19) {
        int height;
        C21578619ce c21578619ceKp = ((GroupCreationFormAssem) awS159S0101000_19.l0).kp();
        if (c21578619ceKp != null) {
            int i = awS159S0101000_19.i1;
            View childAt = c21578619ceKp.getChildAt(0);
            if (childAt != null) {
                height = childAt.getHeight();
            } else {
                height = 0;
            }
            int height2 = height - c21578619ceKp.getHeight();
            if (height2 < 0) {
                height2 = 0;
            }
            int scrollY = c21578619ceKp.getScrollY();
            if (scrollY + i <= height2) {
                c21578619ceKp.smoothScrollBy(0, i);
            } else {
                int i2 = height2 - scrollY;
                if (i2 > 0) {
                    c21578619ceKp.smoothScrollBy(0, i2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS159S0101000_19 awS159S0101000_19) {
        View view;
        C426770GoN c426770GoN;
        C19Y5 c19y5LJIIIZ = ((FindFriendsTabFragment) awS159S0101000_19.l0).MR().LJIIIZ(awS159S0101000_19.i1);
        if (c19y5LJIIIZ != null && (view = c19y5LJIIIZ.LJFF) != null && (c426770GoN = (C426770GoN) view.findViewById(R.id.hym)) != null) {
            C786410Ut5.LLLLLLIL(c426770GoN, 8);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S0101000_19(int i, C1253900ijc c1253900ijc, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1253900ijc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S0101000_19(int i, AbsRecUserCell absRecUserCell, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = absRecUserCell;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S0101000_19(EnumC1245890iWh enumC1245890iWh, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = enumC1245890iWh;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S0101000_19(Aweme aweme, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = aweme;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S0101000_19(GroupCreationFormAssem groupCreationFormAssem, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = groupCreationFormAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S0101000_19(FindFriendsTabFragment findFriendsTabFragment, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = findFriendsTabFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS159S0101000_19(NavbarBaseUIComponent navbarBaseUIComponent, NavbarBaseUIComponent<T> navbarBaseUIComponent2, int i) {
        super(0);
        this.$t = i;
        this.l0 = navbarBaseUIComponent;
        this.i1 = navbarBaseUIComponent2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S0101000_19(InterfaceC1219340hps interfaceC1219340hps, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = interfaceC1219340hps;
        this.i1 = i;
    }
}
