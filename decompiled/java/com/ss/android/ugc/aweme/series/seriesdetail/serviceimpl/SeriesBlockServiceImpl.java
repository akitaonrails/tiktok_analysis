package com.ss.android.ugc.aweme.series.seriesdetail.serviceimpl;

import X.C1479605qk;
import X.C14EU;
import X.C15580068c;
import X.InterfaceC1208804oA;
import com.ss.android.ugc.aweme.service.IPaidSeriesBlockService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public final class SeriesBlockServiceImpl implements IPaidSeriesBlockService {
    public final CopyOnWriteArraySet<InterfaceC1208804oA> LIZIZ = new CopyOnWriteArraySet<>();

    public SeriesBlockServiceImpl() {
        C15580068c.LIZ.getClass();
        C15580068c.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidSeriesBlockService
    public final void LIZ(InterfaceC1208804oA interfaceC1208804oA) {
        this.LIZIZ.add(interfaceC1208804oA);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidSeriesBlockService
    public final void LIZIZ(InterfaceC1208804oA interfaceC1208804oA) {
        this.LIZIZ.remove(interfaceC1208804oA);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserSuccessEvent(C1479605qk c1479605qk) {
        Iterator<InterfaceC1208804oA> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().Q7(c1479605qk.LIZ);
        }
    }
}
