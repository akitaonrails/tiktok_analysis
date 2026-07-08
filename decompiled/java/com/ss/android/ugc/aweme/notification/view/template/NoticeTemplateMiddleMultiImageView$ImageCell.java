package com.ss.android.ugc.aweme.notification.view.template;

import X.C06WS;
import X.C0DWH;
import X.C1324840ka2;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class NoticeTemplateMiddleMultiImageView$ImageCell extends PowerCell<C06WS> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C06WS c06ws = (C06WS) interfaceC1891350zJl;
        super.onBindItemView(c06ws);
        int width = this.itemView.getWidth();
        int i = C0DWH.LLILZLL;
        if (width != i) {
            View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            C786410Ut5.W5(view, layoutParams);
        }
        C1324840ka2.LJFF((RemoteImageView) this.itemView.findViewById(R.id.kb6), c06ws.LL);
        if (c06ws.LLILLJJLI > 0) {
            C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.fud));
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ol1), 0);
            TextView textView = (TextView) this.itemView.findViewById(R.id.ol1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('+');
            sbLIZ.append(c06ws.LLILLJJLI);
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.fud));
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ol1), 8);
        }
        View.OnClickListener onClickListener = c06ws.LLILLL;
        if (onClickListener != null) {
            C786410Ut5.I7(onClickListener, this.itemView);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aan, viewGroup, false);
    }
}
