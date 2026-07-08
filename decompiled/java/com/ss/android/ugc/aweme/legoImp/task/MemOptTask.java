package com.ss.android.ugc.aweme.legoImp.task;

import X.C09CT;
import X.C0C64;
import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.crash.Npth;
import com.bytedance.sysoptimizer.JitCodeCacheShrinker;
import com.bytedance.sysoptimizer.NativeAllocatorOptimizer;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
@InterfaceC20234614Fk
public class MemOptTask implements C0CCZ {

    public static class JitCodeShrinkParam {

        @C09CT("shrink_size_mb")
        public int shrink_size_mb = -1;

        @C09CT("hook_mprotect_type")
        public int hook_mprotect_type = -1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MemOptTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        JitCodeShrinkParam jitCodeShrinkParam;
        int i;
        if (!Process.is64Bit()) {
            NativeAllocatorOptimizer.doShrinkNativeThread(context, 524288);
            String str = Build.BRAND;
            if (("huawei".equalsIgnoreCase(str) || "honor".equalsIgnoreCase(str)) && Build.VERSION.SDK_INT == 29) {
                Npth.startOptMtkBuffer(C0C64.LJIILLIIL().LJIJ(31744, -1, "tt_renderd128_memory_opt", true));
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29 && i2 <= 34 && (jitCodeShrinkParam = (JitCodeShrinkParam) C0C64.LJIILLIIL().LJJII(JitCodeShrinkParam.class, null, "tt_jit_code_cache_shrink_v4", true)) != null && (i = jitCodeShrinkParam.shrink_size_mb) > 0) {
                JitCodeCacheShrinker.shrink(context, i, jitCodeShrinkParam.hook_mprotect_type);
            }
        }
    }
}
