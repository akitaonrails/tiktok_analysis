package com.ss.android.ugc.aweme.captionsheet.feedback;

import X.C1602160rnK;
import X.C20693115yD;
import X.C207086161s;
import X.C207088161u;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.cell.BaseCell;

/* JADX INFO: loaded from: classes32.dex */
public final class TranslationFeedbackCell extends BaseCell<C20693115yD> {
    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View I5(ViewGroup viewGroup) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        Context context = viewGroup.getContext();
        if (viewGroup instanceof ViewOnAttachStateChangeListenerC20604515jv) {
            viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewGroup;
        } else {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        C207086161s c207086161s = new C207086161s(context, viewOnAttachStateChangeListenerC20604515jv);
        int visibility = c207086161s.getVisibility();
        c207086161s.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c207086161s);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c207086161s);
        c207086161s.setLayoutParams(layoutParams);
        c207086161s.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        return c207086161s;
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C20693115yD c20693115yD) {
        C207086161s c207086161s;
        C207088161u c207088161u;
        String str;
        super.onBindItemView(c20693115yD);
        View view = this.itemView;
        Boolean boolValueOf = null;
        if ((view instanceof C207086161s) && (c207086161s = (C207086161s) view) != null && (c207088161u = c20693115yD.LLILZLL) != null) {
            c207086161s.LLJJIJIL = c207088161u;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("currentAid:");
            C207088161u c207088161u2 = c207086161s.LLJJIJIL;
            if (c207088161u2 != null) {
                str = c207088161u2.LIZ;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(", currentInfo:");
            sbLIZ.append(c207086161s.LLJJIJIL);
            sbLIZ.append(", isSubmit:");
            C207088161u c207088161u3 = c207086161s.LLJJIJIL;
            if (c207088161u3 != null) {
                boolValueOf = Boolean.valueOf(c207088161u3.LJIIIZ);
            }
            sbLIZ.append(boolValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            C207088161u c207088161u4 = c207086161s.LLJJIJIL;
            if (c207088161u4 != null && c207088161u4.LJIIIZ) {
                c207086161s.LJIIIZ(true);
            }
        }
    }
}
