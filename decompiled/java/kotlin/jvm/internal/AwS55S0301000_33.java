package kotlin.jvm.internal;

import X.AbstractC894380Z6u;
import X.C09AY;
import X.C0SZ4;
import X.C13IQ;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatDetailVerticalAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatDetailVerticalNewAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AwS55S0301000_33 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS55S0301000_33 awS55S0301000_33, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS55S0301000_33.l0;
        c0sz4.LLJI = new AwS568S0100000_24((ChatDetailVerticalAssem) awS55S0301000_33.l2, 1681);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vertical_action{action_type=");
        sbLIZ.append(((AbstractC894380Z6u) awS55S0301000_33.l1).LJ().getType());
        sbLIZ.append("}_");
        sbLIZ.append(awS55S0301000_33.i3);
        c0sz4.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
        c0sz4.LLILZ = C2097608Jq.LJIIJ(new Pair("detail_action", (AbstractC894380Z6u) awS55S0301000_33.l1), new Pair("enable_listener", ((ChatDetailVerticalAssem) awS55S0301000_33.l2).LLJJIJIIJIL));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS55S0301000_33 awS55S0301000_33, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS55S0301000_33.l0;
        c0sz4.LLJI = new AwS568S0100000_24((ChatDetailVerticalNewAssem) awS55S0301000_33.l2, 1682);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vertical_action{action_type=");
        sbLIZ.append(((AbstractC894380Z6u) awS55S0301000_33.l1).LJ().getType());
        sbLIZ.append("}_");
        sbLIZ.append(awS55S0301000_33.i3);
        c0sz4.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
        c0sz4.LLILZ = C2097608Jq.LJIIJ(new Pair("detail_action", (AbstractC894380Z6u) awS55S0301000_33.l1), new Pair("enable_listener", ((ChatDetailVerticalNewAssem) awS55S0301000_33.l2).LLJJIJIIJIL));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0301000_33(C19719912Dl c19719912Dl, AbstractC894380Z6u abstractC894380Z6u, int i, ChatDetailVerticalAssem chatDetailVerticalAssem, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c19719912Dl;
        this.l1 = abstractC894380Z6u;
        this.i3 = i;
        this.l2 = chatDetailVerticalAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0301000_33(C19719912Dl c19719912Dl, AbstractC894380Z6u abstractC894380Z6u, int i, ChatDetailVerticalNewAssem chatDetailVerticalNewAssem, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c19719912Dl;
        this.l1 = abstractC894380Z6u;
        this.i3 = i;
        this.l2 = chatDetailVerticalNewAssem;
    }
}
