package com.ss.android.ugc.aweme.ecommerce.core.module;

import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class ModuleManager$daObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ ModuleManager LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public ModuleManager$daObserver$1(ModuleManager moduleManager) {
        this.LL = moduleManager;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        this.LL.LJIJ = System.currentTimeMillis();
        ModuleManager moduleManager = this.LL;
        moduleManager.LJIJJLI = 0L;
        moduleManager.LJIL = 0L;
        moduleManager.LJJ = false;
        if (!moduleManager.LIZ.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) this.LL.LIZ).entrySet()) {
                linkedHashMap.put(entry.getKey(), Long.valueOf(((Number) entry.getValue()).longValue()));
            }
            ((LinkedHashMap) this.LL.LIZ).clear();
            this.LL.LIZ.putAll(linkedHashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0799 A[PHI: r5 r177
      0x0799: PHI (r5v6 int) = (r5v5 int), (r5v13 int) binds: [B:163:0x0798, B:117:0x0552] A[DONT_GENERATE, DONT_INLINE]
      0x0799: PHI (r177v1 boolean) = (r177v0 boolean), (r177v3 boolean) binds: [B:163:0x0798, B:117:0x0552] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x042c  */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy(androidx.lifecycle.LifecycleOwner r194) {
        /*
            Method dump skipped, instruction units count: 2109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager$daObserver$1.onDestroy(androidx.lifecycle.LifecycleOwner):void");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        ModuleManager moduleManager = this.LL;
        System.currentTimeMillis();
        moduleManager.getClass();
    }
}
