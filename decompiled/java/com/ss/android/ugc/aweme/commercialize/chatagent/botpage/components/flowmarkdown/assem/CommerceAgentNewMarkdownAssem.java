package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.components.flowmarkdown.assem;

import X.C01GW;
import X.C0DIA;
import X.C1308910kAL;
import X.C2142108aJ;
import X.C328660CuW;
import X.C444890HcV;
import X.C452501pT;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentNewMarkdownAssem extends ReusedUISlotAssem<CommerceAgentNewMarkdownAssem> implements InterfaceC712990Rxx<C0DIA> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 61));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 62));
    public C328660CuW LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public FrameLayout LLJLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ajs;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        String str;
        C328660CuW c328660CuW = this.LLJLIL;
        if (c328660CuW != null) {
            C01GW c01gw = C2142108aJ.LIZ;
            Message message = c328660CuW.LLJJL;
            if (message == null || (str = message.uuid) == null) {
                str = "";
            }
            C2142108aJ.LIZIZ(str);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        View contentView = getContentView();
        if ((contentView instanceof ViewGroup) && contentView != null) {
            contentView.setTag(R.id.o0o, null);
        }
        C328660CuW c328660CuW = this.LLJLIL;
        if (c328660CuW != null) {
            c328660CuW.LJJJJI();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.w8k);
        this.LLJLL = (FrameLayout) view.findViewById(R.id.erv);
        C328660CuW c328660CuW = (C328660CuW) view.findViewById(R.id.ef_);
        this.LLJLIL = c328660CuW;
        if (c328660CuW != null) {
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.LIZ(51);
            c328660CuW.getPaint().setTextSize(c444890HcV.getTextSize());
            c328660CuW.getPaint().setTypeface(c444890HcV.getTypeface());
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.agr, new ContextThemeWrapper(c328660CuW.getContext(), R.style.y0));
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c328660CuW.setTextColor(iIntValue);
        }
        CommerceAgentCardAbility commerceAgentCardAbility = (CommerceAgentCardAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (commerceAgentCardAbility != null) {
            commerceAgentCardAbility.hw(this.LLJLIL);
        }
        C328660CuW c328660CuW2 = this.LLJLIL;
        if (c328660CuW2 != null) {
            ViewGroup.LayoutParams layoutParams = c328660CuW2.getLayoutParams();
            layoutParams.width = -2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c328660CuW2);
            c328660CuW2.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x035a  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C0DIA r24) {
        /*
            Method dump skipped, instruction units count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.chatagent.botpage.components.flowmarkdown.assem.CommerceAgentNewMarkdownAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0DIA c0dia) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0DIA c0dia) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
