package com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.assem;

import X.C19MB;
import X.C418440Gaw;
import X.C659750PuH;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class VisualSearchPhotoIconLeftToRightAssem extends ReusedUIContentAssem<VisualSearchPhotoIconLeftToRightAssem> implements InterfaceC712990Rxx<C659750PuH> {
    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ConstraintLayout constraintLayout;
        View viewFindViewById = LJJIJL().findViewById(R.id.qcw);
        ViewParent parent = null;
        if (viewFindViewById != null) {
            parent = viewFindViewById.getParent();
        }
        if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJI(R.id.qcw, 6);
            c19mb.LJIIIZ(R.id.qcw, 7, 0, 7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            c19mb.LIZIZ(constraintLayout);
        }
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659750PuH c659750PuH) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C659750PuH c659750PuH) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659750PuH c659750PuH) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
