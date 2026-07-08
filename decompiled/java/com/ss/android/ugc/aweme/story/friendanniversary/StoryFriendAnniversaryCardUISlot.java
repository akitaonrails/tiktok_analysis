package com.ss.android.ugc.aweme.story.friendanniversary;

import X.C01GW;
import X.C03IT;
import X.C069P;
import X.C11NJ;
import X.C1246110iX3;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C197039127h;
import X.C1BGS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2177241AIw;
import X.C2177251AIx;
import X.C2188811AlT;
import X.C2507409s8;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C457780HxI;
import X.C461720I8s;
import X.C723590SZx;
import X.C786410Ut5;
import X.C814420VxA;
import X.C902320ZaY;
import X.C902340Zaa;
import X.C902380Zae;
import X.C902600Zb0;
import X.EnumC1334360kpO;
import X.EnumC1338240kve;
import X.InterfaceC1728106pj;
import Y.ACListenerS149S0100000_14;
import Y.AfS183S0100000_14;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class StoryFriendAnniversaryCardUISlot extends ReusedUISlotAssem<StoryFriendAnniversaryCardUISlot> {
    public InterfaceC1728106pj LLL;
    public RelationshipCelebrationTarget LLLF;
    public boolean LLLFF;
    public volatile boolean LLLFZ;
    public AwS558S0100000_14 LLLI;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1120));
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(307));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1115));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1117));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1116));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1118));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1121));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1114));
    public final C11NJ LLLFFI = new C11NJ();

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fba;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        this.LLLFFI.dispose();
        StoryFriendAnniversaryService storyFriendAnniversaryServiceOp = op();
        if (storyFriendAnniversaryServiceOp != null && storyFriendAnniversaryServiceOp.LIZ(C461720I8s.LIZIZ()) != null) {
            RelationshipCelebrationTarget relationshipCelebrationTarget = this.LLLF;
            C902380Zae.LJIIJ(relationshipCelebrationTarget != null ? relationshipCelebrationTarget.celebratingUserId : null);
        }
        this.LLLI = null;
    }

    public final void dismiss() {
        C902600Zb0 c902600Zb0LIZIZ;
        StoryFriendAnniversaryService.LIZ.getClass();
        StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
        if (storyFriendAnniversaryServiceLIZ != null && (c902600Zb0LIZIZ = storyFriendAnniversaryServiceLIZ.LIZIZ()) != null) {
            c902600Zb0LIZIZ.LIZ(((C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue()).LL);
        }
        StoryFriendAnniversaryService storyFriendAnniversaryServiceOp = op();
        if (storyFriendAnniversaryServiceOp == null || storyFriendAnniversaryServiceOp.LIZ(C461720I8s.LIZIZ()) == null) {
            return;
        }
        new C902320ZaY();
        C902320ZaY.LIZJ(((SessionInfo) this.LLJL.getValue()).getConversationId(), this.LLLF);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
        if (this.LLLFF) {
            dismiss();
        }
    }

    public final StoryFriendAnniversaryService op() {
        return (StoryFriendAnniversaryService) this.LLJLIL.getValue();
    }

    public final void sp() {
        InterfaceC1728106pj interfaceC1728106pj = this.LLL;
        if (interfaceC1728106pj != null) {
            interfaceC1728106pj.LIZ(getContext(), new AwS558S0100000_14(this, 1119));
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", "chat");
        pairArr[1] = new Pair("conversation_id", ((SessionInfo) this.LLJL.getValue()).getConversationId());
        RelationshipCelebrationTarget relationshipCelebrationTarget = this.LLLF;
        pairArr[2] = new Pair("to_user_id", relationshipCelebrationTarget != null ? relationshipCelebrationTarget.celebratingUserId : null);
        pairArr[3] = new Pair("enter_method", "show_on_prompt");
        C20684815ws.LJIILLIIL("ttsocial_post_to_story_btn_click", C2097608Jq.LJIIJ(pairArr));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        StoryFriendAnniversaryService storyFriendAnniversaryServiceOp = op();
        if (storyFriendAnniversaryServiceOp != null && storyFriendAnniversaryServiceOp.LIZ(C461720I8s.LIZIZ()) != null) {
            new C902320ZaY();
            if (C902320ZaY.LIZ(2, ((SessionInfo) this.LLJL.getValue()).getConversationId())) {
                return;
            }
        }
        dismiss();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        RelationshipCelebrationTarget relationshipCelebrationTargetLIZJ;
        String str;
        C902380Zae c902380ZaeLIZ;
        String str2;
        UrlModel avatarMedium;
        String str3;
        UrlModel avatarMedium2;
        C902380Zae c902380ZaeLIZ2;
        StoryFriendAnniversaryService storyFriendAnniversaryServiceOp = op();
        String str4 = null;
        if (storyFriendAnniversaryServiceOp != null && (c902380ZaeLIZ2 = storyFriendAnniversaryServiceOp.LIZ(C461720I8s.LIZIZ())) != null && (relationshipCelebrationTargetLIZJ = c902380ZaeLIZ2.LIZJ(((SessionInfo) this.LLJL.getValue()).getConversationId())) != null) {
            if (relationshipCelebrationTargetLIZJ.lastShowTime == Long.MAX_VALUE) {
                relationshipCelebrationTargetLIZJ.setLastShowTime(System.currentTimeMillis());
            }
        } else {
            relationshipCelebrationTargetLIZJ = null;
        }
        this.LLLF = relationshipCelebrationTargetLIZJ;
        if (relationshipCelebrationTargetLIZJ == null) {
            return;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        ((View) this.LLJLILLLLZIIL.getValue()).setBackground(c384050F3z.LIZ(LJJIJL().getContext()));
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(C2507409s8.LIZ.getValue())));
        c1331670kl3LJIIJ.LIZLLL("friend-anniversary-card-ui");
        c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.IMMEDIATE;
        c1331670kl3LJIIJ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIJ.LJJ = EnumC1338240kve.FIT_XY;
        c1331670kl3LJIIJ.LJJ((SmartImageView) this.LLJLL.getValue());
        C786410Ut5.h3(c1331670kl3LJIIJ);
        User userLIZLLL = C461720I8s.LIZLLL();
        if (userLIZLLL != null && (avatarMedium = userLIZLLL.getAvatarMedium()) != null) {
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            RelationshipCelebrationTarget relationshipCelebrationTarget = this.LLLF;
            if (relationshipCelebrationTarget != null) {
                str3 = relationshipCelebrationTarget.celebratingUserId;
            } else {
                str3 = null;
            }
            IMUser iMUserLJ = c1bgsLJ.LJ(String.valueOf(str3), "");
            if (iMUserLJ != null && (avatarMedium2 = iMUserLJ.getAvatarMedium()) != null) {
                C2177241AIw c2177241AIw = new C2177241AIw(LJJIJL().getContext(), new C1246110iX3(C1697810uHb.LJIIJJI(avatarMedium, avatarMedium2), 2), new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), null, 0, 0, 0.8f, 0.0f, 0, 0, null, null, false, false, false, null, 130940));
                ((AppCompatImageView) this.LLJLLIL.getValue()).setImageBitmap(c2177241AIw.LIZ());
                this.LLLFFI.LIZ(c2177241AIw.LIZLLL().LJL(C1701940uOG.LIZIZ()).LJJLJLI(new AfS183S0100000_14(this, 1)));
            }
        }
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zm);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        ((View) this.LLJLLL.getValue()).setBackground(c384050F3z2.LIZ(LJJIJL().getContext()));
        C786410Ut5.a9((TuxIconView) this.LLJLLL.getValue(), new ACListenerS149S0100000_14(this, 0));
        TextView textView = (TextView) this.LLJZ.getValue();
        RelationshipCelebrationTarget relationshipCelebrationTarget2 = this.LLLF;
        if (relationshipCelebrationTarget2 != null) {
            str = relationshipCelebrationTarget2.celebratingContent;
        } else {
            str = null;
        }
        textView.setText(str);
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZIZ = Integer.valueOf(R.attr.zm);
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
        ((C197039127h) this.LLJZIJLIL.getValue()).setBackground(c384050F3z3.LIZ(LJJIJL().getContext()));
        C197039127h c197039127h = (C197039127h) this.LLJZIJLIL.getValue();
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS149S0100000_14(this, 1));
        }
        StoryFriendAnniversaryService storyFriendAnniversaryServiceOp2 = op();
        if (storyFriendAnniversaryServiceOp2 != null && (c902380ZaeLIZ = storyFriendAnniversaryServiceOp2.LIZ(C461720I8s.LIZIZ())) != null) {
            RelationshipCelebrationTarget relationshipCelebrationTarget3 = this.LLLF;
            if (relationshipCelebrationTarget3 != null) {
                str2 = relationshipCelebrationTarget3.celebratingUserId;
            } else {
                str2 = null;
            }
            c902380ZaeLIZ.LIZ(str2, new AwS558S0100000_14(this, 1));
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", "chat");
        pairArr[1] = new Pair("conversation_id", ((SessionInfo) this.LLJL.getValue()).getConversationId());
        RelationshipCelebrationTarget relationshipCelebrationTarget4 = this.LLLF;
        if (relationshipCelebrationTarget4 != null) {
            str4 = relationshipCelebrationTarget4.celebratingUserId;
        }
        pairArr[2] = new Pair("to_user_id", str4);
        pairArr[3] = new Pair("enter_method", "show_on_prompt");
        C20684815ws.LJIILLIIL("ttsocial_post_to_story_btn_show", C2097608Jq.LJIIJ(pairArr));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("relationTarget: ");
        sbLIZ.append(this.LLLF);
        sbLIZ.append("; ");
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
