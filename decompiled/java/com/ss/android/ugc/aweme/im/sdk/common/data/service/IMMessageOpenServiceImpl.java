package com.ss.android.ugc.aweme.im.sdk.common.data.service;

import X.C01GW;
import X.C051M;
import X.C06CY;
import X.C0YTK;
import X.C452501pT;
import com.ss.android.ugc.aweme.creation.sender.IMediaMsgSendManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.service.service.IIMMessageOpenService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class IMMessageOpenServiceImpl implements IIMMessageOpenService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(499));

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMMessageOpenService
    public final Object LIZ(String str, String str2, Map map, C06CY c06cy) {
        return ConstructMessageContentPbApi.LIZIZ.constructMessageContentPb(2000, str, str2, C051M.LJ(map, false), c06cy);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMMessageOpenService
    public final void LIZJ(List<String> list, List<? extends Object> list2, String str, C0YTK c0ytk) {
        IMediaMsgSendManager iMediaMsgSendManager = (IMediaMsgSendManager) PluggableExtentionKt.pluggableSpiForReal(IMediaMsgSendManager.class);
        if (iMediaMsgSendManager != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                iMediaMsgSendManager.LIZIZ(it2.next(), list2, str, c0ytk, new LinkedHashMap(), null, QuoteMode.None.INSTANCE, null, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    @Override // com.ss.android.ugc.aweme.im.service.service.IIMMessageOpenService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.service.service.ConstructMessageContentPbResponse> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof X.C058Y
            if (r0 == 0) goto L3b
            r8 = r14
            X.058Y r8 = (X.C058Y) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r3 = r8.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L41
            X.C155000ia.LIZIZ(r3)
        L22:
            return r3
        L23:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = r9.LIZ
            java.lang.Object r3 = r0.getValue()
            X.064h r3 = (X.C15481064h) r3
            r8.LLILLL = r1
            r7 = r13
            r6 = r12
            r5 = r11
            r4 = r10
            java.lang.Object r3 = r3.LIZIZ(r4, r5, r6, r7, r8)
            if (r3 != r2) goto L22
            return r2
        L3b:
            X.058Y r8 = new X.058Y
            r8.<init>(r9, r14)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.data.service.IMMessageOpenServiceImpl.LIZIZ(int, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }
}
