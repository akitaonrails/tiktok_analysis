package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem;

import X.C1558520qew;
import X.InterfaceC1587906Jp;
import X.InterfaceC434580H2i;
import X.InterfaceC712990Rxx;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.IReferenceListAbility;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseReferenceItemAssem<T extends InterfaceC434580H2i> extends ReusedUISlotAssem<BaseReferenceItemAssem<T>> implements InterfaceC712990Rxx<T> {
    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void op(T t) {
        IReferenceListAbility iReferenceListAbility = (IReferenceListAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IReferenceListAbility.class, null);
        if (iReferenceListAbility != null) {
            iReferenceListAbility.WT(t.getIndex());
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
