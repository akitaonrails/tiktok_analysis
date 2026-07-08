package com.ss.android.ugc.aweme.setting.page.theme.base;

import X.C118300cf;
import X.C1841350y17;
import X.C20692215y4;
import X.C259800zU;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C810670Vr7;
import X.C960203pA;
import Y.ACListenerS133S0200000_31;
import Y.ACListenerS165S0100000_31;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.cell.BaseCell;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes32.dex */
public final class ThemeCell extends BaseCell<C20692215y4> {
    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View I5(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f7k, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, android.view.View] */
    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C20692215y4 c20692215y4) {
        super.onBindItemView(c20692215y4);
        boolean zLIZIZ = C960203pA.LIZIZ(this.itemView.getContext());
        ((C1841350y17) this.itemView.findViewById(R.id.xsg)).setChecked(!zLIZIZ);
        ((C1841350y17) this.itemView.findViewById(R.id.xse)).setChecked(zLIZIZ);
        View view = this.itemView;
        C384050F3z c384050F3z = new C384050F3z();
        float fLIZIZ = C418440Gaw.LIZIZ(8);
        if (c20692215y4.LLILZIL) {
            c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
            c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
        }
        if (c20692215y4.LLILZLL) {
            c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
            c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
        }
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
        view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = this.itemView.findViewById(R.id.xse);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.xsd);
        final C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = this.itemView.findViewById(R.id.xsg);
        LinearLayout linearLayout2 = (LinearLayout) this.itemView.findViewById(R.id.xsf);
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = 1;
        final C118300cf c118300cf2 = new C118300cf();
        c118300cf2.element = 2;
        if (zLIZIZ) {
            c259800zU.element = this.itemView.findViewById(R.id.xsg);
            linearLayout = (LinearLayout) this.itemView.findViewById(R.id.xsf);
            c259800zU2.element = this.itemView.findViewById(R.id.xse);
            linearLayout2 = (LinearLayout) this.itemView.findViewById(R.id.xsd);
            c118300cf.element = 2;
            c118300cf2.element = 1;
        }
        final SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(this.itemView.getContext(), 0, "sp_dark_mode");
        int i = sharedPreferencesLIZJ.getInt("dark_mode", 1);
        C786410Ut5.R7(linearLayout, new ACListenerS165S0100000_31(c259800zU, 82));
        C786410Ut5.B7((C1841350y17) c259800zU.element, new CompoundButton.OnCheckedChangeListener() { // from class: X.15y1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                String str;
                if (z) {
                    c259800zU2.element.setChecked(false);
                    if (c118300cf2.element == 1) {
                        str = "light";
                    } else {
                        str = "dark";
                    }
                    C20684815ws.LJIILLIIL("change_display_light_dark_mode", C2097908Jt.LIZJ(new Pair("to_status", str)));
                    Bundle bundle = new Bundle();
                    bundle.putInt("dark_mode_setting_value", c118300cf2.element);
                    AppLog.setCustomerHeader(bundle);
                    sharedPreferencesLIZJ.edit().putInt("dark_mode", c118300cf2.element).apply();
                    C19GT.LJJIII(c118300cf2.element);
                    Activity[] activityStack = ActivityStack.getActivityStack();
                    ArrayList arrayList = new ArrayList();
                    for (Activity activity : activityStack) {
                        if (!activity.isFinishing()) {
                            arrayList.add(activity);
                        }
                    }
                    Iterator it2 = C13LP.LJLJJLL(arrayList).iterator();
                    while (it2.hasNext()) {
                        ((Activity) it2.next()).recreate();
                    }
                }
            }
        });
        if (i == -1) {
            C786410Ut5.R7(linearLayout2, new ACListenerS165S0100000_31(c259800zU2, 83));
            C786410Ut5.e9((C1841350y17) c259800zU2.element, new ACListenerS133S0200000_31(c118300cf, sharedPreferencesLIZJ, 16));
        }
    }
}
