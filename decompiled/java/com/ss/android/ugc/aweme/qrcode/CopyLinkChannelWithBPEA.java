package com.ss.android.ugc.aweme.qrcode;

import X.C0M7Y;
import X.C1371430lnB;
import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl;

/* JADX INFO: loaded from: classes17.dex */
public final class CopyLinkChannelWithBPEA extends CopyLinkChannel {
    public final Cert LLILLJJLI;
    public final boolean LLILLL;

    public CopyLinkChannelWithBPEA() {
        this(3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CopyLinkChannelWithBPEA(int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(null, z);
    }

    public CopyLinkChannelWithBPEA(Cert cert, boolean z) {
        super(false);
        this.LLILLJJLI = cert;
        this.LLILLL = z;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel, com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
        if (c1371430lnB.LIZLLL.length() == 0) {
            return false;
        }
        return ShareLinkServiceImpl.LJFF().LJ(c1371430lnB, context, this.LLILLL, this.LLILLJJLI);
    }
}
