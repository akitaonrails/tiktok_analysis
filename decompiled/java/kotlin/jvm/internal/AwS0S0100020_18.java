package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C1178610gmB;
import X.C1199800hKM;
import X.C23250099c;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionViewModel;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS0S0100020_18 extends C09AY implements Function1 {
    public final int $t;
    public double d1;
    public double d2;
    public Object l0;

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

    public static final Object invoke$0(AwS0S0100020_18 awS0S0100020_18, Object obj) {
        ((PositionSelectionViewModel) awS0S0100020_18.l0).setState(AFwS256S0000000_18.get$arr$(459));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope((PositionSelectionViewModel) awS0S0100020_18.l0), C0PEM.LIZJ, null, new C1178610gmB(awS0S0100020_18.d1, awS0S0100020_18.d2, (PositionSelectionViewModel) awS0S0100020_18.l0, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0100020_18 awS0S0100020_18, Object obj) {
        C1199800hKM c1199800hKM = (C1199800hKM) obj;
        PoiPublishExtensionVM poiPublishExtensionVM = (PoiPublishExtensionVM) awS0S0100020_18.l0;
        double d = awS0S0100020_18.d1;
        double d2 = awS0S0100020_18.d2;
        poiPublishExtensionVM.getClass();
        boolean z = true;
        if (d == 0.0d && d2 == 0.0d) {
            z = false;
        }
        return C1199800hKM.LIZ(c1199800hKM, null, null, Boolean.valueOf(z), null, null, null, null, null, null, null, 2043);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0100020_18(PositionSelectionViewModel positionSelectionViewModel, double d, double d2, int i) {
        super(1);
        this.$t = i;
        this.l0 = positionSelectionViewModel;
        this.d1 = d;
        this.d2 = d2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0100020_18(PoiPublishExtensionVM poiPublishExtensionVM, double d, double d2, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiPublishExtensionVM;
        this.d1 = d;
        this.d2 = d2;
    }
}
