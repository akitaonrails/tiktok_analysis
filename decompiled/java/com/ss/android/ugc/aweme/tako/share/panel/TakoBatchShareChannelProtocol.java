package com.ss.android.ugc.aweme.tako.share.panel;

import X.C13LP;
import X.C15438062q;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371860lns;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import com.ss.android.ugc.aweme.tako.share.panel.TakoBatchMessageSharePackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TakoBatchShareChannelProtocol extends TTShareChannelProtocol {
    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final InterfaceC1371860lns LK0() {
        return new InterfaceC1371860lns() { // from class: X.0m5Z
            @Override // X.InterfaceC1371860lns
            public final void LIZIZ(BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                TakoBatchMessageSharePackage takoBatchMessageSharePackage;
                if (baseSharePackage instanceof TakoBatchMessageSharePackage) {
                    takoBatchMessageSharePackage = (TakoBatchMessageSharePackage) baseSharePackage;
                } else {
                    takoBatchMessageSharePackage = null;
                }
                if (z) {
                    if (takoBatchMessageSharePackage != null) {
                        Function0<Unit> function0 = takoBatchMessageSharePackage.onDmSendSuccess;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    } else {
                        return;
                    }
                } else if (takoBatchMessageSharePackage == null) {
                    return;
                }
                C1845390y7d.LIZ(takoBatchMessageSharePackage.commonParams, takoBatchMessageSharePackage.mobMessageId, "click_send");
            }
        };
    }

    public TakoBatchShareChannelProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final Set<String> V41(List<? extends InterfaceC1369790lkX> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends InterfaceC1369790lkX> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().key());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Intrinsics.LJFF(obj, "chat_merge")) {
                arrayList2.add(obj);
            }
        }
        return C13LP.LLIIJI(arrayList2);
    }
}
