package com.ss.android.ugc.aweme.im.send.service;

import X.C01NI;
import X.C099R;
import X.C13LP;
import X.C1496910p3Z;
import X.C874530YSl;
import X.C905370ZfT;
import X.C905560Zfm;
import X.InterfaceC1364105Vn;
import X.InterfaceC905380ZfU;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS248S0000000_14;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSendMessageServiceImpl implements IMSendMessageService {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.im.send.service.IMSendMessageService
    public final ByteString LIZ(String str) {
        long j;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -182649969:
                if (!str.equals("other_fans")) {
                    return null;
                }
                j = 2;
                C1496910p3Z c1496910p3Z = ByteString.Companion;
                C905560Zfm c905560Zfm = new C905560Zfm();
                c905560Zfm.LJI = Long.valueOf(j);
                return C1496910p3Z.LIZJ(c1496910p3Z, c905560Zfm.build().encode());
            case 3135424:
                if (!str.equals("fans")) {
                    return null;
                }
                j = 1;
                C1496910p3Z c1496910p3Z2 = ByteString.Companion;
                C905560Zfm c905560Zfm2 = new C905560Zfm();
                c905560Zfm2.LJI = Long.valueOf(j);
                return C1496910p3Z.LIZJ(c1496910p3Z2, c905560Zfm2.build().encode());
            case 765915793:
                if (!str.equals("following")) {
                    return null;
                }
                j = 3;
                C1496910p3Z c1496910p3Z22 = ByteString.Companion;
                C905560Zfm c905560Zfm22 = new C905560Zfm();
                c905560Zfm22.LJI = Long.valueOf(j);
                return C1496910p3Z.LIZJ(c1496910p3Z22, c905560Zfm22.build().encode());
            case 1539074444:
                if (!str.equals("following_list")) {
                    return null;
                }
                j = 3;
                C1496910p3Z c1496910p3Z222 = ByteString.Companion;
                C905560Zfm c905560Zfm222 = new C905560Zfm();
                c905560Zfm222.LJI = Long.valueOf(j);
                return C1496910p3Z.LIZJ(c1496910p3Z222, c905560Zfm222.build().encode());
            case 1605556258:
                if (!str.equals("other_following")) {
                    return null;
                }
                j = 4;
                C1496910p3Z c1496910p3Z2222 = ByteString.Companion;
                C905560Zfm c905560Zfm2222 = new C905560Zfm();
                c905560Zfm2222.LJI = Long.valueOf(j);
                return C1496910p3Z.LIZJ(c1496910p3Z2222, c905560Zfm2222.build().encode());
            default:
                return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.send.service.IMSendMessageService
    public final Object LIZIZ(InterfaceC905380ZfU interfaceC905380ZfU, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = C874530YSl.LIZ(C13LP.LJLILLLLZI(new C905370ZfT(interfaceC905380ZfU), interfaceC905380ZfU.LIZ()), new C01NI(null), AFwS248S0000000_14.get$arr$(424), interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
