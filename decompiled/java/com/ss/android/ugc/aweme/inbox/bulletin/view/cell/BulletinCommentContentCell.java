package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C0OS0;
import X.C0OS8;
import X.C0OSD;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C2211631BhB;
import X.C419910GdJ;
import X.C624550Oeb;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentContentCell extends BulletinCommentBaseCell<C0OS0> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a78;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new AbS691S0100000_9(this, 9), this.itemView);
        C2211631BhB.LJ(this.itemView, new AwS588S0100000_9(this, 190));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ImageUrlModel imageUrlModelLIZIZ;
        C0OS0 c0os0 = (C0OS0) interfaceC1891350zJl;
        TuxImageModel tuxImageModel = c0os0.LLILLL;
        String str = null;
        if (tuxImageModel != null) {
            imageUrlModelLIZIZ = C0OSD.LIZIZ(this.itemView.getContext(), tuxImageModel);
        } else {
            imageUrlModelLIZIZ = null;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZIZ);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIIZZ.LJJIIZI(c419910GdJ.LIZ(this.itemView.getContext()));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIIZZ.LJIL(c419910GdJ2.LIZ(this.itemView.getContext()));
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.e_j);
        if (smartImageView == null) {
            smartImageView = null;
        }
        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
        c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
        if (C0OS8.LIZ()) {
            c1331670kl3LJIIIIZZ.LJIIJJI();
        } else {
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        TextView textView = (TextView) this.itemView.findViewById(R.id.edy);
        if (textView != null) {
            textView.setText(c0os0.LLILLJJLI);
        }
        BulletinStyleTextModel bulletinStyleTextModel = c0os0.LLJI;
        if (bulletinStyleTextModel != null && bulletinStyleTextModel.color != null) {
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.edy);
            if (tuxTextView != null) {
                BulletinStyleTextModel bulletinStyleTextModel2 = c0os0.LLJI;
                if (bulletinStyleTextModel2 != null) {
                    str = bulletinStyleTextModel2.color;
                }
                C624550Oeb.LIZLLL(tuxTextView, str);
                return;
            }
            return;
        }
        if (((Boolean) this.LLILZLL.getValue()).booleanValue() && Intrinsics.LJFF(c0os0.LLILZ, "text")) {
            TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.edy);
            if (tuxTextView2 == null) {
                return;
            }
            tuxTextView2.setTextColorRes(R.attr.zi);
            return;
        }
        TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.edy);
        if (tuxTextView3 == null) {
            return;
        }
        tuxTextView3.setTextColorRes(R.attr.a1h);
    }
}
