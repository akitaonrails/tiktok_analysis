package kotlin.jvm.internal;

import X.AbstractC894380Z6u;
import X.C09AY;
import X.C0SZ4;
import X.C13LE;
import X.C2097608Jq;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatCircularIconAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatDetailHorizontalAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatDetailHorizontalNewAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatIconAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AwS114S0201000_33 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS114S0201000_33 awS114S0201000_33, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = C13LE.LIZ(ChatIconAssem.class);
        c0sz4.LLJI = new AwS568S0100000_24((ChatDetailHorizontalAssem) awS114S0201000_33.l1, 1679);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("horizontal_action{action_type=");
        sbLIZ.append(((AbstractC894380Z6u) awS114S0201000_33.l0).LJ().getType());
        sbLIZ.append("}_");
        sbLIZ.append(awS114S0201000_33.i2);
        c0sz4.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
        c0sz4.LLILZ = C2097608Jq.LJIIJ(new Pair("detail_action", (AbstractC894380Z6u) awS114S0201000_33.l0), new Pair("enable_listener", ((ChatDetailHorizontalAssem) awS114S0201000_33.l1).LLJJIJIIJIL));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS114S0201000_33 awS114S0201000_33, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = C13LE.LIZ(ChatCircularIconAssem.class);
        c0sz4.LLJI = new AwS568S0100000_24((ChatDetailHorizontalNewAssem) awS114S0201000_33.l1, 1680);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("horizontal_action{action_type=");
        sbLIZ.append(((AbstractC894380Z6u) awS114S0201000_33.l0).LJ().getType());
        sbLIZ.append("}_");
        sbLIZ.append(awS114S0201000_33.i2);
        c0sz4.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
        c0sz4.LLILZ = C2097608Jq.LJIIJ(new Pair("detail_action", (AbstractC894380Z6u) awS114S0201000_33.l0), new Pair("enable_listener", ((ChatDetailHorizontalNewAssem) awS114S0201000_33.l1).LLJJIJIIJIL));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS114S0201000_33(AbstractC894380Z6u abstractC894380Z6u, AbstractC894380Z6u<?> abstractC894380Z6u2, int i, ChatDetailHorizontalAssem chatDetailHorizontalAssem) {
        super(1);
        this.$t = chatDetailHorizontalAssem;
        this.l0 = abstractC894380Z6u;
        this.i2 = abstractC894380Z6u2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS114S0201000_33(AbstractC894380Z6u abstractC894380Z6u, AbstractC894380Z6u<?> abstractC894380Z6u2, int i, ChatDetailHorizontalNewAssem chatDetailHorizontalNewAssem) {
        super(1);
        this.$t = chatDetailHorizontalNewAssem;
        this.l0 = abstractC894380Z6u;
        this.i2 = abstractC894380Z6u2;
        this.l1 = i;
    }
}
