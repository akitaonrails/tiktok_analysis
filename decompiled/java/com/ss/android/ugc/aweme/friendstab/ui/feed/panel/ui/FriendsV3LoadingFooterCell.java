package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ui;

import X.EnumC1582450rHX;
import X.InterfaceC1582440rHW;
import android.view.View;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes25.dex */
public class FriendsV3LoadingFooterCell extends LoadingFooterCell {
    public EnumC1582450rHX LLILLJJLI = EnumC1582450rHX.LL;
    public boolean LLILLL;
    public InterfaceC1582440rHW LLILZ;

    @Override // com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell, com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        this.LLILLJJLI = EnumC1582450rHX.LLILZ;
        R5();
    }

    public final InterfaceC1582440rHW P5() {
        View view;
        Object parent = this.itemView.getParent();
        Object tag = (!(parent instanceof View) || (view = (View) parent) == null) ? null : view.getTag(R.id.ims);
        if (tag instanceof InterfaceC1582440rHW) {
            return (InterfaceC1582440rHW) tag;
        }
        return null;
    }

    public final void R5() {
        if (this.LLILLL) {
            this.LLILLL = false;
            InterfaceC1582440rHW interfaceC1582440rHWP5 = this.LLILZ;
            if (interfaceC1582440rHWP5 == null) {
                interfaceC1582440rHWP5 = P5();
            }
            this.LLILZ = null;
            if (interfaceC1582440rHWP5 != null) {
                interfaceC1582440rHWP5.LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell, com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        super.L5();
        this.LLILLJJLI = EnumC1582450rHX.LLILLL;
        R5();
    }

    @Override // com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell, com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        InterfaceC1582440rHW interfaceC1582440rHWP5;
        super.N5();
        this.LLILLJJLI = EnumC1582450rHX.LLILLJJLI;
        if (!this.itemView.isAttachedToWindow() || this.LLILLL || (interfaceC1582440rHWP5 = P5()) == null) {
            return;
        }
        this.LLILLL = true;
        this.LLILZ = interfaceC1582440rHWP5;
        interfaceC1582440rHWP5.LIZIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        InterfaceC1582440rHW interfaceC1582440rHWP5;
        super.onViewAttachedToWindow();
        if (this.LLILLJJLI != EnumC1582450rHX.LLILLJJLI || this.LLILLL || (interfaceC1582440rHWP5 = P5()) == null) {
            return;
        }
        this.LLILLL = true;
        this.LLILZ = interfaceC1582440rHWP5;
        interfaceC1582440rHWP5.LIZIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        R5();
        super.onViewDetachedFromWindow();
    }
}
