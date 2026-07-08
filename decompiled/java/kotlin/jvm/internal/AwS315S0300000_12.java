package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C0TN2;
import X.C1753630vjd;
import X.C1753640vje;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.InterfaceC1631620sYq;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.account.security.SecurityCheckUpAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bundle.SeaPdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.bundledeal.PdpBundleDealVH;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public class AwS315S0300000_12 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS315S0300000_12(SecurityCheckUpAssem securityCheckUpAssem, C19EG c19eg, C0TN2 c0tn2, int i) {
        super(3);
        this.$t = i;
        this.l0 = securityCheckUpAssem;
        this.l1 = c19eg;
        this.l2 = c0tn2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$0(kotlin.jvm.internal.AwS315S0300000_12 r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS315S0300000_12.invoke$0(kotlin.jvm.internal.AwS315S0300000_12, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS315S0300000_12 awS315S0300000_12, Object obj, Object obj2, Object obj3) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((PdpBundleDealVH) awS315S0300000_12.l0);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1753640vje((PdpBundleDealVH) awS315S0300000_12.l0, (BundleInfo) awS315S0300000_12.l1, obj3, ((Number) obj).intValue(), (View) awS315S0300000_12.l2, (String) obj2, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS315S0300000_12 awS315S0300000_12, Object obj, Object obj2, Object obj3) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((SeaPdpBundleDealVH) awS315S0300000_12.l0);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1753630vjd((SeaPdpBundleDealVH) awS315S0300000_12.l0, (BundleInfo) awS315S0300000_12.l1, obj3, ((Number) obj).intValue(), (View) awS315S0300000_12.l2, (String) obj2, null), 2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS315S0300000_12(SeaPdpBundleDealVH seaPdpBundleDealVH, BundleInfo bundleInfo, View view, int i) {
        super(3);
        this.$t = i;
        this.l0 = seaPdpBundleDealVH;
        this.l1 = bundleInfo;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS315S0300000_12(PdpBundleDealVH pdpBundleDealVH, BundleInfo bundleInfo, View view, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpBundleDealVH;
        this.l1 = bundleInfo;
        this.l2 = view;
    }
}
