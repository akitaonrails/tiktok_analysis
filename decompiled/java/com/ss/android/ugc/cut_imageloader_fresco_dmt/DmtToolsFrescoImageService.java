package com.ss.android.ugc.cut_imageloader_fresco_dmt;

import X.AbstractC1327750kej;
import X.BinderC1322940kWy;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1322930kWx;
import X.C1323050kX9;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class DmtToolsFrescoImageService extends Service {
    public BinderC1322940kWy LL;

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        BinderC1322940kWy binderC1322940kWy = this.LL;
        if (binderC1322940kWy != null) {
            Iterator it2 = ((LinkedHashMap) binderC1322940kWy.LLILLJJLI).entrySet().iterator();
            while (it2.hasNext()) {
                C1322930kWx c1322930kWx = (C1322930kWx) ((Map.Entry) it2.next()).getValue();
                C1323050kX9<AbstractC1327750kej> c1323050kX9 = c1322930kWx.LJFF;
                if (c1323050kX9 != null) {
                    C1323050kX9.LJII(c1323050kX9);
                }
                c1322930kWx.LJFF = null;
                c1322930kWx.LIZJ.clear();
                c1322930kWx.LIZLLL.close();
            }
            ((LinkedHashMap) binderC1322940kWy.LLILLJJLI).clear();
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/cut_imageloader_fresco_dmt/DmtToolsFrescoImageService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFg6a+uvZpPB3TaE8MTybe+BgBgLUj9q3RlhfqVzLi5LQbJMHJ+rMpST6n6xugx8Gyep", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        if (this.LL == null) {
            this.LL = new BinderC1322940kWy();
        }
        return this.LL;
    }
}
