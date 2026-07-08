package com.ss.android.ugc.aweme.ecommerce.ug.common.jsb;

import X.AbstractC1538480q8c;
import X.AnonymousClass1577;
import X.C1057770ddH;
import X.C1514320pVe;
import X.C1538420q8W;
import X.C1540260qBU;
import X.C1697810uHb;
import X.C1739850vNP;
import X.C1758930vsB;
import X.C1801550wyv;
import X.InterfaceC1063710dmr;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class EcommerceUgJSBridgeServiceImpl implements IEcommerceInternalJSBridgeService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final List<Class<? extends InterfaceC1063710dmr>> LIZ() {
        C1538420q8W.LIZ(new AbstractC1538480q8c() { // from class: X.0qB4
            /* JADX WARN: Type inference failed for: r1v0, types: [X.0qBU] */
            {
                this.LIZ = "ec_prefetch_data_merge";
                C1877360yxC.LIZ();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C1877360yxC.LIZJ);
                final ?? r1 = new AbstractC1540250qBT() { // from class: X.0qBU
                    @Override // X.AbstractC1549150qPp
                    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
                        String containerID;
                        String containerID2;
                        String containerID3;
                        InterfaceC1540270qBV interfaceC1540270qBV = (InterfaceC1540270qBV) xBaseParamModel;
                        try {
                            String channel = interfaceC1540270qBV.getChannel();
                            String data = interfaceC1540270qBV.getData();
                            Boolean clear = interfaceC1540270qBV.getClear();
                            String uniqueKey = interfaceC1540270qBV.getUniqueKey();
                            String source = interfaceC1540270qBV.getSource();
                            if (C290090BYp.LIZ) {
                                if (channel != null && !a0.LJJJIL(channel)) {
                                    if (Intrinsics.LJFF(clear, Boolean.TRUE)) {
                                        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                                        if (interfaceC634840OvC != null) {
                                            containerID3 = interfaceC634840OvC.getContainerID();
                                        } else {
                                            containerID3 = null;
                                        }
                                        C1740060vNk.LIZ.getClass();
                                        C1740060vNk.LIZLLL(channel, uniqueKey, source, containerID3);
                                        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1540280qBW.class, containerID3);
                                        ((InterfaceC1540280qBW) xBaseModelLIZJ).setStatus("clear_success");
                                        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                                        return;
                                    }
                                    if (data != null) {
                                        C1740060vNk.LIZ.getClass();
                                        Pair pairLJ = C1740060vNk.LJ(channel, data, uniqueKey, source);
                                        boolean zBooleanValue = ((Boolean) pairLJ.getFirst()).booleanValue();
                                        String str = (String) pairLJ.getSecond();
                                        if (zBooleanValue) {
                                            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                                            if (interfaceC634840OvC2 != null) {
                                                containerID2 = interfaceC634840OvC2.getContainerID();
                                            } else {
                                                containerID2 = null;
                                            }
                                            XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1540280qBW.class, containerID2);
                                            ((InterfaceC1540280qBW) xBaseModelLIZJ2).setStatus("set_data_success");
                                            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                                            return;
                                        }
                                        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                                        if (interfaceC634840OvC3 != null) {
                                            containerID = interfaceC634840OvC3.getContainerID();
                                        } else {
                                            containerID = null;
                                        }
                                        XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(InterfaceC1540280qBW.class, containerID);
                                        ((InterfaceC1540280qBW) xBaseModelLIZJ3).setStatus(str);
                                        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ3, "");
                                        return;
                                    }
                                    C2382909Vj.LIZ(completionBlock, 0, "params wrong, no clear or data", null, 4);
                                    C1529960pus c1529960pus = C1529960pus.LIZ;
                                    if (source == null) {
                                        source = "mall_prefetch";
                                    }
                                    C1529960pus.LIZ(c1529960pus, "set_data", "fail", channel, source, "jsb no clear or data", null, 32);
                                    return;
                                }
                                C2382909Vj.LIZ(completionBlock, 0, "params wrong, channel is empty", null, 4);
                                return;
                            }
                            C2382909Vj.LIZ(completionBlock, 0, "not in experiment", null, 4);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C2382909Vj.LIZ(completionBlock, 0, "execute error", null, 4);
                        }
                    }
                };
                arrayList.add(new AbstractC1063600dmg() { // from class: X.0qB5
                    @Override // X.AbstractC1063600dmg, X.InterfaceC1063710dmr
                    public final EnumC1063530dmZ getAccess() {
                        return r1.LL;
                    }

                    @Override // X.InterfaceC1063710dmr
                    public final String getName() {
                        return getName();
                    }

                    @Override // X.InterfaceC1063710dmr
                    public final void realHandle(Map<String, ? extends Object> map, InterfaceC801410VcB interfaceC801410VcB, EnumC1063300dmC enumC1063300dmC) {
                        realHandle(map, interfaceC801410VcB, enumC1063300dmC);
                    }
                });
                this.LIZIZ = arrayList;
                Boolean bool = Boolean.TRUE;
                this.LIZLLL = bool;
                this.LJ = bool;
                this.LJFF = bool;
            }
        });
        return C1697810uHb.LJIIJJI(C1801550wyv.class, C1057770ddH.class, C1758930vsB.class, C1739850vNP.class, AnonymousClass1577.class, C1540260qBU.class, C1514320pVe.class);
    }
}
