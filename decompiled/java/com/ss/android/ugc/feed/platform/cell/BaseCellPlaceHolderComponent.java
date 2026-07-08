package com.ss.android.ugc.feed.platform.cell;

import X.C2188811AlT;
import X.InterfaceC1565640qqQ;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.clearmode.ExitClearModeAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: loaded from: classes12.dex */
public class BaseCellPlaceHolderComponent extends BaseCellContentComponent<BaseCellPlaceHolderComponent> implements InterfaceC1565640qqQ {
    public final String LLJJJJLIIL;

    public BaseCellPlaceHolderComponent() {
        this(0);
    }

    public boolean ep() {
        return this instanceof ExitClearModeAssem;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: hp, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append(this.LLJJJJLIIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ BaseCellPlaceHolderComponent(int i) {
        this("");
    }

    public BaseCellPlaceHolderComponent(String str) {
        this.LLJJJJLIIL = str;
    }
}
