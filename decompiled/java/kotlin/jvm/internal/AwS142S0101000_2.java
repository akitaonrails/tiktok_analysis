package kotlin.jvm.internal;

import X.C06XG;
import X.C09AY;
import X.C1161100gJw;
import X.C1389890mGx;
import X.C1397705dX;
import X.C1690080u58;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.InterfaceC1564820qp6;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS142S0101000_2 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("maybeTriggerPreLoadMoreRetry skip expectedItemCount=");
        sbLIZ.append(awS142S0101000_2.i1);
        sbLIZ.append(" reason=supplementAwaitGate ");
        sbLIZ.append(((RavenFragment) awS142S0101000_2.l0).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRavenResponseUpdate first-screen ready with supplement pending, release loading now bodySize=");
        sbLIZ.append(awS142S0101000_2.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS142S0101000_2.l0).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartTypeByOrder: keep configured section type=");
        sbLIZ.append(((C1397705dX) awS142S0101000_2.l0).LIZIZ);
        sbLIZ.append(", order=");
        sbLIZ.append(((C1397705dX) awS142S0101000_2.l0).LIZJ);
        sbLIZ.append(", items.size=");
        sbLIZ.append(((C1397705dX) awS142S0101000_2.l0).LIZLLL.size());
        sbLIZ.append(" (not in new data, keep from old data, even order=");
        sbLIZ.append(((C1397705dX) awS142S0101000_2.l0).LIZJ);
        sbLIZ.append(" > target order=");
        sbLIZ.append(awS142S0101000_2.i1);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$11(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleBodyResponseUpdate first-screen body ready with supplement pending, keep body restore path bodySize=");
        sbLIZ.append(awS142S0101000_2.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS142S0101000_2.l0).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$12(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldRecreateBodyListForSupplementInsert: handler count changing from ");
        sbLIZ.append(awS142S0101000_2.i1);
        sbLIZ.append(" to ");
        sbLIZ.append(((List) awS142S0101000_2.l0).size());
        sbLIZ.append(" at top, recreate");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$13(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performComplete resumed continuation with PageValue.complete cursor=");
        sbLIZ.append(awS142S0101000_2.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS142S0101000_2.l0).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$14(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performDelete body empty after delete responseSessionId=");
        sbLIZ.append(awS142S0101000_2.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS142S0101000_2.l0).fT(Integer.valueOf(awS142S0101000_2.i1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$15(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performLoadMore enqueue raw response responseSessionId=");
        sbLIZ.append(awS142S0101000_2.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS142S0101000_2.l0).fT(Integer.valueOf(awS142S0101000_2.i1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$16(AwS142S0101000_2 awS142S0101000_2) {
        ((Function1) awS142S0101000_2.l0).invoke(Integer.valueOf(awS142S0101000_2.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS142S0101000_2 awS142S0101000_2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII((Map) awS142S0101000_2.l0);
        c2344009Gk.LIZJ(awS142S0101000_2.i1, "source_num");
        C20684815ws.LJIILLIIL("search_ai_source_panel_show", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$18(kotlin.jvm.internal.AwS142S0101000_2 r6) {
        /*
            java.lang.Object r0 = r6.l0
            X.0u58 r0 = (X.C1690080u58) r0
            X.0qp6 r0 = r0.LJIIIZ()
            java.util.List r0 = r0.LJII()
            java.lang.Object r5 = X.C13LP.LJJJLL(r0)
            X.06XG r5 = (X.C06XG) r5
            r3 = 0
            if (r5 != 0) goto L1a
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            return r0
        L1a:
            int r0 = r5.getIndex()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L56
            int r4 = r5.getSize()
            int r0 = r6.i1
            int r4 = r4 - r0
            r0 = 1
            if (r4 >= r0) goto L2d
            r4 = 1
        L2d:
            int r1 = r5.getOffset()
            int r0 = r6.i1
            int r0 = -r0
            if (r1 >= r0) goto L51
            int r1 = r5.getOffset()
            int r0 = r5.getSize()
            int r0 = -r0
            if (r1 <= r0) goto L56
            int r0 = r5.getOffset()
            int r1 = -r0
            int r0 = r6.i1
            int r1 = r1 - r0
            float r1 = (float) r1
            float r1 = r1 * r2
            float r0 = (float) r4
            float r1 = r1 / r0
            float r3 = X.C13LZ.LIZLLL(r1, r3, r2)
        L51:
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            return r0
        L56:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS142S0101000_2.invoke$18(kotlin.jvm.internal.AwS142S0101000_2):java.lang.Object");
    }

    public static final Object invoke$2(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performInsert complete responseSessionId=");
        sbLIZ.append(awS142S0101000_2.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS142S0101000_2.l0).fT(Integer.valueOf(awS142S0101000_2.i1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performInsert ignore empty components responseSessionId=");
        sbLIZ.append(awS142S0101000_2.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS142S0101000_2.l0).fT(Integer.valueOf(awS142S0101000_2.i1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performInsert recreateBodyList fallback responseSessionId=");
        sbLIZ.append(awS142S0101000_2.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS142S0101000_2.l0).fT(Integer.valueOf(awS142S0101000_2.i1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load more timeout 60s, cancel loading ");
        sbLIZ.append(((RavenFragment) awS142S0101000_2.l0).fT(Integer.valueOf(awS142S0101000_2.i1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS142S0101000_2 awS142S0101000_2) {
        boolean z;
        C06XG next;
        InterfaceC1564820qp6 interfaceC1564820qp6LJIIIZ = ((C1690080u58) awS142S0101000_2.l0).LJIIIZ();
        int iLIZLLL = interfaceC1564820qp6LJIIIZ.LIZLLL();
        int iLIZIZ = interfaceC1564820qp6LJIIIZ.LIZIZ();
        List<C06XG> listLJII = interfaceC1564820qp6LJIIIZ.LJII();
        int i = awS142S0101000_2.i1;
        Iterator<C06XG> it2 = listLJII.iterator();
        while (true) {
            z = false;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getIndex() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C06XG c06xg = next;
        if (c06xg == null) {
            return Boolean.TRUE;
        }
        int offset = c06xg.getOffset();
        int offset2 = c06xg.getOffset() + c06xg.getSize();
        if (offset >= iLIZLLL && offset2 <= iLIZIZ) {
            z = true;
        }
        return Boolean.valueOf(!z);
    }

    public static final Object invoke$7(AwS142S0101000_2 awS142S0101000_2) {
        C1389890mGx c1389890mGx = new C1389890mGx((View) awS142S0101000_2.l0);
        c1389890mGx.LJIIIZ(awS142S0101000_2.i1);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartTypeByOrder: discard old section type=");
        sbLIZ.append(((C1397705dX) awS142S0101000_2.l0).LIZIZ);
        sbLIZ.append(", order=");
        sbLIZ.append(((C1397705dX) awS142S0101000_2.l0).LIZJ);
        sbLIZ.append(", items.size=");
        sbLIZ.append(((C1397705dX) awS142S0101000_2.l0).LIZLLL.size());
        sbLIZ.append(" (order > target order=");
        sbLIZ.append(awS142S0101000_2.i1);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS142S0101000_2 awS142S0101000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartTypeByOrder: skip new section type=");
        sbLIZ.append(((C1397705dX) awS142S0101000_2.l0).LIZIZ);
        sbLIZ.append(", order=");
        sbLIZ.append(((C1397705dX) awS142S0101000_2.l0).LIZJ);
        sbLIZ.append(", items.size=");
        sbLIZ.append(((C1397705dX) awS142S0101000_2.l0).LIZLLL.size());
        sbLIZ.append(" (order < target order=");
        sbLIZ.append(awS142S0101000_2.i1);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS142S0101000_2(int r3, int r4, com.bytedance.hybrid.spark.raven.page.RavenFragment<CONTEXT> r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 0: goto Lf;
                case 1: goto Lf;
                case 2: goto Lf;
                case 3: goto Lf;
                case 4: goto Lf;
                case 5: goto L5;
                case 6: goto L5;
                case 7: goto L5;
                case 8: goto L5;
                case 9: goto L5;
                case 10: goto L5;
                case 11: goto Lf;
                case 12: goto L5;
                case 13: goto Lf;
                case 14: goto Lf;
                case 15: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS142S0101000_2.<init>(int, com.bytedance.hybrid.spark.raven.page.RavenFragment, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0101000_2(int i, View view, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = view;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS142S0101000_2(int i, int i2, List<C1161100gJw> list) {
        super(0);
        this.$t = list;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0101000_2(int i, Map map, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = map;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0101000_2(int i, Function1 function1, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = function1;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0101000_2(C1397705dX c1397705dX, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1397705dX;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0101000_2(C1690080u58 c1690080u58, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1690080u58;
        this.i1 = i;
    }
}
