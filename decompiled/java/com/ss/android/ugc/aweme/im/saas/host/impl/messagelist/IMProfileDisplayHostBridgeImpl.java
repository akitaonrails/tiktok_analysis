package com.ss.android.ugc.aweme.im.saas.host.impl.messagelist;

import X.C01GW;
import X.C0I0B;
import X.C0SY4;
import X.C1264070j01;
import X.C1387050mCN;
import X.C20684815ws;
import X.C418440Gaw;
import X.C452501pT;
import X.C497820Jfg;
import X.C735370Ssx;
import X.C786410Ut5;
import X.C814420VxA;
import X.C830490Whz;
import X.EnumC1387060mCO;
import X.InterfaceC1710106mp;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMProfileDisplayHostBridge;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS160S1100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class IMProfileDisplayHostBridgeImpl implements IMProfileDisplayHostBridge {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(476));

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMProfileDisplayHostBridge
    public final void LIZ(RelationButton relationButton) {
        if (relationButton != null) {
            C786410Ut5.LJLLLLLL(8, relationButton);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMProfileDisplayHostBridge
    public final View LIZIZ(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cr3, viewGroup, false);
        viewGroup.addView(viewTd);
        return viewTd;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMProfileDisplayHostBridge
    public final void LIZLLL(View view, String str) {
        RelationLabelTextView relationLabelTextView;
        MatchedFriendStruct matchedFriendStructLIZIZ = ((InterfaceC1710106mp) this.LIZIZ.getValue()).LIZIZ(str);
        if (matchedFriendStructLIZIZ != null && (view instanceof RelationLabelTextView) && (relationLabelTextView = (RelationLabelTextView) view) != null) {
            relationLabelTextView.setMaxWidth(C497820Jfg.LIZIZ(relationLabelTextView.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            RelationLabelTextView.LJJJJL(relationLabelTextView, matchedFriendStructLIZIZ, C1264070j01.LJJII);
            C786410Ut5.v0(relationLabelTextView, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMProfileDisplayHostBridge
    public final void LIZJ(User user, RelationButton relationButton, LifecycleOwner lifecycleOwner) {
        String str;
        String str2;
        if ((relationButton instanceof RelationButton) && relationButton != null) {
            if (user.getFollowStatus() != 1 && user.getFollowStatus() != 2) {
                if (relationButton.getVisibility() == 0) {
                    return;
                }
                C1387050mCN c1387050mCN = new C1387050mCN(user);
                c1387050mCN.LJ = EnumC1387060mCO.FRIENDS;
                c1387050mCN.LJIIJJI = lifecycleOwner;
                c1387050mCN.LIZIZ = false;
                relationButton.LLLLZIL(c1387050mCN.LIZ());
                if (user.getFollowerStatus() == 1) {
                    str = "follow_back_button";
                } else {
                    str = "follow_button";
                }
                relationButton.setTracker(new AwS160S1100000_11(user, str, 16));
                relationButton.setFollowClickInterceptor(new C0SY4(relationButton, user, null));
                C786410Ut5.t0(relationButton, 0);
                if (user.getFollowerStatus() == 1) {
                    str2 = "follow_back";
                } else {
                    str2 = "follow";
                }
                String strLJJIFFI = C735370Ssx.LJJIFFI(user);
                String uid = user.getUid();
                if (uid == null) {
                    uid = "";
                }
                String accurateRecType = user.getAccurateRecType();
                C0I0B.LJFF.LIZIZ();
                C830490Whz c830490Whz = new C830490Whz();
                c830490Whz.put("enter_from", "chat");
                c830490Whz.put("to_user_id", uid);
                c830490Whz.put("follow_type", str2);
                if (accurateRecType == null) {
                    accurateRecType = "";
                }
                c830490Whz.put("rec_type", accurateRecType);
                if (strLJJIFFI == null) {
                    strLJJIFFI = "";
                }
                c830490Whz.put("to_user_type", strLJJIFFI);
                C20684815ws.LJIILLIIL("show_follow_button", c830490Whz);
                return;
            }
            LIZ(relationButton);
        }
    }
}
