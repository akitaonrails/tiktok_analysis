package com.bytedance.android.livesdk.watch;

import X.AbstractC464380IIy;
import X.C006A;
import X.C0IFS;
import X.C0IHN;
import X.C0IKH;
import X.C1106210etP;
import X.C19EG;
import X.C463900IHc;
import X.C472280Ifa;
import X.C483010Iwt;
import X.C483100Ix2;
import X.C483410IxX;
import X.EnumC469210Iad;
import X.InterfaceC469100IaS;
import X.ViewOnTouchListenerC473590Ihh;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.widget.survey.feedback.LightSurveyFeedbackSheet;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.drawerfeed.LiveNonPersonalizedDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.IRecyclableWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS61S0210000_7;
import webcast.api.feed.SortStatsTag;

/* JADX INFO: loaded from: classes8.dex */
public interface IWatchLiveService extends C006A {
    void Ai();

    void Be(Activity activity, Boolean bool);

    boolean E5(String str, String str2, boolean z);

    boolean F10();

    void Fb(LifecycleOwner lifecycleOwner);

    ViewOnTouchListenerC473590Ihh HW0();

    boolean IJ(DataChannel dataChannel);

    void JT1();

    boolean Jv(String str);

    C483410IxX Lb();

    void M21();

    void MW();

    C463900IHc Mi();

    void N6(float f, float f2, float f3, float f4);

    boolean Na();

    void Oa(C1106210etP c1106210etP);

    void R81();

    void SK2(AbstractC464380IIy abstractC464380IIy);

    void Sx(String str);

    void T8(Map map);

    void U5();

    void Uc0(int i);

    void Uw1();

    void VL2(int i, Room room, DataChannel dataChannel);

    void W7(Context context);

    List<Class<? extends IRecyclableWidget>> XT1();

    boolean YF1();

    float YG0(long j);

    boolean ZK2();

    void ZO(Activity activity, long j);

    String Ze0();

    void Zq(String str);

    void addLiveDuration(long j);

    boolean canShowInternalWindow(Long l);

    void clearSafeZone();

    List<C0IHN> en0();

    void fW0(long j);

    boolean fi(String str);

    LiveRoomFragment fk(EnterRoomConfig enterRoomConfig);

    LightSurveyFeedbackSheet gS1(PreviewSurveyViewModel previewSurveyViewModel, C483010Iwt c483010Iwt);

    int getInternalWindowState();

    void hK();

    void hideInternalWindow();

    boolean hp1(DataChannel dataChannel);

    boolean isInternalWindowMute();

    boolean isInternalWindowUserManualMute();

    LiveDrawerDialogV3 jX1(C472280Ifa c472280Ifa, Bundle bundle, EnumC469210Iad enumC469210Iad);

    Map<String, String> jh0();

    void kc(MotionEvent motionEvent, String str);

    void km1(List list);

    void ku();

    void lA0();

    void muteInternalWindow(boolean z);

    void notifyHostAppBoot();

    int ob2();

    void pJ0(long j);

    void pb0(InterfaceC469100IaS interfaceC469100IaS);

    void pd(EnterRoomConfig enterRoomConfig);

    boolean r8();

    boolean re();

    void resetInternalWindow();

    void resetUserManualMuteClickState();

    List<ILiveRoomStatusNewListener> rq1();

    void s42(Context context);

    void setLiveAudioControllerIntercept(boolean z);

    void setLiveFunnelSession(boolean z);

    void showInternalWindow(Activity activity, DialogFragment dialogFragment, Boolean bool, Map<String, String> map, Integer num, Integer num2, Integer num3, Integer num4);

    void tM0(DataChannel dataChannel, LifecycleOwner lifecycleOwner, EnterRoomConfig enterRoomConfig);

    C0IKH tf(C19EG c19eg, C472280Ifa c472280Ifa, int i, EnumC469210Iad enumC469210Iad);

    void tt(FragmentManager fragmentManager);

    void u8(C1106210etP c1106210etP);

    boolean up(String str);

    void updateRecInfo(Map<String, ? extends List<SortStatsTag>> map);

    void updateSafeZone(int i, int i2, int i3, int i4);

    void v12(boolean z, DataChannel dataChannel, AwS61S0210000_7 awS61S0210000_7);

    void wH(Room room, String str, String str2, String str3, String str4, String str5, Map map);

    void wl2(DataChannel dataChannel, LifecycleOwner lifecycleOwner, EnterRoomConfig enterRoomConfig);

    C483100Ix2 x5(Context context);

    LiveNonPersonalizedDialog xd();

    void xi(int i, Room room, String str, String str2, String str3, Map map);

    void yp(String str, C0IFS c0ifs);

    void zD0();

    boolean zp0();
}
