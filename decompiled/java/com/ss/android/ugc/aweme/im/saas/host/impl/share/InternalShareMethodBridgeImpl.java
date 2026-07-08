package com.ss.android.ugc.aweme.im.saas.host.impl.share;

import X.C01GW;
import X.C1370970lmR;
import X.C452501pT;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IInternalShareMethodBridge;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.internalshare.api.service.IExternalCreateGroupService;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class InternalShareMethodBridgeImpl implements IInternalShareMethodBridge {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(477));

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IInternalShareMethodBridge
    public final String LJ(IMUser iMUser) {
        IInternalShareApi.LIZ.getClass();
        return C1370970lmR.LIZ().LIZJ().LJIL(iMUser, "");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IInternalShareMethodBridge
    public final void LIZIZ(String str, Map<String, String> map) {
        IExternalCreateGroupService iExternalCreateGroupService = (IExternalCreateGroupService) PluggableExtentionKt.pluggableSpi$default(IExternalCreateGroupService.class, false, false, false, 14, null);
        if (iExternalCreateGroupService != null) {
            iExternalCreateGroupService.LIZIZ(str, map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IInternalShareMethodBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(boolean r17, boolean r18, boolean r19, int r20, boolean r21, boolean r22, java.util.List<? extends com.ss.android.ugc.aweme.im.common.model.BaseContact> r23, boolean r24, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.common.model.BaseContact>> r25) {
        /*
            r16 = this;
            r3 = r25
            boolean r0 = r3 instanceof X.C06S5
            r5 = r16
            if (r0 == 0) goto L72
            r15 = r3
            X.06S5 r15 = (X.C06S5) r15
            int r2 = r15.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r15.LLILLL = r2
        L16:
            java.lang.Object r1 = r15.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r15.LLILLL
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 != r3) goto L78
            X.C155000ia.LIZIZ(r1)
        L26:
            if (r1 != 0) goto L2a
        L28:
            X.13BV r1 = X.C13BV.INSTANCE
        L2a:
            return r1
        L2b:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = r5.LIZIZ
            java.lang.Object r5 = r0.getValue()
            X.0lcL r5 = (X.InterfaceC1364710lcL) r5
            if (r5 == 0) goto L28
            r13 = 0
            if (r23 == 0) goto L5a
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r2 = r23.iterator()
        L44:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.im.common.model.BaseContact r1 = (com.ss.android.ugc.aweme.im.common.model.BaseContact) r1
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMContact
            if (r0 == 0) goto L44
            if (r1 == 0) goto L44
            r13.add(r1)
            goto L44
        L5a:
            r15.LLILLL = r3
            r6 = 0
            r14 = r24
            r12 = r22
            r11 = r21
            r10 = r20
            r9 = r19
            r8 = r18
            r7 = r17
            java.lang.Object r1 = r5.LIZLLL(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r4) goto L26
            return r4
        L72:
            X.06S5 r15 = new X.06S5
            r15.<init>(r5, r3)
            goto L16
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.saas.host.impl.share.InternalShareMethodBridgeImpl.LJFF(boolean, boolean, boolean, int, boolean, boolean, java.util.List, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.share.IInternalShareMethodBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r17, boolean r18, boolean r19, boolean r20, int r21, boolean r22, boolean r23, java.util.List<? extends com.ss.android.ugc.aweme.im.common.model.BaseContact> r24, boolean r25, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.common.model.BaseContact>> r26) {
        /*
            r16 = this;
            r3 = r26
            boolean r0 = r3 instanceof X.C06S6
            r5 = r16
            if (r0 == 0) goto L73
            r15 = r3
            X.06S6 r15 = (X.C06S6) r15
            int r2 = r15.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r15.LLILLL = r2
        L16:
            java.lang.Object r1 = r15.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r15.LLILLL
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 != r3) goto L79
            X.C155000ia.LIZIZ(r1)
        L26:
            if (r1 != 0) goto L2a
        L28:
            X.13BV r1 = X.C13BV.INSTANCE
        L2a:
            return r1
        L2b:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = r5.LIZIZ
            java.lang.Object r5 = r0.getValue()
            X.0lcL r5 = (X.InterfaceC1364710lcL) r5
            if (r5 == 0) goto L28
            r13 = 0
            if (r24 == 0) goto L5a
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r2 = r24.iterator()
        L44:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.im.common.model.BaseContact r1 = (com.ss.android.ugc.aweme.im.common.model.BaseContact) r1
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMContact
            if (r0 == 0) goto L44
            if (r1 == 0) goto L44
            r13.add(r1)
            goto L44
        L5a:
            r15.LLILLL = r3
            r14 = r25
            r12 = r23
            r11 = r22
            r10 = r21
            r9 = r20
            r8 = r19
            r7 = r18
            r6 = r17
            java.lang.Object r1 = r5.LIZLLL(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r4) goto L26
            return r4
        L73:
            X.06S6 r15 = new X.06S6
            r15.<init>(r5, r3)
            goto L16
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.saas.host.impl.share.InternalShareMethodBridgeImpl.LIZLLL(int, boolean, boolean, boolean, int, boolean, boolean, java.util.List, boolean, X.05Vn):java.lang.Object");
    }
}
