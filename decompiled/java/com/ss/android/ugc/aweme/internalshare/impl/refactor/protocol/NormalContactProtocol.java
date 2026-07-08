package com.ss.android.ugc.aweme.internalshare.impl.refactor.protocol;

import X.C1362160lYE;
import X.C1362180lYG;
import X.C1362360lYY;
import X.C1362370lYZ;
import X.C1362510lYn;
import X.C1365460ldY;
import X.C13BV;
import X.C1462005nu;
import X.InterfaceC1361730lXX;
import X.InterfaceC1361740lXY;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelHeadPowerCell;

/* JADX INFO: loaded from: classes22.dex */
public final class NormalContactProtocol implements IContactListProtocol<C1362370lYZ> {
    public static final /* synthetic */ int LL = 0;

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final int priority() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final Class<? extends PowerCell<C1362370lYZ>> getWithCell() {
        return SharePanelHeadPowerCell.class;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean Hl1(IMContact iMContact) {
        if (!(iMContact instanceof IMUser) && !(iMContact instanceof IMConversation) && !(iMContact instanceof C1462005nu) && !(iMContact instanceof IMUserBaseInfo) && !(iMContact instanceof MAFIMUser) && !(iMContact instanceof C1365460ldY)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361740lXY<C1362370lYZ> iJ1(C1362160lYE c1362160lYE) {
        return new C1362360lYY(c1362160lYE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1361730lXX ag0(X.InterfaceC1361730lXX r13, X.C1362170lYF r14) {
        /*
            r12 = this;
            X.0lYZ r13 = (X.C1362370lYZ) r13
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r2 = r13.LL
            X.0lYa r3 = r14.LIZLLL
            r8 = 0
            if (r3 == 0) goto L9a
            java.lang.String r0 = r3.LIZJ
        Lb:
            r9 = 1
            if (r0 == 0) goto L8d
            java.lang.String r1 = r2.getUid()
            java.lang.String r0 = r3.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8d
            java.util.Set<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r0 = r3.LIZ
            r0.add(r2)
            r10 = 1
        L20:
            X.0lYr r0 = com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer r0 = X.C1362550lYr.LIZ()
            if (r0 == 0) goto L8b
            X.0NYc r1 = r0.LJ(r2)
        L2f:
            X.0NYn r0 = com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService r0 = X.C595830NYn.LIZ()
            X.0NXw r0 = r0.LIZIZ(r1)
            if (r0 == 0) goto L42
            X.0GsP r8 = X.C896480ZEw.LIZIZ(r0)
        L42:
            X.0lYc r1 = r14.LIZIZ
            X.0lYH r0 = r14.LIZ
            boolean r11 = r1.gr0(r0)
            X.0lYc r1 = r14.LIZIZ
            X.0lYH r0 = r14.LIZ
            boolean r7 = r1.F62(r2, r0)
            if (r3 == 0) goto L5c
            X.0lZy r0 = r3.LIZIZ
            if (r0 == 0) goto L5c
            java.lang.String r6 = r0.LIZIZ
            if (r6 != 0) goto L5e
        L5c:
            java.lang.String r6 = r13.LLILZ
        L5e:
            X.0lYG r5 = new X.0lYG
            X.0lYk r4 = X.C1362390lYb.LIZ(r2, r10, r8)
            X.0lYn r3 = new X.0lYn
            if (r7 != 0) goto L84
            if (r10 != 0) goto L84
            if (r11 != 0) goto L84
            r2 = 0
        L6d:
            r1 = 0
        L6e:
            r0 = 4
            r3.<init>(r2, r1, r0)
            if (r7 != 0) goto L82
            if (r11 == 0) goto L78
            if (r10 == 0) goto L82
        L78:
            r5.<init>(r4, r3, r9)
            r0 = 23
            X.0lYZ r0 = X.C1362370lYZ.LIZ(r13, r6, r8, r5, r0)
            return r0
        L82:
            r9 = 0
            goto L78
        L84:
            r2 = 1
            if (r11 == 0) goto L6d
            if (r10 != 0) goto L6d
            r1 = 1
            goto L6e
        L8b:
            r1 = r8
            goto L2f
        L8d:
            X.0lYH r0 = r14.LIZ
            java.util.Set<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r0 = r0.LLILLL
            boolean r10 = r0.contains(r2)
            if (r3 != 0) goto L20
            X.0GsP r8 = r13.LLILZLL
            goto L42
        L9a:
            r0 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.refactor.protocol.NormalContactProtocol.ag0(X.0lXX, X.0lYF):X.0lXX");
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361730lXX xS(int i, IMContact iMContact) {
        return new C1362370lYZ(iMContact, i, false, null, C13BV.INSTANCE, null, new C1362180lYG((C1362510lYn) null, false, 7));
    }
}
