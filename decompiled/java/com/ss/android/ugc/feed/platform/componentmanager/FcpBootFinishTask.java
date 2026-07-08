package com.ss.android.ugc.feed.platform.componentmanager;

import X.C0CCZ;
import X.C0T6L;
import X.C0VU1;
import X.C0VZ0;
import X.C20684815ws;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.feed.platform.metric.event.CoreFdmtDeviceInfoEvent;
import com.ss.android.ugc.feed.platform.metric.event.IDeviceInfoEventParamProvider;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class FcpBootFinishTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FcpBootFinishTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0T6L.LIZLLL();
        C20684815ws.LJFF().submit(new Runnable() { // from class: X.017S
            public static void LIZ() {
                CoreFdmtDeviceInfoEvent coreFdmtDeviceInfoEvent = new CoreFdmtDeviceInfoEvent();
                Iterator it2 = ((Set) C1DDC.LLIZ.getValue()).iterator();
                while (it2.hasNext()) {
                    coreFdmtDeviceInfoEvent.LIZ().add(((IDeviceInfoEventParamProvider) it2.next()).LIZ());
                }
                coreFdmtDeviceInfoEvent.LJIIIIZZ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DeviceInfoManager@4d11.reportAsyncInternal$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DeviceInfoManager@4d11.reportAsyncInternal$1");
            }
        });
    }
}
