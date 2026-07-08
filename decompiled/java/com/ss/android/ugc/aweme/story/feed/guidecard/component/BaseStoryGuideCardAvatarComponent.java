package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.C03H5;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardAvatarViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseStoryGuideCardAvatarComponent<RECEIVER extends C03H5> extends BaseCellSlotComponent<RECEIVER> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C630740Ooa LLJLLL;
    public final C630740Ooa LLJZ;
    public final C630740Ooa LLJZIJLIL;
    public long LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseStoryGuideCardAvatarComponent.class, "avatarVM", "getAvatarVM()Lcom/ss/android/ugc/aweme/story/feed/guidecard/viewmodel/StoryGuideCardAvatarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BaseStoryGuideCardAvatarComponent() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryGuideCardAvatarViewModel.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 654), null, AFwS243S0000000_11.get$arr$(369));
        this.LLJLLL = C628500Oky.LIZ(new AwS555S0100000_11((BaseStoryGuideCardAvatarComponent) this, 655));
        this.LLJZ = C628500Oky.LIZ(new AwS555S0100000_11((BaseStoryGuideCardAvatarComponent) this, 653));
        this.LLJZIJLIL = C628500Oky.LIZ(new AwS555S0100000_11((BaseStoryGuideCardAvatarComponent) this, 656));
    }

    public abstract List<Aweme> Fp();

    public void Gp() {
    }

    public void Ip() {
    }

    public final StoryGuideCardAvatarViewModel Bp() {
        return (StoryGuideCardAvatarViewModel) this.LLJLLIL.getValue(this, LLLF[0]);
    }

    public final View Ep() {
        try {
            return getContentView();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
