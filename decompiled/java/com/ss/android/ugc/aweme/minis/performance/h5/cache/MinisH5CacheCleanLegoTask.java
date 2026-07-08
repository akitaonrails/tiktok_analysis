package com.ss.android.ugc.aweme.minis.performance.h5.cache;

import X.C01GW;
import X.C0CCZ;
import X.C0VZ0;
import X.C452501pT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import java.util.List;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisH5CacheCleanLegoTask implements C0CCZ {
    public final C01GW LL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(92));
    public final String LLILLJJLI = "h5_last_cold_start_time";

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MinisH5CacheCleanLegoTask";
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
        return EnumC799870VZh.IDLE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        X.C2137908Zd.LIZJ.LIZLLL(r11.getAbsolutePath());
     */
    @Override // X.InterfaceC308150C6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.performance.h5.cache.MinisH5CacheCleanLegoTask.run(android.content.Context):void");
    }
}
