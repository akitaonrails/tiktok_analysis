package com.ss.android.ugc.aweme.live.hostbusiness;

import X.C08JS;
import X.C0IXL;
import X.C1019100ccu;
import X.C1022820ciu;
import X.C1047650dMx;
import X.C1047660dMy;
import X.C1148430fzV;
import X.C2184171Adz;
import Y.AObjectS382S0100000_7;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.business.IAdLiveHelperService;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.setting.AdLiveRoi2PseudoAdsConfigData;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLiveHelperService implements IAdLiveHelperService {
    @Override // com.bytedance.android.livesdkapi.business.IAdLiveHelperService
    public final long g42() {
        Long l = ((AdLiveRoi2PseudoAdsConfigData) C1047650dMx.LIZIZ.getValue()).clickDelayInternal;
        if (l != null) {
            return l.longValue();
        }
        return 3000L;
    }

    @Override // com.bytedance.android.livesdkapi.business.IAdLiveHelperService
    public final void Gw2(Uri uri, EnterRoomConfig enterRoomConfig) {
        AdLiveEnterRoomConfig adLiveEnterRoomConfig;
        String str;
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "adLiveJson");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (str = (adLiveEnterRoomConfig = (AdLiveEnterRoomConfig) C08JS.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, AdLiveEnterRoomConfig.class)).creativeId) != null && str.length() != 0) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                roomsData.adLiveEnterRoomConfig = adLiveEnterRoomConfig;
                boolean z = adLiveEnterRoomConfig.enterFromAd;
                roomsData.enterFromAd = z;
                if (z) {
                    C1019100ccu.LJFF();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.android.livesdkapi.business.IAdLiveHelperService
    public final void iQ2(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, long j) {
        C1047660dMy.LIZIZ.W2(context, adLiveEnterRoomConfig, String.valueOf(j));
    }

    @Override // com.bytedance.android.livesdkapi.business.IAdLiveHelperService
    public final void yR0(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, AObjectS382S0100000_7 aObjectS382S0100000_7) {
        C1047660dMy.LIZIZ.T2(context, adLiveEnterRoomConfig, aObjectS382S0100000_7, aObjectS382S0100000_7);
    }

    @Override // com.bytedance.android.livesdkapi.business.IAdLiveHelperService
    public final void Bn1(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        AdLiveEnterRoomConfig adLiveEnterRoomConfig;
        String str3;
        C0IXL c0ixl = (C0IXL) DataChannelGlobal.LLILZ.gg0(C1148430fzV.class);
        if (c0ixl == null || (adLiveEnterRoomConfig = c0ixl.LJJJ) == null || (str3 = adLiveEnterRoomConfig.creativeId) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> mapLIZ = adLiveEnterRoomConfig.LIZ();
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(str, str2, str3, adLiveEnterRoomConfig.logExtra, adLiveEnterRoomConfig.groupId);
        c1022820ciuLJ.LIZLLL(map);
        c1022820ciuLJ.LIZ(map2);
        c1022820ciuLJ.LIZLLL(linkedHashMap);
        c1022820ciuLJ.LIZ(mapLIZ);
        c1022820ciuLJ.LJII();
    }

    @Override // com.bytedance.android.livesdkapi.business.IAdLiveHelperService
    public final void oF1(String str, String str2, String str3, Map map, Map map2) {
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("draw_ad", str, str2, str3, null);
        c1022820ciuLJ.LIZLLL(map);
        c1022820ciuLJ.LIZ(map2);
        c1022820ciuLJ.LJIIIIZZ();
    }
}
