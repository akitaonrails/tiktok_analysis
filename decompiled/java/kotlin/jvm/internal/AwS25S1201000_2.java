package kotlin.jvm.internal;

import X.C069A;
import X.C09AY;
import X.C0I0B;
import X.C1397505dV;
import X.C1397605dW;
import X.C1397705dX;
import X.C1671006gW;
import X.C1671906gf;
import X.C2188811AlT;
import X.EnumC1671706gd;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS25S1201000_2 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final Object invoke$0(AwS25S1201000_2 awS25S1201000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[StoreSectionReplace] check=same_section_id_replaced updateId=");
        sbLIZ.append(awS25S1201000_2.s0);
        sbLIZ.append(" action=replace sectionId=");
        sbLIZ.append(((C1397705dX) awS25S1201000_2.l1).LIZ);
        sbLIZ.append(" oldItems=");
        sbLIZ.append(C1397605dW.LIZJ(10, ((C1397505dV) awS25S1201000_2.l2).LIZ.get(awS25S1201000_2.i3).LIZLLL));
        sbLIZ.append(" newItems=");
        sbLIZ.append(C1397605dW.LIZJ(10, ((C1397705dX) awS25S1201000_2.l1).LIZLLL));
        sbLIZ.append(" oldSticky=");
        sbLIZ.append(((C1397505dV) awS25S1201000_2.l2).LIZ.get(awS25S1201000_2.i3).LJ);
        sbLIZ.append(" newSticky=");
        sbLIZ.append(((C1397705dX) awS25S1201000_2.l1).LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS25S1201000_2 awS25S1201000_2) {
        EnumC1671706gd enumC1671706gd;
        IRemindUsersViewHelper.LIZ.getClass();
        IRemindUsersViewHelper iRemindUsersViewHelperLIZ = C069A.LIZ();
        if (iRemindUsersViewHelperLIZ != null) {
            iRemindUsersViewHelperLIZ.LIZLLL(((C1671006gW) awS25S1201000_2.l1).getContext());
        }
        Function1 function1 = (Function1) awS25S1201000_2.l2;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(awS25S1201000_2.i3));
        } else {
            IRemindUsersAnalytics.LIZ.getClass();
            IRemindUsersAnalytics iRemindUsersAnalyticsLIZ = C1671906gf.LIZ();
            if (iRemindUsersAnalyticsLIZ != null) {
                int i = awS25S1201000_2.i3;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                enumC1671706gd = EnumC1671706gd.UNKNOWN;
                            } else {
                                enumC1671706gd = EnumC1671706gd.SUGGESTED_FRIENDS;
                            }
                        } else {
                            enumC1671706gd = EnumC1671706gd.NO_ONE;
                        }
                    } else {
                        enumC1671706gd = EnumC1671706gd.FRIENDS;
                    }
                } else {
                    enumC1671706gd = EnumC1671706gd.EVERYONE;
                }
                iRemindUsersAnalyticsLIZ.LJI(enumC1671706gd.getEventTrackingString(), awS25S1201000_2.s0, null, null, C0I0B.LJFF.LIZIZ());
            }
        }
        ((C1671006gW) awS25S1201000_2.l1).LIZIZ();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S1201000_2(C1671006gW c1671006gW, Function1 function1, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1671006gW;
        this.l2 = function1;
        this.i3 = 2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S1201000_2(String str, C1397705dX c1397705dX, C1397505dV c1397505dV, int i, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.l1 = c1397705dX;
        this.l2 = c1397505dV;
        this.i3 = i;
    }
}
