package com.ss.android.ugc.aweme.services;

import X.InterfaceC2208731BcV;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public interface IVEABService {
    void clearPanel();

    Pair<Object, Integer> getABValue(InterfaceC2208731BcV interfaceC2208731BcV);

    Map<String, InterfaceC2208731BcV> getVESDKABPropertyMap();

    void setABPanelValue(InterfaceC2208731BcV interfaceC2208731BcV, String str);
}
