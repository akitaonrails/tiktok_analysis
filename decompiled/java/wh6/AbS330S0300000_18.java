package wh6;

import X.AbstractC1255890imp;
import X.AbstractC848400XPy;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C08XD;
import X.C0XQ7;
import X.C1170800gZa;
import X.C1171250gaJ;
import X.C1172580gcS;
import X.C1185430gxB;
import X.C1185640gxW;
import X.C1186950gzd;
import X.C1187050gzn;
import X.C1195630hDd;
import X.C1204470hRt;
import X.C1204530hRz;
import X.C1205260hTA;
import X.C1247530iZL;
import X.C1388190mED;
import X.C1390850mIV;
import X.C13LP;
import X.C1558360qeg;
import X.C1603960rqE;
import X.C18JG;
import X.C197039127h;
import X.C19EG;
import X.C2188811AlT;
import X.C2277881EDy;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListMainUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCommonCardCell;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingContent;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryActivity;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashClickConfig;
import com.ss.android.ugc.aweme.slash.cell.title.SlashTitleCell;
import com.ss.android.ugc.aweme.slash.cell.title.SlashTitleCellModel;
import com.ss.android.ugc.aweme.slash.data.AnchorComponentInfo;
import com.ss.android.ugc.nearby.feedcard.NearbyFeedCellAssem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS585S0100000_6;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class AbS330S0300000_18 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) throws JSONException {
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS330S0300000_18 abS330S0300000_18, View view) {
        CollectionContentResponse collectionContentResponse;
        String str;
        boolean zBooleanValue;
        long jLongValue;
        boolean z;
        String str2;
        String str3;
        CollectionDetail.Status status;
        if (view != null && (collectionContentResponse = ((C1171250gaJ) abS330S0300000_18.l0).LLJI) != null) {
            AbstractC1255890imp<?, ?> abstractC1255890impProvideAwemeModel = C2277881EDy.LIZIZ.provideAwemeModel();
            CollectionDetail collectionDetail = ((C1171250gaJ) abS330S0300000_18.l0).LLJILJIL;
            Integer num = null;
            if (collectionDetail != null) {
                str = collectionDetail.id;
            } else {
                str = null;
            }
            List<Aweme> list = collectionContentResponse.items;
            Boolean bool = collectionContentResponse.hasMore;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Long l = collectionContentResponse.maxCursor;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            abstractC1255890impProvideAwemeModel.LJIIJ(list, jLongValue, zBooleanValue, str);
            C1603960rqE.LIZ = abstractC1255890impProvideAwemeModel;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C1170800gZa) abS330S0300000_18.l1).LIZ.getContext(), "aweme://aweme/detail/");
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, ((C1170800gZa) abS330S0300000_18.l1).LIZIZ.getAid(), bundle);
            C786410Ut5.LJJJI("video_from", "from_profile_other", bundle);
            C786410Ut5.LJJJI("userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), bundle);
            C786410Ut5.LJJJI("sec_userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId(), bundle);
            C786410Ut5.LJJJI("refer", ((CollectionListMainUIAssem) abS330S0300000_18.l2).Go().LLILLL, bundle);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LJ("enable_video_favorite_tabname_opt", 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C786410Ut5.LJJJI("tab_name", "collections_tab", bundle);
            } else {
                C786410Ut5.LJJJI("tab_name", "collection", bundle);
            }
            bundle.putInt("video_type", 4);
            bundle.putBoolean("is_clean_mode", false);
            CollectionDetail collectionDetail2 = ((C1171250gaJ) abS330S0300000_18.l0).LLJILJIL;
            if (collectionDetail2 != null) {
                str2 = collectionDetail2.id;
            } else {
                str2 = null;
            }
            C786410Ut5.LJJJI("collection_id", str2, bundle);
            CollectionDetail collectionDetail3 = ((C1171250gaJ) abS330S0300000_18.l0).LLJILJIL;
            if (collectionDetail3 != null) {
                str3 = collectionDetail3.name;
            } else {
                str3 = null;
            }
            C786410Ut5.LJJJI("collection_name", str3, bundle);
            CollectionDetail collectionDetail4 = ((C1171250gaJ) abS330S0300000_18.l0).LLJILJIL;
            if (collectionDetail4 != null && (status = collectionDetail4.status) != null) {
                num = status.state;
            }
            C786410Ut5.LJJJI("collection_type", C1172580gcS.LIZ(num), bundle);
            C786410Ut5.LJJJI("enter_from", ((CollectionListMainUIAssem) abS330S0300000_18.l2).Go().LLILLL, bundle);
            bundle.putBoolean("is_support_gesture_exit", false);
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.withParam("activity_has_activity_options", true);
            smartRouteBuildRoute.open();
        }
    }

    public static final void LIZ$1(AbS330S0300000_18 abS330S0300000_18, View view) throws JSONException {
        C19EG c19egLIZIZ;
        TuxActionSheet tuxActionSheet;
        String merchantId;
        String ttoclid;
        if (view != null) {
            ((PoiDetailHeaderPoiShopCtaBaseAssem) abS330S0300000_18.l0).mp();
            PoiDetailHeaderPoiShopCtaBaseAssem poiDetailHeaderPoiShopCtaBaseAssem = (PoiDetailHeaderPoiShopCtaBaseAssem) abS330S0300000_18.l0;
            PoiShopBookingInfo poiShopBookingInfo = (PoiShopBookingInfo) abS330S0300000_18.l1;
            BcmParams bcmParams = (BcmParams) abS330S0300000_18.l2;
            poiDetailHeaderPoiShopCtaBaseAssem.getClass();
            List<PoiBookingContent> list = poiShopBookingInfo.contentList;
            if (list != null && !list.isEmpty()) {
                C1186950gzd c1186950gzd = C1186950gzd.LIZ;
                List<PoiBookingContent> list2 = poiShopBookingInfo.contentList;
                c1186950gzd.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                final Map mapLIZ = C1186950gzd.LIZ();
                if (list2 != null) {
                    for (PoiBookingContent poiBookingContent : list2) {
                        if (poiBookingContent != null && poiBookingContent.isValid()) {
                            String merchantId2 = poiBookingContent.getMerchantId();
                            if (merchantId2 != null) {
                                C1186950gzd.LIZ.getClass();
                                Long l = (Long) ((LinkedHashMap) mapLIZ).get(C1186950gzd.LIZIZ(merchantId2));
                                if (l != null && l.longValue() > 0) {
                                    arrayList.add(poiBookingContent);
                                } else {
                                    arrayList2.add(poiBookingContent);
                                }
                            } else {
                                arrayList2.add(poiBookingContent);
                            }
                        }
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clickedList before sort - ");
                sbLIZ.append(arrayList);
                C2188811AlT.LIZIZ(sbLIZ);
                if (arrayList.size() > 1) {
                    C08XD.LJJ(arrayList, new Comparator() { // from class: X.0gze
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            long jLongValue;
                            Map map = mapLIZ;
                            C1186950gzd c1186950gzd2 = C1186950gzd.LIZ;
                            String merchantId3 = ((PoiBookingContent) t2).getMerchantId();
                            String str = "";
                            if (merchantId3 == null) {
                                merchantId3 = "";
                            }
                            c1186950gzd2.getClass();
                            Long l2 = (Long) map.get(C1186950gzd.LIZIZ(merchantId3));
                            long jLongValue2 = 0;
                            if (l2 != null) {
                                jLongValue = l2.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            Long lValueOf = Long.valueOf(jLongValue);
                            Map map2 = mapLIZ;
                            String merchantId4 = ((PoiBookingContent) t).getMerchantId();
                            if (merchantId4 != null) {
                                str = merchantId4;
                            }
                            Long l3 = (Long) map2.get(C1186950gzd.LIZIZ(str));
                            if (l3 != null) {
                                jLongValue2 = l3.longValue();
                            }
                            return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(jLongValue2));
                        }
                    });
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("clickedList after sort - ");
                sbLIZ2.append(arrayList);
                C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("noRecordList before shuffle - ");
                sbLIZ3.append(arrayList2);
                C2188811AlT.LIZIZ(sbLIZ3);
                Collections.shuffle(arrayList2);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("noRecordList after shuffle - ");
                sbLIZ4.append(arrayList2);
                C2188811AlT.LIZIZ(sbLIZ4);
                List listLJLIL = C13LP.LJLIL(arrayList2, arrayList);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("sortedList result - ");
                sbLIZ5.append(listLJLIL);
                C2188811AlT.LIZIZ(sbLIZ5);
                String strLIZLLL = C18JG.LIZLLL(PageFinder.via(view), "c74061.d0923", bcmParams);
                ArrayList<PoiBookingContent> arrayList3 = (ArrayList) listLJLIL;
                String str = "";
                if (arrayList3.size() == 1) {
                    String strLLIIJI = poiDetailHeaderPoiShopCtaBaseAssem.LLIIJI();
                    if (strLLIIJI == null) {
                        strLLIIJI = "click_button";
                    }
                    poiDetailHeaderPoiShopCtaBaseAssem.lp(poiShopBookingInfo, strLLIIJI, 0, poiShopBookingInfo.trackInfo, strLIZLLL, (PageFinder) poiDetailHeaderPoiShopCtaBaseAssem.LLJJIJIIJIL.getValue());
                    C1187050gzn c1187050gzn = C1187050gzn.LIZ;
                    PoiBookingContent poiBookingContent2 = (PoiBookingContent) C13LP.LJJJLL(poiShopBookingInfo.contentList);
                    String url = null;
                    if (poiBookingContent2 != null) {
                        url = poiBookingContent2.getUrl();
                    }
                    Context context = view.getContext();
                    JSONObject jSONObjectHp = poiDetailHeaderPoiShopCtaBaseAssem.hp("click_reserve_button");
                    if (jSONObjectHp != null) {
                        PoiBookingContent poiBookingContent3 = (PoiBookingContent) C13LP.LJJJLL(poiShopBookingInfo.contentList);
                        if (poiBookingContent3 != null && (ttoclid = poiBookingContent3.getTtoclid()) != null) {
                            jSONObjectHp.putOpt("ttoclid", ttoclid);
                        }
                        PoiBookingContent poiBookingContent4 = (PoiBookingContent) C13LP.LJJJLL(poiShopBookingInfo.contentList);
                        if (poiBookingContent4 != null && (merchantId = poiBookingContent4.getMerchantId()) != null) {
                            jSONObjectHp.putOpt("merchant_ids", merchantId);
                        }
                        String strJ3 = C786410Ut5.J3(jSONObjectHp);
                        if (strJ3 != null) {
                            str = strJ3;
                        }
                    }
                    c1187050gzn.getClass();
                    C1187050gzn.LIZ(context, url, str);
                    return;
                }
                if (arrayList3.size() > 1) {
                    String strLLIIJI2 = poiDetailHeaderPoiShopCtaBaseAssem.LLIIJI();
                    if (strLLIIJI2 == null) {
                        strLLIIJI2 = "click_list";
                    }
                    poiDetailHeaderPoiShopCtaBaseAssem.lp(poiShopBookingInfo, strLLIIJI2, 1, poiShopBookingInfo.trackInfo, strLIZLLL, (PageFinder) poiDetailHeaderPoiShopCtaBaseAssem.LLJJIJIIJIL.getValue());
                    String str2 = poiShopBookingInfo.dialogTitle;
                    if (!poiDetailHeaderPoiShopCtaBaseAssem.LLJJIII) {
                        poiDetailHeaderPoiShopCtaBaseAssem.LLJJIII = true;
                        C1390850mIV c1390850mIV = new C1390850mIV();
                        ArrayList arrayList4 = new ArrayList();
                        for (PoiBookingContent poiBookingContent5 : arrayList3) {
                            C1247530iZL c1247530iZL = new C1247530iZL();
                            c1247530iZL.LJI = new AwS585S0100000_6(poiBookingContent5, 453);
                            String merchantName = poiBookingContent5.getMerchantName();
                            if (merchantName == null) {
                                merchantName = "";
                            }
                            c1247530iZL.LIZ = merchantName;
                            c1247530iZL.LIZ(new AwS384S0200000_18(poiBookingContent5, poiDetailHeaderPoiShopCtaBaseAssem, 296));
                            arrayList4.add(c1247530iZL);
                        }
                        c1390850mIV.LJFF(arrayList4);
                        if (str2 != null) {
                            str = str2;
                        }
                        c1390850mIV.LIZ.LLJJIJI = str;
                        poiDetailHeaderPoiShopCtaBaseAssem.LLJJIJI = c1390850mIV.LIZJ();
                        Context context2 = poiDetailHeaderPoiShopCtaBaseAssem.getContext();
                        if (context2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(context2)) != null && (tuxActionSheet = poiDetailHeaderPoiShopCtaBaseAssem.LLJJIJI) != null) {
                            tuxActionSheet.show(SAFExtensionKt.LJJI(c19egLIZIZ), "shelves_sheet_tag");
                        }
                        poiDetailHeaderPoiShopCtaBaseAssem.LLJJIII = false;
                    }
                }
            }
        }
    }

    public static final void LIZ$2(AbS330S0300000_18 abS330S0300000_18, View view) {
        if (view != null) {
            if (((C1195630hDd) abS330S0300000_18.l0).isShown()) {
                ((C1195630hDd) abS330S0300000_18.l0).LIZIZ();
            }
            ((SlashTitleCell) abS330S0300000_18.l1).Fp(view, (SlashTitleCellModel) abS330S0300000_18.l2);
        }
    }

    public static final void LIZ$3(AbS330S0300000_18 abS330S0300000_18, View view) {
        if (view != null) {
            C1204530hRz.LIZ.getClass();
            C1204530hRz.LIZIZ = true;
            ((NearbyFeedCellAssem) abS330S0300000_18.l0).sp().wQ2();
            ((NearbyFeedCellAssem) abS330S0300000_18.l0).op("click_card_head");
            C1205260hTA c1205260hTA = C1205260hTA.LIZ;
            Aweme aweme = (Aweme) abS330S0300000_18.l1;
            String strValueOf = String.valueOf(((C1204470hRt) abS330S0300000_18.l2).LLILZIL);
            c1205260hTA.getClass();
            C1205260hTA.LJIIIIZZ(aweme, "click_card_head", strValueOf);
        }
    }

    public static final void LIZ$4(AbS330S0300000_18 abS330S0300000_18, View view) {
        if (view != null) {
            C1204530hRz.LIZ.getClass();
            C1204530hRz.LIZIZ = true;
            ((NearbyFeedCellAssem) abS330S0300000_18.l0).sp().wQ2();
            ((NearbyFeedCellAssem) abS330S0300000_18.l0).op("click_card_name");
            C1205260hTA c1205260hTA = C1205260hTA.LIZ;
            Aweme aweme = (Aweme) abS330S0300000_18.l1;
            String strValueOf = String.valueOf(((C1204470hRt) abS330S0300000_18.l2).LLILZIL);
            c1205260hTA.getClass();
            C1205260hTA.LJIIIIZZ(aweme, "click_card_name", strValueOf);
        }
    }

    public static final void LIZ$5(AbS330S0300000_18 abS330S0300000_18, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        List<AnchorComponentInfo> list;
        AnchorComponentInfo anchorComponentInfo;
        if (view != null) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            PoiCurrentSessionInfo poiCurrentSessionInfoLLLLZI = ((PoiGalleryActivity) abS330S0300000_18.l0).LLLLZI();
            String str8 = null;
            if (poiCurrentSessionInfoLLLLZI != null) {
                str = poiCurrentSessionInfoLLLLZI.enterGalleryFrom;
            } else {
                str = null;
            }
            PoiCurrentSessionInfo poiCurrentSessionInfoLLLLZI2 = ((PoiGalleryActivity) abS330S0300000_18.l0).LLLLZI();
            if (poiCurrentSessionInfoLLLLZI2 != null) {
                str2 = poiCurrentSessionInfoLLLLZI2.poiId;
            } else {
                str2 = null;
            }
            AnchorComponentInfo anchorComponentInfo2 = (AnchorComponentInfo) abS330S0300000_18.l1;
            if (anchorComponentInfo2 != null) {
                str3 = anchorComponentInfo2.iconType;
            } else {
                str3 = null;
            }
            PoiCurrentSessionInfo poiCurrentSessionInfoLLLLZI3 = ((PoiGalleryActivity) abS330S0300000_18.l0).LLLLZI();
            if (poiCurrentSessionInfoLLLLZI3 != null) {
                str4 = poiCurrentSessionInfoLLLLZI3.collectInfo;
            } else {
                str4 = null;
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ((C197039127h) abS330S0300000_18.l2, null);
            PageFinder pageFinderLLLLZLLIL = ((PoiGalleryActivity) abS330S0300000_18.l0).LLLLZLLIL();
            c1185430gxB.getClass();
            C1185430gxB.LJIILIIL(str, str2, str3, str4, null, interfaceC665370Q7zLJ, pageFinderLLLLZLLIL);
            ((PoiGalleryActivity) abS330S0300000_18.l0).yv2("click");
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            PoiCurrentSessionInfo poiCurrentSessionInfoLLLLZI4 = ((PoiGalleryActivity) abS330S0300000_18.l0).LLLLZI();
            if (poiCurrentSessionInfoLLLLZI4 != null) {
                str5 = poiCurrentSessionInfoLLLLZI4.poiId;
            } else {
                str5 = null;
            }
            PoiCurrentSessionInfo poiCurrentSessionInfoLLLLZI5 = ((PoiGalleryActivity) abS330S0300000_18.l0).LLLLZI();
            if (poiCurrentSessionInfoLLLLZI5 != null) {
                str6 = poiCurrentSessionInfoLLLLZI5.poiSessionId;
            } else {
                str6 = null;
            }
            PoiCurrentSessionInfo poiCurrentSessionInfoLLLLZI6 = ((PoiGalleryActivity) abS330S0300000_18.l0).LLLLZI();
            if (poiCurrentSessionInfoLLLLZI6 != null && (list = poiCurrentSessionInfoLLLLZI6.anchorModuleList) != null && (anchorComponentInfo = (AnchorComponentInfo) C13LP.LJJJLL(list)) != null) {
                str7 = anchorComponentInfo.instanceId;
            } else {
                str7 = null;
            }
            PoiCurrentSessionInfo poiCurrentSessionInfoLLLLZI7 = ((PoiGalleryActivity) abS330S0300000_18.l0).LLLLZI();
            if (poiCurrentSessionInfoLLLLZI7 != null) {
                str8 = poiCurrentSessionInfoLLLLZI7.albumSessionId;
            }
            eventBusLIZLLL.LJIILL(new C1185640gxW(str5, str6, str7, str8, 8));
            ((PoiGalleryActivity) abS330S0300000_18.l0).finish();
        }
    }

    public static final void LIZ$6(AbS330S0300000_18 abS330S0300000_18, View view) {
        if (view != null) {
            PoiCommonCardCell poiCommonCardCell = (PoiCommonCardCell) abS330S0300000_18.l0;
            poiCommonCardCell.up(poiCommonCardCell.Ep("cell_click"));
            ((PoiCommonCardCell) abS330S0300000_18.l0).Xp((PoiCardCellData) abS330S0300000_18.l1);
            ((PoiCommonCardCell) abS330S0300000_18.l0).Ip((PoiCardCellData) abS330S0300000_18.l1, (SlashClickConfig) abS330S0300000_18.l2, "product_shelf");
        }
    }

    public static final void LIZ$7(AbS330S0300000_18 abS330S0300000_18, View view) {
        if (view != null) {
            PoiCommonCardCell poiCommonCardCell = (PoiCommonCardCell) abS330S0300000_18.l0;
            poiCommonCardCell.up(poiCommonCardCell.Ep("cell_click"));
            ((PoiCommonCardCell) abS330S0300000_18.l0).Xp((PoiCardCellData) abS330S0300000_18.l1);
            ((PoiCommonCardCell) abS330S0300000_18.l0).Ip((PoiCardCellData) abS330S0300000_18.l1, (SlashClickConfig) abS330S0300000_18.l2, "product_shelf");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS330S0300000_18(Object obj, Object obj2, Object obj3, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
