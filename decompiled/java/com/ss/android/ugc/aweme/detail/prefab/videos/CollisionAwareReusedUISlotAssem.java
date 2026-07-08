package com.ss.android.ugc.aweme.detail.prefab.videos;

import X.C01GW;
import X.C03H5;
import X.C13LE;
import X.C14JG;
import X.C607770Nsd;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.detail.arch.videos.CollisionResolver;
import com.ss.android.ugc.aweme.ui.util.PhotoModeIconAssem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public abstract class CollisionAwareReusedUISlotAssem<RECEIVER extends C03H5> extends ReusedUISlotAssem<RECEIVER> implements InterfaceC712990Rxx<C607770Nsd>, C14JG {
    public final C01GW LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(CollisionResolver.class), AFwS264S0000000_24.get$arr$(59));

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.C14JG
    public final Rect b8() {
        return new Rect(getContentView().getLeft(), getContentView().getTop(), getContentView().getRight(), getContentView().getBottom());
    }

    @Override // X.C14JG
    public final boolean X5() {
        return getContentView().getVisibility() == 0;
    }

    @Override // X.C14JG
    public final void v3() {
        C786410Ut5.LJLLLLLL(8, getContentView());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ((ArrayList) ((CollisionResolver) this.LLJJLIIIJLLLLLLLZ.getValue()).LL).add(this);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C607770Nsd c607770Nsd) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C607770Nsd c607770Nsd) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        ((PhotoModeIconAssem) this).up(interfaceC1587906Jp);
    }
}
