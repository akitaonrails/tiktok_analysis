package com.bytedance.awemelobby;

import X.AnonymousClass0580;
import X.C04TD;
import X.C0PEM;
import X.C2296808zG;
import X.C23250099c;
import com.bytedance.lobby.ILobbyNonceGenerator;
import com.ss.android.ugc.aweme.account.interfaces.IAccountNonceUtil;
import com.ss.android.ugc.aweme.account.login.twostep.nonce.AccountNonceUtilImpl;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class LobbyNonceGenerator implements ILobbyNonceGenerator {
    @Override // com.bytedance.lobby.ILobbyNonceGenerator
    public final void LIZ(AwS581S0100000_2 awS581S0100000_2) {
        IAccountNonceUtil iAccountNonceUtil;
        Object objLIZ = C04TD.LIZ(IAccountNonceUtil.class, false);
        if (objLIZ != null) {
            iAccountNonceUtil = (IAccountNonceUtil) objLIZ;
        } else {
            if (C04TD.LJLILLLLZI == null) {
                synchronized (IAccountNonceUtil.class) {
                    if (C04TD.LJLILLLLZI == null) {
                        C04TD.LJLILLLLZI = new AccountNonceUtilImpl();
                    }
                }
            }
            iAccountNonceUtil = C04TD.LJLILLLLZI;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new AnonymousClass0580(iAccountNonceUtil, "google", awS581S0100000_2, null), 3);
    }
}
