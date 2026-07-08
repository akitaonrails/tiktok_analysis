package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.left;

import X.C01GW;
import X.C0RFL;
import X.C0RJN;
import X.C0S1B;
import X.C0S1K;
import X.C0ZE7;
import X.C14EU;
import X.C1558520qew;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C1618440sDa;
import X.C2188811AlT;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C713150RyD;
import X.C724270Sb3;
import X.C729510SjV;
import X.C897520ZIw;
import X.EnumC1606090rtf;
import X.InterfaceC665370Q7z;
import X.InterfaceC706770Rnv;
import X.ViewOnLayoutChangeListenerC713140RyC;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedActivityStatusAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.anim.IStoryDetailMorphAnimationAvatarAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryUserAvatarComponent extends BaseCellSlotComponent<StoryUserAvatarComponent> implements IStoryDetailMorphAnimationAvatarAbility {
    public final C630740Ooa LLJLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 785));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 784));
    public final ViewOnLayoutChangeListenerC713140RyC LLJZ = ViewOnLayoutChangeListenerC713140RyC.LL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fdd;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 786);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_user_avatar", true, awS555S0100000_11);
    }

    public final AvatarComponentView Ep() {
        return (AvatarComponentView) this.LLJLLL.getValue();
    }

    public final boolean Fp() {
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        Fragment fragment = c0rjnLIZIZ != null ? c0rjnLIZIZ.LJ : null;
        C724270Sb3 c724270Sb3 = this.LLJI;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        Aweme awemeLJJII = interfaceC706770RnvLJJIIJ.LJJII(fragment, videoItemParams != null ? videoItemParams.getAweme() : null);
        return Intrinsics.LJFF(awemeLJJII != null ? awemeLJJII.getAid() : null, "reveal_story");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, IStoryDetailMorphAnimationAvatarAbility.class, null);
        }
        EventBus.LIZLLL().LJJI(this);
        int i = C0RFL.LIZ;
        AvatarComponentView avatarComponentViewEp = Ep();
        if (avatarComponentViewEp != null) {
            avatarComponentViewEp.removeOnLayoutChangeListener(this.LLJZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.anim.IStoryDetailMorphAnimationAvatarAbility
    public final View Hy1() {
        View avatar;
        Aweme aweme;
        User author;
        Aweme aweme2;
        String nickname = null;
        if (Fp()) {
            return null;
        }
        AvatarComponentView avatarComponentViewEp = Ep();
        if (avatarComponentViewEp == null || (avatar = avatarComponentViewEp.getRealAvatarView()) == null) {
            AvatarComponentView avatarComponentViewEp2 = Ep();
            avatar = avatarComponentViewEp2 != null ? avatarComponentViewEp2.getAvatar() : null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAvatarView: size=");
        sbLIZ.append(avatar != null ? Integer.valueOf(avatar.getWidth()) : null);
        sbLIZ.append('x');
        sbLIZ.append(avatar != null ? Integer.valueOf(avatar.getHeight()) : null);
        sbLIZ.append(", uid=");
        C724270Sb3 c724270Sb3 = this.LLJI;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        sbLIZ.append((videoItemParams == null || (aweme2 = videoItemParams.getAweme()) == null) ? null : AwemeExtKt.getAuthorUid(aweme2));
        sbLIZ.append(", nickName = ");
        C724270Sb3 c724270Sb32 = this.LLJI;
        VideoItemParams videoItemParams2 = (VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null);
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null && (author = aweme.getAuthor()) != null) {
            nickname = author.getNickname();
        }
        sbLIZ.append(nickname);
        C2188811AlT.LIZIZ(sbLIZ);
        return avatar;
    }

    @Override // com.ss.android.ugc.aweme.story.anim.IStoryDetailMorphAnimationAvatarAbility
    public final String getCurrentUid() {
        Aweme aweme;
        User author;
        Aweme aweme2;
        if (Fp()) {
            return "reveal_story";
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        String nickname = null;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        if (C729510SjV.LJIIL(videoItemParams != null ? videoItemParams.getAweme() : null)) {
            InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
            C0RJN c0rjnLIZIZ = jm().LIZIZ();
            Fragment fragment = c0rjnLIZIZ != null ? c0rjnLIZIZ.LJ : null;
            C724270Sb3 c724270Sb32 = this.LLJI;
            VideoItemParams videoItemParams2 = (VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null);
            Aweme awemeLJJII = interfaceC706770RnvLJJIIJ.LJJII(fragment, videoItemParams2 != null ? videoItemParams2.getAweme() : null);
            if (awemeLJJII != null) {
                return awemeLJJII.getAid();
            }
            return null;
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        VideoItemParams videoItemParams3 = (VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null);
        String authorUid = (videoItemParams3 == null || (aweme2 = videoItemParams3.getAweme()) == null) ? null : AwemeExtKt.getAuthorUid(aweme2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCurrentUid: uid=");
        sbLIZ.append(authorUid);
        sbLIZ.append(", nickName = ");
        C724270Sb3 c724270Sb34 = this.LLJI;
        VideoItemParams videoItemParams4 = (VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null);
        if (videoItemParams4 != null && (aweme = videoItemParams4.getAweme()) != null && (author = aweme.getAuthor()) != null) {
            nickname = author.getNickname();
        }
        sbLIZ.append(nickname);
        C2188811AlT.LIZIZ(sbLIZ);
        return authorUid;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, IStoryDetailMorphAnimationAvatarAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        AvatarComponentView avatarComponentViewEp = Ep();
        if (avatarComponentViewEp != null) {
            if (avatarComponentViewEp.getWidth() > 0 && avatarComponentViewEp.getHeight() > 0) {
                C0S1K.LIZIZ.LJ(avatarComponentViewEp);
            }
            avatarComponentViewEp.addOnLayoutChangeListener(this.LLJZ);
        }
    }

    @C14EU
    public final void onQuickEmojiAniComplete(C713150RyD c713150RyD) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) obj).getAweme());
        c713150RyD.getClass();
        if (!Intrinsics.LJFF(authorUid, null)) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ObjectAnimator.ofFloat(getContentView(), "scaleX", 1.0f, 0.6f), ObjectAnimator.ofFloat(getContentView(), "scaleY", 1.0f, 0.6f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(100L);
        animatorSet2.setInterpolator(new LinearInterpolator());
        animatorSet2.playTogether(ObjectAnimator.ofFloat(getContentView(), "scaleX", 0.6f, 1.0f), ObjectAnimator.ofFloat(getContentView(), "scaleY", 0.6f, 1.0f));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.start();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C897520ZIw c897520ZIwXi0;
        super.onViewCreated(view);
        AvatarComponentView avatarComponentViewEp = Ep();
        if (avatarComponentViewEp != null) {
            C1608750rxx config = avatarComponentViewEp.getConfig();
            new AwS590S0100000_11(this, 228).invoke(config.LIZ);
            C0ZE7 c0ze7Nz0 = null;
            IFeedActivityStatusAbility iFeedActivityStatusAbility = (IFeedActivityStatusAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFeedActivityStatusAbility.class, null);
            EnumC1606090rtf enumC1606090rtf = EnumC1606090rtf.STORY_DETAIL_AVATAR;
            if (iFeedActivityStatusAbility != null) {
                c897520ZIwXi0 = iFeedActivityStatusAbility.Xi0();
                c0ze7Nz0 = iFeedActivityStatusAbility.Nz0();
            } else {
                c897520ZIwXi0 = null;
            }
            config.LIZJ(new C1607280rva(new C1607310rvd(enumC1606090rtf, c0ze7Nz0, false, false, c897520ZIwXi0, 110)));
            avatarComponentViewEp.LJFF(avatarComponentViewEp.getConfig());
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        AvatarComponentView avatarComponentViewEp = Ep();
        if (avatarComponentViewEp != null) {
            C0S1B.LIZ(avatarComponentViewEp, AwemeExtKt.getAuthorUid(videoItemParams2.getAweme()), videoItemParams2.getAweme().getAuthor(), this, false, null, 56);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }
}
