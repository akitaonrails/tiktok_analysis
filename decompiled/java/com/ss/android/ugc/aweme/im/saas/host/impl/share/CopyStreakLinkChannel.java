package com.ss.android.ugc.aweme.im.saas.host.impl.share;

import X.C0M7Y;
import X.C1369440ljy;
import X.C1371430lnB;
import X.C1377850lxX;
import X.C2188811AlT;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;

/* JADX INFO: loaded from: classes22.dex */
public final class CopyStreakLinkChannel extends CopyLinkChannel {
    public CopyStreakLinkChannel() {
        super(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel, com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
        String strLIZIZ;
        String str = c1371430lnB.LIZJ;
        boolean z = false;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1371430lnB.LIZJ);
            sbLIZ.append(' ');
            sbLIZ.append(c1371430lnB.LIZLLL);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = c1371430lnB.LIZLLL;
        }
        View viewLIZIZ = null;
        C1377850lxX c1377850lxX = new C1377850lxX(0 == true ? 1 : 0, z, 3);
        Cert certLIZ = C1369440ljy.LIZ();
        if (c0m7y != null) {
            viewLIZIZ = c0m7y.LIZIZ();
        }
        c1377850lxX.LIZ(strLIZIZ, context, certLIZ, viewLIZIZ);
        return true;
    }
}
