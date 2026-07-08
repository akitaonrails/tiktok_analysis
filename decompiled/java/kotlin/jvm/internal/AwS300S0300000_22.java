package kotlin.jvm.internal;

import X.C09AY;
import X.C1405970mgt;
import X.C1408710mlJ;
import X.C1418150n0X;
import X.C1418230n0f;
import X.C631370Opb;
import X.EnumC1418280n0k;
import X.InterfaceC1407210mit;
import X.InterfaceC1415800mwk;
import android.view.View;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.Prop;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropValue;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.SkuPropValueSelectionAssem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public class AwS300S0300000_22 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS300S0300000_22 awS300S0300000_22, Object obj, Object obj2) {
        boolean z;
        List list = (List) obj;
        String str = (String) obj2;
        if (((C1418230n0f) awS300S0300000_22.l0).LIZ.LJIILJJIL == EnumC1418280n0k.MUSIC_DETAIL) {
            z = true;
        } else {
            z = false;
        }
        C1418150n0X c1418150n0X = (C1418150n0X) awS300S0300000_22.l1;
        s sVar = s.LIZ;
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) awS300S0300000_22.l2;
        sVar.getClass();
        ((C1418150n0X) awS300S0300000_22.l1).H2(((C1418230n0f) awS300S0300000_22.l0).LJI, c1418150n0X.W1(s.LJIIJ(list, autoCutThemeData, z), (AutoCutThemeData) awS300S0300000_22.l2, (C1418230n0f) awS300S0300000_22.l0), str, null, false);
        C1418150n0X c1418150n0X2 = (C1418150n0X) awS300S0300000_22.l1;
        c1418150n0X2.LLIZLLLIL.LJI = true;
        c1418150n0X2.O4(((C1418230n0f) awS300S0300000_22.l0).LJI);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS300S0300000_22 awS300S0300000_22, Object obj, Object obj2) {
        boolean z;
        List list = (List) obj;
        String str = (String) obj2;
        if (((C1418230n0f) awS300S0300000_22.l0).LIZ.LJIILJJIL == EnumC1418280n0k.MUSIC_DETAIL) {
            z = true;
        } else {
            z = false;
        }
        C1418150n0X c1418150n0X = (C1418150n0X) awS300S0300000_22.l1;
        s sVar = s.LIZ;
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) awS300S0300000_22.l2;
        sVar.getClass();
        List<AutoCutThemeData> listW1 = c1418150n0X.W1(s.LJIIJ(list, autoCutThemeData, z), (AutoCutThemeData) awS300S0300000_22.l2, (C1418230n0f) awS300S0300000_22.l0);
        C1418150n0X c1418150n0X2 = (C1418150n0X) awS300S0300000_22.l1;
        c1418150n0X2.H2(((C1418230n0f) awS300S0300000_22.l0).LJI, listW1, str, c1418150n0X2.LLILLJJLI, true);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS300S0300000_22 awS300S0300000_22, Object obj, Object obj2) {
        int size;
        C1408710mlJ c1408710mlJ = (C1408710mlJ) obj;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1407210mit interfaceC1407210mitOp = ((SkuPropValueSelectionAssem) awS300S0300000_22.l0).op();
        if (interfaceC1407210mitOp != null) {
            List<String> list = (List) awS300S0300000_22.l1;
            String str = ((Prop) awS300S0300000_22.l2).propId;
            PropValue propValue = c1408710mlJ.LL;
            int i = c1408710mlJ.LLILZ;
            int i2 = c1408710mlJ.LLILZIL;
            Image image = c1408710mlJ.LLILZLL;
            Boolean bool = ((C1405970mgt) C631370Opb.LIZ((SkuPropValueSelectionAssem) awS300S0300000_22.l0)).LLIZ;
            boolean z = c1408710mlJ.LLILLL;
            View viewLJJIJL = ((SkuPropValueSelectionAssem) awS300S0300000_22.l0).LJJIJL();
            SkuPropValueSelectionAssem skuPropValueSelectionAssem = (SkuPropValueSelectionAssem) awS300S0300000_22.l0;
            List<C1408710mlJ> list2 = skuPropValueSelectionAssem.LLJLLIL;
            InterfaceC1415800mwk interfaceC1415800mwk = skuPropValueSelectionAssem.LLJLL;
            if (interfaceC1415800mwk != null) {
                size = interfaceC1415800mwk.LIZIZ(list2);
            } else {
                size = list2.size();
            }
            interfaceC1407210mitOp.bI2(list, str, propValue, i, i2, image, bool, z, viewLJJIJL, iIntValue, list2, size);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS300S0300000_22(C1418230n0f c1418230n0f, C1418150n0X c1418150n0X, AutoCutThemeData autoCutThemeData, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1418230n0f;
        this.l1 = c1418150n0X;
        this.l2 = autoCutThemeData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS300S0300000_22(SkuPropValueSelectionAssem skuPropValueSelectionAssem, SkuPropValueSelectionAssem skuPropValueSelectionAssem2, List<String> list, Prop prop) {
        super(2);
        this.$t = prop;
        this.l0 = skuPropValueSelectionAssem;
        this.l1 = skuPropValueSelectionAssem2;
        this.l2 = list;
    }
}
