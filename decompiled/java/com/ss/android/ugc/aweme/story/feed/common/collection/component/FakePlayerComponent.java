package com.ss.android.ugc.aweme.story.feed.common.collection.component;

import X.AnonymousClass0956;
import X.C01GW;
import X.C034E;
import X.C054G;
import X.C098200Yq;
import X.C0K77;
import X.C0PEM;
import X.C0RD6;
import X.C0RDX;
import X.C0RF0;
import X.C0RJN;
import X.C0RO2;
import X.C0RO6;
import X.C0RO7;
import X.C0SR2;
import X.C0SZ8;
import X.C1360340lVI;
import X.C1387270mCj;
import X.C13LE;
import X.C1480420ocy;
import X.C14EU;
import X.C1558420qem;
import X.C1558520qew;
import X.C1589640rT8;
import X.C189200o6;
import X.C19719512Dh;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C622680Oba;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.C724270Sb3;
import X.C729510SjV;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC494301wD;
import X.InterfaceC583650Mup;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.PhotoModeTextInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.ability.FakePlayerAbility;
import com.ss.android.ugc.aweme.story.feed.common.sub.ability.PlayEnterBehaviorAbility;
import com.ss.android.ugc.aweme.story.feed.common.sub.note.StoryThoughtPlayerAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes12.dex */
public final class FakePlayerComponent extends BaseCellContentComponent<FakePlayerComponent> implements FakePlayerAbility {
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(314));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 556));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 558));
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 561));
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 562));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 559));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 557));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 560));
    public String LLJLLL = "";
    public long LLJZ;
    public long LLJZIJLIL;
    public Aweme LLL;
    public int LLLF;
    public int LLLFF;
    public AnonymousClass0956 LLLFFI;
    public final C054G LLLFZ;
    public int LLLI;
    public int LLLII;
    public int LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public final List<String> LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;

    public final InterfaceC583650Mup EL1() {
        return (InterfaceC583650Mup) this.LLJLILLLLZIIL.getValue();
    }

    public final PlayEnterBehaviorAbility ep() {
        C0SZ8 c0sz8LJLIL;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) this.LLJL.getValue();
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if (feedCollectionViewPagerAbility == null || (c0sz8LJLIL = feedCollectionViewPagerAbility.LJLIL()) == null) {
            return null;
        }
        if (!(c0sz8LJLIL instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, PlayEnterBehaviorAbility.class, null)) == null) {
            C0SZ8 c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, PlayEnterBehaviorAbility.class, null);
            }
        } else {
            interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
        }
        return (PlayEnterBehaviorAbility) interfaceC494301wDLIZ2;
    }

    public final String hp() {
        String aid;
        Aweme aweme = this.LLL;
        return (aweme == null || (aid = aweme.getAid()) == null) ? "" : aid;
    }

    public final C0RO6 ip() {
        return (C0RO6) this.LLJLLIL.getValue();
    }

    public final long kp() {
        PhotoModeTextInfo photoModeTextInfo;
        C0SZ8 c0sz8LJLIL;
        InterfaceC494301wD interfaceC494301wDLIZ;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        Object c098200Yq;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().isSubOnlyVideo()) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAwemeType() == 0) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    c098200Yq = Integer.valueOf(SettingsManager.LJ("story_sub_only_video_on_story_duration_config", 5));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = 5;
                }
                return ((Number) c098200Yq).longValue() * 1000;
            }
        }
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) this.LLJL.getValue();
        if (feedCollectionViewPagerAbility != null && (c0sz8LJLIL = feedCollectionViewPagerAbility.LJLIL()) != null) {
            if (!(c0sz8LJLIL instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, StoryThoughtPlayerAbility.class, null)) == null) {
                C0SZ8 c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
                interfaceC494301wDLIZ = (!(c0sz8LLJLLL instanceof CommonCellAbility) || (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) == null || (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) == null) ? null : C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, StoryThoughtPlayerAbility.class, null);
            }
            StoryThoughtPlayerAbility storyThoughtPlayerAbility = (StoryThoughtPlayerAbility) interfaceC494301wDLIZ;
            if (storyThoughtPlayerAbility != null) {
                return storyThoughtPlayerAbility.getDuration();
            }
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme().getMusic() != null) {
            return 10000L;
        }
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme().getAwemeType() != 152) {
            return 10000L;
        }
        C724270Sb3 c724270Sb35 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb35 != null ? c724270Sb35.LL : null)).getAweme();
        if (aweme != null && (photoModeTextInfo = aweme.getPhotoModeTextInfo()) != null && aweme.getIsTikTokStory() && aweme.getAwemeType() == 152 && (photoModeTextInfo.isConvertedText() || photoModeTextInfo.isText2Image())) {
            return 10000L;
        }
        return C034E.LIZ();
    }

    public final boolean lp() {
        AnonymousClass0956 anonymousClass0956 = this.LLLFFI;
        return anonymousClass0956 != null && anonymousClass0956.isActive();
    }

    public FakePlayerComponent() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLLFZ = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLLIIL = true;
        this.LLLIILIL = new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.story.ability.FakePlayerAbility
    public final void D7() {
        C690870R8b c690870R8bJm;
        C0RF0 c0rf0;
        Fragment fragment;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", nickName = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        User author = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAuthor();
        sbLIZ.append(author != null ? author.getNickname() : null);
        sbLIZ.append(",  resumeFakePlay");
        C2188811AlT.LIZIZ(sbLIZ);
        if (C729510SjV.LJJJIL(this.LLL) && !lp() && (c690870R8bJm = jm()) != null && (c0rf0 = c690870R8bJm.LIZLLL) != null && (fragment = c0rf0.LIZJ) != null && fragment.getUserVisibleHint()) {
            if (this.LLLIIIL) {
                tp(this.LLL, "isTryStartPlayFailed");
            }
            this.LLLIIIL = false;
            C0SR2 c0sr2 = (C0SR2) this.LLJLL.getValue();
            c0sr2.getClass();
            c0sr2.LIZIZ = System.currentTimeMillis();
            this.LLJZ += System.currentTimeMillis() - this.LLJZIJLIL;
            sp(this.LLLF);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("this = ");
        sbLIZ2.append(hashCode());
        sbLIZ2.append(", nickName = ");
        C724270Sb3 c724270Sb32 = this.LLJI;
        User author2 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAuthor();
        sbLIZ2.append(author2 != null ? author2.getNickname() : null);
        sbLIZ2.append(",  no need to resume, skip");
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.FakePlayerAbility
    public final void F41() {
        C0RF0 c0rf0;
        Fragment fragment;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", nickName = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        User author = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAuthor();
        sbLIZ.append(author != null ? author.getNickname() : null);
        sbLIZ.append(",  reset fake play");
        C2188811AlT.LIZIZ(sbLIZ);
        C690870R8b c690870R8bJm = jm();
        if (c690870R8bJm != null && (c0rf0 = c690870R8bJm.LIZLLL) != null && (fragment = c0rf0.LIZJ) != null && fragment.getUserVisibleHint()) {
            this.LLLF = 0;
            sp(0);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("this = ");
        sbLIZ2.append(hashCode());
        sbLIZ2.append(", nickName = ");
        C724270Sb3 c724270Sb32 = this.LLJI;
        User author2 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAuthor();
        sbLIZ2.append(author2 != null ? author2.getNickname() : null);
        sbLIZ2.append(",  no need to reset, skip");
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", nickName = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        User author = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAuthor();
        sbLIZ.append(author != null ? author.getNickname() : null);
        sbLIZ.append(",  onHolderUnselected");
        C2188811AlT.LIZIZ(sbLIZ);
        e10();
        this.LLL = null;
        this.LLLIIIIL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", nickName = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        User author = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAuthor();
        sbLIZ.append(author != null ? author.getNickname() : null);
        sbLIZ.append(",  onHolderUnbind");
        C2188811AlT.LIZIZ(sbLIZ);
        e10();
        this.LLL = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C622680Oba.LIZLLL(this);
        AnonymousClass0956 anonymousClass0956 = this.LLLFFI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FakePlayerAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.ability.FakePlayerAbility
    public final void e10() {
        String strRC;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", nickName = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        User author = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAuthor();
        sbLIZ.append(author != null ? author.getNickname() : null);
        sbLIZ.append(",  stopFakePlay");
        C2188811AlT.LIZIZ(sbLIZ);
        if (!C729510SjV.LJJJIL(this.LLL)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("this = ");
            sbLIZ2.append(hashCode());
            sbLIZ2.append(", nickName = ");
            C724270Sb3 c724270Sb32 = this.LLJI;
            User author2 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAuthor();
            sbLIZ2.append(author2 != null ? author2.getNickname() : null);
            sbLIZ2.append(",  no need to stop, skip");
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        C0RO6 c0ro6Ip = ip();
        String str = this.LLJLLL;
        C2189821An6 c2189821An6Xp0 = xp0();
        long j = (((long) this.LLLF) * 300) + this.LLJZ;
        PlayEnterBehaviorAbility playEnterBehaviorAbilityEp = ep();
        if (playEnterBehaviorAbilityEp != null) {
            Aweme aweme = this.LLL;
            if (aweme != null) {
                AwemeExtKt.getAuthorUid(aweme);
            }
            hp();
            strRC = playEnterBehaviorAbilityEp.RC();
        } else {
            strRC = null;
        }
        c0ro6Ip.LIZ(str, false, c2189821An6Xp0, j, strRC);
        this.LLL = null;
        this.LLLF = 0;
        this.LLLFF = 0;
        this.LLJZIJLIL = 0L;
        this.LLJZ = 0L;
        this.LLJLLL = "";
        this.LLLIIIL = false;
        AnonymousClass0956 anonymousClass0956 = this.LLLFFI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        ((C0SR2) this.LLJLL.getValue()).LJII(this.LLL, xp0());
        ((LinkedHashMap) ip().LIZIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.story.ability.FakePlayerAbility
    public final void lv() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", nickName = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        User author = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAuthor();
        sbLIZ.append(author != null ? author.getNickname() : null);
        sbLIZ.append(", pauseFakePlay");
        C2188811AlT.LIZIZ(sbLIZ);
        if (!C729510SjV.LJJJIL(this.LLL) || !lp()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("this = ");
            sbLIZ2.append(hashCode());
            sbLIZ2.append(", nickName = ");
            C724270Sb3 c724270Sb32 = this.LLJI;
            User author2 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAuthor();
            sbLIZ2.append(author2 != null ? author2.getNickname() : null);
            sbLIZ2.append(",  no need to pause, skip");
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLLFFI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLIIIL = false;
        ((C0SR2) this.LLJLL.getValue()).LJII(this.LLL, xp0());
        this.LLJZIJLIL = System.currentTimeMillis();
        C0RO6 c0ro6Ip = ip();
        String str = this.LLJLLL;
        C2189821An6 c2189821An6Xp0 = xp0();
        long j = (((long) this.LLLF) * 300) + this.LLJZ;
        PlayEnterBehaviorAbility playEnterBehaviorAbilityEp = ep();
        if (playEnterBehaviorAbilityEp != null) {
            Aweme aweme = this.LLL;
            if (aweme != null) {
                AwemeExtKt.getAuthorUid(aweme);
            }
            hp();
            strRC = playEnterBehaviorAbilityEp.RC();
        }
        c0ro6Ip.LIZ(str, false, c2189821An6Xp0, j, strRC);
    }

    @Override // com.ss.android.ugc.aweme.story.ability.FakePlayerAbility
    public final void wg2() {
        if (lp()) {
            lv();
        } else {
            D7();
        }
    }

    public final C2189821An6 xp0() {
        BaseFeedPageParams baseFeedPageParams;
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 == null || (baseFeedPageParams = c0rf0.LJ) == null) {
            return null;
        }
        return baseFeedPageParams.param;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        Object obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", nickName = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        String nickname = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        User author = ((VideoItemParams) obj).getAweme().getAuthor();
        if (author != null) {
            nickname = author.getNickname();
        }
        sbLIZ.append(nickname);
        sbLIZ.append(",  onHolderPause");
        C2188811AlT.LIZIZ(sbLIZ);
        lv();
        this.LLLIL = true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        Object obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", nickName = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        String nickname = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        User author = ((VideoItemParams) obj).getAweme().getAuthor();
        if (author != null) {
            nickname = author.getNickname();
        }
        sbLIZ.append(nickname);
        sbLIZ.append(",  onHolderResume");
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLLILZ) {
            this.LLLILZ = false;
            sp(0);
        } else {
            D7();
        }
        this.LLLIL = false;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.FakePlayerAbility
    public final void Np0(String str) {
        String aid;
        if (str == null) {
            return;
        }
        if (!((ArrayList) this.LLLIILIL).contains(str)) {
            ((ArrayList) this.LLLIILIL).add(str);
        }
        Aweme aweme = this.LLL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, str)) {
            mp(this.LLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.ability.FakePlayerAbility
    public final void W71(String str) {
        C19719512Dh.LIZ(this.LLLIILIL).remove(str);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        C0RDX.LIZJ(this, "event_on_page_resume", new AwS590S0100000_11(this, 174));
        C0RDX.LIZJ(this, "event_on_page_pause", new AwS590S0100000_11(this, 175));
    }

    @Override // com.ss.android.ugc.aweme.story.ability.FakePlayerAbility
    public final boolean fH(Aweme aweme) {
        if (AwemeBizExtKt.isStoryFakeAweme(aweme) || AwemeBizExtKt.isFriendsTabV2FakeAweme(aweme)) {
            return false;
        }
        return C729510SjV.LJJJIL(aweme);
    }

    public final void mp(Aweme aweme) {
        C0RF0 c0rf0;
        Fragment fragment;
        Object obj;
        String nickname;
        String aid;
        C2189821An6 c2189821An6;
        C690870R8b c690870R8bJm = jm();
        if (c690870R8bJm != null && (c0rf0 = c690870R8bJm.LIZLLL) != null && (fragment = c0rf0.LIZJ) != null && fragment.getUserVisibleHint()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startFakePlay, this = ");
            sbLIZ.append(hashCode());
            sbLIZ.append(", nickName = ");
            C724270Sb3 c724270Sb3 = this.LLJI;
            String from = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            User author = ((VideoItemParams) obj).getAweme().getAuthor();
            if (author != null) {
                nickname = author.getNickname();
            } else {
                nickname = null;
            }
            sbLIZ.append(nickname);
            sbLIZ.append(", aid = ");
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append(", shouldLoop: ");
            sbLIZ.append(this.LLLIIL);
            C2188811AlT.LIZIZ(sbLIZ);
            C0RJN c0rjnLIZIZ = jm().LIZIZ();
            if (c0rjnLIZIZ != null && (c2189821An6 = c0rjnLIZIZ.LIZJ) != null) {
                from = c2189821An6.getFrom();
            }
            if (Intrinsics.LJFF(from, "STORY_ENTRANCE_MUSIC_COVER_AVATAR") && this.LLLIL) {
                this.LLLILZ = true;
                return;
            } else {
                sp(0);
                return;
            }
        }
        this.LLLIIIL = true;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMaskShowOrHide(C0RO7 c0ro7) {
        Object obj;
        String str = c0ro7.LIZIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(str, ((VideoItemParams) obj).getAweme().getAid())) {
            return;
        }
        if (c0ro7.LIZ) {
            e10();
            return;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        op(((VideoItemParams) obj2).getAweme(), this.LLLIIL);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C622680Oba.LIZJ(this);
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, FakePlayerAbility.class, null, null);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0RGz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(104), 6);
    }

    public final void sp(int i) {
        Object obj;
        String nickname;
        Object obj2;
        String nickname2;
        if (lp()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("this = ");
            sbLIZ.append(hashCode());
            sbLIZ.append(", startTimer, nickName = ");
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            User author = ((VideoItemParams) obj2).getAweme().getAuthor();
            if (author != null) {
                nickname2 = author.getNickname();
            } else {
                nickname2 = null;
            }
            sbLIZ.append(nickname2);
            sbLIZ.append(",  isRunning == true, why ?");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLLFFI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        int iCeil = (int) Math.ceil(kp() / 300);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("this = ");
        sbLIZ2.append(hashCode());
        sbLIZ2.append(", startTimer, nickName = ");
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj = c724270Sb32.LL;
        } else {
            obj = null;
        }
        User author2 = ((VideoItemParams) obj).getAweme().getAuthor();
        if (author2 != null) {
            nickname = author2.getNickname();
        } else {
            nickname = null;
        }
        sbLIZ2.append(nickname);
        sbLIZ2.append(", start = ");
        sbLIZ2.append(i);
        sbLIZ2.append(", emitCount = ");
        sbLIZ2.append(iCeil);
        C2188811AlT.LIZIZ(sbLIZ2);
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LLLFZ, null, null, new C0RO2(i, iCeil, this, null), 3);
        this.LLLFFI = anonymousClass0956LIZLLL;
        anonymousClass0956LIZLLL.LJII(AFwS243S0000000_11.get$arr$(315));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Object obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", nickName = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        String nickname = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        User author = ((VideoItemParams) obj).getAweme().getAuthor();
        if (author != null) {
            nickname = author.getNickname();
        }
        sbLIZ.append(nickname);
        sbLIZ.append(",  onHolderSelected");
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLIIIIL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(com.ss.android.ugc.aweme.feed.model.Aweme r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = X.C729510SjV.LJJJIL(r5)
            if (r0 != 0) goto L7
            return
        L7:
            X.0956 r0 = r4.LLLFFI
            r3 = 0
            if (r0 == 0) goto Lf
            r0.LIZIZ(r3)
        Lf:
            r4.LLL = r5
            r2 = 0
            r4.LLLF = r2
            r4.LLLFF = r2
            r0 = 0
            r4.LLJZIJLIL = r0
            r4.LLJZ = r0
            r4.LLLIIIL = r2
            r4.LLLIIL = r6
            boolean r0 = X.C281150B0f.LIZ()
            if (r0 == 0) goto L43
            boolean r0 = X.C710930Rud.LJIIIIZZ(r5)
            if (r0 == 0) goto L43
            java.util.List<java.lang.String> r0 = r4.LLLIILIL
            if (r5 == 0) goto L34
            java.lang.String r3 = r5.getAid()
        L34:
            boolean r0 = X.C13LP.LJJJJ(r3, r0)
            if (r0 == 0) goto L43
            r4.mp(r5)
        L3d:
            java.lang.String r0 = ""
            r4.tp(r5, r0)
            return
        L43:
            boolean r0 = X.C729510SjV.LJJIIZI(r5)
            if (r0 != 0) goto L4f
            boolean r0 = X.C281150B0f.LIZ()
            if (r0 != 0) goto L3d
        L4f:
            r4.mp(r5)
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.collection.component.FakePlayerComponent.op(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):void");
    }

    public final void tp(Aweme aweme, String str) {
        Object obj;
        String nickname;
        String strRC;
        String aid;
        String aid2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", nickName = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        String strRC2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        User author = ((VideoItemParams) obj).getAweme().getAuthor();
        if (author != null) {
            nickname = author.getNickname();
        } else {
            nickname = null;
        }
        sbLIZ.append(nickname);
        sbLIZ.append(",  tryFakePlayEvent, from = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C0SR2 c0sr2 = (C0SR2) this.LLJLL.getValue();
        C2189821An6 c2189821An6Xp0 = xp0();
        PlayEnterBehaviorAbility playEnterBehaviorAbilityEp = ep();
        if (playEnterBehaviorAbilityEp != null) {
            Aweme aweme2 = this.LLL;
            if (aweme2 != null) {
                AwemeExtKt.getAuthorUid(aweme2);
            }
            hp();
            strRC = playEnterBehaviorAbilityEp.RC();
        } else {
            strRC = null;
        }
        int i = this.LLLI;
        int i2 = this.LLLII;
        int i3 = this.LLLIIII;
        c0sr2.getClass();
        String str2 = "";
        if (aweme != null && c2189821An6Xp0 != null) {
            C0SR2.LJI(aweme, "onStartPlay");
            c0sr2.LIZIZ = System.currentTimeMillis();
            c0sr2.LIZJ = i;
            c0sr2.LIZLLL = i2;
            c0sr2.LJ = i3;
            C0K77 c0k77 = (C0K77) c0sr2.LJFF.getValue();
            if (c0k77 == null || !c0k77.LJIJJ(aweme)) {
                String eventType = c2189821An6Xp0.getEventType();
                if (eventType == null) {
                    eventType = "";
                }
                int pageType = c2189821An6Xp0.getPageType();
                String aid3 = aweme.getAid();
                if (aid3 == null) {
                    aid3 = "";
                }
                int awemeType = aweme.getAwemeType();
                String requestId = aweme.getRequestId();
                if (requestId == null) {
                    requestId = "";
                }
                C1387270mCj.LIZIZ(eventType, pageType, aid3, awemeType, aweme, requestId, AFwS240S0000000_9.get$arr$(875));
            }
            if (C729510SjV.LJJIJIL(aweme) && C1360340lVI.LIZ(c2189821An6Xp0)) {
                C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
                int pageType2 = c2189821An6Xp0.getPageType();
                String eventType2 = c2189821An6Xp0.getEventType();
                if (eventType2 == null) {
                    eventType2 = "";
                }
                c1589640rT8.onFriendsV3StoryDetailRead(pageType2, aweme, eventType2);
            } else {
                C1589640rT8 c1589640rT82 = C1589640rT8.LIZIZ;
                int pageType3 = c2189821An6Xp0.getPageType();
                String eventType3 = c2189821An6Xp0.getEventType();
                if (eventType3 == null) {
                    eventType3 = "";
                }
                c1589640rT82.onAwemeRead(pageType3, aweme, eventType3);
            }
            try {
                c0sr2.LIZLLL(aweme, c2189821An6Xp0, strRC).LJIILJJIL();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Aweme aweme3 = this.LLL;
        if (aweme3 != null) {
            C0RO6 c0ro6Ip = ip();
            c0ro6Ip.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(aweme3.getAid());
            sbLIZ2.append('_');
            sbLIZ2.append(System.currentTimeMillis());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c0ro6Ip.LIZIZ.put(strLIZIZ, aweme3);
            this.LLJLLL = strLIZIZ;
            C0RO6 c0ro6Ip2 = ip();
            String str3 = this.LLJLLL;
            C2189821An6 c2189821An6Xp02 = xp0();
            PlayEnterBehaviorAbility playEnterBehaviorAbilityEp2 = ep();
            if (playEnterBehaviorAbilityEp2 != null) {
                Aweme aweme4 = this.LLL;
                if (aweme4 != null) {
                    AwemeExtKt.getAuthorUid(aweme4);
                }
                hp();
                strRC2 = playEnterBehaviorAbilityEp2.RC();
            }
            c0ro6Ip2.LIZ(str3, true, c2189821An6Xp02, 0L, strRC2);
        }
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C1480420ocy c1480420ocy = new C1480420ocy(aid, false, false);
        InterfaceC583650Mup interfaceC583650MupEL1 = EL1();
        if (interfaceC583650MupEL1 != null) {
            if (aweme != null && (aid2 = aweme.getAid()) != null) {
                str2 = aid2;
            }
            interfaceC583650MupEL1.onPreparePlay(str2);
        }
        InterfaceC583650Mup interfaceC583650MupEL12 = EL1();
        if (interfaceC583650MupEL12 != null) {
            interfaceC583650MupEL12.onRenderFirstFrame(c1480420ocy);
        }
    }
}
