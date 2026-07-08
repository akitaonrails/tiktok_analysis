package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C297500BlM;
import X.C297510BlN;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionViewModel;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;
import com.ss.android.ugc.nearby.container.NearbyContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public class AwS156S0110000_18 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0110000_18(NearbyContentAssem nearbyContentAssem, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = nearbyContentAssem;
        this.z1 = z;
    }

    public static final Object invoke$0(AwS156S0110000_18 awS156S0110000_18, Object obj, Object obj2) {
        String strLIZIZ;
        double dDoubleValue = ((Number) obj).doubleValue();
        double dDoubleValue2 = ((Number) obj2).doubleValue();
        PoiPublishExtensionVM poiPublishExtensionVM = (PoiPublishExtensionVM) awS156S0110000_18.l0;
        poiPublishExtensionVM.setState(new AwS0S0100020_18(poiPublishExtensionVM, dDoubleValue, dDoubleValue2, 1));
        PoiPublishExtensionVM poiPublishExtensionVM2 = (PoiPublishExtensionVM) awS156S0110000_18.l0;
        if (C297510BlN.LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('(');
            sbLIZ.append(dDoubleValue);
            sbLIZ.append(")-(");
            sbLIZ.append(dDoubleValue2);
            sbLIZ.append(")-(");
            sbLIZ.append(awS156S0110000_18.z1);
            sbLIZ.append(")-(");
            sbLIZ.append(C297500BlM.LIZ());
            sbLIZ.append(')');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('(');
            sbLIZ2.append(dDoubleValue);
            sbLIZ2.append(")-(");
            sbLIZ2.append(dDoubleValue2);
            sbLIZ2.append(")-(");
            sbLIZ2.append(awS156S0110000_18.z1);
            sbLIZ2.append(')');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        poiPublishExtensionVM2.LLILZLL = strLIZIZ;
        PoiSearchVM poiSearchVM = (PoiSearchVM) ((PoiPublishExtensionVM) awS156S0110000_18.l0).LLJILJILJ.getValue();
        boolean z = awS156S0110000_18.z1;
        poiSearchVM.LLJJJ = dDoubleValue;
        poiSearchVM.LLJJJIL = dDoubleValue2;
        poiSearchVM.LLJJJJ = z;
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS156S0110000_18 r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS156S0110000_18.invoke$1(kotlin.jvm.internal.AwS156S0110000_18, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS156S0110000_18 awS156S0110000_18, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        PositionSelectionViewModel positionSelectionViewModel = (PositionSelectionViewModel) awS156S0110000_18.l0;
        boolean z = awS156S0110000_18.z1;
        positionSelectionViewModel.getClass();
        positionSelectionViewModel.withState(new AwS105S0110000_18(positionSelectionViewModel, z, 22));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0110000_18(boolean z, PoiPublishExtensionVM poiPublishExtensionVM, int i) {
        super(2);
        this.$t = i;
        this.z1 = z;
        this.l0 = poiPublishExtensionVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0110000_18(PositionSelectionViewModel positionSelectionViewModel, Fragment fragment, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = positionSelectionViewModel;
        this.z1 = z;
    }
}
