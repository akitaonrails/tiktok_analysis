package com.ss.android.ugc.aweme.im.saas.host.impl.im.activestatus;

import X.AbstractC595720NYc;
import X.C123100dR;
import X.C595700NYa;
import X.C595710NYb;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.common.model.IMSaasConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ActiveStatusObserverProducerImpl implements IActiveStatusObserverProducer {
    /* JADX WARN: Removed duplicated region for block: B:5:0x0008 A[Catch: ConcurrentModificationException -> 0x000b, TRY_LEAVE, TryCatch #0 {ConcurrentModificationException -> 0x000b, blocks: (B:3:0x0002, B:5:0x0008), top: B:18:0x0002 }] */
    @Override // com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.AbstractC595720NYc> LIZ(java.util.List<? extends com.ss.android.ugc.aweme.im.common.model.BaseContact> r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L8
            java.util.List r0 = X.C13LP.LLIIII(r4)     // Catch: java.util.ConcurrentModificationException -> Lb
            if (r0 != 0) goto L11
        L8:
            X.13BV r0 = X.C13BV.INSTANCE     // Catch: java.util.ConcurrentModificationException -> Lb
            goto L11
        Lb:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.13BV r0 = X.C13BV.INSTANCE
        L11:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L1a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.im.common.model.BaseContact r0 = (com.ss.android.ugc.aweme.im.common.model.BaseContact) r0
            if (r0 == 0) goto L32
            X.0NYc r0 = r3.LJ(r0)
        L2c:
            if (r0 == 0) goto L1a
            r2.add(r0)
            goto L1a
        L32:
            r0 = 0
            goto L2c
        L34:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.saas.host.impl.im.activestatus.ActiveStatusObserverProducerImpl.LIZ(java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[PHI: r3
      0x0027: PHI (r3v0 java.lang.String) = (r3v4 java.lang.String), (r3v6 java.lang.String) binds: [B:18:0x0025, B:15:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d A[PHI: r3
      0x002d: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String) binds: [B:20:0x002b, B:18:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C595700NYa LIZIZ(com.ss.android.ugc.aweme.im.common.model.BaseContact r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation
            r4 = 0
            if (r0 == 0) goto L15
            r1 = r6
            com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation) r1
        L8:
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.im.common.model.IMSaasConversation
            if (r0 == 0) goto L13
            com.ss.android.ugc.aweme.im.common.model.IMSaasConversation r6 = (com.ss.android.ugc.aweme.im.common.model.IMSaasConversation) r6
        Le:
            if (r1 != 0) goto L17
            if (r6 != 0) goto L19
            return r4
        L13:
            r6 = r4
            goto Le
        L15:
            r1 = r4
            goto L8
        L17:
            if (r6 == 0) goto L1f
        L19:
            java.lang.String r3 = r6.getConversationId()
            if (r3 != 0) goto L27
        L1f:
            if (r1 == 0) goto L6b
            java.lang.String r3 = r1.getConversationId()
        L25:
            if (r6 == 0) goto L2d
        L27:
            java.util.List r2 = r6.getMemberIdList()
            if (r2 != 0) goto L33
        L2d:
            if (r1 == 0) goto L69
            java.util.List r2 = r1.getMemberIdList()
        L33:
            r1 = 1
            if (r3 == 0) goto L68
            int r0 = r3.length()
            if (r0 == 0) goto L68
            if (r2 == 0) goto L68
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L68
            X.0ZIh r0 = X.InterfaceC897380ZIi.LIZIZ
            r0.getClass()
            X.0ZIi r0 = X.C897370ZIh.LIZ()
            X.0ZHL r0 = r0.LIZJ()
            if (r0 == 0) goto L68
            kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> r0 = r0.LIZ
            if (r0 == 0) goto L68
            java.lang.Object r0 = r0.invoke(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r1) goto L68
            X.0NYa r4 = new X.0NYa
            r4.<init>(r3, r2)
        L68:
            return r4
        L69:
            r2 = r4
            goto L33
        L6b:
            r3 = r4
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.saas.host.impl.im.activestatus.ActiveStatusObserverProducerImpl.LIZIZ(com.ss.android.ugc.aweme.im.common.model.BaseContact):X.0NYa");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer
    public final List<AbstractC595720NYc> LIZJ(List<? extends BaseContact> list) {
        String uid;
        ArrayList arrayList = new ArrayList();
        for (BaseContact baseContact : (ArrayList) list) {
            if (baseContact != null && (uid = baseContact.getUid()) != null) {
                arrayList.add(new C595710NYb(uid));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer
    public final List<AbstractC595720NYc> LIZLLL(List<? extends BaseContact> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            C595700NYa c595700NYaLIZIZ = LIZIZ((BaseContact) it2.next());
            if (c595700NYaLIZIZ != null) {
                arrayList.add(c595700NYaLIZIZ);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer
    public final AbstractC595720NYc LJ(BaseContact baseContact) {
        if (baseContact instanceof IMUser) {
            String uid = baseContact.getUid();
            if (!C123100dR.LIZ(uid) || uid == null) {
                return null;
            }
            return new C595710NYb(uid);
        }
        if (!(baseContact instanceof IMConversation) && !(baseContact instanceof IMSaasConversation)) {
            return null;
        }
        return LIZIZ(baseContact);
    }
}
