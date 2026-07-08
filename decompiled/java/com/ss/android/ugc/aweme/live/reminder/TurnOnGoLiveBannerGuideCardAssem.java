package com.ss.android.ugc.aweme.live.reminder;

import X.C003C;
import X.C01GW;
import X.C0I73;
import X.C0PEM;
import X.C1559260qg8;
import X.C1684506ih;
import X.C1709906mn;
import X.C197039127h;
import X.C23250099c;
import X.C384050F3z;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS546S0100000_2;
import wh6.AbS686S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class TurnOnGoLiveBannerGuideCardAssem extends ReusedUISlotAssem<TurnOnGoLiveBannerGuideCardAssem> implements InterfaceC712990Rxx<C003C>, InterfaceC1146704e9 {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 666));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 662));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 665));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 667));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 664));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 663));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 668));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cr4;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void op() {
        SessionInfo sessionInfo;
        C457780HxI c457780HxI = (C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null) {
            return;
        }
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZJ = "turn_on_go_live_notification_guide_card_fake_msg_uuid";
        c1684506ih.LIZLLL(54);
        c1684506ih.LIZJ(getContext());
        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
        if (fakeMsgOperatorService != null) {
            fakeMsgOperatorService.LIZ(sessionInfo.getConversationId(), c1684506ih, sessionInfo.getUuid(), null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        String string;
        String string2;
        String string3;
        if (this.LLJLIL.getValue() != null) {
            View view2 = (View) this.LLJLIL.getValue();
            if (view2 != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
                c384050F3z.LIZJ = Float.valueOf(C0I73.LIZ);
                view2.setBackground(c384050F3z.LIZ(view.getContext()));
            }
            C197039127h c197039127h = (C197039127h) this.LLJZ.getValue();
            if (c197039127h != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zm);
                c384050F3z2.LIZJ = Float.valueOf(C0I73.LIZ);
                c197039127h.setBackground(c384050F3z2.LIZ(view.getContext()));
            }
            View view3 = (View) this.LLJLLL.getValue();
            if (view3 != null) {
                C384050F3z c384050F3z3 = new C384050F3z();
                c384050F3z3.LIZIZ = Integer.valueOf(R.attr.zm);
                c384050F3z3.LIZJ = Float.valueOf(C0I73.LIZ);
                view3.setBackground(c384050F3z3.LIZ(view.getContext()));
            }
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLJLILLLLZIIL.getValue();
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_bitmap_horn);
        }
        TextView textView = (TextView) this.LLJLL.getValue();
        if (textView != null) {
            Context context = getContext();
            if (context != null) {
                string3 = context.getString(2131847339);
            } else {
                string3 = null;
            }
            textView.setText(string3);
        }
        TextView textView2 = (TextView) this.LLJLLIL.getValue();
        if (textView2 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                string2 = context2.getString(2131847337);
            } else {
                string2 = null;
            }
            textView2.setText(string2);
        }
        TextView textView3 = (TextView) this.LLJZ.getValue();
        if (textView3 != null) {
            Context context3 = getContext();
            if (context3 != null) {
                string = context3.getString(2131847336);
            } else {
                string = null;
            }
            textView3.setText(string);
        }
        View view4 = (View) this.LLJLLL.getValue();
        if (view4 != null) {
            C786410Ut5.I7(new AbS686S0100000_2(this, 5), view4);
        }
        View view5 = (View) this.LLJZ.getValue();
        if (view5 != null) {
            C786410Ut5.I7(new AbS686S0100000_2(this, 6), view5);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1709906mn(this, null), 2);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C003C c003c) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C003C c003c) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C003C c003c) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
