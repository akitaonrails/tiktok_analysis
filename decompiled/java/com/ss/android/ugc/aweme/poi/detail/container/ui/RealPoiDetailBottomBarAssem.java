package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C1185610gxT;
import X.C1186970gzf;
import X.C13LE;
import X.C13LP;
import X.C723850SaN;
import X.C786410Ut5;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiDetailFavoriteButtonAssem;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiDetailFavoriteDescAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailBottomShopCtaAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingProviderInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbilityAdapter;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS8S0302000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RealPoiDetailBottomBarAssem implements ContainerEventDispatcher$RefreshActionCallBackAbilityAdapter {
    public PoiListApi.PoiDetailResponse LL;

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility
    public final void LLLLLZIL(Throwable th) {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility
    public final void i1() {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility
    public final void t0() {
    }

    public static boolean LIZ(PoiListApi.PoiDetailResponse poiDetailResponse) {
        List<PoiShopBookingInfo> poiShopBookingInfoList = poiDetailResponse.getPoiShopBookingInfoList();
        if (poiShopBookingInfoList == null || poiShopBookingInfoList.isEmpty()) {
            return false;
        }
        List<PoiShopBookingInfo> poiShopBookingInfoList2 = poiDetailResponse.getPoiShopBookingInfoList();
        if ((poiShopBookingInfoList2 instanceof Collection) && poiShopBookingInfoList2.isEmpty()) {
            return false;
        }
        for (PoiShopBookingInfo poiShopBookingInfo : poiShopBookingInfoList2) {
            if (poiShopBookingInfo != null && poiShopBookingInfo.isValid()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility
    public final void X0(String str) {
        this.LL = null;
    }

    public final void LIZIZ(UIAssem uIAssem, C1185610gxT c1185610gxT, PoiListApi.PoiDetailResponse poiDetailResponse) {
        String poiId;
        int i;
        String string;
        String str;
        String strLJIIJJI;
        String strLJ;
        List<PoiBookingProviderInfo> list;
        PoiBookingProviderInfo poiBookingProviderInfo;
        if (!uIAssem.so()) {
            return;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LL;
        if (poiDetailResponse2 == null || !Intrinsics.LJFF(poiDetailResponse2.isCollected(), poiDetailResponse.isCollected())) {
            C723850SaN.LJII(uIAssem, C13LE.LIZ(PoiDetailFavoriteButtonAssem.class), null);
            C786410Ut5.LJJJJI((ViewGroup) uIAssem.LJJIJL().findViewById(R.id.hpv));
            C723850SaN.LIZLLL(uIAssem, new AwS384S0200000_18(uIAssem, poiDetailResponse, 22));
        }
        PoiListApi.PoiDetailResponse poiDetailResponse3 = this.LL;
        if (poiDetailResponse3 == null || !Intrinsics.LJFF(poiDetailResponse3.getPoiShopBookingInfoList(), poiDetailResponse.getPoiShopBookingInfoList())) {
            C723850SaN.LJII(uIAssem, C13LE.LIZ(PoiDetailFavoriteDescAssem.class), null);
            C786410Ut5.LJJJJI((ViewGroup) uIAssem.LJJIJL().findViewById(R.id.hq2));
            if (!LIZ(poiDetailResponse)) {
                C723850SaN.LIZLLL(uIAssem, new AwS581S0100000_2(uIAssem, 55));
            }
            if (c1185610gxT != null) {
                poiId = c1185610gxT.getPoiId();
            } else {
                poiId = null;
            }
            C723850SaN.LJII(uIAssem, C13LE.LIZ(PoiDetailBottomShopCtaAssem.class), CardStruct.IStatusCode.DEFAULT);
            C723850SaN.LJII(uIAssem, C13LE.LIZ(PoiDetailBottomShopCtaAssem.class), "1");
            C786410Ut5.LJJJJI((ViewGroup) uIAssem.LJJIJL().findViewById(R.id.hzq));
            C786410Ut5.LJJJJI((ViewGroup) uIAssem.LJJIJL().findViewById(R.id.ugn));
            List<PoiShopBookingInfo> poiShopBookingInfoList = poiDetailResponse.getPoiShopBookingInfoList();
            int i2 = 1;
            if (poiShopBookingInfoList != null && !poiShopBookingInfoList.isEmpty() && LIZ(poiDetailResponse)) {
                int i3 = 0;
                for (PoiShopBookingInfo poiShopBookingInfo : poiDetailResponse.getPoiShopBookingInfoList()) {
                    if (i3 >= 2) {
                        break;
                    }
                    if (poiShopBookingInfo != null && poiShopBookingInfo.isValid() == i2) {
                        if (i3 != 0) {
                            if (i3 != i2) {
                                i = 0;
                            } else {
                                i = R.id.ugn;
                            }
                        } else {
                            i = R.id.hzq;
                        }
                        Integer num = poiShopBookingInfo.provider;
                        if (num != null) {
                            string = num.toString();
                        } else {
                            string = null;
                        }
                        String cityCode = poiDetailResponse.getCityCode();
                        String regionCode = poiDetailResponse.getRegionCode();
                        String typeLevel = poiDetailResponse.getTypeLevel();
                        String collectInfo = poiDetailResponse.getCollectInfo();
                        PoiBookingInfo bookingInfo = poiDetailResponse.getBookingInfo();
                        if (bookingInfo != null && (list = bookingInfo.providers) != null && (poiBookingProviderInfo = (PoiBookingProviderInfo) C13LP.LJJJLL(list)) != null) {
                            str = poiBookingProviderInfo.track_info;
                        } else {
                            str = null;
                        }
                        if (c1185610gxT != null) {
                            strLJIIJJI = c1185610gxT.LJIIJJI();
                            strLJ = c1185610gxT.LJ();
                        } else {
                            strLJIIJJI = null;
                            strLJ = null;
                        }
                        C723850SaN.LIZLLL(uIAssem, new AwS8S0302000_2(uIAssem, poiShopBookingInfo, new C1186970gzf(string, poiId, cityCode, regionCode, typeLevel, collectInfo, str, strLJIIJJI, strLJ, null), i, i3, 0));
                        i3++;
                        i2 = 1;
                    }
                }
            }
        }
        this.LL = poiDetailResponse;
    }
}
