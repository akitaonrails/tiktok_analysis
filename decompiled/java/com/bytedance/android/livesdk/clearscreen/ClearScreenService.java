package com.bytedance.android.livesdk.clearscreen;

import X.C0TZM;
import X.InterfaceC1081980eGK;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ScreenClearEvent;
import com.bytedance.android.livesdk.dataChannel.SmoothClearScreenEvent;
import com.bytedance.android.livesdk.dataChannel.StartClearScreenEvent;
import com.bytedance.android.livesdk.livesetting.other.SmoothClearScreenSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveMultiPropertyGroupOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.watch.clearscreen.IClearScreenService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LayeredElementManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes18.dex */
public class ClearScreenService implements IClearScreenService {
    public final Map<Long, InterfaceC1081980eGK> LL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.watch.clearscreen.IClearScreenService
    public final void cC(Room room) {
        if (room != null) {
            this.LL.remove(Long.valueOf(room.getId()));
        }
    }

    @Override // com.bytedance.android.livesdk.watch.clearscreen.IClearScreenService
    public final InterfaceC1081980eGK wy2(Room room, DataChannel dataChannel) {
        if (room == null || dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE)) {
            return null;
        }
        return (InterfaceC1081980eGK) ((LinkedHashMap) this.LL).get(Long.valueOf(room.getId()));
    }

    @Override // com.bytedance.android.livesdk.watch.clearscreen.IClearScreenService
    public final void iE2(Room room, final Fragment fragment, final DataChannel dataChannel, final View view, final LayeredElementManager<?> layeredElementManager) {
        if (room == null || dataChannel == null || view == null) {
            return;
        }
        this.LL.put(Long.valueOf(room.getId()), new InterfaceC1081980eGK(fragment, dataChannel, view, layeredElementManager) { // from class: X.0eEh
            public final Fragment LIZ;
            public final DataChannel LIZIZ;
            public final View LIZJ;
            public final LayeredElementManager<?> LIZLLL;
            public final Room LJ;
            public final boolean LJFF;
            public float LJI;
            public float LJII;
            public float LJIIIIZZ;
            public boolean LJIIIZ;
            public boolean LJIIJ;
            public long LJIIJJI;

            public final void LJIIIIZZ() {
                this.LJI = 0.0f;
                this.LJII = 0.0f;
                this.LJIIIIZZ = 0.0f;
                KeyEvent.Callback callback = this.LIZJ;
                ViewParent viewParent = callback instanceof ViewParent ? (ViewParent) callback : null;
                if (viewParent != null) {
                    viewParent.requestDisallowInterceptTouchEvent(false);
                }
                C0IKG.LJI(this.LIZ.getActivity(), Boolean.TRUE);
                C472280Ifa c472280IfaLIZLLL = C0IKG.LIZLLL(C0IKG.LIZ(this.LIZ.getActivity()));
                if (c472280IfaLIZLLL != null) {
                    c472280IfaLIZLLL.setSmoothClearScreen(false);
                }
            }

            @Override // X.InterfaceC1081980eGK
            public final void LIZIZ() {
                if (this.LJIIJ && this.LJIIJJI > 0) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screen_clear_cancel");
                    c474500IjALIZ.LJJII("draw", "clear_type");
                    c474500IjALIZ.LJJII("draw", "leave_clear_type");
                    c474500IjALIZ.LJIJJLI(this.LIZIZ);
                    c474500IjALIZ.LIZ();
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_clear_screen_play_time");
                    c474500IjALIZ2.LJJII(Long.valueOf(System.currentTimeMillis() - this.LJIIJJI), "duration");
                    c474500IjALIZ2.LJJII("draw", "clear_type");
                    c474500IjALIZ2.LJIJJLI(this.LIZIZ);
                    c474500IjALIZ2.LIZ();
                }
                this.LJIIJ = false;
                this.LJIIJJI = 0L;
            }

            @Override // X.InterfaceC1081980eGK
            public final boolean LIZ() {
                return this.LJIIJ;
            }

            public static C21601619gM LJII(View view2) {
                if (view2 instanceof C21601619gM) {
                    return (C21601619gM) view2;
                }
                if (view2.getParent() instanceof View) {
                    return LJII((View) view2.getParent());
                }
                return null;
            }

            @Override // X.InterfaceC1081980eGK
            public final void LIZLLL(boolean z) {
                if (!SmoothClearScreenSetting.INSTANCE.smoothGesture()) {
                    return;
                }
                this.LJIIIZ = z;
            }

            @Override // X.InterfaceC1081980eGK
            public final void LJFF(boolean z) {
                if (z) {
                    if (!this.LJIIJ) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screen_clear");
                        c474500IjALIZ.LJJII("draw", "clear_type");
                        w.LIZ.getClass();
                        c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
                        c474500IjALIZ.LJIJJLI(this.LIZIZ);
                        c474500IjALIZ.LIZ();
                    }
                    this.LJIIJ = true;
                    this.LJIIJJI = System.currentTimeMillis();
                    LIZJ("draw", true);
                } else {
                    LIZIZ();
                    LIZJ("draw", false);
                }
                DataChannelGlobal.LLILZ.HQ2(ScreenClearEvent.class, Boolean.valueOf(z));
            }

            /* JADX WARN: Code restructure failed: missing block: B:55:0x00d4, code lost:
            
                LJFF(true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x00e5, code lost:
            
                LJFF(false);
             */
            /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
            @Override // X.InterfaceC1081980eGK
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LLJZ(android.view.MotionEvent r9) {
                /*
                    Method dump skipped, instruction units count: 233
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1080970eEh.LLJZ(android.view.MotionEvent):boolean");
            }

            @Override // X.InterfaceC1081980eGK
            public final void LIZJ(String str, boolean z) {
                AbstractC1080290eDb abstractC1080290eDb;
                String str2;
                DataChannel dataChannel2 = this.LIZIZ;
                if (SmoothClearScreenSetting.INSTANCE.optimizeAnimation()) {
                    abstractC1080290eDb = new AbstractC1080290eDb() { // from class: X.0eDd
                    };
                } else {
                    abstractC1080290eDb = C1080300eDc.LIZJ;
                }
                dataChannel2.LC0(StartClearScreenEvent.class, new C0KVO(z, str, abstractC1080290eDb));
                if (this.LJ == null) {
                    return;
                }
                InterfaceC1085480eLy interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(this.LJ.getId());
                if (interfaceC1085480eLyO41 != null) {
                    interfaceC1085480eLyO41.LJIJI(z);
                    Room room2 = this.LJ;
                    if (interfaceC1085480eLyO41.isEnabled()) {
                        String str3 = "disabled_due_to_landscape_mode";
                        String str4 = "enabled";
                        if (interfaceC1085480eLyO41.isPaused()) {
                            str2 = "disabled_due_to_clear_screen";
                        } else if (!interfaceC1085480eLyO41.LIZIZ()) {
                            str2 = "disabled_due_to_landscape_mode";
                        } else {
                            str2 = "enabled";
                        }
                        if (interfaceC1085480eLyO41.LJII()) {
                            str3 = "enabled";
                        }
                        if (!interfaceC1085480eLyO41.LJIJJ()) {
                            str4 = "disabled_due_to_being_audience_and_mic_room";
                        }
                        C00FX.LIZ(room2.getId(), UserService.getInstance().user().getCurrentUserId(), room2.getOwnerUserId(), "enabled", str2, str3, str4);
                    }
                }
                if (z) {
                    InterfaceC465670INx.LJLILLLLZI.LJFF(Boolean.TRUE);
                }
            }

            @Override // X.InterfaceC1081980eGK
            public final boolean LJI(float f, float f2) {
                float translationX;
                ViewParent viewParent;
                C1083090eI7 multiPropertyGroup;
                boolean z = false;
                if (!SmoothClearScreenSetting.INSTANCE.smoothGesture() || !this.LJIIIZ || Intrinsics.LJFF(this.LIZIZ.gg0(C781120UkY.class), Boolean.TRUE)) {
                    return false;
                }
                C21601619gM c21601619gMLJII = LJII(this.LIZJ);
                if (c21601619gMLJII != null && !c21601619gMLJII.LLJJLIIIJLLLLLLLZ && Math.abs(f2) > Math.abs(((double) f) * c21601619gMLJII.getTanValue())) {
                    return false;
                }
                LiveMultiPropertyGroupOptSetting liveMultiPropertyGroupOptSetting = LiveMultiPropertyGroupOptSetting.INSTANCE;
                if (liveMultiPropertyGroupOptSetting.enable()) {
                    LayeredElementManager<?> layeredElementManager2 = this.LIZLLL;
                    if (layeredElementManager2 == null) {
                        return false;
                    }
                    C1083090eI7 multiPropertyGroup2 = layeredElementManager2.getMultiPropertyGroup(C1079350eC5.LIZ);
                    if (multiPropertyGroup2 != null) {
                        translationX = multiPropertyGroup2.getTranslationX();
                    } else {
                        translationX = 0.0f;
                    }
                } else {
                    translationX = this.LIZJ.findViewById(C1079350eC5.LIZ).getTranslationX();
                }
                float f3 = translationX - f;
                if (!this.LJFF ? f3 > 0.0f : f3 < 0.0f) {
                    if (Math.abs(f3) < this.LIZJ.getWidth()) {
                        this.LIZIZ.LC0(SmoothClearScreenEvent.class, new C1080260eDY(f3, 0L));
                        KeyEvent.Callback callback = this.LIZJ;
                        if ((callback instanceof ViewParent) && (viewParent = (ViewParent) callback) != null) {
                            viewParent.requestDisallowInterceptTouchEvent(true);
                        }
                        C0IKG.LJI(this.LIZ.getActivity(), Boolean.FALSE);
                        C472280Ifa c472280IfaLIZLLL = C0IKG.LIZLLL(C0IKG.LIZ(this.LIZ.getActivity()));
                        if (c472280IfaLIZLLL != null) {
                            c472280IfaLIZLLL.setSmoothClearScreen(true);
                        }
                        return true;
                    }
                }
                if (liveMultiPropertyGroupOptSetting.enable()) {
                    LayeredElementManager<?> layeredElementManager3 = this.LIZLLL;
                    if (layeredElementManager3 == null || (multiPropertyGroup = layeredElementManager3.getMultiPropertyGroup(C1079350eC5.LIZ)) == null || multiPropertyGroup.getTranslationX() == 0.0f) {
                        return false;
                    }
                    return true;
                }
                if (this.LIZJ.findViewById(C1079350eC5.LIZ).getTranslationX() == 0.0f) {
                    z = true;
                }
                return !z;
            }

            @Override // X.InterfaceC1081980eGK
            public final boolean LJ(MotionEvent motionEvent, MotionEvent motionEvent2, float f) {
                boolean z = false;
                if (SmoothClearScreenSetting.INSTANCE.smoothGesture() || !this.LJIIIZ || Intrinsics.LJFF(this.LIZIZ.gg0(C781120UkY.class), Boolean.TRUE) || motionEvent == null || motionEvent2 == null) {
                    return false;
                }
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x) <= 200.0f || Math.abs(f) <= 100.0f) {
                    return false;
                }
                if ((C497740JfY.LJJ() && x < 0.0f) || (!C497740JfY.LJJ() && x > 0.0f)) {
                    z = true;
                }
                LJFF(z);
                return true;
            }

            {
                boolean z;
                this.LIZ = fragment;
                this.LIZIZ = dataChannel;
                this.LIZJ = view;
                this.LIZLLL = layeredElementManager;
                this.LJ = (Room) dataChannel.gg0(RoomChannel.class);
                if (view.getLayoutDirection() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJFF = z;
                this.LJIIIZ = true;
            }
        });
    }
}
