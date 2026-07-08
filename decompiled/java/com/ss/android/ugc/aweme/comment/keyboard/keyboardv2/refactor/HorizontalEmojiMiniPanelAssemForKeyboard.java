package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C1351440lGw;
import X.C2217381BqS;
import X.C294400BgM;
import X.C736680Sv4;
import X.C736820SvI;
import android.view.View;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class HorizontalEmojiMiniPanelAssemForKeyboard extends HorizontalEmojiMiniPanelAssem {
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.HorizontalEmojiMiniPanelAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1351440lGw c1351440lGw;
        super.onViewCreated(view);
        if (C294400BgM.LIZ() && (c1351440lGw = this.LLJJIJI) != null) {
            c1351440lGw.setOriginalHeight(C1351440lGw.LLJJJJLIIL + C1351440lGw.LLJJL);
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0lAf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LLJILLL;
            }
        }, null, new AwS635S0100000_21(this, 29), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0lAe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJLL);
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 30), 4);
    }
}
