package com.ss.android.ugc.aweme.im.b2c.card;

import X.C01GW;
import X.C0ZRY;
import X.C0ZRZ;
import X.C419910GdJ;
import X.C452501pT;
import X.C461530I7z;
import X.C687700QyG;
import X.C723590SZx;
import X.C786410Ut5;
import X.C898900ZOe;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ACListenerS149S0100000_14;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class BrandInvitationReusedUISlot extends ReusedUISlotAssem<BrandInvitationReusedUISlot> implements InterfaceC712990Rxx<C0ZRY>, InterfaceC1146704e9 {
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cl6;
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

    public BrandInvitationReusedUISlot() {
        checkSupervisorPrepared();
        new C723590SZx(this, C898900ZOe.class, null);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 220));
        this.LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 221));
        this.LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 224));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 222));
        this.LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 219));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 223));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView = (TuxIconView) this.LLJL.getValue();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_dollar_sign;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        tuxIconView.setTuxIcon(c419910GdJ);
        C786410Ut5.K7((ViewGroup) this.LLJJLIIIJLLLLLLLZ.getValue(), new ACListenerS149S0100000_14(this, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0191  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: op, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C0ZRY r16) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b2c.card.BrandInvitationReusedUISlot.up(X.0ZRY):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZRY c0zry) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZRY c0zry) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0ZRZ c0zrz;
        C0ZRY c0zry = (C0ZRY) interfaceC1587906Jp;
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
                if ((obj2 instanceof C0ZRZ) && (c0zrz = (C0ZRZ) obj2) != null && c0zrz.LIZ) {
                    up(c0zry);
                }
            }
            return;
        }
        up(c0zry);
    }
}
