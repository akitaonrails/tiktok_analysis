package com.ss.android.ugc.now.interaction.assem;

import X.C03IT;
import X.C07ME;
import X.C1350960lGA;
import X.C1352480lIc;
import X.C1352940lJM;
import X.C1354870lMT;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427660Gpo;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS56S0400000_21;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.INowsTabService;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class BubbleReactionCell extends PowerCell<LikeItem> {
    public C427660Gpo LL;
    public TuxIconView LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        String aid;
        NowPostInfo nowPostInfo;
        String enterFrom;
        super.onViewAttachedToWindow();
        INowsTabService iNowsTabService = (INowsTabService) ServiceManager.get().getService(INowsTabService.class);
        this.itemView.getContext();
        LikeItem item = getItem();
        String str = null;
        int iLIZLLL = iNowsTabService.LIZLLL(item != null ? item.getAweme() : null);
        LikeItem item2 = getItem();
        if (item2 != null) {
            User user = item2.getUser();
            Aweme aweme = item2.getAweme();
            String str2 = "";
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            NowFeedMobHierarchyData interactionHierarchyData = item2.getInteractionHierarchyData();
            if (interactionHierarchyData != null && (enterFrom = interactionHierarchyData.getEnterFrom()) != null) {
                str2 = enterFrom;
            }
            Aweme aweme2 = item2.getAweme();
            if (aweme2 != null && (nowPostInfo = aweme2.nowPostInfo) != null) {
                str = nowPostInfo.nowMediaType;
            }
            Aweme aweme3 = item2.getAweme();
            int iLIZ = aweme3 != null ? C1352480lIc.LIZ(aweme3) : 1;
            if (user.getUid() != null) {
                Map<String, Set<String>> map = C07ME.LIZ;
                Set set = (Set) ((LinkedHashMap) map).get(aid);
                if (set == null || !set.contains(user.getUid())) {
                    if (!map.containsKey(aid)) {
                        map.put(aid, new LinkedHashSet());
                    }
                    Set set2 = (Set) ((LinkedHashMap) map).get(aid);
                    C1350960lGA.LJFF(iLIZLLL, iLIZ, str2, "reaction", user.getUid(), str);
                    if (set2 != null) {
                        set2.add(user.getUid());
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        C786410Ut5.T4(this.itemView, 1.0f);
        C786410Ut5.LJLLLLLL(0, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C427660Gpo c427660Gpo;
        LikeItem likeItem = (LikeItem) interfaceC1891350zJl;
        super.onBindItemView(likeItem);
        User user = likeItem.getUser();
        NowFeedMobHierarchyData interactionHierarchyData = likeItem.getInteractionHierarchyData();
        C427660Gpo c427660Gpo2 = this.LL;
        TuxIconView tuxIconView = null;
        if (c427660Gpo2 == null) {
            c427660Gpo2 = null;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        c427660Gpo2.setBackground(c384050F3z.LIZ(c427660Gpo2.getContext()));
        C03IT c03itLIZ = C1354870lMT.LIZ(user);
        if (c03itLIZ != null && (c427660Gpo = this.LL) != null) {
            C427660Gpo.LJIIJJI(c427660Gpo, c03itLIZ, false, null, null, false, false, null, null, false, null, 1006);
        }
        C427660Gpo c427660Gpo3 = this.LL;
        if (c427660Gpo3 == null) {
            c427660Gpo3 = null;
        }
        C786410Ut5.T8(c427660Gpo3, new ACListenerS56S0400000_21(this, likeItem, interactionHierarchyData, user, 2));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_n_thumbup;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        TuxIconView tuxIconView2 = this.LLILLJJLI;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        tuxIconView2.setTuxIcon(c419910GdJ);
        TuxIconView tuxIconView3 = this.LLILLJJLI;
        if (tuxIconView3 != null) {
            tuxIconView = tuxIconView3;
        }
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a09);
        c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        tuxIconView.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZ = C1352940lJM.LIZIZ.LIZ(R.layout.ctm, viewGroup.getContext(), null, null);
        this.LL = (C427660Gpo) viewLIZ.findViewById(R.id.bh8);
        this.LLILLJJLI = (TuxIconView) viewLIZ.findViewById(R.id.jy0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewLIZ, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(100L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        return viewLIZ;
    }
}
