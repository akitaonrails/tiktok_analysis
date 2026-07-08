package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C01GW;
import X.C112400bi;
import X.C1399230mW1;
import X.C13IQ;
import X.C13LE;
import X.C2252321DDq;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC637310OzB;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AILiveInboxBannerAssem extends InboxBannerCustomAssem {
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(304));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem
    public final void fo() {
        ((IAILiveService) this.LLILZ.getValue()).mobInboxBanner("show");
        ((IAILiveService) this.LLILZ.getValue()).onShowBanner();
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (((IAILiveService) this.LLILZ.getValue()).canShowBanner()) {
            oo(true);
        } else {
            oo(false);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    public final void oo(boolean z) {
        Pair pair;
        C2252321DDq c2252321DDq = this.LL;
        if (z) {
            pair = new Pair(EnumC637310OzB.TOP_SHOW, new C112400bi(new AwS565S0100000_21(this, 732)));
        } else {
            pair = new Pair(EnumC637310OzB.DISMISS, null);
        }
        c2252321DDq.setValue(pair);
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final RecyclerView.ViewHolder ko(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C112400bi.class))) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a9u, viewGroup, false);
            C724240Sb0.LJI(this);
            return new C1399230mW1(viewTd);
        }
        return null;
    }
}
