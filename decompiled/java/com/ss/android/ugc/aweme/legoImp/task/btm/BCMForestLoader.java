package com.ss.android.ugc.aweme.legoImp.task.btm;

import X.C01GW;
import X.C0CCZ;
import X.C0VZ0;
import X.C1223604qY;
import X.C1223704qZ;
import X.C1530400pva;
import X.C1533790q13;
import X.C1533910q1F;
import X.C18A3;
import X.C452501pT;
import X.C799890VZj;
import X.C799900VZk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1530410pvb;
import android.content.Context;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import java.io.InputStream;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class BCMForestLoader implements C18A3 {
    public final String LIZ;
    public final JSONObject LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1223604qY());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1223704qZ());
    public final C01GW LJ = C452501pT.LIZIZ(new C1530400pva(this));

    @Override // X.C18A3
    public final JSONObject getDefault() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C18A3
    public final void LIZ(final InterfaceC1530410pvb interfaceC1530410pvb) {
        final RequestParams requestParams = new RequestParams(null, 1, 0 == true ? 1 : 0);
        requestParams.accessKey = (String) this.LIZLLL.getValue();
        requestParams.channel = this.LIZ;
        requestParams.bundle = "bcm_check_conf.json";
        requestParams.disableCdn = true;
        requestParams.onlyLocal = true;
        requestParams.waitGeckoUpdate = true;
        requestParams.disableBuiltin = true;
        requestParams.enableCDNCache = Boolean.FALSE;
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(new C0CCZ() { // from class: com.ss.android.ugc.aweme.legoImp.task.btm.BCMForestLoader$fetchResourceAsync$1
            @Override // X.InterfaceC800080Va2
            public final /* synthetic */ List finalizedBy() {
                return null;
            }

            @Override // X.InterfaceC800080Va2
            public final String key() {
                return "BCMForestLoader$fetchResourceAsync$1";
            }

            @Override // X.InterfaceC800080Va2
            public final /* synthetic */ boolean meetTrigger() {
                return true;
            }

            @Override // X.C0CCZ
            public final /* synthetic */ boolean serialExecute() {
                return false;
            }

            @Override // X.InterfaceC800080Va2
            public final /* synthetic */ int targetProcess() {
                return C0VZ0.LIZ();
            }

            @Override // X.InterfaceC800080Va2
            public final /* synthetic */ EnumC799980VZs triggerType() {
                return C0VZ0.LIZIZ(this);
            }

            @Override // X.C0CCZ
            public final EnumC799870VZh type() {
                return EnumC799870VZh.BOOT_FINISH;
            }

            @Override // X.InterfaceC308150C6b
            public final void run(Context context) {
                C1533790q13 c1533790q13LIZIZ;
                String str = "";
                C1533910q1F c1533910q1FCreateSyncRequest = ((Forest) this.LL.LJ.getValue()).createSyncRequest("", requestParams);
                InputStream inputStreamLJIIJJI = null;
                if (c1533910q1FCreateSyncRequest != null) {
                    c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ();
                } else {
                    c1533790q13LIZIZ = null;
                }
                InterfaceC1530410pvb interfaceC1530410pvb2 = interfaceC1530410pvb;
                if (c1533790q13LIZIZ != null) {
                    inputStreamLJIIJJI = c1533790q13LIZIZ.LJIIJJI(false);
                    String string = Long.valueOf(c1533790q13LIZIZ.LJIIIZ).toString();
                    if (string != null) {
                        str = string;
                    }
                }
                interfaceC1530410pvb2.LIZ(inputStreamLJIIJJI, str);
            }
        });
        c799890VZj.LIZIZ();
    }

    public BCMForestLoader(String str, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
    }
}
