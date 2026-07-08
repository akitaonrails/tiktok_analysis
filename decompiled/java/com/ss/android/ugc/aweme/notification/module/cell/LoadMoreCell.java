package com.ss.android.ugc.aweme.notification.module.cell;

import X.C11NJ;
import X.C11S5;
import X.C1242300iQu;
import X.C1242420iR6;
import X.C1266090j3H;
import X.C13LE;
import X.C1701940uOG;
import X.C1720106oR;
import X.C1749280vcc;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C786410Ut5;
import X.EnumC1223070hvt;
import X.EnumC1242330iQx;
import X.InterfaceC2217461Bqa;
import Y.AObserverS223S0100000_19;
import Y.AfS188S0100000_19;
import Y.AkS481S0100000_19;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LoadMoreCell extends BaseChunkCell<C1242420iR6> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1266090j3H LLILZIL = new C1266090j3H(this, 2);
    public final AObserverS223S0100000_19 LLILZLL = new AObserverS223S0100000_19(this, 31);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LoadMoreCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/notification/module/NotificationChunk$CellControl;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C786410Ut5.LLLZLZ((C1749280vcc) this.itemView, 0);
        ((C1749280vcc) this.itemView).LJ();
        NotificationChunkVM notificationChunkVM = ((C1242300iQu) this.LLILZIL.getValue(this, LLIZ[0])).LLILLJJLI;
        notificationChunkVM.yQ2().observe(this, this.LLILZLL);
        EnumC1223070hvt value = notificationChunkVM.yQ2().getValue();
        EnumC1223070hvt enumC1223070hvt = EnumC1223070hvt.LOADING;
        if (value != enumC1223070hvt) {
            if (notificationChunkVM.LLJIJIL != EnumC1242330iQx.EXPAND || notificationChunkVM.yQ2().getValue() == enumC1223070hvt || !notificationChunkVM.LLJILJIL.LIZLLL || notificationChunkVM.LLJILJIL.LJ <= 0) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadMore invalid:");
                sbLIZ.append(notificationChunkVM.LLJIJIL);
                sbLIZ.append(", ");
                sbLIZ.append(notificationChunkVM.yQ2().getValue() == enumC1223070hvt);
                C1720106oR.LIZ("NotificationChunkVM", notificationChunkVM.wQ2(C2188811AlT.LIZIZ(sbLIZ)));
                return;
            }
            notificationChunkVM.yQ2().setValue(enumC1223070hvt);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("NotificationChunkVM", notificationChunkVM.wQ2("loadMore start"));
            NotificationApi.Api apiLIZ = NotificationApi.LIZ();
            MultiNotice multiNotice = new MultiNotice(notificationChunkVM.LLIZLLLIL.LIZ, notificationChunkVM.LLJILJIL.LJ, notificationChunkVM.LLJILJIL.LJFF, 20, 1);
            multiNotice.mayWithMergedTTShopArg(notificationChunkVM.LLIZLLLIL.LJI);
            ((C11NJ) notificationChunkVM.LL.getValue()).LIZ(apiLIZ.LIZ(multiNotice.toReqStr(), 0).LJJJJZI(new AkS481S0100000_19(notificationChunkVM, 8)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS188S0100000_19(notificationChunkVM, 24), new AfS188S0100000_19(notificationChunkVM, 69)));
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        ((C1242300iQu) this.LLILZIL.getValue(this, LLIZ[0])).LLILLJJLI.yQ2().removeObserver(this.LLILZLL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_t, viewGroup, false);
    }
}
