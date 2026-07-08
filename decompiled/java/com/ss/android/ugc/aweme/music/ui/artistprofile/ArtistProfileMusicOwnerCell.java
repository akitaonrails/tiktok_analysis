package com.ss.android.ugc.aweme.music.ui.artistprofile;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C10EU;
import X.C1360520lVa;
import X.C1387050mCN;
import X.C1908030zkf;
import X.C20684815ws;
import X.C2344009Gk;
import X.C427660Gpo;
import X.C438710HIf;
import X.C630310Ont;
import X.C630990Ooz;
import X.C631020Op2;
import X.C786410Ut5;
import X.EnumC1387060mCO;
import X.InterfaceC1891350zJl;
import Y.ACListenerS144S0100000_9;
import android.content.Context;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ArtistProfileMusicOwnerCell extends PowerCell<C631020Op2> {
    public C427660Gpo LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public RelationButton LLILZIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dqn;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LL = (C427660Gpo) this.itemView.findViewById(R.id.b9c);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.b9e);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.b9d);
        this.LLILZ = (TuxIconView) this.itemView.findViewById(R.id.b9b);
        RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.b9f);
        this.LLILZIL = relationButton;
        if (relationButton != null) {
            relationButton.setTuxFont(52);
        }
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 76), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        boolean z;
        String str;
        String str2;
        int i;
        Music music;
        C630990Ooz c630990Ooz;
        int iIntValue;
        int iIntValue2;
        C630990Ooz c630990Ooz2;
        RelationButton relationButton;
        Integer num;
        C427660Gpo c427660Gpo;
        C631020Op2 c631020Op2 = (C631020Op2) interfaceC1891350zJl;
        UrlModel urlModel = c631020Op2.LLILZ;
        if (urlModel != null && (c427660Gpo = this.LL) != null) {
            C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(urlModel), false, null, null, false, false, null, null, false, null, 1022);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            String str3 = c631020Op2.LLILZIL;
            if (str3 == null) {
                str3 = "";
            }
            c1360520lVa.LIZ.append((CharSequence) str3);
            tuxTextView.setText(c1360520lVa.LIZ);
            C1908030zkf c1908030zkf = C1908030zkf.LIZ;
            Context context = this.itemView.getContext();
            boolean z2 = c631020Op2.LLILZLL;
            c1908030zkf.getClass();
            C1908030zkf.LJFF(context, tuxTextView, z2, null);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(c631020Op2.LLIZ);
        }
        int i2 = 1;
        if (!C10EU.LJIIZILJ(c631020Op2.LLILLJJLI) && !c631020Op2.LLJIJIL && !c631020Op2.LLJILJIL && (num = c631020Op2.LLJILJILJ) != null && num.intValue() == 1 && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = c631020Op2.LLJILLL;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2) && z) {
            RelationButton relationButton2 = this.LLILZIL;
            if (relationButton2 != null) {
                C786410Ut5.t0(relationButton2, 0);
            }
            TuxIconView tuxIconView = this.LLILZ;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            User user = new User();
            user.setUid(c631020Op2.LLILLJJLI);
            user.setSecUid(c631020Op2.LLILLL);
            user.setNickname(c631020Op2.LLILZIL);
            Integer num2 = c631020Op2.LLIZLLLIL;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            user.setFollowStatus(iIntValue);
            Integer num3 = c631020Op2.LLJ;
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            } else {
                iIntValue2 = 0;
            }
            user.setFollowerStatus(iIntValue2);
            user.setPrivateAccount(c631020Op2.LLJI);
            RelationButton relationButton3 = this.LLILZIL;
            if (relationButton3 != null) {
                C1387050mCN c1387050mCN = new C1387050mCN(user);
                c1387050mCN.LJIIJJI = getCurrentFragment();
                c1387050mCN.LIZIZ = false;
                c1387050mCN.LJ = EnumC1387060mCO.FRIENDS;
                relationButton3.LLLLZIL(c1387050mCN.LIZ());
            }
            C631020Op2 item = getItem();
            if (item != null && (c630990Ooz2 = item.LLJJI) != null && (relationButton = this.LLILZIL) != null) {
                relationButton.setTracker(new AwS410S0200000_9(c630990Ooz2, this, 112));
            }
        } else {
            RelationButton relationButton4 = this.LLILZIL;
            if (relationButton4 != null) {
                C786410Ut5.t0(relationButton4, 8);
            }
            TuxIconView tuxIconView2 = this.LLILZ;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
        }
        C631020Op2 item2 = getItem();
        if (item2 != null && (c630990Ooz = item2.LLJJI) != null) {
            str = c630990Ooz.LLILZ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "single_song")) {
            if (Intrinsics.LJFF(c631020Op2.LLJILLL, bool2) && z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C630990Ooz c630990Ooz3 = c631020Op2.LLJJI;
            if (c630990Ooz3 != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "single_song");
                c2344009Gk.LIZJ(getLayoutPosition(), "order");
                c2344009Gk.LJIIIIZZ("to_user_id", c631020Op2.LLILLJJLI);
                c2344009Gk.LJIIIIZZ("follow_button", str2);
                c2344009Gk.LJIIIIZZ("is_certified_artist", "1");
                Music music2 = c630990Ooz3.LLILLJJLI;
                if (music2 != null && music2.isPgc()) {
                    i = 1;
                } else {
                    i = 0;
                }
                c2344009Gk.LIZJ(i, "is_pgc");
                Music music3 = c630990Ooz3.LLILLJJLI;
                if ((music3 == null || !music3.isPgc()) && ((music = c630990Ooz3.LLILLJJLI) == null || !C630310Ont.LIZIZ(music))) {
                    i2 = 0;
                }
                c2344009Gk.LIZJ(i2, "is_pgc_style");
                if (c630990Ooz3.LLJ) {
                    c2344009Gk.LJFF("enter_method", c630990Ooz3.LLILZIL);
                    ArtistHonorLabel artistHonorLabel = c631020Op2.LLJJIII;
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
}
