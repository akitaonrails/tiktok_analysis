package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem;

import X.C01DP;
import X.C01DU;
import X.C11JF;
import X.C14KS;
import X.C1559260qg8;
import X.C408001iI;
import X.C408201iK;
import X.C687700QyG;
import X.C723590SZx;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.CustomizedBoardScope;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OverlayImageEditPreviewAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C01DP.class, "FullCustomizedBoardHierarchyData"), checkSupervisorPrepared());
    public C11JF LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.g0r;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CustomizedBoardScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CustomizedBoardScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C11JF c11jf = this.LLJJIII;
        if (c11jf == null || !(!c11jf.isDisposed())) {
            return;
        }
        c11jf.dispose();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ImageContent imageContent;
        View view2;
        super.onViewCreated(view);
        ImageView imageView = (ImageView) view.findViewById(R.id.pwq);
        if (imageView == null || (imageContent = ((C01DP) this.LLJJI.getValue()).LL.overlayImage) == null) {
            return;
        }
        C11JF c11jf = this.LLJJIII;
        if (c11jf != null && (!c11jf.isDisposed())) {
            c11jf.dispose();
        }
        this.LLJJIII = C408001iI.LIZ(imageView, imageContent, new C408201iK(), new C01DU(this));
        Object parent = imageView.getParent();
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            int iLJFF = (int) (C14KS.LJFF() * 0.8f);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                int i = layoutParams.width;
                if (i != -2 && i > iLJFF) {
                    float f = iLJFF / i;
                    int i2 = layoutParams.height;
                    if (i2 > 0) {
                        i2 = (int) (i2 * f);
                    }
                    layoutParams.height = i2;
                    layoutParams.width = iLJFF;
                }
                C786410Ut5.W5(view2, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
