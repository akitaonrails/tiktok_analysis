package com.ss.android.ugc.aweme.inbox.shop;

import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1887810zE3;
import X.C1889110zG9;
import X.C1889120zGA;
import X.C1890390zID;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.AObserverS230S0100000_28;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MoveFullEntryAssetsData;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class ShopFullMigrationWidget extends InboxWidget {
    public final ShopFullMigrationViewModel LLIZLLLIL = new ShopFullMigrationViewModel();
    public List<MoveFullEntryAssetsItemData> LLJ = new ArrayList();

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        return Collections.singletonList(C13LE.LIZ(MoveFullEntryAssetsItemData.class));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
        EventBus.LIZLLL().LJIJJ(this);
        this.LLIZLLLIL.LLILLL.observe(this, new AObserverS230S0100000_28(this, 30));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        return this.LLJ;
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onReceiveGetShopFullMigrationDataEvent(C1889110zG9 c1889110zG9) {
        ShopFullMigrationViewModel shopFullMigrationViewModel = this.LLIZLLLIL;
        shopFullMigrationViewModel.getClass();
        MoveFullEntryAssetsData moveFullEntryAssetsDataLJIIIZ = ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).inboxService().LJIIIZ();
        if (moveFullEntryAssetsDataLJIIIZ != null) {
            shopFullMigrationViewModel.LL = moveFullEntryAssetsDataLJIIIZ;
            shopFullMigrationViewModel.vQ2(shopFullMigrationViewModel.LLILLJJLI, moveFullEntryAssetsDataLJIIIZ);
        }
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onReceiveSkylightLiveGuideStateEvent(C1889120zGA c1889120zGA) {
        Integer num;
        ShopFullMigrationViewModel shopFullMigrationViewModel = this.LLIZLLLIL;
        int i = c1889120zGA.LIZ;
        if (i == 4 || (num = shopFullMigrationViewModel.LLILLJJLI) == null || i != num.intValue()) {
            shopFullMigrationViewModel.LLILLJJLI = Integer.valueOf(i);
            shopFullMigrationViewModel.vQ2(Integer.valueOf(i), shopFullMigrationViewModel.LL);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final RecyclerView.ViewHolder uo(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        int i = C1890390zID.LLILLJJLI;
        C1890390zID c1890390zID = new C1890390zID(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_j, viewGroup, false));
        c1890390zID.LL = new C1887810zE3(this);
        return c1890390zID;
    }
}
