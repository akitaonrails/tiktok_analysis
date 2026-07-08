package com.ss.android.ugc.aweme.minis.viewmodel;

import X.C11S5;
import X.C1701940uOG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2196951Ayb;
import X.EnumC1386420mBM;
import X.InterfaceC1386440mBO;
import X.InterfaceC19474811He;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.perf.prefetch.MinisPrefetchServiceImpl;
import com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class MinisViewModel extends AndroidViewModel {
    public static final /* synthetic */ int LLILZ = 0;
    public final C2196951Ayb LL;
    public final SingleLiveEvent<NetworkResponse<MinisMetaResp>> LLILLJJLI;
    public MinisMetaResp LLILLL;

    public MinisViewModel(Application application) {
        super(application);
        this.LL = new C2196951Ayb(application);
        this.LLILLJJLI = new SingleLiveEvent<>();
    }

    public void AQ2(NetworkResponse<MinisMetaResp> networkResponse) {
        this.LLILLJJLI.setValue(networkResponse);
    }

    public final void BQ2(MinisMetaResp minisMetaResp) {
        this.LLILLL = minisMetaResp;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMinisDataFromTokenLink, resp:");
        sbLIZ.append(minisMetaResp);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean xQ2(SchemaParserData schemaParserData) {
        Boolean boolValueOf;
        boolean z = true;
        if (schemaParserData == null || !schemaParserData.isFromTokenAppLink || this.LLILLL == null) {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isCanUseMetaDataFromTokenLink, useMetaFromTokenLink:");
        sbLIZ.append(z);
        sbLIZ.append(" isFromTokenAppLink:");
        if (schemaParserData != null) {
            boolValueOf = Boolean.valueOf(schemaParserData.isFromTokenAppLink);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }

    public static void zQ2(SchemaParserData schemaParserData, MinisMetaResp minisMetaResp) {
        Integer num = minisMetaResp.minisStatus;
        int iOrdinal = EnumC1386420mBM.MINIS_STATUS_ONLINE.ordinal();
        if (num != null && num.intValue() == iOrdinal && schemaParserData != null) {
            String str = minisMetaResp.config;
            String str2 = minisMetaResp.clientKey;
            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                MinisPrefetchServiceImpl.LIZLLL().LIZIZ(schemaParserData, str);
            }
        }
    }

    public void vQ2(final SchemaParserData schemaParserData, final InterfaceC1386440mBO interfaceC1386440mBO, final LinkedHashMap<String, String> linkedHashMap, final Function1<? super NetworkResponse<MinisMetaResp>, Unit> function1) {
        MinisMetaResp minisMetaResp;
        int i = C2187451AjH.LIZ;
        if (xQ2(schemaParserData) && (minisMetaResp = this.LLILLL) != null) {
            this.LL.getClass();
            NetworkResponse<MinisMetaResp> networkResponseLIZIZ = C2196951Ayb.LIZIZ(minisMetaResp, 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchMetaData, onSuccess, metaRespFromTokenLink, response:");
            sbLIZ.append(networkResponseLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            AQ2(networkResponseLIZIZ);
            yQ2(schemaParserData, interfaceC1386440mBO, linkedHashMap, function1);
            MinisMetaResp minisMetaResp2 = networkResponseLIZIZ.data;
            if (minisMetaResp2 != null) {
                zQ2(schemaParserData, minisMetaResp2);
                return;
            }
            return;
        }
        this.LL.LJ(schemaParserData, linkedHashMap).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<NetworkResponse<MinisMetaResp>>() { // from class: X.0mBJ
            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fetchMetaData, onError:");
                sbLIZ2.append(th);
                C2188811AlT.LIZIZ(sbLIZ2);
                this.LL.AQ2(new NetworkResponse<>(null, -1, false, null, false, null, null));
            }

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                int i2 = C2187451AjH.LIZ;
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(NetworkResponse<MinisMetaResp> networkResponse) {
                NetworkResponse<MinisMetaResp> networkResponse2 = networkResponse;
                int i2 = C2187451AjH.LIZ;
                this.LL.AQ2(networkResponse2);
                if (networkResponse2.dataSourceFromDiskCache) {
                    this.LL.yQ2(schemaParserData, interfaceC1386440mBO, linkedHashMap, function1);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fetchMetaData, onSuccess, data:");
                sbLIZ2.append(networkResponse2.data);
                sbLIZ2.append(", dataSourceFromDiskCache:");
                sbLIZ2.append(networkResponse2.dataSourceFromDiskCache);
                C2188811AlT.LIZIZ(sbLIZ2);
                MinisMetaResp minisMetaResp3 = networkResponse2.data;
                if (minisMetaResp3 != null) {
                    MinisViewModel minisViewModel = this.LL;
                    SchemaParserData schemaParserData2 = schemaParserData;
                    minisViewModel.getClass();
                    MinisViewModel.zQ2(schemaParserData2, minisMetaResp3);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[PHI: r6
      0x007d: PHI (r6v4 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:24:0x007b, B:22:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[PHI: r6
      0x0081: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:24:0x007b, B:26:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[PHI: r3 r6
      0x0084: PHI (r3v0 java.lang.String) = (r3v3 java.lang.String), (r3v4 java.lang.String) binds: [B:28:0x0082, B:26:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r6v1 java.lang.String) = (r6v3 java.lang.String), (r6v4 java.lang.String) binds: [B:28:0x0082, B:26:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(com.ss.android.ugc.aweme.minis.common.SchemaParserData r25, X.C1378790lz3 r26, java.lang.String r27, X.InterfaceC1378930lzH r28) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel.wQ2(com.ss.android.ugc.aweme.minis.common.SchemaParserData, X.0lz3, java.lang.String, X.0lzH):void");
    }

    public final void yQ2(final SchemaParserData schemaParserData, final InterfaceC1386440mBO interfaceC1386440mBO, LinkedHashMap<String, String> linkedHashMap, final Function1<? super NetworkResponse<MinisMetaResp>, Unit> function1) {
        int i = C2187451AjH.LIZ;
        final boolean zXQ2 = xQ2(schemaParserData);
        C2196951Ayb.LIZLLL(this.LL, schemaParserData, false, linkedHashMap, 2).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<NetworkResponse<MinisMetaResp>>() { // from class: X.0mBL
            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("justFetchMetaDataForNextTimeUse, onError:");
                sbLIZ.append(th);
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                int i2 = C2187451AjH.LIZ;
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(NetworkResponse<MinisMetaResp> networkResponse) {
                Integer num;
                NetworkResponse<MinisMetaResp> networkResponse2 = networkResponse;
                if (!zXQ2) {
                    MinisMetaResp minisMetaResp = networkResponse2.data;
                    if (minisMetaResp != null) {
                        num = minisMetaResp.minisStatus;
                    } else {
                        num = null;
                    }
                    int iOrdinal = EnumC1386420mBM.MINIS_STATUS_OFFLINE.ordinal();
                    if (num != null && num.intValue() == iOrdinal) {
                        interfaceC1386440mBO.uA(EnumC1386450mBP.ERROR_OFFLINE_NOT_AVAILABLE, 202, null);
                    } else {
                        int iOrdinal2 = EnumC1386420mBM.MINIS_STATUS_OFFLINE_BY_VIOLATION.ordinal();
                        if (num != null && num.intValue() == iOrdinal2) {
                            interfaceC1386440mBO.uA(EnumC1386450mBP.ERROR_OFFLINE_BY_VIOLATION, 208, null);
                        } else {
                            int iOrdinal3 = EnumC1386420mBM.MINIS_STATUS_UNSUPPORTED_REGION.ordinal();
                            if (num != null && num.intValue() == iOrdinal3) {
                                interfaceC1386440mBO.uA(EnumC1386450mBP.ERROR_REGION_NOT_AVAILABLE, 204, null);
                            } else {
                                int iOrdinal4 = EnumC1386420mBM.MINIS_STATUS_NO_PERMISSION.ordinal();
                                if (num != null && num.intValue() == iOrdinal4) {
                                    interfaceC1386440mBO.uA(EnumC1386450mBP.ERROR_NO_PERMISSION, 203, null);
                                } else {
                                    int iOrdinal5 = EnumC1386420mBM.MINIS_STATUS_AGE_LIMITATION.ordinal();
                                    if (num != null && num.intValue() == iOrdinal5) {
                                        interfaceC1386440mBO.uA(EnumC1386450mBP.ERROR_AGE_GATE_LIMITATION, 205, null);
                                    } else {
                                        int iOrdinal6 = EnumC1386420mBM.MINIS_STATUS_APP_VERSION_NOT_SUPPORTED.ordinal();
                                        if (num != null && num.intValue() == iOrdinal6) {
                                            interfaceC1386440mBO.uA(EnumC1386450mBP.ERROR_APP_VERSION_NOT_SUPPORTED, 207, null);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("justFetchMetaDataForNextTimeUse, onSuccess:");
                sbLIZ.append(networkResponse2.data);
                C2188811AlT.LIZIZ(sbLIZ);
                MinisMetaResp minisMetaResp2 = networkResponse2.data;
                if (minisMetaResp2 != null) {
                    MinisViewModel minisViewModel = this;
                    SchemaParserData schemaParserData2 = schemaParserData;
                    minisViewModel.getClass();
                    MinisViewModel.zQ2(schemaParserData2, minisMetaResp2);
                }
                function1.invoke(networkResponse2);
            }
        });
    }
}
