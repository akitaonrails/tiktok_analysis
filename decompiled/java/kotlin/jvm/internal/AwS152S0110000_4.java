package kotlin.jvm.internal;

import X.C09AY;
import X.EnumC346100DhY;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListFragment;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public class AwS152S0110000_4 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S0110000_4(boolean z, SchoolUsersListFragment schoolUsersListFragment, int i) {
        super(2);
        this.$t = i;
        this.z1 = z;
        this.l0 = schoolUsersListFragment;
    }

    public static final Object invoke$0(AwS152S0110000_4 awS152S0110000_4, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        if (zBooleanValue != awS152S0110000_4.z1 && (zBooleanValue || zBooleanValue2)) {
            ContainerAbility containerAbilityRR = ((SchoolUsersListFragment) awS152S0110000_4.l0).RR();
            if (containerAbilityRR != null) {
                containerAbilityRR.BS1(EnumC346100DhY.CLICK_CONNECTION, null, zBooleanValue, null);
            }
            SchoolUsersListViewModel schoolUsersListViewModelAS = ((SchoolUsersListFragment) awS152S0110000_4.l0).aS();
            schoolUsersListViewModelAS.withState(new AwS92S0110000_4(zBooleanValue, schoolUsersListViewModelAS, 1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS152S0110000_4 awS152S0110000_4, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        if (zBooleanValue != awS152S0110000_4.z1 && (zBooleanValue || zBooleanValue2)) {
            ContainerAbility containerAbilityRR = ((SchoolUsersListFragment) awS152S0110000_4.l0).RR();
            if (containerAbilityRR != null) {
                containerAbilityRR.BS1(EnumC346100DhY.CLICK_POPULAR, null, zBooleanValue, null);
            }
            SchoolUsersListViewModel schoolUsersListViewModelAS = ((SchoolUsersListFragment) awS152S0110000_4.l0).aS();
            schoolUsersListViewModelAS.withState(new AwS92S0110000_4(zBooleanValue, schoolUsersListViewModelAS, 2));
        }
        return Unit.LIZ;
    }
}
