package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.SchoolGroupsListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS21S1110000_19 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS21S1110000_19 awS21S1110000_19) {
        if (awS21S1110000_19.z2) {
            SchoolGroupsListViewModel schoolGroupsListViewModel = (SchoolGroupsListViewModel) awS21S1110000_19.l1;
            String str = awS21S1110000_19.s0;
            schoolGroupsListViewModel.getLogger().LIZ("SchoolGroupsListViewModel", "on dissolve group");
            schoolGroupsListViewModel.withState(new AwS133S1100000_19(schoolGroupsListViewModel, str, 17));
            schoolGroupsListViewModel.setState(new AwS33S0001000_19(-1, 7));
        } else {
            SchoolGroupsListViewModel schoolGroupsListViewModel2 = (SchoolGroupsListViewModel) awS21S1110000_19.l1;
            String str2 = awS21S1110000_19.s0;
            schoolGroupsListViewModel2.getLogger().LIZ("SchoolGroupsListViewModel", "on leave group");
            schoolGroupsListViewModel2.withState(new AwS133S1100000_19(schoolGroupsListViewModel2, str2, 18));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S1110000_19 awS21S1110000_19) {
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("run stream tabId=");
        sbLIZ.append(awS21S1110000_19.s0);
        sbLIZ.append(" isLoadmore=");
        sbLIZ.append(awS21S1110000_19.z2);
        sbLIZ.append(" awemeStruct=");
        List list = (List) awS21S1110000_19.l1;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS21S1110000_19 awS21S1110000_19) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("run stream fail tabId=");
        sbLIZ.append(awS21S1110000_19.s0);
        sbLIZ.append(" isLoadmore=");
        sbLIZ.append(awS21S1110000_19.z2);
        sbLIZ.append(" msg=");
        sbLIZ.append(((Throwable) awS21S1110000_19.l1).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS21S1110000_19 awS21S1110000_19) {
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("awemeDetail tabId=");
        sbLIZ.append(awS21S1110000_19.s0);
        sbLIZ.append(" isLoadmore=");
        sbLIZ.append(awS21S1110000_19.z2);
        sbLIZ.append(" items=");
        List list = (List) awS21S1110000_19.l1;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1110000_19(String str, Throwable th, boolean z, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.z2 = z;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS21S1110000_19(String str, String str2, boolean z, List<String> list) {
        super(0);
        this.$t = list;
        this.s0 = str;
        this.z2 = str2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1110000_19(boolean z, SchoolGroupsListViewModel schoolGroupsListViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l1 = schoolGroupsListViewModel;
        this.s0 = str;
    }
}
