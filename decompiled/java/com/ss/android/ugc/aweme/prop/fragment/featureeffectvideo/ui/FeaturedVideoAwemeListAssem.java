package com.ss.android.ugc.aweme.prop.fragment.featureeffectvideo.ui;

import X.AbstractC214823195h;
import X.C019F;
import X.C01GW;
import X.C0WZX;
import X.C13LE;
import X.C1559260qg8;
import X.C1565750qqb;
import X.C1574940r5Q;
import X.C1574950r5R;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C20603715jn;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1575030r5Z;
import X.InterfaceC2217461Bqa;
import X.InterfaceC447510Hgj;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Intent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.featureeffectvideo.powerlist.FeatureVideoCreateNewVideoCell;
import com.ss.android.ugc.aweme.featureeffectvideo.powerlist.FeatureVideoItemCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel.FeaturedVideoAwemeListViewModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FeaturedVideoAwemeListAssem extends UIListContentAssem<FeaturedVideoAwemeListViewModel> implements InterfaceC1575030r5Z {
    public static final C1574940r5Q LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 842));
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C1565750qqb.class, "hierarchy_data_feature_video"), checkSupervisorPrepared());
    public final AssemVMLazy LLJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0r5Q] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeaturedVideoAwemeListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/prop/fragment/featurevideo/viewmodel/FeaturedVideoAwemeListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new Object() { // from class: X.0r5Q
        };
        LLJILJILJ = 8;
    }

    public FeaturedVideoAwemeListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeaturedVideoAwemeListViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 843), AFwS264S0000000_24.get$arr$(251), null, true);
    }

    private final void Zo() {
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r5L
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573050r2N) obj).LL;
            }
        }, null, AFwS310S0000000_24.get$arr$(49), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r5M
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573050r2N) obj).LLILLJJLI;
            }
        }, null, new AwS638S0100000_24(this, 59), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r5N
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573050r2N) obj).LLILLL;
            }
        }, null, new AwS638S0100000_24(this, 60), 6);
    }

    @Override // X.InterfaceC1575030r5Z, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        return c20603715jn;
    }

    public final void Lo() {
        Intent intent = new Intent();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C2204961BRm.LLJJIJIL(400, intent, c19egLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bI+A2iDFBuAUxrsQgpUE9+a3BIpl1vHG4Jal2+zAk5tqBoKQ2cg/4yIhur6z/s4/IliH80WI5owlTFoBHg==", null));
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null) {
            c19egLIZ2.finish();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0r5R] */
    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public C1574950r5R lt() {
        return new InterfaceC447510Hgj() { // from class: X.0r5R
        };
    }

    public final C1565750qqb Oo() {
        return (C1565750qqb) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: So, reason: merged with bridge method [inline-methods] */
    public FeaturedVideoAwemeListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (FeaturedVideoAwemeListViewModel) assemVMLazy.getValue();
    }

    private final void Vo() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(FeatureVideoItemCell.class, FeatureVideoCreateNewVideoCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(3, 1, LJJIJL().getContext(), false);
        wrapGridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.0r5P
            @Override // X.AbstractC214823195h
            public final int LJFF(int i) {
                return 1;
            }
        };
        Go().setLayoutManager(wrapGridLayoutManager);
    }

    @Override // X.InterfaceC1575030r5Z
    public String Iy() {
        C1565750qqb c1565750qqbOo = Oo();
        if (c1565750qqbOo != null) {
            return c1565750qqbOo.LL;
        }
        return null;
    }

    @Override // X.InterfaceC1575030r5Z
    public Aweme ua() {
        return ip().LLILLL;
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void xo() {
        super.xo();
        Vo();
        Zo();
    }
}
