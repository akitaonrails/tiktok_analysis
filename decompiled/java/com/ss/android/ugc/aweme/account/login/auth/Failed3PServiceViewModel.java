package com.ss.android.ugc.aweme.account.login.auth;

import X.C09JN;
import X.C0XZ4;
import X.C2097608Jq;
import X.C21312318an;
import X.InterfaceC781210Ukh;
import Y.AfS54S0110000_3;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.account.api.AccountLookupDeviceResponse;
import com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel;
import com.ss.android.ugc.aweme.services.popsuite.PopSuiteKeva;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes35.dex */
public final class Failed3PServiceViewModel extends ViewModel {
    public final MutableLiveData<AccountLookupDeviceResponse> LL;
    public final MutableLiveData LLILLJJLI;
    public final MutableLiveData<Boolean> LLILLL;
    public final MutableLiveData LLILZ;
    public final MutableLiveData<Boolean> LLILZIL;
    public final MutableLiveData LLILZLL;
    public final MutableLiveData<Bundle> LLIZ;
    public final MutableLiveData LLIZLLLIL;
    public final MutableLiveData<Boolean> LLJ;
    public final MutableLiveData LLJI;
    public final MutableLiveData<Bundle> LLJIJIL;
    public final MutableLiveData LLJILJIL;
    public String LLJILJILJ;
    public C21312318an LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public Bundle LLJJIJI;

    public final void wQ2() {
        PopSuiteKeva popSuiteKeva = PopSuiteKeva.INSTANCE;
        String str = this.LLJILJILJ;
        C21312318an c21312318an = this.LLJILLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C21312318an c21312318an2 = this.LLJILLL;
        popSuiteKeva.updatePopupFreqCache(str, C21312318an.LIZ(c21312318an, jCurrentTimeMillis, c21312318an2.LIZIZ + 1, c21312318an2.LIZJ + 1, 24));
    }

    public Failed3PServiceViewModel() {
        MutableLiveData<AccountLookupDeviceResponse> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.LLILLL = mutableLiveData2;
        this.LLILZ = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.LLILZIL = mutableLiveData3;
        this.LLILZLL = mutableLiveData3;
        MutableLiveData<Bundle> mutableLiveData4 = new MutableLiveData<>();
        this.LLIZ = mutableLiveData4;
        this.LLIZLLLIL = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.LLJ = mutableLiveData5;
        this.LLJI = mutableLiveData5;
        MutableLiveData<Bundle> mutableLiveData6 = new MutableLiveData<>();
        this.LLJIJIL = mutableLiveData6;
        this.LLJILJIL = mutableLiveData6;
        this.LLJILJILJ = "";
        this.LLJILLL = new C21312318an(0);
        this.LLJJ = "";
        this.LLJJI = "";
        this.LLJJIII = "";
    }

    public final void vQ2(final String str, final String str2, final String str3, final String str4, final int i, final boolean z, final String str5, String str6) {
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("passport_ticket", str5), new Pair("email_theme", "2"));
        c0xz4.getClass();
        C0XZ4.LJIILL(23, null, null, null, null, "", "user_click", str, str2, "failed_3p_login", str6, null, str4, "", mapLJIIIIZZ, null).LJIIIIZZ(new C09JN() { // from class: X.0Xcu
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("Failed3PServiceViewModel@8e10.sendEmailCode$1");
                Bundle bundle = new Bundle();
                String str7 = str4;
                String str8 = str5;
                int i2 = i;
                String str9 = str;
                String str10 = str2;
                C786410Ut5.LJJJI("oauth_platform", str7, bundle);
                C786410Ut5.LJJJI("page", "failed_3p_login", bundle);
                C786410Ut5.LJJJI("passport_ticket", str8, bundle);
                bundle.putInt("current_scene", i2);
                bundle.putBoolean("code_sent", true);
                C786410Ut5.LJJIJL(bundle, "get_available_ways_approach", new AvailableWaysViewModel.GetAvailableWayType(true, true));
                C786410Ut5.LJJJI("enter_from", str9, bundle);
                C786410Ut5.LJJJI("enter_method", str10, bundle);
                C852810Xct c852810Xct = C852810Xct.LIZ;
                String str11 = str3;
                c852810Xct.getClass();
                C852810Xct.LJIILLIIL(bundle, str11);
                this.LLIZ.postValue(bundle);
                C1C7U.LIZIZ("Failed3PServiceViewModel@8e10.sendEmailCode$1");
            }
        }).LJII(new AfS54S0110000_3(z, this, 0)).LJFF(new InterfaceC781210Ukh() { // from class: X.1BV7
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                if (z) {
                    this.LLJ.postValue(Boolean.TRUE);
                }
            }
        }).LJIILL();
    }
}
