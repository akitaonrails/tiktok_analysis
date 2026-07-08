package com.ss.android.ugc.aweme.services;

import X.C0VSJ;
import X.C0WZX;
import X.C1389890mGx;
import X.C1701330uNH;
import X.C2204961BRm;
import X.C2217421BqW;
import X.C2429209fW;
import X.C2430609fk;
import X.C2431009fo;
import X.C786410Ut5;
import X.InterfaceC1685420txc;
import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ProfileDependentComponentImpl$startCameraActivity$1 extends C2217421BqW implements InterfaceC1685420txc<Activity, Fragment, Integer, String, String, Unit> {
    public static final ProfileDependentComponentImpl$startCameraActivity$1 INSTANCE = new ProfileDependentComponentImpl$startCameraActivity$1();

    public ProfileDependentComponentImpl$startCameraActivity$1() {
        super(5, C2430609fk.class, "startCameraActivity", "startCameraActivity(Landroid/app/Activity;Landroidx/fragment/app/Fragment;ILjava/lang/String;Ljava/lang/String;)V", 1);
    }

    public final void invoke(Activity activity, Fragment fragment, int i, String str, String str2) throws Throwable {
        if (!Intrinsics.LJFF("mounted", C786410Ut5.X3())) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJFF(2130970439);
            c1389890mGx.LJIIIZ(2131839844);
            c1389890mGx.LJIIJJI();
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, str2);
        intent.addFlags(1);
        intent.putExtra("output", C2431009fo.LIZIZ(activity, c0vsj2));
        C2429209fW.LIZ().appendDataFlowId(intent, 1207965441);
        try {
            if (fragment != null) {
                C1701330uNH.LIZ(intent, fragment);
                C2204961BRm.LLJL(fragment, intent, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhFx8cXbVd+TEvKaoA==", null));
            } else {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
                C1701330uNH.LIZ(intent, activity);
                C2204961BRm.LJIIZILJ(i, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhFx8cXbVd+TEvKaoA==", null));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
            c1389890mGx2.LJFF(2130970439);
            c1389890mGx2.LJIIIZ(2131839841);
            c1389890mGx2.LJIIJJI();
        }
    }

    @Override // X.InterfaceC1685420txc
    public /* bridge */ /* synthetic */ Unit invoke(Activity activity, Fragment fragment, Integer num, String str, String str2) throws Throwable {
        invoke(activity, fragment, num.intValue(), str, str2);
        return Unit.LIZ;
    }
}
