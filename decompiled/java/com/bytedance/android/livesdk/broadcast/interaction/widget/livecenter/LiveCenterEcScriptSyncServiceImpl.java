package com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter;

import X.AbstractC19416810xq;
import X.C12O8;
import X.C12OA;
import X.C12OK;
import X.C19416310xl;
import com.bytedance.android.livesdk.broadcast.ILiveCenterEcScriptSyncService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationSetting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveCenterEcScriptSyncServiceImpl implements ILiveCenterEcScriptSyncService {
    @Override // com.bytedance.android.livesdk.broadcast.ILiveCenterEcScriptSyncService
    public final void ed(boolean z, boolean z2) {
        WeakReference<C12OA> weakReference;
        C12OA c12oa;
        C12O8 next;
        C12O8 c12o8;
        if (LiveCenterECSuggestionSetting.INSTANCE.isEnabled() && (weakReference = C12OK.LIZ) != null && (c12oa = weakReference.get()) != null) {
            c12oa.LJIIJ = z;
            c12oa.LJIIJJI = z2;
            if (z && z2) {
                Iterator<C12O8> it2 = c12oa.LIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next instanceof C19416310xl) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if ((next instanceof C19416310xl) && (c12o8 = next) != null) {
                    c12oa.LJIILIIL(c12o8, true);
                    if (LiveCenterUIStyleOptimizationSetting.INSTANCE.enable()) {
                        ConcurrentLinkedDeque<C12O8> concurrentLinkedDeque = c12oa.LIZ;
                        ArrayList arrayList = new ArrayList();
                        for (C12O8 c12o82 : concurrentLinkedDeque) {
                            if (c12o82 instanceof AbstractC19416810xq) {
                                arrayList.add(c12o82);
                            }
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            c12oa.LJIILIIL((C12O8) it3.next(), true);
                        }
                    }
                }
            }
        }
    }
}
