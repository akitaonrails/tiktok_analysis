package kotlin.jvm.internal;

import X.C06TB;
import X.C09AY;
import X.C0I5R;
import X.C0I7V;
import X.C0ID1;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332130kln;
import X.C1558520qew;
import X.C438710HIf;
import X.C454440Hru;
import X.C869590Y9l;
import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.chatroom.input.components.replyarea.IMReplyLayoutInputAssem2;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveCardAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS50S0310000_6 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS50S0310000_6 awS50S0310000_6) {
        MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS50S0310000_6.l0), MessageListQuotedMessageClickAbility.class, null);
        if (messageListQuotedMessageClickAbility != null) {
            messageListQuotedMessageClickAbility.lC1(((IMReplyLayoutInputAssem2) awS50S0310000_6.l0).LJJIJL(), ((C869590Y9l) awS50S0310000_6.l1).getMsgId(), Long.valueOf(((C869590Y9l) awS50S0310000_6.l1).getMsgType()), new C0I5R(Boolean.valueOf(awS50S0310000_6.z3), ((AwemeCardTemplate) awS50S0310000_6.l2).baseVideoComponent.id, String.valueOf(((C869590Y9l) awS50S0310000_6.l1).getSender()), ((C869590Y9l) awS50S0310000_6.l1).getScene(), false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS50S0310000_6 awS50S0310000_6) {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ((UrlModel) awS50S0310000_6.l0));
        c1331670kl3LJIIIIZZ.LJJJJLI = C454440Hru.LIZ();
        boolean z = awS50S0310000_6.z3;
        ShareLiveCardAssem shareLiveCardAssem = (ShareLiveCardAssem) awS50S0310000_6.l1;
        if (z) {
            Context context = shareLiveCardAssem.tp().getImageView().getContext();
            if (context != null) {
                c1331670kl3LJIIIIZZ.LJJIJIL(new C0I7V(context, 5));
                C1332130kln.LIZJ(c1331670kl3LJIIIIZZ, C06TB.DEFAULT);
            }
        } else {
            C1332130kln.LIZJ(c1331670kl3LJIIIIZZ, C06TB.DEFAULT);
        }
        c1331670kl3LJIIIIZZ.LJJIIZ(R.drawable.cce);
        c1331670kl3LJIIIIZZ.LJIJJLI(R.drawable.cce);
        c1331670kl3LJIIIIZZ.LJJ(((ShareLiveCardAssem) awS50S0310000_6.l1).tp().getImageView());
        C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "live_card_protocol", new C0ID1((C869590Y9l) awS50S0310000_6.l2, (ShareLiveCardAssem) awS50S0310000_6.l1, 2), false, null, (C869590Y9l) awS50S0310000_6.l2, null, 44);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS50S0310000_6 awS50S0310000_6) {
        MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS50S0310000_6.l0), MessageListQuotedMessageClickAbility.class, null);
        if (messageListQuotedMessageClickAbility != null) {
            messageListQuotedMessageClickAbility.lC1(((IMReplyLayoutInputAssem2) awS50S0310000_6.l0).LJJIJL(), ((C869590Y9l) awS50S0310000_6.l1).getMsgId(), Long.valueOf(((C869590Y9l) awS50S0310000_6.l1).getMsgType()), new C0I5R(Boolean.valueOf(awS50S0310000_6.z3), ((AwemeCardTemplate) awS50S0310000_6.l2).baseVideoComponent.id, String.valueOf(((C869590Y9l) awS50S0310000_6.l1).getSender()), ((C869590Y9l) awS50S0310000_6.l1).getScene(), false));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0310000_6(UrlModel urlModel, ShareLiveCardAssem shareLiveCardAssem, C869590Y9l c869590Y9l, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = urlModel;
        this.l1 = shareLiveCardAssem;
        this.l2 = c869590Y9l;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0310000_6(IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2, C869590Y9l c869590Y9l, AwemeCardTemplate awemeCardTemplate, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMReplyLayoutInputAssem2;
        this.l1 = c869590Y9l;
        this.l2 = awemeCardTemplate;
        this.z3 = z;
    }
}
