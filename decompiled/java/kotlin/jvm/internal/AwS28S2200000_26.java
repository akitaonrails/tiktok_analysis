package kotlin.jvm.internal;

import X.C09AY;
import X.C1741890vQh;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressValid;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandDetailPlaceResponse;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS28S2200000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS28S2200000_26 awS28S2200000_26, Object obj) {
        Address address;
        AddressValid addressValid;
        HashMap<String, Object> mapLJIIJ;
        String str;
        CandInputData candInputData = ((CandDetailPlaceResponse) obj).candDetailPlaceOption;
        Integer num = null;
        if (candInputData != null && (address = candInputData.address) != null) {
            if (candInputData != null) {
                addressValid = candInputData.addressValid;
            } else {
                addressValid = null;
            }
            ((AddressEditFragment) awS28S2200000_26.l2).mS().pS2(address);
            AddressEditViewModel addressEditViewModelMS = ((AddressEditFragment) awS28S2200000_26.l2).mS();
            String str2 = awS28S2200000_26.s0;
            if (str2 != null) {
                mapLJIIJ = C1741890vQh.LJIIJ(str2);
            } else {
                mapLJIIJ = null;
            }
            String str3 = awS28S2200000_26.s1;
            if (str3 == null) {
                str3 = "map_pin";
            }
            if (addressValid != null) {
                str = addressValid.invalidHintMessage;
                num = addressValid.addressInvalidType;
            } else {
                str = null;
            }
            AddressEditViewModel.tS2(addressEditViewModelMS, address, null, str, num, true, false, (Boolean) awS28S2200000_26.l3, mapLJIIJ, str3, null, 4806);
            ((AddressEditFragment) awS28S2200000_26.l2).mS().LLLLIIIILLL = true;
            ((AddressEditFragment) awS28S2200000_26.l2).rS();
        } else {
            ((AddressEditFragment) awS28S2200000_26.l2).wS();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS28S2200000_26 r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS28S2200000_26.invoke$1(kotlin.jvm.internal.AwS28S2200000_26, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S2200000_26(AddressEditFragment addressEditFragment, String str, String str2, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.l2 = addressEditFragment;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S2200000_26(String str, AddressEditViewModel addressEditViewModel, String str2, CandInputData candInputData, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = addressEditViewModel;
        this.s1 = str2;
        this.l3 = candInputData;
    }
}
