package com.orbu.core;

import android.content.Context;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.adapter.TTKNetworkRequest;
import com.orbu.core.adapter.TTKOrbuContext;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.adapter.TTKResponseKt;
import com.orbu.core.api.IDomainTypeIdentifier;
import com.orbu.core.api.INetworkHandler;
import com.orbu.core.api.ITTKOrbu;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuRequestPayload;
import com.orbu.core.api.ITTKOrbusActiveCallback;
import com.orbu.core.config.BootConfig;
import com.orbu.core.config.IConfigCenter;
import com.orbu.core.config.NetConfig;
import com.orbu.core.impl.TTKDowngradeOrbuDelegate;
import com.orbu.core.init.HardBlockConfig;
import com.orbu.core.init.TTKNativeNetworkManager;
import com.orbu.core.logger.SandboxBootLogger;
import com.orbu.core.mob.ITTKEventReport;
import com.orbu.core.utils.TTKOrbuUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes14.dex */
public final class TTKOrbu implements ITTKOrbu {
    public static IConfigCenter configCenter;
    public static final TTKOrbu INSTANCE = new TTKOrbu();
    public static AtomicReference<INetworkHandler> networkHandler = new AtomicReference<>();
    public static AtomicReference<IDomainTypeIdentifier> domainTypeIdentifier = new AtomicReference<>();
    public static AtomicReference<ITTKEventReport> eventReport = new AtomicReference<>();
    public static ITTKOrbu delegate = new TTKDowngradeOrbuDelegate();

    @Override // com.orbu.core.api.ITTKOrbu
    public boolean enableInterceptor() {
        return delegate.enableInterceptor();
    }

    public final ITTKEventReport eventReport() {
        return eventReport.get();
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public BootConfig getBootConfig() {
        BootConfig bootConfigUpdateConfig;
        IConfigCenter iConfigCenter = configCenter;
        return (iConfigCenter == null || (bootConfigUpdateConfig = iConfigCenter.updateConfig()) == null) ? delegate.getBootConfig() : bootConfigUpdateConfig;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getCurOrbuInternalState() {
        return delegate.getCurOrbuInternalState();
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getCurOrbuState() {
        return delegate.getCurOrbuState();
    }

    public final IDomainTypeIdentifier getDomainTypeIdentifier() {
        return domainTypeIdentifier.get();
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getExperimentGroup() {
        return delegate.getExperimentGroup();
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getOrbuSDKVersion() {
        return delegate.getOrbuSDKVersion();
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getStoreRegion() {
        return delegate.getStoreRegion();
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public boolean hitSampleDrop() {
        return delegate.hitSampleDrop();
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public int nativeReportStrategy() {
        return delegate.nativeReportStrategy();
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getRuleHash() {
        return ITTKOrbu.DefaultImpls.getRuleHash(this);
    }

    private final void checkDFID(ITTKOrbuRequest<?> iTTKOrbuRequest) {
        TTKNetworkRequest tTKNetworkRequest;
        if (iTTKOrbuRequest.channel() == Channel.NETWORK) {
            if (iTTKOrbuRequest instanceof TTKNetworkRequest) {
                tTKNetworkRequest = (TTKNetworkRequest) iTTKOrbuRequest;
            } else {
                tTKNetworkRequest = null;
            }
            handleNetworkChannelDFID(tTKNetworkRequest);
        }
    }

    private final void handleNetworkChannelDFID(TTKNetworkRequest tTKNetworkRequest) {
        Uri uri;
        String host;
        String strIdentify = "";
        if (tTKNetworkRequest == null) {
            return;
        }
        try {
            String strUrl = tTKNetworkRequest.payload().url();
            if (strUrl != null && strUrl.length() != 0 && (host = (uri = Uri.parse(strUrl)).getHost()) != null && host.length() != 0) {
                String path = uri.getPath();
                BootConfig bootConfig = getBootConfig();
                if (!replenishDataflowId(host, path, bootConfig, tTKNetworkRequest.metadata()) && !assign3PDataflowId(host, path, bootConfig, tTKNetworkRequest.metadata())) {
                    try {
                        if ((TTKNativeNetworkManager.getPumbaaAspectEnable() & 2) != 0) {
                            IDomainTypeIdentifier domainTypeIdentifier2 = getDomainTypeIdentifier();
                            if (domainTypeIdentifier2 != null) {
                                strIdentify = domainTypeIdentifier2.identify(host);
                            } else {
                                strIdentify = null;
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    tTKNetworkRequest.setDomainType(strIdentify);
                    if (!Intrinsics.LJFF("tt_1st", strIdentify) && !Intrinsics.LJFF("bd_1st", strIdentify)) {
                        if (Intrinsics.LJFF("bd_3rd", strIdentify)) {
                            String str = tTKNetworkRequest.metadata().get("x-tt-dataflow-id");
                            if (str == null || str.length() == 0) {
                                if (bootConfig.thirdPartyFallbackDFID.length() > 0) {
                                    tTKNetworkRequest.metadata().put("x-tt-dataflow-id", bootConfig.thirdPartyFallbackDFID);
                                } else {
                                    injectDefaultDataflowId(tTKNetworkRequest.metadata());
                                }
                            }
                        } else {
                            injectDefaultDataflowId(tTKNetworkRequest.metadata());
                        }
                    } else {
                        tTKNetworkRequest.metadata().put("x-tt-dataflow-id", "671088895");
                    }
                    injectDefaultDataflowId(tTKNetworkRequest.metadata());
                    return;
                }
            } else {
                injectDefaultDataflowId(tTKNetworkRequest.metadata());
            }
            injectDefaultDataflowId(tTKNetworkRequest.metadata());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            injectDefaultDataflowId(tTKNetworkRequest.metadata());
            throw th;
        }
    }

    private final void injectDefaultDataflowId(Map<String, String> map) {
        String str = map.get("x-tt-dataflow-id");
        if (str == null || str.length() == 0) {
            map.put("x-tt-dataflow-id", "672137215");
        }
    }

    public final void registerNetworkHandler(INetworkHandler iNetworkHandler) {
        networkHandler.set(iNetworkHandler);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setConfigCenter(IConfigCenter iConfigCenter) {
        configCenter = iConfigCenter;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setDebug(boolean z) {
        TTKNativeNetworkManager.setDebug(z);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setDelegate(ITTKOrbu iTTKOrbu) {
        delegate = iTTKOrbu;
    }

    public final void setDomainTypeIdentifier(IDomainTypeIdentifier iDomainTypeIdentifier) {
        domainTypeIdentifier.set(iDomainTypeIdentifier);
    }

    public final void setEventReportImpl(ITTKEventReport iTTKEventReport) {
        eventReport.set(iTTKEventReport);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setHardBlockConfig(HardBlockConfig hardBlockConfig) {
        ITTKOrbu.DefaultImpls.setHardBlockConfig(this, hardBlockConfig);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public <T extends ITTKOrbuRequestPayload> TTKResponse shouldInterceptTTKRequest(ITTKOrbuRequest<? extends T> iTTKOrbuRequest) {
        TTKResponse tTKResponseForwardToPumbaa;
        SandboxBootLogger.INSTANCE.firstDataflowRequest();
        checkDFID(iTTKOrbuRequest);
        TTKResponse tTKResponseShouldInterceptTTKRequest = delegate.shouldInterceptTTKRequest(iTTKOrbuRequest);
        if (tTKResponseShouldInterceptTTKRequest == null) {
            return null;
        }
        if (TTKNativeNetworkManager.getPumbaaAspectEnable() != 0 && (tTKResponseForwardToPumbaa = INSTANCE.forwardToPumbaa(iTTKOrbuRequest, tTKResponseShouldInterceptTTKRequest)) != null && !TTKResponseKt.isBlock(tTKResponseShouldInterceptTTKRequest) && TTKResponseKt.isBlock(tTKResponseForwardToPumbaa)) {
            return tTKResponseForwardToPumbaa;
        }
        return tTKResponseShouldInterceptTTKRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <T extends com.orbu.core.api.ITTKOrbuRequestPayload> com.orbu.core.adapter.TTKResponse forwardToPumbaa(com.orbu.core.api.ITTKOrbuRequest<? extends T> r19, com.orbu.core.adapter.TTKResponse r20) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orbu.core.TTKOrbu.forwardToPumbaa(com.orbu.core.api.ITTKOrbuRequest, com.orbu.core.adapter.TTKResponse):com.orbu.core.adapter.TTKResponse");
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public int cleanUpTTP(Context context, String str) {
        return ITTKOrbu.DefaultImpls.cleanUpTTP(this, context, str);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void activeOrbu(TTKOrbuContext tTKOrbuContext, String str, ITTKOrbusActiveCallback iTTKOrbusActiveCallback) {
        delegate.activeOrbu(tTKOrbuContext, str, iTTKOrbusActiveCallback);
    }

    private final boolean assign3PDataflowId(String str, String str2, BootConfig bootConfig, Map<String, String> map) {
        for (NetConfig netConfig : bootConfig.thirdPartyConfig) {
            if (netConfig.match3PDomainAndPath(str, str2) && netConfig.dataflowId.length() > 0) {
                map.put("x-tt-dataflow-id", netConfig.dataflowId);
                return true;
            }
        }
        return false;
    }

    private final boolean replenishDataflowId(String str, String str2, BootConfig bootConfig, Map<String, String> map) {
        String builtinDataflowId = TTKOrbuUtils.INSTANCE.getBuiltinDataflowId(str, str2, bootConfig);
        if (builtinDataflowId == null || builtinDataflowId.length() == 0) {
            return false;
        }
        map.put("x-tt-dataflow-id", builtinDataflowId);
        return true;
    }
}
