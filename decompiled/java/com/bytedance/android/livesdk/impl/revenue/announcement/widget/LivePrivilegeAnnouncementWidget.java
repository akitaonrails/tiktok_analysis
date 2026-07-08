package com.bytedance.android.livesdk.impl.revenue.announcement.widget;

import X.C001A;
import X.C09JN;
import X.C0IF8;
import X.C0IJT;
import X.C1078480eAg;
import X.C1083700eJ6;
import X.C1086150eN3;
import X.C1087410eP5;
import X.C1087430eP7;
import X.C1087520ePG;
import X.C1091250eVH;
import X.C1102070emj;
import X.C1161920gLG;
import X.C11NJ;
import X.C16FV;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252331DDr;
import X.C235000vU;
import X.C464680IKc;
import X.C473410IhP;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C775900Uc8;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1087450eP9;
import X.EnumC1087550ePJ;
import X.EnumC1101430elh;
import X.EnumC781860Ulk;
import X.InterfaceC1087420eP6;
import X.InterfaceC211300rf;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import Y.ACListenerS152S0100000_17;
import Y.ALAdapterS13S0100000_17;
import Y.ALAdapterS3S0100000_6;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS1S0100001_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.net.Uri;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutEvent;
import com.bytedance.android.livesdk.dataChannel.HourlyRankRewardVisibilityChangedChannel;
import com.bytedance.android.livesdk.dataChannel.PrivilegeAnnouncementEvent;
import com.bytedance.android.livesdk.livesetting.LivePrivilegeCheckLoggerSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutRenderingScopeOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetMinLoadSettingV3;
import com.bytedance.android.livesdk.livesetting.privilege.LiveAdvanceMessageBackgroundSetting;
import com.bytedance.android.livesdk.livesetting.privilege.LiveAdvanceMessageContinuesAnimSetting;
import com.bytedance.android.livesdk.message.proto.DisplayControl;
import com.bytedance.android.livesdk.model.message.PrivilegeAdvanceMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePrivilegeAnnouncementWidget extends LiveRecyclableWidget {
    public C1087410eP5 LL;
    public PrivilegeAdvanceMessage LLILLJJLI;
    public ConstraintLayout LLILLL;
    public ImageView LLILZ;
    public ImageView LLILZIL;
    public C16FV LLILZLL;
    public LiveIconView LLIZ;
    public TextView LLIZLLLIL;
    public C1091250eVH LLJ;
    public boolean LLJI;
    public boolean LLJJ;
    public C1087520ePG LLJJI;
    public AnimatorSet LLJJIJIIJIL;
    public AnimatorSet LLJJIJIL;
    public ObjectAnimator LLJJJ;
    public ValueAnimator LLJJJIL;
    public int LLJJJJ;
    public Runnable LLJJJJJIL;
    public Runnable LLJJJJLIIL;
    public ARunnableS106S0100000_6 LLJJL;
    public long LLJLIL;
    public final boolean LLJIJIL = LiveLayoutRenderingScopeOptimizationSetting.INSTANCE.getValue().announcementOpt;
    public final boolean LLJILJIL = LiveAdvanceMessageBackgroundSetting.INSTANCE.getValue();
    public final C11NJ LLJILJILJ = new C11NJ();
    public float LLJILLL = -1.0f;
    public final C1083700eJ6 LLJJIII = new C1083700eJ6();
    public final ARunnableS117S0100000_17 LLJJIJI = new ARunnableS117S0100000_17(this, 98);
    public final long LLJJLIIIJLLLLLLLZ = Mp4ScreenVideoLoadTimeout.CONTROL;
    public final long LLJL = 1000;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void A1() {
        DisplayControl displayControl;
        PrivilegeAdvanceMessage privilegeAdvanceMessage = this.LLILLJJLI;
        if (privilegeAdvanceMessage == null || (displayControl = privilegeAdvanceMessage.control) == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(displayControl.horizontalTriggerType);
        if (numValueOf.intValue() == 3) {
            numValueOf.intValue();
            LiveIconView liveIconView = this.LLIZ;
            if (liveIconView != null) {
                C786410Ut5.g8(liveIconView, new ACListenerS152S0100000_17(this, 56));
            }
        }
    }

    public final void D1() {
        C1087410eP5 c1087410eP5;
        C1086150eN3 c1086150eN3;
        InterfaceC1087420eP6[] interfaceC1087420eP6Arr;
        PrivilegeAdvanceMessage privilegeAdvanceMessage = this.LLILLJJLI;
        if (privilegeAdvanceMessage != null && (c1087410eP5 = this.LL) != null && (c1086150eN3 = c1087410eP5.LLILLL) != null && (interfaceC1087420eP6Arr = c1086150eN3.LIZIZ) != null) {
            for (InterfaceC1087420eP6 interfaceC1087420eP6 : interfaceC1087420eP6Arr) {
                if (interfaceC1087420eP6.LIZIZ(privilegeAdvanceMessage.subType)) {
                    interfaceC1087420eP6.LIZ(privilegeAdvanceMessage);
                }
            }
        }
        if (this.LLJIJIL) {
            ConstraintLayout constraintLayout = this.LLILLL;
            if (constraintLayout != null) {
                C786410Ut5.LL(8, constraintLayout);
            }
        } else {
            hide();
        }
        this.LLILLJJLI = null;
        EnumC1087550ePJ.INSTANCE.onMessageFinish();
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c1102070emj.getClass();
        if (C1102070emj.LJIIIIZZ(dataChannel, 5, 0, 0)) {
            DataChannel dataChannel2 = this.dataChannel;
            C1087520ePG c1087520ePG = this.LLJJI;
            String str = c1087520ePG != null ? c1087520ePG.LIZ : null;
            c1102070emj.getClass();
            C1102070emj.LJIIL(dataChannel2, 1, str);
            C473410IhP.LJ(this.LLJJIJI);
            this.LLJJI = null;
        }
    }

    public final void E1() {
        int lineWidth;
        int width;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3 = this.LLILLL;
        if (constraintLayout3 != null) {
            HandlerHook.viewRemoveCallbacks(constraintLayout3, this.LLJJL);
        }
        ConstraintLayout constraintLayout4 = this.LLILLL;
        if (constraintLayout4 != null) {
            HandlerHook.viewRemoveCallbacks(constraintLayout4, this.LLJJJJLIIL);
        }
        TextView textView = this.LLIZLLLIL;
        if (textView != null) {
            Layout layout = textView.getLayout();
            lineWidth = layout != null ? (int) layout.getLineWidth(0) : 0;
            width = (textView.getWidth() - textView.getPaddingStart()) - textView.getPaddingEnd();
        } else {
            lineWidth = 0;
            width = 0;
        }
        int i = lineWidth - width;
        this.LLJJJJ = i;
        if (i > 0) {
            ARunnableS106S0100000_6 aRunnableS106S0100000_6 = this.LLJJL;
            if (aRunnableS106S0100000_6 == null || (constraintLayout2 = this.LLILLL) == null) {
                return;
            }
            HandlerHook.viewPostDelay(constraintLayout2, aRunnableS106S0100000_6, this.LLJL);
            return;
        }
        Runnable runnable = this.LLJJJJLIIL;
        if (runnable == null || (constraintLayout = this.LLILLL) == null) {
            return;
        }
        HandlerHook.viewPostDelay(constraintLayout, runnable, z1());
    }

    public final void F1() {
        String str;
        String str2;
        String str3;
        User user;
        String str4;
        String str5;
        RoomNotifyMessage roomNotifyMessage;
        String strLIZIZ;
        User.EnigmaInfo enigmaInfo;
        PrivilegeAdvanceMessage privilegeAdvanceMessage = this.LLILLJJLI;
        if (privilegeAdvanceMessage != null && (roomNotifyMessage = privilegeAdvanceMessage.notify) != null && (strLIZIZ = roomNotifyMessage.schema) != null) {
            try {
                User user2 = roomNotifyMessage.user;
                if (user2 != null && (enigmaInfo = user2.enigmaInfo) != null && enigmaInfo.isEnigmaMaskOn) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append("&is_enigma=true");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                Uri uriB1 = B1(strLIZIZ);
                if (uriB1 != null) {
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.context, uriB1);
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        PrivilegeAdvanceMessage privilegeAdvanceMessage2 = this.LLILLJJLI;
        if (privilegeAdvanceMessage2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("privilege id: ");
            C1087520ePG c1087520ePG = this.LLJJI;
            sbLIZ2.append(c1087520ePG != null ? c1087520ePG.LIZ : null);
            C20441214yg.LIZIZ("EffectNotify#clickLog", C2188811AlT.LIZIZ(sbLIZ2));
            C1087520ePG c1087520ePG2 = this.LLJJI;
            if (c1087520ePG2 != null && (str5 = c1087520ePG2.LIZ) != null) {
                C1102070emj c1102070emj = C1102070emj.LIZ;
                DataChannel dataChannel = this.dataChannel;
                c1102070emj.getClass();
                C1102070emj.LJIL(dataChannel, str5);
            }
            C1087430eP7.LIZJ(this.dataChannel, "click");
            DataChannel dataChannel2 = this.dataChannel;
            try {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_advanced_message_click");
                C1087430eP7.LIZ(c474500IjALIZ, dataChannel2, privilegeAdvanceMessage2);
                RoomNotifyMessage roomNotifyMessage2 = privilegeAdvanceMessage2.notify;
                long id = 0;
                c474500IjALIZ.LJJII(Long.valueOf(roomNotifyMessage2 != null ? roomNotifyMessage2.from_user_id : 0L), "message_trigger_userid");
                c474500IjALIZ.LJJII(privilegeAdvanceMessage2.scene, "biz_scenario");
                c474500IjALIZ.LJJII("advanced_message", "privilege_type");
                PrivilegeLogExtra privilegeLogExtra = privilegeAdvanceMessage2.privilegeLogExtra;
                String str6 = "";
                if (privilegeLogExtra == null || (str = privilegeLogExtra.privilege_id) == null) {
                    str = "";
                }
                c474500IjALIZ.LJJII(str, "privilege_id");
                PrivilegeLogExtra privilegeLogExtra2 = privilegeAdvanceMessage2.privilegeLogExtra;
                if (privilegeLogExtra2 == null || (str2 = privilegeLogExtra2.privilege_order_id) == null) {
                    str2 = "";
                }
                c474500IjALIZ.LJJII(str2, "privilege_order_id");
                PrivilegeLogExtra privilegeLogExtra3 = privilegeAdvanceMessage2.privilegeLogExtra;
                if (privilegeLogExtra3 == null || (str3 = privilegeLogExtra3.privilege_version) == null) {
                    str3 = "";
                }
                c474500IjALIZ.LJJII(str3, "privilege_version_id");
                PrivilegeLogExtra privilegeLogExtra4 = privilegeAdvanceMessage2.privilegeLogExtra;
                if (privilegeLogExtra4 != null && (str4 = privilegeLogExtra4.data_version) != null) {
                    str6 = str4;
                }
                c474500IjALIZ.LJJII(str6, "data_version_id");
                c474500IjALIZ.LIZ();
                if (LivePrivilegeCheckLoggerSetting.INSTANCE.enableLogger()) {
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_advanced_message_click_frame_check");
                    C1087430eP7.LIZ(c474500IjALIZ2, dataChannel2, null);
                    InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                    InterfaceC2262081DgM currentUser = interfaceC500940JkiUser != null ? interfaceC500940JkiUser.getCurrentUser() : null;
                    if ((currentUser instanceof User) && (user = (User) currentUser) != null) {
                        id = user.getId();
                    }
                    c474500IjALIZ2.LJJII(Long.valueOf(id), "user_id");
                    c474500IjALIZ2.LJJII(w.LIZ.LIZJ(), "live_type");
                    c474500IjALIZ2.LJJII(w.LJIILIIL(), "event_page");
                    c474500IjALIZ2.LIZ();
                }
            } catch (Exception th) {
            }
            C1087430eP7.LIZIZ(EnumC1087450eP9.CLICK, this.dataChannel, privilegeAdvanceMessage2, z1());
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return this.LLJIJIL ? R.layout.h27 : R.layout.h26;
    }

    public final void x1() {
        ImageView imageView = this.LLILZIL;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, null);
        }
        C16FV c16fv = this.LLILZLL;
        if (c16fv != null) {
            C786410Ut5.m8(c16fv, null);
        }
        LiveIconView liveIconView = this.LLIZ;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, null);
        }
        TextView textView = this.LLIZLLLIL;
        if (textView != null) {
            C786410Ut5.T7(textView, null);
        }
        ConstraintLayout constraintLayout = this.LLILLL;
        if (constraintLayout != null) {
            C786410Ut5.Y7(constraintLayout, null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:20|(1:22)|23|(37:25|(0)|30|(2:32|(3:34|(1:36)|37))|38|(1:40)(1:62)|41|(1:45)|46|(1:50)|51|(1:55)|56|(1:60)|61|121|65|(1:67)|68|(1:70)(1:80)|71|(1:73)(1:79)|74|(1:81)|82|(1:86)|87|(1:91)|92|(1:96)|97|98|(1:102)(1:101)|103|(5:105|(1:107)|108|(1:114)(1:112)|113)|117|(2:119|120)(1:124))(1:63)|29|30|(0)|38|(0)(0)|41|(2:43|45)(0)|46|(2:48|50)(0)|51|(2:53|55)(0)|56|(2:58|60)(0)|61|121|65|(0)|68|(0)(0)|71|(0)(0)|74|(5:76|78|81|82|(4:84|86|87|(9:89|91|92|(2:94|96)|97|98|(0)(0)|103|(0))(0))(0))(0)|117|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02be, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02bf, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024f A[Catch: Exception -> 0x02be, TRY_ENTER, TryCatch #0 {Exception -> 0x02be, blocks: (B:65:0x0199, B:68:0x01af, B:70:0x01f0, B:71:0x01f6, B:73:0x0202, B:74:0x0208, B:76:0x020f, B:82:0x0219, B:84:0x0220, B:87:0x0225, B:89:0x022c, B:92:0x0231, B:94:0x0238, B:97:0x023d, B:101:0x024f, B:103:0x0272, B:105:0x027a, B:107:0x028e, B:108:0x0292, B:110:0x0296, B:112:0x029a, B:113:0x029e, B:102:0x026c), top: B:121:0x0199 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026c A[Catch: Exception -> 0x02be, TryCatch #0 {Exception -> 0x02be, blocks: (B:65:0x0199, B:68:0x01af, B:70:0x01f0, B:71:0x01f6, B:73:0x0202, B:74:0x0208, B:76:0x020f, B:82:0x0219, B:84:0x0220, B:87:0x0225, B:89:0x022c, B:92:0x0231, B:94:0x0238, B:97:0x023d, B:101:0x024f, B:103:0x0272, B:105:0x027a, B:107:0x028e, B:108:0x0292, B:110:0x0296, B:112:0x029a, B:113:0x029e, B:102:0x026c), top: B:121:0x0199 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027a A[Catch: Exception -> 0x02be, TryCatch #0 {Exception -> 0x02be, blocks: (B:65:0x0199, B:68:0x01af, B:70:0x01f0, B:71:0x01f6, B:73:0x0202, B:74:0x0208, B:76:0x020f, B:82:0x0219, B:84:0x0220, B:87:0x0225, B:89:0x022c, B:92:0x0231, B:94:0x0238, B:97:0x023d, B:101:0x024f, B:103:0x0272, B:105:0x027a, B:107:0x028e, B:108:0x0292, B:110:0x0296, B:112:0x029a, B:113:0x029e, B:102:0x026c), top: B:121:0x0199 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f0 A[Catch: Exception -> 0x02be, TryCatch #0 {Exception -> 0x02be, blocks: (B:65:0x0199, B:68:0x01af, B:70:0x01f0, B:71:0x01f6, B:73:0x0202, B:74:0x0208, B:76:0x020f, B:82:0x0219, B:84:0x0220, B:87:0x0225, B:89:0x022c, B:92:0x0231, B:94:0x0238, B:97:0x023d, B:101:0x024f, B:103:0x0272, B:105:0x027a, B:107:0x028e, B:108:0x0292, B:110:0x0296, B:112:0x029a, B:113:0x029e, B:102:0x026c), top: B:121:0x0199 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0202 A[Catch: Exception -> 0x02be, TryCatch #0 {Exception -> 0x02be, blocks: (B:65:0x0199, B:68:0x01af, B:70:0x01f0, B:71:0x01f6, B:73:0x0202, B:74:0x0208, B:76:0x020f, B:82:0x0219, B:84:0x0220, B:87:0x0225, B:89:0x022c, B:92:0x0231, B:94:0x0238, B:97:0x023d, B:101:0x024f, B:103:0x0272, B:105:0x027a, B:107:0x028e, B:108:0x0292, B:110:0x0296, B:112:0x029a, B:113:0x029e, B:102:0x026c), top: B:121:0x0199 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1() {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.announcement.widget.LivePrivilegeAnnouncementWidget.y1():void");
    }

    public final long z1() {
        DisplayControl displayControl;
        PrivilegeAdvanceMessage privilegeAdvanceMessage = this.LLILLJJLI;
        if (privilegeAdvanceMessage != null && (displayControl = privilegeAdvanceMessage.control) != null) {
            long j = displayControl.duration;
            if (j > 0) {
                return j * 1000;
            }
        }
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        hide();
        this.LLJJJJ = 0;
        AnimatorSet animatorSet = this.LLJJIJIIJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LLJJIJIL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ObjectAnimator objectAnimator = this.LLJJJ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LLJJJ = null;
        ValueAnimator valueAnimator = this.LLJJJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ConstraintLayout constraintLayout = this.LLILLL;
        if (constraintLayout != null) {
            HandlerHook.viewRemoveCallbacks(constraintLayout, this.LLJJJJJIL);
        }
        ConstraintLayout constraintLayout2 = this.LLILLL;
        if (constraintLayout2 != null) {
            HandlerHook.viewRemoveCallbacks(constraintLayout2, this.LLJJL);
        }
        ConstraintLayout constraintLayout3 = this.LLILLL;
        if (constraintLayout3 != null) {
            HandlerHook.viewRemoveCallbacks(constraintLayout3, this.LLJJJJLIIL);
        }
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLILLJJLI = null;
        x1();
        C1087410eP5 c1087410eP5 = this.LL;
        if (c1087410eP5 != null) {
            IMessageManager iMessageManager = c1087410eP5.LLILZ;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(C001A.PRIVILEGE_ADVANCE_MESSAGE.getIntType(), c1087410eP5);
            }
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.ADVANCED_MESSAGE_DOWNGRADE);
            c1087410eP5.LLILLL = null;
        }
        if (this.dataChannel != null) {
            C20441214yg.LIZIZ("MainFrame#anim", "announ-1-post event: false");
            this.dataChannel.zW(HourlyRankRewardVisibilityChangedChannel.class, Boolean.FALSE);
        }
        this.LLJILJILJ.LJ();
        ((LinkedHashMap) C1087430eP7.LIZIZ).clear();
        ((LinkedHashMap) C1087430eP7.LIZJ).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r2.equals("webcast_gift_dialog") != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri B1(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.announcement.widget.LivePrivilegeAnnouncementWidget.B1(java.lang.String):android.net.Uri");
    }

    public final void C1(final Uri uri) {
        final String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        final String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        final String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
        if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = CardStruct.IStatusCode.DEFAULT;
        }
        String str = "";
        if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
        }
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        final RankTypeV2 rankTypeV2LIZIZ = C235000vU.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_id")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = CardStruct.IStatusCode.DEFAULT;
        }
        try {
            if (!Intrinsics.LJFF(rankTypeV2LIZIZ, RankTypeV2.LJJIJIIJI)) {
                ((IRankService) C1161920gLG.LIZJ(IRankService.class)).OJ(CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3), CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), rankTypeV2LIZIZ.type, rankTypeV2LIZIZ.rankPhase, this.widgetCallback.getFragment(), new InterfaceC211300rf() { // from class: X.0IKe
                    @Override // X.InterfaceC211300rf
                    public final void LIZ(ArrayList<Long> arrayList) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
                        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                        String str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                        Uri uri2 = uri;
                        String str3 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                        roomsData.enterMethod = str2;
                        if (uri2 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "enter_from_merge")) == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "";
                        }
                        roomsData.enterFromMerge = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
                        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                        roomsData2.enterType = "click";
                        roomsData2.userId = str3;
                        if (!arrayList.isEmpty()) {
                            enterRoomConfig.mRoomsData.roomIds = C13LP.LLIIIILZ(arrayList);
                        }
                        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(rankTypeV2LIZIZ.rankName);
                        sbLIZ.append("_jump_other_room");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        C0IIR c0iir = C0IIR.BussinessApiCall;
                        enterRoomLinkSessionLIZ.LIZIZ(new Event(strLIZIZ, 36608, c0iir));
                        EnterRoomLinkSession enterRoomLinkSessionLJ = EnterRoomLinkSession.LJ(enterRoomConfig);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(rankTypeV2LIZIZ.rankName);
                        sbLIZ2.append("_jump_to_live");
                        enterRoomLinkSessionLJ.LIZIZ(new Event(C2188811AlT.LIZIZ(sbLIZ2), 3840, c0iir));
                        C784440Upu.LIZ().LIZIZ(new C0IF8(enterRoomConfig, CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)));
                    }
                });
                return;
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.enterMethod = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
            if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge")) != null) {
                str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
            }
            roomsData.enterFromMerge = str;
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.enterType = "click";
            roomsData2.userId = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
            C784440Upu.LIZ().LIZIZ(new C0IF8(enterRoomConfig, CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInit(java.lang.Object[] r4) {
        /*
            r3 = this;
            X.0eP5 r2 = new X.0eP5
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.dataChannel
            android.content.Context r0 = r3.context
            r2.<init>(r0, r1)
            r3.LL = r2
            r0 = 2131367245(0x7f0a154d, float:1.8354406E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r3.LLILLL = r0
            r0 = 2131377332(0x7f0a3cb4, float:1.8374865E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.LLILZ = r0
            r0 = 2131377335(0x7f0a3cb7, float:1.8374871E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.LLILZIL = r0
            r0 = 2131377334(0x7f0a3cb6, float:1.837487E38)
            android.view.View r0 = r3.findViewById(r0)
            X.16FV r0 = (X.C16FV) r0
            r3.LLILZLL = r0
            r0 = 2131377333(0x7f0a3cb5, float:1.8374867E38)
            android.view.View r0 = r3.findViewById(r0)
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = (com.bytedance.android.live.design.view.icon.LiveIconView) r0
            r3.LLIZ = r0
            r0 = 2131396538(0x7f0a87ba, float:1.841382E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.LLIZLLLIL = r0
            r0 = 2131373126(0x7f0a2c46, float:1.8366334E38)
            android.view.View r0 = r3.findViewById(r0)
            X.0eVH r0 = (X.C1091250eVH) r0
            r3.LLJ = r0
            android.content.Context r2 = r3.context
            java.lang.Class<com.bytedance.android.livesdkapi.host.user.IHostPad> r0 = com.bytedance.android.livesdkapi.host.user.IHostPad.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)     // Catch: java.lang.Exception -> L78
            com.bytedance.android.livesdkapi.host.user.IHostPad r0 = (com.bytedance.android.livesdkapi.host.user.IHostPad) r0     // Catch: java.lang.Exception -> L78
            boolean r0 = r0.isPad()     // Catch: java.lang.Exception -> L78
            r1 = 1
            if (r0 != 0) goto L94
            java.lang.Class<com.bytedance.android.livesdkapi.host.user.IHostPad> r0 = com.bytedance.android.livesdkapi.host.user.IHostPad.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)     // Catch: java.lang.Exception -> L78
            com.bytedance.android.livesdkapi.host.user.IHostPad r0 = (com.bytedance.android.livesdkapi.host.user.IHostPad) r0     // Catch: java.lang.Exception -> L78
            int r0 = r0.XM(r2)     // Catch: java.lang.Exception -> L78
            if (r0 != r1) goto L7c
            goto L94
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7c:
            com.bytedance.android.livesdk.livesetting.privilege.LiveAdvanceMessageContinuesAnimSetting r0 = com.bytedance.android.livesdk.livesetting.privilege.LiveAdvanceMessageContinuesAnimSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto La2
            androidx.constraintlayout.widget.ConstraintLayout r2 = r3.LLILLL
            int r0 = X.C497740JfY.LJIIZILJ()
            float r1 = (float) r0
            r0 = 1058642330(0x3f19999a, float:0.6)
            float r1 = r1 * r0
            int r0 = (int) r1
            X.C500260Jjc.LJLJLLL(r0, r2)
            goto La2
        L94:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r3.LLILLL
            if (r1 == 0) goto La2
            r0 = 1133248512(0x438c0000, float:280.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            X.C500260Jjc.LJLJLLL(r0, r1)
        La2:
            com.bytedance.android.livesdk.livesetting.LiveNotifyFontWeightOptSetting r0 = com.bytedance.android.livesdk.livesetting.LiveNotifyFontWeightOptSetting.INSTANCE
            boolean r0 = r0.isSeniorMessageFontWeightOpt()
            if (r0 == 0) goto Lb9
            android.widget.TextView r1 = r3.LLIZLLLIL
            boolean r0 = r1 instanceof X.C16F5
            if (r0 == 0) goto Lb9
            X.16F5 r1 = (X.C16F5) r1
            if (r1 == 0) goto Lb9
            r0 = 500(0x1f4, float:7.0E-43)
            r1.setFontWeight(r0)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.announcement.widget.LivePrivilegeAnnouncementWidget.onInit(java.lang.Object[]):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C1078480eAg c1078480eAg;
        Object obj;
        C1087410eP5 c1087410eP5;
        C1091250eVH c1091250eVH;
        float f;
        IMessageManager iMessageManager;
        C1087410eP5 c1087410eP52 = this.LL;
        if (c1087410eP52 != null) {
            if (c1087410eP52.LL != null && (iMessageManager = c1087410eP52.LLILZ) != null) {
                iMessageManager.addMessageListener(C001A.PRIVILEGE_ADVANCE_MESSAGE.getIntType(), (OnIMMessageListener) c1087410eP52);
            }
            c1087410eP52.LLILLL = new C1086150eN3(c1087410eP52.LLILLJJLI, c1087410eP52.LL);
        }
        if (LiveAdvanceMessageContinuesAnimSetting.INSTANCE.getValue()) {
            if (C497740JfY.LJJ()) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            this.LLJJJJJIL = new ARunnableS1S0100001_6(this, f, 3);
            this.LLJJJJLIIL = new ARunnableS1S0100001_6(this, f, 4);
            this.LLJJL = new ARunnableS106S0100000_6(this, 333);
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            this.LLJJIJIIJIL = animatorSet;
            animatorSet.addListener(new ALAdapterS3S0100000_6(this, 71));
            this.LLJJJJJIL = new ARunnableS106S0100000_6(this, 331);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.LLJJIJIL = animatorSet2;
            animatorSet2.addListener(new ALAdapterS13S0100000_17(this, 122));
            this.LLJJJJLIIL = new ARunnableS106S0100000_6(this, 332);
            this.LLJJL = new ARunnableS106S0100000_6(this, 333);
        }
        this.dataChannel.BQ2(this, PrivilegeAnnouncementEvent.class, new AwS596S0100000_17(this, 159));
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            this.dataChannel.BQ2(this, HideTitleLayoutEvent.class, new AwS596S0100000_17(this, 160));
        }
        this.LLJILJILJ.LIZ(C784440Upu.LIZ().LJ(C464680IKc.class).LJJLJLI(new C09JN() { // from class: X.0IKb
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C0IF8 c0if8;
                C1C7U.LIZ("LivePrivilegeAnnouncementWidget@2ff2.onLoad$3");
                C464680IKc c464680IKc = (C464680IKc) obj2;
                if (c464680IKc != null && (c0if8 = c464680IKc.LIZ) != null) {
                    C0IL2.LIZ.LIZ().LIZIZ(new Event("live_room_notify_widget", 1280, C0IIR.MessageReceived));
                    c0if8.LJ.mRoomsData.enterLiveSource = "live_detail";
                    C784440Upu.LIZ().LIZIZ(new C0IF8(c0if8.LJ, c0if8.LIZJ));
                }
                C1C7U.LIZIZ("LivePrivilegeAnnouncementWidget@2ff2.onLoad$3");
            }
        }));
        if (this.LLJIJIL && (c1091250eVH = this.LLJ) != null) {
            c1091250eVH.setEnableFixedSize(true);
        }
        if (LiveWidgetMinLoadSettingV3.INSTANCE.enablePrivilegeAnnouncement() && objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C1078480eAg) && (c1078480eAg = (C1078480eAg) obj2) != null && (obj = c1078480eAg.LIZ) != null && (obj instanceof IMessage) && (c1087410eP5 = this.LL) != null) {
                    c1087410eP5.onMessage((IMessage) obj);
                }
            }
        }
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            C2252331DDr c2252331DDr = C775900Uc8.LIZ;
            C775900Uc8.LJFF(EnumC781860Ulk.ADVANCED_MESSAGE_BLOCK, new AwS631S0100000_17(this, 20));
        }
    }
}
