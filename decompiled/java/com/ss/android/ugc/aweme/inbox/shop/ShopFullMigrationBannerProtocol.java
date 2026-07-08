package com.ss.android.ugc.aweme.inbox.shop;

import X.C13IQ;
import X.C13LE;
import X.C1890390zID;
import X.C19719912Dl;
import X.C637600Oze;
import X.InterfaceC1891350zJl;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class ShopFullMigrationBannerProtocol extends InboxBannerCustomProtocol {
    public final C637600Oze LLILLL = C637600Oze.LJIIJ;
    public final C19719912Dl LLILZ = C13LE.LIZ(ShopFullMigrationBannerAssem.class);
    public final List<C13IQ<? extends InterfaceC1891350zJl>> LLILZIL = Collections.singletonList(C13LE.LIZ(MoveFullEntryAssetsItemData.class));
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LLILZLL = Collections.singletonList(C13LE.LIZ(C1890390zID.class));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C19719912Dl LIZJ() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C637600Oze LIZLLL() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<? extends InterfaceC1891350zJl>> LJFF() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<? extends RecyclerView.ViewHolder>> LJI() {
        return this.LLILZLL;
    }
}
