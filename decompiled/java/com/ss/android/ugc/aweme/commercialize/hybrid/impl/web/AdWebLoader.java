package com.ss.android.ugc.aweme.commercialize.hybrid.impl.web;

import X.AbstractC1067720dtK;
import X.C1028380crs;
import X.C1035770d3n;
import X.C1035820d3s;
import X.C1035880d3y;
import X.C1036770d5P;
import X.C1051290dSp;
import X.C1ER0;
import X.C830490Whz;
import X.InterfaceC1034470d1h;
import X.InterfaceC1036150d4P;
import X.InterfaceC1036870d5Z;
import X.InterfaceC1038080d7W;
import X.InterfaceC1051190dSf;
import X.InterfaceC1051330dSt;
import X.InterfaceC1051480dT8;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.crash.Npth;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebJumpInterceptor;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebLoader extends IAdHybridCustomLoader {
    public static final C1035820d3s Companion = new Object() { // from class: X.0d3s
    };
    public static String tag = "AdSparkHybridLoader";
    public InterfaceC1036150d4P adWebContainer;
    public InterfaceC1036870d5Z adWebFragmentViewProvider;
    public Context context;
    public String scene;

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void close() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void destroy() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public boolean isRendering() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void notifyFE(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onHide() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onPreRender(C1028380crs c1028380crs, C1051290dSp c1051290dSp) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onRender(C1028380crs c1028380crs, C1051290dSp c1051290dSp, InterfaceC1051190dSf interfaceC1051190dSf) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onShowFailed(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onShowSuccess() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void refresh() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerActivityCallback(C1ER0 c1er0) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerActivityRootViewProvider(InterfaceC1051330dSt interfaceC1051330dSt) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerTitleBarProvider(AbstractC1067720dtK abstractC1067720dtK) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void releaseCache() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void releaseCacheWithKey(String str) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void renderPopup(C1051290dSp c1051290dSp, InterfaceC1051480dT8 interfaceC1051480dT8) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void updateGlobalProps(Map<String, ? extends Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registAdWebFragmentViewProvider(InterfaceC1036870d5Z interfaceC1036870d5Z) {
        this.adWebFragmentViewProvider = interfaceC1036870d5Z;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerHybridRootContainer(InterfaceC1036150d4P interfaceC1036150d4P) {
        this.adWebContainer = interfaceC1036150d4P;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void renderFullScreen(C1051290dSp c1051290dSp) {
        String str;
        C1035770d3n c1035770d3n = c1051290dSp.LJI;
        if (c1035770d3n != null && (str = c1035770d3n.LIZ) != null) {
            C1036770d5P c1036770d5P = C1036770d5P.LIZ;
            Context context = this.context;
            if (context == null) {
                context = null;
            }
            Bundle bundle = c1035770d3n.LIZIZ;
            C1035880d3y c1035880d3y = c1035770d3n.LIZJ;
            InterfaceC1038080d7W interfaceC1038080d7W = c1035770d3n.LIZLLL;
            InterfaceC1036870d5Z interfaceC1036870d5Z = this.adWebFragmentViewProvider;
            InterfaceC1036150d4P interfaceC1036150d4P = this.adWebContainer;
            c1036770d5P.getClass();
            AdWebJumpInterceptor.LIZJ().LIZIZ(context, C1036770d5P.LIZ(context, str, bundle, c1035880d3y, interfaceC1038080d7W, interfaceC1036870d5Z, interfaceC1036150d4P), false);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void initialize(String str, Context context) {
        this.context = context;
        this.scene = str;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void router(Context context, String str) {
        SmartRouter.buildRoute(context, str).open();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public InterfaceC1034470d1h createHybridFragment(C1051290dSp c1051290dSp, boolean z, C830490Whz<String, Object> c830490Whz) {
        String creativeIdStr;
        Object obj;
        C1035880d3y c1035880d3y;
        AwemeRawAd awemeRawAd;
        String str;
        C1035770d3n c1035770d3n = c1051290dSp.LJI;
        Context context = null;
        if (c1035770d3n == null || c1035770d3n.LIZ == null) {
            HashMap map = new HashMap();
            C1035770d3n c1035770d3n2 = c1051290dSp.LJI;
            if (c1035770d3n2 == null || (c1035880d3y = c1035770d3n2.LIZJ) == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || (creativeIdStr = awemeRawAd.getCreativeIdStr()) == null) {
                creativeIdStr = "";
            }
            map.put("creative_id", creativeIdStr);
            String str2 = "1";
            if (c1051290dSp.LJI == null) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("webRenderParam is null", obj);
            C1035770d3n c1035770d3n3 = c1051290dSp.LJI;
            if (c1035770d3n3 != null && c1035770d3n3.LIZ != null) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("h5Url is null", str2);
            Npth.reportBizException("iab", new Throwable(map.toString()), map.toString(), (Map<String, String>) map, true);
        }
        C1035770d3n c1035770d3n4 = c1051290dSp.LJI;
        if (c1035770d3n4 == null || (str = c1035770d3n4.LIZ) == null) {
            return null;
        }
        C1036770d5P c1036770d5P = C1036770d5P.LIZ;
        Context context2 = this.context;
        if (context2 != null) {
            context = context2;
        }
        Bundle bundle = c1035770d3n4.LIZIZ;
        C1035880d3y c1035880d3y2 = c1035770d3n4.LIZJ;
        InterfaceC1038080d7W interfaceC1038080d7W = c1035770d3n4.LIZLLL;
        InterfaceC1036870d5Z interfaceC1036870d5Z = this.adWebFragmentViewProvider;
        InterfaceC1036150d4P interfaceC1036150d4P = this.adWebContainer;
        c1036770d5P.getClass();
        return C1036770d5P.LIZIZ(z, context, str, bundle, c1035880d3y2, interfaceC1038080d7W, interfaceC1036870d5Z, interfaceC1036150d4P);
    }
}
