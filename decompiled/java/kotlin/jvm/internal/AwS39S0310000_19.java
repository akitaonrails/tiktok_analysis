package kotlin.jvm.internal;

import X.C09AY;
import X.C0ZHF;
import X.C1218000hni;
import X.C1218060hno;
import X.C1229580i6O;
import X.C1229630i6T;
import X.C1229840i6o;
import X.C1242590iRN;
import X.C1242610iRP;
import X.C1397630mTR;
import X.C13BV;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS39S0310000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS39S0310000_19 awS39S0310000_19, Object obj) {
        int i;
        int i2;
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LJFF = true;
        C1242610iRP c1242610iRP = (C1242610iRP) ((C1242590iRN) awS39S0310000_19.l0).LJIIIZ.getValue();
        User user = (User) awS39S0310000_19.l1;
        boolean z = awS39S0310000_19.z3;
        c1242610iRP.getClass();
        if (user.getFollowerStatus() == 1) {
            if (z) {
                i = c1242610iRP.LJFF;
            } else {
                i = c1242610iRP.LJI;
            }
        } else if (z) {
            i = c1242610iRP.LIZLLL;
        } else {
            i = c1242610iRP.LJ;
        }
        c1397630mTR.LJ(i, new AwS385S0200000_19((C1242590iRN) awS39S0310000_19.l0, (Aweme) awS39S0310000_19.l2, 5));
        Object value = ((C1242590iRN) awS39S0310000_19.l0).LJIIIZ.getValue();
        boolean z2 = awS39S0310000_19.z3;
        value.getClass();
        if (z2 && C0ZHF.LIZ()) {
            i2 = 2131835445;
        } else {
            i2 = 2131836228;
        }
        c1397630mTR.LJI(i2, new AwS385S0200000_19((C1242590iRN) awS39S0310000_19.l0, (Aweme) awS39S0310000_19.l2, 6));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS39S0310000_19 awS39S0310000_19, Object obj) {
        return C1218060hno.LIZ((C1218060hno) obj, ((AuditRequestListViewModel) awS39S0310000_19.l0).CQ2((List) awS39S0310000_19.l1), null, 0, awS39S0310000_19.z3, (List) awS39S0310000_19.l2, null, null, 102);
    }

    public static final Object invoke$2(AwS39S0310000_19 awS39S0310000_19, Object obj) {
        return C1218060hno.LIZ((C1218060hno) obj, ((AuditRequestListViewModel) awS39S0310000_19.l0).CQ2((List) awS39S0310000_19.l1), null, ((List) awS39S0310000_19.l1).size(), awS39S0310000_19.z3, (List) awS39S0310000_19.l2, null, null, 98);
    }

    public static final Object invoke$3(AwS39S0310000_19 awS39S0310000_19, Object obj) {
        boolean zBooleanValue;
        C1229630i6T c1229630i6T = (C1229630i6T) obj;
        C1229580i6O c1229580i6OLIZ = C1229580i6O.LIZ(((C1229630i6T) awS39S0310000_19.l0).LL, (List) awS39S0310000_19.l1, 4);
        C1229840i6o c1229840i6o = ((C1229630i6T) awS39S0310000_19.l0).LLILLJJLI;
        C13BV c13bv = C13BV.INSTANCE;
        c1229840i6o.getClass();
        C1229840i6o c1229840i6o2 = new C1229840i6o(c13bv, false, false);
        Boolean bool = (Boolean) awS39S0310000_19.l2;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = c1229630i6T.LLILLL;
        }
        return C1229630i6T.LIZ(c1229630i6T, c1229580i6OLIZ, c1229840i6o2, zBooleanValue, null, false, awS39S0310000_19.z3, null, 72);
    }

    public static final Object invoke$4(AwS39S0310000_19 awS39S0310000_19, Object obj) {
        return C1218060hno.LIZ((C1218060hno) obj, ((AuditRequestListViewModel) awS39S0310000_19.l0).CQ2((List) awS39S0310000_19.l1), null, 0, awS39S0310000_19.z3, (List) awS39S0310000_19.l2, null, null, 102);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS39S0310000_19(C1229630i6T c1229630i6T, C1229630i6T c1229630i6T2, List<? extends InterfaceC1891350zJl> list, Boolean bool, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = c1229630i6T;
        this.l1 = c1229630i6T2;
        this.l2 = list;
        this.z3 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0310000_19(C1242590iRN c1242590iRN, User user, boolean z, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1242590iRN;
        this.l1 = user;
        this.z3 = z;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS39S0310000_19(AuditRequestListViewModel auditRequestListViewModel, AuditRequestListViewModel auditRequestListViewModel2, List<C1218000hni> list, boolean z, List<Long> list2) {
        super(1);
        this.$t = list2;
        this.l0 = auditRequestListViewModel;
        this.l1 = auditRequestListViewModel2;
        this.z3 = list;
        this.l2 = z;
    }
}
