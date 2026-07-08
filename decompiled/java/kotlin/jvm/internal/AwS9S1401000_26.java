package kotlin.jvm.internal;

import X.C09AY;
import X.C1732010vAl;
import X.C1732020vAm;
import X.C1732390vBN;
import X.C1732480vBW;
import X.C23250099c;
import X.InterfaceC1731950vAf;
import X.InterfaceC1732650vBn;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS9S1401000_26 extends C09AY implements Function0 {
    public final int $t;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    public static final Object invoke$0(AwS9S1401000_26 awS9S1401000_26) {
        if (Intrinsics.LJFF(((SeaLiveEffectRootData) awS9S1401000_26.l1).source, "old_msg")) {
            C1732390vBN c1732390vBN = C1732390vBN.LIZ;
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) awS9S1401000_26.l2;
            String str = ((SeaLiveEffectRootData) awS9S1401000_26.l3).authorId;
            int i = awS9S1401000_26.i5;
            List listSingletonList = Collections.singletonList(awS9S1401000_26.s0);
            c1732390vBN.getClass();
            C1732390vBN.LJIILL(interfaceC497601wk, str, i, listSingletonList, true);
        } else {
            C1732390vBN c1732390vBN2 = C1732390vBN.LIZ;
            String str2 = ((SeaLiveEffectRootData) awS9S1401000_26.l1).authorId;
            String str3 = awS9S1401000_26.s0;
            c1732390vBN2.getClass();
            InterfaceC497601wk interfaceC497601wkLJIIIZ = C1732390vBN.LJIIIZ();
            if (interfaceC497601wkLJIIIZ != null) {
                C23250099c.LIZLLL(interfaceC497601wkLJIIIZ, null, null, new C1732480vBW(str2, str3, null), 3);
            }
        }
        ((InterfaceC1732650vBn) awS9S1401000_26.l4).onSuccess();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S1401000_26 awS9S1401000_26) {
        if (Intrinsics.LJFF(((EffectRootData) awS9S1401000_26.l1).source, "old_msg")) {
            C1732020vAm c1732020vAm = C1732020vAm.LIZ;
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) awS9S1401000_26.l2;
            String str = ((EffectRootData) awS9S1401000_26.l3).authorId;
            int i = awS9S1401000_26.i5;
            List listSingletonList = Collections.singletonList(awS9S1401000_26.s0);
            c1732020vAm.getClass();
            C1732020vAm.LJIILLIIL(interfaceC497601wk, str, i, listSingletonList, true);
        } else {
            C1732020vAm c1732020vAm2 = C1732020vAm.LIZ;
            String str2 = ((EffectRootData) awS9S1401000_26.l1).authorId;
            String str3 = awS9S1401000_26.s0;
            c1732020vAm2.getClass();
            InterfaceC497601wk interfaceC497601wkLJIIJ = C1732020vAm.LJIIJ();
            if (interfaceC497601wkLJIIJ != null) {
                C23250099c.LIZLLL(interfaceC497601wkLJIIJ, null, null, new C1732010vAl(str2, str3, null), 3);
            }
        }
        ((InterfaceC1731950vAf) awS9S1401000_26.l4).onSuccess();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S1401000_26(SeaLiveEffectRootData seaLiveEffectRootData, InterfaceC497601wk interfaceC497601wk, SeaLiveEffectRootData seaLiveEffectRootData2, int i, String str, InterfaceC1732650vBn interfaceC1732650vBn, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = seaLiveEffectRootData;
        this.l2 = interfaceC497601wk;
        this.l3 = seaLiveEffectRootData2;
        this.i5 = i;
        this.s0 = str;
        this.l4 = interfaceC1732650vBn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S1401000_26(EffectRootData effectRootData, InterfaceC497601wk interfaceC497601wk, EffectRootData effectRootData2, int i, String str, InterfaceC1731950vAf interfaceC1731950vAf, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = effectRootData;
        this.l2 = interfaceC497601wk;
        this.l3 = effectRootData2;
        this.i5 = i;
        this.s0 = str;
        this.l4 = interfaceC1731950vAf;
    }
}
