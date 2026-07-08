package com.ss.android.ugc.aweme.im.messagelist.impl;

import X.C01GW;
import X.C0ZDX;
import X.C452501pT;
import X.C869590Y9l;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ext.IInteractiveTaskIndexTracker;
import com.ss.android.ugc.aweme.im.message.template.card.BaseInteractiveTaskTemplate;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class InteractiveTaskIndexTrackerImpl implements IInteractiveTaskIndexTracker {
    public final HashMap<String, Long> LIZ = new HashMap<>();
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(377));

    @Override // com.ss.android.ugc.aweme.ext.IInteractiveTaskIndexTracker
    public final long LIZJ(String str) {
        synchronized (this.LIZ) {
            try {
                Long l = this.LIZ.get(str);
                if (l != null) {
                    return l.longValue();
                }
                long jLongValue = ((Keva) this.LIZIZ.getValue()).getLong(str, 0L);
                if (jLongValue > 0) {
                    this.LIZ.put(str, Long.valueOf(jLongValue));
                }
                Long l2 = this.LIZ.get(str);
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
                return jLongValue;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ext.IInteractiveTaskIndexTracker
    public final void LIZ(long j, String str) {
        synchronized (this.LIZ) {
            try {
                Long l = this.LIZ.get(str);
                if (l != null && l.longValue() >= j) {
                    return;
                }
                this.LIZ.put(str, Long.valueOf(j));
                ((Keva) this.LIZIZ.getValue()).storeLong(str, j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ext.IInteractiveTaskIndexTracker
    public final boolean LIZIZ(C869590Y9l c869590Y9l, BaseInteractiveTaskTemplate baseInteractiveTaskTemplate) {
        if (baseInteractiveTaskTemplate.Jv() || Intrinsics.LJFF(c869590Y9l.getLocalExt().get("local_ext_group_shot_hide_card"), "1") || C0ZDX.LJJJJZ(c869590Y9l)) {
            return true;
        }
        String taskId = baseInteractiveTaskTemplate.getTaskId();
        if (taskId.length() != 0 && LIZJ(taskId) > c869590Y9l.getIndex()) {
            return true;
        }
        return false;
    }
}
