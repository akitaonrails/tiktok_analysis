package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag;

import X.C01GW;
import X.C452501pT;
import X.C694020RKe;
import com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbsVideoTagContainerTrigger extends AbsComponentTrigger implements VideoTagCategoryProtocol {
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C694020RKe(this));

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final PriorityAbility LJIILIIL() {
        return (PriorityAbility) this.LLJILJIL.getValue();
    }
}
