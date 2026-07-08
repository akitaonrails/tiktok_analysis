package com.bytedance.globalpayment.service.manager.iap;

import X.AbstractC1794360wnK;
import X.AbstractC1794600wni;
import X.C1793950wmf;
import X.EnumC1791830wjF;

/* JADX INFO: loaded from: classes28.dex */
public interface IapExternalService extends IapService {
    void executeUnUploadTokenOrder(EnumC1791830wjF enumC1791830wjF, AbstractC1794600wni abstractC1794600wni, String str);

    AbstractC1794360wnK getNextState(AbstractC1794360wnK abstractC1794360wnK);

    void init();

    void onOrderTimeout(C1793950wmf c1793950wmf);

    void tryRestoreUnAckOrder(EnumC1791830wjF enumC1791830wjF, String str);
}
