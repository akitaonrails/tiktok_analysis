package com.ss.android.storage.cleaner;

import X.AbstractC2454309jZ;
import X.C0VSJ;
import X.C13BV;
import X.C2188811AlT;
import X.C844470XAv;
import X.EnumC1335420kr6;
import android.os.Build;
import java.io.File;
import java.util.Collections;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class DexStorageCleaner extends AbstractC2454309jZ {
    @Override // X.AbstractC2454309jZ, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        String parent;
        String str = Build.CPU_ABI;
        String strLJJZ = a0.LJJZ(str, "-", str);
        C844470XAv.LIZ.getClass();
        File parentFile = new C0VSJ(C844470XAv.LIZ().getApplicationInfo().nativeLibraryDir).getParentFile();
        if (parentFile == null || (parent = parentFile.getParent()) == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("oat/");
        sbLIZ.append(strLJJZ);
        return new C0VSJ(parent, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIL() {
        return Collections.singletonList(new C0VSJ(LJIIIIZZ(), "base.vdex"));
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIILJJIL() {
        return C13BV.INSTANCE;
    }
}
