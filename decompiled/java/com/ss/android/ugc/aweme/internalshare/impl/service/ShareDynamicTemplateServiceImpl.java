package com.ss.android.ugc.aweme.internalshare.impl.service;

import X.C13026057w;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask;
import com.ss.android.ugc.aweme.internalshare.api.service.IShareDynamicTemplateService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareDynamicTemplateServiceImpl implements IShareDynamicTemplateService {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013e A[EDGE_INSN: B:104:0x013e->B:71:0x013e BREAK  A[LOOP:1: B:57:0x0116->B:105:0x0116], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a3  */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List r15, X.InterfaceC1364105Vn r16, org.json.JSONObject r17) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.service.ShareDynamicTemplateServiceImpl.LIZIZ(java.util.List, X.05Vn, org.json.JSONObject):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.internalshare.api.service.IShareDynamicTemplateService
    public final SendMessageTemplateDynamicTask LIZ(String str, String str2, String str3, JSONObject jSONObject) {
        return new SendMessageTemplateDynamicTask(null, new SendMessageEventParcel(str, null, null, null, null, str3, 30), new C13026057w(this, jSONObject, str, str2, null));
    }
}
