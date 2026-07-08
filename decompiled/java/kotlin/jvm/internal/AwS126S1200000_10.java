package kotlin.jvm.internal;

import X.C09AY;
import X.C118300cf;
import X.C1537720q7O;
import X.C2188811AlT;
import X.C647500PaW;
import X.C647530PaZ;
import X.RunnableC647510PaX;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AwS126S1200000_10 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS126S1200000_10 awS126S1200000_10) {
        C647500PaW c647500PaW = C647500PaW.LIZ;
        Fragment fragment = (Fragment) awS126S1200000_10.l1;
        C647530PaZ c647530PaZ = (C647530PaZ) awS126S1200000_10.l2;
        String str = awS126S1200000_10.s0;
        c647500PaW.getClass();
        C647500PaW.LJIILIIL(fragment, c647530PaZ, str, "load failed");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS126S1200000_10 awS126S1200000_10) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseMixRefreshRepo: MixPerfMonitor setupFirstScreenItemIds chunkName:");
        sbLIZ.append(awS126S1200000_10.s0);
        sbLIZ.append(", chunkIndex:");
        sbLIZ.append(((C118300cf) awS126S1200000_10.l1).element);
        sbLIZ.append(" recordList length:");
        sbLIZ.append(((List) awS126S1200000_10.l2).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS126S1200000_10 r5) {
        /*
            java.lang.Object r0 = r5.l1
            X.0q7O r0 = (X.C1537720q7O) r0
            java.lang.String r3 = "isPreLayout"
            X.C649470Pdh.LIZIZ(r0, r3)
            java.lang.Object r0 = r5.l2
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            java.lang.String r4 = r5.s0
            r1 = 0
            if (r4 == 0) goto L3c
            boolean r0 = kotlin.text.a0.LJJJIL(r4)
            if (r0 != 0) goto L3c
            X.0Pdh r0 = X.C649470Pdh.LIZ
            r0.getClass()
            java.lang.String r0 = "fe_tiktok_lynx_search_transfer"
            boolean r0 = kotlin.text.a0.LJJIIZI(r4, r0, r1)
            if (r0 == 0) goto L3f
            X.0Pd9 r0 = X.C649130Pd9.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.search.lynx.core.config.SparkLiteLynxThreadConfig r0 = X.C649130Pd9.LIZ()
            boolean r0 = r0.enableTransferSwitchToEngineAfterRender
            if (r0 == 0) goto L3c
        L35:
            java.lang.Object r0 = r5.l1
            X.0q7O r0 = (X.C1537720q7O) r0
            X.C649470Pdh.LIZJ(r0, r3)
        L3c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3f:
            X.0Pd9 r0 = X.C649130Pd9.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.search.lynx.core.config.SparkLiteLynxThreadConfig r0 = X.C649130Pd9.LIZ()
            java.util.List<java.lang.String> r1 = r0.switchToEngineAfterRenderBlackList
            java.lang.String r2 = "ALL_GENERAL_SEARCH_CARDS"
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L3c
            java.lang.String r0 = X.C649470Pdh.LJ(r4)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3c
            com.ss.android.ugc.aweme.search.lynx.core.config.SparkLiteLynxThreadConfig r0 = X.C649130Pd9.LIZ()
            java.util.List<java.lang.String> r1 = r0.switchToEngineAfterRenderWhiteList
            com.ss.android.ugc.aweme.search.lynx.core.config.SparkLiteLynxThreadConfig r0 = X.C649130Pd9.LIZ()
            java.util.List<java.lang.String> r0 = r0.doubleSwitchRenderList
            java.util.List r0 = X.C13LP.LJLIL(r0, r1)
            java.util.List r1 = X.C13LP.LJJJJI(r0)
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L35
            java.lang.String r0 = X.C649470Pdh.LJ(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L3c
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS126S1200000_10.invoke$2(kotlin.jvm.internal.AwS126S1200000_10):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1200000_10(C1537720q7O c1537720q7O, RunnableC647510PaX runnableC647510PaX, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1537720q7O;
        this.l2 = runnableC647510PaX;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1200000_10(Fragment fragment, C647530PaZ c647530PaZ, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragment;
        this.l2 = c647530PaZ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1200000_10(String str, List list, C118300cf c118300cf, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c118300cf;
        this.l2 = list;
    }
}
