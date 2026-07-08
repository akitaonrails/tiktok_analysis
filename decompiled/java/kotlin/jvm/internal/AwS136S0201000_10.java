package kotlin.jvm.internal;

import X.C09AY;
import X.C0QVQ;
import X.C128Y;
import X.C1537480q70;
import X.C1537720q7O;
import X.C2188811AlT;
import X.C645130PSd;
import X.C647500PaW;
import X.C647530PaZ;
import X.C671480QVm;
import X.EnumC674310Qcf;
import X.InterfaceC1858000yRy;
import X.InterfaceC671770QWp;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.arch.SearchBffItem;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AwS136S0201000_10 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS136S0201000_10 awS136S0201000_10) {
        C128Y c128yLLLILZLLLI;
        InterfaceC671770QWp interfaceC671770QWp;
        EcSearchFragment ecSearchFragment = (EcSearchFragment) awS136S0201000_10.l0;
        if (ecSearchFragment.LLJILJILJ != null && (c128yLLLILZLLLI = C671480QVm.LLLILZLLLI(C0QVQ.LIZ(ecSearchFragment), awS136S0201000_10.i2)) != null) {
            EnumC674310Qcf enumC674310Qcf = (EnumC674310Qcf) awS136S0201000_10.l1;
            if ((c128yLLLILZLLLI instanceof InterfaceC671770QWp) && (interfaceC671770QWp = (InterfaceC671770QWp) c128yLLLILZLLLI) != null) {
                interfaceC671770QWp.kP(enumC674310Qcf);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS136S0201000_10 awS136S0201000_10) {
        C128Y c128yLLLILZLLLI;
        InterfaceC671770QWp interfaceC671770QWp;
        EcSearchFragment ecSearchFragment = (EcSearchFragment) awS136S0201000_10.l0;
        if (ecSearchFragment.LLJILJILJ != null && (c128yLLLILZLLLI = C671480QVm.LLLILZLLLI(C0QVQ.LIZ(ecSearchFragment), awS136S0201000_10.i2)) != null) {
            EnumC674310Qcf enumC674310Qcf = (EnumC674310Qcf) awS136S0201000_10.l1;
            if ((c128yLLLILZLLLI instanceof InterfaceC671770QWp) && (interfaceC671770QWp = (InterfaceC671770QWp) c128yLLLILZLLLI) != null) {
                interfaceC671770QWp.Ec(enumC674310Qcf, false);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS136S0201000_10 awS136S0201000_10) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFloatingLayer: check floating child: index=");
        sbLIZ.append(awS136S0201000_10.i2);
        sbLIZ.append(", hash=");
        sbLIZ.append(((View) awS136S0201000_10.l0).hashCode());
        sbLIZ.append(", rect=");
        sbLIZ.append((Rect) awS136S0201000_10.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS136S0201000_10 awS136S0201000_10) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFloatingLayer: [WidgetsInfo] widgetsMap PUT (update): biz_type=");
        sbLIZ.append(awS136S0201000_10.i2);
        sbLIZ.append(", item_id=");
        sbLIZ.append(((SearchBffItem) awS136S0201000_10.l0).id);
        sbLIZ.append(", old_item_id=");
        sbLIZ.append(((SearchBffItem) ((Pair) awS136S0201000_10.l1).getSecond()).id);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS136S0201000_10 r2) {
        /*
            java.lang.Object r1 = r2.l0
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L21
            java.lang.Object r0 = r2.l1
            X.0yRy r0 = (X.InterfaceC1858000yRy) r0
            int r0 = r1.indexOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 < 0) goto L21
            int r0 = r1.intValue()
        L1c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L21:
            int r0 = r2.i2
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS136S0201000_10.invoke$4(kotlin.jvm.internal.AwS136S0201000_10):java.lang.Object");
    }

    public static final Object invoke$5(AwS136S0201000_10 awS136S0201000_10) {
        C1537480q70 hybridContext;
        C647500PaW c647500PaW = C647500PaW.LIZ;
        C1537720q7O c1537720q7O = ((C647530PaZ) awS136S0201000_10.l0).LIZIZ;
        if (c1537720q7O != null) {
            hybridContext = c1537720q7O.getHybridContext();
        } else {
            hybridContext = null;
        }
        SearchMixFeed searchMixFeed = (SearchMixFeed) awS136S0201000_10.l1;
        int i = awS136S0201000_10.i2;
        c647500PaW.getClass();
        return C647500PaW.LJIJJLI(hybridContext, searchMixFeed, i, null, null);
    }

    public static final Object invoke$6(AwS136S0201000_10 awS136S0201000_10) {
        return ((C645130PSd) awS136S0201000_10.l0).LLLLIL((RecyclerView.ViewHolder) awS136S0201000_10.l1, awS136S0201000_10.i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS136S0201000_10(int i, int i2, SearchBffItem searchBffItem, Pair<? extends View, SearchBffItem> pair) {
        super(0);
        this.$t = pair;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = searchBffItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0201000_10(C645130PSd c645130PSd, RecyclerView.ViewHolder viewHolder, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c645130PSd;
        this.l1 = viewHolder;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0201000_10(C647530PaZ c647530PaZ, SearchMixFeed searchMixFeed, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c647530PaZ;
        this.l1 = searchMixFeed;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0201000_10(View view, int i, Rect rect, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = view;
        this.l1 = rect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0201000_10(EcSearchFragment ecSearchFragment, int i, EnumC674310Qcf enumC674310Qcf, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = ecSearchFragment;
        this.i2 = i;
        this.l1 = enumC674310Qcf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS136S0201000_10(List list, List<? extends InterfaceC1858000yRy> list2, InterfaceC1858000yRy interfaceC1858000yRy, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.i2 = interfaceC1858000yRy;
    }
}
