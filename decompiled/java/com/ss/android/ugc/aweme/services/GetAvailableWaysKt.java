package com.ss.android.ugc.aweme.services;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0XGR;
import X.C0XUE;
import X.C13LP;
import X.C13LQ;
import X.C1533950q1J;
import X.C155000ia;
import X.C1697810uHb;
import X.C1720106oR;
import X.C19EG;
import X.C1C7U;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C293990Bfh;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC497601wk;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysUserData;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS103S1000000_19;
import kotlin.jvm.internal.AwS137S0110000_19;
import kotlin.jvm.internal.AwS168S1100000_19;
import kotlin.jvm.internal.AwS59S2100000_19;
import kotlin.text.u;
import njp.a;

/* JADX INFO: loaded from: classes20.dex */
public final class GetAvailableWaysKt {

    /* JADX INFO: loaded from: classes14.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginMethodName.values().length];
            try {
                iArr[LoginMethodName.EMAIL_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.GetAvailableWaysKt$getAvailableWaysAndLogin$1, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.aweme.services.GetAvailableWaysKt$getAvailableWaysAndLogin$1", f = "GetAvailableWays.kt", l = {53, 58}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ Bundle $bundle;
        public final /* synthetic */ InterfaceC1631630sYr<String, String, LoginMethodName, AvailableWaysUserData, Unit> $emailLoginAction;
        public final /* synthetic */ BaseLoginMethod $loginMethod;
        public final /* synthetic */ InterfaceC1631620sYq<String, String, LoginMethodName, Unit> $phoneLoginAction;
        public final /* synthetic */ Function1<String, Unit> $thirdPlatformLoginAction;
        public final /* synthetic */ Function1<UiRefreshEventType, Unit> $uiRefreshAction;
        public final /* synthetic */ Function2<String, String, Unit> $userNameLoginAction;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(BaseLoginMethod baseLoginMethod, Function1<? super UiRefreshEventType, Unit> function1, Bundle bundle, InterfaceC1631620sYq<? super String, ? super String, ? super LoginMethodName, Unit> interfaceC1631620sYq, InterfaceC1631630sYr<? super String, ? super String, ? super LoginMethodName, ? super AvailableWaysUserData, Unit> interfaceC1631630sYr, Function2<? super String, ? super String, Unit> function2, Function1<? super String, Unit> function12, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$loginMethod = baseLoginMethod;
            this.$uiRefreshAction = function1;
            this.$bundle = bundle;
            this.$phoneLoginAction = interfaceC1631620sYq;
            this.$emailLoginAction = interfaceC1631630sYr;
            this.$userNameLoginAction = function2;
            this.$thirdPlatformLoginAction = function12;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new AnonymousClass1(this.$loginMethod, this.$uiRefreshAction, this.$bundle, this.$phoneLoginAction, this.$emailLoginAction, this.$userNameLoginAction, this.$thirdPlatformLoginAction, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            String str;
            AvailableWaysResponse availableWaysResponse;
            int iIntValue;
            Integer num;
            Object objLIZLLL = obj;
            C1C7U.LIZ("GetAvailableWaysKt@fb83.getAvailableWaysAndLogin$1");
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            str = (String) this.L$0;
                            C155000ia.LIZIZ(objLIZLLL);
                            availableWaysResponse = (AvailableWaysResponse) objLIZLLL;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        str = (String) this.L$0;
                        C155000ia.LIZIZ(objLIZLLL);
                        availableWaysResponse = (AvailableWaysResponse) objLIZLLL;
                    }
                } else {
                    C155000ia.LIZIZ(objLIZLLL);
                    str = "uid";
                    if (C1533950q1J.LJ(this.$loginMethod.getSuccessfulLoginToken())) {
                        str = "token";
                        TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.LIZ;
                        String uid = this.$loginMethod.getUid();
                        String successfulLoginToken = this.$loginMethod.getSuccessfulLoginToken();
                        this.L$0 = "token";
                        this.label = 1;
                        objLIZLLL = twoStepAuthApi.LIZLLL(uid, successfulLoginToken, this);
                        if (objLIZLLL == objLJFF) {
                            C1C7U.LIZIZ("GetAvailableWaysKt@fb83.getAvailableWaysAndLogin$1");
                            return objLJFF;
                        }
                        availableWaysResponse = (AvailableWaysResponse) objLIZLLL;
                    } else {
                        TwoStepAuthApi twoStepAuthApi2 = TwoStepAuthApi.LIZ;
                        String uid2 = this.$loginMethod.getUid();
                        this.L$0 = "uid";
                        this.label = 2;
                        objLIZLLL = twoStepAuthApi2.LIZLLL(uid2, null, this);
                        if (objLIZLLL == objLJFF) {
                            C1C7U.LIZIZ("GetAvailableWaysKt@fb83.getAvailableWaysAndLogin$1");
                            return objLJFF;
                        }
                        availableWaysResponse = (AvailableWaysResponse) objLIZLLL;
                    }
                }
                Function1<UiRefreshEventType, Unit> function1 = this.$uiRefreshAction;
                if (function1 != null) {
                    function1.invoke(UiRefreshEventType.HIDE_LOADING);
                }
                AvailableWaysUserData availableWaysUserData = availableWaysResponse.data;
                if (u.LJIJI("success", availableWaysResponse.message, true)) {
                    iIntValue = 0;
                } else if (availableWaysUserData == null || (num = availableWaysUserData.errorCode) == null) {
                    iIntValue = -1;
                } else {
                    iIntValue = num.intValue();
                }
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("enter_method", this.$bundle.getString("enter_method", ""));
                c0xgr.LIZLLL("enter_from", this.$bundle.getString("enter_from", ""));
                c0xgr.LIZ(iIntValue, "error_code");
                c0xgr.LIZLLL("call_method", str);
                C20684815ws.LJIILLIIL("history_login_get_availabel_ways_result", c0xgr.LIZ);
                if (u.LJIJI("success", availableWaysResponse.message, true)) {
                    if (availableWaysUserData == null) {
                        int i2 = C2187451AjH.LIZ;
                        C1720106oR.LIZ("GetAvailableWays", "data is null");
                        C0XUE.LIZ.LJIIIIZZ(this.$loginMethod.getUid(), false);
                        Function1<UiRefreshEventType, Unit> function12 = this.$uiRefreshAction;
                        if (function12 != null) {
                            function12.invoke(UiRefreshEventType.REFRESH_LIST);
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("GetAvailableWaysKt@fb83.getAvailableWaysAndLogin$1");
                        return unit;
                    }
                    GetAvailableWaysKt.handleLoginStrategy(availableWaysUserData, this.$loginMethod, this.$phoneLoginAction, this.$emailLoginAction, this.$userNameLoginAction, this.$thirdPlatformLoginAction, this.$uiRefreshAction);
                } else {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("failed, message: ");
                    sbLIZ.append(availableWaysResponse.message);
                    C1720106oR.LIZ("GetAvailableWays", C2188811AlT.LIZIZ(sbLIZ));
                    GetAvailableWaysKt.fallback(this.$loginMethod, this.$phoneLoginAction, this.$emailLoginAction);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("catch, message: ");
                sbLIZ2.append(e.getMessage());
                C1720106oR.LIZ("GetAvailableWays", C2188811AlT.LIZIZ(sbLIZ2));
                Function1<UiRefreshEventType, Unit> function13 = this.$uiRefreshAction;
                if (function13 != null) {
                    function13.invoke(UiRefreshEventType.HIDE_LOADING);
                }
                GetAvailableWaysKt.fallback(this.$loginMethod, this.$phoneLoginAction, this.$emailLoginAction);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GetAvailableWaysKt@fb83.getAvailableWaysAndLogin$1");
            return unit2;
        }
    }

    public static final boolean handleLoginStrategy$runByNameFirstOrFallback(List<Strategy> list, LoginMethodName loginMethodName) {
        Strategy strategy;
        Strategy next;
        Iterator<Strategy> it2 = list.iterator();
        while (true) {
            strategy = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.name == loginMethodName) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Strategy strategy2 = next;
        if (strategy2 != null && strategy2.can.invoke().booleanValue()) {
            strategy2.run.invoke();
            return true;
        }
        Iterator<Strategy> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Strategy next2 = it3.next();
            if (next2.can.invoke().booleanValue()) {
                strategy = next2;
                break;
            }
        }
        Strategy strategy3 = strategy;
        if (strategy3 == null) {
            return false;
        }
        strategy3.run.invoke();
        return true;
    }

    public final class Strategy {
        public final Function0<Boolean> can;
        public final LoginMethodName name;
        public final Function0<Unit> run;

        public Strategy(LoginMethodName loginMethodName, Function0<Boolean> function0, Function0<Unit> function02) {
            this.name = loginMethodName;
            this.can = function0;
            this.run = function02;
        }
    }

    public static final void fallback(BaseLoginMethod baseLoginMethod, InterfaceC1631620sYq<? super String, ? super String, ? super LoginMethodName, Unit> interfaceC1631620sYq, InterfaceC1631630sYr<? super String, ? super String, ? super LoginMethodName, ? super AvailableWaysUserData, Unit> interfaceC1631630sYr) {
        int i;
        LoginMethodName loginMethodName;
        if (baseLoginMethod != null && (loginMethodName = baseLoginMethod.getLoginMethodName()) != null) {
            i = WhenMappings.$EnumSwitchMapping$0[loginMethodName.ordinal()];
        } else {
            i = -1;
        }
        if (i == 1) {
            interfaceC1631630sYr.invoke("", "", LoginMethodName.EMAIL_PASS, null);
        } else {
            interfaceC1631620sYq.invoke("", "", LoginMethodName.PHONE_SMS);
        }
    }

    public static final void handleLoginStrategy(AvailableWaysUserData availableWaysUserData, BaseLoginMethod baseLoginMethod, InterfaceC1631620sYq<? super String, ? super String, ? super LoginMethodName, Unit> interfaceC1631620sYq, InterfaceC1631630sYr<? super String, ? super String, ? super LoginMethodName, ? super AvailableWaysUserData, Unit> interfaceC1631630sYr, Function2<? super String, ? super String, Unit> function2, Function1<? super String, Unit> function1, Function1<? super UiRefreshEventType, Unit> function12) {
        boolean z;
        String str = availableWaysUserData.passportTicket;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = availableWaysUserData.mobile;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = availableWaysUserData.email;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = availableWaysUserData.userName;
        if (str5 != null) {
            str2 = str5;
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str6 = null;
        if (C293990Bfh.LIZ()) {
            List<String> list = availableWaysUserData.platforms;
            if (list != null) {
                str6 = (String) C13LP.LJJJLL(list);
            }
        } else {
            Set setLJLIIL = C13LQ.LJLIIL(new String[]{"google", "facebook"});
            List<String> list2 = availableWaysUserData.platforms;
            if (list2 != null) {
                Iterator<String> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next = it2.next();
                    if (setLJLIIL.contains(next)) {
                        str6 = next;
                        break;
                    }
                }
                str6 = str6;
            }
        }
        if (!handleLoginStrategy$runByNameFirstOrFallback(C1697810uHb.LJIIJJI(new Strategy(LoginMethodName.PHONE_NUMBER_PASS, new AwS137S0110000_19(z, availableWaysUserData, 1), new AwS59S2100000_19((InterfaceC1631620sYq) interfaceC1631620sYq, (InterfaceC1631620sYq<? super String, ? super String, ? super LoginMethodName, Unit>) str, str3, (String) 0)), new Strategy(LoginMethodName.PHONE_SMS, new AwS137S0110000_19(z, availableWaysUserData, 2), new AwS59S2100000_19((InterfaceC1631620sYq) interfaceC1631620sYq, (InterfaceC1631620sYq<? super String, ? super String, ? super LoginMethodName, Unit>) str, str3, (String) 1)), new Strategy(LoginMethodName.EMAIL_PASS, new AwS137S0110000_19(z, availableWaysUserData, 3), new GetAvailableWaysKt$handleLoginStrategy$strategies$6(interfaceC1631630sYr, str, str4, availableWaysUserData)), new Strategy(LoginMethodName.USER_NAME_PASS, new AwS168S1100000_19(availableWaysUserData, str2, 4), new AwS59S2100000_19((Function2) function2, (Function2<? super String, ? super String, Unit>) str, str2, (String) 2)), new Strategy(LoginMethodName.THIRD_PARTY, new AwS103S1000000_19(str6, 1), new AwS168S1100000_19(str6, (String) function1, (Function1<? super String, Unit>) 3))), baseLoginMethod.getLoginMethodName())) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("GetAvailableWays", "no available way remove and refresh");
            C0XUE.LIZ.LJIIIIZZ(baseLoginMethod.getUid(), false);
            if (function12 != null) {
                function12.invoke(UiRefreshEventType.REFRESH_LIST);
            }
        }
    }

    public static final void getAvailableWaysAndLogin(C19EG c19eg, Bundle bundle, BaseLoginMethod baseLoginMethod, InterfaceC1631620sYq<? super String, ? super String, ? super LoginMethodName, Unit> interfaceC1631620sYq, InterfaceC1631630sYr<? super String, ? super String, ? super LoginMethodName, ? super AvailableWaysUserData, Unit> interfaceC1631630sYr, Function2<? super String, ? super String, Unit> function2, Function1<? super String, Unit> function1, Function1<? super UiRefreshEventType, Unit> function12) {
        if (function12 != null) {
            function12.invoke(UiRefreshEventType.SHOW_LOADING);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg), null, null, new AnonymousClass1(baseLoginMethod, function12, bundle, interfaceC1631620sYq, interfaceC1631630sYr, function2, function1, null), 3);
    }
}
