package com.ss.android.ugc.aweme.inbox.shop;

import X.C0PEM;
import X.C13IQ;
import X.C14EU;
import X.C1889090zG7;
import X.C1889110zG9;
import X.C1890390zID;
import X.C23250099c;
import X.C624370OeJ;
import X.C786410Ut5;
import X.EnumC637310OzB;
import X.InterfaceC1891350zJl;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MoveFullEntryAssetsData;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class ShopFullMigrationBannerAssem extends InboxBannerCustomAssem {
    public MoveFullEntryAssetsData LLILZ;

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C624370OeJ.LIZIZ("ShopFullMigrationBannerProtocol", "onCreate");
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C624370OeJ.LIZIZ("ShopFullMigrationBannerProtocol", "onDestroy");
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onReceiveGetShopFullMigrationDataEvent(C1889110zG9 c1889110zG9) {
        if (!c1889110zG9.LIZ) {
            this.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1889090zG7(this, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final RecyclerView.ViewHolder ko(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        int i = C1890390zID.LLILLJJLI;
        C1890390zID c1890390zID = new C1890390zID(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_j, viewGroup, false));
        c1890390zID.LL = new AwS572S0100000_28(this, 251);
        return c1890390zID;
    }
}
