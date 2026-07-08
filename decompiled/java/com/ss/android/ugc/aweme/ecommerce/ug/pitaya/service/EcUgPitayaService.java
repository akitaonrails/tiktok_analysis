package com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service;

import X.C13034058e;
import X.EnumC13035058f;
import X.EnumC13036058g;
import X.InterfaceC13038058i;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class EcUgPitayaService implements IEcUgPitayaService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService
    public final void LIZIZ() {
        EcUgPitayaManager.INSTANCE.tryInitPitayaSdk();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService
    public final boolean LIZJ() {
        return EcUgPitayaManager.INSTANCE.pitayaEnable();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService
    public final void LJI() {
        EcUgPitayaManager.INSTANCE.initEcUgPitaya();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService
    public final void initPitayaAfterUserTrigger() {
        EcUgPitayaManager.INSTANCE.initPitayaAfterUserTrigger();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService
    public final void LIZ(Object obj) {
        EcUgPitayaManager.INSTANCE.setValueForKeyInDisk("gec_real_time_voucher", "kv_cooldown_ts", obj);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService
    public final void LIZLLL(Object obj) {
        EcUgPitayaManager.INSTANCE.setValueForKeyInMemory("gec_real_time_voucher", "cache_cooldown_ts", obj);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService
    public final void LJ(Map<String, ? extends Object> map) {
        C13034058e c13034058e = C13034058e.LIZ;
        EnumC13036058g enumC13036058g = EnumC13036058g.HANDLE_MSG;
        EnumC13035058f enumC13035058f = EnumC13035058f.SEND_REQUEST;
        c13034058e.getClass();
        C13034058e.LIZ(enumC13036058g, enumC13035058f, true, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService
    public final void LJFF(Map map, boolean z) {
        C13034058e c13034058e = C13034058e.LIZ;
        EnumC13036058g enumC13036058g = EnumC13036058g.HANDLE_MSG;
        EnumC13035058f enumC13035058f = EnumC13035058f.RECEIVE_RESPONSE;
        c13034058e.getClass();
        C13034058e.LIZ(enumC13036058g, enumC13035058f, z, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService
    public final void LJII(String str, String str2) {
        EcUgPitayaManager.INSTANCE.removePitayaMsgObserver(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService
    public final void LJIIIIZZ(String str, InterfaceC13038058i interfaceC13038058i, String str2) {
        EcUgPitayaManager.INSTANCE.addPitayaMsgObserver(str, interfaceC13038058i, str2, null);
    }
}
