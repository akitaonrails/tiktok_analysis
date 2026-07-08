package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C019F;
import X.C0P4V;
import X.C1252710ihh;
import X.C127G;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C438710HIf;
import X.C631230OpN;
import X.C631640Oq2;
import X.C632090Oql;
import X.C632210Oqx;
import X.C723580SZw;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC634000Otq;
import X.InterfaceC712990Rxx;
import Y.ACListenerS144S0100000_9;
import Y.AObjectS62S0000000_9;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellHighlightAssem extends ReusedUISlotAssem<MusicCellHighlightAssem> implements InterfaceC712990Rxx<C632090Oql> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public SmartAvatarImageView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public LinearLayout LLJLILLLLZIIL;
    public final C1559260qg8 LLJLL = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    public final InterfaceC1731706qJ LLJLLIL;
    public C127G LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCellHighlightAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicCellHighlightAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1125), null, AFwS240S0000000_9.get$arr$(461));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.egc;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final OriginMusicArg op() {
        return (OriginMusicArg) this.LLJLL.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{OriginMusicListViewModel.class, new AObjectS62S0000000_9(this, 39)}, defaultViewModelProviderFactory);
                    this.LLJLLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        this.LLJJLIIIJLLLLLLLZ = (SmartAvatarImageView) view.findViewById(R.id.ota);
        this.LLJL = (TuxTextView) view.findViewById(R.id.otb);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.otd);
        if (tuxTextView != null) {
            C631640Oq2 c631640Oq2 = (C631640Oq2) C1252710ihh.LJIIIIZZ(this, C13LE.LIZ(InterfaceC634000Otq.class));
            if (c631640Oq2 != null && !c631640Oq2.LJFF) {
                C631230OpN.LIZ(tuxTextView);
            } else {
                C631230OpN.LIZJ(tuxTextView);
                C786410Ut5.h9(tuxTextView, new ACListenerS144S0100000_9(this, 68));
            }
        } else {
            tuxTextView = null;
        }
        this.LLJLIL = tuxTextView;
        this.LLJLILLLLZIIL = (LinearLayout) view.findViewById(R.id.otc);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C632090Oql c632090Oql) {
        User user;
        String nickname;
        User user2;
        C632090Oql c632090Oql2 = c632090Oql;
        boolean zIsHighlighted = c632090Oql2.getMusicItemModel().isHighlighted();
        boolean zIsSimilarMusic = c632090Oql2.getMusicItemModel().isSimilarMusic();
        if (zIsHighlighted && !zIsSimilarMusic) {
            TuxTextView tuxTextView = this.LLJL;
            if (tuxTextView != null) {
                Context context = getContext();
                String str = "";
                if (context != null) {
                    Object[] objArr = new Object[1];
                    OriginMusicArg originMusicArgOp = op();
                    if (originMusicArgOp == null || (user2 = originMusicArgOp.getUser()) == null || (nickname = user2.getNickname()) == null) {
                        nickname = "";
                    }
                    objArr[0] = nickname;
                    String string = context.getString(2131837108, objArr);
                    if (string != null) {
                        str = string;
                    }
                }
                tuxTextView.setText(str);
            }
            C632210Oqx c632210Oqx = C632210Oqx.LIZ;
            OriginMusicArg originMusicArgOp2 = op();
            if (originMusicArgOp2 != null) {
                user = originMusicArgOp2.getUser();
            } else {
                user = null;
            }
            c632210Oqx.getClass();
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(C632210Oqx.LIZ(user)));
            c1331670kl3LJIIIIZZ.LJJIIZ(R.drawable.c5w);
            c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
            c1331670kl3LJIIIIZZ.LJJ(this.LLJJLIIIJLLLLLLLZ);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            C631230OpN.LIZJ(getContentView());
            C786410Ut5.x3(getContentView().getViewTreeObserver(), new C0P4V(this, 1));
            return;
        }
        C631230OpN.LIZ(getContentView());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C632090Oql c632090Oql) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C632090Oql c632090Oql) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
