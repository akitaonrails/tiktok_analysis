package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C019F;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C1954807lC;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C631400Ope;
import X.C632090Oql;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.EnumC631410Opf;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.AObjectS62S0000000_9;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellCoverAssem extends DefaultCoverAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public TuxIconView LLJL;
    public EnumC631410Opf LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public C127G LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCellCoverAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicCellCoverAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1124), null, AFwS240S0000000_9.get$arr$(460));
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultCoverAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ega;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MusicPlayViewModel.class, new AObjectS62S0000000_9(this, 38)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultCoverAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        super.Eo(view);
        this.LLJL = (TuxIconView) view.findViewById(R.id.ot6);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && fragmentLJI.getFragmentManager() != null) {
            C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLJLILLLLZIIL.getValue(this, LLJLLIL[0]), new C2217381BqS() { // from class: X.0Opd
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C631220OpM) obj).LL;
                }
            }, new C2217381BqS() { // from class: X.0Opc
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C631220OpM) obj).LLILLJJLI;
                }
            }, null, new AwS658S0100000_9(this, 11), 12);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultCoverAssem
    /* JADX INFO: renamed from: op */
    public final void up(C632090Oql c632090Oql) {
        String musicId;
        super.up(c632090Oql);
        String musicId2 = c632090Oql.getMusicModel().getMusicId();
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLJLILLLLZIIL;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLJLLIL;
        MusicModel musicModel = ((MusicPlayViewModel) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[0])).LLILZIL;
        if (musicModel != null) {
            musicId = musicModel.getMusicId();
        } else {
            musicId = null;
        }
        if (!Intrinsics.LJFF(musicId2, musicId)) {
            sp(EnumC631410Opf.DEFAULT);
        } else {
            sp(((MusicPlayViewModel) this.LLJLILLLLZIIL.getValue(this, interfaceC2217461BqaArr[0])).LLILZLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultCoverAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C632090Oql c632090Oql) {
        up(c632090Oql);
    }

    public final void sp(EnumC631410Opf enumC631410Opf) {
        Object obj;
        if (this.LLJLIL == enumC631410Opf) {
            return;
        }
        this.LLJLIL = enumC631410Opf;
        TuxIconView tuxIconView = this.LLJL;
        if (tuxIconView != null) {
            int i = C631400Ope.LIZ[enumC631410Opf.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_color_play;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                        c419910GdJ.LJFF = true;
                        tuxIconView.setTuxIcon(c419910GdJ);
                        tuxIconView.clearAnimation();
                        return;
                    }
                    throw new C1954807lC();
                }
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(LJJIJL().getContext(), R.anim.fc);
                animationLoadAnimation.setInterpolator(new LinearInterpolator());
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_spinner_normal;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
                c419910GdJ2.LJFF = true;
                tuxIconView.setTuxIcon(c419910GdJ2);
                tuxIconView.startAnimation(animationLoadAnimation);
                return;
            }
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_pause_fill1;
            c419910GdJ3.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ3.LJFF = true;
            tuxIconView.setTuxIcon(c419910GdJ3);
            tuxIconView.clearAnimation();
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("music_play");
            mobClickObtain.setLabelName("personal_homepage_list");
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            mobClickObtain.setValue(((C632090Oql) obj).getMusicModel().getMusicId());
            C20684815ws.onEvent(mobClickObtain);
        }
    }
}
