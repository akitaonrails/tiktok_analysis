package com.ss.android.ugc.aweme.minis.page.main.functions.guide;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C08S3;
import X.C0PEM;
import X.C0QSJ;
import X.C0W09;
import X.C1057450dcl;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1331920klS;
import X.C13LE;
import X.C13LP;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1DFH;
import X.C20515215Pi;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2197011Ayh;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C604720Nni;
import X.C634990OvR;
import X.C635000OvS;
import X.C635030OvV;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1324510kZV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ACListenerS144S0100000_9;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import com.ss.android.ugc.aweme.minis.page.main.scope.MinisMainScope;
import com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MinisAddShortCutFloatingNoticeAssem extends AbstractC738140SxQ implements IMinisTimingProtocol, MinisShortCutSnackbarProtocol, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public C20515215Pi LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(212));
    public String LLILLL;
    public SmartImageView LLILZ;
    public boolean LLILZIL;
    public volatile InterfaceC1324510kZV LLILZLL;
    public InterfaceC665370Q7z LLIZ;
    public C0QSJ LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MinisAddShortCutFloatingNoticeAssem.class, "coreAbility", "getCoreAbility()Lcom/ss/android/ugc/aweme/minis/page/main/ability/MinisCoreAbility;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void LJJJJZI() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void Xm0() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void Ym1() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MinisMainScope.class});
    }

    public final InterfaceC1324510kZV fo() {
        InterfaceC1324510kZV interfaceC1324510kZV = this.LLILZLL;
        if (interfaceC1324510kZV == null) {
            synchronized (this) {
                interfaceC1324510kZV = this.LLILZLL;
                if (interfaceC1324510kZV == null) {
                    InterfaceC1324510kZV interfaceC1324510kZVM264do = m264do();
                    this.LLILZLL = interfaceC1324510kZVM264do;
                    return interfaceC1324510kZVM264do;
                }
            }
        }
        return interfaceC1324510kZV;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MinisMainScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void pw1() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void wB0() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void zd0() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void LJLLLLLL() {
        C20515215Pi c20515215Pi = this.LL;
        if (c20515215Pi != null) {
            c20515215Pi.LIZIZ();
        }
        this.LLILZIL = false;
        this.LL = null;
    }

    public final C1331730kl9 bo() {
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJI = new C1331920klS(C418440Gaw.LIZIZ(6), C418440Gaw.LIZIZ(6), C418440Gaw.LIZIZ(6), C418440Gaw.LIZIZ(6));
        return c1331750klB.LIZ();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final InterfaceC1324510kZV m264do() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLIZLLLIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLIZ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLIZ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MinisMainScope.class});
            this.LLIZLLLIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1324510kZV interfaceC1324510kZV = (InterfaceC1324510kZV) c0qsjLIZLLL.getAbility(InterfaceC1324510kZV.class);
        C687700QyG.LJ(interfaceC1324510kZV, InterfaceC1324510kZV.class);
        return interfaceC1324510kZV;
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void sZ1() {
        if (this.LL != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C604720Nni(this, null), 2);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IMinisTimingProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), MinisShortCutSnackbarProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.minis.page.main.functions.guide.MinisShortCutSnackbarProtocol
    public final void fr0(int i) {
        Context context;
        String enterFrom;
        String str;
        SchemaParserData schemaParserDataCl;
        String str2;
        String str3;
        TiktokMinisQueryParams tiktokMinisQueryParams;
        int iLIZIZ = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (context = getContext()) != null) {
            List<String> list = ((GameAddLauncherNoticeControl) this.LLILLJJLI.getValue()).entryBlist;
            SchemaParserData schemaParserDataCl2 = fo().Cl();
            if (schemaParserDataCl2 != null) {
                enterFrom = schemaParserDataCl2.getEnterFrom();
            } else {
                enterFrom = null;
            }
            if (!C13LP.LJJJJ(enterFrom, list) && !C0W09.LIZ()) {
                C635000OvS c635000OvS = C635000OvS.LIZ;
                SchemaParserData schemaParserDataCl3 = fo().Cl();
                if (schemaParserDataCl3 != null && (str = schemaParserDataCl3.clientKey) != null) {
                    c635000OvS.getClass();
                    if (((Keva) C635000OvS.LIZIZ.getValue()).getLong(C635000OvS.LIZ(str), -1L) > 0 && (schemaParserDataCl = fo().Cl()) != null && (str2 = schemaParserDataCl.clientKey) != null) {
                        C634990OvR.LIZ.getClass();
                        long j = C634990OvR.LIZ().getLong(C634990OvR.LIZIZ(str2, "last_display_time"), 0L);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                        long j3 = (jCurrentTimeMillis / j2) - j;
                        C01GW c01gw = C634990OvR.LIZJ;
                        if (j3 >= ((GameAddLauncherNoticeControl) c01gw.getValue()).interval) {
                            if ((System.currentTimeMillis() / j2) - C634990OvR.LIZ().getLong(C634990OvR.LIZIZ(str2, "last_exit_time"), 0L) >= ((GameAddLauncherNoticeControl) c01gw.getValue()).period) {
                                int i2 = 0;
                                if (C634990OvR.LIZ().getInt(C634990OvR.LIZIZ(str2, "show_time"), 0) < ((GameAddLauncherNoticeControl) c01gw.getValue()).times) {
                                    C2197011Ayh.LIZ.getClass();
                                    if (!C2197011Ayh.LIZ()) {
                                        C20515215Pi c20515215Pi = new C20515215Pi(fragmentLJI);
                                        c20515215Pi.LJI(new AwS375S0200000_9(this, context, 181));
                                        c20515215Pi.LIZ.LJIILLIIL = true;
                                        c20515215Pi.LJII(2131837291);
                                        String string = fragmentLJI.getString(2131837290);
                                        Object[] objArr = new Object[1];
                                        SchemaParserData schemaParserDataCl4 = fo().Cl();
                                        if (schemaParserDataCl4 == null || (tiktokMinisQueryParams = schemaParserDataCl4.tiktokMinisParams) == null || (str3 = tiktokMinisQueryParams.minisName) == null) {
                                            str3 = "";
                                        }
                                        objArr[0] = str3;
                                        c20515215Pi.LIZ.LJFF = C786410Ut5.j4(string, Arrays.copyOf(objArr, 1));
                                        c20515215Pi.LIZ(2131837289);
                                        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                                        c1057450dcl.LIZJ = false;
                                        c1057450dcl.LJIILL = true;
                                        c1057450dcl.LJIIJJI = new View.OnClickListener() { // from class: X.0OvU
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                            }
                                        };
                                        c1057450dcl.LJIIIZ = iLIZIZ;
                                        c1057450dcl.LJIILIIL = new ACListenerS144S0100000_9(this, 145);
                                        c1057450dcl.LJIILJJIL = AFwS240S0000000_9.get$arr$(999);
                                        this.LL = c20515215Pi;
                                        c20515215Pi.LIZLLL();
                                        int i3 = C634990OvR.LIZ().getInt(C634990OvR.LIZIZ(str2, "show_time"), 0) + 1;
                                        if (i3 >= ((GameAddLauncherNoticeControl) c01gw.getValue()).times) {
                                            C634990OvR.LIZ().storeLong(C634990OvR.LIZIZ(str2, "last_exit_time"), System.currentTimeMillis() / j2);
                                        } else {
                                            i2 = i3;
                                        }
                                        C634990OvR.LIZ().storeInt(C634990OvR.LIZIZ(str2, "show_time"), i2);
                                        C634990OvR.LIZ().storeLong(C634990OvR.LIZIZ(str2, "last_display_time"), System.currentTimeMillis() / j2);
                                        C635030OvV.LIZ.getClass();
                                        C08S3 c08s3 = C08S3.LIZ;
                                        Map mapLJ = C2097608Jq.LJ();
                                        c08s3.getClass();
                                        C08S3.LIZJ("tm_desktop_shortcut_snack_bar_show", mapLJ);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.minis.page.main.functions.guide.MinisShortCutSnackbarProtocol
    public final void oJ(String str) {
        if (str != null && str.length() != 0) {
            this.LLILLL = str;
            SmartImageView smartImageView = this.LLILZ;
            if (smartImageView != null && !this.LLILZIL) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJI = bo();
                c1331670kl3LJIIIZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
        }
    }
}
