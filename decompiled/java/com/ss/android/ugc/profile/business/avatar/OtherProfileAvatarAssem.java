package com.ss.android.ugc.profile.business.avatar;

import X.C01GW;
import X.C0CSO;
import X.C0IVT;
import X.C0J5O;
import X.C0PEM;
import X.C0QSJ;
import X.C0ZJ9;
import X.C10EU;
import X.C11NJ;
import X.C1250210idf;
import X.C1253010iiB;
import X.C1255030ilR;
import X.C1256220inM;
import X.C1256230inN;
import X.C1256440ini;
import X.C1256530inr;
import X.C13LE;
import X.C1439905kL;
import X.C1558520qew;
import X.C1607480rvu;
import X.C1EJQ;
import X.C2217381BqS;
import X.C452501pT;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C823050WQl;
import X.C897370ZIh;
import X.C897520ZIw;
import X.C948503nH;
import X.EnumC1256840ioM;
import X.EnumC1607270rvZ;
import X.EnumC1910440zoY;
import X.EnumC452301pR;
import X.InterfaceC1250320idq;
import X.InterfaceC1488720oqM;
import X.InterfaceC1606880ruw;
import X.InterfaceC1607260rvY;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC897380ZIi;
import X.InterfaceC899440ZQg;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS24S1100000_19;
import Y.AfS45S1200000_19;
import android.graphics.Outline;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.LiveEntranceConfig;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.story.ProfileStoryNote;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.profile.business.avatar.data.AvatarNormalData;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public final class OtherProfileAvatarAssem extends ProfileAvatarAssem implements InterfaceC1250320idq, IAvatarMainAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLL;
    public SlimRoom LLLL;
    public FrameLayout LLLLII;
    public FrameLayout LLLLIIIILLL;
    public boolean LLLLIILLL;
    public User LLLLIL;
    public volatile MainBusinessAbility LLLLILI;
    public InterfaceC665370Q7z LLLLJ;
    public C0QSJ LLLLJI;
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2055));
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2051));
    public final C01GW LLLLIIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS207S0000000_19.get$arr$(341));
    public final C01GW LLLLIILL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(340));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OtherProfileAvatarAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem
    public final C1255030ilR dp() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem
    public final boolean q1() {
        return false;
    }

    public static void jq() {
        InterfaceC1488720oqM interfaceC1488720oqMW4;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (interfaceC1488720oqMW4 = iLiveOuterService.w4()) == null || !Intrinsics.LJFF(interfaceC1488720oqMW4.isPlaying(), Boolean.TRUE)) {
            return;
        }
        interfaceC1488720oqMW4.LIZIZ(true);
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem
    public final void Ho() {
        AvatarComponentView avatarComponentView;
        InterfaceC1607260rvY clickListener;
        Map<EnumC1607270rvZ, InterfaceC1606880ruw> currentActiveBusiness;
        User userIp;
        String str;
        SlimRoom slimRoomLIZIZ;
        ILiveOuterService iLiveOuterService;
        C0J5O c0j5oZ5;
        User userIp2;
        String str2;
        InterfaceC1607260rvY clickListener2;
        if (C1253010iiB.LIZJ.LJIILLIIL()) {
            AvatarComponentView avatarComponentView2 = this.LLIZLLLIL;
            if (avatarComponentView2 != null && (clickListener2 = avatarComponentView2.getClickListener()) != null) {
                clickListener2.LIZ(1, new ACListenerS154S0100000_19(this, 143));
            }
            this.LLLL = null;
            AvatarComponentView avatarComponentView3 = this.LLIZLLLIL;
            if (avatarComponentView3 != null && (currentActiveBusiness = avatarComponentView3.getCurrentActiveBusiness()) != null && currentActiveBusiness.containsKey(EnumC1607270rvZ.LIVE) && !C10EU.LJIILL(ip(), false) && (userIp = ip()) != null && (str = userIp.roomData) != null) {
                C823050WQl.LIZJ().execute(new ARunnableS24S1100000_19(this, str, 3));
                if (((LiveEntranceConfig) C1607480rvu.LIZIZ.getValue()).enableHomepageHead && (((slimRoomLIZIZ = this.LLLL) != null || ((userIp2 = ip()) != null && (str2 = userIp2.roomData) != null && (slimRoomLIZIZ = C0IVT.LIZIZ(str2)) != null)) && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (c0j5oZ5 = iLiveOuterService.z5()) != null)) {
                    c0j5oZ5.LJ(getContext(), slimRoomLIZIZ, "others_homepage");
                }
            }
            AvatarComponentView avatarComponentView4 = this.LLIZLLLIL;
            if (avatarComponentView4 != null) {
                avatarComponentView4.LIZ(3, new ACListenerS154S0100000_19(this, 144));
            }
            if (!((SocialAvatarAccess) this.LLLLIILL.getValue()).LIZ() || (avatarComponentView = this.LLIZLLLIL) == null || (clickListener = avatarComponentView.getClickListener()) == null) {
                return;
            }
            clickListener.LIZ(2, new ACListenerS154S0100000_19(this, 145));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void No() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.avatar.AvatarComponentView r0 = r6.LLIZLLLIL
            if (r0 == 0) goto L5b
            X.0Gpo r0 = r0.getAvatar()
            if (r0 == 0) goto L5b
            X.0kTb r0 = r0.getController()
            if (r0 == 0) goto L5b
            android.graphics.drawable.Animatable r5 = r0.LIZ()
            if (r5 == 0) goto L5b
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r0 = r6.hp()
            X.002o r0 = r0.getState()
            X.0ifV r0 = (X.C1251350ifV) r0
            boolean r4 = r0.LLJJIJIL
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r0 = r6.hp()
            X.002o r0 = r0.getState()
            X.0ifV r0 = (X.C1251350ifV) r0
            X.01Au<java.lang.Boolean> r0 = r0.LLJJJJJIL
            if (r0 == 0) goto L7c
            T r0 = r0.LIZ
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
        L38:
            boolean r0 = X.C297720Bli.LIZ()
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = r6.fq()
        L42:
            if (r0 == 0) goto L7a
            X.19EG r1 = X.C724240Sb0.LIZ(r6)
            boolean r0 = r0.kh2(r1)
        L4c:
            if (r4 == 0) goto L52
            if (r0 == 0) goto L5c
            if (r3 != 0) goto L5c
        L52:
            boolean r0 = r5.isRunning()
            if (r0 == 0) goto L5b
            r5.stop()
        L5b:
            return
        L5c:
            boolean r0 = r5.isRunning()
            if (r0 != 0) goto L5b
            r5.start()
            return
        L66:
            X.19EG r0 = X.C724240Sb0.LIZ(r6)
            r2 = 0
            if (r0 == 0) goto L7a
            X.0Q7z r1 = X.C1558360qeg.LJI(r0, r2)
            java.lang.Class<com.ss.android.ugc.aweme.base.MainBusinessAbility> r0 = com.ss.android.ugc.aweme.base.MainBusinessAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = (com.ss.android.ugc.aweme.base.MainBusinessAbility) r0
            goto L42
        L7a:
            r0 = 0
            goto L4c
        L7c:
            r3 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.avatar.OtherProfileAvatarAssem.No():void");
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem
    /* JADX INFO: renamed from: dq, reason: merged with bridge method [inline-methods] */
    public final C897520ZIw So() {
        return (C897520ZIw) this.LLLJL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.base.MainBusinessAbility fq() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = r4.LLLLILI
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = r4.LLLLILI     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLLLJI     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLLJ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLLLJ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLLLJI = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.base.MainBusinessAbility> r0 = com.ss.android.ugc.aweme.base.MainBusinessAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = (com.ss.android.ugc.aweme.base.MainBusinessAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLLLILI = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.avatar.OtherProfileAvatarAssem.fq():com.ss.android.ugc.aweme.base.MainBusinessAbility");
    }

    @Override // X.InterfaceC1250320idq
    public final void d0() {
        User userIp = ip();
        if (C1256220inM.LIZ()) {
            User user = null;
            if (userIp == null) {
                userIp = user;
            } else if (C1256230inN.LIZ(userIp)) {
                user = new User();
                user.setUid(userIp.getUid());
                this.LLLLIILLL = true;
                this.LLLLIL = user;
                userIp = user;
            } else {
                this.LLLLIILLL = false;
                this.LLLLIL = null;
            }
        }
        Ip(userIp);
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, IAvatarMainAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1558520qew.LJIIJJI(this, IAvatarMainAbility.class, null);
        EventBus.LIZLLL().LJJI(this);
        ((C11NJ) this.LLLLIIL.getValue()).LJ();
        C897520ZIw c897520ZIwSo = So();
        if (c897520ZIwSo != null) {
            c897520ZIwSo.destroy();
        }
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem, X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        iq(true);
        if (C1EJQ.LIZIZ()) {
            C948503nH.LJ(this, C0PEM.LIZJ, new C0CSO(this, null));
        } else {
            jq();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        C897520ZIw c897520ZIwSo;
        super.onStart();
        InterfaceC899440ZQg interfaceC899440ZQg = this.LLJLIL;
        if (interfaceC899440ZQg != null) {
            interfaceC899440ZQg.onVisible();
        }
        if (!hp().getState().LLJJIJIL || (c897520ZIwSo = So()) == null) {
            return;
        }
        c897520ZIwSo.LJ();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        iq(false);
        C897520ZIw c897520ZIwSo = So();
        if (c897520ZIwSo != null) {
            c897520ZIwSo.LJII();
        }
        InterfaceC899440ZQg interfaceC899440ZQg = this.LLJLIL;
        if (interfaceC899440ZQg != null) {
            interfaceC899440ZQg.onInvisible();
        }
    }

    @Override // X.InterfaceC1250320idq
    public final void Qd(AvatarNormalData avatarNormalData) {
        ISocialThoughtDataCenterService iSocialThoughtDataCenterServiceLJJIIZI;
        String uid;
        if (!C1256440ini.LIZ()) {
            return;
        }
        if (C1256220inM.LIZ() && C1256230inN.LIZ(ip())) {
            return;
        }
        ProfileStoryNote userLatestStoryNote = null;
        ThoughtInfo thoughtBubble = null;
        if (C1439905kL.LIZ()) {
            SocialThoughtService socialThoughtService = (SocialThoughtService) PluggableExtentionKt.pluggableSpi$default(SocialThoughtService.class, false, false, false, 14, null);
            if (socialThoughtService != null && (iSocialThoughtDataCenterServiceLJJIIZI = socialThoughtService.LJJIIZI()) != null) {
                User userIp = ip();
                if (userIp != null) {
                    uid = userIp.getUid();
                } else {
                    uid = null;
                }
                if (avatarNormalData != null) {
                    thoughtBubble = avatarNormalData.getThoughtBubble();
                }
                iSocialThoughtDataCenterServiceLJJIIZI.LJIIIZ(uid, thoughtBubble);
                return;
            }
            return;
        }
        if (avatarNormalData != null) {
            userLatestStoryNote = avatarNormalData.getUserLatestStoryNote();
        }
        Xp(userLatestStoryNote);
    }

    @Override // com.ss.android.ugc.profile.business.avatar.IAvatarMainAbility
    public final void hs2(String str) {
        SlimRoom.LinkMic linkMic;
        User userIp = ip();
        if (userIp == null) {
            return;
        }
        if (!TextUtils.isEmpty(userIp.roomData)) {
            try {
                SlimRoom slimRoom = (SlimRoom) C1250210idf.LIZ(userIp.roomData, SlimRoom.class);
                this.LLLL = slimRoom;
                if (slimRoom != null && (linkMic = slimRoom.getLinkMic()) != null) {
                    if (linkMic.followedCount > 0) {
                        return;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).j3().LIZLLL(userIp, new AfS45S1200000_19(userIp, str, this, 2), "tiktok_profile_head");
    }

    public final void iq(boolean z) {
        if (z) {
            AvatarComponentView avatarComponentView = this.LLIZLLLIL;
            if (avatarComponentView != null) {
                avatarComponentView.LJI(EnumC1607270rvZ.LIVE, EnumC1256840ioM.RESUME_ANIMATION, null);
                return;
            }
            return;
        }
        AvatarComponentView avatarComponentView2 = this.LLIZLLLIL;
        if (avatarComponentView2 == null) {
            return;
        }
        avatarComponentView2.LJI(EnumC1607270rvZ.LIVE, EnumC1256840ioM.PAUSE_ANIMATION, null);
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        final FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.bkp);
        FrameLayout frameLayout2 = null;
        if (frameLayout != null) {
            frameLayout.setClickable(false);
            final int i = 0;
            frameLayout.setOutlineProvider(new ViewOutlineProvider(frameLayout, i) { // from class: X.0j2l
                public final int $t;
                public Object l0;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view2, Outline outline) {
                    switch (this.$t) {
                        case 0:
                            getOutline$0(this, view2, outline);
                            break;
                        case 1:
                            getOutline$1(this, view2, outline);
                            break;
                        default:
                            super.getOutline(view2, outline);
                            break;
                    }
                }

                {
                    this.$t = i;
                    this.l0 = frameLayout;
                }

                public static final void getOutline$0(C1265770j2l c1265770j2l, View view2, Outline outline) {
                    if (outline != null) {
                        outline.setRoundRect(0, 0, ((FrameLayout) c1265770j2l.l0).getWidth(), ((FrameLayout) c1265770j2l.l0).getHeight(), ((FrameLayout) c1265770j2l.l0).getHeight());
                    }
                }

                public static final void getOutline$1(C1265770j2l c1265770j2l, View view2, Outline outline) {
                    if (outline != null) {
                        outline.setRoundRect(0, 0, ((FrameLayout) c1265770j2l.l0).getWidth(), ((FrameLayout) c1265770j2l.l0).getHeight(), ((FrameLayout) c1265770j2l.l0).getHeight());
                    }
                }
            });
            frameLayout.setClipToOutline(true);
        } else {
            frameLayout = null;
        }
        this.LLLLII = frameLayout;
        final FrameLayout frameLayout3 = (FrameLayout) view.findViewById(R.id.bko);
        if (frameLayout3 != null) {
            frameLayout3.setClickable(false);
            final int i2 = 1;
            frameLayout3.setOutlineProvider(new ViewOutlineProvider(frameLayout3, i2) { // from class: X.0j2l
                public final int $t;
                public Object l0;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view2, Outline outline) {
                    switch (this.$t) {
                        case 0:
                            getOutline$0(this, view2, outline);
                            break;
                        case 1:
                            getOutline$1(this, view2, outline);
                            break;
                        default:
                            super.getOutline(view2, outline);
                            break;
                    }
                }

                {
                    this.$t = i2;
                    this.l0 = frameLayout3;
                }

                public static final void getOutline$0(C1265770j2l c1265770j2l, View view2, Outline outline) {
                    if (outline != null) {
                        outline.setRoundRect(0, 0, ((FrameLayout) c1265770j2l.l0).getWidth(), ((FrameLayout) c1265770j2l.l0).getHeight(), ((FrameLayout) c1265770j2l.l0).getHeight());
                    }
                }

                public static final void getOutline$1(C1265770j2l c1265770j2l, View view2, Outline outline) {
                    if (outline != null) {
                        outline.setRoundRect(0, 0, ((FrameLayout) c1265770j2l.l0).getWidth(), ((FrameLayout) c1265770j2l.l0).getHeight(), ((FrameLayout) c1265770j2l.l0).getHeight());
                    }
                }
            });
            frameLayout3.setClipToOutline(true);
            frameLayout2 = frameLayout3;
        }
        this.LLLLIIIILLL = frameLayout2;
        View viewFindViewById = view.findViewById(R.id.bkn);
        if (viewFindViewById != null) {
            viewFindViewById.setClickable(false);
        }
        if (sp()) {
            FrameLayout frameLayout4 = this.LLLLII;
            if (frameLayout4 != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout4.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = 84;
                    layoutParams.height = 84;
                    C786410Ut5.W5(frameLayout4, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            FrameLayout frameLayout5 = this.LLLLIIIILLL;
            if (frameLayout5 != null) {
                ViewGroup.LayoutParams layoutParams2 = frameLayout5.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = 84;
                    layoutParams2.height = 84;
                    C786410Ut5.W5(frameLayout5, layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        hp().GQ2(new AwS598S0100000_19(this, 294));
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0ilt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJIJIIJIL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 108), 4);
        AvatarComponentView avatarComponentView = this.LLIZLLLIL;
        if (avatarComponentView != null) {
            avatarComponentView.LJIIJJI(EnumC1607270rvZ.LIVE, new AwS598S0100000_19(this, 295));
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        C0ZJ9 c0zj9LJFF = C897370ZIh.LIZ().LJFF();
        EnumC1910440zoY enumC1910440zoY = EnumC1910440zoY.PROFILE_PAGE;
        AvatarComponentView avatarComponentView2 = this.LLIZLLLIL;
        if (avatarComponentView2 == null) {
            return;
        }
        this.LLJLIL = c0zj9LJFF.LIZIZ(enumC1910440zoY, avatarComponentView2, this, getContext(), null);
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem
    public final C1256530inr Oo(String str, Rect rect) {
        User user;
        C1256530inr c1256530inrOo = super.Oo(str, rect);
        if (c1256530inrOo != null) {
            if (C1256220inM.LIZ() && this.LLLLIILLL && (user = this.LLLLIL) != null) {
                c1256530inrOo.LIZJ = user;
            }
            return c1256530inrOo;
        }
        return null;
    }
}
