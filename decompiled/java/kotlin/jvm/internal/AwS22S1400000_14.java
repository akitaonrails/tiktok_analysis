package kotlin.jvm.internal;

import X.C09AY;
import X.C0I0B;
import X.C0ZL0;
import X.C0ZQI;
import X.C0ZRC;
import X.C0ZRE;
import X.C1389890mGx;
import X.C20684815ws;
import X.C458650Hyh;
import X.C830490Whz;
import X.C865340Xx6;
import X.C869590Y9l;
import X.C902560Zaw;
import X.InterfaceC863600XuI;
import android.view.View;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS22S1400000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS22S1400000_14 awS22S1400000_14, Object obj) {
        ((C865340Xx6) awS22S1400000_14.l1).LIZIZ.invoke(awS22S1400000_14.s0).LLILLJJLI((List) awS22S1400000_14.l2, (List) awS22S1400000_14.l3, (Boolean) awS22S1400000_14.l4, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS22S1400000_14 awS22S1400000_14, Object obj) {
        View view = (View) obj;
        C830490Whz c830490WhzLIZ = C458650Hyh.LIZ(new Pair("enter_from", "chat"), new Pair("conversation_id", ((SessionInfo) awS22S1400000_14.l1).getConversationId()), new Pair("chat_type", awS22S1400000_14.s0), new Pair("message_id", String.valueOf(((C869590Y9l) awS22S1400000_14.l2).getMsgId())));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_chat_copytext_btn_click", c830490WhzLIZ);
        C902560Zaw.LIZ(view.getContext(), ((C0ZRC) ((C0ZRE) awS22S1400000_14.l3)).LIZ.transcript);
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIIZ(2131831119);
        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
        c1389890mGx.LJII(R.attr.a1h);
        c1389890mGx.LJIIJJI();
        ((C0ZQI) awS22S1400000_14.l4).LJ(C0ZL0.VOICE_TRANSCRIBE_COPY, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS22S1400000_14(C865340Xx6 c865340Xx6, C865340Xx6 c865340Xx62, String str, List<String> list, List<String> list2, Boolean bool) {
        super(1);
        this.$t = bool;
        this.l1 = c865340Xx6;
        this.s0 = c865340Xx62;
        this.l2 = str;
        this.l3 = list;
        this.l4 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S1400000_14(SessionInfo sessionInfo, String str, C869590Y9l c869590Y9l, C0ZRE c0zre, C0ZQI c0zqi, int i) {
        super(1);
        this.$t = i;
        this.l1 = sessionInfo;
        this.s0 = str;
        this.l2 = c869590Y9l;
        this.l3 = c0zre;
        this.l4 = c0zqi;
    }
}
