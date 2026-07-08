package com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem;

import X.C01GW;
import X.C0Z5T;
import X.C0ZBK;
import X.C0ZBL;
import X.C0ZBM;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1954807lC;
import X.C19719912Dl;
import X.C452501pT;
import X.C723590SZx;
import X.C723850SaN;
import X.C786410Ut5;
import X.C893950Z5d;
import X.InterfaceC893080Z1u;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatDetailContainerAssem extends UISlotAssem {
    public final C01GW LLJJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 1025));
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723590SZx(this, C0Z5T.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1024));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cfw;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        InterfaceC893080Z1u interfaceC893080Z1u = (InterfaceC893080Z1u) this.LLJJIJI.getValue();
        if (interfaceC893080Z1u != null) {
            interfaceC893080Z1u.register();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC893080Z1u interfaceC893080Z1u = (InterfaceC893080Z1u) this.LLJJIJI.getValue();
        if (interfaceC893080Z1u != null) {
            interfaceC893080Z1u.LJI();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        Class cls;
        super.onViewCreated(view);
        C786410Ut5.LJJJJJL((LinearLayout) this.LLJJI.getValue());
        int i2 = 0;
        for (C893950Z5d c893950Z5d : ((C0Z5T) this.LLJJIII.getValue()).LL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C893950Z5d c893950Z5d2 = c893950Z5d;
                C0ZBL c0zbl = c893950Z5d2.LL;
                LinearLayout linearLayout = new LinearLayout(LJJIJL().getContext());
                linearLayout.setId(View.generateViewId());
                if (c0zbl != C0ZBL.HORIZONTAL && c0zbl != C0ZBL.HORIZONTAL_NEW) {
                    i = 1;
                } else {
                    i = 0;
                }
                linearLayout.setOrientation(i);
                C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
                ((ViewGroup) this.LLJJI.getValue()).addView(linearLayout);
                int i4 = C0ZBK.LIZ[c893950Z5d2.LL.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                cls = ChatDetailVerticalNewAssem.class;
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            cls = ChatDetailHorizontalNewAssem.class;
                        }
                    } else {
                        cls = ChatDetailVerticalAssem.class;
                    }
                } else {
                    cls = ChatDetailHorizontalAssem.class;
                }
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(cls);
                InterfaceC893080Z1u interfaceC893080Z1u = (InterfaceC893080Z1u) this.LLJJIJI.getValue();
                if (interfaceC893080Z1u != null) {
                    C723850SaN.LIZLLL(this, new C0ZBM(this, i2, c893950Z5d2, interfaceC893080Z1u, c19719912DlLIZ, linearLayout));
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
