package com.bytedance.lynx.service.adapter.global.settings;

import X.C1522030pi5;
import X.InterfaceC1299540jvE;
import X.InterfaceC1685430txd;
import com.lynx.base.log.LynxLog;
import kotlin.Unit;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxSettingsDownloaderAdapter implements InterfaceC1299540jvE {
    public static final LynxSettingsDownloaderAdapter INSTANCE = new LynxSettingsDownloaderAdapter();

    @Override // X.InterfaceC1299540jvE
    public boolean enabled() {
        return false;
    }

    @Override // X.InterfaceC1299540jvE
    public void initLynxSettingsDownloaderAdapter(C1522030pi5 c1522030pi5) {
    }

    @Override // X.InterfaceC1299540jvE
    public void fetchSettings(InterfaceC1685430txd<? super Boolean, ? super String, ? super Integer, ? super String, ? super String, ? super Long, Unit> interfaceC1685430txd) {
        LynxLog.e("LynxSettingsDownloaderAdapter", "Lynx settings fetch disabled in this global adapter.");
        interfaceC1685430txd.invoke(Boolean.FALSE, null, 0, "Lynx settings fetch disabled in this global adapter.", null, 0L);
    }
}
