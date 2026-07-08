package com.ss.android.ugc.aweme.music.ui.artistprofile;

import X.C20684815ws;
import X.C2344009Gk;
import X.C427660Gpo;
import X.C630310Ont;
import X.C630990Ooz;
import X.C631010Op1;
import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ArtistProfileUncertMusicOwnerCell extends PowerCell<C631010Op1> {
    public C427660Gpo LL;
    public TuxTextView LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dqp;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LL = (C427660Gpo) this.itemView.findViewById(R.id.b9c);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.b9e);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        String str;
        C630990Ooz c630990Ooz;
        int i;
        Music music;
        C630990Ooz c630990Ooz2;
        C631010Op1 c631010Op1 = (C631010Op1) interfaceC1891350zJl;
        C427660Gpo c427660Gpo = this.LL;
        if (c427660Gpo != null) {
            C427660Gpo.LJIIJJI(c427660Gpo, Integer.valueOf(R.drawable.c5w), false, null, null, false, false, null, null, false, null, 1022);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            String str2 = c631010Op1.LL;
            if (str2 == null) {
                str2 = "";
            }
            tuxTextView.setText(str2);
        }
        C631010Op1 item = getItem();
        if (item != null && (c630990Ooz2 = item.LLILLJJLI) != null) {
            str = c630990Ooz2.LLILZ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "single_song") && (c630990Ooz = c631010Op1.LLILLJJLI) != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "single_song");
            c2344009Gk.LIZJ(getLayoutPosition(), "order");
            c2344009Gk.LJIIIIZZ("to_user_id", "");
            c2344009Gk.LJIIIIZZ("follow_button", CardStruct.IStatusCode.DEFAULT);
            c2344009Gk.LJIIIIZZ("is_certified_artist", CardStruct.IStatusCode.DEFAULT);
            Music music2 = c630990Ooz.LLILLJJLI;
            int i2 = 1;
            if (music2 != null && music2.isPgc()) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "is_pgc");
            Music music3 = c630990Ooz.LLILLJJLI;
            if ((music3 == null || !music3.isPgc()) && ((music = c630990Ooz.LLILLJJLI) == null || !C630310Ont.LIZIZ(music))) {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "is_pgc_style");
            if (c630990Ooz.LLJ) {
                c2344009Gk.LJFF("enter_method", c630990Ooz.LLILZIL);
                ArtistHonorLabel artistHonorLabel = c631010Op1.LLILLL;
                if (artistHonorLabel != null) {
                    c2344009Gk.LJFF("artist_type", artistHonorLabel.getLabel());
                }
            } else {
                c2344009Gk.LJFF("enter_method", "pop_up_sheet");
            }
            C20684815ws.LJIILLIIL("musician_profile_show", c2344009Gk.LIZ);
        }
    }
}
