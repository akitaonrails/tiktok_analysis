package kotlin.jvm.internal;

import X.AbstractC1370920lmM;
import X.C09AY;
import X.C1353500lKG;
import X.C1390360mHi;
import X.InterfaceC1370310llN;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS144S0201000_21 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS144S0201000_21 awS144S0201000_21) throws Throwable {
        ((PollCreateFragment) awS144S0201000_21.l0).aS(awS144S0201000_21.i2, (C1353500lKG) awS144S0201000_21.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS144S0201000_21 awS144S0201000_21) {
        ((AbstractC1370920lmM) awS144S0201000_21.l0).LIZ((InterfaceC1370310llN) awS144S0201000_21.l1, awS144S0201000_21.i2);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS144S0201000_21 r8) {
        /*
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r0 = (com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder) r0
            com.ss.android.ugc.aweme.services.uikit.CreativeToastConfig r0 = r0.getConfig()
            com.ss.android.ugc.aweme.services.uikit.CreativeToast$OnDismissListener r1 = r0.dismissListener
            if (r1 == 0) goto L13
            java.lang.Object r0 = r8.l1
            X.0mHi r0 = (X.C1390360mHi) r0
            r1.onDismiss(r0)
        L13:
            X.111z r7 = X.C194353111z.LIZ
            int r6 = r8.i2
            X.0MVY r5 = X.C0MVY.DISMISS
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r0 = (com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder) r0
            com.ss.android.ugc.aweme.services.uikit.CreativeToastConfig r0 = r0.getConfig()
            java.lang.Long r0 = r0.duration
            if (r0 == 0) goto L60
            long r3 = r0.longValue()
        L29:
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r0 = (com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder) r0
            com.ss.android.ugc.aweme.services.uikit.CreativeToastConfig r0 = r0.getConfig()
            java.lang.String r0 = r0.message
            if (r0 != 0) goto L55
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r0 = (com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder) r0
            com.ss.android.ugc.aweme.services.uikit.CreativeToastConfig r0 = r0.getConfig()
            java.lang.Integer r0 = r0.messageRes
            if (r0 == 0) goto L5e
            java.lang.Object r2 = r8.l1
            X.0mHi r2 = (X.C1390360mHi) r2
            int r1 = r0.intValue()
            android.content.Context r0 = r2.LJ
            if (r0 != 0) goto L51
            android.content.Context r0 = r2.LIZLLL
            if (r0 == 0) goto L5e
        L51:
            java.lang.String r0 = r0.getString(r1)
        L55:
            r7.getClass()
            X.C194353111z.LJFF(r6, r5, r3, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5e:
            r0 = 0
            goto L55
        L60:
            r3 = 3000(0xbb8, double:1.482E-320)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS144S0201000_21.invoke$2(kotlin.jvm.internal.AwS144S0201000_21):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0201000_21(int i, CreativeToastBuilder creativeToastBuilder, C1390360mHi c1390360mHi, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = creativeToastBuilder;
        this.l1 = c1390360mHi;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0201000_21(AbstractC1370920lmM abstractC1370920lmM, InterfaceC1370310llN interfaceC1370310llN, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = abstractC1370920lmM;
        this.l1 = interfaceC1370310llN;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0201000_21(PollCreateFragment pollCreateFragment, int i, C1353500lKG c1353500lKG, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = pollCreateFragment;
        this.i2 = i;
        this.l1 = c1353500lKG;
    }
}
