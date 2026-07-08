package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0I0B;
import X.C1003130cD9;
import X.C1006980cJM;
import X.C1006990cJN;
import X.C1009060cMi;
import X.C1017830car;
import X.C1022820ciu;
import X.C1052320dUU;
import X.C1052420dUe;
import X.C1076370e7H;
import X.C1210880hcE;
import X.C1440005kM;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2184171Adz;
import X.C631370Opb;
import X.C989550brF;
import X.C991660bue;
import X.C991670buf;
import X.EnumC1005330cGh;
import X.EnumC1007000cJO;
import X.EnumC1223630hwn;
import X.EnumC992120bvO;
import X.InterfaceC1226510i1R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.component.nativelivebanner.AnoleOfficialLiveRoomModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.lemon.feed.component.LemonGuideCardComponent;
import com.ss.android.ugc.aweme.newselector.protocol.custom.cell.guidesearch.GuideToSearchAssem;
import com.ss.android.ugc.aweme.newselector.protocol.custom.cell.recomreason.RecomReasonAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.im.contact.selector.api.protocol.custom.ContactSelectorCustomVM;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AbS697S0100000_16 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
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
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS697S0100000_16(C1017830car c1017830car, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = c1017830car;
    }

    public static final void LIZ$0(AbS697S0100000_16 abS697S0100000_16, View view) {
        if (view != null) {
            C1052320dUU c1052320dUU = C1052320dUU.LIZ;
            c1052320dUU.getClass();
            C1052320dUU.LIZIZ = true;
            Keva keva = C1052420dUe.LIZ;
            c1052320dUU.getClass();
            if (C1052320dUU.LIZIZ) {
                C1052420dUe.LIZ.storeLong("fyp_big_card_not_interested_time", System.currentTimeMillis());
            }
            C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "lemon_guide_not_interested", ((VideoItemParams) C631370Opb.LIZ((LemonGuideCardComponent) abS697S0100000_16.l0)).getAweme()));
        }
    }

    public static final void LIZ$1(AbS697S0100000_16 abS697S0100000_16, View view) {
        if (view != null) {
            ((LemonGuideCardComponent) abS697S0100000_16.l0).lp(view.getContext());
        }
    }

    public static final void LIZ$10(AbS697S0100000_16 abS697S0100000_16, View view) {
        Integer num;
        Context context;
        if (view != null) {
            C1003130cD9 c1003130cD9 = (C1003130cD9) abS697S0100000_16.l0;
            AnoleOfficialLiveRoomModel anoleOfficialLiveRoomModel = c1003130cD9.LLJLIL;
            Long lValueOf = null;
            Aweme aweme = null;
            if (anoleOfficialLiveRoomModel != null && (num = anoleOfficialLiveRoomModel.bottomBannerType) != null) {
                if (num.intValue() == 1) {
                    IComplianceService iComplianceService = (IComplianceService) PluggableExtentionKt.pluggableSpi$default(IComplianceService.class, false, false, false, 14, null);
                    if (iComplianceService != null && iComplianceService.LJJIJIL()) {
                        IComplianceService iComplianceService2 = (IComplianceService) PluggableExtentionKt.pluggableSpi$default(IComplianceService.class, false, false, false, 14, null);
                        if (iComplianceService2 != null) {
                            ViewGroup viewGroup = c1003130cD9.LLJJIII;
                            if (viewGroup != null) {
                                context = viewGroup.getContext();
                            } else {
                                context = null;
                            }
                            Object obj = c1003130cD9.LLILLJJLI.LIZJ;
                            if (obj instanceof Aweme) {
                                aweme = (Aweme) obj;
                            }
                            iComplianceService2.LJJJJ(context, aweme);
                            return;
                        }
                        return;
                    }
                    IComplianceService iComplianceService3 = (IComplianceService) PluggableExtentionKt.pluggableSpi$default(IComplianceService.class, false, false, false, 14, null);
                    if (iComplianceService3 == null) {
                        return;
                    }
                    iComplianceService3.LJJIJL(c1003130cD9.LLILZ, "infeed_bottom_banner");
                    return;
                }
                if (num.intValue() != 0) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(EnumC1005330cGh.ENTER_FROM.getRName(), 91);
                String rName = EnumC1005330cGh.REFER.getRName();
                String refer = c1003130cD9.LL.getRefer();
                if (refer == null) {
                    refer = "bottom_banner";
                }
                linkedHashMap.put(rName, refer);
                String rName2 = EnumC1005330cGh.TAG.getRName();
                String tag = c1003130cD9.LL.getTag();
                if (tag == null) {
                    tag = "draw_ad";
                }
                linkedHashMap.put(rName2, tag);
                String rName3 = EnumC1005330cGh.AD_EXTRA_DATA.getRName();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("component_id", Long.valueOf(c1003130cD9.LL.getID()));
                AnoleModel anoleModel = c1003130cD9.LLILLJJLI.LIZLLL.getAnoleModel();
                if (anoleModel != null) {
                    lValueOf = Long.valueOf(anoleModel.templateID);
                }
                linkedHashMap2.put("template_id", lValueOf);
                linkedHashMap2.put("component_type", c1003130cD9.LL.type);
                linkedHashMap.put(rName3, linkedHashMap2);
                c1003130cD9.LLILLL.LJIJ(new C991670buf(linkedHashMap), c1003130cD9);
            }
        }
    }

    public static final void LIZ$2(AbS697S0100000_16 abS697S0100000_16, View view) {
        if (view != null) {
            ((LemonGuideCardComponent) abS697S0100000_16.l0).lp(view.getContext());
        }
    }

    public static final void LIZ$3(AbS697S0100000_16 abS697S0100000_16, View view) {
        if (view != null) {
            GuideToSearchAssem guideToSearchAssem = (GuideToSearchAssem) abS697S0100000_16.l0;
            InterfaceC1226510i1R interfaceC1226510i1RR91 = ((ContactSelectorCustomVM) guideToSearchAssem.LLJJLIIIJLLLLLLLZ.getValue(guideToSearchAssem, GuideToSearchAssem.LLJLL[0])).LL.r91();
            if (interfaceC1226510i1RR91 != null) {
                interfaceC1226510i1RR91.LJIIL(EnumC1223630hwn.SEARCH_PAGE);
            }
        }
    }

    public static final void LIZ$4(AbS697S0100000_16 abS697S0100000_16, View view) {
        if (view != null) {
            SmartRouter.buildRoute(((RecomReasonAssem) abS697S0100000_16.l0).getContentView().getContext(), ((C1076370e7H) C631370Opb.LIZ((RecomReasonAssem) abS697S0100000_16.l0)).LLILLL).open();
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", ((RecomReasonAssem) abS697S0100000_16.l0).LLJLIL.getValue()), new Pair("enter_method", ((RecomReasonAssem) abS697S0100000_16.l0).LLJLILLLLZIIL.getValue()));
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("click_recom_group_reason", mapLJIIIIZZ);
        }
    }

    public static final void LIZ$5(AbS697S0100000_16 abS697S0100000_16, View view) {
        View.OnClickListener onClickListener;
        if (view != null && (onClickListener = ((C1017830car) abS697S0100000_16.l0).LJIIIZ) != null) {
            onClickListener.onClick(view);
        }
    }

    public static final void LIZ$6(AbS697S0100000_16 abS697S0100000_16, View view) {
        Function0<Unit> function0;
        if (view != null && (function0 = ((C1017830car) abS697S0100000_16.l0).LJIIL) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$7(AbS697S0100000_16 abS697S0100000_16, View view) {
        View.OnClickListener onClickListener;
        if (view != null && (onClickListener = ((C1017830car) abS697S0100000_16.l0).LJIIIIZZ) != null) {
            onClickListener.onClick(view);
        }
    }

    public static final void LIZ$8(AbS697S0100000_16 abS697S0100000_16, View view) {
        if (view != null) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", ((C1006980cJM) abS697S0100000_16.l0).LLILLJJLI.LIZLLL);
            c1022820ciuLIZLLL.LIZJ("button_survey_yes", "refer");
            c1022820ciuLIZLLL.LIZIZ(Long.valueOf(((C1006980cJM) abS697S0100000_16.l0).LL.getID()), "component_id");
            c1022820ciuLIZLLL.LJII();
            C1006990cJN.LIZ.getClass();
            C1006990cJN.LIZIZ.storeLong(C1006990cJN.LIZ("last_interest_feedback_feedback_time"), System.currentTimeMillis());
            C1006980cJM c1006980cJM = (C1006980cJM) abS697S0100000_16.l0;
            c1006980cJM.LLJLIL = EnumC1007000cJO.LLILLL;
            C1006980cJM.LJJ(c1006980cJM.LLJLILLLLZIIL.feedbackYesToast);
            C1006980cJM c1006980cJM2 = (C1006980cJM) abS697S0100000_16.l0;
            c1006980cJM2.LLILLL.LJIJ(new C991660bue(c1006980cJM2.LL.type), c1006980cJM2);
        }
    }

    public static final void LIZ$9(AbS697S0100000_16 abS697S0100000_16, View view) {
        if (view != null) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", ((C1006980cJM) abS697S0100000_16.l0).LLILLJJLI.LIZLLL);
            c1022820ciuLIZLLL.LIZJ("button_survey_no", "refer");
            c1022820ciuLIZLLL.LIZIZ(Long.valueOf(((C1006980cJM) abS697S0100000_16.l0).LL.getID()), "component_id");
            c1022820ciuLIZLLL.LJII();
            C1006980cJM.LJJ(((C1006980cJM) abS697S0100000_16.l0).LLJLILLLLZIIL.feedbackNoToast);
            C1006990cJN.LIZ.getClass();
            C1006990cJN.LIZIZ.storeLong(C1006990cJN.LIZ("last_interest_feedback_feedback_time"), System.currentTimeMillis());
            C1006980cJM c1006980cJM = (C1006980cJM) abS697S0100000_16.l0;
            c1006980cJM.LLJLIL = EnumC1007000cJO.LLILLL;
            c1006980cJM.LLILLL.LJIJ(new C991660bue(c1006980cJM.LL.type), c1006980cJM);
            C1006980cJM c1006980cJM2 = (C1006980cJM) abS697S0100000_16.l0;
            c1006980cJM2.LLILLL.LJIJ(new C989550brF(new C1009060cMi(EnumC992120bvO.TO_TOP, "not_interested", false, null)), c1006980cJM2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS697S0100000_16(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }
}
