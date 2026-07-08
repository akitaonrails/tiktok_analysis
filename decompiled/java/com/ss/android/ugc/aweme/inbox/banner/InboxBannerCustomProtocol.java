package com.ss.android.ugc.aweme.inbox.banner;

import X.C13BV;
import X.C13IQ;
import X.InterfaceC1891350zJl;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class InboxBannerCustomProtocol extends InboxBannerProtocol {
    public final C13BV LL;
    public final C13BV LLILLJJLI;

    public InboxBannerCustomProtocol() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LL = c13bv;
        this.LLILLJJLI = c13bv;
    }

    public List<C13IQ<? extends InterfaceC1891350zJl>> LJFF() {
        return this.LL;
    }

    public List<C13IQ<? extends RecyclerView.ViewHolder>> LJI() {
        return this.LLILLJJLI;
    }
}
