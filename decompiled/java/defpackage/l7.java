package defpackage;

import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C1019103yf;
import X.C11NZ;
import X.C11S5;
import X.C13BV;
import X.C155000ia;
import X.C1701940uOG;
import X.C1744340vUe;
import X.C1747870vaL;
import X.C2252611DEt;
import X.C2286608xc;
import X.EnumC1014603xw;
import X.InterfaceC1364105Vn;
import X.InterfaceC1744330vUd;
import X.InterfaceC497601wk;
import Y.AfS170S0100000_1;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictsData;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "RegionCandHelper$districtSearch$1", f = "RegionCandHelper.kt", l = {473}, m = "invokeSuspend")
public final class l7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AddressEditViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<SearchDistrictsData, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l7(String str, AddressEditViewModel addressEditViewModel, String str2, Function1<? super SearchDistrictsData, Unit> function1, InterfaceC1364105Vn<? super l7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = addressEditViewModel;
        this.LLILZ = str2;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new l7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        List listSingletonList;
        List listSingletonList2;
        String str;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str2 = this.LLILLJJLI;
                if (str2 != null && str2.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return Unit.LIZ;
                }
                Integer numLJ = C2286608xc.LJ(1);
                Region region = this.LLILLL.LLILZLL;
                if (region == null || (str = region.geoNameId) == null || (listSingletonList = Collections.singletonList(str)) == null) {
                    listSingletonList = C13BV.INSTANCE;
                }
                String str3 = this.LLILLJJLI;
                String str4 = this.LLILZ;
                if (str4 != null) {
                    listSingletonList2 = Collections.singletonList(str4);
                } else {
                    listSingletonList2 = null;
                }
                SearchDistrictRequest searchDistrictRequest = new SearchDistrictRequest(numLJ, listSingletonList, str3, 0, listSingletonList2, C1747870vaL.LIZ);
                InterfaceC1744330vUd.LIZ.getClass();
                C11NZ c11nzLIZ = C1744340vUe.LIZ(searchDistrictRequest);
                this.LL = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                c2252611DEt.LJJII(new AwS580S0100000_1(c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS170S0100000_1(c2252611DEt, 29), new AfS170S0100000_1(c2252611DEt, 30)), 557));
                obj = c2252611DEt.LJIJ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    return objLJFF;
                }
            }
            SearchDistrictsData searchDistrictsData = (SearchDistrictsData) obj;
            if (searchDistrictsData != null) {
                this.LLILZIL.invoke(searchDistrictsData);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR76, e, null);
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
