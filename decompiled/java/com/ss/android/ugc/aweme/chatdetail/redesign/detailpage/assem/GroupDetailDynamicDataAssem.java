package com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.assem;

import X.C01GW;
import X.C0TVI;
import X.C0ZJ4;
import X.C14K9;
import X.C1509305vX;
import X.C2157308cl;
import X.C426750GoL;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS114S0100000_14;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupDetailDynamicDataAssem extends UIContentAssem {
    public final C01GW LLIZLLLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 54));

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (C2157308cl.LIZ()) {
            ((RecyclerView) this.LLIZLLLIL.getValue()).setLayoutManager(null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C14K9.LJIJJ((View) this.LLIZLLLIL.getValue(), new C0TVI() { // from class: X.0xWm
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                C20246414Jy c20246414Jy = new C20246414Jy(c20246014Ju);
                c20246414Jy.LIZ.LIZJ(7, C20244914Jj.LIZIZ(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL));
                C20246014Ju c20246014JuLIZ = c20246414Jy.LIZ();
                if (c20246014Ju.LIZ(8).LIZLLL <= c20244914JjLIZ.LIZLLL) {
                    HandlerHook.viewPost(view2, new ARunnableS114S0100000_14(view2, 51));
                }
                return c20246014JuLIZ;
            }
        });
        RecyclerView recyclerView = (RecyclerView) this.LLIZLLLIL.getValue();
        C426750GoL.LJIIIZ(recyclerView, 0, 0, 0, null, false, 24);
        recyclerView.setBackground(null);
        recyclerView.setItemAnimator(null);
        ((ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue()).LIZJ(new C0ZJ4());
    }
}
