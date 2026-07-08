package com.bytedance.android.livesdk.billboard.ui.cell;

import X.C01GW;
import X.C098200Yq;
import X.C1119540fEu;
import X.C1161920gLG;
import X.C189200o6;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.host.IHostTux;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS561S0100000_17;
import webcast.data.host_board.BoardCell;
import webcast.data.host_board.TuxIcon;

/* JADX INFO: loaded from: classes18.dex */
public final class TitleCell extends BillboardPowerCell<C1119540fEu> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 110));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 111));

    public final TuxTextView S5() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.android.livesdk.billboard.ui.cell.BillboardPowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: T5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1119540fEu c1119540fEu) {
        String str;
        Object c098200Yq;
        super.onBindItemView(c1119540fEu);
        BoardCell boardCell = c1119540fEu.LL;
        if (R5(S5(), boardCell, 12.0f)) {
            S5().setTextSize(1, 12.0f);
            S5().setMaxLines(1);
            S5().setEllipsize(null);
        } else if (R5(S5(), boardCell, 11.0f)) {
            S5().setTextSize(1, 11.0f);
            S5().setMaxLines(1);
            S5().setEllipsize(null);
        } else {
            S5().setTextSize(1, 12.0f);
            S5().setMaxLines(2);
            S5().setEllipsize(TextUtils.TruncateAt.END);
        }
        S5().setText(boardCell.text);
        TuxIcon tuxIcon = c1119540fEu.LL.icon;
        if (tuxIcon != null && (str = tuxIcon.tuxIconName) != null) {
            if (str.length() > 0) {
                try {
                    if (!((IHostTux) C1161920gLG.LIZJ(IHostTux.class)).Xl2((TuxIconView) this.LL.getValue(), str, this.itemView.getContext(), false)) {
                        C786410Ut5.LLLLLLZZ((TuxIconView) this.LL.getValue(), 8);
                    } else {
                        C786410Ut5.LLLLLLZZ((TuxIconView) this.LL.getValue(), 0);
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    C786410Ut5.LLLLLLZZ((TuxIconView) this.LL.getValue(), 8);
                    return;
                }
                return;
            }
            return;
        }
        C786410Ut5.LLLLLLZZ((TuxIconView) this.LL.getValue(), 8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g03, viewGroup, false);
    }

    public static boolean R5(TuxTextView tuxTextView, BoardCell boardCell, float f) {
        int i;
        if (boardCell.icon != null) {
            i = 82;
        } else {
            i = 101;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        TextPaint textPaint = new TextPaint(tuxTextView.getPaint());
        textPaint.setTextSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f))));
        if (textPaint.measureText(boardCell.text) <= (iLIZIZ - tuxTextView.getPaddingLeft()) - tuxTextView.getPaddingRight()) {
            return true;
        }
        return false;
    }
}
