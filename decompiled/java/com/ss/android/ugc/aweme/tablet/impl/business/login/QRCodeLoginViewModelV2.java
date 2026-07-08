package com.ss.android.ugc.aweme.tablet.impl.business.login;

import X.AbstractC1703710uR7;
import X.AbstractC1703720uR8;
import X.AbstractC845940XGm;
import X.AbstractC846040XGw;
import X.C01GW;
import X.C05XL;
import X.C090F;
import X.C099F;
import X.C0PEM;
import X.C0XGA;
import X.C0XH1;
import X.C10GZ;
import X.C19252910Tv;
import X.C1B51;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2192571ArX;
import X.C2199051B4t;
import X.C2199101B4y;
import X.C2199111B4z;
import X.C23250099c;
import X.C2344009Gk;
import X.C452501pT;
import X.C845950XGn;
import X.C845960XGo;
import X.C846070XGz;
import X.EnumC2199071B4v;
import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tablet.impl.business.login.QRCodeLoginViewModelV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS225S0000000_34;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class QRCodeLoginViewModelV2 extends BaseQRCodeLoginViewModel {
    public final C01GW LLILZLL;
    public ArrayList<AbstractC846040XGw<? extends C0XGA>> LLIZ;
    public final Application LLIZLLLIL;
    public long LLJ;
    public String LLJI;
    public String LLJIJIL;
    public final AtomicBoolean LLJILJIL;

    @Override // com.ss.android.ugc.aweme.tablet.impl.business.login.BaseQRCodeLoginViewModel
    public final void vQ2() {
        this.LLILLJJLI.postValue(EnumC2199071B4v.LOADING);
        AbstractC1703710uR7 abstractC1703710uR7 = new AbstractC1703710uR7() { // from class: X.1B4x
            @Override // X.C0XH7
            public final void LJI(C0XGA c0xga) {
                JSONObject jSONObjectOptJSONObject;
                C1B53 c1b53 = (C1B53) c0xga;
                String strOptString = null;
                this.LIZJ.EQ2(0, null, System.currentTimeMillis() - this.LIZJ.LLJ);
                QRCodeLoginViewModelV2 qRCodeLoginViewModelV2 = this.LIZJ;
                qRCodeLoginViewModelV2.LLJI = c1b53.LJIIJ;
                qRCodeLoginViewModelV2.LLILLL = c1b53.LJIIIZ;
                JSONObject jSONObject = c1b53.LJII;
                if (jSONObject != null && jSONObject.has("data") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                    strOptString = jSONObjectOptJSONObject.optString("device_redirect_info");
                }
                qRCodeLoginViewModelV2.LLJIJIL = strOptString;
                this.LIZJ.BQ2(c1b53.LJIIJ);
                this.LIZJ.LLILLJJLI.postValue(EnumC2199071B4v.NEW);
            }

            @Override // X.C0XH7
            public final void LJ(C0XGA c0xga, int i) {
                this.LIZJ.EQ2(-1, Integer.valueOf(i), System.currentTimeMillis() - this.LIZJ.LLJ);
                this.LIZJ.LLILLJJLI.postValue(EnumC2199071B4v.ERROR);
            }
        };
        yQ2(abstractC1703710uR7);
        Application application = this.LLIZLLLIL;
        String str = BaseQRCodeLoginViewModel.LLILZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LJ(CQ2(null, str), null);
        c846070XGz.LIZ = C0XH1.LIZ("/passport/mobile/get_qrcode/");
        C845960XGo c845960XGoLIZIZ = c846070XGz.LIZIZ();
        this.LLJ = System.currentTimeMillis();
        new C2199111B4z(application, c845960XGoLIZIZ, abstractC1703710uR7).LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.tablet.impl.business.login.BaseQRCodeLoginViewModel
    public final void wQ2() {
        int i;
        this.LLJILJIL.set(true);
        EnumC2199071B4v value = this.LLILLJJLI.getValue();
        if (value == null || (i = C1B51.LIZ[value.ordinal()]) == -1 || i == 1 || i == 2 || i == 3) {
            vQ2();
        } else if (i == 4) {
            if (this.LLJI.length() > 0) {
                BQ2(this.LLJI);
            } else {
                vQ2();
            }
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ArrayList<AbstractC846040XGw<? extends C0XGA>> arrayList = this.LLIZ;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            AbstractC846040XGw abstractC846040XGw = (AbstractC846040XGw) ListProtector.get(arrayList, size);
            if (!abstractC846040XGw.LIZIZ) {
                abstractC846040XGw.LIZIZ = true;
                AbstractC845940XGm abstractC845940XGm = abstractC846040XGw.LIZ;
                if (abstractC845940XGm != null) {
                    abstractC845940XGm.LJ = null;
                    C845950XGn c845950XGn = abstractC845940XGm.LJI;
                    if (c845950XGn != null) {
                        c845950XGn.LLILLJJLI.compareAndSet(false, true);
                    }
                }
            }
            arrayList.remove(abstractC846040XGw);
        }
    }

    public QRCodeLoginViewModelV2(Application application) {
        super(application);
        this.LLILZLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(133));
        this.LLIZLLLIL = getApplication();
        this.LLJ = System.currentTimeMillis();
        this.LLJI = "";
        this.LLJILJIL = new AtomicBoolean(false);
    }

    public static void DQ2(EnumC2199071B4v enumC2199071B4v) {
        String str;
        if (enumC2199071B4v == EnumC2199071B4v.EXPIRED) {
            str = "qr_code_expired";
        } else if (enumC2199071B4v == EnumC2199071B4v.REFUSED) {
            str = "qr_code_refused";
        } else {
            str = "other";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("platform", "qr_code");
        c2344009Gk.LJIIIIZZ("login_panel_type", C19252910Tv.LIZIZ.LIZLLL().LJIJ().LIZ());
        c2344009Gk.LJIIIIZZ("error_desc", str);
        C20684815ws.LJIILLIIL("login_failure", c2344009Gk.LIZ);
    }

    public final void BQ2(String str) {
        if (!this.LLJILJIL.get()) {
            return;
        }
        C099F c099fLIZIZ = C090F.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = this.LLJIJIL;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("device_redirect_info", str2);
        for (String str3 : BaseQRCodeLoginViewModel.LLILZIL) {
            C2199051B4t c2199051B4t = new C2199051B4t(c099fLIZIZ, this, str3);
            yQ2(c2199051B4t);
            zQ2(str, str3, linkedHashMap, c2199051B4t).LJIIIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.tablet.impl.business.login.BaseQRCodeLoginViewModel
    public final void xQ2(LifecycleOwner lifecycleOwner) {
        this.LLJILJIL.set(false);
        this.LLILLJJLI.removeObservers(lifecycleOwner);
    }

    public final <T extends C0XGA> void yQ2(AbstractC846040XGw<T> abstractC846040XGw) {
        if (this.LLIZ == null) {
            this.LLIZ = new ArrayList<>();
        }
        ArrayList<AbstractC846040XGw<? extends C0XGA>> arrayList = this.LLIZ;
        if (arrayList != null) {
            arrayList.add(abstractC846040XGw);
        }
    }

    public final Map CQ2(String str, String str2) {
        String str3;
        HashMap map = new HashMap();
        if (str != null && !TextUtils.isEmpty(str)) {
            map.put("token", str);
        }
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            map.put("service", str2);
        }
        map.put(Scene.SCENE_SERVICE, String.valueOf(0));
        C10GZ c10gz = C10GZ.LIZ;
        if (((Number) C10GZ.LJIIIIZZ.getValue()).intValue() == 2) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("use_native", str3);
        return map;
    }

    public final void AQ2(C05XL<Unit> c05xl, String str, boolean z) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C2192571ArX(z, this, c05xl, str, null), 2);
    }

    public final void EQ2(int i, Integer num, long j) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "duration_ms");
        c2344009Gk.LIZJ(i, "status_code");
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "error_code");
        }
        C20684815ws.LJIILLIIL("qr_code_loading", c2344009Gk.LIZ);
    }

    public final C2199101B4y zQ2(String str, String str2, Map map, AbstractC1703720uR8 abstractC1703720uR8) {
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LJ(CQ2(str, BaseQRCodeLoginViewModel.LLILZ), map);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append("/passport/mobile/check_qrconnect/");
        c846070XGz.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        return new C2199101B4y(this.LLIZLLLIL, c846070XGz.LIZIZ(), abstractC1703720uR8);
    }
}
