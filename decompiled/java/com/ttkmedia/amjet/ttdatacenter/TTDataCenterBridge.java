package com.ttkmedia.amjet.ttdatacenter;

import X.C0NBW;
import X.C0NBZ;
import X.C583930MvH;
import X.C583940MvI;
import X.C583950MvJ;
import X.C583960MvK;
import X.InterfaceC583260MuC;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ttkmedia.datacenter.api.DataCenter;
import com.ttkmedia.datacenter.api.DataCenterEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class TTDataCenterBridge implements C0NBZ {
    public C583950MvJ LIZ;
    public C583930MvH LIZIZ;
    public C583960MvK LIZJ;
    public final C583940MvI LIZLLL = new Object() { // from class: X.0MvI
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0MvK] */
    @Override // X.C0NBZ
    public final void LIZ() {
        if (this.LIZJ == null) {
            this.LIZJ = new DataCenterEvent() { // from class: X.0MvK
                @Override // com.ttkmedia.datacenter.api.DataCenterEvent
                public final void onEvent(int i, long j, long j2, String str) {
                    boolean z;
                    if (i == EnumC584320Mvu.DataCenterEventLiveFirstFrameRendered.getValue()) {
                        C582700MtI c582700MtI = new C582700MtI();
                        if (j == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c582700MtI.LIZ = z;
                        C0NBW.LIZIZ().LIZ(c582700MtI, "live_first_render");
                    }
                }
            };
            DataCenter.getInstance().addEventListener(this.LIZJ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0MvJ] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0MvH] */
    @Override // X.C0NBZ
    public final void LIZIZ(boolean z) {
        this.LIZ = new InterfaceC583260MuC() { // from class: X.0MvJ
            @Override // X.InterfaceC583260MuC
            public final List<String> LIZ() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("tiktok_update_current_aweme_id");
                return arrayList;
            }

            @Override // X.InterfaceC583260MuC
            public final void LIZIZ(Object obj, String str) {
                String string;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onReceive event key: ");
                sbLIZ.append(str);
                sbLIZ.append(" ,data ");
                if (obj != null) {
                    string = obj.toString();
                } else {
                    string = "";
                }
                sbLIZ.append(string);
                C2188811AlT.LIZIZ(sbLIZ);
                str.getClass();
                if (str.equals("tiktok_update_current_aweme_id")) {
                    DataCenter.getInstance().businessEvent(EnumC584320Mvu.DataCenterEventUpdateCurrentAwemeId.getValue(), (String) obj);
                }
            }
        };
        final C583940MvI c583940MvI = this.LIZLLL;
        this.LIZIZ = new InterfaceC583260MuC(c583940MvI) { // from class: X.0MvH
            public final C583940MvI LIZ;

            @Override // X.InterfaceC583260MuC
            public final List<String> LIZ() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("tiktok_update_current_aweme_id");
                return arrayList;
            }

            {
                this.LIZ = c583940MvI;
            }

            @Override // X.InterfaceC583260MuC
            public final void LIZIZ(Object obj, String str) {
                String string;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onReceive event key: ");
                sbLIZ.append(str);
                sbLIZ.append(" ,data ");
                if (obj != null) {
                    string = obj.toString();
                } else {
                    string = "";
                }
                sbLIZ.append(string);
                C2188811AlT.LIZIZ(sbLIZ);
                if ("tiktok_update_current_aweme_id".equals(str)) {
                    getClass();
                }
            }
        };
        C0NBW.LIZIZ().LIZLLL(this.LIZ);
        C0NBW.LIZIZ().LIZLLL(this.LIZIZ);
        if (!z) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                new BPEAThread(new Runnable() { // from class: X.0MvL
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TTDataCenterBridge@41f7.build$1");
                        try {
                            this.LL.LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TTDataCenterBridge@41f7.build$1");
                    }
                }).start();
            } else {
                LIZ();
            }
        }
    }
}
