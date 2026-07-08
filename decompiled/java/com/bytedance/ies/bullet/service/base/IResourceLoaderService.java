package com.bytedance.ies.bullet.service.base;

import X.C1533580q0i;
import X.C1868620yj6;
import X.C20115613nG;
import X.C20116013nK;
import X.EnumC310740CGa;
import X.InterfaceC20114113n1;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public interface IResourceLoaderService extends InterfaceC20114113n1 {
    void cancel(C20115613nG c20115613nG);

    void deleteResource(C1868620yj6 c1868620yj6);

    /* synthetic */ String getBid();

    Map<String, String> getPreloadConfigs();

    C1533580q0i getResourceConfig();

    void init(C1533580q0i c1533580q0i);

    C20115613nG loadAsync(String str, C20116013nK c20116013nK, Function1<? super C1868620yj6, Unit> function1, Function1<? super Throwable, Unit> function12);

    C1868620yj6 loadSync(String str, C20116013nK c20116013nK);

    /* synthetic */ void onRegister(String str);

    @Override // X.InterfaceC20114113n1
    /* synthetic */ void onUnRegister();

    void registerConfig(String str, GeckoConfig geckoConfig);

    void registerCustomLoader(Class<? extends IXResourceLoader> cls, EnumC310740CGa enumC310740CGa);

    void unRegisterConfig(String str);

    void unregisterCustomLoader(Class<? extends IXResourceLoader> cls, EnumC310740CGa enumC310740CGa);
}
