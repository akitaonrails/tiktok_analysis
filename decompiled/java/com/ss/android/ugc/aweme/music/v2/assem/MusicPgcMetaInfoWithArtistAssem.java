package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C01GW;
import X.C0C64;
import X.C0SWE;
import X.C0SY5;
import X.C1076010e6h;
import X.C1398280mUU;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1637806bA;
import X.C1908730zln;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C297080Bkg;
import X.C419980GdQ;
import X.C427690Gpr;
import X.C452501pT;
import X.C486890J7n;
import X.C630120Ona;
import X.C630970Oox;
import X.C631000Op0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C888460YtI;
import X.EnumC1357230lQH;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS113S0200000_9;
import Y.AObserverS213S0100000_9;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.model.UncertMusicOwnerInfo;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS445S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicPgcMetaInfoWithArtistAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public TuxIconView LLJJI;
    public TuxIconView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public C419980GdQ LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public C1908730zln LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public Music LLJLLL;
    public final boolean LLJZ;
    public final boolean LLJZIJLIL;
    public final C01GW LLL;
    public final AssemVMLazy LLLF;
    public final C01GW LLLFF;
    public boolean LLLFFI;
    public List<? extends MusicOwnerInfo> LLLFZ;
    public boolean LLLI;
    public int LLLII;
    public int LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicPgcMetaInfoWithArtistAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicPgcMetaInfoWithArtistAssem() {
        boolean z = true;
        boolean z2 = (C0C64.LJIILLIIL().LJIJ(31744, 1, "show_pgc_artist_info", true) == 1) && C297080Bkg.LIZ() != 4;
        this.LLJZ = z2;
        if (z2 && C297080Bkg.LIZ() != 4) {
            z = false;
        }
        this.LLJZIJLIL = z;
        this.LLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1275));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLLF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1277), AFwS240S0000000_9.get$arr$(541), null, true);
        this.LLLFF = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1276));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return this.LLJZIJLIL ? R.layout.dqs : this.LLJZ ? R.layout.dqt : R.layout.dqr;
    }

    public final void lp() {
        String string;
        Resources resources;
        View view;
        Integer followStatus;
        Integer followStatus2;
        List<? extends MusicOwnerInfo> list = this.LLLFZ;
        if (list == null || list.isEmpty()) {
            View view2 = this.LLJLL;
            if (view2 != null) {
                C630120Ona.LIZ(view2);
                return;
            }
            return;
        }
        View view3 = this.LLJLL;
        if (view3 != null) {
            C630120Ona.LIZIZ(view3);
        }
        TuxIconView tuxIconView = this.LLJJJJJIL;
        if (tuxIconView != null) {
            C630120Ona.LIZIZ(tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLJLILLLLZIIL;
        if (tuxIconView2 != null) {
            C630120Ona.LIZIZ(tuxIconView2);
        }
        TuxTextView tuxTextView = this.LLJJJJLIIL;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(51);
        }
        TuxTextView tuxTextView2 = this.LLJJJJLIIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColorRes(R.attr.a1h);
        }
        TuxTextView tuxTextView3 = this.LLJJL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTuxFont(52);
        }
        TuxTextView tuxTextView4 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView4 != null) {
            tuxTextView4.setTuxFont(52);
        }
        int i = this.LLJZ ? 2131857167 : 2131857169;
        TuxTextView tuxTextView5 = this.LLJJJJLIIL;
        if (tuxTextView5 != null) {
            tuxTextView5.setText(i);
        }
        MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) C13LP.LJJJLZIJ(0, list);
        if (musicOwnerInfo == null) {
            return;
        }
        if (list.size() == 1) {
            TuxTextView tuxTextView6 = this.LLJJL;
            if (tuxTextView6 != null) {
                tuxTextView6.setText(musicOwnerInfo instanceof UncertMusicOwnerInfo ? ((UncertMusicOwnerInfo) musicOwnerInfo).getName() : musicOwnerInfo.getNickName());
            }
            TuxTextView tuxTextView7 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView7 != null) {
                C630120Ona.LIZ(tuxTextView7);
            }
            TuxIconView tuxIconView3 = this.LLJL;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, musicOwnerInfo.getVerified() ? 0 : 8);
            }
            if (this.LLJZIJLIL || !C630970Oox.LIZJ(musicOwnerInfo) || (((followStatus = musicOwnerInfo.getFollowStatus()) == null || followStatus.intValue() != 0) && (((followStatus2 = musicOwnerInfo.getFollowStatus()) == null || followStatus2.intValue() != 4) && !this.LLLI))) {
                C1908730zln c1908730zln = this.LLJLIL;
                if (c1908730zln != null) {
                    C630120Ona.LIZ(c1908730zln);
                }
            } else {
                this.LLLI = true;
                C1908730zln c1908730zln2 = this.LLJLIL;
                if (c1908730zln2 != null) {
                    C630120Ona.LIZIZ(c1908730zln2);
                }
                Integer followStatus3 = musicOwnerInfo.getFollowStatus();
                if (followStatus3 == null || followStatus3.intValue() != 1) {
                    C1908730zln c1908730zln3 = this.LLJLIL;
                    if (c1908730zln3 != null) {
                        C427690Gpr.LJI(c1908730zln3, null);
                    }
                } else {
                    C1908730zln c1908730zln4 = this.LLJLIL;
                    if (c1908730zln4 != null) {
                        c1908730zln4.setOnTouchListener(null);
                    }
                }
                C1908730zln c1908730zln5 = this.LLJLIL;
                if (c1908730zln5 != null) {
                    c1908730zln5.setDataChangeListener(new AwS588S0100000_9(this, 493));
                }
                User user = new User();
                user.setUid(musicOwnerInfo.getUid());
                user.setSecUid(musicOwnerInfo.getSecUid());
                user.setNickname(musicOwnerInfo.getNickName());
                Integer followStatus4 = musicOwnerInfo.getFollowStatus();
                user.setFollowStatus(followStatus4 != null ? followStatus4.intValue() : 0);
                Integer followerStatus = musicOwnerInfo.getFollowerStatus();
                user.setFollowerStatus(followerStatus != null ? followerStatus.intValue() : 0);
                user.setPrivateAccount(musicOwnerInfo.isPrivateAccount());
                C1908730zln c1908730zln6 = this.LLJLIL;
                if (c1908730zln6 != null) {
                    C0SWE c0swe = new C0SWE(user);
                    c0swe.LIZIZ = EnumC1357230lQH.NORMAL;
                    Context context = getContext();
                    c0swe.LJFF = context != null ? C0SY5.LIZIZ(context) : null;
                    c0swe.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(Boolean.FALSE, 52), new Pair(Boolean.TRUE, 52));
                    c1908730zln6.LLLLZIL(c0swe.LIZ());
                }
                C1908730zln c1908730zln7 = this.LLJLIL;
                if (c1908730zln7 != null) {
                    c1908730zln7.setTracker(new AwS553S0100000_9(this, 1684));
                }
            }
            View view4 = this.LLJLL;
            if (view4 != null) {
                C786410Ut5.I7(new ACListenerS113S0200000_9(this, musicOwnerInfo, 20), view4);
            }
        } else {
            TuxTextView tuxTextView8 = this.LLJJL;
            if (tuxTextView8 != null) {
                tuxTextView8.setText(musicOwnerInfo instanceof UncertMusicOwnerInfo ? ((UncertMusicOwnerInfo) musicOwnerInfo).getName() : musicOwnerInfo.getNickName());
            }
            Context context2 = getContext();
            if (context2 == null || (resources = context2.getResources()) == null || (string = resources.getString(2131837773, Integer.valueOf(list.size() - 1))) == null) {
                string = "";
            }
            TuxTextView tuxTextView9 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView9 != null) {
                tuxTextView9.setText(string);
            }
            TuxTextView tuxTextView10 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView10 != null) {
                C630120Ona.LIZIZ(tuxTextView10);
            }
            TuxIconView tuxIconView4 = this.LLJL;
            if (tuxIconView4 != null) {
                C630120Ona.LIZ(tuxIconView4);
            }
            C1908730zln c1908730zln8 = this.LLJLIL;
            if (c1908730zln8 != null) {
                C630120Ona.LIZ(c1908730zln8);
            }
            View view5 = this.LLJLL;
            if (view5 != null) {
                C786410Ut5.I7(new ACListenerS113S0200000_9(this, list, 21), view5);
            }
        }
        if (!this.LLJZ || (view = this.LLJLL) == null) {
            return;
        }
        C427690Gpr.LJ(view, 0.0f);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    public final void mp(String str) {
        String mid;
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        MusicReleaseInfo musicReleaseInfo;
        boolean z = false;
        if (str != null && str.length() != 0 && C297080Bkg.LIZ() != 4) {
            Music music = this.LLJLLL;
            if (music != null && (matchedPGCSoundInfo = music.getMatchedPGCSoundInfo()) != null && (musicReleaseInfo = matchedPGCSoundInfo.getMusicReleaseInfo()) != null && musicReleaseInfo.isNewReleaseSong()) {
                z = true;
            }
            Music music2 = this.LLJLLL;
            if (music2 != null) {
                mid = music2.getMid();
            } else {
                mid = null;
            }
            C1398280mUU.LJ(str, mid, (String) this.LLL.getValue(), z, z);
            String string = UUID.randomUUID().toString();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://music/detail/");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str);
            smartRouteBuildRoute.withParam("process_id", string);
            smartRouteBuildRoute.open();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        User user;
        if (c888460YtI != null) {
            user = c888460YtI.LIZ;
        } else {
            user = null;
        }
        if (C631000Op0.LIZ(user, this.LLLFZ)) {
            lp();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUnBlockUserEvent(C486890J7n c486890J7n) {
        User user;
        if (c486890J7n != null) {
            user = c486890J7n.LIZ;
        } else {
            user = null;
        }
        if (C631000Op0.LIZJ(user, this.LLLFZ)) {
            lp();
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        EventBus.LIZLLL().LJIJJ(this);
        this.LLJLLIL = view.findViewById(R.id.vw_line_divider);
        this.LLJJJJ = view.findViewById(R.id.ng7);
        this.LLJJI = (TuxIconView) view.findViewById(R.id.low);
        this.LLJJIII = (TuxIconView) view.findViewById(R.id.lp7);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.tv_pgc_meta_music_prefix);
        this.LLJJJIL = view.findViewById(R.id.nfi);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.tv_pgc_meta_music);
        if (this.LLJZIJLIL) {
            this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.tv_pgc_meta_music_second_line);
        }
        this.LLJJJ = (C419980GdQ) view.findViewById(R.id.x1x);
        this.LLJJJJJIL = (TuxIconView) view.findViewById(R.id.l95);
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.tv_pgc_meta_artist_prefix);
        this.LLJJL = (TuxTextView) view.findViewById(R.id.tv_pgc_meta_artist);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.tv_pgc_meta_artist_count);
        this.LLJL = (TuxIconView) view.findViewById(R.id.l97);
        this.LLJLIL = (C1908730zln) view.findViewById(R.id.tu6);
        this.LLJLILLLLZIIL = (TuxIconView) view.findViewById(R.id.l96);
        this.LLJLL = view.findViewById(R.id.ou7);
        AssemVMLazy assemVMLazy = this.LLLF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OoY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS375S0200000_9(this, view, 78), 14, null);
        C736680Sv4.LJIIIIZZ(this, this.LLLF.getValue(), new C2217381BqS() { // from class: X.0Onr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C629660Omq) obj).LLILLJJLI);
            }
        }, null, new AwS445S0200000_9(this, view, 13), 6);
        C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0OnL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C629660Omq) obj).LLILZ);
            }
        }, new C2217381BqS() { // from class: X.0OnM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C629660Omq) obj).LLILLL);
            }
        }, null, new AwS658S0100000_9(this, 15), 12);
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(this, new AObserverS213S0100000_9(this, 7));
    }
}
