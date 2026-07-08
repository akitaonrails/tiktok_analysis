package com.ss.android.ugc.aweme.comment.service;

import X.C1349270lDR;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.comment.services.IKeyboardService;

/* JADX INFO: loaded from: classes22.dex */
public final class KeyboardServiceImpl implements IKeyboardService {
    @Override // com.ss.android.ugc.aweme.comment.services.IKeyboardService
    public final int LIZJ(boolean z) {
        if (z) {
            int i = C1349270lDR.LJI;
            if (i <= 0) {
                return C1349270lDR.LIZJ(true);
            }
            return i;
        }
        return C1349270lDR.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.comment.services.IKeyboardService
    public final KeyboardFakePopupWindow LIZ(Context context, View view) {
        if (context == null || view == null) {
            return null;
        }
        return new KeyboardFakePopupWindow(context, view);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.IKeyboardService
    public final void LIZIZ(int i, boolean z) {
        if (z) {
            if (i != C1349270lDR.LJFF) {
                C1349270lDR.LJFF = i;
                if (i > 100) {
                    C1349270lDR.LIZIZ().storeInt("keyboard_height_portrait", i);
                    return;
                }
                return;
            }
            return;
        }
        if (i == C1349270lDR.LJI) {
            return;
        }
        C1349270lDR.LJI = i;
        if (i <= 100) {
            return;
        }
        C1349270lDR.LIZIZ().storeInt("keyboard_height_landscape", i);
    }
}
