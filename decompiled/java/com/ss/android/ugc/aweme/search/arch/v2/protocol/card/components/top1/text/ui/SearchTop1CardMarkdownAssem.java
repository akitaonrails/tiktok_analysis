package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.text.ui;

import X.C01GW;
import X.C07E5;
import X.C1295960jpS;
import X.C1558520qew;
import X.C1559260qg8;
import X.C427690Gpr;
import X.C431730GwN;
import X.C435410H5n;
import X.C452501pT;
import X.C723580SZw;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC431710GwL;
import X.EnumC435440H5q;
import X.InterfaceC1587906Jp;
import X.InterfaceC655050Pmh;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchUIComponentScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Top1CardText$Top1CardTextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS554S0100000_10;
import wh6.AbS688S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchTop1CardMarkdownAssem extends ReusedUISlotAssem<SearchTop1CardMarkdownAssem> implements InterfaceC712990Rxx<InterfaceC655050Pmh>, SearchComponentCenter$Top1CardText$Top1CardTextAbility {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C435410H5n.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 544));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 542));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 543));
    public final String LLJLL = "";
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 274));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ev9;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1558520qew.LJI(this, SearchUIComponentScope.class, this, SearchComponentCenter$Top1CardText$Top1CardTextAbility.class, null, null);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C435410H5n op() {
        return (C435410H5n) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C431730GwN sp() {
        return (C431730GwN) this.LLJL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        CharSequence text;
        EnumC431710GwL enumC431710GwL;
        String str;
        EnumC435440H5q enumC435440H5q;
        EnumC435440H5q enumC435440H5q2;
        C435410H5n c435410H5nOp = op();
        if (c435410H5nOp != null && (enumC435440H5q2 = c435410H5nOp.LL) != null) {
            enumC435440H5q2.getLines();
        }
        C431730GwN c431730GwNSp = sp();
        C435410H5n c435410H5nOp2 = op();
        if (c435410H5nOp2 != null && (enumC435440H5q = c435410H5nOp2.LL) != null) {
            sp().setShowMaxLines(enumC435440H5q.getLines());
            C435410H5n c435410H5nOp3 = op();
            if (c435410H5nOp3 != null) {
                c435410H5nOp3.LL = enumC435440H5q;
            }
        }
        C435410H5n c435410H5nOp4 = op();
        if (c435410H5nOp4 != null && (enumC431710GwL = c435410H5nOp4.LLILLJJLI) != null) {
            c431730GwNSp.setTruncateType(enumC431710GwL);
            if (enumC431710GwL == EnumC431710GwL.CUSTOM) {
                C435410H5n c435410H5nOp5 = op();
                if (c435410H5nOp5 != null && (str = c435410H5nOp5.LLJ) != null) {
                    c431730GwNSp.setCustomTruncateText(str);
                }
                C435410H5n c435410H5nOp6 = op();
                if (c435410H5nOp6 != null) {
                    c431730GwNSp.setCustomShowTruncateIcon(c435410H5nOp6.LLIZLLLIL);
                }
            }
        }
        c431730GwNSp.setEnableToggleAction(true);
        C1295960jpS c1295960jpS = (C1295960jpS) this.LLJLIL.getValue();
        Context context = c1295960jpS.getContext();
        if (context != null && C960203pA.LIZIZ(context)) {
            c1295960jpS.setAnimation("search_tako_dots_loading_darkmode_tux_lottie.json");
        } else {
            c1295960jpS.setAnimation("search_tako_dots_loading_lightmode_tux_lottie.json");
        }
        c1295960jpS.setRepeatCount(-1);
        c1295960jpS.setRepeatMode(1);
        C786410Ut5.I7(new AbS688S0100000_6(this, 4), sp());
        C427690Gpr.LJ(getContentView(), 0.0f);
        TextView textView = (TextView) this.LLJLILLLLZIIL.getValue();
        Context context2 = getContext();
        if (context2 != null) {
            text = context2.getText(2131836096);
        } else {
            text = null;
        }
        textView.setText(text);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC655050Pmh interfaceC655050Pmh) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC655050Pmh interfaceC655050Pmh) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC655050Pmh interfaceC655050Pmh) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
