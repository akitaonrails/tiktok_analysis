package kotlin.jvm.internal;

import X.C09AY;
import X.C118300cf;
import X.C1863380yae;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import defpackage.u2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS88S0210000_4 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AwS88S0210000_4 awS88S0210000_4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recoverMiddlePageSug attempt=");
        sbLIZ.append(((C118300cf) awS88S0210000_4.l0).element);
        sbLIZ.append('/');
        sbLIZ.append(((MessageViewModel) awS88S0210000_4.l1).LLJJIJIL);
        sbLIZ.append(": initialized=");
        sbLIZ.append(awS88S0210000_4.z2);
        sbLIZ.append(", sugNeeded=");
        sbLIZ.append(((MessageViewModel) awS88S0210000_4.l1).LLJJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS88S0210000_4 awS88S0210000_4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadTakoConversation: tryInitTako done, subConversationId=");
        sbLIZ.append(((C1863380yae) awS88S0210000_4.l0).LJIILIIL);
        sbLIZ.append(", takoInitialized=");
        sbLIZ.append(((u2) awS88S0210000_4.l1).LIZ);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(((u2) awS88S0210000_4.l1).LIZIZ);
        sbLIZ.append(", withLoadHistory=");
        sbLIZ.append(awS88S0210000_4.z2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0210000_4(C118300cf c118300cf, MessageViewModel messageViewModel, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = messageViewModel;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S0210000_4(C1863380yae c1863380yae, u2 u2Var, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1863380yae;
        this.l1 = u2Var;
        this.z2 = z;
    }
}
