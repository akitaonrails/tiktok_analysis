package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.assem;

import X.C019F;
import X.C055I;
import X.C06J5;
import X.C0JQJ;
import X.C1119920fFW;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C16F5;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2866019c;
import X.C497740JfY;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubscriptionEmoteUrl;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.vm.EmotePollStartVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class EmotePollEmptyAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public C0JQJ LLJJIII;
    public C16F5 LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EmotePollEmptyAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/poll/start/vm/EmotePollStartVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EmotePollEmptyAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmotePollStartVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055I(c19719912DlLIZ), new C06J5(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hne;
    }

    public final C0JQJ hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0JQJ.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0JQJ) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C500260Jjc.LJIILIIL(LJJIJL());
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06JJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C06JN) obj).LLILLL;
            }
        }, null, new C2866019c(), 6);
        this.LLJJIJI = (C16F5) view.findViewById(R.id.zjy);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C497740JfY.LJIJI(2131852069));
        sbLIZ.append(' ');
        String strLJIJJ = C497740JfY.LJIJJ(2131852068, C2188811AlT.LIZIZ(sbLIZ));
        String strLJIJI = C497740JfY.LJIJI(2131852069);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strLJIJJ);
        int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
        int length = strLJIJI.length() + iLJJJ;
        C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0JQ5
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view2) {
                long id;
                String secUid;
                String str;
                Room room;
                User owner;
                Room room2;
                Room room3;
                C495520Jby c495520Jby = new C495520Jby(LiveSubscriptionEmoteUrl.INSTANCE.getValue().getEmotePollResultListHalfScreen());
                C0JQJ c0jqjHp = this.LL.hp();
                long ownerUserId = 0;
                if (c0jqjHp != null && (room3 = c0jqjHp.LLILLJJLI) != null) {
                    id = room3.getId();
                } else {
                    id = 0;
                }
                c495520Jby.LIZIZ(id, "room_id");
                C0JQJ c0jqjHp2 = this.LL.hp();
                if (c0jqjHp2 != null && (room2 = c0jqjHp2.LLILLJJLI) != null) {
                    ownerUserId = room2.getOwnerUserId();
                }
                c495520Jby.LIZIZ(ownerUserId, "anchor_id");
                C0JQJ c0jqjHp3 = this.LL.hp();
                String str2 = "";
                if (c0jqjHp3 == null || (room = c0jqjHp3.LLILLJJLI) == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                    secUid = "";
                }
                c495520Jby.LIZJ("sec_anchor_id", secUid);
                C0JQJ c0jqjHp4 = this.LL.hp();
                if (c0jqjHp4 != null && (str = c0jqjHp4.LL) != null) {
                    str2 = str;
                }
                c495520Jby.LIZJ("show_entrance", str2);
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LL.getContext(), UriProtector.parse(c495520Jby.LIZLLL()));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(C20736316Cj.LIZJ(R.attr.ezq, this.LL.LLJJIJI));
                textPaint.setUnderlineText(false);
            }
        }, iLJJJ, length, 33);
        C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJJ, length, 33, 500);
        C16F5 c16f5 = this.LLJJIJI;
        if (c16f5 != null) {
            c16f5.setText(spannableStringBuilder);
        }
        C16F5 c16f52 = this.LLJJIJI;
        if (c16f52 != null) {
            c16f52.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
