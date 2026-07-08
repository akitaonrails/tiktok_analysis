package com.ss.android.ugc.aweme.base.component;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.C08CS;
import X.C0XQ7;
import X.C10ZL;
import X.C1191260h6a;
import X.C1202210hOF;
import X.C1336205Ku;
import X.C1365290ldH;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1428470nHB;
import X.C1445970njP;
import X.C14EU;
import X.C1593640rZa;
import X.C1593730rZj;
import X.C1906580ziK;
import X.C19EG;
import X.C1ER1;
import X.C201955140j;
import X.C2211631BhB;
import X.C2277881EDy;
import X.C2344809Gs;
import X.C281310B0v;
import X.C343710Ddh;
import X.C520120KaY;
import X.C591970NJr;
import X.C621180OYa;
import X.C729510SjV;
import X.C7823033t;
import X.C786410Ut5;
import X.DialogC1232350iAr;
import X.InterfaceC1191270h6b;
import X.InterfaceC1238780iLE;
import X.InterfaceC1711206n0;
import X.InterfaceC1914010zuJ;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS30S0400000_22;
import Y.ARunnableS75S0200000_6;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.capcutpromotion.CapcutPromotionPopupServiceImpl;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.tangram.TangramTempModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.ss.ugc.aweme.creation.base.PublishPushConfigModel;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public class EventActivityComponent implements GenericLifecycleObserver {
    public static DialogC1232350iAr LLILZLL;
    public InterfaceC1238780iLE LL;
    public final AbstractC1387200mCc LLILLJJLI;
    public final C19EG LLILLL;
    public String LLILZ = "others";
    public InterfaceC1191270h6b LLILZIL;

    public final void LJFF() {
        if ("others".equals(this.LLILZ)) {
            if (((IFriendsFeedService) ServiceManager.get().getService(IFriendsFeedService.class)).l2()) {
                this.LLILZ = "homepage_friends";
                return;
            }
            C1593640rZa.LIZ.getClass();
            if (C1593640rZa.LIZIZ()) {
                this.LLILZ = "homepage_nearby";
            } else if (C1593640rZa.LIZ()) {
                this.LLILZ = "homepage_follow";
            } else {
                this.LLILZ = "others";
            }
        }
    }

    public static void LIZJ() {
        Object objLJFF = EventBus.LIZLLL().LJFF(C1445970njP.class);
        if (objLJFF != null) {
            EventBus.LIZLLL().LJIL(objLJFF);
        }
    }

    public EventActivityComponent(AbstractC1387200mCc abstractC1387200mCc) {
        this.LLILLJJLI = abstractC1387200mCc;
        this.LLILLL = C1388190mED.LIZIZ(abstractC1387200mCc.LIZIZ());
    }

    public final boolean LIZ(C1445970njP c1445970njP) {
        TangramTempModel tangramTempModel;
        PublishPushConfigModel publishPushConfigModel;
        BaseShortVideoContext baseShortVideoContext = c1445970njP.LJIIJJI.editModel;
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (tangramTempModel = ((VideoPublishEditModelKt) baseShortVideoContext).getCreativeModel().tangramTempModel) != null && (publishPushConfigModel = tangramTempModel.publishPushConfigModel) != null) {
            int i = c1445970njP.LIZ;
            if (i == 10) {
                if (!TextUtils.isEmpty(publishPushConfigModel.getPublishSuccessToast())) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL);
                    c1389890mGx.LJIIJ(tangramTempModel.publishPushConfigModel.getPublishSuccessToast());
                    c1389890mGx.LJIIJJI();
                    return true;
                }
            } else if (i == 9 && !TextUtils.isEmpty(publishPushConfigModel.getPublishFailedToast())) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(this.LLILLL);
                c1389890mGx2.LJIIJ(tangramTempModel.publishPushConfigModel.getPublishFailedToast());
                c1389890mGx2.LJIIJJI();
                return true;
            }
        }
        return false;
    }

    @C14EU(sticky = true)
    public void onNotificationRetry(C7823033t c7823033t) {
        AbstractC1387200mCc abstractC1387200mCc = this.LLILLJJLI;
        if (abstractC1387200mCc != null && (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0)) {
            new MainActivityCallback(abstractC1387200mCc, c7823033t.LIZ);
            EventBus.LIZLLL().LJIL(c7823033t);
        }
    }

    @C14EU(sticky = true)
    public void onPoiVideoPublish(C1202210hOF c1202210hOF) {
        IPoiService iPoiService = (IPoiService) ServiceManager.get().getService(IPoiService.class);
        if (!iPoiService.LLFFF(c1202210hOF.LIZ, c1202210hOF.LIZIZ)) {
            return;
        }
        EventBus.LIZLLL().LJIL(c1202210hOF);
        AbstractC1387200mCc abstractC1387200mCc = this.LLILLJJLI;
        C19EG c19eg = this.LLILLL;
        if (abstractC1387200mCc != null && !C520120KaY.LIZ(abstractC1387200mCc) && c19eg != null && (c19eg instanceof BaseActivity) && (!c19eg.isDestroyed())) {
            if (((IFriendsFeedService) ServiceManager.get().getService(IFriendsFeedService.class)).l2()) {
                this.LLILZ = "homepage_friends";
            } else {
                C1593640rZa.LIZ.getClass();
                if (C1593640rZa.LIZIZ()) {
                    this.LLILZ = "homepage_nearby";
                } else if (C1593640rZa.LIZ()) {
                    this.LLILZ = "homepage_follow";
                } else {
                    this.LLILZ = "others";
                }
            }
            InterfaceC1191270h6b interfaceC1191270h6b = this.LLILZIL;
            if (interfaceC1191270h6b != null) {
                int iLJIIIZ = interfaceC1191270h6b.LJIIIZ();
                if (iLJIIIZ == 1 || iLJIIIZ == 3 || iLJIIIZ == 4) {
                    return;
                }
            } else {
                this.LLILZIL = iPoiService.LJJIJIL(c1202210hOF.LIZ);
            }
            if (iPoiService.LJLJI()) {
                return;
            }
            PoiData poiData = c1202210hOF.LIZ;
            LJFF();
            this.LLILZIL.LJIIJ(c19eg, abstractC1387200mCc, poiData, this.LLILZ, null);
        }
    }

    @C14EU(priority = -1, sticky = true)
    public void onPublishStatus(C1445970njP c1445970njP) {
        String strLLIFFJFJJ;
        IPoiService iPoiService = (IPoiService) ServiceManager.get().getService(IPoiService.class);
        if (iPoiService.LLFFF(c1445970njP.LIZJ, c1445970njP.LJIIIIZZ) && (strLLIFFJFJJ = iPoiService.LLIFFJFJJ((Aweme) c1445970njP.LIZJ)) != null) {
            C1191260h6a c1191260h6a = InterfaceC1191270h6b.LJJLIIIJILLIZJL;
            InterfaceC1191270h6b interfaceC1191270h6b = this.LLILZIL;
            c1191260h6a.getClass();
            Integer num = (Integer) ((LinkedHashMap) C1191260h6a.LIZIZ).get(strLLIFFJFJJ);
            if (num != null) {
                if (interfaceC1191270h6b != null) {
                    if (num.intValue() != System.identityHashCode(interfaceC1191270h6b)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        AbstractC1387200mCc abstractC1387200mCc = this.LLILLJJLI;
        C19EG c19eg = this.LLILLL;
        if (abstractC1387200mCc != null && !C520120KaY.LIZ(abstractC1387200mCc) && c19eg != null && (c19eg instanceof BaseActivity) && (!c19eg.isDestroyed())) {
            if (C1ER1.LIZIZ.H(c19eg, this.LLILLJJLI, c1445970njP)) {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().setPublishStatus(c1445970njP.LIZ);
                return;
            }
            int i = c1445970njP.LIZ;
            if (i == 12) {
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ != null && abstractC1387200mCc.LIZ == abstractC1387200mCcLIZIZ.LIZ) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL);
                    c1389890mGx.LJIIIZ(2131834704);
                    c1389890mGx.LJIIJJI();
                }
                C2344809Gs.LJI(new Exception(c1445970njP.toString()));
            } else if (i == 9) {
                if (!LIZ(c1445970njP)) {
                    BaseShortVideoContext baseShortVideoContext = c1445970njP.LJIIJJI.editModel;
                    if ((baseShortVideoContext instanceof VideoPublishEditModel) && C1428470nHB.LJJJLL((VideoPublishEditModel) baseShortVideoContext)) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(this.LLILLL);
                        c1389890mGx2.LJIIIZ(2131824807);
                        c1389890mGx2.LJIIJJI();
                        LIZJ();
                    } else {
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ2 != null && abstractC1387200mCc.LIZ == abstractC1387200mCcLIZIZ2.LIZ && c1445970njP.LJIIIZ) {
                            String string = c1445970njP.LIZLLL;
                            if (TextUtils.isEmpty(string)) {
                                string = c19eg.getResources().getString(R.string.rn4);
                            }
                            C786410Ut5.re(Toast.makeText(this.LLILLL, string, 1));
                        }
                    }
                }
                C2344809Gs.LJI(new Exception(c1445970njP.toString()));
            } else if (i == 10) {
                ARunnableS30S0400000_22 aRunnableS30S0400000_22 = new ARunnableS30S0400000_22(this, c19eg, c1445970njP, abstractC1387200mCc, 0);
                CreateBaseAwemeResponse createBaseAwemeResponse = c1445970njP.LJII;
                if ((createBaseAwemeResponse instanceof CreateAwemeResponse) && ((CreateAwemeResponse) createBaseAwemeResponse).couponInfo != null) {
                    ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJLL();
                } else {
                    aRunnableS30S0400000_22.run();
                }
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().setPublishStatus(c1445970njP.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(android.app.Activity r5, java.lang.String r6) {
        /*
            android.view.Window r0 = r5.getWindow()
            r3 = 0
            if (r0 == 0) goto L87
            android.view.View r4 = r0.getDecorView()
            if (r4 == 0) goto L87
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r4.getGlobalVisibleRect(r2)
            int r1 = r2.bottom
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L87
            r0.getGlobalVisibleRect(r2)
            int r0 = r2.bottom
            int r1 = r1 - r0
            int r1 = java.lang.Math.max(r1, r3)
        L2a:
            boolean r0 = X.C14LC.LJIIIZ
            X.14LC r0 = X.C309690CBz.LIZ
            r0.getClass()
            int r0 = X.C14LC.LIZIZ()
            int r1 = r1 + r0
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = X.C418440Gaw.LIZ(r0)
            int r1 = r1 + r0
            X.0mGz r2 = new X.0mGz
            r2.<init>(r5)
            r0 = 2131886953(0x7f120369, float:1.94085E38)
            r2.LJI(r0)
            X.0lWB r0 = r2.LIZ
            r0.LIZIZ = r3
            r0 = 2131858560(0x7f119480, float:1.9350912E38)
            r2.LJIIIZ(r0)
            X.0lWB r0 = r2.LIZ
            r0.LIZLLL = r3
            r2.LIZIZ(r1)
            Y.ACListenerS77S1100000_1 r1 = new Y.ACListenerS77S1100000_1
            r0 = 0
            r1.<init>(r5, r6, r0)
            X.0lWB r0 = r2.LIZ
            r0.LJIIIIZZ = r1
            Y.AObjectS74S0000000_24 r1 = new Y.AObjectS74S0000000_24
            r0 = 0
            r1.<init>(r0)
            r2.LIZLLL(r1)
            r2.LJIIJJI()
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r1 = "banner_name"
            java.lang.String r0 = "wwa_auto_submit_notice"
            r2.LJIIIIZZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "banner_show"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L87:
            r1 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.component.EventActivityComponent.LJ(android.app.Activity, java.lang.String):void");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        InterfaceC1238780iLE interfaceC1238780iLE;
        int i = C08CS.LIZ[event.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i == 4 && (interfaceC1238780iLE = this.LL) != null) {
                    interfaceC1238780iLE.onDismiss();
                    return;
                }
                return;
            }
            EventBus.LIZLLL().LJJI(this);
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    public static void LIZLLL(final C19EG c19eg, Aweme aweme, PublishModel publishModel) {
        if (C729510SjV.LJJ(aweme) && C281310B0v.LIZ()) {
            return;
        }
        if (publishModel == null || publishModel.storyGroupPublishModel == null || ((IExternalService) ServiceManager.get().getService(IExternalService.class)).storyService().storyPublishService().getGroupScheduleService().isAllTaskInGroupPublishFinished(publishModel.storyGroupPublishModel)) {
            if (C1365290ldH.LIZ()) {
                int privateStatus = AwemeExtKt.getStatusSafety(aweme).getPrivateStatus();
                int i = 2131845118;
                if (privateStatus != 0) {
                    if (privateStatus != 1) {
                        if (privateStatus != 2) {
                            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                            c1389890mGx.LJIIIZ(2131845118);
                            c1389890mGx.LJIIJJI();
                        } else {
                            C1389890mGx c1389890mGx2 = new C1389890mGx(c19eg);
                            c1389890mGx2.LJIIIZ(2131845120);
                            c1389890mGx2.LJIIJJI();
                            return;
                        }
                    } else {
                        C1389890mGx c1389890mGx3 = new C1389890mGx(c19eg);
                        c1389890mGx3.LJIIIZ(2131845121);
                        c1389890mGx3.LJIIJJI();
                        return;
                    }
                } else {
                    C1389890mGx c1389890mGx4 = new C1389890mGx(c19eg);
                    if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isSecret()) {
                        i = 2131845119;
                    }
                    c1389890mGx4.LJIIIZ(i);
                    c1389890mGx4.LJIIJJI();
                    return;
                }
            } else {
                C1389890mGx c1389890mGx5 = new C1389890mGx(c19eg);
                c1389890mGx5.LJIIIZ(2131849119);
                c1389890mGx5.LJIIJJI();
            }
            if (ChannelsAuthRefactorExp.INSTANCE.enabled()) {
                String strLIZ = C10ZL.LIZ(C2211631BhB.LJII());
                UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("publish_finish");
                unifiedAuthPopupConfigLIZJ.setSceneId("publish_finish_show_lightening_popup");
                unifiedAuthPopupConfigLIZJ.setEnterFrom(strLIZ);
                unifiedAuthPopupConfigLIZJ.setSysPage("publish_finish");
                List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
                if (list != null && !list.isEmpty()) {
                    ((PopupInstanceConfig) ListProtector.get(unifiedAuthPopupConfigLIZJ.popupInstances, 0)).setPopupCombinationType(3);
                }
                ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(c19eg, null, unifiedAuthPopupConfigLIZJ);
                return;
            }
            ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIJ(c19eg, "publish_finish", new InterfaceC1914010zuJ() { // from class: X.0TkJ
                @Override // X.InterfaceC1914010zuJ
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1914010zuJ
                public final void LIZ() {
                    String strLIZ2 = C10ZL.LIZ(C2211631BhB.LJII());
                    String strLIZIZ = AddOptionForGuidanceExp.LIZIZ("publish");
                    if (TextUtils.isEmpty(strLIZIZ)) {
                        strLIZIZ = "normal";
                    }
                    C19212010Ec.LIZJ.LJIILJJIL(c19eg, new C1917290zzb(strLIZIZ, strLIZ2, "", "publish", "", "bottom", 0L, 0L, "", null, null, ""));
                }
            });
        }
    }

    public final void LIZIZ(C1445970njP c1445970njP, C19EG c19eg, AbstractC1387200mCc abstractC1387200mCc) {
        Aweme aweme;
        String strCQ2;
        String strCQ22;
        if (!C1593730rZj.LIZIZ.LJII()) {
            return;
        }
        CapcutPromotionPopupServiceImpl.LIZIZ().LIZ(c1445970njP.LJIIJJI, (Aweme) c1445970njP.LIZJ);
        if (!C621180OYa.LIZIZ.LJJLIIIJJIZ(c19eg, c1445970njP)) {
            ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class);
            CreateBaseAwemeResponse createBaseAwemeResponse = c1445970njP.LJII;
            if (createBaseAwemeResponse instanceof CreateAwemeResponse) {
                aweme = ((CreateAwemeResponse) createBaseAwemeResponse).aweme;
            } else {
                aweme = null;
            }
            if (!iCommercePromoteService.LJJIIJ(aweme)) {
                IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
                if (iAVPublishServicePublishService.hitRepostPushAfterPostSuccess(c1445970njP)) {
                    iAVPublishServicePublishService.sendLocalPushAfterPostSuccess(c1445970njP);
                    return;
                }
                if (!iAVPublishServicePublishService.shouldShowSharePopupAfterPostSuccess(c1445970njP)) {
                    return;
                }
                CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) c1445970njP.LJII;
                Aweme aweme2 = createAwemeResponse.aweme;
                ShareService shareService = C621180OYa.LIZ;
                LifecycleOwner lifecycleOwnerLJFF = abstractC1387200mCc.LJFF();
                Aweme aweme3 = (Aweme) c1445970njP.LIZJ;
                String[] strArr = new String[1];
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILLL);
                String str = "";
                if (c19egLIZIZ == null || (strCQ2 = C343710Ddh.LIZ(c19egLIZIZ).CQ2()) == null) {
                    strCQ2 = "";
                }
                strArr[0] = strCQ2;
                this.LL = shareService.LJJLIIIJ(c19eg, lifecycleOwnerLJFF, aweme3, createAwemeResponse, strArr);
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
                final long lastTimeShowPublishSuccessWindow = c2277881EDy.getLastTimeShowPublishSuccessWindow(curUserId, 0L);
                this.LL.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0iLD
                    /* JADX WARN: Type inference failed for: r1v5, types: [X.0iAr, X.12Gs, android.app.Dialog] */
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        EventActivityComponent eventActivityComponent = this.LL;
                        long j = lastTimeShowPublishSuccessWindow;
                        eventActivityComponent.getClass();
                        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                        if ((!C2277881EDy.LIZIZ.userNameLegitimate() || (curUser != null && curUser.nicknameUpdateReminder())) && !ComplianceServiceProvider.LJFF().LIZJ(4)) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis > j) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(jCurrentTimeMillis);
                                calendar.set(11, 0);
                                calendar.set(12, 0);
                                calendar.set(13, 0);
                                calendar.set(14, 0);
                                if (calendar.getTimeInMillis() >= j) {
                                    if (!curUser.nicknameUpdateReminder()) {
                                        ((IMainService) ServiceManager.get().getService(IMainService.class)).tryShowIllegalUsernameDialog("publish", null, null);
                                        return;
                                    }
                                    Activity activityLJFF = C2214201BlK.LJFF();
                                    if (activityLJFF != null) {
                                        DialogC1232350iAr dialogC1232350iAr = EventActivityComponent.LLILZLL;
                                        if (dialogC1232350iAr == null || !dialogC1232350iAr.isShowing()) {
                                            ?? r1 = new DialogC1239100iLk(activityLJFF, curUser) { // from class: X.0iAr
                                                public final User LLILZ;
                                                public final int LLILZIL = 1;
                                                public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 30));
                                                public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 31));
                                                public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 32));
                                                public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 28));
                                                public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 29));

                                                @Override // android.app.Dialog
                                                public final void onCreate(Bundle bundle) {
                                                    UrlModel avatarMedium;
                                                    super.onCreate(bundle);
                                                    setContentView(R.layout.d5_);
                                                    View viewFindViewById = findViewById(R.id.coj);
                                                    C384050F3z c384050F3z = new C384050F3z();
                                                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
                                                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
                                                    viewFindViewById.setBackground(c384050F3z.LIZ(getContext()));
                                                    C427690Gpr.LJ(viewFindViewById, C418440Gaw.LIZIZ(2));
                                                    setCanceledOnTouchOutside(false);
                                                    setCancelable(false);
                                                    User user = this.LLILZ;
                                                    if (user != null) {
                                                        avatarMedium = user.getAvatarMedium();
                                                    } else {
                                                        avatarMedium = null;
                                                    }
                                                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarMedium));
                                                    C1331750klB c1331750klB = new C1331750klB();
                                                    c1331750klB.LIZ = true;
                                                    c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
                                                    c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLILZLL.getValue());
                                                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                                                    TextView textView = (TextView) this.LLIZLLLIL.getValue();
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append('@');
                                                    sbLIZ.append(C10EU.LIZJ(user));
                                                    textView.setText(C2188811AlT.LIZIZ(sbLIZ));
                                                    C786410Ut5.Q7((ImageView) this.LLIZ.getValue(), new ACListenerS154S0100000_19(this, 25));
                                                    TextView textView2 = (TextView) this.LLJ.getValue();
                                                    HandlerHook.viewPost(textView2, new ARunnableS75S0200000_6(this, textView2, 16));
                                                    C786410Ut5.T7((TextView) this.LLJ.getValue(), new ACListenerS154S0100000_19(this, 26));
                                                    if (this.LLILZIL == 1) {
                                                        ((TextView) this.LLJI.getValue()).setText(getContext().getString(2131828496));
                                                    }
                                                }

                                                {
                                                    this.LLILZ = curUser;
                                                }
                                            };
                                            EventActivityComponent.LLILZLL = r1;
                                            r1.show();
                                            C785410UrT.LIZIZ(r1);
                                            PopupMonitorServiceImpl.LIZ.getClass();
                                            PopupMonitorServiceImpl.LJJJ(r1);
                                            C816490W1f.LIZ(r1);
                                            C20684815ws.onEventV3("modify_username_notify");
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
                if (!C591970NJr.LIZIZ().LIZIZ(aweme2) || !C1336205Ku.LIZJ().LIZJ()) {
                    this.LL.show();
                }
                if (aweme2 != null && aweme2.getAid() != null) {
                    ShareExtService shareExtService = (ShareExtService) ServiceManager.get().getService(ShareExtService.class);
                    String aid = aweme2.getAid();
                    C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(this.LLILLL);
                    if (c19egLIZIZ2 != null && (strCQ22 = C343710Ddh.LIZ(c19egLIZIZ2).CQ2()) != null) {
                        str = strCQ22;
                    }
                    shareExtService.LJJIL(aid, str, aweme2);
                }
                c2277881EDy.setLastTimeShowPublishSuccessWindow(curUserId, System.currentTimeMillis());
                C201955140j.LIZ("PublishDurationMonitor MANUAL_END showSuccessWindow");
            }
        }
    }
}
