package com.bytedance.hybrid.spark.third.container;

import X.C1064860doi;
import X.C1318260kPQ;
import X.C14BE;
import X.C1537480q70;
import X.C292470BdF;
import X.C786410Ut5;
import X.C786500UtE;
import X.C788140Uvs;
import X.C794280VDu;
import X.InterfaceC1338650kwJ;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.security.OptIABUAExp;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public final class SparkThirdWebViewInner extends WebView implements InterfaceC1338650kwJ {
    public static final C14BE Companion = new Object() { // from class: X.14BE
    };
    public boolean canTouch;
    public long lastClickTime;
    public int mLastY;
    public int mNestedOffsetY;
    public int[] mScrollConsumed;
    public int[] mScrollOffset;
    public C1318260kPQ scrollHelper;
    public SparkThirdContext sparkThirdContext;
    public long startClickTime;
    public int timeInterval;

    private final void initNestedScrolling() {
        setNestedScrollingEnabled(false);
        this.scrollHelper = new C1318260kPQ(this);
    }

    @Override // android.webkit.WebView
    public boolean canGoBack() {
        return com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_canGoBack(this);
    }

    @Override // android.webkit.WebView
    public void goBack() {
        com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_goBack(this);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(this, str);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map map) {
        com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(this, str, map);
    }

    private final int getTimeInterval() {
        int i = this.timeInterval;
        if (i <= 0) {
            return 500;
        }
        return i;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        C1318260kPQ c1318260kPQ = this.scrollHelper;
        return c1318260kPQ != null ? c1318260kPQ.LJIIIIZZ(0) : super.hasNestedScrollingParent();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        C1318260kPQ c1318260kPQ = this.scrollHelper;
        return c1318260kPQ != null ? c1318260kPQ.LIZLLL : super.isNestedScrollingEnabled();
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        C1318260kPQ c1318260kPQ = this.scrollHelper;
        if (c1318260kPQ != null) {
            c1318260kPQ.LJIIJJI(0);
            if (Unit.LIZ != null) {
                return;
            }
        }
        super.stopNestedScroll();
    }

    private final void setWebSettings() {
        getSettings().setSupportZoom(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setBlockNetworkImage(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowFileAccess(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setGeolocationEnabled(false);
        getSettings().setCacheMode(-1);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.webkit.WebView
    public boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // android.webkit.WebView
    public void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public boolean com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner__canGoBack$___twin___() {
        try {
            return super.canGoBack();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public void com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner__goBack$___twin___() {
        try {
            super.goBack();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 1;
        }
    }

    @Override // android.webkit.WebView
    public String getOriginalUrl() {
        try {
            return super.getOriginalUrl();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // android.webkit.WebView
    public int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 100;
        }
    }

    @Override // android.webkit.WebView
    public String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // android.webkit.WebView
    public void goForward() {
        try {
            super.goForward();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final boolean hasClickInTimeInterval() {
        return System.currentTimeMillis() - this.lastClickTime < ((long) getTimeInterval());
    }

    @Override // android.webkit.WebView
    public void reload() {
        try {
            super.reload();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final SparkThirdContext getSparkThirdContext$com_bytedance_pumbaa_hybrid_container_spark_third() {
        return this.sparkThirdContext;
    }

    public final boolean isCanTouch() {
        return this.canTouch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SparkThirdWebViewInner(Context context) {
        Integer numValueOf;
        String strLIZJ;
        C1537480q70 hybridContext;
        this(context, null, 0);
        if (C292470BdF.LIZ()) {
            if (C794280VDu.LIZ(this, "csrf")) {
                C786500UtE.LIZ = getSettings().hashCode();
                return;
            }
            if ((this instanceof WebKitView) && (hybridContext = ((WebKitView) this).getHybridContext()) != null) {
                numValueOf = Integer.valueOf(hybridContext.LJ());
            } else {
                numValueOf = null;
            }
            WebSettings settings = getSettings();
            if (numValueOf != null) {
                C788140Uvs.LIZ.put(settings, numValueOf);
            }
            String userAgentString = settings.getUserAgentString();
            if (OptIABUAExp.LIZ(numValueOf)) {
                strLIZJ = OptIABUAExp.LIZJ();
                if (strLIZJ == null || strLIZJ.isEmpty()) {
                    return;
                }
            } else {
                strLIZJ = " BytedanceWebview/d8a21c6";
            }
            if (!userAgentString.contains(strLIZJ)) {
                C786410Ut5.se(settings, userAgentString.concat(strLIZJ));
            }
        }
    }

    public static boolean com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_canGoBack(SparkThirdWebViewInner sparkThirdWebViewInner) {
        if (C794280VDu.LIZ(sparkThirdWebViewInner, "seclink")) {
            return sparkThirdWebViewInner.com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner__canGoBack$___twin___();
        }
        if (sparkThirdWebViewInner.com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner__canGoBack$___twin___()) {
            C1064860doi.LIZ.getClass();
            if (C1064860doi.LIZIZ(sparkThirdWebViewInner)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_goBack(SparkThirdWebViewInner sparkThirdWebViewInner) {
        if (C794280VDu.LIZ(sparkThirdWebViewInner, "seclink")) {
            sparkThirdWebViewInner.com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner__goBack$___twin___();
            return;
        }
        C1064860doi.LIZ.getClass();
        if (C1064860doi.LIZJ(sparkThirdWebViewInner)) {
            return;
        }
        sparkThirdWebViewInner.com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner__goBack$___twin___();
    }

    private final boolean isHttpUrl(String str) {
        if (str != null && str.length() != 0) {
            if (u.LJJIIJZLJL(str, "http://", false) || u.LJJIIJZLJL(str, "https://", false)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final boolean nestedTouch(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (actionMasked == 0) {
            this.mNestedOffsetY = 0;
        }
        int y = (int) motionEvent.getY();
        motionEvent.offsetLocation(0.0f, this.mNestedOffsetY);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3 && actionMasked != 5) {
                        return false;
                    }
                } else {
                    int i2 = this.mLastY - y;
                    if (dispatchNestedPreScroll(0, i2, this.mScrollConsumed, this.mScrollOffset)) {
                        i2 -= this.mScrollConsumed[1];
                        this.mNestedOffsetY += this.mScrollOffset[1];
                    }
                    int scrollY = getScrollY();
                    int[] iArr = this.mScrollOffset;
                    this.mLastY = y - iArr[1];
                    int i3 = scrollY + i2;
                    if (i3 > 0) {
                        i = i3;
                    }
                    int i4 = i - scrollY;
                    if (dispatchNestedScroll(0, i4, 0, i2 - i4, iArr)) {
                        int i5 = this.mLastY;
                        int i6 = this.mScrollOffset[1];
                        this.mLastY = i5 - i6;
                        this.mNestedOffsetY += i6;
                    }
                    return super.onTouchEvent(motionEvent);
                }
            }
            stopNestedScroll();
            return super.onTouchEvent(motionEvent);
        }
        this.mLastY = y;
        startNestedScroll(2);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView
    public boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner__loadUrl$___twin___(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        try {
            super.goBackOrForward(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zNestedTouch = false;
        if (this.canTouch) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.startClickTime < 100) {
                    this.lastClickTime = System.currentTimeMillis();
                }
            } else {
                this.startClickTime = System.currentTimeMillis();
            }
            try {
                zNestedTouch = nestedTouch(motionEvent);
                return zNestedTouch;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return zNestedTouch;
    }

    @Override // android.webkit.WebView, android.view.View
    public void setBackgroundColor(int i) {
        try {
            super.setBackgroundColor(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void setCanTouch(boolean z) {
        this.canTouch = z;
    }

    @Override // android.webkit.WebView
    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C1318260kPQ c1318260kPQ = this.scrollHelper;
        if (c1318260kPQ != null) {
            c1318260kPQ.LJIIIZ(z);
            if (Unit.LIZ != null) {
                return;
            }
        }
        super.setNestedScrollingEnabled(z);
    }

    @Override // android.webkit.WebView
    public void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void setSparkThirdContext$com_bytedance_pumbaa_hybrid_container_spark_third(SparkThirdContext sparkThirdContext) {
        this.sparkThirdContext = sparkThirdContext;
    }

    public final void setTimeInterval(int i) {
        this.timeInterval = i;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            super.setWebViewClient(webViewClient);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        C1318260kPQ c1318260kPQ = this.scrollHelper;
        if (c1318260kPQ != null) {
            return c1318260kPQ.LJIIJ(i, 0);
        }
        return super.startNestedScroll(i);
    }

    public SparkThirdWebViewInner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(SparkThirdWebViewInner sparkThirdWebViewInner, String str) {
        if (C794280VDu.LIZ(sparkThirdWebViewInner, "seclink")) {
            sparkThirdWebViewInner.com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner__loadUrl$___twin___(str);
            return;
        }
        String strOnLoadUrl = C1064860doi.LIZ.onLoadUrl(sparkThirdWebViewInner, str);
        if (!TextUtils.isEmpty(strOnLoadUrl)) {
            str = strOnLoadUrl;
        }
        sparkThirdWebViewInner.com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner__loadUrl$___twin___(str);
    }

    public void com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner__loadUrl$___twin___(String str, Map<String, String> map) {
        try {
            super.loadUrl(str, map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        C1318260kPQ c1318260kPQ = this.scrollHelper;
        if (c1318260kPQ != null) {
            return c1318260kPQ.LIZIZ(f, f2);
        }
        return super.dispatchNestedPreFling(f, f2);
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(str, bArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SparkThirdWebViewInner(Context context, AttributeSet attributeSet, int i) {
        Integer numValueOf;
        String strLIZJ;
        C1537480q70 hybridContext;
        super(context, attributeSet, i);
        this.timeInterval = 500;
        this.canTouch = true;
        initNestedScrolling();
        setWebSettings();
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        if (C292470BdF.LIZ()) {
            if (C794280VDu.LIZ(this, "csrf")) {
                C786500UtE.LIZ = getSettings().hashCode();
                return;
            }
            if ((this instanceof WebKitView) && (hybridContext = ((WebKitView) this).getHybridContext()) != null) {
                numValueOf = Integer.valueOf(hybridContext.LJ());
            } else {
                numValueOf = null;
            }
            WebSettings settings = getSettings();
            if (numValueOf != null) {
                C788140Uvs.LIZ.put(settings, numValueOf);
            }
            String userAgentString = settings.getUserAgentString();
            if (OptIABUAExp.LIZ(numValueOf)) {
                strLIZJ = OptIABUAExp.LIZJ();
                if (strLIZJ == null || strLIZJ.isEmpty()) {
                    return;
                }
            } else {
                strLIZJ = " BytedanceWebview/d8a21c6";
            }
            if (!userAgentString.contains(strLIZJ)) {
                C786410Ut5.se(settings, userAgentString.concat(strLIZJ));
            }
        }
    }

    public static void com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(SparkThirdWebViewInner sparkThirdWebViewInner, String str, Map map) {
        if (C794280VDu.LIZ(sparkThirdWebViewInner, "seclink")) {
            sparkThirdWebViewInner.com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner__loadUrl$___twin___(str, map);
            return;
        }
        String strOnLoadUrl = C1064860doi.LIZ.onLoadUrl(sparkThirdWebViewInner, str);
        if (!TextUtils.isEmpty(strOnLoadUrl)) {
            str = strOnLoadUrl;
        }
        sparkThirdWebViewInner.com_bytedance_hybrid_spark_third_container_SparkThirdWebViewInner__loadUrl$___twin___(str, map);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        C1318260kPQ c1318260kPQ = this.scrollHelper;
        if (c1318260kPQ != null) {
            return c1318260kPQ.LIZ(f, f2, z);
        }
        return super.dispatchNestedFling(f, f2, z);
    }

    @Override // android.webkit.WebView
    public void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        C1318260kPQ c1318260kPQ = this.scrollHelper;
        if (c1318260kPQ != null) {
            return c1318260kPQ.LIZJ(i, i2, iArr, iArr2);
        }
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        C1318260kPQ c1318260kPQ = this.scrollHelper;
        if (c1318260kPQ != null) {
            return c1318260kPQ.LJ(i, i2, i3, i4, iArr);
        }
        return super.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
