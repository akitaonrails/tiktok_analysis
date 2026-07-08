package kotlin.jvm.internal;

import X.AnonymousClass0181;
import X.C04CK;
import X.C09AY;
import X.C108G;
import X.C123100dR;
import X.C1708610uZ1;
import X.C1713560uh0;
import X.C1713570uh1;
import X.C1713600uh4;
import X.C1714060uho;
import X.C1714180ui0;
import X.C1714270ui9;
import X.C1714660uim;
import X.C1739410vMh;
import X.C1745480vWU;
import X.C1748720vbi;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.ARunnableS30S1100000_26;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.verify.PipoVerifyCenterService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class AwS141S1200000_26 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS141S1200000_26 awS141S1200000_26) {
        ((AddressPasteViewHolder) awS141S1200000_26.l1).b6(awS141S1200000_26.s0);
        ((AddressPasteViewHolder) awS141S1200000_26.l1).a6();
        C1745480vWU c1745480vWU = ((AddressPasteViewHolder) awS141S1200000_26.l1).f6().LLJJIJIL;
        HashMap<String, Object> map = ((AddressPasteViewHolder) awS141S1200000_26.l1).f6().LLJJIJIIJIL;
        c1745480vWU.getClass();
        C1745480vWU.LJIILJJIL("yes", map);
        ((Function0) awS141S1200000_26.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS141S1200000_26 awS141S1200000_26) {
        String str = awS141S1200000_26.s0;
        String str2 = null;
        if (C123100dR.LIZ(str) && str != null) {
            Context context = (Context) awS141S1200000_26.l1;
            CashierFragment cashierFragment = (CashierFragment) awS141S1200000_26.l2;
            SmartRouter.buildRoute(context, str).open();
            CashierEnterParams cashierEnterParams = cashierFragment.LLJJJIL;
            if (cashierEnterParams != null) {
                str2 = cashierEnterParams.payRequestId;
            }
            C1708610uZ1.LIZIZ(str2).LJIIL(cashierFragment.getPageName(), "security_and_privacy", Boolean.valueOf(cashierFragment.bS()), C2097608Jq.LJ());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS141S1200000_26 awS141S1200000_26) {
        C1714180ui0 c1714180ui0 = (C1714180ui0) awS141S1200000_26.l1;
        C1713570uh1 c1713570uh1 = c1714180ui0.LIZ;
        if (c1713570uh1 != null) {
            try {
                C1714060uho.LIZJ(c1713570uh1, awS141S1200000_26.s0, c1714180ui0.LIZIZ, (Map) awS141S1200000_26.l2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1713600uh4.LIZIZ(th);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS141S1200000_26 awS141S1200000_26) {
        C1714660uim c1714660uim;
        C1713570uh1 c1713570uh1;
        if (!a0.LJJJIL(((C1714660uim) awS141S1200000_26.l1).LIZIZ) && (c1713570uh1 = (c1714660uim = (C1714660uim) awS141S1200000_26.l1).LIZ) != null) {
            c1713570uh1.LJIIJJI(awS141S1200000_26.s0, c1714660uim.LIZIZ, C1714270ui9.LIZ(), (Map) awS141S1200000_26.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS141S1200000_26 awS141S1200000_26) {
        C1713560uh0 c1713560uh0 = (C1713560uh0) awS141S1200000_26.l1;
        C1713570uh1 c1713570uh1 = c1713560uh0.LIZ;
        if (c1713570uh1 != null) {
            try {
                C1714060uho.LIZJ(c1713570uh1, awS141S1200000_26.s0, c1713560uh0.LIZIZ, (Map) awS141S1200000_26.l2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1713600uh4.LIZIZ(th);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01d8 A[PHI: r5
      0x01d8: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v5 java.lang.String) binds: [B:71:0x01d5, B:61:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS141S1200000_26 r51) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS141S1200000_26.invoke$2(kotlin.jvm.internal.AwS141S1200000_26):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS141S1200000_26 r41) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS141S1200000_26.invoke$3(kotlin.jvm.internal.AwS141S1200000_26):java.lang.Object");
    }

    public static final Object invoke$4(AwS141S1200000_26 awS141S1200000_26) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("diff detail tabId=");
        sbLIZ.append(awS141S1200000_26.s0);
        sbLIZ.append(" baseIds=");
        sbLIZ.append(((HashSet) awS141S1200000_26.l1).size());
        sbLIZ.append(" deltaIds=");
        sbLIZ.append(((List) awS141S1200000_26.l2).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS141S1200000_26 awS141S1200000_26) {
        PipoVerifyCenterService pipoVerifyCenterService = (PipoVerifyCenterService) awS141S1200000_26.l1;
        if (pipoVerifyCenterService.LIZ.contains(awS141S1200000_26.s0)) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS30S1100000_26((Map) awS141S1200000_26.l2, awS141S1200000_26.s0, 3));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS141S1200000_26 awS141S1200000_26) {
        String strLIZ;
        C1739410vMh c1739410vMh = C1739410vMh.LIZ;
        View viewFindViewById = ((View) awS141S1200000_26.l1).findViewById(R.id.p15).findViewById(R.id.p1u);
        String str = ((MessageCenterAssem) awS141S1200000_26.l2).Oo().LLILLJJLI;
        c1739410vMh.getClass();
        if (viewFindViewById != null) {
            C1748720vbi.LIZLLL(viewFindViewById, new C04CK() { // from class: X.0vaf
                @Override // X.AbstractC1748790vbp
                public final C1748850vbv LIZ() {
                    C323580CmK c323580CmK = new C323580CmK(5);
                    c323580CmK.LIZ(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("page_name", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("enter_from", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("previous_page", new C1747940vaS[0]));
                    c323580CmK.LIZIZ(C048U.LIZ);
                    return new C1748850vbv((C1748840vbu[]) c323580CmK.LIZLLL(new C1748840vbu[c323580CmK.LIZJ()]));
                }
            }, new AwS76S1000000_26(str, 21));
        }
        String str2 = awS141S1200000_26.s0;
        View view = (View) awS141S1200000_26.l1;
        if (str2 != null) {
            AnonymousClass0181 anonymousClass0181 = new AnonymousClass0181(str2);
            anonymousClass0181.LJ(3, "previous_page", "seller_message");
            strLIZ = anonymousClass0181.LIZ();
        } else {
            strLIZ = null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_click_time", System.currentTimeMillis());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        SmartRouter.buildRoute(view.getContext(), UriProtector.parse(strLIZ).buildUpon().appendQueryParameter("trackParams", C786410Ut5.J3(jSONObject)).toString()).open();
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110 A[PHI: r2 r4
      0x0110: PHI (r2v15 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem) = 
      (r2v13 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem)
      (r2v16 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem)
     binds: [B:55:0x010e, B:47:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0110: PHI (r4v9 java.lang.String) = (r4v4 java.lang.String), (r4v10 java.lang.String) binds: [B:55:0x010e, B:47:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011e A[PHI: r4
      0x011e: PHI (r4v6 java.lang.String) = (r4v4 java.lang.String), (r4v9 java.lang.String), (r4v9 java.lang.String), (r4v9 java.lang.String) binds: [B:55:0x010e, B:57:0x0112, B:59:0x0116, B:61:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$7(kotlin.jvm.internal.AwS141S1200000_26 r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS141S1200000_26.invoke$7(kotlin.jvm.internal.AwS141S1200000_26):java.lang.Object");
    }

    public static final Object invoke$8(AwS141S1200000_26 awS141S1200000_26) {
        C108G c108g = C108G.LIZ;
        Context context = (Context) awS141S1200000_26.l1;
        String str = awS141S1200000_26.s0;
        Integer num = (Integer) awS141S1200000_26.l2;
        c108g.getClass();
        C108G.LIZ(context, str, num);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e A[PHI: r2 r4
      0x010e: PHI (r2v15 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem) = 
      (r2v13 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem)
      (r2v16 com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem)
     binds: [B:55:0x010c, B:47:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      0x010e: PHI (r4v9 java.lang.String) = (r4v4 java.lang.String), (r4v10 java.lang.String) binds: [B:55:0x010c, B:47:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c A[PHI: r4
      0x011c: PHI (r4v6 java.lang.String) = (r4v4 java.lang.String), (r4v9 java.lang.String), (r4v9 java.lang.String), (r4v9 java.lang.String) binds: [B:55:0x010c, B:57:0x0110, B:59:0x0114, B:61:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$9(kotlin.jvm.internal.AwS141S1200000_26 r13) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS141S1200000_26.invoke$9(kotlin.jvm.internal.AwS141S1200000_26):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS141S1200000_26(X.C1710160ubW r3, com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.GroupInfo r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 2 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r4
            r1.s0 = r5
            r1.l2 = r3
            r0 = 0
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r5
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS141S1200000_26.<init>(X.0ubW, com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.GroupInfo, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS141S1200000_26(C1713560uh0 c1713560uh0, C1713560uh0 c1713560uh02, String str, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l1 = c1713560uh0;
        this.s0 = c1713560uh02;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS141S1200000_26(C1714180ui0 c1714180ui0, C1714180ui0 c1714180ui02, String str, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l1 = c1714180ui0;
        this.s0 = c1714180ui02;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS141S1200000_26(C1714660uim c1714660uim, C1714660uim c1714660uim2, String str, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l1 = c1714660uim;
        this.s0 = c1714660uim2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1200000_26(Context context, String str, Integer num, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
        this.l2 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1200000_26(View view, MessageCenterAssem messageCenterAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = view;
        this.l2 = messageCenterAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS141S1200000_26(AddressPasteViewHolder addressPasteViewHolder, AddressPasteViewHolder addressPasteViewHolder2, String str, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l1 = addressPasteViewHolder;
        this.s0 = addressPasteViewHolder2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1200000_26(SeaPdpViewModel seaPdpViewModel, Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = seaPdpViewModel;
        this.l2 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1200000_26(PdpViewModel pdpViewModel, Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = pdpViewModel;
        this.l2 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS141S1200000_26(PipoVerifyCenterService pipoVerifyCenterService, PipoVerifyCenterService pipoVerifyCenterService2, String str, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l1 = pipoVerifyCenterService;
        this.s0 = pipoVerifyCenterService2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S1200000_26(String str, Context context, CashierFragment cashierFragment, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
        this.l2 = cashierFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS141S1200000_26(String str, String str2, HashSet<String> hashSet, List<VideoDetailRequestParams.Item> list) {
        super(0);
        this.$t = list;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = hashSet;
    }
}
