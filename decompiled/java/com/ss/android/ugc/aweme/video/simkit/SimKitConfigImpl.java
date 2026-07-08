package com.ss.android.ugc.aweme.video.simkit;

import X.C01GW;
import X.C0BZG;
import X.C0BZH;
import X.C0BZI;
import X.C0CJM;
import X.C1478480oZq;
import X.C1478550oZx;
import X.C1478560oZy;
import X.C1478570oZz;
import X.C1478580oa0;
import X.C1478590oa1;
import X.C1478600oa2;
import X.C1478610oa3;
import X.C1478620oa4;
import X.C1478630oa5;
import X.C1478640oa6;
import X.C1478650oa7;
import X.C1478660oa8;
import X.C1481880ofK;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC1475670oVJ;
import X.InterfaceC584750Mwb;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.playerkit.exp.PlayerSettingService;
import com.ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes24.dex */
public final class SimKitConfigImpl implements ISimKitConfig {
    public final C01GW adaptiveConfig$delegate;
    public final C01GW iDimensionPickConfig$delegate;
    public final C01GW innerRadarTransmitter$delegate;
    public final C01GW mALog$delegate;
    public final C01GW mAppConfig$delegate;
    public final C01GW mCommonConfig$delegate;
    public final C01GW mDimensionBitrateCurveConfig$delegate;
    public final C01GW mDimensionBitrateFilterConfig$delegate;
    public final C01GW mEvent$delegate;
    public final C01GW mMonitor$delegate;
    public final C01GW mPlayerExperiment$delegate;
    public final C01GW mPlayerGlobalConfig$delegate;
    public final C01GW mPlayerSettingService$delegate;
    public final C01GW mPreloaderExperiment$delegate;
    public final C01GW mSimPlayerConfig$delegate;
    public final C01GW mSpeedCalculatorConfig$delegate;
    public final C01GW mVideoPreloaderManagerConfig$delegate;
    public final C01GW simAdaptiveCommandFactory$delegate;

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public boolean isEnablePlayerImplRefactor() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public /* bridge */ /* synthetic */ boolean isEnableTTKPlayStrategyCenter() {
        return false;
    }

    private final C0BZG getAdaptiveConfig() {
        return (C0BZG) this.adaptiveConfig$delegate.getValue();
    }

    private final InterfaceC1475670oVJ getIDimensionPickConfig() {
        return (InterfaceC1475670oVJ) this.iDimensionPickConfig$delegate.getValue();
    }

    private final IRadarTransmitter getInnerRadarTransmitter() {
        return (IRadarTransmitter) this.innerRadarTransmitter$delegate.getValue();
    }

    private final IALog getMALog() {
        return (IALog) this.mALog$delegate.getValue();
    }

    private final IAppConfig getMAppConfig() {
        return (IAppConfig) this.mAppConfig$delegate.getValue();
    }

    private final ICommonConfig getMCommonConfig() {
        return (ICommonConfig) this.mCommonConfig$delegate.getValue();
    }

    private final IDimensionBitrateCurveConfig getMDimensionBitrateCurveConfig() {
        return (IDimensionBitrateCurveConfig) this.mDimensionBitrateCurveConfig$delegate.getValue();
    }

    private final IDimensionBitrateFilterConfig getMDimensionBitrateFilterConfig() {
        return (IDimensionBitrateFilterConfig) this.mDimensionBitrateFilterConfig$delegate.getValue();
    }

    private final IEvent getMEvent() {
        return (IEvent) this.mEvent$delegate.getValue();
    }

    private final IMonitor getMMonitor() {
        return (IMonitor) this.mMonitor$delegate.getValue();
    }

    private final IPlayerExperiment getMPlayerExperiment() {
        return (IPlayerExperiment) this.mPlayerExperiment$delegate.getValue();
    }

    private final PlayerGlobalConfig getMPlayerGlobalConfig() {
        return (PlayerGlobalConfig) this.mPlayerGlobalConfig$delegate.getValue();
    }

    private final PlayerSettingService getMPlayerSettingService() {
        return (PlayerSettingService) this.mPlayerSettingService$delegate.getValue();
    }

    private final IPreloaderExperiment getMPreloaderExperiment() {
        return (IPreloaderExperiment) this.mPreloaderExperiment$delegate.getValue();
    }

    private final ISimPlayerConfig getMSimPlayerConfig() {
        return (ISimPlayerConfig) this.mSimPlayerConfig$delegate.getValue();
    }

    private final ISpeedCalculatorConfig getMSpeedCalculatorConfig() {
        return (ISpeedCalculatorConfig) this.mSpeedCalculatorConfig$delegate.getValue();
    }

    public final IVideoPreloadConfig getMVideoPreloaderManagerConfig() {
        return (IVideoPreloadConfig) this.mVideoPreloaderManagerConfig$delegate.getValue();
    }

    public final InterfaceC584750Mwb getSimAdaptiveCommandFactory() {
        return (InterfaceC584750Mwb) this.simAdaptiveCommandFactory$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public ISimReporterConfig getSimReporterConfig() {
        return new C1481880ofK();
    }

    public SimKitConfigImpl() {
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        this.mCommonConfig$delegate = C452501pT.LIZ(enumC452301pR, new C1478480oZq());
        this.mALog$delegate = C452501pT.LIZ(enumC452301pR, new C1478570oZz());
        this.mAppConfig$delegate = C452501pT.LIZ(enumC452301pR, new C1478580oa0());
        this.mEvent$delegate = C452501pT.LIZ(enumC452301pR, new C1478610oa3());
        this.mMonitor$delegate = C452501pT.LIZ(enumC452301pR, new C1478620oa4());
        this.mSimPlayerConfig$delegate = C452501pT.LIZ(enumC452301pR, new C1478630oa5());
        this.mPlayerExperiment$delegate = C452501pT.LIZ(enumC452301pR, new C0BZI());
        this.mVideoPreloaderManagerConfig$delegate = C452501pT.LIZ(enumC452301pR, new C1478650oa7());
        this.mPreloaderExperiment$delegate = C452501pT.LIZ(enumC452301pR, new C1478550oZx(this));
        this.mPlayerGlobalConfig$delegate = C452501pT.LIZ(enumC452301pR, new C0CJM());
        this.mSpeedCalculatorConfig$delegate = C452501pT.LIZ(enumC452301pR, new C1478640oa6());
        this.mDimensionBitrateCurveConfig$delegate = C452501pT.LIZ(enumC452301pR, new C1478590oa1());
        this.iDimensionPickConfig$delegate = C452501pT.LIZ(enumC452301pR, new C1478560oZy());
        this.mDimensionBitrateFilterConfig$delegate = C452501pT.LIZ(enumC452301pR, new C1478600oa2());
        this.mPlayerSettingService$delegate = C452501pT.LIZ(enumC452301pR, AFwS212S0000000_23.get$arr$(104));
        this.innerRadarTransmitter$delegate = C452501pT.LIZ(enumC452301pR, new C0BZH());
        this.simAdaptiveCommandFactory$delegate = C452501pT.LIZ(enumC452301pR, new C1478660oa8());
        this.adaptiveConfig$delegate = C452501pT.LIZ(enumC452301pR, new AwS548S0100000_4(this, 301));
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public PlayerSettingService PlayerSettingService() {
        return getMPlayerSettingService();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IALog getALog() {
        return getMALog();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public C0BZG getAdaptiveRuleConfig() {
        return getAdaptiveConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IAppConfig getAppConfig() {
        return getMAppConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public ICommonConfig getCommonConfig() {
        return getMCommonConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IDimensionBitrateCurveConfig getDimensionBitrateCurveConfig() {
        return getMDimensionBitrateCurveConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IDimensionBitrateFilterConfig getDimensionBitrateFilterConfig() {
        return getMDimensionBitrateFilterConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public InterfaceC1475670oVJ getDimensionPickConfig() {
        return getIDimensionPickConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IEvent getEvent() {
        return getMEvent();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IMonitor getMonitor() {
        return getMMonitor();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public PlayerGlobalConfig getPlayerGlobalConfig() {
        return getMPlayerGlobalConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IPreloaderExperiment getPreloaderExperiment() {
        return getMPreloaderExperiment();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IRadarTransmitter getRadarTransmitter() {
        return getInnerRadarTransmitter();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public ISimPlayerConfig getSimPlayerConfig() {
        return getMSimPlayerConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IPlayerExperiment getSimPlayerExperiment() {
        return getMPlayerExperiment();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public ISpeedCalculatorConfig getSpeedCalculatorConfig() {
        return getMSpeedCalculatorConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IVideoPreloadConfig getVideoPreloaderManagerConfig() {
        return getMVideoPreloaderManagerConfig();
    }
}
