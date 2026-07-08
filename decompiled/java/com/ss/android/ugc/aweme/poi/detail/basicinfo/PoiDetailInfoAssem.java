package com.ss.android.ugc.aweme.poi.detail.basicinfo;

import X.C013C;
import X.C019F;
import X.C01GW;
import X.C1185610gxT;
import X.C1188440h22;
import X.C1204604nU;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C259800zU;
import X.C452501pT;
import X.C614900O9w;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC1740760vOs;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.RunnableC514801zW;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderClaimedStoreAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderIndependentAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderRegionalAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderUnClaimedStoreAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiDetailContentHeaderNewRegionalAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailInfoAssem extends PoiDetailBaseAssem<PoiListApi.PoiDetailResponse> implements IPoiDetailInfoVAbility, InterfaceC1740760vOs, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final AssemVMLazy LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailInfoAssem.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailInfoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 995), AFwS256S0000000_18.get$arr$(345), null, true);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 994));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2i;
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "c1295";
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final boolean nJ() {
        return true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1013447067) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    public final PoiDetailInfoViewModel Ep() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (PoiDetailInfoViewModel) assemVMLazy.getValue();
    }

    public final void Gp() {
        ViewGroup viewGroup;
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View contentView = getContentView();
        if (!(contentView instanceof ViewGroup) || (viewGroup = (ViewGroup) contentView) == null) {
            return;
        }
        C786410Ut5.LJJJJI(viewGroup);
        C723850SaN.LJII(this, C13LE.LIZ(PoiDetailContentHeaderNewRegionalAssem.class), null);
        C723850SaN.LJII(this, C13LE.LIZ(PoiDetailContentHeaderRegionalAssemV3.class), null);
        C723850SaN.LJII(this, C13LE.LIZ(PoiDetailContentHeaderUnClaimedStoreAssemV3.class), null);
        C723850SaN.LJII(this, C13LE.LIZ(PoiDetailContentHeaderClaimedStoreAssemV3.class), null);
        C723850SaN.LJII(this, C13LE.LIZ(PoiDetailContentHeaderIndependentAssemV3.class), null);
        C723850SaN.LJII(this, C13LE.LIZ(PoiDetailHeaderAssem.class), null);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility
    public final String HP2() {
        return ((C1185610gxT) mp()).LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility
    public final PoiListApi.PoiDetailResponse fZ1() {
        return Ep().LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility
    public final String getPoiId() {
        return ((C1185610gxT) mp()).getPoiId();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        String name;
        String poiName;
        RefreshErrorSubscriber refreshErrorSubscriber;
        PoiDetailInfoRefreshAbility poiDetailInfoRefreshAbility;
        String poiName2;
        Boolean dataFromAnchor;
        PoiListApi.PoiDetailResponse poiDetailResponseCopy;
        C1188440h22 c1188440h22;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) baseComponentData;
        super.CG1(poiDetailResponse);
        PoiDetailInfoViewModel poiDetailInfoViewModelEp = Ep();
        poiDetailInfoViewModelEp.LLILLJJLI = poiDetailResponse;
        C013C c013c = new C013C();
        PoiListApi.PoiDetailResponse poiDetailResponse2 = poiDetailInfoViewModelEp.LLILLJJLI;
        if (poiDetailResponse2 != null) {
            name = poiDetailResponse2.getName();
        } else {
            name = null;
        }
        C1188440h22 c1188440h222 = poiDetailInfoViewModelEp.LLILLL;
        if (c1188440h222 != null) {
            poiName = c1188440h222.getPoiName();
        } else {
            poiName = null;
        }
        c013c.element = !Intrinsics.LJFF(name, poiName);
        if (poiDetailInfoViewModelEp.LLILLJJLI == null && (c1188440h22 = poiDetailInfoViewModelEp.LLILLL) != null) {
            PoiListApi.LIZ.getClass();
            PoiListApi.PoiDetailResponse poiDetailResponse3 = new PoiListApi.PoiDetailResponse(c1188440h22.getPoiName(), c1188440h22.getFallbackAddress(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            poiDetailInfoViewModelEp.LLILLJJLI = poiDetailResponse3;
            poiDetailResponse3.status_code = 0;
            c013c.element = true;
        }
        C1188440h22 c1188440h223 = poiDetailInfoViewModelEp.LLILLL;
        if (c1188440h223 != null && (poiName2 = c1188440h223.getPoiName()) != null && (!TextUtils.isEmpty(poiName2))) {
            PoiListApi.PoiDetailResponse poiDetailResponse4 = poiDetailInfoViewModelEp.LLILLJJLI;
            if (poiDetailResponse4 != null) {
                dataFromAnchor = poiDetailResponse4.getDataFromAnchor();
            } else {
                dataFromAnchor = null;
            }
            PoiListApi.PoiDetailResponse poiDetailResponse5 = poiDetailInfoViewModelEp.LLILLJJLI;
            if (poiDetailResponse5 != null) {
                poiDetailResponseCopy = poiDetailResponse5.copy(poiName2, poiDetailResponse5.address, poiDetailResponse5.cover, poiDetailResponse5.pictureAlbum, poiDetailResponse5.isCollected, poiDetailResponse5.collectInfo, poiDetailResponse5.poiInfoSource, poiDetailResponse5.cityCode, poiDetailResponse5.regionCode, poiDetailResponse5.typeLevel, poiDetailResponse5.fatherPoi, poiDetailResponse5.storeInfo, poiDetailResponse5.tags, poiDetailResponse5.poiHighlightTagModule, poiDetailResponse5.poiTopTags, poiDetailResponse5.poiDetailTagStyleMap, poiDetailResponse5.ownerInfo, poiDetailResponse5.poiLocation, poiDetailResponse5.distanceInfo, poiDetailResponse5.phoneInfo, poiDetailResponse5.editPoiStatus, poiDetailResponse5.dynamicMapParams, poiDetailResponse5.claimStoreStatus, poiDetailResponse5.reportInfo, poiDetailResponse5.isBaAccount, poiDetailResponse5.categoryName, poiDetailResponse5.averagePrice, poiDetailResponse5.followOwnerStatus, poiDetailResponse5.shareInfo, poiDetailResponse5.poiReviewSummaryModel, poiDetailResponse5.realFavoriteCnt, poiDetailResponse5.bookingInfo, poiDetailResponse5.poiShopBookingInfoList, poiDetailResponse5.haveRegionDiscovery, poiDetailResponse5.haveBackgroundTopMap, poiDetailResponse5.poiThirdPartyKeyInfo, poiDetailResponse5.haveProductShelf, poiDetailResponse5.bannerListInfo, poiDetailResponse5.headerCoverImage, poiDetailResponse5.poiIntro, poiDetailResponse5.showHelpCenter, poiDetailResponse5.helpCenterUrl, poiDetailResponse5.userLocation, poiDetailResponse5.chartTag, poiDetailResponse5.intentButtonConfig, poiDetailResponse5.cleanModeHeaderConfig, poiDetailResponse5.isSemiClosedLoopHotel, poiDetailResponse5.provinceCode, poiDetailResponse5.ttTypeCode, poiDetailResponse5.geoNameIds, poiDetailResponse5.ttTypeNameSuper, poiDetailResponse5.cityPoiName, poiDetailResponse5.cityPoiId, poiDetailResponse5.cityName, poiDetailResponse5.ttTypeNameMedium, poiDetailResponse5.countryCode, poiDetailResponse5.ttTypeNameTiny, poiDetailResponse5.poiStyleConfig, poiDetailResponse5.mergedTagsList, poiDetailResponse5.aiSummary, poiDetailResponse5.isProductVisible, poiDetailResponse5.trustTags, poiDetailResponse5.highLightCategoryName, poiDetailResponse5.poiHeadButtonGroup, poiDetailResponse5.showBottomBarWhenDisappear, poiDetailResponse5.poiDetailPageOpt, poiDetailResponse5.noNeedEmptyFeed, poiDetailResponse5.poiReviewEntrance, poiDetailResponse5.yearForDisplay, poiDetailResponse5.LL, poiDetailResponse5.LLILLJJLI);
            } else {
                poiDetailResponseCopy = null;
            }
            poiDetailInfoViewModelEp.LLILLJJLI = poiDetailResponseCopy;
            if (poiDetailResponseCopy != null) {
                poiDetailResponseCopy.setDataFromAnchor(dataFromAnchor);
            }
        }
        poiDetailInfoViewModelEp.setState(new AwS597S0100000_18(c013c, 316));
        if (poiDetailInfoViewModelEp.LLILLJJLI != null) {
            poiDetailInfoViewModelEp.setState(new AwS597S0100000_18(poiDetailInfoViewModelEp, 319));
        } else {
            poiDetailInfoViewModelEp.setState(AFwS256S0000000_18.get$arr$(374));
        }
        Pair pair = new Pair(poiDetailInfoViewModelEp.LLILLJJLI, Boolean.valueOf(c013c.element));
        PoiListApi.PoiDetailResponse poiDetailResponse6 = (PoiListApi.PoiDetailResponse) pair.getFirst();
        ((Boolean) pair.getSecond()).booleanValue();
        ViewGroup viewGroup = this.LLJJIJIL;
        if (viewGroup != null) {
            HandlerHook.viewPost(viewGroup, new RunnableC514801zW(viewGroup, 187));
        }
        if (C1204604nU.LIZ()) {
            if (poiDetailResponse6 == null) {
                Gp();
                return;
            }
            if (poiDetailResponse6.status_code == 0) {
                String poiId = ((C1185610gxT) mp()).getPoiId();
                if (poiId == null) {
                    poiId = "";
                }
                Fp(poiId, poiDetailResponse6);
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI == null || (poiDetailInfoRefreshAbility = (PoiDetailInfoRefreshAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), PoiDetailInfoRefreshAbility.class, null)) == null) {
                    return;
                }
                poiDetailInfoRefreshAbility.zv1();
                return;
            }
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 == null || (refreshErrorSubscriber = (RefreshErrorSubscriber) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), RefreshErrorSubscriber.class, null)) == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("status code:");
            sbLIZ.append(Integer.valueOf(poiDetailResponse6.status_code));
            refreshErrorSubscriber.LLLLLZIL(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) {
        PoiListApi.PoiDetailResponse poiDetailResponseCopy;
        if (!Intrinsics.LJFF(((C1185610gxT) mp()).getPoiId(), c614900O9w.LIZIZ)) {
            return;
        }
        PoiDetailInfoViewModel poiDetailInfoViewModelEp = Ep();
        PoiListApi.PoiDetailResponse poiDetailResponse = Ep().LLILLJJLI;
        if (poiDetailResponse != null) {
            poiDetailResponseCopy = poiDetailResponse.copy(poiDetailResponse.name, poiDetailResponse.address, poiDetailResponse.cover, poiDetailResponse.pictureAlbum, Boolean.valueOf(c614900O9w.LIZ), poiDetailResponse.collectInfo, poiDetailResponse.poiInfoSource, poiDetailResponse.cityCode, poiDetailResponse.regionCode, poiDetailResponse.typeLevel, poiDetailResponse.fatherPoi, poiDetailResponse.storeInfo, poiDetailResponse.tags, poiDetailResponse.poiHighlightTagModule, poiDetailResponse.poiTopTags, poiDetailResponse.poiDetailTagStyleMap, poiDetailResponse.ownerInfo, poiDetailResponse.poiLocation, poiDetailResponse.distanceInfo, poiDetailResponse.phoneInfo, poiDetailResponse.editPoiStatus, poiDetailResponse.dynamicMapParams, poiDetailResponse.claimStoreStatus, poiDetailResponse.reportInfo, poiDetailResponse.isBaAccount, poiDetailResponse.categoryName, poiDetailResponse.averagePrice, poiDetailResponse.followOwnerStatus, poiDetailResponse.shareInfo, poiDetailResponse.poiReviewSummaryModel, poiDetailResponse.realFavoriteCnt, poiDetailResponse.bookingInfo, poiDetailResponse.poiShopBookingInfoList, poiDetailResponse.haveRegionDiscovery, poiDetailResponse.haveBackgroundTopMap, poiDetailResponse.poiThirdPartyKeyInfo, poiDetailResponse.haveProductShelf, poiDetailResponse.bannerListInfo, poiDetailResponse.headerCoverImage, poiDetailResponse.poiIntro, poiDetailResponse.showHelpCenter, poiDetailResponse.helpCenterUrl, poiDetailResponse.userLocation, poiDetailResponse.chartTag, poiDetailResponse.intentButtonConfig, poiDetailResponse.cleanModeHeaderConfig, poiDetailResponse.isSemiClosedLoopHotel, poiDetailResponse.provinceCode, poiDetailResponse.ttTypeCode, poiDetailResponse.geoNameIds, poiDetailResponse.ttTypeNameSuper, poiDetailResponse.cityPoiName, poiDetailResponse.cityPoiId, poiDetailResponse.cityName, poiDetailResponse.ttTypeNameMedium, poiDetailResponse.countryCode, poiDetailResponse.ttTypeNameTiny, poiDetailResponse.poiStyleConfig, poiDetailResponse.mergedTagsList, poiDetailResponse.aiSummary, poiDetailResponse.isProductVisible, poiDetailResponse.trustTags, poiDetailResponse.highLightCategoryName, poiDetailResponse.poiHeadButtonGroup, poiDetailResponse.showBottomBarWhenDisappear, poiDetailResponse.poiDetailPageOpt, poiDetailResponse.noNeedEmptyFeed, poiDetailResponse.poiReviewEntrance, poiDetailResponse.yearForDisplay, poiDetailResponse.LL, poiDetailResponse.LLILLJJLI);
        } else {
            poiDetailResponseCopy = null;
        }
        poiDetailInfoViewModelEp.LLILLJJLI = poiDetailResponseCopy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C259800zU c259800zU = new C259800zU();
        if (C1204604nU.LIZ()) {
            c259800zU.element = ((C1185610gxT) mp()).getPoiId();
            Ep().LL = (String) c259800zU.element;
            Ep();
            BtmSDK.INSTANCE.getPageId((PageFinder) this.LLJJLIIIJLLLLLLLZ.getValue());
            Ep();
            Boolean boolLJII = ((C1185610gxT) mp()).LJII();
            if (boolLJII != null) {
                boolLJII.booleanValue();
            }
            Ep().LLILLL = ((C1185610gxT) mp()).LJIIIZ();
            super.onViewCreated(view);
            if (c259800zU.element == 0) {
                return;
            }
        } else {
            super.onViewCreated(view);
            ?? poiId = ((C1185610gxT) mp()).getPoiId();
            if (poiId == 0) {
                return;
            }
            c259800zU.element = poiId;
            Ep().LL = (String) c259800zU.element;
            Ep();
            BtmSDK.INSTANCE.getPageId((PageFinder) this.LLJJLIIIJLLLLLLLZ.getValue());
            Ep();
            Boolean boolLJII2 = ((C1185610gxT) mp()).LJII();
            if (boolLJII2 != null) {
                boolLJII2.booleanValue();
            }
            Ep().LLILLL = ((C1185610gxT) mp()).LJIIIZ();
        }
        AssemViewModel.asyncSubscribe$default(Ep(), new C2217381BqS() { // from class: X.0gwP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1181990grd) obj).LL;
            }
        }, this, null, new AwS597S0100000_18(this, 294), new AwS553S0100000_9(this, 1439), new AwS384S0200000_18(this, (PoiDetailInfoAssem) c259800zU, (C259800zU<String>) 88), 4, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fp(java.lang.String r11, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r12) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.PoiDetailInfoAssem.Fp(java.lang.String, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse):void");
    }
}
