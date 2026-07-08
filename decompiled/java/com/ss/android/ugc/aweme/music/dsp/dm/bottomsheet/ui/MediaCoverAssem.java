package com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.ui;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0OQ4;
import X.C123100dR;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C337180DJs;
import X.C452501pT;
import X.C598070Ncz;
import X.C626250OhL;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC626270OhN;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.viewmodel.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.dsp.dm.model.DmMessageConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MediaCoverAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public TuxIconView LLIZLLLIL;
    public SmartImageView LLJ;
    public LinearLayout LLJI;
    public TuxTextView LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C1559260qg8 LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MediaCoverAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/dsp/dm/bottomsheet/viewmodel/MusicDetailViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MediaCoverAssem.class, "musicPlayVM", "getMusicPlayVM()Lcom/ss/android/ugc/aweme/music/dsp/dm/bottomsheet/viewmodel/MusicPlayViewModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MediaCoverAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 1159), AFwS240S0000000_9.get$arr$(478), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 1160), AFwS240S0000000_9.get$arr$(479), null, true);
        this.LLJILLL = new C1559260qg8(new C723580SZw(this, MediaCardHierarchyData.class, null), checkSupervisorPrepared());
        this.LLJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1157));
        this.LLJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1158));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final LinearLayout Go() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.gc0) : null;
            this.LLJI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final SmartImageView Ho() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ld7) : null;
            this.LLJ = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final MediaCardHierarchyData Jo() {
        return (MediaCardHierarchyData) this.LLJILLL.getValue();
    }

    public final MusicPlayViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (MusicPlayViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        DmMessageConfig dmMessageConfig;
        DmMessageConfig dmMessageConfig2;
        DmMessageConfig dmMessageConfig3;
        super.onCreate();
        MediaCardHierarchyData mediaCardHierarchyDataJo = Jo();
        if (((mediaCardHierarchyDataJo == null || (dmMessageConfig3 = mediaCardHierarchyDataJo.getDmMessageConfig()) == null) ? null : dmMessageConfig3.contentType) == EnumC626270OhN.TRACK) {
            MediaCardHierarchyData mediaCardHierarchyDataJo2 = Jo();
            if (C123100dR.LIZ((mediaCardHierarchyDataJo2 == null || (dmMessageConfig2 = mediaCardHierarchyDataJo2.getDmMessageConfig()) == null) ? null : dmMessageConfig2.musicId)) {
                AssemVMLazy assemVMLazy = this.LLJILJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
                MusicDetailViewModel musicDetailViewModel = (MusicDetailViewModel) assemVMLazy.getValue();
                MediaCardHierarchyData mediaCardHierarchyDataJo3 = Jo();
                musicDetailViewModel.LLILLJJLI = (mediaCardHierarchyDataJo3 == null || (dmMessageConfig = mediaCardHierarchyDataJo3.getDmMessageConfig()) == null) ? null : dmMessageConfig.musicId;
                MusicDetailViewModel musicDetailViewModel2 = (MusicDetailViewModel) this.LLJILJIL.getValue();
                musicDetailViewModel2.setState(AFwS240S0000000_9.get$arr$(835));
                C23250099c.LIZLLL(musicDetailViewModel2.getAssemVMScope(), null, null, new C598070Ncz(musicDetailViewModel2, null), 3);
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        DmMessageConfig dmMessageConfig;
        super.onPause();
        MediaCardHierarchyData mediaCardHierarchyDataJo = Jo();
        if (((mediaCardHierarchyDataJo == null || (dmMessageConfig = mediaCardHierarchyDataJo.getDmMessageConfig()) == null) ? null : dmMessageConfig.contentType) == EnumC626270OhN.TRACK) {
            MusicPlayViewModel musicPlayViewModelLo = Lo();
            boolean z = musicPlayViewModelLo.LLILZ;
            musicPlayViewModelLo.LLILZ = false;
            musicPlayViewModelLo.vQ2().pause();
            musicPlayViewModelLo.setState(AFwS240S0000000_9.get$arr$(842));
            if (z) {
                C0OQ4 c0oq4 = (C0OQ4) this.LLJJI.getValue();
                MediaCardHierarchyData mediaCardHierarchyDataJo2 = Jo();
                if (mediaCardHierarchyDataJo2 != null) {
                    mediaCardHierarchyDataJo2.getDmMessageConfig();
                }
                c0oq4.LIZ(Lo().LLILZIL, false);
            }
        }
    }

    public final void No(MusicDetail musicDetail) {
        Music music;
        if (musicDetail != null && (music = musicDetail.music) != null) {
            View viewFindViewById = this.LLJIJIL;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.tv_timestamp);
                } else {
                    viewFindViewById = null;
                }
                this.LLJIJIL = (TuxTextView) viewFindViewById;
            }
            ((TextView) viewFindViewById).setText(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIJI(music.convertToMusicModel().getPresenterDuration()));
            return;
        }
        C337180DJs.LIZ(Go());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        DmMessageConfig dmMessageConfig;
        EnumC626270OhN enumC626270OhN;
        DmMessageConfig dmMessageConfig2;
        CardView cardView;
        Integer numLIZJ;
        DmMessageConfig dmMessageConfig3;
        String str;
        DmMessageConfig dmMessageConfig4;
        DmMessageConfig dmMessageConfig5;
        super.onViewCreated(view);
        MediaCardHierarchyData mediaCardHierarchyDataJo = Jo();
        String str2 = null;
        if (mediaCardHierarchyDataJo == null || (dmMessageConfig = mediaCardHierarchyDataJo.getDmMessageConfig()) == null || (enumC626270OhN = dmMessageConfig.contentType) == null) {
            return;
        }
        switch (C626250OhL.LIZ[enumC626270OhN.ordinal()]) {
            case 1:
                MediaCardHierarchyData mediaCardHierarchyDataJo2 = Jo();
                if (mediaCardHierarchyDataJo2 != null && (dmMessageConfig5 = mediaCardHierarchyDataJo2.getDmMessageConfig()) != null) {
                    str = dmMessageConfig5.musicId;
                } else {
                    str = null;
                }
                if (C123100dR.LIZ(str)) {
                    C786410Ut5.I7(new AbS691S0100000_9(this, 44, 42), Go());
                    AssemVMLazy assemVMLazy = this.LLJILJIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
                    AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OEk
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C0O1C) obj).LL;
                        }
                    }, null, new AwS588S0100000_9(this, 501), AFwS195S0000000_9.get$arr$(448), new AwS588S0100000_9(this, 502), 2, null);
                    C736680Sv4.LJIIIZ(this, Lo(), new C2217381BqS() { // from class: X.0ORs
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return Integer.valueOf(((C619550ORt) obj).LL);
                        }
                    }, new C2217381BqS() { // from class: X.0ORr
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C619550ORt) obj).LLILLJJLI;
                        }
                    }, null, new AwS658S0100000_9(this, 12), 12);
                } else {
                    C337180DJs.LIZ(Go());
                }
                MediaCardHierarchyData mediaCardHierarchyDataJo3 = Jo();
                if (mediaCardHierarchyDataJo3 != null && (dmMessageConfig4 = mediaCardHierarchyDataJo3.getDmMessageConfig()) != null) {
                    str2 = dmMessageConfig4.coverImageUrl;
                }
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str2));
                c1331670kl3LJI.LJJIJLIJ(C724240Sb0.LJI(this));
                c1331670kl3LJI.LJJ(Ho());
                C786410Ut5.h3(c1331670kl3LJI);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                C337180DJs.LIZ(Go());
                MediaCardHierarchyData mediaCardHierarchyDataJo4 = Jo();
                if (mediaCardHierarchyDataJo4 != null && (dmMessageConfig3 = mediaCardHierarchyDataJo4.getDmMessageConfig()) != null) {
                    str2 = dmMessageConfig3.coverImageUrl;
                }
                C1331670kl3 c1331670kl3LJI2 = C1331660kl2.LJI(UriProtector.parse(str2));
                c1331670kl3LJI2.LJJIJLIJ(C724240Sb0.LJI(this));
                c1331670kl3LJI2.LJJ(Ho());
                C786410Ut5.h3(c1331670kl3LJI2);
                break;
            case 6:
                C337180DJs.LIZ(Go());
                View viewLJJIJL = LJJIJL();
                if ((viewLJJIJL instanceof CardView) && (cardView = (CardView) viewLJJIJL) != null) {
                    cardView.setElevation(0.0f);
                    Context context = getContext();
                    if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
                        cardView.setCardBackgroundColor(numLIZJ.intValue());
                    }
                }
                MediaCardHierarchyData mediaCardHierarchyDataJo5 = Jo();
                if (mediaCardHierarchyDataJo5 != null && (dmMessageConfig2 = mediaCardHierarchyDataJo5.getDmMessageConfig()) != null) {
                    str2 = dmMessageConfig2.coverImageUrl;
                }
                C1331670kl3 c1331670kl3LJI3 = C1331660kl2.LJI(UriProtector.parse(str2));
                c1331670kl3LJI3.LJJIJLIJ(C724240Sb0.LJI(this));
                c1331670kl3LJI3.LJJ(Ho());
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LIZ = true;
                c1331670kl3LJI3.LJJI = new C1331730kl9(c1331750klB);
                C786410Ut5.h3(c1331670kl3LJI3);
                C786410Ut5.I7(new AbS691S0100000_9(this, 18, 42), LJJIJL());
                break;
        }
    }
}
