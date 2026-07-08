package com.ss.android.ugc.aweme.wavepublish.dm.service;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class DMPhotoExportServiceImpl implements IDMPhotoExportService {
    public final ConcurrentHashMap<String, DMPhotoExportJob> LIZIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.wavepublish.dm.service.IDMPhotoExportService
    public final DMPhotoExportJob LIZ(String str) {
        return this.LIZIZ.get(str);
    }

    @Override // com.ss.android.ugc.aweme.wavepublish.dm.service.IDMPhotoExportService
    public final void LIZJ(String str) {
        this.LIZIZ.remove(str);
    }

    @Override // com.ss.android.ugc.aweme.wavepublish.dm.service.IDMPhotoExportService
    public final void LIZIZ(String str, DMPhotoExportJob dMPhotoExportJob) {
        this.LIZIZ.put(str, dMPhotoExportJob);
    }
}
