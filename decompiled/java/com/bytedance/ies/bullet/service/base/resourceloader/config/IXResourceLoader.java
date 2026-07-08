package com.bytedance.ies.bullet.service.base.resourceloader.config;

import X.C098200Yq;
import X.C1868620yj6;
import X.C189200o6;
import X.C20114313n3;
import X.C20114513n5;
import X.C20115113nB;
import X.C20116013nK;
import X.EnumC20115313nD;
import X.InterfaceC20115013nA;
import X.InterfaceC20115413nE;
import android.util.Log;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public abstract class IXResourceLoader implements InterfaceC20115013nA {
    public final String TAG = getClass().getSimpleName();
    public C20114513n5 loaderLogger;
    public IResourceLoaderService service;

    public abstract void cancelLoad();

    public abstract void loadAsync(C1868620yj6 c1868620yj6, C20116013nK c20116013nK, Function1<? super C1868620yj6, Unit> function1, Function1<? super Throwable, Unit> function12);

    public abstract C1868620yj6 loadSync(C1868620yj6 c1868620yj6, C20116013nK c20116013nK);

    @Override // X.InterfaceC20115013nA
    public C20114513n5 getLoggerWrapper() {
        C20114513n5 c20114513n5 = this.loaderLogger;
        return c20114513n5 == null ? ((C20114313n3) getService()).getLoggerWrapper() : c20114513n5;
    }

    public final IResourceLoaderService getService() {
        IResourceLoaderService iResourceLoaderService = this.service;
        if (iResourceLoaderService != null) {
            return iResourceLoaderService;
        }
        return null;
    }

    public final C20114513n5 getLoaderLogger() {
        return this.loaderLogger;
    }

    public String getTAG() {
        return this.TAG;
    }

    public final void setLoaderLogger(C20114513n5 c20114513n5) {
        this.loaderLogger = c20114513n5;
    }

    public final void setService(IResourceLoaderService iResourceLoaderService) {
        this.service = iResourceLoaderService;
    }

    public void printReject(Throwable th, String str) {
        Object objValueOf;
        try {
            InterfaceC20115413nE interfaceC20115413nE = getLoggerWrapper().LIZ;
            if (interfaceC20115413nE == null) {
                objValueOf = Integer.valueOf(Log.e("bullet", Intrinsics.LJIIJJI(th.getMessage(), "onReject: ")));
            } else {
                interfaceC20115413nE.LIZIZ();
                objValueOf = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(objValueOf);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    @Override // X.InterfaceC20115013nA
    public void printLog(String str, EnumC20115313nD enumC20115313nD, String str2) {
        C20115113nB.LIZ(this, str, enumC20115313nD, str2);
    }
}
