package defpackage;

import X.C09AY;
import X.C1744320vUc;
import X.C1747730va7;
import X.C1748720vbi;
import X.InterfaceC1743730vTf;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes27.dex */
public final class m7 implements InterfaceC1743730vTf {
    public final /* synthetic */ RegionCandHelper LIZ;
    public final /* synthetic */ AddressEditViewModel LIZIZ;
    public final /* synthetic */ String LIZJ;

    public final class a extends C09AY implements Function1<LaneParams, Unit> {
        public final /* synthetic */ String LL;
        public final /* synthetic */ int LLILLJJLI;
        public final /* synthetic */ int LLILLL;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i, int i2) {
            super(1);
            this.LL = str;
            this.LLILLJJLI = i;
            this.LLILLL = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LaneParams laneParams) {
            LaneParams laneParams2 = laneParams;
            String str = this.LL;
            if (str == null) {
                str = "";
            }
            laneParams2.plusAssign("drop_down_list_name", str);
            laneParams2.plusAssign("item_num", Integer.valueOf(this.LLILLJJLI));
            laneParams2.plusAssign("action_type", "click");
            laneParams2.plusAssign("rank", Integer.valueOf(this.LLILLL));
            return Unit.LIZ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1743730vTf
    public final void LIZ(int i) {
        List<C1744320vUc<District>> list;
        int size;
        C1744320vUc c1744320vUc;
        int size2;
        AddressEditFragment addressEditFragment;
        List<C1744320vUc<District>> list2;
        List<C1744320vUc<District>> list3;
        s7 s7Var = this.LIZ.LJ;
        if (s7Var != null && (list = s7Var.LL) != null && (size = ((ArrayList) list).size()) > 0 && i >= 0 && i < size) {
            s7 s7Var2 = this.LIZ.LJ;
            AddressBase addressBase = null;
            if (s7Var2 != null && (list3 = s7Var2.LL) != null) {
                c1744320vUc = (C1744320vUc) ListProtector.get(list3, i);
            } else {
                c1744320vUc = null;
            }
            RegionCandHelper regionCandHelper = this.LIZ;
            regionCandHelper.getClass();
            if (c1744320vUc != null) {
                ArrayList arrayList = new ArrayList();
                District district = (District) c1744320vUc.LIZ;
                if (district != null) {
                    arrayList.add(new Region(district.name, district.geoNameId, district.code, null, district.longitude, district.latitude, null));
                    addressBase = district.addressBase;
                }
                Function2<? super List<Region>, ? super AddressBase, Unit> function2 = regionCandHelper.LJIIIIZZ;
                if (function2 != null) {
                    function2.invoke(arrayList, addressBase);
                }
            }
            s7 s7Var3 = this.LIZ.LJ;
            if (s7Var3 != null && (list2 = s7Var3.LL) != null) {
                size2 = ((ArrayList) list2).size();
            } else {
                size2 = 0;
            }
            if (size2 > 0 && i >= 0 && (addressEditFragment = AddressEditFragment.LLLII) != null) {
                C1748720vbi.LIZIZ(addressEditFragment, new C1747730va7(), new a(this.LIZJ, size2, i));
            }
            RegionCandHelper regionCandHelper2 = this.LIZ;
            regionCandHelper2.LJIIIZ = "sug";
            regionCandHelper2.LJI = 0;
            regionCandHelper2.LIZ(this.LIZIZ, this.LIZJ, false);
            return;
        }
        this.LIZ.LIZ(this.LIZIZ, this.LIZJ, false);
    }

    public m7(RegionCandHelper regionCandHelper, AddressEditViewModel addressEditViewModel, String str) {
        this.LIZ = regionCandHelper;
        this.LIZIZ = addressEditViewModel;
        this.LIZJ = str;
    }
}
