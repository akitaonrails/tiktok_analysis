package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AbstractC2361009My;
import X.C05JE;
import X.C05JF;
import X.C09JN;
import X.C0SY7;
import X.C0U3R;
import X.C1041800dDW;
import X.C1076010e6h;
import X.C1106210etP;
import X.C1260910iuv;
import X.C1371710lnd;
import X.C1375460ltg;
import X.C1378280lyE;
import X.C1383370m6R;
import X.C1387050mCN;
import X.C1608506Rn;
import X.C1908890zm3;
import X.C197039127h;
import X.C19EG;
import X.C19ME;
import X.C20639815pc;
import X.C2093608Ic;
import X.C2097608Jq;
import X.C418440Gaw;
import X.C498720Jh8;
import X.C621180OYa;
import X.C814420VxA;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.InterfaceC1362600lYw;
import X.InterfaceC1363540laS;
import X.InterfaceC1368280li6;
import X.InterfaceC1369790lkX;
import X.InterfaceC1372610lp5;
import X.InterfaceC473070Igr;
import X.InterfaceC473650Ihn;
import X.InterfaceC473660Iho;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarNoTitleShareCountEnable;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarUIConfigOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.ScreenshotSharePanelSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplayShareData;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplaySharePackage;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class LiveHostShare implements IHostShare {
    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final String getBundleKey(int i) {
        if (i == 0) {
            return "shared_users_id_list";
        }
        if (i == 1) {
            return "friends_shared_cnt";
        }
        if (i == 2) {
            return "is_create_group_chat";
        }
        if (i == 3) {
            return "batch_share_type";
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final List<Long> getInternalShareSortedUids() {
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
        return iMShareServiceLIZ != null ? iMShareServiceLIZ.getInternalShareSortedUids() : Collections.emptyList();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void refreshScreenShotConfig() {
        IScreenshotService iScreenshotService = (IScreenshotService) PluggableExtentionKt.pluggableSpi(IScreenshotService.class);
        if (iScreenshotService != null) {
            iScreenshotService.LIZJ("live");
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void setScreenShotConfig() {
        IScreenshotService iScreenshotService = C498720Jh8.LIZIZ;
        if (iScreenshotService != null) {
            iScreenshotService.LJI("live", new AbstractC2361009My() { // from class: X.0K8g
                @Override // X.AbstractC2361009My
                public final Map<String, String> mobExtraParams() {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("enter_from", "live");
                    return linkedHashMap;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v39, types: [X.0lfQ] */
                @Override // X.AbstractC2361009My
                public final boolean onShot(String str) {
                    Activity activityLIZ;
                    final Room room;
                    C0IP3 c0ip3LIZIZ;
                    final DataChannel dataChannelProvideDataChannel;
                    TuxSheet tuxSheet;
                    Activity activityLIZIZ;
                    try {
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
                        } else {
                            activityLIZ = null;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1CC2.LIZ("Live showScreenShotShare error", th);
                    }
                    if (!(activityLIZ instanceof C19EG) || ((C19EG) activityLIZ).isFinishing() || ((C19EG) activityLIZ).isDestroyed() || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) == null || (c0ip3LIZIZ = C475510Ikn.LIZIZ((C19EG) activityLIZ)) == null || (dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel()) == null) {
                        return false;
                    }
                    C498720Jh8 c498720Jh8 = C498720Jh8.LIZ;
                    c498720Jh8.getClass();
                    C498720Jh8.LIZIZ(dataChannelProvideDataChannel);
                    ScreenshotSharePanelSetting screenshotSharePanelSetting = ScreenshotSharePanelSetting.INSTANCE;
                    if (screenshotSharePanelSetting.isEnable()) {
                        C498720Jh8.LIZ(dataChannelProvideDataChannel);
                        User owner = room.getOwner();
                        if ((owner != null && owner.getSecret() == 1) || room.disableScreenRecord || ((C19EG) activityLIZ).getRequestedOrientation() == 0) {
                            return false;
                        }
                        HashMap map = new HashMap(C0IJT.LIZ("").LJIIZILJ());
                        WeakReference<TuxSheet> weakReference = C498720Jh8.LIZJ;
                        if (weakReference != null && (tuxSheet = weakReference.get()) != null && tuxSheet.isAdded() && !tuxSheet.isDetached() && !tuxSheet.isRemoving()) {
                            tuxSheet.dismiss();
                        }
                        C2089008Gi c2089008Gi = new C2089008Gi(C481180Itw.LIZIZ(room.getOwner()));
                        c2089008Gi.LIZLLL("enter_from_merge", "share");
                        c2089008Gi.LIZLLL("enter_method", "share");
                        c2089008Gi.LIZJ(UserService.getInstance().user().getCurrentUserId(), "share_from_user_id");
                        C1106200etO c1106200etOLJII = C481180Itw.LJII(room, dataChannelProvideDataChannel, c2089008Gi.LJ(), "live_room_screen_shot", map);
                        c1106200etOLJII.LJJIIJ = "screenshot_popup";
                        final C1106210etP c1106210etP = new C1106210etP(c1106200etOLJII);
                        if (screenshotSharePanelSetting.enableV1()) {
                            c498720Jh8.getClass();
                            return C498720Jh8.LIZLLL((C19EG) activityLIZ, str, c1106210etP, room);
                        }
                        if (screenshotSharePanelSetting.enableV2()) {
                            final C19EG c19eg = (C19EG) activityLIZ;
                            IMSharePanelApi.LIZ.getClass();
                            return C1599690rjL.LIZ().getShareService().LJIILJJIL(c19eg, str, new InterfaceC1366350lez() { // from class: X.0lfQ
                                @Override // X.InterfaceC1366350lez
                                public final SharePackage LIZ() {
                                    return null;
                                }

                                @Override // X.InterfaceC1366350lez
                                public final boolean LIZIZ() {
                                    return false;
                                }

                                @Override // X.InterfaceC1366350lez
                                public final boolean LIZJ() {
                                    return true;
                                }

                                @Override // X.InterfaceC1366350lez
                                public final InterfaceC1366340ley LIZLLL() {
                                    final C1106210etP c1106210etP2 = c1106210etP;
                                    final C19EG c19eg2 = c19eg;
                                    final DataChannel dataChannel = dataChannelProvideDataChannel;
                                    final Room room2 = room;
                                    return new InterfaceC1366340ley() { // from class: X.0lfR
                                        @Override // X.InterfaceC1366340ley
                                        public final void LIZ() {
                                        }

                                        @Override // X.InterfaceC1366340ley
                                        public final void LIZJ() {
                                        }

                                        @Override // X.InterfaceC1366340ley
                                        public final void LJ() {
                                        }

                                        @Override // X.InterfaceC1366340ley
                                        public final void LIZIZ(TuxSheet tuxSheet2) {
                                            C498720Jh8 c498720Jh82 = C498720Jh8.LIZ;
                                            WeakReference<TuxSheet> weakReference2 = new WeakReference<>(tuxSheet2);
                                            c498720Jh82.getClass();
                                            C498720Jh8.LIZJ = weakReference2;
                                        }

                                        @Override // X.InterfaceC1366340ley
                                        public final String LIZLLL(Context context) {
                                            if (context != null) {
                                                return context.getString(2131824837);
                                            }
                                            return null;
                                        }

                                        @Override // X.InterfaceC1366340ley
                                        public final void LJFF(String str2) {
                                            C1106210etP c1106210etP3 = c1106210etP2;
                                            c1106210etP3.LJJLIIJ = str2;
                                            LiveSharePackage liveSharePackageLJIIL = C621180OYa.LIZ.LJIIL(c19eg2, c1106210etP3);
                                            IMSharePanelApi.LIZ.getClass();
                                            InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                                            final C1106210etP c1106210etP4 = c1106210etP2;
                                            final DataChannel dataChannel2 = dataChannel;
                                            final Room room3 = room2;
                                            C786410Ut5.B4(shareService.LJJJJZ(c19eg2, liveSharePackageLJIIL, null, null, true, new InterfaceC1365250ldD() { // from class: X.0lfS
                                                @Override // X.InterfaceC1365250ldD
                                                public final void LIZJ(Dialog dialog, SharePackage sharePackage) {
                                                }

                                                @Override // X.InterfaceC1365250ldD
                                                public final void LIZLLL() {
                                                }

                                                @Override // X.InterfaceC1365250ldD
                                                public final void LJFF(SharePackage sharePackage) {
                                                }

                                                @Override // X.InterfaceC1365250ldD
                                                public final void LJI(SharePackage sharePackage) {
                                                }

                                                @Override // X.InterfaceC1365250ldD
                                                public final void LJII(Dialog dialog, SharePackage sharePackage) {
                                                }

                                                @Override // X.InterfaceC1365250ldD
                                                public final void LJIIIIZZ() {
                                                }

                                                @Override // X.InterfaceC1365250ldD
                                                public final void LJIIIZ(SharePackage sharePackage) {
                                                }

                                                @Override // X.InterfaceC1365250ldD
                                                public final void LIZIZ(HashMap<String, String> map2) {
                                                    C481180Itw.LJ(dataChannel2, map2);
                                                }

                                                @Override // X.InterfaceC1365250ldD
                                                public final void LJIIJ(SharePackage sharePackage, List<? extends IMContact> list) {
                                                    C498720Jh8 c498720Jh82 = C498720Jh8.LIZ;
                                                    C1106210etP c1106210etP5 = c1106210etP4;
                                                    DataChannel dataChannel3 = dataChannel2;
                                                    Room room4 = room3;
                                                    c1106210etP5.getClass();
                                                    Bundle bundle = sharePackage.extras;
                                                    c498720Jh82.getClass();
                                                    C498720Jh8.LIZJ(c1106210etP5, dataChannel3, room4, "chat_merge", bundle);
                                                }
                                            }, false, null, false, C0ZNY.LIZJ(), true, true, Boolean.FALSE, false, false, false, null));
                                        }

                                        @Override // X.InterfaceC1366340ley
                                        public final void LJI(IMContact iMContact, String str2) {
                                            String strLJIIIZ;
                                            ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
                                            if (contactFeatureLIZ == null || (strLJIIIZ = contactFeatureLIZ.LJIIIZ(iMContact)) == null) {
                                                strLJIIIZ = "";
                                            }
                                            if (iMContact != null && !C2093608Ic.LJ(strLJIIIZ)) {
                                                c1106210etP2.LJJLIIIJLLLLLLLZ = strLJIIIZ;
                                            }
                                            final C1106210etP c1106210etP3 = c1106210etP2;
                                            c1106210etP3.LJJLIIJ = str2;
                                            ShareService shareService = C621180OYa.LIZ;
                                            C19EG c19eg3 = c19eg2;
                                            final DataChannel dataChannel2 = dataChannel;
                                            final Room room3 = room2;
                                            shareService.LJJIZ(c19eg3, c1106210etP3, new InterfaceC1372610lp5() { // from class: X.0Jh9
                                                @Override // X.InterfaceC1372610lp5
                                                public final void LIZ(Throwable th2) {
                                                }

                                                @Override // X.InterfaceC1372610lp5
                                                public final /* synthetic */ void LIZLLL(HashMap map2) {
                                                }

                                                @Override // X.InterfaceC1372610lp5
                                                public final /* synthetic */ void LJ(HashMap map2) {
                                                }

                                                @Override // X.InterfaceC1372610lp5
                                                public final /* synthetic */ void LJFF(Dialog dialog) {
                                                }

                                                @Override // X.InterfaceC1372610lp5
                                                public final /* synthetic */ void LJI(Dialog dialog) {
                                                }

                                                @Override // X.InterfaceC1372610lp5
                                                public final /* synthetic */ void LJII() {
                                                }

                                                @Override // X.InterfaceC1372610lp5
                                                public final /* synthetic */ void onDismiss() {
                                                }

                                                @Override // X.InterfaceC1372610lp5
                                                public final /* synthetic */ void onShow(int i) {
                                                }

                                                @Override // X.InterfaceC1372610lp5
                                                public final void LIZIZ(HashMap<String, String> map2) {
                                                    C481180Itw.LJ(dataChannel2, map2);
                                                }

                                                @Override // X.InterfaceC1372610lp5
                                                public final void LIZJ(String str3, String str4, Bundle bundle) {
                                                    C498720Jh8 c498720Jh82 = C498720Jh8.LIZ;
                                                    C1106210etP c1106210etP4 = c1106210etP3;
                                                    DataChannel dataChannel3 = dataChannel2;
                                                    Room room4 = room3;
                                                    c498720Jh82.getClass();
                                                    C498720Jh8.LIZJ(c1106210etP4, dataChannel3, room4, str3, bundle);
                                                }
                                            });
                                        }
                                    };
                                }
                            });
                        }
                    }
                    return false;
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final int getRepostIconRes() {
        InterfaceC1363540laS interfaceC1363540laSE4;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService == null || (interfaceC1363540laSE4 = iLiveOuterService.E4()) == null) {
            return 0;
        }
        return interfaceC1363540laSE4.getRepostIconRes();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final User getShareExternalLinkShareUser(long j) {
        String uid;
        Pair<Long, ? extends com.ss.android.ugc.aweme.profile.model.User> pair = C1378280lyE.LIZJ.LIZ;
        User userLIZLLL = null;
        if (pair != null && pair.getFirst().longValue() == j && (uid = pair.getSecond().getUid()) != null && pair.getFirst().longValue() == CastLongProtector.parseLong(uid)) {
            try {
                userLIZLLL = C20639815pc.LIZLLL(pair.getSecond());
                return userLIZLLL;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return userLIZLLL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void getUrlModelAndShowAnim(final InterfaceC473650Ihn interfaceC473650Ihn) {
        C1041800dDW.LIZ().LIZIZ().LIZLLL(3, new InterfaceC1368280li6() { // from class: X.0etW
            @Override // X.InterfaceC1368280li6
            public final void LIZIZ() {
                interfaceC473650Ihn.getClass();
            }

            @Override // X.InterfaceC1368280li6
            public final void LLJJIJIL(List<IMContact> list) {
                final ArrayList arrayList = new ArrayList();
                for (BaseContact baseContact : (ArrayList) list) {
                    if (baseContact != null && baseContact.getDisplayAvatar() != null) {
                        UrlModel urlModel = new UrlModel();
                        urlModel.uri = baseContact.getDisplayAvatar().getUri();
                        urlModel.urlList = baseContact.getDisplayAvatar().getUrlList();
                        arrayList.add(urlModel);
                    }
                }
                final C1106170etL c1106170etL = (C1106170etL) interfaceC473650Ihn;
                c1106170etL.getClass();
                if (!C086I.LIZIZ(arrayList)) {
                    C1105770esh.LIZ().LIZ(new AbstractC1105780esi() { // from class: X.0etG
                        @Override // X.InterfaceC1105760esg
                        public final void call() {
                            C19EG c19eg;
                            C20743416Fc c20743416Fc;
                            FrameLayout frameLayout;
                            C1106170etL c1106170etL2 = c1106170etL;
                            final C1106110etF c1106110etF = c1106170etL2.LIZIZ;
                            final List list2 = arrayList;
                            long j = c1106170etL2.LIZ;
                            c1106110etF.getClass();
                            C1105740ese c1105740eseLIZ = C1105770esh.LIZ();
                            c1105740eseLIZ.LIZIZ = false;
                            c1105740eseLIZ.LIZLLL = null;
                            c1105740eseLIZ.LIZIZ();
                            if (c1106110etF.LLJJ == null || (c19eg = c1106110etF.LLJ) == null || c19eg.isFinishing()) {
                                return;
                            }
                            if (LiveToolbarNoTitleShareCountEnable.INSTANCE.isEnable() && c1106110etF.LLJJ.getVisibility() == 8) {
                                C786410Ut5.LLJJIJIL(c1106110etF.LLJJ, 0);
                                if (c1106110etF.LJFF() && (frameLayout = c1106110etF.LLLILZJ) != null && (frameLayout instanceof C1103540ep6)) {
                                    ((C1103540ep6) frameLayout).LIZ();
                                }
                                AbstractC1106180etM abstractC1106180etM = c1106110etF.LLJJJJJIL;
                                if (abstractC1106180etM != null && abstractC1106180etM.getVisibility() == 0) {
                                    C786410Ut5.Y1(c1106110etF.LLJJJJJIL, 8);
                                }
                                AbstractC1106180etM abstractC1106180etM2 = c1106110etF.LLJJJJLIIL;
                                if (abstractC1106180etM2 != null && abstractC1106180etM2.getVisibility() == 0) {
                                    C786410Ut5.Y1(c1106110etF.LLJJJJLIIL, 8);
                                }
                            }
                            if (LiveToolbarUIConfigOpt.INSTANCE.overlayTextOnTheShare() && (c20743416Fc = c1106110etF.LLJJIJIL) != null) {
                                C500260Jjc.LJIILIIL(c20743416Fc);
                            }
                            if (C2093608Ic.LIZJ(c1106110etF.LLILLL, "copy") || c1106110etF.LJI() || c1106110etF.LLILLJJLI) {
                                return;
                            }
                            c1106110etF.LLILLJJLI = true;
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_share_button_show");
                            c474500IjALIZ.LJIJJLI(c1106110etF.LLJIJIL);
                            c474500IjALIZ.LJJII("chat_merge", "share_platform");
                            c474500IjALIZ.LIZ();
                            if (c1106110etF.LLILZ) {
                                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_share_button_show");
                                c474500IjALIZ2.LJIJJLI(c1106110etF.LLJIJIL);
                                c474500IjALIZ2.LJJII("chat_merge", "share_platform");
                                c474500IjALIZ2.LIZ();
                            }
                            final C1151970g5D c1151970g5D = new C1151970g5D(c1106110etF, 4);
                            C0JSS.LJIIIIZZ(c1106110etF.LLJJ, ((UrlModel) ListProtector.get(list2, 0)).LIZ(), -1, -1, -1, c1151970g5D);
                            c1106110etF.LLJJ.setIcon((Drawable) null);
                            long j2 = j != -1 ? (j * 1000) / 600 : -1L;
                            c1106110etF.LLILZLL = new AnimatorSet();
                            LiveIconView liveIconView = c1106110etF.LLJJ;
                            Property property = View.SCALE_X;
                            float[] fArr = new float[2];
                            fArr[0] = c1106110etF.LLJJIJIIJIL ? 1.05f : 1.5f;
                            fArr[1] = 0.9f;
                            c1106110etF.LLIZ = ObjectAnimator.ofFloat(liveIconView, (Property<LiveIconView, Float>) property, fArr).setDuration(600L);
                            LiveIconView liveIconView2 = c1106110etF.LLJJ;
                            Property property2 = View.SCALE_Y;
                            float[] fArr2 = new float[2];
                            fArr2[0] = c1106110etF.LLJJIJIIJIL ? 1.05f : 1.5f;
                            fArr2[1] = 0.9f;
                            ObjectAnimator duration = ObjectAnimator.ofFloat(liveIconView2, (Property<LiveIconView, Float>) property2, fArr2).setDuration(600L);
                            c1106110etF.LLIZ.setRepeatMode(2);
                            duration.setRepeatMode(2);
                            if (c1106110etF.LLILZ) {
                                int i = (int) j2;
                                c1106110etF.LLIZ.setRepeatCount(i);
                                duration.setRepeatCount(i);
                            } else {
                                c1106110etF.LLIZ.setRepeatCount(-1);
                                duration.setRepeatCount(-1);
                            }
                            c1106110etF.LLILZLL.playTogether(c1106110etF.LLIZ, duration);
                            c1106110etF.LLIZ.addListener(new AnimatorListenerAdapter() { // from class: X.0etI
                                public int LL;

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    super.onAnimationEnd(animator);
                                    c1106110etF.LJIILIIL();
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationRepeat(Animator animator) {
                                    super.onAnimationRepeat(animator);
                                    int i2 = this.LL + 1;
                                    this.LL = i2;
                                    if (i2 % 16 == 0) {
                                        if (i2 == list2.size() * 16) {
                                            this.LL = 0;
                                        }
                                        C0JSS.LJIIIIZZ(c1106110etF.LLJJ, ((UrlModel) ListProtector.get(list2, this.LL / 16)).LIZ(), -1, -1, -1, c1151970g5D);
                                        c1106110etF.LLJJ.setIcon((Drawable) null);
                                    }
                                }
                            });
                            c1106110etF.LLILZLL.start();
                        }
                    });
                }
            }
        }, null);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final boolean isImChannel(String str) {
        String strLJJJJLL = ((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJJJJLL();
        if (!C2093608Ic.LIZJ("chat_merge", str)) {
            if (C2093608Ic.LJ(str) && C2093608Ic.LIZJ("im_channel", strLJJJJLL)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Boolean isSharer(long j) {
        boolean z;
        C1378280lyE c1378280lyE = C1378280lyE.LIZJ;
        Pair<Long, ? extends com.ss.android.ugc.aweme.profile.model.User> pair = C1378280lyE.LIZJ.LIZ;
        if (pair != null && pair.getFirst().longValue() == j) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void showScreenTimeDialog(Bundle bundle) {
        ComplianceServiceProvider.LJIL().LJJIZ(bundle);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final C197039127h getShareRelationButton(Context context, C05JF c05jf) {
        com.ss.android.ugc.aweme.profile.model.User second;
        String strLJIIJ;
        String strLJIIJ2;
        C1378280lyE c1378280lyE = C1378280lyE.LIZJ;
        c1378280lyE.getClass();
        RelationButton relationButton = new RelationButton(context, (AttributeSet) null, 0, 14);
        C19ME c19me = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(95)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        c19me.topToTop = 0;
        c19me.bottomToBottom = 0;
        c19me.endToEnd = 0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relationButton);
        relationButton.setLayoutParams(c19me);
        relationButton.setId(View.generateViewId());
        Pair<Long, ? extends com.ss.android.ugc.aweme.profile.model.User> pair = c1378280lyE.LIZ;
        if (pair != null && (second = pair.getSecond()) != null) {
            C1387050mCN c1387050mCN = new C1387050mCN(second);
            c1387050mCN.LJIIJ = true;
            c1387050mCN.LIZJ = true;
            c1387050mCN.LJJIFFI = 2;
            c1387050mCN.LJIJJ = C1378280lyE.LIZ(second);
            c1387050mCN.LJJ = true;
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair(C0SY7.UNFOLLOW, new C1908890zm3(C1383370m6R.LJIIJ(R.string.jp2), null));
            pairArr[1] = new Pair(C0SY7.UNFOLLOW_BUT_BE_FOLLOWED, new C1908890zm3(C1383370m6R.LJIIJ(R.string.jp2), null));
            C0SY7 c0sy7 = C0SY7.FOLLOWED;
            if (C1378280lyE.LIZ(second)) {
                strLJIIJ = C1383370m6R.LJIIJ(2131837236);
            } else {
                strLJIIJ = C1383370m6R.LJIIJ(R.string.jrk);
            }
            pairArr[2] = new Pair(c0sy7, new C1908890zm3(strLJIIJ, null));
            C0SY7 c0sy72 = C0SY7.FOLLOW_MUTUAL;
            if (C1378280lyE.LIZ(second)) {
                strLJIIJ2 = C1383370m6R.LJIIJ(2131837236);
            } else {
                strLJIIJ2 = C1383370m6R.LJIIJ(R.string.jrk);
            }
            pairArr[3] = new Pair(c0sy72, new C1908890zm3(strLJIIJ2, null));
            c1387050mCN.LJII.putAll(C2097608Jq.LJIIIIZZ(pairArr));
            relationButton.LLLLZIL(c1387050mCN.LIZ());
            relationButton.setFollowClickInterceptor(new C05JE(c05jf, null));
            relationButton.setFollowClickListener(new AwS635S0100000_21(c05jf, 78));
            relationButton.setTracker(new AwS555S0100000_11(second, 494));
        }
        return relationButton;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void getShortUrl(String str, InterfaceC473660Iho interfaceC473660Iho) {
        C621180OYa.LIZIZ.LJIJI(0, "", "", str).LIZLLL();
        if (interfaceC473660Iho == null) {
        } else {
            throw null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void postFollowStatus(String str, int i) {
        C1378280lyE c1378280lyE = C1378280lyE.LIZJ;
        C1378280lyE.LIZJ.getClass();
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().postValue(new FollowStatus(str, i));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void registerShareUserInfoListener(long j, InterfaceC473070Igr interfaceC473070Igr) {
        C1378280lyE c1378280lyE = C1378280lyE.LIZJ;
        C1378280lyE c1378280lyE2 = C1378280lyE.LIZJ;
        c1378280lyE2.getClass();
        c1378280lyE2.LIZIZ = new Pair<>(Long.valueOf(j), interfaceC473070Igr);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void repost(long j, Map<String, String> map) {
        ILiveOuterService iLiveOuterService;
        InterfaceC1363540laS interfaceC1363540laSE4 = (InterfaceC1363540laS) PluggableExtentionKt.pluggableSpi(InterfaceC1363540laS.class);
        if (interfaceC1363540laSE4 != null || ((iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) != null && (interfaceC1363540laSE4 = iLiveOuterService.E4()) != null)) {
            interfaceC1363540laSE4.LJIIJJI(j, null, map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[PHI: r1 r6
      0x0059: PHI (r1v2 android.graphics.drawable.Drawable) = (r1v1 android.graphics.drawable.Drawable), (r1v6 android.graphics.drawable.Drawable) binds: [B:8:0x001a, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v2 java.lang.String) binds: [B:8:0x001a, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.String, android.graphics.drawable.Drawable> getBreathShareAnimShareRes(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            r2 = 0
            if (r5 != 0) goto L4
            return r2
        L4:
            android.app.Activity r3 = X.C1388190mED.LIZ(r5)
            if (r3 == 0) goto L5c
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.share.ShareExtService> r0 = com.ss.android.ugc.aweme.share.ShareExtService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.share.ShareExtService r0 = (com.ss.android.ugc.aweme.share.ShareExtService) r0
            android.graphics.drawable.Drawable r1 = r0.LJJJLZIJ(r3, r6)
            if (r1 != 0) goto L59
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.share.ShareExtService> r0 = com.ss.android.ugc.aweme.share.ShareExtService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.share.ShareExtService r0 = (com.ss.android.ugc.aweme.share.ShareExtService) r0
            android.graphics.drawable.Drawable r1 = r0.LJJ(r3)
            java.lang.String r6 = X.C733420Spo.LIZJ()
            X.0lkX r0 = X.C1371710lnd.LIZ(r3, r6)
            if (r0 != 0) goto L56
            java.lang.String r0 = "other"
            boolean r0 = X.C2093608Ic.LIZJ(r6, r0)
            if (r0 != 0) goto L56
        L3e:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.share.ShareExtService> r0 = com.ss.android.ugc.aweme.share.ShareExtService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.share.ShareExtService r0 = (com.ss.android.ugc.aweme.share.ShareExtService) r0
            android.graphics.drawable.Drawable r1 = r0.LJJJLZIJ(r3, r7)
            if (r1 != 0) goto L5a
        L50:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L56:
            if (r1 != 0) goto L59
            goto L3e
        L59:
            r7 = r6
        L5a:
            r2 = r7
            goto L50
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.LiveHostShare.getBreathShareAnimShareRes(android.content.Context, java.lang.String, java.lang.String):android.util.Pair");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Dialog getLongPressShareDialog(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        ShareService shareService = C621180OYa.LIZ;
        if (shareService == null) {
            return null;
        }
        return shareService.LJJJJI(activity, c1106210etP, interfaceC1372610lp5);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Fragment getLongPressShareDialog2Fragment(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        ShareService shareService = C621180OYa.LIZ;
        if (shareService == null) {
            return null;
        }
        return shareService.LJJJJIZL(activity, c1106210etP, interfaceC1372610lp5);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Dialog getShareDialog(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        return C621180OYa.LIZ.LJJJLZIJ(activity, c1106210etP, interfaceC1372610lp5);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final TuxSheet getShareTuxSheet(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        ShareService shareService = C621180OYa.LIZ;
        if (shareService == null) {
            return null;
        }
        return shareService.LJJIZ(activity, c1106210etP, interfaceC1372610lp5);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void postFollowRecommendEvent(String str, String str2, String str3) {
        EnumC1260930iux enumC1260930iux;
        C1378280lyE.LIZJ.getClass();
        int i = 0;
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.CARD;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJIL(str);
        c1260910iuv.LJJJJIZL(str2);
        EnumC1260930iux.Companion.getClass();
        EnumC1260930iux[] enumC1260930iuxArrValues = EnumC1260930iux.values();
        int length = enumC1260930iuxArrValues.length;
        while (true) {
            if (i < length) {
                enumC1260930iux = enumC1260930iuxArrValues[i];
                if (Intrinsics.LJFF(enumC1260930iux.getType(), str3)) {
                    break;
                } else {
                    i++;
                }
            } else {
                enumC1260930iux = null;
                break;
            }
        }
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        c1260910iuv.LJIILJJIL();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void share(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        c1106210etP.getClass();
        InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1371710lnd.LIZ(activity, null);
        if (interfaceC1369790lkXLIZ != null && interfaceC1369790lkXLIZ.LJIIZILJ(activity)) {
            LiveSharePackage liveSharePackageLJIIL = C621180OYa.LIZ.LJIIL(activity, c1106210etP);
            if (interfaceC1369790lkXLIZ.LJJIIJ(liveSharePackageLJIIL.LJIILLIIL(interfaceC1369790lkXLIZ), activity, null)) {
                interfaceC1372610lp5.LIZJ(null, "link", liveSharePackageLJIIL.extras);
            } else {
                interfaceC1372610lp5.LIZ(new Throwable());
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareSubInvitation(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        C621180OYa.LIZ.LJJJJLI(activity, c1106210etP, interfaceC1372610lp5);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareSubscribeLink(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        C621180OYa.LIZ.shareSubscribeLink(activity, c1106210etP, interfaceC1372610lp5);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareSingleMessage(Activity activity, String str, C1106210etP c1106210etP, final C09JN<Boolean> c09jn) {
        IMUser iMUser = new IMUser();
        LiveSharePackage liveSharePackageLJIIL = C621180OYa.LIZ.LJIIL(activity, c1106210etP);
        iMUser.setUid(str);
        C1041800dDW.LIZ().getShareService().LJJIJIL(activity, iMUser, liveSharePackageLJIIL, new C0U3R() { // from class: X.0T4f
            @Override // X.C0U3R
            public final void run(Object obj) {
                C09JN c09jn2 = c09jn;
                C1C7U.LIZ("LiveHostShare@8d82.shareSingleMessage$1L");
                try {
                    c09jn2.accept(obj);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1C7U.LIZIZ("LiveHostShare@8d82.shareSingleMessage$1L");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0T4g] */
    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareSingleMessageToMultiUser(Activity activity, List<String> list, C1106210etP c1106210etP, final C09JN<Boolean> c09jn) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            IMUser iMUser = new IMUser();
            iMUser.setUid(str);
            arrayList.add(iMUser);
        }
        C1041800dDW.LIZ().getShareService().LJJIZ(activity, arrayList, C621180OYa.LIZ.LJIIL(activity, c1106210etP), new C0U3R() { // from class: X.0T4g
            @Override // X.C0U3R
            public final void run(Object obj) {
                C09JN c09jn2 = c09jn;
                C1C7U.LIZ("LiveHostShare@8d82.shareSingleMessageToMultiUser$1L");
                try {
                    c09jn2.accept(obj);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1C7U.LIZIZ("LiveHostShare@8d82.shareSingleMessageToMultiUser$1L");
            }
        });
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareStreamGoal(Activity activity, String str, C1106210etP c1106210etP, C09JN<Boolean> c09jn) {
        IMUser iMUser = new IMUser();
        LiveSharePackage liveSharePackageLJIIL = C621180OYa.LIZ.LJIIL(activity, c1106210etP);
        iMUser.setUid(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iMUser);
        C1041800dDW.LIZ().getShareService().LJJIJIIJIL(liveSharePackageLJIIL, c1106210etP.LJIIJJI, arrayList, null, true, new InterfaceC1362600lYw() { // from class: X.0lsx
            @Override // X.InterfaceC1362600lYw
            public final void LIZ(SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LIZIZ(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LIZJ(Dialog dialog, SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LIZLLL(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJ(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJFF(SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJI(SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJII(Dialog dialog, SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1362600lYw
            public final boolean LJIIIIZZ(SharePackage sharePackage) {
                return false;
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJIIJ(SharePackage sharePackage, String str2) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJIIJJI(SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJIIL(SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJIILIIL() {
            }
        });
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareLiveReplay(C19EG c19eg, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        LiveReplayShareData liveReplayShareData = new LiveReplayShareData(str, str2, str3, str4, str5, str6, str7, "highlight_page", "highlights_single", "", "live_replay_share");
        LiveReplaySharePackage.Companion.getClass();
        C1375460ltg.LIZ(c19eg, liveReplayShareData);
    }
}
