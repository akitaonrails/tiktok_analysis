package com.ss.android.ugc.aweme.im.strategy;

import X.C0ZMF;
import X.C0ZMZ;
import X.C909190Zld;
import X.EnumC2215611Bnb;
import X.EnumC909380Zlw;
import X.InterfaceC1364105Vn;
import X.InterfaceC1707406mO;
import X.InterfaceC898340ZMa;
import com.ss.android.ugc.aweme.im.strategy.storage.StrategyConfigDataTypeAdapterFactory;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public interface IStrategyPlatformService {
    public static final C909190Zld LIZ = C909190Zld.LIZ;

    boolean LIZ(EnumC909380Zlw enumC909380Zlw);

    Object LIZIZ(EnumC909380Zlw enumC909380Zlw, InterfaceC898340ZMa interfaceC898340ZMa, InterfaceC1707406mO interfaceC1707406mO, String str, boolean z, InterfaceC1364105Vn<? super List<? extends IBusinessConfig>> interfaceC1364105Vn);

    Object LIZJ(EnumC909380Zlw enumC909380Zlw, String str, boolean z, InterfaceC1364105Vn<? super Map<String, ? extends C0ZMF>> interfaceC1364105Vn);

    Object LIZLLL(EnumC909380Zlw enumC909380Zlw, InterfaceC898340ZMa interfaceC898340ZMa, InterfaceC1707406mO interfaceC1707406mO, String str, boolean z, InterfaceC1364105Vn<? super IBusinessConfig> interfaceC1364105Vn);

    IBusinessConfig LJ(EnumC909380Zlw enumC909380Zlw, InterfaceC898340ZMa interfaceC898340ZMa, InterfaceC1707406mO interfaceC1707406mO, String str, boolean z);

    StrategyInitializer LJFF();

    Object LJI(List<? extends EnumC909380Zlw> list, String str, String str2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    void LJII(EnumC2215611Bnb enumC2215611Bnb);

    StrategyConfigDataTypeAdapterFactory LJIIIIZZ();

    C0ZMZ LJIIIZ();

    Map<String, C0ZMF> LJIIJ(EnumC909380Zlw enumC909380Zlw, String str, boolean z);
}
