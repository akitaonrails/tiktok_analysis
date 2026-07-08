package com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage;

import X.C01GW;
import X.C13LE;
import X.C2217381BqS;
import X.C435700H6q;
import X.C452501pT;
import X.C462960IDm;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS110S0200000_6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class EmojiItemCell extends PowerCell<C435700H6q> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public TuxTextView LLILLJJLI;
    public final C462960IDm LL = new C462960IDm(this, 1);
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(199));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(198));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EmojiItemCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/homepage/EmojiItemControl;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C435700H6q c435700H6q = (C435700H6q) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c435700H6q.LL.text);
            C786410Ut5.h9(tuxTextView, new ACListenerS110S0200000_6(this, c435700H6q, 26));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setGravity(17);
        tuxTextView.setTextSize(0, ((Number) this.LLILLL.getValue()).floatValue());
        tuxTextView.setPadding(0, 0, 0, ((Number) this.LLILZ.getValue()).intValue());
        this.LLILLJJLI = tuxTextView;
        return tuxTextView;
    }
}
