package com.ss.android.ugc.aweme.share.business.config;

import X.C1369610lkF;
import X.EnumC1371620lnU;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371860lns;
import Y.AfS113S0300000_21;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.model.MultiShortenModel;
import com.ss.android.ugc.aweme.share.model.MultiShortenShareRequest;
import com.ss.android.ugc.aweme.share.model.ShareURLInfo;
import com.ss.android.ugc.aweme.share.model.TTNetErrorData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class AwemeChannelShareProtocol extends TTShareChannelProtocol {
    public final Context LLILLL;
    public final AwemeSharePackage LLILZ;
    public final Aweme LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final C1369610lkF LLIZLLLIL;
    public final Comparator<InterfaceC1369790lkX> LLJ;

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final List<InterfaceC1369790lkX> KB0() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public InterfaceC1371860lns LK0() {
        return new InterfaceC1371860lns() { // from class: X.0lsT
            @Override // X.InterfaceC1371860lns
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZIZ(BaseSharePackage baseSharePackage, List list) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                int num;
                long jLJIJJLI;
                Object c098200Yq;
                Integer numLJIIJJI;
                List listLL = list;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                Iterator it2 = listLL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((InterfaceC1369790lkX) it2.next()).key());
                }
                if (baseSharePackage instanceof AwemeSharePackage) {
                    AwemeSharePackage awemeSharePackage = (AwemeSharePackage) baseSharePackage;
                    if (C093100Wr.LIZ() && awemeSharePackage.LJIILJJIL()) {
                        Aweme awemeLJJIFFI = awemeSharePackage.LJJIFFI();
                        String string = awemeSharePackage.extras.getString("panel_source");
                        if ((awemeLJJIFFI != null && (awemeLJJIFFI.getAwemeType() == 150 || C729510SjV.LJJIJIL(awemeLJJIFFI) || C710930Rud.LJII(awemeLJJIFFI))) || !Intrinsics.LJFF(string, "share_panel")) {
                            return;
                        }
                        Aweme awemeLJJIFFI2 = awemeSharePackage.LJJIFFI();
                        if (!listLL.isEmpty()) {
                            C1374530lsB.LIZ.getClass();
                            if (C1374530lsB.LJI(awemeLJJIFFI2)) {
                                listLL = new ArrayList();
                            } else {
                                C1373850lr5.LIZ.getClass();
                                if (!C1373540lqa.LJ(awemeLJJIFFI2)) {
                                    listLL = new ArrayList();
                                } else {
                                    List listLL2 = C13LP.LL(listLL, ((Number) C262490AQl.LIZ.getValue()).intValue());
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj : listLL2) {
                                        InterfaceC1369790lkX interfaceC1369790lkX = (InterfaceC1369790lkX) obj;
                                        C1374530lsB.LIZ.getClass();
                                        if (C1374530lsB.LIZ(awemeLJJIFFI2, interfaceC1369790lkX) && !interfaceC1369790lkX.LIZJ()) {
                                            arrayList2.add(obj);
                                        }
                                    }
                                    listLL = C13LP.LL(arrayList2, ((Number) C262430AQf.LIZ.getValue()).intValue());
                                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                                    Iterator it3 = listLL.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(((InterfaceC1369790lkX) it3.next()).key());
                                    }
                                }
                            }
                        }
                        final ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                        Iterator it4 = listLL.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(((InterfaceC1369790lkX) it4.next()).key());
                        }
                        if (!(!arrayList4.isEmpty())) {
                            return;
                        }
                        final C1374740lsW c1374740lsWLJJII = awemeSharePackage.LJJII();
                        String str = baseSharePackage.itemType;
                        String str2 = baseSharePackage.url;
                        c1374740lsWLJJII.getClass();
                        boolean zLJI = MethodIDManager.LJI(137798);
                        c1374740lsWLJJII.LIZJ = arrayList4;
                        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                        Iterator it5 = arrayList4.iterator();
                        while (it5.hasNext()) {
                            String strLIZ = C1375910luP.LIZ(str, str2, (String) it5.next(), baseSharePackage);
                            if (strLIZ == null) {
                                strLIZ = str2;
                            }
                            arrayList5.add(strLIZ);
                        }
                        ArrayList<String> arrayList6 = new ArrayList(arrayList5);
                        EnumC1234280iDy enumC1234280iDyLJII = null;
                        if (!(!arrayList6.isEmpty()) || !C703302op.LIZ((String) ListProtector.get(arrayList6, 0))) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                        } else {
                            try {
                                c098200Yq = UriProtector.parse((String) arrayList6.get(0));
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            Uri uri = (Uri) c098200Yq;
                            if (uri != null && !uri.isOpaque() && !UriProtector.getQueryParameterNames(uri).isEmpty()) {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "invitation_scene");
                                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                                }
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "share_link_id");
                                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                                }
                                UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "share_item_id");
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "social_share_type");
                                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) != null) {
                                    enumC1234280iDyLJII = C1234220iDs.LJII(numLJIIJJI.intValue());
                                }
                            } else {
                                c1374740lsWLJJII.LIZIZ.onNext(new C1374630lsL(arrayList6));
                                if (!zLJI) {
                                    return;
                                }
                                MethodIDManager.LJ();
                                return;
                            }
                        }
                        C1375890luN.LIZ.getClass();
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() > 0 && enumC1234280iDyLJII != null) {
                            ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList6, 10));
                            for (String str3 : arrayList6) {
                                C1375890luN.LIZ.getClass();
                                String strLIZ2 = C1375890luN.LIZ(str3);
                                if (strLIZ2 == null) {
                                    strLIZ2 = "";
                                }
                                String strLIZIZ = C1375890luN.LIZIZ(strLIZ2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                                if (strLIZIZ == null) {
                                    strLIZIZ = "";
                                }
                                arrayList7.add(strLIZIZ);
                            }
                            arrayList6 = arrayList7;
                        }
                        final C259800zU c259800zU = new C259800zU();
                        c259800zU.element = "";
                        final C118300cf c118300cf = new C118300cf();
                        c1374740lsWLJJII.LJ = System.currentTimeMillis();
                        c1374740lsWLJJII.LJFF = System.currentTimeMillis();
                        final C118300cf c118300cf2 = new C118300cf();
                        C1375890luN.LIZ.getClass();
                        if (TextUtils.equals("web", str)) {
                            num = EnumC1373410lqN.SHARE_JSB_WEB.getNum();
                        } else {
                            if (!arrayList6.isEmpty()) {
                                str2 = (String) ListProtector.get(arrayList6, 0);
                            }
                            num = C1375890luN.LIZLLL(str, str2).getNum();
                        }
                        c118300cf2.element = num;
                        Iterator it6 = arrayList4.iterator();
                        Iterator it7 = arrayList6.iterator();
                        ArrayList arrayList8 = new ArrayList(Math.min(C15438062q.LJIJJ(arrayList4, 10), C15438062q.LJIJJ(arrayList6, 10)));
                        while (it6.hasNext() && it7.hasNext()) {
                            arrayList8.add(new ShareURLInfo((String) it6.next(), (String) it7.next()));
                        }
                        C313250CPr c313250CPr = C313250CPr.LIZ;
                        int i = c118300cf2.element;
                        c313250CPr.getClass();
                        AbstractC19483511Kn<MultiShortenModel> preShareLinkShortenUrl = C313250CPr.LIZIZ.getPreShareLinkShortenUrl(new MultiShortenShareRequest(i, arrayList8));
                        try {
                            jLJIJJLI = C0C64.LJIILLIIL().LJIJJLI(31744, 3000L, "shorten_network_timeout_experiment", true);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            jLJIJJLI = 3000;
                        }
                        final ArrayList arrayList9 = arrayList6;
                        ((C11NJ) c1374740lsWLJJII.LIZ.getValue()).LIZ(preShareLinkShortenUrl.LJIJJLI(jLJIJJLI, TimeUnit.MILLISECONDS, new C11IG(new TimeoutException("Timeout!"))).LJIJJ(C11S5.LIZ()).LJFF(new InterfaceC781210Ukh() { // from class: X.0lsR
                            @Override // X.InterfaceC781210Ukh
                            public final void run() {
                                C01GW c01gw = C1367480lgo.LIZ;
                                C1374740lsW c1374740lsW = c1374740lsWLJJII;
                                long j = c1374740lsW.LJFF - c1374740lsW.LJ;
                                String string2 = arrayList4.toString();
                                int i2 = c118300cf2.element;
                                int i3 = c118300cf.element;
                                String str4 = c259800zU.element;
                                List<String> list2 = c1374740lsWLJJII.LIZLLL;
                                ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                                for (String str5 : list2) {
                                    C1375890luN.LIZ.getClass();
                                    arrayList10.add(Integer.valueOf(C1375890luN.LIZJ(str5)));
                                }
                                C1367480lgo.LIZ(i2, i3, 1, j, string2, str4, arrayList10);
                            }
                        }).LJIIZILJ(new AfS113S0300000_21(c1374740lsWLJJII, c259800zU, arrayList8, 0), new C09JN() { // from class: X.0lsV
                            @Override // X.C09JN
                            public final void accept(Object obj2) {
                                String string2;
                                Throwable cause;
                                int i2;
                                C1C7U.LIZ("UrlShorterViewModel@545e.fetchMultiShortenApiData$3");
                                Throwable th3 = (Throwable) obj2;
                                c1374740lsWLJJII.LJFF = System.currentTimeMillis();
                                C259800zU<String> c259800zU2 = c259800zU;
                                Gson gson = C7740030o.LIZ().getGson();
                                C1375890luN.LIZ.getClass();
                                if (th3 instanceof TimeoutException) {
                                    string2 = "timeout";
                                } else if (th3 == null || (cause = th3.getCause()) == null || (string2 = cause.toString()) == null) {
                                    string2 = "";
                                }
                                c259800zU2.element = (T) GsonProtectorUtils.toJson(gson, new TTNetErrorData(string2, th3.getMessage()));
                                c1374740lsWLJJII.LIZLLL = arrayList9;
                                C118300cf c118300cf3 = c118300cf;
                                if (th3 instanceof TimeoutException) {
                                    i2 = 2;
                                } else {
                                    i2 = 1;
                                }
                                c118300cf3.element = i2;
                                C01GW c01gw = C1357680lR0.LIZ;
                                if (C1357680lR0.LIZ(c118300cf2.element)) {
                                    C1374740lsW c1374740lsW = c1374740lsWLJJII;
                                    List<String> list2 = c1374740lsW.LIZLLL;
                                    ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                                    Iterator<String> it8 = list2.iterator();
                                    while (it8.hasNext()) {
                                        it8.next();
                                        arrayList10.add("");
                                    }
                                    c1374740lsW.LIZLLL = arrayList10;
                                    C1374740lsW c1374740lsW2 = c1374740lsWLJJII;
                                    c1374740lsW2.LIZIZ.onNext(new C1374630lsL(c1374740lsW2.LIZLLL));
                                } else {
                                    C1374740lsW c1374740lsW3 = c1374740lsWLJJII;
                                    c1374740lsW3.LIZIZ.onNext(new C1374630lsL(c1374740lsW3.LIZLLL));
                                }
                                C1C7U.LIZIZ("UrlShorterViewModel@545e.fetchMultiShortenApiData$3");
                            }
                        }));
                        if (!zLJI) {
                            return;
                        }
                        MethodIDManager.LJ();
                    }
                }
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                if (baseSharePackage instanceof AwemeSharePackage) {
                    ((C11NJ) ((AwemeSharePackage) baseSharePackage).LJJII().LIZ.getValue()).LJ();
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final EnumC1371620lnU xc0() {
        return Intrinsics.LJFF(this.LLIZ, "share_panel") ? EnumC1371620lnU.USE_CACHE : EnumC1371620lnU.SYNC;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public Comparator<InterfaceC1369790lkX> Pz0() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final C1369610lkF getUiConfig() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AwemeChannelShareProtocol(android.content.Context r12, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r13) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.business.config.AwemeChannelShareProtocol.<init>(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
    }
}
