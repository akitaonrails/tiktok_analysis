package com.ss.android.ugc.aweme.im.sdk.chat.ui.comment;

import X.C01GW;
import X.C0I73;
import X.C1559260qg8;
import X.C384050F3z;
import X.C426750GoL;
import X.C452501pT;
import X.C461530I7z;
import X.C461570I8d;
import X.C461640I8k;
import X.C687700QyG;
import X.C723590SZx;
import X.C786410Ut5;
import X.C898900ZOe;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC461580I8e;
import X.InterfaceC712990Rxx;
import Y.ACListenerS141S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareCommentTemplateReusedUISlot extends ReusedUISlotAssem<ShareCommentTemplateReusedUISlot> implements InterfaceC712990Rxx<InterfaceC461580I8e>, InterfaceC1146704e9 {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.clx;
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

    public ShareCommentTemplateReusedUISlot() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 316));
        this.LLJLIL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 314));
        this.LLJLILLLLZIIL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 315));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C461640I8k.LIZ.LIZ(((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLL, (View) this.LLJL.getValue());
        C426750GoL.LIZLLL(LJJIJL().getContext());
        float f = C0I73.LIZ;
        View view2 = (View) this.LLJL.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJIIIIZZ = Float.valueOf(f);
        c384050F3z.LJIIIZ = Float.valueOf(f);
        c384050F3z.LJIIJ = Float.valueOf(f);
        c384050F3z.LJIIJJI = Float.valueOf(f);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
        view2.setBackground(c384050F3z.LIZ(((View) this.LLJL.getValue()).getContext()));
        C786410Ut5.K7((ViewGroup) this.LLJL.getValue(), new ACListenerS141S0100000_6(this, 36));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(X.InterfaceC461580I8e r12) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.comment.ShareCommentTemplateReusedUISlot.op(X.0I8e):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC461580I8e interfaceC461580I8e) {
        op(interfaceC461580I8e);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC461580I8e interfaceC461580I8e) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC461580I8e interfaceC461580I8e) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C461570I8d c461570I8d;
        InterfaceC461580I8e interfaceC461580I8e = (InterfaceC461580I8e) interfaceC1587906Jp;
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
                if ((obj2 instanceof C461570I8d) && (c461570I8d = (C461570I8d) obj2) != null && c461570I8d.LIZ) {
                    op(interfaceC461580I8e);
                }
            }
            return;
        }
        op(interfaceC461580I8e);
    }
}
