package com.ss.android.ugc.aweme.social.sticker.cleanup;

import X.AnonymousClass0522;
import X.C08CX;
import X.C08QA;
import X.C08QB;
import X.C08QK;
import X.C098200Yq;
import X.C0CCZ;
import X.C0CHQ;
import X.C0VSJ;
import X.C0VZ0;
import X.C1776506xX;
import X.C189200o6;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class SocialStickerPreloadCleanTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SocialStickerPreloadCleanTask";
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
    public final int targetProcess() {
        return 1;
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
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            AnonymousClass0522.LIZ.getClass();
            c098200Yq = Long.valueOf(((Keva) AnonymousClass0522.LIZIZ.getValue()).getLong("last_preload_clean_run_at_ms", 0L));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = 0L;
        }
        long jLongValue = ((Number) c098200Yq).longValue();
        long jLongValue2 = ((Number) C1776506xX.LIZIZ.getValue()).longValue();
        if (jLongValue > 0 && jCurrentTimeMillis - jLongValue < jLongValue2) {
            return;
        }
        try {
            AnonymousClass0522.LIZ.getClass();
            c098200Yq2 = AnonymousClass0522.LIZ().keySet();
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
            c098200Yq2 = C08CX.INSTANCE;
        }
        Set<String> set = (Set) c098200Yq2;
        if (set.isEmpty()) {
            AnonymousClass0522.LIZIZ(jCurrentTimeMillis);
            return;
        }
        long j = 0;
        int i = 0;
        int i2 = 0;
        for (String str : set) {
            try {
                C0VSJ c0vsj = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(new CreativeInfo(str, 0, null, 6, null)));
                if (c0vsj.exists() && c0vsj.isDirectory()) {
                    C08QK c08qk = new C08QK(C08QB.LJIILIIL(c0vsj));
                    long length = 0;
                    while (c08qk.hasNext()) {
                        File next = c08qk.next();
                        if (next.isFile()) {
                            length += next.length();
                        }
                    }
                    C08QK c08qk2 = new C08QK(C08QB.LJIILIIL(c0vsj));
                    int i3 = 0;
                    while (c08qk2.hasNext()) {
                        if (c08qk2.next().isFile()) {
                            i3++;
                        }
                    }
                    if (C08QA.LJIIZILJ(c0vsj)) {
                        j += length;
                        i2 += i3;
                        i++;
                    }
                }
                AnonymousClass0522.LIZLLL(str);
                c098200Yq3 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq3 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq3);
        }
        int size = set.size();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(size, "orphaned_count");
        c2344009Gk.LIZJ(i, "cleaned_creation_count");
        c2344009Gk.LIZJ(i2, "cleaned_file_count");
        c2344009Gk.LIZLLL(j, "freed_bytes");
        C20684815ws.LJIILLIIL("social_sticker_preload_cleanup", c2344009Gk.LIZ);
        AnonymousClass0522.LIZIZ(System.currentTimeMillis());
    }
}
