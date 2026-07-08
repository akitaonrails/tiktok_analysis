package com.ss.android.ugc.aweme.vibefeed.feed.interact.msg;

import X.AbstractC2211791BhR;
import X.C01GW;
import X.C0P30;
import X.C0P38;
import X.C0Z2Z;
import X.C0ZDX;
import X.C1356610lPH;
import X.C1361400lX0;
import X.C1385040m98;
import X.C1575210r5r;
import X.C1575440r6E;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2344009Gk;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C896000ZDa;
import X.C912570Zr5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.IMMessageListApi;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import wh6.AbS327S0300000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class VibeMessageCell extends PowerCell<C912570Zr5> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1162));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1165));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1166));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1164));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0Zr6
            public final AFwS201S0000000_14 LJ = AFwS201S0000000_14.get$arr$(323);
            public Function0<String> LJFF;
            public final C914000ZtO LJI;

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ Map LJII() {
                return null;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            {
                this.LJFF = new AwS558S0100000_14(this, 1163);
                this.LJI = new C914000ZtO(this, 4);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJFF = function0;
            }
        });
    }

    public final void I5(boolean z) {
        String str;
        String conversationId;
        String str2;
        String str3;
        String str4;
        C869590Y9l c869590Y9l;
        String conversationId2;
        String str5;
        String strLIZJ;
        C869590Y9l c869590Y9l2;
        String conversationId3;
        String str6;
        C869590Y9l c869590Y9l3;
        C869590Y9l c869590Y9l4;
        C869590Y9l c869590Y9l5;
        C869590Y9l c869590Y9l6;
        C869590Y9l c869590Y9l7;
        if (z) {
            str = "ttsocial_shared_feed_bubble_show";
        } else {
            str = "ttsocial_shared_feed_bubble_click";
        }
        C0P38 c0p38LIZ = C0P30.LIZ();
        C912570Zr5 item = getItem();
        String uuid = null;
        if (item != null && (c869590Y9l7 = item.LLILLJJLI) != null) {
            conversationId = c869590Y9l7.getConversationId();
        } else {
            conversationId = null;
        }
        String str7 = "";
        if (conversationId == null) {
            conversationId = "";
        }
        String strLIZLLL = c0p38LIZ.LIZLLL(conversationId);
        C2344009Gk c2344009Gk = new C2344009Gk();
        C912570Zr5 item2 = getItem();
        if (item2 == null || (str2 = item2.LLILLL) == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        C912570Zr5 item3 = getItem();
        if (item3 == null || (str3 = item3.LLILZ) == null) {
            str3 = "";
        }
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        C912570Zr5 item4 = getItem();
        if (item4 == null || (str4 = item4.LLILZIL) == null) {
            str4 = "";
        }
        c2344009Gk.LJIIIIZZ("shared_feed_type", str4);
        C912570Zr5 item5 = getItem();
        if (item5 != null) {
            c869590Y9l = item5.LLILLJJLI;
        } else {
            c869590Y9l = null;
        }
        c2344009Gk.LIZJ(!C0ZDX.LJJJI(c869590Y9l) ? 1 : 0, "is_reply");
        c2344009Gk.LJIIIIZZ("shared_feed_id", strLIZLLL);
        C912570Zr5 item6 = getItem();
        if (item6 != null && (c869590Y9l6 = item6.LLILLJJLI) != null) {
            conversationId2 = c869590Y9l6.getConversationId();
        } else {
            conversationId2 = null;
        }
        c2344009Gk.LJIIIIZZ("conversation_id", conversationId2);
        C912570Zr5 item7 = getItem();
        if (item7 != null) {
            str5 = item7.LL;
        } else {
            str5 = null;
        }
        c2344009Gk.LJIIIIZZ("from_group_id", str5);
        C912570Zr5 item8 = getItem();
        if (item8 != null && (c869590Y9l5 = item8.LLILLJJLI) != null && C0ZDX.LJJIJIIJIL(c869590Y9l5)) {
            strLIZJ = null;
        } else {
            C1575210r5r c1575210r5r = C1575210r5r.LLILLJJLI;
            C912570Zr5 item9 = getItem();
            if (item9 != null && (c869590Y9l2 = item9.LLILLJJLI) != null && (conversationId3 = c869590Y9l2.getConversationId()) != null) {
                str7 = conversationId3;
            }
            strLIZJ = c1575210r5r.LIZJ(str7);
        }
        if (strLIZJ != null) {
            strLIZJ.toString();
            c2344009Gk.LJFF("invitee_uid", strLIZJ);
        }
        C912570Zr5 item10 = getItem();
        if (item10 != null && (c869590Y9l4 = item10.LLILLJJLI) != null && C0ZDX.LJJIJIIJIL(c869590Y9l4)) {
            str6 = "group";
        } else {
            str6 = "private";
        }
        c2344009Gk.LJIIIIZZ("chat_type", str6);
        C912570Zr5 item11 = getItem();
        if (item11 != null && (c869590Y9l3 = item11.LLILLJJLI) != null) {
            uuid = c869590Y9l3.getUuid();
        }
        c2344009Gk.LJIIIIZZ("message_id", uuid);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String strLIZIZ;
        PreviewHintComponent previewHintComponentYo;
        TextComponent textComponent;
        String displayName;
        UrlModel avatarThumb;
        C912570Zr5 c912570Zr5 = (C912570Zr5) interfaceC1891350zJl;
        super.onBindItemView(c912570Zr5);
        IMUser iMUserLIZLLL = C1575440r6E.LIZLLL(String.valueOf(c912570Zr5.LLILLJJLI.getSender()));
        if (iMUserLIZLLL != null && (avatarThumb = iMUserLIZLLL.getAvatarThumb()) != null) {
            C427660Gpo.LJIIJJI((C427660Gpo) this.LL.getValue(), C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, false, null, 1022);
        }
        TextView textView = (TextView) this.LLILLJJLI.getValue();
        String strLIZ = null;
        if (textView != null) {
            if (iMUserLIZLLL != null) {
                displayName = iMUserLIZLLL.getDisplayName();
            } else {
                displayName = null;
            }
            textView.setText(displayName);
        }
        String strLJI = C1356610lPH.LJI(c912570Zr5.LLILLJJLI.getCreatedAt(), this.itemView.getContext());
        if (strLJI.length() == 0) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" · ");
            sbLIZ.append(strLJI);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        TextView textView2 = (TextView) this.LLILLL.getValue();
        if (textView2 != null) {
            textView2.setText(strLIZIZ);
        }
        TextView textView3 = (TextView) this.LLILZ.getValue();
        if (textView3 != null) {
            if (C0ZDX.LJJJJLI(c912570Zr5.LLILLJJLI)) {
                BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c912570Zr5.LLILLJJLI, BaseTemplate.class);
                if (baseTemplateLIZ != null && (previewHintComponentYo = baseTemplateLIZ.yo()) != null && (textComponent = previewHintComponentYo.quotePreviewText) != null) {
                    strLIZ = textComponent.text;
                }
            } else {
                IMMessageListApi.LIZ.getClass();
                strLIZ = C896000ZDa.LIZ().LIZIZ().LIZ(this.itemView.getContext(), c912570Zr5.LLILLJJLI);
            }
            textView3.setText(strLIZ);
        }
        C786410Ut5.I7(new AbS327S0300000_14(this, iMUserLIZLLL, c912570Zr5, 0), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(viewGroup.getContext(), false);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c1361400lX0LIZ), R.layout.i88, viewGroup, false);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.il);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
        viewTd.setBackground(c384050F3z.LIZ(c1361400lX0LIZ));
        return viewTd;
    }
}
