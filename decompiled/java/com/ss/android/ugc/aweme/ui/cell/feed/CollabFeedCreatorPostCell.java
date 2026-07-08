package com.ss.android.ugc.aweme.ui.cell.feed;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C01GW;
import X.C1220000hqw;
import X.C12ES;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1388190mED;
import X.C13LE;
import X.C1575080r5e;
import X.C1576550r81;
import X.C1843500y4a;
import X.C20673215v0;
import X.C2097608Jq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C438710HIf;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.InterfaceC1891350zJl;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedCreatorPostCell;
import com.ss.android.ugc.aweme.vm.feed.CollabFeedInvitedContainerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabFeedCreatorPostCell extends PowerCell<C1576550r81> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1425));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1429));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1430));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1427));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1428));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1426));
    public final C736950SvV LLIZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1_);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        ((View) this.LLILZ.getValue()).setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        ((RadiusLayout) this.LLILZLL.getValue()).setRadius(4.0f);
        C844470XAv.LIZ.getClass();
        this.itemView.getLayoutParams().width = (C12ES.LJIIJ(C844470XAv.LIZ()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50))) / 4;
    }

    public CollabFeedCreatorPostCell() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(382);
        this.LLIZ = new C736950SvV(C13LE.LIZ(CollabFeedInvitedContainerViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(495), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        final Map<String, String> mapLJ;
        final C1576550r81 c1576550r81 = (C1576550r81) interfaceC1891350zJl;
        if (c1576550r81.LLILZ) {
            C786410Ut5.LLZZ((RadiusLayout) this.LLILZLL.getValue(), 0);
            return;
        }
        if (c1576550r81.LLILLL) {
            C786410Ut5.LLLLZLL((TuxTextView) this.LLILZIL.getValue(), 0);
            C786410Ut5.LJLLLLLL(0, (View) this.LLILZ.getValue());
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) this.LLILLJJLI.getValue(), 0);
            C786410Ut5.LLLLLLZZ((TuxIconView) this.LLILLL.getValue(), 0);
            ((TextView) this.LLILLJJLI.getValue()).setText(C1843500y4a.LIZIZ(c1576550r81.LL.getStatistics().getPlayCount()));
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c1576550r81.LL.getVideo().getCover()));
        c1331670kl3LJIIIIZZ.LIZLLL("Collab");
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LL.getValue());
        c1331670kl3LJIIIIZZ.LIZLLL = true;
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        ((View) this.LL.getValue()).setClickable(false);
        C1575080r5e c1575080r5e = ((CollabFeedInvitedContainerViewModel) this.LLIZ.getValue()).LL;
        if (c1575080r5e == null || (mapLJ = c1575080r5e.LIZIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        final String str = mapLJ.get("enter_from");
        if (str == null) {
            str = "";
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0rUq
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            public final void LIZ(View view) {
                String str2;
                if (c1576550r81.LLILLL) {
                    CollabFeedCreatorPostCell collabFeedCreatorPostCell = this;
                    String str3 = str;
                    C1576550r81 item = collabFeedCreatorPostCell.getItem();
                    if (item != null) {
                        C735840Sti c735840Sti = C735840Sti.LIZ;
                        C19651011uW c19651011uW = C19651011uW.LIZIZ;
                        C735410St1 c735410St1 = new C735410St1();
                        c735410St1.LJIJI(item.LL);
                        c735410St1.LIZLLL = str3;
                        c735410St1.LJJLIIIJILLIZJL = "collab";
                        c735410St1.LJJLIIJ = item.LLILLJJLI.getUid();
                        Object objLJIIIZ = c19651011uW.LJIIIZ(item.LL, c735410St1);
                        Aweme aweme = item.LL;
                        c735840Sti.getClass();
                        C735840Sti.LIZIZ(aweme, objLJIIIZ);
                        ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
                        Context context = collabFeedCreatorPostCell.itemView.getContext();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("aweme://user/profile/");
                        sbLIZ.append(item.LLILLJJLI.getUid());
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
                        smartRouteBuildRoute.withParam("sec_user_id", item.LLILLJJLI.getSecUid());
                        smartRouteBuildRoute.withParam("enter_from", str3);
                        smartRouteBuildRoute.open();
                    }
                    str2 = "click_video_more";
                } else {
                    CollabFeedCreatorPostCell collabFeedCreatorPostCell2 = this;
                    String str4 = str;
                    C1576550r81 item2 = collabFeedCreatorPostCell2.getItem();
                    if (item2 != null) {
                        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(collabFeedCreatorPostCell2.itemView.getContext(), "//aweme/detail");
                        smartRouteBuildRoute2.withParam("enter_from", str4);
                        smartRouteBuildRoute2.withParam(FollowStatusChangeMethod.PARAM_UID, item2.LL.getAid());
                        smartRouteBuildRoute2.withParam("userid", item2.LLILLJJLI.getUid());
                        smartRouteBuildRoute2.withParam("sec_userid", item2.LLILLJJLI.getSecUid());
                        smartRouteBuildRoute2.withParam("extra_previous_page", str4);
                        smartRouteBuildRoute2.open();
                    }
                    str2 = "click_video_cover";
                }
                C241200wU c241200wU = C241200wU.LIZ;
                String str5 = str;
                String uid = c1576550r81.LLILLJJLI.getUid();
                String aid = c1576550r81.LL.getAid();
                String uid2 = c1576550r81.LLILLJJLI.getUid();
                String str6 = (String) mapLJ.get("user_type");
                if (str6 == null) {
                    str6 = "";
                }
                c241200wU.getClass();
                C241200wU.LIZ(1, str5, uid, aid, uid2, str2, str6);
            }
        }, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZJ;
        Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
        if (activityLIZ == null || (viewLIZJ = C20673215v0.LIZJ(R.layout.aga, activityLIZ)) == null) {
            return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aga, viewGroup, false);
        }
        return viewLIZJ;
    }
}
