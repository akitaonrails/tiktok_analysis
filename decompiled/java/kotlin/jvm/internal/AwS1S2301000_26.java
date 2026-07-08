package kotlin.jvm.internal;

import X.C09AY;
import X.C1731990vAj;
import X.C1732020vAm;
import X.C1732390vBN;
import X.C1732450vBT;
import X.C23250099c;
import X.InterfaceC1731950vAf;
import X.InterfaceC1732650vBn;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS1S2301000_26 extends C09AY implements Function0 {
    public final int $t;
    public int i5;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS1S2301000_26 awS1S2301000_26) {
        if (Intrinsics.LJFF(((SeaLiveEffectRootData) awS1S2301000_26.l2).source, "old_msg")) {
            C1732390vBN c1732390vBN = C1732390vBN.LIZ;
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) awS1S2301000_26.l3;
            String str = awS1S2301000_26.s0;
            int i = awS1S2301000_26.i5;
            c1732390vBN.getClass();
            C1732390vBN.LJIILL(interfaceC497601wk, str, i, null, true);
        } else {
            C1732390vBN c1732390vBN2 = C1732390vBN.LIZ;
            String str2 = awS1S2301000_26.s0;
            String str3 = awS1S2301000_26.s1;
            c1732390vBN2.getClass();
            InterfaceC497601wk interfaceC497601wkLJIIIZ = C1732390vBN.LJIIIZ();
            if (interfaceC497601wkLJIIIZ != null) {
                C23250099c.LIZLLL(interfaceC497601wkLJIIIZ, null, null, new C1732450vBT(str2, str3, null), 3);
            }
        }
        ((InterfaceC1732650vBn) awS1S2301000_26.l4).onSuccess();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S2301000_26 awS1S2301000_26) {
        if (Intrinsics.LJFF(((EffectRootData) awS1S2301000_26.l2).source, "old_msg")) {
            C1732020vAm c1732020vAm = C1732020vAm.LIZ;
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) awS1S2301000_26.l3;
            String str = awS1S2301000_26.s0;
            int i = awS1S2301000_26.i5;
            c1732020vAm.getClass();
            C1732020vAm.LJIILLIIL(interfaceC497601wk, str, i, null, true);
        } else {
            C1732020vAm c1732020vAm2 = C1732020vAm.LIZ;
            String str2 = awS1S2301000_26.s0;
            String str3 = awS1S2301000_26.s1;
            c1732020vAm2.getClass();
            InterfaceC497601wk interfaceC497601wkLJIIJ = C1732020vAm.LJIIJ();
            if (interfaceC497601wkLJIIJ != null) {
                C23250099c.LIZLLL(interfaceC497601wkLJIIJ, null, null, new C1731990vAj(str2, str3, null), 3);
            }
        }
        ((InterfaceC1731950vAf) awS1S2301000_26.l4).onSuccess();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2301000_26(SeaLiveEffectRootData seaLiveEffectRootData, InterfaceC497601wk interfaceC497601wk, String str, int i, String str2, InterfaceC1732650vBn interfaceC1732650vBn, int i2) {
        super(0);
        this.$t = i2;
        this.l2 = seaLiveEffectRootData;
        this.l3 = interfaceC497601wk;
        this.s0 = str;
        this.i5 = i;
        this.s1 = str2;
        this.l4 = interfaceC1732650vBn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2301000_26(EffectRootData effectRootData, InterfaceC497601wk interfaceC497601wk, String str, int i, String str2, InterfaceC1731950vAf interfaceC1731950vAf, int i2) {
        super(0);
        this.$t = i2;
        this.l2 = effectRootData;
        this.l3 = interfaceC497601wk;
        this.s0 = str;
        this.i5 = i;
        this.s1 = str2;
        this.l4 = interfaceC1731950vAf;
    }
}
