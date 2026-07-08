package com.bytedance.router.fragment;

import X.C19EG;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteManager;
import com.bytedance.router.fragment.FragmentNavigationRouteIntent;
import com.bytedance.router.monitor.RouterMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public final class FragmentRoute {
    public static final Companion Companion = new Companion();
    public final C19EG activity;
    public OpenResultCallback callback;
    public int enterAnim;
    public int exitAnim;
    public Intent extraParams;
    public final Fragment fragment;
    public FragmentManager fragmentManager;
    public boolean isHideCurrentFragment;
    public final FragmentNavigationContainer navigationContainer;
    public int popEnterAnim;
    public int popExitAnim;
    public PopOp popOp;
    public PushOp pushOp;
    public PushType pushType;
    public String url;

    public static final class Companion {
    }

    private final RouteIntent buildRouteIntent() {
        FragmentNavigationContainer fragmentNavigationContainer = this.navigationContainer;
        FragmentNavigationRouteIntent.Builder builder = new FragmentNavigationRouteIntent.Builder();
        builder.withFragmentNavigationContainer(fragmentNavigationContainer);
        builder.withFragmentManager(this.fragmentManager);
        builder.withPushOp(this.pushOp);
        builder.withPopOp(this.popOp);
        builder.withFragment(this.fragment);
        builder.withParam(this.extraParams);
        builder.withCallback(this.callback);
        return builder.build();
    }

    public final void commit() {
        commit(Boolean.FALSE);
    }

    public final FragmentRoute pop() {
        pop(Boolean.TRUE);
        return this;
    }

    public final C19EG getActivity() {
        return this.activity;
    }

    public FragmentRoute(FragmentNavigationContainer fragmentNavigationContainer) {
        this(null, null, fragmentNavigationContainer);
    }

    public static Bundle INVOKEVIRTUAL_com_bytedance_router_fragment_FragmentRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final void processOps(boolean z) {
        PushOp pushOp = this.pushOp;
        if (pushOp != null) {
            pushOp.setImmediate(z);
            pushOp.setPushType(this.pushType);
            pushOp.setEnterAnim(this.enterAnim);
            pushOp.setExitAnim(this.exitAnim);
            pushOp.setPopEnterAnim(this.popEnterAnim);
            pushOp.setPopExitAnim(this.popExitAnim);
            pushOp.setHideCurrentFragment(this.isHideCurrentFragment);
        }
        PopOp popOp = this.popOp;
        if (popOp != null) {
            popOp.setImmediate(z);
        }
    }

    public final void commit(Boolean bool) {
        boolean zBooleanValue;
        PopOp popOp;
        String url;
        Fragment fragment;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        processOps(zBooleanValue);
        PushOp pushOp = this.pushOp;
        if ((pushOp == null || (url = pushOp.getUrl()) == null) && ((popOp = this.popOp) == null || (url = popOp.getUrl()) == null)) {
            url = "";
        }
        RouteIntent routeIntentBuildRouteIntent = buildRouteIntent();
        if (routeIntentBuildRouteIntent != null) {
            routeIntentBuildRouteIntent.setRouteId(RouterMonitor.INSTANCE.startRoute(url));
            Context context = this.activity;
            if (context == null && ((fragment = routeIntentBuildRouteIntent.getFragment()) == null || (context = fragment.getContext()) == null)) {
                return;
            }
            RouteManager.getInstance().fragmentNavigation(context, routeIntentBuildRouteIntent);
        }
    }

    public final FragmentRoute hideCurrentFragment(boolean z) {
        this.isHideCurrentFragment = z;
        return this;
    }

    public final FragmentRoute pop(Boolean bool) {
        this.popOp = new PopOp(null, null);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            PopOp popOp = this.popOp;
            if (popOp != null) {
                popOp.setTryFinishActivity(zBooleanValue);
            }
        }
        return this;
    }

    public final FragmentRoute popTo(String str) {
        popTo(str, null, Boolean.FALSE);
        return this;
    }

    public final FragmentRoute push(String str) {
        push(str, null, null);
        return this;
    }

    public final FragmentRoute withCallback(OpenResultCallback openResultCallback) {
        this.callback = openResultCallback;
        return this;
    }

    public final FragmentRoute withFragmentManager(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
        return this;
    }

    public final FragmentRoute withNavArg(Parcelable parcelable) {
        if (parcelable != null) {
            this.extraParams.putExtra("smart_key_route_arg", parcelable);
        }
        return this;
    }

    public final FragmentRoute withParam(Intent intent) {
        Intent intent2 = this.extraParams;
        Bundle bundleINVOKEVIRTUAL_com_bytedance_router_fragment_FragmentRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_bytedance_router_fragment_FragmentRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_bytedance_router_fragment_FragmentRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            bundleINVOKEVIRTUAL_com_bytedance_router_fragment_FragmentRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = new Bundle();
        }
        intent2.putExtras(bundleINVOKEVIRTUAL_com_bytedance_router_fragment_FragmentRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
        return this;
    }

    public final FragmentRoute withPushType(PushType pushType) {
        if (pushType != null) {
            this.pushType = pushType;
        }
        return this;
    }

    public final FragmentRoute withUrl(String str) {
        this.url = str;
        return this;
    }

    public final FragmentRoute withParam(Bundle bundle) {
        this.extraParams.putExtras(bundle);
        return this;
    }

    public FragmentRoute(C19EG c19eg, FragmentNavigationContainer fragmentNavigationContainer) {
        this(c19eg, null, fragmentNavigationContainer);
    }

    public final FragmentRoute popTo(String str, String str2) {
        popTo(str, str2, Boolean.FALSE);
        return this;
    }

    public final FragmentRoute push(String str, String str2) {
        push(str, str2, null);
        return this;
    }

    public final FragmentRoute withParam(String str, byte b) {
        this.extraParams.putExtra(str, b);
        return this;
    }

    public final FragmentRoute withParamCharSequenceList(String str, ArrayList<CharSequence> arrayList) {
        this.extraParams.putCharSequenceArrayListExtra(str, arrayList);
        return this;
    }

    public final FragmentRoute withParamIntegerList(String str, ArrayList<Integer> arrayList) {
        this.extraParams.putIntegerArrayListExtra(str, arrayList);
        return this;
    }

    public final FragmentRoute withParamParcelableList(String str, ArrayList<? extends Parcelable> arrayList) {
        this.extraParams.putParcelableArrayListExtra(str, arrayList);
        return this;
    }

    public final FragmentRoute withParamStringList(String str, ArrayList<String> arrayList) {
        this.extraParams.putStringArrayListExtra(str, arrayList);
        return this;
    }

    public final FragmentRoute withParam(String str, char c) {
        this.extraParams.putExtra(str, c);
        return this;
    }

    public final FragmentRoute withParam(String str, double d) {
        this.extraParams.putExtra(str, d);
        return this;
    }

    public final FragmentRoute withParam(String str, float f) {
        this.extraParams.putExtra(str, f);
        return this;
    }

    public final FragmentRoute withParam(String str, int i) {
        this.extraParams.putExtra(str, i);
        return this;
    }

    public final FragmentRoute withParam(String str, long j) {
        this.extraParams.putExtra(str, j);
        return this;
    }

    public final FragmentRoute withParam(String str, Bundle bundle) {
        this.extraParams.putExtra(str, bundle);
        return this;
    }

    public final FragmentRoute withParam(String str, Parcelable parcelable) {
        this.extraParams.putExtra(str, parcelable);
        return this;
    }

    public final FragmentRoute withParam(String str, Serializable serializable) {
        this.extraParams.putExtra(str, serializable);
        return this;
    }

    public final FragmentRoute withParam(String str, CharSequence charSequence) {
        this.extraParams.putExtra(str, charSequence);
        return this;
    }

    public final FragmentRoute withParam(String str, String str2) {
        this.extraParams.putExtra(str, str2);
        return this;
    }

    public final FragmentRoute withParam(String str, short s) {
        this.extraParams.putExtra(str, s);
        return this;
    }

    public final FragmentRoute withParam(String str, boolean z) {
        this.extraParams.putExtra(str, z);
        return this;
    }

    public final FragmentRoute withParam(String str, byte[] bArr) {
        this.extraParams.putExtra(str, bArr);
        return this;
    }

    public final FragmentRoute withParam(String str, char[] cArr) {
        this.extraParams.putExtra(str, cArr);
        return this;
    }

    public final FragmentRoute withParam(String str, double[] dArr) {
        this.extraParams.putExtra(str, dArr);
        return this;
    }

    public final FragmentRoute withParam(String str, float[] fArr) {
        this.extraParams.putExtra(str, fArr);
        return this;
    }

    public final FragmentRoute withParam(String str, int[] iArr) {
        this.extraParams.putExtra(str, iArr);
        return this;
    }

    public final FragmentRoute withParam(String str, long[] jArr) {
        this.extraParams.putExtra(str, jArr);
        return this;
    }

    public final FragmentRoute withParam(String str, Parcelable[] parcelableArr) {
        this.extraParams.putExtra(str, parcelableArr);
        return this;
    }

    public final FragmentRoute withParam(String str, CharSequence[] charSequenceArr) {
        this.extraParams.putExtra(str, charSequenceArr);
        return this;
    }

    public final FragmentRoute withParam(String str, String[] strArr) {
        this.extraParams.putExtra(str, strArr);
        return this;
    }

    public final FragmentRoute withParam(String str, short[] sArr) {
        this.extraParams.putExtra(str, sArr);
        return this;
    }

    public final FragmentRoute withParam(String str, boolean[] zArr) {
        this.extraParams.putExtra(str, zArr);
        return this;
    }

    public FragmentRoute(C19EG c19eg, Fragment fragment, FragmentNavigationContainer fragmentNavigationContainer) {
        this.activity = c19eg;
        this.fragment = fragment;
        this.navigationContainer = fragmentNavigationContainer;
        this.pushType = PushType.REPLACE;
        this.isHideCurrentFragment = true;
        this.popEnterAnim = -1;
        this.popExitAnim = -1;
        this.enterAnim = -1;
        this.exitAnim = -1;
        this.extraParams = new Intent();
        this.url = "";
    }

    public final FragmentRoute popTo(String str, String str2, Boolean bool) {
        this.popOp = new PopOp(str, str2);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            PopOp popOp = this.popOp;
            if (popOp != null) {
                popOp.setPopInclusive(zBooleanValue);
            }
        }
        return this;
    }

    public final FragmentRoute push(String str, String str2, Integer num) {
        if (str == null) {
            return this;
        }
        this.pushOp = new PushOp(str, str2, num);
        return this;
    }

    public final FragmentRoute withAnimation(int i, int i2, int i3, int i4) {
        this.enterAnim = i;
        this.exitAnim = i2;
        this.popEnterAnim = i3;
        this.popExitAnim = i4;
        return this;
    }
}
