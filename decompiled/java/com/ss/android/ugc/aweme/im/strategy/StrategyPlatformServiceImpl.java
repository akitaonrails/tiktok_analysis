package com.ss.android.ugc.aweme.im.strategy;

import X.C0ZMF;
import X.C0ZMZ;
import X.C909400Zly;
import X.EnumC2215611Bnb;
import X.EnumC909380Zlw;
import X.InterfaceC1364105Vn;
import X.InterfaceC1707406mO;
import X.InterfaceC898340ZMa;
import com.ss.android.ugc.aweme.im.strategy.storage.StrategyConfigDataTypeAdapterFactory;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class StrategyPlatformServiceImpl implements IStrategyPlatformService {
    public final /* synthetic */ C909400Zly LIZIZ = C909400Zly.LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final boolean LIZ(EnumC909380Zlw enumC909380Zlw) {
        return this.LIZIZ.LIZ(enumC909380Zlw);
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final Object LIZIZ(EnumC909380Zlw enumC909380Zlw, InterfaceC898340ZMa interfaceC898340ZMa, InterfaceC1707406mO interfaceC1707406mO, String str, boolean z, InterfaceC1364105Vn<? super List<? extends IBusinessConfig>> interfaceC1364105Vn) {
        return this.LIZIZ.LIZIZ(enumC909380Zlw, interfaceC898340ZMa, interfaceC1707406mO, str, z, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final Object LIZJ(EnumC909380Zlw enumC909380Zlw, String str, boolean z, InterfaceC1364105Vn<? super Map<String, ? extends C0ZMF>> interfaceC1364105Vn) {
        return this.LIZIZ.LIZJ(enumC909380Zlw, str, z, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final Object LIZLLL(EnumC909380Zlw enumC909380Zlw, InterfaceC898340ZMa interfaceC898340ZMa, InterfaceC1707406mO interfaceC1707406mO, String str, boolean z, InterfaceC1364105Vn<? super IBusinessConfig> interfaceC1364105Vn) {
        return this.LIZIZ.LIZLLL(enumC909380Zlw, interfaceC898340ZMa, interfaceC1707406mO, str, z, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final IBusinessConfig LJ(EnumC909380Zlw enumC909380Zlw, InterfaceC898340ZMa interfaceC898340ZMa, InterfaceC1707406mO interfaceC1707406mO, String str, boolean z) {
        return this.LIZIZ.LJ(enumC909380Zlw, interfaceC898340ZMa, interfaceC1707406mO, str, z);
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final Object LJI(List<? extends EnumC909380Zlw> list, String str, String str2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return this.LIZIZ.LJI(list, str, str2, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final Map<String, C0ZMF> LJIIJ(EnumC909380Zlw enumC909380Zlw, String str, boolean z) {
        return this.LIZIZ.LJIIJ(enumC909380Zlw, str, z);
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final StrategyInitializer LJFF() {
        this.LIZIZ.getClass();
        return StrategyInitializer.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final StrategyConfigDataTypeAdapterFactory LJIIIIZZ() {
        this.LIZIZ.getClass();
        return StrategyConfigDataTypeAdapterFactory.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final C0ZMZ LJIIIZ() {
        this.LIZIZ.getClass();
        return new C0ZMZ();
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService
    public final void LJII(EnumC2215611Bnb enumC2215611Bnb) {
        this.LIZIZ.LJII(enumC2215611Bnb);
    }
}
