package com.ss.android.ugc.tiktok.pns.services;

import X.C1227904rF;
import com.ss.android.ugc.tiktok.pns.FPGsonService;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class FPGsonServiceImpl implements FPGsonService {
    @Override // com.ss.android.ugc.tiktok.pns.FPGsonService
    public final String LIZJ(Object obj) {
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(obj);
        if (strLJI == null) {
            return "";
        }
        return strLJI;
    }

    @Override // com.ss.android.ugc.tiktok.pns.FPGsonService
    public final <T> T LIZLLL(String str, Class<T> cls) {
        C1227904rF.LIZ.getClass();
        return (T) C1227904rF.LIZIZ(str, cls);
    }

    @Override // com.ss.android.ugc.tiktok.pns.FPGsonService
    public final <T> T LJ(String str, Type type) {
        C1227904rF.LIZ.getClass();
        return (T) C1227904rF.LIZJ(str, type);
    }
}
