package kotlin.jvm.internal;

import X.AbstractC1773210wFD;
import X.AbstractC1773460wFc;
import X.AbstractC1773820wGC;
import X.C041R;
import X.C08QT;
import X.C098200Yq;
import X.C09AY;
import X.C09R7;
import X.C09RB;
import X.C0DHG;
import X.C0HTI;
import X.C0QY2;
import X.C0TMZ;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1076240e74;
import X.C1076250e75;
import X.C1227904rF;
import X.C1338430kvx;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C13IQ;
import X.C1494600ozq;
import X.C1515820pY4;
import X.C1709070uZl;
import X.C1709210uZz;
import X.C1709220ua0;
import X.C1709570uaZ;
import X.C1710340ubo;
import X.C1710850ucd;
import X.C1710940ucm;
import X.C1713570uh1;
import X.C1713600uh4;
import X.C1714230ui5;
import X.C1715530ukB;
import X.C1720720usY;
import X.C1720940usu;
import X.C1721140utE;
import X.C1721310utV;
import X.C1721420utg;
import X.C1725060uzY;
import X.C1729440v6c;
import X.C1733010vCN;
import X.C1740600vOc;
import X.C1745060vVo;
import X.C1745480vWU;
import X.C1746340vXs;
import X.C1746370vXv;
import X.C1748670vbd;
import X.C1748720vbi;
import X.C1750810vf5;
import X.C1753750vjp;
import X.C1753760vjq;
import X.C1758250vr5;
import X.C1761290vvz;
import X.C1761430vwD;
import X.C1761440vwE;
import X.C1761450vwF;
import X.C1761460vwG;
import X.C1767790w6T;
import X.C1767830w6X;
import X.C1767950w6j;
import X.C189200o6;
import X.C1939607ik;
import X.C19719212De;
import X.C19EG;
import X.C2188811AlT;
import X.C23271099x;
import X.C340160DVe;
import X.C632670Orh;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C921403iu;
import X.C948503nH;
import X.C985403tE;
import X.EnumC1593910ra1;
import X.EnumC1709190uZx;
import X.EnumC1709200uZy;
import X.EnumC1754390vkr;
import X.EnumC1768240w7C;
import X.EnumC310840CGk;
import X.InterfaceC1713820uhQ;
import X.InterfaceC1725110uzd;
import X.InterfaceC1750860vfA;
import X.InterfaceC1773310wFN;
import X.InterfaceC1773770wG7;
import X.InterfaceC1774020wGW;
import X.InterfaceC2217241BqE;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ARunnableS95S0200000_26;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.CarouselDO;
import com.bytedance.pipo.stellar.base.model.CarouselItem;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.response.PopupContent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyVM;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ReachCfgDataForMall;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ShopTabModuleData;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.foundation.hybrid.PipoCustomerNavData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TopBannerInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCCardNumberElementViewHolder;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierAssem;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierFragment;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS270S0300000_26 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case 48:
                return invoke$48(this);
            case 49:
                return invoke$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$76(this);
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$83(this);
            case 84:
                return invoke$84(this);
            case 85:
                return invoke$85(this);
            case 86:
                return invoke$86(this);
            case 87:
                return invoke$87(this);
            case 88:
                return invoke$88(this);
            case 89:
                return invoke$89(this);
            case 90:
                return invoke$90(this);
            case 91:
                return invoke$91(this);
            case 92:
                return invoke$92(this);
            case 93:
                return invoke$93(this);
            case 94:
                return invoke$94(this);
            case 95:
                return invoke$95(this);
            case 96:
                return invoke$96(this);
            case 97:
                return invoke$97(this);
            case 98:
                return invoke$98(this);
            case 99:
                return invoke$99(this);
            case 100:
                return invoke$100(this);
            case 101:
                return invoke$101(this);
            case 102:
                return invoke$102(this);
            case 103:
                return invoke$103(this);
            case 104:
                return invoke$104(this);
            case 105:
                return invoke$105(this);
            case 106:
                return invoke$106(this);
            case 107:
                return invoke$107(this);
            case 108:
                return invoke$108(this);
            case 109:
                return invoke$109(this);
            case 110:
                return invoke$110(this);
            case 111:
                return invoke$111(this);
            case 112:
                return invoke$112(this);
            case 113:
                return invoke$113(this);
            case 114:
                return invoke$114(this);
            case 115:
                return invoke$115(this);
            case 116:
                return invoke$116(this);
            case 117:
                return invoke$117(this);
            case 118:
                return invoke$118(this);
            case 119:
                return invoke$119(this);
            case 120:
                return invoke$120(this);
            case 121:
                return invoke$121(this);
            case 122:
                return invoke$122(this);
            case 123:
                return invoke$123(this);
            case 124:
                return invoke$124(this);
            case 125:
                return invoke$125(this);
            case 126:
                return invoke$126(this);
            case 127:
                return invoke$127(this);
            case 128:
                return invoke$128(this);
            case 129:
                return invoke$129(this);
            case 130:
                return invoke$130(this);
            case 131:
                return invoke$131(this);
            case 132:
                return invoke$132(this);
            case 133:
                return invoke$133(this);
            case 134:
                return invoke$134(this);
            case 135:
                return invoke$135(this);
            case 136:
                return invoke$136(this);
            case 137:
                return invoke$137(this);
            case 138:
                return invoke$138(this);
            case 139:
                return invoke$139(this);
            case 140:
                return invoke$140(this);
            case 141:
                return invoke$141(this);
            case 142:
                return invoke$142(this);
            case 143:
                return invoke$143(this);
            case 144:
                return invoke$144(this);
            case 145:
                return invoke$145(this);
            case 146:
                return invoke$146(this);
            case 147:
                return invoke$147(this);
            case 148:
                return invoke$148(this);
            case 149:
                return invoke$149(this);
            case 150:
                return invoke$150(this);
            case 151:
                return invoke$151(this);
            case 152:
                return invoke$152(this);
            case 153:
                return invoke$153(this);
            case 154:
                return invoke$154(this);
            case 155:
                return invoke$155(this);
            case 156:
                return invoke$156(this);
            case 157:
                return invoke$157(this);
            case 158:
                return invoke$158(this);
            case 159:
                return invoke$159(this);
            case 160:
                return invoke$160(this);
            case 161:
                return invoke$161(this);
            case 162:
                return invoke$162(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$100(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$101(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$102(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$103(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$104(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$105(AwS270S0300000_26 awS270S0300000_26) {
        return ViewModelProviders.of(((Fragment) awS270S0300000_26.l0).requireActivity(), C1076250e75.LIZ).get(C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName(), C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
    }

    public static /* bridge */ /* synthetic */ Object invoke$106(AwS270S0300000_26 awS270S0300000_26) {
        return ViewModelProviders.of(((Fragment) awS270S0300000_26.l0).requireActivity(), C1076250e75.LIZ).get(C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName(), C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
    }

    public static /* bridge */ /* synthetic */ Object invoke$107(AwS270S0300000_26 awS270S0300000_26) {
        return ViewModelProviders.of(((Fragment) awS270S0300000_26.l0).requireActivity(), C1076250e75.LIZ).get(C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName(), C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
    }

    public static final Object invoke$108(AwS270S0300000_26 awS270S0300000_26) {
        View view;
        SeaPdpBodyWidget seaPdpBodyWidget = (SeaPdpBodyWidget) awS270S0300000_26.l0;
        if (seaPdpBodyWidget.LLLF && (view = seaPdpBodyWidget.LLILZ) != null) {
            HandlerHook.viewPost(view, new ARunnableS95S0200000_26(seaPdpBodyWidget, (C1338430kvx) awS270S0300000_26.l2, 22));
        }
        if (C1758250vr5.LIZ().drawListener) {
            ((SeaPdpBodyWidget) awS270S0300000_26.l0).LJIILLIIL((List) awS270S0300000_26.l1);
        }
        C1338430kvx c1338430kvx = (C1338430kvx) awS270S0300000_26.l2;
        C786410Ut5.y3(c1338430kvx.getViewTreeObserver(), new C0TMZ(c1338430kvx, new AwS570S0100000_26((SeaPdpBodyWidget) awS270S0300000_26.l0, 1201)));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$109(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$110(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static final Object invoke$111(AwS270S0300000_26 awS270S0300000_26) {
        int i;
        CashierFragment cashierFragment;
        C1709570uaZ c1709570uaZ;
        EnumC1709200uZy enumC1709200uZy;
        C1709070uZl c1709070uZl = ((CashierEnterParams) awS270S0300000_26.l0).LIZIZ;
        EnumC1709200uZy enumC1709200uZy2 = null;
        if (c1709070uZl != null && (enumC1709200uZy = c1709070uZl.LIZIZ) != null) {
            i = C1709210uZz.LIZ[enumC1709200uZy.ordinal()];
        } else {
            i = -1;
        }
        if (i == 1) {
            ((Function0) awS270S0300000_26.l1).invoke();
        } else {
            CashierEnterParams cashierEnterParams = (CashierEnterParams) awS270S0300000_26.l0;
            C1709070uZl c1709070uZl2 = cashierEnterParams.LIZIZ;
            if (c1709070uZl2 != null) {
                enumC1709200uZy2 = c1709070uZl2.LIZIZ;
            }
            if (enumC1709200uZy2 == EnumC1709200uZy.CONTINUE && (c1709570uaZ = cashierEnterParams.paymentData) != null) {
                c1709570uaZ.LJIJ(true);
            }
            PipoCashierBaseFragment pipoCashierBaseFragment = (PipoCashierBaseFragment) awS270S0300000_26.l2;
            if ((pipoCashierBaseFragment instanceof CashierFragment) && (cashierFragment = (CashierFragment) pipoCashierBaseFragment) != null) {
                cashierFragment.LLJJJ = EnumC1709190uZx.CONTINUE;
            }
            if (pipoCashierBaseFragment != null) {
                String str = PipoCashierBaseFragment._pnsPageId;
                pipoCashierBaseFragment.WR("return");
            }
            ((Function0) awS270S0300000_26.l1).invoke();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$112(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$113(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$114(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$115(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$116(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$117(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static final Object invoke$118(AwS270S0300000_26 awS270S0300000_26) {
        Context context = ((C1710850ucd) awS270S0300000_26.l0).getContext();
        if (context != null) {
            return ((CCDCCardNumberElementViewHolder) awS270S0300000_26.l1).S5(context, ((C1710340ubo) awS270S0300000_26.l2).LLILZ.invoke());
        }
        return C13BV.INSTANCE;
    }

    public static /* bridge */ /* synthetic */ Object invoke$119(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$120(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$121(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$122(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$123(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$124(AwS270S0300000_26 awS270S0300000_26) {
        int iIntValue;
        Object obj = ((WeakReference) awS270S0300000_26.l0).get();
        if (obj != null) {
            C1753750vjp c1753750vjp = (C1753750vjp) awS270S0300000_26.l1;
            Object obj2 = awS270S0300000_26.l2;
            synchronized (c1753750vjp) {
                if (c1753750vjp.LJ) {
                    Integer num = c1753750vjp.LIZLLL.get(obj2);
                    if (num != null && (iIntValue = num.intValue()) > 0) {
                        c1753750vjp.LIZLLL.put((V) obj2, Integer.valueOf(iIntValue - 1));
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Object objInvoke = c1753750vjp.LIZIZ.invoke((Context) obj, (V) obj2);
                        if (objInvoke != null) {
                            c1753750vjp.LIZJ.add((C1753760vjq<V, R>) new C1753760vjq(obj2, objInvoke));
                        }
                        if (obj2 != null && objInvoke != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("MainIdlePreloader execute: ");
                            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                            sbLIZ.append(' ');
                            sbLIZ.append(obj2.getClass());
                            sbLIZ.append(' ');
                            sbLIZ.append(objInvoke.getClass());
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                } else {
                    c1753750vjp.LJ = false;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$125(AwS270S0300000_26 awS270S0300000_26) {
        ((TemplateListViewModel) awS270S0300000_26.l0).setState(new AwS605S0100000_26((TopBannerInfo) awS270S0300000_26.l2, 619));
        ((C1729440v6c) awS270S0300000_26.l1).LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$126(AwS270S0300000_26 awS270S0300000_26) {
        ((TemplateListViewModel) awS270S0300000_26.l0).vQ2((ViewGroup) awS270S0300000_26.l1, (TemplateItem) awS270S0300000_26.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$127(AwS270S0300000_26 awS270S0300000_26) {
        ((TemplateListViewModel) awS270S0300000_26.l0).setState(new AwS605S0100000_26((TopBannerInfo) awS270S0300000_26.l2, 641));
        ((C1729440v6c) awS270S0300000_26.l1).LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$128(AwS270S0300000_26 awS270S0300000_26) {
        int size;
        C1721140utE c1721140utE = (C1721140utE) awS270S0300000_26.l0;
        CarouselDO carouselDO = (CarouselDO) awS270S0300000_26.l1;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) awS270S0300000_26.l2;
        c1721140utE.getClass();
        if (Intrinsics.LJFF(carouselDO.getRepeatable(), "1")) {
            viewOnAttachStateChangeListenerC20631115oD.setCurrentItem((c1721140utE.LLILZ + 1) % c1721140utE.LLILZLL, true);
        } else {
            int i = c1721140utE.LLILZ;
            List<CarouselItem> items = carouselDO.getItems();
            if (items != null) {
                size = items.size();
            } else {
                size = 0;
            }
            if (i < size) {
                viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(c1721140utE.LLILZ + 1, true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$129(AwS270S0300000_26 awS270S0300000_26) {
        String str;
        ProductPrice productPrice;
        PdpViewModel pdpViewModelJS = ((PdpFragment) awS270S0300000_26.l0).JS();
        PdpFragment pdpFragment = (PdpFragment) awS270S0300000_26.l0;
        ProductBase productBase = ((ProductPackStruct) awS270S0300000_26.l1).baseInfo;
        if (productBase != null && (productPrice = productBase.priceInfo) != null) {
            str = productPrice.realPrice;
        } else {
            str = null;
        }
        pdpViewModelJS.nS2(pdpFragment, str, (HashMap) awS270S0300000_26.l2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static final Object invoke$130(AwS270S0300000_26 awS270S0300000_26) {
        C1725060uzY c1725060uzY = (C1725060uzY) awS270S0300000_26.l0;
        C1710940ucm c1710940ucm = (C1710940ucm) awS270S0300000_26.l1;
        InterfaceC1725110uzd interfaceC1725110uzd = (InterfaceC1725110uzd) awS270S0300000_26.l2;
        c1725060uzY.getClass();
        C1725060uzY.LJI(c1710940ucm, null, interfaceC1725110uzd);
        return Unit.LIZ;
    }

    public static final Object invoke$131(AwS270S0300000_26 awS270S0300000_26) {
        C1725060uzY c1725060uzY = (C1725060uzY) awS270S0300000_26.l0;
        C1710940ucm c1710940ucm = (C1710940ucm) awS270S0300000_26.l1;
        InterfaceC1725110uzd interfaceC1725110uzd = (InterfaceC1725110uzd) awS270S0300000_26.l2;
        c1725060uzY.getClass();
        C1725060uzY.LJI(c1710940ucm, null, interfaceC1725110uzd);
        return Unit.LIZ;
    }

    public static final Object invoke$132(AwS270S0300000_26 awS270S0300000_26) {
        ImageView imageView = new ImageView((Context) awS270S0300000_26.l0);
        PipoCustomerNavData pipoCustomerNavData = (PipoCustomerNavData) awS270S0300000_26.l1;
        Context context = (Context) awS270S0300000_26.l0;
        try {
            C1721310utV c1721310utV = C1721310utV.LIZ;
            String str = pipoCustomerNavData.dialogHeaderImage;
            c1721310utV.getClass();
            if (C1721310utV.LIZ(str) != -1 && C1721310utV.LIZ(pipoCustomerNavData.dialogHeaderImage) != 0) {
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = C1721310utV.LIZ(pipoCustomerNavData.dialogHeaderImage);
                imageView.setImageDrawable(c0hti.LIZ(context));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1397580mTM c1397580mTM = new C1397580mTM((Context) awS270S0300000_26.l0);
        if (imageView.getDrawable() != null) {
            c1397580mTM.LJIIIZ = new C340160DVe((Context) awS270S0300000_26.l0, imageView);
        }
        c1397580mTM.LJI(((PipoCustomerNavData) awS270S0300000_26.l1).dialogTitle);
        c1397580mTM.LIZIZ(((PipoCustomerNavData) awS270S0300000_26.l1).dialogContent);
        C985403tE.LIZ(c1397580mTM, new AwS392S0200000_26((PipoCustomerNavData) awS270S0300000_26.l1, (SparkContext) awS270S0300000_26.l2, 176));
        new C1397510mTF(c1397580mTM).LIZLLL();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$133(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$134(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$135(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$136(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$137(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$138(AwS270S0300000_26 awS270S0300000_26) {
        PdpBodyVM pdpBodyVM = (PdpBodyVM) awS270S0300000_26.l0;
        InterfaceC2217241BqE interfaceC2217241BqE = (InterfaceC2217241BqE) awS270S0300000_26.l1;
        AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26((PdpBodyAssem) awS270S0300000_26.l2, 769);
        pdpBodyVM.getClass();
        AssemViewModel.selectSubscribe$default(pdpBodyVM, interfaceC2217241BqE, null, null, null, awS605S0100000_26, 14, null);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e4 A[PHI: r5
      0x02e4: PHI (r5v4 int) = (r5v1 int), (r5v1 int), (r5v6 int) binds: [B:101:0x024c, B:103:0x0250, B:110:0x025e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021f  */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0wG7] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.0wFD] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2, types: [D extends X.0wFD, X.0wFD] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$139(kotlin.jvm.internal.AwS270S0300000_26 r12) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS270S0300000_26.invoke$139(kotlin.jvm.internal.AwS270S0300000_26):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static final Object invoke$140(AwS270S0300000_26 awS270S0300000_26) {
        ((AbstractC1773460wFc) awS270S0300000_26.l0).LLILLL = (D) awS270S0300000_26.l1;
        if (((List) awS270S0300000_26.l2).isEmpty()) {
            new LinkedHashMap();
        } else {
            C08QT c08qt = new C08QT(C09RB.LJIJI(new C1939607ik((List) awS270S0300000_26.l2), AFwS231S0000000_3.get$arr$(240)));
            if (c08qt.hasNext()) {
                Object next = c08qt.next();
                while (c08qt.hasNext()) {
                    Map map = (Map) next;
                    map.putAll((Map) c08qt.next());
                    next = map;
                }
            } else {
                throw new UnsupportedOperationException("Empty sequence can't be reduced.");
            }
        }
        AbstractC1773460wFc abstractC1773460wFc = (AbstractC1773460wFc) awS270S0300000_26.l0;
        AbstractC1773210wFD abstractC1773210wFD = (AbstractC1773210wFD) awS270S0300000_26.l1;
        abstractC1773460wFc.R5(abstractC1773210wFD);
        abstractC1773460wFc.I5(abstractC1773210wFD);
        InterfaceC1773770wG7 interfaceC1773770wG7LJ = abstractC1773460wFc.LL.LJ();
        if (interfaceC1773770wG7LJ != null) {
            interfaceC1773770wG7LJ.LIZJ(abstractC1773210wFD, abstractC1773460wFc.itemView);
        }
        Iterator<InterfaceC1774020wGW> it2 = abstractC1773460wFc.LL.LJI().iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        abstractC1773460wFc.i6(abstractC1773210wFD, null);
        abstractC1773460wFc.U5(abstractC1773210wFD);
        abstractC1773460wFc.LLJIJIL = !abstractC1773460wFc.LLILZIL;
        abstractC1773210wFD.LJIILLIIL = true;
        abstractC1773460wFc.LLILZIL = false;
        return Unit.LIZ;
    }

    public static final Object invoke$141(AwS270S0300000_26 awS270S0300000_26) {
        AbstractC1773820wGC abstractC1773820wGC = (AbstractC1773820wGC) awS270S0300000_26.l0;
        LayoutInflater layoutInflater = (LayoutInflater) awS270S0300000_26.l1;
        ViewGroup viewGroup = (ViewGroup) awS270S0300000_26.l2;
        InterfaceC1773310wFN interfaceC1773310wFN = abstractC1773820wGC.LJ;
        if (interfaceC1773310wFN == null) {
            interfaceC1773310wFN = null;
        }
        return abstractC1773820wGC.LIZ(layoutInflater, viewGroup, interfaceC1773310wFN);
    }

    public static final Object invoke$142(AwS270S0300000_26 awS270S0300000_26) {
        C1733010vCN c1733010vCN = (C1733010vCN) awS270S0300000_26.l0;
        return c1733010vCN.LLILLJJLI.LJIJ((ECBillboard) awS270S0300000_26.l1, (Map) awS270S0300000_26.l2, c1733010vCN.getPageType());
    }

    public static final Object invoke$143(AwS270S0300000_26 awS270S0300000_26) {
        C1733010vCN c1733010vCN = (C1733010vCN) awS270S0300000_26.l0;
        return c1733010vCN.LLILLJJLI.LJIJ((ECBillboard) awS270S0300000_26.l1, (Map) awS270S0300000_26.l2, c1733010vCN.getPageType());
    }

    public static final Object invoke$144(AwS270S0300000_26 awS270S0300000_26) {
        C1733010vCN c1733010vCN = (C1733010vCN) awS270S0300000_26.l0;
        return c1733010vCN.LLILLJJLI.LJIJ((ECBillboard) awS270S0300000_26.l1, (Map) awS270S0300000_26.l2, c1733010vCN.getPageType());
    }

    public static final Object invoke$145(AwS270S0300000_26 awS270S0300000_26) {
        Map<String, ? extends Object> map;
        String str;
        String str2;
        EnumC1768240w7C enumC1768240w7C;
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        C1767790w6T c1767790w6T = (C1767790w6T) awS270S0300000_26.l0;
        ReachCfgDataForMall reachCfgDataForMall = ((ShopTabModuleData) awS270S0300000_26.l1).reachCfgDataForMall;
        Map<String, Object> mapLJ = null;
        if (reachCfgDataForMall != null) {
            map = reachCfgDataForMall.tabUiTrackParams;
        } else {
            map = null;
        }
        IEcUgBtmService iEcUgBtmService = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null);
        if (iEcUgBtmService != null) {
            mapLJ = iEcUgBtmService.LJ((C1740600vOc) awS270S0300000_26.l2);
        }
        c1767950w6j.getClass();
        boolean zIsMallBottomTab = c1767790w6T.LJ.isMallBottomTab();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (zIsMallBottomTab) {
            str = "mall";
        } else {
            str = "homepage";
        }
        linkedHashMap.put("tab_name", str);
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str3 = c1767790w6T.LJIIIZ;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("enter_from", str3);
        String value = c1767790w6T.LJII;
        if (value == null) {
            value = EnumC1593910ra1.CLICK_TAB.getValue();
        }
        linkedHashMap.put("enter_method", value);
        if (zIsMallBottomTab) {
            str2 = "homepage_bottom_tab";
        } else {
            str2 = "homepage_top_tab";
        }
        linkedHashMap.put("mall_entrance", str2);
        if (map != null) {
            linkedHashMap.putAll(map);
        } else {
            linkedHashMap.put("red_dot_type", EnumC1754390vkr.NONE.getValue());
        }
        String str4 = c1767790w6T.LJI;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("mall_extra_info", str4);
        C1767830w6X c1767830w6X = c1767790w6T.LJIIJJI;
        if (c1767830w6X == null || (enumC1768240w7C = c1767830w6X.LIZIZ) == null) {
            enumC1768240w7C = EnumC1768240w7C.DEFAULT;
        }
        linkedHashMap.put("bubble_aware_type", enumC1768240w7C.getSubStageForDa());
        if (mapLJ != null) {
            linkedHashMap.putAll(mapLJ);
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        for (Map.Entry entry : BtmSDK.createReportParams$default(btmSDK, "c80006.d0", PageFinder.via(btmSDK.getCurrentResumedPage()), null, 4, null).entrySet()) {
            Object key = entry.getKey();
            Object value2 = entry.getValue();
            if (value2 == null) {
                value2 = "";
            }
            linkedHashMap.put(key, value2);
        }
        C1767950w6j.LJIILLIIL("tiktokec_mall_entrance_click", linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$146(AwS270S0300000_26 awS270S0300000_26) {
        Object next;
        Function1<Object, Unit> function1;
        List list = (List) awS270S0300000_26.l0;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((C1746370vXv) next).LIZ == 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1746370vXv c1746370vXv = (C1746370vXv) next;
            if (c1746370vXv != null && (function1 = c1746370vXv.LIZIZ) != null) {
                function1.invoke(null);
            }
        }
        AddressEditViewModel addressEditViewModel = (AddressEditViewModel) awS270S0300000_26.l1;
        C1745480vWU c1745480vWU = addressEditViewModel.LLJJIJIL;
        ((C1746340vXs) awS270S0300000_26.l2).getClass();
        C1745480vWU.LJ(c1745480vWU, "back", C1746340vXs.LIZLLL(addressEditViewModel), null, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$147(AwS270S0300000_26 awS270S0300000_26) {
        AddressEditViewModel addressEditViewModel = (AddressEditViewModel) awS270S0300000_26.l0;
        C1745480vWU c1745480vWU = addressEditViewModel.LLJJIJIL;
        ((C1746340vXs) awS270S0300000_26.l1).getClass();
        Map mapLIZLLL = C1746340vXs.LIZLLL(addressEditViewModel);
        c1745480vWU.getClass();
        C1745480vWU.LIZ("delete_address", "yes", null, null, mapLIZLLL);
        AddressEditViewModel addressEditViewModel2 = (AddressEditViewModel) awS270S0300000_26.l0;
        addressEditViewModel2.getClass();
        C948503nH.LJFF(addressEditViewModel2, C23271099x.INSTANCE, new C041R(addressEditViewModel2, null));
        ((Function0) awS270S0300000_26.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$148(AwS270S0300000_26 awS270S0300000_26) {
        AddressEditViewModel addressEditViewModel = (AddressEditViewModel) awS270S0300000_26.l0;
        C1745480vWU c1745480vWU = addressEditViewModel.LLJJIJIL;
        ((C1746340vXs) awS270S0300000_26.l1).getClass();
        Map mapLIZLLL = C1746340vXs.LIZLLL(addressEditViewModel);
        c1745480vWU.getClass();
        C1745480vWU.LIZ("delete_address", "no", null, null, mapLIZLLL);
        ((Function0) awS270S0300000_26.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$149(AwS270S0300000_26 awS270S0300000_26) {
        if (C0DHG.LIZ() && C1388190mED.LIZ((C19EG) awS270S0300000_26.l0) != null) {
            C632670Orh.LIZIZ((C19EG) awS270S0300000_26.l0, new C19719212De(-1383312640, new AwS494S0200000_33((AddressEditViewModel) awS270S0300000_26.l1, (C1746340vXs) awS270S0300000_26.l2, 2), true));
        } else {
            C1397580mTM c1397580mTM = new C1397580mTM((C19EG) awS270S0300000_26.l0);
            c1397580mTM.LJFF(2131848082);
            c1397580mTM.LIZ(2131848081);
            C985403tE.LIZ(c1397580mTM, new AwS392S0200000_26((AddressEditViewModel) awS270S0300000_26.l1, (C1746340vXs) awS270S0300000_26.l2, 216));
            c1397580mTM.LJII = true;
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        AddressEditViewModel addressEditViewModel = (AddressEditViewModel) awS270S0300000_26.l1;
        C1745480vWU c1745480vWU = addressEditViewModel.LLJJIJIL;
        ((C1746340vXs) awS270S0300000_26.l2).getClass();
        Map mapLIZLLL = C1746340vXs.LIZLLL(addressEditViewModel);
        c1745480vWU.getClass();
        C1745480vWU.LIZJ("delete_address", null, mapLIZLLL);
        AddressEditViewModel addressEditViewModel2 = (AddressEditViewModel) awS270S0300000_26.l1;
        C1745480vWU c1745480vWU2 = addressEditViewModel2.LLJJIJIL;
        ((C1746340vXs) awS270S0300000_26.l2).getClass();
        C1745480vWU.LJ(c1745480vWU2, "delete_address", C1746340vXs.LIZLLL(addressEditViewModel2), null, 4);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static final Object invoke$150(AwS270S0300000_26 awS270S0300000_26) {
        String str;
        Object c098200Yq;
        String str2;
        VerifyDetail verifyDetailLJIIIIZZ = ((C1713570uh1) awS270S0300000_26.l0).LJIIIIZZ();
        String str3 = "";
        if (verifyDetailLJIIIIZZ == null || (str = verifyDetailLJIIIIZZ.title) == null) {
            str = "";
        }
        ArrayList arrayList = null;
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            if (verifyDetailLJIIIIZZ != null) {
                str2 = verifyDetailLJIIIIZZ.content;
            } else {
                str2 = null;
            }
            Type type = new TypeToken<List<? extends PopupContent>>() { // from class: X.0uiO
            }.getType();
            c1227904rF.getClass();
            c098200Yq = (List) C1227904rF.LIZJ(str2, type);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        List<PopupContent> list = (List) c098200Yq;
        if (list != null) {
            for (PopupContent popupContent : list) {
                if (Intrinsics.LJFF(popupContent.type, "hint")) {
                    String str4 = popupContent.desc;
                    if (str4 != null) {
                        str3 = str4;
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        C1713570uh1 c1713570uh1 = (C1713570uh1) awS270S0300000_26.l0;
        if (c1713570uh1 != null && c1713570uh1.LJII() != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("popup_id", "verify_alert_popup");
            InterfaceC1713820uhQ interfaceC1713820uhQ = C1713600uh4.LIZJ;
            if (interfaceC1713820uhQ != null) {
                interfaceC1713820uhQ.onEventV3("rd_pipo_veri_center_popup_show", linkedHashMap);
            }
        }
        C1715530ukB c1715530ukB = C1715530ukB.LIZ;
        Context context = (Context) awS270S0300000_26.l1;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.LJFF(((PopupContent) obj).type, "button")) {
                    arrayList.add(obj);
                }
            }
        }
        C1715530ukB c1715530ukB2 = C1715530ukB.LIZ;
        C1713570uh1 c1713570uh12 = (C1713570uh1) awS270S0300000_26.l0;
        c1715530ukB2.getClass();
        ArrayList arrayList2 = new ArrayList();
        C1714230ui5.LIZLLL(new AwS427S0200000_26(c1713570uh12, (C1713570uh1) arrayList2, (List<Pair<String, String>>) 97));
        Function1 function1 = (Function1) awS270S0300000_26.l2;
        c1715530ukB.getClass();
        C1715530ukB.LIZIZ(context, str, str3, arrayList, arrayList2, function1);
        return Unit.LIZ;
    }

    public static final Object invoke$151(AwS270S0300000_26 awS270S0300000_26) {
        boolean z;
        int length;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WRAP_META fromStream=");
        sbLIZ.append(System.identityHashCode((C1515820pY4) awS270S0300000_26.l0));
        sbLIZ.append(" wrappedStream=");
        sbLIZ.append(System.identityHashCode((C1515820pY4) awS270S0300000_26.l1));
        sbLIZ.append(" reqInfoNull=");
        boolean z2 = true;
        if (((C1494600ozq) awS270S0300000_26.l2) == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" urlPresent=");
        C1494600ozq c1494600ozq = (C1494600ozq) awS270S0300000_26.l2;
        if (c1494600ozq == null || c1494600ozq.LJIIZILJ == null) {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(" reqLogLen=");
        C1494600ozq c1494600ozq2 = (C1494600ozq) awS270S0300000_26.l2;
        if (c1494600ozq2 != null && (str = c1494600ozq2.LJJIIJ) != null) {
            length = str.length();
        } else {
            length = -1;
        }
        sbLIZ.append(length);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$152(AwS270S0300000_26 awS270S0300000_26) {
        boolean z;
        int length;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WRAP_META fromStream=");
        sbLIZ.append(System.identityHashCode((C1515820pY4) awS270S0300000_26.l0));
        sbLIZ.append(" wrappedStream=");
        sbLIZ.append(System.identityHashCode((C1515820pY4) awS270S0300000_26.l1));
        sbLIZ.append(" reqInfoNull=");
        boolean z2 = true;
        if (((C1494600ozq) awS270S0300000_26.l2) == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" urlPresent=");
        C1494600ozq c1494600ozq = (C1494600ozq) awS270S0300000_26.l2;
        if (c1494600ozq == null || c1494600ozq.LJIIZILJ == null) {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(" reqLogLen=");
        C1494600ozq c1494600ozq2 = (C1494600ozq) awS270S0300000_26.l2;
        if (c1494600ozq2 != null && (str = c1494600ozq2.LJJIIJ) != null) {
            length = str.length();
        } else {
            length = -1;
        }
        sbLIZ.append(length);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$153(AwS270S0300000_26 awS270S0300000_26) {
        C1054004Ag c1054004Ag = ((PdpHeadNavBarWidget) awS270S0300000_26.l0).LJIJI().LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            View view = ((PdpHeadNavBarWidget) awS270S0300000_26.l0).LLILZ;
            Map map = (Map) awS270S0300000_26.l1;
            if (view != null) {
                C1748720vbi.LIZLLL(view, new C1748670vbd(), new AwS367S0200000_1(c1054004Ag, (C1054004Ag) map, (Map<String, ? extends Object>) 342));
            }
        }
        ((C0QY2) awS270S0300000_26.l2).rj();
        ((C0QY2) awS270S0300000_26.l2).Aj();
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0236  */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.0vPU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$154(kotlin.jvm.internal.AwS270S0300000_26 r26) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS270S0300000_26.invoke$154(kotlin.jvm.internal.AwS270S0300000_26):java.lang.Object");
    }

    public static final Object invoke$155(AwS270S0300000_26 awS270S0300000_26) {
        boolean zLJFF;
        C1750810vf5 c1750810vf5 = ((PdpViewModel) awS270S0300000_26.l0).LLLLZIL;
        View view = (View) awS270S0300000_26.l1;
        Map map = (Map) awS270S0300000_26.l2;
        if (map != null) {
            zLJFF = Intrinsics.LJFF(map.get("isFavorite"), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        c1750810vf5.LIZ(view, ((PdpViewModel) awS270S0300000_26.l0).LLILZIL.LJ("c7829.d57184"), zLJFF);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$156(AwS270S0300000_26 awS270S0300000_26) {
        boolean zBooleanValue;
        GalleryViewerViewModel galleryViewerViewModel = ((C1761450vwF) awS270S0300000_26.l0).LLILLJJLI;
        if (galleryViewerViewModel != null) {
            View view = (View) awS270S0300000_26.l1;
            String strValueOf = String.valueOf(((C1761290vvz) awS270S0300000_26.l2).LIZ);
            Boolean bool = ((C1761290vvz) awS270S0300000_26.l2).LJ;
            int iIntValue = 0;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Integer num = ((C1761290vvz) awS270S0300000_26.l2).LIZLLL;
            if (num != null) {
                iIntValue = num.intValue();
            }
            C1761290vvz c1761290vvz = (C1761290vvz) awS270S0300000_26.l2;
            C1761450vwF c1761450vwF = (C1761450vwF) awS270S0300000_26.l0;
            galleryViewerViewModel.vQ2(view, strValueOf, zBooleanValue, iIntValue, c1761290vvz, c1761450vwF.LLILLL, c1761450vwF);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$157(AwS270S0300000_26 awS270S0300000_26) {
        boolean zBooleanValue;
        GalleryViewerViewModel galleryViewerViewModel = ((C1761450vwF) awS270S0300000_26.l0).LLILLJJLI;
        if (galleryViewerViewModel != null) {
            View view = (View) awS270S0300000_26.l1;
            String strValueOf = String.valueOf(((C1761290vvz) awS270S0300000_26.l2).LIZ);
            Boolean bool = ((C1761290vvz) awS270S0300000_26.l2).LJ;
            int iIntValue = 0;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Integer num = ((C1761290vvz) awS270S0300000_26.l2).LIZLLL;
            if (num != null) {
                iIntValue = num.intValue();
            }
            C1761290vvz c1761290vvz = (C1761290vvz) awS270S0300000_26.l2;
            C1761450vwF c1761450vwF = (C1761450vwF) awS270S0300000_26.l0;
            galleryViewerViewModel.vQ2(view, strValueOf, zBooleanValue, iIntValue, c1761290vvz, c1761450vwF.LLILLL, c1761450vwF);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$158(AwS270S0300000_26 awS270S0300000_26) {
        boolean zBooleanValue;
        GalleryViewerViewModel galleryViewerViewModel = ((C1761440vwE) awS270S0300000_26.l0).LLILLJJLI;
        if (galleryViewerViewModel != null) {
            View view = (View) awS270S0300000_26.l1;
            String strValueOf = String.valueOf(((C1761290vvz) awS270S0300000_26.l2).LIZ);
            Boolean bool = ((C1761290vvz) awS270S0300000_26.l2).LJ;
            int iIntValue = 0;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Integer num = ((C1761290vvz) awS270S0300000_26.l2).LIZLLL;
            if (num != null) {
                iIntValue = num.intValue();
            }
            C1761290vvz c1761290vvz = (C1761290vvz) awS270S0300000_26.l2;
            C1761440vwE c1761440vwE = (C1761440vwE) awS270S0300000_26.l0;
            galleryViewerViewModel.vQ2(view, strValueOf, zBooleanValue, iIntValue, c1761290vvz, c1761440vwE.LLILLL, c1761440vwE);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$159(AwS270S0300000_26 awS270S0300000_26) {
        boolean zBooleanValue;
        GalleryViewerViewModel galleryViewerViewModel = ((C1761440vwE) awS270S0300000_26.l0).LLILLJJLI;
        if (galleryViewerViewModel != null) {
            View view = (View) awS270S0300000_26.l1;
            String strValueOf = String.valueOf(((C1761290vvz) awS270S0300000_26.l2).LIZ);
            Boolean bool = ((C1761290vvz) awS270S0300000_26.l2).LJ;
            int iIntValue = 0;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Integer num = ((C1761290vvz) awS270S0300000_26.l2).LIZLLL;
            if (num != null) {
                iIntValue = num.intValue();
            }
            C1761290vvz c1761290vvz = (C1761290vvz) awS270S0300000_26.l2;
            C1761440vwE c1761440vwE = (C1761440vwE) awS270S0300000_26.l0;
            galleryViewerViewModel.vQ2(view, strValueOf, zBooleanValue, iIntValue, c1761290vvz, c1761440vwE.LLILLL, c1761440vwE);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$160(AwS270S0300000_26 awS270S0300000_26) {
        boolean zBooleanValue;
        GalleryViewerViewModel galleryViewerViewModel = ((C1761430vwD) awS270S0300000_26.l0).LLILLJJLI;
        if (galleryViewerViewModel != null) {
            View view = (View) awS270S0300000_26.l1;
            String strValueOf = String.valueOf(((C1761290vvz) awS270S0300000_26.l2).LIZ);
            Boolean bool = ((C1761290vvz) awS270S0300000_26.l2).LJ;
            int iIntValue = 0;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Integer num = ((C1761290vvz) awS270S0300000_26.l2).LIZLLL;
            if (num != null) {
                iIntValue = num.intValue();
            }
            C1761290vvz c1761290vvz = (C1761290vvz) awS270S0300000_26.l2;
            C1761430vwD c1761430vwD = (C1761430vwD) awS270S0300000_26.l0;
            galleryViewerViewModel.vQ2(view, strValueOf, zBooleanValue, iIntValue, c1761290vvz, c1761430vwD.LLILLL, c1761430vwD);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$161(AwS270S0300000_26 awS270S0300000_26) {
        boolean zBooleanValue;
        GalleryViewerViewModel galleryViewerViewModel = ((C1761460vwG) awS270S0300000_26.l0).LLILLJJLI;
        if (galleryViewerViewModel != null) {
            View view = (View) awS270S0300000_26.l1;
            String strValueOf = String.valueOf(((C1761290vvz) awS270S0300000_26.l2).LIZ);
            Boolean bool = ((C1761290vvz) awS270S0300000_26.l2).LJ;
            int iIntValue = 0;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Integer num = ((C1761290vvz) awS270S0300000_26.l2).LIZLLL;
            if (num != null) {
                iIntValue = num.intValue();
            }
            C1761290vvz c1761290vvz = (C1761290vvz) awS270S0300000_26.l2;
            C1761460vwG c1761460vwG = (C1761460vwG) awS270S0300000_26.l0;
            galleryViewerViewModel.vQ2(view, strValueOf, zBooleanValue, iIntValue, c1761290vvz, c1761460vwG.LLILLL, c1761460vwG);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$162(AwS270S0300000_26 awS270S0300000_26) {
        boolean zBooleanValue;
        GalleryViewerViewModel galleryViewerViewModel = ((C1761460vwG) awS270S0300000_26.l0).LLILLJJLI;
        if (galleryViewerViewModel != null) {
            View view = (View) awS270S0300000_26.l1;
            String strValueOf = String.valueOf(((C1761290vvz) awS270S0300000_26.l2).LIZ);
            Boolean bool = ((C1761290vvz) awS270S0300000_26.l2).LJ;
            int iIntValue = 0;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Integer num = ((C1761290vvz) awS270S0300000_26.l2).LIZLLL;
            if (num != null) {
                iIntValue = num.intValue();
            }
            C1761290vvz c1761290vvz = (C1761290vvz) awS270S0300000_26.l2;
            C1761460vwG c1761460vwG = (C1761460vwG) awS270S0300000_26.l0;
            galleryViewerViewModel.vQ2(view, strValueOf, zBooleanValue, iIntValue, c1761290vvz, c1761460vwG.LLILLL, c1761460vwG);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$20(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$22(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$24(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$25(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$26(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$27(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$28(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$29(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$30(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$31(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$32(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$33(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$34(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$35(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$36(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$37(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$38(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$39(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$40(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$41(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$42(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$43(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$44(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$45(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$46(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$47(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$48(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$49(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS270S0300000_26 r5) {
        /*
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel) r0
            X.0vf5 r4 = r0.LLLLZIL
            java.lang.Object r3 = r5.l1
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r0 = r5.l2
            X.0vfA r0 = (X.InterfaceC1750860vfA) r0
            X.0vf9 r0 = r0.getFavoriteReq()
            if (r0 == 0) goto L2d
            boolean r0 = r0.isFavorite()
            r2 = 1
            if (r0 != r2) goto L2d
        L1b:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel) r0
            X.04Ae r1 = r0.LLILZIL
            java.lang.String r0 = "c7829.d57184"
            java.util.Map r0 = r1.LJ(r0)
            r4.LIZ(r3, r0, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2d:
            r2 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS270S0300000_26.invoke$5(kotlin.jvm.internal.AwS270S0300000_26):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$50(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$51(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$52(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$53(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$54(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$55(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$56(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$57(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$58(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$59(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static final Object invoke$6(AwS270S0300000_26 awS270S0300000_26) {
        Map<String, WeakReference<C1721420utg>> map = C1720940usu.LIZ;
        return C1720940usu.LIZ(((C1720720usY) awS270S0300000_26.l0).getContext(), ((C1720720usY) awS270S0300000_26.l0).LLILZ, (CardDO) awS270S0300000_26.l1, (Fragment) awS270S0300000_26.l2);
    }

    public static /* bridge */ /* synthetic */ Object invoke$60(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$61(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$62(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$63(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$64(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$65(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$66(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$67(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$68(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$69(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Fragment parentFragment = ((Fragment) awS270S0300000_26.l0).getParentFragment();
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        while (true) {
            if (parentFragment != null) {
                try {
                    viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                    break;
                } catch (C1076240e74 e) {
                    TryCatchGuardChecker.doCheck(e);
                    parentFragment = parentFragment.getParentFragment();
                }
            } else {
                viewModel = null;
                break;
            }
        }
        if (viewModel == null) {
            return ViewModelProviders.of(((Fragment) awS270S0300000_26.l0).requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        return viewModel;
    }

    public static /* bridge */ /* synthetic */ Object invoke$70(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$71(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$72(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$73(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$74(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$75(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$76(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$77(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$78(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$79(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$80(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$81(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static final Object invoke$82(AwS270S0300000_26 awS270S0300000_26) {
        C1054104Ah c1054104Ah = ((SeaPdpHeadNavBarWidget) awS270S0300000_26.l0).LJIL().LLJLIL;
        if (c1054104Ah != null) {
            HashMap map = new HashMap();
            PDPBenefitInfo pDPBenefitInfo = (PDPBenefitInfo) awS270S0300000_26.l2;
            if (pDPBenefitInfo != null) {
                Integer num = pDPBenefitInfo.bizType;
                int value = EnumC310840CGk.CUT_PRICE.getValue();
                if (num != null && num.intValue() == value) {
                    map.put("button_type", "cut_price");
                }
            }
            C1054104Ah.LJIIL(c1054104Ah, "product_share", map, (Map) awS270S0300000_26.l1, null, 20);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$83(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$84(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Fragment parentFragment = ((Fragment) awS270S0300000_26.l0).getParentFragment();
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        while (true) {
            if (parentFragment != null) {
                try {
                    viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                    break;
                } catch (C1076240e74 e) {
                    TryCatchGuardChecker.doCheck(e);
                    parentFragment = parentFragment.getParentFragment();
                }
            } else {
                viewModel = null;
                break;
            }
        }
        if (viewModel == null) {
            return ViewModelProviders.of(((Fragment) awS270S0300000_26.l0).requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        return viewModel;
    }

    public static /* bridge */ /* synthetic */ Object invoke$85(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$86(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$87(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$88(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$89(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$90(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$91(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$92(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$93(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$94(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    public static final Object invoke$95(AwS270S0300000_26 awS270S0300000_26) {
        Function0<Unit> function0;
        CashierFragment cashierFragment;
        C1709070uZl c1709070uZl = ((CashierEnterParams) awS270S0300000_26.l0).LIZIZ;
        EnumC1709200uZy enumC1709200uZy = null;
        if (c1709070uZl != null) {
            enumC1709200uZy = c1709070uZl.LIZIZ;
        }
        if (enumC1709200uZy == EnumC1709200uZy.CONTINUE) {
            ((C1709570uaZ) awS270S0300000_26.l1).LJIJ(true);
            Fragment fragmentLJI = C724240Sb0.LJI((CashierAssem) awS270S0300000_26.l2);
            if ((fragmentLJI instanceof CashierFragment) && (cashierFragment = (CashierFragment) fragmentLJI) != null) {
                cashierFragment.LLJJJ = EnumC1709190uZx.CONTINUE;
                cashierFragment.WR("return");
            }
        }
        C1709220ua0 c1709220ua0 = ((CashierEnterParams) awS270S0300000_26.l0).LJ;
        if (c1709220ua0 != null && (function0 = c1709220ua0.LIZJ) != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$96(AwS270S0300000_26 awS270S0300000_26) {
        return ViewModelProviders.of(((Fragment) awS270S0300000_26.l0).requireActivity(), C1076250e75.LIZ).get(C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName(), C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
    }

    public static /* bridge */ /* synthetic */ Object invoke$97(AwS270S0300000_26 awS270S0300000_26) {
        return ViewModelProviders.of(((Fragment) awS270S0300000_26.l0).getParentFragment(), C1076250e75.LIZ).get(C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName(), C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
    }

    public static /* bridge */ /* synthetic */ Object invoke$98(AwS270S0300000_26 awS270S0300000_26) {
        return ViewModelProviders.of(((Fragment) awS270S0300000_26.l0).getParentFragment(), C1076250e75.LIZ).get(C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName(), C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
    }

    public static /* bridge */ /* synthetic */ Object invoke$99(AwS270S0300000_26 awS270S0300000_26) {
        ViewModel viewModel;
        Object objLIZIZ = C1745060vVo.LIZIZ(((JediViewHolder) awS270S0300000_26.l0).R5());
        String name = C09R7.LIZ((C13IQ) awS270S0300000_26.l2).getName();
        if (objLIZIZ instanceof Fragment) {
            Fragment fragment = (Fragment) objLIZIZ;
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment != null) {
                    try {
                        viewModel = ViewModelProviders.of(parentFragment, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
                        break;
                    } catch (C1076240e74 e) {
                        TryCatchGuardChecker.doCheck(e);
                        parentFragment = parentFragment.getParentFragment();
                    }
                } else {
                    viewModel = null;
                    break;
                }
            }
            if (viewModel == null) {
                return ViewModelProviders.of(fragment.requireActivity(), C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
            }
            return viewModel;
        }
        if (objLIZIZ instanceof C19EG) {
            return ViewModelProviders.of((C19EG) objLIZIZ, C1076250e75.LIZ).get(name, C09R7.LIZ((C13IQ) awS270S0300000_26.l1));
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(C1515820pY4 c1515820pY4, C1515820pY4<Object> c1515820pY42, C1515820pY4<Object> c1515820pY43, C1494600ozq<?> c1494600ozq) {
        super(0);
        this.$t = c1494600ozq;
        this.l0 = c1515820pY4;
        this.l1 = c1515820pY42;
        this.l2 = c1515820pY43;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(C1710340ubo c1710340ubo, CCDCCardNumberElementViewHolder cCDCCardNumberElementViewHolder, C1710850ucd c1710850ucd, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1710850ucd;
        this.l1 = cCDCCardNumberElementViewHolder;
        this.l2 = c1710340ubo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(C1720720usY c1720720usY, CardDO cardDO, Fragment fragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1720720usY;
        this.l1 = cardDO;
        this.l2 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(C1721140utE c1721140utE, CarouselDO carouselDO, ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1721140utE;
        this.l1 = carouselDO;
        this.l2 = viewOnAttachStateChangeListenerC20631115oD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(C1725060uzY c1725060uzY, C1710940ucm c1710940ucm, C921403iu c921403iu, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1725060uzY;
        this.l1 = c1710940ucm;
        this.l2 = c921403iu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(C1725060uzY c1725060uzY, C1710940ucm c1710940ucm, InterfaceC1725110uzd interfaceC1725110uzd, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1725060uzY;
        this.l1 = c1710940ucm;
        this.l2 = interfaceC1725110uzd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(C1733010vCN c1733010vCN, C1733010vCN c1733010vCN2, ECBillboard eCBillboard, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.l0 = c1733010vCN;
        this.l1 = c1733010vCN2;
        this.l2 = eCBillboard;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(C1761430vwD c1761430vwD, View view, C1761290vvz c1761290vvz, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1761430vwD;
        this.l1 = view;
        this.l2 = c1761290vvz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(C1761440vwE c1761440vwE, View view, C1761290vvz c1761290vvz, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1761440vwE;
        this.l1 = view;
        this.l2 = c1761290vvz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(C1761450vwF c1761450vwF, View view, C1761290vvz c1761290vvz, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1761450vwF;
        this.l1 = view;
        this.l2 = c1761290vvz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(C1761460vwG c1761460vwG, View view, C1761290vvz c1761290vvz, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1761460vwG;
        this.l1 = view;
        this.l2 = c1761290vvz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(C1767790w6T c1767790w6T, ShopTabModuleData shopTabModuleData, C1740600vOc c1740600vOc, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1767790w6T;
        this.l1 = shopTabModuleData;
        this.l2 = c1740600vOc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(AbstractC1773210wFD abstractC1773210wFD, AbstractC1773210wFD abstractC1773210wFD2, AbstractC1773820wGC<AbstractC1773210wFD, AbstractC1773460wFc<Object>> abstractC1773820wGC, AbstractC1773460wFc<Object> abstractC1773460wFc) {
        super(0);
        this.$t = abstractC1773460wFc;
        this.l0 = abstractC1773210wFD;
        this.l1 = abstractC1773210wFD2;
        this.l2 = abstractC1773820wGC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(AbstractC1773460wFc abstractC1773460wFc, AbstractC1773460wFc<Object> abstractC1773460wFc2, AbstractC1773210wFD abstractC1773210wFD, List<Object> list) {
        super(0);
        this.$t = list;
        this.l0 = abstractC1773460wFc;
        this.l1 = abstractC1773460wFc2;
        this.l2 = abstractC1773210wFD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(AbstractC1773820wGC abstractC1773820wGC, AbstractC1773820wGC<AbstractC1773210wFD, AbstractC1773460wFc<Object>> abstractC1773820wGC2, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(0);
        this.$t = viewGroup;
        this.l0 = abstractC1773820wGC;
        this.l1 = abstractC1773820wGC2;
        this.l2 = layoutInflater;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(C19EG c19eg, AddressEditViewModel addressEditViewModel, C1746340vXs c1746340vXs, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = addressEditViewModel;
        this.l2 = c1746340vXs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(Context context, C1713570uh1 c1713570uh1, AwS605S0100000_26 awS605S0100000_26, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1713570uh1;
        this.l1 = context;
        this.l2 = awS605S0100000_26;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(Context context, PipoCustomerNavData pipoCustomerNavData, SparkContext sparkContext, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = pipoCustomerNavData;
        this.l2 = sparkContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(Fragment fragment, C13IQ c13iq, C13IQ c13iq2, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = c13iq;
        this.l2 = c13iq2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(JediViewHolder jediViewHolder, C13IQ c13iq, C13IQ c13iq2, int i) {
        super(0);
        this.$t = i;
        this.l0 = jediViewHolder;
        this.l1 = c13iq;
        this.l2 = c13iq2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(AddressEditViewModel addressEditViewModel, AddressEditViewModel addressEditViewModel2, C1746340vXs c1746340vXs, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = addressEditViewModel;
        this.l1 = addressEditViewModel2;
        this.l2 = c1746340vXs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(SeaPdpBodyWidget seaPdpBodyWidget, SeaPdpBodyWidget seaPdpBodyWidget2, List<? extends Object> list, C1338430kvx c1338430kvx) {
        super(0);
        this.$t = c1338430kvx;
        this.l0 = seaPdpBodyWidget;
        this.l1 = seaPdpBodyWidget2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget, SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget2, Map<String, ? extends Object> map, PDPBenefitInfo pDPBenefitInfo) {
        super(0);
        this.$t = pDPBenefitInfo;
        this.l0 = seaPdpHeadNavBarWidget;
        this.l1 = seaPdpHeadNavBarWidget2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(PdpFragment pdpFragment, PdpFragment pdpFragment2, ProductPackStruct productPackStruct, HashMap<String, Object> map) {
        super(0);
        this.$t = map;
        this.l0 = pdpFragment;
        this.l1 = pdpFragment2;
        this.l2 = productPackStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(PdpBodyVM pdpBodyVM, InterfaceC2217241BqE interfaceC2217241BqE, PdpBodyAssem pdpBodyAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpBodyVM;
        this.l1 = interfaceC2217241BqE;
        this.l2 = pdpBodyAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(PdpHeadNavBarWidget pdpHeadNavBarWidget, PdpHeadNavBarWidget pdpHeadNavBarWidget2, Map<String, ? extends Object> map, C0QY2 c0qy2) {
        super(0);
        this.$t = c0qy2;
        this.l0 = pdpHeadNavBarWidget;
        this.l1 = pdpHeadNavBarWidget2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(PdpViewModel pdpViewModel, View view, InterfaceC1750860vfA interfaceC1750860vfA, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = view;
        this.l2 = interfaceC1750860vfA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(PdpViewModel pdpViewModel, PdpViewModel pdpViewModel2, View view, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.l0 = pdpViewModel;
        this.l1 = pdpViewModel2;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(ShopMallMixFragment shopMallMixFragment, Function0 function0, Function0 function02, int i) {
        super(0);
        this.$t = i;
        this.l0 = function0;
        this.l1 = shopMallMixFragment;
        this.l2 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(TemplateListViewModel templateListViewModel, C1729440v6c c1729440v6c, TopBannerInfo topBannerInfo, int i) {
        super(0);
        this.$t = i;
        this.l0 = templateListViewModel;
        this.l1 = c1729440v6c;
        this.l2 = topBannerInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(TemplateListViewModel templateListViewModel, ViewGroup viewGroup, TemplateItem templateItem, int i) {
        super(0);
        this.$t = i;
        this.l0 = templateListViewModel;
        this.l1 = viewGroup;
        this.l2 = templateItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0300000_26(CashierEnterParams cashierEnterParams, C1709570uaZ c1709570uaZ, CashierAssem cashierAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = cashierEnterParams;
        this.l1 = c1709570uaZ;
        this.l2 = cashierAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(CashierEnterParams cashierEnterParams, CashierEnterParams cashierEnterParams2, Function0<Unit> function0, PipoCashierBaseFragment pipoCashierBaseFragment) {
        super(0);
        this.$t = pipoCashierBaseFragment;
        this.l0 = cashierEnterParams;
        this.l1 = cashierEnterParams2;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(WeakReference weakReference, WeakReference<Context> weakReference2, C1753750vjp<V, R> c1753750vjp, V v) {
        super(0);
        this.$t = v;
        this.l0 = weakReference;
        this.l1 = weakReference2;
        this.l2 = c1753750vjp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS270S0300000_26(List list, List<C1746370vXv> list2, AddressEditViewModel addressEditViewModel, C1746340vXs c1746340vXs) {
        super(0);
        this.$t = c1746340vXs;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = addressEditViewModel;
    }
}
