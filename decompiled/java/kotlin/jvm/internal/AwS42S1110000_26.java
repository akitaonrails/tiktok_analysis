package kotlin.jvm.internal;

import X.C09AY;
import X.C1177960gl8;
import X.C1742730vS3;
import X.C1744080vUE;
import X.C1745180vW0;
import X.C2341109Fh;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public class AwS42S1110000_26 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S1110000_26(AddressEditViewModel addressEditViewModel, String str, boolean z, int i) {
        super(3);
        this.$t = i;
        this.l1 = addressEditViewModel;
        this.s0 = str;
        this.z2 = z;
    }

    public static final Object invoke$0(AwS42S1110000_26 awS42S1110000_26, Object obj, Object obj2, Object obj3) {
        Double d;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1742730vS3 c1742730vS3 = (C1742730vS3) obj2;
        String str = (String) obj3;
        Double d2 = null;
        if (c1742730vS3 != null) {
            d = c1742730vS3.LIZIZ;
            d2 = c1742730vS3.LIZ;
        } else {
            d = null;
        }
        if (zBooleanValue && d != null && d2 != null) {
            C1177960gl8 c1177960gl8 = new C1177960gl8(d.doubleValue(), d2.doubleValue());
            AddressEditViewModel addressEditViewModel = (AddressEditViewModel) awS42S1110000_26.l1;
            addressEditViewModel.LLLLII = false;
            addressEditViewModel.oS2(c1177960gl8, true);
            Address addressUR2 = AddressEditViewModel.uR2((AddressEditViewModel) awS42S1110000_26.l1);
            AddressEditViewModel addressEditViewModel2 = (AddressEditViewModel) awS42S1110000_26.l1;
            addressEditViewModel2.wR2("address", addressUR2, "address", null, null, null, new AwS42S1110000_26(addressEditViewModel2, awS42S1110000_26.s0, d, d2, awS42S1110000_26.z2, 2));
        } else {
            AddressEditViewModel.WR2((AddressEditViewModel) awS42S1110000_26.l1, awS42S1110000_26.s0, 0, null, str, 28);
            ((AddressEditViewModel) awS42S1110000_26.l1).kS2(awS42S1110000_26.z2);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            AFwS215S0000000_26 aFwS215S0000000_26 = AFwS215S0000000_26.get$arr$(518);
            c2341109Fh.getClass();
            C2341109Fh.LIZIZ(aFwS215S0000000_26);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS42S1110000_26 awS42S1110000_26, Object obj, Object obj2, Object obj3) {
        C1744080vUE c1744080vUE;
        Double d;
        Double d2;
        String str;
        String str2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1742730vS3 c1742730vS3 = (C1742730vS3) obj2;
        String str3 = (String) obj3;
        Address addressLIZIZ = null;
        if (zBooleanValue) {
            AddressEditViewModel addressEditViewModel = (AddressEditViewModel) awS42S1110000_26.l1;
            if (c1742730vS3 != null) {
                str = c1742730vS3.LIZJ;
                str2 = c1742730vS3.LIZLLL;
            } else {
                str = null;
                str2 = null;
            }
            addressEditViewModel.getClass();
            if (str == null || str.length() <= 0) {
                str = null;
            }
            if (str2 == null || str2.length() <= 0) {
                str2 = null;
            }
            if (str != null && str2 != null) {
                c1744080vUE = new C1744080vUE(str, str2, Integer.valueOf(!C1745180vW0.LJ() ? 1 : 0));
            } else {
                c1744080vUE = null;
            }
        } else {
            c1744080vUE = null;
        }
        if (c1742730vS3 != null) {
            d = c1742730vS3.LIZIZ;
            d2 = c1742730vS3.LIZ;
        } else {
            d = null;
            d2 = null;
        }
        if (zBooleanValue && d != null && d2 != null && c1744080vUE != null) {
            C1177960gl8 c1177960gl8 = new C1177960gl8(d.doubleValue(), d2.doubleValue());
            AddressEditViewModel addressEditViewModel2 = (AddressEditViewModel) awS42S1110000_26.l1;
            addressEditViewModel2.LLLLII = false;
            addressEditViewModel2.oS2(c1177960gl8, true);
            Address addressUR2 = AddressEditViewModel.uR2((AddressEditViewModel) awS42S1110000_26.l1);
            if (addressUR2 != null) {
                addressLIZIZ = Address.LIZIZ(addressUR2, null, null, null, null, null, null, null, 2559);
            }
            AddressEditViewModel addressEditViewModel3 = (AddressEditViewModel) awS42S1110000_26.l1;
            Address address = addressLIZIZ;
            C1744080vUE c1744080vUE2 = c1744080vUE;
            addressEditViewModel3.wR2("address", address, "address", null, null, c1744080vUE2, new AwS42S1110000_26(addressEditViewModel3, awS42S1110000_26.s0, d, d2, awS42S1110000_26.z2, 3));
        } else {
            AddressEditViewModel addressEditViewModel4 = (AddressEditViewModel) awS42S1110000_26.l1;
            addressEditViewModel4.getClass();
            addressEditViewModel4.setState(new AwS38S0010000_26(false, 19));
            AddressEditViewModel addressEditViewModel5 = (AddressEditViewModel) awS42S1110000_26.l1;
            String str4 = awS42S1110000_26.s0;
            if (zBooleanValue && c1744080vUE == null) {
                str3 = "encrypted_location_empty";
            }
            AddressEditViewModel.WR2(addressEditViewModel5, str4, 0, null, str3, 28);
            ((AddressEditViewModel) awS42S1110000_26.l1).kS2(awS42S1110000_26.z2);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            AFwS215S0000000_26 aFwS215S0000000_26 = AFwS215S0000000_26.get$arr$(520);
            c2341109Fh.getClass();
            C2341109Fh.LIZIZ(aFwS215S0000000_26);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS42S1110000_26 r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions r8 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions) r8
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            java.lang.String r10 = (java.lang.String) r10
            r5 = 1
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r0
            java.lang.String r1 = r7.s0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3 = 0
            r5 = 48
            r4 = r3
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.WR2(r0, r1, r2, r3, r4, r5)
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r1
            boolean r0 = r7.z2
            r1.kS2(r0)
        L27:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2a:
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r1
            r0 = 0
            if (r8 == 0) goto L33
            java.lang.String r0 = r8.sessionKey
        L33:
            r1.LLJLILLLLZIIL = r0
            if (r8 == 0) goto L77
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData> r0 = r8.candInputOptions
            if (r0 == 0) goto L77
            java.lang.Object r6 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData r6 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData) r6
            if (r6 == 0) goto L77
            java.lang.Object r4 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r4 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r4
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData r3 = com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData.LIZ(r6, r10)
            boolean r2 = r7.z2
            r4.getClass()
            kotlin.jvm.internal.AwS112S0110000_26 r1 = new kotlin.jvm.internal.AwS112S0110000_26
            r0 = 17
            r1.<init>(r3, r2, r0)
            r4.setState(r1)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo r0 = r6.LIZIZ()
            if (r0 == 0) goto L77
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r1
            java.lang.String r2 = "location_sug"
            r3 = 0
            X.0vY4 r0 = X.C1746460vY4.LIZ
            r0.getClass()
            java.util.Map r4 = X.C1746460vY4.LJ(r6, r5)
            r6 = 46
            r5 = r3
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.WR2(r1, r2, r3, r4, r5, r6)
            goto L27
        L77:
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r1
            java.lang.String r2 = r7.s0
            r0 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r6 = 48
            r5 = r4
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.WR2(r1, r2, r3, r4, r5, r6)
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r1
            boolean r0 = r7.z2
            r1.kS2(r0)
            X.09Fh r1 = X.C2341109Fh.LIZ
            r0 = 517(0x205, float:7.24E-43)
            kotlin.jvm.internal.AFwS215S0000000_26 r0 = kotlin.jvm.internal.AFwS215S0000000_26.get$arr$(r0)
            r1.getClass()
            X.C2341109Fh.LIZIZ(r0)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS42S1110000_26.invoke$2(kotlin.jvm.internal.AwS42S1110000_26, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS42S1110000_26 r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions r8 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions) r8
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r4 = r9.booleanValue()
            java.lang.Object r3 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r3 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r3
            r3.getClass()
            kotlin.jvm.internal.AwS38S0010000_26 r2 = new kotlin.jvm.internal.AwS38S0010000_26
            r1 = 0
            r0 = 19
            r2.<init>(r1, r0)
            r3.setState(r2)
            r5 = 1
            if (r4 == 0) goto L3a
            java.lang.Object r0 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r0
            java.lang.String r1 = r7.s0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3 = 0
            r5 = 48
            r4 = r3
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.WR2(r0, r1, r2, r3, r4, r5)
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r1
            boolean r0 = r7.z2
            r1.kS2(r0)
        L37:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3a:
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r1
            r0 = 0
            if (r8 == 0) goto L43
            java.lang.String r0 = r8.sessionKey
        L43:
            r1.LLJLILLLLZIIL = r0
            if (r8 == 0) goto L83
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData> r0 = r8.candInputOptions
            if (r0 == 0) goto L83
            java.lang.Object r4 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData r4 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData) r4
            if (r4 == 0) goto L83
            java.lang.Object r3 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r3 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r3
            boolean r2 = r7.z2
            r3.getClass()
            kotlin.jvm.internal.AwS112S0110000_26 r1 = new kotlin.jvm.internal.AwS112S0110000_26
            r0 = 17
            r1.<init>(r4, r2, r0)
            r3.setState(r1)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo r0 = r4.LIZIZ()
            if (r0 == 0) goto L83
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r1
            java.lang.String r2 = "location_sug"
            r3 = 0
            X.0vY4 r0 = X.C1746460vY4.LIZ
            r0.getClass()
            java.util.Map r4 = X.C1746460vY4.LJFF(r4, r5)
            r6 = 46
            r5 = r3
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.WR2(r1, r2, r3, r4, r5, r6)
            goto L37
        L83:
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r1
            java.lang.String r2 = r7.s0
            r0 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r6 = 48
            r5 = r4
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.WR2(r1, r2, r3, r4, r5, r6)
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r1
            boolean r0 = r7.z2
            r1.kS2(r0)
            X.09Fh r1 = X.C2341109Fh.LIZ
            r0 = 519(0x207, float:7.27E-43)
            kotlin.jvm.internal.AFwS215S0000000_26 r0 = kotlin.jvm.internal.AFwS215S0000000_26.get$arr$(r0)
            r1.getClass()
            X.C2341109Fh.LIZIZ(r0)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS42S1110000_26.invoke$3(kotlin.jvm.internal.AwS42S1110000_26, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S1110000_26(AddressEditViewModel addressEditViewModel, String str, Double d, Double d2, boolean z, int i) {
        super(3);
        this.$t = i;
        this.l1 = addressEditViewModel;
        this.s0 = str;
        this.z2 = z;
    }
}
