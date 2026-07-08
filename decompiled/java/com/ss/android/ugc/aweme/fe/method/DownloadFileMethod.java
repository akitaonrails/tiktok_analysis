package com.ss.android.ugc.aweme.fe.method;

import X.C098200Yq;
import X.C09N5;
import X.C0VSJ;
import X.C15O7;
import X.C189200o6;
import X.C19771812Xk;
import X.C2400409as;
import X.C259800zU;
import X.C838410Wul;
import X.InterfaceC1041760dDS;
import X.InterfaceC19772112Xn;
import Y.ACallableS237S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class DownloadFileMethod extends BaseCommonJavaMethod implements IDownloadListener {
    public String LLILLL;
    public String LLILZ;
    public Integer LLILZIL;
    public String LLILZLL;

    public DownloadFileMethod() {
        super(null);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Integer num = this.LLILZIL;
        if (num != null) {
            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.mContextRef.get()).cancel(num.intValue());
        }
    }

    public DownloadFileMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, android.net.Uri] */
    public final void LIZIZ(String str) throws Throwable {
        Context context = this.mContextRef.get();
        if (context == null) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        C259800zU c259800zU = new C259800zU();
        ?? LJFF = C2400409as.LJFF(context, c0vsj.getName(), null);
        c259800zU.element = LJFF;
        if (LJFF == 0) {
            c259800zU.element = C2400409as.LIZ(context, c0vsj.getName());
        }
        C15O7.LIZJ(new ACallableS237S0200000_3(c259800zU, c0vsj, 4));
    }

    public final void LIZLLL(final JSONObject jSONObject) {
        C15O7.LIZIZ(new Callable() { // from class: X.09Nc
            public final /* synthetic */ String LLILLJJLI = "notification";
            public final /* synthetic */ int LLILZ = 3;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("DownloadFileMethod@acf9.sendEventToJs$1");
                this.LL.sendEvent(this.LLILLJJLI, jSONObject, this.LLILZ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DownloadFileMethod@acf9.sendEventToJs$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        super.attach(weakReference);
        return this;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "cancel");
        jSONObject.put("data", jSONObject2);
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, this.LLILZLL);
        jSONObject.put("eventName", "download_status_change");
        LIZLLL(jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "pause");
        jSONObject.put("data", jSONObject2);
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, this.LLILZLL);
        jSONObject.put("eventName", "download_status_change");
        LIZLLL(jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("progress", downloadInfo);
        jSONObject2.put("type", "progress");
        jSONObject.put("data", jSONObject2);
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, this.LLILZLL);
        jSONObject.put("eventName", "download_status_change");
        LIZLLL(jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "start");
        jSONObject.put("data", jSONObject2);
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, this.LLILZLL);
        jSONObject.put("eventName", "download_status_change");
        LIZLLL(jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) throws Throwable {
        String path;
        Object c098200Yq;
        if (downloadInfo == null || downloadInfo.getSavePath() == null || downloadInfo.getName() == null) {
            return;
        }
        if (u.LJJIIJZLJL(downloadInfo.getSavePath(), "content://", false)) {
            path = null;
            try {
                path = C09N5.LIZ(this.mContextRef.get(), UriProtector.parse(downloadInfo.getSavePath()));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        } else {
            path = new C0VSJ(downloadInfo.getSavePath(), downloadInfo.getName()).getPath();
            if (TextUtils.equals(this.LLILZ, "image") && path != null) {
                LIZIZ(path);
            }
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "success");
        if (path != null) {
            jSONObject2.put("path", path);
        }
        jSONObject.put("data", jSONObject2);
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, this.LLILZLL);
        jSONObject.put("eventName", "download_status_change");
        LIZLLL(jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018f  */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, X.0VSJ, java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(org.json.JSONObject r18, X.InterfaceC1041760dDS r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod.LIZJ(org.json.JSONObject, X.0dDS):void");
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(final JSONObject jSONObject, final InterfaceC1041760dDS interfaceC1041760dDS) throws Throwable {
        final Activity activity;
        Object obj;
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null && (obj = (Context) weakReference.get()) != null && (obj instanceof LifecycleOwner)) {
            ((LifecycleOwner) obj).getLifecycle().addObserver(this);
        }
        Context actContext = getActContext();
        if ((actContext instanceof Activity) && (activity = (Activity) actContext) != null) {
            if (Build.VERSION.SDK_INT < 33 && C838410Wul.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                C19771812Xk.LIZIZ(activity, TokenCert.Companion.with("bpea-download_file_method_write_storage_permission"), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new InterfaceC19772112Xn() { // from class: X.09Nb
                    @Override // X.InterfaceC19772112Xn
                    public final void LIZ(int[] iArr, String[] strArr) throws Throwable {
                        if (iArr != null && iArr.length != 0 && iArr[0] == 0) {
                            this.LIZ.LIZJ(jSONObject, interfaceC1041760dDS);
                            return;
                        }
                        C1389890mGx c1389890mGx = new C1389890mGx(activity);
                        c1389890mGx.LJIIJ(activity.getString(2131826621));
                        c1389890mGx.LJIIJJI();
                    }
                });
            } else {
                LIZJ(jSONObject, interfaceC1041760dDS);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "error");
        jSONObject.put("data", jSONObject2);
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, this.LLILZLL);
        jSONObject.put("eventName", "download_status_change");
        LIZLLL(jSONObject);
        if (TextUtils.equals(this.LLILZ, "image")) {
            this.mContextRef.get();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "restart");
        jSONObject.put("data", jSONObject2);
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, this.LLILZLL);
        jSONObject.put("eventName", "download_status_change");
        LIZLLL(jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "restart");
        jSONObject.put("data", jSONObject2);
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, this.LLILZLL);
        jSONObject.put("eventName", "download_status_change");
        LIZLLL(jSONObject);
    }
}
