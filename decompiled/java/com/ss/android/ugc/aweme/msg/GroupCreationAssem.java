package com.ss.android.ugc.aweme.msg;

import X.AbstractC879060Ye8;
import X.C019F;
import X.C01GW;
import X.C0Y8T;
import X.C0YSQ;
import X.C0Z6T;
import X.C0ZHB;
import X.C0ZK1;
import X.C0ZKF;
import X.C0ZQ4;
import X.C1322110kVd;
import X.C1383370m6R;
import X.C13LE;
import X.C1460405ne;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1727806pg;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C457780HxI;
import X.C461720I8s;
import X.C723590SZx;
import X.C723830SaL;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C899260ZPo;
import X.C913140Zs0;
import X.C913630Zsn;
import X.EnumC899300ZPs;
import X.InterfaceC1587906Jp;
import X.InterfaceC1693006k4;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.InterfaceC876950Yaj;
import X.RunnableC297301Df;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.group.MockedConvVM;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import wh6.AbS695S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupCreationAssem extends ReusedUISlotAssem<GroupCreationAssem> implements InterfaceC712990Rxx<C0ZQ4> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1083));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1084));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1082));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1081));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1078));
    public final AssemVMLazy LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupCreationAssem.class, "mockedConvVM", "getMockedConvVM()Lcom/ss/android/ugc/aweme/group/MockedConvVM;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupCreationAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MockedConvVM.class);
        this.LLJLLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 1086), AFwS248S0000000_14.get$arr$(307), null, true);
        this.LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1085));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1079));
        this.LLL = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(284));
        this.LLLF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1080));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.chz;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        ((AbstractC879060Ye8) this.LLJZIJLIL.getValue()).LJIILLIIL((C899260ZPo) this.LLLF.getValue());
    }

    public final MockedConvVM sp() {
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        return (MockedConvVM) assemVMLazy.getValue();
    }

    public final SessionInfo tp() {
        return ((C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue()).LL;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        ((AbstractC879060Ye8) this.LLJZIJLIL.getValue()).LJIILLIIL((C899260ZPo) this.LLLF.getValue());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int i;
        View view2 = (View) this.LLJLL.getValue();
        if (up(tp().getConversationId())) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view2);
        C723830SaL.LIZ(this, null, new AwS380S0200000_14(view, this, 60));
        view.setTag(R.id.k__, C0ZHB.LAST_ITEM_FILL_BOTTOM);
    }

    public final boolean op(String str) {
        return ((C0Z6T) this.LLL.getValue()).LJIIIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(C0ZQ4 c0zq4) {
        if (tp() instanceof C913140Zs0) {
            yp(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(tp().getConversationId()));
        }
        ((AbstractC879060Ye8) this.LLJZIJLIL.getValue()).LJIIJJI((C899260ZPo) this.LLLF.getValue());
    }

    public final boolean up(String str) {
        InterfaceC1693006k4 interfaceC1693006k4;
        EnumC899300ZPs state;
        if (((C0Z6T) this.LLL.getValue()).LJIIIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str)) || ((interfaceC1693006k4 = (InterfaceC1693006k4) this.LLJZ.getValue()) != null && (state = interfaceC1693006k4.getState()) != null && state.isLoadingOrPreview())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZQ4 c0zq4) {
        return true;
    }

    public final void yp(C0Y8T c0y8t) {
        String strLJIILLIIL;
        String strLJIIJ;
        int i;
        C0Z6T c0z6t = (C0Z6T) this.LLL.getValue();
        if (c0z6t != null) {
            strLJIILLIIL = c0z6t.LJIILLIIL(c0y8t);
        } else {
            strLJIILLIIL = null;
        }
        if (c0y8t != null && C913630Zsn.LJIIJJI.LJJIJIL(c0y8t)) {
            C1460405ne c1460405ne = C1460405ne.LIZ;
            Context context = LJJIJL().getContext();
            String conversationId = tp().getConversationId();
            C1322110kVd c1322110kVd = (C1322110kVd) this.LLJL.getValue();
            List<Long> memberIds = c0y8t.getMemberIds();
            ArrayList arrayList = new ArrayList();
            Iterator<Long> it2 = memberIds.iterator();
            while (it2.hasNext()) {
                String string = it2.next().toString();
                if (string != null) {
                    arrayList.add(string);
                }
            }
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            c1460405ne.getClass();
            C1460405ne.LIZLLL(context, conversationId, c1322110kVd, arrayList, lifecycleScope);
        } else {
            ((IDMAvatarLoader) this.LLJLLIL.getValue()).LIZLLL(tp().getConversationId(), strLJIILLIIL, null, new C0ZKF(0, 0, 0, 0, 0, new C0ZK1() { // from class: X.0ZPk
                @Override // X.C0ZK1
                public final void LIZ() {
                }

                @Override // X.C0ZK1
                public final void LIZIZ() {
                }

                @Override // X.C0ZK1
                public final void LIZJ(int i2, String str, boolean z) {
                    C1331070kk5 c1331070kk5 = (C1331070kk5) ((C1322090kVb) this.LIZ.LLJL.getValue()).getHierarchy();
                    if (c1331070kk5 != null) {
                        c1331070kk5.LJIJ(null, 1);
                    }
                }
            }, 95));
        }
        C786410Ut5.I7(new AbS695S0100000_14(this, 12), (View) this.LLJL.getValue());
        C0Z6T c0z6t2 = (C0Z6T) this.LLL.getValue();
        if (c0z6t2 == null || (strLJIIJ = c0z6t2.LJIIJ(c0y8t)) == null) {
            strLJIIJ = "";
        }
        TuxTextView tuxTextView = (TuxTextView) this.LLJLIL.getValue();
        tuxTextView.setText(strLJIIJ);
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(tuxTextView, new RunnableC297301Df(tuxTextView, tuxTextView, strLJIIJ));
        View view = (View) this.LLJLILLLLZIIL.getValue();
        int i2 = 0;
        if (C1727806pg.LIZ.LIZ("group_chat_edit_group_info", tp().getConversationId(), C461720I8s.LIZIZ(), false) && op(tp().getConversationId())) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        if (((View) this.LLJLILLLLZIIL.getValue()).getVisibility() == 0) {
            TextView textView = (TextView) this.LLJLILLLLZIIL.getValue();
            textView.setText(C1383370m6R.LJIIJ(2131831352));
            C786410Ut5.I7(new AbS695S0100000_14(this, 13), textView);
        }
        View view2 = (View) this.LLJLL.getValue();
        if (!up(tp().getConversationId())) {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view2);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZQ4 c0zq4) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }
}
