package com.ss.android.ugc.aweme.comment.sticker.typing;

import X.C1378990lzN;
import X.C418440Gaw;
import X.C452150HoD;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;

/* JADX INFO: loaded from: classes7.dex */
public final class TypingStickerPowerCell extends PowerCell<C452150HoD> {
    /* JADX WARN: Removed duplicated region for block: B:65:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0183  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r23) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.sticker.typing.TypingStickerPowerCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        SmartImageView smartImageView = new SmartImageView(viewGroup.getContext());
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        C786410Ut5.G6(smartImageView, layoutParams);
        C1378990lzN.LIZIZ(smartImageView, Float.valueOf(C418440Gaw.LIZIZ(4)), null, null, null, null, 30);
        smartImageView.setImportantForAccessibility(2);
        return smartImageView;
    }
}
