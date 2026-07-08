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
public final class IntegerDefaultZeroAdater implements r<Integer>, j<Integer> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        return new q((Number) obj);
    }

    @Override // com.google.gson.j
    public final Integer deserialize(k kVar, Type type, i iVar) {
        try {
            if (Intrinsics.LJFF(kVar.LJIL(), "") || Intrinsics.LJFF(kVar.LJIL(), "null")) {
                return 0;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            return Integer.valueOf(kVar.LJIIJJI());
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new s(e2);
        }
    }
}
