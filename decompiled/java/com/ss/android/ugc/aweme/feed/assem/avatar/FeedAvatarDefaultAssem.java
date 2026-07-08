package com.ss.android.ugc.aweme.feed.assem.avatar;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C03H5;
import X.C03ID;
import X.C0BKH;
import X.C0C64;
import X.C0HHT;
import X.C0RLI;
import X.C0S1C;
import X.C0S1K;
import X.C0SE1;
import X.C0SXF;
import X.C0SZ0;
import X.C0XQ7;
import X.C1076010e6h;
import X.C10EU;
import X.C1210280hbG;
import X.C1220000hqw;
import X.C1245160iVW;
import X.C127G;
import X.C1303280k1G;
import X.C1323820kYO;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1336205Ku;
import X.C1339140kx6;
import X.C13LE;
import X.C1548820qPI;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1610490s0l;
import X.C1610500s0m;
import X.C1610550s0r;
import X.C1610560s0s;
import X.C1610570s0t;
import X.C1610600s0w;
import X.C1610610s0x;
import X.C1610620s0y;
import X.C1610630s0z;
import X.C1610640s10;
import X.C1610650s11;
import X.C1619980sG4;
import X.C1637806bA;
import X.C1637906bB;
import X.C17977072h;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C1A5L;
import X.C1AV2;
import X.C1AV3;
import X.C20684815ws;
import X.C2174761A9i;
import X.C2176211AEx;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2276411E8h;
import X.C2277711EDh;
import X.C2344009Gk;
import X.C284010BBf;
import X.C288460BSi;
import X.C289090BUt;
import X.C291001Au;
import X.C300170Bpf;
import X.C302070Bsj;
import X.C328100Ctc;
import X.C384050F3z;
import X.C397901gf;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C430210Gtv;
import X.C430230Gtx;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C637980P0q;
import X.C694250RLb;
import X.C694260RLc;
import X.C694270RLd;
import X.C714740S1w;
import X.C723700Sa8;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C725080ScM;
import X.C726220SeC;
import X.C729510SjV;
import X.C735550StF;
import X.C736950SvV;
import X.C737030Svd;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C799570VYd;
import X.C814420VxA;
import X.EnumC713160RyE;
import X.InterfaceC1256690io7;
import X.InterfaceC1345705Ol;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC709040Rra;
import X.InterfaceC732170Snn;
import X.ViewOnClickListenerC735530StD;
import Y.ALAdapterS9S0300000_19;
import Y.AObjectS64S0000000_11;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS27S0400000_19;
import Y.ARunnableS52S0300000_19;
import Y.ARunnableS88S0200000_19;
import Y.AUListenerS268S0100000_19;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultVM;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.reply.MessageDraftViewModel;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.story.ability.StoryViewMoreButtonAbility;
import com.ss.android.ugc.feed.platform.panel.login.ILoginFollowAbility;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS138S1100000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedAvatarDefaultAssem extends FeedBaseContentAssem<FeedAvatarDefaultAssem> implements FeedDefaultAvatarAbility, InterfaceC1554640qYg {
    public static final C0RLI LLLJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJL;
    public static final String LLLL;
    public static final String LLLLII;
    public static final float LLLLIIIILLL;
    public static final String LLLLIIL;
    public C1303280k1G LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public C430210Gtv LLJJL;
    public RelativeLayout LLJJLIIIJLLLLLLLZ;
    public C430210Gtv LLJL;
    public C430230Gtx LLJLIL;
    public SmartImageView LLJLILLLLZIIL;
    public ImageView LLJLL;
    public RemoteImageView LLJLLIL;
    public TuxIconView LLJLLL;
    public View LLJZ;
    public TuxIconView LLJZIJLIL;
    public final C01GW LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), new C1610620s0y());
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final C736950SvV LLLFFI;
    public final C01GW LLLFZ;
    public final boolean LLLI;
    public final C1610500s0m LLLII;
    public final C630740Ooa LLLIIII;
    public boolean LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public C714740S1w LLLILZ;
    public final C01GW LLLILZJ;
    public String LLLILZLLLI;
    public final ViewOnClickListenerC735530StD LLLIZZ;
    public C127G LLLJ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0RLI] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedAvatarDefaultAssem.class, "avatarDefaultVM", "getAvatarDefaultVM()Lcom/ss/android/ugc/aweme/feed/assem/avatar/FeedAvatarDefaultVM;", 0);
        C13LE.LIZ.getClass();
        LLLJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(FeedAvatarDefaultAssem.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0)};
        LLLJIL = new Object() { // from class: X.0RLI
        };
        LLLL = "FeedAvatarView";
        LLLLII = "avatar_resize";
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        int i = C0SZ0.LJIILLIIL;
        LLLLIIIILLL = C418440Gaw.LIZIZ(6);
        LLLLIIL = "send";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final void Bs2(InterfaceC709040Rra interfaceC709040Rra, int i) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Fn1(ReusedUIAssem<? extends C03H5> reusedUIAssem, Function0<Unit> function0) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final Rect Hs2() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        ProfileBadgeServiceImpl.createIProfileBadgeServicebyMonsterPlugin(false).unsubscribe(this.LLLII);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final Rect Zl() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final Drawable bf2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final int[] cB1() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final Pair<Integer, Integer> nQ2() {
        return null;
    }

    public final void op() {
        Ap(C1AV3.LIZ(5, "Feed", null, "avatar"));
        mp("show");
        if (C0BKH.LIZ()) {
            dp();
        }
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1143000686) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void wR(int i) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final View y9() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0s0m] */
    public FeedAvatarDefaultAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedAvatarDefaultVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, c1637906bB, new C694260RLc(c19719912DlLIZ), null, new C1610610s0x());
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoDiggVM.class);
        this.LLLFF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new C694270RLd(c19719912DlLIZ2), null, new C1610640s10());
        this.LLLFFI = new C736950SvV(C13LE.LIZ(MessageDraftViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), new C1610630s0z(), new C0S1C(this), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLLFZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(138));
        this.LLLI = C2174761A9i.LIZIZ();
        this.LLLII = new InterfaceC1256690io7() { // from class: X.0s0m
            @Override // X.InterfaceC1256690io7
            public final void LIZ(ProfileBadgeStruct profileBadgeStruct) {
                String authorUid;
                Aweme aweme;
                User author;
                Aweme aweme2;
                FeedAvatarDefaultVM feedAvatarDefaultVMEp = this.LIZ.ep();
                if (profileBadgeStruct == null) {
                    feedAvatarDefaultVMEp.getClass();
                    return;
                }
                VideoItemParams item = feedAvatarDefaultVMEp.getItem();
                if (item != null && (aweme2 = item.getAweme()) != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme2);
                } else {
                    authorUid = null;
                }
                if (!Intrinsics.LJFF(authorUid, ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().getUid())) {
                    return;
                }
                VideoItemParams item2 = feedAvatarDefaultVMEp.getItem();
                if (item2 != null && (aweme = item2.getAweme()) != null && (author = aweme.getAuthor()) != null) {
                    author.setProfileBadgeStruct(profileBadgeStruct);
                }
                feedAvatarDefaultVMEp.withState(new AwS138S1100000_24(feedAvatarDefaultVMEp.wQ2(), feedAvatarDefaultVMEp, 14));
            }
        };
        this.LLLIIII = C628500Oky.LIZ(new C1610550s0r(this));
        this.LLLIIIL = C452501pT.LIZIZ(new C735550StF(this));
        this.LLLIIL = C452501pT.LIZIZ(new C694250RLb(this));
        this.LLLIILIL = C452501pT.LIZIZ(new C1610600s0w());
        this.LLLIL = C452501pT.LIZIZ(new C1610570s0t());
        this.LLLILZJ = C452501pT.LIZIZ(new C1610560s0s());
        this.LLLIZZ = new ViewOnClickListenerC735530StD(this);
    }

    public final void Bp() {
        TuxIconView tuxIconView;
        StoryViewMoreButtonAbility storyViewMoreButtonAbility;
        User author;
        if (!C2277711EDh.LIZIZ.LJIIJ() || (tuxIconView = this.LLJJJJJIL) == null || C1336205Ku.LIZJ().LIZJ()) {
            return;
        }
        if (((Number) C289090BUt.LIZ.getValue()).intValue() == 2) {
            C786410Ut5.LJLLLLLL(8, tuxIconView);
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if ((C729510SjV.LJJIJIL(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()) || (C302070Bsj.LIZ() != 6 && C302070Bsj.LIZ() != 7)) && (storyViewMoreButtonAbility = (StoryViewMoreButtonAbility) this.LLLIIII.getValue()) != null && storyViewMoreButtonAbility.isVisible()) {
            C0S1K c0s1k = C0S1K.LIZIZ;
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c0s1k.LIZ(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme(), EnumC713160RyE.FEED, null)) {
                C786410Ut5.LJLLLLLL(0, tuxIconView);
                op();
                return;
            }
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme();
        if (aweme == null || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 2 || C10EU.LJIILLIIL(author)) {
            C786410Ut5.LJLLLLLL(8, tuxIconView);
            return;
        }
        InterfaceC1345705Ol imUserService = C1336205Ku.LIZ(false).getImUserService();
        C724270Sb3 c724270Sb34 = this.LLJI;
        imUserService.LJII(((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme(), new AwS390S0200000_24(this, tuxIconView, 7));
    }

    public final void dp() {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        String str;
        String uid;
        C2189821An6 c2189821An6;
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            return;
        }
        boolean z = false;
        if (!C0BKH.LIZ()) {
            cp(false);
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        if (AwemeExtKt.isDelete(aweme)) {
            cp(false);
            return;
        }
        if (C0SE1.LIZ()) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).baseFeedPageParams;
            String uid2 = (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null) ? null : c2189821An6.getUid();
            String str2 = "";
            if (uid2 == null) {
                uid2 = "";
            }
            C724270Sb3 c724270Sb33 = this.LLJI;
            BaseFeedPageParams baseFeedPageParams2 = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).baseFeedPageParams;
            if (baseFeedPageParams2 == null || (str = baseFeedPageParams2.eventType) == null) {
                str = "";
            }
            User userLIZ = C328100Ctc.LIZ(aweme, uid2, str);
            if (userLIZ != null && (uid = userLIZ.getUid()) != null) {
                str2 = uid;
            }
            if (str2.length() > 0 && !TextUtils.equals(str2, AwemeExtKt.getAuthorUid(aweme))) {
                cp(false);
                return;
            }
        }
        if ((C0SXF.LJIL(getContext()) && C726220SeC.LIZIZ.LIZLLL()) || !C10EU.LJIIJJI(aweme)) {
            cp(false);
            return;
        }
        if (ip().getVisibility() == 0 || (((tuxIconView = this.LLJJJJJIL) != null && tuxIconView.getVisibility() == 0) || ((tuxIconView2 = this.LLJLLL) != null && tuxIconView2.getVisibility() == 0))) {
            z = true;
        }
        cp(!z);
    }

    public final FeedAvatarDefaultVM ep() {
        return (FeedAvatarDefaultVM) this.LLLF.getValue(this, LLLJL[0]);
    }

    public final int hp() {
        return ((Number) this.LLLIIIL.getValue()).intValue();
    }

    public final AppCompatImageView ip() {
        if (C1210280hbG.LIZJ) {
            TuxIconView tuxIconView = this.LLJZIJLIL;
            if (tuxIconView != null) {
                return tuxIconView;
            }
        } else {
            C1303280k1G c1303280k1G = this.LLJJJJ;
            if (c1303280k1G != null) {
                return c1303280k1G;
            }
        }
        return null;
    }

    public final VideoEventDispatchViewModel kp() {
        return (VideoEventDispatchViewModel) this.LLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.avatar.FeedDefaultAvatarAbility
    public final boolean rH0() {
        C1303280k1G c1303280k1G = this.LLJJJJ;
        if (c1303280k1G == null) {
            c1303280k1G = null;
        }
        if (c1303280k1G.getVisibility() == 0) {
            return true;
        }
        TuxIconView tuxIconView = this.LLJZIJLIL;
        return (tuxIconView != null ? tuxIconView : null).getVisibility() == 0;
    }

    public final boolean yp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        User author = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAuthor();
        return ((SocialAvatarAccess) this.LLLILZJ.getValue()).LIZ() && C1245160iVW.LIZLLL(author) && C1245160iVW.LIZ(author);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MessageDraftViewModel.class, new AObjectS64S0000000_11(this, 11)}, defaultViewModelProviderFactory);
                    this.LLLJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C2276411E8h.LIZIZ.LJII("common_feed", "assem", "default assem oncreated");
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(this, new Observer() { // from class: X.0hbp
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws JSONException {
                this.LL.sp(new FollowStatusEvent((FollowStatus) obj));
            }
        });
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void zp() {
        AvatarSizeUrlStruct dynamicSocialAvatar;
        final UrlModel urlModel;
        if (yp()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            User author = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAuthor();
            if (author == null || (dynamicSocialAvatar = author.getDynamicSocialAvatar()) == null || (urlModel = dynamicSocialAvatar.avatarLarger) == null) {
                return;
            }
            C430230Gtx c430230Gtx = this.LLJLIL;
            if (c430230Gtx == null) {
                c430230Gtx = null;
            }
            int visibility = c430230Gtx.getVisibility();
            c430230Gtx.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c430230Gtx);
            final C1339140kx6 c1339140kx6 = new C1339140kx6(this, 0);
            C430230Gtx c430230Gtx2 = this.LLJLIL;
            final C430230Gtx c430230Gtx3 = c430230Gtx2 != null ? c430230Gtx2 : null;
            final int[] iArr = (int[]) this.LLLIILIL.getValue();
            final int iHp = hp();
            final int iHp2 = hp();
            final String str = (String) this.LLLIIL.getValue();
            if (!C430230Gtx.LLJILJILJ) {
                c430230Gtx3.LJIIIZ(urlModel, iArr, iHp, iHp2, str, c1339140kx6);
            } else {
                c430230Gtx3.getClass();
                C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0Gu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SmartAvatarVideoBorderView@4437.bindImage$1");
                        try {
                            c430230Gtx3.LJIIIZ(urlModel, iArr, iHp, iHp2, str, c1339140kx6);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SmartAvatarVideoBorderView@4437.bindImage$1");
                    }
                });
            }
        }
    }

    public final void Ap(C1AV2 c1av2) {
        boolean z;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        boolean z2 = true;
        int i = 0;
        if (ip().getVisibility() == 0 || (((tuxIconView = this.LLJJJJJIL) != null && tuxIconView.getVisibility() == 0) || ((tuxIconView2 = this.LLJLLL) != null && tuxIconView2.getVisibility() == 0))) {
            z = false;
        } else {
            z = true;
        }
        if (!C0SXF.LJIL(getContext()) || !C726220SeC.LIZIZ.LIZLLL()) {
            z2 = false;
        }
        if (z) {
            if (z2) {
                i = 8;
            } else {
                i = 4;
            }
        }
        ViewGroup viewGroup = this.LLJJJJLIIL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        Gp(viewGroup, i, c1av2);
    }

    public final void Ep(String str) {
        Object obj;
        String secUid;
        Object id;
        ProfileBadgeStruct profileBadge;
        int i;
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        if (smartImageView != null) {
            if (str != null && str.length() != 0) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLFF(i, smartImageView);
        }
        if (str != null && str.length() != 0) {
            if (this.LLJLILLLLZIIL != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJ(this.LLJLILLLLZIIL);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
            if (!C300170Bpf.LIZ()) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                Object obj2 = null;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                Aweme aweme = ((VideoItemParams) obj).getAweme();
                if (aweme == null) {
                    return;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                User author = aweme.getAuthor();
                if (author != null) {
                    secUid = author.getSecUid();
                } else {
                    secUid = null;
                }
                c2344009Gk.LJIIIIZZ("author_id", secUid);
                User author2 = aweme.getAuthor();
                if (author2 == null || (profileBadge = author2.getProfileBadge()) == null || (id = profileBadge.getId()) == null) {
                    id = "";
                }
                c2344009Gk.LJ(id, "badge_id");
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                c2344009Gk.LJIIIIZZ("enter_from", ((VideoItemParams) obj2).mEventType);
                C20684815ws.LJIILLIIL("profile_badge_show", c2344009Gk.LIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.avatar.FeedDefaultAvatarAbility
    public final void UE0(String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (aweme == null) {
            return;
        }
        C737030Svd c737030Svd = new C737030Svd(38, aweme);
        if (str != null) {
            c737030Svd.LJIIJ = str;
            c737030Svd.LJIIJJI = true;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        DataCenter dataCenter = ((VideoItemParams) obj2).dataCenter;
        if (dataCenter != null) {
            dataCenter.zQ2(c737030Svd, "feed_internal_event");
        }
    }

    public final void cp(boolean z) {
        float f;
        RelativeLayout relativeLayout = this.LLJJLIIIJLLLLLLLZ;
        if (relativeLayout == null) {
            return;
        }
        if (z) {
            f = LLLLIIIILLL;
        } else {
            f = 0.0f;
        }
        RelativeLayout relativeLayout2 = null;
        if (relativeLayout.getTranslationY() != f) {
            RelativeLayout relativeLayout3 = this.LLJJLIIIJLLLLLLLZ;
            if (relativeLayout3 != null) {
                relativeLayout2 = relativeLayout3;
            }
            C786410Ut5.id(relativeLayout2, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.avatar.FeedDefaultAvatarAbility
    public final void kv0(String str) {
        ViewGroup viewGroup = null;
        if (str != null && str.length() > 0) {
            this.LLLILZLLLI = str;
            try {
                ViewOnClickListenerC735530StD viewOnClickListenerC735530StD = this.LLLIZZ;
                ViewGroup viewGroup2 = this.LLJJJJLIIL;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                viewOnClickListenerC735530StD.onClick(viewGroup2);
                this.LLLILZLLLI = null;
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLLILZLLLI = null;
                throw th;
            }
        }
        ViewOnClickListenerC735530StD viewOnClickListenerC735530StD2 = this.LLLIZZ;
        ViewGroup viewGroup3 = this.LLJJJJLIIL;
        if (viewGroup3 != null) {
            viewGroup = viewGroup3;
        }
        viewOnClickListenerC735530StD2.onClick(viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lp(com.ss.android.ugc.aweme.profile.model.User r13) {
        /*
            r12 = this;
            boolean r0 = r12.yp()
            r2 = 0
            if (r0 == 0) goto L99
            X.0Sb3 r0 = r12.LLJI
            if (r0 == 0) goto L96
            java.lang.Object r0 = r0.LL
        Ld:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo r0 = X.C1245160iVW.LIZIZ(r0)
            if (r0 == 0) goto L48
            java.lang.Integer r0 = r0.socialAvatarBackgroundTag
            if (r0 == 0) goto L48
            int r4 = r0.intValue()
            java.lang.Class<com.ss.android.ugc.ur.socialavatar.ISocialAvatarService> r5 = com.ss.android.ugc.ur.socialavatar.ISocialAvatarService.class
            r6 = 0
            r3 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarService r1 = (com.ss.android.ugc.ur.socialavatar.ISocialAvatarService) r1
            if (r1 == 0) goto L40
            X.0Gtv r0 = r12.LLJL
            if (r0 != 0) goto L3d
            r0 = r2
        L3d:
            r1.LJFF(r4, r0, r2)
        L40:
            X.0Gtv r0 = r12.LLJL
            if (r0 != 0) goto L45
            r0 = r2
        L45:
            X.C786410Ut5.n(r0, r3)
        L48:
            if (r13 == 0) goto Laa
            com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct r0 = r13.getSocialAvatarWithoutBackground()
            if (r0 == 0) goto Laa
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r0.avatarLarger
        L52:
            X.0Gtv r4 = r12.LLJJL
            if (r4 != 0) goto L57
            r4 = r2
        L57:
            X.01GW r0 = r12.LLLIILIL
            java.lang.Object r6 = r0.getValue()
            int[] r6 = (int[]) r6
            int r7 = r12.hp()
            int r8 = r12.hp()
            X.01GW r0 = r12.LLLIIL
            java.lang.Object r9 = r0.getValue()
            java.lang.String r9 = (java.lang.String) r9
            r10 = 1
            X.0Ntj r3 = X.C608450Ntj.LIZ
            X.0Sb3 r0 = r12.LLJI
            if (r0 == 0) goto L94
            java.lang.Object r0 = r0.LL
        L78:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.getAweme()
            X.0Sb3 r0 = r12.LLJI
            if (r0 == 0) goto L84
            java.lang.Object r2 = r0.LL
        L84:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r2 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r2
            java.lang.String r0 = r2.mEventType
            r3.getClass()
            X.0Nth r11 = new X.0Nth
            r11.<init>(r1, r0)
            r4.LJIIJ(r5, r6, r7, r8, r9, r10, r11)
            return
        L94:
            r0 = r2
            goto L78
        L96:
            r0 = r2
            goto Ld
        L99:
            X.0Gtv r1 = r12.LLJL
            if (r1 != 0) goto L9e
            r1 = r2
        L9e:
            r0 = 8
            X.C786410Ut5.n(r1, r0)
            if (r13 == 0) goto Laa
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r13.getAvatarThumb()
            goto L52
        Laa:
            r5 = r2
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem.lp(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public final void mp(String str) {
        Object obj;
        Object obj2;
        String authorUid;
        Object obj3;
        String aid;
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj4 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", ((VideoItemParams) obj).mEventType);
        c2344009Gk.LJIIIIZZ("enter_method", "head_icon");
        c2344009Gk.LJIIIIZZ("event_type", str);
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        Aweme aweme = ((VideoItemParams) obj2).getAweme();
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        } else {
            obj3 = null;
        }
        Aweme aweme2 = ((VideoItemParams) obj3).getAweme();
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj4 = c724270Sb34.LL;
        }
        if (C729510SjV.LJJIJIL(((VideoItemParams) obj4).getAweme())) {
            str2 = "story";
        } else {
            str2 = "post";
        }
        c2344009Gk.LJIIIIZZ("story_type", str2);
        C20684815ws.LJIILLIIL("reply_friend_im", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(final View view) {
        Object obj;
        Aweme aweme;
        Object obj2;
        String uid;
        Object obj3;
        User author;
        String uid2;
        Object obj4;
        Object obj5;
        String str;
        C2189821An6 c2189821An6;
        Context context;
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        c2276411E8h.LJII("common_feed", "assem", "default assem onViewCreated");
        this.LLJZ = view;
        if (C288460BSi.LIZ && view != null) {
            view.setEnabled(false);
        }
        this.LLJZIJLIL = (TuxIconView) view.findViewById(R.id.iet);
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        InterfaceC732170Snn interfaceC732170SnnLJJL = c19252910Tv.LIZLLL().LJIJI().LJJL();
        TuxIconView tuxIconView = this.LLJZIJLIL;
        Object obj6 = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        interfaceC732170SnnLJJL.LJIJI(tuxIconView);
        C1303280k1G c1303280k1G = (C1303280k1G) view.findViewById(R.id.idt);
        this.LLJJJJ = c1303280k1G;
        if (c1303280k1G == null) {
            c1303280k1G = null;
        }
        c1303280k1G.setAnimation("common_feed_anim_follow_people.json");
        if (C1210280hbG.LIZJ) {
            TuxIconView tuxIconView2 = this.LLJZIJLIL;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            C1303280k1G c1303280k1G2 = this.LLJJJJ;
            if (c1303280k1G2 == null) {
                c1303280k1G2 = null;
            }
            C786410Ut5.i(c1303280k1G2, 8);
        }
        TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.g04);
        this.LLJJJJJIL = tuxIconView3;
        if (tuxIconView3 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
            tuxIconView3.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        TuxIconView tuxIconView4 = (TuxIconView) view.findViewById(R.id.fys);
        this.LLJLLL = tuxIconView4;
        if (tuxIconView4 != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.bx);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
            tuxIconView4.setBackground(c384050F3z2.LIZ(view.getContext()));
        }
        this.LLJJLIIIJLLLLLLLZ = (RelativeLayout) view.findViewById(R.id.bi2);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.iej);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "home_ui_optimize_follow_clickable_area", true, false)) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            C786410Ut5.X5(layoutParams, viewGroup);
        }
        c19252910Tv.LIZLLL().LJIJI().LJJL().LJIJJ(viewGroup);
        C786410Ut5.K7(viewGroup, new View.OnClickListener() { // from class: X.0Sua
            /* JADX WARN: Type inference failed for: r1v46, types: [X.0S1w] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                boolean z;
                AwemeRawAd awemeRawAdLJJIJL;
                Object obj7;
                String string;
                Object obj8;
                Object obj9;
                Object obj10;
                Object obj11;
                Object obj12;
                Object obj13;
                Object obj14;
                C19EG c19egLIZIZ;
                Object obj15;
                String strVQ2;
                boolean zLJI = MethodIDManager.LJI(72085);
                final Aweme aweme2 = ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme();
                if (aweme2 == null) {
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                if (!C0SE5.LIZIZ(aweme2) && (aweme2.getAuthor() == null || TextUtils.isEmpty(AwemeExtKt.getAuthorUid(aweme2)))) {
                    Context context2 = this.LL.getContext();
                    if (context2 != null) {
                        C1233040iBy c1233040iBy = new C1233040iBy(context2);
                        c1233040iBy.LIZIZ(2131837303);
                        c1233040iBy.LIZLLL();
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                TuxIconView tuxIconView5 = this.LL.LLJJJJJIL;
                if (tuxIconView5 != null && tuxIconView5.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                String requestId = null;
                C0I08 c0i08 = null;
                Object obj16 = null;
                if (z) {
                    this.LL.mp("click");
                    final FeedAvatarDefaultAssem feedAvatarDefaultAssem = this.LL;
                    feedAvatarDefaultAssem.getClass();
                    C724270Sb3 c724270Sb3 = feedAvatarDefaultAssem.LLJI;
                    if (c724270Sb3 != null) {
                        obj11 = c724270Sb3.LL;
                    } else {
                        obj11 = null;
                    }
                    String str2 = ((VideoItemParams) obj11).mEventType;
                    C724270Sb3 c724270Sb32 = feedAvatarDefaultAssem.LLJI;
                    if (c724270Sb32 != null) {
                        obj12 = c724270Sb32.LL;
                    } else {
                        obj12 = null;
                    }
                    String aid = ((VideoItemParams) obj12).getAweme().getAid();
                    C724270Sb3 c724270Sb33 = feedAvatarDefaultAssem.LLJI;
                    if (c724270Sb33 != null) {
                        obj13 = c724270Sb33.LL;
                    } else {
                        obj13 = null;
                    }
                    String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) obj13).getAweme());
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    C724270Sb3 c724270Sb34 = feedAvatarDefaultAssem.LLJI;
                    if (c724270Sb34 != null) {
                        obj14 = c724270Sb34.LL;
                    } else {
                        obj14 = null;
                    }
                    User author2 = ((VideoItemParams) obj14).getAweme().getAuthor();
                    c735840Sti.getClass();
                    QuickDMEventParam quickDMEventParam = new QuickDMEventParam("feed", str2, aid, authorUid, String.valueOf(C735840Sti.LJIIIIZZ(author2)), null, null, null, false, false, null, false, 16352);
                    Context context3 = feedAvatarDefaultAssem.getContext();
                    if (context3 != null && (c19egLIZIZ = C1388190mED.LIZIZ(context3)) != null) {
                        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                        FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                        C724270Sb3 c724270Sb35 = feedAvatarDefaultAssem.LLJI;
                        if (c724270Sb35 != null) {
                            obj15 = c724270Sb35.LL;
                        } else {
                            obj15 = null;
                        }
                        String str3 = ((VideoItemParams) obj15).mEventType;
                        EnumC896890ZGl enumC896890ZGl = EnumC896890ZGl.TYPE_FEED_AIRPLANE_ICON;
                        QuickDMEventParam quickDMEventParamLIZ = QuickDMEventParam.LIZ(quickDMEventParam, null, C0S1J.HEAD_ICON, C1389300mG0.LIZIZ(C724240Sb0.LJI(feedAvatarDefaultAssem)), 12223);
                        if (C300660BqS.LIZ() && aweme2.getAuthor() != null && aweme2.getAuthor().getUid() != null) {
                            strVQ2 = ((MessageDraftViewModel) feedAvatarDefaultAssem.LLLFFI.getValue()).vQ2(aweme2.getAuthor().getUid());
                        } else {
                            strVQ2 = null;
                        }
                        if (C300660BqS.LIZ()) {
                            if (feedAvatarDefaultAssem.LLLILZ == null) {
                                feedAvatarDefaultAssem.LLLILZ = new C0I08() { // from class: X.0S1w
                                    @Override // X.C0I08
                                    public final void TG() {
                                    }

                                    @Override // X.C0I08
                                    public final void YO(C0I0E c0i0e, String str4) {
                                        if (c0i0e.isEligibleForDraft()) {
                                            if (aweme2.getAuthor() != null && aweme2.getAuthor().getUid() != null) {
                                                ((MessageDraftViewModel) feedAvatarDefaultAssem.LLLFFI.getValue()).wQ2(aweme2.getAuthor().getUid(), str4);
                                                return;
                                            }
                                            return;
                                        }
                                        ((MessageDraftViewModel) feedAvatarDefaultAssem.LLLFFI.getValue()).resetState();
                                    }
                                };
                            }
                            c0i08 = feedAvatarDefaultAssem.LLLILZ;
                        }
                        imChatService.LJIL(c19egLIZIZ, supportFragmentManager, aweme2, str3, enumC896890ZGl, quickDMEventParamLIZ, c0i08, strVQ2, new AwS590S0100000_11(feedAvatarDefaultAssem, 613));
                    }
                } else {
                    TuxIconView tuxIconView6 = this.LL.LLJLLL;
                    if (tuxIconView6 != null && tuxIconView6.getVisibility() == 0) {
                        if (zLJI) {
                            MethodIDManager.LJ();
                            return;
                        }
                        return;
                    }
                    if (C0SE5.LIZIZ(aweme2) && (aweme2.getAuthor() == null || TextUtils.isEmpty(AwemeExtKt.getAuthorUid(aweme2)))) {
                        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                            ILoginFollowAbility iLoginFollowAbility = (ILoginFollowAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), ILoginFollowAbility.class, null);
                            if (iLoginFollowAbility != null) {
                                iLoginFollowAbility.fn2(new C737030Svd(12, aweme2), new AwS412S0200000_11(this.LL, aweme2, 14));
                            }
                        } else {
                            this.LL.tp(aweme2);
                        }
                        if (zLJI) {
                            MethodIDManager.LJ();
                            return;
                        }
                        return;
                    }
                    Context context4 = this.LL.getContext();
                    if (context4 != null) {
                        FeedAvatarDefaultAssem feedAvatarDefaultAssem2 = this.LL;
                        View view3 = view;
                        DataCenter dataCenter = ((VideoItemParams) C631370Opb.LIZ(feedAvatarDefaultAssem2)).dataCenter;
                        if (dataCenter != null) {
                            dataCenter.zQ2(aweme2.getAid(), "VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR");
                        }
                        if (view2.getVisibility() != 4 && !C1017070cZd.LL(aweme2) && !AwemeExtKt.isDelete(aweme2)) {
                            if (aweme2.getAuthor() == null || (!C0SE5.LIZIZ(aweme2) && aweme2.getAuthor().getFollowStatus() != 0)) {
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                    return;
                                }
                                return;
                            }
                            if (Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), AwemeExtKt.getAuthorUid(aweme2))) {
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                    return;
                                }
                                return;
                            }
                            if ((AwemeExtKt.isAdTraffic(aweme2) || AwemeExtKt.isPseudoAd(aweme2)) && !C1017070cZd.LLF(aweme2)) {
                                C1029590ctp.LIZLLL().LJJIII(context4, aweme2);
                                if (!AwemeExtKt.isPseudoAd(aweme2)) {
                                    awemeRawAdLJJIJL = aweme2.getAwemeRawAd();
                                } else {
                                    awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme2);
                                }
                                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "follow", awemeRawAdLJJIJL);
                                c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(aweme2), "anchor_id");
                                c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(aweme2), "room_id");
                                c1022820ciuLIZLLL.LJIIIIZZ();
                            }
                            if (C1017070cZd.LLF(aweme2)) {
                                C1029590ctp.LIZLLL().LJIILLIIL(context4, aweme2);
                            }
                            C737030Svd c737030Svd = new C737030Svd(12, aweme2);
                            ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJI(c737030Svd.LIZJ, aweme2);
                            C724270Sb3 c724270Sb36 = feedAvatarDefaultAssem2.LLJI;
                            if (c724270Sb36 != null) {
                                obj7 = c724270Sb36.LL;
                            } else {
                                obj7 = null;
                            }
                            DataCenter dataCenter2 = ((VideoItemParams) obj7).dataCenter;
                            if (dataCenter2 != null) {
                                c737030Svd.LIZLLL = "feed";
                                C1440005kM.LIZ(c737030Svd);
                                dataCenter2.zQ2(c737030Svd, "feed_internal_event");
                            }
                            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                    return;
                                }
                                return;
                            }
                            C0OC0 c0oc0 = C0OC0.LIZ;
                            aweme2.getAuthor();
                            c0oc0.getClass();
                            if (C302070Bsj.LIZJ()) {
                                string = C343140Dcm.LIZLLL(2131822936, aweme2.getAuthor().getNickname());
                            } else {
                                string = context4.getString(2131822936, aweme2.getAuthor().getNickname());
                            }
                            C20096413kA.LIZ(context4, string);
                            Context context5 = feedAvatarDefaultAssem2.getContext();
                            String str4 = "";
                            if (context5 != null) {
                                C2189821An6 c2189821An6LIZ = C0SUC.LIZ(context5);
                                String str5 = "guide_dm";
                                if (c2189821An6LIZ.isCard()) {
                                    C1260910iuv c1260910iuv = new C1260910iuv(0);
                                    EnumC1260920iuw enumC1260920iuwLJJJ = C1260910iuv.LJJJ(c2189821An6LIZ.getExtraSceneType());
                                    if (!Intrinsics.LJFF(c2189821An6LIZ.getProfileEnterMethod(), "guide_dm")) {
                                        str5 = "share_link";
                                        if (!Intrinsics.LJFF(c2189821An6LIZ.getProfileEnterMethod(), "share_link")) {
                                            str5 = "click_add";
                                        }
                                    }
                                    C735840Sti c735840Sti2 = C735840Sti.LIZ;
                                    C19651011uW c19651011uW = C19651011uW.LIZIZ;
                                    String followRecommendTrackEnterFrom = c2189821An6LIZ.getFollowRecommendTrackEnterFrom();
                                    if (followRecommendTrackEnterFrom == null) {
                                        C724270Sb3 c724270Sb37 = feedAvatarDefaultAssem2.LLJI;
                                        if (c724270Sb37 != null) {
                                            obj10 = c724270Sb37.LL;
                                        } else {
                                            obj10 = null;
                                        }
                                        followRecommendTrackEnterFrom = ((VideoItemParams) obj10).mEventType;
                                    }
                                    c1260910iuv.LJJIJLIJ(followRecommendTrackEnterFrom);
                                    c1260910iuv.LJJLIIIJILLIZJL = enumC1260920iuwLJJJ;
                                    c1260910iuv.LJJJJLL();
                                    if (C296550Bjp.LIZ()) {
                                        String eventType = c2189821An6LIZ.getEventType();
                                        if (eventType == null) {
                                            C724270Sb3 c724270Sb38 = feedAvatarDefaultAssem2.LLJI;
                                            if (c724270Sb38 != null) {
                                                obj9 = c724270Sb38.LL;
                                            } else {
                                                obj9 = null;
                                            }
                                            eventType = ((VideoItemParams) obj9).mEventType;
                                        }
                                        if (!Intrinsics.LJFF(eventType, "personal_homepage") && !Intrinsics.LJFF(eventType, "others_homepage")) {
                                            c1260910iuv.LJJLIIIJJI = EnumC1260930iux.VIEW_POST_FOLLOW;
                                        } else {
                                            c1260910iuv.LJJLIIIJJI = EnumC1260930iux.PROFILE_VIDEO_FOLLOW;
                                        }
                                    } else {
                                        c1260910iuv.LJJLIIIJJI = EnumC1260930iux.PROFILE_VIDEO_FOLLOW;
                                    }
                                    c1260910iuv.LJIJI(aweme2);
                                    c1260910iuv.LJJJJZI(aweme2.getAuthor());
                                    c1260910iuv.LJJIL(str5);
                                    c1260910iuv.LJZ = C1234220iDs.LJIIIIZZ(C1234220iDs.LJI(aweme2.getAuthor()));
                                    c1260910iuv.LJJJJJ(c2189821An6LIZ.getPreviousPage());
                                    c1260910iuv.LJJJIL(c2189821An6LIZ.getMatchedFriendStructTrack());
                                    c1260910iuv.LJLJI = c2189821An6LIZ.isBigCard();
                                    c1260910iuv.LJLL = C0SXF.LJJIII(feedAvatarDefaultAssem2.getContext(), aweme2);
                                    c1260910iuv.LJJJJIZL(c2189821An6LIZ.getFollowRecommendPosition());
                                    String realNowType = c2189821An6LIZ.getRealNowType();
                                    if (realNowType == null) {
                                        realNowType = "";
                                    }
                                    c1260910iuv.LJLLI = realNowType;
                                    boolean zIsNewSuggested = c2189821An6LIZ.isNewSuggested();
                                    String followRecommendTrackEnterFrom2 = c2189821An6LIZ.getFollowRecommendTrackEnterFrom();
                                    if (followRecommendTrackEnterFrom2 == null) {
                                        C724270Sb3 c724270Sb39 = feedAvatarDefaultAssem2.LLJI;
                                        if (c724270Sb39 != null) {
                                            obj16 = c724270Sb39.LL;
                                        }
                                        followRecommendTrackEnterFrom2 = ((VideoItemParams) obj16).mEventType;
                                    }
                                    c1260910iuv.LJJJI(followRecommendTrackEnterFrom2, zIsNewSuggested);
                                    c1260910iuv.LJLJLLL = Intrinsics.LJFF(c2189821An6LIZ.getRecUserFrom(), C1261030iv7.INSTANCE.getValue());
                                    c1260910iuv.LJLZ = Intrinsics.LJFF(c2189821An6LIZ.getHasMLBBBadge(), Boolean.TRUE) ? 1 : 0;
                                    c1260910iuv.LJJIJLIJ = c2189821An6LIZ.getSearchId();
                                    Object objLJIIIZ = c19651011uW.LJIIIZ(aweme2, c1260910iuv);
                                    c735840Sti2.getClass();
                                    C735840Sti.LIZIZ(aweme2, objLJIIIZ);
                                    C1260910iuv c1260910iuv2 = (C1260910iuv) objLJIIIZ;
                                    C0XHV.LIZ.getClass();
                                    c1260910iuv2.LJLLLL = C0XHV.LIZ();
                                    c1260910iuv2.LLFII = c2189821An6LIZ.getFollowRecommendShowRelationLabel();
                                    if (C296550Bjp.LIZ()) {
                                        c1260910iuv2.LJJJJLI(C721800STa.LIZ(c2189821An6LIZ));
                                    }
                                    c1260910iuv2.LJIILJJIL();
                                } else if (Intrinsics.LJFF(c2189821An6LIZ.getProfileEnterMethod(), "guide_dm")) {
                                    C736400Suc c736400Suc = C736400Suc.LIZ;
                                    String profileEnterMethod = c2189821An6LIZ.getProfileEnterMethod();
                                    User author3 = aweme2.getAuthor();
                                    String type = EnumC1260930iux.PROFILE_VIDEO_FOLLOW.getType();
                                    c736400Suc.getClass();
                                    C736400Suc.LIZLLL(author3, profileEnterMethod, type);
                                } else {
                                    C724270Sb3 c724270Sb310 = feedAvatarDefaultAssem2.LLJI;
                                    if (c724270Sb310 != null) {
                                        obj8 = c724270Sb310.LL;
                                    } else {
                                        obj8 = null;
                                    }
                                    if (Intrinsics.LJFF(((VideoItemParams) obj8).mEventType, "others_homepage")) {
                                        C1260910iuv c1260910iuv3 = new C1260910iuv(0);
                                        EnumC1260920iuw enumC1260920iuwLJJJ2 = C1260910iuv.LJJJ(c2189821An6LIZ.getExtraSceneType());
                                        C735840Sti c735840Sti3 = C735840Sti.LIZ;
                                        C19651011uW c19651011uW2 = C19651011uW.LIZIZ;
                                        String followRecommendTrackEnterFrom3 = c2189821An6LIZ.getFollowRecommendTrackEnterFrom();
                                        if (followRecommendTrackEnterFrom3 == null && (followRecommendTrackEnterFrom3 = c2189821An6LIZ.getPreEventType()) == null) {
                                            followRecommendTrackEnterFrom3 = c2189821An6LIZ.getPreviousPage();
                                        }
                                        c1260910iuv3.LJJIJLIJ(followRecommendTrackEnterFrom3);
                                        c1260910iuv3.LJJLIIIJJI = EnumC1260930iux.PROFILE_VIDEO_FOLLOW;
                                        if (enumC1260920iuwLJJJ2 == null) {
                                            enumC1260920iuwLJJJ2 = EnumC1260920iuw.ITEM;
                                        }
                                        c1260910iuv3.LJJLIIIJILLIZJL = enumC1260920iuwLJJJ2;
                                        c1260910iuv3.LJJJJLL();
                                        c1260910iuv3.LJJLL = EnumC721820STc.CLICK_HEAD.getType();
                                        c1260910iuv3.LJJJJJL(c2189821An6LIZ.getUserRecType());
                                        c1260910iuv3.LJJJIL(c2189821An6LIZ.getMatchedFriendStructTrack());
                                        c1260910iuv3.LJIJI(aweme2);
                                        c1260910iuv3.LJJJJZI(aweme2.getAuthor());
                                        String enterFromRequestId = c2189821An6LIZ.getEnterFromRequestId();
                                        if (enterFromRequestId == null) {
                                            User author4 = aweme2.getAuthor();
                                            if (author4 != null) {
                                                requestId = author4.getRequestId();
                                            }
                                        } else {
                                            requestId = enterFromRequestId;
                                        }
                                        c1260910iuv3.LJJJJLI(requestId);
                                        Object objLJIIIZ2 = c19651011uW2.LJIIIZ(aweme2, c1260910iuv3);
                                        c735840Sti3.getClass();
                                        C735840Sti.LIZIZ(aweme2, objLJIIIZ2);
                                        ((C1260910iuv) objLJIIIZ2).LJJJJI();
                                    }
                                }
                            }
                            HashMap<String, String> map = C736390Sub.LIZ(view3.getContext()).LL;
                            if (C123100dR.LIZ(map.get("action_type")) && Intrinsics.LJFF(map.get("action_type"), EnumC1260930iux.FOLLOW.getType())) {
                                str4 = "click_maf_video";
                            }
                            C736400Suc c736400Suc2 = C736400Suc.LIZ;
                            User author5 = aweme2.getAuthor();
                            String str6 = map.get("action_type");
                            String str7 = map.get("relation_enter_from");
                            String str8 = map.get("rfevent_previous_page");
                            String str9 = map.get("rec_type");
                            c736400Suc2.getClass();
                            C736400Suc.LJ(author5, str6, str7, str8, str9, str4, aweme2);
                        } else {
                            if (zLJI) {
                                MethodIDManager.LJ();
                                return;
                            }
                            return;
                        }
                    }
                    C736400Suc c736400Suc3 = C736400Suc.LIZ;
                    Activity activityLIZ = C06MM.LIZ(this.LL.getContext());
                    EnumC1584370rKd enumC1584370rKd = EnumC1584370rKd.FEED;
                    c736400Suc3.getClass();
                    C736400Suc.LIZJ(activityLIZ, "follow", enumC1584370rKd, aweme2);
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }
        });
        this.LLJJJJLIIL = viewGroup;
        C430210Gtv c430210Gtv = (C430210Gtv) view.findViewById(R.id.user_avatar);
        c430210Gtv.setOnTouchListener(new C03ID());
        C2271391DvN.LIZ(c430210Gtv, (C1A5L) C2271381DvM.LJJIII.getValue());
        this.LLJJL = c430210Gtv;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        if (C637980P0q.LIZ(aweme) && (context = getContext()) != null) {
            C430210Gtv c430210Gtv2 = this.LLJJL;
            if (c430210Gtv2 == null) {
                c430210Gtv2 = null;
            }
            c430210Gtv2.setPlaceholderImage(new TuxIconDrawable(context, R.raw.icon_color_default_avatar));
        }
        this.LLJL = (C430210Gtv) view.findViewById(R.id.vng);
        this.LLJLIL = (C430230Gtx) view.findViewById(R.id.vnd);
        this.LLJLILLLLZIIL = (SmartImageView) view.findViewById(R.id.s7u);
        this.LLJLL = (ImageView) view.findViewById(R.id.f741lgo);
        this.LLJLLIL = (RemoteImageView) view.findViewById(R.id.bi7);
        if (((Boolean) C284010BBf.LIZ.getValue()).booleanValue()) {
            C430210Gtv c430210Gtv3 = this.LLJJL;
            if (c430210Gtv3 == null) {
                c430210Gtv3 = null;
            }
            c430210Gtv3.setBorderAttrRes(R.attr.a02);
            C430210Gtv c430210Gtv4 = this.LLJJL;
            if (c430210Gtv4 == null) {
                c430210Gtv4 = null;
            }
            c430210Gtv4.setBorderWidthPx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
            C430210Gtv c430210Gtv5 = this.LLJJL;
            if (c430210Gtv5 == null) {
                c430210Gtv5 = null;
            }
            c430210Gtv5.setRoundingParamsPadding(0.0f);
            C430210Gtv c430210Gtv6 = this.LLJL;
            if (c430210Gtv6 == null) {
                c430210Gtv6 = null;
            }
            c430210Gtv6.setBorderAttrRes(R.attr.a02);
            C430210Gtv c430210Gtv7 = this.LLJL;
            if (c430210Gtv7 == null) {
                c430210Gtv7 = null;
            }
            c430210Gtv7.setBorderWidthPx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
            C430210Gtv c430210Gtv8 = this.LLJL;
            if (c430210Gtv8 == null) {
                c430210Gtv8 = null;
            }
            c430210Gtv8.setRoundingParamsPadding(0.0f);
            C430230Gtx c430230Gtx = this.LLJLIL;
            if (c430230Gtx == null) {
                c430230Gtx = null;
            }
            c430230Gtx.setBorderWidthPx(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
            C430230Gtx c430230Gtx2 = this.LLJLIL;
            if (c430230Gtx2 == null) {
                c430230Gtx2 = null;
            }
            c430230Gtx2.setBorderAttrRes(R.attr.a02);
            C430230Gtx c430230Gtx3 = this.LLJLIL;
            if (c430230Gtx3 == null) {
                c430230Gtx3 = null;
            }
            c430230Gtx3.setPaddingPx(0.0f);
        } else {
            C430210Gtv c430210Gtv9 = this.LLJJL;
            if (c430210Gtv9 == null) {
                c430210Gtv9 = null;
            }
            c430210Gtv9.setBorderColor(R.color.ao);
            C430210Gtv c430210Gtv10 = this.LLJL;
            if (c430210Gtv10 == null) {
                c430210Gtv10 = null;
            }
            c430210Gtv10.setBorderAttrRes(R.attr.zi);
        }
        ProfileBadgeServiceImpl.createIProfileBadgeServicebyMonsterPlugin(false).subscribe(this.LLLII);
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) obj2).baseFeedPageParams;
        if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            uid = c2189821An6.getUid();
        } else {
            uid = null;
        }
        String str2 = "";
        if (uid == null) {
            uid = "";
        }
        if (C0SE1.LIZ()) {
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj4 = c724270Sb33.LL;
            } else {
                obj4 = null;
            }
            Aweme aweme2 = ((VideoItemParams) obj4).getAweme();
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj5 = c724270Sb34.LL;
            } else {
                obj5 = null;
            }
            BaseFeedPageParams baseFeedPageParams2 = ((VideoItemParams) obj5).baseFeedPageParams;
            if (baseFeedPageParams2 == null || (str = baseFeedPageParams2.eventType) == null) {
                str = "";
            }
            author = C328100Ctc.LIZ(aweme2, uid, str);
        } else {
            C724270Sb3 c724270Sb35 = this.LLJI;
            if (c724270Sb35 != null) {
                obj3 = c724270Sb35.LL;
            } else {
                obj3 = null;
            }
            author = ((VideoItemParams) obj3).getAweme().getAuthor();
        }
        if (author != null && (uid2 = author.getUid()) != null) {
            str2 = uid2;
        }
        C724270Sb3 c724270Sb36 = this.LLJI;
        if (c724270Sb36 != null) {
            obj6 = c724270Sb36.LL;
        }
        C1610490s0l c1610490s0l = new C1610490s0l(this, author, !TextUtils.equals(str2, AwemeExtKt.getAuthorUid(((VideoItemParams) obj6).getAweme())));
        if (C17977072h.LIZ()) {
            C725080ScM.LIZ().execute(new ARunnableS119S0100000_19((Object) c1610490s0l, 59));
        } else {
            c1610490s0l.invoke();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("default assem onViewCreated end: ");
        sbLIZ.append(this.LLJLILLLLZIIL);
        c2276411E8h.LJII("common_feed", "assem", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x054b  */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0SPT, android.view.View$OnClickListener] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r18) {
        /*
            Method dump skipped, instruction units count: 1357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem.up(java.lang.Object):void");
    }

    public final void sp(FollowStatusEvent followStatusEvent) throws JSONException {
        FollowStatus followStatus;
        Object obj;
        String uid;
        TimeInterpolator timeInterpolatorLIZ;
        TimeInterpolator timeInterpolatorLJIIIIZZ;
        TimeInterpolator timeInterpolatorLIZLLL;
        if (followStatusEvent == null || (followStatus = followStatusEvent.status) == null || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        C1303280k1G c1303280k1G = null;
        TuxIconView tuxIconView = null;
        TuxIconView tuxIconView2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (aweme == null) {
            return;
        }
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        if (!Intrinsics.LJFF(uid, followStatus.getUserId()) || !aweme.isCanPlay()) {
            return;
        }
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            author2.setFollowStatus(followStatus.getFollowStatus());
        }
        C1303280k1G c1303280k1G2 = this.LLJJJJ;
        if (c1303280k1G2 == null) {
            c1303280k1G2 = null;
        }
        c1303280k1G2.cancelAnimation();
        C1303280k1G c1303280k1G3 = this.LLJJJJ;
        if (c1303280k1G3 == null) {
            c1303280k1G3 = null;
        }
        c1303280k1G3.setProgress(0.0f);
        if (followStatus.getFollowStatus() == 0) {
            ep().UB1();
            Bp();
            ep().xQ2(new C291001Au<>(0));
            if (C1210280hbG.LIZJ) {
                up(0);
            }
        } else {
            String str = "";
            if (C2176211AEx.LIZLLL()) {
                TuxIconView tuxIconView3 = this.LLJZIJLIL;
                if (tuxIconView3 == null) {
                    tuxIconView3 = null;
                }
                HandlerHook.viewPostDelay(tuxIconView3, new ARunnableS119S0100000_19(this, 60), 100L);
                TuxIconView tuxIconView4 = this.LLJZIJLIL;
                if (tuxIconView4 != null) {
                    tuxIconView = tuxIconView4;
                }
                HandlerHook.viewPostDelay(tuxIconView, new ARunnableS52S0300000_19(this, aweme, followStatus, 4), 850L);
                ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJII();
                String userId = followStatus.getUserId();
                if (userId != null) {
                    str = userId;
                }
                C1610650s11.LIZ(str);
            } else if (C1210280hbG.LIZJ) {
                C1303280k1G c1303280k1G4 = this.LLJJJJ;
                if (c1303280k1G4 == null) {
                    c1303280k1G4 = null;
                }
                c1303280k1G4.pauseAnimation();
                if (C2176211AEx.LIZIZ()) {
                    timeInterpolatorLIZ = new LinearInterpolator();
                } else {
                    timeInterpolatorLIZ = C1619980sG4.LIZ();
                }
                if (C2176211AEx.LIZIZ()) {
                    timeInterpolatorLJIIIIZZ = new LinearInterpolator();
                } else {
                    timeInterpolatorLJIIIIZZ = C1619980sG4.LJIIIIZZ();
                }
                TuxIconView tuxIconView5 = this.LLJZIJLIL;
                if (tuxIconView5 == null) {
                    tuxIconView5 = null;
                }
                tuxIconView5.clearAnimation();
                ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(1.0f, 0.5f);
                valueAnimatorOfFloat.setInterpolator(timeInterpolatorLIZ);
                valueAnimatorOfFloat.setDuration(100L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS268S0100000_19(this, 5));
                ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(0.5f, 1.0f);
                valueAnimatorOfFloat2.setInterpolator(timeInterpolatorLJIIIIZZ);
                valueAnimatorOfFloat2.setDuration(150L);
                valueAnimatorOfFloat2.addUpdateListener(new AUListenerS268S0100000_19(this, 7));
                ValueAnimator valueAnimatorOfFloat3 = ObjectAnimator.ofFloat(1.0f, 0.0f);
                if (C2176211AEx.LIZIZ()) {
                    timeInterpolatorLIZLLL = new LinearInterpolator();
                } else {
                    timeInterpolatorLIZLLL = C1619980sG4.LIZLLL();
                }
                valueAnimatorOfFloat3.setInterpolator(timeInterpolatorLIZLLL);
                valueAnimatorOfFloat3.setDuration(200L);
                valueAnimatorOfFloat3.addUpdateListener(new AUListenerS268S0100000_19(this, 6));
                TuxIconView tuxIconView6 = this.LLJZIJLIL;
                if (tuxIconView6 == null) {
                    tuxIconView6 = null;
                }
                HandlerHook.viewPost(tuxIconView6, new ARunnableS88S0200000_19(valueAnimatorOfFloat, this, 12));
                TuxIconView tuxIconView7 = this.LLJZIJLIL;
                if (tuxIconView7 == null) {
                    tuxIconView7 = null;
                }
                HandlerHook.viewPostDelay(tuxIconView7, new ARunnableS88S0200000_19(valueAnimatorOfFloat2, this, 11), 100L);
                TuxIconView tuxIconView8 = this.LLJZIJLIL;
                if (tuxIconView8 != null) {
                    tuxIconView2 = tuxIconView8;
                }
                HandlerHook.viewPostDelay(tuxIconView2, new ARunnableS27S0400000_19(valueAnimatorOfFloat3, this, aweme, followStatus, 2), 850L);
                ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJII();
                String userId2 = followStatus.getUserId();
                if (userId2 != null) {
                    str = userId2;
                }
                C1610650s11.LIZ(str);
            } else {
                C1303280k1G c1303280k1G5 = this.LLJJJJ;
                if (c1303280k1G5 == null) {
                    c1303280k1G5 = null;
                }
                c1303280k1G5.playAnimation();
                C1303280k1G c1303280k1G6 = this.LLJJJJ;
                if (c1303280k1G6 != null) {
                    c1303280k1G = c1303280k1G6;
                }
                c1303280k1G.addAnimatorListener(new ALAdapterS9S0300000_19(this, aweme, followStatus, 1));
                ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJII();
                String userId3 = followStatus.getUserId();
                if (userId3 != null) {
                    str = userId3;
                }
                C1610650s11.LIZ(str);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, followStatus.getFollowStatus());
        jSONObject.put("userId", followStatus.getUserId());
        jSONObject.put("secUserId", followStatus.getSecUserId());
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "followUserStatusChange"));
    }

    public final void tp(Aweme aweme) {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || !aweme.isCanPlay()) {
            return;
        }
        FollowStatus followStatus = new FollowStatus("", 1);
        C1303280k1G c1303280k1G = null;
        TuxIconView tuxIconView = null;
        if (C1210280hbG.LIZJ) {
            C1303280k1G c1303280k1G2 = this.LLJJJJ;
            if (c1303280k1G2 == null) {
                c1303280k1G2 = null;
            }
            c1303280k1G2.pauseAnimation();
            Interpolator interpolatorLIZ = C1619980sG4.LIZ();
            Interpolator interpolatorLJIIIIZZ = C1619980sG4.LJIIIIZZ();
            TuxIconView tuxIconView2 = this.LLJZIJLIL;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            tuxIconView2.clearAnimation();
            ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(1.0f, 0.5f);
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setInterpolator(interpolatorLIZ);
                valueAnimatorOfFloat.setDuration(100L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS268S0100000_19(this, 2));
            } else {
                valueAnimatorOfFloat = null;
            }
            ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(0.5f, 1.0f);
            if (valueAnimatorOfFloat2 != null) {
                valueAnimatorOfFloat2.setInterpolator(interpolatorLJIIIIZZ);
                valueAnimatorOfFloat2.setDuration(150L);
                valueAnimatorOfFloat2.addUpdateListener(new AUListenerS268S0100000_19(this, 4));
            } else {
                valueAnimatorOfFloat2 = null;
            }
            ValueAnimator valueAnimatorOfFloat3 = ObjectAnimator.ofFloat(1.0f, 0.0f);
            if (valueAnimatorOfFloat3 != null) {
                valueAnimatorOfFloat3.setInterpolator(C1619980sG4.LIZLLL());
                valueAnimatorOfFloat3.setDuration(200L);
                valueAnimatorOfFloat3.addUpdateListener(new AUListenerS268S0100000_19(this, 3));
            } else {
                valueAnimatorOfFloat3 = null;
            }
            TuxIconView tuxIconView3 = this.LLJZIJLIL;
            if (tuxIconView3 == null) {
                tuxIconView3 = null;
            }
            HandlerHook.viewPost(tuxIconView3, new ARunnableS88S0200000_19(valueAnimatorOfFloat, this, 14));
            TuxIconView tuxIconView4 = this.LLJZIJLIL;
            if (tuxIconView4 == null) {
                tuxIconView4 = null;
            }
            HandlerHook.viewPostDelay(tuxIconView4, new ARunnableS88S0200000_19(valueAnimatorOfFloat2, this, 13), 100L);
            TuxIconView tuxIconView5 = this.LLJZIJLIL;
            if (tuxIconView5 != null) {
                tuxIconView = tuxIconView5;
            }
            HandlerHook.viewPostDelay(tuxIconView, new ARunnableS27S0400000_19(valueAnimatorOfFloat3, this, aweme, followStatus, 3), 850L);
            return;
        }
        C1303280k1G c1303280k1G3 = this.LLJJJJ;
        if (c1303280k1G3 == null) {
            c1303280k1G3 = null;
        }
        c1303280k1G3.playAnimation();
        C1303280k1G c1303280k1G4 = this.LLJJJJ;
        if (c1303280k1G4 != null) {
            c1303280k1G = c1303280k1G4;
        }
        c1303280k1G.addAnimatorListener(new ALAdapterS9S0300000_19(this, aweme, followStatus, 0));
    }

    public final void up(int i) {
        int iLIZIZ;
        int iLIZIZ2;
        C786410Ut5.LJLLLLLL(i, ip());
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        if (C1210280hbG.LIZJ && i == 0) {
            TuxIconView tuxIconView = null;
            if (C0SXF.LJIL(getContext()) && C726220SeC.LIZIZ.LIZLLL()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                if (!C302070Bsj.LIZJ()) {
                    TuxIconView tuxIconView2 = this.LLJZIJLIL;
                    if (tuxIconView2 == null) {
                        tuxIconView2 = null;
                    }
                    tuxIconView2.setIconRes(R.drawable.bsv);
                }
            } else if (C1210280hbG.LIZ) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                if (!C302070Bsj.LIZJ()) {
                    TuxIconView tuxIconView3 = this.LLJZIJLIL;
                    if (tuxIconView3 == null) {
                        tuxIconView3 = null;
                    }
                    tuxIconView3.setIconRes(R.drawable.bsv);
                }
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                if (!C302070Bsj.LIZJ()) {
                    TuxIconView tuxIconView4 = this.LLJZIJLIL;
                    if (tuxIconView4 == null) {
                        tuxIconView4 = null;
                    }
                    tuxIconView4.setIconRes(R.drawable.bsv);
                }
            }
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            int iLJIIIZ = c19252910Tv.LIZLLL().LJIJI().LJJL().LJIIIZ(iLIZIZ);
            int iLIZLLL = c19252910Tv.LIZLLL().LJIJI().LJJL().LIZLLL(iLIZIZ2);
            if (C302070Bsj.LIZJ()) {
                TuxIconView tuxIconView5 = this.LLJZIJLIL;
                if (tuxIconView5 == null) {
                    tuxIconView5 = null;
                }
                tuxIconView5.setTuxIcon((C419910GdJ) this.LLLIL.getValue());
            }
            TuxIconView tuxIconView6 = this.LLJZIJLIL;
            if (tuxIconView6 == null) {
                tuxIconView6 = null;
            }
            tuxIconView6.setIconWidth(iLJIIIZ);
            TuxIconView tuxIconView7 = this.LLJZIJLIL;
            if (tuxIconView7 == null) {
                tuxIconView7 = null;
            }
            tuxIconView7.setIconHeight(iLIZLLL);
            TuxIconView tuxIconView8 = this.LLJZIJLIL;
            if (tuxIconView8 == null) {
                tuxIconView8 = null;
            }
            C786410Ut5.hc(tuxIconView8, 1.0f);
            TuxIconView tuxIconView9 = this.LLJZIJLIL;
            if (tuxIconView9 != null) {
                tuxIconView = tuxIconView9;
            }
            C786410Ut5.Cc(tuxIconView, 1.0f);
        }
    }

    public final void Fp(Aweme aweme, FollowStatus followStatus) {
        C1303280k1G c1303280k1G = this.LLJJJJ;
        if (c1303280k1G == null) {
            c1303280k1G = null;
        }
        HandlerHook.viewPostDelay(c1303280k1G, new ARunnableS52S0300000_19(this, aweme, followStatus, 5), 850L);
    }

    public final void Gp(ViewGroup viewGroup, int i, C1AV2 c1av2) {
        C2180521AVm.LIZLLL(viewGroup, i, c1av2);
        if (this.LLLI) {
            if (i == 4) {
                viewGroup.setClickable(false);
            } else {
                viewGroup.setClickable(true);
            }
        }
    }
}
