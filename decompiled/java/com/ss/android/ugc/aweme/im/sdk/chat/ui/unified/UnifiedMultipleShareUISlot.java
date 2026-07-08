package com.ss.android.ugc.aweme.im.sdk.chat.ui.unified;

import X.C01GW;
import X.C0ZV4;
import X.C0ZV5;
import X.C1509305vX;
import X.C1559260qg8;
import X.C461530I7z;
import X.C461640I8k;
import X.C462590ICb;
import X.C687700QyG;
import X.C723590SZx;
import X.C786410Ut5;
import X.C898900ZOe;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ACListenerS149S0100000_14;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutLL;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class UnifiedMultipleShareUISlot extends ReusedUISlotAssem<UnifiedMultipleShareUISlot> implements InterfaceC712990Rxx<C0ZV4>, InterfaceC1146704e9 {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C1509305vX.LIZ(new AwS558S0100000_14(this, 929));
    public final C01GW LLJLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 932));
    public final C01GW LLJLILLLLZIIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 933));
    public final C01GW LLJLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 934));
    public final C01GW LLJLLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 936));
    public final C01GW LLJLLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 930));
    public final C01GW LLJZ = C1509305vX.LIZ(new AwS558S0100000_14(this, 931));
    public final C01GW LLJZIJLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 935));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cm1;
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

    public final TuxIconView tp() {
        return (TuxIconView) this.LLJZ.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C461640I8k.LIZ.LIZ(((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLL, (View) this.LLJL.getValue());
        C786410Ut5.Oa((RoundingCornerLayoutLL) this.LLJL.getValue(), new ACListenerS149S0100000_14(this, 33));
    }

    public final void op(C0ZV4 c0zv4) {
        ((RoundingCornerLayoutLL) this.LLJL.getValue()).setRoundingParams(c0zv4.LIZJ().LIZ);
        ((View) this.LLJL.getValue()).setBackground(C462590ICb.LIZIZ(c0zv4.LIZJ(), LJJIJL()));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0ZV4 c0zv4) {
        C0ZV4 c0zv42 = c0zv4;
        op(c0zv42);
        sp(c0zv42);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(X.C0ZV4 r19) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.unified.UnifiedMultipleShareUISlot.sp(X.0ZV4):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZV4 c0zv4) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZV4 c0zv4) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0ZV5 c0zv5;
        C0ZV4 c0zv4 = (C0ZV4) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C0ZV5) && (c0zv5 = (C0ZV5) obj2) != null) {
                    if (c0zv5.LIZIZ) {
                        op(c0zv4);
                    }
                    if (c0zv5.LIZ) {
                        sp(c0zv4);
                    }
                }
            }
            return;
        }
        op(c0zv4);
        sp(c0zv4);
    }
}
