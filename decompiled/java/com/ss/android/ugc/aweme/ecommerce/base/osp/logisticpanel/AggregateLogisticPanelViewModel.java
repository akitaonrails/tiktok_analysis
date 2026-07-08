package com.ss.android.ugc.aweme.ecommerce.base.osp.logisticpanel;

import X.C03J2;
import X.C03J3;
import X.C03J4;
import X.C03J5;
import X.C098200Yq;
import X.C0OM1;
import X.C123100dR;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1388190mED;
import X.C1390920mIc;
import X.C140100gB;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C189200o6;
import X.C19EG;
import X.C2188811AlT;
import X.C7971039l;
import X.C808003Dq;
import X.C821703Ix;
import X.C903803g4;
import X.C919503ib;
import X.C960603pE;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AggregateLogisticPanelViewModel extends AssemViewModel<C03J2> {
    public final ReentrantLock LL = new ReentrantLock();
    public boolean LLILLJJLI = true;
    public C821703Ix LLILLL;
    public List<InterfaceC1891350zJl> LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C03J2(0);
    }

    public final List<InterfaceC1891350zJl> vQ2() {
        ReentrantLock reentrantLock = this.LL;
        reentrantLock.lock();
        try {
            List<InterfaceC1891350zJl> list = this.LLILZ;
            reentrantLock.unlock();
            return list;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public AggregateLogisticPanelViewModel() {
        new HashMap();
        this.LLILZ = new ArrayList();
    }

    public final void xQ2(C03J5 c03j5) {
        String str;
        String str2;
        String str3;
        int i = c03j5.LJI;
        LogisticDTO logisticDTO = c03j5.LIZIZ;
        if (logisticDTO != null) {
            str = logisticDTO.logisticsServiceId;
        } else {
            str = null;
        }
        if (i >= 0 && str != null) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : vQ2()) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                    if (i2 == i) {
                        if (interfaceC1891350zJl2 instanceof C03J4) {
                            C03J4 c03j4 = (C03J4) interfaceC1891350zJl2;
                            ArrayList arrayList2 = new ArrayList();
                            for (C03J5 c03j52 : c03j4.LL) {
                                LogisticDTO logisticDTO2 = c03j52.LIZIZ;
                                if (logisticDTO2 != null) {
                                    str3 = logisticDTO2.logisticsServiceId;
                                } else {
                                    str3 = null;
                                }
                                arrayList2.add(C03J5.LIZ(c03j52, Intrinsics.LJFF(str3, str)));
                            }
                            arrayList.add(new C03J4(arrayList2, c03j4.LLILLJJLI));
                        } else if (interfaceC1891350zJl2 instanceof C03J3) {
                            C03J3 c03j3 = (C03J3) interfaceC1891350zJl2;
                            ArrayList arrayList3 = new ArrayList();
                            for (C03J5 c03j53 : c03j3.LL) {
                                LogisticDTO logisticDTO3 = c03j53.LIZIZ;
                                if (logisticDTO3 != null) {
                                    str2 = logisticDTO3.logisticsServiceId;
                                } else {
                                    str2 = null;
                                }
                                arrayList3.add(C03J5.LIZ(c03j53, Intrinsics.LJFF(str2, str)));
                            }
                            arrayList.add(new C03J3(arrayList3, c03j3.LLILLJJLI));
                        }
                    } else {
                        arrayList.add(interfaceC1891350zJl2);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            yQ2(arrayList);
        }
    }

    public final void yQ2(List<InterfaceC1891350zJl> list) {
        String strLJIIIIZZ;
        ReentrantLock reentrantLock = this.LL;
        reentrantLock.lock();
        try {
            this.LLILZ = list;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enterData = ");
            C821703Ix c821703Ix = this.LLILLL;
            if (c821703Ix != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(c821703Ix);
            } else {
                strLJIIIIZZ = null;
            }
            sbLIZ.append(strLJIIIIZZ);
            C2188811AlT.LIZIZ(sbLIZ);
            setState(new AwS580S0100000_1(this, 94));
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void zQ2(Context context, LogisticsDescription logisticsDescription, String str) {
        FragmentManager supportFragmentManager;
        boolean z;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            if (logisticsDescription.appendixTemplate != null) {
                z = true;
            } else {
                z = false;
            }
            C7971039l c7971039lLIZIZ = C808003Dq.LIZIZ(context, logisticsDescription, Boolean.valueOf(z));
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIII = c7971039lLIZIZ;
            c1390920mIc.LJIIIIZZ(0);
            c1390920mIc.LIZ.LLJJIJIIJIL = true;
            C0OM1 c0om1 = new C0OM1();
            c0om1.LIZLLL = true;
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = str;
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS545S0100000_1(c7971039lLIZIZ, 145));
            c0om1.LIZIZ(c1251150ifB);
            c0om1.LIZLLL = true;
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIL = c0om1;
            tuxSheet.LLJJJ = null;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.show(supportFragmentManager, "next_day_delivery");
        }
    }

    public static void wQ2(View view, String str, LogisticsDescription logisticsDescription, LogisticDTO logisticDTO) {
        String strLIZ;
        Context context;
        try {
            if (C123100dR.LIZ(str)) {
                Uri uri = UriProtector.parse(str);
                String scheme = uri.getScheme();
                String str2 = "";
                if (scheme == null) {
                    scheme = "";
                }
                String host = uri.getHost();
                if (host == null) {
                    host = "";
                }
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "type");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
                if (!Intrinsics.LJFF(scheme, "ec_action://") && !Intrinsics.LJFF(host, "ec")) {
                    if (((Boolean) C140100gB.LIZ.getValue()).booleanValue() && (context = view.getContext()) != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String strLIZLLL = C960603pE.LIZLLL(view);
                        if (strLIZLLL != null) {
                            linkedHashMap.put("intro_sheet_node_id", strLIZLLL);
                        }
                        C919503ib.LIZIZ(context, str, linkedHashMap, false).open();
                        return;
                    }
                    return;
                }
                if (logisticDTO == null || (strLIZ = logisticDTO.deliveryName) == null) {
                    C903803g4.LIZ.getClass();
                    strLIZ = C903803g4.LIZ();
                }
                if (Intrinsics.LJFF(path, "/popup")) {
                    if (Intrinsics.LJFF(str2, "next_day_delivery")) {
                        if (logisticsDescription != null) {
                            zQ2(view.getContext(), logisticsDescription, strLIZ);
                        }
                    } else if (Intrinsics.LJFF(str2, "3_day_delivery") && logisticsDescription != null) {
                        zQ2(view.getContext(), logisticsDescription, strLIZ);
                    }
                } else {
                    Context context2 = view.getContext();
                    if (context2 != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("intro_sheet_node_id", C960603pE.LIZLLL(view));
                        C919503ib.LIZIZ(context2, str, linkedHashMap2, false).open();
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
