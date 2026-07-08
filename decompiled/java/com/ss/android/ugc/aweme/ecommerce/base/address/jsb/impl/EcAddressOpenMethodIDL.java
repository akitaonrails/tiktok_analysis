package com.ss.android.ugc.aweme.ecommerce.base.address.jsb.impl;

import X.AbstractC949503nR;
import X.AnonymousClass0317;
import X.AnonymousClass0378;
import X.C034S;
import X.C03WM;
import X.C09CT;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1388190mED;
import X.C13LE;
import X.C13LP;
import X.C1741890vQh;
import X.C1744610vV5;
import X.C1746630vYL;
import X.C1747010vYx;
import X.C1909107dp;
import X.C19EG;
import X.C1AQS;
import X.C1AUL;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2371409Qy;
import X.C2382909Vj;
import X.EnumC1063300dmC;
import X.InterfaceC634840OvC;
import X.InterfaceC949703nT;
import X.InterfaceC949803nU;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstruction;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.RegionPickerModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.jsb.impl.EcAddressOpenMethodIDL;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EcAddressOpenMethodIDL extends AbstractC949503nR {
    public final C19EG LIZJ() {
        View view;
        Context context;
        C19EG c19egLIZIZ;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null && (context = view.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            return c19egLIZIZ;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        Context context2 = interfaceC634840OvC2 != null ? interfaceC634840OvC2.getContext() : null;
        if (context2 instanceof C19EG) {
            return (C19EG) context2;
        }
        return null;
    }

    public static void LIZLLL(String str, Map map) {
        AnonymousClass0378.LIZ().LIZ("ec_address_open_result", C1741890vQh.LJIIIIZZ(C2097608Jq.LJIIIIZZ(new Pair("result", map), new Pair("type", str))));
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Type type;
        Integer numLJIIJJI;
        HashMap map;
        View view;
        Type type2;
        String strCreateJumpSourceBtmToken;
        String str;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        InterfaceC949703nT interfaceC949703nT = (InterfaceC949703nT) xBaseParamModel;
        String type3 = interfaceC949703nT.getType();
        boolean zBooleanValue = false;
        if (Intrinsics.LJFF(type3, "phone_country_code")) {
            C19EG c19egLIZJ = LIZJ();
            if (c19egLIZJ == null) {
                C2382909Vj.LIZ(completionBlock, 0, "context is not activity", null, 4);
                return;
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = ILocationDependencyService.class.getName();
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
            }
            ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).openCountryListActivity(c19egLIZJ, new C1AUL() { // from class: X.03nS
                @Override // X.C1AUL
                public final void onExit() {
                }

                @Override // X.C1AUL
                public final void onChanged(String str2, String str3) {
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("country_name", str3), new Pair("code", str2));
                    this.LIZ.getClass();
                    EcAddressOpenMethodIDL.LIZLLL("phone_country_code", mapLJIIIIZZ);
                }
            });
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC949803nU.class, null), "");
            return;
        }
        if (Intrinsics.LJFF(type3, "region")) {
            String request = interfaceC949703nT.getRequest();
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                view = interfaceC634840OvC.getView();
            } else {
                view = null;
            }
            C19EG c19egLIZJ2 = LIZJ();
            if (c19egLIZJ2 != null && view != null) {
                try {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type2 = C2371409Qy.LIZJ(C13LE.LJII(RegionPickerModel.class));
                        } else {
                            type2 = new TypeToken<RegionPickerModel>() { // from class: X.03nW
                            }.getType();
                        }
                        Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(request, type2);
                        if (!(objLJIIIIZZ instanceof RegionPickerModel)) {
                            objLJIIIIZZ = null;
                        }
                        RegionPickerModel regionPickerModel = (RegionPickerModel) objLJIIIIZZ;
                        if (regionPickerModel != null) {
                            String str2 = regionPickerModel.btm;
                            if (str2 != null) {
                                strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken(str2, PageFinder.via(view), null);
                            } else {
                                strCreateJumpSourceBtmToken = null;
                            }
                            FragmentManager supportFragmentManager = c19egLIZJ2.getSupportFragmentManager();
                            AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(21);
                            AwS615S0100000_1 awS615S0100000_1 = new AwS615S0100000_1(this, 6);
                            List<Region> list = regionPickerModel.selectRegions;
                            String str3 = regionPickerModel.pageInfo;
                            String str4 = regionPickerModel.location;
                            Boolean bool = regionPickerModel.withoutNextLevel;
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            }
                            Integer num = regionPickerModel.addressEntranceScene;
                            Integer num2 = regionPickerModel.isAddressChangeAfterPay;
                            List<String> list2 = regionPickerModel.geoNameIDArray;
                            if (list2 != null) {
                                str = (String) C13LP.LJJJLL(list2);
                            } else {
                                str = null;
                            }
                            C1744610vV5.LIZIZ(0, str, list, Integer.MAX_VALUE, supportFragmentManager, str3, aFwS185S0000000_1, awS615S0100000_1, null, null, null, null, null, null, null, null, str4, null, zBooleanValue, num, num2, strCreateJumpSourceBtmToken, null, null, null, null, 252444163);
                            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC949803nU.class, null), "");
                            return;
                        }
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                C2382909Vj.LIZ(completionBlock, 0, "parse request failed", null, 4);
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "context is not activity", null, 4);
            return;
        }
        if (Intrinsics.LJFF(type3, "delivery_instruction")) {
            C19EG c19egLIZJ3 = LIZJ();
            if (c19egLIZJ3 == null) {
                C2382909Vj.LIZ(completionBlock, 0, "context is not activity", null, 4);
                return;
            }
            try {
                String request2 = interfaceC949703nT.getRequest();
                try {
                    Gson gsonLJFF2 = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(DeliveryInstructionOpenRequest.class));
                    } else {
                        type = new TypeToken<DeliveryInstructionOpenRequest>() { // from class: X.03nV
                        }.getType();
                    }
                    Object objLJIIIIZZ2 = gsonLJFF2.LJIIIIZZ(request2, type);
                    if (!(objLJIIIIZZ2 instanceof DeliveryInstructionOpenRequest)) {
                        objLJIIIIZZ2 = null;
                    }
                    DeliveryInstructionOpenRequest deliveryInstructionOpenRequest = (DeliveryInstructionOpenRequest) objLJIIIIZZ2;
                    if (deliveryInstructionOpenRequest != null) {
                        String str5 = deliveryInstructionOpenRequest.instructionType;
                        if (str5 != null) {
                            numLJIIJJI = C2095008Iq.LJIIJJI(str5);
                        } else {
                            numLJIIJJI = null;
                        }
                        DeliveryInstructionInfo deliveryInstructionInfo = new DeliveryInstructionInfo(numLJIIJJI, deliveryInstructionOpenRequest.instructionName, null, null, null);
                        FragmentManager supportFragmentManager2 = c19egLIZJ3.getSupportFragmentManager();
                        DeliveryInstruction deliveryInstruction = deliveryInstructionOpenRequest.deliveryInstruction;
                        String strLIZ = C03WM.LIZ(deliveryInstructionInfo);
                        Map<String, Object> map2 = deliveryInstructionOpenRequest.trackParams;
                        if (map2 != null) {
                            map = new HashMap(map2);
                        } else {
                            map = null;
                        }
                        C1746630vYL.LIZ(supportFragmentManager2, new C1747010vYx(deliveryInstruction, null, 0, null, strLIZ, deliveryInstructionInfo, map, 14), new AwS580S0100000_1(this, 55));
                        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC949803nU.class, null), "");
                        return;
                    }
                } catch (s e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            C2382909Vj.LIZ(completionBlock, 0, "parse request failed", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "not support this type", null, 4);
    }

    public static final class DeliveryInstructionOpenRequest {

        @C09CT("delivery_instruction")
        public final DeliveryInstruction deliveryInstruction;

        @C09CT("instruction_name")
        public final String instructionName;

        @C09CT("instruction_type")
        public final String instructionType;

        @C09CT("track_params")
        public final Map<String, Object> trackParams;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryInstructionOpenRequest)) {
                return false;
            }
            DeliveryInstructionOpenRequest deliveryInstructionOpenRequest = (DeliveryInstructionOpenRequest) obj;
            return Intrinsics.LJFF(this.deliveryInstruction, deliveryInstructionOpenRequest.deliveryInstruction) && Intrinsics.LJFF(this.instructionName, deliveryInstructionOpenRequest.instructionName) && Intrinsics.LJFF(this.instructionType, deliveryInstructionOpenRequest.instructionType) && Intrinsics.LJFF(this.trackParams, deliveryInstructionOpenRequest.trackParams);
        }

        public final int hashCode() {
            DeliveryInstruction deliveryInstruction = this.deliveryInstruction;
            int iHashCode = (deliveryInstruction == null ? 0 : deliveryInstruction.hashCode()) * 31;
            String str = this.instructionName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.instructionType;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, Object> map = this.trackParams;
            return iHashCode3 + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DeliveryInstructionOpenRequest(deliveryInstruction=");
            sbLIZ.append(this.deliveryInstruction);
            sbLIZ.append(", instructionName=");
            sbLIZ.append(this.instructionName);
            sbLIZ.append(", instructionType=");
            sbLIZ.append(this.instructionType);
            sbLIZ.append(", trackParams=");
            sbLIZ.append(this.trackParams);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public DeliveryInstructionOpenRequest(DeliveryInstruction deliveryInstruction, String str, String str2, Map<String, ? extends Object> map) {
            this.deliveryInstruction = deliveryInstruction;
            this.instructionName = str;
            this.instructionType = str2;
            this.trackParams = map;
        }
    }
}
