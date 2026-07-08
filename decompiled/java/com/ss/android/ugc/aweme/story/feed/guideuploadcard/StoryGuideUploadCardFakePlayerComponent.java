package com.ss.android.ugc.aweme.story.feed.guideuploadcard;

import X.AnonymousClass0956;
import X.C01GW;
import X.C054G;
import X.C0PEM;
import X.C0RD6;
import X.C0RDX;
import X.C0RF0;
import X.C0RO3;
import X.C13LE;
import X.C1558520qew;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C628500Oky;
import X.C630740Ooa;
import X.C737910Sx3;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionProgressBarAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideUploadCardFakePlayerComponent extends BaseCellContentComponent<StoryGuideUploadCardFakePlayerComponent> implements ICardFakePlayerAbility {
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 681));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 683));
    public final C01GW LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(373));
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 682));
    public AnonymousClass0956 LLJLIL;
    public final C054G LLJLILLLLZIIL;
    public int LLJLL;
    public boolean LLJLLIL;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        this.LLJLLIL = false;
        this.LLJLL = 0;
        AnonymousClass0956 anonymousClass0956 = this.LLJLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        AnonymousClass0956 anonymousClass0956 = this.LLJLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, ICardFakePlayerAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        if (this.LLJLLIL) {
            D7();
        }
    }

    public final boolean ep() {
        AnonymousClass0956 anonymousClass0956 = this.LLJLIL;
        return anonymousClass0956 != null && anonymousClass0956.isActive();
    }

    public StoryGuideUploadCardFakePlayerComponent() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJLILLLLZIIL = C2296808zG.LIZ(C2107308Nj.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guideuploadcard.ICardFakePlayerAbility
    public final void D7() {
        C0RF0 c0rf0;
        Fragment fragment;
        if (ep() || (c0rf0 = jm().LIZLLL) == null || (fragment = c0rf0.LIZJ) == null || !fragment.getUserVisibleHint()) {
            return;
        }
        hp(this.LLJLL);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guideuploadcard.ICardFakePlayerAbility
    public final void lv() {
        AnonymousClass0956 anonymousClass0956;
        if (ep() && (anonymousClass0956 = this.LLJLIL) != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Zo() {
        lv();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        lv();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        D7();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        C0RDX.LIZJ(this, "event_on_page_resume", new AwS590S0100000_11(this, 198));
        C0RDX.LIZJ(this, "event_on_page_pause", new AwS590S0100000_11(this, 199));
    }

    public final void hp(int i) {
        ep();
        AnonymousClass0956 anonymousClass0956 = this.LLJLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        ep();
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LLJLILLLLZIIL, null, null, new C0RO3(i, (int) Math.ceil(33.333333333333336d), this, null), 3);
        this.LLJLIL = anonymousClass0956LIZLLL;
        anonymousClass0956LIZLLL.LJII(AFwS243S0000000_11.get$arr$(374));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, ICardFakePlayerAbility.class, null, null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        FeedCollectionProgressBarAbility feedCollectionProgressBarAbility = (FeedCollectionProgressBarAbility) this.LLJL.getValue();
        if (feedCollectionProgressBarAbility != null) {
            feedCollectionProgressBarAbility.T90(1);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        AnonymousClass0956 anonymousClass0956 = this.LLJLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJLL = 0;
        hp(0);
        this.LLJLLIL = true;
    }
}
