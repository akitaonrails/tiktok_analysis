package com.ss.android.ugc.aweme.interceptor;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1388190mED;
import X.C1701330uNH;
import X.C1976907ol;
import X.C19EG;
import X.C19EH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.FakeFragment;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes33.dex */
public final class ExploreFeedRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent == null || (url = routeIntent.getUrl()) == null) {
            return false;
        }
        return a0.LJJIIZI(url, "aweme://postdetail", false);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) throws Throwable {
        Intent intent;
        boolean z;
        Activity activityLIZ;
        if (routeIntent == null || (intent = routeIntent.getExtra()) == null) {
            intent = new Intent();
        }
        if (context == null) {
            return false;
        }
        intent.setComponent(new ComponentName(context, (Class<?>) PostModeDetailActivity.class));
        if (routeIntent != null && routeIntent.getData() != null) {
            intent.setData(routeIntent.getData());
        }
        if (routeIntent != null && routeIntent.hasRequestCode()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Activity activityLIZ2 = C1388190mED.LIZ(context);
            if (activityLIZ2 == null || activityLIZ2.isFinishing() || activityLIZ2.isDestroyed()) {
                return false;
            }
            Fragment fragment = routeIntent.getFragment();
            if (fragment != null) {
                if (routeIntent.getAnimationBundle() != null) {
                    int requestCode = routeIntent.getRequestCode();
                    Bundle animationBundle = routeIntent.getAnimationBundle();
                    C1701330uNH.LIZ(intent, fragment);
                    C2204961BRm.LLJJLIIIJLLLLLLLZ(fragment, intent, requestCode, animationBundle, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc3zcH7fJBiZ4jUgVgsix87KQe1PliE4gqh+ykc9ApR7s2jjo=", null));
                } else {
                    int requestCode2 = routeIntent.getRequestCode();
                    C1701330uNH.LIZ(intent, fragment);
                    C2204961BRm.LLJL(fragment, intent, requestCode2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc3zcH7fJBiZ4jUgVgsix87KQe1PliE4gqh+ykc9ApR7s2jjo=", null));
                }
            } else if (routeIntent.getOnActivityResultCallback() != null && (activityLIZ2 instanceof C19EG)) {
                FakeFragment fakeFragment = new FakeFragment();
                fakeFragment.setCallback(routeIntent.getOnActivityResultCallback());
                try {
                    C19EH c19ehLJIIJ = ((C19EG) activityLIZ2).getSupportFragmentManager().LJIIJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(System.currentTimeMillis());
                    sbLIZ.append("");
                    c19ehLJIIJ.LIZLLL(fakeFragment, C2188811AlT.LIZIZ(sbLIZ));
                    c19ehLJIIJ.LJIIJJI();
                    if (routeIntent.getAnimationBundle() != null) {
                        LIZ(fakeFragment, intent, routeIntent.getRequestCode(), routeIntent.getAnimationBundle());
                    } else {
                        int requestCode3 = routeIntent.getRequestCode();
                        C1701330uNH.LIZ(intent, fakeFragment);
                        C2204961BRm.LLLLIIL(fakeFragment, intent, requestCode3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc3zcH7fJBiZ4jUgVgsix87KQe1PliE4gqh+ykc9ApR7s2jjo=", null));
                    }
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            } else if (routeIntent.getAnimationBundle() != null) {
                int requestCode4 = routeIntent.getRequestCode();
                Bundle animationBundle2 = routeIntent.getAnimationBundle();
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ2, intent, "Activity_startActivityForResult_3");
                C1701330uNH.LIZ(intent, activityLIZ2);
                C2204961BRm.LJIJ(activityLIZ2, intent, requestCode4, animationBundle2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc3zcH7fJBiZ4jUgVgsix87KQe1PliE4gqh+ykc9ApR7s2jjo=", null));
            } else {
                int requestCode5 = routeIntent.getRequestCode();
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ2, intent, "Activity_startActivityForResult_2");
                C1701330uNH.LIZ(intent, activityLIZ2);
                C2204961BRm.LJIIZILJ(requestCode5, activityLIZ2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc3zcH7fJBiZ4jUgVgsix87KQe1PliE4gqh+ykc9ApR7s2jjo=", null));
            }
        } else if (routeIntent != null && routeIntent.getAnimationBundle() != null) {
            Bundle animationBundle3 = routeIntent.getAnimationBundle();
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_2");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJ(context, intent, animationBundle3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc3zcH7fJBiZ4jUgVgsix87KQe1PliE4gqh+ykc9ApR7s2jjo=", null));
        } else {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc3zcH7fJBiZ4jUgVgsix87KQe1PliE4gqh+ykc9ApR7s2jjo=", null));
            if (routeIntent != null) {
            }
            return true;
        }
        if (Integer.valueOf(routeIntent.getEnterAnim()) != null && ((routeIntent.getEnterAnim() != -1 || routeIntent.getExitAnim() != -1) && (activityLIZ = C1388190mED.LIZ(context)) != null)) {
            C786410Ut5.ae(routeIntent.getEnterAnim(), activityLIZ, routeIntent.getExitAnim());
        }
        return true;
    }

    public static void LIZ(FakeFragment fakeFragment, Intent intent, int i, Bundle bundle) throws Throwable {
        Bundle bundle2;
        Fragment fragment;
        int iIntValue = i;
        Intent intent2 = intent;
        C1701330uNH.LIZ(intent2, fakeFragment);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc3zcH7fJBiZ4jUgVgsix87KQe1PliE4gqh+ykc9ApR7s2jjo=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2, Integer.valueOf(iIntValue), bundle};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;ILandroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/bytedance/router/FakeFragment", "startActivityForResult", fakeFragment, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11087, "com/bytedance/router/FakeFragment", "startActivityForResult", null, objArr, fakeFragment, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (Fragment) obj;
            } else {
                fragment = fakeFragment;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
            Object obj4 = c0wsuLIZIZ.LIZJ[3];
            if (obj4 != null) {
                bundle2 = (Bundle) obj4;
            } else {
                bundle2 = bundle;
            }
        } else {
            bundle2 = bundle;
            fragment = fakeFragment;
        }
        fragment.startActivityForResult(intent2, iIntValue, bundle2);
        c0wst.LIZ(11087, "com/bytedance/router/FakeFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
    }
}
