package com.ss.android.ugc.aweme.ecommerce.proto;

import X.AnonymousClass0957;
import X.C099G;
import X.C0IPS;
import X.C13BV;
import X.C1504180pFI;
import X.C1516980pZw;
import X.C1517020pa0;
import X.C1517090pa7;
import X.C1517130paB;
import X.C2188811AlT;
import X.C23250099c;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.proto.hybrid.EcHybridPbDecodeConfigModel;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomProtobufServiceImpl implements IEcomProtobufService {
    @Override // com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService
    public final boolean LIZIZ(String str) {
        String str2;
        AnonymousClass0957<File> anonymousClass0957;
        C1517130paB c1517130paB = C1517130paB.LIZ;
        EcHybridPbDecodeConfigModel ecHybridPbDecodeConfigModel = (EcHybridPbDecodeConfigModel) C1517020pa0.LIZ().get(str);
        if (ecHybridPbDecodeConfigModel != null && (str2 = ecHybridPbDecodeConfigModel.channelName) != null && (anonymousClass0957 = C1517130paB.LIZLLL.get(str2)) != null && anonymousClass0957.isCompleted()) {
            try {
                if (anonymousClass0957.LIZLLL() != null) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService
    public final C1504180pFI LIZJ(byte[] bArr) {
        try {
            C1517090pa7 c1517090pa7Decode = C1517090pa7.ADAPTER.decode(bArr);
            if (c1517090pa7Decode != null) {
                return new C1504180pFI(c1517090pa7Decode.code.intValue(), c1517090pa7Decode.message);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService
    public final boolean LJFF(String str) {
        EcHybridPbDecodeConfigModel ecHybridPbDecodeConfigModel = (EcHybridPbDecodeConfigModel) C1517020pa0.LIZ().get(str);
        if (ecHybridPbDecodeConfigModel != null && ecHybridPbDecodeConfigModel.enableNaPrefetch) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService
    public final void LJI(String str) {
        C1516980pZw.LIZ.getClass();
        C1516980pZw.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService
    public final boolean LIZLLL(String str, String str2) {
        EcHybridPbDecodeConfigModel ecHybridPbDecodeConfigModel = (EcHybridPbDecodeConfigModel) C1517020pa0.LIZ().get(str);
        if (ecHybridPbDecodeConfigModel == null || !ecHybridPbDecodeConfigModel.enableTranscode) {
            return false;
        }
        if (ecHybridPbDecodeConfigModel.transcodeFilterNot != null && (!a0.LJJJIL(r1))) {
            return !a0.LJJIIZI(str2, r1, false);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService
    public final void LJ(String str, String str2) {
        Object obj;
        Map map;
        C1517130paB c1517130paB = C1517130paB.LIZ;
        List<EcHybridPbDecodeConfigModel> list = (List) ((Map) C1517020pa0.LIZIZ.getValue()).get(str);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        for (EcHybridPbDecodeConfigModel ecHybridPbDecodeConfigModel : list) {
            Map<String, Object> map2 = ecHybridPbDecodeConfigModel.apiTriggerPreloadDisk;
            if (map2 != null) {
                obj = map2.get(str);
            } else {
                obj = null;
            }
            if ((obj instanceof Map) && (map = (Map) obj) != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str3 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Double) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str3);
                        sbLIZ.append('=');
                        sbLIZ.append((int) ((Number) value).doubleValue());
                        if (!a0.LJJIIZI(str2, C2188811AlT.LIZIZ(sbLIZ), false)) {
                            break;
                        }
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str3);
                        sbLIZ2.append('=');
                        sbLIZ2.append(value);
                        if (!a0.LJJIIZI(str2, C2188811AlT.LIZIZ(sbLIZ2), false)) {
                            break;
                        }
                    }
                }
            }
            String str4 = ecHybridPbDecodeConfigModel.channelName;
            if (str4 != null) {
                C1517130paB c1517130paB2 = C1517130paB.LIZ;
                C099G c099gLIZIZ = C1517130paB.LIZIZ(str4);
                AnonymousClass0957<File> anonymousClass0957PutIfAbsent = C1517130paB.LIZLLL.putIfAbsent(str4, c099gLIZIZ);
                if (anonymousClass0957PutIfAbsent == null) {
                    anonymousClass0957PutIfAbsent = c099gLIZIZ;
                }
                if (anonymousClass0957PutIfAbsent == c099gLIZIZ) {
                    c099gLIZIZ.start();
                    return;
                } else {
                    c099gLIZIZ.LIZIZ(null);
                    return;
                }
            }
            return;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService
    public final void onEvent(String str, JSONObject jSONObject) {
        Object obj;
        Map map;
        Set<Map.Entry> setEntrySet;
        String string;
        C1516980pZw.LIZ.getClass();
        if (str != null) {
            List<EcHybridPbDecodeConfigModel> list = (List) ((Map) C1517020pa0.LIZJ.getValue()).get(str);
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            for (EcHybridPbDecodeConfigModel ecHybridPbDecodeConfigModel : list) {
                Map<String, Object> map2 = ecHybridPbDecodeConfigModel.eventTriggerPreloadMemory;
                if (map2 != null) {
                    obj = map2.get(str);
                } else {
                    obj = null;
                }
                if (obj instanceof Map) {
                    map = (Map) obj;
                } else {
                    map = null;
                }
                if (jSONObject != null) {
                    if (map != null && (setEntrySet = map.entrySet()) != null) {
                        for (Map.Entry entry : setEntrySet) {
                            String str2 = (String) entry.getKey();
                            Object value = entry.getValue();
                            try {
                                if (value instanceof Double) {
                                    if (((int) ((Number) value).doubleValue()) == jSONObject.optInt(str2)) {
                                    }
                                } else {
                                    String string2 = value.toString();
                                    Object objOpt = jSONObject.opt(str2);
                                    if (objOpt != null) {
                                        string = objOpt.toString();
                                    } else {
                                        string = null;
                                    }
                                    if (!Intrinsics.LJFF(string2, string)) {
                                        break;
                                    }
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                    String str3 = ecHybridPbDecodeConfigModel.apiPath;
                    if (str3 != null) {
                        C23250099c.LIZLLL(C1516980pZw.LIZJ, null, null, new C0IPS(str3, null), 3);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    @Override // com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LIZ(java.lang.String r6, X.InterfaceC1507360pKQ<T> r7, byte[] r8, X.InterfaceC1364105Vn<? super T> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C1517010pZz
            if (r0 == 0) goto L55
            r4 = r9
            X.0pZz r4 = (X.C1517010pZz) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r3 = r4.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZLL
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 != r1) goto L85
            byte[] r8 = r4.LLILLL
            X.0pKQ r7 = r4.LLILLJJLI
            java.lang.Object r6 = r4.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r3)
        L2a:
            X.0pZp r3 = (X.InterfaceC1516910pZp) r3
            if (r3 == 0) goto L63
            java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r3.LIZ(r8)
            if (r0 == 0) goto L5b
            return r0
        L38:
            X.C155000ia.LIZIZ(r3)
            java.lang.System.currentTimeMillis()
            X.0pZw r0 = X.C1516980pZw.LIZ
            r4.LL = r6
            r4.LLILLJJLI = r7
            r4.LLILLL = r8
            r4.LLILZLL = r1
            r0.getClass()
            X.C1516980pZw.LIZLLL(r6, r7)
            java.lang.Object r3 = r0.LIZIZ(r7, r6, r4)
            if (r3 != r2) goto L2a
            return r2
        L55:
            X.0pZz r4 = new X.0pZz
            r4.<init>(r5, r9)
            goto L12
        L5b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "fail: decode result is null"
            r1.<init>(r0)
            throw r1
        L63:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fail: no decoder, apiPath="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", type="
            r1.append(r0)
            java.lang.String r0 = r7.getName()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.proto.EcomProtobufServiceImpl.LIZ(java.lang.String, X.0pKQ, byte[], X.05Vn):java.lang.Object");
    }
}
