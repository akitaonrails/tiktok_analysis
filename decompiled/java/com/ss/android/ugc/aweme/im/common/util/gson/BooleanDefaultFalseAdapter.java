package com.ss.android.ugc.aweme.im.common.util.gson;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.s;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BooleanDefaultFalseAdapter implements r<Boolean>, j<Boolean> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        return new q((Boolean) obj);
    }

    @Override // com.google.gson.j
    public final Boolean deserialize(k kVar, Type type, i iVar) {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!Intrinsics.LJFF(kVar.LJIL(), "") && !Intrinsics.LJFF(kVar.LJIL(), "null")) {
            if (kVar.LJIJ().intValue() != 0 && kVar.LJIIJJI() != 0) {
                if (kVar.LJIJ().intValue() == 1 || kVar.LJIIJJI() == 1) {
                    return Boolean.TRUE;
                }
                try {
                    return Boolean.valueOf(kVar.LJ());
                } catch (UnsupportedOperationException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new s(e2);
                }
            }
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }
}
