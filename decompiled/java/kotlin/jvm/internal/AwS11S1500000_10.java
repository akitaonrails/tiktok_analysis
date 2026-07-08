package kotlin.jvm.internal;

import X.AbstractC19875512pd;
import X.C09AY;
import X.C0PDT;
import X.C678910Qk5;
import X.C678990QkD;
import X.InterfaceC594520NTm;
import X.InterfaceC657510Pqf;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.Position;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryDesc;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AwS11S1500000_10 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
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

    public static final Object invoke$0(AwS11S1500000_10 awS11S1500000_10) {
        C678990QkD.LIZ((TuxTextView) awS11S1500000_10.l1, C678990QkD.LIZLLL((TuxTextView) awS11S1500000_10.l1), ((QueryDesc) awS11S1500000_10.l2).text, AbstractC19875512pd.copyOf((Collection) awS11S1500000_10.l3), awS11S1500000_10.s0, ((QueryDesc) awS11S1500000_10.l2).clickable, !((List) awS11S1500000_10.l3).isEmpty(), 43, new AwS95S1200000_10((C678910Qk5) awS11S1500000_10.l4, (QueryCorrectComponentInfo) awS11S1500000_10.l5, awS11S1500000_10.s0, 4));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x029e A[EDGE_INSN: B:105:0x029e->B:103:0x029e BREAK  A[LOOP:0: B:66:0x01c6->B:102:0x029b]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS11S1500000_10 r17) {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS11S1500000_10.invoke$1(kotlin.jvm.internal.AwS11S1500000_10):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS11S1500000_10(TuxTextView tuxTextView, TuxTextView tuxTextView2, QueryDesc queryDesc, List<Position> list, String str, C678910Qk5 c678910Qk5, QueryCorrectComponentInfo queryCorrectComponentInfo) {
        super(0);
        this.$t = queryCorrectComponentInfo;
        this.l1 = tuxTextView;
        this.l2 = tuxTextView2;
        this.l3 = queryDesc;
        this.s0 = list;
        this.l4 = str;
        this.l5 = c678910Qk5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS11S1500000_10(Aweme aweme, Aweme aweme2, C0PDT c0pdt, String str, ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocol, SearchMixFeed searchMixFeed, InterfaceC657510Pqf interfaceC657510Pqf) {
        super(0);
        this.$t = interfaceC657510Pqf;
        this.l1 = aweme;
        this.l2 = aweme2;
        this.s0 = c0pdt;
        this.l3 = str;
        this.l4 = iSearchCardProtocol;
        this.l5 = searchMixFeed;
    }
}
