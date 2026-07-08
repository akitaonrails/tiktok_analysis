package com.ss.ugc.android.editor.bottom.panel;

import X.C0E48;
import X.C0EBE;
import X.C1664600tQ2;
import X.C19A3;
import X.C1DRG;
import X.C349830DnZ;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes6.dex */
public class EditorContextFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZjArKmEyJiE+JiY3ZiAoIDs8OmsuJjsnHELIOSJyhiOS49LSliDCs6PCo+CiA9PCA0PQkhKSIhLCEn";
    public C0E48 LL;
    public C1DRG LLILLJJLI;

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C1DRG c1drg;
        Fragment parentFragment;
        View view2;
        C19A3 c19a3;
        C19A3 c19a32;
        super.onViewCreated(view, bundle);
        Scene sceneLIZ = C0EBE.LIZ(view);
        C1DRG c1drg2 = null;
        if ((sceneLIZ instanceof C19A3) && (c19a32 = (C19A3) sceneLIZ) != null) {
            c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a32)).LLJJI;
        } else {
            c1drg = null;
        }
        this.LLILLJJLI = c1drg;
        if (c1drg == null && (parentFragment = getParentFragment()) != null && (view2 = parentFragment.getView()) != null) {
            Scene sceneLIZ2 = C0EBE.LIZ(view2);
            if ((sceneLIZ2 instanceof C19A3) && (c19a3 = (C19A3) sceneLIZ2) != null) {
                c1drg2 = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI;
            }
            this.LLILLJJLI = c1drg2;
        }
        C1DRG c1drg3 = this.LLILLJJLI;
        if (c1drg3 != null) {
            this.LL = C349830DnZ.LIZ(c1drg3);
            return;
        }
        throw new IllegalStateException("objectContainer is null");
    }
}
