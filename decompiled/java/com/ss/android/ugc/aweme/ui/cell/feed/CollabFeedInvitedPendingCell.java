package com.ss.android.ugc.aweme.ui.cell.feed;

import X.AbstractC2211791BhR;
import X.C01GW;
import X.C0S1B;
import X.C0SE9;
import X.C1220000hqw;
import X.C123100dR;
import X.C1388190mED;
import X.C13LE;
import X.C1575080r5e;
import X.C1843500y4a;
import X.C1908030zkf;
import X.C20642515q3;
import X.C20673215v0;
import X.C2097608Jq;
import X.C2211751BhN;
import X.C241200wU;
import X.C343240Dcw;
import X.C384050F3z;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.vm.feed.CollabFeedInvitedContainerViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS5S1200000_4;
import irm.AkS61S0200000_24;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabFeedInvitedPendingCell extends PowerCell<C343240Dcw> {
    public static final /* synthetic */ int LLIZ = 0;
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1460));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1463));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1462));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1461));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1459));
    public final C736950SvV LLILZLL;

    public final CollabFeedInvitedContainerViewModel I5() {
        return (CollabFeedInvitedContainerViewModel) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LL.getValue();
        avatarComponentView.setClickable(false);
        new AwS603S0100000_24(this, 376).invoke(avatarComponentView.getConfig().LIZ);
        avatarComponentView.LJFF(avatarComponentView.getConfig());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(5));
        ((View) this.LLILZ.getValue()).setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(5));
        ((View) this.LLILZIL.getValue()).setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0rVI
            public Function0<String> LJ;
            public final boolean LJFF = true;
            public final C1620890sHX LJI;

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIZ() {
                return this.LJFF;
            }

            {
                this.LJ = new AwS568S0100000_24(this, 1464);
                this.LJI = new C1620890sHX(this, 3);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    public CollabFeedInvitedPendingCell() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(384);
        this.LLILZLL = new C736950SvV(C13LE.LIZ(CollabFeedInvitedContainerViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(498), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Map<String, String> mapLJ;
        boolean z;
        int i;
        C343240Dcw c343240Dcw = (C343240Dcw) interfaceC1891350zJl;
        C0S1B.LIZ((AvatarComponentView) this.LL.getValue(), c343240Dcw.LL.getUid(), c343240Dcw.LL, this, false, null, 56);
        C1575080r5e c1575080r5e = I5().LL;
        if (c1575080r5e == null || (mapLJ = c1575080r5e.LIZIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (C123100dR.LIZ(mapLJ.get(Scene.SCENE_SERVICE))) {
            z = true;
        } else {
            z = false;
        }
        String nickname = c343240Dcw.LL.getNickname();
        if (nickname.length() == 0) {
            nickname = c343240Dcw.LL.getUniqueId();
        }
        TextView textView = (TextView) this.LLILLJJLI.getValue();
        if (z) {
            nickname = C0SE9.LIZ(c343240Dcw.LL, nickname);
        }
        textView.setText(nickname);
        TextView textView2 = (TextView) this.LLILLL.getValue();
        String strLJ = C20642515q3.LJ(2131755688, c343240Dcw.LL.getFollowerCount(), C1843500y4a.LIZIZ(r2.getFollowerCount()));
        String str = "";
        if (strLJ == null) {
            strLJ = "";
        }
        textView2.setText(strLJ);
        TextView textView3 = (TextView) this.LLILLL.getValue();
        if (C444960Hcc.LIZIZ()) {
            i = 5;
        } else {
            i = 3;
        }
        textView3.setGravity(i);
        String str2 = mapLJ.get("enter_from");
        if (str2 != null) {
            str = str2;
        }
        C786410Ut5.I7(new AkS5S1200000_4(this, c343240Dcw, str, 0), (View) this.LLILZ.getValue());
        C786410Ut5.I7(new AkS5S1200000_4(this, c343240Dcw, str, 1), (View) this.LLILZIL.getValue());
        C786410Ut5.I7(new AkS61S0200000_24(this, c343240Dcw, 1), this.itemView);
        C1908030zkf.LJI(this.itemView.getContext(), c343240Dcw.LL.getCustomVerify(), c343240Dcw.LL.getEnterpriseVerifyReason(), (TextView) this.LLILLJJLI.getValue());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZJ;
        Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
        if (activityLIZ == null || (viewLIZJ = C20673215v0.LIZJ(R.layout.agc, activityLIZ)) == null) {
            return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.agc, viewGroup, false);
        }
        return viewLIZJ;
    }

    public final void L5(Aweme aweme, String str, String str2, boolean z) {
        Map<String, String> mapLJ;
        String str3;
        C1575080r5e c1575080r5e = I5().LL;
        if (c1575080r5e == null || (mapLJ = c1575080r5e.LIZIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C241200wU c241200wU = C241200wU.LIZ;
        String str4 = mapLJ.get("enter_from");
        if (str4 == null) {
            str4 = "";
        }
        String aid = aweme.getAid();
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        if (z) {
            str3 = "click";
        } else {
            str3 = "show";
        }
        c241200wU.getClass();
        C241200wU.LIZLLL(str4, aid, authorUid, "collab_panel", str3, str, str2);
    }
}
