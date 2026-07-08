package com.ss.android.ugc.aweme.music.artist.powerlist;

import X.C01GW;
import X.C0HZQ;
import X.C1165860gRc;
import X.C1165870gRd;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS121S0200000_18;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ArtistMusicAwemeCell extends PowerCell<C1165860gRc> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 702));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 703));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 704));
    public C1165860gRc LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dpr;
    }

    public final C0HZQ I5() {
        return (C0HZQ) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1165860gRc c1165860gRc = (C1165860gRc) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c1165860gRc, this.LLILZ)) {
            this.LLILZ = c1165860gRc;
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c1165860gRc.LLILZ));
            c1331670kl3LJIIIIZZ.LIZLLL("ArtistMusicAwemeCell");
            c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LL.getValue());
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            C786410Ut5.LLLLLZ(I5(), 0);
            I5().setChecked(c1165860gRc.LLILZIL);
            C786410Ut5.b9(I5(), new ACListenerS121S0200000_18(c1165860gRc, this, 38));
            C786410Ut5.T4(this.itemView, 1.0f);
            C786410Ut5.I7(new ACListenerS121S0200000_18(c1165860gRc, this, 39), this.itemView);
            if (c1165860gRc.LLILLJJLI != null) {
                C786410Ut5.LLLLZLL((TuxTextView) this.LLILLL.getValue(), 0);
                C786410Ut5.LLLLLZ(I5(), 8);
                C786410Ut5.T4(this.itemView, 0.16f);
                if (!TextUtils.isEmpty(c1165860gRc.LLILLL)) {
                    ((TextView) this.LLILLL.getValue()).setText(c1165860gRc.LLILLL);
                    return;
                }
                return;
            }
            return;
        }
        this.LLILZ = c1165860gRc;
        for (Object obj : list) {
            if (obj instanceof C1165870gRd) {
                C1165870gRd c1165870gRd = (C1165870gRd) obj;
                this.LLILZ = C1165860gRc.LIZ(c1165860gRc, c1165870gRd.LIZ);
                C786410Ut5.LLLLLZ(I5(), 0);
                I5().setChecked(c1165870gRd.LIZ);
            }
        }
    }
}
