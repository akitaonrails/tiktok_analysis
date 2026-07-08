package com.ss.android.ugc.aweme.port.internal;

import X.AbstractC1387200mCc;
import X.C0CNO;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1397950mTx;
import X.C1430810nKx;
import X.C1434650nR9;
import X.C1434900nRY;
import X.C1440005kM;
import X.C1445960njO;
import X.C1445970njP;
import X.C1445990njR;
import X.C1446010njT;
import X.C1AF0;
import X.C201955140j;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C830690WiJ;
import X.InterfaceC1433360nP4;
import X.InterfaceC1445980njQ;
import Y.AObjectS204S0300000_22;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.services.video.ICreativePageService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public class MainActivityCallback implements InterfaceC1433360nP4<CreateBaseAwemeResponse>, GenericLifecycleObserver {
    public InterfaceC1445980njQ LL;
    public C1445960njO LLILLJJLI;
    public final IAVPublishService LLILLL;
    public final PublishModel LLILZ;
    public final boolean LLILZIL;
    public final C1445990njR LLILZLL;
    public final AbstractC1387200mCc LLIZ;

    @Override // X.InterfaceC1433360nP4
    public final void LIZLLL(String str) {
    }

    @Override // X.InterfaceC1433360nP4
    public final void LJ() {
        Publish.isInPublish = false;
        LJI("onCancel");
        if (this.LLILLJJLI == null || this.LL == null) {
            return;
        }
        LJI("mPublishCallback onCancel");
    }

    @Override // X.InterfaceC1433360nP4
    public final void LJFF(int i, C1434900nRY c1434900nRY) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        AbstractC1387200mCc abstractC1387200mCc = this.LLIZ;
        if (abstractC1387200mCc != null && (abstractC1387200mCc instanceof C1397950mTx) && ((ICreativePageService) ServiceManager.get().getService(ICreativePageService.class)).isPublishPage(((C1397950mTx) abstractC1387200mCc).LIZLLL)) {
            return;
        }
        InterfaceC1445980njQ interfaceC1445980njQ = this.LL;
        if (interfaceC1445980njQ != null) {
            interfaceC1445980njQ.LIZ(this);
        }
        this.LL = null;
        this.LLILLJJLI = null;
    }

    public MainActivityCallback(final PublishModel publishModel) {
        this.LLILZLL = new C1445990njR();
        this.LLILZ = publishModel;
        this.LLILLJJLI = new C1445960njO();
        String str = publishModel.creationId;
        String str2 = publishModel.shootWay;
        C1445970njP c1445970njP = new C1445970njP(2);
        c1445970njP.LJIIL = str;
        c1445970njP.LJIIIIZZ = str2;
        C1440005kM.LIZ(c1445970njP);
        this.LLILLL = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        this.LL = new InterfaceC1445980njQ() { // from class: X.0njN
            @Override // X.InterfaceC1445980njQ
            public final BaseShortVideoContext getArgs() {
                return publishModel.editModel;
            }

            @Override // X.InterfaceC1445980njQ
            public final int getVideoType() {
                return publishModel.videoType;
            }

            @Override // X.InterfaceC1445980njQ
            public final void LIZ(InterfaceC1433360nP4 interfaceC1433360nP4) {
                this.LIZIZ.LLILLL.removePublishCallback(interfaceC1433360nP4);
            }
        };
    }

    public final void LJI(String str) {
        C201955140j.LIZIZ("MainActivityCallback", str);
    }

    public MainActivityCallback(AbstractC1387200mCc abstractC1387200mCc, String str) {
        this(abstractC1387200mCc, Boolean.FALSE, str);
    }

    @Override // X.InterfaceC1433360nP4
    public final void LIZIZ(C1434650nR9 c1434650nR9, PublishModel publishModel) {
        InterfaceC1445980njQ interfaceC1445980njQ;
        Publish.isInPublish = false;
        LJI("onError");
        if (this.LLILLJJLI != null && (interfaceC1445980njQ = this.LL) != null) {
            BaseShortVideoContext args = interfaceC1445980njQ.getArgs();
            if (publishModel != null) {
                args = publishModel.editModel;
            }
            C1445960njO c1445960njO = this.LLILLJJLI;
            int videoType = this.LL.getVideoType();
            c1445960njO.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onError ");
            sbLIZ.append(videoType);
            sbLIZ.append(" and args is ");
            sbLIZ.append(args);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            Activity activityLIZ = C1445960njO.LIZ();
            if (activityLIZ != null && !c1434650nR9.isDiscard()) {
                C1440005kM.LIZ(new C1446010njT(1, null));
                String errorMsg = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getErrorMsg(activityLIZ, c1434650nR9, activityLIZ.getString(R.string.rn4));
                Pair<Boolean, String> pairRetrieveServerErrorInfo = c1434650nR9.retrieveServerErrorInfo();
                C1445970njP c1445970njP = new C1445970njP(null, 9, 99, errorMsg);
                c1445970njP.LJFF = c1434650nR9;
                c1445970njP.LJ = c1434650nR9.isRecover();
                c1445970njP.LJI = pairRetrieveServerErrorInfo.getFirst().booleanValue();
                c1445970njP.LJIIJJI = publishModel;
                if (c1445960njO.LIZIZ().booleanValue()) {
                    c1445970njP.LJIIIZ = true;
                }
                if (args instanceof BaseShortVideoContext) {
                    c1445970njP.LJIIJ = args.getDraftPrimaryKey();
                    String creationId = args.getCreationId();
                    c1445970njP.LJIIL = creationId;
                    if (creationId != null) {
                        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().markPublishFailed(c1445970njP.LJIIL);
                    }
                }
                C1440005kM.LIZIZ(c1445970njP);
                if (!c1445960njO.LIZIZ().booleanValue() && c1445960njO.LIZJ(args).booleanValue() && !ComplianceServiceProvider.LJFF().LIZJ(1) && c1434650nR9.getOriginErrorCode() != 3013046 && c1434650nR9.getOriginErrorCode() != 3013045 && (!(c1434650nR9 instanceof C1430810nKx) || !publishModel.isStoryPublish)) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIJ(errorMsg);
                    c1389890mGx.LJIIJJI();
                }
            }
            LJI("mPublishCallback onError");
        }
        InterfaceC1445980njQ interfaceC1445980njQ2 = this.LL;
        if (interfaceC1445980njQ2 != null) {
            interfaceC1445980njQ2.LIZ(this);
        }
        this.LL = null;
        this.LLILLJJLI = null;
    }

    public MainActivityCallback(AbstractC1387200mCc abstractC1387200mCc, Boolean bool, String str) {
        this.LLILZLL = new C1445990njR();
        IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        this.LLILLL = iAVPublishServicePublishService;
        PublishModel publishModel = iAVPublishServicePublishService.getPublishModel(str);
        this.LLILZ = publishModel;
        if (abstractC1387200mCc == null) {
            return;
        }
        if (publishModel == null) {
            Activity activityLIZ = C1388190mED.LIZ(abstractC1387200mCc.LIZIZ());
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131834366);
                c1389890mGx.LJIIJJI();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MainActivityCallback getPublishModelFailed publishId:");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C201955140j.LJII(C830690WiJ.LIZIZ, strLIZIZ);
            C1AF0.LIZJ(strLIZIZ);
            return;
        }
        if (!iAVPublishServicePublishService.tryRegisterHomePageUICallback(abstractC1387200mCc, str)) {
            return;
        }
        this.LLILZIL = true;
        this.LLIZ = abstractC1387200mCc;
        C0CNO.LIZLLL(0L, new AObjectS204S0300000_22(this, str, abstractC1387200mCc, bool, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bf  */
    @Override // X.InterfaceC1433360nP4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(final com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse r21, boolean r22, com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r23) {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.port.internal.MainActivityCallback.LIZJ(com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse, boolean, com.ss.android.ugc.aweme.shortvideo.publish.PublishModel):void");
    }
}
