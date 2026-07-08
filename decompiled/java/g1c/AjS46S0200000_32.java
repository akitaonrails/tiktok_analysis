package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1018703yb;
import X.C1104190eq9;
import X.C1388190mED;
import X.C15438062q;
import X.C182D;
import X.C182F;
import X.C18LA;
import X.C18NJ;
import X.C18NL;
import X.C18NT;
import X.C18NZ;
import X.C19EG;
import X.C20337514hx;
import X.C21155317qZ;
import X.C21155817qe;
import X.C21157017qq;
import X.C212363188r;
import X.C21268418La;
import X.C21269318Lj;
import X.C21272218Mm;
import X.C21272618Mq;
import X.C2344009Gk;
import X.InterfaceC1392640mLO;
import X.InterfaceC813403Fs;
import X.ViewTreeObserverOnGlobalLayoutListenerC21155717qd;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.AnchorCommonViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.GoLiveCard;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public class AjS46S0200000_32 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS46S0200000_32 ajS46S0200000_32, View view) {
        if (view != null) {
            new AwS576S0100000_32((ViewTreeObserverOnGlobalLayoutListenerC21155717qd) ajS46S0200000_32.l1, 19);
            C21155817qe c21155817qe = (C21155817qe) ajS46S0200000_32.l0;
            if (c21155817qe.LIZLLL) {
                ViewTreeObserverOnGlobalLayoutListenerC21155717qd viewTreeObserverOnGlobalLayoutListenerC21155717qd = (ViewTreeObserverOnGlobalLayoutListenerC21155717qd) ajS46S0200000_32.l1;
                C21157017qq.LIZ(viewTreeObserverOnGlobalLayoutListenerC21155717qd.LLILLJJLI, viewTreeObserverOnGlobalLayoutListenerC21155717qd, c21155817qe.LJI, C21155317qZ.LJ, null, 17);
            }
        }
    }

    public static final void LIZ$1(AjS46S0200000_32 ajS46S0200000_32, View view) {
        Function2 function2;
        if (view != null && (function2 = (Function2) ajS46S0200000_32.l0) != null) {
            C21268418La c21268418La = (C21268418La) ajS46S0200000_32.l1;
            function2.invoke(c21268418La, c21268418La.getVoucherInfo());
        }
    }

    public static final void LIZ$2(AjS46S0200000_32 ajS46S0200000_32, View view) {
        if (view != null) {
            SmartRouter.buildRoute(((C182F) ajS46S0200000_32.l0).getContext(), ((GoLiveCard) ajS46S0200000_32.l1).schema).open();
            C20337514hx.LIZ.getClass();
            C20337514hx.LJ(0);
            C20337514hx.LIZJ(0L);
            View.OnClickListener cardClickListener = ((C182F) ajS46S0200000_32.l0).getCardClickListener();
            if (cardClickListener != null) {
                cardClickListener.onClick(view);
            }
        }
    }

    public static final void LIZ$3(AjS46S0200000_32 ajS46S0200000_32, View view) {
        if (view != null) {
            SmartRouter.buildRoute(((C182F) ajS46S0200000_32.l0).getContext(), ((GoLiveCard) ajS46S0200000_32.l1).btnSchema).open();
            View.OnClickListener actionClickListener = ((C182F) ajS46S0200000_32.l0).getActionClickListener();
            if (actionClickListener != null) {
                actionClickListener.onClick(view);
            }
        }
    }

    public static final void LIZ$4(AjS46S0200000_32 ajS46S0200000_32, View view) {
        if (view != null) {
            SmartRouter.buildRoute(((C182D) ajS46S0200000_32.l0).getContext(), ((GoLiveCard) ajS46S0200000_32.l1).schema).open();
            C20337514hx.LIZ.getClass();
            C20337514hx.LJ(0);
            C20337514hx.LIZJ(0L);
            View.OnClickListener cardClickListener = ((C182D) ajS46S0200000_32.l0).getCardClickListener();
            if (cardClickListener != null) {
                cardClickListener.onClick(view);
            }
        }
    }

    public static final void LIZ$5(AjS46S0200000_32 ajS46S0200000_32, View view) {
        if (view != null) {
            C18NJ c18nj = C18NJ.LIZ;
            Context context = ((View) ajS46S0200000_32.l0).getContext();
            C18NL c18nl = (C18NL) ajS46S0200000_32.l1;
            C18NJ.LIZJ(c18nj, context, c18nl.LIZLLL, c18nl.LIZ, c18nl.LIZJ, false);
            C18NZ c18nz = C18NZ.LIZ;
            String str = ((C18NL) ajS46S0200000_32.l1).LJ;
            c18nz.getClass();
            C1018703yb.LIZLLL("tiktok_video_anchor_click", new AwS146S1100000_32((C2344009Gk) null, str, 17));
            C1018703yb.LIZLLL("tiktokec_shop_entrance_click", new AwS146S1100000_32((C2344009Gk) null, ((C18NL) ajS46S0200000_32.l1).LJ, 19));
        }
    }

    public static final void LIZ$6(AjS46S0200000_32 ajS46S0200000_32, View view) {
        InterfaceC813403Fs interfaceC813403Fs;
        if (view != null && (interfaceC813403Fs = ((C212363188r) ajS46S0200000_32.l0).LLILLJJLI) != null) {
            interfaceC813403Fs.LJLJLLL((SizeGuide) ajS46S0200000_32.l1);
        }
    }

    public static final void LIZ$7(AjS46S0200000_32 ajS46S0200000_32, View view) {
        ArrayList arrayList;
        boolean z;
        Aweme awemeLJJLIIIJJIZ;
        Aweme awemeLJJLIIIJJIZ2;
        List<AnchorProductInfoModel> list;
        String string;
        InterfaceC1392640mLO interfaceC1392640mLO;
        if (view != null) {
            C21272618Mq c21272618Mq = C21272618Mq.LIZ;
            List<AnchorProductInfoModel> list2 = ((C18NT) ajS46S0200000_32.l0).LIZIZ.LLILZIL;
            c21272618Mq.getClass();
            boolean zLJIIIIZZ = C21272618Mq.LJIIIIZZ(list2);
            boolean zLJIIJJI = C21272618Mq.LJIIJJI(((C18NT) ajS46S0200000_32.l0).LIZIZ.LLILLJJLI);
            if (zLJIIIIZZ) {
                AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                Integer numValueOf = Integer.valueOf(C21272618Mq.LJIJJ(((C18NT) ajS46S0200000_32.l0).LIZIZ.LLILLJJLI));
                int size = ((C18NT) ajS46S0200000_32.l0).LIZIZ.LLILZIL.size();
                anchorBizUtils.getClass();
                int iLJJJI = AnchorBizUtils.LJJJI(size, numValueOf);
                C18NT c18nt = (C18NT) ajS46S0200000_32.l0;
                AnchorCommonViewModel anchorCommonViewModel = c18nt.LIZJ;
                if (anchorCommonViewModel != null) {
                    anchorCommonViewModel.LL = true;
                }
                ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = c18nt.LIZIZ;
                if (eCommerceAnchorPanelViewModel != null && (interfaceC1392640mLO = eCommerceAnchorPanelViewModel.LL) != null) {
                    interfaceC1392640mLO.LJJLIIIJJIZ();
                }
                ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2 = ((C18NT) ajS46S0200000_32.l0).LIZIZ;
                String str = "";
                if (eCommerceAnchorPanelViewModel2 != null && (list = eCommerceAnchorPanelViewModel2.LLILZIL) != null) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<AnchorProductInfoModel> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Long l = it2.next().extraData.productId;
                        if (l == null || (string = l.toString()) == null) {
                            string = "";
                        }
                        arrayList2.add(string);
                    }
                    arrayList = new ArrayList(arrayList2);
                } else {
                    arrayList = new ArrayList();
                }
                if (iLJJJI != 0) {
                    z = true;
                } else {
                    z = false;
                }
                eCommerceAnchorPanelViewModel.OQ2(arrayList, z, 2, new AwS611S0100000_32((C18NT) ajS46S0200000_32.l0, 392));
                C21269318Lj c21269318Lj = new C21269318Lj();
                c21269318Lj.LIZ.setPanelStyle(iLJJJI);
                c21269318Lj.LIZ.setPanelClickMethod(4);
                C21272618Mq c21272618Mq2 = C21272618Mq.LIZ;
                InterfaceC1392640mLO interfaceC1392640mLO2 = ((C18NT) ajS46S0200000_32.l0).LIZIZ.LL;
                if (interfaceC1392640mLO2 != null) {
                    awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ();
                } else {
                    awemeLJJLIIIJJIZ = null;
                }
                List<AnchorProductInfoModel> list3 = ((C18NT) ajS46S0200000_32.l0).LIZIZ.LLILZIL;
                c21272618Mq2.getClass();
                c21269318Lj.LIZ.setEnableMaybeYouLike(C21272618Mq.LJIIIZ(awemeLJJLIIIJJIZ, list3, false));
                c21269318Lj.LIZ.setEnableSearchEntrance(true);
                c21269318Lj.LIZ.setEnablePromotionBanner(true);
                c21269318Lj.LIZ.setPanelFullScreen(zLJIIJJI);
                c21269318Lj.LIZ.setEnableClaimVoucher(true);
                AnchorPanelConfig anchorPanelConfig = c21269318Lj.LIZ;
                InterfaceC1392640mLO interfaceC1392640mLO3 = ((C18NT) ajS46S0200000_32.l0).LIZIZ.LL;
                if (interfaceC1392640mLO3 != null) {
                    awemeLJJLIIIJJIZ2 = interfaceC1392640mLO3.LJJLIIIJJIZ();
                } else {
                    awemeLJJLIIIJJIZ2 = null;
                }
                ProductListModel productListModelLJJIJL = C21272218Mm.LJJIJL(awemeLJJLIIIJJIZ2, ((C18NT) ajS46S0200000_32.l0).LIZIZ.LL, "video_multi_anchor", anchorPanelConfig, null);
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C18NT) ajS46S0200000_32.l0).LIZ.getContext());
                if (c19egLIZIZ != null) {
                    AnchorBizUtils anchorBizUtils2 = AnchorBizUtils.LIZ;
                    String strLJ = C18LA.LJ("c5134.d0", view, null);
                    if (strLJ != null) {
                        str = strLJ;
                    }
                    ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel3 = ((C18NT) ajS46S0200000_32.l0).LIZIZ;
                    InterfaceC1392640mLO interfaceC1392640mLO4 = eCommerceAnchorPanelViewModel3.LL;
                    AnchorCommonStruct anchorCommonStruct = eCommerceAnchorPanelViewModel3.LLILLL;
                    anchorBizUtils2.getClass();
                    AnchorBizUtils.LJJLIL(c19egLIZIZ, productListModelLJJIJL, str, anchorPanelConfig, interfaceC1392640mLO4, anchorCommonStruct);
                }
                ((C18NT) ajS46S0200000_32.l0).LIZIZ.LQ2(productListModelLJJIJL, 0, false, null, null, Boolean.valueOf(anchorPanelConfig.enableMaybeYouLike), anchorPanelConfig.panelFullScreen, C1104190eq9.LIZ(view, "c5134.d0"), null, "ecom_panel");
                ((C18NT) ajS46S0200000_32.l0).LIZIZ.YQ2("a2270.b2878.c5134.d0");
                return;
            }
            ((Function0) ajS46S0200000_32.l1).invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$8(g1c.AjS46S0200000_32 r20, android.view.View r21) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS46S0200000_32.LIZ$8(g1c.AjS46S0200000_32, android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS46S0200000_32(Object obj, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
