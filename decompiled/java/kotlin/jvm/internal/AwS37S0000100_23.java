package kotlin.jvm.internal;

import X.AbstractC1541140qCu;
import X.C09AY;
import X.C1550720qSM;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AwS37S0000100_23 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0000100_23(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:32:0x00ab
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS37S0000100_23 r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS37S0000100_23.invoke$0(kotlin.jvm.internal.AwS37S0000100_23, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS37S0000100_23 awS37S0000100_23, Object obj) {
        return Integer.valueOf(((AbstractC1541140qCu) ((Pair) obj).getSecond()).LIZLLL(awS37S0000100_23.j0));
    }

    public static final Object invoke$2(AwS37S0000100_23 awS37S0000100_23, Object obj) {
        ((C1550720qSM) obj).LIZ = awS37S0000100_23.j0;
        return Unit.LIZ;
    }
}
