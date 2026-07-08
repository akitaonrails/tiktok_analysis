package com.bytedance.ies.im.core.global.action;

import X.C01GW;
import X.C300810Bqh;
import X.C452501pT;
import X.C883460YlE;
import X.C897870ZKf;
import X.C897890ZKh;
import X.C897900ZKi;
import X.C897910ZKj;
import X.C897920ZKk;
import X.C897930ZKl;
import X.C897940ZKm;
import X.C897950ZKn;
import X.C897960ZKo;
import X.EnumC883280Ykw;
import com.bytedance.ies.im.core.api.service.IGlobalActionExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes15.dex */
public final class GlobalActionExecutor implements IGlobalActionExecutor {
    public static final GlobalActionExecutor LL = new GlobalActionExecutor();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C897910ZKj());
    public static final C01GW LLILLL = C452501pT.LIZIZ(new C897930ZKl());
    public static final C01GW LLILZ = C452501pT.LIZIZ(new C897950ZKn());
    public static final C01GW LLILZIL = C452501pT.LIZIZ(new C897940ZKm());
    public static final C01GW LLILZLL = C452501pT.LIZIZ(new C897920ZKk());
    public static final C01GW LLIZ = C452501pT.LIZIZ(new C897960ZKo());

    public static final class Service implements IGlobalActionExecutor {
        public final /* synthetic */ GlobalActionExecutor LL = GlobalActionExecutor.LL;

        @Override // com.bytedance.ies.im.core.api.service.IGlobalActionExecutor
        public final void LIZLLL() {
            this.LL.LIZLLL();
        }

        @Override // com.bytedance.ies.im.core.api.service.IGlobalActionExecutor
        public final void LJ(String str) {
            this.LL.LJ(str);
        }

        @Override // X.InterfaceC883330Yl1
        public final void LJII(EnumC883280Ykw enumC883280Ykw, C883460YlE c883460YlE) {
            this.LL.LJII(enumC883280Ykw, c883460YlE);
        }
    }

    @Override // com.bytedance.ies.im.core.api.service.IGlobalActionExecutor
    public final void LIZLLL() {
        Iterator it2 = ((ArrayList) ((C897870ZKf) LLILLL.getValue()).LIZIZ()).iterator();
        while (it2.hasNext()) {
            ((C897900ZKi) it2.next()).LIZ.invoke();
        }
    }

    @Override // com.bytedance.ies.im.core.api.service.IGlobalActionExecutor
    public final void LJ(String str) {
        Iterator it2 = ((ArrayList) ((C897870ZKf) LLIZ.getValue()).LIZIZ()).iterator();
        while (it2.hasNext()) {
            ((C897890ZKh) it2.next()).LIZ.invoke(str);
        }
    }

    @Override // X.InterfaceC883330Yl1
    public final void LJII(EnumC883280Ykw enumC883280Ykw, C883460YlE c883460YlE) {
        if (C300810Bqh.LIZ() && enumC883280Ykw == EnumC883280Ykw.LOGIN) {
            Iterator it2 = ((ArrayList) ((C897870ZKf) LLILZIL.getValue()).LIZIZ()).iterator();
            while (it2.hasNext()) {
                ((C897900ZKi) it2.next()).LIZ.invoke();
            }
        }
    }
}
