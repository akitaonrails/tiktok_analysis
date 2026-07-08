package com.ss.android.ugc.aweme.commercialize.hybrid.api;

import X.AbstractC1067720dtK;
import X.C1015060cWO;
import X.C1028380crs;
import X.C1051290dSp;
import X.C1ER0;
import X.C830490Whz;
import X.InterfaceC1028390crt;
import X.InterfaceC1028400cru;
import X.InterfaceC1034470d1h;
import X.InterfaceC1036150d4P;
import X.InterfaceC1036870d5Z;
import X.InterfaceC1051190dSf;
import X.InterfaceC1051330dSt;
import X.InterfaceC1051480dT8;
import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public abstract class IAdHybridCustomLoader {
    public InterfaceC1028400cru adRenderLifecycle;
    public InterfaceC1028390crt iAdHybridPreRenderStatus;

    public abstract void close();

    public abstract InterfaceC1034470d1h createHybridFragment(C1051290dSp c1051290dSp, boolean z, C830490Whz<String, Object> c830490Whz);

    public abstract void destroy();

    public C1015060cWO getPerfMetricsModel() {
        return null;
    }

    public abstract void initialize(String str, Context context);

    public abstract boolean isRendering();

    public abstract void notifyFE(String str, JSONObject jSONObject);

    public abstract void onHide();

    public abstract void onPreRender(C1028380crs c1028380crs, C1051290dSp c1051290dSp);

    public abstract void onRender(C1028380crs c1028380crs, C1051290dSp c1051290dSp, InterfaceC1051190dSf interfaceC1051190dSf);

    public abstract void onShowFailed(String str, String str2);

    public abstract void onShowSuccess();

    public abstract void refresh();

    public abstract void registAdWebFragmentViewProvider(InterfaceC1036870d5Z interfaceC1036870d5Z);

    public abstract void registerActivityCallback(C1ER0 c1er0);

    public abstract void registerActivityRootViewProvider(InterfaceC1051330dSt interfaceC1051330dSt);

    public abstract void registerHybridRootContainer(InterfaceC1036150d4P interfaceC1036150d4P);

    public abstract void registerTitleBarProvider(AbstractC1067720dtK abstractC1067720dtK);

    public abstract void releaseCache();

    public abstract void releaseCacheWithKey(String str);

    public abstract void renderFullScreen(C1051290dSp c1051290dSp);

    public abstract void renderPopup(C1051290dSp c1051290dSp, InterfaceC1051480dT8 interfaceC1051480dT8);

    public abstract void router(Context context, String str);

    public abstract void updateGlobalProps(Map<String, ? extends Object> map);

    public final InterfaceC1028400cru getAdRenderLifecycle() {
        return this.adRenderLifecycle;
    }

    public final InterfaceC1028390crt getIAdHybridPreRenderStatus() {
        return this.iAdHybridPreRenderStatus;
    }

    public final void setAdRenderLifecycle(InterfaceC1028400cru interfaceC1028400cru) {
        this.adRenderLifecycle = interfaceC1028400cru;
    }

    public final void setIAdHybridPreRenderStatus(InterfaceC1028390crt interfaceC1028390crt) {
        this.iAdHybridPreRenderStatus = interfaceC1028390crt;
    }

    public final void preRender(C1028380crs c1028380crs, C1051290dSp c1051290dSp, InterfaceC1028390crt interfaceC1028390crt) {
        this.iAdHybridPreRenderStatus = interfaceC1028390crt;
        onPreRender(c1028380crs, c1051290dSp);
    }

    public final void render(C1028380crs c1028380crs, C1051290dSp c1051290dSp, InterfaceC1051190dSf interfaceC1051190dSf, InterfaceC1028400cru interfaceC1028400cru) {
        this.adRenderLifecycle = interfaceC1028400cru;
        onRender(c1028380crs, c1051290dSp, interfaceC1051190dSf);
    }
}
