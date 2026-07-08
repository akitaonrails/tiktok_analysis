package kotlin.jvm.internal;

import X.C09AY;
import X.C0D9U;
import X.C0DBY;
import X.C0DEP;
import X.C1023640ckE;
import X.C13LP;
import X.C1861040yWs;
import X.C1863280yaU;
import X.C1863380yae;
import X.C321970Cjj;
import X.C325910Cq5;
import X.C334410D9b;
import X.C334430D9d;
import X.C334590D9t;
import X.C335000DBi;
import X.C335080DBq;
import X.InterfaceC1858000yRy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.model.UcpContentItem;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.model.UcpProperties;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS32S2100000_4 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS32S2100000_4 awS32S2100000_4, Object obj) {
        String str;
        C1863380yae c1863380yae;
        Message messageLIZ;
        List<InterfaceC1858000yRy> list = ((C1861040yWs) obj).LL.LIZ;
        String str2 = awS32S2100000_4.s0;
        MessageViewModel messageViewModel = (MessageViewModel) awS32S2100000_4.l2;
        String str3 = awS32S2100000_4.s1;
        for (InterfaceC1858000yRy interfaceC1858000yRy : list) {
            Message messageLIZ2 = C321970Cjj.LIZ(interfaceC1858000yRy);
            if (messageLIZ2 != null) {
                str = messageLIZ2.uuid;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, str2) && (c1863380yae = messageViewModel.LLJJJJ) != null && (messageLIZ = C321970Cjj.LIZ(interfaceC1858000yRy)) != null) {
                C1863280yaU c1863280yaU = c1863380yae.LJIILL;
                c1863280yaU.getClass();
                try {
                    c1863280yaU.LJI.LIZ().LJFF(str2, str3, messageLIZ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS32S2100000_4 awS32S2100000_4, Object obj) {
        C335080DBq c335080DBq;
        C334430D9d c334430D9d;
        UcpContentItem ucpContentItem;
        String str;
        String strLJ;
        C334590D9t c334590D9tLJFF;
        String str2;
        String str3;
        Integer numValueOf;
        String str4;
        String str5;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C0DEP.LIZ.getClass();
        c1023640ckE.withParam(C0DEP.LJJI, 1);
        c1023640ckE.withParam(C0DEP.LIZJ, awS32S2100000_4.s0);
        c1023640ckE.withParam(C0DEP.LIZLLL, "one_step_checkout");
        String str6 = awS32S2100000_4.s1;
        if (str6 != null) {
            c1023640ckE.withParam(C0DEP.LJIJI, str6);
        }
        if (Intrinsics.LJFF(awS32S2100000_4.s0, "place_order")) {
            OnestepCheckoutFragment onestepCheckoutFragment = (OnestepCheckoutFragment) awS32S2100000_4.l2;
            C335000DBi c335000DBi = onestepCheckoutFragment.LLJILLL;
            List listSingletonList = null;
            if (c335000DBi != null && (c335080DBq = onestepCheckoutFragment.LLJILJILJ) != null && (c334430D9d = c335080DBq.LIZIZ.LIZ) != null) {
                C334410D9b c334410D9b = (C334410D9b) C13LP.LJJJLL(c334430D9d.products);
                Map<String, String> map = c335000DBi.LIZ;
                if (map != null && (str2 = map.get("shopify_variant_id")) != null) {
                    if (c334410D9b != null) {
                        str3 = c334410D9b.currentPriceText;
                        numValueOf = Integer.valueOf(c334410D9b.quantity);
                        str4 = c334410D9b.title;
                        str5 = c334410D9b.storeName;
                    } else {
                        str3 = null;
                        numValueOf = null;
                        str4 = null;
                        str5 = null;
                    }
                    ucpContentItem = new UcpContentItem(str3, numValueOf, str2, str4, str5);
                } else {
                    ucpContentItem = null;
                }
                C0DBY c0dby = C335000DBi.LIZJ;
                Map<String, String> map2 = c335000DBi.LIZ;
                CheckoutViewModel checkoutViewModel = onestepCheckoutFragment.LLILLL;
                if (checkoutViewModel != null) {
                    CheckoutSession checkoutSession = checkoutViewModel.LLJJIJIIJIL;
                    if (checkoutSession == null || (c334590D9tLJFF = C0D9U.LJFF(checkoutSession)) == null || (str = c334590D9tLJFF.plainText) == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                CheckoutViewModel checkoutViewModel2 = onestepCheckoutFragment.LLILLL;
                if (checkoutViewModel2 != null) {
                    strLJ = C0D9U.LJ(checkoutViewModel2.LLJJIJIIJIL);
                } else {
                    strLJ = null;
                }
                if (ucpContentItem != null) {
                    listSingletonList = Collections.singletonList(ucpContentItem);
                }
                UcpProperties ucpProperties = new UcpProperties(str, strLJ, listSingletonList);
                c0dby.getClass();
                String strLIZ = C0DBY.LIZ(map2, "ac_shop_button_click", ucpProperties);
                if (strLIZ != null) {
                    c1023640ckE.withParam(C0DEP.LJJ, strLIZ);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS32S2100000_4 awS32S2100000_4, Object obj) {
        return new C325910Cq5(((C325910Cq5) obj).LL, (List) awS32S2100000_4.l2, awS32S2100000_4.s0, awS32S2100000_4.s1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S2100000_4(String str, MessageViewModel messageViewModel, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = messageViewModel;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S2100000_4(String str, String str2, OnestepCheckoutFragment onestepCheckoutFragment, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = onestepCheckoutFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS32S2100000_4(List list, List<? extends Aweme> list2, String str, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = list;
        this.s0 = list2;
        this.s1 = str;
    }
}
