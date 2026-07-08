package com.bytedance.router.saf;

import X.C1447800nmM;
import X.C199E;
import X.C199S;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteManager;
import com.bytedance.router.monitor.RouterMonitor;
import com.bytedance.router.saf.SAFRouteIntent;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public final class SAFRoute {
    public final Activity activity;
    public OpenResultCallback callback;
    public Pair<Integer, Integer> enterAnim;
    public Pair<Integer, Integer> exitAnim;
    public Intent extraParams;
    public final Function0<Scene> fromSceneGetter;
    public C199E launchMode;
    public final String url;

    public static Bundle INVOKEVIRTUAL_com_bytedance_router_saf_SAFRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final SAFRoute withCallback(OpenResultCallback openResultCallback) {
        this.callback = openResultCallback;
        return this;
    }

    public final SAFRoute withNavArg(Parcelable parcelable) {
        if (parcelable != null) {
            this.extraParams.putExtra("smart_key_route_arg", parcelable);
        }
        return this;
    }

    public final SAFRoute withParam(Intent intent) {
        Intent intent2 = this.extraParams;
        Bundle bundleINVOKEVIRTUAL_com_bytedance_router_saf_SAFRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_bytedance_router_saf_SAFRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_bytedance_router_saf_SAFRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            bundleINVOKEVIRTUAL_com_bytedance_router_saf_SAFRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = new Bundle();
        }
        intent2.putExtras(bundleINVOKEVIRTUAL_com_bytedance_router_saf_SAFRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
        return this;
    }

    public final SAFRoute withParam(Bundle bundle) {
        this.extraParams.putExtras(bundle);
        return this;
    }

    public SAFRoute(Activity activity, String str) {
        this(null, activity, str);
    }

    private final RouteIntent buildRouteIntent(int i, C199S c199s) {
        NavigationScene navigationSceneLIZ;
        Scene sceneInvoke;
        SAFRouteIntent.Builder builder = new SAFRouteIntent.Builder();
        Function0<Scene> function0 = this.fromSceneGetter;
        if (function0 != null && (sceneInvoke = function0.invoke()) != null) {
            navigationSceneLIZ = C1447800nmM.LIZ(sceneInvoke);
        } else {
            navigationSceneLIZ = null;
        }
        builder.withNavigationScene(navigationSceneLIZ);
        builder.withPushCallback(c199s);
        builder.withExitAnimation(this.exitAnim);
        builder.withAnimation(this.enterAnim.getFirst().intValue(), this.enterAnim.getSecond().intValue());
        builder.withParam(this.extraParams);
        builder.withUrl(this.url);
        builder.withCallback(this.callback);
        RouteIntent routeIntentBuild = builder.build();
        routeIntentBuild.setRequestCode(i);
        return routeIntentBuild;
    }

    public final void open(int i, C199S c199s) {
        Context contextRequireSceneContext;
        Scene sceneInvoke;
        RouteIntent routeIntentBuildRouteIntent = buildRouteIntent(i, c199s);
        if (routeIntentBuildRouteIntent != null) {
            routeIntentBuildRouteIntent.setRouteId(RouterMonitor.INSTANCE.startRoute(routeIntentBuildRouteIntent.getUrl()));
            Function0<Scene> function0 = this.fromSceneGetter;
            if (function0 == null || (sceneInvoke = function0.invoke()) == null || (contextRequireSceneContext = sceneInvoke.requireSceneContext()) == null) {
                contextRequireSceneContext = this.activity;
            }
            RouteManager.getInstance().safNavigation(contextRequireSceneContext, routeIntentBuildRouteIntent);
        }
    }

    public final SAFRoute withEnterAnimation(int i, int i2) {
        this.enterAnim = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        return this;
    }

    public final SAFRoute withExitAnimation(int i, int i2) {
        this.exitAnim = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        return this;
    }

    public final SAFRoute withParam(String str, byte b) {
        this.extraParams.putExtra(str, b);
        return this;
    }

    public final SAFRoute withParamCharSequenceList(String str, ArrayList<CharSequence> arrayList) {
        this.extraParams.putCharSequenceArrayListExtra(str, arrayList);
        return this;
    }

    public final SAFRoute withParamIntegerList(String str, ArrayList<Integer> arrayList) {
        this.extraParams.putIntegerArrayListExtra(str, arrayList);
        return this;
    }

    public final SAFRoute withParamParcelableList(String str, ArrayList<? extends Parcelable> arrayList) {
        this.extraParams.putParcelableArrayListExtra(str, arrayList);
        return this;
    }

    public final SAFRoute withParamStringList(String str, ArrayList<String> arrayList) {
        this.extraParams.putStringArrayListExtra(str, arrayList);
        return this;
    }

    public SAFRoute(Function0<? extends Scene> function0, String str) {
        this(function0, null, str);
    }

    public final SAFRoute withParam(String str, char c) {
        this.extraParams.putExtra(str, c);
        return this;
    }

    public final SAFRoute withParam(String str, double d) {
        this.extraParams.putExtra(str, d);
        return this;
    }

    public final SAFRoute withParam(String str, float f) {
        this.extraParams.putExtra(str, f);
        return this;
    }

    public final SAFRoute withParam(String str, int i) {
        this.extraParams.putExtra(str, i);
        return this;
    }

    public final SAFRoute withParam(String str, long j) {
        this.extraParams.putExtra(str, j);
        return this;
    }

    public final SAFRoute withParam(String str, Bundle bundle) {
        this.extraParams.putExtra(str, bundle);
        return this;
    }

    public final SAFRoute withParam(String str, Parcelable parcelable) {
        this.extraParams.putExtra(str, parcelable);
        return this;
    }

    public final SAFRoute withParam(String str, Serializable serializable) {
        this.extraParams.putExtra(str, serializable);
        return this;
    }

    public final SAFRoute withParam(String str, CharSequence charSequence) {
        this.extraParams.putExtra(str, charSequence);
        return this;
    }

    public final SAFRoute withParam(String str, String str2) {
        this.extraParams.putExtra(str, str2);
        return this;
    }

    public final SAFRoute withParam(String str, short s) {
        this.extraParams.putExtra(str, s);
        return this;
    }

    public final SAFRoute withParam(String str, boolean z) {
        this.extraParams.putExtra(str, z);
        return this;
    }

    public final SAFRoute withParam(String str, byte[] bArr) {
        this.extraParams.putExtra(str, bArr);
        return this;
    }

    public final SAFRoute withParam(String str, char[] cArr) {
        this.extraParams.putExtra(str, cArr);
        return this;
    }

    public final SAFRoute withParam(String str, double[] dArr) {
        this.extraParams.putExtra(str, dArr);
        return this;
    }

    public final SAFRoute withParam(String str, float[] fArr) {
        this.extraParams.putExtra(str, fArr);
        return this;
    }

    public final SAFRoute withParam(String str, int[] iArr) {
        this.extraParams.putExtra(str, iArr);
        return this;
    }

    public final SAFRoute withParam(String str, long[] jArr) {
        this.extraParams.putExtra(str, jArr);
        return this;
    }

    public final SAFRoute withParam(String str, Parcelable[] parcelableArr) {
        this.extraParams.putExtra(str, parcelableArr);
        return this;
    }

    public final SAFRoute withParam(String str, CharSequence[] charSequenceArr) {
        this.extraParams.putExtra(str, charSequenceArr);
        return this;
    }

    public final SAFRoute withParam(String str, String[] strArr) {
        this.extraParams.putExtra(str, strArr);
        return this;
    }

    public final SAFRoute withParam(String str, short[] sArr) {
        this.extraParams.putExtra(str, sArr);
        return this;
    }

    public final SAFRoute withParam(String str, boolean[] zArr) {
        this.extraParams.putExtra(str, zArr);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SAFRoute(Function0<? extends Scene> function0, Activity activity, String str) {
        this.fromSceneGetter = function0;
        this.activity = activity;
        this.url = str;
        if (function0 == 0 && activity == null) {
            throw new IllegalArgumentException("from page not set!");
        }
        this.enterAnim = new Pair<>(-1, -1);
        this.exitAnim = new Pair<>(-1, -1);
        this.extraParams = new Intent();
    }
}
