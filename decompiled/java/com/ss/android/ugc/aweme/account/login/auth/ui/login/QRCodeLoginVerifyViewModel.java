package com.ss.android.ugc.aweme.account.login.auth.ui.login;

import X.AbstractC1234830iEr;
import X.AbstractC845940XGm;
import X.C1234800iEo;
import X.C1527830prR;
import X.C19GC;
import X.C20684815ws;
import X.C2344009Gk;
import X.C845960XGo;
import X.C846070XGz;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class QRCodeLoginVerifyViewModel extends AndroidViewModel {
    public static boolean LLJILJIL;
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public final MutableLiveData<C19GC> LLILZIL;
    public final MutableLiveData<Long> LLILZLL;
    public final MutableLiveData<String> LLIZ;
    public final MutableLiveData<String> LLIZLLLIL;
    public final Application LLJ;
    public String LLJI;
    public final MutableLiveData<Pair<String, String>> LLJIJIL;

    public QRCodeLoginVerifyViewModel(Application application) {
        super(application);
        this.LL = "";
        this.LLILLJJLI = "";
        this.LLILLL = "";
        this.LLILZ = "";
        this.LLILZIL = new MutableLiveData<>();
        this.LLILZLL = new MutableLiveData<>();
        this.LLIZ = new MutableLiveData<>();
        this.LLIZLLLIL = new MutableLiveData<>();
        this.LLJ = getApplication();
        this.LLJI = CardStruct.IStatusCode.DEFAULT;
        this.LLJIJIL = new MutableLiveData<>();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.19GB] */
    public final void vQ2(boolean z) {
        final String str;
        if (z) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        final ?? r6 = new AbstractC1234830iEr() { // from class: X.19GB
            @Override // X.C0XH7
            public final void LJI(C0XGA c0xga) {
                if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                    C1527830prR c1527830prR = C1527830prR.LIZ;
                    String str2 = this.LLJI;
                    c1527830prR.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_method", str2);
                    c2344009Gk.LIZJ(1, "is_native");
                    C20684815ws.LJIILLIIL("qr_code_login_confirmed", c2344009Gk.LIZ);
                    this.LLILZIL.postValue(C19GC.LOGIN_APPROVE);
                    return;
                }
                C1527830prR c1527830prR2 = C1527830prR.LIZ;
                String str3 = this.LLJI;
                c1527830prR2.getClass();
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_method", str3);
                c2344009Gk2.LIZJ(1, "is_native");
                C20684815ws.LJIILLIIL("qr_code_login_refused", c2344009Gk2.LIZ);
                this.LLILZIL.postValue(C19GC.LOGIN_REFUSE);
            }

            @Override // X.C0XH7
            public final void LJ(C0XGA c0xga, int i) {
                C1527830prR c1527830prR = C1527830prR.LIZ;
                String str2 = this.LLJI;
                c1527830prR.getClass();
                C1527830prR.LIZ(i, "confirm_decision", str2);
                this.wQ2(i, C19GC.LOGIN_CONFIRM_ERROR);
            }
        };
        final Application application = this.LLJ;
        String str2 = this.LLILLJJLI;
        String str3 = this.LL;
        String str4 = this.LLILZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZJ("token", str2);
        c846070XGz.LIZJ("decision", str);
        c846070XGz.LIZJ("csrf_token", str3);
        c846070XGz.LIZLLL(null);
        c846070XGz.LIZ = str4;
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C1234800iEo>(application, c845960XGoLJFF, r6) { // from class: X.0iEn
            public C1234800iEo LJIIIIZZ;
            public JSONObject LJIIIZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_mobile_confirm_qrcode", null, null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIZ = jSONObject2;
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIIZZ = new C1234800iEo(true);
                this.LJIIIZ = jSONObject;
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z2, C845980XGq c845980XGq) {
                C1234800iEo c1234800iEo = this.LJIIIIZZ;
                if (c1234800iEo == null) {
                    c1234800iEo = new C1234800iEo(z2);
                } else {
                    c1234800iEo.LIZIZ = z2;
                }
                if (!z2) {
                    c1234800iEo.LIZLLL = c845980XGq.LIZIZ;
                    c1234800iEo.LJFF = c845980XGq.LIZJ;
                }
                c1234800iEo.LJII = this.LJIIIZ;
                return c1234800iEo;
            }
        }.LJIIIZ();
    }

    public final void wQ2(int i, C19GC c19gc) {
        String str;
        if (i == 7 && !LLJILJIL) {
            this.LLILZIL.postValue(C19GC.INVALID_REGION_ERROR);
            C1527830prR c1527830prR = C1527830prR.LIZ;
            String str2 = this.LLJI;
            c1527830prR.getClass();
            List<String> list = C1527830prR.LIZIZ;
            Locale locale = Locale.ROOT;
            if (list.contains(str2.toLowerCase(locale))) {
                str = "ios";
            } else if (C1527830prR.LIZJ.contains(str2.toLowerCase(locale))) {
                str = "android";
            } else {
                str = "unknown";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_method", str);
            C20684815ws.LJIILLIIL("show_qrcode_switch_wifi_toast", c2344009Gk.LIZ);
            LLJILJIL = true;
            return;
        }
        this.LLILZIL.postValue(c19gc);
    }
}
