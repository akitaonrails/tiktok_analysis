package com.ss.android.ugc.aweme.aiuikit.impl.input.mentionpanel.scene;

import X.C01GW;
import X.C427660Gpo;
import X.C452501pT;
import X.C555070Lpp;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class MentionPanelCell extends PowerCell<C555070Lpp> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 93));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 100));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 101));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 96));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 94));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 99));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 98));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 95));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 97));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.f860oc;
    }

    public final TuxTextView I5() {
        return (TuxTextView) this.LLIZLLLIL.getValue();
    }

    public final View L5() {
        return (View) this.LLILZ.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ((C427660Gpo) this.LL.getValue()).setSize(48);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0183  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r26) {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aiuikit.impl.input.mentionpanel.scene.MentionPanelCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f860oc, viewGroup, false);
    }
}
