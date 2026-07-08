package com.ss.android.ugc.aweme.legoImpl;

import X.C0CCZ;
import X.C1322210kVn;
import X.C1338960kwo;
import X.C2222891BzL;
import X.InterfaceC1322220kVo;
import X.InterfaceC1339090kx1;
import com.bytedance.librarian.Librarian;
import com.ss.android.legoapi.freso.IFrescoLegoTaskApi;
import com.ss.android.ugc.aweme.legoImpl.task.FrescoTask;

/* JADX INFO: loaded from: classes21.dex */
public final class FrescoLegoTaskImpl implements IFrescoLegoTaskApi {
    @Override // com.ss.android.legoapi.freso.IFrescoLegoTaskApi
    public final void LIZ() {
        if (C2222891BzL.LIZ.LJIIZILJ()) {
            C1322210kVn.LIZIZ = new InterfaceC1322220kVo() { // from class: X.0kww
                @Override // X.InterfaceC1322220kVo
                public final void loadLibrary(String str) {
                    Librarian.LJFF(str);
                }
            };
        }
        C1338960kwo.LIZJ = new InterfaceC1339090kx1() { // from class: X.0kwy
        };
    }

    @Override // com.ss.android.legoapi.freso.IFrescoLegoTaskApi
    public final C0CCZ LIZIZ() {
        return new FrescoTask();
    }
}
