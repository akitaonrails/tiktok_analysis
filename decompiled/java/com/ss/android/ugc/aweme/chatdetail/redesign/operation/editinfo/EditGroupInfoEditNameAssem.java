package com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo;

import X.C2217381BqS;
import X.C736680Sv4;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS128S1100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class EditGroupInfoEditNameAssem extends BaseEditGroupInfoAssem {
    public final int LLJILLL = R.id.gqi;
    public final int LLJJ = 2131831397;
    public final int LLJJI = 2131831357;
    public final int LLJJIII = 30;
    public final int LLJJIJI = R.id.gqp;

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.BaseEditGroupInfoAssem
    public final Integer Go() {
        return Integer.valueOf(this.LLJJIJI);
    }

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.BaseEditGroupInfoAssem
    public final String Jo() {
        return Zo().yQ2();
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
        editGroupInfoViewModelZo.setState(new AwS128S1100000_14(editGroupInfoViewModelZo, str, 16));
        Zo().setState(AFwS248S0000000_14.get$arr$(575));
    }

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.BaseEditGroupInfoAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, Zo(), new C2217381BqS() { // from class: X.0ZBb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0ZBZ) obj).LLIZLLLIL);
            }
        }, null, new AwS628S0100000_14(this, 9), 6);
    }
}
