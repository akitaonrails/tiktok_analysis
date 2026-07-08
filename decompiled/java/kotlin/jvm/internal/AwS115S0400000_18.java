package kotlin.jvm.internal;

import X.AbstractC19994813Le;
import X.AbstractC316870CbV;
import X.AnonymousClass0885;
import X.C036E;
import X.C098200Yq;
import X.C09AY;
import X.C0C64;
import X.C0PEM;
import X.C1163820gOK;
import X.C1166800gT8;
import X.C1171050gZz;
import X.C1171210gaF;
import X.C1173680geE;
import X.C1175600ghK;
import X.C1177260gk0;
import X.C1179560gni;
import X.C1179580gnk;
import X.C1179830go9;
import X.C1179840goA;
import X.C1179850goB;
import X.C118300cf;
import X.C1184490gvf;
import X.C1185430gxB;
import X.C1185490gxH;
import X.C1188440h22;
import X.C1203960hR4;
import X.C1204080hRG;
import X.C1204130hRL;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1558360qeg;
import X.C1697810uHb;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1843500y4a;
import X.C189200o6;
import X.C1893080zMY;
import X.C19EG;
import X.C1DFH;
import X.C20248814Kw;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23112093u;
import X.C23250099c;
import X.C259800zU;
import X.C291001Au;
import X.C316640Cb8;
import X.C317290CcB;
import X.C323380Cm0;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427400GpO;
import X.C5182020e;
import X.C584850Mwl;
import X.C611410NyV;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1198680hIY;
import X.EnumC1204140hRM;
import X.EnumC1204260hRY;
import X.EnumC2211841BhW;
import X.InterfaceC1177250gjz;
import X.InterfaceC1183590guD;
import X.InterfaceC1193760hAc;
import X.InterfaceC1364105Vn;
import Y.ARunnableS12S0500000_18;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentManageAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.collect.detailfeed.PoiFeedBottomAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiHotelCardCell;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.background.map.PoiBackgroundMapAssem;
import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponseV2;
import com.ss.android.ugc.aweme.poi.detail.lynx.PoiDetailLynxAssem;
import com.ss.android.ugc.aweme.poi.detail.map.PoiBackgroundMapComponent;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.bottombar.PoiRecommendFeatureBottomBarAssem;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.bottombar.PoiRecommendFeatureBottomBarModule;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashTrackConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2Cache;
import com.ss.android.ugc.aweme.story.archive2.list.StoryArchiveV2ListViewModel;
import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import irm.AkS28S0300000_18;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class AwS115S0400000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            default:
                return null;
        }
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_favorites_business_collection_assem_CollectionContentManageAssem$onViewCreated$10_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo$0(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static final Object invoke$0(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiRecommendFeatureBottomBarAssem) awS115S0400000_18.l0, new AwS227S0300000_18((PoiRecommendFeatureBottomBarModule) awS115S0400000_18.l1, (C1184490gvf) awS115S0400000_18.l2, (PoiButton) awS115S0400000_18.l3, 3));
        assembler.RQ2((PoiRecommendFeatureBottomBarAssem) awS115S0400000_18.l0, AFwS229S0000000_2.get$arr$(15));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v2, types: [com.bytedance.tux.drawable.TuxIconDrawable] */
    /* JADX WARN: Type inference failed for: r22v3, types: [X.0Q7z] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.util.AttributeSet, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0GpO, android.view.View] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static /* bridge */ /* synthetic */ Object invoke$1(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        int height;
        List listLL;
        ?? r4;
        String strLIZIZ;
        ?? r22;
        Object c098200Yq;
        Object c098200Yq2;
        ?? LIZIZ;
        String str;
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue <= 0) {
            iIntValue = ((PoiBackgroundMapAssem) awS115S0400000_18.l0).sp().LLILZLL.getMeasuredWidth();
        }
        if (((PoiBackgroundMapAssem) awS115S0400000_18.l0).sp().LLILZLL.getHeight() <= 0) {
            height = ((PoiBackgroundMapAssem) awS115S0400000_18.l0).sp().LLILZLL.getMeasuredHeight();
        } else {
            height = ((PoiBackgroundMapAssem) awS115S0400000_18.l0).sp().LLILZLL.getHeight();
        }
        List list = (List) awS115S0400000_18.l1;
        if (list != null && (listLL = C13LP.LL(list, 2)) != null) {
            ?? r2 = 0;
            if (!listLL.isEmpty()) {
                Context context = (Context) awS115S0400000_18.l2;
                PoiBackgroundMapAssem poiBackgroundMapAssem = (PoiBackgroundMapAssem) awS115S0400000_18.l0;
                PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse = (PoiDiscoveryApi$PoiDiscoveryCardListResponse) awS115S0400000_18.l3;
                int i = 0;
                for (Object obj2 : listLL) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        PoiDiscoveryCard poiDiscoveryCard = (PoiDiscoveryCard) obj2;
                        if (poiDiscoveryCard != null) {
                            ?? c427400GpO = new C427400GpO(context, r2);
                            try {
                                if (!Intrinsics.LJFF(poiDiscoveryCard.noRating, Boolean.TRUE) && (str = poiDiscoveryCard.reviewCount) != null) {
                                    LIZIZ = C1843500y4a.LIZIZ(CastLongProtector.parseLong(str));
                                } else {
                                    LIZIZ = r2;
                                }
                                C189200o6.m2constructorimpl(LIZIZ);
                                r4 = LIZIZ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C098200Yq c098200Yq3 = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq3);
                                r4 = c098200Yq3;
                            }
                            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(r4);
                            ?? r42 = r4;
                            if (zM7isFailureimpl) {
                                r42 = r2;
                            }
                            String str2 = (String) r42;
                            if (str2 == null) {
                                strLIZIZ = poiDiscoveryCard.poiDisplay;
                                r22 = r2;
                            } else {
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_star_fill;
                                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                c419910GdJ.LJ = Integer.valueOf(R.attr.ny);
                                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(c427400GpO.getContext());
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(poiDiscoveryCard.reviewScore);
                                sbLIZ.append('(');
                                sbLIZ.append(str2);
                                sbLIZ.append(')');
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                r22 = tuxIconDrawableLIZ;
                            }
                            String str3 = poiDiscoveryCard.poiTitleImg;
                            if (str3 == null) {
                                str3 = "";
                            }
                            c427400GpO.LJIIIZ(str3, poiDiscoveryCard.poiName, null, strLIZIZ, r22);
                            C786410Ut5.I7(new AkS28S0300000_18(poiDiscoveryApi$PoiDiscoveryCardListResponse, poiBackgroundMapAssem, poiDiscoveryCard, 0), c427400GpO);
                            String str4 = poiDiscoveryCard.poiId;
                            String str5 = poiDiscoveryCard.collectInfo;
                            Fragment fragmentLJI = C724240Sb0.LJI(poiBackgroundMapAssem);
                            ?? LJFF = r2;
                            if (fragmentLJI != null) {
                                LJFF = C1558360qeg.LJFF(fragmentLJI, r2);
                            }
                            C1175600ghK.LJIIIZ(null, null, str4, str5, null, null, LJFF, PageFinder.via(C724240Sb0.LJI(poiBackgroundMapAssem)));
                            Pair<Integer, Integer> pairLJIIIIZZ = c427400GpO.LJIIIIZZ();
                            int iIntValue2 = pairLJIIIIZZ.getFirst().intValue();
                            int iIntValue3 = pairLJIIIIZZ.getSecond().intValue();
                            int i3 = (iIntValue * 2) / 3;
                            if (iIntValue2 > i3) {
                                iIntValue2 = i3;
                            }
                            int i4 = iIntValue / 3;
                            int i5 = (iIntValue - iIntValue2) - i4;
                            if (i5 < 0) {
                                i5 = 0;
                            }
                            int i6 = height / 2;
                            int i7 = i6 - iIntValue3;
                            if (i7 < 0) {
                                i7 = 0;
                            }
                            try {
                                poiBackgroundMapAssem.getClass();
                                c098200Yq = Integer.valueOf(AbstractC19994813Le.Default.nextInt(0, i5 + 1));
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                c098200Yq = 0;
                            }
                            int iIntValue4 = ((Number) c098200Yq).intValue();
                            try {
                                poiBackgroundMapAssem.getClass();
                                c098200Yq2 = Integer.valueOf(AbstractC19994813Le.Default.nextInt(0, i7 + 1));
                                C189200o6.m2constructorimpl(c098200Yq2);
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                c098200Yq2 = new C098200Yq(th3);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            }
                            if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                                c098200Yq2 = 0;
                            }
                            int iIntValue5 = ((Number) c098200Yq2).intValue();
                            if (i == 0) {
                                i4 = 0;
                            }
                            int i8 = iIntValue4 + i4;
                            if (i == 0) {
                                i6 = 0;
                            }
                            int i9 = iIntValue5 + i6;
                            ?? r23 = poiBackgroundMapAssem.sp().LLILZLL;
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                            if (C426750GoL.LIZLLL(context)) {
                                layoutParams.setMargins(0, i9, i8, 0);
                            } else {
                                layoutParams.setMargins(i8, i9, 0, 0);
                            }
                            r23.addView(c427400GpO, layoutParams);
                        }
                        i = i2;
                        r2 = 0;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        return C1204130hRL.LIZ((C1204130hRL) obj, ((NearbyContainerViewModel) awS115S0400000_18.l0).xQ2(EnumC1204260hRY.PULL_DOWN_LOAD, (Pair) awS115S0400000_18.l1, (C1204080hRG) awS115S0400000_18.l2), null, (C1203960hR4) awS115S0400000_18.l3, null, null, null, 58);
    }

    public static final Object invoke$11(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        ((PoiSearchVM) awS115S0400000_18.l0).GQ2((C19EG) awS115S0400000_18.l1, (PoiData) awS115S0400000_18.l2, (EnumC1198680hIY) awS115S0400000_18.l3);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        PoiSearchVM poiSearchVM = (PoiSearchVM) awS115S0400000_18.l0;
        String str = poiSearchVM.LLJJIII;
        String str2 = poiSearchVM.LLJJIJI;
        c1185430gxB.getClass();
        C1185430gxB.LJIILL(str, str2, true);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    public static final Object invoke$12(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        List listLLIIII;
        C1163820gOK c1163820gOK = (C1163820gOK) obj;
        List<Aweme> list = c1163820gOK.LL;
        C259800zU c259800zU = new C259800zU();
        ?? arrayList = new ArrayList();
        c259800zU.element = arrayList;
        if (list != null) {
            List list2 = (List) awS115S0400000_18.l3;
            MixVideosManageViewModel mixVideosManageViewModel = (MixVideosManageViewModel) awS115S0400000_18.l0;
            AnonymousClass0885.LIZ(arrayList, C13LP.LLIIII(list));
            ArrayList arrayList2 = (ArrayList) c259800zU.element;
            if (list2 != null) {
                listLLIIII = C13LP.LLIIII(list2);
            } else {
                listLLIIII = null;
            }
            AnonymousClass0885.LIZ(arrayList2, listLLIIII);
            if (!mixVideosManageViewModel.LLILZLL && C0C64.LJIILLIIL().LJIJ(31744, 1, "playlist_reverse_order", true) == 1) {
                AnonymousClass0885.LIZ((ArrayList) c259800zU.element, c1163820gOK.LLILZLL);
            }
        }
        ((MixVideosManageViewModel) awS115S0400000_18.l0).setState(new AwS597S0100000_18(c259800zU, (C259800zU<List<Aweme>>) 715));
        if (((MixVideosManageViewModel) awS115S0400000_18.l0).LLILZLL) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS115S0400000_18.l1;
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            Long lValueOf = Long.valueOf(((MixVideosResponse) awS115S0400000_18.l2).maxCursor);
            List list3 = (List) awS115S0400000_18.l3;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new C1166800gT8((Aweme) it2.next(), null));
            }
            C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(c317290CcB, null, lValueOf, arrayList3, 1);
            C189200o6.m2constructorimpl(c323380Cm0LJ);
            interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS115S0400000_18.l1;
            C316640Cb8 c316640Cb8LIZIZ = C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
            C189200o6.m2constructorimpl(c316640Cb8LIZIZ);
            interfaceC1364105Vn2.resumeWith(c316640Cb8LIZIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AwS115S0400000_18 r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS115S0400000_18.invoke$13(kotlin.jvm.internal.AwS115S0400000_18, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$14(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        InterfaceC1183590guD interfaceC1183590guD = (InterfaceC1183590guD) obj;
        interfaceC1183590guD.LJJIL((Map) awS115S0400000_18.l0);
        interfaceC1183590guD.LJJJJJ((Map) awS115S0400000_18.l1);
        final Map map = (Map) awS115S0400000_18.l2;
        final PoiDetailLynxAssem poiDetailLynxAssem = (PoiDetailLynxAssem) awS115S0400000_18.l3;
        interfaceC1183590guD.LJJIIZI(new InterfaceC1193760hAc() { // from class: X.0gug
            @Override // X.InterfaceC1193760hAc
            public final void LIZ() {
                poiDetailLynxAssem.getClass();
                System.out.println((Object) "logFmpFinish");
            }

            @Override // X.InterfaceC1193760hAc
            public final void LIZIZ(JSONObject jSONObject) throws JSONException {
                for (Map.Entry<String, Long> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue().longValue());
                }
                C1185040gwY.LIZ.getClass();
                C1185040gwY.LIZJ("location_performance_track_shelf", jSONObject, null);
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        List list = (List) awS115S0400000_18.l0;
        List list2 = (List) awS115S0400000_18.l1;
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) awS115S0400000_18.l2);
        C1179830go9 c1179830go9 = (C1179830go9) awS115S0400000_18.l3;
        linkedHashMap.put(c1179830go9.LL, (List) awS115S0400000_18.l1);
        obj.getClass();
        return new C1179840goA(true, list, list2, linkedHashMap);
    }

    public static final Object invoke$16(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        ((Number) obj).intValue();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1177260gk0((List) awS115S0400000_18.l0, (PoiBackgroundMapComponent) awS115S0400000_18.l1, (Context) awS115S0400000_18.l2, (PoiDiscoveryApi$PoiDiscoveryCardListResponseV2) awS115S0400000_18.l3, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        ((Assembler) obj).DQ2((Fragment) awS115S0400000_18.l0, new AwS227S0300000_18((ExtensionMisc) awS115S0400000_18.l1, (PublishOutput) awS115S0400000_18.l2, (IAVPublishExtension.Callback) awS115S0400000_18.l3, 61));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS562S0100000_18((TuxTextView) awS115S0400000_18.l0, 2625);
        c20248814Kw.LIZIZ(new AwS296S0300000_18((PoiHotelCardCell) awS115S0400000_18.l1, (SlashTrackConfig) awS115S0400000_18.l2, (PoiCardCellData) awS115S0400000_18.l3, 8));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        PoiFeedBottomAssem poiFeedBottomAssem = (PoiFeedBottomAssem) awS115S0400000_18.l0;
        assembler.EQ2(poiFeedBottomAssem, new AwS227S0300000_18((PoiDataStruct) awS115S0400000_18.l1, (C1188440h22) awS115S0400000_18.l2, poiFeedBottomAssem, 63));
        assembler.EQ2((PoiFeedBottomAssem) awS115S0400000_18.l0, new AwS384S0200000_18((C1185490gxH) awS115S0400000_18.l3, (C1188440h22) awS115S0400000_18.l2, 253));
        assembler.RQ2((PoiFeedBottomAssem) awS115S0400000_18.l0, AFwS256S0000000_18.get$arr$(975));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        C23112093u c23112093u;
        Throwable th = (Throwable) obj;
        C786410Ut5.LLLLLLZZ((TuxIconView) ((View) awS115S0400000_18.l0), 8);
        C786410Ut5.LLLZLZ((C1749280vcc) awS115S0400000_18.l1, 0);
        if (INVOKESTATIC_com_ss_android_ugc_aweme_favorites_business_collection_assem_CollectionContentManageAssem$onViewCreated$10_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo$0((Context) awS115S0400000_18.l2)) {
            if ((th instanceof C23112093u) && (c23112093u = (C23112093u) th) != null && c23112093u.getErrorCode() == 7) {
                C426750GoL.LJIIIZ((C1749280vcc) awS115S0400000_18.l1, null, 0, null, null, false, 29);
                C1749280vcc c1749280vcc = (C1749280vcc) awS115S0400000_18.l1;
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                c1722300uv6.LJI = ((Context) awS115S0400000_18.l2).getString(2131828948);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_large_favorites_collection;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                c1722300uv6.LIZJ = 0;
                c1722300uv6.LIZIZ = c419910GdJ;
                c1749280vcc.setStatus(c1722300uv6);
            } else {
                C1749280vcc c1749280vcc2 = (C1749280vcc) awS115S0400000_18.l1;
                C1722300uv6 c1722300uv62 = new C1722300uv6();
                C1893080zMY.LJFF(c1722300uv62, new AwS562S0100000_18((CollectionContentManageAssem) awS115S0400000_18.l3, 280));
                c1749280vcc2.setStatus(c1722300uv62);
            }
        } else {
            C1749280vcc c1749280vcc3 = (C1749280vcc) awS115S0400000_18.l1;
            C1722300uv6 c1722300uv63 = new C1722300uv6();
            C1893080zMY.LIZ(c1722300uv63, new AwS562S0100000_18((CollectionContentManageAssem) awS115S0400000_18.l3, 281));
            c1749280vcc3.setStatus(c1722300uv63);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        PoiFeedBottomAssem poiFeedBottomAssem = (PoiFeedBottomAssem) awS115S0400000_18.l0;
        assembler.EQ2(poiFeedBottomAssem, new AwS227S0300000_18((PoiDataStruct) awS115S0400000_18.l1, (C1188440h22) awS115S0400000_18.l2, poiFeedBottomAssem, 64));
        assembler.EQ2((PoiFeedBottomAssem) awS115S0400000_18.l0, new AwS384S0200000_18((C1185490gxH) awS115S0400000_18.l3, (C1188440h22) awS115S0400000_18.l2, 254));
        assembler.RQ2((PoiFeedBottomAssem) awS115S0400000_18.l0, AFwS229S0000000_2.get$arr$(806));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        ((Function0) awS115S0400000_18.l0).invoke();
        ((C1179560gni) awS115S0400000_18.l1).LLILLL = ((InterfaceC1177250gjz) awS115S0400000_18.l2).LJFF();
        InterfaceC1177250gjz interfaceC1177250gjz = (InterfaceC1177250gjz) awS115S0400000_18.l2;
        interfaceC1177250gjz.LIZLLL(new AwS227S0300000_18((C1179560gni) awS115S0400000_18.l1, interfaceC1177250gjz, (C1179580gnk) awS115S0400000_18.l3, 73));
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        InterfaceC1177250gjz interfaceC1177250gjz = (InterfaceC1177250gjz) obj;
        ((C1179560gni) awS115S0400000_18.l0).LLIZ = interfaceC1177250gjz;
        C1179560gni c1179560gni = (C1179560gni) awS115S0400000_18.l0;
        HandlerHook.viewPost(c1179560gni, new ARunnableS12S0500000_18(c1179560gni, interfaceC1177250gjz, (C1179580gnk) awS115S0400000_18.l1, (Function0) awS115S0400000_18.l2, (Function0) awS115S0400000_18.l3, 3));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$3(kotlin.jvm.internal.AwS115S0400000_18 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS115S0400000_18.invoke$3(kotlin.jvm.internal.AwS115S0400000_18, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        String imprId;
        Aweme next;
        Long lValueOf;
        Long lValueOf2;
        Aweme aweme;
        String aid;
        String imprId2;
        MixVideosResponse mixVideosResponse = (MixVideosResponse) awS115S0400000_18.l0;
        List<? extends Aweme> list = mixVideosResponse.mixVideos;
        C611410NyV c611410NyV = C584850Mwl.LIZ;
        LogPbBean logPbBean = mixVideosResponse.logPb;
        if (logPbBean != null) {
            imprId = logPbBean.getImprId();
        } else {
            imprId = null;
        }
        c611410NyV.LJI(imprId, ((MixVideosResponse) awS115S0400000_18.l0).logPb);
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list != null) {
                    aweme = (Aweme) ListProtector.get(list, i);
                } else {
                    aweme = null;
                }
                Aweme awemeLLILLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                if (awemeLLILLL != null) {
                    aid = awemeLLILLL.getAid();
                } else {
                    aid = null;
                }
                sbLIZ.append(aid);
                sbLIZ.append("19");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                LogPbBean logPbBean2 = ((MixVideosResponse) awS115S0400000_18.l0).logPb;
                if (logPbBean2 != null) {
                    imprId2 = logPbBean2.getImprId();
                } else {
                    imprId2 = null;
                }
                iRequestIdService.LIZIZ(i, strLIZIZ, imprId2);
            }
        }
        C118300cf c118300cf = (C118300cf) awS115S0400000_18.l1;
        int i2 = c118300cf.element;
        if (i2 == 4) {
            MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) awS115S0400000_18.l2;
            MixVideosResponse mixVideosResponse2 = (MixVideosResponse) awS115S0400000_18.l0;
            mixVideosViewModel.LLIZLLLIL = mixVideosResponse2.hasMoreLoadBefore;
            mixVideosViewModel.LLJ = mixVideosResponse2.hasMoreLoadMore;
        } else if (i2 == 1) {
            ((MixVideosViewModel) awS115S0400000_18.l2).LLJ = ((MixVideosResponse) awS115S0400000_18.l0).hasMore;
        } else if (i2 == 2) {
            MixVideosViewModel mixVideosViewModel2 = (MixVideosViewModel) awS115S0400000_18.l2;
            if (mixVideosViewModel2.LLJJIJIL) {
                mixVideosViewModel2.LLIZLLLIL = ((MixVideosResponse) awS115S0400000_18.l0).hasMore;
                mixVideosViewModel2.LLJ = false;
                c118300cf.element = 1;
            }
        }
        MixVideosViewModel mixVideosViewModel3 = (MixVideosViewModel) awS115S0400000_18.l2;
        MixVideosResponse mixVideosResponse3 = (MixVideosResponse) awS115S0400000_18.l0;
        mixVideosViewModel3.LLJI = mixVideosResponse3.minCursor;
        mixVideosViewModel3.LLJIJIL = mixVideosResponse3.maxCursor;
        List<? extends Aweme> list2 = mixVideosResponse3.mixVideos;
        if (list2 != null && !list2.isEmpty()) {
            MixVideosViewModel mixVideosViewModel4 = (MixVideosViewModel) awS115S0400000_18.l2;
            Aweme aweme2 = mixVideosViewModel4.LLILZIL;
            if (aweme2 != null) {
                mixVideosViewModel4.IQ2(aweme2);
            } else if (!list2.isEmpty()) {
                if (C123100dR.LIZ(((MixVideosViewModel) awS115S0400000_18.l2).CQ2())) {
                    MixVideosViewModel mixVideosViewModel5 = (MixVideosViewModel) awS115S0400000_18.l2;
                    Iterator<? extends Aweme> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.getAid(), mixVideosViewModel5.CQ2())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Aweme aweme3 = next;
                    if (aweme3 != null) {
                        ((MixVideosViewModel) awS115S0400000_18.l2).IQ2(aweme3);
                    } else {
                        MixVideosViewModel mixVideosViewModel6 = (MixVideosViewModel) awS115S0400000_18.l2;
                        if (mixVideosViewModel6.LLJJIJIL && mixVideosViewModel6.LLJJJ > 1) {
                            mixVideosViewModel6.LLIZLLLIL = ((MixVideosResponse) awS115S0400000_18.l0).hasMore;
                            mixVideosViewModel6.LLJ = false;
                            ((C118300cf) awS115S0400000_18.l1).element = 1;
                            mixVideosViewModel6.IQ2((Aweme) C13LP.LJJLIIIJJI(list2));
                        } else {
                            mixVideosViewModel6.IQ2((Aweme) ListProtector.get(list2, 0));
                        }
                    }
                } else {
                    MixVideosViewModel mixVideosViewModel7 = (MixVideosViewModel) awS115S0400000_18.l2;
                    if (mixVideosViewModel7.LLJJIJIL && mixVideosViewModel7.LLJJJ > 1) {
                        mixVideosViewModel7.LLIZLLLIL = ((MixVideosResponse) awS115S0400000_18.l0).hasMore;
                        mixVideosViewModel7.LLJ = false;
                        ((C118300cf) awS115S0400000_18.l1).element = 1;
                        mixVideosViewModel7.IQ2((Aweme) C13LP.LJJLIIIJJI(list2));
                    } else {
                        mixVideosViewModel7.IQ2((Aweme) ListProtector.get(list2, 0));
                    }
                }
            }
            MixVideosViewModel mixVideosViewModel8 = (MixVideosViewModel) awS115S0400000_18.l2;
            if (!mixVideosViewModel8.LLJ) {
                if (mixVideosViewModel8.LLIZLLLIL) {
                    lValueOf = null;
                } else {
                    InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS115S0400000_18.l3;
                    C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<? extends Aweme> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new C1166800gT8(it3.next(), null));
                    }
                    c317290CcB.getClass();
                    C316640Cb8 c316640Cb8 = new C316640Cb8(arrayList);
                    C189200o6.m2constructorimpl(c316640Cb8);
                    interfaceC1364105Vn.resumeWith(c316640Cb8);
                }
            } else {
                lValueOf = Long.valueOf(((MixVideosResponse) awS115S0400000_18.l0).maxCursor);
            }
            if (((MixVideosViewModel) awS115S0400000_18.l2).LLIZLLLIL) {
                lValueOf2 = Long.valueOf(((MixVideosResponse) awS115S0400000_18.l0).minCursor);
            } else {
                lValueOf2 = null;
            }
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS115S0400000_18.l3;
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<? extends Aweme> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(new C1166800gT8(it4.next(), null));
            }
            c317290CcB2.getClass();
            C323380Cm0 c323380Cm0 = new C323380Cm0(lValueOf2, lValueOf, arrayList2);
            C189200o6.m2constructorimpl(c323380Cm0);
            interfaceC1364105Vn2.resumeWith(c323380Cm0);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn3 = (InterfaceC1364105Vn) awS115S0400000_18.l3;
            C317290CcB c317290CcB3 = AbstractC316870CbV.LIZ;
            C13BV c13bv = C13BV.INSTANCE;
            c317290CcB3.getClass();
            C316640Cb8 c316640Cb82 = new C316640Cb8(c13bv);
            C189200o6.m2constructorimpl(c316640Cb82);
            interfaceC1364105Vn3.resumeWith(c316640Cb82);
            ((MixVideosViewModel) awS115S0400000_18.l2).setState(AFwS256S0000000_18.get$arr$(192));
        }
        if (list != null) {
            ((MixVideosViewModel) awS115S0400000_18.l2).setState(new AwS384S0200000_18((List) list, (List<? extends Aweme>) awS115S0400000_18.l1, (C118300cf) 65));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS562S0100000_18((View) awS115S0400000_18.l0, 1016);
        c20248814Kw.LIZIZ(new AwS296S0300000_18((PoiDetailHeaderAssem) awS115S0400000_18.l1, (PoiListApi.PoiDetailResponse) awS115S0400000_18.l2, (ChartInfo) awS115S0400000_18.l3, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new C5182020e((View) awS115S0400000_18.l0, 148);
        C20248814Kw.LIZJ(c20248814Kw, false, false, 0.0f, 0, EnumC2211841BhW.CUSTOMIZE, AFwS256S0000000_18.get$arr$(353), null, 79);
        PoiShopBookingInfo poiShopBookingInfo = (PoiShopBookingInfo) awS115S0400000_18.l1;
        c20248814Kw.LIZIZ(new AwS173S0400000_18((View) awS115S0400000_18.l0, (BcmParams) awS115S0400000_18.l3, (PoiDetailHeaderPoiShopCtaBaseAssem) awS115S0400000_18.l2, poiShopBookingInfo, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS562S0100000_18((View) awS115S0400000_18.l0, 1013);
        c20248814Kw.LIZIZ(new AwS296S0300000_18((PoiDetailFoodHeaderAssem) awS115S0400000_18.l1, (PoiListApi.PoiDetailResponse) awS115S0400000_18.l2, (ChartInfo) awS115S0400000_18.l3, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS562S0100000_18((View) awS115S0400000_18.l0, 1058);
        c20248814Kw.LIZIZ(new AwS296S0300000_18((PoiDetailTravelHeaderAssemV2) awS115S0400000_18.l1, (PoiListApi.PoiDetailResponse) awS115S0400000_18.l2, (ChartInfo) awS115S0400000_18.l3, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS115S0400000_18 awS115S0400000_18, Object obj) {
        EnumC1198680hIY enumC1198680hIY;
        Assembler assembler = (Assembler) obj;
        PublishOutput publishOutput = (PublishOutput) awS115S0400000_18.l0;
        PoiData poiData = publishOutput.poiData;
        if (poiData != null) {
            enumC1198680hIY = EnumC1198680hIY.LOCATION_STICKER;
        } else {
            enumC1198680hIY = EnumC1198680hIY.ADD_LOCATION;
        }
        assembler.DQ2((Fragment) awS115S0400000_18.l1, new AwS52S0500000_18((ExtensionMisc) awS115S0400000_18.l2, poiData, publishOutput, enumC1198680hIY, (IAVPublishExtension.Callback) awS115S0400000_18.l3, 3));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS115S0400000_18(androidx.fragment.app.Fragment r3, com.ss.android.ugc.aweme.services.publish.ExtensionMisc r4, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback r5, com.ss.android.ugc.aweme.services.publish.PublishOutput r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 9 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r6
            r1.l3 = r5
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r6
            r1.l1 = r3
            r1.l2 = r4
            r1.l3 = r5
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS115S0400000_18.<init>(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.services.publish.ExtensionMisc, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$Callback, com.ss.android.ugc.aweme.services.publish.PublishOutput, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0400000_18(C291001Au c291001Au, C291001Au<? extends List<C1171050gZz>> c291001Au2, CollectionContentAssem collectionContentAssem, RecyclerView recyclerView, C1171210gaF c1171210gaF) {
        super(1);
        this.$t = c1171210gaF;
        this.l0 = c291001Au;
        this.l1 = c291001Au2;
        this.l2 = collectionContentAssem;
        this.l3 = recyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0400000_18(C1179560gni c1179560gni, C1179580gnk c1179580gnk, AwS562S0100000_18 awS562S0100000_18, AwS262S0300000_18 awS262S0300000_18, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1179560gni;
        this.l1 = c1179580gnk;
        this.l2 = awS562S0100000_18;
        this.l3 = awS262S0300000_18;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0400000_18(View view, C1749280vcc c1749280vcc, Context context, CollectionContentManageAssem collectionContentManageAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = c1749280vcc;
        this.l2 = context;
        this.l3 = collectionContentManageAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0400000_18(View view, BcmParams bcmParams, PoiDetailHeaderPoiShopCtaBaseAssem poiDetailHeaderPoiShopCtaBaseAssem, PoiShopBookingInfo poiShopBookingInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = poiShopBookingInfo;
        this.l2 = poiDetailHeaderPoiShopCtaBaseAssem;
        this.l3 = bcmParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0400000_18(View view, PoiDetailHeaderAssem poiDetailHeaderAssem, PoiListApi.PoiDetailResponse poiDetailResponse, ChartInfo chartInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = poiDetailHeaderAssem;
        this.l2 = poiDetailResponse;
        this.l3 = chartInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0400000_18(View view, PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem, PoiListApi.PoiDetailResponse poiDetailResponse, ChartInfo chartInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = poiDetailFoodHeaderAssem;
        this.l2 = poiDetailResponse;
        this.l3 = chartInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0400000_18(View view, PoiDetailTravelHeaderAssemV2 poiDetailTravelHeaderAssemV2, PoiListApi.PoiDetailResponse poiDetailResponse, ChartInfo chartInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = poiDetailTravelHeaderAssemV2;
        this.l2 = poiDetailResponse;
        this.l3 = chartInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0400000_18(TuxTextView tuxTextView, PoiHotelCardCell poiHotelCardCell, SlashTrackConfig slashTrackConfig, PoiCardCellData poiCardCellData, int i) {
        super(1);
        this.$t = i;
        this.l0 = tuxTextView;
        this.l1 = poiHotelCardCell;
        this.l2 = slashTrackConfig;
        this.l3 = poiCardCellData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0400000_18(MixVideosResponse mixVideosResponse, MixVideosResponse mixVideosResponse2, C118300cf c118300cf, MixVideosViewModel mixVideosViewModel, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        super(1);
        this.$t = interfaceC1364105Vn;
        this.l0 = mixVideosResponse;
        this.l1 = mixVideosResponse2;
        this.l2 = c118300cf;
        this.l3 = mixVideosViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0400000_18(MixVideosManageViewModel mixVideosManageViewModel, MixVideosManageViewModel mixVideosManageViewModel2, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn, MixVideosResponse mixVideosResponse, List<? extends Aweme> list) {
        super(1);
        this.$t = list;
        this.l0 = mixVideosManageViewModel;
        this.l1 = mixVideosManageViewModel2;
        this.l2 = interfaceC1364105Vn;
        this.l3 = mixVideosResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0400000_18(PoiFeedBottomAssem poiFeedBottomAssem, PoiDataStruct poiDataStruct, C1188440h22 c1188440h22, C1185490gxH c1185490gxH, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiFeedBottomAssem;
        this.l1 = poiDataStruct;
        this.l2 = c1188440h22;
        this.l3 = c1185490gxH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0400000_18(PoiBackgroundMapAssem poiBackgroundMapAssem, PoiBackgroundMapAssem poiBackgroundMapAssem2, List<PoiDiscoveryCard> list, Context context, PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse) {
        super(1);
        this.$t = poiDiscoveryApi$PoiDiscoveryCardListResponse;
        this.l0 = poiBackgroundMapAssem;
        this.l1 = poiBackgroundMapAssem2;
        this.l2 = list;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0400000_18(PoiRecommendFeatureBottomBarAssem poiRecommendFeatureBottomBarAssem, PoiRecommendFeatureBottomBarModule poiRecommendFeatureBottomBarModule, C1184490gvf c1184490gvf, PoiButton poiButton, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiRecommendFeatureBottomBarAssem;
        this.l1 = poiRecommendFeatureBottomBarModule;
        this.l2 = c1184490gvf;
        this.l3 = poiButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0400000_18(PoiSearchVM poiSearchVM, C19EG c19eg, PoiData poiData, EnumC1198680hIY enumC1198680hIY, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiSearchVM;
        this.l1 = c19eg;
        this.l2 = poiData;
        this.l3 = enumC1198680hIY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0400000_18(StoryArchiveV2ListViewModel storyArchiveV2ListViewModel, StoryArchiveV2ListViewModel storyArchiveV2ListViewModel2, C1173680geE c1173680geE, StoryArchiveV2Cache storyArchiveV2Cache, Map<String, ? extends Aweme> map) {
        super(1);
        this.$t = map;
        this.l0 = storyArchiveV2ListViewModel;
        this.l1 = storyArchiveV2ListViewModel2;
        this.l2 = c1173680geE;
        this.l3 = storyArchiveV2Cache;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0400000_18(NearbyContainerViewModel nearbyContainerViewModel, NearbyContainerViewModel nearbyContainerViewModel2, Pair<? extends EnumC1204140hRM, C1204080hRG> pair, C1204080hRG c1204080hRG, C1203960hR4 c1203960hR4) {
        super(1);
        this.$t = c1203960hR4;
        this.l0 = nearbyContainerViewModel;
        this.l1 = nearbyContainerViewModel2;
        this.l2 = pair;
        this.l3 = c1204080hRG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0400000_18(List list, List<PoiGeneralCard> list2, PoiBackgroundMapComponent poiBackgroundMapComponent, Context context, PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 poiDiscoveryApi$PoiDiscoveryCardListResponseV2) {
        super(1);
        this.$t = poiDiscoveryApi$PoiDiscoveryCardListResponseV2;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = poiBackgroundMapComponent;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0400000_18(List list, List<C1179850goB> list2, List<C1179830go9> list3, Map<String, ? extends List<C1179830go9>> map, C1179830go9 c1179830go9) {
        super(1);
        this.$t = c1179830go9;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = list3;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0400000_18(Map map, Map<String, Object> map2, Map<String, Object> map3, Map<String, Long> map4, PoiDetailLynxAssem poiDetailLynxAssem) {
        super(1);
        this.$t = poiDetailLynxAssem;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = map3;
        this.l3 = map4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0400000_18(Function0 function0, Function0<Unit> function02, C1179560gni c1179560gni, InterfaceC1177250gjz interfaceC1177250gjz, C1179580gnk c1179580gnk) {
        super(1);
        this.$t = c1179580gnk;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = c1179560gni;
        this.l3 = interfaceC1177250gjz;
    }
}
