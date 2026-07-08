package com.ss.android.ugc.aweme.msg;

import X.C01GW;
import X.C1584506Ih;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C786410Ut5;
import X.C814420VxA;
import X.C899240ZPm;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;
import wh6.AbS695S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupCreationCTAAssem extends UISlotAssem {
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.chy;
    }

    public GroupCreationCTAAssem() {
        checkSupervisorPrepared();
        new C723590SZx(this, C457780HxI.class, null);
        this.LLJJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1087));
        this.LLJJIII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1088));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1089));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C899240ZPm c899240ZPm;
        C899240ZPm c899240ZPm2;
        super.onViewCreated(view);
        Object obj = getConfig().LLILZ.get("first_cell_config");
        C899240ZPm c899240ZPm3 = null;
        if (obj instanceof C899240ZPm) {
            c899240ZPm = (C899240ZPm) obj;
        } else {
            c899240ZPm = null;
        }
        Object obj2 = getConfig().LLILZ.get("second_cell_config");
        if (obj2 instanceof C899240ZPm) {
            c899240ZPm2 = (C899240ZPm) obj2;
        } else {
            c899240ZPm2 = null;
        }
        Object obj3 = getConfig().LLILZ.get("third_cell_config");
        if (obj3 instanceof C899240ZPm) {
            c899240ZPm3 = (C899240ZPm) obj3;
        }
        if (c899240ZPm != null) {
            C1584506Ih.LIZIZ((View) this.LLJJI.getValue());
            TuxIconView tuxIconView = (TuxIconView) ((View) this.LLJJI.getValue()).findViewById(R.id.hzr);
            TextView textView = (TextView) ((View) this.LLJJI.getValue()).findViewById(R.id.hzs);
            hp(tuxIconView, c899240ZPm.LIZ.getIcon());
            if (textView != null) {
                textView.setText(textView.getContext().getString(c899240ZPm.LIZ.getText()));
            }
            C786410Ut5.I7(new AbS695S0100000_14(c899240ZPm, 6), (View) this.LLJJI.getValue());
        }
        if (c899240ZPm2 != null) {
            C1584506Ih.LIZIZ((View) this.LLJJIII.getValue());
            TuxIconView tuxIconView2 = (TuxIconView) ((View) this.LLJJIII.getValue()).findViewById(R.id.ugo);
            TextView textView2 = (TextView) ((View) this.LLJJIII.getValue()).findViewById(R.id.ugp);
            hp(tuxIconView2, c899240ZPm2.LIZ.getIcon());
            if (textView2 != null) {
                textView2.setText(textView2.getContext().getString(c899240ZPm2.LIZ.getText()));
            }
            C786410Ut5.I7(new AbS695S0100000_14(c899240ZPm2, 7), (View) this.LLJJIII.getValue());
        }
        if (c899240ZPm3 != null) {
            C1584506Ih.LIZIZ((View) this.LLJJIJI.getValue());
            TuxIconView tuxIconView3 = (TuxIconView) ((View) this.LLJJIJI.getValue()).findViewById(R.id.xt3);
            TextView textView3 = (TextView) ((View) this.LLJJIJI.getValue()).findViewById(R.id.xt4);
            hp(tuxIconView3, c899240ZPm3.LIZ.getIcon());
            if (textView3 != null) {
                textView3.setText(textView3.getContext().getString(c899240ZPm3.LIZ.getText()));
            }
            C786410Ut5.I7(new AbS695S0100000_14(c899240ZPm3, 8), (View) this.LLJJIJI.getValue());
        }
    }

    public static void hp(TuxIconView tuxIconView, int i) {
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(100));
            tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(tuxIconView.getContext())));
        }
    }
}
