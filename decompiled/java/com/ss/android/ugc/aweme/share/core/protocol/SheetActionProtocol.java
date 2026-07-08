package com.ss.android.ugc.aweme.share.core.protocol;

import X.C06KX;
import X.C1370200llC;
import X.EnumC1369700lkO;
import X.EnumC1369720lkQ;
import X.InterfaceC1370310llN;
import X.InterfaceC1371910lnx;
import X.InterfaceC1372360log;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public interface SheetActionProtocol extends C06KX, InterfaceC1372360log {
    EnumC1369720lkQ O12();

    EnumC1369700lkO P82();

    boolean getHideShareItems();

    C1370200llC getUiConfig();

    InterfaceC1371910lnx hF0();

    List<InterfaceC1370310llN> uO1(BaseSharePackage baseSharePackage);

    EnumC1369700lkO zT0();
}
