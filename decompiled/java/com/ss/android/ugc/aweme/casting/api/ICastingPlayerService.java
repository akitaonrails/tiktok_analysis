package com.ss.android.ugc.aweme.casting.api;

import X.AbstractC738140SxQ;
import X.C03H5;
import X.C13IQ;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes12.dex */
public interface ICastingPlayerService {
    void addSeekListener(ICastingSeekListener iCastingSeekListener);

    boolean blockByCasting(Aweme aweme);

    ICastingAbility getCastingAbility(InterfaceC665370Q7z interfaceC665370Q7z);

    C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> getCastingCellComponent();

    C13IQ<? extends AbstractC738140SxQ> getCastingPanelComponent();
}
