package com.ss.android.ugc.aweme.services;

import X.C08KC;
import X.C0CHQ;
import X.C2107108Nh;
import X.InterfaceC2240308q9;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidAssetServiceImpl {
    public <T> T convertJsonToObject(String str, Class<T> cls) {
        return (T) convertJsonToObject(str, cls, new InterfaceC2240308q9<String, T>() { // from class: X.08q8
            @Override // X.InterfaceC2240308q9
            public final Object LIZ(String str2, Type type) {
                return GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), str2, TypeToken.get(type).getType());
            }
        });
    }

    public <T> T convertJsonToObject(String str, Class<T> cls, InterfaceC2240308q9<String, T> interfaceC2240308q9) throws Throwable {
        Reader inputStreamReader = new InputStreamReader(C0CHQ.LIZ.getAssets().open(str), Charsets.UTF_8);
        if (!(inputStreamReader instanceof BufferedReader)) {
            inputStreamReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            String strLIZJ = C08KC.LIZJ(inputStreamReader);
            C2107108Nh.LIZ(inputStreamReader, null);
            return interfaceC2240308q9.LIZ(strLIZJ, cls);
        } catch (Throwable th) {
            th = th;
            try {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(inputStreamReader, th);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = null;
                TryCatchGuardChecker.doCheck(th);
                C2107108Nh.LIZ(inputStreamReader, th);
                throw th;
            }
        }
    }
}
