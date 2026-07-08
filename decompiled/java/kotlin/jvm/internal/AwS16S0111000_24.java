package kotlin.jvm.internal;

import X.C09AY;
import X.C1846010y8d;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.repostfeed.feed.RepostFeedProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS16S0111000_24 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AwS16S0111000_24 awS16S0111000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageScrolled ----> setScrollPosition --->position ");
        sbLIZ.append(awS16S0111000_24.i2);
        sbLIZ.append(", updateIndicator ");
        sbLIZ.append(awS16S0111000_24.z1);
        sbLIZ.append(", selectedTabPosition -- > ");
        sbLIZ.append(((C1846010y8d) awS16S0111000_24.l0).getSelectedTabPosition());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS16S0111000_24 r7) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS16S0111000_24.invoke$1(kotlin.jvm.internal.AwS16S0111000_24):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0111000_24(int i, RepostFeedProtocol repostFeedProtocol, boolean z, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = repostFeedProtocol;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0111000_24(int i, boolean z, C1846010y8d c1846010y8d, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.z1 = z;
        this.l0 = c1846010y8d;
    }
}
