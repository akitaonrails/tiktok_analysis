package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.vm;

import X.C01GW;
import X.C06L6;
import X.C09JN;
import X.C09YA;
import X.C0JK8;
import X.C0JKM;
import X.C0JKS;
import X.C0JKW;
import X.C0JKX;
import X.C0JKY;
import X.C11JN;
import X.C1323820kYO;
import X.C1548820qPI;
import X.C1554960qZC;
import X.C2436109gd;
import X.C397901gf;
import X.C452501pT;
import X.C494680Jac;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.vm.SubManagementPageVM;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class SubManagementPageVM extends AssemViewModel<C06L6> implements C0JK8 {
    public InterfaceC665370Q7z LL;
    public C0JKW LLILLL;
    public final C09YA LLILLJJLI = new C09YA(this, new C0JKX());
    public final C01GW LLILZ = C452501pT.LIZIZ(new C0JKS(this));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C06L6(null, null);
    }

    public final C0JKW wQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            C0JKW c0jkw = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0JKW.class, null)) != null) {
                c0jkw = (C0JKW) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLL = c0jkw;
        }
        return this.LLILLL;
    }

    public final void xQ2() throws JSONException {
        Integer num;
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "ON_SUB_MANAGEMENT_SHOW"));
        boolean zLIZJ = C494680Jac.LIZJ();
        C0JKW c0jkwWQ2 = wQ2();
        if (c0jkwWQ2 == null || (num = c0jkwWQ2.LLILZIL) == null || num.intValue() != zLIZJ) {
            C0JKW c0jkwWQ22 = wQ2();
            if (c0jkwWQ22 != null) {
                c0jkwWQ22.LLILZIL = Integer.valueOf(zLIZJ ? 1 : 0);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sub_only_live", zLIZJ ? 1 : 0);
            C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "ON_SUB_ONLY_LIVE_SETTINGS_UPDATE"));
        }
    }

    public static void vQ2(final SubManagementPageVM subManagementPageVM) {
        String str;
        int i;
        C0JKY c0jky = (C0JKY) subManagementPageVM.LLILLJJLI.getValue().getOperator();
        C0JKW c0jkwWQ2 = subManagementPageVM.wQ2();
        if (c0jkwWQ2 == null || (str = c0jkwWQ2.LLILLJJLI) == null) {
            str = "";
        }
        C0JKW c0jkwWQ22 = subManagementPageVM.wQ2();
        if (c0jkwWQ22 != null) {
            i = c0jkwWQ22.LL;
        } else {
            i = 0;
        }
        C11JN c11jnLLILL = c0jky.LLILL(i, str);
        if (c11jnLLILL != null) {
            final Function1 function1 = null;
            c11jnLLILL.LJJLL(new C09JN() { // from class: X.0JKU
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubManagementPageVM@d9e9.fetchData$1");
                    GetSubInfoResponse getSubInfoResponse = (GetSubInfoResponse) obj;
                    C0JKW c0jkwWQ23 = this.LL.wQ2();
                    if (c0jkwWQ23 != null) {
                        c0jkwWQ23.LLILZ = getSubInfoResponse;
                    }
                    Function1<GetSubInfoResponse, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(getSubInfoResponse);
                    }
                    this.LL.setState(new C06L7());
                    C1C7U.LIZIZ("SubManagementPageVM@d9e9.fetchData$1");
                }
            }, new C09JN(subManagementPageVM) { // from class: X.06L9
                public final /* synthetic */ SubManagementPageVM LLILLJJLI;

                {
                    this.LLILLJJLI = subManagementPageVM;
                }

                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubManagementPageVM@d9e9.fetchData$2");
                    Function1<Throwable, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(obj);
                    }
                    this.LLILLJJLI.setState(new C06L8());
                    C1C7U.LIZIZ("SubManagementPageVM@d9e9.fetchData$2");
                }
            });
        }
    }

    @Override // X.C0JK8
    public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
        Object next;
        Uri uri = c2436109gd.LIZ;
        if (uri == null) {
            return false;
        }
        Iterator it2 = ((List) this.LLILZ.getValue()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C0JKM) next).m3(uri.getPath())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0JK8 c0jk8 = (C0JK8) next;
        if (c0jk8 == null) {
            return false;
        }
        return c0jk8.nd(context, c2436109gd, map);
    }
}
