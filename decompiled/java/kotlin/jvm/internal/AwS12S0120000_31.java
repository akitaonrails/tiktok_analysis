package kotlin.jvm.internal;

import X.C09AY;
import X.C19319810iC;
import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS12S0120000_31 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS12S0120000_31 awS12S0120000_31, Object obj) {
        return C19319810iC.LJJIJL((C19319810iC) obj, awS12S0120000_31.z1, ((CaptionsPanelFragment) awS12S0120000_31.l0).cS(awS12S0120000_31.z2), null, false, ((CaptionsPanelFragment) awS12S0120000_31.l0).bS(awS12S0120000_31.z2, awS12S0120000_31.z1), false, false, false, false, null, false, 130044);
    }

    public static final Object invoke$1(AwS12S0120000_31 awS12S0120000_31, Object obj) {
        boolean z = awS12S0120000_31.z1;
        return C19319810iC.LJJIJL((C19319810iC) obj, z, null, null, false, ((CaptionsPanelFragment) awS12S0120000_31.l0).bS(awS12S0120000_31.z2, z), false, false, false, false, null, false, 130046);
    }

    public static final Object invoke$2(AwS12S0120000_31 awS12S0120000_31, Object obj) {
        return C19319810iC.LJJIJL((C19319810iC) obj, false, null, null, false, ((CaptionsPanelFragment) awS12S0120000_31.l0).bS(awS12S0120000_31.z1, awS12S0120000_31.z2), false, false, false, false, null, false, 130047);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS12S0120000_31(com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment r3, boolean r4, boolean r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 0: goto L11;
                case 1: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.z1 = r4
            r1.z2 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.z1 = r4
            r1.l0 = r3
            r1.z2 = r5
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS12S0120000_31.<init>(com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment, boolean, boolean, int):void");
    }
}
