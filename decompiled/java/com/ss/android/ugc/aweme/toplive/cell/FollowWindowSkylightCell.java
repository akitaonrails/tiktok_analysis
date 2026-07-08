package com.ss.android.ugc.aweme.toplive.cell;

import X.AbstractC482420Ivw;
import X.C03H8;
import X.C118300cf;
import X.C21146717pB;
import X.C21569819bE;
import X.C21681819tI;
import X.C418440Gaw;
import X.C481820Iuy;
import X.C482340Ivo;
import X.C482640IwI;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS111S0200000_7;
import Y.ARunnableS40S0300000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ab.ToplivePageLoadAdvanceSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: loaded from: classes8.dex */
public final class FollowWindowSkylightCell extends ToplivePagePowerCell<C482340Ivo> implements C03H8 {
    public final List<C482640IwI> LLILLJJLI;
    public TextView LLILLL;
    public TextView LLILZ;
    public LinearLayout LLILZIL;
    public boolean LLILZLL;

    public FollowWindowSkylightCell() {
        super(false);
        this.LLILLJJLI = new ArrayList();
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell
    public final void L5() {
        String str;
        String str2;
        C481820Iuy c481820Iuy = C481820Iuy.LIZ;
        AbstractC482420Ivw abstractC482420Ivw = (AbstractC482420Ivw) getItem();
        ToplivePageItem toplivePageItem = abstractC482420Ivw != null ? abstractC482420Ivw.LL : null;
        AbstractC482420Ivw abstractC482420Ivw2 = (AbstractC482420Ivw) getItem();
        ToplivePageItem toplivePageItem2 = abstractC482420Ivw2 != null ? abstractC482420Ivw2.LL : null;
        AbstractC482420Ivw abstractC482420Ivw3 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw3 == null || (str = abstractC482420Ivw3.LLILLL) == null) {
            str = "";
        }
        AbstractC482420Ivw abstractC482420Ivw4 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw4 == null || (str2 = abstractC482420Ivw4.LLILLJJLI) == null) {
            str2 = "follow_window";
        }
        c481820Iuy.getClass();
        C481820Iuy.LIZLLL(toplivePageItem, toplivePageItem2, str, str2);
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ToplivePageItem toplivePageItem3 = ((C482640IwI) it2.next()).LJFF;
            if (toplivePageItem3 != null) {
                C481820Iuy c481820Iuy2 = C481820Iuy.LIZ;
                Room room = toplivePageItem3.room;
                String str3 = toplivePageItem3.enterMethod;
                AbstractC482420Ivw abstractC482420Ivw5 = (AbstractC482420Ivw) getItem();
                String str4 = abstractC482420Ivw5 != null ? abstractC482420Ivw5.LLILLL : null;
                c481820Iuy2.getClass();
                C481820Iuy.LJ(room, str3, str4);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            C21569819bE c21569819bE = ((C482640IwI) it2.next()).LIZLLL;
            if (c21569819bE != null) {
                c21569819bE.LIZIZ();
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = (TextView) this.itemView.findViewById(R.id.iei);
        this.LLILZ = (TextView) this.itemView.findViewById(R.id.ieh);
        this.LLILZIL = (LinearLayout) this.itemView.findViewById(R.id.n1q);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onPause() {
        super.onPause();
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            C21569819bE c21569819bE = ((C482640IwI) it2.next()).LIZLLL;
            if (c21569819bE != null) {
                c21569819bE.LJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            C21569819bE c21569819bE = ((C482640IwI) it2.next()).LIZLLL;
            if (c21569819bE != null) {
                c21569819bE.LJFF();
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            C21569819bE c21569819bE = ((C482640IwI) it2.next()).LIZLLL;
            if (c21569819bE != null) {
                c21569819bE.LJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C482340Ivo c482340Ivo) {
        boolean z;
        int iLIZIZ;
        C21681819tI c21681819tI;
        ToplivePageItem toplivePageItem = c482340Ivo.LL;
        String str = null;
        if (toplivePageItem != null) {
            str = toplivePageItem.itemId;
        }
        this.LLILZLL = Intrinsics.LJFF(str, "top");
        super.onBindItemView(c482340Ivo);
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = 2;
        if (getAbsoluteAdapterPosition() == 0 && this.LLILZLL) {
            C500260Jjc.LLFFF(this.LLILZ);
            c118300cf.element = 4;
        } else {
            C500260Jjc.LJIILIIL(this.LLILZ);
        }
        if (c118300cf.element == 4) {
            z = true;
        } else {
            z = false;
        }
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null) {
            c21681819tI.LLILLJJLI = z;
        }
        TextView textView = this.LLILLL;
        if (textView != null) {
            textView.setText(c482340Ivo.LL.itemName);
        }
        C786410Ut5.I7(new ACListenerS111S0200000_7(this, c482340Ivo, 22), this.itemView);
        if (ToplivePageLoadAdvanceSetting.LIZ().enableLayoutOpt) {
            LinearLayout linearLayout = this.LLILZIL;
            if (linearLayout != null) {
                if (C482640IwI.LJI >= C482640IwI.LJII) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(84.5d)));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(76.5d)));
                }
                linearLayout.setMinimumHeight(iLIZIZ);
            }
            HandlerHook.viewPost(this.itemView, new ARunnableS40S0300000_7(this, c482340Ivo, c118300cf, 6));
            return;
        }
        P5(c482340Ivo, c118300cf.element);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (ToplivePageLoadAdvanceSetting.LIZ().enableLayoutPreload) {
            return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.di9, viewGroup, false);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.di9, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            C21569819bE c21569819bE = ((C482640IwI) it2.next()).LIZLLL;
            if (c21569819bE != null) {
                c21569819bE.LJFF();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123 A[PHI: r3
      0x0123: PHI (r3v3 float) = (r3v2 float), (r3v0 float) binds: [B:41:0x011d, B:19:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(final X.C482340Ivo r14, int r15) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.toplive.cell.FollowWindowSkylightCell.P5(X.0Ivo, int):void");
    }
}
