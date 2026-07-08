package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0IJT;
import X.C0KVL;
import X.C0KVN;
import X.C20736316Cj;
import X.C445870He5;
import X.C474500IjA;
import android.view.View;
import com.bytedance.android.live.aireply.IAIReplyAnchorManagerService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class AbS56S0200100_7 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS56S0200100_7 abS56S0200100_7, View view) {
        if (view != null) {
            IAIReplyAnchorManagerService.Companion.getClass();
            if (C445870He5.LIZ().feedbackComment(((C0KVL) abS56S0200100_7.l0).LIZ, abS56S0200100_7.j2, true)) {
                C0KVN c0kvn = (C0KVN) abS56S0200100_7.l1;
                c0kvn.LLILZ.setIcon(C20736316Cj.LIZLLL(R.attr.ejl, c0kvn.LLILLL));
                C0KVN c0kvn2 = (C0KVN) abS56S0200100_7.l1;
                c0kvn2.LLILZIL.setIcon(C20736316Cj.LIZLLL(R.attr.eji, c0kvn2.LLILLL));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ai_reply_like");
                c474500IjALIZ.LJIIIIZZ();
                c474500IjALIZ.LJJII("like", "click_type");
                c474500IjALIZ.LJJII(Long.valueOf(((C0KVL) abS56S0200100_7.l0).LIZ.replyId), "msg_id_ai");
                c474500IjALIZ.LIZ();
            }
        }
    }

    public static final void LIZ$1(AbS56S0200100_7 abS56S0200100_7, View view) {
        if (view != null) {
            IAIReplyAnchorManagerService.Companion.getClass();
            if (C445870He5.LIZ().feedbackComment(((C0KVL) abS56S0200100_7.l0).LIZ, abS56S0200100_7.j2, false)) {
                C0KVN c0kvn = (C0KVN) abS56S0200100_7.l1;
                c0kvn.LLILZIL.setIcon(C20736316Cj.LIZLLL(R.attr.ejj, c0kvn.LLILLL));
                C0KVN c0kvn2 = (C0KVN) abS56S0200100_7.l1;
                c0kvn2.LLILZ.setIcon(C20736316Cj.LIZLLL(R.attr.ejk, c0kvn2.LLILLL));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ai_reply_like");
                c474500IjALIZ.LJIIIIZZ();
                c474500IjALIZ.LJJII("unlike", "click_type");
                c474500IjALIZ.LJJII(Long.valueOf(((C0KVL) abS56S0200100_7.l0).LIZ.replyId), "msg_id_ai");
                c474500IjALIZ.LIZ();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS56S0200100_7(C0KVL c0kvl, long j, C0KVN c0kvn, int i) {
        super(300L);
        this.$t = i;
        this.l0 = c0kvl;
        this.j2 = j;
        this.l1 = c0kvn;
    }
}
