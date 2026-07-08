package kotlin.jvm.internal;

import X.C09AY;
import X.C1308910kAL;
import X.C197039127h;
import X.C384050F3z;
import X.C786410Ut5;
import android.R;
import android.content.Context;
import com.ss.android.ugc.profile.business.ur.UserProfileUserCardVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS30S0102000_19 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS30S0102000_19 awS30S0102000_19, Object obj) {
        float fFloatValue;
        C197039127h c197039127h = (C197039127h) obj;
        int i = awS30S0102000_19.i2;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(i);
        c197039127h.setBackground(c384050F3z.LIZ((Context) awS30S0102000_19.l0));
        c197039127h.setTextColorRes(awS30S0102000_19.i1);
        if (c197039127h.isEnabled()) {
            fFloatValue = 1.0f;
        } else {
            Float fLJFF = C1308910kAL.LJFF(R.attr.disabledAlpha, (Context) awS30S0102000_19.l0);
            if (fLJFF != null) {
                fFloatValue = fLJFF.floatValue();
            } else {
                fFloatValue = 0.5f;
            }
        }
        C786410Ut5.w5(c197039127h, fFloatValue);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011 A[PHI: r4
      0x0011: PHI (r4v2 boolean) = (r4v0 boolean), (r4v4 boolean) binds: [B:5:0x000c, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS30S0102000_19 r13, java.lang.Object r14) {
        /*
            r3 = r14
            X.0ie8 r3 = (X.C1250500ie8) r3
            int r2 = r13.i1
            r4 = 0
            if (r2 <= 0) goto L2b
            int r1 = r13.i2
            r6 = 1
            r0 = 3
            if (r1 == r0) goto L11
            r4 = 1
            if (r1 != r0) goto L13
        L11:
            int r6 = r3.LLILLL
        L13:
            X.06Xi r8 = new X.06Xi
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r8.<init>(r0)
            int r5 = r13.i2
            r7 = 0
            r9 = 0
            r14 = 1000(0x3e8, float:1.401E-42)
            r10 = r9
            r11 = r9
            r12 = r7
            r13 = r7
            X.0ie8 r0 = X.C1250500ie8.LIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L2b:
            X.06Xi r8 = new X.06Xi
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r8.<init>(r0)
            java.lang.Object r1 = r13.l0
            com.ss.android.ugc.profile.business.ur.UserProfileUserCardVM r1 = (com.ss.android.ugc.profile.business.ur.UserProfileUserCardVM) r1
            int r0 = r13.i2
            r1.getClass()
            if (r0 != 0) goto L5b
            X.01Au r9 = new X.01Au
            r0 = 2131850547(0x7f117533, float:1.933466E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.<init>(r0)
        L4b:
            r4 = 0
            int r5 = r13.i2
            r10 = 0
            r14 = 968(0x3c8, float:1.356E-42)
            r6 = r4
            r7 = r4
            r11 = r10
            r12 = r4
            r13 = r4
            X.0ie8 r0 = X.C1250500ie8.LIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L5b:
            r9 = 0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS30S0102000_19.invoke$1(kotlin.jvm.internal.AwS30S0102000_19, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0102000_19(int i, int i2, Context context, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = context;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0102000_19(int i, int i2, UserProfileUserCardVM userProfileUserCardVM, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = userProfileUserCardVM;
    }
}
