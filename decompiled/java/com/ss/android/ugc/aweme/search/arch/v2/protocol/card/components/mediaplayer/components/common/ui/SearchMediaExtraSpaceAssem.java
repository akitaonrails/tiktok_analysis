package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui;

import X.C10EU;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1908030zkf;
import X.C419910GdJ;
import X.C422830Gi1;
import X.C427870Gq9;
import X.C438710HIf;
import X.C657280PqI;
import X.C723590SZx;
import X.C786410Ut5;
import X.C823050WQl;
import X.InterfaceC1587906Jp;
import X.InterfaceC657240PqE;
import X.InterfaceC712990Rxx;
import Y.ARunnableS43S0300000_10;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.common.core.config.SearchVideoAndUserOptimizeExperiment;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaExtraSpaceAssem extends ReusedUIContentAssem<SearchMediaExtraSpaceAssem> implements InterfaceC712990Rxx<InterfaceC657240PqE> {
    public TuxTextView LLJJJJ;
    public C427870Gq9 LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public ImageView LLJJL;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public SearchMediaExtraSpaceAssem() {
        checkSupervisorPrepared();
        new C723590SZx(this, C657280PqI.class, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.desc);
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.bc6);
        this.LLJJJJJIL = (C427870Gq9) view.findViewById(R.id.bbz);
        this.LLJJL = (ImageView) view.findViewById(R.id.video_holder_author_verified_badge);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        String nickname;
        InterfaceC657240PqE interfaceC657240PqE2 = interfaceC657240PqE;
        if (TextUtils.isEmpty(interfaceC657240PqE2.getAweme().getDesc())) {
            TuxTextView tuxTextView = this.LLJJJJ;
            if (tuxTextView != null) {
                tuxTextView.setText("");
            }
            TuxTextView tuxTextView2 = this.LLJJJJ;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        } else {
            TuxTextView tuxTextView3 = this.LLJJJJ;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
            }
            TuxTextView tuxTextView4 = this.LLJJJJ;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(interfaceC657240PqE2.getAweme().getDesc());
            }
        }
        TuxTextView tuxTextView5 = this.LLJJJJLIIL;
        if (tuxTextView5 != null) {
            tuxTextView5.setTuxFont(61);
        }
        TuxTextView tuxTextView6 = this.LLJJJJLIIL;
        if (tuxTextView6 != null) {
            tuxTextView6.setTextDirection(5);
        }
        User author = interfaceC657240PqE2.getAweme().getAuthor();
        if (author != null) {
            TuxTextView tuxTextView7 = this.LLJJJJLIIL;
            if (tuxTextView7 != null) {
                if (C10EU.LJIJ(author)) {
                    nickname = author.getUniqueId();
                } else {
                    nickname = author.getNickname();
                }
                tuxTextView7.setText(nickname);
            }
            Context context = getContext();
            if (context != null) {
                SearchVideoAndUserOptimizeExperiment.LIZ.getClass();
                if (((SearchVideoAndUserOptimizeExperiment.OptimizeConfig) SearchVideoAndUserOptimizeExperiment.LIZJ.getValue()).videoImageAsyncLoad) {
                    C823050WQl.LIZJ().execute(new ARunnableS43S0300000_10(this, context, author, 30));
                } else {
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(author.getAvatarThumb()));
                    c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
                    c1331670kl3LJIIIIZZ.LJIL(c419910GdJ.LIZ(context));
                    c1331670kl3LJIIIIZZ.LIZLLL("AbsCellViewHolder");
                    c1331670kl3LJIIIIZZ.LJJ(this.LLJJJJJIL);
                    c1331670kl3LJIIIIZZ.LJIIJJI();
                }
            }
            if (C1908030zkf.LIZLLL(new UserVerify(null, author.getCustomVerify(), author.getEnterpriseVerifyReason(), -1))) {
                ImageView imageView = this.LLJJL;
                if (imageView != null) {
                    C786410Ut5.LJZI(0, imageView);
                    return;
                }
                return;
            }
            ImageView imageView2 = this.LLJJL;
            if (imageView2 == null) {
                return;
            }
            C786410Ut5.LJZI(8, imageView2);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC657240PqE interfaceC657240PqE) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC657240PqE interfaceC657240PqE) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
