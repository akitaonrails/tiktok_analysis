package kotlin.jvm.internal;

import X.C09AY;
import X.C0I0F;
import X.C0I0G;
import X.C0S1Y;
import X.C291001Au;
import X.C300660BqS;
import X.EnumC714720S1u;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssem;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes34.dex */
public class AwS130S1000000_33 extends C09AY implements Function2 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S1000000_33(String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS130S1000000_33 awS130S1000000_33, Object obj, Object obj2) {
        C0S1Y c0s1y;
        MUFQuickDMBoxAssem mUFQuickDMBoxAssem = (MUFQuickDMBoxAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c0s1y = (C0S1Y) c291001Au.LIZ()) != null) {
            String str = awS130S1000000_33.s0;
            int i = C0I0F.LIZ[c0s1y.LIZ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    mUFQuickDMBoxAssem.Gp().AQ2();
                    mUFQuickDMBoxAssem.Gp().CQ2(EnumC714720S1u.CLICK_INNER_EMOJI);
                    if (C300660BqS.LIZ()) {
                        new AwS612S0100000_33(mUFQuickDMBoxAssem, 213).invoke(c0s1y.LIZIZ);
                    }
                }
            } else {
                mUFQuickDMBoxAssem.Gp().AQ2();
                mUFQuickDMBoxAssem.Gp().CQ2(EnumC714720S1u.CLICK_SEND_BUTTON);
                if (C300660BqS.LIZ()) {
                    new AwS612S0100000_33(mUFQuickDMBoxAssem, 213).invoke(c0s1y.LIZIZ);
                }
            }
            if (c0s1y.LIZ.isEligibleForDraft()) {
                mUFQuickDMBoxAssem.getClass();
                if (C300660BqS.LIZ()) {
                    new AwS147S1100000_33(mUFQuickDMBoxAssem, str, 3).invoke(c0s1y.LIZIZ);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS130S1000000_33 awS130S1000000_33, Object obj, Object obj2) {
        C0S1Y c0s1y;
        MUFQuickDMBoxAssemV2 mUFQuickDMBoxAssemV2 = (MUFQuickDMBoxAssemV2) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c0s1y = (C0S1Y) c291001Au.LIZ()) != null) {
            String str = awS130S1000000_33.s0;
            int i = C0I0G.LIZ[c0s1y.LIZ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    mUFQuickDMBoxAssemV2.Gp().AQ2();
                    mUFQuickDMBoxAssemV2.Gp().CQ2(EnumC714720S1u.CLICK_INNER_EMOJI);
                    if (C300660BqS.LIZ()) {
                        new AwS612S0100000_33(mUFQuickDMBoxAssemV2, 212).invoke(c0s1y.LIZIZ);
                    }
                }
            } else {
                mUFQuickDMBoxAssemV2.Gp().AQ2();
                mUFQuickDMBoxAssemV2.Gp().CQ2(EnumC714720S1u.CLICK_SEND_BUTTON);
                if (C300660BqS.LIZ()) {
                    new AwS612S0100000_33(mUFQuickDMBoxAssemV2, 212).invoke(c0s1y.LIZIZ);
                }
            }
            if (c0s1y.LIZ.isEligibleForDraft()) {
                mUFQuickDMBoxAssemV2.getClass();
                if (C300660BqS.LIZ()) {
                    new AwS147S1100000_33(mUFQuickDMBoxAssemV2, str, 2).invoke(c0s1y.LIZIZ);
                }
            }
        }
        return Unit.LIZ;
    }
}
