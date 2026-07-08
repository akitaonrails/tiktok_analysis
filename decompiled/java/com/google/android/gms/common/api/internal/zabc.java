package com.google.android.gms.common.api.internal;

import X.C1C7U;
import X.C831920WkI;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zaq;

/* JADX INFO: loaded from: classes14.dex */
public final class zabc extends zaq {
    public final /* synthetic */ C831920WkI LL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C831920WkI c831920WkI;
        C1C7U.LIZ("zabc@ed7.handleMessage");
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                C1C7U.LIZIZ("zabc@ed7.handleMessage");
                return;
            }
            c831920WkI = this.LL;
            c831920WkI.LIZIZ.lock();
            try {
                if (c831920WkI.LJIIIIZZ) {
                    c831920WkI.LJIJI();
                }
                c831920WkI.LIZIZ.unlock();
                C1C7U.LIZIZ("zabc@ed7.handleMessage");
                return;
            } finally {
            }
        }
        c831920WkI = this.LL;
        c831920WkI.LIZIZ.lock();
        try {
            if (c831920WkI.LJIIZILJ()) {
                c831920WkI.LJIJI();
            }
            c831920WkI.LIZIZ.unlock();
            C1C7U.LIZIZ("zabc@ed7.handleMessage");
        } finally {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(C831920WkI c831920WkI, Looper looper) {
        super(looper);
        this.LL = c831920WkI;
    }
}
