package kotlin.jvm.internal;

import X.AbstractC1250290idn;
import X.C04AG;
import X.C09AY;
import X.C123100dR;
import X.C1251150ifB;
import X.C1261860iwS;
import X.C13LP;
import X.C13LQ;
import X.C1697810uHb;
import X.C1712450ufD;
import X.C1713290ugZ;
import X.C1713300uga;
import X.C1742800vSA;
import X.C1742910vSL;
import X.C1744100vUG;
import X.C1744410vUl;
import X.C1745060vVo;
import X.C1752360vha;
import X.C1754870vld;
import X.C1760980vvU;
import X.C1761780vwm;
import X.C1763790w01;
import X.C1765530w2p;
import X.C1835920xsM;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C1909107dp;
import X.C289730BXf;
import X.C786410Ut5;
import X.DialogC1761330vw3;
import X.DialogInterfaceOnDismissListenerC1775910wJZ;
import X.EnumC1752350vhZ;
import X.InterfaceC1755330vmN;
import X.InterfaceC1761410vwB;
import X.InterfaceC1761420vwC;
import X.InterfaceC1766350w49;
import X.InterfaceC1766360w4A;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS37S0101000_26;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.gift.SeaOneStepGiftCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BlockPageInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuHeaderReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS132S0101000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        CompletionBlock completionBlock = (CompletionBlock) awS132S0101000_26.l0;
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1766350w49.class, null);
        int i = awS132S0101000_26.i1;
        InterfaceC1766350w49 interfaceC1766350w49 = (InterfaceC1766350w49) xBaseModelLIZJ;
        interfaceC1766350w49.setAction("select");
        InterfaceC1766360w4A interfaceC1766360w4A = (InterfaceC1766360w4A) C1909107dp.LIZJ(InterfaceC1766360w4A.class, null);
        interfaceC1766360w4A.setIndex(Integer.valueOf(i));
        interfaceC1766350w49.setDetail(interfaceC1766360w4A);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        String strLJIJJ;
        int iIntValue;
        int iIntValue2;
        boolean z;
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        if (seaPdpMainState.getLoadingStatus() == -1) {
            float f = (1.0f / SeaPdpHeadNavBarWidget.LLLIIII) * awS132S0101000_26.i1;
            SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget = (SeaPdpHeadNavBarWidget) awS132S0101000_26.l0;
            List<Tab> tabs = seaPdpMainState.getTabs();
            C1846060y8i c1846060y8iLJIILL = seaPdpHeadNavBarWidget.LJIILL();
            if (c1846060y8iLJIILL != null) {
                if (f > 0.9f) {
                    z = true;
                } else {
                    z = false;
                }
                c1846060y8iLJIILL.setClickable(z);
            }
            if (f > 0.1f && seaPdpHeadNavBarWidget.LLJLLIL > 0) {
                C1846060y8i c1846060y8iLJIILL2 = seaPdpHeadNavBarWidget.LJIILL();
                if (c1846060y8iLJIILL2 != null) {
                    C786410Ut5.LLZLI(c1846060y8iLJIILL2, 0);
                }
                C1846060y8i c1846060y8iLJIILL3 = seaPdpHeadNavBarWidget.LJIILL();
                if (c1846060y8iLJIILL3 != null && c1846060y8iLJIILL3.getVisibility() == 0 && !seaPdpHeadNavBarWidget.LLJZIJLIL) {
                    seaPdpHeadNavBarWidget.LLJZIJLIL = true;
                    if (tabs != null) {
                        for (Tab tab : tabs) {
                            if (!C289730BXf.LIZ()) {
                                Integer num = tab.tabName;
                                if (num != null) {
                                    iIntValue2 = num.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                strLJIJJ = SeaPdpHeadNavBarWidget.LJIJJ(iIntValue2);
                            } else {
                                strLJIJJ = tab.tabNameEn;
                                if (strLJIJJ == null || !(!a0.LJJJIL(strLJIJJ))) {
                                    Integer num2 = tab.tabName;
                                    if (num2 != null) {
                                        iIntValue = num2.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    strLJIJJ = SeaPdpHeadNavBarWidget.LJIJJ(iIntValue);
                                }
                            }
                            if (seaPdpHeadNavBarWidget.LJIL().LLJLIL != null) {
                                new AwS175S1100000_26(seaPdpHeadNavBarWidget, strLJIJJ, 6).invoke();
                            }
                        }
                    }
                }
            } else {
                C1846060y8i c1846060y8iLJIILL4 = seaPdpHeadNavBarWidget.LJIILL();
                if (c1846060y8iLJIILL4 != null) {
                    C786410Ut5.LLZLI(c1846060y8iLJIILL4, 8);
                }
            }
            C1846060y8i c1846060y8iLJIILL5 = seaPdpHeadNavBarWidget.LJIILL();
            if (c1846060y8iLJIILL5 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1846060y8iLJIILL5);
                c1846060y8iLJIILL5.setAlpha(f);
            }
            SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget2 = (SeaPdpHeadNavBarWidget) awS132S0101000_26.l0;
            int i = seaPdpHeadNavBarWidget2.LLJLLIL;
            if (i > 0 ? !(i != 3 ? i != 4 || f < 0.8d : f < 0.4d) : f >= 0.1d) {
                C04AG c04ag = seaPdpHeadNavBarWidget2.LJIL().LLLLLL;
                View view = seaPdpHeadNavBarWidget2.LLILZ;
                SeaPdpViewModel seaPdpViewModel = c04ag.LIZ;
                if (!seaPdpViewModel.k) {
                    seaPdpViewModel.k = true;
                    seaPdpViewModel.withState(new AwS367S0200000_1(view, c04ag, 356));
                }
                seaPdpHeadNavBarWidget2.LJIL().LLLLLL.LIZ(C1745060vVo.LIZ(seaPdpHeadNavBarWidget2));
            }
        }
        SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget3 = (SeaPdpHeadNavBarWidget) awS132S0101000_26.l0;
        int i2 = SeaPdpHeadNavBarWidget.LLLIIII;
        seaPdpHeadNavBarWidget3.LJJIIJ();
        ((SeaPdpHeadNavBarWidget) awS132S0101000_26.l0).LJJIIJZLJL(null);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        return C1754870vld.LIZ((C1754870vld) obj, null, awS132S0101000_26.i1, (BlockPageInfo) awS132S0101000_26.l0, 0, 0.0f, false, null, null, null, 505);
    }

    public static final Object invoke$11(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        boolean z;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        if (awS132S0101000_26.i1 == ((C1744410vUl) awS132S0101000_26.l0).LLILZIL) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfoCompat.setChecked(z);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "free_gift");
        laneParams.plusAssign("click_area", "free_gift");
        laneParams.plusAssign("free_gift_cnt", Integer.valueOf(awS132S0101000_26.i1));
        laneParams.plusAssign("is_clickable", 1);
        laneParams.putAll(((SeaOneStepGiftCell) awS132S0101000_26.l0).L5().LLLZLZ.LIZ("c99890.d0"));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "free_gift");
        laneParams.plusAssign("free_gift_cnt", Integer.valueOf(awS132S0101000_26.i1));
        laneParams.plusAssign("is_clickable", 1);
        laneParams.putAll(((SeaOneStepGiftCell) awS132S0101000_26.l0).L5().LLLZLZ.LIZ("c99890.d0"));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        C1845940y8W c1845940y8WLJII;
        String str = (String) obj;
        C1712450ufD c1712450ufD = (C1712450ufD) awS132S0101000_26.l0;
        if (c1712450ufD.LLJ == awS132S0101000_26.i1 && (c1845940y8WLJII = c1712450ufD.getTabBar().LJII(awS132S0101000_26.i1)) != null) {
            if (str == null) {
                str = (String) C13LP.LJJJLZIJ(awS132S0101000_26.i1, ((C1712450ufD) awS132S0101000_26.l0).LLILZ);
            }
            c1845940y8WLJII.LIZIZ(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("drop_down_list_name", "CPF");
        laneParams.plusAssign("action_type", "show");
        laneParams.plusAssign("item_num", Integer.valueOf(((CpfCell) awS132S0101000_26.l0).LLJJI));
        laneParams.plusAssign("rank", Integer.valueOf(awS132S0101000_26.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        String str;
        ProductBase productBase;
        SkuCommonConfig skuCommonConfig;
        String str2;
        final SkuHeaderReusedAssem skuHeaderReusedAssem = (SkuHeaderReusedAssem) awS132S0101000_26.l0;
        List<Image> carouselImages = ((SkuState) obj).getCarouselImages();
        int i = awS132S0101000_26.i1;
        skuHeaderReusedAssem.getClass();
        ArrayList arrayList = new ArrayList();
        if (carouselImages != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<Image> it2 = carouselImages.iterator();
            while (it2.hasNext()) {
                List<String> list = it2.next().toImageUrlModel().LIZ;
                if (list != null) {
                    Iterator it3 = ((ArrayList) list).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            if (C123100dR.LIZ((String) next)) {
                                if (next != null) {
                                    arrayList2.add(next);
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
        }
        final ArrayList arrayList3 = new ArrayList();
        if (carouselImages != null) {
            int i2 = 0;
            for (Image image : carouselImages) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    Image image2 = image;
                    List<String> list2 = image2.toImageUrlModel().LIZ;
                    if (list2 == null || (str2 = (String) C13LP.LJJJLL(list2)) == null) {
                        str2 = "";
                    }
                    arrayList3.add(C1761780vwm.LIZ(C1761780vwm.LIZ, str2, null, image2.getUri()));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        final DialogC1761330vw3 dialogC1761330vw3 = new DialogC1761330vw3(skuHeaderReusedAssem.sp(), false);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_close_pip_widget", "{}");
        SkuPanelStarter skuPanelStarter = SkuPanelStarter.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams = skuHeaderReusedAssem.getViewModel().LLJI;
        skuPanelStarter.getClass();
        IPdpStarter.PdpEnterParam pdpEnterParamLIZIZ = SkuPanelStarter.LIZIZ(skuEnterParams, null);
        IPdpStarter.PdpEnterParam pdpEnterParamCopy = pdpEnterParamLIZIZ.copy(pdpEnterParamLIZIZ.requestParams, pdpEnterParamLIZIZ.orderRequestParams, pdpEnterParamLIZIZ.trackParams, pdpEnterParamLIZIZ.pipeParams, pdpEnterParamLIZIZ.visitReportParams, pdpEnterParamLIZIZ.fullScreen, pdpEnterParamLIZIZ.checkedSkuIds, pdpEnterParamLIZIZ.expandHeight, pdpEnterParamLIZIZ.collapsedHeight, pdpEnterParamLIZIZ.collapsible, pdpEnterParamLIZIZ.playerControl, pdpEnterParamLIZIZ.isPromotionPage, pdpEnterParamLIZIZ.productEnterContext, pdpEnterParamLIZIZ.pdpCacheKey, pdpEnterParamLIZIZ.pdpPreParam, pdpEnterParamLIZIZ.preTrackNodeId, pdpEnterParamLIZIZ.awemeId, pdpEnterParamLIZIZ.clickFrom, pdpEnterParamLIZIZ.bizType, pdpEnterParamLIZIZ.enterViewName, pdpEnterParamLIZIZ.ocpContext, pdpEnterParamLIZIZ.ocpFlag, pdpEnterParamLIZIZ.ocpOrderId, pdpEnterParamLIZIZ.selectedAddressId, pdpEnterParamLIZIZ.btmToken, pdpEnterParamLIZIZ.route, pdpEnterParamLIZIZ.schemaChainKey, pdpEnterParamLIZIZ.autoOpenSku, pdpEnterParamLIZIZ.autoOpenSkuPanelClickFrom, pdpEnterParamLIZIZ.containerParams, pdpEnterParamLIZIZ.isFromPdpAddCartAfterToastEntrance, pdpEnterParamLIZIZ.autoAddToCart, pdpEnterParamLIZIZ.pdpPreviousPageId, pdpEnterParamLIZIZ.trackId, pdpEnterParamLIZIZ.recipientInfoId, pdpEnterParamLIZIZ.expandOnShow, pdpEnterParamLIZIZ.pageExpressionType);
        Map<String, Object> map = pdpEnterParamCopy.trackParams;
        if (map != null) {
            map.put("page_name", "picture_detail");
            C1752360vha c1752360vha = EnumC1752350vhZ.Companion;
            Integer numValueOf = Integer.valueOf(skuHeaderReusedAssem.getViewModel().Zf2().LJIIJ());
            c1752360vha.getClass();
            map.put("previous_page", C1752360vha.LIZ(numValueOf));
        }
        ProductPackStruct productPackStruct = skuHeaderReusedAssem.getViewModel().LLJIJIL;
        if (productPackStruct == null || (skuCommonConfig = productPackStruct.skuCommonConfig) == null || !Intrinsics.LJFF(skuCommonConfig.isSkuPanelGalleryFindSimilarHidden, Boolean.TRUE)) {
            C1763790w01 c1763790w01 = C1763790w01.LIZ;
            Context context = dialogC1761330vw3.getContext();
            ProductPackStruct productPackStruct2 = skuHeaderReusedAssem.getViewModel().LLJIJIL;
            if (productPackStruct2 != null && (productBase = productPackStruct2.baseInfo) != null) {
                str = productBase.title;
            } else {
                str = null;
            }
            AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(198);
            c1763790w01.getClass();
            C1765530w2p c1765530w2pLIZ = C1763790w01.LIZ(context, arrayList3, pdpEnterParamCopy, str, aFwS231S0000000_3);
            if (c1765530w2pLIZ != null) {
                dialogC1761330vw3.LJJLJ(c1765530w2pLIZ);
                dialogC1761330vw3.LJJLL().LLJJI = c1765530w2pLIZ;
                dialogC1761330vw3.LJJLL().LLJJIII = c1765530w2pLIZ;
                c1765530w2pLIZ.LLJIJIL = false;
                dialogC1761330vw3.LL.addOnScrollListener(c1765530w2pLIZ);
            }
        }
        dialogC1761330vw3.LLJIJIL = new InterfaceC1761420vwC() { // from class: X.0vwR
            @Override // X.InterfaceC1761420vwC
            public final void onShow() {
                ((SkuPanelBaseReusedAssem) skuHeaderReusedAssem).getViewModel().LLLILZJ = true;
            }
        };
        dialogC1761330vw3.LJJZZI(arrayList3);
        dialogC1761330vw3.LJJZZIII(i, null);
        dialogC1761330vw3.LLJILJIL = new InterfaceC1761410vwB() { // from class: X.0vwT
            @Override // X.InterfaceC1761410vwB
            public final void onScreenCaptured() {
                C1748720vbi.LIZIZ(((SkuPanelBaseReusedAssem) skuHeaderReusedAssem).tp(), new C04BY(), new AwS605S0100000_26(skuHeaderReusedAssem, 670));
                if (Build.VERSION.SDK_INT < 26 || !C10460047e.LIZ() || C1486180omG.LIZIZ(dialogC1761330vw3.getContext()) || dialogC1761330vw3.getWindow() == null) {
                    return;
                }
                C1486180omG.LIZ(dialogC1761330vw3.getWindow(), new AwS235S0300000_26(skuHeaderReusedAssem, dialogC1761330vw3, arrayList3, 49));
            }

            @Override // X.InterfaceC1761410vwB
            public final boolean LIZ(String str3) {
                String str4;
                if (!C10460047e.LIZ()) {
                    return false;
                }
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str3);
                if (dialogC1761330vw3.getWindow() != null) {
                    List<AbstractC1763110vyv> list3 = arrayList3;
                    Object obj2 = skuHeaderReusedAssem;
                    DialogC1761330vw3 dialogC1761330vw32 = dialogC1761330vw3;
                    AbstractC1763110vyv abstractC1763110vyv = (AbstractC1763110vyv) C13LP.LJJJLZIJ(0, list3);
                    if (abstractC1763110vyv instanceof C1762980vyi) {
                        str4 = ((C1762980vyi) abstractC1763110vyv).LJ;
                    } else if (abstractC1763110vyv instanceof C1762960vyg) {
                        str4 = ((C1762960vyg) abstractC1763110vyv).LJ;
                    } else {
                        str4 = null;
                    }
                    C1763700vzs c1763700vzs = ((SkuPanelBaseReusedAssem) obj2).getViewModel().LLLFF;
                    if (c1763700vzs != null) {
                        c1763700vzs.LIZ(dialogC1761330vw32.getContext(), "blank_pages", bitmapDecodeFile, str4);
                        return true;
                    }
                    return true;
                }
                return true;
            }
        };
        dialogC1761330vw3.setOnDismissListener(new DialogInterfaceOnDismissListenerC1775910wJZ(skuHeaderReusedAssem, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        boolean z;
        C1251150ifB c1251150ifB = (C1251150ifB) ((AbstractC1250290idn) obj);
        if (awS132S0101000_26.i1 <= 0 && ((DistrictFragment) awS132S0101000_26.l0).mS().LLILLL == null) {
            z = false;
        } else {
            z = true;
        }
        c1251150ifB.LJI = z;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        List<C1742910vSL> list = ((C1742800vSA) obj).LLILZ;
        int i = awS132S0101000_26.i1;
        if (i > 0 && i >= list.size() - 5) {
            TrendingListViewModel trendingListViewModelVR = ((ECTrendingFragment) awS132S0101000_26.l0).VR();
            trendingListViewModelVR.withState(new AwS605S0100000_26(trendingListViewModelVR, 946));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        Object next;
        InterfaceC1755330vmN interfaceC1755330vmN;
        List<Image> images;
        Iterator<Object> it2 = ((PdpMainState) obj).getContentList().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!(next instanceof InterfaceC1755330vmN));
        if ((next instanceof InterfaceC1755330vmN) && (interfaceC1755330vmN = (InterfaceC1755330vmN) next) != null && (images = interfaceC1755330vmN.getImages()) != null) {
            int i = awS132S0101000_26.i1;
            ((C1760980vvU) awS132S0101000_26.l0).LIZLLL(C13LQ.LJIJI(new Image[]{C13LP.LJJJLZIJ(i - 2, images), C13LP.LJJJLZIJ(i + 2, images)}));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        return C1713290ugZ.LIZ((C1713290ugZ) obj, null, null, null, (List) awS132S0101000_26.l0, awS132S0101000_26.i1, 7);
    }

    public static final Object invoke$7(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        return C1713300uga.LIZ((C1713300uga) obj, null, null, (C1261860iwS) awS132S0101000_26.l0, null, false, null, Integer.valueOf(awS132S0101000_26.i1), null, null, 443);
    }

    public static final Object invoke$8(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("rank", Integer.valueOf(awS132S0101000_26.i1 + 1));
        laneParams.plusAssign("module_name", "head_pic");
        String str = ((C1744100vUG) awS132S0101000_26.l0).LLILZ;
        if (str != null) {
            laneParams.plusAssign("sub_page_name", str);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS132S0101000_26 awS132S0101000_26, Object obj) {
        ((Boolean) obj).booleanValue();
        C786410Ut5.LJL(new BPEAHandler(Looper.getMainLooper()), new ARunnableS37S0101000_26((C1835920xsM) awS132S0101000_26.l0, awS132S0101000_26.i1, 6));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(int i, C1261860iwS c1261860iwS, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1261860iwS;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(int i, C1744100vUG c1744100vUG, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1744100vUG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(int i, C1744410vUl c1744410vUl, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1744410vUl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(int i, C1760980vvU c1760980vvU, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1760980vvU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(int i, CompletionBlock completionBlock, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = completionBlock;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(int i, SeaOneStepGiftCell seaOneStepGiftCell, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = seaOneStepGiftCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(int i, BlockPageInfo blockPageInfo, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = blockPageInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(int i, SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = seaPdpHeadNavBarWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(int i, DistrictFragment districtFragment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = districtFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(int i, ECTrendingFragment eCTrendingFragment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = eCTrendingFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(C1712450ufD c1712450ufD, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1712450ufD;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(C1835920xsM c1835920xsM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1835920xsM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(CpfCell cpfCell, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = cpfCell;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S0101000_26(SkuHeaderReusedAssem skuHeaderReusedAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = skuHeaderReusedAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS132S0101000_26(List list, List<C1261860iwS> list2, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.i1 = list2;
    }
}
