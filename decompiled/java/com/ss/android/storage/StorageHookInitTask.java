package com.ss.android.storage;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.storage.StorageHook;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class StorageHookInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "StorageHookInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        LoadSoLancet.LIZJ("storage-hook");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("storage-hook");
        LoadSoLancet.LJ(jUptimeMillis, "storage-hook");
        LoadSoLancet.LIZLLL(jUptimeMillis, "storage-hook");
        LoadSoLancet.LIZIZ("storage-hook");
        StorageHook.init();
    }
}
