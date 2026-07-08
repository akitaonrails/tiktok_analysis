package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C730100SkS;
import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryAnalyticsCell extends PowerCell<C730100SkS> {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fc1;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.a0q);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.ig9);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C730100SkS c730100SkS = (C730100SkS) interfaceC1891350zJl;
        super.onBindItemView(c730100SkS);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(String.valueOf(c730100SkS.LLILLJJLI));
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(String.valueOf(c730100SkS.LLILLL));
        }
    }
}
