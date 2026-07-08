package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0WZX;
import X.C1167940gUy;
import X.C1169160gWw;
import X.C1169240gX4;
import X.C1169500gXU;
import X.C1169510gXV;
import X.C1170970gZr;
import X.C1171140ga8;
import X.C1175130ggZ;
import X.C1175850ghj;
import X.C1179620gno;
import X.C1179950goL;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185490gxH;
import X.C1187540h0a;
import X.C1187600h0g;
import X.C1188440h22;
import X.C1189060h32;
import X.C1189570h3r;
import X.C1189580h3s;
import X.C1195630hDd;
import X.C1197730hH1;
import X.C1197840hHC;
import X.C1197870hHF;
import X.C1204760hSM;
import X.C1204770hSN;
import X.C1204900hSa;
import X.C1204920hSc;
import X.C1204990hSj;
import X.C1205490hTX;
import X.C123100dR;
import X.C1252710ihh;
import X.C1389890mGx;
import X.C1389910mGz;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C197039127h;
import X.C19EG;
import X.C1EMR;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2365509Or;
import X.C297000BkY;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1204690hSF;
import X.EnumC442690HXn;
import X.InterfaceC1169560gXa;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.favorites.business.collection.CollaborativeUser;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentManageAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameAssem;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivityArg;
import com.ss.android.ugc.aweme.mix.manageplaylist.ManagePlaylistCell;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragment;
import com.ss.android.ugc.aweme.poi.PoiAllianceTag;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiHotelCardCell;
import com.ss.android.ugc.aweme.poi.detail.claim.data.PoiClaimManageToolModel;
import com.ss.android.ugc.aweme.poi.detail.claim.data.PoiClaimTrackModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.post.cell.PoiPostPageWaterFallReuseAssem;
import com.ss.android.ugc.aweme.poi.detail.postcard.cell.PoiLimitedPostHorizontalBaseReuseAssem;
import com.ss.android.ugc.aweme.poi.detail.postcard.cell.PoiLimitedPostVerticalReuseAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostAbility;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiPostWaterFallReuseAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemVideoCell;
import com.ss.android.ugc.aweme.poi.map.LocationDetailMobParam;
import com.ss.android.ugc.aweme.poi.map.assem.LocationDetailInfoAssem;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.poi.search.creator.tag.PoiSearchCreatorCategoryLabelCell;
import com.ss.android.ugc.aweme.poi.search.data.PoiSearchFilterDataItem;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashClickConfig;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashTrackConfig;
import com.ss.android.ugc.aweme.slash.cell.title.SlashTitleCell;
import com.ss.android.ugc.aweme.slash.cell.title.SlashTitleCellModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.nearby.container.model.NearbyTool;
import com.ss.android.ugc.nearby.notice.NearbyFeedNoticeCell;
import com.ss.android.ugc.nearby.toolzone.NearbyToolBaseCell;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS41S2100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class AbS508S0200000_18 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            case 27:
                LIZ$27(this, view);
                break;
            case 28:
                LIZ$28(this, view);
                break;
            case 29:
                LIZ$29(this, view);
                break;
            case 30:
                LIZ$30(this, view);
                break;
            case 31:
                LIZ$31(this, view);
                break;
            case 32:
                LIZ$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                LIZ$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                LIZ$34(this, view);
                break;
            case 35:
                LIZ$35(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((PoiPostPageWaterFallReuseAssem) abS508S0200000_18.l0).op((C1187600h0g) abS508S0200000_18.l1);
        }
    }

    public static final void LIZ$1(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((PoiPostPageWaterFallReuseAssem) abS508S0200000_18.l0).op((C1187600h0g) abS508S0200000_18.l1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$10(wh6.AbS508S0200000_18 r26, android.view.View r27) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS508S0200000_18.LIZ$10(wh6.AbS508S0200000_18, android.view.View):void");
    }

    public static final void LIZ$11(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((PoiLimitedPostHorizontalBaseReuseAssem) abS508S0200000_18.l0).op((C1187600h0g) abS508S0200000_18.l1);
        }
    }

    public static final void LIZ$12(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((PoiLimitedPostHorizontalBaseReuseAssem) abS508S0200000_18.l0).op((C1187600h0g) abS508S0200000_18.l1);
        }
    }

    public static final void LIZ$13(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((PoiLimitedPostVerticalReuseAssem) abS508S0200000_18.l0).op((C1187600h0g) abS508S0200000_18.l1);
        }
    }

    public static final void LIZ$14(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((PoiLimitedPostVerticalReuseAssem) abS508S0200000_18.l0).op((C1187600h0g) abS508S0200000_18.l1);
        }
    }

    public static final void LIZ$15(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((PoiPostWaterFallReuseAssem) abS508S0200000_18.l0).op((C1187600h0g) abS508S0200000_18.l1, "poi_anchor");
        }
    }

    public static final void LIZ$16(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((PoiPostWaterFallReuseAssem) abS508S0200000_18.l0).op((C1187600h0g) abS508S0200000_18.l1, "card_list");
        }
    }

    public static final void LIZ$17(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((PoiPostWaterFallReuseAssem) abS508S0200000_18.l0).op((C1187600h0g) abS508S0200000_18.l1, "card_list");
        }
    }

    public static final void LIZ$18(AbS508S0200000_18 abS508S0200000_18, View view) {
        C1195630hDd tvViewAll;
        if (view != null) {
            C1195630hDd tvViewAll2 = ((C1175130ggZ) abS508S0200000_18.l0).getTvViewAll();
            if (tvViewAll2 != null && tvViewAll2.isShown() && (tvViewAll = ((C1175130ggZ) abS508S0200000_18.l0).getTvViewAll()) != null) {
                tvViewAll.LIZIZ();
            }
            View.OnClickListener onClickListener = (View.OnClickListener) abS508S0200000_18.l1;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public static final void LIZ$19(AbS508S0200000_18 abS508S0200000_18, View view) {
        String poiCityCode;
        String poiRegionCode;
        if (view != null) {
            LocationDetailInfoAssem locationDetailInfoAssem = (LocationDetailInfoAssem) abS508S0200000_18.l0;
            LocationDetailMobParam locationDetailMobParam = ((C1179950goL) locationDetailInfoAssem.LLIZLLLIL.getValue()).LLILLJJLI;
            if (locationDetailMobParam != null) {
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                String str = ((C1179950goL) locationDetailInfoAssem.LLIZLLLIL.getValue()).LL;
                String str2 = locationDetailMobParam.groupId;
                String str3 = locationDetailMobParam.authorId;
                C1188440h22 c1188440h22 = locationDetailMobParam.data;
                String collectInfo = null;
                if (c1188440h22 != null) {
                    poiCityCode = c1188440h22.getPoiCityCode();
                } else {
                    poiCityCode = null;
                }
                C1188440h22 c1188440h222 = locationDetailMobParam.data;
                if (c1188440h222 != null) {
                    poiRegionCode = c1188440h222.getPoiRegionCode();
                } else {
                    poiRegionCode = null;
                }
                String str4 = locationDetailMobParam.logPb;
                PoiListApi.PoiDetailResponse poiDetailResponseGo = locationDetailInfoAssem.Go();
                if (poiDetailResponseGo != null) {
                    collectInfo = poiDetailResponseGo.getCollectInfo();
                }
                PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(locationDetailInfoAssem));
                c1185430gxB.getClass();
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "poi_map");
                if (str != null) {
                    linkedHashMap.put("poi_id", str);
                }
                if (str2 != null) {
                    linkedHashMap.put("group_id", str2);
                }
                if (str3 != null) {
                    linkedHashMap.put("author_id", str3);
                }
                linkedHashMap.put("poi_info_source", "google");
                linkedHashMap.put("poi_device_samecity", String.valueOf(0));
                if (poiCityCode != null) {
                    linkedHashMap.put("poi_city", poiCityCode);
                }
                if (poiRegionCode != null) {
                    linkedHashMap.put("poi_region_code", poiRegionCode);
                }
                if (str4 != null) {
                    linkedHashMap.put("log_pb", str4);
                }
                C1189060h32.LIZ(collectInfo, linkedHashMap);
                C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
                c1185040gwY.getClass();
                C1185040gwY.LJFF("open_navigation", linkedHashMap, c1185050gwZ);
            }
            C1175850ghj c1175850ghj = C1175850ghj.LIZ;
            Context context = ((FrameLayout) abS508S0200000_18.l1).getContext();
            LocationDetailInfoAssem locationDetailInfoAssem2 = (LocationDetailInfoAssem) abS508S0200000_18.l0;
            PoiListApi.PoiDetailResponse poiDetailResponseGo2 = locationDetailInfoAssem2.Go();
            AssemVMLazy assemVMLazy = ((LocationDetailInfoAssem) abS508S0200000_18.l0).LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LocationDetailInfoAssem.LLJILJILJ;
            Float f = ((C1179620gno) assemVMLazy.getValue().getState()).LLILZIL;
            String str5 = ((C1179950goL) ((LocationDetailInfoAssem) abS508S0200000_18.l0).LLIZLLLIL.getValue()).LL;
            PageFinder pageFinderVia2 = PageFinder.via(C724240Sb0.LJI((LocationDetailInfoAssem) abS508S0200000_18.l0));
            c1175850ghj.getClass();
            C1175850ghj.LIZIZ(context, locationDetailInfoAssem2, poiDetailResponseGo2, f, str5, "poi_map", pageFinderVia2);
        }
    }

    public static final void LIZ$2(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((PoiPostPageWaterFallReuseAssem) abS508S0200000_18.l0).op((C1187600h0g) abS508S0200000_18.l1);
        }
    }

    public static final void LIZ$20(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((SlashTitleCell) abS508S0200000_18.l0).Fp(view, (SlashTitleCellModel) abS508S0200000_18.l1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$21(AbS508S0200000_18 abS508S0200000_18, View view) {
        String componentKey;
        NearbyTool nearbyTool;
        NearbyTool nearbyTool2;
        if (view != null) {
            C1204900hSa c1204900hSa = C1204900hSa.LIZ;
            T item = ((NearbyToolBaseCell) abS508S0200000_18.l0).getItem();
            Context context = null;
            if ((item instanceof NearbyTool) && (nearbyTool2 = (NearbyTool) item) != null) {
                componentKey = nearbyTool2.getComponentKey();
            } else {
                componentKey = null;
            }
            c1204900hSa.getClass();
            C1204900hSa.LIZJ(componentKey);
            C1204900hSa.LIZLLL(true);
            View view2 = ((NearbyToolBaseCell) abS508S0200000_18.l0).LL;
            if (view2 != null) {
                context = view2.getContext();
            }
            SmartRouter.buildRoute(context, ((NearbyTool) ((InterfaceC1891350zJl) abS508S0200000_18.l1)).getSchema()).open();
            T item2 = ((NearbyToolBaseCell) abS508S0200000_18.l0).getItem();
            if ((item2 instanceof NearbyTool) && (nearbyTool = (NearbyTool) item2) != null) {
                C1204900hSa.LIZIZ(Integer.valueOf(((NearbyToolBaseCell) abS508S0200000_18.l0).getItemCount()), Integer.valueOf(((NearbyToolBaseCell) abS508S0200000_18.l0).getBindingAdapterPosition()), Boolean.valueOf(nearbyTool.isCacheData()), nearbyTool.getComponentKey());
            }
        }
    }

    public static final void LIZ$22(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            C1169160gWw c1169160gWw = C1169160gWw.LIZ;
            String str = ((C1167940gUy) abS508S0200000_18.l0).LLILZ;
            c1169160gWw.getClass();
            C1169160gWw.LJIILLIIL(str, "playlist_edit_page");
            C1167940gUy c1167940gUy = (C1167940gUy) abS508S0200000_18.l0;
            String str2 = c1167940gUy.LLIZ;
            String str3 = c1167940gUy.LLIZLLLIL;
            String str4 = c1167940gUy.LLJ;
            String str5 = c1167940gUy.LLILZ;
            Integer num = c1167940gUy.LLILLL;
            int i = c1167940gUy.LLILZLL;
            String str6 = c1167940gUy.LL;
            EditPlaylistActivityArg editPlaylistActivityArg = new EditPlaylistActivityArg(str4, "", str5, c1167940gUy.LLILLJJLI, num, Integer.valueOf(i), str6, str2, str3, c1167940gUy.LLJI, null);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((ManagePlaylistCell) abS508S0200000_18.l1).getContext(), "//playlist/edit");
            smartRouteBuildRoute.withNavArg(editPlaylistActivityArg);
            smartRouteBuildRoute.open();
        }
    }

    public static final void LIZ$23(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            C1197730hH1 c1197730hH1 = C1197730hH1.LIZ;
            String str = ((PoiAllianceTag) abS508S0200000_18.l0).tagId;
            c1197730hH1.getClass();
            c1197730hH1.LIZJ("poi_search_click_tag", new AwS69S1000000_18(str, 21));
            ((Function0) abS508S0200000_18.l1).invoke();
        }
    }

    public static final void LIZ$24(AbS508S0200000_18 abS508S0200000_18, View view) {
        String filterId;
        String filterId2;
        ArrayList arrayList;
        if (view != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiSearchCreatorCategoryLabelCell enableClick:");
            sbLIZ.append(((PoiSearchCreatorCategoryLabelCell) abS508S0200000_18.l0).LLILZLL);
            C2188811AlT.LIZIZ(sbLIZ);
            PoiSearchCreatorCategoryLabelCell poiSearchCreatorCategoryLabelCell = (PoiSearchCreatorCategoryLabelCell) abS508S0200000_18.l0;
            if (poiSearchCreatorCategoryLabelCell.LLILZLL) {
                poiSearchCreatorCategoryLabelCell.LLILZ = !poiSearchCreatorCategoryLabelCell.LLILZ;
                C1197870hHF c1197870hHF = C1197870hHF.LIZ;
                JSONObject jSONObjectI5 = poiSearchCreatorCategoryLabelCell.I5();
                PoiSearchFilterDataItem poiSearchFilterDataItem = ((PoiSearchCreatorCategoryLabelCell) abS508S0200000_18.l0).LLILZIL;
                String filterId3 = null;
                if (poiSearchFilterDataItem != null) {
                    filterId = poiSearchFilterDataItem.getFilterId();
                } else {
                    filterId = null;
                }
                String strValueOf = String.valueOf(filterId);
                boolean z = ((PoiSearchCreatorCategoryLabelCell) abS508S0200000_18.l0).LLILZ;
                c1197870hHF.getClass();
                C2365509Or.LIZLLL(jSONObjectI5, "filter_name", strValueOf);
                C2365509Or.LIZLLL(jSONObjectI5, "filter_status", Integer.valueOf(z ? 1 : 0));
                C1185040gwY.LIZ.getClass();
                C1185040gwY.LIZJ("ttls_add_location_filter_click", jSONObjectI5, null);
                if (((PoiSearchFilterDataItem) abS508S0200000_18.l1).getNeedCacheState() && C123100dR.LIZ(((PoiSearchFilterDataItem) abS508S0200000_18.l1).getFilterId())) {
                    C1197840hHC c1197840hHC = C1197840hHC.LIZ;
                    String filterId4 = ((PoiSearchFilterDataItem) abS508S0200000_18.l1).getFilterId();
                    boolean z2 = ((PoiSearchCreatorCategoryLabelCell) abS508S0200000_18.l0).LLILZ;
                    c1197840hHC.getClass();
                    String strLIZIZ = C1197840hHC.LIZIZ();
                    Keva keva = C1197840hHC.LIZIZ;
                    String string = keva.getString(strLIZIZ, "");
                    if (string.length() == 0) {
                        arrayList = new ArrayList();
                    } else {
                        arrayList = new ArrayList(a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6));
                    }
                    if (z2) {
                        if (!arrayList.contains(filterId4)) {
                            arrayList.add(filterId4);
                            keva.storeString(strLIZIZ, C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
                        }
                    } else if (arrayList.remove(filterId4)) {
                        keva.storeString(strLIZIZ, C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
                    }
                }
                PoiSearchVM poiSearchVM = (PoiSearchVM) ((PoiSearchCreatorCategoryLabelCell) abS508S0200000_18.l0).LLIZ.getValue();
                PoiSearchFilterDataItem poiSearchFilterDataItem2 = (PoiSearchFilterDataItem) abS508S0200000_18.l1;
                boolean z3 = ((PoiSearchCreatorCategoryLabelCell) abS508S0200000_18.l0).LLILZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateFilterData filterData:");
                if (poiSearchFilterDataItem2 != null) {
                    filterId3 = poiSearchFilterDataItem2.getFilterId();
                }
                sbLIZ2.append(filterId3);
                sbLIZ2.append(", isSelect:");
                sbLIZ2.append(z3);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (poiSearchFilterDataItem2 != null && (filterId2 = poiSearchFilterDataItem2.getFilterId()) != null) {
                    if (z3) {
                        ((ArrayList) poiSearchVM.LLJ).add(filterId2);
                    } else {
                        ((ArrayList) poiSearchVM.LLJ).remove(filterId2);
                    }
                    poiSearchVM.setState(new AwS597S0100000_18(poiSearchVM, 675));
                }
                PoiSearchCreatorCategoryLabelCell poiSearchCreatorCategoryLabelCell2 = (PoiSearchCreatorCategoryLabelCell) abS508S0200000_18.l0;
                poiSearchCreatorCategoryLabelCell2.L5(poiSearchCreatorCategoryLabelCell2.LLILZ);
            }
        }
    }

    public static final void LIZ$25(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((AddMultiVideoFragment) abS508S0200000_18.l0).UR().LJJ((View) abS508S0200000_18.l1);
        }
    }

    public static final void LIZ$26(AbS508S0200000_18 abS508S0200000_18, View view) {
        SlashClickConfig slashClickConfig;
        String str;
        if (view != null) {
            PoiHotelCardCell poiHotelCardCell = (PoiHotelCardCell) abS508S0200000_18.l0;
            poiHotelCardCell.up(poiHotelCardCell.Ep("cell_click"));
            PoiHotelCardCell poiHotelCardCell2 = (PoiHotelCardCell) abS508S0200000_18.l0;
            PoiCardCellData poiCardCellData = (PoiCardCellData) abS508S0200000_18.l1;
            SlashTrackConfig slashTrackConfigEp = poiHotelCardCell2.Ep("product_click");
            if (slashTrackConfigEp != null) {
                String str2 = slashTrackConfigEp.eventName;
                Pair[] pairArr = new Pair[2];
                String strHp = poiHotelCardCell2.hp();
                String str3 = "";
                if (strHp == null) {
                    strHp = "";
                }
                pairArr[0] = new Pair("ttls_poi_component", strHp);
                if (poiCardCellData != null && (str = poiCardCellData.keyCategory) != null) {
                    str3 = str;
                }
                pairArr[1] = new Pair("target_local_service_key_category", str3);
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                Map<String, String> map = slashTrackConfigEp.params;
                if (map != null) {
                    mapLJIIJ.putAll(map);
                }
                poiHotelCardCell2.up(new SlashTrackConfig(str2, mapLJIIJ, null));
            }
            SlashCellModel slashCellModelLp = ((PoiHotelCardCell) abS508S0200000_18.l0).lp();
            if (slashCellModelLp != null && (slashClickConfig = slashCellModelLp.clickConfig) != null) {
                ((PoiHotelCardCell) abS508S0200000_18.l0).Ip((PoiCardCellData) abS508S0200000_18.l1, slashClickConfig, null);
            }
        }
    }

    public static final void LIZ$27(AbS508S0200000_18 abS508S0200000_18, View view) {
        String mEventType;
        if (view != null) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("key_manage_mix_id", ((MixVideoPlayDetailPageFragment) abS508S0200000_18.l0).LLJILJILJ, bundle);
            IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
            Context context = (Context) abS508S0200000_18.l1;
            C1169240gX4 c1169240gX4 = ((MixVideoPlayDetailPageFragment) abS508S0200000_18.l0).LLJILLL;
            if (c1169240gX4 == null || (mEventType = c1169240gX4.getMEventType()) == null) {
                mEventType = "";
            }
            iMixFeedService.LJJIIJ(context, bundle, 4, mEventType, "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$28(wh6.AbS508S0200000_18 r13, android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS508S0200000_18.LIZ$28(wh6.AbS508S0200000_18, android.view.View):void");
    }

    public static final void LIZ$29(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            Function0 function0 = (Function0) abS508S0200000_18.l0;
            if (function0 != null) {
                function0.invoke();
            }
            ((C1389910mGz) abS508S0200000_18.l1).LIZJ();
        }
    }

    public static final void LIZ$3(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((CollectionContentManageAssem) abS508S0200000_18.l0).Go((C19EG) abS508S0200000_18.l1);
        }
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
    public static final void LIZ$30(AbS508S0200000_18 abS508S0200000_18, View view) {
        String collectInfo;
        String fromGroupId;
        IPoiDetailPostAbility iPoiDetailPostAbility;
        if (view != null) {
            C1187540h0a c1187540h0a = PoiVideoListSharedViewModel.LLJJJJJIL;
            C1187600h0g c1187600h0g = (C1187600h0g) abS508S0200000_18.l0;
            PoiVideoListItemVideoCell poiVideoListItemVideoCell = (PoiVideoListItemVideoCell) abS508S0200000_18.l1;
            View view2 = poiVideoListItemVideoCell.itemView;
            AssemVMLazy assemVMLazy = poiVideoListItemVideoCell.LLJJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiVideoListItemVideoCell.LLJJLIIIJLLLLLLLZ;
            PoiListApi.PoiDetailResponse poiDetailResponse = ((PoiDetailInfoViewModel) assemVMLazy.getValue()).LLILLJJLI;
            String strS2 = null;
            if (poiDetailResponse != null) {
                collectInfo = poiDetailResponse.getCollectInfo();
            } else {
                collectInfo = null;
            }
            C1185410gx9 c1185410gx9 = (C1185410gx9) ((PoiVideoListItemVideoCell) abS508S0200000_18.l1).LLJJJIL.getValue();
            if (c1185410gx9 != null) {
                fromGroupId = c1185410gx9.getFromGroupId();
            } else {
                fromGroupId = null;
            }
            Boolean bool = (Boolean) ((PoiVideoListItemVideoCell) abS508S0200000_18.l1).LLJJJJJIL.getValue();
            C1185490gxH c1185490gxH = (C1185490gxH) ((PoiVideoListItemVideoCell) abS508S0200000_18.l1).LLJJJJ.getValue();
            PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ((PoiVideoListItemVideoCell) abS508S0200000_18.l1));
            int i = ((C1187600h0g) abS508S0200000_18.l0).LLILZIL;
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiVideoListItemVideoCell) abS508S0200000_18.l1);
            if (fragmentLJIIJ != null && (iPoiDetailPostAbility = (IPoiDetailPostAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiDetailPostAbility.class, null)) != null) {
                strS2 = iPoiDetailPostAbility.S2();
            }
            c1187540h0a.LIZ(c1187600h0g, poiVideoListItemVideoCell, view2, collectInfo, fromGroupId, bool, c1185490gxH, pageFinderVia, i, strS2);
        }
    }

    public static final void LIZ$31(AbS508S0200000_18 abS508S0200000_18, View view) {
        String str;
        if (view != null) {
            C1189580h3s c1189580h3s = C1189580h3s.LIZ;
            PoiClaimManageToolModel poiClaimManageToolModel = (PoiClaimManageToolModel) abS508S0200000_18.l0;
            c1189580h3s.getClass();
            PoiClaimTrackModel poiClaimTrackModel = poiClaimManageToolModel.clickTrackModel;
            if (poiClaimTrackModel != null && (str = poiClaimTrackModel.eventName) != null) {
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                JSONObject jSONObjectLIZ = C1189580h3s.LIZ(poiClaimTrackModel.eventParamsModel);
                c1185040gwY.getClass();
                C1185040gwY.LIZJ(str, jSONObjectLIZ, null);
            } else {
                C1205490hTX c1205490hTX = C1205490hTX.LIZ;
                C1EMR c1emr = C1EMR.POI_DETAIL_CLAIM;
                Throwable th = new Throwable();
                c1205490hTX.getClass();
                C1205490hTX.LIZLLL(c1emr, "click_params_is_null", null, th);
            }
            ((C1189570h3r) abS508S0200000_18.l1).LIZIZ(((PoiClaimManageToolModel) abS508S0200000_18.l0).schema);
        }
    }

    public static final void LIZ$32(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            C1204920hSc c1204920hSc = C1204920hSc.LIZ;
            EnumC1204690hSF enumC1204690hSF = (EnumC1204690hSF) abS508S0200000_18.l0;
            PageFinder pageFinderI5 = ((NearbyFeedNoticeCell) abS508S0200000_18.l1).I5();
            c1204920hSc.getClass();
            C1204920hSc.LIZ(enumC1204690hSF, false, pageFinderI5);
            ((NearbyFeedNoticeCell) abS508S0200000_18.l1).L5().FQ2();
        }
    }

    public static final void LIZ$33(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            C1204990hSj.LIZ.getClass();
            C1204760hSM.LIZIZ.LJI(true);
            C1204920hSc c1204920hSc = C1204920hSc.LIZ;
            EnumC1204690hSF enumC1204690hSF = (EnumC1204690hSF) abS508S0200000_18.l0;
            PageFinder pageFinderI5 = ((NearbyFeedNoticeCell) abS508S0200000_18.l1).I5();
            c1204920hSc.getClass();
            C1204920hSc.LIZ(enumC1204690hSF, false, pageFinderI5);
            ((NearbyFeedNoticeCell) abS508S0200000_18.l1).L5().FQ2();
        }
    }

    public static final void LIZ$34(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            C1204990hSj.LIZ.getClass();
            C1204770hSN.LIZIZ.LJI(true);
            C1204920hSc c1204920hSc = C1204920hSc.LIZ;
            EnumC1204690hSF enumC1204690hSF = (EnumC1204690hSF) abS508S0200000_18.l0;
            PageFinder pageFinderI5 = ((NearbyFeedNoticeCell) abS508S0200000_18.l1).I5();
            c1204920hSc.getClass();
            C1204920hSc.LIZ(enumC1204690hSF, false, pageFinderI5);
            ((NearbyFeedNoticeCell) abS508S0200000_18.l1).L5().FQ2();
        }
    }

    public static final void LIZ$35(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            C1204920hSc c1204920hSc = C1204920hSc.LIZ;
            EnumC1204690hSF enumC1204690hSF = (EnumC1204690hSF) abS508S0200000_18.l0;
            PageFinder pageFinderI5 = ((NearbyFeedNoticeCell) abS508S0200000_18.l1).I5();
            c1204920hSc.getClass();
            C1204920hSc.LIZ(enumC1204690hSF, false, pageFinderI5);
            ((NearbyFeedNoticeCell) abS508S0200000_18.l1).L5().FQ2();
        }
    }

    public static final void LIZ$4(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            C1170970gZr c1170970gZrHo = ((CollectionContentManageAssem) abS508S0200000_18.l0).Ho();
            if (c1170970gZrHo != null && c1170970gZrHo.LL) {
                ((CollectionContentManageAssem) abS508S0200000_18.l0).Lo().jc();
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx((C19EG) abS508S0200000_18.l1);
            c1389890mGx.LJIIIZ(2131834481);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$5(AbS508S0200000_18 abS508S0200000_18, View view) {
        String str;
        Integer num;
        if (view != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) abS508S0200000_18.l0, "aweme://favorite/videos/collections/add/video");
            smartRouteBuildRoute.withParam("collectionId", ((CollectionContentManageAssem) abS508S0200000_18.l1).No().id);
            smartRouteBuildRoute.withParam("enterMethod", "click_add_videos");
            C1170970gZr c1170970gZrHo = ((CollectionContentManageAssem) abS508S0200000_18.l1).Ho();
            String[] strArr = null;
            if (c1170970gZrHo != null) {
                str = c1170970gZrHo.LLILLL;
            } else {
                str = null;
            }
            smartRouteBuildRoute.withParam("enter_from", str);
            CollectionDetail.Status status = ((CollectionContentManageAssem) abS508S0200000_18.l1).No().status;
            if (status != null) {
                num = status.state;
            } else {
                num = null;
            }
            smartRouteBuildRoute.withParam("collection_status", num);
            List<CollaborativeUser> list = ((CollectionContentManageAssem) abS508S0200000_18.l1).No().collaborativeUserList;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<CollaborativeUser> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str2 = it2.next().uid;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList.add(str2);
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
            }
            smartRouteBuildRoute.withParam("collaborative_uid", strArr);
            smartRouteBuildRoute.withParam("collectionName", ((CollectionContentManageAssem) abS508S0200000_18.l1).No().name);
            smartRouteBuildRoute.withParam("collectionType", ((CollectionContentManageAssem) abS508S0200000_18.l1).No().type);
            smartRouteBuildRoute.open();
        }
    }

    public static final void LIZ$6(AbS508S0200000_18 abS508S0200000_18, View view) {
        String str;
        Integer num;
        if (view != null) {
            C1171140ga8 c1171140ga8 = new C1171140ga8();
            c1171140ga8.LJIILLIIL = ((CollectionContentManageAssem) abS508S0200000_18.l0).No().id;
            c1171140ga8.LJIIZILJ = ((CollectionContentManageAssem) abS508S0200000_18.l0).No().name;
            c1171140ga8.LJIJI = 0;
            c1171140ga8.LJIJ = "direct_click";
            c1171140ga8.LIZLLL = "collection_detail_page";
            c1171140ga8.LJIILJJIL();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) abS508S0200000_18.l1, "aweme://favorite/videos/collections/add/video");
            smartRouteBuildRoute.withParam("collectionId", ((CollectionContentManageAssem) abS508S0200000_18.l0).No().id);
            smartRouteBuildRoute.withParam("enterMethod", "click_add_videos");
            C1170970gZr c1170970gZrHo = ((CollectionContentManageAssem) abS508S0200000_18.l0).Ho();
            String[] strArr = null;
            if (c1170970gZrHo != null) {
                str = c1170970gZrHo.LLILLL;
            } else {
                str = null;
            }
            smartRouteBuildRoute.withParam("enter_from", str);
            CollectionDetail.Status status = ((CollectionContentManageAssem) abS508S0200000_18.l0).No().status;
            if (status != null) {
                num = status.state;
            } else {
                num = null;
            }
            smartRouteBuildRoute.withParam("collection_status", num);
            List<CollaborativeUser> list = ((CollectionContentManageAssem) abS508S0200000_18.l0).No().collaborativeUserList;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<CollaborativeUser> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str2 = it2.next().uid;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList.add(str2);
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
            }
            smartRouteBuildRoute.withParam("collaborative_uid", strArr);
            smartRouteBuildRoute.withParam("collectionName", ((CollectionContentManageAssem) abS508S0200000_18.l0).No().name);
            smartRouteBuildRoute.withParam("collectionType", ((CollectionContentManageAssem) abS508S0200000_18.l0).No().type);
            smartRouteBuildRoute.open();
        }
    }

    public static final void LIZ$7(AbS508S0200000_18 abS508S0200000_18, View view) {
        if (view != null) {
            ((CollectionContentManageAssem) abS508S0200000_18.l0).Go((C19EG) abS508S0200000_18.l1);
        }
    }

    public static final void LIZ$8(AbS508S0200000_18 abS508S0200000_18, View view) {
        String str;
        Integer num;
        if (view != null) {
            C1171140ga8 c1171140ga8 = new C1171140ga8();
            c1171140ga8.LJIILLIIL = ((CollectionContentManageAssem) abS508S0200000_18.l0).No().id;
            c1171140ga8.LJIIZILJ = ((CollectionContentManageAssem) abS508S0200000_18.l0).No().name;
            c1171140ga8.LJIJI = 0;
            c1171140ga8.LJIJ = "direct_click";
            c1171140ga8.LIZLLL = "collection_detail_page";
            c1171140ga8.LJIILJJIL();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) abS508S0200000_18.l1, "aweme://favorite/videos/collections/add/video");
            smartRouteBuildRoute.withParam("collectionId", ((CollectionContentManageAssem) abS508S0200000_18.l0).No().id);
            smartRouteBuildRoute.withParam("enterMethod", "click_add_videos");
            C1170970gZr c1170970gZrHo = ((CollectionContentManageAssem) abS508S0200000_18.l0).Ho();
            String[] strArr = null;
            if (c1170970gZrHo != null) {
                str = c1170970gZrHo.LLILLL;
            } else {
                str = null;
            }
            smartRouteBuildRoute.withParam("enter_from", str);
            CollectionDetail.Status status = ((CollectionContentManageAssem) abS508S0200000_18.l0).No().status;
            if (status != null) {
                num = status.state;
            } else {
                num = null;
            }
            smartRouteBuildRoute.withParam("collection_status", num);
            List<CollaborativeUser> list = ((CollectionContentManageAssem) abS508S0200000_18.l0).No().collaborativeUserList;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<CollaborativeUser> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str2 = it2.next().uid;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList.add(str2);
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
            }
            smartRouteBuildRoute.withParam("collaborative_uid", strArr);
            smartRouteBuildRoute.withParam("collectionName", ((CollectionContentManageAssem) abS508S0200000_18.l0).No().name);
            smartRouteBuildRoute.withParam("collectionType", ((CollectionContentManageAssem) abS508S0200000_18.l0).No().type);
            smartRouteBuildRoute.open();
        }
    }

    public static final void LIZ$9(AbS508S0200000_18 abS508S0200000_18, View view) {
        Integer numValueOf;
        String str;
        CharSequence text;
        Matcher matcher;
        if (view != null) {
            C197039127h c197039127h = ((EditPlayListNameAssem) abS508S0200000_18.l0).LLJJ;
            LinearLayout linearLayout = null;
            if (c197039127h == null) {
                c197039127h = null;
            }
            if (c197039127h.isEnabled()) {
                C197039127h c197039127h2 = ((EditPlayListNameAssem) abS508S0200000_18.l0).LLJJ;
                if (c197039127h2 == null) {
                    c197039127h2 = null;
                }
                if (!c197039127h2.LLLII) {
                    if (C297000BkY.LIZ()) {
                        EditText editText = ((EditPlayListNameAssem) abS508S0200000_18.l0).LLJI;
                        if (editText == null) {
                            editText = null;
                        }
                        String string = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).toString();
                        Pattern patternCompile = PatternProtector.compile("\\p{L}+");
                        if (string == null || (matcher = patternCompile.matcher(string)) == null || !matcher.find()) {
                            EditPlayListNameAssem editPlayListNameAssem = (EditPlayListNameAssem) abS508S0200000_18.l0;
                            TextView textView = editPlayListNameAssem.LLJJIII;
                            if (textView == null) {
                                textView = null;
                            }
                            Context context = editPlayListNameAssem.getContext();
                            if (context != null) {
                                text = context.getText(2131840542);
                            } else {
                                text = null;
                            }
                            textView.setText(text);
                            LinearLayout linearLayout2 = ((EditPlayListNameAssem) abS508S0200000_18.l0).LLJILJILJ;
                            if (linearLayout2 != null) {
                                linearLayout = linearLayout2;
                            }
                            C786410Ut5.LJZL(0, linearLayout);
                            return;
                        }
                    }
                    InputMethodManager inputMethodManager = (InputMethodManager) abS508S0200000_18.l1;
                    if (inputMethodManager != null) {
                        EditText editText2 = ((EditPlayListNameAssem) abS508S0200000_18.l0).LLJI;
                        if (editText2 == null) {
                            editText2 = null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                    }
                    C1169510gXV c1169510gXV = (C1169510gXV) C1252710ihh.LJIIIIZZ((EditPlayListNameAssem) abS508S0200000_18.l0, C13LE.LIZ(InterfaceC1169560gXa.class));
                    if (c1169510gXV == null || (numValueOf = Integer.valueOf(c1169510gXV.LIZ)) == null) {
                        return;
                    }
                    if (numValueOf.intValue() == 1) {
                        if (C297000BkY.LIZ()) {
                            EditPlayListNameEditTextVM editPlayListNameEditTextVMLo = ((EditPlayListNameAssem) abS508S0200000_18.l0).Lo();
                            EditText editText3 = ((EditPlayListNameAssem) abS508S0200000_18.l0).LLJI;
                            if (editText3 == null) {
                                editText3 = null;
                            }
                            editPlayListNameEditTextVMLo.withState(new C1169500gXU(editPlayListNameEditTextVMLo, C2204961BRm.LLJILLL(editText3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).toString()));
                            return;
                        }
                        MixCreateViewModel mixCreateViewModelJo = ((EditPlayListNameAssem) abS508S0200000_18.l0).Jo();
                        EditText editText4 = ((EditPlayListNameAssem) abS508S0200000_18.l0).LLJI;
                        if (editText4 == null) {
                            editText4 = null;
                        }
                        mixCreateViewModelJo.setStateImmediate(new AwS69S1000000_18(EditPlayListNameAssem.So(C2204961BRm.LLJILLL(editText4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).toString()), 33));
                        ((EditPlayListNameAssem) abS508S0200000_18.l0).Jo().setState(new AwS597S0100000_18(EnumC442690HXn.MULTI_VIDEO, 1080));
                        return;
                    }
                    if (numValueOf.intValue() == 2) {
                        C1169510gXV c1169510gXV2 = (C1169510gXV) C1252710ihh.LJIIIIZZ((EditPlayListNameAssem) abS508S0200000_18.l0, C13LE.LIZ(InterfaceC1169560gXa.class));
                        if (c1169510gXV2 == null || (str = c1169510gXV2.LIZJ) == null) {
                            str = "";
                        }
                        EditPlayListNameEditTextVM editPlayListNameEditTextVMLo2 = ((EditPlayListNameAssem) abS508S0200000_18.l0).Lo();
                        EditText editText5 = ((EditPlayListNameAssem) abS508S0200000_18.l0).LLJI;
                        if (editText5 == null) {
                            editText5 = null;
                        }
                        editPlayListNameEditTextVMLo2.withState(new AwS41S2100000_18(editPlayListNameEditTextVMLo2, str, EditPlayListNameAssem.So(C2204961BRm.LLJILLL(editText5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).toString()), 3));
                        return;
                    }
                    if (numValueOf.intValue() != 3) {
                        return;
                    }
                    MixCreateViewModel mixCreateViewModelJo2 = ((EditPlayListNameAssem) abS508S0200000_18.l0).Jo();
                    EditText editText6 = ((EditPlayListNameAssem) abS508S0200000_18.l0).LLJI;
                    if (editText6 == null) {
                        editText6 = null;
                    }
                    mixCreateViewModelJo2.setStateImmediate(new AwS69S1000000_18(EditPlayListNameAssem.So(C2204961BRm.LLJILLL(editText6, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HL2Dufpkc3Cnl7sXmS9qd71cdF5Dc+QjQmn4qioRE=", null)).toString()), 33));
                    MixCreateViewModel mixCreateViewModelJo3 = ((EditPlayListNameAssem) abS508S0200000_18.l0).Jo();
                    mixCreateViewModelJo3.withState(new AwS597S0100000_18(mixCreateViewModelJo3, 1090));
                }
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AbS508S0200000_18(X.C19EG r4, com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentManageAssem r5, int r6) {
        /*
            r3 = this;
            r3.$t = r6
            switch(r6) {
                case 3: goto L10;
                case 4: goto L10;
                case 5: goto L5;
                case 6: goto L10;
                case 7: goto L10;
                case 8: goto L10;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r4
            r2.l1 = r5
            r0 = 300(0x12c, double:1.48E-321)
        Lc:
            r2.<init>(r0)
            return
        L10:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r0 = 300(0x12c, double:1.48E-321)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS508S0200000_18.<init>(X.19EG, com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentManageAssem, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS508S0200000_18(Object obj, Object obj2, int i) {
        super(500L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS508S0200000_18(Object obj, Object obj2, int i, int i2) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
