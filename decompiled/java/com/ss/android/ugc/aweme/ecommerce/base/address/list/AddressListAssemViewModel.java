package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.C036E;
import X.C03DB;
import X.C03U3;
import X.C03WM;
import X.C049Y;
import X.C09JN;
import X.C0PEM;
import X.C1019103yf;
import X.C1120604Zw;
import X.C1121904a9;
import X.C11S5;
import X.C123100dR;
import X.C1389890mGx;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C1701940uOG;
import X.C1741890vQh;
import X.C1746630vYL;
import X.C1747010vYx;
import X.C1747870vaL;
import X.C1748720vbi;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2371409Qy;
import X.C786410Ut5;
import X.C7879035x;
import X.C817603Hi;
import X.C862003Yk;
import X.C948503nH;
import X.C962403pW;
import X.C973303rH;
import X.C975303rb;
import X.C975803rg;
import X.C975903rh;
import X.C976003ri;
import X.C976103rj;
import X.C977303rv;
import X.C980703sT;
import X.C993603uY;
import X.EnumC1014603xw;
import X.InterfaceC0148002o;
import X.InterfaceC1164530gPT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1748810vbr;
import X.InterfaceC1891350zJl;
import X.InterfaceC497601wk;
import X.InterfaceC975703rf;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClaimIncentiveWithAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClaimIncentiveWithAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.NoticeDialogMessage;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressListCacheConfig;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS5S1500000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public class AddressListAssemViewModel extends AssemViewModel<AddressListState> implements InterfaceC975703rf, InterfaceC1164530gPT {
    public String LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public Boolean LLILZ;
    public HashMap<String, Object> LLILZIL;
    public Boolean LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public Integer LLJ;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILLL;
    public Integer LLJJ;
    public String LLJJI;
    public Integer LLJJIII;
    public Map<String, String> LLJJIJI;
    public AddressListData LLJJIJIIJIL;
    public Address LLJJIJIL;
    public Integer LLJJJ;
    public Boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJLIIL;
    public Integer LLJJL;
    public AddressPageStarter.AddressListEnterParams LLJJLIIIJLLLLLLLZ;
    public final List<ReachableAddress> LLJI = new ArrayList();
    public int LLJILJILJ = 20;
    public final C817603Hi LLJJJJJIL = new C817603Hi();

    @Override // X.InterfaceC975703rf
    public final boolean LS0() {
        return this.LLIZLLLIL != null;
    }

    @Override // X.InterfaceC975703rf
    public final boolean d41() {
        return Intrinsics.LJFF(this.LLILZLL, Boolean.TRUE);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new AddressListState(0, null, null, null, null, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_address_change", this);
    }

    @Override // X.InterfaceC975703rf
    public final Boolean ES() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC975703rf
    public final Integer IK() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC975703rf
    public final boolean PY0() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC975703rf
    public final String ZM2() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC975703rf
    public final List<ReachableAddress> ft() {
        return this.LLJI;
    }

    @Override // X.InterfaceC975703rf
    public final Map<String, String> getExtraInfo() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC975703rf
    public final String getProductId() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC975703rf
    public final HashMap<String, Object> getTrackParams() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC975703rf
    public final C817603Hi gv() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC975703rf
    public final int hS1() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC975703rf
    public final Integer iV1() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC975703rf
    public final Integer jt1() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC975703rf
    public final Boolean l81() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC975703rf
    public final String nP0() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC975703rf
    public final boolean vj2() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC975703rf
    public final AddressListData wD2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC975703rf
    public final boolean xW() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC975703rf
    public final void Fk1(Address address) {
        if (this.LLJJJJ && C123100dR.LIZ(address.id)) {
            C973303rH.LL.LIZIZ(address.id);
        }
        C973303rH c973303rH = C973303rH.LL;
        String str = address.id;
        Integer num = this.LLJJL;
        c973303rH.getClass();
        C973303rH.LJIIIIZZ(num, str);
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        String str2 = address.id;
        if (str2 == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        iEventCenter.LIZ("ec_address_select", C1741890vQh.LJIIIIZZ(new AddressPageStarter.AddressEvent(str2, 3, new ReachableAddress(Boolean.TRUE, address, null, null, null, null, null, null, null, null, false, null, null, null, null, null), null, null, null)));
        this.LLJJIJIL = address;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel, java.lang.Object] */
    @Override // X.InterfaceC975703rf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void It0(kotlin.jvm.functions.Function0<kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel.It0(kotlin.jvm.functions.Function0):void");
    }

    @Override // X.InterfaceC975703rf
    public final void LJJJZ(Function1<? super AddressListState, AddressListState> function1) {
        setState(function1);
    }

    @Override // X.InterfaceC975703rf
    public void Pg1(Address address) {
        setState(new AwS367S0200000_1(this, address, 36));
    }

    @Override // X.InterfaceC975703rf
    public List<InterfaceC1891350zJl> RL0(AddressListData addressListData) {
        ArrayList arrayList = new ArrayList();
        ml(new AwS210S0300000_1((InterfaceC975703rf) this, (InterfaceC975703rf) arrayList, (List<InterfaceC1891350zJl>) addressListData, (AddressListData) 8));
        return arrayList;
    }

    @Override // X.InterfaceC975703rf
    public final void SB1(int i) {
        setState(new AwS16S0001000_1(i, 0));
    }

    @Override // X.InterfaceC975703rf
    public final void Tc0(int i) {
        this.LLJILJILJ = i;
    }

    @Override // X.InterfaceC975703rf
    public final void UC2(boolean z) {
        this.LLJJJJLIIL = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    @Override // X.InterfaceC975703rf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String gT1(java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress> r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L23
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L23
            r0 = 0
        La:
            r2 = 0
            if (r0 != 0) goto L22
            java.lang.Integer r0 = r4.LLJJIII
            if (r0 == 0) goto L22
            int r1 = r0.intValue()
            r0 = 4
            if (r1 != r0) goto L22
            java.lang.String r0 = r4.LL
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L25
            java.lang.String r2 = r4.LL
        L22:
            return r2
        L23:
            r0 = 1
            goto La
        L25:
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r3, r5)
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress r0 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress) r0
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r1 = r0.address
            if (r1 == 0) goto L3d
            java.lang.String r0 = r1.id
        L33:
            r4.LL = r0
            if (r1 == 0) goto L39
            java.lang.String r2 = r1.addressId
        L39:
            r4.LLILLJJLI = r2
            return r0
        L3c:
            r1 = r2
        L3d:
            r0 = r2
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel.gT1(java.util.List):java.lang.String");
    }

    @Override // X.InterfaceC975703rf
    public final void jp1(AddressListData addressListData) {
        this.LLJJIJIIJIL = addressListData;
    }

    @Override // X.InterfaceC975703rf
    public final void ml(Function1<? super AddressListState, Unit> function1) {
        function1.invoke(this.vmDispatcher.getState());
    }

    public final void vQ2(String str) {
        String str2 = this.LLIZ;
        if (str2 != null) {
            ClaimIncentiveWithAddressRequest claimIncentiveWithAddressRequest = new ClaimIncentiveWithAddressRequest(str2, str, C1747870vaL.LIZ);
            AddressApi.LIZ.getClass();
            ((AddressApi) C980703sT.LIZIZ.create(AddressApi.class)).mt(claimIncentiveWithAddressRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.03rx
                @Override // X.C09JN
                public final void accept(Object obj) {
                    ClaimIncentiveWithAddressResponseData claimIncentiveWithAddressResponseData;
                    Integer num;
                    NoticeDialogMessage noticeDialogMessage;
                    ExceptionUX exceptionUX;
                    C1C7U.LIZ("IAddressListViewModel@9425.claimIncentive$1$1");
                    Response response = (Response) ((C0X52) obj).LIZIZ;
                    ClaimIncentiveWithAddressResponseData claimIncentiveWithAddressResponseData2 = (ClaimIncentiveWithAddressResponseData) response.data;
                    if (claimIncentiveWithAddressResponseData2 != null) {
                        if (claimIncentiveWithAddressResponseData2.exceptionUX != null) {
                            if (claimIncentiveWithAddressResponseData2 != null && (exceptionUX = claimIncentiveWithAddressResponseData2.exceptionUX) != null) {
                                AnonymousClass0378.LIZ().LIZ("ec_show_notice_exception_ux_dialog", C1741890vQh.LJIIIIZZ(exceptionUX));
                            }
                        } else if (claimIncentiveWithAddressResponseData2 != null && (noticeDialogMessage = claimIncentiveWithAddressResponseData2.noticeDialogMessage) != null) {
                            AnonymousClass0378.LIZ().LIZ("ec_show_notice_dialog", C1741890vQh.LJIIIIZZ(noticeDialogMessage));
                        }
                    }
                    if (response.isCodeOK() && (claimIncentiveWithAddressResponseData = (ClaimIncentiveWithAddressResponseData) response.data) != null && (num = claimIncentiveWithAddressResponseData.resultCode) != null && num.intValue() == 0) {
                        AnonymousClass0378.LIZ().LIZ("lucky_bag_address_confirmed", "{}");
                    }
                    C1C7U.LIZIZ("IAddressListViewModel@9425.claimIncentive$1$1");
                }
            }, new C09JN() { // from class: X.00mF
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("IAddressListViewModel@9425.claimIncentive$1$2");
                    C1AF0.LJFF((Throwable) obj, "claimIncentive error");
                    C1C7U.LIZIZ("IAddressListViewModel@9425.claimIncentive$1$2");
                }
            });
        }
    }

    @Override // X.InterfaceC975703rf
    public final void W6(CoroutineContext coroutineContext, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        C948503nH.LJI(this, coroutineContext, function2);
    }

    @Override // X.InterfaceC975703rf
    public final Object eF0(InterfaceC1364105Vn interfaceC1364105Vn, C975903rh c975903rh) {
        return C975803rg.LIZJ(c975903rh, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC975703rf
    public final void mC2(View view, Address address) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Context context = view.getContext();
        if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            String strLIZ = C03WM.LIZ(address.deliveryInstructionInfo);
            HashMap map = new HashMap();
            map.put("previous_page", "shipping_info");
            C1746630vYL.LIZ(supportFragmentManager, new C1747010vYx(null, address, 1, "shipping_info", strLIZ, null, map, 33), new AwS580S0100000_1((InterfaceC975703rf) this, 63));
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_address_change")) {
            int i = C862003Yk.LIZ(str2).type;
            if (i != 0 && i != 1) {
                if (i == 2) {
                    It0(null);
                    return;
                }
                return;
            }
            It0(null);
        }
    }

    @Override // X.InterfaceC975703rf
    public final void wX1(Address address, AwS5S1500000_1 awS5S1500000_1) {
        C948503nH.LJI(this, C0PEM.LIZJ, new C976103rj(address, this, awS5S1500000_1, null));
    }

    public static void yQ2(Context context, ExceptionUX exceptionUX, Function0 function0) {
        Integer num;
        Integer num2;
        if (context != null && (num = exceptionUX.exceptionUXType) != null) {
            if (num.intValue() == 0) {
                C03U3.LIZ.LIZLLL(context, exceptionUX, AFwS185S0000000_1.get$arr$(26));
                return;
            }
            int iIntValue = num.intValue();
            boolean z = true;
            if (iIntValue != 1) {
                return;
            }
            C03U3 c03u3 = C03U3.LIZ;
            C03DB c03db = C03DB.FROM_OSP;
            AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(28);
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(function0, (Function0<Unit>) 60);
            AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(41);
            DialogContent dialogContent = exceptionUX.dialogContent;
            if (dialogContent == null || (num2 = dialogContent.maskStyle) == null || num2.intValue() != 1) {
                z = false;
            }
            c03u3.LIZJ(c03db, context, exceptionUX, aFwS185S0000000_1, awS545S0100000_1, aFwS228S0000000_1, Boolean.valueOf(z));
        }
    }

    public final void wQ2(AddressPageStarter.AddressListEnterParams addressListEnterParams, String str, String str2) {
        boolean updateCache;
        int iIsSelectMode;
        boolean z;
        Boolean forceEditMode;
        Boolean boolValueOf;
        String incentiveRecordId;
        String productId;
        Integer freeShipping;
        String trackParams;
        Object obj;
        Integer scene;
        String sceneParamsStr;
        boolean z2;
        Integer selectScene;
        Map<String, String> map;
        Boolean needTaxIdItem;
        int addressEntranceScene;
        Integer addressSelectScene;
        Object obj2;
        String extraInfo;
        Type type;
        Integer markUnavailableAddress;
        String trackParams2;
        String trackParams3;
        HashMap<String, Object> mapLJIIJ;
        String str3 = str2;
        if (addressListEnterParams != null) {
            updateCache = addressListEnterParams.getUpdateCache();
        } else {
            updateCache = false;
        }
        this.LLJJJJ = updateCache;
        if (addressListEnterParams != null) {
            iIsSelectMode = addressListEnterParams.isSelectMode();
        } else {
            iIsSelectMode = 0;
        }
        if (iIsSelectMode == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLILLL = z;
        if (addressListEnterParams != null) {
            forceEditMode = addressListEnterParams.getForceEditMode();
        } else {
            forceEditMode = null;
        }
        this.LLILZ = forceEditMode;
        if (addressListEnterParams != null) {
            boolValueOf = Boolean.valueOf(addressListEnterParams.getFromClaimIncentive());
        } else {
            boolValueOf = Boolean.FALSE;
        }
        this.LLILZLL = boolValueOf;
        if (boolValueOf != null) {
            boolean zBooleanValue = boolValueOf.booleanValue();
            if (!this.LLILLL) {
                this.LLILLL = zBooleanValue;
            }
        }
        if (addressListEnterParams != null) {
            incentiveRecordId = addressListEnterParams.getIncentiveRecordId();
        } else {
            incentiveRecordId = null;
        }
        this.LLIZ = incentiveRecordId;
        if (addressListEnterParams != null) {
            productId = addressListEnterParams.getProductId();
        } else {
            productId = null;
        }
        this.LLIZLLLIL = productId;
        if (addressListEnterParams != null) {
            freeShipping = addressListEnterParams.getFreeShipping();
        } else {
            freeShipping = null;
        }
        this.LLJ = freeShipping;
        if (addressListEnterParams == null) {
            trackParams = null;
        } else {
            try {
                trackParams = addressListEnterParams.getTrackParams();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR63;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("exception: ");
                sbLIZ.append(e.getMessage());
                sbLIZ.append(",  trackParams: ");
                if (addressListEnterParams != null) {
                    trackParams2 = addressListEnterParams.getTrackParams();
                } else {
                    trackParams2 = null;
                }
                sbLIZ.append(trackParams2);
                C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), null);
            }
        }
        HashMap<String, Object> mapLJIIJ2 = C1741890vQh.LJIIJ(trackParams);
        this.LLILZIL = mapLJIIJ2;
        if (mapLJIIJ2 == null && addressListEnterParams != null && (trackParams3 = addressListEnterParams.getTrackParams()) != null) {
            String strDecode = URLDecoder.decode(trackParams3, "UTF-8");
            if (strDecode != null) {
                mapLJIIJ = C1741890vQh.LJIIJ(strDecode);
            } else {
                mapLJIIJ = null;
            }
            this.LLILZIL = mapLJIIJ;
        }
        HashMap<String, Object> map2 = this.LLILZIL;
        if (map2 != null) {
            obj = map2.get("previous_page");
        } else {
            obj = null;
        }
        boolean z3 = obj instanceof String;
        if ((str3 != null || (str != null && (str3 = (String) C993603uY.LIZ(str, "current_select_address_id")) != null)) && str3.length() != 0) {
            setState(new AwS52S1000000_1(str3, 3));
        } else {
            C973303rH.LL.getClass();
            String str4 = C973303rH.LLILLJJLI;
            if (str4 != null) {
                setState(new AwS52S1000000_1(str4, 4));
            }
        }
        if (addressListEnterParams != null) {
            scene = addressListEnterParams.getScene();
        } else {
            scene = null;
        }
        this.LLJJ = scene;
        if (addressListEnterParams != null) {
            sceneParamsStr = addressListEnterParams.getSceneParamsStr();
        } else {
            sceneParamsStr = null;
        }
        this.LLJJI = sceneParamsStr;
        if (addressListEnterParams != null && (markUnavailableAddress = addressListEnterParams.getMarkUnavailableAddress()) != null && markUnavailableAddress.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJILJIL = z2;
        if (addressListEnterParams != null) {
            selectScene = addressListEnterParams.getSelectScene();
        } else {
            selectScene = null;
        }
        this.LLJJIII = selectScene;
        if (addressListEnterParams != null && (extraInfo = addressListEnterParams.getExtraInfo()) != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    C13JX c13jx = KTypeProjection.LIZJ;
                    C13JW c13jwLJII = C13LE.LJII(String.class);
                    c13jx.getClass();
                    type = C2371409Qy.LIZJ(C13LE.LJIIIZ(Map.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(String.class))));
                } else {
                    type = new TypeToken<Map<String, ? extends String>>() { // from class: X.03rt
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, extraInfo, type);
                if (!(objFromJson instanceof Map)) {
                    objFromJson = null;
                }
                map = (Map) objFromJson;
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
                map = null;
            }
        } else {
            map = null;
        }
        this.LLJJIJI = map;
        if (addressListEnterParams != null) {
            needTaxIdItem = addressListEnterParams.getNeedTaxIdItem();
        } else {
            needTaxIdItem = null;
        }
        this.LLJJJIL = needTaxIdItem;
        if (addressListEnterParams == null || (addressEntranceScene = addressListEnterParams.getAddressEntranceScene()) == null) {
            addressEntranceScene = 0;
        }
        this.LLJJJ = addressEntranceScene;
        if (addressListEnterParams != null) {
            addressSelectScene = addressListEnterParams.getAddressSelectScene();
        } else {
            addressSelectScene = null;
        }
        this.LLJJL = addressSelectScene;
        if (((AddressListCacheConfig) C962403pW.LIZIZ.getValue()).listPreloadEnable == 1) {
            HashMap<String, Object> map3 = this.LLILZIL;
            if (map3 == null || (obj2 = map3.get("previous_page")) == null) {
                obj2 = " ";
            }
            String str5 = (String) obj2;
            C7879035x.LIZ();
            try {
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (!C036E.LIZ.LIZIZ()) {
                C977303rv.LIZ(C977303rv.LIZ, 0, "network", str5, null, 8);
            } else if (C123100dR.LIZ(this.LLIZ)) {
                C977303rv.LIZ(C977303rv.LIZ, 0, "claim", str5, null, 8);
            } else {
                SB1(0);
                C948503nH.LJI(this, C0PEM.LIZJ, new C975303rb(this, str5, null));
            }
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_address_change", this);
        C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.03rr
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                C1746550vYD c1746550vYD = C1746550vYD.LIZ;
                InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this.LL);
                c1746550vYD.getClass();
                C1746550vYD.LIZJ(6, "shipping_info", viewModelScope);
                return false;
            }
        }, Looper.myQueue());
    }

    public void xQ2(C19EG c19eg, InterfaceC1748810vbr interfaceC1748810vbr, AwS545S0100000_1 awS545S0100000_1) {
        this.LLJILLL = true;
        AwS367S0200000_1 awS367S0200000_1 = new AwS367S0200000_1((InterfaceC975703rf) this, awS545S0100000_1, 37);
        if (interfaceC1748810vbr != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbr, new C049Y(), new AwS580S0100000_1((InterfaceC975703rf) this, 64));
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C948503nH.LJI(this, C2107308Nj.LIZ, new C976003ri(this, c19eg, interfaceC1748810vbr, awS367S0200000_1, null));
    }

    @Override // X.InterfaceC975703rf
    public final void e81(Activity activity, InterfaceC1748810vbr interfaceC1748810vbr, String str, String str2) {
        String strLJIIIIZZ;
        Address address;
        String strLIZJ;
        boolean z;
        HashMap<String, Object> map;
        if (interfaceC1748810vbr != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbr, new C049Y(), new AwS115S1100000_1(this, str, 8));
        }
        if (((ArrayList) this.LLJI).size() >= this.LLJILJILJ) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(activity.getString(2131832690));
            c1389890mGx.LJIIJJI();
            return;
        }
        HashMap<String, Object> map2 = this.LLILZIL;
        if (map2 != null) {
            map2.put("previous_page", "shipping_info");
        }
        Integer num = this.LLJJJ;
        if (num != null && num.intValue() == 8 && (map = this.LLILZIL) != null) {
            String str3 = this.LLIZLLLIL;
            if (str3 == null) {
                str3 = "";
            }
            map.put("product_id", str3);
        }
        AddressPageStarter addressPageStarter = AddressPageStarter.LIZ;
        HashMap<String, Object> map3 = this.LLILZIL;
        if (map3 != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map3);
        } else {
            strLJIIIIZZ = null;
        }
        if (((ArrayList) this.LLJI).size() > 0) {
            address = ((ReachableAddress) ListProtector.get(this.LLJI, 0)).address;
        } else {
            address = null;
        }
        Integer num2 = this.LLJ;
        Integer num3 = this.LLJJJ;
        if (str != null) {
            strLIZJ = this.LLJJJJJIL.LIZJ(str, null);
        } else {
            strLIZJ = null;
        }
        if (((ArrayList) this.LLJI).size() > 0) {
            z = true;
        } else {
            z = false;
        }
        AddressPageStarter.LIZ(addressPageStarter, activity, interfaceC1748810vbr, null, null, true, strLJIIIIZZ, null, null, null, false, 0, null, null, null, num2, address, null, null, num3, false, strLIZJ, null, null, z, str2, null, null, this.LLJJJIL, null, null, 912998348);
    }

    @Override // X.InterfaceC975703rf
    public final void KM(Context context, InterfaceC1748810vbr interfaceC1748810vbr, Address address, String str, Integer num, Integer num2, String str2, String str3, String str4, Map<String, String> map) {
        String strLJIIIIZZ;
        HashMap<String, Object> map2;
        String strLIZIZ = str3;
        HashMap<String, Object> map3 = this.LLILZIL;
        if (map3 != null) {
            map3.put("previous_page", "shipping_info");
        }
        Integer num3 = this.LLJJJ;
        if (num3 != null && num3.intValue() == 8 && (map2 = this.LLILZIL) != null) {
            String str5 = this.LLIZLLLIL;
            if (str5 == null) {
                str5 = "";
            }
            map2.put("product_id", str5);
        }
        AddressPageStarter addressPageStarter = AddressPageStarter.LIZ;
        HashMap<String, Object> map4 = this.LLILZIL;
        if (map4 != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map4);
        } else {
            strLJIIIIZZ = null;
        }
        Integer num4 = this.LLJ;
        Integer num5 = this.LLJJJ;
        C817603Hi c817603Hi = this.LLJJJJJIL;
        if (strLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("c2393.d5331_i");
            sbLIZ.append(num2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        AddressPageStarter.LIZ(addressPageStarter, context, interfaceC1748810vbr, address, null, true, strLJIIIIZZ, null, null, null, false, 0, str4, null, null, num4, null, str, num, num5, false, c817603Hi.LIZJ(strLIZIZ, null), null, null, true, null, null, null, this.LLJJJIL, str2, map, 124303304);
    }
}
