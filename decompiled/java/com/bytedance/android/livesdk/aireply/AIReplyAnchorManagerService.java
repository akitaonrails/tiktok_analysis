package com.bytedance.android.livesdk.aireply;

import X.C054G;
import X.C05YD;
import X.C09IR;
import X.C0JO9;
import X.C0PEM;
import X.C1BNE;
import X.C1DFH;
import X.C2107308Nj;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C2296808zG;
import X.C23250099c;
import X.C472360Ifi;
import X.InterfaceC1106030et7;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import com.bytedance.android.live.aireply.IAIReplyAnchorManagerService;
import com.bytedance.android.livesdk.model.CommentReply;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes8.dex */
public class AIReplyAnchorManagerService implements IAIReplyAnchorManagerService {
    public volatile int LL = -1;
    public final C2252321DDq LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;
    public final C054G LLILZIL;
    public final C2252331DDr LLILZLL;

    @Override // com.bytedance.android.live.aireply.IAIReplyAnchorManagerService
    public final Object getAiCommentReplySwitch(DataChannel dataChannel, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LIZ(this, dataChannel, interfaceC1364105Vn);
    }

    public AIReplyAnchorManagerService() {
        Boolean bool = Boolean.FALSE;
        this.LLILLJJLI = C1BNE.LIZ(bool);
        Boolean boolLIZ = InterfaceC1106030et7.J7.LIZ();
        this.LLILLL = C1BNE.LIZ(Boolean.valueOf(boolLIZ != null ? boolLIZ.booleanValue() : false));
        this.LLILZ = C1BNE.LIZ(bool);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZIL = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLILZLL = C09IR.LIZIZ(0, 0, null, 7);
    }

    @Override // com.bytedance.android.live.aireply.IAIReplyAnchorManagerService
    public final /* bridge */ /* synthetic */ InterfaceC346201Wa getFeedbackState() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.android.live.aireply.IAIReplyAnchorManagerService
    public final /* bridge */ /* synthetic */ C05YD getHasPermission() {
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.android.live.aireply.IAIReplyAnchorManagerService
    public final /* bridge */ /* synthetic */ C05YD getSwitchLoading() {
        return this.LLILZ;
    }

    @Override // com.bytedance.android.live.aireply.IAIReplyAnchorManagerService
    public final /* bridge */ /* synthetic */ C05YD getSwitchStateFlow() {
        return this.LLILLL;
    }

    @Override // com.bytedance.android.live.aireply.IAIReplyAnchorManagerService
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.aireply.IAIReplyAnchorManagerService
    public final void refreshPermission(boolean z) {
        this.LLILLJJLI.setValue(Boolean.valueOf(z));
    }

    @Override // com.bytedance.android.live.aireply.IAIReplyAnchorManagerService
    public final boolean updateSwitchState(DataChannel dataChannel, boolean z) {
        if (this.LL == 0) {
            return z;
        }
        C23250099c.LIZLLL(this.LLILZIL, null, null, new C472360Ifi(this, dataChannel, z, null), 3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object LIZ(com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService r5, com.bytedance.ies.sdk.datachannel.DataChannel r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof X.C0JOA
            if (r0 == 0) goto L5f
            r4 = r7
            X.0JOA r4 = (X.C0JOA) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L49
            if (r0 != r2) goto L65
            com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService r5 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            if (r0 == r2) goto L2d
            r2 = 0
        L2d:
            X.1DDq r0 = r5.LLILLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == r2) goto L44
            X.1DDq r1 = r5.LLILLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.setValue(r0)
        L44:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L49:
            X.C155000ia.LIZIZ(r3)
            java.lang.Class<com.bytedance.android.live.function.IRoomFunctionService> r0 = com.bytedance.android.live.function.IRoomFunctionService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.function.IRoomFunctionService r0 = (com.bytedance.android.live.function.IRoomFunctionService) r0
            r4.LL = r5
            r4.LLILZ = r2
            java.lang.Object r3 = r0.getAiCommentReplySwitch(r6, r4)
            if (r3 != r1) goto L24
            return r1
        L5f:
            X.0JOA r4 = new X.0JOA
            r4.<init>(r5, r7)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService.LIZ(com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService, com.bytedance.ies.sdk.datachannel.DataChannel, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.android.live.aireply.IAIReplyAnchorManagerService
    public final boolean feedbackComment(CommentReply commentReply, long j, boolean z) {
        if (commentReply.LIZ) {
            return false;
        }
        int i = commentReply.anchorFeedbackStatus;
        if (i == 1) {
            if (z) {
                return false;
            }
        } else if (i == 2 && !z) {
            return false;
        }
        C23250099c.LIZLLL(this.LLILZIL, null, null, new C0JO9(commentReply, z, j, this, null), 3);
        return true;
    }
}
