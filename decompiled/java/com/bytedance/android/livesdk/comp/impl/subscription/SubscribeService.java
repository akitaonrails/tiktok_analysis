package com.bytedance.android.livesdk.comp.impl.subscription;

import X.C01GW;
import X.C0JT9;
import X.C0KBB;
import X.C0KQ0;
import X.C1108110ewT;
import X.C1109330eyR;
import X.C1161920gLG;
import X.C1ER6;
import X.C1ER7;
import X.C1ER8;
import X.C1ER9;
import X.C1ERA;
import X.C1ERB;
import X.C1ERC;
import X.C1ERD;
import X.C1ERE;
import X.C1ERF;
import X.C452501pT;
import X.C490490JLj;
import X.C494790Jan;
import X.C517110KPt;
import X.C517120KPu;
import X.InterfaceC20309914dV;
import android.os.Message;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.common.utility.collection.WeakHandler;

/* JADX INFO: loaded from: classes36.dex */
public class SubscribeService implements ISubscribeService, WeakHandler.IHandler {
    public final C01GW LL = C452501pT.LIZIZ(new C1ERB());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1ERD());
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1ER9());
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1ERC());
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1ER8());
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C1ER7());
    public final C01GW LLIZ = C452501pT.LIZIZ(new C1ER6(this));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1ERA());
    public final C01GW LLJ = C452501pT.LIZIZ(new C1ERE());

    @Override // com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService
    public final void Go0() {
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService
    public final C490490JLj Dj() {
        return (C490490JLj) this.LL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C517110KPt ei() {
        return (C517110KPt) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C0KBB Ae() {
        return (C0KBB) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C1108110ewT pa() {
        return (C1108110ewT) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService
    public final InterfaceC20309914dV LY() {
        return (InterfaceC20309914dV) this.LLJ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService
    public final C1ERF cw0() {
        return (C1ERF) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService
    public final C494790Jan w2() {
        return (C494790Jan) this.LLILLL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService
    public final C0JT9 xf() {
        return (C0JT9) this.LLILZ.getValue();
    }

    public final void onInit() {
        if (LiveServiceManagerOptSetting.enable()) {
            return;
        }
        C517110KPt c517110KPtEi = ei();
        c517110KPtEi.getClass();
        SubOnlyLiveSettingDialogNew.LLJLL.getClass();
        SubOnlyLiveSettingDialogNew.LLJZ.add(new C0KQ0(c517110KPtEi));
        pa().LIZ = true;
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        iPublicScreenService.jc0(new C1109330eyR());
        iPublicScreenService.bQ1(10, new C517120KPu());
    }
}
