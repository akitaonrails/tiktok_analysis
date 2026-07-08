package com.ss.android.ugc.aweme.api.component.videoshrink;

import X.C0DHT;
import X.C1024090ckx;
import X.C13LQ;
import X.InterfaceC1024080ckw;
import X.InterfaceC1036270d4b;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.IAdOpenHelper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedVideoShrinkServiceImpl implements IFeedVideoShrinkService {
    public InterfaceC1036270d4b LIZ;
    public InterfaceC1024080ckw LIZIZ;

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService
    public final boolean I3() {
        InterfaceC1024080ckw interfaceC1024080ckw;
        return (this.LIZ == null || (interfaceC1024080ckw = this.LIZIZ) == null || !interfaceC1024080ckw.I3()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService
    public final boolean LLJLILLLLZIIL() {
        InterfaceC1024080ckw interfaceC1024080ckw = this.LIZIZ;
        if (interfaceC1024080ckw != null) {
            return interfaceC1024080ckw.LLJLILLLLZIIL();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService
    public final void LLL() {
        InterfaceC1024080ckw interfaceC1024080ckw = this.LIZIZ;
        if (interfaceC1024080ckw != null) {
            interfaceC1024080ckw.LJJIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService
    public final InterfaceC1036270d4b LLJLL() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService
    public final boolean LLJZ(int i) {
        if (C0DHT.LIZJ) {
            return false;
        }
        if (C13LQ.LJJIJIIJI(Integer.valueOf(i), new Integer[]{1, 2, 40, 64, 39, 3, 66, 65, 70, 87, 94}) < 0 && !((IAdOpenHelper) ServiceManager.get().getService(IAdOpenHelper.class)).LIZIZ(i)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService
    public final boolean LLLF(String str) {
        if (str == null) {
            return false;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Object[] objArr = C1024090ckx.LIZ;
        Object[] objArr2 = (Object[]) settingsManagerLIZLLL.LJIIIIZZ("iab_watch_while_loading_fe_refers", String[].class, objArr);
        if (objArr2 != null) {
            objArr = objArr2;
        }
        if (C13LQ.LJJIJIIJI(str, objArr) < 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService
    public final void LLJLLIL(InterfaceC1036270d4b interfaceC1036270d4b, boolean z) {
        if (!z && this.LIZ != null) {
            return;
        }
        this.LIZ = interfaceC1036270d4b;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService
    public final void LLJLLL(JSONObject jSONObject, SparkContext sparkContext) {
        InterfaceC1024080ckw interfaceC1024080ckw = this.LIZIZ;
        if (interfaceC1024080ckw != null) {
            interfaceC1024080ckw.jk(jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService
    public final void LLJZIJLIL(InterfaceC1024080ckw interfaceC1024080ckw, boolean z) {
        if (!z && this.LIZIZ != null) {
            return;
        }
        this.LIZIZ = interfaceC1024080ckw;
    }
}
