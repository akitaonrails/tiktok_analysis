package com.ss.android.ugc.aweme.setting.ui.cell;

import X.C19292610do;
import X.C20094213jo;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cell.BaseCell;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: loaded from: classes29.dex */
public final class SettingHeaderCell extends BaseCell<C19292610do> {
    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View I5(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f6y, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C19292610do c19292610do) {
        TuxTextView tuxTextView;
        super.onBindItemView(c19292610do);
        View view = this.itemView;
        if ((view instanceof TuxTextView) && (tuxTextView = (TuxTextView) view) != null) {
            String string = c19292610do.LLIZLLLIL;
            if (string == null) {
                string = tuxTextView.getContext().getString(2131829013);
            }
            tuxTextView.setText(string);
            tuxTextView.LJJJJI(28.0f);
            q0.LJIJ(tuxTextView, new C20094213jo() { // from class: X.10hz
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setHeading(true);
                }
            });
        }
    }
}
