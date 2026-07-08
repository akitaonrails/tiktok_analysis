package com.ss.android.ugc.aweme.services.autologin;

import X.C0XW9;
import X.C0XXB;
import X.C1954807lC;
import X.C20684815ws;
import X.C2344009Gk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public final class AutoLoginET {
    public static final int $stable = 0;
    public static final AutoLoginET INSTANCE = new AutoLoginET();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginMethodName.values().length];
            try {
                iArr[LoginMethodName.USER_NAME_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[LoginMethodName.EMAIL_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[LoginMethodName.PHONE_NUMBER_PASS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[LoginMethodName.PHONE_SMS.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                iArr[LoginMethodName.THIRD_PARTY.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                iArr[LoginMethodName.PASSKEY.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                iArr[LoginMethodName.DEFAULT.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                iArr[LoginMethodName.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String getAutoLoginPlatform(LoginMethodName loginMethodName) {
        switch (WhenMappings.$EnumSwitchMapping$0[loginMethodName.ordinal()]) {
            case 1:
                return "username";
            case 2:
                return "email";
            case 3:
            case 4:
                return "phone";
            case 5:
                return "third_party";
            case 6:
                return "passkey";
            case 7:
                return "default";
            case 8:
                return "unknown";
            default:
                throw new C1954807lC();
        }
    }

    public final void totalTimeET(long j, long j2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "load_time");
        c2344009Gk.LIZLLL(j2, "boot_to_success_time");
        C20684815ws.LJIILLIIL("auto_login_total_time", c2344009Gk.LIZ);
    }

    public final void checkEligibilityET(C0XW9 c0xw9, boolean z, C0XXB c0xxb) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("app_type", c0xw9.toString().toLowerCase(Locale.ROOT));
        c2344009Gk.LJ(Boolean.valueOf(z), "backup_eligibility");
        c2344009Gk.LIZJ(c0xxb.getValue(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("auto_login_check_eligibility", c2344009Gk.LIZ);
    }
}
