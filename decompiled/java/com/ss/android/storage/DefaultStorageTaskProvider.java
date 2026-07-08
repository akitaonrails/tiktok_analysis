package com.ss.android.storage;

import X.C01GW;
import X.C1387310mCn;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2426509f5;
import X.C2428609fQ;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.legoapi.IStorageTaskApi;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultStorageTaskProvider implements IStorageTaskApi {
    @Override // com.ss.android.legoapi.IStorageTaskApi
    public final StorageTask LIZ() {
        return C2426509f5.LIZ();
    }

    @Override // com.ss.android.legoapi.IStorageTaskApi
    public final void LIZIZ(Context context) {
        C2426509f5.LIZ().run(context);
    }

    @Override // com.ss.android.legoapi.IStorageTaskApi
    public final void LIZJ(Context context) {
        C01GW c01gw = C2428609fQ.LIZIZ;
        if (((Number) c01gw.getValue()).longValue() == 0) {
            ((Keva) C2428609fQ.LIZ.getValue()).storeLong("prf_storage_info_last_time", System.currentTimeMillis());
            C2187451AjH.LJIIJ();
        } else if (C1387310mCn.LJFF(((Number) c01gw.getValue()).longValue())) {
            return;
        } else {
            ((Keva) C2428609fQ.LIZ.getValue()).storeLong("prf_storage_info_last_time", System.currentTimeMillis());
        }
        C20684815ws.LJFF().submit(new ARunnableS113S0100000_13(context, 18));
    }
}
