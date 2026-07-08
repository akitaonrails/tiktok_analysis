package com.ss.android.ugc.aweme.share;

import X.C086I;
import X.C09OA;
import X.C09OB;
import X.C0DHG;
import X.C1233040iBy;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1402840mbq;
import X.C1599690rjL;
import X.C19719212De;
import X.C19EG;
import X.C1B46;
import X.C1B4F;
import X.C1B4P;
import X.C1B4Q;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2198841B3y;
import X.C23250099c;
import X.C2344809Gs;
import X.C580640Mpy;
import X.C632670Orh;
import X.C786410Ut5;
import X.C985403tE;
import X.InterfaceC1368700lim;
import X.InterfaceC20688615xU;
import Y.AObserverS229S0100000_27;
import Y.AObserverS236S0100000_34;
import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AwS42S2100000_19;
import kotlin.jvm.internal.AwS4S4100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public class SystemShareActivityViewModel extends ViewModel {
    public String LLILLJJLI;
    public String LLILLL;
    public List<? extends Uri> LLILZ;
    public boolean LLILZIL;
    public WeakReference<C19EG> LLJ;
    public C1402840mbq LLJI;
    public InterfaceC20688615xU LLJILJIL;
    public final MutableLiveData<Boolean> LL = new MutableLiveData<>();
    public final AObserverS236S0100000_34 LLILZLL = new AObserverS236S0100000_34(this, 14);
    public final CreativeInfo LLIZ = new CreativeInfo(null, 0, null, 7, null);
    public final C1B4P LLIZLLLIL = new C1B4P();
    public String LLJIJIL = "";
    public final AObserverS229S0100000_27 LLJILJILJ = new AObserverS229S0100000_27(this, 29);

    public final WeakReference<C19EG> vQ2() {
        WeakReference<C19EG> weakReference = this.LLJ;
        if (weakReference != null) {
            return weakReference;
        }
        return null;
    }

    public final void wQ2() {
        List<? extends Uri> list;
        Uri uri;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("intent action ");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        String str = this.LLILLJJLI;
        if (str == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!Intrinsics.LJFF(str, "android.intent.action.SEND")) {
            if (Intrinsics.LJFF(str, "android.intent.action.SEND_MULTIPLE")) {
                if (!C086I.LIZIZ(this.LLILZ)) {
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C09OA(this, null), 3);
                    return;
                }
                C2344809Gs.LJ("SystemShareActivity uriList is null, return");
                C1B46.LIZ.getClass();
                C1B46.LIZIZ();
                return;
            }
            return;
        }
        List<? extends Uri> list2 = this.LLILZ;
        if (list2 == null || list2.isEmpty() || (list = this.LLILZ) == null || (uri = (Uri) ListProtector.get(list, 0)) == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SystemShareActivity uri = ");
        sbLIZ2.append(uri);
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C09OB(this, uri, null), 3);
    }

    public final void xQ2(C1B4Q c1b4q) {
        boolean z;
        String str;
        String str2;
        C19EG c19eg;
        if (c1b4q.LIZIZ.LIZ == -12) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILZIL) {
            if (z) {
                zQ2("retry_dialog_pop_up_click_retry_failure");
            } else {
                zQ2("retry_dialog_pop_up_click_retry_success");
            }
        }
        if (z && !this.LLILZIL) {
            C19EG c19eg2 = vQ2().get();
            if (c19eg2 != null) {
                if (!c19eg2.isFinishing()) {
                    WeakReference<C19EG> weakReferenceVQ2 = vQ2();
                    if (weakReferenceVQ2 != null && (c19eg = weakReferenceVQ2.get()) != null) {
                        String string = c19eg.getString(2131846535);
                        String string2 = c19eg.getString(2131846533);
                        String string3 = c19eg.getString(2131846534);
                        String string4 = c19eg.getString(2131826417);
                        if (C0DHG.LIZ() && C1388190mED.LIZ(c19eg) != null) {
                            C632670Orh.LIZIZ(c19eg, new C19719212De(1450557599, new AwS4S4100000_19(string, string2, string3, this, string4, 0), true));
                        } else {
                            C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
                            c1397580mTM.LJI(string);
                            c1397580mTM.LIZIZ(string2);
                            c1397580mTM.LJII = false;
                            C985403tE.LIZ(c1397580mTM, new AwS42S2100000_19(string3, string4, this, 1));
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                    }
                    this.LLILZIL = true;
                }
                this.LLILZIL = true;
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C1402840mbq c1402840mbq = this.LLJI;
        if (c1402840mbq != null) {
            C2198841B3y c2198841B3y = C2198841B3y.LIZ;
            String strLIZJ = C580640Mpy.LIZJ(c1402840mbq);
            if (c1b4q.LIZ) {
                str = "success";
            } else {
                str = "fail";
            }
            C1B4F c1b4f = c1b4q.LIZIZ;
            String str3 = this.LLJIJIL;
            String sdkNameForServer = c1402840mbq.getSdkNameForServer();
            String str4 = c1402840mbq.mSdkVersion;
            int iLIZ = this.LLIZLLLIL.LIZ();
            int size = this.LLIZLLLIL.LIZIZ.size();
            Integer num = c1b4q.LIZLLL;
            if (c1402840mbq.isLinkShare) {
                str2 = "link_share";
            } else if (c1402840mbq.mClientKey != null) {
                str2 = "sdk";
            } else {
                str2 = "system_share";
            }
            c2198841B3y.getClass();
            C2198841B3y.LIZLLL(strLIZJ, str, c1b4f, str3, sdkNameForServer, str4, iLIZ, size, num, str2);
            if (c1b4q.LIZ) {
                return;
            }
            C19EG c19eg3 = vQ2().get();
            if (c19eg3 != null) {
                C19EG c19eg4 = c19eg3;
                C1233040iBy c1233040iBy = new C1233040iBy(C786410Ut5.P3(c19eg4));
                c1233040iBy.LIZJ(c19eg4.getString(c1b4q.LIZJ));
                c1233040iBy.LIZLLL();
                c19eg4.finish();
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void zQ2(String str) {
        String sdkNameForServer;
        String str2;
        C2198841B3y c2198841B3y = C2198841B3y.LIZ;
        String str3 = this.LLJIJIL;
        C1402840mbq c1402840mbq = this.LLJI;
        if (c1402840mbq == null || (sdkNameForServer = c1402840mbq.getSdkNameForServer()) == null) {
            sdkNameForServer = "";
        }
        C1402840mbq c1402840mbq2 = this.LLJI;
        if (c1402840mbq2 == null || (str2 = c1402840mbq2.mSdkVersion) == null) {
            str2 = "";
        }
        c2198841B3y.getClass();
        C2198841B3y.LJFF(str, str3, sdkNameForServer, str2, "");
    }

    public final void yQ2(WeakReference<C19EG> weakReference, C1402840mbq c1402840mbq, String str, String str2, List<? extends Uri> list, boolean z) {
        String str3;
        this.LLJ = weakReference;
        this.LLILLL = str;
        this.LLILLJJLI = str2;
        this.LLJI = c1402840mbq;
        if (c1402840mbq == null || (str3 = c1402840mbq.mClientKey) == null) {
            str3 = "";
        }
        this.LLJIJIL = str3;
        this.LLILZ = list;
        if (z) {
            IMSharePanelApi.LIZ.getClass();
            InterfaceC1368700lim interfaceC1368700limLJJJJIZL = C1599690rjL.LIZ().getShareService().LJJJJIZL();
            this.LLJILJIL = interfaceC1368700limLJJJJIZL;
            if (interfaceC1368700limLJJJJIZL == null) {
                interfaceC1368700limLJJJJIZL = null;
            }
            interfaceC1368700limLJJJJIZL.LJL();
        }
    }
}
