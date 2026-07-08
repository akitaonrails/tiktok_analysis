package com.ss.android.ugc.profile.business.ur.socialavatar;

import X.C01GW;
import X.C0HZ2;
import X.C0HZ4;
import X.C0HZ6;
import X.C291210BbD;
import X.C452501pT;
import X.InterfaceC800130Va7;
import com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarEntranceDynamicDataSource;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarEntranceControlProvider implements SocialAvatarEntranceControl {
    public final C01GW LIZ = C452501pT.LIZIZ(new C0HZ4(this));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C0HZ6());

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final InterfaceC800130Va7 LJIILIIL() {
        return new SocialAvatarDynamicSettingRequestLegoTask();
    }

    public final SocialAvatarEntranceControlModel LJIILLIIL() {
        return (SocialAvatarEntranceControlModel) this.LIZIZ.getValue();
    }

    public final double LJIIZILJ() {
        return ((Number) this.LIZ.getValue()).doubleValue();
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LIZ() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.STABLE_OTHERS_PROFILE_FLOATING_NOTICE);
        }
        return true;
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LIZIZ() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.STABLE_STORY_REACTION_TAB);
        }
        Double d = LJIILLIIL().storyReaction;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LIZJ() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.STABLE_EDIT_PROFILE_ACTION_SHEET);
        }
        Double d = LJIILLIIL().editProfileActionSheet;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LIZLLL() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.STABLE_DM_INLINE_MESSAGE);
        }
        Double d = LJIILLIIL().dmInlineMsg;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LJ() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.STABLE_DM_STICKER_REACTION_BAR);
        }
        Double d = LJIILLIIL().dmReaction;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LJFF() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.PROMO_PROFILE_FLOATING_NOTICE);
        }
        Double d = LJIILLIIL().profileFloatingNotice;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LJI() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.PROMO_DM_CARD_MESSAGES);
        }
        Double d = LJIILLIIL().dmCardMessage;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LJII() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.DM_AI_MOJI_COMPATIBILITY);
        }
        Double d = LJIILLIIL().aiMojiCompatibility;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LJIIIIZZ() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.PROMO_ICON_FLIP);
        }
        Double d = LJIILLIIL().iconFlip;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LJIIIZ() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.STABLE_ENLARGE_AVATAR_SELF);
        }
        Double d = LJIILLIIL().enlargeAvatarSelf;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LJIIJ() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.PROMO_EDIT_PROFILE_BANNER);
        }
        Double d = LJIILLIIL().editProfileBanner;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LJIIJJI() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.STABLE_DM_FAVORITE_TAB_ACTION_SHEET);
        }
        Double d = LJIILLIIL().dmFavTabActionSheet;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LJIIL() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.STABLE_DM_STICKER_DETAIL_PANEL);
        }
        Double d = LJIILLIIL().dmStickerDetail;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LJIILJJIL() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.STABLE_ENLARGE_AVATAR_OTHERS);
        }
        Double d = LJIILLIIL().enlargeAvatarOthers;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEntranceControl
    public final boolean LJIILL() {
        if (C291210BbD.LIZ()) {
            return SocialAvatarEntranceDynamicDataSource.LL.LIZJ(C0HZ2.PROMO_DM_FAVORITE_TAB_BANNER);
        }
        Double d = LJIILLIIL().dmFavTabBanner;
        return LJIIZILJ() <= (d != null ? d.doubleValue() : 1.0d);
    }
}
