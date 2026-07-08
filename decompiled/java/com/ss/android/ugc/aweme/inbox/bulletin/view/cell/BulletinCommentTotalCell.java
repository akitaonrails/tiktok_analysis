package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C619590ORx;
import X.C624550Oeb;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentTotalCell extends BulletinCommentBaseCell<C619590ORx> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a7_;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new AbS691S0100000_9(this, 10), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String strLJJIFFI;
        Resources resources;
        int i;
        String quantityString;
        C619590ORx c619590ORx = (C619590ORx) interfaceC1891350zJl;
        TextView textView = (TextView) this.itemView.findViewById(R.id.een);
        String str = null;
        if (textView != null) {
            Context context = this.itemView.getContext();
            if (context != null && (resources = context.getResources()) != null && (quantityString = resources.getQuantityString(2131755116, (i = c619590ORx.LL), Integer.valueOf(i))) != null) {
                strLJJIFFI = u.LJJIFFI(quantityString, "{num}", String.valueOf(c619590ORx.LL), false);
            } else {
                strLJJIFFI = null;
            }
            textView.setText(strLJJIFFI);
        }
        BulletinStyleTextModel bulletinStyleTextModel = c619590ORx.LLILLL;
        if (bulletinStyleTextModel != null && bulletinStyleTextModel.color != null) {
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.een);
            if (tuxTextView != null) {
                BulletinStyleTextModel bulletinStyleTextModel2 = c619590ORx.LLILLL;
                if (bulletinStyleTextModel2 != null) {
                    str = bulletinStyleTextModel2.color;
                }
                C624550Oeb.LIZLLL(tuxTextView, str);
                return;
            }
            return;
        }
        if (((Boolean) this.LLILZLL.getValue()).booleanValue() && Intrinsics.LJFF(c619590ORx.LLILLJJLI, "text")) {
            TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.een);
            if (tuxTextView2 == null) {
                return;
            }
            tuxTextView2.setTextColorRes(R.attr.zi);
            return;
        }
        TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.een);
        if (tuxTextView3 == null) {
            return;
        }
        tuxTextView3.setTextColorRes(R.attr.a1h);
    }
}
