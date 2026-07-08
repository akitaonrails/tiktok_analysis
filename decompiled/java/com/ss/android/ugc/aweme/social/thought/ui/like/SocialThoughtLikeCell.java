package com.ss.android.ugc.aweme.social.thought.ui.like;

import X.C0S1B;
import X.C1243240iSQ;
import X.C1387050mCN;
import X.C319540Cfo;
import X.C737650Swd;
import X.C737740Swm;
import X.C786410Ut5;
import X.EnumC1387060mCO;
import X.EnumC1607270rvZ;
import X.InterfaceC1891350zJl;
import Y.ACListenerS146S0100000_11;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.story.model.StoryInteraction;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class SocialThoughtLikeCell extends PowerCell<C319540Cfo> {
    public static final StoryInteraction LLILZ = new StoryInteraction(2, null, null, 0, 0, false, null, null);
    public AvatarComponentView LL;
    public TuxTextView LLILLJJLI;
    public RelationButton LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ft7;
    }

    public final void I5() {
        String uid;
        C319540Cfo item = getItem();
        if (item == null || (uid = item.LL.getUid()) == null || uid.length() <= 0) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "aweme://user/profile");
        smartRouteBuildRoute.withParam("uid", uid);
        smartRouteBuildRoute.withParam("enter_from", item.LLILLJJLI);
        smartRouteBuildRoute.withParam("enter_method", "creator_thought_view_panel_likes");
        smartRouteBuildRoute.open();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.itemView.findViewById(R.id.xu8);
        RelationButton relationButton = null;
        if (avatarComponentView != null) {
            avatarComponentView.getConfig().LIZJ(new C737740Swm(0));
            avatarComponentView.LJFF(avatarComponentView.getConfig());
            C786410Ut5.y9(avatarComponentView, new ACListenerS146S0100000_11(this, 24));
        } else {
            avatarComponentView = null;
        }
        this.LL = avatarComponentView;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.xu_);
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS146S0100000_11(this, 25));
        } else {
            tuxTextView = null;
        }
        this.LLILLJJLI = tuxTextView;
        RelationButton relationButton2 = (RelationButton) this.itemView.findViewById(R.id.xub);
        if (relationButton2 != null) {
            relationButton2.setFollowClickInterceptor(new C737650Swd(this, null));
            relationButton = relationButton2;
        }
        this.LLILLL = relationButton;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C319540Cfo c319540Cfo = (C319540Cfo) interfaceC1891350zJl;
        super.onBindItemView(c319540Cfo);
        User user = c319540Cfo.LL;
        AvatarComponentView avatarComponentView = this.LL;
        if (avatarComponentView != null) {
            String uid = user.getUid();
            if (uid == null) {
                uid = "";
            }
            C0S1B.LIZ(avatarComponentView, uid, user, this, false, null, 56);
            avatarComponentView.LJIILIIL(LLILZ, EnumC1607270rvZ.INTERACTION);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C1243240iSQ.LIZ.getClass();
            tuxTextView.setText(C1243240iSQ.LIZ(user, true));
        }
        RelationButton relationButton = this.LLILLL;
        if (relationButton != null) {
            C1387050mCN c1387050mCN = new C1387050mCN(user);
            c1387050mCN.LIZIZ = true;
            c1387050mCN.LIZJ = true;
            c1387050mCN.LJIIJJI = this;
            c1387050mCN.LJ = EnumC1387060mCO.MESSAGE;
            relationButton.LLLLZIL(c1387050mCN.LIZ());
        }
    }
}
