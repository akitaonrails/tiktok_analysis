package kotlin.jvm.internal;

import X.C09AY;
import X.C0XGR;
import X.C109H;
import X.C1246520iXi;
import X.C1619080sEc;
import X.C1720106oR;
import X.C1904220zeW;
import X.C1904250zeZ;
import X.C1907410zjf;
import X.C191984108w;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C852680Xcg;
import X.EnumC624380OeK;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.compliance.business.policynotice.routeaction.ConfirmLogoutRouteAction;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public class AwS105S0210000_28 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
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
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS105S0210000_28 awS105S0210000_28) {
        ((C191984108w) awS105S0210000_28.l0).LIZIZ(null, ((C109H) awS105S0210000_28.l1).LLILLL, awS105S0210000_28.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS105S0210000_28 awS105S0210000_28) {
        ConfirmLogoutRouteAction confirmLogoutRouteAction = (ConfirmLogoutRouteAction) awS105S0210000_28.l0;
        boolean z = awS105S0210000_28.z2;
        confirmLogoutRouteAction.getClass();
        ConfirmLogoutRouteAction.LIZ(z);
        ((Function0) awS105S0210000_28.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS105S0210000_28 awS105S0210000_28) {
        String str;
        Function2<MusNotice, Boolean, Unit> function2 = ((C1246520iXi) awS105S0210000_28.l0).LLILZIL;
        if (function2 != null) {
            function2.invoke((MusNotice) awS105S0210000_28.l1, Boolean.valueOf(awS105S0210000_28.z2));
        }
        if (awS105S0210000_28.z2) {
            str = "subscribed";
        } else {
            str = "unsubscribed";
        }
        C1907410zjf.LIZJ((C1246520iXi) awS105S0210000_28.l0, str);
        return Boolean.TRUE;
    }

    public static final Object invoke$3(AwS105S0210000_28 awS105S0210000_28) {
        SignupViewModel signupViewModel = (SignupViewModel) ((Function0) awS105S0210000_28.l0).invoke();
        if (awS105S0210000_28.z2) {
            signupViewModel.RQ2("login");
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_from", signupViewModel.getEnterFrom());
            c0xgr.LIZLLL("enter_method", signupViewModel.getEnterMethod());
            C20684815ws.LJIILLIIL("click_login", c0xgr.LIZ);
        } else if (((Boolean) signupViewModel.LLLJ.getValue()).booleanValue() && !signupViewModel.OQ2()) {
            SmartRoute smartRouteLIZIZ = C852680Xcg.LIZIZ((Context) awS105S0210000_28.l1);
            smartRouteLIZIZ.withParam(new Bundle(signupViewModel.zQ2()));
            smartRouteLIZIZ.open();
        } else {
            C0XGR c0xgr2 = new C0XGR();
            c0xgr2.LIZLLL("enter_from", signupViewModel.getEnterFrom());
            c0xgr2.LIZLLL("enter_method", signupViewModel.getEnterMethod());
            C20684815ws.LJIILLIIL("back_to_sign_up", c0xgr2.LIZ);
            signupViewModel.RQ2("signup");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS105S0210000_28 awS105S0210000_28) {
        List<Integer> list;
        ArrayList arrayList = new ArrayList();
        int[] iArr = (int[]) awS105S0210000_28.l0;
        boolean z = awS105S0210000_28.z2;
        for (int i : iArr) {
            C1904220zeW.LL.getClass();
            NoticeInboxFilterGroups noticeInboxFilterGroups = (NoticeInboxFilterGroups) C1904220zeW.LJJIL().get(Integer.valueOf(C1904250zeZ.LIZ(i)));
            if (noticeInboxFilterGroups != null && (list = noticeInboxFilterGroups.groups) != null && !z) {
                arrayList.addAll(list);
            } else {
                arrayList.add(Integer.valueOf(i));
            }
        }
        C1619080sEc c1619080sEc = new C1619080sEc(1);
        EnumC624380OeK enumC624380OeK = (EnumC624380OeK) awS105S0210000_28.l1;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1904220zeW.LL.LJJIIZI(((Number) it2.next()).intValue(), enumC624380OeK, c1619080sEc);
        }
        c1619080sEc.post();
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearNoticeCount end ");
        sbLIZ.append(c1619080sEc);
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0210000_28(EnumC624380OeK enumC624380OeK, boolean z, int[] iArr, int i) {
        super(0);
        this.$t = i;
        this.l0 = iArr;
        this.z2 = z;
        this.l1 = enumC624380OeK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0210000_28(C1246520iXi c1246520iXi, MusNotice musNotice, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1246520iXi;
        this.l1 = musNotice;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0210000_28(C191984108w c191984108w, C109H c109h, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c191984108w;
        this.l1 = c109h;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0210000_28(Context context, boolean z, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = function0;
        this.z2 = z;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0210000_28(ConfirmLogoutRouteAction confirmLogoutRouteAction, Function0 function0, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = confirmLogoutRouteAction;
        this.z2 = z;
        this.l1 = function0;
    }
}
