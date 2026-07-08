package com.ss.android.ugc.aweme.publicgroup.assem.groupcreation;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS70S1000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupCreationEditQuestionAssem extends BaseGroupCreationEditAssem {
    public final int LLJJJJ = R.id.sf9;
    public final int LLJJJJJIL = 2131831468;
    public final int LLJJJJLIIL = 50;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cjf;
    }

    @Override // com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.BaseGroupCreationEditAssem
    public final int ip() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.BaseGroupCreationEditAssem
    public final int lp() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.BaseGroupCreationEditAssem
    public final int op() {
        return this.LLJJJJ;
    }

    @Override // com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.BaseGroupCreationEditAssem
    public final void tp(String str) {
        sp().setState(new AwS70S1000000_19(str, 12));
    }
}
