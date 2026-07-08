package com.orbu.core.impl;

import X.C1697810uHb;
import android.content.Context;
import com.orbu.core.adapter.TTKOrbuContext;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.api.ITTKOrbu;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuRequestPayload;
import com.orbu.core.api.ITTKOrbusActiveCallback;
import com.orbu.core.config.AgConfig;
import com.orbu.core.config.BootConfig;
import com.orbu.core.config.BootConfigKt;
import com.orbu.core.config.IConfigCenter;
import com.orbu.core.init.HardBlockConfig;
import com.orbu.core.init.TTKNativeNetworkManager;

/* JADX INFO: loaded from: classes14.dex */
public final class TTKDowngradeOrbuDelegate implements ITTKOrbu {
    @Override // com.orbu.core.api.ITTKOrbu
    public void activeOrbu(TTKOrbuContext tTKOrbuContext, String str, ITTKOrbusActiveCallback iTTKOrbusActiveCallback) {
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public boolean enableInterceptor() {
        return false;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getCurOrbuState() {
        return "DISABLE_SDK";
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public <T extends ITTKOrbuRequestPayload> TTKResponse shouldInterceptTTKRequest(ITTKOrbuRequest<? extends T> iTTKOrbuRequest) {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public BootConfig getBootConfig() {
        return new BootConfig(new AgConfig(null, null, null, 7, null), BootConfigKt.getDefaultThirdPartyConfig(), "671089669", C1697810uHb.LJIIJJI("http://", "https://", "wss://", "tcp://", "udp://", "tls://", "quic://"));
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getCurOrbuInternalState() {
        return ITTKOrbu.DefaultImpls.getCurOrbuInternalState(this);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getExperimentGroup() {
        return ITTKOrbu.DefaultImpls.getExperimentGroup(this);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getOrbuSDKVersion() {
        return ITTKOrbu.DefaultImpls.getOrbuSDKVersion(this);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getRuleHash() {
        return ITTKOrbu.DefaultImpls.getRuleHash(this);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getStoreRegion() {
        return ITTKOrbu.DefaultImpls.getStoreRegion(this);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public boolean hitSampleDrop() {
        return ITTKOrbu.DefaultImpls.hitSampleDrop(this);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public int nativeReportStrategy() {
        return ITTKOrbu.DefaultImpls.nativeReportStrategy(this);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setConfigCenter(IConfigCenter iConfigCenter) {
        ITTKOrbu.DefaultImpls.setConfigCenter(this, iConfigCenter);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setDebug(boolean z) {
        TTKNativeNetworkManager.setDebug(z);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setDelegate(ITTKOrbu iTTKOrbu) {
        ITTKOrbu.DefaultImpls.setDelegate(this, iTTKOrbu);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setHardBlockConfig(HardBlockConfig hardBlockConfig) {
        ITTKOrbu.DefaultImpls.setHardBlockConfig(this, hardBlockConfig);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public int cleanUpTTP(Context context, String str) {
        return ITTKOrbu.DefaultImpls.cleanUpTTP(this, context, str);
    }
}
