package com.ss.android.ugc.aweme.compliance.protection.routeraction;

import X.AbstractC1387200mCc;
import X.C018G;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1548820qPI;
import X.C1906580ziK;
import X.C19EG;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.SleepHourManagerDialog;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class SleepHourManagerDialogRouterAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        FragmentManager supportFragmentManager;
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            String strLIZIZ = C018G.LIZIZ(str, "type");
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            SleepHourManagerDialog sleepHourManagerDialog = new SleepHourManagerDialog();
            sleepHourManagerDialog.LLJ = strLIZIZ;
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = sleepHourManagerDialog;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLLL = false;
            tuxSheet.LLJLILLLLZIIL = false;
            sleepHourManagerDialog.LLIZ = tuxSheet;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(activityLIZ);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                TuxSheet tuxSheet2 = sleepHourManagerDialog.LLIZ;
                if (tuxSheet2 != null) {
                    tuxSheet2.show(supportFragmentManager, "SleepHourManagerDialogSheet");
                }
                if (!sleepHourManagerDialog.LLIZLLLIL) {
                    sleepHourManagerDialog.LLIZLLLIL = true;
                    C1548820qPI.LIZLLL("sleep_hour_setting_popup", sleepHourManagerDialog);
                }
            }
        }
        return Unit.LIZ;
    }
}
