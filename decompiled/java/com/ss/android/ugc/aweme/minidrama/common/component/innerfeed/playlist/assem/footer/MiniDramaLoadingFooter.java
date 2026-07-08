package com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.assem.footer;

import X.C1390410mHn;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class MiniDramaLoadingFooter extends PowerLoadingCell {
    public static final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
    public C1390410mHn LL;

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = 0;
        C786410Ut5.W5(view, layoutParams);
        C1390410mHn c1390410mHn = this.LL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = LLILLJJLI;
        C786410Ut5.W5(view, layoutParams);
        C786410Ut5.LJLLLLLL(0, view);
        C1390410mHn c1390410mHn = this.LL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C1390410mHn) this.itemView.findViewById(R.id.gb5);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        L5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bbu, viewGroup, false);
    }
}
