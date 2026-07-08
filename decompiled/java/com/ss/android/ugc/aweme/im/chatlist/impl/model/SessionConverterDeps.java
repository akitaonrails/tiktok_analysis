package com.ss.android.ugc.aweme.im.chatlist.impl.model;

import X.C04TD;
import X.C069P;
import X.C06LY;
import X.C0Y8T;
import X.C1334205Ka;
import X.C1520305xJ;
import X.C1586906Jf;
import X.C19212010Ec;
import X.C23250099c;
import X.C23271099x;
import X.C869590Y9l;
import com.ss.android.ugc.aweme.im.chatlist.api.adapter.ISessionConverterDeps;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class SessionConverterDeps implements ISessionConverterDeps {
    public static ISessionConverterDeps LIZLLL() {
        Object objLIZ = C04TD.LIZ(ISessionConverterDeps.class, false);
        if (objLIZ != null) {
            return (ISessionConverterDeps) objLIZ;
        }
        if (C04TD.V0 == null) {
            synchronized (ISessionConverterDeps.class) {
                if (C04TD.V0 == null) {
                    C04TD.V0 = new SessionConverterDeps();
                }
            }
        }
        return C04TD.V0;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.adapter.ISessionConverterDeps
    public final IMUser LIZ(String str) {
        IMContactApi.LIZ.getClass();
        IMUser iMUserLIZLLL = C069P.LIZ().LJ().LIZLLL(str, "", "session_convert");
        if (iMUserLIZLLL != null && C19212010Ec.LIZJ.LJLLLLLL() && iMUserLIZLLL.getImUserBizInfo() == null) {
            return (IMUser) C23250099c.LJ(C23271099x.INSTANCE, new C1334205Ka(iMUserLIZLLL, null));
        }
        return iMUserLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.adapter.ISessionConverterDeps
    public final IMUser LIZIZ(C869590Y9l c869590Y9l) {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().LIZLLL(String.valueOf(c869590Y9l.getSender()), c869590Y9l.getSecSender(), "im_message_request");
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.adapter.ISessionConverterDeps
    public final Pair<CharSequence, Boolean> LIZJ(C0Y8T c0y8t) {
        IStreakService.LJJIIZ.getClass();
        C1520305xJ c1520305xJB = C06LY.LIZ().b(c0y8t, null);
        if (c1520305xJB == null) {
            IStreakPetService.LIZ.getClass();
            c1520305xJB = C1586906Jf.LIZ().b(c0y8t, null);
            if (c1520305xJB == null) {
                return null;
            }
        }
        return new Pair<>(c1520305xJB.LIZ, Boolean.valueOf(c1520305xJB.LIZIZ));
    }
}
