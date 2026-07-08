package com.ss.android.ugc.aweme.share.core.protocol;

import X.AbstractC1372680lpC;
import X.C06KX;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;

/* JADX INFO: loaded from: classes22.dex */
public abstract class ShareConfiguration<T extends BaseSharePackage> implements C06KX {
    public abstract CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage);

    public abstract ShareChannelProtocol LIZJ(Context context, BaseSharePackage baseSharePackage);

    public abstract AbstractC1372680lpC LIZLLL();

    public abstract SharePanelLogicProtocol LJ(BaseSharePackage baseSharePackage);

    public abstract ShareTitleProtocol LJFF(BaseSharePackage baseSharePackage);

    public abstract SheetActionProtocol LJI(BaseSharePackage baseSharePackage);
}
