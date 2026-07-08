package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.repost;

import X.C01GW;
import X.C109100bB;
import X.C123100dR;
import X.C1357800lRC;
import X.C1360320lVG;
import X.C13DA;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1710306mr;
import X.C2188811AlT;
import X.C337180DJs;
import X.C339190DRl;
import X.C452501pT;
import X.C704790Rkj;
import X.C705700RmC;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellTrackParamsProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.text.BreakIterator;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import wh6.AbS701S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3RepostCommentInputAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3RepostCommentInputAssem, InterfaceC1361270lWn> implements FriendsV3CellTrackParamsProtocol, FriendsV3ViewStateProtocol {
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(267));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cam;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cam, new AwS565S0100000_21(this, 574));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CellTrackParamsProtocol
    public final Map<String, Object> J62() {
        return new LinkedHashMap();
    }

    public final FriendsV3RepostModel sp() {
        InterfaceC1357880lRK interfaceC1357880lRK;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = c724270Sb3 != null ? c724270Sb3.LL : null;
        if (!(obj instanceof InterfaceC1357880lRK) || (interfaceC1357880lRK = (InterfaceC1357880lRK) obj) == null) {
            return null;
        }
        return interfaceC1357880lRK.LLD();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final List<View> AG0() {
        return Collections.singletonList(LJJIJL());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), FriendsV3ViewStateProtocol.class, this);
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), FriendsV3CellTrackParamsProtocol.class, this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FriendsV3ViewStateProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FriendsV3CellTrackParamsProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new AbS701S0100000_21(this, 4), view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        String nickname;
        User user;
        if (ur((InterfaceC1361270lWn) obj)) {
            C339190DRl.LIZLLL(getContentView());
            TextView textView = (TextView) getContentView().findViewById(R.id.ebk);
            Object[] objArr = new Object[1];
            FriendsV3RepostModel friendsV3RepostModelSp = sp();
            if (friendsV3RepostModelSp != null && (user = friendsV3RepostModelSp.reposter) != null && (nickname = user.getNickname()) != null) {
                if (nickname.length() != 0) {
                    BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
                    characterInstance.setText(nickname);
                    characterInstance.first();
                    int next = characterInstance.next();
                    int i = 0;
                    while (true) {
                        if (next == -1) {
                            break;
                        }
                        i++;
                        if (i < 12) {
                            next = characterInstance.next();
                        } else if (next != -1) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(nickname.substring(0, next));
                            sbLIZ.append("... ");
                            nickname = C2188811AlT.LIZIZ(sbLIZ);
                            if (nickname == null) {
                            }
                        }
                    }
                }
            } else {
                nickname = "";
            }
            objArr[0] = nickname;
            textView.setText(C1710306mr.LIZIZ(2131846283, objArr));
            return;
        }
        C337180DJs.LIZ(getContentView());
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: tp, reason: merged with bridge method [inline-methods] */
    public final boolean ur(InterfaceC1361270lWn interfaceC1361270lWn) {
        Object obj;
        boolean z;
        InterfaceC1357880lRK interfaceC1357880lRK;
        C724270Sb3 c724270Sb3 = this.LLJI;
        C1357800lRC c1357800lRCLJLJL = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if ((obj instanceof InterfaceC1357880lRK) && (interfaceC1357880lRK = (InterfaceC1357880lRK) obj) != null) {
            c1357800lRCLJLJL = interfaceC1357880lRK.LJLJL();
        }
        if (c1357800lRCLJLJL != null && c1357800lRCLJLJL.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if ((interfaceC1361270lWn instanceof InterfaceC1357880lRK) && z) {
            return true;
        }
        return false;
    }

    public final void up(boolean z) {
        String str;
        String aid;
        Boolean boolValueOf;
        User user;
        String str2;
        Aweme aweme;
        if (z) {
            str = "ttsocial_repost_panel_reply_guide_show";
        } else {
            str = "ttsocial_repost_panel_reply_guide_click";
        }
        C109100bB c109100bB = C109100bB.LIZ;
        C13DA c13da = new C13DA();
        c13da.put("friends_tab_version", "v3.0");
        c13da.put("enter_from", "homepage_friends");
        c13da.put("enter_method", "friends_repost_cell");
        c13da.put("is_detail_page", CardStruct.IStatusCode.DEFAULT);
        FriendsV3RepostModel friendsV3RepostModelSp = sp();
        Integer numValueOf = null;
        if (friendsV3RepostModelSp != null && (aweme = friendsV3RepostModelSp.repostedAweme) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c13da.put("group_id", aid);
        FriendsV3RepostModel friendsV3RepostModelSp2 = sp();
        if (friendsV3RepostModelSp2 != null && (str2 = friendsV3RepostModelSp2.repostText) != null) {
            boolValueOf = Boolean.valueOf(C123100dR.LIZ(str2));
        } else {
            boolValueOf = null;
        }
        c13da.put("with_text", boolValueOf);
        FriendsV3RepostModel friendsV3RepostModelSp3 = sp();
        if (friendsV3RepostModelSp3 != null && (user = friendsV3RepostModelSp3.reposter) != null) {
            numValueOf = Integer.valueOf(C1360320lVG.LIZ(user));
        }
        c13da.put("follow_status", numValueOf);
        Map mapBuild = c13da.build();
        c109100bB.getClass();
        C109100bB.LIZ(str, mapBuild);
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final void EK2(View view, boolean z) {
        if (z && view.getVisibility() == 0) {
            up(true);
        }
    }
}
