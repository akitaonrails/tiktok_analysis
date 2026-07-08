package com.bytedance.router.monitor.page;

import X.C09RD;
import X.C13LP;
import X.C19EG;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.monitor.RouteInfo;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS149S1100000_35;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.AwS85S1000000_35;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;

/* JADX INFO: loaded from: classes36.dex */
public final class PageRouterHandler {
    public static final Companion Companion = new Companion();
    public PageRouterDumper pageRouterDumper;
    public Pair<Integer, Integer> screenSizeInfo;
    public final List<ActivityRouter> activityRouters = new ArrayList();
    public final List<FragmentRouter> fragmentRouters = new ArrayList();
    public final List<ActivityOp> activityOps = new ArrayList();
    public final List<FragmentOp> fragmentOps = new ArrayList();
    public final List<RouterInfo> routerInfos = new ArrayList();
    public final AtomicLong sRouterJumpToken = new AtomicLong((System.currentTimeMillis() % ((long) 1000000)) + 1);

    public static final class Companion {
    }

    public static Bundle INVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final String activityId(Activity activity) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("a_");
        sbLIZ.append(activity.hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final String fragmentId(Fragment fragment) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("f_");
        sbLIZ.append(fragment.hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final void reportEvent(RouterJumpInfo routerJumpInfo) {
        RouterPageMonitor.IEventReport iEventReport;
        RouterPageMonitor.RouterPageConfig routerPageConfig$monitor_release = RouterPageMonitor.INSTANCE.getRouterPageConfig$monitor_release();
        if (routerPageConfig$monitor_release != null && (iEventReport = routerPageConfig$monitor_release.reporter) != null) {
            iEventReport.onEvent("nx_router_jump", toReportJson(routerJumpInfo));
        }
    }

    private final boolean shouldSkipRouteActivityNode(Activity activity) {
        RouterPageMonitor.RouterPageConfig routerPageConfig$monitor_release;
        RouterPageMonitor.IRouterNodeHost iRouterNodeHost;
        if (activity == null || (routerPageConfig$monitor_release = RouterPageMonitor.INSTANCE.getRouterPageConfig$monitor_release()) == null || (iRouterNodeHost = routerPageConfig$monitor_release.routerNodeHost) == null || !iRouterNodeHost.shouldSkipRouteActivityNode(activity)) {
            return false;
        }
        return true;
    }

    private final String sourcePage(ActivityOp activityOp) {
        CallerInfo callerInfo = activityOp.redirect;
        if (callerInfo == null) {
            callerInfo = activityOp.caller;
        }
        return callerInfo.name;
    }

    private final String sourcePosition(ActivityOp activityOp) {
        return activityOp.caller.name;
    }

    private final String sourceType(ActivityOp activityOp) {
        CallerInfo callerInfo = activityOp.redirect;
        if (callerInfo == null) {
            callerInfo = activityOp.caller;
        }
        return callerInfo.type.name();
    }

    private final String toName(Object obj) {
        return obj.getClass().getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final org.json.JSONObject toReportJson(com.bytedance.router.monitor.page.RouterJumpInfo r5) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.monitor.page.PageRouterHandler.toReportJson(com.bytedance.router.monitor.page.RouterJumpInfo):org.json.JSONObject");
    }

    private final FragmentRouter tryPopFragmentRouter(Fragment fragment) {
        FragmentRouter next;
        String strFragmentId = fragmentId(fragment);
        Iterator<FragmentRouter> it2 = this.fragmentRouters.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.id, strFragmentId)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        FragmentRouter fragmentRouter = next;
        if (fragmentRouter == null) {
            return null;
        }
        this.fragmentRouters.remove(fragmentRouter);
        return fragmentRouter;
    }

    private final FragmentRouter tryPushFragmentRouter(Fragment fragment) {
        FragmentRouter next;
        String str;
        PageRouterDumper pageRouterDumper;
        C19EG activity = fragment.getActivity();
        String strFragmentId = null;
        if (activity == null) {
            return null;
        }
        String strFragmentId2 = fragmentId(fragment);
        Iterator<FragmentRouter> it2 = this.fragmentRouters.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.id, strFragmentId2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        FragmentRouter fragmentRouter = next;
        if (fragmentRouter == null) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment != null) {
                strFragmentId = fragmentId(parentFragment);
            }
            String name = toName(fragment);
            if (fragment instanceof DialogFragment) {
                str = "dialog";
            } else {
                str = "normal";
            }
            fragmentRouter = new FragmentRouter(strFragmentId2, name, str, -1.0f, -1.0f, strFragmentId, toName(activity), activityId(activity), new WeakReference(fragment));
            if (RouterPageEventDispatcher.Companion.getSDebug() && (pageRouterDumper = this.pageRouterDumper) != null) {
                pageRouterDumper.addOp(fragmentRouter);
            }
            this.fragmentRouters.add(fragmentRouter);
        }
        return fragmentRouter;
    }

    public final String listToStr(List<?> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(list.size());
        sbLIZ.append(": ");
        sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void onActivityCreated(Activity activity) {
        String strLIZIZ;
        PageRouterDumper pageRouterDumper;
        Intent intent = activity.getIntent();
        if (intent == null || (strLIZIZ = INVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "_router_jump_token_key")) == null) {
            RouterPageEventDispatcher.Companion.getSDebug();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("0_");
            sbLIZ.append(activity.hashCode());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        ActivityRouter activityRouter = new ActivityRouter(activityId(activity), strLIZIZ, toName(activity), null, new WeakReference(activity));
        if (RouterPageEventDispatcher.Companion.getSDebug() && (pageRouterDumper = this.pageRouterDumper) != null) {
            pageRouterDumper.addOp(activityRouter);
        }
        this.activityRouters.add(activityRouter);
        reportActivity(activityRouter, activity);
    }

    public final void onActivityDestroyed(Activity activity) {
        String strActivityId = activityId(activity);
        List<ActivityRouter> listRemoveElements = removeElements(this.activityRouters, new AwS85S1000000_35(strActivityId, 0));
        if (listRemoveElements != null) {
            for (ActivityRouter activityRouter : listRemoveElements) {
                removeElements(this.activityOps, new AwS614S0100000_35(activityRouter, 42));
                removeElements(this.routerInfos, new AwS614S0100000_35(activityRouter, 43));
                List listRemoveElements2 = removeElements(this.fragmentRouters, new AwS149S1100000_35(this, strActivityId, 0));
                if (listRemoveElements2 != null) {
                    Iterator it2 = listRemoveElements2.iterator();
                    while (it2.hasNext()) {
                        removeElements(this.fragmentOps, new AwS614S0100000_35((FragmentRouter) it2.next(), 44));
                    }
                }
            }
        }
    }

    public final void onFragmentOnPaused(Fragment fragment) {
        FragmentRouter fragmentRouterTryPopFragmentRouter;
        FragmentOp fragmentOpPopFragmentOp = popFragmentOp(fragment, "dispatchFragmentOnPaused");
        if (fragmentOpPopFragmentOp != null && (fragmentRouterTryPopFragmentRouter = tryPopFragmentRouter(fragment)) != null) {
            reportFragment(fragmentOpPopFragmentOp, fragmentRouterTryPopFragmentRouter, fragment);
        }
    }

    public final void onFragmentOnResumed(final Fragment fragment) {
        final FragmentRouter fragmentRouterTryPushFragmentRouter;
        final FragmentOp fragmentOpPopFragmentOp = popFragmentOp(fragment, "dispatchFragmentOnResumed");
        if (fragmentOpPopFragmentOp != null && (fragmentRouterTryPushFragmentRouter = tryPushFragmentRouter(fragment)) != null) {
            View view = fragment.getView();
            if (view == null) {
                updateViewDesc(fragment, fragmentRouterTryPushFragmentRouter);
                reportFragment(fragmentOpPopFragmentOp, fragmentRouterTryPushFragmentRouter, fragment);
            } else {
                HandlerHook.viewPost(view, new Runnable() { // from class: com.bytedance.router.monitor.page.PageRouterHandler.onFragmentOnResumed.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("PageRouterHandler@5832.onFragmentOnResumed$1");
                        com_bytedance_router_monitor_page_PageRouterHandler$onFragmentOnResumed$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        C1C7U.LIZIZ("PageRouterHandler@5832.onFragmentOnResumed$1");
                    }

                    public final void com_bytedance_router_monitor_page_PageRouterHandler$onFragmentOnResumed$1__run$___twin___() {
                        if (fragment.isDetached()) {
                            return;
                        }
                        PageRouterHandler.this.updateViewDesc(fragment, fragmentRouterTryPushFragmentRouter);
                        PageRouterHandler.this.reportFragment(fragmentOpPopFragmentOp, fragmentRouterTryPushFragmentRouter, fragment);
                    }

                    public static void com_bytedance_router_monitor_page_PageRouterHandler$onFragmentOnResumed$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        try {
                            anonymousClass1.com_bytedance_router_monitor_page_PageRouterHandler$onFragmentOnResumed$1__run$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                });
            }
        }
    }

    public final void onSmartRouteFailed(String str) {
        RouterInfo next;
        Iterator<RouterInfo> it2 = this.routerInfos.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.routeId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        RouterInfo routerInfo = next;
        if (routerInfo != null) {
            routerInfo.setRouterStatus(0);
        }
    }

    public final void onSmartRouteSuccess(String str) {
        RouterInfo next;
        Iterator<RouterInfo> it2 = this.routerInfos.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.routeId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        RouterInfo routerInfo = next;
        if (routerInfo != null) {
            routerInfo.setRouterStatus(1);
        }
    }

    public final void setPageRouterDumper$monitor_release(PageRouterDumper pageRouterDumper) {
        this.pageRouterDumper = pageRouterDumper;
        pageRouterDumper.setAppendDump(new AwS614S0100000_35(this, 45));
        pageRouterDumper.startDump();
    }

    public static String INVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final boolean isViewExits(ViewGroup viewGroup, View view) {
        for (View view2 : new C09RD(viewGroup)) {
            if (Intrinsics.LJFF(view2, view)) {
                return true;
            }
            if ((view2 instanceof ViewGroup) && isViewExits((ViewGroup) view2, view)) {
                return true;
            }
        }
        return false;
    }

    private final String obtainTraceId(Intent intent, boolean z) {
        String strINVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "_router_jump_token_key");
        if (strINVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null && z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("a_");
            sbLIZ.append(this.sRouterJumpToken.incrementAndGet());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            intent.putExtra("_router_jump_token_key", strLIZIZ);
            return strLIZIZ;
        }
        return strINVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
    }

    private final FragmentOp popFragmentOp(Fragment fragment, String str) {
        String str2;
        FragmentOp next;
        Iterator<FragmentOp> it2 = this.fragmentOps.iterator();
        while (true) {
            str2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.fragmentId, fragmentId(fragment))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        FragmentOp fragmentOp = next;
        if (RouterPageEventDispatcher.Companion.getSDebug()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append(toName(fragment));
            sbLIZ.append(" >>>> ");
            if (fragmentOp != null) {
                str2 = fragmentOp.sysMethod;
            }
            sbLIZ.append(str2);
            sbLIZ.append(", ");
            sbLIZ.append(fragment);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (fragmentOp != null) {
            this.fragmentOps.remove(fragmentOp);
        }
        return fragmentOp;
    }

    private final <T> List<T> removeElements(List<T> list, Function1<? super T, Boolean> function1) {
        if (list.isEmpty()) {
            return null;
        }
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList();
        while (it2.hasNext()) {
            T next = it2.next();
            if (function1.invoke(next).booleanValue()) {
                arrayList.add(next);
                it2.remove();
            }
        }
        return arrayList;
    }

    private final void reportActivity(ActivityRouter activityRouter, Activity activity) throws JSONException {
        ActivityOp next;
        String str;
        Bundle bundleINVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        RouterInfo next2;
        RouterJumpInfo routerJumpInfo;
        Activity activity2;
        Intent intent;
        Bundle bundleINVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras2;
        RouterInfo next3;
        Activity activity3;
        Intent intent2;
        if (shouldSkipRouteActivityNode(activity)) {
            return;
        }
        if (u.LJJIIJZLJL(activityRouter.traceId, "0_", false)) {
            String str2 = activityRouter.name;
            PageParamUtils pageParamUtils = PageParamUtils.INSTANCE;
            WeakReference<Activity> weakReference = activityRouter.activityRef;
            if (weakReference != null && (activity3 = weakReference.get()) != null && (intent2 = activity3.getIntent()) != null) {
                bundleINVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras2 = INVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent2);
            } else {
                bundleINVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras2 = null;
            }
            String params = pageParamUtils.toParams(bundleINVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras2);
            Iterator<RouterInfo> it2 = this.routerInfos.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next3 = it2.next();
                    if (Intrinsics.LJFF(next3.traceId, activityRouter.traceId)) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            routerJumpInfo = new RouterJumpInfo(next3, null, "App.Start", "System", "System", null, str2, "Activity", null, "System", params, null, null, null);
        } else {
            Iterator<ActivityOp> it3 = this.activityOps.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(next.traceId, activityRouter.traceId)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ActivityOp activityOp = next;
            if (activityOp == null) {
                return;
            }
            if (activityOp.redirect != null) {
                str = activityOp.caller.name;
            } else {
                str = null;
            }
            String strSourcePage = sourcePage(activityOp);
            String strSourceType = sourceType(activityOp);
            String strSourcePosition = sourcePosition(activityOp);
            String str3 = activityRouter.name;
            String str4 = activityOp.sysMethod;
            PageParamUtils pageParamUtils2 = PageParamUtils.INSTANCE;
            WeakReference<Activity> weakReference2 = activityRouter.activityRef;
            if (weakReference2 != null && (activity2 = weakReference2.get()) != null && (intent = activity2.getIntent()) != null) {
                bundleINVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
            } else {
                bundleINVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = null;
            }
            String params2 = pageParamUtils2.toParams(bundleINVOKEVIRTUAL_com_bytedance_router_monitor_page_PageRouterHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
            Iterator<RouterInfo> it4 = this.routerInfos.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (Intrinsics.LJFF(next2.traceId, activityRouter.traceId)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            routerJumpInfo = new RouterJumpInfo(next2, str, strSourcePage, strSourceType, strSourcePosition, null, str3, "Activity", null, str4, params2, null, null, null);
        }
        RouterPageEventDispatcher.Companion.getSDebug();
        reportEvent(routerJumpInfo);
    }

    public final void onFragmentOnHiddenChanged(Fragment fragment, boolean z) {
        FragmentRouter fragmentRouterTryPushFragmentRouter;
        FragmentOp fragmentOpPopFragmentOp = popFragmentOp(fragment, "dispatchFragmentOnHiddenChanged");
        if (fragmentOpPopFragmentOp != null) {
            if (z) {
                fragmentRouterTryPushFragmentRouter = tryPopFragmentRouter(fragment);
                if (fragmentRouterTryPushFragmentRouter == null) {
                    return;
                }
            } else {
                fragmentRouterTryPushFragmentRouter = tryPushFragmentRouter(fragment);
                if (fragmentRouterTryPushFragmentRouter == null) {
                    return;
                } else {
                    updateViewDesc(fragment, fragmentRouterTryPushFragmentRouter);
                }
            }
            reportFragment(fragmentOpPopFragmentOp, fragmentRouterTryPushFragmentRouter, fragment);
        }
    }

    public final void onFragmentOpReached(Fragment fragment, FragmentOpType fragmentOpType) {
        PageRouterDumper pageRouterDumper;
        if (fragmentOpType == FragmentOpType.OP_REMOVE && !fragment.isAdded()) {
            return;
        }
        String strFragmentId = fragmentId(fragment);
        List<FragmentOp> list = this.fragmentOps;
        FragmentOp fragmentOp = new FragmentOp(strFragmentId, fragmentOpType.getMethodName());
        if (RouterPageEventDispatcher.Companion.getSDebug() && (pageRouterDumper = this.pageRouterDumper) != null) {
            pageRouterDumper.addOp(fragmentOp);
        }
        list.add(fragmentOp);
    }

    public final void onSmartRouteIntercepted(String str, String str2) {
        RouterInfo next;
        Iterator<RouterInfo> it2 = this.routerInfos.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.routeId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        RouterInfo routerInfo = next;
        if (routerInfo != null) {
            routerInfo.setRouterInterceptor(str2);
            routerInfo.setRouterStatus(1);
        }
    }

    public final void updateViewDesc(Fragment fragment, FragmentRouter fragmentRouter) {
        View view = fragment.getView();
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (this.screenSizeInfo == null) {
                this.screenSizeInfo = PageParamUtils.INSTANCE.getScreenSize(fragment.getActivity());
            }
            Pair<Integer, Integer> pair = this.screenSizeInfo;
            if (pair != null && pair.getFirst().intValue() != 0 && pair.getSecond().intValue() != 0) {
                fragmentRouter.setPageWidth(width / pair.getFirst().intValue());
                fragmentRouter.setPageHeight(height / pair.getSecond().intValue());
            }
        }
    }

    private final boolean isParent(Activity activity, FragmentRouter fragmentRouter, FragmentRouter fragmentRouter2) {
        Fragment fragment;
        Fragment fragment2;
        View view;
        WeakReference<Fragment> weakReference = fragmentRouter.fragmentRef;
        if (weakReference != null && (fragment = weakReference.get()) != null && activity != null && fragment.isAdded() && fragment.getView() != null) {
            WeakReference<Fragment> weakReference2 = fragmentRouter2.fragmentRef;
            View view2 = null;
            if (weakReference2 != null) {
                fragment2 = weakReference2.get();
            } else {
                fragment2 = null;
            }
            if (Intrinsics.LJFF(fragmentRouter2.parentId, fragmentRouter.id)) {
                return true;
            }
            View view3 = fragment.getView();
            if (view3 instanceof ViewGroup) {
                view2 = view3;
            }
            ViewGroup viewGroup = (ViewGroup) view2;
            if (viewGroup != null && fragment2 != null && (view = fragment2.getView()) != null) {
                return isViewExits(viewGroup, view);
            }
        }
        return false;
    }

    public final void onActivityOpReached(Context context, Intent intent, String str) {
        CallerInfo callerInfo;
        ActivityRouter next;
        String name;
        PageRouterDumper pageRouterDumper;
        String str2;
        if (!(context instanceof Activity)) {
            RouterPageEventDispatcher.Companion.getSDebug();
            return;
        }
        String strObtainTraceId = obtainTraceId(intent, true);
        if (strObtainTraceId != null) {
            Iterator<ActivityRouter> it2 = this.activityRouters.iterator();
            while (true) {
                callerInfo = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.id, activityId((Activity) context))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ActivityRouter activityRouter = next;
            if (activityRouter == null || (name = activityRouter.name) == null) {
                name = toName(context);
            }
            CallerInfo callerInfo2 = new CallerInfo(name, CallerType.Activity);
            if (activityRouter != null && (str2 = activityRouter.redirectFragment) != null) {
                callerInfo = new CallerInfo(str2, CallerType.Fragment);
            }
            List<ActivityOp> list = this.activityOps;
            ActivityOp activityOp = new ActivityOp(strObtainTraceId, callerInfo2, callerInfo, str);
            if (RouterPageEventDispatcher.Companion.getSDebug() && (pageRouterDumper = this.pageRouterDumper) != null) {
                pageRouterDumper.addOp(activityOp);
            }
            list.add(activityOp);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd A[PHI: r13
      0x00cd: PHI (r13v12 java.lang.String) = (r13v6 java.lang.String), (r13v13 java.lang.String) binds: [B:78:0x0176, B:45:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3 A[PHI: r13 r14
      0x00d3: PHI (r13v11 java.lang.String) = (r13v7 java.lang.String), (r13v12 java.lang.String) binds: [B:81:0x017b, B:47:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r14v8 java.lang.String) = (r14v4 java.lang.String), (r14v9 java.lang.String) binds: [B:81:0x017b, B:47:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9 A[PHI: r13 r14 r15
      0x00d9: PHI (r13v10 java.lang.String) = (r13v8 java.lang.String), (r13v11 java.lang.String) binds: [B:84:0x0180, B:49:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r14v7 java.lang.String) = (r14v5 java.lang.String), (r14v8 java.lang.String) binds: [B:84:0x0180, B:49:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r15v6 java.lang.String) = (r15v4 java.lang.String), (r15v7 java.lang.String) binds: [B:84:0x0180, B:49:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017a A[PHI: r13
      0x017a: PHI (r13v7 java.lang.String) = (r13v6 java.lang.String), (r13v12 java.lang.String) binds: [B:78:0x0176, B:47:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017f A[PHI: r13 r14
      0x017f: PHI (r13v8 java.lang.String) = (r13v7 java.lang.String), (r13v11 java.lang.String) binds: [B:81:0x017b, B:49:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r14v5 java.lang.String) = (r14v4 java.lang.String), (r14v8 java.lang.String) binds: [B:81:0x017b, B:49:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void reportFragment(com.bytedance.router.monitor.page.FragmentOp r26, com.bytedance.router.monitor.page.FragmentRouter r27, androidx.fragment.app.Fragment r28) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.monitor.page.PageRouterHandler.reportFragment(com.bytedance.router.monitor.page.FragmentOp, com.bytedance.router.monitor.page.FragmentRouter, androidx.fragment.app.Fragment):void");
    }

    public final void onSmartRouteOpen(Context context, Intent intent, String str, RouteInfo routeInfo, String str2, String str3) {
        String strObtainTraceId = obtainTraceId(intent, true);
        if (strObtainTraceId != null) {
            this.routerInfos.add(new RouterInfo(strObtainTraceId, str, routeInfo.getScheme(), routeInfo.getHost(), routeInfo.getPath(), PageParamUtils.INSTANCE.toParams(routeInfo.getParams()), str2, str3, "", -1, ""));
        }
    }
}
