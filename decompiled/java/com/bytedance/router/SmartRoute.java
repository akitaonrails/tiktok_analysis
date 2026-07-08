package com.bytedance.router;

import X.C786410Ut5;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.monitor.RouterMonitor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.util.ContextExtensionKt;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public class SmartRoute {
    public Bundle mAnimationBundle;
    public OpenResultCallback mCallback;
    public Context mContext;
    public Uri mData;
    public Intent mExtraParams;
    public String mUrl = "";
    public String mCaller = "";
    public int enterAnim = -1;
    public int exitAnim = -1;
    public Boolean mExternalType = Boolean.FALSE;
    public Fragment mFragment = null;

    public Intent buildIntent() {
        RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
        String strStartRoute = routerMonitor.startRoute(this.mUrl);
        if (this.mCallback != null) {
            RouteManager.getInstance().setTempResultCallback(this.mCallback);
        }
        if (TextUtils.isEmpty(this.mUrl) || !Util.isLegalUrl(this.mUrl)) {
            Logger.e("SmartRoute#buildIntent error!!!");
            RouteManager.getInstance().getRouteCallbackProxy().onFail(this.mUrl, "SmartRoute#buildIntent error!");
            return null;
        }
        RouteIntent routeIntentBuildRouteIntent = buildRouteIntent();
        routeIntentBuildRouteIntent.setRouteId(strStartRoute);
        if (this.mContext == null) {
            return null;
        }
        Intent intentBuildIntent = RouteManager.getInstance().buildIntent(this.mContext, routeIntentBuildRouteIntent);
        routerMonitor.reportSuccess(strStartRoute);
        return intentBuildIntent;
    }

    public RouteIntent buildRouteIntent() {
        Intent intent = this.mExtraParams;
        int flags = intent != null ? intent.getFlags() : 0;
        String str = this.mUrl;
        if (str != null) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "launchFlag");
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                try {
                    flags = Integer.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).intValue();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        RouteIntent.Builder builder = new RouteIntent.Builder();
        builder.withUrl(this.mUrl);
        builder.withCaller(this.mCaller);
        builder.withParam(this.mExtraParams);
        builder.withAnimation(this.enterAnim, this.exitAnim);
        builder.withExternalType(this.mExternalType.booleanValue());
        builder.addFlags(flags);
        OpenResultCallback openResultCallback = this.mCallback;
        if (openResultCallback != null) {
            builder.withCallback(openResultCallback);
        }
        Uri uri = this.mData;
        if (uri != null) {
            builder.withData(uri);
        }
        Bundle bundle = this.mAnimationBundle;
        if (bundle != null) {
            builder.withBundleAnimation(bundle);
        }
        return builder.build();
    }

    public void open() {
        RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
        String strStartRoute = routerMonitor.startRoute(this.mUrl);
        routerMonitor.collectParams(strStartRoute, INVOKEVIRTUAL_com_bytedance_router_SmartRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this.mExtraParams));
        if (this.mCallback != null) {
            RouteManager.getInstance().setTempResultCallback(this.mCallback);
        }
        RouterPageMonitor routerPageMonitor = RouterPageMonitor.INSTANCE;
        routerPageMonitor.getDispatcher().dispatchSmartRouteOpen(this.mContext, this.mExtraParams, strStartRoute, "SmartRoute_open", this.mCaller);
        if (this.mContext != null && !TextUtils.isEmpty(this.mUrl) && Util.isLegalUrl(this.mUrl)) {
            RouteIntent routeIntentBuildRouteIntent = buildRouteIntent();
            routeIntentBuildRouteIntent.setRouteId(strStartRoute);
            RouteManager.getInstance().open(this.mContext, routeIntentBuildRouteIntent);
        } else {
            Logger.e("SmartRoute#open error");
            routerMonitor.reportFail(strStartRoute, "SmartRoute#open error");
            RouteManager.getInstance().getRouteCallbackProxy().onFail(this.mUrl, "SmartRoute#open error");
            routerPageMonitor.getDispatcher().dispatchSmartRouteFailed(strStartRoute);
        }
    }

    public SmartRoute(Context context) {
        Activity activity;
        this.mContext = context;
        if (context != null && (activity = ContextExtensionKt.getActivity(context)) != null) {
            this.mContext = activity;
        }
        this.mExtraParams = new Intent();
    }

    public static Bundle INVOKEVIRTUAL_com_bytedance_router_SmartRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public SmartRoute addFlags(int i) {
        this.mExtraParams.addFlags(i);
        return this;
    }

    public void open(int i) {
        open(i, null);
    }

    public SmartRoute setExternal(boolean z) {
        this.mExternalType = Boolean.valueOf(z);
        return this;
    }

    public SmartRoute withBundleAnimation(Bundle bundle) {
        this.mAnimationBundle = bundle;
        return this;
    }

    public SmartRoute withCallback(OpenResultCallback openResultCallback) {
        this.mCallback = openResultCallback;
        return this;
    }

    public SmartRoute withCaller(String str) {
        this.mCaller = str;
        return this;
    }

    public SmartRoute withFragment(Fragment fragment) {
        this.mFragment = fragment;
        return this;
    }

    public SmartRoute withNavArg(Parcelable parcelable) {
        if (parcelable != null) {
            this.mExtraParams.putExtra("smart_key_route_arg", parcelable);
        }
        return this;
    }

    public SmartRoute withParam(Intent intent) {
        if (INVOKEVIRTUAL_com_bytedance_router_SmartRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent) != null) {
            if (INVOKEVIRTUAL_com_bytedance_router_SmartRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this.mExtraParams) == null) {
                this.mExtraParams.putExtras(new Bundle());
            }
            C786410Ut5.LJJIIJZLJL(INVOKEVIRTUAL_com_bytedance_router_SmartRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this.mExtraParams), INVOKEVIRTUAL_com_bytedance_router_SmartRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent));
        }
        return this;
    }

    public SmartRoute withUrl(String str) {
        this.mUrl = str;
        return this;
    }

    public SmartRoute withParam(Bundle bundle) {
        if (bundle != null) {
            this.mExtraParams.putExtras(bundle);
        }
        return this;
    }

    public SmartRoute withParam(Uri uri) {
        this.mData = uri;
        return this;
    }

    public void open(int i, OnActivityResultCallback onActivityResultCallback) {
        RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
        String strStartRoute = routerMonitor.startRoute(this.mUrl);
        routerMonitor.collectParams(strStartRoute, INVOKEVIRTUAL_com_bytedance_router_SmartRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this.mExtraParams));
        RouterPageMonitor routerPageMonitor = RouterPageMonitor.INSTANCE;
        routerPageMonitor.getDispatcher().dispatchSmartRouteOpen(this.mContext, this.mExtraParams, strStartRoute, "SmartRoute_open_2", this.mCaller);
        if (i != Integer.MIN_VALUE) {
            if (this.mCallback != null) {
                RouteManager.getInstance().setTempResultCallback(this.mCallback);
            }
            if (this.mContext != null && !TextUtils.isEmpty(this.mUrl) && Util.isLegalUrl(this.mUrl) && (ContextExtensionKt.getActivity(this.mContext) instanceof Activity)) {
                RouteIntent routeIntentBuildRouteIntent = buildRouteIntent();
                routeIntentBuildRouteIntent.setRequestCode(i);
                routeIntentBuildRouteIntent.setRouteId(strStartRoute);
                if (onActivityResultCallback != null) {
                    routeIntentBuildRouteIntent.setOnActivityResultCallback(onActivityResultCallback);
                }
                Fragment fragment = this.mFragment;
                if (fragment != null) {
                    routeIntentBuildRouteIntent.setFragment(fragment);
                }
                RouteManager.getInstance().open(this.mContext, routeIntentBuildRouteIntent);
                return;
            }
            RouteManager.getInstance().getRouteCallbackProxy().onFail(this.mUrl, "SmartRoute#open(int requestCode) error!");
            routerPageMonitor.getDispatcher().dispatchSmartRouteFailed(strStartRoute);
            Logger.e("SmartRoute#open(int requestCode) error");
            return;
        }
        routerMonitor.reportFail(strStartRoute, "requestCode must not be Integer.MIN_VALUE:-2147483648 !!!");
        routerPageMonitor.getDispatcher().dispatchSmartRouteFailed(strStartRoute);
        throw new IllegalArgumentException("requestCode must not be Integer.MIN_VALUE:-2147483648 !!!");
    }

    public SmartRoute withAnimation(int i, int i2) {
        this.enterAnim = i;
        this.exitAnim = i2;
        return this;
    }

    public SmartRoute withParam(String str, byte b) {
        this.mExtraParams.putExtra(str, b);
        return this;
    }

    public SmartRoute withParamCharSequenceList(String str, ArrayList<CharSequence> arrayList) {
        this.mExtraParams.putCharSequenceArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamIntegerList(String str, ArrayList<Integer> arrayList) {
        this.mExtraParams.putIntegerArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamParcelableList(String str, ArrayList<? extends Parcelable> arrayList) {
        this.mExtraParams.putParcelableArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamStringList(String str, ArrayList<String> arrayList) {
        this.mExtraParams.putStringArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParam(String str, char c) {
        this.mExtraParams.putExtra(str, c);
        return this;
    }

    public SmartRoute withParam(String str, double d) {
        this.mExtraParams.putExtra(str, d);
        return this;
    }

    public SmartRoute withParam(String str, float f) {
        this.mExtraParams.putExtra(str, f);
        return this;
    }

    public SmartRoute withParam(String str, int i) {
        this.mExtraParams.putExtra(str, i);
        return this;
    }

    public SmartRoute withParam(String str, long j) {
        this.mExtraParams.putExtra(str, j);
        return this;
    }

    public SmartRoute withParam(String str, Bundle bundle) {
        this.mExtraParams.putExtra(str, bundle);
        return this;
    }

    public SmartRoute withParam(String str, Parcelable parcelable) {
        this.mExtraParams.putExtra(str, parcelable);
        return this;
    }

    public SmartRoute withParam(String str, Serializable serializable) {
        this.mExtraParams.putExtra(str, serializable);
        return this;
    }

    public SmartRoute withParam(String str, CharSequence charSequence) {
        this.mExtraParams.putExtra(str, charSequence);
        return this;
    }

    public SmartRoute withParam(String str, String str2) {
        this.mExtraParams.putExtra(str, str2);
        return this;
    }

    public SmartRoute withParam(String str, short s) {
        this.mExtraParams.putExtra(str, s);
        return this;
    }

    public SmartRoute withParam(String str, boolean z) {
        this.mExtraParams.putExtra(str, z);
        return this;
    }

    public SmartRoute withParam(String str, byte[] bArr) {
        this.mExtraParams.putExtra(str, bArr);
        return this;
    }

    public SmartRoute withParam(String str, char[] cArr) {
        this.mExtraParams.putExtra(str, cArr);
        return this;
    }

    public SmartRoute withParam(String str, double[] dArr) {
        this.mExtraParams.putExtra(str, dArr);
        return this;
    }

    public SmartRoute withParam(String str, float[] fArr) {
        this.mExtraParams.putExtra(str, fArr);
        return this;
    }

    public SmartRoute withParam(String str, int[] iArr) {
        this.mExtraParams.putExtra(str, iArr);
        return this;
    }

    public SmartRoute withParam(String str, long[] jArr) {
        this.mExtraParams.putExtra(str, jArr);
        return this;
    }

    public SmartRoute withParam(String str, Parcelable[] parcelableArr) {
        this.mExtraParams.putExtra(str, parcelableArr);
        return this;
    }

    public SmartRoute withParam(String str, CharSequence[] charSequenceArr) {
        this.mExtraParams.putExtra(str, charSequenceArr);
        return this;
    }

    public SmartRoute withParam(String str, String[] strArr) {
        this.mExtraParams.putExtra(str, strArr);
        return this;
    }

    public SmartRoute withParam(String str, short[] sArr) {
        this.mExtraParams.putExtra(str, sArr);
        return this;
    }

    public SmartRoute withParam(String str, boolean[] zArr) {
        this.mExtraParams.putExtra(str, zArr);
        return this;
    }
}
