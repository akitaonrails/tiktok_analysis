package kotlin.jvm.internal;

import X.C01U6;
import X.C09AY;
import X.C1894690zP9;
import X.C1899560zX0;
import X.C1899570zX1;
import X.C1903040zcc;
import android.content.Context;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS80S0301000_28 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS80S0301000_28 awS80S0301000_28) {
        int i = awS80S0301000_28.i3;
        if (i == 0) {
            C1899570zX1 c1899570zX1 = (C1899570zX1) awS80S0301000_28.l0;
            Context context = (Context) awS80S0301000_28.l1;
            C1894690zP9 c1894690zP9 = (C1894690zP9) awS80S0301000_28.l2;
            c1899570zX1.getClass();
            C01U6.LIZIZ(new AwS429S0200000_28(c1894690zP9, c1899570zX1, context, 114));
        } else {
            C1899570zX1 c1899570zX12 = (C1899570zX1) awS80S0301000_28.l0;
            Context context2 = (Context) awS80S0301000_28.l1;
            c1899570zX12.getClass();
            C01U6.LIZIZ(new C1899560zX0(null, null, null, c1899570zX12, context2, 0, 0, i));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS80S0301000_28 r7) {
        /*
            int r1 = r7.i3
            r0 = 7
            if (r1 != r0) goto L3f
            r6 = 8
        L7:
            r0 = 1
        L8:
            java.lang.Object r4 = r7.l0
            com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel r4 = (com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel) r4
            if (r0 == 0) goto L3c
            java.lang.String r3 = "unarchive"
        L10:
            java.lang.Object r2 = r7.l1
            com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod r2 = (com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod) r2
            r1 = 0
            java.lang.String r0 = "click"
            r4.SQ2(r0, r3, r2, r1)
            X.0zc8 r5 = X.C1902740zc8.LIZ
            java.lang.Object r4 = r7.l1
            com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod r4 = (com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod) r4
            com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell r3 = r4.entranceCell
            kotlin.jvm.internal.AwS149S0201000_28 r2 = new kotlin.jvm.internal.AwS149S0201000_28
            java.lang.Object r1 = r7.l2
            X.0zcc r1 = (X.C1903040zcc) r1
            r0 = 15
            r2.<init>(r1, r6, r4, r0)
            r0 = 633(0x279, float:8.87E-43)
            kotlin.jvm.internal.AFwS217S0000000_28 r0 = kotlin.jvm.internal.AFwS217S0000000_28.get$arr$(r0)
            r5.getClass()
            X.C1902740zc8.LIZIZ(r3, r6, r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3c:
            java.lang.String r3 = "archive"
            goto L10
        L3f:
            r6 = 7
            if (r1 == r0) goto L7
            r0 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS80S0301000_28.invoke$1(kotlin.jvm.internal.AwS80S0301000_28):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S0301000_28(C1899570zX1 c1899570zX1, Context context, C1894690zP9 c1894690zP9, int i) {
        super(0);
        this.$t = i;
        this.i3 = 0;
        this.l0 = c1899570zX1;
        this.l1 = context;
        this.l2 = c1894690zP9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S0301000_28(int i, MultiViewModel multiViewModel, InboxEntrancePod inboxEntrancePod, C1903040zcc c1903040zcc, int i2) {
        super(0);
        this.$t = i2;
        this.i3 = i;
        this.l0 = multiViewModel;
        this.l1 = inboxEntrancePod;
        this.l2 = c1903040zcc;
    }
}
