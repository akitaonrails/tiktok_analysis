package com.ss.android.ugc.aweme.inbox.bulletin.share;

import X.C0M7Y;
import X.C1371430lnB;
import X.C1377850lxX;
import X.C2188811AlT;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;

/* JADX INFO: loaded from: classes22.dex */
public final class BulletinCopyLinkChannel extends CopyLinkChannel {
    public final View LLILLJJLI;

    public BulletinCopyLinkChannel(View view) {
        super(false);
        this.LLILLJJLI = view;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel, com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
        String strLIZIZ;
        String str = c1371430lnB.LIZJ;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1371430lnB.LIZJ);
            sbLIZ.append(' ');
            sbLIZ.append(c1371430lnB.LIZLLL);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = c1371430lnB.LIZLLL;
        }
        new C1377850lxX(null, false, 7).LIZ(strLIZIZ, context, CertProviderManagerKt.findCert("bpea-bulletin_copy_channel_link", 1476399143), this.LLILLJJLI);
        return true;
    }
}
