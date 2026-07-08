package com.ss.android.ugc.aweme.music.v2.panel;

import X.C01GW;
import X.C03IJ;
import X.C09R3;
import X.C0OY0;
import X.C1295090jo3;
import X.C1295400joY;
import X.C1295960jpS;
import X.C1296110jph;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C438710HIf;
import X.C452501pT;
import X.C629740Omy;
import X.C629760On0;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1295080jo2;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.ReuseMusicStruct;
import com.ss.android.ugc.aweme.music.service.IMusicNameService;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCollectViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.SharedMusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicItemAssem extends ReusedUISlotAssem<MusicItemAssem> implements InterfaceC712990Rxx<C629740Omy> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1325));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1326));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1327));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1333));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1329));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1328));
    public final AssemVMLazy LLJLLL;
    public final AssemVMLazy LLJZ;
    public final AssemVMLazy LLJZIJLIL;
    public C1295960jpS LLL;
    public ImageView LLLF;
    public TuxTextView LLLFF;
    public TuxTextView LLLFFI;
    public TuxTextView LLLFZ;
    public TuxIconView LLLI;
    public TuxIconView LLLII;
    public C629740Omy LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicItemAssem.class, "musicCollectVM", "getMusicCollectVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicCollectViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MusicItemAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MusicItemAssem.class, "sharedMusicDetailVM", "getSharedMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/SharedMusicDetailViewModel;", 0);
        c09r3.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public MusicItemAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicCollectViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 1330), AFwS240S0000000_9.get$arr$(550), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c03ij, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 1331), AFwS240S0000000_9.get$arr$(551), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SharedMusicDetailViewModel.class);
        this.LLJZIJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c03ij, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ3, 1332), AFwS240S0000000_9.get$arr$(552), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dqv;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final MusicCollectViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (MusicCollectViewModel) assemVMLazy.getValue();
    }

    public final MusicDetailViewModel sp() {
        AssemVMLazy assemVMLazy = this.LLJZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (MusicDetailViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AssemVMLazy assemVMLazy = this.LLJZIJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        AssemViewModel.asyncSubscribe$default(sp(), C629760On0.LL, null, null, null, new AwS588S0100000_9((SharedMusicDetailViewModel) assemVMLazy.getValue(), 582), 14, null);
        this.LLL = (C1295960jpS) view.findViewById(R.id.nro);
        this.LLLF = (ImageView) view.findViewById(R.id.ot5);
        this.LLLFF = (TuxTextView) view.findViewById(R.id.zyd);
        this.LLLFFI = (TuxTextView) view.findViewById(R.id.z9z);
        this.LLLFZ = (TuxTextView) view.findViewById(R.id.zy9);
        this.LLLI = (TuxIconView) view.findViewById(R.id.hpp);
        this.LLLII = (TuxIconView) view.findViewById(R.id.v62);
        C786410Ut5.I7(new AbS691S0100000_9(this, 30, 42), view);
        TuxIconView tuxIconView = this.LLLI;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 31, 42), tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLLII;
        if (tuxIconView2 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 32, 42), tuxIconView2);
        }
        AssemViewModel.asyncSubscribe$default(sp(), new C2217381BqS() { // from class: X.0Omz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, AFwS240S0000000_9.get$arr$(548), AFwS195S0000000_9.get$arr$(259), new AwS588S0100000_9(this, 333), 2, null);
        AssemViewModel.asyncSubscribe$default(op(), new C2217381BqS() { // from class: X.0Olr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OG4) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS240S0000000_9.get$arr$(549), null, new AwS588S0100000_9(this, 331), 8, null);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C629740Omy c629740Omy) {
        Long lValueOf;
        Long lValueOf2;
        TuxTextView tuxTextView;
        String musicName;
        String string;
        Integer numValueOf;
        String string2;
        String string3;
        String string4;
        Serializable serializable;
        ReuseMusicStruct reuseMusicStruct;
        boolean z;
        boolean z2;
        Bundle arguments;
        Bundle arguments2;
        Bundle arguments3;
        String string5;
        Bundle arguments4;
        Bundle arguments5;
        Bundle arguments6;
        Bundle arguments7;
        Bundle arguments8;
        Bundle arguments9;
        Music music;
        C629740Omy c629740Omy2 = c629740Omy;
        Music music2 = c629740Omy2.LL;
        if (music2 != null) {
            lValueOf = Long.valueOf(music2.getId());
        } else {
            lValueOf = null;
        }
        C629740Omy c629740Omy3 = this.LLLIIII;
        if (c629740Omy3 != null && (music = c629740Omy3.LL) != null) {
            lValueOf2 = Long.valueOf(music.getId());
        } else {
            lValueOf2 = null;
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
            Music music3 = c629740Omy2.LL;
            op().LL = music3.getIdStr();
            sp().LLILLL = music3.getIdStr();
            sp().LL = music3;
            MusicDetailViewModel musicDetailViewModelSp = sp();
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (arguments9 = fragmentLJI.getArguments()) != null) {
                string = arguments9.getString("aweme_id");
            } else {
                string = null;
            }
            musicDetailViewModelSp.LLILZ = string;
            MusicDetailViewModel musicDetailViewModelSp2 = sp();
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null && (arguments8 = fragmentLJI2.getArguments()) != null) {
                numValueOf = Integer.valueOf(arguments8.getInt("extra_enter_from", 0));
            } else {
                numValueOf = null;
            }
            musicDetailViewModelSp2.LLIZLLLIL = numValueOf;
            MusicDetailViewModel musicDetailViewModelSp3 = sp();
            Fragment fragmentLJI3 = C724240Sb0.LJI(this);
            String str = "";
            if (fragmentLJI3 == null || (arguments7 = fragmentLJI3.getArguments()) == null || (string2 = arguments7.getString("first_enter_from")) == null) {
                string2 = "";
            }
            musicDetailViewModelSp3.LLJI = string2;
            MusicDetailViewModel musicDetailViewModelSp4 = sp();
            Fragment fragmentLJI4 = C724240Sb0.LJI(this);
            if (fragmentLJI4 != null && (arguments6 = fragmentLJI4.getArguments()) != null) {
                string3 = arguments6.getString("from_group_id");
            } else {
                string3 = null;
            }
            musicDetailViewModelSp4.LLILZIL = string3;
            MusicDetailViewModel musicDetailViewModelSp5 = sp();
            Fragment fragmentLJI5 = C724240Sb0.LJI(this);
            if (fragmentLJI5 != null && (arguments5 = fragmentLJI5.getArguments()) != null) {
                string4 = arguments5.getString("video_id");
            } else {
                string4 = null;
            }
            musicDetailViewModelSp5.LLILZLL = string4;
            MusicDetailViewModel musicDetailViewModelSp6 = sp();
            Fragment fragmentLJI6 = C724240Sb0.LJI(this);
            if (fragmentLJI6 != null && (arguments4 = fragmentLJI6.getArguments()) != null) {
                serializable = arguments4.getSerializable("reuse_sound_from");
            } else {
                serializable = null;
            }
            if (serializable instanceof ReuseMusicStruct) {
                reuseMusicStruct = (ReuseMusicStruct) serializable;
            } else {
                reuseMusicStruct = null;
            }
            musicDetailViewModelSp6.LLJIJIL = reuseMusicStruct;
            MusicDetailViewModel musicDetailViewModelSp7 = sp();
            Fragment fragmentLJI7 = C724240Sb0.LJI(this);
            if (fragmentLJI7 != null && (arguments3 = fragmentLJI7.getArguments()) != null && (string5 = arguments3.getString("music_volume")) != null) {
                str = string5;
            }
            musicDetailViewModelSp7.LLJILJILJ = str;
            MusicDetailViewModel musicDetailViewModelSp8 = sp();
            Fragment fragmentLJI8 = C724240Sb0.LJI(this);
            if (fragmentLJI8 != null && (arguments2 = fragmentLJI8.getArguments()) != null) {
                z = arguments2.getBoolean("extra_enter_mdp_from_vidoe_music_basic_vm", false);
            } else {
                z = false;
            }
            musicDetailViewModelSp8.LLJJ = z;
            MusicDetailViewModel musicDetailViewModelSp9 = sp();
            Fragment fragmentLJI9 = C724240Sb0.LJI(this);
            if (fragmentLJI9 != null && (arguments = fragmentLJI9.getArguments()) != null) {
                z2 = arguments.getBoolean("used_full_song", false);
            } else {
                z2 = false;
            }
            musicDetailViewModelSp9.LLJJI = z2;
            sp().vQ2(null, false, false);
        }
        this.LLLIIII = c629740Omy2;
        if (c629740Omy2.LLILLL) {
            C1295960jpS c1295960jpS = this.LLL;
            if (c1295960jpS != null) {
                C786410Ut5.LJLLLLLL(0, c1295960jpS);
                if (c629740Omy2.LLILZ) {
                    c1295960jpS.playAnimation();
                } else {
                    c1295960jpS.pauseAnimation();
                }
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c1295960jpS.getContext());
                if (numLIZJ != null) {
                    c1295960jpS.addValueCallback(new C1295090jo3("**"), InterfaceC1295080jo2.LJJIJL, (C1295400joY<ColorFilter>) new C1295400joY(new C1296110jph(numLIZJ.intValue())));
                }
            }
        } else {
            C1295960jpS c1295960jpS2 = this.LLL;
            if (c1295960jpS2 != null) {
                C786410Ut5.LJLLLLLL(8, c1295960jpS2);
            }
        }
        Context context = getContext();
        if (context != null && (tuxTextView = this.LLLFF) != null) {
            IMusicNameService iMusicNameService = (IMusicNameService) PluggableExtentionKt.pluggableSpi$default(IMusicNameService.class, false, false, false, 14, null);
            if (iMusicNameService == null || (musicName = iMusicNameService.LIZ(context, c629740Omy2.LL.convertToMusicModel())) == null) {
                musicName = c629740Omy2.LL.getMusicName();
            }
            tuxTextView.setText(musicName);
        }
        TuxTextView tuxTextView2 = this.LLLFFI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(c629740Omy2.LL.getAuthorName());
        }
        TuxTextView tuxTextView3 = this.LLLFZ;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(C0OY0.LIZ(c629740Omy2.LL.getDuration() * LSPassThroughRecordSizeConfig.DEFAULT));
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c629740Omy2.LL.getCoverMedium()));
        c1331670kl3LJIIIIZZ.LJJI(this.LLLF);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C418440Gaw.LIZIZ(4);
        c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LJIIIIZZ.LJIIJJI();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C629740Omy c629740Omy) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C629740Omy c629740Omy) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
