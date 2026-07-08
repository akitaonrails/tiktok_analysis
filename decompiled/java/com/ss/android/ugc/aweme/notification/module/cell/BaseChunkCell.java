package com.ss.android.ugc.aweme.notification.module.cell;

import X.C1242250iQp;
import X.C1242300iQu;
import X.C1266090j3H;
import X.C13LE;
import X.C2188811AlT;
import X.C2217381BqS;
import X.InterfaceC2217461Bqa;
import Y.AObserverS223S0100000_19;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;

/* JADX INFO: loaded from: classes20.dex */
public class BaseChunkCell<T extends C1242250iQp> extends PowerCell<T> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1266090j3H LL = new C1266090j3H(this, 0);
    public int LLILLJJLI = -1;
    public final AObserverS223S0100000_19 LLILLL = new AObserverS223S0100000_19(this, 30);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseChunkCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/notification/module/NotificationChunk$CellControl;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public void L5() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPositionChanged:[");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", ");
        T item = getItem();
        sbLIZ.append(item != null ? Integer.valueOf(item.LL) : null);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        NotificationChunkVM notificationChunkVM;
        LiveData liveData;
        super.onViewAttachedToWindow();
        C1242300iQu c1242300iQu = (C1242300iQu) this.LL.getValue(this, LLILZ[0]);
        if (c1242300iQu == null || (notificationChunkVM = c1242300iQu.LLILLJJLI) == null || (liveData = (LiveData) notificationChunkVM.LLJILLL.getValue()) == null) {
            return;
        }
        liveData.observe(this, this.LLILLL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewDetachedFromWindow() {
        NotificationChunkVM notificationChunkVM;
        LiveData liveData;
        super.onViewDetachedFromWindow();
        C1242300iQu c1242300iQu = (C1242300iQu) this.LL.getValue(this, LLILZ[0]);
        if (c1242300iQu == null || (notificationChunkVM = c1242300iQu.LLILLJJLI) == null || (liveData = (LiveData) notificationChunkVM.LLJILLL.getValue()) == null) {
            return;
        }
        liveData.removeObserver(this.LLILLL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: I5 */
    public void onBindItemView(T t) {
        super.onBindItemView(t);
        this.LLILLJJLI = t.LL;
    }
}
