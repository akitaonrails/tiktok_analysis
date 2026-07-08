package com.ss.android.ugc.aweme.ecommerce.search.general;

import X.AnonymousClass0956;
import X.C01GW;
import X.C054G;
import X.C09A1;
import X.C0PEM;
import X.C0PLO;
import X.C0PLQ;
import X.C0PQ2;
import X.C13BV;
import X.C1558520qew;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C23250099c;
import X.C452501pT;
import X.C655140Pmq;
import X.C655190Pmv;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC583720Muw;
import X.InterfaceC655060Pmi;
import X.InterfaceC655250Pn1;
import X.InterfaceC655280Pn4;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveDynamicBottomAnchorAssem extends ReusedUISlotAssem<SearchLiveDynamicBottomAnchorAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 25));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 26));
    public final C054G LLJLIL;
    public AnonymousClass0956 LLJLILLLLZIIL;
    public String LLJLL;
    public Map<String, ? extends Object> LLJLLIL;
    public List<? extends InterfaceC655280Pn4> LLJLLL;
    public List<? extends InterfaceC655250Pn1> LLJZ;
    public final C655190Pmv LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.brp;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void op() {
        FrameLayout frameLayout = (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (frameLayout != null) {
            tp(frameLayout);
            C786410Ut5.LJZ(8, frameLayout);
        }
        C786410Ut5.LJLLLLLL(8, getContentView());
        Iterator<? extends InterfaceC655250Pn1> it2 = this.LLJZ.iterator();
        while (it2.hasNext()) {
            it2.next().stop();
        }
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJLLL = c13bv;
        this.LLJZ = c13bv;
        this.LLJLLIL = null;
        this.LLJLL = null;
    }

    public final void sp() {
        for (InterfaceC655250Pn1 interfaceC655250Pn1 : this.LLJZ) {
            if (interfaceC655250Pn1.isPlaying()) {
                interfaceC655250Pn1.pause();
            }
        }
    }

    public final void up() {
        AnonymousClass0956 anonymousClass0956 = this.LLJLILLLLZIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJLILLLLZIIL = null;
        FrameLayout frameLayout = (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (frameLayout != null) {
            tp(frameLayout);
            C786410Ut5.LJZ(8, frameLayout);
        }
        C786410Ut5.LJLLLLLL(8, getContentView());
        Iterator<? extends InterfaceC655250Pn1> it2 = this.LLJZ.iterator();
        while (it2.hasNext()) {
            it2.next().stop();
        }
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJLLL = c13bv;
        this.LLJZ = c13bv;
        this.LLJLLIL = null;
        this.LLJLL = null;
        InterfaceC655060Pmi interfaceC655060Pmi = (InterfaceC655060Pmi) this.LLJL.getValue();
        if (interfaceC655060Pmi != null) {
            interfaceC655060Pmi.release();
        }
    }

    public final void yp() {
        for (InterfaceC655250Pn1 interfaceC655250Pn1 : this.LLJZ) {
            if (!interfaceC655250Pn1.isPlaying()) {
                interfaceC655250Pn1.start();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Pmv] */
    public SearchLiveDynamicBottomAnchorAssem() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJLIL = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJLLL = c13bv;
        this.LLJZ = c13bv;
        this.LLJZIJLIL = new InterfaceC583720Muw() { // from class: X.0Pmv
            @Override // X.InterfaceC583720Muw
            public final void LIZ() {
            }

            @Override // X.InterfaceC583720Muw
            public final void LIZJ() {
            }

            @Override // X.InterfaceC583720Muw
            public final void onBuffering(boolean z) {
            }

            @Override // X.InterfaceC583720Muw
            public final void onLoading() {
            }

            @Override // X.InterfaceC583720Muw
            public final void LIZLLL() {
                Iterator<? extends InterfaceC655280Pn4> it2 = this.LIZ.LLJLLL.iterator();
                while (it2.hasNext()) {
                    it2.next().stop();
                }
                this.LIZ.sp();
            }

            @Override // X.InterfaceC583720Muw
            public final void LJII() {
                Iterator<? extends InterfaceC655280Pn4> it2 = this.LIZ.LLJLLL.iterator();
                while (it2.hasNext()) {
                    it2.next().start();
                }
                this.LIZ.yp();
            }

            @Override // X.InterfaceC583720Muw
            public final void LJJZ() {
                Iterator<? extends InterfaceC655280Pn4> it2 = this.LIZ.LLJLLL.iterator();
                while (it2.hasNext()) {
                    it2.next().start();
                }
                this.LIZ.yp();
            }

            @Override // X.InterfaceC583720Muw
            public final void onPause() {
                Iterator<? extends InterfaceC655280Pn4> it2 = this.LIZ.LLJLLL.iterator();
                while (it2.hasNext()) {
                    it2.next().stop();
                }
                this.LIZ.sp();
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class, null);
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            searchComponentCenter$Player$PlayerControlAbility.yA2(this.LLJZIJLIL);
        }
        up();
        C2296808zG.LIZJ(this.LLJLIL, null);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        up();
    }

    public static void tp(ViewGroup viewGroup) {
        Object tag;
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt != null) {
                tag = childAt.getTag();
            } else {
                tag = null;
            }
            if (Intrinsics.LJFF(tag, "dynamic_anchor_view")) {
                C786410Ut5.LJJLIL(childCount, viewGroup);
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class, null);
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            searchComponentCenter$Player$PlayerControlAbility.Im2(this.LLJZIJLIL);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        InterfaceC435460H5s interfaceC435460H5s2 = interfaceC435460H5s;
        C0PQ2 c0pq2 = C0PQ2.LIZ;
        Aweme aweme = interfaceC435460H5s2.getAweme();
        c0pq2.getClass();
        C0PLO c0ploLIZ = C0PQ2.LIZ(aweme);
        String str = c0ploLIZ.LIZIZ;
        if (c0ploLIZ.LIZ == C0PLQ.CARD_BOTTOM && str != null && str.length() != 0) {
            this.LLJLL = interfaceC435460H5s2.getAweme().getAid();
            this.LLJLLIL = c0ploLIZ.LIZJ;
            Aweme aweme2 = interfaceC435460H5s2.getAweme();
            if (this.LLJL.getValue() == null) {
                up();
                return;
            }
            String aid = aweme2.getAid();
            AnonymousClass0956 anonymousClass0956 = this.LLJLILLLLZIIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJLILLLLZIIL = C23250099c.LIZLLL(this.LLJLIL, null, null, new C655140Pmq(this, aid, aweme2, str, null), 3);
            return;
        }
        up();
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        C0PQ2 c0pq2 = C0PQ2.LIZ;
        Aweme aweme = interfaceC435460H5s.getAweme();
        c0pq2.getClass();
        if (C0PQ2.LIZ(aweme).LIZ == C0PLQ.CARD_BOTTOM) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
