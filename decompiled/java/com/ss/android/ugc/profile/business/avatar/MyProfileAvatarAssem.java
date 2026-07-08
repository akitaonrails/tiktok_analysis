package com.ss.android.ugc.profile.business.avatar;

import X.C01GW;
import X.C0VSJ;
import X.C1216270hkv;
import X.C1242880iRq;
import X.C1247510iZJ;
import X.C1248100iaG;
import X.C1248190iaP;
import X.C1251390ifZ;
import X.C1251860igK;
import X.C1252550ihR;
import X.C1253010iiB;
import X.C1255030ilR;
import X.C1255650imR;
import X.C1256150inF;
import X.C1256160inG;
import X.C1256170inH;
import X.C1256200inK;
import X.C1256440ini;
import X.C1256470inl;
import X.C1390850mIV;
import X.C1439905kL;
import X.C14EU;
import X.C1558520qew;
import X.C19EG;
import X.C1EJQ;
import X.C2188811AlT;
import X.C427660Gpo;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1250320idq;
import X.InterfaceC1250980ieu;
import X.InterfaceC1256280inS;
import X.InterfaceC1320850kTb;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.story.ProfileStoryNote;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager;
import com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback;
import com.ss.android.ugc.profile.business.avatar.MyProfileAvatarAssem;
import com.ss.android.ugc.profile.business.avatar.data.AvatarNormalData;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS24S1400000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS58S1300000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public class MyProfileAvatarAssem extends ProfileAvatarAssem implements InterfaceC1250320idq {
    public boolean LLLJIL;
    public C1256170inH LLLLII;
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2050));
    public final C01GW LLLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(339));
    public final boolean LLLLIIIILLL = true;

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem
    public final void Ho() {
        AvatarComponentView avatarComponentView;
        if (C1253010iiB.LIZJ.LJIILLIIL()) {
            AvatarComponentView avatarComponentView2 = this.LLIZLLLIL;
            if (avatarComponentView2 != null) {
                avatarComponentView2.LIZ(1, new ACListenerS154S0100000_19(this, 140));
            }
            AvatarComponentView avatarComponentView3 = this.LLIZLLLIL;
            if (avatarComponentView3 != null) {
                avatarComponentView3.LIZ(3, new ACListenerS154S0100000_19(this, 141));
            }
            if (!((SocialAvatarAccess) this.LLLL.getValue()).LIZLLL() || (avatarComponentView = this.LLIZLLLIL) == null) {
                return;
            }
            avatarComponentView.LIZ(2, new ACListenerS154S0100000_19(this, 142));
        }
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem
    public final void No() {
        C427660Gpo avatar;
        InterfaceC1320850kTb controller;
        Animatable animatableLIZ;
        AvatarComponentView avatarComponentView = this.LLIZLLLIL;
        if (avatarComponentView == null || (avatar = avatarComponentView.getAvatar()) == null || (controller = avatar.getController()) == null || (animatableLIZ = controller.LIZ()) == null) {
            return;
        }
        if (hp().getState().LLILLJJLI && !animatableLIZ.isRunning()) {
            animatableLIZ.start();
        } else if (animatableLIZ.isRunning()) {
            animatableLIZ.stop();
        }
    }

    @Override // X.InterfaceC1250320idq
    public final void d0() {
        Ip(ip());
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem
    public final C1255030ilR dp() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1255030ilR c1255030ilR = this.LLJJL;
        if (c1255030ilR != null) {
            return c1255030ilR;
        }
        C1255030ilR c1255030ilR2 = new C1255030ilR();
        c1255030ilR2.LJI(c19egLIZ, fragmentLJI, -1, null);
        this.LLJJL = c1255030ilR2;
        return c1255030ilR2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0inH, java.lang.Object] */
    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, IAvatarAbility.class, null, null);
        if (C1EJQ.LIZIZ()) {
            C1256470inl.LL.LIZ(getContext());
            ((ArrayList) C1256470inl.LLILZIL).add(this);
        }
        if (this.LLLLIIIILLL) {
            C1251390ifZ.LIZ.getClass();
            if (C1251390ifZ.LIZIZ(true)) {
                C1248100iaG c1248100iaG = new C1248100iaG();
                Keva keva = c1248100iaG.LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("background_guide_show");
                sbLIZ.append(c1248100iaG.LIZIZ);
                if (keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false) || this.LLLLII != null) {
                    return;
                }
                ?? r2 = new InterfaceC1250980ieu() { // from class: X.0inH
                    @Override // X.InterfaceC1250980ieu
                    public final void LIZ() {
                        InterfaceC1256280inS interfaceC1256280inS = this.LIZ.LLJIJIL;
                        if (interfaceC1256280inS == null) {
                            return;
                        }
                        C786410Ut5.LJLLLLLL(4, interfaceC1256280inS.LJJZZI());
                        this.LIZ.LLJILLL = true;
                        C1248210iaR.LIZIZ("MyProfileAvatarAssem", "onBackgroundGuideStarted");
                    }

                    @Override // X.InterfaceC1250980ieu
                    public final void LIZIZ() {
                        ((ArrayList) C1256200inK.LJ).remove(this);
                        MyProfileAvatarAssem myProfileAvatarAssem = this.LIZ;
                        myProfileAvatarAssem.LLLLII = null;
                        InterfaceC1256280inS interfaceC1256280inS = myProfileAvatarAssem.LLJIJIL;
                        if (interfaceC1256280inS == null) {
                            return;
                        }
                        if (myProfileAvatarAssem.LLJILJIL && !myProfileAvatarAssem.LLJILJILJ) {
                            View viewLJJZZI = interfaceC1256280inS.LJJZZI();
                            viewLJJZZI.animate().cancel();
                            C786410Ut5.T4(viewLJJZZI, 0.0f);
                            C786410Ut5.LJLLLLLL(0, viewLJJZZI);
                            viewLJJZZI.animate().alpha(1.0f).setDuration(250L).start();
                        }
                        this.LIZ.LLJILLL = false;
                        C1248210iaR.LIZIZ("MyProfileAvatarAssem", "onBackgroundGuideFinished");
                    }
                };
                this.LLLLII = r2;
                ArrayList arrayList = (ArrayList) C1256200inK.LJ;
                if (arrayList.contains(r2)) {
                    return;
                }
                arrayList.add(r2);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).avatarService().unregisterDialogCallback();
        if (C1256440ini.LIZ() && !C1439905kL.LIZ()) {
            lp().WB0((StoryNoteStatusChangeCallback) this.LLLJL.getValue());
        }
        if (C1EJQ.LIZIZ()) {
            C1256470inl.LL.getClass();
            ((ArrayList) C1256470inl.LLILZIL).remove(this);
        }
        C1256170inH c1256170inH = this.LLLLII;
        if (c1256170inH != null) {
            ((ArrayList) C1256200inK.LJ).remove(c1256170inH);
            this.LLLLII = null;
        }
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem
    public final boolean q1() {
        return this.LLLLIIIILLL;
    }

    @Override // X.InterfaceC1250320idq
    public final void Qd(AvatarNormalData avatarNormalData) {
        ProfileStoryNote userLatestStoryNote;
        String uid;
        ProfileStoryNote userLatestStoryNote2;
        ThoughtInfo thoughtBubble;
        ISocialThoughtDataCenterService iSocialThoughtDataCenterServiceLJJIIZI;
        if (!C1256440ini.LIZ()) {
            return;
        }
        this.LLLJIL = true;
        String str = null;
        if (C1439905kL.LIZ()) {
            if (avatarNormalData != null) {
                thoughtBubble = avatarNormalData.getThoughtBubble();
            } else {
                thoughtBubble = null;
            }
            SocialThoughtService socialThoughtService = (SocialThoughtService) PluggableExtentionKt.pluggableSpi$default(SocialThoughtService.class, false, false, false, 14, null);
            if (socialThoughtService != null && (iSocialThoughtDataCenterServiceLJJIIZI = socialThoughtService.LJJIIZI()) != null) {
                if (thoughtBubble != null) {
                    str = thoughtBubble.authorUid;
                }
                iSocialThoughtDataCenterServiceLJJIIZI.LJIIIZ(str, thoughtBubble);
                return;
            }
            return;
        }
        if (!lp().XO()) {
            if (avatarNormalData != null) {
                userLatestStoryNote = avatarNormalData.getUserLatestStoryNote();
            } else {
                userLatestStoryNote = null;
            }
            IStoryThoughtMyDataManager iStoryThoughtMyDataManagerLp = lp();
            User userIp = ip();
            if (userIp != null) {
                uid = userIp.getUid();
            } else {
                uid = null;
            }
            iStoryThoughtMyDataManagerLp.Bq0(C1251860igK.LIZ(userLatestStoryNote, uid), null);
            Xp(userLatestStoryNote);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("my profile page data update:");
            if (avatarNormalData != null && (userLatestStoryNote2 = avatarNormalData.getUserLatestStoryNote()) != null) {
                str = userLatestStoryNote2.text;
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @C14EU
    public final void onClickGuideCardEvent(C1248190iaP c1248190iaP) {
        C0VSJ c0vsjLJFF;
        if (c1248190iaP != null && c1248190iaP.LIZ == 1) {
            C1255030ilR c1255030ilRDp = dp();
            AvatarComponentView avatarComponentView = this.LLIZLLLIL;
            Context context = getContext();
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            User userIp = ip();
            if (context != null) {
                C1252550ihR.LIZ.getClass();
                if (C1252550ihR.LJIIJ()) {
                    C1242880iRq.LIZ(avatarComponentView, c19egLIZ, userIp, c1255030ilRDp);
                    return;
                }
                C1255650imR c1255650imR = c1255030ilRDp.LL;
                String path = null;
                if (c1255650imR != null && (c0vsjLJFF = c1255650imR.LJFF()) != null) {
                    path = c0vsjLJFF.getPath();
                }
                if (c19egLIZ == null) {
                    return;
                }
                C1390850mIV c1390850mIV = new C1390850mIV();
                C1247510iZJ c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZ = c19egLIZ.getString(R.string.f5w);
                c1247510iZJ.LIZ(new AwS58S1300000_19(path, c19egLIZ, userIp, c1255030ilRDp, 3));
                C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
                c1247510iZJ2.LIZ = c19egLIZ.getString(R.string.f5x);
                c1247510iZJ2.LIZ(new AwS24S1400000_19(path, c19egLIZ, userIp, avatarComponentView, fragmentLJI, c1255030ilRDp, 2));
                c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
                c1390850mIV.LIZJ().show(c19egLIZ.getSupportFragmentManager(), "aaa");
            }
        }
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        User currentUser;
        String uid;
        super.onViewCreated(view);
        C1256150inF.LIZ(this.LLIZLLLIL, new C1256160inG(C1216270hkv.LIZJ(2131823310), C1216270hkv.LIZJ(2131823309)));
        hp().IQ2(new AwS598S0100000_19(this, 292));
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).avatarService().registerDialogCallback(new AwS563S0100000_19(this, 2049));
        if (C1256440ini.LIZ()) {
            if (C1439905kL.LIZ()) {
                IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null && (uid = currentUser.getUid()) != null) {
                    Qp(uid);
                    return;
                }
                return;
            }
            lp().e11((StoryNoteStatusChangeCallback) this.LLLJL.getValue(), "SCENE_PROFILE");
            if (this.LLLJIL) {
                return;
            }
            lp().qn1(new AwS598S0100000_19(this, 293));
        }
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem, com.ss.android.ugc.profile.business.avatar.IAvatarAbility
    public final void xE(boolean z) {
        View viewLJJZZI;
        View viewLJJZZI2;
        View viewLJJZZI3;
        this.LLJILJILJ = z;
        if (z) {
            InterfaceC1256280inS interfaceC1256280inS = this.LLJIJIL;
            if (interfaceC1256280inS != null && (viewLJJZZI3 = interfaceC1256280inS.LJJZZI()) != null) {
                C786410Ut5.LJLLLLLL(4, viewLJJZZI3);
                return;
            }
            return;
        }
        if (this.LLJILJIL) {
            InterfaceC1256280inS interfaceC1256280inS2 = this.LLJIJIL;
            if (interfaceC1256280inS2 == null || (viewLJJZZI2 = interfaceC1256280inS2.LJJZZI()) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, viewLJJZZI2);
            return;
        }
        InterfaceC1256280inS interfaceC1256280inS3 = this.LLJIJIL;
        if (interfaceC1256280inS3 == null || (viewLJJZZI = interfaceC1256280inS3.LJJZZI()) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(4, viewLJJZZI);
    }

    @Override // com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem, X.InterfaceC1256490inn
    public final void xf(boolean z) {
        this.LLJJIII = z;
        InterfaceC1256280inS interfaceC1256280inS = this.LLJIJIL;
        if (interfaceC1256280inS != null) {
            interfaceC1256280inS.LJIILIIL();
            interfaceC1256280inS.setEnableStarSticker(z);
        }
    }
}
