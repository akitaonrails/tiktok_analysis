package kotlin.jvm.internal;

import X.C09AY;
import X.C1860140yVQ;
import X.C259800zU;
import com.ss.android.ugc.aweme.search.common.communicate.SearchMarkdownService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AwS1S0403000_10 extends C09AY implements Function0 {
    public final int $t;
    public int i4;
    public int i5;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS1S0403000_10 awS1S0403000_10) {
        SearchMarkdownService searchMarkdownService = (SearchMarkdownService) awS1S0403000_10.l0;
        int i = awS1S0403000_10.i4;
        C1860140yVQ c1860140yVQ = (C1860140yVQ) awS1S0403000_10.l1;
        List list = (List) ((C259800zU) awS1S0403000_10.l2).element;
        int i2 = awS1S0403000_10.i5;
        int i3 = awS1S0403000_10.i6;
        StringBuilder sb = (StringBuilder) awS1S0403000_10.l3;
        searchMarkdownService.getClass();
        SearchMarkdownService.LJIIIZ(i, c1860140yVQ, list, i2, i3, sb);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0403000_10 awS1S0403000_10) {
        SearchMarkdownService searchMarkdownService = (SearchMarkdownService) awS1S0403000_10.l0;
        int i = awS1S0403000_10.i4;
        C1860140yVQ c1860140yVQ = (C1860140yVQ) awS1S0403000_10.l1;
        List list = (List) ((C259800zU) awS1S0403000_10.l2).element;
        int i2 = awS1S0403000_10.i5;
        int i3 = awS1S0403000_10.i6;
        StringBuilder sb = (StringBuilder) awS1S0403000_10.l3;
        searchMarkdownService.getClass();
        SearchMarkdownService.LJIIIZ(i, c1860140yVQ, list, i2, i3, sb);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S0403000_10(SearchMarkdownService searchMarkdownService, SearchMarkdownService searchMarkdownService2, int i, C1860140yVQ c1860140yVQ, C259800zU<List<Object>> c259800zU, int i2, int i3, StringBuilder sb) {
        super(0);
        this.$t = sb;
        this.l0 = searchMarkdownService;
        this.i4 = searchMarkdownService2;
        this.l1 = i;
        this.l2 = c1860140yVQ;
        this.i5 = c259800zU;
        this.i6 = i2;
        this.l3 = i3;
    }
}
