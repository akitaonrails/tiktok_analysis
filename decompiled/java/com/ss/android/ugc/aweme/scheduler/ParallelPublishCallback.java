package com.ss.android.ugc.aweme.scheduler;

import X.AbstractC1433460nPE;
import X.AbstractC1433570nPP;
import X.C0CHQ;
import X.C1433410nP9;
import X.C1433450nPD;
import X.C1433630nPV;
import X.C1433730nPf;
import X.C1433740nPg;
import X.C2188811AlT;
import X.C492390JSr;
import X.C577950Mld;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class ParallelPublishCallback extends AbstractC1433570nPP {
    public static final int $stable = 8;
    public Function0<Unit> onParallelTaskFinish;
    public final C1433740nPg publishTaskList;

    public final Function0<Unit> getOnParallelTaskFinish() {
        return this.onParallelTaskFinish;
    }

    public final void setOnParallelTaskFinish(Function0<Unit> function0) {
        this.onParallelTaskFinish = function0;
    }

    public ParallelPublishCallback(C1433740nPg c1433740nPg, Function0<Unit> function0) {
        this.publishTaskList = c1433740nPg;
        this.onParallelTaskFinish = function0;
    }

    @Override // X.AbstractC1433570nPP
    public void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel) {
        super.onFinish(abstractC1433460nPE, obj, publishModel);
        if (((abstractC1433460nPE instanceof C492390JSr) || (abstractC1433460nPE instanceof C1433630nPV) || (abstractC1433460nPE instanceof C1433450nPD) || (abstractC1433460nPE instanceof C1433410nP9)) && this.publishTaskList.LJ() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PublishParallel ParallelPublishCallback onFinish result: ");
            sbLIZ.append(abstractC1433460nPE);
            sbLIZ.append(", publishTaskList size: ");
            sbLIZ.append(this.publishTaskList.LJ());
            C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (C0CHQ.LIZ().LJJJJJ().isRecordingOrEditing()) {
                C577950Mld.LIZ("PublishParallel ParallelPublishCallback skip next task because of current activity is record or edit");
            } else {
                C577950Mld.LIZ("PublishParallel ParallelPublishCallback start next task");
                C1433730nPf.LJJII();
            }
        }
        Function0<Unit> function0 = this.onParallelTaskFinish;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
