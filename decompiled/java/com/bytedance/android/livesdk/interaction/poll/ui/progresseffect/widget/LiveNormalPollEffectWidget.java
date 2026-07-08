package com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget;

import X.C001A;
import X.C1077930e9n;
import X.C1086690eNv;
import X.C176600m4;
import X.C21567019am;
import X.C494680Jac;
import X.C752710Tfp;
import X.C776250Uch;
import X.EnumC1086920eOI;
import X.EnumC1087550ePJ;
import X.InterfaceC1097170eep;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.dataChannel.AnchorResumePollEvent;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.NormalPollIdDataChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.LiveNormalPollViewModel;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveNormalPollEffectWidget extends LiveAbsPollEffectWidget {
    public int LLJJJJLIIL;
    public LiveNormalPollViewModel LLJJL;
    public long LLJJLIIIJLLLLLLLZ;

    public LiveNormalPollEffectWidget() {
        this(0);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hfc;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void O1() {
        if (this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        C1086690eNv.LJ(this.LLIZLLLIL, this.dataChannel, this.LLJJJ, EnumC1086920eOI.NORMAL);
    }

    public final boolean Q1() {
        return !this.LLJ && this.LLJJJJLIIL == 257;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        DataChannel dataChannel;
        if (C494680Jac.LJI(this.dataChannel)) {
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (C176600m4.LIZIZ(dataChannel2 != null ? (Boolean) dataChannel2.gg0(HighPrioritySlotVisibilityChannel.class) : null)) {
            return;
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (C176600m4.LIZIZ(dataChannel3 != null ? (Boolean) dataChannel3.gg0(HighPriorityTooltipVisibilityChannel.class) : null)) {
            return;
        }
        super.show();
        if (this.LLJJJJLIIL == 257) {
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.zW(PublicScreenNormalPollStateVisibilityChannel.class, Boolean.TRUE);
            }
            PollMessage pollMessage = this.LLIZLLLIL;
            if ((pollMessage == null || pollMessage.messageType != 1) && (dataChannel = this.dataChannel) != null) {
                dataChannel.zW(NormalPollIdDataChannel.class, Long.valueOf(pollMessage != null ? pollMessage.pollId : 0L));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void N1() {
        if (!Q1()) {
            super.N1();
        } else if (this.dataChannel != null) {
            super.N1();
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void P1() {
        super.P1();
        int i = this.LLJJIII;
        if (i == 1) {
            G1(R.drawable.f8j);
        } else if (i != 2) {
            G1(R.drawable.e6x);
        } else {
            G1(R.drawable.f8j);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        if (this.LLJJJJLIIL == 257) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(PublicScreenNormalPollStateVisibilityChannel.class, Boolean.FALSE);
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.zW(NormalPollIdDataChannel.class, 0L);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void init() {
        super.init();
        this.LLILLJJLI = (C21567019am) findViewById(R.id.n2n);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void initData() {
        super.initData();
        switch (this.LLJJJJLIIL) {
            case 257:
                if (!Q1()) {
                    C1();
                }
                break;
            case 258:
                PollMessage pollMessage = EnumC1087550ePJ.INSTANCE.pollMessage;
                this.LLIZLLLIL = pollMessage;
                this.LLILZLL = pollMessage != null ? pollMessage.startContent : null;
                break;
            case 259:
                D1(EnumC1086920eOI.NORMAL);
                break;
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        A1().setAccessibilityDelegate(null);
        if (Q1()) {
            this.LLJJLIIIJLLLLLLLZ = 0L;
            IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(C001A.LIVE_POLL_MESSAGE.getIntType(), this);
            }
        }
    }

    public LiveNormalPollEffectWidget(int i) {
        super(i);
        this.LLJJJJLIIL = i;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void G1(int i) {
        A1().setCircleBitmap(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        if (r2.intValue() == r1) goto L34;
     */
    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1(com.bytedance.android.livesdk.model.message.PollMessage r10) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget.J1(com.bytedance.android.livesdk.model.message.PollMessage):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void initConstructor(Object... objArr) {
        super.initConstructor(Arrays.copyOf(objArr, objArr.length));
        this.LLJJJJLIIL = ((Integer) objArr[0]).intValue();
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        NextLiveData<PollMessage> nextLiveData;
        PollMessage value;
        int iIntValue;
        Fragment fragment;
        Fragment parentFragment;
        super.onLoad(objArr);
        if (Q1()) {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            Integer num = null;
            if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null && (parentFragment = fragment.getParentFragment()) != null && parentFragment.isAdded()) {
                ViewModelProvider viewModelProviderOf = ViewModelProviders.of(parentFragment);
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    num = (Integer) dataChannel.gg0(C752710Tfp.class);
                }
                this.LLJJL = (LiveNormalPollViewModel) viewModelProviderOf.get(C1077930e9n.LIZ(num), LiveNormalPollViewModel.class);
            }
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, AnchorResumePollEvent.class, new AwS596S0100000_17(this, 194));
        }
        A1().setContentDescription(A1().getAccessibilityContentDescription());
        if (Q1()) {
            LiveNormalPollViewModel liveNormalPollViewModel = this.LLJJL;
            if (liveNormalPollViewModel != null) {
                Integer value2 = liveNormalPollViewModel.LLILZIL.getValue();
                if (value2 != null) {
                    iIntValue = value2.intValue();
                } else {
                    iIntValue = 0;
                }
                this.LLJJI = Integer.valueOf(iIntValue).intValue();
            }
            LiveNormalPollViewModel liveNormalPollViewModel2 = this.LLJJL;
            if (liveNormalPollViewModel2 != null && (nextLiveData = liveNormalPollViewModel2.LLILLJJLI) != null && (value = nextLiveData.getValue()) != null) {
                onMessage(value);
            }
        }
    }
}
