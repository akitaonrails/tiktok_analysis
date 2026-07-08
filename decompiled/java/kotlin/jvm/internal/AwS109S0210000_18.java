package kotlin.jvm.internal;

import X.C09AY;
import X.C786410Ut5;
import X.InterfaceC1191710h7J;
import Y.ARunnableS19S0210000_18;
import android.view.View;
import com.ss.android.ugc.aweme.poi.map.assem.PoiStaticMapAssem;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.RefactorTTReviewCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public class AwS109S0210000_18 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS109S0210000_18 awS109S0210000_18, Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (num != null) {
            num.intValue();
            if (!Intrinsics.LJFF(num, ((PoiStaticMapAssem) awS109S0210000_18.l0).LLJILJIL)) {
                PoiStaticMapAssem poiStaticMapAssem = (PoiStaticMapAssem) awS109S0210000_18.l0;
                poiStaticMapAssem.LLJILJIL = num;
                poiStaticMapAssem.LLJILJILJ.removeCallbacksAndMessages(null);
                PoiStaticMapAssem poiStaticMapAssem2 = (PoiStaticMapAssem) awS109S0210000_18.l0;
                C786410Ut5.LJJZZIII(poiStaticMapAssem2.LLJILJILJ, new ARunnableS19S0210000_18((View) awS109S0210000_18.l1, poiStaticMapAssem2, awS109S0210000_18.z2, 1));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS109S0210000_18 awS109S0210000_18, Object obj, Object obj2) {
        RefactorTTReviewCell refactorTTReviewCell;
        InterfaceC1191710h7J interfaceC1191710h7J;
        String reviewId;
        ((RefactorTTReviewCell) awS109S0210000_18.l0).V5().LJIIJJI();
        if (awS109S0210000_18.z2 && (interfaceC1191710h7J = (refactorTTReviewCell = (RefactorTTReviewCell) awS109S0210000_18.l0).LLILZLL) != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = refactorTTReviewCell.LLJ;
            if (poiReviewModel != null) {
                reviewId = poiReviewModel.getReviewId();
            } else {
                reviewId = null;
            }
            interfaceC1191710h7J.JM0(reviewId);
        }
        ((Function0) awS109S0210000_18.l1).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0210000_18(View view, PoiStaticMapAssem poiStaticMapAssem, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiStaticMapAssem;
        this.l1 = view;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S0210000_18(RefactorTTReviewCell refactorTTReviewCell, RefactorTTReviewCell refactorTTReviewCell2, boolean z, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = refactorTTReviewCell;
        this.z2 = refactorTTReviewCell2;
        this.l1 = z;
    }
}
