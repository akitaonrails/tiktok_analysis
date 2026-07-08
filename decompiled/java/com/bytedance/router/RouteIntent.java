package com.bytedance.router;

import X.C2188811AlT;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class RouteIntent {
    public Bundle mAnimationBundle;
    public OpenResultCallback mCallback;
    public Uri mData;
    public boolean mExternalType;
    public Intent mExtraIntent;
    public Fragment mFragment;
    public OnActivityResultCallback mOnActivityResultCallback;
    public Uri mUri;
    public String routeId;
    public String mOriginUrl = "";
    public String mUrl = "";
    public String mCaller = "";
    public String mScheme = "";
    public String mHost = "";
    public String mPath = "";
    public int enterAnim = -1;
    public int exitAnim = -1;
    public int mRequestCode = Integer.MIN_VALUE;
    public boolean needIntercept = true;

    public static class Builder {
        public int enterAnim;
        public int exitAnim;
        public Bundle mAnimationBundle;
        public OpenResultCallback mCallback;
        public String mCaller;
        public Uri mData;
        public Boolean mExternalType;
        public Intent mExtraParams;
        public boolean mNeedIntercept;
        public String mUrl;

        public RouteIntent build() {
            RouteIntent routeIntent = new RouteIntent();
            apply(routeIntent);
            return routeIntent;
        }

        public Builder() {
            this.mUrl = "";
            this.mCaller = "";
            this.mExtraParams = new Intent();
            this.enterAnim = -1;
            this.exitAnim = -1;
            this.mCallback = null;
            this.mExternalType = Boolean.FALSE;
            this.mNeedIntercept = true;
        }

        public Builder(String str) {
            this.mUrl = "";
            this.mCaller = "";
            this.mExtraParams = new Intent();
            this.enterAnim = -1;
            this.exitAnim = -1;
            this.mCallback = null;
            this.mExternalType = Boolean.FALSE;
            this.mNeedIntercept = true;
            this.mUrl = str;
        }

        public Builder addFlags(int i) {
            this.mExtraParams.addFlags(i);
            return this;
        }

        public void apply(RouteIntent routeIntent) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Build RouteIntent url: ");
            sbLIZ.append(this.mUrl);
            Logger.d(C2188811AlT.LIZIZ(sbLIZ));
            RouteIntent.sliceParams2Intent(this.mExtraParams, this.mUrl, false);
            routeIntent.setOriginUrl(this.mUrl);
            routeIntent.setCaller(this.mCaller);
            routeIntent.setExtra(this.mExtraParams);
            routeIntent.setAnimation(this.enterAnim, this.exitAnim);
            Bundle bundle = this.mAnimationBundle;
            if (bundle != null) {
                routeIntent.setAnimationBundle(bundle);
            }
            Uri uri = this.mData;
            if (uri != null) {
                routeIntent.setData(uri);
            }
            routeIntent.setExternalType(this.mExternalType.booleanValue());
            routeIntent.setNeedIntercept(this.mNeedIntercept);
            OpenResultCallback openResultCallback = this.mCallback;
            if (openResultCallback != null) {
                routeIntent.setCallback(openResultCallback);
            }
            routeIntent.parseUrl();
        }

        public Builder needIntercept(boolean z) {
            this.mNeedIntercept = z;
            return this;
        }

        public Builder withBundleAnimation(Bundle bundle) {
            this.mAnimationBundle = bundle;
            return this;
        }

        public Builder withCallback(OpenResultCallback openResultCallback) {
            this.mCallback = openResultCallback;
            return this;
        }

        public Builder withCaller(String str) {
            this.mCaller = str;
            return this;
        }

        public Builder withData(Uri uri) {
            this.mData = uri;
            return this;
        }

        public Builder withExternalType(boolean z) {
            this.mExternalType = Boolean.valueOf(z);
            return this;
        }

        public Builder withParam(Intent intent) {
            this.mExtraParams.putExtras(intent);
            return this;
        }

        public Builder withUrl(String str) {
            this.mUrl = str;
            return this;
        }

        public Builder withAnimation(int i, int i2) {
            this.enterAnim = i;
            this.exitAnim = i2;
            return this;
        }
    }

    public boolean hasRequestCode() {
        return this.mRequestCode != Integer.MIN_VALUE;
    }

    public void parseUrl() {
        Intent intent;
        if (TextUtils.isEmpty(this.mUrl)) {
            return;
        }
        Uri uri = UriProtector.parse(this.mUrl);
        this.mUri = uri;
        if (uri == null || (intent = this.mExtraIntent) == null) {
            return;
        }
        intent.setData(uri);
        this.mScheme = this.mUri.getScheme();
        this.mHost = this.mUri.getHost();
        String path = this.mUri.getPath();
        this.mPath = path;
        if (this.mScheme == null) {
            this.mScheme = "";
        }
        if (this.mHost == null) {
            this.mHost = "";
        }
        if (path == null) {
            this.mPath = "";
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RouteIntent{mOriginUrl='");
        sbLIZ.append(this.mOriginUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", mExtraIntent=");
        sbLIZ.append(this.mExtraIntent);
        sbLIZ.append(", mUrl='");
        sbLIZ.append(this.mUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", mUri=");
        sbLIZ.append(this.mUri);
        sbLIZ.append(", mScheme='");
        sbLIZ.append(this.mScheme);
        sbLIZ.append('\'');
        sbLIZ.append(", mHost='");
        sbLIZ.append(this.mHost);
        sbLIZ.append('\'');
        sbLIZ.append(", mPath='");
        sbLIZ.append(this.mPath);
        sbLIZ.append('\'');
        sbLIZ.append(", enterAnim=");
        sbLIZ.append(this.enterAnim);
        sbLIZ.append(", exitAnim=");
        sbLIZ.append(this.exitAnim);
        sbLIZ.append(", mRequestCode=");
        sbLIZ.append(this.mRequestCode);
        sbLIZ.append(", mOnActivityResultCallback=");
        sbLIZ.append(this.mOnActivityResultCallback);
        sbLIZ.append(", mFragment=");
        sbLIZ.append(this.mFragment);
        sbLIZ.append(", mCallback=");
        sbLIZ.append(this.mCallback);
        sbLIZ.append(", mAnimationBundle=");
        sbLIZ.append(this.mAnimationBundle);
        sbLIZ.append(", mData=");
        sbLIZ.append(this.mData);
        sbLIZ.append(", mExternalType=");
        sbLIZ.append(this.mExternalType);
        sbLIZ.append(", needIntercept=");
        sbLIZ.append(this.needIntercept);
        sbLIZ.append(", routeId='");
        sbLIZ.append(this.routeId);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Bundle getAnimationBundle() {
        return this.mAnimationBundle;
    }

    public OpenResultCallback getCallback() {
        return this.mCallback;
    }

    public String getCaller() {
        return this.mCaller;
    }

    public Uri getData() {
        return this.mData;
    }

    public int getEnterAnim() {
        return this.enterAnim;
    }

    public int getExitAnim() {
        return this.exitAnim;
    }

    public Intent getExtra() {
        return this.mExtraIntent;
    }

    public Fragment getFragment() {
        return this.mFragment;
    }

    public String getHost() {
        return this.mHost;
    }

    public boolean getNeedIntercept() {
        return this.needIntercept;
    }

    public OnActivityResultCallback getOnActivityResultCallback() {
        return this.mOnActivityResultCallback;
    }

    public String getOriginUrl() {
        return this.mOriginUrl;
    }

    public String getPath() {
        return this.mPath;
    }

    public int getRequestCode() {
        return this.mRequestCode;
    }

    public String getRouteId() {
        return this.routeId;
    }

    public String getScheme() {
        return this.mScheme;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean isExternalType() {
        return this.mExternalType;
    }

    public void setAnimationBundle(Bundle bundle) {
        this.mAnimationBundle = bundle;
    }

    public void setCallback(OpenResultCallback openResultCallback) {
        this.mCallback = openResultCallback;
    }

    public void setCaller(String str) {
        this.mCaller = str;
    }

    public void setData(Uri uri) {
        this.mData = uri;
    }

    public void setExternalType(boolean z) {
        this.mExternalType = z;
    }

    public void setExtra(Intent intent) {
        this.mExtraIntent = intent;
    }

    public void setFragment(Fragment fragment) {
        this.mFragment = fragment;
    }

    public void setNeedIntercept(boolean z) {
        this.needIntercept = z;
    }

    public void setOnActivityResultCallback(OnActivityResultCallback onActivityResultCallback) {
        this.mOnActivityResultCallback = onActivityResultCallback;
    }

    public void setOriginUrl(String str) {
        this.mOriginUrl = str;
        if (!this.mUrl.equals(str)) {
            this.mUrl = this.mOriginUrl;
        }
    }

    public void setRequestCode(int i) {
        this.mRequestCode = i;
    }

    public void setRouteId(String str) {
        this.routeId = str;
    }

    public void setUrl(String str) {
        if (str == null) {
            return;
        }
        if (Util.isLegalUrl(str)) {
            if (!str.equals(this.mUrl)) {
                this.mUrl = str;
                parseUrl();
                sliceParams2Intent(this.mExtraIntent, this.mUrl, true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("url is illegal!!!");
    }

    public void setAnimation(int i, int i2) {
        this.enterAnim = i;
        this.exitAnim = i2;
    }

    public static void sliceParams2Intent(Intent intent, String str, boolean z) {
        Map<String, String> mapSliceUrlParams;
        if (intent != null && (mapSliceUrlParams = Util.sliceUrlParams(str)) != null && mapSliceUrlParams.size() != 0) {
            for (Map.Entry<String, String> entry : mapSliceUrlParams.entrySet()) {
                if (z) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                } else if (!intent.hasExtra(entry.getKey())) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
