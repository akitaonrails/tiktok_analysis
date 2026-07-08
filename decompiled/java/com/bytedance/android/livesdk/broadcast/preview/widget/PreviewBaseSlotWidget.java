package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C1123980fM4;
import X.C1602160rnK;
import X.C1848410yCV;
import X.C19EG;
import X.C20094213jo;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C486790J7d;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520010KaN;
import X.C760180Trs;
import X.C770230UJh;
import X.C770490UKh;
import X.C770530UKl;
import X.C781270Ukn;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC756810TmR;
import X.EnumC785140Ur2;
import X.InterfaceC1097170eep;
import X.InterfaceC1123890fLv;
import X.InterfaceC1124060fMC;
import X.InterfaceC770540UKm;
import X.InterfaceC770570UKp;
import X.InterfaceC782830UnJ;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS116S0200000_12;
import Y.AObserverS125S0300000_12;
import Y.AObserverS177S0200000_12;
import Y.AObserverS216S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import avg.f;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewMoreLessVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostFixResolveErrorSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import u4.q0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PreviewBaseSlotWidget extends PreviewWidget implements InterfaceC1123890fLv, InterfaceC782830UnJ {
    public InterfaceC770540UKm LLILZ;
    public C770530UKl LLILZIL;
    public IIconSlot.SlotViewModel LLILZLL;
    public boolean LLIZ;
    public final long LLIZLLLIL = SystemClock.uptimeMillis();
    public long LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void E1() {
        C770530UKl c770530UKl;
        Fragment fragment;
        Fragment fragment2;
        Fragment fragment3;
        super.E1();
        this.LLJ = SystemClock.uptimeMillis();
        Context contextLJJIIZI = C520010KaN.LJJIIZI(this.context, false);
        C19EG activity = null;
        if (contextLJJIIZI != null) {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep == null || (fragment3 = interfaceC1097170eep.getFragment()) == null || (fragment2 = C520010KaN.LJII(fragment3)) == null) {
                InterfaceC1097170eep interfaceC1097170eep2 = this.widgetCallback;
                fragment2 = interfaceC1097170eep2 != null ? interfaceC1097170eep2.getFragment() : null;
            }
            this.LLILZ = C781270Ukn.LJJII().createIconSlotController(contextLJJIIZI, this, J1(), H1(), fragment2);
        }
        InterfaceC770540UKm interfaceC770540UKm = this.LLILZ;
        if (interfaceC770540UKm != null) {
            interfaceC770540UKm.setDataChannel(this.dataChannel);
        }
        if (LiveHostFixResolveErrorSetting.getEnable()) {
            c770530UKl = new C770530UKl(this.context, 0);
        } else {
            InterfaceC1097170eep interfaceC1097170eep3 = this.widgetCallback;
            if (interfaceC1097170eep3 != null && (fragment = interfaceC1097170eep3.getFragment()) != null) {
                activity = fragment.getActivity();
            }
            c770530UKl = new C770530UKl(activity, 0);
        }
        this.LLILZIL = c770530UKl;
        c770530UKl.setId(View.generateViewId());
        C770530UKl c770530UKl2 = this.LLILZIL;
        if (c770530UKl2 != null) {
            int visibility = c770530UKl2.getVisibility();
            c770530UKl2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c770530UKl2);
        }
        DataChannel dataChannel = this.dataChannel;
        dataChannel.EQ2(this, BroadcastSettingResponseChannel.class, new AwS591S0100000_12(this, 1053));
        dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 1054));
    }

    public abstract void G1();

    public abstract EnumC785140Ur2 H1();

    public InterfaceC770570UKp I1() {
        return null;
    }

    public abstract EnumC756810TmR J1();

    public abstract boolean L1(boolean z);

    @Override // X.InterfaceC1123890fLv
    public final /* synthetic */ void LJJL(IIconSlot.SlotViewModel slotViewModel) {
    }

    @Override // X.InterfaceC1123890fLv
    public /* synthetic */ View LJLLI() {
        return null;
    }

    public boolean O1() {
        return false;
    }

    @Override // X.InterfaceC1123890fLv
    public final /* synthetic */ void P0(Boolean bool) {
    }

    public abstract void P1(BroadcastSettingResponse broadcastSettingResponse);

    public abstract void Q1(String str);

    @Override // X.InterfaceC1123890fLv
    public final void g(EnumC785140Ur2 enumC785140Ur2) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0y;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LJJLIIIJLLLLLLLZ() {
        DataChannel dataChannel = this.dataChannel;
        return (dataChannel == null || dataChannel.gg0(PreviewMoreLessVisibilityChannel.class) == null) ? false : true;
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLILLIZIL() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            return Intrinsics.LJFF(dataChannel.gg0(C770490UKh.class), Boolean.TRUE);
        }
        return false;
    }

    public final void M1() {
        BroadcastSettingResponse broadcastSettingResponse;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (broadcastSettingResponse = (BroadcastSettingResponse) dataChannel.gg0(BroadcastSettingResponseChannel.class)) == null) {
            return;
        }
        C486790J7d.LIZJ(new ARunnableS81S0200000_12(broadcastSettingResponse, this, 32));
        C486790J7d.LIZJ(new ARunnableS112S0100000_12(this, 74));
    }

    public final void N1() {
        InterfaceC1097170eep interfaceC1097170eep;
        Fragment fragment;
        Lifecycle lifecycle;
        InterfaceC770540UKm interfaceC770540UKm = this.LLILZ;
        if (interfaceC770540UKm != null) {
            interfaceC770540UKm.load(J1());
        }
        InterfaceC770540UKm interfaceC770540UKm2 = this.LLILZ;
        if (interfaceC770540UKm2 == null || (interfaceC1097170eep = this.widgetCallback) == null || (fragment = interfaceC1097170eep.getFragment()) == null || (lifecycle = fragment.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(interfaceC770540UKm2);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<String> mutableLiveData;
        if (this.LLILZIL == null || (slotViewModel = this.LLILZLL) == null) {
            return;
        }
        MutableLiveData<Boolean> mutableLiveData2 = slotViewModel.LLILZ;
        if (C500260Jjc.LJJJI(mutableLiveData2 != null ? mutableLiveData2.getValue() : null)) {
            C770530UKl c770530UKl = this.LLILZIL;
            if (c770530UKl != null) {
                int visibility = c770530UKl.getVisibility();
                c770530UKl.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c770530UKl);
            }
            super.show();
        }
        J1().name();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("slot visible change, visible: true, iconText: ");
        IIconSlot.SlotViewModel slotViewModel2 = this.LLILZLL;
        sbLIZ.append((slotViewModel2 == null || (mutableLiveData = slotViewModel2.LLJILJILJ) == null) ? null : mutableLiveData.getValue());
        C2188811AlT.LIZIZ(sbLIZ);
        C823050WQl.LIZIZ().submit(new ARunnableS112S0100000_12((Object) null, 362));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void C1() {
        super.C1();
        if (C760180Trs.LJII() && this.dataChannel.gg0(LiveModeChannel.class) == LiveMode.VIDEO) {
            C770230UJh.LIZ.getClass();
            C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ((C770230UJh.LIZIZ() - 28) / 5), getView());
        }
        if (C760180Trs.LJI()) {
            Object objGg0 = this.dataChannel.gg0(LiveModeChannel.class);
            if (objGg0 == LiveMode.SCREEN_RECORD || objGg0 == LiveMode.THIRD_PARTY) {
                C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ((((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ())) - 28) / 5), getView());
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        MutableLiveData<String> mutableLiveData;
        super.hide();
        if (this.LLILZIL == null || this.LLILZLL == null) {
            return;
        }
        J1().name();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("slot visible change, visible: false, iconText: ");
        IIconSlot.SlotViewModel slotViewModel = this.LLILZLL;
        sbLIZ.append((slotViewModel == null || (mutableLiveData = slotViewModel.LLJILJILJ) == null) ? null : mutableLiveData.getValue());
        C2188811AlT.LIZIZ(sbLIZ);
        C823050WQl.LIZIZ().submit(new ARunnableS112S0100000_12((Object) null, 362));
    }

    @Override // X.InterfaceC1123890fLv
    public void t1(InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
        LifecycleOwner fragment;
        LifecycleOwner fragment2;
        LifecycleOwner fragment3;
        LifecycleOwner fragment4;
        LifecycleOwner fragment5;
        LifecycleOwner fragment6;
        LifecycleOwner fragment7;
        LifecycleOwner fragment8;
        LifecycleOwner fragment9;
        C770530UKl c770530UKl;
        TextView alertText;
        TextView alertText2;
        slotViewModel.LL.setValue(Boolean.TRUE);
        this.LLILZLL = slotViewModel;
        interfaceC1124060fMC.LIZ();
        MutableLiveData<Boolean> mutableLiveData = slotViewModel.LLILZ;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null) {
            fragment = this;
        }
        mutableLiveData.observe(fragment, new AObserverS125S0300000_12(interfaceC1124060fMC, slotViewModel, this, 11));
        MutableLiveData<Drawable> mutableLiveData2 = slotViewModel.LLJILJIL;
        InterfaceC1097170eep interfaceC1097170eep2 = this.widgetCallback;
        if (interfaceC1097170eep2 == null || (fragment2 = interfaceC1097170eep2.getFragment()) == null) {
            fragment2 = this;
        }
        mutableLiveData2.observe(fragment2, new AObserverS177S0200000_12(slotViewModel, this, 17));
        MutableLiveData<Boolean> mutableLiveData3 = slotViewModel.LLIZ;
        InterfaceC1097170eep interfaceC1097170eep3 = this.widgetCallback;
        if (interfaceC1097170eep3 == null || (fragment3 = interfaceC1097170eep3.getFragment()) == null) {
            fragment3 = this;
        }
        mutableLiveData3.observe(fragment3, new AObserverS177S0200000_12(slotViewModel, this, 18));
        MutableLiveData<String> mutableLiveData4 = slotViewModel.LLIZLLLIL;
        InterfaceC1097170eep interfaceC1097170eep4 = this.widgetCallback;
        if (interfaceC1097170eep4 == null || (fragment4 = interfaceC1097170eep4.getFragment()) == null) {
            fragment4 = this;
        }
        mutableLiveData4.observe(fragment4, new AObserverS216S0100000_12(this, 25));
        MutableLiveData<String> mutableLiveData5 = slotViewModel.LLILZLL;
        InterfaceC1097170eep interfaceC1097170eep5 = this.widgetCallback;
        if (interfaceC1097170eep5 == null || (fragment5 = interfaceC1097170eep5.getFragment()) == null) {
            fragment5 = this;
        }
        mutableLiveData5.observe(fragment5, new AObserverS177S0200000_12(slotViewModel, this, 19));
        MutableLiveData<String> mutableLiveData6 = slotViewModel.LLJJ;
        InterfaceC1097170eep interfaceC1097170eep6 = this.widgetCallback;
        if (interfaceC1097170eep6 == null || (fragment6 = interfaceC1097170eep6.getFragment()) == null) {
            fragment6 = this;
        }
        mutableLiveData6.observe(fragment6, new AObserverS177S0200000_12(slotViewModel, this, 20));
        MutableLiveData<Drawable> mutableLiveData7 = slotViewModel.LLJ;
        InterfaceC1097170eep interfaceC1097170eep7 = this.widgetCallback;
        if (interfaceC1097170eep7 == null || (fragment7 = interfaceC1097170eep7.getFragment()) == null) {
            fragment7 = this;
        }
        mutableLiveData7.observe(fragment7, new AObserverS177S0200000_12(slotViewModel, this, 21));
        MutableLiveData<String> mutableLiveData8 = slotViewModel.LLJILJILJ;
        InterfaceC1097170eep interfaceC1097170eep8 = this.widgetCallback;
        if (interfaceC1097170eep8 == null || (fragment8 = interfaceC1097170eep8.getFragment()) == null) {
            fragment8 = this;
        }
        mutableLiveData8.observe(fragment8, new AObserverS177S0200000_12(slotViewModel, this, 22));
        MutableLiveData<Boolean> mutableLiveData9 = slotViewModel.LLJJJIL;
        InterfaceC1097170eep interfaceC1097170eep9 = this.widgetCallback;
        if (interfaceC1097170eep9 == null || (fragment9 = interfaceC1097170eep9.getFragment()) == null) {
            fragment9 = this;
        }
        mutableLiveData9.observe(fragment9, new AObserverS177S0200000_12(slotViewModel, this, 23));
        C770530UKl c770530UKl2 = this.LLILZIL;
        if (c770530UKl2 != null) {
            View.OnClickListener aCListenerS116S0200000_12 = new ACListenerS116S0200000_12(this, interfaceC1124060fMC, 16);
            if (C1848410yCV.LIZ) {
                aCListenerS116S0200000_12 = new f(aCListenerS116S0200000_12);
            }
            a aVar = new a(aCListenerS116S0200000_12);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c770530UKl2);
            }
            c770530UKl2.setOnClickListener(aVar);
        }
        C770530UKl c770530UKl3 = this.LLILZIL;
        if (c770530UKl3 != null) {
            q0.LJIJ(c770530UKl3, new C20094213jo() { // from class: X.0UKn
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    CharSequence text;
                    TextView textView;
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    C770530UKl c770530UKl4 = this.LIZ.LLILZIL;
                    if (c770530UKl4 != null && (textView = c770530UKl4.getTextView()) != null) {
                        text = textView.getText();
                    } else {
                        text = null;
                    }
                    accessibilityNodeInfoCompat.setContentDescription(text);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
        }
        if (slotViewModel.LLLFFI.booleanValue()) {
            C770530UKl c770530UKl4 = this.LLILZIL;
            if (c770530UKl4 != null) {
                c770530UKl4.e0();
            }
            C770530UKl c770530UKl5 = this.LLILZIL;
            if (c770530UKl5 != null && (alertText2 = c770530UKl5.getAlertText()) != null) {
                C786410Ut5.LLIL(alertText2, 8);
            }
            C770530UKl c770530UKl6 = this.LLILZIL;
            if (c770530UKl6 != null && (alertText = c770530UKl6.getAlertText()) != null) {
                alertText.setText("");
            }
        }
        if (F1() && (c770530UKl = this.LLILZIL) != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c770530UKl);
            c770530UKl.setAlpha(0.4f);
        }
    }

    @Override // X.InterfaceC1123890fLv
    public final void v1(C1123980fM4 c1123980fM4, IIconSlot.SlotViewModel slotViewModel) {
        t1(c1123980fM4.LIZIZ, slotViewModel);
    }
}
