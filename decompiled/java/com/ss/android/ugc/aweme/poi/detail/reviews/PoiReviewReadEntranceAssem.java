package com.ss.android.ugc.aweme.poi.detail.reviews;

import X.C019F;
import X.C1184480gve;
import X.C1186690gzD;
import X.C1187180h00;
import X.C1189280h3O;
import X.C1189960h4U;
import X.C1189970h4V;
import X.C1190160h4o;
import X.C1195630hDd;
import X.C125300dn;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C1697810uHb;
import X.C18JG;
import X.C19719912Dl;
import X.C20152113t9;
import X.C20152913tH;
import X.C20153113tJ;
import X.C20600815jK;
import X.C2217381BqS;
import X.C23250099c;
import X.C326870Crd;
import X.C622680Oba;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1189990h4X;
import X.EnumC1190240h4w;
import X.InterfaceC1189980h4W;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.exp.TtlsReviewsConfigSettings;
import com.ss.android.ugc.aweme.poi.reviews.preload.PoiReviewListPreload;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewReadEntranceAssem extends UISlotAssem implements InterfaceC1189980h4W, HandleMoreButtonClickAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public PoiReviewsApi.PoiReviewListResponse LLJJIII;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public C1195630hDd LLJJIJIL;
    public String LLJJJ;
    public C1184480gve LLJJJIL;
    public View LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewReadEntranceAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/detail/reviews/PoiDetailReviewsViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiReviewReadEntranceAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailReviewsViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 552), AFwS256S0000000_18.get$arr$(426), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e80;
    }

    public final PoiDetailReviewsViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (PoiDetailReviewsViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (C622680Oba.LIZ(this)) {
            C622680Oba.LIZLLL(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.reviews.HandleMoreButtonClickAbility
    public final void l01(String str) {
        if (!C125300dn.LIZ(str)) {
            return;
        }
        C1189280h3O c1189280h3OHp = hp(str, null, CardStruct.IStatusCode.DEFAULT);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("poi_id", c1189280h3OHp.LIZ, bundle);
        C786410Ut5.LJJJI("enter_from", "poi_detail", bundle);
        C786410Ut5.LJJJI("enter_method", c1189280h3OHp.LIZJ, bundle);
        C786410Ut5.LJJJIL(bundle, "pin_review_ids", c1189280h3OHp.LJIIL);
        C786410Ut5.LJJJI("tag_id", c1189280h3OHp.LJIILJJIL, bundle);
        C786410Ut5.LJJJI("preload_flag", "poi_review_touch_preload", bundle);
        C20152913tH.LIZLLL.getClass();
        C20152113t9 c20152113t9LIZIZ = C20153113tJ.LIZIZ();
        if (c20152113t9LIZIZ != null) {
            c20152113t9LIZIZ.LIZLLL(bundle, PoiReviewListPreload.class);
        }
    }

    @Override // X.InterfaceC1189980h4W
    @C14EU(threadMode = ThreadMode.MAIN)
    public void onDeleteReviewEvent(C1187180h00 c1187180h00) {
        C1189960h4U.onDeleteReviewEvent(this, c1187180h00);
    }

    @Override // X.InterfaceC1189980h4W
    @C14EU(threadMode = ThreadMode.MAIN)
    public void onInteractionReviewEvent(C1189970h4V c1189970h4V) {
        C1189960h4U.onInteractionReviewEvent(this, c1189970h4V);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026a  */
    /* JADX WARN: Type inference failed for: r0v136, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v33, types: [X.0h4T] */
    /* JADX WARN: Type inference failed for: r1v54 */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r54) {
        /*
            Method dump skipped, instruction units count: 1485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.reviews.PoiReviewReadEntranceAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC1189980h4W
    @C14EU(threadMode = ThreadMode.MAIN)
    public void onWriteReviewEvent(C1186690gzD c1186690gzD) {
        C1189960h4U.onWriteReviewEvent(this, c1186690gzD);
    }

    @Override // X.InterfaceC1189980h4W
    public final void A8(PoiReviewsApi.PoiReviewModel poiReviewModel, String str) {
        C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK;
        String str2;
        if (!Intrinsics.LJFF(str, this.LLJJJ)) {
            return;
        }
        PoiDetailReviewsViewModel poiDetailReviewsViewModelIp = ip();
        if (poiReviewModel == null) {
            return;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TtlsReviewsConfigSettings.TtlsReviewsConfigModel ttlsReviewsConfigModel = TtlsReviewsConfigSettings.LIZ;
        TtlsReviewsConfigSettings.TtlsReviewsConfigModel ttlsReviewsConfigModel2 = (TtlsReviewsConfigSettings.TtlsReviewsConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ttls_reviews_config", TtlsReviewsConfigSettings.TtlsReviewsConfigModel.class, ttlsReviewsConfigModel);
        if (ttlsReviewsConfigModel2 != null) {
            ttlsReviewsConfigModel = ttlsReviewsConfigModel2;
        }
        int i = ttlsReviewsConfigModel.poiDetailReviewsLimit;
        PoiReviewsApi.PoiReviewModel poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, EnumC1189990h4X.POI_DETAIL_PAGE, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
        C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK2 = poiDetailReviewsViewModelIp.LLILLJJLI;
        int size = 0;
        if (c20600815jK2 != null) {
            int i2 = 0;
            for (Object obj : (ArrayList) c20600815jK2.LJII()) {
                int i3 = i2 + 1;
                String str3 = null;
                if (i2 >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                    if (interfaceC1891350zJl instanceof PoiReviewsApi.PoiReviewModel) {
                        PoiReviewsApi.PoiReviewModel poiReviewModel2 = (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl;
                        Integer source = poiReviewModel2.getSource();
                        int value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
                        if (source != null && source.intValue() == value) {
                            PoiReviewsApi.PoiReviewUserModel author = poiReviewModel2.getAuthor();
                            if (author != null) {
                                str2 = author.userId;
                            } else {
                                str2 = null;
                            }
                            PoiReviewsApi.PoiReviewUserModel author2 = poiReviewModelCopy.getAuthor();
                            if (author2 != null) {
                                str3 = author2.userId;
                            }
                            if (Intrinsics.LJFF(str2, str3)) {
                                C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK3 = poiDetailReviewsViewModelIp.LLILLJJLI;
                                if (c20600815jK3 != null) {
                                    c20600815jK3.LJIILJJIL(i2, poiReviewModelCopy);
                                    return;
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK4 = poiDetailReviewsViewModelIp.LLILLJJLI;
        if (c20600815jK4 != null) {
            C20600815jK.LIZIZ(c20600815jK4, 0, poiReviewModelCopy);
        }
        C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK5 = poiDetailReviewsViewModelIp.LLILLJJLI;
        if (c20600815jK5 != null) {
            size = ((ArrayList) c20600815jK5.LJII()).size();
        }
        if (size <= i || (c20600815jK = poiDetailReviewsViewModelIp.LLILLJJLI) == null) {
            return;
        }
        C20600815jK.LJIILIIL(c20600815jK, i);
    }

    @Override // X.InterfaceC1189980h4W
    public final void fk(String str, String str2) {
        PoiDetailReviewsViewModel poiDetailReviewsViewModelIp = ip();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(poiDetailReviewsViewModelIp), null, null, new C326870Crd(poiDetailReviewsViewModelIp, str2, str, null), 3);
        C1190160h4o.LIZ.getClass();
        C1190160h4o.LIZIZ = null;
        C1190160h4o.LIZJ = null;
        poiDetailReviewsViewModelIp.withState(new AwS597S0100000_18(poiDetailReviewsViewModelIp, 831));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1189280h3O hp(java.lang.String r25, java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.reviews.PoiReviewReadEntranceAssem.hp(java.lang.String, java.lang.String, java.lang.String):X.0h3O");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.reviews.HandleMoreButtonClickAbility
    public final void sf0(String str, String str2, String str3) {
        C1189280h3O c1189280h3OHp = hp(str, str2, str3);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//poi/review_list");
        smartRouteBuildRoute.withParam("poi_id", c1189280h3OHp.LIZ);
        smartRouteBuildRoute.withParam("enter_from", "poi_detail");
        smartRouteBuildRoute.withParam("enter_method", c1189280h3OHp.LIZJ);
        smartRouteBuildRoute.withParam("poi_detail_in_sheet_mode", c1189280h3OHp.LIZLLL);
        smartRouteBuildRoute.withParam("from_group_id", c1189280h3OHp.LJ);
        smartRouteBuildRoute.withParam("initial_poi_enter_from", c1189280h3OHp.LJFF);
        smartRouteBuildRoute.withParam("initial_poi_enter_method", c1189280h3OHp.LJI);
        smartRouteBuildRoute.withParam("initial_poi_from_group_id", c1189280h3OHp.LJII);
        smartRouteBuildRoute.withParam("initial_poi_id", c1189280h3OHp.LJIIIIZZ);
        smartRouteBuildRoute.withParam("poi_detail_enter_from", c1189280h3OHp.LJIIIZ);
        smartRouteBuildRoute.withParam("poi_detail_enter_method", c1189280h3OHp.LJIIJ);
        smartRouteBuildRoute.withParam("poi_reviews_mob_params", c1189280h3OHp.LJIIJJI);
        smartRouteBuildRoute.withParamStringList("pin_review_ids", c1189280h3OHp.LJIIL);
        smartRouteBuildRoute.withParam("from_review_id", c1189280h3OHp.LJIILIIL);
        smartRouteBuildRoute.withParam("tag_id", c1189280h3OHp.LJIILJJIL);
        PoiCommonMobParams poiCommonMobParams = c1189280h3OHp.LJIILL;
        if (poiCommonMobParams != null) {
            smartRouteBuildRoute.withParam("poi_common_mob_params", poiCommonMobParams);
        }
        smartRouteBuildRoute.withParam("source_btm_token", C18JG.LIZ("c8974.d9357", PageFinder.via(this), null));
        smartRouteBuildRoute.open();
    }

    @Override // X.InterfaceC1189980h4W
    public final void i5(int i, String str, long j, String str2) {
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy2;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy3;
        PoiDetailReviewsViewModel poiDetailReviewsViewModelIp = ip();
        C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK = poiDetailReviewsViewModelIp.LLILLJJLI;
        if (c20600815jK != null) {
            int i2 = 0;
            for (Object obj : (ArrayList) c20600815jK.LJII()) {
                int i3 = i2 + 1;
                PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy = null;
                if (i2 >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                    if (interfaceC1891350zJl instanceof PoiReviewsApi.PoiReviewModel) {
                        PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl;
                        if (Intrinsics.LJFF(poiReviewModel.getReviewId(), str2) && Intrinsics.LJFF(poiReviewModel.getPoiId(), str)) {
                            if (i != 0) {
                                if (i != 1) {
                                    if (i == 2) {
                                        PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
                                        if (statistics != null) {
                                            poiReviewStatisticsModelCopy3 = statistics.copy(Long.valueOf(j));
                                        } else {
                                            poiReviewStatisticsModelCopy3 = null;
                                        }
                                        PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
                                        if (userStatus != null) {
                                            poiReviewUserStatusModelCopy = userStatus.copy(Boolean.FALSE, Boolean.TRUE);
                                        }
                                        poiDetailReviewsViewModelIp.vQ2(i2, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy3, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                                        return;
                                    }
                                    return;
                                }
                                PoiReviewsApi.PoiReviewStatisticsModel statistics2 = poiReviewModel.getStatistics();
                                if (statistics2 != null) {
                                    poiReviewStatisticsModelCopy2 = statistics2.copy(Long.valueOf(j));
                                } else {
                                    poiReviewStatisticsModelCopy2 = null;
                                }
                                PoiReviewsApi.PoiReviewUserStatusModel userStatus2 = poiReviewModel.getUserStatus();
                                if (userStatus2 != null) {
                                    poiReviewUserStatusModelCopy = userStatus2.copy(Boolean.TRUE, Boolean.FALSE);
                                }
                                poiDetailReviewsViewModelIp.vQ2(i2, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy2, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                                return;
                            }
                            PoiReviewsApi.PoiReviewStatisticsModel statistics3 = poiReviewModel.getStatistics();
                            if (statistics3 != null) {
                                poiReviewStatisticsModelCopy = statistics3.copy(Long.valueOf(j));
                            } else {
                                poiReviewStatisticsModelCopy = null;
                            }
                            PoiReviewsApi.PoiReviewUserStatusModel userStatus3 = poiReviewModel.getUserStatus();
                            if (userStatus3 != null) {
                                Boolean bool = Boolean.FALSE;
                                poiReviewUserStatusModelCopy = userStatus3.copy(bool, bool);
                            }
                            poiDetailReviewsViewModelIp.vQ2(i2, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                            return;
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
