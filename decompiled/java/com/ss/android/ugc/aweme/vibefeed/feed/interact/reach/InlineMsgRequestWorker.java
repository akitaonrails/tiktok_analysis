package com.ss.android.ugc.aweme.vibefeed.feed.interact.reach;

import X.AbstractC795160VHe;
import X.C098200Yq;
import X.C0P30;
import X.C0P31;
import X.C0P3K;
import X.C189200o6;
import X.C23250099c;
import X.C23271099x;
import X.C629330OmJ;
import X.C795170VHf;
import X.C795180VHg;
import X.EnumC912680ZrG;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.vibefeed.model.VibeReachResponse;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class InlineMsgRequestWorker extends Worker {
    @Override // androidx.work.Worker
    public final AbstractC795160VHe LJII() {
        Object c098200Yq;
        C0P31 c0p31LIZJ;
        String strLIZJ = this.LLILLJJLI.LIZIZ.LIZJ("cur_user_id");
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        String strLIZJ2 = this.LLILLJJLI.LIZIZ.LIZJ("to_user_id");
        if (strLIZJ2 == null) {
            strLIZJ2 = "";
        }
        String strLIZJ3 = this.LLILLJJLI.LIZIZ.LIZJ("conversation_id");
        if (strLIZJ3 == null) {
            strLIZJ3 = "";
        }
        String strLIZJ4 = this.LLILLJJLI.LIZIZ.LIZJ("feed_id");
        if (strLIZJ4 == null) {
            strLIZJ4 = "";
        }
        Object obj = ((HashMap) this.LLILLJJLI.LIZIZ.LIZ).get("reach_type");
        int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
        String strLIZJ5 = this.LLILLJJLI.LIZIZ.LIZJ("inline_msg_info");
        String str = strLIZJ5 != null ? strLIZJ5 : "";
        Object obj2 = ((HashMap) this.LLILLJJLI.LIZIZ.LIZ).get("mutual_feed_scene");
        int iIntValue2 = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
        if (!(strLIZJ.length() == 0)) {
            if (!(strLIZJ3.length() == 0)) {
                if ((strLIZJ2.length() == 0) && iIntValue2 == EnumC912680ZrG.MUTUAL_FEED_SCENE_PRIVATE.getValue()) {
                    return new C795170VHf();
                }
                try {
                    c098200Yq = (VibeReachResponse) C23250099c.LJ(C23271099x.INSTANCE, new C629330OmJ(strLIZJ3, strLIZJ, strLIZJ2, strLIZJ4, iIntValue, iIntValue2, str, null));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (C189200o6.m8isSuccessimpl(c098200Yq) && (c0p31LIZJ = C0P30.LIZ().LIZJ(strLIZJ3)) != null) {
                    c0p31LIZJ.LJIJI(Collections.singletonList(C0P3K.SEND_INLINE_MSG));
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                return c098200Yq == null ? new C795170VHf() : new C795180VHg();
            }
        }
        return new C795170VHf();
    }

    public InlineMsgRequestWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
