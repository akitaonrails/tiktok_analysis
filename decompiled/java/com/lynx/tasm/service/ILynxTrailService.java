package com.lynx.tasm.service;

import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public interface ILynxTrailService extends IServiceProvider {
    Map<String, Object> getAllValues();

    @Override // com.lynx.tasm.service.IServiceProvider
    Class<? extends IServiceProvider> getServiceClass();

    Object objectValueForTrailKey(String str);

    String stringValueForTrailKey(String str);
}
