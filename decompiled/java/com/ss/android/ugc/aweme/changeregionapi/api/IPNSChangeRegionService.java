package com.ss.android.ugc.aweme.changeregionapi.api;

import X.C1238730iL9;
import X.InterfaceC1703520uQo;
import X.InterfaceC1710120ubS;
import android.app.Activity;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.changeregion.util.StoreRegionInterceptor;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;

/* JADX INFO: loaded from: classes29.dex */
public interface IPNSChangeRegionService {
    void LIZ(boolean z);

    void LIZIZ();

    void LIZJ(String str, String str2, String str3, String str4);

    String LIZLLL();

    LiveData<? extends C1238730iL9> LJ();

    String LJFF();

    LiveData<? extends C1238730iL9> LJI();

    void LJII(InterfaceC1703520uQo interfaceC1703520uQo);

    void LJIIIIZZ(InterfaceC1703520uQo interfaceC1703520uQo);

    boolean LJIIIZ(int i, String str, String str2, String str3);

    StoreRegionInterceptor LJIIJ();

    boolean LJIIJJI();

    int LJIIL();

    String LJIILIIL();

    void LJIILJJIL();

    void LJIILL(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity);

    void LJIILLIIL(Activity activity, InterfaceC1710120ubS interfaceC1710120ubS);

    String getStoreRegion();
}
