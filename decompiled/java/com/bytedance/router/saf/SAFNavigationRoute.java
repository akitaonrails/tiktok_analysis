package com.bytedance.router.saf;

import X.AbstractC565380MFk;
import X.AnonymousClass1954;
import X.AnonymousClass1999;
import X.C198H;
import X.C199B;
import X.C20629815o0;
import X.C20629915o1;
import X.C569760MWg;
import X.InterfaceC1631630sYr;
import X.InterfaceC20622815ms;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.route.BaseRoute;
import com.bytedance.router.util.ContextExtensionKt;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFContextThemeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class SAFNavigationRoute extends BaseRoute {
    public static final Companion Companion = new Companion();
    public static final List<InterfaceC1631630sYr<InterfaceC214902198i, InterfaceC214902198i, Bundle, String, Unit>> prePushListeners = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        public final void addRouteStartListeners(InterfaceC1631630sYr<? super InterfaceC214902198i, ? super InterfaceC214902198i, ? super Bundle, ? super String, Unit> interfaceC1631630sYr) {
            SAFNavigationRoute.prePushListeners.add(interfaceC1631630sYr);
        }
    }

    public static Bundle INVOKEVIRTUAL_com_bytedance_router_saf_SAFNavigationRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final int pushScene$getAnimationRes(Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return Math.max(0, iIntValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.router.route.IRoute
    public void open(Context context) throws IllegalAccessException, InstantiationException {
        Scene sceneLLLLIIIILLL;
        Bundle bundle;
        Activity activity;
        InterfaceC214902198i interfaceC214902198iLIZJ;
        InterfaceC20622815ms interfaceC20622815ms;
        Pair pair;
        Pair pair2;
        C198H c198h;
        SAFRouteIntent sAFRouteIntent = (SAFRouteIntent) getRouteIntent();
        Object objNewInstance = Class.forName(getTargetClass(sAFRouteIntent.getUrl(), false)).newInstance();
        NavigationScene navigationScene = sAFRouteIntent.getNavigationScene();
        if (navigationScene != null) {
            sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
        } else {
            sceneLLLLIIIILLL = 0;
        }
        Intent extra = sAFRouteIntent.getExtra();
        if (extra == null || (bundle = INVOKEVIRTUAL_com_bytedance_router_saf_SAFNavigationRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(extra)) == null) {
            bundle = new Bundle();
        }
        OpenResultCallback callback = sAFRouteIntent.getCallback();
        if (callback != null) {
            callback.onOpen(null);
        }
        if ((objNewInstance instanceof Scene) && sceneLLLLIIIILLL != 0) {
            pushScene(sAFRouteIntent, (Scene) objNewInstance, bundle, sceneLLLLIIIILLL);
            if (callback != null) {
                callback.onSuccess(null);
                return;
            }
            return;
        }
        InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) objNewInstance;
        if (context != null) {
            activity = ContextExtensionKt.getActivity(context);
        } else {
            activity = null;
        }
        if (!(sceneLLLLIIIILLL instanceof C198H) || (c198h = (C198H) sceneLLLLIIIILLL) == null || (interfaceC214902198iLIZJ = C20629815o0.LIZ(c198h)) == null) {
            if ((activity instanceof InterfaceC214897198d) && (interfaceC20622815ms = (InterfaceC20622815ms) activity) != null) {
                interfaceC214902198iLIZJ = C20629915o1.LIZJ(interfaceC20622815ms);
            } else {
                interfaceC214902198iLIZJ = null;
            }
        }
        Iterator<InterfaceC1631630sYr<InterfaceC214902198i, InterfaceC214902198i, Bundle, String, Unit>> it2 = prePushListeners.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(interfaceC214902198iLIZJ, interfaceC214902198i, bundle, sAFRouteIntent.getUrl());
        }
        Class<?> cls = interfaceC214902198i.getClass();
        int requestCode = sAFRouteIntent.getRequestCode();
        SAFContextThemeConfig sAFContextThemeConfig = new SAFContextThemeConfig(false, 0);
        if (sAFRouteIntent.getEnterAnim() == -1 && sAFRouteIntent.getExitAnim() == -1) {
            pair = null;
        } else {
            pair = new Pair(Integer.valueOf(sAFRouteIntent.getEnterAnim()), Integer.valueOf(sAFRouteIntent.getExitAnim()));
        }
        if (sAFRouteIntent.getFinishAnim().getFirst().intValue() == -1 && sAFRouteIntent.getFinishAnim().getSecond().intValue() == -1) {
            pair2 = null;
        } else {
            pair2 = new Pair(sAFRouteIntent.getFinishAnim().getFirst(), sAFRouteIntent.getFinishAnim().getSecond());
        }
        AnonymousClass1999.LIZLLL(interfaceC214902198iLIZJ, new AwS576S0100000_32(interfaceC214902198i, 70), cls, activity, requestCode, bundle, new C199B(null, pair, pair2, true, false, null, null, 113), sAFRouteIntent.getPushResultCallback(), sAFContextThemeConfig);
        if (callback != null) {
            callback.onSuccess(null);
        }
    }

    private final void pushScene(SAFRouteIntent sAFRouteIntent, Scene scene, Bundle bundle, Scene scene2) {
        Pair pair;
        Pair pair2;
        Integer num;
        Integer num2;
        Integer num3;
        if (sAFRouteIntent.getNavigationScene() != null) {
            scene.mArguments = AnonymousClass1999.LIZIZ(bundle);
            Integer num4 = null;
            if (sAFRouteIntent.getEnterAnim() == -1 && sAFRouteIntent.getExitAnim() == -1) {
                pair = null;
            } else {
                pair = new Pair(Integer.valueOf(sAFRouteIntent.getEnterAnim()), Integer.valueOf(sAFRouteIntent.getExitAnim()));
            }
            if (sAFRouteIntent.getFinishAnim().getFirst().intValue() == -1 && sAFRouteIntent.getFinishAnim().getSecond().intValue() == -1) {
                pair2 = null;
            } else {
                pair2 = new Pair(sAFRouteIntent.getFinishAnim().getFirst(), sAFRouteIntent.getFinishAnim().getSecond());
            }
            C569760MWg c569760MWg = new C569760MWg();
            c569760MWg.LJ = true;
            c569760MWg.LJFF = true;
            if (sAFRouteIntent.getRequestCode() != -1 && sAFRouteIntent.getPushResultCallback() != null) {
                c569760MWg.LIZIZ = new AbstractC565380MFk(sAFRouteIntent) { // from class: com.bytedance.router.saf.SAFNavigationRoute.pushScene.2
                    public final /* synthetic */ SAFRouteIntent $routeIntent;

                    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
                    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
                    @Override // X.InterfaceC363130ELn
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public void onResult(java.lang.Object r5) {
                        /*
                            r4 = this;
                            boolean r0 = r5 instanceof X.C20630615o8
                            r3 = 0
                            if (r0 == 0) goto L2e
                            X.15o8 r5 = (X.C20630615o8) r5
                            if (r5 == 0) goto L2f
                            int r2 = r5.LIZ
                        Lb:
                            com.bytedance.scene.Scene r1 = r4.$currentScene
                            boolean r0 = r1 instanceof X.C198H
                            if (r0 == 0) goto L22
                            X.198H r1 = (X.C198H) r1
                            if (r1 == 0) goto L22
                            com.bytedance.router.saf.SAFRouteIntent r0 = r4.$routeIntent
                            int r0 = r0.getRequestCode()
                            if (r5 == 0) goto L1f
                            android.content.Intent r3 = r5.LIZIZ
                        L1f:
                            r1.onResult(r0, r2, r3)
                        L22:
                            com.bytedance.router.saf.SAFRouteIntent r0 = r4.$routeIntent
                            X.199S r0 = r0.getPushResultCallback()
                            if (r0 == 0) goto L2d
                            r0.LIZ(r5)
                        L2d:
                            return
                        L2e:
                            r5 = r3
                        L2f:
                            r2 = -1
                            goto Lb
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.saf.SAFNavigationRoute.AnonymousClass2.onResult(java.lang.Object):void");
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(this.$currentScene);
                        this.$routeIntent = sAFRouteIntent;
                    }
                };
            }
            if (pair != null || pair2 != null) {
                Activity activityRequireActivity = sAFRouteIntent.getNavigationScene().requireActivity();
                if (pair != null) {
                    num = (Integer) pair.getFirst();
                } else {
                    num = null;
                }
                int iPushScene$getAnimationRes = pushScene$getAnimationRes(num);
                if (pair != null) {
                    num2 = (Integer) pair.getSecond();
                } else {
                    num2 = null;
                }
                int iPushScene$getAnimationRes2 = pushScene$getAnimationRes(num2);
                if (pair2 != null) {
                    num3 = (Integer) pair2.getFirst();
                } else {
                    num3 = null;
                }
                int iPushScene$getAnimationRes3 = pushScene$getAnimationRes(num3);
                if (pair2 != null) {
                    num4 = (Integer) pair2.getSecond();
                }
                c569760MWg.LIZJ = new AnonymousClass1954(activityRequireActivity, iPushScene$getAnimationRes, iPushScene$getAnimationRes2, iPushScene$getAnimationRes3, pushScene$getAnimationRes(num4));
            }
            sAFRouteIntent.getNavigationScene().LLLLLLLLLL(scene, c569760MWg.LIZ());
            return;
        }
        "Impossible case, navigationScene already checked before entering this function.".toString();
        throw new IllegalArgumentException("Impossible case, navigationScene already checked before entering this function.");
    }
}
