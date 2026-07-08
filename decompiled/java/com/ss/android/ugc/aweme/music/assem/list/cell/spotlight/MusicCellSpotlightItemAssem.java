package com.ss.android.ugc.aweme.music.assem.list.cell.spotlight;

import X.C019F;
import X.C0OY0;
import X.C1252710ihh;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1360520lVa;
import X.C13LE;
import X.C1620160sGM;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C325700Cpk;
import X.C438710HIf;
import X.C631230OpN;
import X.C631640Oq2;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC634000Otq;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellSpotlightItemAssem extends ReusedUISlotAssem<MusicCellSpotlightItemAssem> implements InterfaceC712990Rxx<C325700Cpk> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public C325700Cpk LLJJLIIIJLLLLLLLZ;
    public FixedRatioFrameLayout LLJL;
    public SmartImageView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTag LLJLL;
    public final AssemVMLazy LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCellSpotlightItemAssem.class, "spotlightVM", "getSpotlightVM()Lcom/ss/android/ugc/aweme/music/assem/list/cell/spotlight/SpotlightListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicCellSpotlightItemAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SpotlightListViewModel.class);
        this.LLJLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1111), AFwS240S0000000_9.get$arr$(451), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.egi;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (FixedRatioFrameLayout) view.findViewById(R.id.vvp);
        this.LLJLIL = (SmartImageView) view.findViewById(R.id.cover);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.zfl);
        this.LLJLL = (TuxTag) view.findViewById(R.id.x0r);
        AssemVMLazy assemVMLazy = this.LLJLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Ori
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C632690Orj) obj).LL);
            }
        }, null, AFwS292S0000000_9.get$arr$(25), 6);
        SmartImageView smartImageView = this.LLJLIL;
        if (smartImageView != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 14, 42), smartImageView);
        }
        C2211631BhB.LJ(view, new AwS588S0100000_9(this, 269));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C325700Cpk c325700Cpk) {
        String uid;
        long playCount;
        Video video;
        C325700Cpk c325700Cpk2 = c325700Cpk;
        this.LLJJLIIIJLLLLLLLZ = c325700Cpk2;
        SmartImageView smartImageView = this.LLJLIL;
        if (smartImageView != null && (video = c325700Cpk2.LL.getVideo()) != null && !C1620160sGM.LIZLLL(smartImageView, video, "MusicCellSpotlight", false, false, 248)) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(video.getCover()));
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            c1331670kl3LJIIIIZZ.LIZLLL = true;
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        if (tuxTextView != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            AwemeStatistics statistics = c325700Cpk2.LL.getStatistics();
            if (statistics != null) {
                playCount = statistics.getPlayCount();
            } else {
                playCount = 0;
            }
            c1360520lVa.LIZ.append((CharSequence) C0OY0.LIZIZ(Long.valueOf(playCount)));
            tuxTextView.setText(c1360520lVa.LIZ);
        }
        User author = c325700Cpk2.LL.getAuthor();
        String str = null;
        if (author != null && (uid = author.getUid()) != null) {
            C631640Oq2 c631640Oq2 = (C631640Oq2) C1252710ihh.LJIIIIZZ(this, C13LE.LIZ(InterfaceC634000Otq.class));
            if (c631640Oq2 != null) {
                str = c631640Oq2.LIZ;
            }
            if (!Intrinsics.LJFF(uid, str)) {
                TuxTag tuxTag = this.LLJLL;
                if (tuxTag != null) {
                    C631230OpN.LIZJ(tuxTag);
                    return;
                }
                return;
            }
        }
        TuxTag tuxTag2 = this.LLJLL;
        if (tuxTag2 == null) {
            return;
        }
        C631230OpN.LIZ(tuxTag2);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C325700Cpk c325700Cpk) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C325700Cpk c325700Cpk) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
