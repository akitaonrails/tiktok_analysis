package com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui;

import X.C01GW;
import X.C03H5;
import X.C0HHT;
import X.C0RJN;
import X.C127G;
import X.C1389300mG0;
import X.C13IQ;
import X.C13LE;
import X.C14T5;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C339190DRl;
import X.C452501pT;
import X.C709520RsM;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.AObjectS64S0000000_11;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.viewmodel.ITakoFeedRightBottomEntranceViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TakoRightBottomEntranceTrigger extends BaseCellTriggerComponent<TakoRightBottomEntranceTrigger> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public C127G LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoRightBottomEntranceTrigger.class, "bizVM", "getBizVM()Lcom/ss/android/ugc/aweme/tako/otherpage/feed/mainentrance/viewmodel/ITakoFeedRightBottomEntranceViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoRightBottomEntranceTrigger() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ITakoFeedRightBottomEntranceViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 951), null, AFwS243S0000000_11.get$arr$(490));
        this.LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 949));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(TakoRightBottomInCellEntrance.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (up((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null))) {
            ((ITakoFeedRightBottomEntranceViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLILLLLZIIL[0])).zQ2();
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ITakoFeedRightBottomEntranceViewModel.class, new AObjectS64S0000000_11(this, 9)}, defaultViewModelProviderFactory);
                    this.LLJLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        String nickname;
        InteractAreaAttachAbility interactAreaAttachAbility;
        tp(videoItemParams);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trigger-onBind[");
        sbLIZ.append(videoItemParams.currentPosition);
        sbLIZ.append("], ");
        User author = videoItemParams.getAweme().getAuthor();
        if (author != null) {
            nickname = author.getNickname();
        } else {
            nickname = null;
        }
        sbLIZ.append(nickname);
        sbLIZ.append(", ");
        sbLIZ.append(LJJIJL().hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        C339190DRl.LIZIZ(LJJIJL());
        if (up(videoItemParams) && (interactAreaAttachAbility = (InteractAreaAttachAbility) this.LLJL.getValue()) != null) {
            interactAreaAttachAbility.Fn1(this, new AwS555S0100000_11(this, 950));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        return C709520RsM.LIZ(videoItemParams.getAweme(), C1389300mG0.LJFF(jm().LIZIZ()));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Object obj;
        Object obj2;
        C724270Sb3 c724270Sb3 = this.LLJI;
        C2189821An6 c2189821An6 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (up((VideoItemParams) obj)) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            Aweme aweme2 = ((VideoItemParams) obj2).getAweme();
            C0RJN c0rjnLIZIZ = jm().LIZIZ();
            if (c0rjnLIZIZ != null) {
                c2189821An6 = c0rjnLIZIZ.LIZJ;
            }
            C14T5.LIZIZ(aweme2, c2189821An6);
            ((ITakoFeedRightBottomEntranceViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLILLLLZIIL[0])).yQ2();
        }
    }
}
