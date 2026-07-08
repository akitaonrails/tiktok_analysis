package com.ss.android.ugc.aweme.music.ui.widget;

import X.C11FO;
import X.C11NJ;
import X.C1885907a5;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes30.dex */
public final class ThirdMusicViewHolder extends PowerCell<C1885907a5> {
    public C11FO LL;
    public View LLILLJJLI;
    public TuxTextView LLILLL;
    public View LLILZ;
    public Animation LLILZIL;
    public final C11NJ LLILZLL = new C11NJ();

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        this.LLILZLL.dispose();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r8) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.widget.ThirdMusicViewHolder.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dqh, viewGroup, false);
        this.LL = (C11FO) viewTd.findViewById(R.id.lr4);
        this.LLILLJJLI = viewTd.findViewById(R.id.lr5);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.lr6);
        this.LLILZ = viewTd.findViewById(R.id.vw_line_divider);
        this.LLILZIL = AnimationUtils.loadAnimation(viewGroup.getContext(), R.anim.dy);
        return viewTd;
    }
}
