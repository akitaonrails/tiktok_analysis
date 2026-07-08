package com.ss.android.ugc.nearby.toolzone;

import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.nearby.container.model.NearbyTool;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyToolTripleCell extends NearbyToolBaseCell<NearbyTool> {
    @Override // com.ss.android.ugc.nearby.toolzone.NearbyToolBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        NearbyTool nearbyTool = (NearbyTool) interfaceC1891350zJl;
        super.onBindItemView(nearbyTool);
        int iLIZIZ = (((this.itemView.getContext().getResources().getDisplayMetrics().widthPixels - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) * 2)) / 3;
        View view = this.LL;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof RecyclerView.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.width = iLIZIZ;
                marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(66));
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.W5(view, marginLayoutParams);
        }
        View view2 = this.LL;
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            if (bindingAdapterPosition != 0) {
                if (bindingAdapterPosition != 1) {
                    if (bindingAdapterPosition == 2) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams2.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                        marginLayoutParams2.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams3.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                    marginLayoutParams3.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                }
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams4.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                marginLayoutParams4.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            }
            View view3 = this.LL;
            if (view3 != null) {
                C786410Ut5.W5(view3, layoutParams);
            }
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(72);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(nearbyTool.getTitle());
        }
    }

    @Override // com.ss.android.ugc.nearby.toolzone.NearbyToolBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dsa, viewGroup, false);
        this.LL = viewTd;
        this.LLILLJJLI = (SmartImageView) viewTd.findViewById(R.id.y63);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.y6a);
        return viewTd;
    }
}
