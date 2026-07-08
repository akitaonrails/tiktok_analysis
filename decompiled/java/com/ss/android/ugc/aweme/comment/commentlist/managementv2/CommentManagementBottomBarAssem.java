package com.ss.android.ugc.aweme.comment.commentlist.managementv2;

import X.C01GW;
import X.C1308910kAL;
import X.C1356320lOo;
import X.C1357700lR2;
import X.C1381440m3K;
import X.C13LE;
import X.C1401850maF;
import X.C1616660sAi;
import X.C1637806bA;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C19EG;
import X.C2217371BqR;
import X.C295780Bia;
import X.C295880Bik;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C487280J9a;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C785410UrT;
import X.C786410Ut5;
import X.DialogInterfaceC21560019Ze;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentManagementBottomBarAssem extends UISlotAssem implements InterfaceC487330J9f {
    public boolean LLJJI;
    public TextView LLJJIII;
    public TextView LLJJIJI;
    public View LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C1381440m3K LLJJJ;
    public DialogInterfaceC21560019Ze LLJJJIL;

    public CommentManagementBottomBarAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentManagementAssemVM.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 8));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ahe;
    }

    public final CommentManagementAssemVM hp() {
        return (CommentManagementAssemVM) this.LLJJIJIL.getValue();
    }

    public final void ip() {
        hp().vQ2();
        this.LLJJI = false;
        TextView textView = this.LLJJIII;
        if (textView != null) {
            textView.setEnabled(false);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, textView.getContext());
            if (numLIZJ == null) {
                return;
            }
            textView.setTextColor(numLIZJ.intValue());
            textView.setText(2131829140);
        }
        TextView textView2 = this.LLJJIJI;
        if (textView2 != null) {
            textView2.setEnabled(false);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1p, textView2.getContext());
            if (numLIZJ2 != null) {
                textView2.setTextColor(numLIZJ2.intValue());
            }
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        if (!C295880Bik.LIZLLL || !C295780Bia.LIZIZ) {
            C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
            if (!C1356320lOo.LIZ(R.layout.ahe)) {
                super.Eo(context);
                return context;
            }
        }
        return LJJIJL().getContext();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (TextView) view.findViewById(R.id.t1t);
        this.LLJJIJI = (TextView) view.findViewById(R.id.t1v);
        this.LLJJIJIIJIL = view;
        TextView textView = this.LLJJIII;
        if (textView != null) {
            C786410Ut5.I7(new C1401850maF(this, 0), textView);
        }
        TextView textView2 = this.LLJJIJI;
        if (textView2 != null) {
            C786410Ut5.I7(new C1401850maF(this, 1), textView2);
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217371BqR() { // from class: X.0l4G
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159060gGe) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1159060gGe) obj).LL = (C291001Au) obj2;
            }
        }, null, new AwS635S0100000_21(this, 9), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217371BqR() { // from class: X.0l42
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159060gGe) obj).LLILLJJLI;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1159060gGe) obj).LLILLJJLI = (C291001Au) obj2;
            }
        }, null, new AwS635S0100000_21(this, 10), 6);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C487280J9a.LIZ(c19egLIZ.hashCode(), this);
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        DialogInterfaceC21560019Ze dialogInterfaceC21560019Ze;
        C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ().getClass();
        if (C1616660sAi.LIZJ() && (dialogInterfaceC21560019Ze = this.LLJJJIL) != null) {
            dialogInterfaceC21560019Ze.dismiss();
            C785410UrT.LIZ(dialogInterfaceC21560019Ze);
        }
    }
}
