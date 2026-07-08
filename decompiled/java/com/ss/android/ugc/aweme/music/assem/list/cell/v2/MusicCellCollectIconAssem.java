package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C019F;
import X.C09R3;
import X.C0HHT;
import X.C0OGJ;
import X.C127G;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C622680Oba;
import X.C632090Oql;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS144S0100000_9;
import Y.AObjectS62S0000000_9;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.vm.MusicCellCollectIconViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellCollectIconAssem extends ReusedUISlotAssem<MusicCellCollectIconAssem> implements InterfaceC712990Rxx<C632090Oql> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public C127G LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCellCollectIconAssem.class, "collectIconViewModel", "getCollectIconViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicCellCollectIconViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MusicCellCollectIconAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MusicCellCollectIconAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public MusicCellCollectIconAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicCellCollectIconViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 1121), null, AFwS240S0000000_9.get$arr$(457));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 1122), null, AFwS240S0000000_9.get$arr$(458));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(OriginMusicListViewModel.class);
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ3, 1123), null, AFwS240S0000000_9.get$arr$(459));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eg_;
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

    public final MusicCellCollectIconViewModel op() {
        return (MusicCellCollectIconViewModel) this.LLJL.getValue(this, LLJLLIL[0]);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MusicCellCollectIconViewModel.class, new AObjectS62S0000000_9(this, 36), MusicPlayViewModel.class, new AObjectS62S0000000_9(this, 37), OriginMusicListViewModel.class, new AObjectS62S0000000_9(this, 35)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ot3);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS144S0100000_9(this, 67));
        } else {
            tuxIconView = null;
        }
        this.LLJJLIIIJLLLLLLLZ = tuxIconView;
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0Oqa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C631970OqZ) obj).LL);
            }
        }, null, AFwS292S0000000_9.get$arr$(26), 6);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0Oqb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C631970OqZ) obj).LLILLJJLI;
            }
        }, null, AFwS292S0000000_9.get$arr$(27), 6);
        C622680Oba.LIZJ(this);
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onCollectMusicEvent(C0OGJ c0ogj) {
        MusicCellCollectIconViewModel musicCellCollectIconViewModelOp = op();
        musicCellCollectIconViewModelOp.getClass();
        boolean z = true;
        if (c0ogj.LIZIZ != 1) {
            z = false;
        }
        if (Intrinsics.LJFF(c0ogj.LIZ, musicCellCollectIconViewModelOp.LLILLJJLI)) {
            musicCellCollectIconViewModelOp.setState(new AwS24S0010000_9(z, 23));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C632090Oql c632090Oql) {
        op().LLILLJJLI = c632090Oql.getMusicModel().getMusicId();
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
