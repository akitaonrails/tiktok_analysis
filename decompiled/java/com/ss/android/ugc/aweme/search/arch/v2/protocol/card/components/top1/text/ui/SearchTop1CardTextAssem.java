package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.text.ui;

import X.C01GW;
import X.C07E5;
import X.C1295960jpS;
import X.C1558520qew;
import X.C1559260qg8;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C431640GwE;
import X.C435410H5n;
import X.C452501pT;
import X.C467860IWi;
import X.C723580SZw;
import X.C786410Ut5;
import X.EnumC431710GwL;
import X.EnumC435440H5q;
import X.InterfaceC1587906Jp;
import X.InterfaceC655050Pmh;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchUIComponentScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Top1CardText$Top1CardTextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import wh6.AbS688S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchTop1CardTextAssem extends ReusedUISlotAssem<SearchTop1CardTextAssem> implements InterfaceC712990Rxx<InterfaceC655050Pmh>, SearchComponentCenter$Top1CardText$Top1CardTextAbility {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(120));
    public final C1559260qg8 LLJL = new C1559260qg8(new C723580SZw(this, C435410H5n.class, null), checkSupervisorPrepared());
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 548));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 546));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 549));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 545));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 547));
    public final String LLJZ;
    public final String LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eva;
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
        return (C435410H5n) this.LLJL.getValue();
    }

    public SearchTop1CardTextAssem() {
        C418440Gaw.LIZIZ(20);
        C418440Gaw.LIZIZ(4);
        this.LLJZ = "";
        this.LLJZIJLIL = "";
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
        C431640GwE c431640GwE = (C431640GwE) this.LLJLIL.getValue();
        C435410H5n c435410H5nOp2 = op();
        if (c435410H5nOp2 != null && (enumC435440H5q = c435410H5nOp2.LL) != null) {
            c431640GwE.setShowMaxLines(enumC435440H5q.getLines());
        }
        c431640GwE.setLineSpacing(0.0f, 1.3f);
        C435410H5n c435410H5nOp3 = op();
        if (c435410H5nOp3 != null && (enumC431710GwL = c435410H5nOp3.LLILLJJLI) != null) {
            c431640GwE.setTruncateType(enumC431710GwL);
            if (enumC431710GwL == EnumC431710GwL.CUSTOM) {
                C435410H5n c435410H5nOp4 = op();
                if (c435410H5nOp4 != null && (str = c435410H5nOp4.LLJ) != null) {
                    c431640GwE.setCustomTruncateText(str);
                }
                C435410H5n c435410H5nOp5 = op();
                if (c435410H5nOp5 != null) {
                    c431640GwE.setCustomShowTruncateIcon(c435410H5nOp5.LLIZLLLIL);
                }
            }
        }
        c431640GwE.setBackground((Drawable) this.LLJLILLLLZIIL.getValue());
        C1295960jpS c1295960jpS = (C1295960jpS) this.LLJLLIL.getValue();
        if (C467860IWi.LIZ(c1295960jpS.getContext())) {
            c1295960jpS.setAnimation("search_tako_dots_loading_darkmode_tux_lottie.json");
        } else {
            c1295960jpS.setAnimation("search_tako_dots_loading_lightmode_tux_lottie.json");
        }
        c1295960jpS.setRepeatCount(-1);
        c1295960jpS.setRepeatMode(1);
        C786410Ut5.I7(new AbS688S0100000_6(this, 5), getContentView());
        C427690Gpr.LJ(getContentView(), 0.0f);
        TextView textView = (TextView) this.LLJLLL.getValue();
        Context context = getContext();
        if (context != null) {
            text = context.getText(2131836096);
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
