package com.ss.android.ugc.aweme.share.systemshare;

import X.C0WZX;
import X.C1AF0;
import X.C20684815ws;
import X.C2093608Ic;
import X.C2188191AkT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2344009Gk;
import X.C2408409cA;
import X.C621180OYa;
import X.C651920Phe;
import X.C786410Ut5;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class SystemShareTargetChosenReceiver extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        String stringExtra;
        String string;
        if (intent != null && context != null) {
            try {
                ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                if (componentName == null) {
                    return;
                }
                try {
                    stringExtra = intent.getStringExtra("extra_type");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                if (!C2093608Ic.LJ(stringExtra)) {
                    string = LIZIZ(context, componentName, stringExtra);
                } else {
                    string = null;
                }
                if (C2093608Ic.LJ(string)) {
                    string = "";
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        ApplicationInfo applicationInfoV3 = C786410Ut5.V3(packageManager, C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkiGIlSeOEj2imsE0UKDxaYBzTt1p5UfpvxkuZ/UrCTzxCo6FGFcitdwOE5Q=", null)), 0);
                        if (applicationInfoV3 != null) {
                            string = applicationInfoV3.loadLabel(packageManager).toString();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJFF(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
                    }
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("platform", string);
                c2344009Gk.LJIIIIZZ("package_name", C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkiGIlSeOEj2imsE0UKDxaYBzTt1p5UfpvxkuZ/UrCTzxCo6FGFcitdwOE5Q=", null)));
                c2344009Gk.LJIIIIZZ("component_name", C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkiGIlSeOEj2imsE0UKDxaYBzTt1p5UfpvxkuZ/UrCTzxCo6FGFcitdwOE5Q=", null)));
                Aweme aweme = C651920Phe.LIZ;
                if (aweme != null) {
                    if (C621180OYa.LIZIZ.LJIILJJIL(aweme)) {
                        c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
                        if (aweme.getPhotoModeImageInfo() != null && aweme.getPhotoModeImageInfo().getImageList() != null) {
                            c2344009Gk.LIZJ(aweme.getPhotoModeImageInfo().getImageList().size(), "pic_cnt");
                        } else {
                            c2344009Gk.LIZJ(0, "pic_cnt");
                        }
                    }
                    ShareDependService.LIZ.getClass();
                    ShareDependServiceImpl.LJJJJI().LJJIJ(c2344009Gk, aweme);
                }
                ShareDependService.LIZ.getClass();
                ShareDependServiceImpl.LJJJJI().LJJIIZI(C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkiGIlSeOEj2imsE0UKDxaYBzTt1p5UfpvxkuZ/UrCTzxCo6FGFcitdwOE5Q=", null)));
                C20684815ws.LJIILLIIL("share_video_more_track", c2344009Gk.LIZ);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZ(context, intent);
        }
    }

    public static String LIZIZ(Context context, ComponentName componentName, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str);
            for (ResolveInfo resolveInfo : C2204961BRm.LJJJJZ(packageManager, intent, 0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkiGIlSeOEj2imsE0UKDxaYBzTt1p5UfpvxkuZ/UrCTzxCo6FGFcitdwOE5Q=", null))) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && C2093608Ic.LIZJ(activityInfo.name, C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkiGIlSeOEj2imsE0UKDxaYBzTt1p5UfpvxkuZ/UrCTzxCo6FGFcitdwOE5Q=", null))) && C2093608Ic.LIZJ(resolveInfo.activityInfo.packageName, C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkiGIlSeOEj2imsE0UKDxaYBzTt1p5UfpvxkuZ/UrCTzxCo6FGFcitdwOE5Q=", null)))) {
                    return resolveInfo.loadLabel(packageManager).toString();
                }
            }
            return "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
            return "";
        }
    }
}
