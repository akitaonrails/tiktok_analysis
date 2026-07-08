package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C0I7D;
import X.C1152870g6f;
import X.C1156020gBk;
import X.C1159280gH0;
import X.C1170570gZD;
import X.C1171050gZz;
import X.C1171370gaV;
import X.C1172600gcU;
import X.C1182980gtE;
import X.C1183080gtO;
import X.C1183170gtX;
import X.C1187520h0Y;
import X.C1187600h0g;
import X.C1187970h1H;
import X.C1189410h3b;
import X.C1195320hD8;
import X.C1196140hES;
import X.C1197720hH0;
import X.C1197910hHJ;
import X.C11JF;
import X.C11O8;
import X.C11S5;
import X.C1204470hRt;
import X.C1204510hRx;
import X.C1241040iOs;
import X.C1391190mJ3;
import X.C1440005kM;
import X.C15438062q;
import X.C1623606Xi;
import X.C1687630u1B;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C197039127h;
import X.C2188811AlT;
import X.C291001Au;
import X.C297500BlM;
import X.C297510BlN;
import X.C343970De7;
import X.C438720HIg;
import X.C627260Oiy;
import X.C786410Ut5;
import X.EnumC1195310hD7;
import X.EnumC1197740hH2;
import X.EnumC994380bz2;
import X.InterfaceC1172550gcP;
import X.InterfaceC1204490hRv;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS153S0100000_18;
import Y.AfS187S0100000_18;
import Y.AfS7S0100100_18;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.manage.joinquestion.EditJoinQuestionFragment;
import com.ss.android.ugc.aweme.manage.joinquestion.EditJoinQuestionViewModel;
import com.ss.android.ugc.aweme.mix.choose.PlaylistChoosePanelStatusViewAssem;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;
import com.ss.android.ugc.aweme.poi.map.PoiMapViewModel;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.vm.PoiRecommendFeatureDetailSharedViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashPowerListCellGroupCommonReusedAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS132S1100000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        int type;
        int type2;
        int type3;
        String string;
        C1196140hES c1196140hES = (C1196140hES) obj;
        EnumC1195310hD7 enumC1195310hD7 = ((C1195320hD8) awS132S1100000_18.l1).LIZ;
        int type4 = -1;
        if (enumC1195310hD7 != null) {
            type = enumC1195310hD7.getType();
        } else {
            type = -1;
        }
        c1196140hES.LIZ(type, "icon data source");
        EnumC1195310hD7 enumC1195310hD72 = ((C1195320hD8) awS132S1100000_18.l1).LIZIZ;
        if (enumC1195310hD72 != null) {
            type2 = enumC1195310hD72.getType();
        } else {
            type2 = -1;
        }
        c1196140hES.LIZIZ(type2, "first line, first slot, data source");
        EnumC1195310hD7 enumC1195310hD73 = ((C1195320hD8) awS132S1100000_18.l1).LIZJ;
        if (enumC1195310hD73 != null) {
            type3 = enumC1195310hD73.getType();
        } else {
            type3 = -1;
        }
        c1196140hES.LIZJ(type3, "first line, second slot, data source");
        EnumC1195310hD7 enumC1195310hD74 = ((C1195320hD8) awS132S1100000_18.l1).LIZLLL;
        if (enumC1195310hD74 != null) {
            type4 = enumC1195310hD74.getType();
        }
        c1196140hES.LIZLLL(type4, "second line, first slot, data source");
        EnumC1195310hD7 enumC1195310hD75 = ((C1195320hD8) awS132S1100000_18.l1).LJ;
        if (enumC1195310hD75 == null || (string = Integer.valueOf(enumC1195310hD75.getType()).toString()) == null) {
            string = "-1";
        }
        c1196140hES.LJ("second line, second slot, data source", string);
        String str = awS132S1100000_18.s0;
        if (str == null) {
            str = "poi";
        }
        c1196140hES.LJFF("poi anchor_type", str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("variableManager setVariable key: ");
        sbLIZ.append(awS132S1100000_18.s0);
        sbLIZ.append(", data: ");
        sbLIZ.append(awS132S1100000_18.l1);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        Object next;
        C1183170gtX c1183170gtX;
        C1183080gtO c1183080gtO = (C1183080gtO) obj;
        c1183080gtO.getClass();
        List listLIZ = C627260Oiy.LIZ(c1183080gtO);
        if (listLIZ != null) {
            String str = awS132S1100000_18.s0;
            Iterator it2 = listLIZ.iterator();
            while (true) {
                String aid = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) next;
                    if (interfaceC1891350zJl instanceof C1183170gtX) {
                        Aweme aweme = ((C1183170gtX) interfaceC1891350zJl).LL.aweme;
                        if (aweme != null) {
                            aid = aweme.getAid();
                        }
                        if (Intrinsics.LJFF(aid, str)) {
                            break;
                        }
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) next;
            if (interfaceC1891350zJl2 != null) {
                PoiRecommendFeatureDetailSharedViewModel poiRecommendFeatureDetailSharedViewModel = (PoiRecommendFeatureDetailSharedViewModel) awS132S1100000_18.l1;
                List listLIZ2 = C627260Oiy.LIZ(c1183080gtO);
                if (listLIZ2 != null) {
                    Integer numValueOf = Integer.valueOf(listLIZ2.indexOf(interfaceC1891350zJl2));
                    if (numValueOf.intValue() >= 0) {
                        int iIntValue = numValueOf.intValue();
                        if ((interfaceC1891350zJl2 instanceof C1183170gtX) && (c1183170gtX = (C1183170gtX) interfaceC1891350zJl2) != null) {
                            poiRecommendFeatureDetailSharedViewModel.listSetItemAt(iIntValue, new C1183170gtX(c1183170gtX.LL, c1183170gtX.LLILLJJLI + 1));
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        ((C1687630u1B) awS132S1100000_18.l1).LLILZLL.invoke(new C1152870g6f(awS132S1100000_18.s0));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = ((SlashPowerListCellGroupCommonReusedAssem) awS132S1100000_18.l1).LLJLIL;
        c062p.LIZIZ = awS132S1100000_18.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        C1204470hRt c1204470hRt;
        C1204510hRx c1204510hRx = (C1204510hRx) obj;
        List<InterfaceC1204490hRv> list = c1204510hRx.LL.LLILZ;
        InterfaceC1204490hRv interfaceC1204490hRv = null;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            Iterator<InterfaceC1204490hRv> it2 = list.iterator();
            while (it2.hasNext()) {
                if ((!(it2.next() instanceof C1204470hRt)) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        List<InterfaceC1204490hRv> list2 = c1204510hRx.LL.LLILZ;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1204490hRv interfaceC1204490hRv2 : list2) {
                if (interfaceC1204490hRv2 instanceof C1204470hRt) {
                    arrayList.add(interfaceC1204490hRv2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C1204470hRt) it3.next()).LL.getAid());
            }
            int iIndexOf = arrayList2.indexOf(awS132S1100000_18.s0);
            if (iIndexOf >= 0) {
                int i2 = iIndexOf + i;
                List<InterfaceC1204490hRv> list3 = c1204510hRx.LL.LLILZ;
                if (list3 != null) {
                    interfaceC1204490hRv = (InterfaceC1204490hRv) ListProtector.get(list3, i2);
                }
                if ((interfaceC1204490hRv instanceof C1204470hRt) && (c1204470hRt = (C1204470hRt) interfaceC1204490hRv) != null) {
                    NearbyFeedSharedViewModel nearbyFeedSharedViewModel = (NearbyFeedSharedViewModel) awS132S1100000_18.l1;
                    Aweme aweme = c1204470hRt.LL;
                    nearbyFeedSharedViewModel.listSetItemAt(i2, C1204470hRt.LIZ(c1204470hRt, aweme, aweme.isLike(), null, null, 2044));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        String str;
        String str2;
        String str3;
        Integer numValueOf;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        List<PoiData> list;
        Integer numValueOf2;
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        C1197720hH0 c1197720hH0 = (C1197720hH0) awS132S1100000_18.l1;
        c1182980gtE.LIZ = c1197720hH0.LIZIZ;
        c1182980gtE.LIZIZ = c1197720hH0.LIZJ;
        String str4 = awS132S1100000_18.s0;
        if (str4 != null && str4.length() != 0) {
            str = "search_poi_sug_caliber";
        } else {
            str = "default_search_poi_sug_caliber";
        }
        c1182980gtE.LJ = str;
        String str5 = awS132S1100000_18.s0;
        if (str5 != null && str5.length() != 0) {
            str2 = "/tiktok/poi/api/place/search";
        } else {
            str2 = "/tiktok/poi/api/place/recommend";
        }
        c1182980gtE.LIZLLL = str2;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = ((C1197720hH0) awS132S1100000_18.l1).LJI;
        String str6 = null;
        if (poiSearchResultWrapper != null && (numValueOf2 = Integer.valueOf(poiSearchResultWrapper.responseSourceType)) != null && numValueOf2.intValue() == 0) {
            str3 = "server";
        } else {
            str3 = "local_cache";
        }
        c1182980gtE.LJFF = new Pair<>("", str3);
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper2 = ((C1197720hH0) awS132S1100000_18.l1).LJI;
        if (poiSearchResultWrapper2 != null && (poiSearchResult = poiSearchResultWrapper2.poiSearchResult) != null && (list = poiSearchResult.poiList) != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        c1182980gtE.LJIIL = numValueOf;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper3 = ((C1197720hH0) awS132S1100000_18.l1).LJI;
        if (poiSearchResultWrapper3 != null) {
            str6 = poiSearchResultWrapper3.LLILLJJLI;
        }
        C1197910hHJ.LJ(c1182980gtE, str6);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        return C1189410h3b.LIZ((C1189410h3b) obj, ((PoiReviewsApi.PoiWriteReviewResponse) awS132S1100000_18.l1).getEligible(), ((PoiReviewsApi.PoiWriteReviewResponse) awS132S1100000_18.l1).getEligibleExtraInfo(), awS132S1100000_18.s0, new C1623606Xi((PoiReviewsApi.PoiWriteReviewResponse) awS132S1100000_18.l1), ((PoiReviewsApi.PoiWriteReviewResponse) awS132S1100000_18.l1).getNeedEvent());
    }

    public static final Object invoke$16(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        return C1189410h3b.LIZ((C1189410h3b) obj, ((PoiReviewsApi.PoiWriteReviewResponse) awS132S1100000_18.l1).getEligible(), ((PoiReviewsApi.PoiWriteReviewResponse) awS132S1100000_18.l1).getEligibleExtraInfo(), awS132S1100000_18.s0, new C1623606Xi((PoiReviewsApi.PoiWriteReviewResponse) awS132S1100000_18.l1), ((PoiReviewsApi.PoiWriteReviewResponse) awS132S1100000_18.l1).getNeedEvent());
    }

    public static final Object invoke$17(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(C297500BlM.LIZ() ? 1 : 0, "is_creator");
        c1196140hES.LIZIZ(((EnumC1197740hH2) awS132S1100000_18.l1).getCode(), "scenario");
        c1196140hES.LIZJ(C297510BlN.LIZIZ() ? 1 : 0, "hit_creator_strength_exp");
        String str = awS132S1100000_18.s0;
        if (str != null) {
            c1196140hES.LJIIIIZZ = new Pair<>("filter_id", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        return ((EditJoinQuestionViewModel) awS132S1100000_18.l1).vQ2(C1159280gH0.LIZ((C1159280gH0) obj, false, awS132S1100000_18.s0, false, null, null, 29));
    }

    public static final Object invoke$19(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LJIIIIZZ("poi_id", String.valueOf(awS132S1100000_18.s0));
        c1196140hES.LJFF("is_finish", String.valueOf((Boolean) awS132S1100000_18.l1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        List<C1171050gZz> list;
        String aid;
        CollectionDetail.Statistic statistic;
        CollectionDetail.Statistic statistic2;
        Long l;
        Aweme aweme;
        C291001Au<List<C1171050gZz>> c291001AuLIZ = ((C1170570gZD) obj).LLILLJJLI.LIZ();
        Long lValueOf = null;
        if (c291001AuLIZ != null && (list = c291001AuLIZ.LIZ) != null) {
            String str = awS132S1100000_18.s0;
            Iterator<C1171050gZz> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1171050gZz next = it2.next();
                C1171050gZz c1171050gZz = next;
                if (c1171050gZz != null && (aweme = c1171050gZz.LIZ) != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str)) {
                    if (next != null) {
                        CollectionDetail collectionDetailQS = ((CollectionContentFragment) awS132S1100000_18.l1).qS();
                        if (collectionDetailQS != null && (statistic = collectionDetailQS.statistic) != null) {
                            CollectionDetail collectionDetailQS2 = ((CollectionContentFragment) awS132S1100000_18.l1).qS();
                            if (collectionDetailQS2 != null && (statistic2 = collectionDetailQS2.statistic) != null && (l = statistic2.total) != null) {
                                lValueOf = Long.valueOf(l.longValue() - 1);
                            }
                            statistic.total = lValueOf;
                        }
                        C1440005kM.LIZ(new C438720HIg(((CollectionContentFragment) awS132S1100000_18.l1).qS()));
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        String str;
        C1196140hES c1196140hES = (C1196140hES) obj;
        if (((EnumC994380bz2) awS132S1100000_18.l1) == EnumC994380bz2.SHOW) {
            str = "show";
        } else {
            str = "click";
        }
        c1196140hES.LJ("action", str);
        c1196140hES.LJFF("source", awS132S1100000_18.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        C11JF c11jf = ((PoiMapViewModel) awS132S1100000_18.l1).LL;
        if (c11jf == null || c11jf.isDisposed()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            PoiMapViewModel poiMapViewModel = (PoiMapViewModel) awS132S1100000_18.l1;
            poiMapViewModel.LLILZ++;
            PoiListApi.LIZ.getClass();
            C11O8 c11o8LJJJLZIJ = C1171370gaV.LIZ().LIZ(awS132S1100000_18.s0).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
            PoiMapViewModel poiMapViewModel2 = (PoiMapViewModel) awS132S1100000_18.l1;
            poiMapViewModel.LL = (C11JF) c11o8LJJJLZIJ.LJJLL(new AfS7S0100100_18(jCurrentTimeMillis, poiMapViewModel2, 4), new AfS187S0100000_18(poiMapViewModel2, 76));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        int i;
        List<String> list;
        if (((Boolean) obj).booleanValue()) {
            InputNameSheetFragment inputNameSheetFragment = (InputNameSheetFragment) awS132S1100000_18.l1;
            InterfaceC1172550gcP interfaceC1172550gcP = inputNameSheetFragment.LLIZ;
            if (interfaceC1172550gcP != null) {
                String str = awS132S1100000_18.s0;
                if (inputNameSheetFragment.LLJILJIL) {
                    i = 3;
                } else {
                    i = 1;
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = inputNameSheetFragment.LLJIJIL;
                boolean z = false;
                if (viewOnAttachStateChangeListenerC20604515jv != null && viewOnAttachStateChangeListenerC20604515jv.getVisibility() == 0 && (list = ((InputNameSheetFragment) awS132S1100000_18.l1).LLJILLL) != null && list.contains(awS132S1100000_18.s0)) {
                    z = true;
                }
                interfaceC1172550gcP.LIZ(i, str, false, z, null);
            }
            String str2 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF((InputNameSheetFragment) awS132S1100000_18.l1, C343970De7.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        ArrayList arrayList;
        int i;
        boolean z;
        boolean z2;
        List<String> list;
        List<String> selectedUserList;
        List<String> selectedUserList2;
        String currentUserID;
        if (((Boolean) obj).booleanValue()) {
            C1172600gcU c1172600gcU = ((EditCollectionFragment) awS132S1100000_18.l1).LLIZ;
            if (c1172600gcU != null && (selectedUserList2 = c1172600gcU.getSelectedUserList()) != null && (!selectedUserList2.isEmpty())) {
                arrayList = new ArrayList(selectedUserList2);
                IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
                    currentUserID = "";
                }
                arrayList.add(currentUserID);
            } else {
                arrayList = null;
            }
            EditCollectionFragment editCollectionFragment = (EditCollectionFragment) awS132S1100000_18.l1;
            InterfaceC1172550gcP interfaceC1172550gcP = editCollectionFragment.LLJIJIL;
            if (interfaceC1172550gcP != null) {
                String str = awS132S1100000_18.s0;
                C1172600gcU c1172600gcU2 = editCollectionFragment.LLIZ;
                if (c1172600gcU2 != null && (selectedUserList = c1172600gcU2.getSelectedUserList()) != null && !selectedUserList.isEmpty()) {
                    i = 5;
                } else if (((EditCollectionFragment) awS132S1100000_18.l1).LLJJ) {
                    i = 3;
                } else {
                    i = 1;
                }
                EditCollectionFragment editCollectionFragment2 = (EditCollectionFragment) awS132S1100000_18.l1;
                C1172600gcU c1172600gcU3 = editCollectionFragment2.LLIZ;
                if (c1172600gcU3 != null && c1172600gcU3.LLJ) {
                    z = true;
                } else {
                    z = false;
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = editCollectionFragment2.LLJ;
                if (viewOnAttachStateChangeListenerC20604515jv != null && viewOnAttachStateChangeListenerC20604515jv.getVisibility() == 0 && (list = ((EditCollectionFragment) awS132S1100000_18.l1).LLJJJ) != null && list.contains(awS132S1100000_18.s0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                interfaceC1172550gcP.LIZ(i, str, z, z2, arrayList);
            }
            C0I7D c0i7d = ((EditCollectionFragment) awS132S1100000_18.l1).LLILLJJLI;
            if (c0i7d != null) {
                KeyboardUtils.LIZIZ(c0i7d);
            }
            String str2 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF((EditCollectionFragment) awS132S1100000_18.l1, C343970De7.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        ((C062P) obj).LIZ = new C1156020gBk(awS132S1100000_18.s0, (C1241040iOs) awS132S1100000_18.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((EditJoinQuestionFragment) awS132S1100000_18.l1, new AwS62S1000000_11(awS132S1100000_18.s0, 1));
        assembler.QQ2((EditJoinQuestionFragment) awS132S1100000_18.l1, AFwS256S0000000_18.get$arr$(125));
        assembler.QQ2((EditJoinQuestionFragment) awS132S1100000_18.l1, AFwS256S0000000_18.get$arr$(126));
        assembler.QQ2((EditJoinQuestionFragment) awS132S1100000_18.l1, AFwS256S0000000_18.get$arr$(127));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setText(awS132S1100000_18.s0);
        c197039127h.setButtonVariant(0);
        C786410Ut5.U8(c197039127h, new ACListenerS153S0100000_18((PlaylistChoosePanelStatusViewAssem) awS132S1100000_18.l1, 33));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        InterfaceC1891350zJl interfaceC1891350zJl;
        C1187600h0g c1187600h0g;
        Aweme awemeLLILZ;
        InterfaceC1891350zJl next;
        C1187970h1H c1187970h1H = (C1187970h1H) obj;
        c1187970h1H.getClass();
        List<InterfaceC1891350zJl> list = c1187970h1H.getListState().LLILZ;
        if (list != null) {
            String str = awS132S1100000_18.s0;
            Iterator<InterfaceC1891350zJl> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    InterfaceC1891350zJl interfaceC1891350zJl2 = next;
                    if ((interfaceC1891350zJl2 instanceof C1187600h0g) && Intrinsics.LJFF(((C1187600h0g) interfaceC1891350zJl2).LLILLJJLI.getAid(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            interfaceC1891350zJl = next;
        } else {
            interfaceC1891350zJl = null;
        }
        if ((interfaceC1891350zJl instanceof C1187600h0g) && (c1187600h0g = (C1187600h0g) interfaceC1891350zJl) != null) {
            PoiPostPageShareVM poiPostPageShareVM = (PoiPostPageShareVM) awS132S1100000_18.l1;
            Aweme aweme = c1187600h0g.LLILLJJLI;
            IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
            if (iAwemeService != null) {
                awemeLLILZ = iAwemeService.LLILZ(aweme.getAid());
            } else {
                awemeLLILZ = null;
            }
            poiPostPageShareVM.getClass();
            PoiPostPageShareVM.JQ2(aweme, awemeLLILZ);
            List<InterfaceC1891350zJl> list2 = c1187970h1H.getListState().LLILZ;
            if (list2 != null) {
                Integer numValueOf = Integer.valueOf(list2.indexOf(c1187600h0g));
                if (numValueOf.intValue() >= 0) {
                    ((PoiPostPageShareVM) awS132S1100000_18.l1).listSetItemAt(numValueOf.intValue(), C1187600h0g.LIZ(c1187600h0g, c1187600h0g.LLILZ + 1));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS132S1100000_18 awS132S1100000_18, Object obj) {
        InterfaceC1891350zJl next;
        C1187600h0g c1187600h0g;
        C1187520h0Y c1187520h0Y = (C1187520h0Y) obj;
        c1187520h0Y.getClass();
        List<InterfaceC1891350zJl> list = c1187520h0Y.getListState().LLILZ;
        if (list != null) {
            String str = awS132S1100000_18.s0;
            Iterator<InterfaceC1891350zJl> it2 = list.iterator();
            while (true) {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
                InterfaceC1891350zJl interfaceC1891350zJl = next;
                if ((interfaceC1891350zJl instanceof C1187600h0g) && Intrinsics.LJFF(((C1187600h0g) interfaceC1891350zJl).LLILLJJLI.getAid(), str)) {
                    break;
                }
            }
            InterfaceC1891350zJl interfaceC1891350zJl2 = next;
            if (interfaceC1891350zJl2 != null) {
                PoiVideoListSharedViewModel poiVideoListSharedViewModel = (PoiVideoListSharedViewModel) awS132S1100000_18.l1;
                List<InterfaceC1891350zJl> list2 = c1187520h0Y.getListState().LLILZ;
                if (list2 != null) {
                    Integer numValueOf = Integer.valueOf(list2.indexOf(interfaceC1891350zJl2));
                    if (numValueOf.intValue() >= 0) {
                        int iIntValue = numValueOf.intValue();
                        if ((interfaceC1891350zJl2 instanceof C1187600h0g) && (c1187600h0g = (C1187600h0g) interfaceC1891350zJl2) != null) {
                            poiVideoListSharedViewModel.listSetItemAt(iIntValue, C1187600h0g.LIZ(c1187600h0g, c1187600h0g.LLILZ + 1));
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(EnumC994380bz2 enumC994380bz2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = enumC994380bz2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(C1195320hD8 c1195320hD8, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1195320hD8;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(C1197720hH0 c1197720hH0, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1197720hH0;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(EnumC1197740hH2 enumC1197740hH2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = enumC1197740hH2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(C1687630u1B c1687630u1B, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1687630u1B;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(CollectionContentFragment collectionContentFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = collectionContentFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(InputNameSheetFragment inputNameSheetFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = inputNameSheetFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(EditCollectionFragment editCollectionFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = editCollectionFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(EditJoinQuestionFragment editJoinQuestionFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = editJoinQuestionFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(EditJoinQuestionViewModel editJoinQuestionViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = editJoinQuestionViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(PoiPostPageShareVM poiPostPageShareVM, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiPostPageShareVM;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(PoiMapViewModel poiMapViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiMapViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiWriteReviewResponse;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(SlashPowerListCellGroupCommonReusedAssem slashPowerListCellGroupCommonReusedAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = slashPowerListCellGroupCommonReusedAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(String str, C1241040iOs c1241040iOs, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1241040iOs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(String str, PlaylistChoosePanelStatusViewAssem playlistChoosePanelStatusViewAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = playlistChoosePanelStatusViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(String str, PoiVideoListSharedViewModel poiVideoListSharedViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = poiVideoListSharedViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(String str, PoiRecommendFeatureDetailSharedViewModel poiRecommendFeatureDetailSharedViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = poiRecommendFeatureDetailSharedViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(String str, NearbyFeedSharedViewModel nearbyFeedSharedViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = nearbyFeedSharedViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(String str, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS132S1100000_18(String str, Object obj, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
