package com.ss.android.ugc.aweme.im.sdk.chat.ui.unified;

import X.C01GW;
import X.C0ZV7;
import X.C0ZV8;
import X.C1383370m6R;
import X.C1559260qg8;
import X.C452501pT;
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
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutLL;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class UnifiedSimpleShareUISlot extends ReusedUISlotAssem<UnifiedSimpleShareUISlot> implements InterfaceC712990Rxx<C0ZV7>, InterfaceC1146704e9 {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 938));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 941));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 942));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 945));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 939));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 944));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 937));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 940));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 943));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cm6;
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

    public final SmartImageView tp() {
        return (SmartImageView) this.LLJLIL.getValue();
    }

    public final TuxIconView up() {
        return (TuxIconView) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById = ((View) this.LLJL.getValue()).findViewById(R.id.dg4);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(C1383370m6R.LJFF(R.attr.a03));
        }
        ((View) this.LLJZ.getValue()).setBackgroundColor(C1383370m6R.LJFF(R.attr.a03));
        C786410Ut5.Oa((RoundingCornerLayoutLL) this.LLJL.getValue(), new ACListenerS149S0100000_14(this, 34));
        C461640I8k.LIZ.LIZ(((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLL, (View) this.LLJL.getValue());
    }

    public final void op(C0ZV7 c0zv7) {
        ((RoundingCornerLayoutLL) this.LLJL.getValue()).setRoundingParams(c0zv7.LIZJ().LIZ);
        ((View) this.LLJL.getValue()).setBackground(C462590ICb.LIZIZ(c0zv7.LIZJ(), LJJIJL()));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0ZV7 c0zv7) {
        C0ZV7 c0zv72 = c0zv7;
        op(c0zv72);
        sp(c0zv72);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(X.C0ZV7 r14) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.unified.UnifiedSimpleShareUISlot.sp(X.0ZV7):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZV7 c0zv7) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZV7 c0zv7) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0ZV8 c0zv8;
        C0ZV7 c0zv7 = (C0ZV7) interfaceC1587906Jp;
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
                if ((obj2 instanceof C0ZV8) && (c0zv8 = (C0ZV8) obj2) != null) {
                    if (c0zv8.LIZIZ) {
                        op(c0zv7);
                    }
                    if (c0zv8.LIZ) {
                        sp(c0zv7);
                    }
                }
            }
            return;
        }
        op(c0zv7);
        sp(c0zv7);
    }
}
