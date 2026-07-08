package com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C0DXR;
import X.C1220000hqw;
import X.C127G;
import X.C1357705Tb;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS62S0000000_9;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.fanspotlight.profilemusictab.detail.vm.FanSpotlightProfileDetailShareVM;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicFanSpotlightBlockAssem extends ReusedUISlotAssem<MusicFanSpotlightBlockAssem> implements InterfaceC712990Rxx<C1357705Tb> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C736950SvV LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public final C1559260qg8 LLJLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJLILLLLZIIL;
    public C127G LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicFanSpotlightBlockAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eg0;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public MusicFanSpotlightBlockAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 1104);
        this.LLJJLIIIJLLLLLLLZ = new C736950SvV(C13LE.LIZ(FanSpotlightProfileDetailShareVM.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(447), new AwS553S0100000_9((AbstractC738140SxQ) this, 1106), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1105), AFwS240S0000000_9.get$arr$(446), null, true);
        this.LLJLIL = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{OriginMusicListViewModel.class, new AObjectS62S0000000_9(this, 21)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.hnh);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0));
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(FanSpotlightBlockVideoCell.class);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(FanSpotlightBlockAddVideoCell.class);
        final Context context = viewOnAttachStateChangeListenerC20604515jv.getContext();
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR(context) { // from class: X.0GhY
            public final Context LL;
            public final int LLILLJJLI;

            {
                this.LL = context;
                this.LLILLJJLI = (int) C12ES.LIZJ(4.0f, context);
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                if (recyclerView.getChildAdapterPosition(view2) > 0) {
                    if (C426750GoL.LIZLLL(this.LL)) {
                        rect.right = this.LLILLJJLI;
                    } else {
                        rect.left = this.LLILLJJLI;
                    }
                }
            }
        });
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
        ((AssemListViewModel) this.LLJJLIIIJLLLLLLLZ.getValue()).setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
        this.LLJJLIIIJLLLLLLLZ.getValue();
        OriginMusicArg originMusicArg = (OriginMusicArg) this.LLJLIL.getValue();
        if (originMusicArg != null) {
            originMusicArg.isMe();
        }
        viewOnAttachStateChangeListenerC20604515jv.LJIIL(((AssemListViewModel) this.LLJJLIIIJLLLLLLLZ.getValue()).getConfig());
        this.LLJLILLLLZIIL = viewOnAttachStateChangeListenerC20604515jv;
        C2211631BhB.LJ(view, new AwS588S0100000_9(this, 267));
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Osm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C632540OrU) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), AFwS289S0000000_6.get$arr$(18), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1357705Tb c1357705Tb) {
        C1357705Tb c1357705Tb2 = c1357705Tb;
        FanSpotlightProfileDetailShareVM fanSpotlightProfileDetailShareVM = (FanSpotlightProfileDetailShareVM) this.LLJJLIIIJLLLLLLLZ.getValue();
        fanSpotlightProfileDetailShareVM.LLILZIL = c1357705Tb2.LL;
        fanSpotlightProfileDetailShareVM.LLILZLL = c1357705Tb2.LLILLJJLI;
        fanSpotlightProfileDetailShareVM.manualListRefresh();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1357705Tb c1357705Tb) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1357705Tb c1357705Tb) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
