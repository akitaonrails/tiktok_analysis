package com.ss.android.ugc.aweme.shortvideo.model;

import X.C2188811AlT;
import X.C2219091BtD;
import X.InterfaceC1463990oCT;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.e;
import com.google.gson.s;

/* JADX INFO: loaded from: classes4.dex */
public final class ExtractFramesModelExtKt {
    public static final ExtractFramesModel string2Model(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                return (ExtractFramesModel) GsonProtectorUtils.fromJson(new e().LIZ(), str, ExtractFramesModel.class);
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parser frames data error:\n");
                sbLIZ.append(str);
                interfaceC1463990oCTLIZLLL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return null;
    }
}
