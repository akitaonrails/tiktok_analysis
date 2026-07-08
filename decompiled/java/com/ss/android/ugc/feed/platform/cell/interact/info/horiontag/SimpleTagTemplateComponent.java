package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag;

import X.C03H5;
import X.C0RF0;
import X.C1559260qg8;
import X.C1AF0;
import X.C299590Boj;
import X.C690430R6j;
import X.C690870R8b;
import X.C704010RjT;
import X.C723580SZw;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public abstract class SimpleTagTemplateComponent<RECEIVER extends C03H5> extends DynamicComponent<RECEIVER> {
    public View LLJZIJLIL;
    public TuxIconView LLL;
    public TuxTextView LLLF;

    public abstract void Fp(VideoItemParams videoItemParams);

    public abstract int Gp();

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        C690870R8b c690870R8b;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        return C704010RjT.LJ(c0rf0 != null ? c0rf0.LJIIIZ : null) ? R.layout.b6j : Gp();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public void up(VideoItemParams videoItemParams) {
        Fp(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C690870R8b c690870R8b;
        super.onViewCreated(view);
        String str = null;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        }
        if (C704010RjT.LJ(str)) {
            this.LLJZIJLIL = view.findViewById(R.id.tqy);
            this.LLLF = (TuxTextView) view.findViewById(R.id.text);
            this.LLL = (TuxIconView) view.findViewById(R.id.jht);
            C704010RjT.LIZIZ(this.LLJZIJLIL);
            C704010RjT.LIZLLL(this.LLLF);
            C704010RjT.LIZJ(this.LLL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
