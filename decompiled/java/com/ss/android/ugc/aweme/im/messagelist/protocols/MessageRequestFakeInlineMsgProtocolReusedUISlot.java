package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.C0I0B;
import X.C1558520qew;
import X.C1896007bi;
import X.C20684815ws;
import X.C2188811AlT;
import X.C431260Gvc;
import X.C444940Hca;
import X.C888640Yta;
import X.C890330YwJ;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestFakeInlineMsgProtocolReusedUISlot extends ReusedUISlotAssem<MessageRequestFakeInlineMsgProtocolReusedUISlot> implements InterfaceC712990Rxx<C1896007bi> {
    public C888640Yta LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.clb;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostDestroy, hasRecord = ");
        sbLIZ.append(this.LLJL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJL) {
            return;
        }
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJIILJJIL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        Function0<Unit> function0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostResume, messageRequestPromptInfo = ");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C888640Yta c888640Yta = this.LLJJLIIIJLLLLLLLZ;
        if (c888640Yta != null && (function0 = c888640Yta.LJFF) != null) {
            function0.invoke();
        }
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) throws IllegalAccessException {
        TextView textView;
        Context context;
        String string;
        Context context2;
        String string2;
        C1558520qew.LIZLLL(this);
        View contentView = getContentView();
        if ((contentView instanceof TuxTextView) && (textView = (TextView) contentView) != null && (context = getContext()) != null && (string = context.getString(2131837225)) != null && (context2 = getContext()) != null && (string2 = context2.getString(2131837224)) != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int iLJJJ = a0.LJJJ(string, "%1$s", 0, false, 6);
            if (iLJJJ != -1) {
                C444940Hca c444940Hca = new C444940Hca();
                c444940Hca.LIZIZ(71);
                c444940Hca.LIZIZ = false;
                c444940Hca.LIZLLL(5);
                c444940Hca.LIZJ = string2;
                c444940Hca.LJIIIIZZ = new AwS558S0100000_14(this, 532);
                spannableStringBuilder.replace(iLJJJ, iLJJJ + 4, c444940Hca.LIZ(getContentView().getContext()));
            }
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(C431260Gvc.LIZ);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("conversation_id", ((C1896007bi) bo()).LL);
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("ttsocial_message_request_guide_inline_show", linkedHashMap);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1896007bi c1896007bi) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C1896007bi c1896007bi) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1896007bi c1896007bi) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
