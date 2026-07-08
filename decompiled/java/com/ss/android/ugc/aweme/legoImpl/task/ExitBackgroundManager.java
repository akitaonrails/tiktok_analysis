package com.ss.android.ugc.aweme.legoImpl.task;

import X.C04TX;
import X.C09JN;
import X.C0P13;
import X.C0XGR;
import X.C1388190mED;
import X.C1906580ziK;
import X.C19EG;
import X.C20684815ws;
import X.C299850Bp9;
import X.C680080Qly;
import X.C823050WQl;
import X.C849850XVn;
import X.InterfaceC1390750mIL;
import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.service.newusermode.INewUserModeService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public final class ExitBackgroundManager implements InterfaceC1390750mIL {
    public static boolean isActivityFinished;
    public final String eventName;
    public INewUserModeService newUserModeService;
    public static final C04TX Companion = new Object() { // from class: X.04TX
    };
    public static final int $stable = 8;

    public final int getColdLaunchCount() {
        if (this.newUserModeService == null) {
            this.newUserModeService = (INewUserModeService) ServiceManager.get().getService(INewUserModeService.class);
        }
        INewUserModeService iNewUserModeService = this.newUserModeService;
        if (iNewUserModeService != null) {
            return iNewUserModeService.LIZLLL();
        }
        return -3;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public ExitBackgroundManager(String str) {
        this.eventName = str;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("exit_background_fix", true)) {
            C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.0mIK
                @Override // X.C09JN
                public final void accept(Object obj) {
                    Activity activityLIZIZ;
                    C1C7U.LIZ("ExitBackgroundManager@d34b.disposable$1");
                    C606810Nr5 c606810Nr5 = (C606810Nr5) obj;
                    if (c606810Nr5.LIZIZ && (activityLIZIZ = c606810Nr5.LIZ.LIZIZ()) != null) {
                        this.LL.reportEvent(activityLIZIZ);
                    }
                    C1C7U.LIZIZ("ExitBackgroundManager@d34b.disposable$1");
                }
            });
        } else {
            ActivityStack.addAppBackGroundMobListener(this);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[PHI: r1
      0x0019: PHI (r1v3 X.15ms) = (r1v6 X.15ms), (r1v7 X.15ms) binds: [B:33:0x0056, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getEnterFrom(android.app.Activity r5) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImpl.task.ExitBackgroundManager.getEnterFrom(android.app.Activity):java.lang.String");
    }

    @Override // X.InterfaceC1390750mIL
    public void onAppBackground(Activity activity) {
        if (activity != null) {
            reportEvent(activity);
        }
    }

    public final void reportEvent(Context context) {
        Activity activityLIZ;
        final int i;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            final String strValueOf = String.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            final String enterFrom = getEnterFrom(activityLIZ);
            final String awemeID = getAwemeID(activityLIZ, enterFrom);
            if (isActivityFinished) {
                i = 2;
            } else {
                i = 1;
            }
            isActivityFinished = false;
            try {
                if (C0P13.LIZ() && C299850Bp9.LIZ()) {
                    C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0mIJ
                        public final void LIZ() {
                            try {
                                C0XGR c0xgr = new C0XGR();
                                c0xgr.LIZJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "enterbackground");
                                c0xgr.LIZJ("action_time", strValueOf);
                                c0xgr.LIZ(this.LL.getColdLaunchCount(), "cold_launch_count");
                                String str = enterFrom;
                                if (str != null) {
                                    c0xgr.LIZJ("enter_from", str);
                                }
                                String str2 = awemeID;
                                if (str2 != null) {
                                    c0xgr.LIZJ("group_id", str2);
                                }
                                c0xgr.LIZ(i, "action_type");
                                HashMap<String, String> mapLJIL = C849850XVn.LIZIZ.LIZJ().LJIL();
                                if (mapLJIL != null) {
                                    ((HashMap) c0xgr.LIZ).putAll(mapLJIL);
                                }
                                C20684815ws.LJIILLIIL(this.LL.getEventName(), c0xgr.LIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ExitBackgroundManager@d34b.reportEvent$$inlined$postMobEvent$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ExitBackgroundManager@d34b.reportEvent$$inlined$postMobEvent$1");
                        }
                    });
                    return;
                }
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "enterbackground");
                c0xgr.LIZJ("action_time", strValueOf);
                c0xgr.LIZ(getColdLaunchCount(), "cold_launch_count");
                if (enterFrom != null) {
                    c0xgr.LIZJ("enter_from", enterFrom);
                }
                if (awemeID != null) {
                    c0xgr.LIZJ("group_id", awemeID);
                }
                c0xgr.LIZ(i, "action_type");
                HashMap<String, String> mapLJIL = C849850XVn.LIZIZ.LIZJ().LJIL();
                if (mapLJIL != null) {
                    ((HashMap) c0xgr.LIZ).putAll(mapLJIL);
                }
                C20684815ws.LJIILLIIL(getEventName(), c0xgr.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    private final String getAwemeID(Activity activity, String str) {
        C19EG c19eg;
        HomePageDataViewModel homePageDataViewModelLIZIZ;
        Aweme aweme;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1271119582) {
                if (iHashCode != 809483594) {
                    if (iHashCode == 1691937916 && str.equals("homepage_hot")) {
                    }
                } else if (!str.equals("others_homepage")) {
                    return null;
                }
                if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (homePageDataViewModelLIZIZ = C680080Qly.LIZIZ(c19eg)) != null && (aweme = homePageDataViewModelLIZIZ.LLJILJILJ) != null) {
                    return aweme.getAid();
                }
            } else if (str.equals("homepage_follow")) {
                if (activity instanceof C19EG) {
                    return aweme.getAid();
                }
            }
        }
        return null;
    }
}
