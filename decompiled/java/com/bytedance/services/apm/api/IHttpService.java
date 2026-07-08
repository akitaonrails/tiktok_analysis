package com.bytedance.services.apm.api;

import X.C2403609bO;
import X.InterfaceC2403509bN;
import com.bytedance.news.common.service.manager.IService;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface IHttpService extends IService {
    InterfaceC2403509bN buildMultipartUpload(String str, String str2, boolean z);

    InterfaceC2403509bN buildMultipartUpload(String str, String str2, boolean z, Map<String, String> map);

    C2403609bO doGet(String str, Map<String, String> map);

    C2403609bO doPost(String str, byte[] bArr, Map<String, String> map);

    C2403609bO uploadFiles(String str, List<File> list, Map<String, String> map);
}
