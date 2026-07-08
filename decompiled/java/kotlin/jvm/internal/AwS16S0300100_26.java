package kotlin.jvm.internal;

import X.AbstractC1732180vB2;
import X.C09AY;
import X.C0H9H;
import X.C10515049h;
import X.C1177960gl8;
import X.C1745290vWB;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C1748720vbi;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1731950vAf;
import X.InterfaceC1747020vYy;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.ThumbnailMapViewHolder;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.GetBillboardResp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS16S0300100_26 extends C09AY implements Function1 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS16S0300100_26 awS16S0300100_26, Object obj) {
        GetBillboardResp getBillboardResp = (GetBillboardResp) obj;
        ((AbstractC1732180vB2) awS16S0300100_26.l0).getClass();
        final List<ECBillboard> list = getBillboardResp.billboards;
        if (list != null) {
            final AbstractC1732180vB2 abstractC1732180vB2 = (AbstractC1732180vB2) awS16S0300100_26.l0;
            final List list2 = (List) awS16S0300100_26.l1;
            final Map map = (Map) awS16S0300100_26.l2;
            final long j = awS16S0300100_26.j3;
            abstractC1732180vB2.LJJII("msg_request", list);
            abstractC1732180vB2.LJJI(list, 0, new InterfaceC1731950vAf() { // from class: X.0vBu
                @Override // X.InterfaceC1731950vAf
                public final void onSuccess() {
                    abstractC1732180vB2.LJJIIJ("msg_request", list);
                    abstractC1732180vB2.LJJIJIIJI(j, list2, map, false);
                }

                @Override // X.InterfaceC1731950vAf
                public final void LIZ(String str) {
                    abstractC1732180vB2.LJJIII("msg_request", str, list);
                }
            }, getBillboardResp.daInfo);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$1(AwS16S0300100_26 awS16S0300100_26, Object obj) {
        String string;
        Object obj2;
        float fIntValue;
        AddressLocation addressLocation;
        Integer num;
        InterfaceC1747020vYy interfaceC1747020vYy = (InterfaceC1747020vYy) obj;
        ThumbnailMapViewHolder thumbnailMapViewHolder = (ThumbnailMapViewHolder) awS16S0300100_26.l0;
        thumbnailMapViewHolder.LLJJ = interfaceC1747020vYy;
        ViewGroup.LayoutParams layoutParams = null;
        if (interfaceC1747020vYy != null) {
            C1177960gl8 c1177960gl8 = (C1177960gl8) awS16S0300100_26.l1;
            Object obj3 = ((C1745680vWo) thumbnailMapViewHolder.LLILLJJLI).LIZIZ;
            if ((obj3 instanceof AddressLocation) && (addressLocation = (AddressLocation) obj3) != null && (num = addressLocation.defaultZoomLevel) != null) {
                fIntValue = num.intValue();
            } else {
                fIntValue = 18.0f;
            }
            interfaceC1747020vYy.LIZIZ(c1177960gl8, Float.valueOf(fIntValue), null);
        }
        ViewGroup viewGroup = (ViewGroup) awS16S0300100_26.l2;
        if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        ViewGroup viewGroup2 = (ViewGroup) awS16S0300100_26.l2;
        if (viewGroup2 != null) {
            C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), viewGroup2);
        }
        ViewGroup viewGroup3 = (ViewGroup) awS16S0300100_26.l2;
        if (viewGroup3 != null) {
            C786410Ut5.X5(layoutParams, viewGroup3);
        }
        ViewGroup viewGroup4 = (ViewGroup) awS16S0300100_26.l2;
        if (viewGroup4 != null) {
            C786410Ut5.LJLZ(0, viewGroup4);
        }
        C1745480vWU c1745480vWU = ((ThumbnailMapViewHolder) awS16S0300100_26.l0).a6().LLJJIJIL;
        HashMap<String, Object> map = ((ThumbnailMapViewHolder) awS16S0300100_26.l0).a6().LLJJIJIIJIL;
        c1745480vWU.getClass();
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C10515049h(), new AwS580S0100000_1((HashMap) map, (HashMap<String, Object>) 931));
        }
        ThumbnailMapViewHolder thumbnailMapViewHolder2 = (ThumbnailMapViewHolder) awS16S0300100_26.l0;
        if (thumbnailMapViewHolder2.LLJJI) {
            HashMap<String, Object> map2 = thumbnailMapViewHolder2.a6().LLJJIJIIJIL;
            if (map2 == null || (obj2 = map2.get("enter_from")) == null || (string = obj2.toString()) == null) {
                string = "";
            }
            C1745290vWB.LIZLLL(System.currentTimeMillis() - awS16S0300100_26.j3, "address_edit_map_module", string);
            ((ThumbnailMapViewHolder) awS16S0300100_26.l0).LLJJI = false;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0000: IPUT (r8 I:int), (r2 I:kotlin.jvm.internal.AwS16S0300100_26) (LINE:83886080) kotlin.jvm.internal.AwS16S0300100_26.$t int, block:B:2:0x0000 */
    public AwS16S0300100_26(AbstractC1732180vB2 abstractC1732180vB2, AbstractC1732180vB2 abstractC1732180vB22, List<ECBillboard> list, Map<String, ? extends Object> map, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l0 = abstractC1732180vB2;
        this.l1 = abstractC1732180vB22;
        this.l2 = list;
        this.j3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0300100_26(ThumbnailMapViewHolder thumbnailMapViewHolder, C1177960gl8 c1177960gl8, ViewGroup viewGroup, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = thumbnailMapViewHolder;
        this.l1 = c1177960gl8;
        this.l2 = viewGroup;
        this.j3 = j;
    }
}
