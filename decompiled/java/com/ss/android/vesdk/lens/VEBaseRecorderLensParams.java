package com.ss.android.vesdk.lens;

import X.EnumC1155100gAG;
import X.InterfaceC1155110gAH;

/* JADX INFO: loaded from: classes36.dex */
public class VEBaseRecorderLensParams implements InterfaceC1155110gAH {
    public int algorithmFlag;
    public boolean enable;
    public Object resultCallback;

    @Override // X.InterfaceC1155110gAH
    public EnumC1155100gAG getUsage() {
        return EnumC1155100gAG.LENS;
    }
}
