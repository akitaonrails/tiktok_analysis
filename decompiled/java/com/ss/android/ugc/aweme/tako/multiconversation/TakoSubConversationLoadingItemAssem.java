package com.ss.android.ugc.aweme.tako.multiconversation;

import X.C1390410mHn;
import X.C21142517oV;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class TakoSubConversationLoadingItemAssem extends ReusedUISlotAssem<TakoSubConversationLoadingItemAssem> implements InterfaceC712990Rxx<C21142517oV> {
    public C1390410mHn LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fnm;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (C1390410mHn) view.findViewById(R.id.we0);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C21142517oV c21142517oV) {
        C1390410mHn c1390410mHn = this.LLJJLIIIJLLLLLLLZ;
        if (c1390410mHn != null) {
            c1390410mHn.LIZJ();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C21142517oV c21142517oV) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C21142517oV c21142517oV) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
