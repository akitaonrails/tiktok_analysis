package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui;

import X.C13LP;
import X.C337180DJs;
import X.InterfaceC1587906Jp;
import X.InterfaceC657240PqE;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseSearchMediaOptionalAssem extends ReusedUISlotAssem<BaseSearchMediaOptionalAssem> implements InterfaceC712990Rxx<InterfaceC657240PqE> {
    public void op(View view) {
    }

    public boolean sp(List list) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    public abstract boolean up(InterfaceC657240PqE interfaceC657240PqE);

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        op(view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: tp, reason: merged with bridge method [inline-methods] */
    public void up(InterfaceC657240PqE interfaceC657240PqE) {
        C337180DJs.LIZJ(getContentView());
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(InterfaceC657240PqE interfaceC657240PqE) {
        return up(interfaceC657240PqE);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC657240PqE interfaceC657240PqE) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        List list2;
        if (list != null && !list.isEmpty() && list.size() <= 1) {
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            if (!(objLJJJLZIJ instanceof List) || (list2 = (List) objLJJJLZIJ) == null || sp(list2)) {
                up(interfaceC1587906Jp);
                return;
            }
            return;
        }
        up(interfaceC1587906Jp);
    }
}
