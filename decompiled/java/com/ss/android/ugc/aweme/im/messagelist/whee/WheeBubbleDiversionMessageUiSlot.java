package com.ss.android.ugc.aweme.im.messagelist.whee;

import X.C03IT;
import X.C06IM;
import X.C0I0B;
import X.C0I73;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1559260qg8;
import X.C1622106Wt;
import X.C197039127h;
import X.C20684815ws;
import X.C2097608Jq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C457780HxI;
import X.C723590SZx;
import X.C786410Ut5;
import X.C909290Zln;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.IndependentAppBubbleItem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes3.dex */
public final class WheeBubbleDiversionMessageUiSlot extends ReusedUISlotAssem<WheeBubbleDiversionMessageUiSlot> implements InterfaceC712990Rxx<C1622106Wt> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public SmartImageView LLJL;
    public TuxTextView LLJLIL;
    public C197039127h LLJLILLLLZIIL;
    public boolean LLJLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.csr;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final Map<String, String> op() {
        String uid;
        C909290Zln c909290Zln;
        IMUser fromUser;
        SessionInfo sessionInfo = ((C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue()).LL;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("chat_type", "private");
        pairArr[1] = new Pair("conversation_id", sessionInfo.getConversationId());
        if (!(sessionInfo instanceof C909290Zln) || (c909290Zln = (C909290Zln) sessionInfo) == null || (fromUser = c909290Zln.getFromUser()) == null || (uid = fromUser.getUid()) == null) {
            uid = "";
        }
        pairArr[2] = new Pair("to_user_id", uid);
        pairArr[3] = new Pair(Scene.SCENE_SERVICE, "whee_bubble_diversion");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (SmartImageView) view.findViewById(R.id.whee_bubble_card_icon);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.whee_bubble_card_title);
        this.LLJLILLLLZIIL = (C197039127h) view.findViewById(R.id.whee_bubble_card_get);
        Context context = view.getContext();
        float f = C0I73.LIZ;
        View viewFindViewById = view.findViewById(R.id.whee_bubble_card_root);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
        c384050F3z.LIZJ = Float.valueOf(f);
        viewFindViewById.setBackground(c384050F3z.LIZ(context));
        View viewFindViewById2 = view.findViewById(R.id.whee_bubble_card_close);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zm);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(999.0f)));
        viewFindViewById2.setBackground(c384050F3z2.LIZ(context));
        ((C197039127h) view.findViewById(R.id.whee_bubble_card_get)).LJJJJL(new AwS580S0100000_1(context, 575));
        C786410Ut5.I7(new ACListenerS137S0100000_2(this, 29), view.findViewById(R.id.whee_bubble_card_get));
        C786410Ut5.I7(new ACListenerS137S0100000_2(this, 30), view.findViewById(R.id.whee_bubble_card_close));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1622106Wt c1622106Wt) {
        String string;
        String str;
        Context context;
        String string2;
        String str2;
        C06IM.LIZ.getClass();
        IndependentAppBubbleItem independentAppBubbleItemLIZ = C06IM.LIZ();
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null && (context = tuxTextView.getContext()) != null) {
            if (independentAppBubbleItemLIZ == null || (str2 = independentAppBubbleItemLIZ.appName) == null || (string2 = a0.LJLIIIL(str2).toString()) == null || string2.length() <= 0) {
                string2 = "Whee";
            }
            TuxTextView tuxTextView2 = this.LLJLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(context.getString(2131858485, string2));
            }
            C197039127h c197039127h = this.LLJLILLLLZIIL;
            if (c197039127h != null) {
                c197039127h.setText(context.getString(2131858486));
            }
        }
        SmartImageView smartImageView = this.LLJL;
        if (smartImageView != null) {
            if (independentAppBubbleItemLIZ == null || (str = independentAppBubbleItemLIZ.bottomCardBannerImageUrl) == null || (string = a0.LJLIIIL(str).toString()) == null) {
                string = "";
            }
            if (u.LJJIIJZLJL(string, "http", false)) {
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(string)));
                c1331670kl3LJIIJ.LIZLLL("whee_bubble_diversion_banner_card");
                c1331670kl3LJIIJ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIJ);
            } else {
                smartImageView.setImageDrawable(null);
            }
            if (!this.LLJLL) {
                this.LLJLL = true;
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("ttsocial_chat_guide_card_show", op());
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1622106Wt c1622106Wt) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1622106Wt c1622106Wt) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
