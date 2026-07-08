package com.ss.android.ugc.aweme.im.sharepanel.impl.share.data;

import X.C08A4;
import X.C0I0B;
import X.C2188811AlT;
import X.C882400YjW;
import X.C883250Ykt;
import X.C883460YlE;
import X.EnumC883280Ykw;
import X.InterfaceC883330Yl1;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareStatusKeva implements IShareStatusKeva, InterfaceC883330Yl1 {
    public static final ShareStatusKeva LL;
    public static Keva LLILLJJLI;

    public static final class Service implements IShareStatusKeva {
        public final /* synthetic */ ShareStatusKeva LL = ShareStatusKeva.LL;

        @Override // com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva
        public final void LIZ(Integer num, String str) {
            this.LL.LIZ(num, str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva
        public final void LIZIZ() {
            this.LL.LIZIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva
        public final int LIZJ(String str) {
            return this.LL.LIZJ(str);
        }
    }

    public final synchronized Keva LJFF() {
        Keva repo;
        repo = LLILLJJLI;
        if (repo == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("share_status_repo");
            String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            sbLIZ.append(curUserId);
            repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
            LLILLJJLI = repo;
        }
        return repo;
    }

    static {
        ShareStatusKeva shareStatusKeva = new ShareStatusKeva();
        LL = shareStatusKeva;
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        C883250Ykt.LIZIZ(shareStatusKeva);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva
    public final void LIZIZ() {
        LJFF().clear();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva
    public final int LIZJ(String str) {
        if (str == null) {
            return 0;
        }
        return LL.LJFF().getInt(str, 0);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva
    public final synchronized void LIZ(Integer num, String str) {
        if (num != null) {
            if (C08A4.LIZ(Integer.valueOf(num.intValue()))) {
                LL.LJFF().storeInt(str, num.intValue());
            }
        }
    }

    @Override // X.InterfaceC883330Yl1
    public final void LJII(EnumC883280Ykw enumC883280Ykw, C883460YlE c883460YlE) {
        if (enumC883280Ykw != EnumC883280Ykw.UNKNOWN) {
            LLILLJJLI = null;
        }
    }
}
