package com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight;

import X.C019F;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C631230OpN;
import X.C631680Oq6;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS144S0100000_9;
import Y.AObjectS62S0000000_9;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicFanSpotlightTitleAssem extends ReusedUISlotAssem<MusicFanSpotlightTitleAssem> implements InterfaceC712990Rxx<C631680Oq6> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxIconView LLJLIL;
    public C127G LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicFanSpotlightTitleAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicFanSpotlightTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1107), null, AFwS240S0000000_9.get$arr$(449));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eg4;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLILLLLZIIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLILLLLZIIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{OriginMusicListViewModel.class, new AObjectS62S0000000_9(this, 22)}, defaultViewModelProviderFactory);
                    this.LLJLILLLLZIIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (TuxTextView) view.findViewById(R.id.ov9);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ov8);
        this.LLJLIL = tuxIconView;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS144S0100000_9(this, 64));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C631680Oq6 c631680Oq6) {
        int i;
        String string;
        C631680Oq6 c631680Oq62 = c631680Oq6;
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(c631680Oq62.LL);
            } else {
                string = null;
            }
            tuxTextView.setText(string);
        }
        TuxIconView tuxIconView = this.LLJLIL;
        if (tuxIconView != null) {
            if (c631680Oq62.LLILLJJLI) {
                i = R.raw.icon_chevron_up;
            } else {
                i = R.raw.icon_chevron_down;
            }
            tuxIconView.setIconRes(i);
        }
        if (c631680Oq62.LLILLL) {
            TuxIconView tuxIconView2 = this.LLJLIL;
            if (tuxIconView2 != null) {
                C631230OpN.LIZJ(tuxIconView2);
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LLJLIL;
        if (tuxIconView3 == null) {
            return;
        }
        C631230OpN.LIZ(tuxIconView3);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C631680Oq6 c631680Oq6) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C631680Oq6 c631680Oq6) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
