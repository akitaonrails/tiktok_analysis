package com.ss.android.ugc.aweme.legoImp.task.security;

import X.C01GW;
import X.C0CCZ;
import X.C0VZ0;
import X.C0XLF;
import X.C13LQ;
import X.C1798060wtI;
import X.C20684815ws;
import X.C452501pT;
import X.C847070XKv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.legoImp.task.region.RegionInitTask;
import com.ss.android.ugc.aweme.legoImp.task.security.DfStatisticsTask;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class DfStatisticsTask implements C0CCZ {
    public static final Set<String> LLILLJJLI = C13LQ.LJLIIL(new String[]{"us", "as", "gu", "mp", "pr", "vi", "um"});
    public final C01GW LL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(146));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DfStatisticsTask";
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

    public static void LIZ(C847070XKv c847070XKv) {
        if (c847070XKv != null && Intrinsics.LJFF(c847070XKv.LIZIZ, "uid") && c847070XKv.LIZ.length() > 0) {
            int i = ((!LLILLJJLI.contains(c847070XKv.LIZ.toLowerCase(Locale.ROOT)) ? 1 : 0) | 2) + 1;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
            linkedHashMap.put("tt_region", c847070XKv.LIZ);
            C20684815ws.LJIILLIIL("df_region_diff_us", linkedHashMap);
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        RegionInitTask.LL.run(context);
        C1798060wtI c1798060wtI = C1798060wtI.LIZ;
        LIZ(C1798060wtI.LIZ());
        C1798060wtI.LJ(new C0XLF() { // from class: X.0XLa
            @Override // X.C0XLF
            public final void LIZ(String str, C847070XKv c847070XKv) {
                if (Intrinsics.LJFF(str, "store_region")) {
                    this.LIZ.getClass();
                    DfStatisticsTask.LIZ(c847070XKv);
                }
            }
        });
    }
}
