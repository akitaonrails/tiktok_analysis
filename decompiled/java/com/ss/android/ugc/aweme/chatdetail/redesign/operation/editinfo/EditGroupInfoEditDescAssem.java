package com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo;

import X.C0ZBR;
import X.C1559260qg8;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C723580SZw;
import X.C736680Sv4;
import X.C814420VxA;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS128S1100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class EditGroupInfoEditDescAssem extends BaseEditGroupInfoAssem {
    public final int LLJILLL = R.id.gpe;
    public final int LLJJ = 2131831396;
    public final int LLJJI = 2131831377;
    public final int LLJJIII = 100;
    public final int LLJJIJI = R.id.gpd;
    public final int LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(74));
    public final C1559260qg8 LLJJIJIL = new C1559260qg8(new C723580SZw(this, C0ZBR.class, null), checkSupervisorPrepared());

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.BaseEditGroupInfoAssem
    public final Integer Go() {
        return Integer.valueOf(this.LLJJIJI);
    }

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.BaseEditGroupInfoAssem
    public final String Jo() {
        return Zo().getState().LLJ;
    }

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.BaseEditGroupInfoAssem
    public final int Ho() {
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.BaseEditGroupInfoAssem
    public final int Lo() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.BaseEditGroupInfoAssem
    public final int No() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.BaseEditGroupInfoAssem
    public final int So() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.BaseEditGroupInfoAssem
    public final int Vo() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.BaseEditGroupInfoAssem
    public final void ap(String str) {
        EditGroupInfoViewModel editGroupInfoViewModelZo = Zo();
        editGroupInfoViewModelZo.setState(new AwS128S1100000_14(editGroupInfoViewModelZo, str, 15));
        C0ZBR c0zbr = (C0ZBR) this.LLJJIJIL.getValue();
        if (c0zbr != null && c0zbr.LLILLL) {
            Zo().setState(AFwS248S0000000_14.get$arr$(574));
        }
    }

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.BaseEditGroupInfoAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C0ZBR c0zbr = (C0ZBR) this.LLJJIJIL.getValue();
        if (c0zbr != null && c0zbr.LLILLL) {
            C736680Sv4.LJIIIIZZ(this, Zo(), new C2217381BqS() { // from class: X.0ZBa
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C0ZBZ) obj).LLJI);
                }
            }, null, new AwS628S0100000_14(this, 8), 6);
        }
    }
}
