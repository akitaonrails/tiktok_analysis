package com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.guidebanner;

import X.C13IQ;
import X.C13LE;
import X.C1896107bj;
import X.C2188811AlT;
import X.C23250099c;
import X.C2423609ec;
import X.C461720I8s;
import X.C786410Ut5;
import X.C886370Ypv;
import X.C888280Yt0;
import X.InterfaceC1891350zJl;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DmAutoArchiveGuideBannerAssem extends InboxBannerCustomAssem {
    public boolean LLILZ;

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem
    public final void fo() {
        this.LLILZ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dm_auto_archive_guide_banner_keva:");
        sbLIZ.append(C461720I8s.LIZIZ());
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        repo.storeInt("auto_archive_banner_shown_time", repo.getInt("auto_archive_banner_shown_time", 0) + 1);
        int i = C888280Yt0.LLILZIL;
        C2423609ec.LIZ("show");
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C886370Ypv(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final RecyclerView.ViewHolder ko(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1896107bj.class))) {
            return new C888280Yt0(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d1x, viewGroup, false), new AwS558S0100000_14(this, 253));
        }
        return null;
    }
}
