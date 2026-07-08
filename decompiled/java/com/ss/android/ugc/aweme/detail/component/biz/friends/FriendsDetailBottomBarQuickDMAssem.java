package com.ss.android.ugc.aweme.detail.component.biz.friends;

import X.C01GW;
import X.C0HCN;
import X.C0I08;
import X.C0I0B;
import X.C0I0E;
import X.C0S1H;
import X.C0S1J;
import X.C0S2R;
import X.C0S2S;
import X.C0S2U;
import X.C0T2Y;
import X.C0ZH1;
import X.C10EU;
import X.C11JF;
import X.C1308910kAL;
import X.C1345700l7g;
import X.C1558520qew;
import X.C1A1H;
import X.C2188811AlT;
import X.C2189821An6;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C738860Sya;
import X.C740740T3w;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC2172611A1b;
import X.EnumC714710S1t;
import X.EnumC913010Zrn;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.ViewOnLayoutChangeListenerC738740SyO;
import Y.ACListenerS146S0100000_11;
import Y.AfS147S0200000_11;
import Y.AfS180S0100000_11;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.component.biz.friends.FriendsDetailBottomBarQuickDMAssem;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailQuickDMAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.quickchat.mob.IUnifyQuickReplyAnalytics;
import com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailBottomBarQuickDMAssem extends UISlotAssem implements C0I08, FriendsDetailQuickDMAbility, InterfaceC1554640qYg {
    public Aweme LLJJJ;
    public C11JF LLJJJIL;
    public boolean LLJJJJJIL;
    public boolean LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public String LLJLIL;
    public final C630740Ooa LLJJI = C628500Oky.LIZ(new AwS555S0100000_11(this, 126));
    public final C630740Ooa LLJJIII = C628500Oky.LIZ(new AwS555S0100000_11(this, 127));
    public final C630740Ooa LLJJIJI = C628500Oky.LIZ(new AwS555S0100000_11(this, 124));
    public final C630740Ooa LLJJIJIIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 128));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 125));
    public C0S1J LLJJJJ = C0S1J.CLICK;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(59));
    public List<FrameLayout> LLJLILLLLZIIL = new ArrayList();

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bkq;
    }

    @Override // X.C0I08
    public final void TG() {
        this.LLJJL = true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1296047993) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp() {
        /*
            Method dump skipped, instruction units count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.component.biz.friends.FriendsDetailBottomBarQuickDMAssem.hp():void");
    }

    public final LinearLayout kp() {
        return (LinearLayout) this.LLJJIJI.getValue();
    }

    public final TuxTextView lp() {
        return (TuxTextView) this.LLJJIII.getValue();
    }

    public final TuxIconView mp() {
        return (TuxIconView) this.LLJJIJIIJIL.getValue();
    }

    public final void op() {
        Aweme aweme = this.LLJJJ;
        if (C10EU.LJIILLIIL(aweme != null ? aweme.getAuthor() : null)) {
            C337180DJs.LIZ(LJJIJL());
        } else {
            C337180DJs.LIZJ(LJJIJL());
        }
    }

    public final C2189821An6 xp0() {
        return (C2189821An6) this.LLJJIJIL.getValue();
    }

    public final FrameLayout ip() {
        float f;
        Context context = LJJIJL().getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.im1);
        tuxTextView.setText((CharSequence) null);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        if (C0HCN.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            f = 20.0f;
        } else {
            f = 25.0f;
        }
        tuxTextView.LJJJJI(f);
        tuxTextView.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(iLIZIZ, 0, iLIZIZ, 0);
        frameLayout.addView(tuxTextView, layoutParams);
        return frameLayout;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C740740T3w.LIZIZ(C1345700l7g.LJIILLIIL(this), this, new C0T2Y() { // from class: X.0S1q
            @Override // X.C0T2Y
            public final void Y3(Aweme aweme) {
                C11NZ c11nzLJJJJZ;
                String eventType;
                String aid;
                C0ZH1 c0zh1;
                String string;
                int iLIZJ;
                String nickname;
                boolean z;
                String uid;
                FriendsDetailBottomBarQuickDMAssem friendsDetailBottomBarQuickDMAssem = this.LL;
                friendsDetailBottomBarQuickDMAssem.LLJJJ = aweme;
                friendsDetailBottomBarQuickDMAssem.LLJJJJ = C0S1J.CLICK;
                C11JF c11jf = friendsDetailBottomBarQuickDMAssem.LLJJJIL;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                String aid2 = null;
                friendsDetailBottomBarQuickDMAssem.LLJJJIL = null;
                friendsDetailBottomBarQuickDMAssem.LLJJJJJIL = false;
                if (aweme != null && aweme.getAuthor() != null && !C1336205Ku.LIZJ().LIZJ() && !C10EU.LJIILLIIL(aweme.getAuthor()) && C1336205Ku.LIZ(false).getImPrivacySettings().LJIIJJI() != 3) {
                    IShareStatusKeva iShareStatusKeva = (IShareStatusKeva) friendsDetailBottomBarQuickDMAssem.LLJJJJLIIL.getValue();
                    if (iShareStatusKeva != null) {
                        User author = aweme.getAuthor();
                        if (author != null) {
                            uid = author.getUid();
                        } else {
                            uid = null;
                        }
                        iLIZJ = iShareStatusKeva.LIZJ(uid);
                    } else {
                        iLIZJ = 0;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("check shareStatusCache = ");
                    sbLIZ.append(iLIZJ);
                    sbLIZ.append(", nickname = ");
                    User author2 = aweme.getAuthor();
                    if (author2 != null) {
                        nickname = author2.getNickname();
                    } else {
                        nickname = null;
                    }
                    sbLIZ.append(nickname);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (iLIZJ > 0) {
                        if (iLIZJ == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c11nzLJJJJZ = C11NZ.LJJJJZ(new C0S1L(aweme, z));
                    } else {
                        c11nzLJJJJZ = C11NZ.LJIJJLI(new C1266230j3V(aweme, 2));
                    }
                } else {
                    c11nzLJJJJZ = C11NZ.LJJJJZ(new C0S1L(aweme, false));
                }
                friendsDetailBottomBarQuickDMAssem.LLJJJIL = (C11JF) c11nzLJJJJZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS147S0200000_11(friendsDetailBottomBarQuickDMAssem, aweme, 12), new AfS180S0100000_11(friendsDetailBottomBarQuickDMAssem, 15));
                friendsDetailBottomBarQuickDMAssem.hp();
                TuxTextView tuxTextViewLp = friendsDetailBottomBarQuickDMAssem.lp();
                if (tuxTextViewLp != null) {
                    tuxTextViewLp.setText((CharSequence) null);
                }
                TuxTextView tuxTextViewLp2 = friendsDetailBottomBarQuickDMAssem.lp();
                if (tuxTextViewLp2 != null) {
                    Context context = friendsDetailBottomBarQuickDMAssem.getContext();
                    if (context != null) {
                        string = context.getString(2131830718);
                    } else {
                        string = null;
                    }
                    tuxTextViewLp2.setHint(string);
                }
                if (aweme != null && !Intrinsics.LJFF(aweme.getAid(), this.LL.LLJLIL)) {
                    FriendsDetailBottomBarQuickDMAssem friendsDetailBottomBarQuickDMAssem2 = this.LL;
                    friendsDetailBottomBarQuickDMAssem2.getClass();
                    IUnifyQuickReplyAnalytics.LIZ.getClass();
                    IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
                    if (iUnifyQuickReplyAnalyticsLIZ != null) {
                        C0S2S c0s2s = EnumC2172611A1b.Companion;
                        C2189821An6 c2189821An6Xp0 = friendsDetailBottomBarQuickDMAssem2.xp0();
                        if (c2189821An6Xp0 != null) {
                            eventType = c2189821An6Xp0.getEventType();
                        } else {
                            eventType = null;
                        }
                        c0s2s.getClass();
                        EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(eventType);
                        C0S2U c0s2u = C0S2U.FIXED_ENTRANCE;
                        EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
                        Aweme aweme2 = friendsDetailBottomBarQuickDMAssem2.LLJJJ;
                        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                            aid = "";
                        }
                        Aweme aweme3 = friendsDetailBottomBarQuickDMAssem2.LLJJJ;
                        if (aweme3 != null && C1A1H.LIZLLL(aweme3)) {
                            c0zh1 = C0ZH1.REPOST;
                        } else {
                            c0zh1 = C0ZH1.POST;
                        }
                        iUnifyQuickReplyAnalyticsLIZ.LIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, aid, c0zh1, C0S2R.PRIVATE, "", C0I0B.LJFF.LIZIZ());
                    }
                }
                FriendsDetailBottomBarQuickDMAssem friendsDetailBottomBarQuickDMAssem3 = this.LL;
                if (aweme != null) {
                    aid2 = aweme.getAid();
                }
                friendsDetailBottomBarQuickDMAssem3.LLJLIL = aid2;
            }
        });
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailQuickDMAbility
    public final void N41(C0S1J c0s1j) {
        if (getContentView().getVisibility() == 0) {
            this.LLJJJJ = c0s1j;
            getContentView().performClick();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        ViewGroup.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        RelativeLayout.LayoutParams layoutParams3;
        Drawable background;
        Integer numLIZJ;
        super.onViewCreated(view);
        View view2 = (View) this.LLJJI.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        Integer numValueOf = Integer.valueOf(R.attr.zj);
        c384050F3z.LIZIZ = numValueOf;
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
        c384050F3z.LJFF = numValueOf;
        view2.setBackground(c384050F3z.LIZ(view.getContext()));
        TuxTextView tuxTextViewLp = lp();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ei, view.getContext());
        int iIntValue2 = 0;
        if (numLIZJ2 != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextViewLp.setHintTextColor(iIntValue);
        TuxTextView tuxTextViewLp2 = lp();
        tuxTextViewLp2.setHint(tuxTextViewLp2.getContext().getString(2131830718));
        tuxTextViewLp2.addTextChangedListener(new C738860Sya(this, 0));
        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 4), getContentView());
        TuxIconView tuxIconViewMp = mp();
        if (tuxIconViewMp != null && (background = tuxIconViewMp.getBackground()) != null) {
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context)) != null) {
                iIntValue2 = numLIZJ.intValue();
            }
            background.setTint(iIntValue2);
        }
        TuxIconView tuxIconViewMp2 = mp();
        if (tuxIconViewMp2 != null) {
            tuxIconViewMp2.setTintColorRes(R.attr.ee);
        }
        TuxIconView tuxIconViewMp3 = mp();
        if (tuxIconViewMp3 != null) {
            C786410Ut5.a9(tuxIconViewMp3, new ACListenerS146S0100000_11(this, 5));
        }
        TuxTextView tuxTextViewLp3 = lp();
        if (tuxTextViewLp3 != null) {
            C426750GoL.LJIIIZ(tuxTextViewLp3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, 0, 0, false, 16);
        }
        View view3 = (View) this.LLJJI.getValue();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.il);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
        c384050F3z2.LJFF = Integer.valueOf(R.attr.il);
        view3.setBackground(c384050F3z2.LIZ(getContentView().getContext()));
        this.LLJL = (LinearLayout) view.findViewById(R.id.upw);
        View view4 = (View) this.LLJJI.getValue();
        if (view4 != null) {
            view4.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC738740SyO(this, 2));
        }
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            this.LLJJLIIIJLLLLLLLZ = ip();
        }
        TuxTextView tuxTextViewLp4 = lp();
        ViewGroup.LayoutParams layoutParams4 = null;
        if (tuxTextViewLp4 != null) {
            layoutParams = tuxTextViewLp4.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (layoutParams3 = (RelativeLayout.LayoutParams) layoutParams) != null) {
            layoutParams3.removeRule(16);
        }
        LinearLayout linearLayout = this.LLJL;
        if (linearLayout != null) {
            layoutParams4 = linearLayout.getLayoutParams();
        }
        if ((layoutParams4 instanceof RelativeLayout.LayoutParams) && (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams4) != null) {
            layoutParams2.addRule(17, R.id.sml);
        }
    }

    public final void sp(boolean z) {
        boolean z2;
        String uniqueId;
        String musicName;
        Music music;
        User author;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showOrHide=");
        sbLIZ.append(z);
        sbLIZ.append(", shouldShow=");
        sbLIZ.append(this.LLJJJJJIL);
        sbLIZ.append(", realShow=");
        boolean z3 = true;
        int i = 0;
        if (getContentView().getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(", user=");
        Aweme aweme = this.LLJJJ;
        String aid = null;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uniqueId = author.getUniqueId();
        } else {
            uniqueId = null;
        }
        sbLIZ.append(uniqueId);
        sbLIZ.append(", music=");
        Aweme aweme2 = this.LLJJJ;
        if (aweme2 != null && (music = aweme2.getMusic()) != null) {
            musicName = music.getMusicName();
        } else {
            musicName = null;
        }
        sbLIZ.append(musicName);
        sbLIZ.append(", aid=");
        Aweme aweme3 = this.LLJJJ;
        if (aweme3 != null) {
            aid = aweme3.getAid();
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJJJJJIL == z) {
            if (getContentView().getVisibility() != 0) {
                z3 = false;
            }
            if (z3 == z) {
                return;
            }
        }
        View contentView = getContentView();
        if (!z) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, contentView);
        this.LLJJJJJIL = z;
    }

    public final void tp(boolean z) {
        if (z) {
            C786410Ut5.LJZL(0, kp());
            TuxIconView tuxIconViewMp = mp();
            if (tuxIconViewMp != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewMp, 8);
            }
        } else {
            C786410Ut5.LJZL(8, kp());
            TuxIconView tuxIconViewMp2 = mp();
            if (tuxIconViewMp2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewMp2, 0);
            }
        }
        hp();
    }

    public final void up(EnumC714710S1t enumC714710S1t) {
        String eventType;
        String aid;
        C0ZH1 c0zh1;
        IUnifyQuickReplyAnalytics.LIZ.getClass();
        IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
        if (iUnifyQuickReplyAnalyticsLIZ != null) {
            C0S2S c0s2s = EnumC2172611A1b.Companion;
            C2189821An6 c2189821An6Xp0 = xp0();
            if (c2189821An6Xp0 != null) {
                eventType = c2189821An6Xp0.getEventType();
            } else {
                eventType = null;
            }
            c0s2s.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(eventType);
            C0S2U c0s2u = C0S2U.FIXED_ENTRANCE;
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
            Aweme aweme = this.LLJJJ;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            Aweme aweme2 = this.LLJJJ;
            if (aweme2 != null && C1A1H.LIZLLL(aweme2)) {
                c0zh1 = C0ZH1.REPOST;
            } else {
                c0zh1 = C0ZH1.POST;
            }
            iUnifyQuickReplyAnalyticsLIZ.LIZIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, aid, c0zh1, C0S2R.PRIVATE, enumC714710S1t, C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // X.C0I08
    public final void YO(C0I0E c0i0e, String str) {
        if (!this.LLJJL) {
            return;
        }
        this.LLJJL = false;
        this.LLJJJJ = C0S1J.CLICK;
        lp().setText(str);
    }
}
