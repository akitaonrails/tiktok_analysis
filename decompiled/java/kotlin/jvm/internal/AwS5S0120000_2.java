package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.C062P;
import X.C09AY;
import X.C1388190mED;
import X.C1683306iV;
import X.C1683606iY;
import X.C1683706iZ;
import X.C1689106jR;
import X.C1703106lh;
import X.C1721006oa;
import X.C1906580ziK;
import X.C869590Y9l;
import android.app.Activity;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS5S0120000_2 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S0120000_2 awS5S0120000_2, Object obj) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        if (awS5S0120000_2.z1 && ((C869590Y9l) awS5S0120000_2.l0) != null && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            IReportUtils.LIZ.getClass();
            IReportUtils iReportUtilsLIZ = C1703106lh.LIZ();
            if (iReportUtilsLIZ != null) {
                iReportUtilsLIZ.LIZ(new C1689106jR((C869590Y9l) awS5S0120000_2.l0, "dm_inline", "chat", null, 24), activityLIZ, "5", null, false);
            }
            if (awS5S0120000_2.z2) {
                C1683306iV.LIZJ();
                C1683306iV.LIZIZ(C1683706iZ.LIZJ, null, 6);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S0120000_2 awS5S0120000_2, Object obj) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        if (awS5S0120000_2.z1 && ((C869590Y9l) awS5S0120000_2.l0) != null && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            IReportUtils.LIZ.getClass();
            IReportUtils iReportUtilsLIZ = C1703106lh.LIZ();
            if (iReportUtilsLIZ != null) {
                iReportUtilsLIZ.LIZ(new C1689106jR((C869590Y9l) awS5S0120000_2.l0, "dm_inline", "chat", null, 24), activityLIZ, "5", null, false);
            }
            if (awS5S0120000_2.z2) {
                C1683306iV.LIZJ();
                C1683306iV.LIZIZ(C1683606iY.LIZJ, null, 6);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS5S0120000_2 awS5S0120000_2, Object obj) {
        ((C062P) obj).LIZ = new C1721006oa((IMUser) awS5S0120000_2.l0, awS5S0120000_2.z1, awS5S0120000_2.z2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0120000_2(C869590Y9l c869590Y9l, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c869590Y9l;
        this.z2 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0120000_2(IMUser iMUser, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = iMUser;
        this.z1 = z;
        this.z2 = z2;
    }
}
