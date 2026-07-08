package com.ss.android.ugc.aweme.msg;

import X.AbstractC2238408pq;
import X.C01GW;
import X.C0I0B;
import X.C0I6Y;
import X.C0PEM;
import X.C1559260qg8;
import X.C197039127h;
import X.C1DFH;
import X.C2107308Nj;
import X.C452501pT;
import X.C457780HxI;
import X.C461340I7g;
import X.C461360I7i;
import X.C461530I7z;
import X.C461720I8s;
import X.C462590ICb;
import X.C687700QyG;
import X.C723590SZx;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C898900ZOe;
import X.InterfaceC1146704e9;
import X.InterfaceC1320650kTH;
import X.InterfaceC1330440kj4;
import X.InterfaceC1587906Jp;
import X.InterfaceC461350I7h;
import X.InterfaceC461380I7k;
import X.InterfaceC497601wk;
import X.InterfaceC712990Rxx;
import X.InterfaceC900570ZUp;
import X.ViewTreeObserverOnGlobalLayoutListenerC462870IDd;
import Y.ACListenerS141S0100000_6;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.content.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS90S0210000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupInvitationCardAssem extends ReusedUISlotAssem<GroupInvitationCardAssem> implements InterfaceC712990Rxx<InterfaceC461350I7h>, InterfaceC497601wk, InterfaceC1146704e9 {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public boolean LLJLLL;
    public final C01GW LLJZ;
    public final AbstractC2238408pq LLJZIJLIL;
    public final C461340I7g LLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cji;
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

    public final C197039127h sp() {
        return (C197039127h) this.LLJLLIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0I7g] */
    public GroupInvitationCardAssem() {
        checkSupervisorPrepared();
        new C723590SZx(this, C898900ZOe.class, null);
        this.LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 483));
        this.LLJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 486));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 488));
        this.LLJLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 487));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 484));
        this.LLJZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 485));
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJZIJLIL = C2107308Nj.LIZ;
        this.LLL = new InterfaceC1320650kTH<InterfaceC1330440kj4>() { // from class: X.0I7g
            @Override // X.InterfaceC1320650kTH
            public final void LIZ(String str, Throwable th) {
            }

            @Override // X.InterfaceC1320650kTH
            public final void LIZIZ(String str) {
            }

            @Override // X.InterfaceC1320650kTH
            public final void LIZLLL(String str, Throwable th) {
                this.LIZ.getClass();
            }

            @Override // X.InterfaceC1320650kTH
            public final void LJFF(Object obj, String str) {
                this.LIZ.getClass();
            }

            @Override // X.InterfaceC1320650kTH
            public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str) {
            }

            @Override // X.InterfaceC1320650kTH
            public final void LJ(String str, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
                this.LIZ.getClass();
            }
        };
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLJZIJLIL;
    }

    public static void op(GroupInvitationCardAssem groupInvitationCardAssem) {
        Object obj;
        boolean z;
        C724270Sb3 c724270Sb3 = groupInvitationCardAssem.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        GroupInviteCardContent groupInviteCardContent = (GroupInviteCardContent) BaseContentParserKt.getOrParseJsonContent(C0I6Y.LIZ((InterfaceC461380I7k) obj), GroupInviteCardContent.class);
        C724270Sb3 c724270Sb32 = groupInvitationCardAssem.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        if (C0I6Y.LIZ((InterfaceC461380I7k) obj2).getSender() == C461720I8s.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        groupInvitationCardAssem.getClass();
        groupInvitationCardAssem.getClass();
        AwS90S0210000_6 awS90S0210000_6 = new AwS90S0210000_6(groupInvitationCardAssem, groupInviteCardContent, z, 0);
        groupInvitationCardAssem.getClass();
        awS90S0210000_6.invoke();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.U8(sp(), new ACListenerS141S0100000_6(this, 49));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC461350I7h interfaceC461350I7h) {
        C786410Ut5.x3(((View) this.LLJLILLLLZIIL.getValue()).getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC462870IDd(this, 2));
        op(this);
        ((View) this.LLJL.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC461350I7h.LIZJ(), LJJIJL()));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC461350I7h interfaceC461350I7h) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC461350I7h interfaceC461350I7h) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        IMGroupChatApi iMGroupChatApiLIZ;
        InterfaceC900570ZUp interfaceC900570ZUpLJJIIZI;
        C461360I7i c461360I7i;
        InterfaceC461350I7h interfaceC461350I7h = (InterfaceC461350I7h) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            C786410Ut5.x3(((View) this.LLJLILLLLZIIL.getValue()).getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC462870IDd(this, 2));
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C461360I7i) && (c461360I7i = (C461360I7i) obj2) != null) {
                    if (c461360I7i.LIZ) {
                        op(this);
                    }
                    if (c461360I7i.LIZIZ) {
                        ((View) this.LLJL.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC461350I7h.LIZJ(), LJJIJL()));
                    }
                }
            }
        } else {
            C786410Ut5.x3(((View) this.LLJLILLLLZIIL.getValue()).getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC462870IDd(this, 2));
            op(this);
            ((View) this.LLJL.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC461350I7h.LIZJ(), LJJIJL()));
        }
        if (!this.LLJLLL) {
            this.LLJLLL = true;
            GroupInviteCardContent groupInviteCardContent = (GroupInviteCardContent) BaseContentParserKt.getOrParseJsonContent(C0I6Y.LIZ(interfaceC461350I7h), GroupInviteCardContent.class);
            if (groupInviteCardContent != null && (iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ()) != null && (interfaceC900570ZUpLJJIIZI = iMGroupChatApiLIZ.LJJIIZI()) != null) {
                interfaceC900570ZUpLJJIIZI.LIZIZ(((C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue()).LL, groupInviteCardContent, C0I0B.LJFF.LIZIZ());
            }
        }
    }
}
