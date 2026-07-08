package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.recallmessage;

import X.C05LP;
import X.C09AE;
import X.C0ZFW;
import X.C2097608Jq;
import X.C23250099c;
import X.C462150IAj;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class ReEditViewModel extends AssemViewModel<C462150IAj> {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final Map<String, C09AE> LL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C462150IAj(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[PHI: r0 r6
      0x003a: PHI (r0v10 java.lang.Long) = (r0v3 java.lang.Long), (r0v13 java.lang.Long) binds: [B:16:0x002b, B:21:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r6v3 com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint) = 
      (r6v1 com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint)
      (r6v5 com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint)
     binds: [B:16:0x002b, B:21:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C869590Y9l vQ2(X.C869590Y9l r8) {
        /*
            com.bytedance.im.core.proto.ReferenceInfo r8 = r8.getReferenceInfo()
            r7 = 0
            if (r8 != 0) goto L8
            return r7
        L8:
            java.lang.Long r0 = r8.referenced_message_id
            if (r0 == 0) goto L71
            long r4 = r0.longValue()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L17
            return r7
        L17:
            java.lang.String r3 = r8.hint     // Catch: java.lang.Exception -> L24
            java.lang.Class<com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint> r0 = com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint.class
            java.lang.Object r6 = X.C051M.LIZIZ(r0, r3)     // Catch: java.lang.Exception -> L24
            com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint r6 = (com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint) r6     // Catch: java.lang.Exception -> L24
            if (r6 == 0) goto L29
            goto L2e
        L24:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r6 = r7
        L29:
            java.lang.Long r0 = r8.sender
            if (r0 == 0) goto L3e
            goto L3a
        L2e:
            java.lang.String r0 = r6.getRefmsg_uid()
            if (r0 == 0) goto L29
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L29
        L3a:
            long r1 = r0.longValue()
        L3e:
            X.0Y9l r3 = new X.0Y9l
            r3.<init>()
            r3.setMsgId(r4)
            r3.setSender(r1)
            if (r6 == 0) goto L65
            int r2 = r6.getRefmsg_type()
        L4f:
            r3.setMsgType(r2)
            if (r6 == 0) goto L5a
            java.lang.String r0 = r6.getRefmsg_content()
            if (r0 != 0) goto L5c
        L5a:
            java.lang.String r0 = ""
        L5c:
            r3.setContent(r0)
            X.0YUT r0 = X.C0YUT.AVAILABLE
            r3.setMessageStatus(r0)
            return r3
        L65:
            java.lang.Long r0 = r8.ref_message_type
            if (r0 == 0) goto L6f
            long r0 = r0.longValue()
            int r2 = (int) r0
            goto L4f
        L6f:
            r2 = 0
            goto L4f
        L71:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.recallmessage.ReEditViewModel.vQ2(X.0Y9l):X.0Y9l");
    }

    public final void wQ2(SessionInfo sessionInfo, Function1<? super Map<String, String>, Unit> function1) {
        if (!sessionInfo.isGroupChat()) {
            function1.invoke(C2097608Jq.LJ());
        } else {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C05LP(C0ZFW.LIZ.LJJIFFI(sessionInfo.getConversationId()), function1, null), 3);
        }
    }
}
