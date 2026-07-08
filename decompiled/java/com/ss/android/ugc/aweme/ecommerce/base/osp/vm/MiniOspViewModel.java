package com.ss.android.ugc.aweme.ecommerce.base.osp.vm;

import X.AnonymousClass0378;
import X.C01GW;
import X.C038N;
import X.C03DI;
import X.C03H3;
import X.C03JV;
import X.C03KV;
import X.C03M1;
import X.C03N3;
import X.C03N4;
import X.C03O0;
import X.C03O1;
import X.C03OF;
import X.C03OM;
import X.C03OS;
import X.C03P2;
import X.C03PC;
import X.C03PI;
import X.C03PJ;
import X.C03SE;
import X.C03WX;
import X.C0C64;
import X.C0PEM;
import X.C11JF;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C14EU;
import X.C15438062q;
import X.C1697810uHb;
import X.C1713070ugD;
import X.C1741890vQh;
import X.C178200mK;
import X.C1AF0;
import X.C1DFH;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C23271099x;
import X.C2341109Fh;
import X.C452501pT;
import X.C720302rZ;
import X.C737802uO;
import X.C770702zh;
import X.C7727030b;
import X.C7806033c;
import X.C786410Ut5;
import X.C7873035r;
import X.C7879035x;
import X.C817503Hh;
import X.C817603Hi;
import X.C824603Ka;
import X.C834103Nr;
import X.C836703Or;
import X.C839403Ps;
import X.C840103Pz;
import X.C855703Vz;
import X.C899503fN;
import X.C921903iz;
import X.C948503nH;
import X.C957303oh;
import X.C987803tc;
import X.EnumC969503qf;
import X.InterfaceC0148002o;
import X.InterfaceC1164530gPT;
import X.InterfaceC828903Lr;
import Y.ARunnableS101S0100000_1;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoReqInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderSubmitRefreshEventParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OspScene;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS150S1100000_1;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS1S2400000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS5S1500000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public final class MiniOspViewModel extends AssemViewModel<C03JV> implements InterfaceC1164530gPT, InterfaceC828903Lr {
    public static final C01GW<Keva> LLLLLLL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(100));
    public int LL;
    public boolean LLILLJJLI;
    public List<OrderShopDigest> LLILLL;
    public String LLILZ;
    public OrderSubmitRequestParam LLILZIL;
    public BillInfoData LLIZ;
    public ExceptionUX LLIZLLLIL;
    public boolean LLJI;
    public PaymentInfo LLJIJIL;
    public boolean LLJILJIL;
    public Boolean LLJJ;
    public Boolean LLJJI;
    public boolean LLJJIII;
    public long LLJJIJIL;
    public boolean LLJJJIL;
    public C03WX LLJJL;
    public List<String> LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJLIL;
    public C03H3 LLJLILLLLZIIL;
    public String LLJLL;
    public boolean LLJZ;
    public List<String> LLJZIJLIL;
    public boolean LLLF;
    public ModuleManager LLLFFI;
    public final boolean LLLFZ;
    public IdentityInfo LLLI;
    public final C03PJ LLLII;
    public final AtomicBoolean LLLIIII;
    public String LLLIIIIL;
    public String LLLIIIL;
    public final long LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public boolean LLLILZ;
    public Integer LLLILZJ;
    public String LLLILZLLLI;
    public BillInfoRequest LLLIZZ;
    public final C7873035r LLLJ;
    public String LLLJIL;
    public String LLLJL;
    public C11JF LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public String LLLLIIL;
    public boolean LLLLIILL;
    public volatile int LLLLIILLL;
    public boolean LLLLIL;
    public int LLLLILI;
    public boolean LLLLJ;
    public Long LLLLJI;
    public String LLLLL;
    public boolean LLLLLIL;
    public int LLLLLILLIL;
    public int LLLLLJIL;
    public int LLLLLJLJLL;
    public int LLLLLL;
    public int LLLLLLIL;
    public final Map<String, BindInfoItem> LLLLLLJ;
    public final C03O1 LLILZLL = new C03O1();
    public String LLJ = "";
    public final CopyOnWriteArrayList<PaymentMethod> LLJILJILJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<PaymentMethod> LLJILLL = new CopyOnWriteArrayList<>();
    public String LLJJIJI = "";
    public String LLJJIJIIJIL = "";
    public final String LLJJJ = UUID.randomUUID().toString();
    public HashMap<String, Object> LLJJJJ = new HashMap<>();
    public final HashMap<String, Object> LLJJJJJIL = new HashMap<>();
    public String LLJJJJLIIL = "default_repo_id";
    public String LLJLLIL = "";
    public volatile boolean LLJLLL = true;
    public int LLL = C03N3.NATIVE_SCENE.getValue();
    public final C817603Hi LLLFF = new C817603Hi();

    public final boolean DQ2() {
        Integer num;
        ExceptionUX exceptionUX = this.LLIZLLLIL;
        boolean z = false;
        if (exceptionUX != null && (num = exceptionUX.exceptionUXType) != null && num.intValue() == 14) {
            z = true;
        }
        return !z;
    }

    public final HashMap<String, Object> KQ2() {
        return C7806033c.LJ(this.LLIZ);
    }

    public final String MQ2() {
        int i = this.LL;
        if (i == 0 || i == 2) {
            return "-1";
        }
        ArrayList arrayList = new ArrayList();
        List<OrderShopDigest> list = this.LLILLL;
        if (list != null) {
            Iterator<OrderShopDigest> it2 = list.iterator();
            while (it2.hasNext()) {
                List<OrderSKUDTO> list2 = it2.next().orderSKUs;
                if (list2 != null) {
                    Iterator<OrderSKUDTO> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        String str = it3.next().cartItemId;
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        return arrayList.isEmpty() ? "" : C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    public final Map<String, String> NQ2() {
        List<ShopOrderNew> list;
        List<String> urls;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BillInfoData billInfoData = this.LLIZ;
        if (billInfoData != null && (list = billInfoData.newShopOrders) != null) {
            Iterator<ShopOrderNew> it2 = list.iterator();
            while (it2.hasNext()) {
                List<MainOrderInfo> list2 = it2.next().mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        List<PackedSku> list3 = it3.next().packedSkus;
                        if (list3 != null) {
                            for (PackedSku packedSku : list3) {
                                String str = packedSku.skuId;
                                Image image = packedSku.image;
                                String str2 = (image == null || (urls = image.getUrls()) == null) ? null : (String) C13LP.LJJJLL(urls);
                                if (str != null && C123100dR.LIZ(str2)) {
                                    linkedHashMap.put(str, str2);
                                }
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public final C03PC PQ2() {
        return (C03PC) this.LLLIL.getValue();
    }

    public final void UQ2() {
        String str;
        ModuleManager moduleManager = new ModuleManager();
        this.LLLFFI = moduleManager;
        moduleManager.LJJII = EnumC969503qf.DEFAULT.getTemplate();
        moduleManager.LJJIJIIJI = "mini_checkout";
        ModuleManager moduleManager2 = this.LLLFFI;
        if (moduleManager2 != null) {
            HashMap<String, Object> map = this.LLJJJJ;
            Object obj = map != null ? map.get("previous_page") : null;
            if (!(obj instanceof String) || (str = (String) obj) == null) {
                str = "";
            }
            moduleManager2.LJJIIJ = str;
        }
        BillInfoData billInfoData = this.LLIZ;
        if (billInfoData != null) {
            Integer numLJ = C839403Ps.LJ(billInfoData);
            String strLIZIZ = C839403Ps.LIZIZ(billInfoData);
            HashMap<String, Object> map2 = this.LLJJJJ;
            if (map2 != null) {
                if (numLJ == null || map2.put("biz_type", Integer.valueOf(numLJ.intValue())) == null) {
                    map2.remove("biz_type");
                }
                map2.put("product_id", strLIZIZ);
            }
            Pair pairLIZ = C839403Ps.LIZ(billInfoData);
            C03O1 c03o1 = this.LLILZLL;
            String str2 = (String) C7727030b.LIZ(0, (List) pairLIZ.getFirst());
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (String) C7727030b.LIZ(1, (List) pairLIZ.getFirst());
            if (str3 == null) {
                str3 = "";
            }
            String str4 = (String) C7727030b.LIZ(2, (List) pairLIZ.getFirst());
            c03o1.LIZ(((Number) pairLIZ.getSecond()).intValue(), strLIZIZ, str2, str3, numLJ, str4 != null ? str4 : "");
        }
        C840103Pz.LIZ.getClass();
        this.LLLILZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_osp_auto_select_recommend_payment", true, false);
        this.LLLII.LJ(this.LLJJL);
    }

    public final void XQ2() {
        C03O1.LJIJ(this.LLILZLL, this.LLJJIII, this.LLJJIJI, hi1(true), this.LLLFF.LJIIJ(), false, Boolean.valueOf(DQ2()), Boolean.valueOf(this.LLLF), 7672);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C03JV(0);
    }

    public MiniOspViewModel() {
        this.LLLFZ = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_pre_handle", true, false);
        this.LLLII = new C03PJ(null);
        this.LLLIIII = new AtomicBoolean(false);
        this.LLLIIL = System.currentTimeMillis();
        this.LLLIILIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1289));
        this.LLLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1290));
        this.LLLILZLLLI = "normal_checkout";
        C987803tc.LIZ(this.LLLILZJ, "normal_checkout");
        this.LLLJ = new C7873035r(null, null, false, null, null, null, null, 32767);
        this.LLLLIILLL = 1;
        this.LLLLILI = C03M1.BILL_INFO.getValue();
        this.LLLLJI = 0L;
        new LinkedHashMap();
        new LinkedHashMap();
        new ArrayList();
        this.LLLLLLJ = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GQ2() {
        /*
            r5 = this;
            boolean r0 = X.AnonymousClass0368.LIZ()
            if (r0 != 0) goto L7
            return
        L7:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r5.LLJIJIL
            r4 = 0
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r3 = r0.paymentMethodInfo
            r2 = 0
            if (r3 == 0) goto L45
            java.lang.String r1 = r3.id
            if (r1 == 0) goto L45
            java.lang.String r0 = "pm_pi_ccdc_"
            boolean r1 = kotlin.text.u.LJJIIJZLJL(r1, r0, r2)
            r0 = 1
            if (r1 != r0) goto L45
        L1e:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r2 = r5.LLIZ
            if (r2 == 0) goto L3f
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r2.paymentMethods
            if (r0 == 0) goto L40
            java.lang.String r1 = r0.pipoHost
        L28:
            com.google.gson.n r4 = r2.preRiskParam
        L2a:
            if (r1 == 0) goto L3f
            if (r4 == 0) goto L3f
            if (r3 == 0) goto L3f
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r5.LLJLL = r0
            if (r0 == 0) goto L61
            X.C881703cV.LIZ(r0, r1, r3, r4)
        L3f:
            return
        L40:
            r1 = r4
            if (r2 == 0) goto L2a
            goto L28
        L44:
            r3 = r4
        L45:
            X.03SY r1 = X.C03SY.LIZ
            if (r3 == 0) goto L5f
            java.lang.String r0 = r3.id
        L4b:
            r1.getClass()
            boolean r0 = X.C03SY.LJIJI(r0)
            if (r0 != 0) goto L1e
            X.09Fh r0 = X.C2341109Fh.LIZ
            r0.getClass()
            java.lang.String r0 = "CCDC pre risk only"
            X.C2341109Fh.LJ(r0)
            return
        L5f:
            r0 = r4
            goto L4b
        L61:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.GQ2():void");
    }

    public final void dR2() {
        IEventCenter iEventCenter;
        if (!PQ2().LJIIIIZZ() || (iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null)) == null) {
            return;
        }
        iEventCenter.LIZ("ec_close_mini_osp", C1741890vQh.LJIIIIZZ(wQ2(false)));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1713070ugD.LIZIZ(this);
        this.LLLII.LIZ();
        C03WX c03wx = this.LLJJL;
        if (c03wx != null) {
            c03wx.LJJIZ(this.LLJJJJLIIL);
        }
        this.LLJJI = Boolean.TRUE;
        this.LLLIIIL = null;
        C11JF c11jf = this.LLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C03OM.LIZ();
        ((C03N4) this.LLLIILIL.getValue()).release();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C1713070ugD.LIZ(this);
    }

    public final boolean CQ2(String str) {
        BillInfoData billInfoData;
        PaymentMethodsData paymentMethodsData;
        List<PaymentMethod> list;
        if (str != null && str.length() != 0 && (billInfoData = this.LLIZ) != null && (paymentMethodsData = billInfoData.paymentMethods) != null && (list = paymentMethodsData.storedMethods) != null) {
            for (PaymentMethod paymentMethod : list) {
                if (Intrinsics.LJFF(paymentMethod.LJIIJ(), str)) {
                    if (paymentMethod != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final Map<String, String> EQ2(boolean z) {
        LinkedHashMap linkedHashMap;
        PaymentMethodsData paymentMethodsData;
        Map<String, String> map;
        BillInfoData billInfoData = this.LLIZ;
        if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null && (map = paymentMethodsData.paymentParam) != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        String str = this.LLLIIIL;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("first_checkout_consultation_id", str);
        if (z) {
            C03SE c03se = C03PI.LJIJI;
            Application applicationLIZ = C7879035x.LIZ();
            c03se.getClass();
            C03SE.LIZ(applicationLIZ, linkedHashMap);
        }
        return linkedHashMap;
    }

    public final List<PaymentMethod> LQ2(boolean z) {
        PaymentMethodsData paymentMethodsData;
        CreditInfo creditInfo;
        List listSingletonList;
        List<PaymentMethod> list;
        PaymentMethodsData paymentMethodsData2;
        PaymentMethodsData paymentMethodsData3;
        PaymentMethodsData paymentMethodsData4;
        CreditInfo creditInfo2;
        PaymentMethod paymentMethod;
        List<PaymentMethod> listSingletonList2 = null;
        if (!z) {
            List[] listArr = new List[3];
            BillInfoData billInfoData = this.LLIZ;
            if (billInfoData != null && (paymentMethodsData4 = billInfoData.paymentMethods) != null && (creditInfo2 = paymentMethodsData4.creditInfo) != null && (paymentMethod = creditInfo2.creditPaymentMethod) != null) {
                listSingletonList = Collections.singletonList(paymentMethod);
            } else {
                listSingletonList = null;
            }
            listArr[0] = listSingletonList;
            BillInfoData billInfoData2 = this.LLIZ;
            if (billInfoData2 != null && (paymentMethodsData3 = billInfoData2.paymentMethods) != null) {
                list = paymentMethodsData3.storedMethods;
            } else {
                list = null;
            }
            listArr[1] = list;
            if (billInfoData2 != null && (paymentMethodsData2 = billInfoData2.paymentMethods) != null) {
                listSingletonList2 = paymentMethodsData2.paymentMethods;
            }
            listArr[2] = listSingletonList2;
            return C15438062q.LJIJJLI(C13LQ.LJIJI(listArr));
        }
        BillInfoData billInfoData3 = this.LLIZ;
        if (billInfoData3 != null && (paymentMethodsData = billInfoData3.paymentMethods) != null && (creditInfo = paymentMethodsData.creditInfo) != null) {
            List[] listArr2 = new List[3];
            PaymentMethod paymentMethod2 = creditInfo.creditPaymentMethod;
            if (paymentMethod2 != null) {
                listSingletonList2 = Collections.singletonList(paymentMethod2);
            }
            listArr2[0] = listSingletonList2;
            listArr2[1] = creditInfo.storedMethods;
            listArr2[2] = creditInfo.paymentMethods;
            return C15438062q.LJIJJLI(C13LQ.LJIJI(listArr2));
        }
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void QQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r24) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.QQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo):void");
    }

    public final String RQ2(HashMap<String, Object> map) {
        Map mapLJ = C1741890vQh.LJ("entrance_info", map);
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        List<String> list = C957303oh.LIZ().orderEntranceInfoKeys;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapLJ.entrySet()) {
            if (list.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return C1741890vQh.LJIIIIZZ(linkedHashMap);
    }

    public final void VQ2(PaymentMethod paymentMethod) {
        PaymentMethodsData paymentMethodsData;
        List<PaymentMethod> listLJIJI;
        PaymentMethod next;
        BillInfoData billInfoData = this.LLIZ;
        if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null && (listLJIJI = paymentMethodsData.LJIJI()) != null) {
            Iterator<PaymentMethod> it2 = listLJIJI.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LJJJJZ(paymentMethod)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PaymentMethod paymentMethod2 = next;
            if (paymentMethod2 != null) {
                bR2(paymentMethod2, null);
                bR2(paymentMethod, paymentMethod2.LJJIIZ());
                return;
            }
        }
        bR2(paymentMethod, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:0|2|(33:35|(1:57)(1:47)|48|(0)(1:56)|8|(1:10)(1:34)|11|(1:13)(1:33)|14|(1:16)(1:32)|17|(1:19)|20|(5:22|(1:24)(1:31)|25|(1:27)(1:30)|28)|29|92|58|(1:64)|67|(1:71)|(1:73)|(1:75)|(1:77)|78|(2:81|79)|94|82|(1:84)|(1:86)|87|(1:89)|90|91)(1:6)|7|8|(0)(0)|11|(0)(0)|14|(0)(0)|17|(0)|20|(0)|29|92|58|(2:60|64)|67|(2:69|71)|(0)|(0)|(0)|78|(1:79)|94|82|(0)|(0)|87|(0)|90|91) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011f, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C1AF0.LIZJ("logOSPEnterPage startClickTime exception");
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0172 A[LOOP:0: B:79:0x016c->B:81:0x0172, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r20) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.WQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData):void");
    }

    public final void YQ2(BillInfoData billInfoData) {
        SkuPrice skuPrice;
        C737802uO c737802uOLIZJ;
        List<ShopOrderNew> list;
        ShopOrderNew shopOrderNew;
        List<MainOrderInfo> list2;
        MainOrderInfo mainOrderInfo;
        ShopOrderNew shopOrderNew2;
        List<MainOrderInfo> list3;
        MainOrderInfo mainOrderInfo2;
        List<PackedSku> list4;
        PackedSku packedSku;
        PaymentMethodsData paymentMethodsData;
        List<PaymentMethod> listLJIJI;
        String strLJJLIIIJ;
        C03P2 c03p2LJ;
        Price price;
        String currency;
        String priceVal;
        String currency2;
        Summary summary;
        List<PaymentMethod> list5;
        List<PaymentMethod> list6;
        int i = this.LL;
        String str = null;
        if (i != 0 && i != 2 && i != 1) {
            skuPrice = null;
            c737802uOLIZJ = null;
        } else {
            List<ShopOrderNew> list7 = billInfoData.newShopOrders;
            if (list7 != null && (shopOrderNew2 = (ShopOrderNew) C13LP.LJJJLL(list7)) != null && (list3 = shopOrderNew2.mainOrderInfos) != null && (mainOrderInfo2 = (MainOrderInfo) C13LP.LJJJLL(list3)) != null && (list4 = mainOrderInfo2.packedSkus) != null && (packedSku = (PackedSku) C13LP.LJJJLL(list4)) != null) {
                skuPrice = packedSku.price;
            } else {
                skuPrice = null;
            }
            BillInfoData billInfoData2 = this.LLIZ;
            if (billInfoData2 != null && (list = billInfoData2.newShopOrders) != null && (shopOrderNew = (ShopOrderNew) C13LP.LJJJLL(list)) != null && (list2 = shopOrderNew.mainOrderInfos) != null && (mainOrderInfo = (MainOrderInfo) C13LP.LJJJLL(list2)) != null) {
                c737802uOLIZJ = C720302rZ.LIZJ(mainOrderInfo, this.LL);
            } else {
                c737802uOLIZJ = null;
            }
        }
        C03O1 c03o1 = this.LLILZLL;
        Boolean bool = Boolean.TRUE;
        HashMap<String, Object> mapHi1 = hi1(true);
        String strMQ2 = MQ2();
        Integer numValueOf = Integer.valueOf(this.LLLLLILLIL);
        BillInfoData billInfoData3 = this.LLIZ;
        if (billInfoData3 != null) {
            paymentMethodsData = billInfoData3.paymentMethods;
        } else {
            paymentMethodsData = null;
        }
        boolean zLJFF = Intrinsics.LJFF(C836703Or.LIZ().paymentOptionsUseAllMethods, bool);
        int i2 = 0;
        if (zLJFF) {
            List[] listArr = new List[2];
            if (paymentMethodsData != null) {
                list5 = paymentMethodsData.paymentMethods;
            } else {
                list5 = null;
            }
            listArr[0] = list5;
            if (paymentMethodsData != null) {
                list6 = paymentMethodsData.storedMethods;
            } else {
                list6 = null;
            }
            listArr[1] = list6;
            listLJIJI = C15438062q.LJIJJLI(C13LQ.LJIJI(listArr));
        } else if (paymentMethodsData == null || (listLJIJI = paymentMethodsData.LJIJI()) == null) {
            listLJIJI = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (PaymentMethod paymentMethod : listLJIJI) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                PaymentMethod paymentMethod2 = paymentMethod;
                if (zLJFF || i2 < 3) {
                    arrayList.add(paymentMethod2.LJJIIZ());
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (arrayList.isEmpty()) {
            strLJJLIIIJ = "";
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        HashMap<String, Object> mapKQ2 = KQ2();
        BillInfoData billInfoData4 = this.LLIZ;
        if (billInfoData4 != null && (summary = billInfoData4.summary) != null) {
            c03p2LJ = C720302rZ.LJ(summary);
        } else {
            c03p2LJ = null;
        }
        C03H3 c03h3 = this.LLJLILLLLZIIL;
        if (c03h3 != null) {
            str = c03h3.LIZJ;
        }
        Map<String, Object> mapLJIIJ = this.LLLFF.LJIIJ();
        Boolean boolValueOf = Boolean.valueOf(DQ2());
        Object obj = c03o1.LIZ.get("click_buynow_start_time");
        if (obj == null) {
            obj = -1L;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap<String, Object> concurrentHashMap = c03o1.LIZ;
        if (skuPrice != null) {
            Price price2 = skuPrice.realPrice;
            if (price2 != null) {
                priceVal = price2.getPriceVal();
            } else {
                priceVal = null;
            }
            concurrentHashMap.put("sale_price_value", String.valueOf(priceVal));
            concurrentHashMap.put("original_price_value", String.valueOf(skuPrice.originalPriceVal));
            Price price3 = skuPrice.realPrice;
            if (price3 != null) {
                currency2 = price3.getCurrency();
            } else {
                currency2 = null;
            }
            concurrentHashMap.put("currency", String.valueOf(currency2));
        }
        linkedHashMap.putAll(c03o1.LIZ);
        linkedHashMap.putAll(mapHi1);
        try {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(String.valueOf(c03o1.LIZ.get("start_click_time")));
            Object obj2 = c03o1.LIZ.get("previous_page");
            if (lLJIILIIL != null && (Intrinsics.LJFF(obj2, "cart") || Intrinsics.LJFF(obj2, "ecommerce_centre_page"))) {
                linkedHashMap.put("start_click_to_now", Long.valueOf(System.currentTimeMillis() - lLJIILIIL.longValue()));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("logOSPEnterPage startClickTime exception");
        }
        if ((obj instanceof Long) && !Intrinsics.LJFF(obj, -1L)) {
            linkedHashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (bool != null) {
            linkedHashMap.put("is_fullscreen", 1);
        }
        if (strMQ2 != null) {
            linkedHashMap.put("cart_item_id", strMQ2);
        }
        if (numValueOf != null) {
            linkedHashMap.put("osp_reload_tag", numValueOf);
        }
        if (strLJJLIIIJ != null) {
            linkedHashMap.put("payment_option", strLJJLIIIJ);
        }
        linkedHashMap.putAll(mapKQ2);
        if (c03p2LJ != null) {
            C855703Vz.LIZJ(c03p2LJ, linkedHashMap);
        }
        if (str != null) {
            linkedHashMap.put("purchase_path", str);
        }
        linkedHashMap.put("shipping_rights_content", c03o1.LJIIZILJ);
        C03O0.LIZ.getClass();
        C03O0.LIZ(linkedHashMap, null, null, null);
        if (c737802uOLIZJ != null) {
            C855703Vz.LIZIZ(c737802uOLIZJ, linkedHashMap);
        }
        C038N.LIZ(linkedHashMap, mapLJIIJ);
        if (skuPrice != null && (price = skuPrice.realPrice) != null && (currency = price.getCurrency()) != null) {
            linkedHashMap.put("shipping_currency", currency);
        }
        if (boolValueOf != null) {
            linkedHashMap.put("is_membership_check_success", Integer.valueOf(boolValueOf.booleanValue() ? 1 : 0));
        }
        C03O1.LJJIJIIJIL("tiktokec_enter_page", linkedHashMap);
    }

    public final void hR2(PaymentInfo paymentInfo) {
        PaymentMethod paymentMethod;
        String str;
        try {
            String strLIZJ = C03OM.LIZJ(paymentInfo, LQ2(false));
            if (strLIZJ != null) {
                String str2 = null;
                if (Intrinsics.LJFF(strLIZJ, "pm_pi_ins_pipobnpl_c_d") || ((paymentMethod = paymentInfo.paymentMethod) != null && paymentMethod.LJJJJIZL())) {
                    PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
                    if (paymentMethodInfo != null) {
                        str2 = paymentMethodInfo.tenure;
                    }
                    C03OM.LIZLLL(strLIZJ, str2);
                    return;
                }
                PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
                if (paymentMethod2 != null) {
                    str = paymentMethod2.id;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(strLIZJ, str)) {
                    PaymentMethod paymentMethod3 = paymentInfo.paymentMethod;
                    if (paymentMethod3 != null) {
                        str2 = paymentMethod3.id;
                    }
                    C03OM.LIZLLL(strLIZJ, str2);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0221 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, java.lang.Object> hi1(boolean r14) {
        /*
            Method dump skipped, instruction units count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.hi1(boolean):java.util.HashMap");
    }

    public final void iR2(int i) {
        Summary summary;
        String str;
        Summary summary2;
        Price price;
        String currency;
        Summary summary3;
        Price price2;
        String priceVal;
        setState(new AwS16S0001000_1(i, 3));
        HashMap<String, Object> map = this.LLJJJJ;
        if (map != null) {
            BillInfoData billInfoData = this.LLIZ;
            if (billInfoData != null && (summary3 = billInfoData.summary) != null && (price2 = summary3.total) != null && (priceVal = price2.getPriceVal()) != null) {
                map.put("total_payment", priceVal);
            }
            BillInfoData billInfoData2 = this.LLIZ;
            if (billInfoData2 != null && (summary2 = billInfoData2.summary) != null && (price = summary2.total) != null && (currency = price.getCurrency()) != null) {
                map.put("currency", currency);
            }
            BillInfoData billInfoData3 = this.LLIZ;
            if (billInfoData3 != null && (summary = billInfoData3.summary) != null && (str = C720302rZ.LJ(summary).LIZLLL) != null) {
                map.put("summary_info", str);
            }
        }
    }

    public final void jR2(int i) {
        setState(new AwS16S0001000_1(i, 4));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAddCCDCCard(C03OF c03of) {
        PaymentInfo paymentInfo = c03of.LIZ;
        if (paymentInfo != null) {
            QQ2(paymentInfo);
            yQ2(this, paymentInfo, false, c03of.LIZJ, null, 8);
            ExceptionUX exceptionUX = c03of.LIZLLL;
            if (exceptionUX != null) {
                this.LLIZLLLIL = exceptionUX;
                C786410Ut5.LJLIIL(300L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS101S0100000_1(this, 17));
            }
            C03O1 c03o1 = this.LLILZLL;
            c03o1.getClass();
            c03o1.LIZIZ = SystemClock.elapsedRealtime();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSubPaymentSelectedEvent$ecommerce_transaction_release(C03OS c03os) {
        String str;
        String str2;
        List<PaymentElement> listLJJLIIIJL;
        PaymentMethod paymentMethod;
        PaymentMethodsData paymentMethodsData;
        if (!c03os.LIZIZ) {
            return;
        }
        PaymentMethod paymentMethod2 = c03os.LIZ;
        if (paymentMethod2 != null) {
            str = paymentMethod2.id;
            str2 = paymentMethod2.token;
            listLJJLIIIJL = paymentMethod2.LJJLIIIJL();
        } else {
            str = null;
            str2 = null;
            listLJJLIIIJL = null;
        }
        PaymentInfo paymentInfo = new PaymentInfo(new PaymentMethodInfo(str, str2, listLJJLIIIJL, null, null, null, null, null, null, null, null, null, null, null, null, null, null), paymentMethod2, Boolean.FALSE, Boolean.TRUE, null, null, null, null, null, new LinkedHashMap(), null);
        PaymentInfo paymentInfo2 = this.LLJIJIL;
        if (paymentInfo2 != null) {
            paymentMethod = paymentInfo2.LIZ;
        } else {
            paymentMethod = null;
        }
        paymentInfo.LIZ = paymentMethod;
        C03SE c03se = C03PI.LJIJI;
        BillInfoData billInfoData = this.LLIZ;
        if (billInfoData != null) {
            paymentMethodsData = billInfoData.paymentMethods;
        } else {
            paymentMethodsData = null;
        }
        c03se.getClass();
        C03SE.LJJ(paymentMethodsData, paymentMethod2, null, null, "osp on sub payment selected event");
        yQ2(this, paymentInfo, false, null, null, 12);
        C03O1 c03o1 = this.LLILZLL;
        c03o1.getClass();
        c03o1.LIZIZ = SystemClock.elapsedRealtime();
        VQ2(paymentMethod2);
        hR2(paymentInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c A[PHI: r5
      0x005c: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String), (r5v3 java.lang.String) binds: [B:29:0x0059, B:19:0x0032, B:21:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CloseMiniOspParams wQ2(boolean r12) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r11.LLIZ
            r2 = 0
            r10 = 0
            if (r0 == 0) goto L5e
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew> r0 = r0.newShopOrders
            if (r0 == 0) goto L5e
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r2, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew) r0
            if (r0 == 0) goto L5e
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo> r0 = r0.mainOrderInfos
            if (r0 == 0) goto L5e
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r2, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo) r1
        L1c:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CloseMiniOspParams r3 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CloseMiniOspParams
            java.util.List<java.lang.String> r4 = r11.LLJZIJLIL
            if (r1 == 0) goto L58
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku> r0 = r1.packedSkus
            if (r0 == 0) goto L58
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r2, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku) r0
            if (r0 == 0) goto L58
            java.lang.String r5 = r0.productId
        L30:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku> r0 = r1.packedSkus
            if (r0 == 0) goto L5c
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r2, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku) r0
            if (r0 == 0) goto L5c
            java.lang.String r6 = r0.skuId
        L3e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r12)
            int r0 = r11.LLLLILI
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            boolean r0 = r11.LLLLJ
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r0 = r11.LLIZLLLIL
            if (r0 == 0) goto L54
            com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionInfo r10 = r0.exceptionInfo
        L54:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L58:
            r5 = r10
            if (r1 == 0) goto L5c
            goto L30
        L5c:
            r6 = r10
            goto L3e
        L5e:
            r1 = r10
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.wQ2(boolean):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CloseMiniOspParams");
    }

    public final OspScene xQ2(BillInfoData billInfoData) {
        Integer oneStepOrderType = null;
        if (billInfoData == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(C7806033c.LIZ(billInfoData.newShopOrders) ? 1 : 0);
        Integer numValueOf2 = Integer.valueOf(this.LL);
        OrderSubmitRequestParam orderSubmitRequestParam = this.LLILZIL;
        if (orderSubmitRequestParam != null) {
            oneStepOrderType = orderSubmitRequestParam.getOneStepOrderType();
        }
        return new OspScene(numValueOf, 1, null, null, null, numValueOf2, oneStepOrderType, null, null, null, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004f A[PHI: r1
      0x004f: PHI (r1v3 java.util.List) = (r1v2 java.util.List), (r1v5 java.util.List) binds: [B:58:0x009f, B:29:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> OQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r8, boolean r9) {
        /*
            r7 = this;
            r6 = 0
            r3 = 1
            if (r8 == 0) goto Lad
            boolean r0 = r8.LJI()
            if (r0 != r3) goto Lad
            r0 = 1
        Lb:
            r5 = 2
            r1 = 3
            r4 = 0
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r7.LLIZ
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r0.paymentMethods
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = r0.LJIIIZ()
        L1c:
            java.util.List[] r1 = new java.util.List[r1]
            if (r9 == 0) goto L5b
            if (r2 == 0) goto L59
            java.util.List r0 = java.util.Collections.singletonList(r2)
        L26:
            r1[r6] = r0
            if (r2 == 0) goto L57
            X.031p r0 = r2.LJFF
            if (r0 == 0) goto L57
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r0.LJFF
        L30:
            r1[r3] = r0
            if (r2 == 0) goto L55
            X.031p r0 = r2.LJFF
            if (r0 == 0) goto L55
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r0.LJI
        L3a:
            r1[r5] = r0
            java.util.List r0 = X.C13LQ.LJIJI(r1)
            java.util.List r1 = X.C15438062q.LJIJJLI(r0)
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L50
        L4f:
            r4 = r1
        L50:
            java.util.List r0 = X.C03QF.LIZJ(r4)
            return r0
        L55:
            r0 = r4
            goto L3a
        L57:
            r0 = r4
            goto L30
        L59:
            r0 = r4
            goto L26
        L5b:
            X.13BV r0 = X.C13BV.INSTANCE
            goto L26
        L5e:
            r2 = r4
            goto L1c
        L60:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r7.LLIZ
            if (r0 == 0) goto Lab
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r0.paymentMethods
            if (r0 == 0) goto Lab
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.LJIIIZ()
        L6c:
            java.util.List[] r2 = new java.util.List[r1]
            if (r9 == 0) goto La8
            if (r0 == 0) goto La6
            java.util.List r0 = java.util.Collections.singletonList(r0)
        L76:
            r2[r6] = r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r1 = r7.LLIZ
            if (r1 == 0) goto La4
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r1.paymentMethods
            if (r0 == 0) goto La4
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r0.storedMethods
        L82:
            r2[r3] = r0
            if (r1 == 0) goto La2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r1.paymentMethods
            if (r0 == 0) goto La2
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r0.paymentMethods
        L8c:
            r2[r5] = r0
            java.util.List r0 = X.C13LQ.LJIJI(r2)
            java.util.List r1 = X.C15438062q.LJIJJLI(r0)
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L50
            goto L4f
        La2:
            r0 = r4
            goto L8c
        La4:
            r0 = r4
            goto L82
        La6:
            r0 = r4
            goto L76
        La8:
            X.13BV r0 = X.C13BV.INSTANCE
            goto L76
        Lab:
            r0 = r4
            goto L6c
        Lad:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.OQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, boolean):java.util.List");
    }

    public final void bR2(PaymentMethod paymentMethod, String str) {
        PaymentMethod next;
        boolean z;
        String str2;
        String str3;
        String str4;
        boolean z2;
        boolean z3;
        PaymentMethodsData paymentMethodsData;
        PaymentMethodsData paymentMethodsData2;
        List<PaymentMethod> list;
        if (paymentMethod == null) {
            return;
        }
        BillInfoData billInfoData = this.LLIZ;
        String str5 = null;
        if (billInfoData != null && (paymentMethodsData2 = billInfoData.paymentMethods) != null && (list = paymentMethodsData2.storedMethods) != null) {
            Iterator<PaymentMethod> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.id, paymentMethod.id)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
        } else {
            next = null;
        }
        if (next != null) {
            z = true;
        } else {
            z = false;
        }
        if (str != null) {
            str2 = "sub_payment_type";
        } else {
            str2 = "payment_type";
        }
        C03O1 c03o1 = this.LLILZLL;
        String strLJJIIZ = paymentMethod.LJJIIZ();
        boolean zLIZ = C770702zh.LIZ(paymentMethod.extraInfo);
        boolean zLIZ2 = C770702zh.LIZ(paymentMethod.balance);
        Availability availability = paymentMethod.availability;
        if (availability != null) {
            str3 = availability.unavailableCode;
            str4 = availability.statusCode;
        } else {
            str3 = null;
            str4 = null;
        }
        BindInfo bindInfo = paymentMethod.bindInfo;
        if (bindInfo != null) {
            str5 = bindInfo.bindStatus;
        }
        Boolean boolValueOf = Boolean.valueOf(C770702zh.LIZ(paymentMethod.LJIJJ(false)));
        HashMap<String, Object> map = this.LLJJJJ;
        BillInfoData billInfoData2 = this.LLIZ;
        if (billInfoData2 != null && (paymentMethodsData = billInfoData2.paymentMethods) != null && paymentMethodsData.LJJI()) {
            z2 = true;
        } else {
            z2 = false;
        }
        PaymentInfo paymentInfo = this.LLJIJIL;
        if (paymentInfo != null && paymentInfo.LIZJ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C03O1.LJIL(c03o1, strLJJIIZ, zLIZ, 0, str2, z, zLIZ2, str3, str4, str5, true, str, boolValueOf, null, paymentMethod, map, z2, z3, true, 12288);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fR2(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo r13, X.InterfaceC1364105Vn<? super X.C842503Qx> r14) {
        /*
            r12 = this;
            r9 = r13
            boolean r0 = r14 instanceof X.C03OQ
            r5 = r12
            if (r0 == 0) goto L7a
            r3 = r14
            X.03OQ r3 = (X.C03OQ) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r3.LLILLL = r2
        L14:
            java.lang.Object r1 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r8 = 1
            if (r0 == 0) goto L57
            if (r0 != r8) goto L80
            X.C155000ia.LIZIZ(r1)
        L24:
            X.09Fh r2 = X.C2341109Fh.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[gcash] queryBillInfoSuspendForPaymentPage "
            r1.append(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r5.LLIZ
            r4 = 0
            if (r0 == 0) goto L55
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r0.paymentMethods
        L36:
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C2341109Fh.LIZ(r0)
            X.03Qx r3 = new X.03Qx
            java.lang.Integer r2 = r5.LLLILZJ
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r5.LLIZ
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r4 = r0.paymentMethods
        L4d:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r1 = r5.LLJIJIL
            r0 = 8
            r3.<init>(r2, r4, r1, r0)
            return r3
        L55:
            r0 = r4
            goto L36
        L57:
            X.C155000ia.LIZIZ(r1)
            if (r9 != 0) goto L68
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo r9 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo
            X.03DI r0 = X.C03DI.DEFAULT
            int r1 = r0.getValue()
            r0 = 0
            r9.<init>(r1, r0, r0, r0)
        L68:
            r6 = 0
            r10 = 0
            r11 = 79
            r7 = r6
            X.099F r0 = eR2(r5, r6, r7, r8, r9, r10, r11)
            r3.LLILLL = r8
            java.lang.Object r0 = r0.LJLIIIL(r3)
            if (r0 != r2) goto L24
            return r2
        L7a:
            X.03OQ r3 = new X.03OQ
            r3.<init>(r5, r14)
            goto L14
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.fR2(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Object objValueOf;
        int value;
        int iHashCode = str.hashCode();
        if (iHashCode != 935586949) {
            if (iHashCode != 1242205757) {
                if (iHashCode == 1792906745 && str.equals("ec_payment_change_mini_osp")) {
                    C03SE c03se = C03PI.LJIJI;
                    AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(101);
                    c03se.getClass();
                    C03SE.LJJIFFI(aFwS185S0000000_1);
                    if (PQ2().LJ()) {
                        setState(AFwS228S0000000_1.get$arr$(475));
                    }
                    yQ2(this, null, true, null, null, 12);
                    ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ(str2);
                    if (concurrentHashMapLIZ == null || (objValueOf = concurrentHashMapLIZ.get("payment_change_reason")) == null) {
                        objValueOf = Integer.valueOf(C03DI.ADD_NEW_PAYMENT.getValue());
                    }
                    if (objValueOf instanceof Integer) {
                        value = ((Number) objValueOf).intValue();
                    } else {
                        value = C03DI.ADD_NEW_PAYMENT.getValue();
                    }
                    this.LLJI = false;
                    eR2(this, false, false, true, new ChangeInfo(value, null, null, null), null, 79);
                    AnonymousClass0378.LIZ().LIZ("ec_order_submit_page_refresh", C1741890vQh.LJIIIIZZ(new OrderSubmitRefreshEventParams(Integer.valueOf(value))));
                    return;
                }
                return;
            }
            if (!str.equals("ec_osp_resend_order_create")) {
                return;
            }
            setState(AFwS228S0000000_1.get$arr$(278));
            return;
        }
        if (!str.equals("ec_payment_refresh_cashier")) {
            return;
        }
        this.LLLLLIL = true;
    }

    public static String TQ2(Bundle bundle, String str, boolean z) {
        boolean z2;
        String str2;
        Set<String> setKeySet;
        Object obj;
        String string;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        Uri uri = UriProtector.parse(str);
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("popup_follow_activity_ui", "false");
        builderBuildUpon.appendQueryParameter("trans_status_bar", "true");
        if (z) {
            str2 = "light";
        } else {
            str2 = "dark";
        }
        builderBuildUpon.appendQueryParameter("status_font_mode", str2);
        builderBuildUpon.appendQueryParameter("trans_navigation_bar", "false");
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str3 : setKeySet) {
                if (!Intrinsics.LJFF(str3, "us_voucher_popup_schema") && !queryParameterNames.contains(str3)) {
                    try {
                        obj = bundle.get(str3);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        obj = null;
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        obj = null;
                    }
                    if (obj != null && (string = obj.toString()) != null) {
                        builderBuildUpon.appendQueryParameter(str3, string);
                    }
                }
            }
        }
        return builderBuildUpon.build().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0245 A[PHI: r5
      0x0245: PHI (r5v2 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>) = 
      (r5v0 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
      (r5v4 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
      (r5v5 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
     binds: [B:132:0x0244, B:127:0x0234, B:78:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1891350zJl> IQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r38, java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r39, boolean r40) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.IQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, java.util.concurrent.CopyOnWriteArrayList, boolean):java.util.List");
    }

    public final PaymentInfo SQ2(PaymentInfo paymentInfo, boolean z, PaymentInfo paymentInfo2) {
        PaymentMethod paymentMethod;
        PaymentInfo paymentInfoLIZ = paymentInfo;
        if (!z) {
            return paymentInfoLIZ;
        }
        if (paymentInfo2 == null) {
            paymentInfo2 = this.LLJIJIL;
        }
        if (paymentInfoLIZ != null && paymentInfoLIZ.paymentMethod != null && paymentInfo2 != null && paymentInfo2.LJI() && ((paymentMethod = paymentInfoLIZ.LIZ) == null || !C899503fN.LIZIZ(paymentMethod, paymentInfo2.LIZ))) {
            paymentInfoLIZ = PaymentInfo.LIZ(paymentInfoLIZ, null, null, null, paymentInfo2.LIZ, null, null, null, 1983);
        }
        this.LLJIJIL = paymentInfoLIZ;
        return paymentInfoLIZ;
    }

    public final void gR2(PaymentMethod paymentMethod, boolean z, Function1<? super String, Unit> function1) {
        CommuteType commuteType;
        BindInfoReqInfo[] bindInfoReqInfoArr = new BindInfoReqInfo[1];
        String str = paymentMethod.id;
        String str2 = paymentMethod.token;
        String strLJ = paymentMethod.LJ();
        CommuteInfo commuteInfoLJII = paymentMethod.LJII(false);
        if (commuteInfoLJII != null) {
            commuteType = commuteInfoLJII.commuteType;
        } else {
            commuteType = null;
        }
        bindInfoReqInfoArr[0] = new BindInfoReqInfo(str, str2, strLJ, commuteType, "snssdk1180://ec/app_bind_result", null);
        ArrayList arrayListLJ = C1697810uHb.LJ(bindInfoReqInfoArr);
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C834103Nr(this, arrayListLJ, z, paymentMethod, function1, null), 2);
    }

    @Override // X.InterfaceC828903Lr
    public final void mH2(boolean z, String str, ExceptionUX exceptionUX) {
        IEventCenter iEventCenter;
        this.LLLF = z;
        this.LLJ = str;
        if (z) {
            if (PQ2().LJIIIIZZ() && (iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null)) != null) {
                iEventCenter.LIZ("ec_membership_upgrade", C1741890vQh.LJIIIIZZ(wQ2(true)));
            }
            if (PQ2().LJII()) {
                iR2(4);
                return;
            }
            return;
        }
        dR2();
        if (exceptionUX == null) {
            return;
        }
        this.LLIZLLLIL = exceptionUX;
        this.LLJJIJIIJIL = "poll_order_status";
        iR2(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest HQ2(X.C03JV r77, java.lang.Boolean r78, java.lang.String r79, java.lang.Integer r80) {
        /*
            Method dump skipped, instruction units count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.HQ2(X.03JV, java.lang.Boolean, java.lang.String, java.lang.Integer):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest");
    }

    public static void kR2(MiniOspViewModel miniOspViewModel, PaymentInfo paymentInfo, boolean z, String str, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        miniOspViewModel.LLJIJIL = paymentInfo;
        C03SE c03se = C03PI.LJIJI;
        AwS150S1100000_1 awS150S1100000_1 = new AwS150S1100000_1(paymentInfo, str, 11);
        c03se.getClass();
        C03SE.LJJIFFI(awS150S1100000_1);
        if (z) {
            miniOspViewModel.setStateImmediate(new AwS89S0110000_1(paymentInfo, false, 17));
        } else {
            miniOspViewModel.setState(new AwS89S0110000_1(paymentInfo, false, 18));
        }
        miniOspViewModel.GQ2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024f A[PHI: r2
      0x024f: PHI (r2v88 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) = 
      (r2v85 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
      (r2v93 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
     binds: [B:131:0x0224, B:116:0x01fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a6  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData] */
    /* JADX WARN: Type inference failed for: r18v1, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData] */
    /* JADX WARN: Type inference failed for: r18v7, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan] */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v39, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v65, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v131 */
    /* JADX WARN: Type inference failed for: r2v132 */
    /* JADX WARN: Type inference failed for: r2v133 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r30, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r31, boolean r32, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo r33, X.InterfaceC1364105Vn<? super kotlin.Unit> r34) {
        /*
            Method dump skipped, instruction units count: 2086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.BQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest, boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo, X.05Vn):java.lang.Object");
    }

    public final void FQ2(Context context, String str, Boolean bool, Integer num, Long l) {
        withState(new AwS5S1500000_1(this, l, bool, num, str, context, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba A[PHI: r4
      0x01ba: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:100:0x01b6, B:49:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d8 A[PHI: r11
      0x01d8: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String) binds: [B:112:0x01d4, B:16:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e2 A[PHI: r12 r19
      0x01e2: PHI (r12v2 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) = 
      (r12v1 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
      (r12v5 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
     binds: [B:117:0x01de, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r19v1 java.lang.Boolean) = (r19v0 java.lang.Boolean), (r19v3 java.lang.Boolean) binds: [B:117:0x01de, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ZQ2(java.lang.String r21, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r22, java.lang.Long r23, java.lang.String r24, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary r25) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.ZQ2(java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.lang.Long, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary):void");
    }

    public final void zQ2(BillInfoData billInfoData, BillInfoRequest billInfoRequest, boolean z, Integer num, ChangeInfo changeInfo) {
        Boolean bool;
        this.LLLLIIIILLL = !z;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkAndUpdateBillInfoData, infoData:");
        if (billInfoData != null) {
            bool = billInfoData.LIZ;
        } else {
            bool = null;
        }
        sbLIZ.append(bool);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        C921903iz c921903iz = C921903iz.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("second refresh: ");
        sbLIZ2.append(this.LLLLIIIILLL);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c921903iz.getClass();
        C921903iz.LIZIZ(4, strLIZIZ2, "checkAndUpdateBillInfoData");
        C948503nH.LJI(this, C23271099x.INSTANCE, new C824603Ka(billInfoData, this, z, num, billInfoRequest, changeInfo, null));
        C03OM.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void cR2(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r64, android.content.Context r65, java.lang.String r66, boolean r67, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipOpenCashierParams r68, int r69) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.cR2(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel, android.content.Context, java.lang.String, boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipOpenCashierParams, int):void");
    }

    public static void vQ2(MiniOspViewModel miniOspViewModel, Context context, Boolean bool, Integer num, String str, int i) {
        String str2 = str;
        Integer num2 = num;
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        miniOspViewModel.withState(new AwS1S2400000_1(miniOspViewModel, str2, context, (String) null, bool2, num2, 1));
    }

    public static void yQ2(MiniOspViewModel miniOspViewModel, PaymentInfo paymentInfo, boolean z, String str, PaymentInfo paymentInfo2, int i) {
        PaymentInfo paymentInfo3 = paymentInfo2;
        String str2 = str;
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            paymentInfo3 = null;
        }
        miniOspViewModel.getClass();
        C948503nH.LJI(miniOspViewModel, C23271099x.INSTANCE, new C03KV(miniOspViewModel, z, paymentInfo, paymentInfo3, str2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012e  */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo JQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r26, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r27, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r28, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r29, java.lang.String r30, java.lang.Boolean r31, int r32) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.JQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.lang.String, java.lang.Boolean, int):com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C099F eR2(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r67, boolean r68, boolean r69, boolean r70, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo r71, java.lang.Integer r72, int r73) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel.eR2(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel, boolean, boolean, boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo, java.lang.Integer, int):X.099F");
    }
}
