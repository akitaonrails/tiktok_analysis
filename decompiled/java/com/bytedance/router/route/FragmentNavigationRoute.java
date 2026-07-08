package com.bytedance.router.route;

import X.C13LP;
import X.C19EH;
import X.C2188811AlT;
import X.C786410Ut5;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.fragment.FragmentNavigationContainer;
import com.bytedance.router.fragment.FragmentNavigationRouteIntent;
import com.bytedance.router.fragment.FragmentOp;
import com.bytedance.router.fragment.PopOp;
import com.bytedance.router.fragment.PushOp;
import com.bytedance.router.fragment.PushType;
import com.bytedance.router.util.Util;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes33.dex */
public final class FragmentNavigationRoute extends BaseRoute {

    /* JADX INFO: loaded from: classes31.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PushType.values().length];
            try {
                iArr[PushType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static Bundle INVOKEVIRTUAL_com_bytedance_router_route_FragmentNavigationRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final String getOriginUri(String str) {
        return (String) C13LP.LJJJLL(a0.LJJLIIIJ(str, new char[]{'-'}, false, 0, 6));
    }

    @Override // com.bytedance.router.route.IRoute
    public void open(Context context) {
        FragmentNavigationContainer fragmentNavigationContainer;
        PopOp popOp;
        FragmentNavigationRouteIntent fragmentNavigationRouteIntent = (FragmentNavigationRouteIntent) getRouteIntent();
        FragmentManager fragmentManager = fragmentNavigationRouteIntent.getFragmentManager();
        if (fragmentManager == null || (fragmentNavigationContainer = fragmentNavigationRouteIntent.getFragmentNavigationContainer()) == null) {
            return;
        }
        int fragmentContainer = fragmentNavigationContainer.getFragmentContainer();
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        c19ehLJIIJ.LJIIZILJ = true;
        if (fragmentNavigationContainer.addFragmentToBackStack() && (popOp = fragmentNavigationRouteIntent.getPopOp()) != null) {
            pop(context, fragmentNavigationRouteIntent, popOp, fragmentManager);
        }
        PushOp pushOp = fragmentNavigationRouteIntent.getPushOp();
        if (pushOp != null) {
            push(context, pushOp, fragmentManager, fragmentNavigationRouteIntent, fragmentContainer, fragmentNavigationContainer, c19ehLJIIJ);
            if (pushOp.getImmediate()) {
                c19ehLJIIJ.LJIIJJI();
            } else {
                c19ehLJIIJ.LJIIIZ();
            }
        }
    }

    private final void clearTop(FragmentManager fragmentManager, PushOp pushOp) {
        String realRouteUrl = Util.getRealRouteUrl(pushOp.getUrl());
        int iLJJLIIIIJ = fragmentManager.LJJLIIIIJ();
        if (iLJJLIIIIJ == 0) {
            return;
        }
        for (int i = iLJJLIIIIJ - 1; -1 < i; i--) {
            String name = fragmentManager.LJJLI(i).getName();
            if (name != null && Intrinsics.LJFF(realRouteUrl, getOriginUri(name))) {
                popBackStackInner(fragmentManager, pushOp, name, 1);
                return;
            }
        }
    }

    private final String createDestinationId(String str, String str2) {
        String realRouteUrl = Util.getRealRouteUrl(str);
        if (TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(realRouteUrl);
            sbLIZ.append("-tag-");
            sbLIZ.append(System.currentTimeMillis());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(realRouteUrl);
        sbLIZ2.append("-tag-");
        sbLIZ2.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    private final String createDestinationIdWithRoot(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append("-ROOT");
        return createDestinationId(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    private final boolean isTopFragment(FragmentManager fragmentManager, String str) {
        int iLJJLIIIIJ;
        if (str == null || (iLJJLIIIIJ = fragmentManager.LJJLIIIIJ()) == 0) {
            return false;
        }
        String realRouteUrl = Util.getRealRouteUrl(str);
        String name = fragmentManager.LJJLI(iLJJLIIIIJ - 1).getName();
        if (name == null || !Intrinsics.LJFF(getOriginUri(name), realRouteUrl)) {
            return false;
        }
        return true;
    }

    private final void popBackStackInner(FragmentManager fragmentManager, FragmentOp fragmentOp) {
        if (fragmentOp.getImmediate()) {
            fragmentManager.LJLLL();
        } else {
            fragmentManager.LJLLILLLL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setAnimation(com.bytedance.router.fragment.PushOp r6, X.C19EH r7) {
        /*
            r5 = this;
            int r4 = r6.getPopEnterAnim()
            int r3 = r6.getPopExitAnim()
            int r2 = r6.getEnterAnim()
            int r1 = r6.getExitAnim()
            r0 = -1
            if (r4 != r0) goto L27
            if (r3 != r0) goto L19
            if (r2 != r0) goto L19
            if (r1 == r0) goto L26
        L19:
            r4 = 0
        L1a:
            if (r3 != r0) goto L1d
            r3 = 0
        L1d:
            if (r2 != r0) goto L20
            r2 = 0
        L20:
            if (r1 != r0) goto L23
            r1 = 0
        L23:
            r7.LJIJJLI(r2, r1, r4, r3)
        L26:
            return
        L27:
            if (r4 == r0) goto L19
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.route.FragmentNavigationRoute.setAnimation(com.bytedance.router.fragment.PushOp, X.19EH):void");
    }

    private final Pair<String, Boolean> findDestinationIdInBackStack(FragmentManager fragmentManager, String str, String str2) {
        String name;
        String name2;
        String originUri;
        String tag;
        String realRouteUrl = Util.getRealRouteUrl(str);
        if (TextUtils.isEmpty(str2)) {
            boolean z = true;
            int iLJJLIIIIJ = fragmentManager.LJJLIIIIJ() - 1;
            while (true) {
                name = null;
                if (-1 < iLJJLIIIIJ) {
                    name2 = fragmentManager.LJJLI(iLJJLIIIIJ).getName();
                    if (name2 != null && Intrinsics.LJFF(getOriginUri(name2), realRouteUrl)) {
                        break;
                    }
                    iLJJLIIIIJ--;
                } else {
                    name2 = null;
                    break;
                }
            }
            boolean z2 = false;
            if (name2 == null) {
                Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI(createDestinationIdWithRoot(str, str2));
                if (fragmentLJJJJZI != null && (tag = fragmentLJJJJZI.getTag()) != null) {
                    originUri = getOriginUri(tag);
                } else {
                    originUri = null;
                }
                if (Intrinsics.LJFF(originUri, realRouteUrl)) {
                    if (fragmentManager.LJJLIIIIJ() > 0) {
                        name = fragmentManager.LJJLI(0).getName();
                    } else {
                        z = false;
                    }
                    z2 = z;
                    name2 = name;
                }
            }
            return new Pair<>(name2, Boolean.valueOf(z2));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(realRouteUrl);
        sbLIZ.append("-tag-");
        sbLIZ.append(str2);
        return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), Boolean.FALSE);
    }

    private final void pop(Context context, FragmentNavigationRouteIntent fragmentNavigationRouteIntent, PopOp popOp, FragmentManager fragmentManager) {
        String url = popOp.getUrl();
        if (url != null && !a0.LJJJIL(url)) {
            popToAppointment(context, fragmentNavigationRouteIntent, popOp, fragmentManager);
        } else {
            popTop(context, fragmentNavigationRouteIntent, popOp, fragmentManager);
        }
    }

    private final void popBackStackInner(FragmentManager fragmentManager, FragmentOp fragmentOp, String str, int i) {
        if (fragmentOp.getImmediate()) {
            fragmentManager.LJLZ(i, str);
        } else {
            fragmentManager.LJLLJ(i, str);
        }
    }

    private final void popToAppointment(Context context, FragmentNavigationRouteIntent fragmentNavigationRouteIntent, PopOp popOp, FragmentManager fragmentManager) {
        int i;
        Pair<String, Boolean> pairFindDestinationIdInBackStack = findDestinationIdInBackStack(fragmentManager, popOp.getUrl(), popOp.getTag());
        String first = pairFindDestinationIdInBackStack.getFirst();
        boolean zBooleanValue = pairFindDestinationIdInBackStack.getSecond().booleanValue();
        if (!popOp.getPopInclusive() && !zBooleanValue) {
            i = 0;
        } else {
            i = 1;
        }
        popBackStackInner(fragmentManager, popOp, first, i);
    }

    private final void popTop(Context context, FragmentNavigationRouteIntent fragmentNavigationRouteIntent, PopOp popOp, FragmentManager fragmentManager) {
        Activity activity;
        if (fragmentManager.LJJLIIIIJ() == 0 && popOp.getTryFinishActivity() && (activity = fragmentNavigationRouteIntent.getActivity(context)) != null) {
            activity.finish();
        }
        popBackStackInner(fragmentManager, popOp);
    }

    private final void replace(Fragment fragment, C19EH c19eh, int i, String str) {
        c19eh.LJIJ(i, fragment, str);
    }

    private final void addFragment(Fragment fragment, FragmentManager fragmentManager, C19EH c19eh, int i, String str, boolean z) {
        Fragment next;
        List<Fragment> listLJJLIIIJL = fragmentManager.LJJLIIIJL();
        if (z) {
            Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.isVisible()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Fragment fragment2 = next;
            if (fragment2 != null) {
                c19eh.LJIILL(fragment2);
            }
        }
        if (fragment.isAdded()) {
            c19eh.LJJIFFI(fragment);
        } else {
            c19eh.LIZJ(i, fragment, str);
        }
    }

    private final void push(Context context, PushOp pushOp, FragmentManager fragmentManager, FragmentNavigationRouteIntent fragmentNavigationRouteIntent, int i, FragmentNavigationContainer fragmentNavigationContainer, C19EH c19eh) {
        String strCreateDestinationId;
        Bundle bundle;
        String targetClass = getTargetClass(pushOp.getUrl(), false);
        try {
            Class<?> cls = Class.forName(targetClass);
            if (cls != null && Fragment.class.isAssignableFrom(cls)) {
                if (fragmentManager.LJJLIIIJL().isEmpty()) {
                    strCreateDestinationId = createDestinationIdWithRoot(pushOp.getUrl(), pushOp.getTag());
                } else {
                    strCreateDestinationId = createDestinationId(pushOp.getUrl(), pushOp.getTag());
                }
                Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI(strCreateDestinationId);
                if (fragmentLJJJJZI == null) {
                    fragmentLJJJJZI = Fragment.instantiate(context, targetClass);
                }
                Intent extra = fragmentNavigationRouteIntent.getExtra();
                if (extra == null || (bundle = INVOKEVIRTUAL_com_bytedance_router_route_FragmentNavigationRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(extra)) == null) {
                    bundle = new Bundle();
                }
                C786410Ut5.LJJJI("router_internal_fragment_navigation_url", pushOp.getUrl(), bundle);
                fragmentLJJJJZI.setArguments(bundle);
                setAnimation(pushOp, c19eh);
                Integer flag = pushOp.getFlag();
                if (flag != null && flag.intValue() == 0 && isTopFragment(fragmentManager, pushOp.getUrl())) {
                    popBackStackInner(fragmentManager, pushOp);
                } else {
                    Integer flag2 = pushOp.getFlag();
                    if (flag2 != null && flag2.intValue() == 1) {
                        clearTop(fragmentManager, pushOp);
                    }
                }
                if (WhenMappings.$EnumSwitchMapping$0[pushOp.getPushType().ordinal()] == 1) {
                    addFragment(fragmentLJJJJZI, fragmentManager, c19eh, i, strCreateDestinationId, pushOp.isHideCurrentFragment());
                } else {
                    replace(fragmentLJJJJZI, c19eh, i, strCreateDestinationId);
                }
                if (fragmentNavigationContainer.addFragmentToBackStack() && (!fragmentManager.LJJLIIIJL().isEmpty())) {
                    c19eh.LJII(strCreateDestinationId);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
