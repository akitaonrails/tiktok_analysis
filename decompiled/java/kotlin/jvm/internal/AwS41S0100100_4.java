package kotlin.jvm.internal;

import X.AbstractC332980D3o;
import X.AnonymousClass0951;
import X.C09AY;
import X.C0D21;
import X.C0D3K;
import X.C0D3V;
import X.C1023640ckE;
import X.C1834780xqW;
import X.C2264991Dl3;
import X.C291001Au;
import X.EnumC1834800xqY;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS41S0100100_4 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
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

    public static final Object invoke$0(AwS41S0100100_4 awS41S0100100_4, Object obj) {
        AbstractC332980D3o abstractC332980D3o;
        Map<String, String> map;
        C0D21 c0d21;
        C0D3K pageData;
        C0D3V c0d3v;
        String str;
        AnonymousClass0951 anonymousClass0951;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        PdpViewModel pdpViewModel = ((PdpFragment) awS41S0100100_4.l0).LLJ;
        String str2 = null;
        if (pdpViewModel != null && (anonymousClass0951 = pdpViewModel.LLILLJJLI) != null) {
            abstractC332980D3o = (AbstractC332980D3o) anonymousClass0951.getValue();
        } else {
            abstractC332980D3o = null;
        }
        if ((abstractC332980D3o instanceof C0D21) && (c0d21 = (C0D21) abstractC332980D3o) != null && (pageData = c0d21.getPageData()) != null && (c0d3v = pageData.skuSelection) != null && (str = c0d3v.selectedVariantId) != null) {
            str2 = str;
        } else {
            PdpViewModel pdpViewModel2 = ((PdpFragment) awS41S0100100_4.l0).LLJ;
            if (pdpViewModel2 != null && (map = pdpViewModel2.LLJ) != null) {
                str2 = map.get("shopify_variant_id");
            }
        }
        C2264991Dl3.LIZ.getClass();
        c1023640ckE.withParam(C2264991Dl3.LJIJJLI, Long.valueOf(awS41S0100100_4.j1));
        c1023640ckE.withParam(C2264991Dl3.LJIJI, "product_detail");
        if (str2 != null) {
            c1023640ckE.withParam(C2264991Dl3.LJIIZILJ, str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS41S0100100_4 awS41S0100100_4, Object obj) {
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, new C291001Au(new Pair(Long.valueOf(awS41S0100100_4.j1), (EnumC1834800xqY) awS41S0100100_4.l0)), null, null, null, null, null, null, null, null, 523263);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0100100_4(long j, EnumC1834800xqY enumC1834800xqY, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = enumC1834800xqY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0100100_4(PdpFragment pdpFragment, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = pdpFragment;
        this.j1 = j;
    }
}
