package com.ss.android.ugc.aweme.benchmark;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1294060jmO;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BenchmarkCollectionInitRequest implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public /* bridge */ /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public String key() {
        return "BenchmarkCollectionInitRequest";
    }

    @Override // X.InterfaceC800080Va2
    public /* bridge */ /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public void run(Context context) {
    }

    @Override // X.C0CCZ
    @InterfaceC1294060jmO
    public /* bridge */ /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public int targetProcess() {
        return 512;
    }

    @Override // X.InterfaceC800080Va2
    public /* bridge */ /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }
}
