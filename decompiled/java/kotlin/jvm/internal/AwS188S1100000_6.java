package kotlin.jvm.internal;

import X.C08YF;
import X.C09AY;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS188S1100000_6 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
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
    public AwS188S1100000_6(SearchVideoHolder searchVideoHolder, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = searchVideoHolder;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS188S1100000_6 awS188S1100000_6, Object obj, Object obj2) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video partial callback fired, aid=");
        Aweme aweme = ((SearchVideoHolder) awS188S1100000_6.l1).LL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        SearchVideoHolder searchVideoHolder = (SearchVideoHolder) awS188S1100000_6.l1;
        searchVideoHolder.LLZZLLIL = false;
        String str = awS188S1100000_6.s0;
        if (str == null) {
            str = searchVideoHolder.l3().LJIIIIZZ;
        }
        if (Intrinsics.LJFF(str, "visual_search")) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C08YF(searchVideoHolder, str, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS188S1100000_6 awS188S1100000_6, Object obj, Object obj2) {
        SearchVideoHolder searchVideoHolder = (SearchVideoHolder) awS188S1100000_6.l1;
        searchVideoHolder.LLZZJLIL = false;
        searchVideoHolder.z7(awS188S1100000_6.s0);
        return Unit.LIZ;
    }
}
