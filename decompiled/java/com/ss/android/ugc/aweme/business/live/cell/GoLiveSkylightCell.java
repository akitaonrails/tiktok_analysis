package com.ss.android.ugc.aweme.business.live.cell;

import X.C01GW;
import X.C1595990rdN;
import X.C1596560reI;
import X.C1605320rsQ;
import X.C1607400rvm;
import X.C1608320rxG;
import X.C2097608Jq;
import X.C427660Gpo;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.C994000byQ;
import X.EnumC1605560rso;
import X.EnumC1606080rte;
import X.InterfaceC1605330rsR;
import X.InterfaceC1891350zJl;
import Y.ACListenerS158S0100000_24;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS44S2100000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class GoLiveSkylightCell extends BaseSkylightCell<C1595990rdN> implements InterfaceC1605330rsR {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 193));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 196));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 194));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 195));

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", "homepage_follow"), new Pair("head_type", "go_live"));
    }

    @Override // X.InterfaceC1605330rsR
    public final String getAuthorId() {
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.c7_;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell
    public final View Hy1() {
        return (View) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC1605330rsR
    public final String getEnterFrom() {
        ISkylightListAbility iSkylightListAbility = (ISkylightListAbility) this.LLILZIL.getValue();
        return C1596560reI.LIZIZ(iSkylightListAbility != null ? iSkylightListAbility.uH2() : 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final User N5() {
        C1595990rdN c1595990rdN = (C1595990rdN) getItem();
        if (c1595990rdN != null) {
            return c1595990rdN.LL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ISkylightListAbility iSkylightListAbility = (ISkylightListAbility) this.LLILZIL.getValue();
        if (iSkylightListAbility != null) {
            iSkylightListAbility.kf1((TuxTextView) this.LLILLL.getValue());
        }
        C1605320rsQ.LIZ(this, this);
        C1607400rvm.LIZIZ.LJ(EnumC1606080rte.FYP_SKYLIGHT, new C1608320rxG(this.itemView, (View) null, (View) this.LLILLJJLI.getValue(), (View) this.LLILLL.getValue(), (TuxIconView) this.LLILZ.getValue(), 34), false);
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final EnumC1605560rso I5() {
        return EnumC1605560rso.GO_LIVE;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        return this.itemView;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View R5() {
        return this.itemView;
    }

    public final void U5(String str) {
        String str2;
        ISkylightListAbility iSkylightListAbility = (ISkylightListAbility) this.LLILZIL.getValue();
        if (iSkylightListAbility != null && iSkylightListAbility.ry0()) {
            str2 = "first_screen";
        } else {
            str2 = "slide_into_screen";
        }
        C994000byQ.LIZIZ(str, new AwS44S2100000_24(str2, this, str, 0));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1595990rdN c1595990rdN = (C1595990rdN) interfaceC1891350zJl;
        super.onBindItemView(c1595990rdN);
        C427660Gpo.LJIIJJI((C427660Gpo) this.LLILLJJLI.getValue(), C438710HIf.LIZ(c1595990rdN.LL.getAvatarThumb()), false, null, null, false, false, null, null, false, null, 1022);
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 107), this.itemView);
        U5("livesdk_live_entrance_show");
    }
}
