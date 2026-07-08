package com.ss.android.ugc.aweme.tablet.impl.business.login;

import X.AbstractC1703710uR7;
import X.AbstractC1703720uR8;
import X.AbstractC845940XGm;
import X.AbstractC846040XGw;
import X.C01GW;
import X.C090F;
import X.C099F;
import X.C0PEM;
import X.C0XGA;
import X.C0XH1;
import X.C10GZ;
import X.C15438062q;
import X.C1B50;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2199041B4s;
import X.C2199101B4y;
import X.C2199111B4z;
import X.C2214201BlK;
import X.C23250099c;
import X.C2344009Gk;
import X.C452501pT;
import X.C845950XGn;
import X.C845960XGo;
import X.C846070XGz;
import X.EnumC2199071B4v;
import android.app.Application;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tablet.impl.business.login.QRCodeLoginViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class QRCodeLoginViewModel extends BaseQRCodeLoginViewModel implements WeakHandler.IHandler {
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public ArrayList<AbstractC846040XGw<? extends C0XGA>> LLIZLLLIL;
    public final Application LLJ;
    public final HashMap<String, EnumC2199071B4v> LLJI;
    public long LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public final AtomicBoolean LLJILLL;

    @Override // com.ss.android.ugc.aweme.tablet.impl.business.login.BaseQRCodeLoginViewModel
    public final void vQ2() {
        this.LLILLJJLI.postValue(EnumC2199071B4v.LOADING);
        AbstractC1703710uR7 abstractC1703710uR7 = new AbstractC1703710uR7() { // from class: X.1B4w
            @Override // X.C0XH7
            public final void LJI(C0XGA c0xga) {
                JSONObject jSONObjectOptJSONObject;
                C1B53 c1b53 = (C1B53) c0xga;
                String strOptString = null;
                this.LIZJ.AQ2(0, null, System.currentTimeMillis() - this.LIZJ.LLJIJIL);
                QRCodeLoginViewModel qRCodeLoginViewModel = this.LIZJ;
                qRCodeLoginViewModel.LLJILJIL = c1b53.LJIIJ;
                qRCodeLoginViewModel.LLILLL = c1b53.LJIIIZ;
                JSONObject jSONObject = c1b53.LJII;
                if (jSONObject != null && jSONObject.has("data") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                    strOptString = jSONObjectOptJSONObject.optString("device_redirect_info");
                }
                qRCodeLoginViewModel.LLJILJILJ = strOptString;
                this.LIZJ.yQ2(c1b53.LJIIJ);
                this.LIZJ.LLILLJJLI.postValue(EnumC2199071B4v.NEW);
            }

            @Override // X.C0XH7
            public final void LJ(C0XGA c0xga, int i) {
                this.LIZJ.AQ2(-1, Integer.valueOf(i), System.currentTimeMillis() - this.LIZJ.LLJIJIL);
                this.LIZJ.LLILLJJLI.postValue(EnumC2199071B4v.ERROR);
            }
        };
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new ArrayList<>();
        }
        ArrayList<AbstractC846040XGw<? extends C0XGA>> arrayList = this.LLIZLLLIL;
        if (arrayList != null) {
            arrayList.add(abstractC1703710uR7);
        }
        Application application = this.LLJ;
        String str = BaseQRCodeLoginViewModel.LLILZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LJ(zQ2(null, str), null);
        c846070XGz.LIZ = C0XH1.LIZ("/passport/mobile/get_qrcode/");
        C845960XGo c845960XGoLIZIZ = c846070XGz.LIZIZ();
        this.LLJIJIL = System.currentTimeMillis();
        new C2199111B4z(application, c845960XGoLIZIZ, abstractC1703710uR7).LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.tablet.impl.business.login.BaseQRCodeLoginViewModel
    public final void wQ2() {
        int i;
        this.LLJILLL.set(true);
        EnumC2199071B4v value = this.LLILLJJLI.getValue();
        if (value == null || (i = C1B50.LIZ[value.ordinal()]) == -1 || i == 1 || i == 2 || i == 3) {
            vQ2();
        } else if (i == 4) {
            if (this.LLJILJIL.length() > 0) {
                yQ2(this.LLJILJIL);
            } else {
                vQ2();
            }
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ArrayList<AbstractC846040XGw<? extends C0XGA>> arrayList = this.LLIZLLLIL;
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

    public QRCodeLoginViewModel(Application application) {
        super(application);
        this.LLILZLL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 90));
        this.LLIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(132));
        this.LLJ = getApplication();
        List<String> list = BaseQRCodeLoginViewModel.LLILZIL;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(it2.next(), EnumC2199071B4v.EMPTY);
        }
        this.LLJI = linkedHashMap;
        this.LLJIJIL = System.currentTimeMillis();
        this.LLJILJIL = "";
        this.LLJILLL = new AtomicBoolean(false);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String str;
        if (message != null && message.what == 2000) {
            ((Handler) this.LLILZLL.getValue()).removeMessages(2000);
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if ((messageObj instanceof String) && (str = (String) messageObj) != null) {
                if (C2214201BlK.LJIIJJI) {
                    Handler handler = (Handler) this.LLILZLL.getValue();
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 2000;
                    messageObtain.obj = str;
                    handler.sendMessageDelayed(messageObtain, 2000L);
                    return;
                }
                yQ2(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tablet.impl.business.login.BaseQRCodeLoginViewModel
    public final void xQ2(LifecycleOwner lifecycleOwner) {
        this.LLJILLL.set(false);
        this.LLILLJJLI.removeObservers(lifecycleOwner);
    }

    public final void yQ2(String str) {
        if (!this.LLJILLL.get()) {
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(this.LLJI.size());
        final C099F c099fLIZIZ = C090F.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = this.LLJILJILJ;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("device_redirect_info", str2);
        Iterator it2 = ((LinkedHashMap) this.LLJI).entrySet().iterator();
        while (it2.hasNext()) {
            final String str3 = (String) ((Map.Entry) it2.next()).getKey();
            this.LLJI.put(str3, EnumC2199071B4v.EMPTY);
            AbstractC1703720uR8 abstractC1703720uR8 = new AbstractC1703720uR8() { // from class: X.1B4u
                @Override // X.C0XH7
                public final void LJI(C0XGA c0xga) {
                    C1B54 c1b54 = (C1B54) c0xga;
                    if (!c099fLIZIZ.isCompleted()) {
                        String str4 = c1b54.LJIILJJIL;
                        EnumC2199071B4v enumC2199071B4v = EnumC2199071B4v.CONFIRMED;
                        if (Intrinsics.LJFF(str4, enumC2199071B4v.getValue())) {
                            this.LLJI.put(str3, enumC2199071B4v);
                            this.LL = c1b54.LJIIIZ;
                            c099fLIZIZ.LJIIZILJ(Unit.LIZ);
                            return;
                        }
                        EnumC2199071B4v enumC2199071B4v2 = EnumC2199071B4v.EXPIRED;
                        if (Intrinsics.LJFF(str4, enumC2199071B4v2.getValue())) {
                            this.LLJI.put(str3, enumC2199071B4v2);
                            c099fLIZIZ.LJIIZILJ(Unit.LIZ);
                            return;
                        }
                        EnumC2199071B4v enumC2199071B4v3 = EnumC2199071B4v.REFUSED;
                        if (Intrinsics.LJFF(str4, enumC2199071B4v3.getValue())) {
                            this.LLJI.put(str3, enumC2199071B4v3);
                            c099fLIZIZ.LJIIZILJ(Unit.LIZ);
                            return;
                        }
                        EnumC2199071B4v enumC2199071B4v4 = EnumC2199071B4v.NEW;
                        if (Intrinsics.LJFF(str4, enumC2199071B4v4.getValue())) {
                            this.LLJI.put(str3, enumC2199071B4v4);
                            if (atomicInteger.decrementAndGet() != 0) {
                                return;
                            }
                            c099fLIZIZ.LJIIZILJ(Unit.LIZ);
                            return;
                        }
                        EnumC2199071B4v enumC2199071B4v5 = EnumC2199071B4v.SCANNED;
                        if (Intrinsics.LJFF(str4, enumC2199071B4v5.getValue())) {
                            this.LLJI.put(str3, enumC2199071B4v5);
                            c099fLIZIZ.LJIIZILJ(Unit.LIZ);
                        } else {
                            this.LLJI.put(str3, EnumC2199071B4v.EMPTY);
                            if (atomicInteger.decrementAndGet() != 0) {
                                return;
                            }
                            c099fLIZIZ.LJIIZILJ(Unit.LIZ);
                        }
                    }
                }

                @Override // X.C0XH7
                public final void LJ(C0XGA c0xga, int i) {
                    String str4;
                    if (!c099fLIZIZ.isCompleted()) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            c099fLIZIZ.LJIIZILJ(Unit.LIZ);
                        }
                        if (i != -1005) {
                            EnumC2199071B4v enumC2199071B4v = EnumC2199071B4v.ERROR;
                            if (c0xga != null) {
                                str4 = c0xga.LJFF;
                            } else {
                                str4 = null;
                            }
                            enumC2199071B4v.setMsg(str4);
                            enumC2199071B4v.setErrorCode(Integer.valueOf(i));
                            this.LLJI.put(str3, enumC2199071B4v);
                        }
                    }
                }
            };
            if (this.LLIZLLLIL == null) {
                this.LLIZLLLIL = new ArrayList<>();
            }
            ArrayList<AbstractC846040XGw<? extends C0XGA>> arrayList = this.LLIZLLLIL;
            if (arrayList != null) {
                arrayList.add(abstractC1703720uR8);
            }
            C846070XGz c846070XGz = new C846070XGz();
            c846070XGz.LJ(zQ2(str, BaseQRCodeLoginViewModel.LLILZ), linkedHashMap);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            sbLIZ.append("/passport/mobile/check_qrconnect/");
            c846070XGz.LIZ = C2188811AlT.LIZIZ(sbLIZ);
            new C2199101B4y(this.LLJ, c846070XGz.LIZIZ(), abstractC1703720uR8).LJIIIZ();
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C2199041B4s(c099fLIZIZ, this, str, null), 2);
    }

    public final Map zQ2(String str, String str2) {
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

    public final void AQ2(int i, Integer num, long j) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "duration_ms");
        c2344009Gk.LIZJ(i, "status_code");
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "error_code");
        }
        C20684815ws.LJIILLIIL("qr_code_loading", c2344009Gk.LIZ);
    }
}
