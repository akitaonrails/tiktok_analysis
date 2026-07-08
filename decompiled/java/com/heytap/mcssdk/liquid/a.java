package com.heytap.mcssdk.liquid;

import com.heytap.msp.push.callback.ILiquidTaskQueryCallback;
import com.heytap.msp.push.callback.IPackageAuthCallbackListener;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public int a;
    public DownloadRequest b;
    public List<DownloadRequest> c;
    public ILiquidTaskQueryCallback d;
    public String e;
    public IPackageAuthCallbackListener f;

    public a(int i, DownloadRequest downloadRequest) {
        this.a = i;
        this.b = downloadRequest;
    }

    public a(int i, ILiquidTaskQueryCallback iLiquidTaskQueryCallback) {
        this.a = i;
        this.d = iLiquidTaskQueryCallback;
    }

    public a(int i, String str, IPackageAuthCallbackListener iPackageAuthCallbackListener) {
        this.a = i;
        this.e = str;
        this.f = iPackageAuthCallbackListener;
    }

    public a(int i, List<DownloadRequest> list) {
        this.a = i;
        this.c = list;
    }

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public void a(DownloadRequest downloadRequest) {
        this.b = downloadRequest;
    }

    public void a(ILiquidTaskQueryCallback iLiquidTaskQueryCallback) {
        this.d = iLiquidTaskQueryCallback;
    }

    public void a(IPackageAuthCallbackListener iPackageAuthCallbackListener) {
        this.f = iPackageAuthCallbackListener;
    }

    public void a(String str) {
        this.e = str;
    }

    public void a(List<DownloadRequest> list) {
        this.c = list;
    }

    public DownloadRequest b() {
        return this.b;
    }

    public ILiquidTaskQueryCallback c() {
        return this.d;
    }

    public List<DownloadRequest> d() {
        return this.c;
    }

    public String e() {
        return this.e;
    }

    public IPackageAuthCallbackListener f() {
        return this.f;
    }
}
