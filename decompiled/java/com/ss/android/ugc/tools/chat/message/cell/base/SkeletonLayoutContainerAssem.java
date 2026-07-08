package com.ss.android.ugc.tools.chat.message.cell.base;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C111800bc;
import X.C14IS;
import X.C18VH;
import X.C18WK;
import X.C19ME;
import X.C21652419oY;
import X.C452501pT;
import X.C723830SaL;
import X.C786410Ut5;
import X.C898860ZOa;
import X.C910260ZnM;
import X.EnumC900290ZTn;
import X.InterfaceC111300bX;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import irm.AkS69S0200000_32;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes33.dex */
public class SkeletonLayoutContainerAssem<ITEM extends C910260ZnM> extends ReusedUISlotAssem<SkeletonLayoutContainerAssem<ITEM>> implements InterfaceC712990Rxx<ITEM> {
    public final int LLJJLIIIJLLLLLLLZ;
    public final InterfaceC111300bX LLJL;
    public final int LLJLIL;
    public final List<C14IS> LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    public void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public /* synthetic */ SkeletonLayoutContainerAssem() {
        this(R.id.eu1, new C111800bc(0), R.layout.ae8, new ArrayList());
    }

    public C18WK op() {
        return new C18WK();
    }

    public final C21652419oY sp() {
        return (C21652419oY) this.LLJLL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        return this.LLJLIL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        view.setHapticFeedbackEnabled(false);
        C21652419oY c21652419oYSp = sp();
        c21652419oYSp.getClass();
        c21652419oYSp.LL = EnumC900290ZTn.REFACTOR;
        sp().setGestureConfig(new C898860ZOa(false, true, true, true));
        C723830SaL.LIZ(this, null, new AwS609S0100000_30(this, 125));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: tp, reason: merged with bridge method [inline-methods] */
    public void up(ITEM item) {
        C18VH c18vhLJ = item.LJ();
        if (sp().getLayoutParams() instanceof C19ME) {
            Object tag = sp().getTag(R.id.f7l);
            if (!(tag instanceof C18VH)) {
                tag = null;
            }
            if (c18vhLJ != tag) {
                sp().setTag(R.id.f7l, c18vhLJ);
                if (c18vhLJ == C18VH.END) {
                    C19ME c19me = (C19ME) sp().getLayoutParams();
                    c19me.startToStart = -1;
                    c19me.endToEnd = 0;
                    C21652419oY c21652419oYSp = sp();
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21652419oYSp);
                    c21652419oYSp.setLayoutParams(c19me);
                } else if (c18vhLJ == C18VH.START) {
                    C19ME c19me2 = (C19ME) sp().getLayoutParams();
                    c19me2.startToStart = 0;
                    c19me2.endToEnd = -1;
                    C21652419oY c21652419oYSp2 = sp();
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21652419oYSp2);
                    c21652419oYSp2.setLayoutParams(c19me2);
                }
            }
        }
        sp().setDefaultOnLongPressAction(new AwS433S0200000_32(this, (SkeletonLayoutContainerAssem<int>) item, 34));
        sp().setDefaultOnDoubleTapAction(new AwS433S0200000_32(this, (SkeletonLayoutContainerAssem<int>) item, 35));
        C786410Ut5.I7(new AkS69S0200000_32(this, item, 2), LJJIJL());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public SkeletonLayoutContainerAssem(int i, InterfaceC111300bX interfaceC111300bX, int i2, List<C14IS> list) {
        this.LLJJLIIIJLLLLLLLZ = i;
        this.LLJL = interfaceC111300bX;
        this.LLJLIL = i2;
        this.LLJLILLLLZIIL = list;
        this.LLJLL = C452501pT.LIZIZ(new AwS576S0100000_32((SkeletonLayoutContainerAssem) this, 399));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS576S0100000_32((AbstractC738140SxQ) this, 401));
        this.LLJLLL = C452501pT.LIZIZ(new AwS576S0100000_32((AbstractC738140SxQ) this, 400));
    }
}
