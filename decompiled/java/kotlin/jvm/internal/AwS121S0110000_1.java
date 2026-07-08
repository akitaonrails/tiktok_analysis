package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0PEM;
import X.C10516049i;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C1750590vej;
import X.C189200o6;
import X.C23250099c;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.lockup.SeaPdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS121S0110000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS121S0110000_1 awS121S0110000_1) {
        String str;
        Object c098200Yq;
        String strLJIIIIZZ;
        if (!awS121S0110000_1.z1) {
            Context context = ((OrderSubmitFragment) awS121S0110000_1.l0).getContext();
            BillInfoData billInfoData = ((OrderSubmitFragment) awS121S0110000_1.l0).ZR().LLJJI;
            LinkedHashMap linkedHashMap = null;
            if (billInfoData != null) {
                str = billInfoData.userBenefitDrawSchema;
            } else {
                str = null;
            }
            HashMap<String, Object> map = ((OrderSubmitFragment) awS121S0110000_1.l0).ZR().LLLIL;
            if (context != null && str != null) {
                if (map != null) {
                    try {
                        linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.put("previous_page", "order_submit");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                }
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                if (linkedHashMap == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(linkedHashMap)) == null) {
                    strLJIIIIZZ = "{}";
                }
                builderBuildUpon.appendQueryParameter("trackParams", strLJIIIIZZ);
                builderBuildUpon.appendQueryParameter("_ec_start_time", String.valueOf(System.currentTimeMillis()));
                SmartRouter.buildRoute(context, builderBuildUpon.toString()).open();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m1boximpl(c098200Yq);
            }
            C1748720vbi.LIZLLL(((OrderSubmitFragment) awS121S0110000_1.l0).kS(), new C10516049i(), new AwS580S0100000_1((OrderSubmitFragment) awS121S0110000_1.l0, 126));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS121S0110000_1 awS121S0110000_1) {
        ((Function1) awS121S0110000_1.l0).invoke(Boolean.valueOf(awS121S0110000_1.z1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS121S0110000_1 awS121S0110000_1) {
        SeaPdpViewModel seaPdpViewModelD6 = ((SeaPdpInfoViewHolder) awS121S0110000_1.l0).d6();
        SeaPdpInfoViewHolder seaPdpInfoViewHolder = (SeaPdpInfoViewHolder) awS121S0110000_1.l0;
        View view = seaPdpInfoViewHolder.itemView;
        boolean z = awS121S0110000_1.z1;
        C23250099c.LIZLLL(seaPdpViewModelD6.LLLIIL, C0PEM.LIZJ, null, new C1750590vej(view, seaPdpViewModelD6, z, seaPdpInfoViewHolder.d6().LLLLL.LJ("c7829.d57184"), null), 2);
        seaPdpViewModelD6.LLLIZZ = Boolean.valueOf(z);
        seaPdpViewModelD6.setState(new AwS580S0100000_1(seaPdpViewModelD6, 725));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS121S0110000_1(SeaPdpInfoViewHolder seaPdpInfoViewHolder, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = seaPdpInfoViewHolder;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS121S0110000_1(Function1 function1, Function1<? super Boolean, Unit> function12, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = function1;
        this.z1 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS121S0110000_1(boolean z, OrderSubmitFragment orderSubmitFragment, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = orderSubmitFragment;
    }
}
