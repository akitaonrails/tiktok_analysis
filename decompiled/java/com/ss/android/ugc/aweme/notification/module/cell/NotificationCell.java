package com.ss.android.ugc.aweme.notification.module.cell;

import X.C1242240iQo;
import X.C1242300iQu;
import X.C1266090j3H;
import X.C13LE;
import X.C2217381BqS;
import X.InterfaceC2217461Bqa;

/* JADX INFO: loaded from: classes20.dex */
public class NotificationCell<T extends C1242240iQo> extends BaseChunkCell<T> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1266090j3H LLILZIL = new C1266090j3H(this, 3);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NotificationCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/notification/module/NotificationChunk$CellControl;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        C1242300iQu c1242300iQu;
        super.onViewAttachedToWindow();
        T item = getItem();
        if (item == null || (c1242300iQu = (C1242300iQu) this.LLILZIL.getValue(this, LLILZLL[0])) == null) {
            return;
        }
        c1242300iQu.LIZJ(item.LLILLJJLI.nid, true);
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public void onViewDetachedFromWindow() {
        C1242300iQu c1242300iQu;
        super.onViewDetachedFromWindow();
        T item = getItem();
        if (item == null || (c1242300iQu = (C1242300iQu) this.LLILZIL.getValue(this, LLILZLL[0])) == null) {
            return;
        }
        c1242300iQu.LIZJ(item.LLILLJJLI.nid, false);
    }
}
