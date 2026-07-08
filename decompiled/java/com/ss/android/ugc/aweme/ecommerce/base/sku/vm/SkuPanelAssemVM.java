package com.ss.android.ugc.aweme.ecommerce.base.sku.vm;

import X.AnonymousClass0378;
import X.AnonymousClass0431;
import X.AnonymousClass0435;
import X.AnonymousClass0444;
import X.C013C;
import X.C01GW;
import X.C03F0;
import X.C03PI;
import X.C03QL;
import X.C03S8;
import X.C03SE;
import X.C03SY;
import X.C041G;
import X.C043B;
import X.C043C;
import X.C043D;
import X.C043M;
import X.C043O;
import X.C043S;
import X.C043Y;
import X.C044E;
import X.C044L;
import X.C044Q;
import X.C045N;
import X.C046T;
import X.C04AW;
import X.C04F4;
import X.C04FG;
import X.C04FM;
import X.C04FP;
import X.C04FY;
import X.C098200Yq;
import X.C09IR;
import X.C0NL6;
import X.C0PEM;
import X.C1003603wA;
import X.C1018703yb;
import X.C1019103yf;
import X.C1019703yl;
import X.C1025503zh;
import X.C10288040o;
import X.C10296040w;
import X.C10349042x;
import X.C10357043f;
import X.C10363043l;
import X.C10398044u;
import X.C10399044v;
import X.C10492048k;
import X.C10516049i;
import X.C1055604Aw;
import X.C1056304Bd;
import X.C118300cf;
import X.C1326490kch;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C1427600nFm;
import X.C15438062q;
import X.C1697810uHb;
import X.C1700260uLY;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1748800vbq;
import X.C1755400vmU;
import X.C1763700vzs;
import X.C1766860w4y;
import X.C189200o6;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2252331DDr;
import X.C259800zU;
import X.C418440Gaw;
import X.C443120HZe;
import X.C452501pT;
import X.C676720QgY;
import X.C754802x8;
import X.C755502xF;
import X.C756102xL;
import X.C756302xN;
import X.C786410Ut5;
import X.C813203Fq;
import X.C814420VxA;
import X.C814703Gf;
import X.C873003b6;
import X.C919503ib;
import X.C948503nH;
import X.C960603pE;
import X.C968803qY;
import X.C968903qZ;
import X.C987903td;
import X.C996103ux;
import X.C996403v0;
import X.EnumC1014603xw;
import X.EnumC10415045l;
import X.EnumC1756020vnU;
import X.EnumC2252401DDy;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC497601wk;
import X.InterfaceC746802vq;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c1b.m;
import c1b.r0;
import c1b.t0;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.goda.v2.model.dto.GodaV2Feature;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.PreAddCartItemData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpProductMeasurementModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPriceV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecipientInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SKUPanelBottomText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PdpPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.QuantityNoticeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuArchitectureRevampConfig;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartRequestParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.EnterCartParam;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.Sku;
import com.ss.android.ugc.aweme.vision.model.SkuProp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS88S0201000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPanelAssemVM extends AssemViewModel<SkuState> implements C043B<SkuPanelAssemVM> {
    public Image LLILLL;
    public ProductPrice LLILZ;
    public List<ProductPriceV2> LLILZIL;
    public AddToCartButton LLILZLL;
    public SkuPanelState LLIZ;
    public SkuInfo LLJ;
    public SkuPanelStarter.SkuEnterParams LLJI;
    public ProductPackStruct LLJIJIL;
    public JSONObject LLJILJIL;
    public C1055604Aw LLJILJILJ;
    public Boolean LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public final C2252331DDr LLJJIJIL;
    public final C2252331DDr LLJJJ;
    public final C1003603wA LLJJJIL;
    public C03QL LLJJJJ;
    public BillInfoData LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public SkuItem LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public String LLJLIL;
    public Long LLJLILLLLZIIL;
    public String[] LLJLL;
    public InterfaceC420801kM LLJLLIL;
    public C987903td LLJLLL;
    public AnonymousClass0431 LLJZ;
    public C045N LLJZIJLIL;
    public final C1019703yl LLL;
    public final C10288040o LLLF;
    public final C1763700vzs LLLFF;
    public final C043D LLLFFI;
    public final C044Q LLLFZ;
    public Image LLLI;
    public int LLLII;
    public String[] LLLIIII;
    public int LLLIIIIL;
    public PdpProductMeasurementModule LLLIIIL;
    public EnumC1756020vnU LLLIIL;
    public SellingPointGroup LLLIILIL;
    public final C01GW LLLIL;
    public List<? extends InterfaceC746802vq> LLLILZ;
    public boolean LLLILZJ;
    public final boolean LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final CopyOnWriteArrayList<AnonymousClass0444> LLLJ;
    public final Map<String, AnonymousClass0444> LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public boolean LLLLII;
    public final ConcurrentHashMap<String, InsuranceInfo> LLLLIIIILLL;
    public final List<String> LLLLIIL;
    public PaymentInfo LLLLIILL;
    public PaymentInfo LLLLIILLL;
    public final List<Image> LL = new ArrayList();
    public final List<String> LLILLJJLI = new ArrayList();
    public final Map<Integer, Boolean> LLIZLLLIL = new LinkedHashMap();
    public String LLJILLL = "pdp";
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1475));
    public int LLJJIJIIJIL = -1;

    @Override // X.C043B
    public final Map<String, String> Te() {
        return null;
    }

    @Override // X.C043B
    public final List<String> Tm() {
        return null;
    }

    @Override // X.C043B
    public final Map<String, Integer> ci() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0046 A[PHI: r2 r11
      0x0046: PHI (r2v1 java.lang.Float) = (r2v0 java.lang.Float), (r2v11 java.lang.Float) binds: [B:31:0x0043, B:13:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r11v2 java.lang.Integer) = (r11v1 java.lang.Integer), (r11v12 java.lang.Integer) binds: [B:31:0x0043, B:13:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004a A[PHI: r2 r3 r11
      0x004a: PHI (r2v2 java.lang.Float) = (r2v1 java.lang.Float), (r2v10 java.lang.Float) binds: [B:34:0x0047, B:16:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v9 java.lang.String) binds: [B:34:0x0047, B:16:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r11v3 java.lang.Integer) = (r11v2 java.lang.Integer), (r11v11 java.lang.Integer) binds: [B:34:0x0047, B:16:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004e A[PHI: r2 r3 r9 r11
      0x004e: PHI (r2v3 java.lang.Float) = (r2v2 java.lang.Float), (r2v9 java.lang.Float) binds: [B:37:0x004b, B:19:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v8 java.lang.String) binds: [B:37:0x004b, B:19:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r9v1 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText) = 
      (r9v0 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText)
      (r9v7 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText)
     binds: [B:37:0x004b, B:19:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r11v4 java.lang.Integer) = (r11v3 java.lang.Integer), (r11v10 java.lang.Integer) binds: [B:37:0x004b, B:19:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0052 A[PHI: r2 r3 r9 r10 r11
      0x0052: PHI (r2v4 java.lang.Float) = (r2v3 java.lang.Float), (r2v8 java.lang.Float) binds: [B:40:0x004f, B:22:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v7 java.lang.String) binds: [B:40:0x004f, B:22:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r9v2 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText) = 
      (r9v1 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText)
      (r9v6 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText)
     binds: [B:40:0x004f, B:22:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r10v1 com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText) = 
      (r10v0 com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText)
      (r10v5 com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText)
     binds: [B:40:0x004f, B:22:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r11v5 java.lang.Integer) = (r11v4 java.lang.Integer), (r11v9 java.lang.Integer) binds: [B:40:0x004f, B:22:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0056 A[PHI: r2 r3 r9 r10 r11 r12
      0x0056: PHI (r2v5 java.lang.Float) = (r2v4 java.lang.Float), (r2v7 java.lang.Float) binds: [B:43:0x0053, B:25:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v6 java.lang.String) binds: [B:43:0x0053, B:25:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r9v3 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText) = 
      (r9v2 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText)
      (r9v5 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText)
     binds: [B:43:0x0053, B:25:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r10v2 com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText) = 
      (r10v1 com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText)
      (r10v4 com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText)
     binds: [B:43:0x0053, B:25:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r11v6 java.lang.Integer) = (r11v5 java.lang.Integer), (r11v8 java.lang.Integer) binds: [B:43:0x0053, B:25:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r12v1 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage) = 
      (r12v0 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage)
      (r12v3 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage)
     binds: [B:43:0x0053, B:25:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C043B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C10462047g getExtraInfo() {
        /*
            r13 = this;
            r8 = 0
            X.044R r7 = new X.044R
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r1 = r13.LLJIJIL
            if (r1 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview r0 = r1.review
            if (r0 == 0) goto L58
            java.lang.Integer r0 = r0.reviewCount
        Ld:
            r7.<init>(r0)
            if (r1 == 0) goto L41
            java.lang.Integer r11 = r1.bizType
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview r0 = r1.review
            if (r0 == 0) goto L42
            java.lang.Float r2 = r0.rating
        L1a:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview r0 = r1.review
            if (r0 == 0) goto L46
            java.lang.String r3 = r0.reviewCountStr
        L20:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r0 = r1.baseInfo
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText r9 = r0.globalShippingTag
        L26:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r0 = r1.baseInfo
            if (r0 == 0) goto L4e
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r10 = r0.globalShippingTagECRichText
        L2c:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo r0 = r1.sellerInfo
            if (r0 == 0) goto L52
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage r12 = r0.soldItemDescription
        L32:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r0 = r1.baseInfo
            if (r0 == 0) goto L56
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume r4 = r0.combinedSalesVolume
        L38:
            X.047g r1 = new X.047g
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L41:
            r11 = r8
        L42:
            r2 = r8
            if (r1 == 0) goto L46
            goto L1a
        L46:
            r3 = r8
            if (r1 == 0) goto L4a
            goto L20
        L4a:
            r9 = r8
            if (r1 == 0) goto L4e
            goto L26
        L4e:
            r10 = r8
            if (r1 == 0) goto L52
            goto L2c
        L52:
            r12 = r8
            if (r1 == 0) goto L56
            goto L32
        L56:
            r4 = r8
            goto L38
        L58:
            r0 = r8
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM.getExtraInfo():X.047g");
    }

    public final void AQ2() {
        C03F0 c03f0 = new C03F0(this.LLJIJIL);
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass0444 anonymousClass0444 : this.LLLJ) {
            C1326490kch c1326490kch = C1326490kch.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SKUPanelTag | processing: ");
            sbLIZ.append(anonymousClass0444.getClass().getSimpleName());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1326490kch.getClass();
            C1326490kch.LIZ(strLIZIZ);
            List<InterfaceC746802vq> listLIZ = anonymousClass0444.LIZ(this, c03f0);
            for (InterfaceC746802vq interfaceC746802vq : listLIZ) {
                C1326490kch c1326490kch2 = C1326490kch.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SKUPanelTag | adding items to list: ");
                sbLIZ2.append(interfaceC746802vq.getClass().getSimpleName());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c1326490kch2.getClass();
                C1326490kch.LIZ(strLIZIZ2);
            }
            arrayList.addAll(listLIZ);
        }
        vQ2(arrayList);
    }

    @Override // X.C043B
    public final C10399044v Az2() {
        return new C10398044u(this.LLJJJIL).LLILLJJLI;
    }

    public final C1427600nFm BQ2() {
        return (C1427600nFm) this.LLLIL.getValue();
    }

    public final m CQ2() {
        return r0.LIZ ? new t0() : new r0();
    }

    public final C10357043f EQ2() {
        return (C10357043f) this.LLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PhotoSearchEnterParams FQ2() {
        String str;
        ArrayList arrayList;
        ProductBase productBase;
        String str2;
        Object obj;
        C259800zU c259800zU = new C259800zU();
        s60(new C2217381BqS() { // from class: X.043q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((SkuState) obj2).getCurrentImage();
            }
        }, new AwS580S0100000_1(c259800zU, (C259800zU<String>) 327));
        String productId = getProductId();
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJI;
        Map<String, Object> map = skuEnterParams != null ? skuEnterParams.trackParams : null;
        String str3 = (String) c259800zU.element;
        HashMap map2 = new HashMap();
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.LLJI;
        if (skuEnterParams2 != null) {
            String str4 = skuEnterParams2.productId;
            if (str4 != null) {
                map2.put("product_id", str4);
            }
            Map<String, Object> map3 = skuEnterParams2.visitReportParams;
            if (map3 != null && (obj = map3.get("seller_id")) != null) {
                map2.put("seller_id", obj);
            }
        }
        ProductPackStruct productPackStruct = this.LLJIJIL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (str2 = productBase.title) != null) {
            map2.put("product_title", str2);
        }
        SkuItem skuItem = this.LLJJL;
        if (skuItem != null) {
            str = skuItem.skuId;
            List<SkuSaleProp> list = skuItem.skuSalePropList;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (SkuSaleProp skuSaleProp : list) {
                    arrayList.add(new SkuProp(skuSaleProp.propId, skuSaleProp.propName, skuSaleProp.propValueId, skuSaleProp.propValue));
                }
            }
            map2.put("sku", new Sku(str, arrayList));
            C1019703yl c1019703yl = this.LLL;
            c1019703yl.getClass();
            return C676720QgY.LIZ(productId, map, str3, map2, c1019703yl.LJI("c1771.d12219", null), "sku", Boolean.FALSE);
        }
        str = null;
        arrayList = null;
        map2.put("sku", new Sku(str, arrayList));
        C1019703yl c1019703yl2 = this.LLL;
        c1019703yl2.getClass();
        return C676720QgY.LIZ(productId, map, str3, map2, c1019703yl2.LJI("c1771.d12219", null), "sku", Boolean.FALSE);
    }

    public final C10363043l GQ2() {
        return (C10363043l) this.LLLJL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x04c3  */
    @Override // X.C043B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem Gt2() {
        /*
            Method dump skipped, instruction units count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM.Gt2():com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem");
    }

    @Override // X.C043B
    public final InsuranceInfo LD1() {
        return this.LLLLIIIILLL.get(getSkuId());
    }

    @Override // X.C043B
    public final String LN() {
        ProductPackStruct productPackStruct = this.LLJIJIL;
        return (productPackStruct == null || !productPackStruct.LJII()) ? "sku" : "skc";
    }

    public final int LQ2() {
        return C041G.LJIIJ(this.LLIZ, this.LLJJL);
    }

    public final C1700260uLY MQ2() {
        return (C1700260uLY) this.LLLIZZ.getValue();
    }

    @Override // X.InterfaceC10356043e
    public final boolean Nc() {
        Integer num;
        SkuItem skuItem = this.LLJJL;
        return (skuItem == null || (num = skuItem.promotionLimitQuantity) == null || num.intValue() <= 0) ? false : true;
    }

    @Override // X.C043B
    public final void Oy() {
        C04FG c04fg;
        C04FP c04fpLIZ;
        List<C04FM> list;
        String str;
        String str2;
        Object c098200Yq;
        Map<String, Object> map;
        C1326490kch.LIZJ(C1326490kch.LIZ, "SKUPanelTag | generateList()");
        if (!C044E.LIZ()) {
            AQ2();
            return;
        }
        C1055604Aw c1055604Aw = this.LLJILJILJ;
        if (c1055604Aw != null && (c04fg = c1055604Aw.LIZIZ) != null && (c04fpLIZ = c04fg.LIZ()) != null) {
            List<C04FM> list2 = c04fpLIZ.LJIILL;
            int i = 0;
            if (list2 != null && !list2.isEmpty()) {
                C03F0 c03f0 = new C03F0(this.LLJIJIL);
                ArrayList arrayList = new ArrayList();
                C04FP c04fpLIZ2 = c04fg.LIZ();
                if (c04fpLIZ2 != null && (list = c04fpLIZ2.LJIILL) != null) {
                    for (C04FM c04fm : list) {
                        C04FY c04fy = c04fm.LJIILLIIL;
                        String str3 = c04fy != null ? c04fy.LIZIZ : null;
                        if (Intrinsics.LJFF(str3, "GodaV1")) {
                            C04FY c04fy2 = c04fm.LJIILLIIL;
                            if (c04fy2 != null && (str = c04fy2.LIZ) != null) {
                                C1326490kch c1326490kch = C1326490kch.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("SKUPanelTag | goda processing: ");
                                sbLIZ.append(str);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c1326490kch.getClass();
                                C1326490kch.LIZ(strLIZIZ);
                                AnonymousClass0444 anonymousClass0444 = (AnonymousClass0444) ((LinkedHashMap) this.LLLJIL).get(str);
                                if (anonymousClass0444 != null) {
                                    arrayList.addAll(anonymousClass0444.LIZ(this, c03f0));
                                } else {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("SKUPanelTag | processGodaV1Node: module not found for ");
                                    sbLIZ2.append(str);
                                    C1326490kch.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                        } else if (Intrinsics.LJFF(str3, "Lynx")) {
                            C1326490kch c1326490kch2 = C1326490kch.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("SKUPanelTag | lynx processing: ");
                            sbLIZ3.append(c04fm.LJIIIZ);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                            c1326490kch2.getClass();
                            C1326490kch.LIZ(strLIZIZ2);
                            C04FY c04fy3 = c04fm.LJIILLIIL;
                            if (c04fy3 == null || (str2 = c04fy3.LIZJ) == null) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("SKUPanelTag | lynx skipped, missing schema: ");
                                sbLIZ4.append(c04fm.LJIIIZ);
                                C1326490kch.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                            } else {
                                GodaV2Feature godaV2Feature = c04fm.LJIIZILJ;
                                Object obj = (godaV2Feature == null || (map = godaV2Feature.customConfig) == null) ? null : map.get("dynamic_container_identifier");
                                String str4 = obj instanceof String ? (String) obj : null;
                                n nVar = c04fm.LJIILIIL;
                                String string = nVar != null ? nVar.toString() : null;
                                SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJI;
                                Map<String, Object> map2 = skuEnterParams != null ? skuEnterParams.trackParams : null;
                                if (string != null && !a0.LJJJIL(string) && map2 != null && !map2.isEmpty()) {
                                    try {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                                        linkedHashMap.put("page_name", "sku");
                                        JSONObject jSONObject = new JSONObject();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            jSONObject.put((String) entry.getKey(), entry.getValue());
                                        }
                                        JSONObject jSONObject2 = new JSONObject(string);
                                        jSONObject2.put("track_params", jSONObject);
                                        c098200Yq = C786410Ut5.J3(jSONObject2);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    }
                                    Object obj2 = string;
                                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                        obj2 = c098200Yq;
                                    }
                                    string = (String) obj2;
                                }
                                if (str4 == null) {
                                    str4 = "";
                                }
                                C1755400vmU c1755400vmU = new C1755400vmU(str2, string, str4, i, null, false ? 1 : 0, 56);
                                c1755400vmU.LLIZLLLIL = c04fm.LJIIIZ;
                                arrayList.add(c1755400vmU);
                            }
                        } else {
                            C1326490kch c1326490kch3 = C1326490kch.LIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("SKUPanelTag | goda processing error, unsupported containerInfo.type: ");
                            C04FY c04fy4 = c04fm.LJIILLIIL;
                            sbLIZ5.append(c04fy4 != null ? c04fy4.LIZIZ : null);
                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
                            c1326490kch3.getClass();
                            C1326490kch.LIZ(strLIZIZ3);
                        }
                    }
                }
                if (Intrinsics.LJFF(((SkuState) this.vmDispatcher.getState()).getKeyBoardVisibility(), Boolean.TRUE)) {
                    Zf2();
                    arrayList.add(new C754802x8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)))));
                } else {
                    arrayList.add(new C754802x8(0));
                }
                vQ2(arrayList);
                return;
            }
        }
        C1326490kch.LIZ("SKUPanelTag | generateList() fallback to legacy: goda page info missing/empty");
        AQ2();
        C1019103yf.LIZ(EnumC1014603xw.ERR_GODA_30004, null, null);
    }

    public final boolean PQ2() {
        SkcInfo skcInfo;
        List<Skc> list;
        ProductPackStruct productPackStruct = this.LLJIJIL;
        if (productPackStruct == null || (skcInfo = productPackStruct.skcInfo) == null || (list = skcInfo.skcList) == null) {
            return false;
        }
        Iterator<Skc> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().productLinkProperties != null) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C043B
    public final C996103ux Xo1() {
        C1003603wA c1003603wA = this.LLJJJIL;
        SkuItem skuItem = this.LLJJL;
        String str = skuItem != null ? skuItem.skuId : null;
        String strRH2 = RH2();
        Integer numValueOf = Integer.valueOf(hf());
        C996403v0 c996403v0 = C043B.LJJ;
        SkuPanelState skuPanelState = this.LLIZ;
        ProductPackStruct productPackStruct = this.LLJIJIL;
        c996403v0.getClass();
        Integer numValueOf2 = Integer.valueOf(C996403v0.LIZ(productPackStruct, skuPanelState));
        c1003603wA.getClass();
        return c1003603wA.LIZ(C968803qY.LIZ(numValueOf, numValueOf2, str, strRH2));
    }

    public final void YQ2() {
        LJJJZ(new AwS580S0100000_1(this, (C043B<ViewModel>) 318));
    }

    @Override // X.C043B
    public final C046T Zf2() {
        return new C046T(this.LLJI);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new SkuState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 4194303, null);
    }

    @Override // X.C043B
    public final void dispose() {
        InterfaceC420801kM interfaceC420801kM = this.LLJLLIL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLJLLIL = null;
    }

    @Override // X.C043B
    public final int hf() {
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = 1;
        ml(new AwS580S0100000_1(c118300cf, 325));
        return c118300cf.element;
    }

    @Override // X.C043B
    public final int jR1() {
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJI;
        if (Intrinsics.LJFF(skuEnterParams != null ? skuEnterParams.enterFrom : null, "ai_try_on")) {
            return 44;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.LLJI;
        return Intrinsics.LJFF(skuEnterParams2 != null ? skuEnterParams2.enterFrom : null, "product_detail") ? 25 : 0;
    }

    @Override // X.C043B
    public final boolean v30() {
        String str;
        PdpBottomArea pdpBottomArea;
        SkuItem skuItem = this.LLJJL;
        if (skuItem == null || (str = skuItem.bottomAreaId) == null) {
            ProductPackStruct productPackStruct = this.LLJIJIL;
            str = (productPackStruct == null || (pdpBottomArea = productPackStruct.bottomArea) == null) ? null : pdpBottomArea.defaultAreaId;
        }
        return u.LJIJI(str, "pre_release_order", false);
    }

    public final void xQ2() {
        LJJJZ(AFwS228S0000000_1.get$arr$(373));
    }

    @Override // X.InterfaceC836103Ol
    public final PaymentMethodsData Bu0() {
        BillInfoData billInfoData;
        C03QL c03qlSA0 = sA0();
        if (c03qlSA0 == null || (billInfoData = c03qlSA0.LLJJJJLIIL) == null) {
            return null;
        }
        return billInfoData.paymentMethods;
    }

    public final EnterCartParam DQ2() {
        EnterCartParam enterCartParamLIZLLL;
        AnonymousClass0431 anonymousClass0431Jt = Jt();
        if (anonymousClass0431Jt != null) {
            enterCartParamLIZLLL = anonymousClass0431Jt.LIZLLL();
            if (enterCartParamLIZLLL == null) {
            }
            return enterCartParamLIZLLL;
        }
        enterCartParamLIZLLL = null;
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ = LLIIIJ();
        if (Intrinsics.LJFF(skuEnterParamsLLIIIJ != null ? skuEnterParamsLLIIIJ.enterFrom : null, "ai_try_on")) {
            SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ2 = LLIIIJ();
            return new EnterCartParam(skuEnterParamsLLIIIJ2 != null ? skuEnterParamsLLIIIJ2.trackParams : null);
        }
        return enterCartParamLIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.service.vo.Image KQ2() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM.KQ2():com.ss.android.ugc.aweme.ecommerce.service.vo.Image");
    }

    @Override // X.C043B
    public final OneClickPayContext QI() {
        OneClickPayContext oneClickPayContext;
        C03QL c03qlSA0 = sA0();
        if (c03qlSA0 != null && (oneClickPayContext = c03qlSA0.LLILLL) != null) {
            return oneClickPayContext;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ = LLIIIJ();
        if (skuEnterParamsLLIIIJ != null) {
            return skuEnterParamsLLIIIJ.ocpContext;
        }
        return null;
    }

    public final boolean QQ2() {
        List<SaleProp> list;
        ArrayList arrayList;
        ProductPackStruct productPackStructDh = Dh();
        if (productPackStructDh == null || (list = productPackStructDh.saleProps) == null) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SaleProp> it2 = list.iterator();
        while (it2.hasNext()) {
            List<SalePropValue> list2 = it2.next().salePropValueList;
            if (list2 != null) {
                arrayList = new ArrayList();
                for (SalePropValue salePropValue : list2) {
                    if (salePropValue.salePropTag != null) {
                        arrayList.add(salePropValue);
                    }
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(Boolean.valueOf(C756302xN.LIZ(arrayList)));
        }
        return arrayList2.contains(Boolean.TRUE);
    }

    @Override // X.C043B
    public final String RH2() {
        String strFd = fd();
        if (strFd != null) {
            return strFd;
        }
        ProductPackStruct productPackStructDh = Dh();
        if (productPackStructDh != null) {
            return productPackStructDh.defaultAddressId;
        }
        return null;
    }

    @Override // X.C043B
    public final Map<String, Object> Zt() {
        String str;
        C996103ux c996103uxXo1 = Xo1();
        if (c996103uxXo1 == null || (str = c996103uxXo1.LJII) == null) {
            return null;
        }
        return C1741890vQh.LJIIJ(str);
    }

    @Override // X.C043B
    public final int bw1() {
        ProductPackStruct productPackStructDh;
        SKUPanelBottomText sKUPanelBottomText;
        Integer num;
        ProductPackStruct productPackStructDh2 = Dh();
        return ((productPackStructDh2 != null ? productPackStructDh2.skuPanelBottomText : null) == null || (productPackStructDh = Dh()) == null || (sKUPanelBottomText = productPackStructDh.skuPanelBottomText) == null || (num = sKUPanelBottomText.materialType) == null || num.intValue() != 11) ? 0 : 1;
    }

    @Override // X.InterfaceC10356043e
    public final boolean ct() {
        Integer num;
        SkuItem skuItemLLZILL = LLZILL();
        return (skuItemLLZILL == null || (num = skuItemLLZILL.minBuyQuantity) == null || num.intValue() <= 1) ? false : true;
    }

    public final String getProductId() {
        String str;
        String str2;
        SkuPanelState skuPanelStateDw = dw();
        if (skuPanelStateDw != null && (str2 = skuPanelStateDw.productId) != null) {
            return str2;
        }
        ProductPackStruct productPackStructDh = Dh();
        return (productPackStructDh == null || (str = productPackStructDh.productId) == null) ? "" : str;
    }

    @Override // X.C043B
    public final String getSkuId() {
        String str;
        SkuPanelState skuPanelStateDw = dw();
        return (skuPanelStateDw == null || (str = skuPanelStateDw.skuId) == null) ? "" : str;
    }

    @Override // X.C043B
    public final boolean kW() {
        SkuPanelState skuPanelStateDw = dw();
        if (skuPanelStateDw == null) {
            return false;
        }
        Integer num = skuPanelStateDw.purchaseMethod;
        return num != null && num.intValue() == EnumC10415045l.SUBSCRIBE.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        dispose();
        AnonymousClass0378.LIZ().LIZJ("ec_send_sku_params_v2", this);
        AnonymousClass0378.LIZ().LIZJ("ec_send_sku_params", this);
        AnonymousClass0378.LIZ().LIZJ("ec_sku_panel_keyboard_show", this);
        AnonymousClass0378.LIZ().LIZJ("ec_voucher_confirm", this);
        AnonymousClass0378.LIZ().LIZJ("ec_close_sku_panel_opt", this);
        AnonymousClass0378.LIZ().LIZJ("ec_localized_size_changed", this);
        AnonymousClass0378.LIZ().LIZJ("ec_change_selection_insurance", this);
        AnonymousClass0378.LIZ().LIZJ("ec_recipient_data_update", this);
        this.LLJJJIL.LIZ.clear();
        C03QL c03ql = this.LLJJJJ;
        if (c03ql != null) {
            c03ql.LLIZLLLIL.LIZ();
            c03ql.LJIILIIL();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        AnonymousClass0378.LIZ().LIZLLL("ec_send_sku_params_v2", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_send_sku_params", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_sku_panel_keyboard_show", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_voucher_confirm", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_close_sku_panel_opt", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_localized_size_changed", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_change_selection_insurance", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_recipient_data_update", this);
    }

    @Override // X.C043B
    public final String t9() {
        SkuItem skuItemLLZILL = LLZILL();
        if (skuItemLLZILL != null) {
            return skuItemLLZILL.daInfo;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashSet, java.util.LinkedHashSet] */
    public final String yQ2() {
        ?? LLIIJI;
        SkuPanelState skuPanelStateDw = dw();
        String[] strArr = skuPanelStateDw != null ? skuPanelStateDw.checkedSkuIds : null;
        SkuInfo skuInfoLLLLZ = LLLLZ();
        List<SaleProp> list = skuInfoLLLLZ != null ? skuInfoLLLLZ.salePropList : null;
        List listLJJLL = strArr != null ? C13LQ.LJJLL(strArr) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (listLJJLL == null || listLJJLL.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<SaleProp> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().propName;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            LLIIJI = C13LP.LLIIJI(arrayList);
            if (LLIIJI == 0) {
                return null;
            }
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LLIIJI = new LinkedHashSet();
            if (list != null) {
                for (SaleProp saleProp : list) {
                    String str2 = saleProp.propName;
                    if (str2 != null) {
                        LLIIJI.add(str2);
                    }
                    List<SalePropValue> list2 = saleProp.salePropValueList;
                    if (list2 != null) {
                        Iterator<SalePropValue> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            String str3 = it3.next().propValueId;
                            if (str3 != null) {
                                linkedHashMap.put(str3, saleProp.propName);
                            }
                        }
                    }
                }
            }
            if (listLJJLL != null) {
                Iterator it4 = listLJJLL.iterator();
                while (it4.hasNext()) {
                    Object obj = linkedHashMap.get(it4.next());
                    if (obj != null) {
                        LLIIJI.remove(obj);
                    }
                }
            }
        }
        return (String) C13LP.LJJJLIIL(LLIIJI);
    }

    @Override // X.C043B
    public final int Bn() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C043B
    public final ProductPackStruct Dh() {
        return this.LLJIJIL;
    }

    @Override // X.C043B
    public final C1055604Aw Dr0() {
        return this.LLJILJILJ;
    }

    @Override // X.C043B
    public final String EE() {
        return this.LLJILLL;
    }

    @Override // X.C043B
    public final AnonymousClass0431 Jt() {
        return this.LLJZ;
    }

    @Override // X.C043B, X.InterfaceC10356043e
    public final SkuPanelStarter.SkuEnterParams LLIIIJ() {
        return this.LLJI;
    }

    @Override // X.C043B, X.InterfaceC10356043e
    public final SkuInfo LLLLZ() {
        return this.LLJ;
    }

    @Override // X.C043B, X.InterfaceC10356043e
    public final SkuItem LLZILL() {
        return this.LLJJL;
    }

    @Override // X.C043B
    public final List<Image> P6() {
        return this.LL;
    }

    @Override // X.C043B
    public final C2252331DDr Qv() {
        return this.LLJJJ;
    }

    @Override // X.C043B
    public final Long Tz2() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC10356043e
    public final int Wt() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C043B
    public final PaymentInfo aY1() {
        return this.LLLLIILLL;
    }

    @Override // X.C043B
    public final Image bi() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC10356043e
    public final int c9() {
        return this.LLJL;
    }

    @Override // X.C043B
    public final SkuPanelState dw() {
        return this.LLIZ;
    }

    @Override // X.C043B
    public final String fd() {
        return this.LLJJIJI;
    }

    @Override // X.C043B
    public final C045N gp() {
        return this.LLJZIJLIL;
    }

    @Override // X.C043B
    public final List<String> jp() {
        return this.LLILLJJLI;
    }

    @Override // X.C043B, X.InterfaceC836103Ol
    public final PaymentInfo np() {
        return this.LLLLIILL;
    }

    @Override // X.C043B
    public final AddToCartButton nq() {
        return this.LLILZLL;
    }

    @Override // X.C043B
    public final C03QL sA0() {
        return this.LLJJJJ;
    }

    @Override // X.C043B
    public final String[] st() {
        return this.LLLIIII;
    }

    @Override // X.C043B
    public final List<ProductPriceV2> v00() {
        return this.LLILZIL;
    }

    @Override // X.C043B
    public final Boolean vp() {
        return this.LLJJI;
    }

    @Override // X.C043B
    public final C987903td w0() {
        return this.LLJLLL;
    }

    @Override // X.C043B
    public final C044Q wE0() {
        return this.LLLFZ;
    }

    @Override // X.C043B
    public final C043D xO1() {
        return this.LLLFFI;
    }

    @Override // X.C043B
    public final C1019703yl ye() {
        return this.LLL;
    }

    @Override // X.C043B
    public final int yk() {
        return this.LLLIIIIL;
    }

    @Override // X.C043B
    public final String zE0() {
        return this.LLJJIII;
    }

    public SkuPanelAssemVM(C1019703yl c1019703yl) {
        Integer num;
        String str;
        EnumC2252401DDy enumC2252401DDy = EnumC2252401DDy.DROP_LATEST;
        this.LLJJIJIL = C09IR.LIZIZ(0, 1, enumC2252401DDy, 1);
        this.LLJJJ = C09IR.LIZIZ(0, 1, enumC2252401DDy, 1);
        this.LLJJJIL = new C1003603wA();
        this.LLJJLIIIJLLLLLLLZ = 1;
        this.LLJL = 1;
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJI;
        if (skuEnterParams != null) {
            num = skuEnterParams.bizType;
        } else {
            num = null;
        }
        C987903td c987903tdLIZ = C043S.LIZ(num);
        this.LLJLLL = c987903tdLIZ;
        this.LLL = c1019703yl;
        this.LLLF = new C10288040o(c1019703yl);
        this.LLLFF = new C1763700vzs(this);
        this.LLLFFI = new C043D();
        C044Q c044q = (C044Q) C1025503zh.LIZ(C044Q.class, new BizIdentity("", c987903tdLIZ.LIZ, c987903tdLIZ.LIZIZ), this);
        this.LLLFZ = c044q == null ? new C813203Fq() : c044q;
        this.LLLIIL = EnumC1756020vnU.NOCACHE;
        this.LLLIL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(127));
        this.LLLILZ = C13BV.INSTANCE;
        this.LLLILZLLLI = true;
        this.LLLIZZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(128));
        this.LLLJ = new CopyOnWriteArrayList<>();
        this.LLLJIL = new LinkedHashMap();
        this.LLLJL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1477));
        this.LLLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1476));
        this.LLLLIIIILLL = new ConcurrentHashMap<>();
        String[] strArr = new String[11];
        strArr[0] = "sku_panel_hero_style_1";
        if (Intrinsics.LJFF(EcomSkuArchitectureRevampConfig.LIZ().enableSpecSecRefactor, Boolean.TRUE)) {
            str = "sku_panel_selection_style_1";
        } else {
            str = "sku_panel_selection_legacy_style_1";
        }
        strArr[1] = str;
        strArr[2] = "sku_panel_size_rec_style_1";
        strArr[3] = "sku_panel_product_linkage_style_1";
        strArr[4] = "sku_panel_quantity_selector_style_1";
        strArr[5] = "sku_panel_recipient_info_style_1";
        strArr[6] = "sku_panel_purchase_method_style_1";
        strArr[7] = "sku_panel_product_insurance_style_1";
        strArr[8] = "sku_panel_product_description_style_1";
        strArr[9] = "sku_panel_one_click_pay_style_1";
        strArr[10] = "sku_footer";
        this.LLLLIIL = C1697810uHb.LJIIJJI(strArr);
    }

    @Override // X.C043B
    public final void A22(OneClickPayContext oneClickPayContext) {
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ;
        if (oneClickPayContext != null && (skuEnterParamsLLIIIJ = LLIIIJ()) != null) {
            skuEnterParamsLLIIIJ.setOcpContext(oneClickPayContext);
        }
    }

    @Override // X.C043B
    public final void BX(boolean z) {
        this.LLJJJJLIIL = z;
    }

    @Override // X.C043B
    public final void C01(PaymentInfo paymentInfo) {
        PaymentMethodsData paymentMethodsData;
        BillInfoData billInfoData;
        BillInfoData billInfoData2;
        this.LLLLIILL = paymentInfo;
        C03SE c03se = C03PI.LJIJI;
        C03QL c03ql = this.LLJJJJ;
        C755502xF c755502xFLIZ = null;
        if (c03ql != null && (billInfoData2 = c03ql.LLJJJJLIIL) != null) {
            paymentMethodsData = billInfoData2.paymentMethods;
        } else {
            paymentMethodsData = null;
        }
        c03se.getClass();
        C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfo, paymentMethodsData, true, true);
        boolean zBooleanValue = ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue();
        String str = (String) c443120HZeLJJJIL.getSecond();
        List list = (List) c443120HZeLJJJIL.getThird();
        C03QL c03ql2 = this.LLJJJJ;
        if (c03ql2 != null && (billInfoData = c03ql2.LLJJJJLIIL) != null) {
            c755502xFLIZ = C756102xL.LIZ(billInfoData, str, zBooleanValue, list, null, null, false, 56);
        }
        setStateImmediate(new AwS367S0200000_1(paymentInfo, c755502xFLIZ, 143));
    }

    @Override // X.C043B
    public final void Cn(Function1<? super SkuState, Unit> function1) {
        withState(function1);
    }

    @Override // X.C043B
    public final void ER1(SkuPanelStarter.SkuEnterParams skuEnterParams) {
        this.LLJI = skuEnterParams;
    }

    @Override // X.C043B
    public final void Ee(String str) {
        this.LLJJIII = str;
    }

    @Override // X.C043B
    public final void Fk(boolean z) {
        LJJJZ(new AwS16S0010000_1(z, 12));
    }

    @Override // X.C043B
    public final void Gr2(C987903td c987903td) {
        this.LLJLLL = c987903td;
    }

    public final PromotionView HQ2(SkuItem skuItem) {
        boolean zLJFF;
        SkuCommonConfig skuCommonConfig;
        Map<String, PdpPromotion> map;
        List<String> list;
        List<PromotionItem> list2;
        ProductPackStruct productPackStructDh = Dh();
        if (productPackStructDh != null) {
            zLJFF = Intrinsics.LJFF(productPackStructDh.promotionReform, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (!zLJFF) {
            if (skuItem == null) {
                return null;
            }
            return skuItem.promotionView;
        }
        ProductPackStruct productPackStructDh2 = Dh();
        if (productPackStructDh2 == null || (skuCommonConfig = productPackStructDh2.skuCommonConfig) == null || (map = skuCommonConfig.pdpPromotionItems) == null || map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (skuItem != null && (list = skuItem.promotionKeyList) != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                PdpPromotion pdpPromotion = map.get(it2.next());
                if (pdpPromotion != null && (list2 = pdpPromotion.promotionItems) != null) {
                    arrayList.addAll(list2);
                }
            }
        }
        return new PromotionView(arrayList, null);
    }

    public final PromotionView IQ2(List<String> list) {
        SkuCommonConfig skuCommonConfig;
        Map<String, PdpPromotion> map;
        List<PromotionItem> list2;
        ProductPackStruct productPackStructDh = Dh();
        if (productPackStructDh == null || (skuCommonConfig = productPackStructDh.skuCommonConfig) == null || (map = skuCommonConfig.pdpPromotionItems) == null || map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                PdpPromotion pdpPromotion = map.get(it2.next());
                if (pdpPromotion != null && (list2 = pdpPromotion.promotionItems) != null) {
                    arrayList.addAll(list2);
                }
            }
        }
        return new PromotionView(arrayList, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.QuantityNoticeInfo> JQ2(android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM.JQ2(android.view.View):java.util.Map");
    }

    @Override // X.C043B
    public final void Kp(ProductPrice productPrice) {
        this.LLILZ = productPrice;
    }

    @Override // X.C043B
    public final void LJJJZ(Function1<? super SkuState, SkuState> function1) {
        setStateImmediate(function1);
    }

    @Override // X.C043B
    public final void Lp(SkuInfo skuInfo) {
        this.LLJ = skuInfo;
    }

    @Override // X.C043B
    public final void Mm(SkuPanelState skuPanelState) {
        this.LLIZ = skuPanelState;
    }

    public final void NQ2(int i) {
        RecipientInfo recipientInfo;
        String nodeId;
        C043D c043d = this.LLLFFI;
        if (c043d != null && (recipientInfo = c043d.LIZ) != null && (nodeId = recipientInfo.getNodeId()) != null) {
            setStateImmediate(new AwS52S1000000_1(nodeId, 20));
            IEventCenter iEventCenterLIZ = AnonymousClass0378.LIZ();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("button_type", i);
            iEventCenterLIZ.LIZ("ec_sku_cta_click", C786410Ut5.J3(jSONObject));
        }
    }

    @Override // X.C043B
    public final void OG(boolean z) {
        setState(new AwS16S0010000_1(z, 11));
    }

    @Override // X.C043B
    public final boolean Pp(Map<String, String> map) {
        int size;
        SkuInfo skuInfo;
        List<SkuItem> list;
        List<SkuItem> list2;
        C013C c013c = new C013C();
        SkuInfo skuInfo2 = this.LLJ;
        if (skuInfo2 != null && (list2 = skuInfo2.skuList) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        HashMap map2 = (HashMap) map;
        map2.put("content_list_size", String.valueOf(size));
        ml(new AwS367S0200000_1(c013c, (C013C) map, (Map<String, String>) 142));
        if (this.LLJIJIL != null && (skuInfo = this.LLJ) != null && (list = skuInfo.skuList) != null && !list.isEmpty()) {
            return c013c.element;
        }
        map2.put("blank_type", "no_meta_data");
        return true;
    }

    @Override // X.C043B
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1(this, (C043B<ViewModel>) 323));
    }

    @Override // X.C043B
    public final void Ql(String[] strArr) {
        this.LLLIIII = strArr;
    }

    public final void RQ2(boolean z) {
        boolean z2;
        boolean zBooleanValue;
        Object objLJJJLL;
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJI;
        if (skuEnterParams != null) {
            SkuPanelStarter.LIZ.getClass();
            Long l = SkuPanelStarter.LIZJ;
            if (l != null) {
                long jLongValue = l.longValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap map = new HashMap();
                Map<String, Object> map2 = skuEnterParams.orderRequestParams;
                if (map2 != null) {
                    map.putAll(map2);
                }
                Map<String, Object> map3 = skuEnterParams.visitReportParams;
                if (map3 != null) {
                    map.putAll(map3);
                }
                Map<String, Object> map4 = skuEnterParams.trackParams;
                if (map4 != null) {
                    map.putAll(map4);
                }
                String str = skuEnterParams.pipeParams;
                if (str != null) {
                    map.put("pdp_pipe_params", str);
                }
                int iIntValue = 0;
                if (this.LLJJ.getValue() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!skuEnterParams.needRequest) {
                    map.put("hit_cache", 2);
                } else if (z2) {
                    map.put("hit_cache", 1);
                } else {
                    map.put("hit_cache", 0);
                }
                map.put("image_count", Integer.valueOf(((ArrayList) this.LL).size()));
                map.put("is_success", Integer.valueOf(z ? 1 : 0));
                List<Image> list = this.LL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    List<String> thumbUrls = ((Image) it2.next()).getThumbUrls();
                    if (thumbUrls != null) {
                        objLJJJLL = C13LP.LJJJLL(thumbUrls);
                    } else {
                        objLJJJLL = null;
                    }
                    arrayList.add(objLJJJLL);
                }
                map.put("image_urls", arrayList);
                Boolean bool = skuEnterParams.pdpFullScreen;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                long j = jCurrentTimeMillis - jLongValue;
                Integer num = skuEnterParams.productQuantity;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                new C10492048k(zBooleanValue, j, iIntValue).LIZJ(map);
            }
        }
    }

    @Override // X.C043B
    public final void SG2(SellingPointGroup sellingPointGroup) {
        this.LLLIILIL = sellingPointGroup;
    }

    public final void SQ2(BaseSkuFragment<?> baseSkuFragment) {
        ProductBase productBase;
        SizeGuide sizeGuide;
        String strLJ;
        ProductBase productBase2;
        Map<String, Object> map;
        ProductPackStruct productPackStruct = this.LLJIJIL;
        SizeGuide sizeGuide2 = null;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (sizeGuide = productBase.sizeGuide) != null) {
            String str = sizeGuide.skuSizeGuideSchema;
            if (str != null && str.length() != 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJI;
                if (skuEnterParams != null && (map = skuEnterParams.trackParams) != null) {
                    linkedHashMap.putAll(map);
                }
                if (baseSkuFragment != null) {
                    for (Map.Entry<String, Object> entry : C1748800vbq.LIZ(baseSkuFragment).entrySet()) {
                        Object value = entry.getValue();
                        if (value != null) {
                            linkedHashMap.put(entry.getKey(), value);
                        }
                    }
                }
                linkedHashMap.put("previous_page", "sku");
                if (baseSkuFragment != null) {
                    Context context = baseSkuFragment.getContext();
                    if (context != null) {
                        C919503ib.LIZIZ(context, sizeGuide.skuSizeGuideSchema, C2097908Jt.LIZJ(new Pair("track_params", linkedHashMap)), false).open();
                    }
                } else {
                    return;
                }
            } else {
                if (baseSkuFragment == null || (strLJ = C960603pE.LJ(baseSkuFragment)) == null) {
                    strLJ = "";
                    if (baseSkuFragment == null) {
                        return;
                    }
                }
                FragmentManager fragmentManager = baseSkuFragment.getFragmentManager();
                if (fragmentManager != null) {
                    ProductPackStruct productPackStruct2 = this.LLJIJIL;
                    if (productPackStruct2 != null && (productBase2 = productPackStruct2.baseInfo) != null) {
                        sizeGuide2 = productBase2.sizeGuide;
                    }
                    C814703Gf.LIZ(fragmentManager, strLJ, sizeGuide2);
                }
            }
            C1748720vbi.LIZIZ(baseSkuFragment, new C10516049i(), new AwS580S0100000_1(this, (C043B<ViewModel>) 319));
        }
    }

    @Override // X.C043B
    public final void TE0(Map<Integer, QuantityNoticeInfo> map) {
        LJJJZ(new AwS580S0100000_1(map, (Map<Integer, String>) 316));
    }

    @Override // X.C043B
    public final void U50(JSONObject jSONObject) {
        this.LLJILJIL = jSONObject;
    }

    @Override // X.C043B
    public final void U9(String str) {
        this.LLJJIJI = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UQ2(java.lang.String r23) {
        /*
            r22 = this;
            java.lang.String r0 = "add_to_cart"
            r7 = r23
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            r1 = 0
            r3 = r22
            if (r0 == 0) goto La7
            X.03yl r0 = r3.LLL
            r0.getClass()
            java.lang.String r2 = "c1771.d9394"
        L14:
            X.03yl r0 = r3.LLL
            java.util.Map r17 = r0.LJ(r2)
        L1a:
            X.040w r6 = X.C10296040w.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r3.LLJI
            if (r0 == 0) goto La5
            int r0 = r0.clickFrom
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L26:
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r3.LLJI
            if (r0 == 0) goto La3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.trackParams
        L2c:
            java.lang.String r9 = X.C041D.LIZ(r2, r0)
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r0 = r3.LLIZ
            if (r0 == 0) goto La1
            java.lang.String r10 = r0.skuId
        L36:
            java.lang.Boolean r2 = r3.LLJJI
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            X.03ze r4 = X.C1025203ze.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r3.LLJI
            if (r0 == 0) goto L9f
            int r0 = r0.clickFrom
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L4a:
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r3.LLJI
            if (r0 == 0) goto L9d
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.trackParams
        L50:
            r4.getClass()
            java.lang.String r12 = X.C1025203ze.LIZ(r2, r0)
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r3.LLJI
            if (r0 == 0) goto L9b
            java.lang.String r14 = r0.enterFrom
        L5d:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r2 = r3.LLIZ
            if (r2 == 0) goto L99
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo r0 = r3.LLJ
            if (r0 == 0) goto L97
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem> r0 = r0.skuList
        L67:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r0 = r2.LIZLLL(r0)
            if (r0 == 0) goto L99
            X.03W0 r15 = X.C954903oJ.LIZ(r0)
        L71:
            java.lang.String r16 = r3.LN()
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r3.LLJI
            if (r0 == 0) goto L95
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.trackParams
        L7b:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r0 = r3.LLJJL
            if (r0 == 0) goto L81
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply r1 = r0.skuSupply
        L81:
            r8 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            java.lang.String r13 = "sku"
            r21 = 99586(0x18502, float:1.3955E-40)
            r18 = r2
            r19 = r1
            r20 = r8
            X.C10296040w.LIZJ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L95:
            r2 = r1
            goto L7b
        L97:
            r0 = r1
            goto L67
        L99:
            r15 = r1
            goto L71
        L9b:
            r14 = r1
            goto L5d
        L9d:
            r0 = r1
            goto L50
        L9f:
            r2 = r1
            goto L4a
        La1:
            r10 = r1
            goto L36
        La3:
            r0 = r1
            goto L2c
        La5:
            r2 = r1
            goto L26
        La7:
            java.lang.String r0 = "buy_now"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto Lb8
            X.03yl r0 = r3.LLL
            r0.getClass()
            java.lang.String r2 = "c1771.d3669"
            goto L14
        Lb8:
            r17 = r1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM.UQ2(java.lang.String):void");
    }

    public final void VQ2(String str) {
        C10296040w.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10296040w.LIZIZ);
        linkedHashMap.put("toast_name", str);
        C1018703yb.LIZIZ("tiktokec_toast_show", linkedHashMap);
    }

    @Override // X.C043B
    public final void Vj(AddToCartButton addToCartButton) {
        this.LLILZLL = addToCartButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2 A[PHI: r1
      0x00e2: PHI (r1v12 java.util.List<com.ss.android.ugc.aweme.ecommerce.service.vo.Image>) = 
      (r1v10 java.util.List<com.ss.android.ugc.aweme.ecommerce.service.vo.Image>)
      (r1v13 java.util.List<com.ss.android.ugc.aweme.ecommerce.service.vo.Image>)
     binds: [B:79:0x00e0, B:62:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WQ2(java.lang.String[] r11) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM.WQ2(java.lang.String[]):void");
    }

    public final void XQ2(CouponClaimedEvent couponClaimedEvent) {
        setStateImmediate(new AwS580S0100000_1(couponClaimedEvent, 328));
    }

    @Override // X.C043B
    public final void ZH2(List<ProductPriceV2> list) {
        this.LLILZIL = list;
    }

    @Override // X.C043B
    public final void bo0(AnonymousClass0431 anonymousClass0431) {
        this.LLJZ = anonymousClass0431;
    }

    @Override // X.C043B
    public final void cx(PdpProductMeasurementModule pdpProductMeasurementModule) {
        this.LLLIIIL = pdpProductMeasurementModule;
    }

    @Override // X.C043B
    public final void m1(ProductPackStruct productPackStruct) {
        this.LLJIJIL = productPackStruct;
    }

    @Override // X.C043B
    public final void mg(Image image) {
        this.LLILLL = image;
    }

    public final void ml(Function1<? super SkuState, Unit> function1) {
        function1.invoke(this.vmDispatcher.getState());
    }

    public final void vQ2(List<? extends InterfaceC746802vq> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            InterfaceC746802vq interfaceC746802vq = (InterfaceC746802vq) obj;
            if (!(interfaceC746802vq instanceof C1056304Bd) && (!(interfaceC746802vq instanceof C1755400vmU) || ((C1755400vmU) interfaceC746802vq).getContentType() != 50000)) {
                arrayList.add(obj);
            }
        }
        this.LLLILZ = arrayList;
        setStateImmediate(new AwS580S0100000_1(arrayList, (List<InterfaceC746802vq>) 308));
    }

    @Override // X.C043B
    public final void wc(Boolean bool) {
        this.LLJJI = bool;
    }

    @Override // X.C043B
    public final void wn(int i) {
        this.LLLIIIIL = i;
    }

    @Override // X.C043B
    public final void y7(Image image) {
        LJJJZ(new AwS580S0100000_1(image, 331));
    }

    @Override // X.C043B
    public final void y8(EnumC1756020vnU enumC1756020vnU) {
        if (this.LLLIIL == EnumC1756020vnU.NOCACHE) {
            this.LLLIIL = enumC1756020vnU;
        }
    }

    public final ProductUnavailableInfo zQ2(String[] strArr) {
        SkuCommonConfig skuCommonConfig;
        SkuCommonConfig skuCommonConfig2;
        List<SkuItem> list;
        SkuItem skuItem;
        SkuCommonConfig skuCommonConfig3;
        String strLIZ = C968903qZ.LIZ(strArr);
        int iIntValue = -1;
        if (strLIZ != null) {
            ProductPackStruct productPackStruct = this.LLJIJIL;
            if (productPackStruct != null && (list = productPackStruct.skus) != null && (skuItem = (SkuItem) C04AW.LJ(strLIZ, list)) != null) {
                Integer num = skuItem.unavailableInfoId;
                if (num == null) {
                    return null;
                }
                int iIntValue2 = num.intValue();
                ProductPackStruct productPackStruct2 = this.LLJIJIL;
                if (productPackStruct2 == null || (skuCommonConfig3 = productPackStruct2.skuCommonConfig) == null) {
                    return null;
                }
                return skuCommonConfig3.LIZIZ(iIntValue2);
            }
            ProductPackStruct productPackStruct3 = this.LLJIJIL;
            if (productPackStruct3 == null || (skuCommonConfig2 = productPackStruct3.skuCommonConfig) == null) {
                return null;
            }
            Integer num2 = skuCommonConfig2.salePropUnavailableInfoId;
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            return skuCommonConfig2.LIZIZ(iIntValue);
        }
        ProductPackStruct productPackStruct4 = this.LLJIJIL;
        if (productPackStruct4 == null || (skuCommonConfig = productPackStruct4.skuCommonConfig) == null) {
            return null;
        }
        Integer num3 = skuCommonConfig.salePropUnavailableInfoId;
        if (num3 != null) {
            iIntValue = num3.intValue();
        }
        return skuCommonConfig.LIZIZ(iIntValue);
    }

    @Override // X.C043B
    public final void Fl(int i, C044L c044l) {
        String str;
        String str2;
        Integer num;
        String str3;
        int i2;
        C043Y c043yLJI;
        String str4;
        String strLIZ;
        String strLJIIIIZZ;
        AddToCartRequestParam addToCartRequestParam;
        List<NextRequestScene> list;
        String str5;
        String[] strArr;
        List<SkuItem> list2;
        String strLJIIIIZZ2;
        C1326490kch.LIZJ(C1326490kch.LIZ, "SKUPanelTag | setCurrentQuantity()");
        withState(new AwS88S0201000_1(i, (int) this, (C043B<ViewModel>) c044l, (C044L) 7));
        String str6 = null;
        if (!this.LLJJJJLIIL) {
            C948503nH.LJI(this, C0PEM.LIZJ, new C043C(this, null));
        }
        SkuPanelState skuPanelState = this.LLIZ;
        if (skuPanelState != null && (strArr = skuPanelState.checkedSkuIds) != null) {
            String strLIZ2 = C968903qZ.LIZ(strArr);
            ProductPackStruct productPackStruct = this.LLJIJIL;
            if (productPackStruct != null && (list2 = productPackStruct.skus) != null && C04AW.LJ(strLIZ2, list2) != null) {
                IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
                SkuPanelState skuPanelState2 = this.LLIZ;
                if (skuPanelState2 == null || (strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(skuPanelState2)) == null) {
                    strLJIIIIZZ2 = "{}";
                }
                iEventCenter.LIZ("ec_trigger_osp_preload", strLJIIIIZZ2);
            }
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LLJI;
        if (skuEnterParams != null) {
            str = skuEnterParams.enterFrom;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "product_detail")) {
            SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.LLJI;
            if (skuEnterParams2 != null) {
                str5 = skuEnterParams2.enterFrom;
            } else {
                str5 = null;
            }
            if (!Intrinsics.LJFF(str5, "product_review")) {
                return;
            }
        }
        C10349042x c10349042x = C04F4.LIZ;
        SkuPanelState skuPanelState3 = this.LLIZ;
        if (skuPanelState3 != null) {
            str2 = skuPanelState3.skuId;
            num = skuPanelState3.productQuantity;
        } else {
            str2 = null;
            num = null;
        }
        Boolean bool = this.LLJJI;
        SkuPanelStarter.SkuEnterParams skuEnterParams3 = this.LLJI;
        if (skuEnterParams3 != null) {
            str3 = skuEnterParams3.enterFrom;
        } else {
            str3 = null;
        }
        if (Intrinsics.LJFF(str3, "product_detail")) {
            i2 = 25;
        } else {
            i2 = 0;
        }
        AnonymousClass0431 anonymousClass0431 = this.LLJZ;
        if (anonymousClass0431 != null) {
            c043yLJI = anonymousClass0431.LJI();
        } else {
            c043yLJI = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        SkuPanelState skuPanelState4 = this.LLIZ;
        if (skuPanelState4 != null) {
            str4 = skuPanelState4.skuId;
        } else {
            str4 = null;
        }
        sbLIZ.append(str4);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Integer numValueOf = Integer.valueOf(C043M.SKU.getValue());
        ProductPackStruct productPackStruct2 = this.LLJIJIL;
        if (productPackStruct2 != null && (list = productPackStruct2.nextRequestScenes) != null) {
            strLIZ = C043O.LIZ(list, C0NL6.PRE_CART_INFO);
        } else {
            strLIZ = null;
        }
        PreAddCartItemData preAddCartItemData = new PreAddCartItemData(AnonymousClass0435.LIZIZ(this, null), strLIZ);
        PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
        if (pageSourceInfoLJ != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
        } else {
            strLJIIIIZZ = null;
        }
        if (c043yLJI != null && (addToCartRequestParam = c043yLJI.LIZ) != null) {
            i2 = addToCartRequestParam.addItemSourcePage;
        }
        Integer numValueOf2 = Integer.valueOf(i2);
        SkuPanelStarter.SkuEnterParams skuEnterParams4 = this.LLJI;
        if (skuEnterParams4 != null) {
            str6 = skuEnterParams4.buyerAddrId;
        }
        C04F4.LJ(str2, num, bool, new GetPreloadCartInfoRequest(numValueOf, preAddCartItemData, strLJIIIIZZ, numValueOf2, str6, strLIZIZ), ViewModelKt.getViewModelScope(this));
    }

    public final void OQ2(Integer num, String str) {
        setStateImmediate(new AwS115S1100000_1(str, num, 21));
    }

    @Override // X.C043B
    public final void W6(CoroutineContext coroutineContext, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        C948503nH.LJI(this, coroutineContext, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0498 A[PHI: r14
      0x0498: PHI (r14v15 java.lang.String) = (r14v14 java.lang.String), (r14v25 java.lang.String), (r14v25 java.lang.String) binds: [B:301:0x0494, B:185:0x02bd, B:187:0x02c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x048d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x048a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v102, types: [T, X.043i] */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton] */
    /* JADX WARN: Type inference failed for: r0v150, types: [T, X.043i] */
    /* JADX WARN: Type inference failed for: r0v206, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v207, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v208, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v210, types: [T, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v211, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v212, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v227, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v229, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v231, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v261, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v53, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v54, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v55, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v57, types: [T, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v58, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v59, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v60, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v61, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v62, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v63, types: [T, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v77, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v78, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v79, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v80, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v81, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v82, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, X.041I] */
    /* JADX WARN: Type inference failed for: r13v33, types: [T, X.041I] */
    /* JADX WARN: Type inference failed for: r13v45, types: [T, java.lang.String] */
    @Override // X.C043B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dc(boolean r35, java.lang.String[] r36) {
        /*
            Method dump skipped, instruction units count: 1955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM.dc(boolean, java.lang.String[]):void");
    }

    @Override // X.C043B
    public final void g12(String str, InsuranceInfo insuranceInfo) {
        if (insuranceInfo == null) {
            this.LLLLIIIILLL.remove(str);
        } else {
            this.LLLLIIIILLL.put(str, insuranceInfo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    @Override // X.C043B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lH2(X.C996103ux r6, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r7) {
        /*
            r5 = this;
            X.0kch r2 = X.C1326490kch.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "SKUPanelTag | handleRefreshPdpInfoResult() | selectSkuItem_skuId: "
            r1.append(r0)
            r3 = 0
            if (r7 == 0) goto L8e
            java.lang.String r0 = r7.skuId
        L10:
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1326490kch.LIZJ(r2, r0)
            boolean r0 = X.C044E.LIZ()
            r4 = 1
            r1 = 0
            if (r0 == 0) goto L89
            if (r6 == 0) goto L8c
            com.bytedance.goda.v2.model.dto.GodaV2Protocol<?> r0 = r6.LJIIZILJ
            if (r0 == 0) goto L89
            X.04CV r2 = new X.04CV
            com.bytedance.goda.v2.model.dto.GodaV2Protocol<?> r0 = r6.LJIIZILJ
            if (r0 == 0) goto L87
            X.04EU r0 = r0.localExtra
        L35:
            r2.<init>(r1, r1, r0)
            X.04Aw r1 = r5.LLJILJILJ
            if (r1 == 0) goto L41
            com.bytedance.goda.v2.model.dto.GodaV2Protocol<?> r0 = r6.LJIIZILJ
            r1.LIZJ(r0, r2, r4)
        L41:
            java.util.List<java.lang.String> r0 = r6.LJI
        L43:
            com.bytedance.android.livesdk.model.message.ext.PromotionView r2 = r5.IQ2(r0)
            if (r7 == 0) goto L85
            java.util.List<java.lang.String> r0 = r7.promotionKeyList
        L4b:
            com.bytedance.android.livesdk.model.message.ext.PromotionView r1 = r5.IQ2(r0)
            if (r2 == 0) goto L83
            java.util.List r0 = r2.getPromotion_items()
            if (r0 == 0) goto L83
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r4) goto L83
        L5f:
            kotlin.jvm.internal.AwS580S0100000_1 r1 = new kotlin.jvm.internal.AwS580S0100000_1
            r0 = 335(0x14f, float:4.7E-43)
            r1.<init>(r2, r0)
            r5.LJJJZ(r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo r0 = r5.LD1()
            if (r0 != 0) goto L7c
            java.lang.String r1 = r5.getSkuId()
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r5.LLJI
            if (r0 == 0) goto L79
            com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo r3 = r0.selectedInsuranceInfo
        L79:
            r5.g12(r1, r3)
        L7c:
            r5.Oy()
            r5.YQ2()
            return
        L83:
            r2 = r1
            goto L5f
        L85:
            r0 = r3
            goto L4b
        L87:
            r0 = r3
            goto L35
        L89:
            if (r6 == 0) goto L8c
            goto L41
        L8c:
            r0 = r3
            goto L43
        L8e:
            r0 = r3
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM.lH2(X.03ux, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // X.InterfaceC1164530gPT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(java.lang.String r46, java.lang.String r47) {
        /*
            Method dump skipped, instruction units count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM.onEvent(java.lang.String, java.lang.String):void");
    }

    @Override // X.C043B
    public final <A> void s60(InterfaceC2217241BqE<SkuState, ? extends A> interfaceC2217241BqE, Function1<? super A, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, interfaceC2217241BqE, null, null, null, function1, 14, null);
    }

    @Override // X.C043B, X.InterfaceC836103Ol
    public final void ts(PaymentInfo paymentInfo, boolean z) {
        this.LLLLIILLL = this.LLLLIILL;
        this.LLLLIILL = paymentInfo;
        if (z) {
            setStateImmediate(new AwS580S0100000_1(paymentInfo, 329));
        } else {
            setStateImmediate(new AwS580S0100000_1(paymentInfo, 330));
        }
    }

    public final void TQ2(C2217381BqS c2217381BqS, C2217381BqS c2217381BqS2, Function2 function2) {
        AssemViewModel.selectSubscribe$default(this, null, c2217381BqS, c2217381BqS2, null, null, null, function2, 57, null);
    }

    @Override // X.InterfaceC836103Ol
    public final PaymentInfo eI1(PaymentMethod paymentMethod, InstallmentPlan installmentPlan, PaymentMethod paymentMethod2, String str) {
        String str2;
        String str3;
        PaymentMethod paymentMethod3;
        Object objLJJJLL;
        boolean z;
        Boolean boolIsChooseSave;
        String str4;
        String str5;
        String str6;
        PaymentInstallmentPlan paymentInstallmentPlanLJFF;
        String str7;
        Boolean bool;
        PaymentMethodInfo paymentMethodInfo;
        PaymentMethodsData paymentMethodsDataBu0 = Bu0();
        PaymentInfo paymentInfo = this.LLLLIILL;
        if (installmentPlan != null) {
            str2 = installmentPlan.tenure;
            str3 = installmentPlan.id;
        } else {
            str2 = null;
            str3 = null;
        }
        C03SY.LIZ.getClass();
        C873003b6 c873003b6LJI = C03SY.LJI(installmentPlan, paymentMethod);
        ArrayList arrayList = new ArrayList();
        if (paymentMethod2 != null) {
            paymentMethod3 = paymentMethod2;
        } else {
            paymentMethod3 = paymentMethod;
        }
        List<ElementDTO> listLJJIII = paymentMethod.LJJIII();
        if (listLJJIII != null) {
            objLJJJLL = C13LP.LJJJLL(listLJJIII);
        } else {
            objLJJJLL = null;
        }
        boolean zBooleanValue = true;
        if (objLJJJLL == null) {
            z = true;
        } else {
            z = false;
        }
        if (paymentMethod.LIZIZ) {
            PaymentCacheHelper paymentCacheHelper = PaymentCacheHelper.LIZ;
            String strLJIIJ = paymentMethod.LJIIJ();
            paymentCacheHelper.getClass();
            PaymentInfo paymentInfoLJII = PaymentCacheHelper.LJII(strLJIIJ);
            if (paymentInfoLJII != null && (paymentMethodInfo = paymentInfoLJII.paymentMethodInfo) != null) {
                boolIsChooseSave = paymentMethodInfo.isChooseSave();
                List<PaymentElement> list = paymentMethodInfo.paymentElements;
                if (list != null) {
                    arrayList = new ArrayList(C03S8.LJJII(list, arrayList));
                }
            } else {
                boolIsChooseSave = null;
            }
            if (PaymentCacheHelper.LJIIIZ(paymentMethod.LJIIJ()) != null) {
                boolIsChooseSave = Boolean.TRUE;
            }
        } else {
            boolIsChooseSave = null;
        }
        C03SE c03se = C03PI.LJIJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("osp ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c03se.getClass();
        C03SE.LJJ(paymentMethodsDataBu0, paymentMethod, installmentPlan, paymentMethod2, strLIZIZ);
        if (paymentMethod.LJJLI()) {
            return new PaymentInfo(null, null, null, null, null, null, paymentMethod3, null, null, new LinkedHashMap(), null);
        }
        if (paymentInfo != null && (bool = paymentInfo.useShippingAddress) != null) {
            zBooleanValue = bool.booleanValue();
        }
        String str8 = paymentMethod3.id;
        String str9 = paymentMethod3.token;
        if (installmentPlan != null) {
            str4 = installmentPlan.installmentOptionId;
        } else {
            str4 = null;
        }
        if (c873003b6LJI != null) {
            str5 = c873003b6LJI.LIZJ;
            str6 = c873003b6LJI.LIZLLL;
        } else {
            str5 = null;
            str6 = null;
        }
        if (installmentPlan != null) {
            paymentInstallmentPlanLJFF = installmentPlan.LJFF();
        } else {
            paymentInstallmentPlanLJFF = null;
        }
        if (installmentPlan != null) {
            str7 = installmentPlan.tenureCycle;
        } else {
            str7 = null;
        }
        return new PaymentInfo(new PaymentMethodInfo(str8, str9, arrayList, boolIsChooseSave, str2, str3, str4, null, null, null, str5, str6, paymentInstallmentPlanLJFF, null, str7, null, null), paymentMethod3, Boolean.valueOf(zBooleanValue), Boolean.valueOf(z), null, null, null, null, null, new LinkedHashMap(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(android.content.Context r29, java.lang.String r30, com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment<?> r31, int r32) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM.wQ2(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment, int):void");
    }
}
