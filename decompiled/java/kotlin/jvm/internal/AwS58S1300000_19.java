package kotlin.jvm.internal;

import X.C09AY;
import X.C1230910i8X;
import X.C1232140iAW;
import X.C1237870iJl;
import X.C1241040iOs;
import X.C1252550ihR;
import X.C1255030ilR;
import X.C1255650imR;
import X.C1389890mGx;
import X.C1397630mTR;
import X.C19EG;
import X.C2344809Gs;
import X.C898670ZNh;
import X.InterfaceC1231480i9S;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.fangroup.fragment.FanGroupListFragment;
import com.ss.android.ugc.aweme.fangroup.model.GroupInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.ui.IMHistorySearchFragment;
import com.ss.android.ugc.aweme.loginplatform.LoginMethodConfirmConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS58S1300000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final Object invoke$0(AwS58S1300000_19 awS58S1300000_19, Object obj) {
        ((InterfaceC1231480i9S) obj).LIZJ((Context) awS58S1300000_19.l1, awS58S1300000_19.s0, (C1230910i8X) awS58S1300000_19.l2, (Function1) awS58S1300000_19.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS58S1300000_19 awS58S1300000_19, Object obj) {
        Assembler assembler = (Assembler) obj;
        FanGroupListFragment fanGroupListFragment = (FanGroupListFragment) awS58S1300000_19.l1;
        assembler.DQ2(fanGroupListFragment, new AwS103S1200000_19((C1230910i8X) awS58S1300000_19.l2, fanGroupListFragment, awS58S1300000_19.s0, 2));
        assembler.QQ2((FanGroupListFragment) awS58S1300000_19.l1, new AwS598S0100000_19((View) awS58S1300000_19.l3, 143));
        assembler.RQ2((FanGroupListFragment) awS58S1300000_19.l1, AFwS241S0000000_10.get$arr$(87));
        assembler.RQ2((FanGroupListFragment) awS58S1300000_19.l1, AFwS241S0000000_10.get$arr$(88));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS58S1300000_19 awS58S1300000_19, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((IMHistorySearchFragment) awS58S1300000_19.l1, new AwS132S1100000_18(awS58S1300000_19.s0, (C1241040iOs) awS58S1300000_19.l2, 5));
        assembler.QQ2((IMHistorySearchFragment) awS58S1300000_19.l1, AFwS257S0000000_19.get$arr$(180));
        assembler.QQ2((IMHistorySearchFragment) awS58S1300000_19.l1, new AwS598S0100000_19((View) awS58S1300000_19.l3, 172));
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ != null && iMCrossAppFeatureDiffApiLIZIZ.LIZLLL()) {
            assembler.RQ2((IMHistorySearchFragment) awS58S1300000_19.l1, AFwS248S0000000_14.get$arr$(293));
        }
        assembler.QQ2((IMHistorySearchFragment) awS58S1300000_19.l1, AFwS257S0000000_19.get$arr$(181));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS58S1300000_19 awS58S1300000_19, Object obj) {
        if (TextUtils.isEmpty(awS58S1300000_19.s0)) {
            C1389890mGx c1389890mGx = new C1389890mGx((C19EG) awS58S1300000_19.l1);
            c1389890mGx.LJIIIZ(2131847054);
            c1389890mGx.LJIIJJI();
            C2344809Gs.LJI(new Exception("SD card is not available"));
        } else {
            HashMap map = new HashMap();
            C1252550ihR.LIZ.getClass();
            String strLIZIZ = C1252550ihR.LIZIZ((User) awS58S1300000_19.l2, "photo", "video");
            if (!TextUtils.isEmpty(strLIZIZ)) {
                map.put("btn_name", strLIZIZ);
            }
            C1232140iAW.LIZ.getClass();
            C1232140iAW.LJIIJ("shoot", "click_card", map);
            C1255650imR c1255650imR = ((C1255030ilR) awS58S1300000_19.l3).LL;
            if (c1255650imR != null) {
                c1255650imR.LJIIL(0);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS58S1300000_19 awS58S1300000_19, Object obj) {
        String str;
        String str2;
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        LoginMethodConfirmConfig loginMethodConfirmConfig = (LoginMethodConfirmConfig) awS58S1300000_19.l1;
        String str3 = "";
        if (loginMethodConfirmConfig == null || (str = loginMethodConfirmConfig.okBtnText) == null) {
            str = "";
        }
        c1397630mTR.LIZJ(0, str, new AwS103S1200000_19((Activity) awS58S1300000_19.l2, (C1237870iJl) awS58S1300000_19.l3, awS58S1300000_19.s0, 10));
        LoginMethodConfirmConfig loginMethodConfirmConfig2 = (LoginMethodConfirmConfig) awS58S1300000_19.l1;
        if (loginMethodConfirmConfig2 != null && (str2 = loginMethodConfirmConfig2.cancelBtnText) != null) {
            str3 = str2;
        }
        c1397630mTR.LIZJ(1, str3, new AwS103S1200000_19((Activity) awS58S1300000_19.l2, (C1237870iJl) awS58S1300000_19.l3, awS58S1300000_19.s0, 11));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS58S1300000_19(Context context, Context context2, String str, C1230910i8X c1230910i8X, Function1<? super GroupInfo, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l1 = context;
        this.s0 = context2;
        this.l2 = str;
        this.l3 = c1230910i8X;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS58S1300000_19(FanGroupListFragment fanGroupListFragment, C1230910i8X c1230910i8X, String str, View view, int i) {
        super(1);
        this.$t = i;
        this.l1 = fanGroupListFragment;
        this.l2 = c1230910i8X;
        this.s0 = str;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS58S1300000_19(IMHistorySearchFragment iMHistorySearchFragment, String str, C1241040iOs c1241040iOs, View view, int i) {
        super(1);
        this.$t = i;
        this.l1 = iMHistorySearchFragment;
        this.s0 = str;
        this.l2 = c1241040iOs;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS58S1300000_19(LoginMethodConfirmConfig loginMethodConfirmConfig, Activity activity, C1237870iJl c1237870iJl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = loginMethodConfirmConfig;
        this.l2 = activity;
        this.l3 = c1237870iJl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS58S1300000_19(String str, C19EG c19eg, User user, C1255030ilR c1255030ilR, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c19eg;
        this.l2 = user;
        this.l3 = c1255030ilR;
    }
}
