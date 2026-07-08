package com.ss.android.ugc.aweme.compliance.sandbox.api.services;

import X.EnumC847160XLe;
import X.InterfaceC1294060jmO;
import X.InterfaceC1904907d9;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes29.dex */
public final class SandboxServiceEmptyImpl implements ISandboxService {
    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void LIZ(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void LIZIZ(EnumC847160XLe enumC847160XLe) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final InterfaceC1904907d9 LIZJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    @InterfaceC1294060jmO
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final boolean LJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void LJFF(n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public InterfaceC1904907d9 dataFlowIDInterceptor(String str) {
        return ISandboxService.DefaultImpls.dataFlowIDInterceptor(this, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public Bundle appendDataFlowId(Bundle bundle, String str) {
        return ISandboxService.DefaultImpls.appendDataFlowId(this, bundle, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public boolean needInterceptBySandbox(Intent intent, int i) {
        return ISandboxService.DefaultImpls.needInterceptBySandbox(this, intent, i);
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public void appendDataFlowId(Intent intent, int i) {
        ISandboxService.DefaultImpls.appendDataFlowId(this, intent, i);
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public void appendDataFlowId(Intent intent, String str) {
        ISandboxService.DefaultImpls.appendDataFlowId(this, intent, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public void appendDataFlowId(WebView webView, String str) {
        ISandboxService.DefaultImpls.appendDataFlowId(this, webView, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public void appendDataFlowId(HashMap<String, String> map, String str) {
        ISandboxService.DefaultImpls.appendDataFlowId(this, map, str);
    }
}
