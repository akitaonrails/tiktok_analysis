package com.ss.android.ugc.aweme.share.systemshare;

import X.C01GW;
import X.C1402840mbq;
import X.C1B4F;
import X.C452501pT;
import android.net.Uri;
import com.ss.android.ugc.aweme.share.common.ShareEntryFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class SystemShareEntryFragment extends ShareEntryFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkKD02ZjY1OjHELIOSs2JTYkKD02ZhY1Ojs2JRYkKD02DSs4OzYVOiQrJCo9PA==";
    public String LLJIJIL;
    public String LLJILJIL;
    public List<? extends Uri> LLJILJILJ;
    public C1402840mbq LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 623));

    public final SystemShareViewModel SR() {
        return (SystemShareViewModel) this.LLJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.share.common.ShareEntryFragment
    public final void NR() {
        SR().LLJJIJIIJIL.postValue(Unit.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.common.ShareEntryFragment
    public final void OR(C1B4F c1b4f) {
        SR().LLJJIJI.postValue(c1b4f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c0  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.systemshare.SystemShareEntryFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
