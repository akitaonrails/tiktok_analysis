package com.bytedance.pumbaa.impl.tt;

import com.bytedance.librarian.Librarian;
import com.bytedance.pumbaa.base2.interfaces.ISoLoader;

/* JADX INFO: loaded from: classes14.dex */
public final class TTSoLoader implements ISoLoader {
    @Override // com.bytedance.pumbaa.base2.interfaces.ISoLoader
    public final void loadSo(String str) {
        Librarian.LJFF(str);
    }
}
