package kotlin.jvm.internal;

import X.C09AY;
import X.C0D5L;
import X.C0I0B;
import X.C0XWJ;
import X.C1218000hni;
import X.C1219450hq3;
import X.C1239960iN8;
import X.C1240060iNI;
import X.C1388190mED;
import X.C1397620mTQ;
import X.C1528205ya;
import X.C1529305yl;
import X.C19EG;
import X.EnumC1217990hnh;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS2S0311000_19 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
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
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S0311000_19 awS2S0311000_19, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131838758, new AwS2S0311000_19(awS2S0311000_19.i4, awS2S0311000_19.z3, (BaseLoginMethod) awS2S0311000_19.l0, (C1239960iN8) awS2S0311000_19.l1, (Context) awS2S0311000_19.l2, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S0311000_19 awS2S0311000_19, Object obj) {
        C19EG c19eg;
        if (awS2S0311000_19.i4 >= 0) {
            if (awS2S0311000_19.z3) {
                ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LIZ(((BaseLoginMethod) awS2S0311000_19.l0).getUid());
            }
            C1239960iN8 c1239960iN8 = (C1239960iN8) awS2S0311000_19.l1;
            c1239960iN8.getClass();
            String str = LoginMethodListFragment._pnsPageId;
            c1239960iN8.LL = C1240060iNI.LIZ();
            c1239960iN8.notifyDataSetChanged();
            if (((C1239960iN8) awS2S0311000_19.l1).LL.isEmpty()) {
                Activity activityLIZ = C1388190mED.LIZ((Context) awS2S0311000_19.l2);
                if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                    C0D5L.LIZIZ(c19eg);
                }
            } else {
                ((C1239960iN8) awS2S0311000_19.l1).LLILZIL.invoke();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS2S0311000_19 awS2S0311000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJ(2131835223, new AwS2S0311000_19(awS2S0311000_19.z3, (C1218000hni) awS2S0311000_19.l0, (AuditRequestListViewModel) awS2S0311000_19.l1, (Context) awS2S0311000_19.l2, awS2S0311000_19.i4, 3));
        c1397620mTQ.LJII(2131830190, new C1219450hq3((AuditRequestListViewModel) awS2S0311000_19.l1, awS2S0311000_19.z3, awS2S0311000_19.i4));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS2S0311000_19 awS2S0311000_19, Object obj) {
        String strValueOf;
        if (awS2S0311000_19.z3) {
            C1218000hni c1218000hni = (C1218000hni) awS2S0311000_19.l0;
            if (c1218000hni != null) {
                ((AuditRequestListViewModel) awS2S0311000_19.l1).wQ2((Context) awS2S0311000_19.l2, EnumC1217990hnh.DECLINE, c1218000hni);
            }
        } else {
            ((AuditRequestListViewModel) awS2S0311000_19.l1).vQ2((Context) awS2S0311000_19.l2, EnumC1217990hnh.DECLINE);
        }
        C1528205ya c1528205ya = C1528205ya.LIZJ;
        String strAQ2 = ((AuditRequestListViewModel) awS2S0311000_19.l1).AQ2();
        Pair<? extends Object, String>[] pairArr = new Pair[4];
        pairArr[0] = new Pair<>("enter_from", ((AuditRequestListViewModel) awS2S0311000_19.l1).BQ2().LL);
        pairArr[1] = new Pair<>("is_batch", C1529305yl.LIZ(Boolean.valueOf(!awS2S0311000_19.z3)));
        if (awS2S0311000_19.z3) {
            strValueOf = "1";
        } else {
            strValueOf = String.valueOf(awS2S0311000_19.i4);
        }
        pairArr[2] = new Pair<>("request_num", strValueOf);
        pairArr[3] = new Pair<>("result", "decline");
        c1528205ya.LJJIII("click_audit_decline_pop", strAQ2, pairArr, C0I0B.LJFF.LIZIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS2S0311000_19 awS2S0311000_19, Object obj) {
        AwS75S0301000_19 awS75S0301000_19;
        int iIntValue = ((Number) obj).intValue();
        LoginMethodListFragment loginMethodListFragment = (LoginMethodListFragment) awS2S0311000_19.l0;
        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) awS2S0311000_19.l1;
        int i = awS2S0311000_19.i4;
        View view = (View) awS2S0311000_19.l2;
        if (!awS2S0311000_19.z3) {
            awS75S0301000_19 = new AwS75S0301000_19(loginMethodListFragment, baseLoginMethod, i, view, 2);
        } else {
            C0XWJ c0xwj = C0XWJ.LIZ;
            Integer numValueOf = Integer.valueOf(iIntValue);
            c0xwj.getClass();
            C0XWJ.LJI(false, numValueOf);
            awS75S0301000_19 = null;
        }
        loginMethodListFragment.kS(iIntValue, baseLoginMethod, i, view, awS75S0301000_19);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS2S0311000_19 awS2S0311000_19, Object obj) {
        AwS75S0301000_19 awS75S0301000_19;
        int iIntValue = ((Number) obj).intValue();
        LoginMethodListFragment loginMethodListFragment = (LoginMethodListFragment) awS2S0311000_19.l0;
        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) awS2S0311000_19.l1;
        int i = awS2S0311000_19.i4;
        View view = (View) awS2S0311000_19.l2;
        if (!awS2S0311000_19.z3) {
            awS75S0301000_19 = new AwS75S0301000_19(loginMethodListFragment, baseLoginMethod, i, view, 3);
        } else {
            C0XWJ c0xwj = C0XWJ.LIZ;
            Integer numValueOf = Integer.valueOf(iIntValue);
            c0xwj.getClass();
            C0XWJ.LJI(false, numValueOf);
            awS75S0301000_19 = null;
        }
        loginMethodListFragment.kS(iIntValue, baseLoginMethod, i, view, awS75S0301000_19);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0311000_19(int i, boolean z, BaseLoginMethod baseLoginMethod, C1239960iN8 c1239960iN8, Context context, int i2) {
        super(1);
        this.$t = i2;
        this.i4 = i;
        this.z3 = z;
        this.l0 = baseLoginMethod;
        this.l1 = c1239960iN8;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0311000_19(LoginMethodListFragment loginMethodListFragment, BaseLoginMethod baseLoginMethod, int i, View view, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = loginMethodListFragment;
        this.l1 = baseLoginMethod;
        this.i4 = i;
        this.l2 = view;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0311000_19(boolean z, C1218000hni c1218000hni, AuditRequestListViewModel auditRequestListViewModel, Context context, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z3 = z;
        this.l0 = c1218000hni;
        this.l1 = auditRequestListViewModel;
        this.l2 = context;
        this.i4 = i;
    }
}
