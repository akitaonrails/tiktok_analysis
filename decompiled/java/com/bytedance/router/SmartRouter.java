package com.bytedance.router;

import X.C19EG;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC214902198i;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.autowire.AutowiredService;
import com.bytedance.router.autowire.ISerializationService;
import com.bytedance.router.fragment.FindNavigationContainerResult;
import com.bytedance.router.fragment.FragmentRoute;
import com.bytedance.router.fragment.NavigationUtils;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.interceptor.IInterceptorProvider;
import com.bytedance.router.monitor.RouterMonitor;
import com.bytedance.router.saf.SAFRoute;
import com.bytedance.router.util.Logger;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class SmartRouter {
    public static ISerializationService serializationService;

    public static /* synthetic */ Scene LIZIZ(Scene scene) {
        lambda$safNavigation$1(scene);
        return scene;
    }

    public static /* synthetic */ Scene lambda$safNavigation$1(Scene scene) {
        return scene;
    }

    public static boolean isDebug() {
        return Logger.isDebug();
    }

    public static ISerializationService getSerializationService() {
        return serializationService;
    }

    public static void addInterceptor(IInterceptor iInterceptor) {
        RouteManager.getInstance().addInterceptor(iInterceptor);
    }

    public static void addInterceptorProvider(IInterceptorProvider iInterceptorProvider) {
        RouteManager.getInstance().addInterceptroProvider(iInterceptorProvider);
    }

    public static void addLastInterceptor(IInterceptor iInterceptor) {
        RouteManager.getInstance().addLastInterceptor(iInterceptor);
    }

    public static void addRewriteMap(Map<String, String> map) {
        RouteManager.getInstance().setRewriteMap(map);
    }

    public static void autowire(Object obj) {
        AutowiredService.inst().autowire(obj);
    }

    public static boolean canOpen(String str) {
        return RouteManager.getInstance().canOpen(str);
    }

    public static RoutesConfig configRouter(String str) {
        RoutesConfig routesConfig = new RoutesConfig(str);
        RouteManager.getInstance().setConfig(routesConfig);
        return routesConfig;
    }

    public static FragmentRoute fragmentNavigation(Fragment fragment) {
        FindNavigationContainerResult findNavigationContainerResultFindNavigationContainer = NavigationUtils.findNavigationContainer(fragment);
        if (findNavigationContainerResultFindNavigationContainer != null) {
            FragmentRoute fragmentRoute = new FragmentRoute(null, fragment, findNavigationContainerResultFindNavigationContainer.container);
            fragmentRoute.withFragmentManager(findNavigationContainerResultFindNavigationContainer.fragmentManager);
            return fragmentRoute;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("you should implement FragmentNavigationContainer in your activity or the parent fragment for ");
        sbLIZ.append(fragment.getClass().getName());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String getFragmentNavigationUrl(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            return null;
        }
        return arguments.getString("router_internal_fragment_navigation_url", null);
    }

    public static void init(Context context) {
        RouteManager.getInstance().init(C786410Ut5.N3(context));
        RouterMonitor.INSTANCE.init((Application) C786410Ut5.N3(context));
    }

    public static void injectInitializer(IRouterInjectInitializer iRouterInjectInitializer) {
        RouteManager.getInstance().injectInitializer(iRouterInjectInitializer);
    }

    public static boolean isSmartIntent(Intent intent) {
        return SmartIntent.isSmartIntent(intent);
    }

    public static /* synthetic */ Scene lambda$safNavigation$0(InterfaceC214902198i interfaceC214902198i) {
        SAFFragmentRootScene sAFFragmentRootSceneIb = interfaceC214902198i.ib();
        if (sAFFragmentRootSceneIb != null) {
            return sAFFragmentRootSceneIb;
        }
        throw new IllegalStateException("ISAFFragment hostScene is null");
    }

    public static void removeInterceptor(IInterceptor iInterceptor) {
        RouteManager.getInstance().removeInterceptor(iInterceptor);
    }

    public static void removeLastInterceptor(IInterceptor iInterceptor) {
        RouteManager.getInstance().removeLastInterceptor(iInterceptor);
    }

    public static void setCustomInitializer(IMappingInitializer iMappingInitializer) {
        RouteManager.getInstance().setCustomInitializer(iMappingInitializer);
    }

    public static void setDebug(boolean z) {
        Logger.setDebug(z);
    }

    public static void setSerializationService(ISerializationService iSerializationService) {
        serializationService = iSerializationService;
    }

    public static Intent smartIntent(Intent intent) {
        return SmartIntent.smartIntent(intent);
    }

    public static FragmentRoute fragmentNavigation(C19EG c19eg) {
        FindNavigationContainerResult findNavigationContainerResultFindNavigationContainer = NavigationUtils.findNavigationContainer(c19eg);
        if (findNavigationContainerResultFindNavigationContainer != null) {
            FragmentRoute fragmentRoute = new FragmentRoute(c19eg, findNavigationContainerResultFindNavigationContainer.container);
            fragmentRoute.withFragmentManager(findNavigationContainerResultFindNavigationContainer.fragmentManager);
            return fragmentRoute;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("you should implement FragmentNavigationContainer in your activity named ");
        sbLIZ.append(c19eg.getClass().getName());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static SmartRoute buildFragmentRoute(Fragment fragment, String str) {
        SmartRoute smartRoute = new SmartRoute(fragment.getActivity());
        smartRoute.withUrl(str);
        smartRoute.withFragment(fragment);
        return smartRoute;
    }

    public static SmartRoute buildRoute(Fragment fragment, String str) {
        SmartRoute smartRoute = new SmartRoute(fragment.getActivity());
        smartRoute.withUrl(str);
        return smartRoute;
    }

    public static boolean canOpen(String str, boolean z) {
        return RouteManager.getInstance().canOpen(str, z);
    }

    public static void putRewriteValue(String str, String str2) {
        RouteManager.getInstance().putRewriteValue(str, str2);
    }

    public static SAFRoute safNavigation(final InterfaceC214902198i interfaceC214902198i, String str) {
        return new SAFRoute((Function0<? extends Scene>) new Function0() { // from class: X.19Fa
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SmartRouter.lambda$safNavigation$0(interfaceC214902198i);
            }
        }, str);
    }

    public static SmartRoute buildRoute(Context context, String str) {
        SmartRoute smartRoute = new SmartRoute(context);
        smartRoute.withUrl(str);
        return smartRoute;
    }

    public static SAFRoute safNavigation(final Scene scene, String str) {
        return new SAFRoute((Function0<? extends Scene>) new Function0() { // from class: X.19Fb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Scene scene2 = scene;
                SmartRouter.lambda$safNavigation$1(scene2);
                return scene2;
            }
        }, str);
    }

    public static SAFRoute safNavigation(Activity activity, String str) {
        return new SAFRoute(activity, str);
    }
}
