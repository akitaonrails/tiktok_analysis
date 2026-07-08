package com.ss.android.ugc.aweme.im.callroom.ui;

import X.C01GW;
import X.C0I6Y;
import X.C0Z2Z;
import X.C0ZXS;
import X.C1509305vX;
import X.C1559260qg8;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C457780HxI;
import X.C461530I7z;
import X.C687700QyG;
import X.C723590SZx;
import X.C814420VxA;
import X.C898900ZOe;
import X.C899880ZRy;
import X.C901200ZXa;
import X.EnumC901220ZXc;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.InterfaceC899890ZRz;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.CallLogCardTemplate;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CallLogAssem extends ReusedUISlotAssem<CallLogAssem> implements InterfaceC712990Rxx<InterfaceC899890ZRz>, InterfaceC1146704e9 {
    public static final int LLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 233));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 234));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 232));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 231));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 235));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 236));
    public EnumC901220ZXc LLJZIJLIL;

    public abstract int Ap();

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cl7;
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

    public abstract void op(C0ZXS c0zxs, boolean z);

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    public abstract String up();

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public abstract int yp();

    public abstract int zp();

    public final TuxTextView Bp() {
        return (TuxTextView) this.LLJZ.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ep, reason: merged with bridge method [inline-methods] */
    public final void up(InterfaceC899890ZRz interfaceC899890ZRz) {
        CallLogCardTemplate callLogCardTemplate;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(C0I6Y.LIZ(interfaceC899890ZRz), CallLogCardTemplate.class);
        if (baseTemplateLIZ instanceof CallLogCardTemplate) {
            callLogCardTemplate = (CallLogCardTemplate) baseTemplateLIZ;
        } else {
            callLogCardTemplate = null;
        }
        sp(callLogCardTemplate);
        op(interfaceC899890ZRz.LJII(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(com.ss.android.ugc.aweme.im.message.template.card.CallLogCardTemplate r11) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.callroom.ui.CallLogAssem.sp(com.ss.android.ugc.aweme.im.message.template.card.CallLogCardTemplate):void");
    }

    public final void tp(C0ZXS c0zxs) {
        if (c0zxs.LIZ.LJ) {
            View view = (View) this.LLJLILLLLZIIL.getValue();
            if (view != null) {
                view.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxs.LIZ.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxs.LIZ.LIZIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxs.LIZ.LIZJ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c0zxs.LIZ.LIZLLL))));
            }
            ((View) this.LLJLL.getValue()).setPadding(0, 0, 0, 0);
            return;
        }
        View view2 = (View) this.LLJLILLLLZIIL.getValue();
        if (view2 != null) {
            view2.setPadding(0, 0, 0, 0);
        }
        View view3 = (View) this.LLJLL.getValue();
        int i = LLL;
        view3.setPadding(i, i, i, i);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC899890ZRz interfaceC899890ZRz) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC899890ZRz interfaceC899890ZRz) {
    }

    public final void Fp(EnumC901220ZXc enumC901220ZXc, C901200ZXa c901200ZXa) {
        int i;
        if (enumC901220ZXc == EnumC901220ZXc.MemberStatusEnded) {
            i = R.raw.icon_telephone_fill;
        } else {
            i = R.raw.icon_telephone_x_mark_fill;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(c901200ZXa.LIZ);
        gradientDrawable.setSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZLLL = Integer.valueOf(c901200ZXa.LIZLLL);
        ((TuxIconView) this.LLJLLIL.getValue()).setImageDrawable(C426750GoL.LJIILIIL(c419910GdJ.LIZ(LJJIJL().getContext()), gradientDrawable));
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C899880ZRy c899880ZRy;
        InterfaceC899890ZRz interfaceC899890ZRz = (InterfaceC899890ZRz) interfaceC1587906Jp;
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
                CallLogCardTemplate callLogCardTemplate = null;
                if ((obj2 instanceof C899880ZRy) && (c899880ZRy = (C899880ZRy) obj2) != null) {
                    if (c899880ZRy.LIZ) {
                        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(C0I6Y.LIZ(interfaceC899890ZRz), CallLogCardTemplate.class);
                        if (baseTemplateLIZ instanceof CallLogCardTemplate) {
                            callLogCardTemplate = (CallLogCardTemplate) baseTemplateLIZ;
                        }
                        sp(callLogCardTemplate);
                    }
                    if (c899880ZRy.LIZIZ) {
                        op(interfaceC899890ZRz.LJII(), true);
                    }
                }
            }
            return;
        }
        up(interfaceC899890ZRz);
    }
}
