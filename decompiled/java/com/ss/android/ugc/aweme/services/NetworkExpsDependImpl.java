package com.ss.android.ugc.aweme.services;

import X.C0C64;
import X.C1495090p0d;
import X.C276750Asz;
import X.C291950BcP;
import X.C302650Btf;
import X.C310440CEw;
import X.EnumC1495060p0a;
import X.EnumC588680N7a;
import com.bytedance.ies.ugc.aweme.network.INetworkExpsDepend;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.network.experiment.ZeroCopyConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkExpsDependImpl implements INetworkExpsDepend {
    @Override // com.bytedance.ies.ugc.aweme.network.INetworkExpsDepend
    public boolean getValue(EnumC1495060p0a enumC1495060p0a) {
        if (enumC1495060p0a == EnumC1495060p0a.NetDispatchExperimentIsEnable) {
            C310440CEw.LIZ.getClass();
            return C310440CEw.LIZ().enable;
        }
        if (enumC1495060p0a == EnumC1495060p0a.ResponseZeroCopyOptIsEnable) {
            return ((ZeroCopyConfig) C1495090p0d.LIZIZ.getValue()).enable;
        }
        if (enumC1495060p0a == EnumC1495060p0a.NoNetworkOptExperimentIsOpen) {
            return ((Boolean) C291950BcP.LIZ.getValue()).booleanValue();
        }
        if (enumC1495060p0a == EnumC1495060p0a.CronetFallbackBootExperimentIsEnable) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 1, "network_disable_cronet_fallback", true) != 0) {
                return true;
            }
            return false;
        }
        if (enumC1495060p0a == EnumC1495060p0a.ApmNetMonitorOptABIsEnable) {
            return ((Boolean) C302650Btf.LIZ.getValue()).booleanValue();
        }
        if (enumC1495060p0a == EnumC1495060p0a.InterceptorRefactorExperimentIsUseNewFormat) {
            return ((Boolean) C276750Asz.LIZ.getValue()).booleanValue();
        }
        if (enumC1495060p0a == EnumC1495060p0a.ColdBootTasksDegradeExperimentIsZSTDDictUpdateEnable) {
            return ColdBootTasksDegradeExperiment.LIZ().zstdDictUpdateTask;
        }
        return enumC1495060p0a.getDefaultVal();
    }

    @Override // com.bytedance.ies.ugc.aweme.network.INetworkExpsDepend
    public int getValue(EnumC588680N7a enumC588680N7a) {
        if (enumC588680N7a == EnumC588680N7a.ResponseZeroCopyOptGetSegmentSize) {
            return ((ZeroCopyConfig) C1495090p0d.LIZIZ.getValue()).segmentSize;
        }
        if (enumC588680N7a == EnumC588680N7a.ResponseZeroCopyOptGetSegmentCount) {
            return ((ZeroCopyConfig) C1495090p0d.LIZIZ.getValue()).segmentCount;
        }
        return enumC588680N7a.getDefaultVal();
    }
}
