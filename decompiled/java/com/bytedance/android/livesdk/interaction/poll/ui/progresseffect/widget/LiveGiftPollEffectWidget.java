package com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget;

import X.C1086690eNv;
import X.C1086850eOB;
import X.C1086860eOC;
import X.C1119920fFW;
import X.C1161920gLG;
import X.C11NJ;
import X.C1324570kZb;
import X.C1324720kZq;
import X.C16F5;
import X.C21567019am;
import X.C2188811AlT;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1086920eOI;
import X.EnumC1087550ePJ;
import Y.ARunnableS1S0100200_17;
import Y.AfS186S0100000_17;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.AnchorResumePollEvent;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftPollEffectWidget extends LiveAbsPollEffectWidget {
    public final int LLJJJJLIIL;
    public final int LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public C1324720kZq LLJL;
    public C1324720kZq LLJLIL;
    public C16F5 LLJLILLLLZIIL;
    public C16F5 LLJLL;
    public final C11NJ LLJLLIL;
    public ConstraintLayout LLJLLL;

    public LiveGiftPollEffectWidget() {
        this(0);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void G1(int i) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.go8;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
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
        C1086690eNv.LJ(this.LLIZLLLIL, this.dataChannel, this.LLJJJ, EnumC1086920eOI.GIFT);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        DataChannel dataChannel;
        if (C494680Jac.LJI(this.dataChannel)) {
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || !Intrinsics.LJFF(dataChannel2.gg0(HighPrioritySlotVisibilityChannel.class), Boolean.TRUE)) {
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 == null || !Intrinsics.LJFF(dataChannel3.gg0(HighPriorityTooltipVisibilityChannel.class), Boolean.TRUE)) {
                super.show();
                if (this.LLJJJJLIIL != 257 || (dataChannel = this.dataChannel) == null) {
                    return;
                }
                dataChannel.zW(PublicScreenGiftPollStateVisibilityChannel.class, Boolean.TRUE);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void M1() {
        PollOptionInfo pollOptionInfo;
        PollOptionInfo pollOptionInfo2;
        PollOptionInfo pollOptionInfo3;
        PollOptionInfo pollOptionInfo4;
        super.M1();
        List<PollOptionInfo> list = this.LLIZ;
        int i = 0;
        if (list != null && list.size() == 0) {
            this.LLJJIII = 0;
        } else {
            List<PollOptionInfo> list2 = this.LLIZ;
            long j = 0;
            long j2 = (list2 == null || (pollOptionInfo4 = (PollOptionInfo) ListProtector.get(list2, 0)) == null) ? 0L : pollOptionInfo4.votes;
            List<PollOptionInfo> list3 = this.LLIZ;
            if (j2 > ((list3 == null || (pollOptionInfo3 = (PollOptionInfo) ListProtector.get(list3, 1)) == null) ? 0L : pollOptionInfo3.votes)) {
                i = 1;
            } else {
                List<PollOptionInfo> list4 = this.LLIZ;
                long j3 = (list4 == null || (pollOptionInfo2 = (PollOptionInfo) ListProtector.get(list4, 0)) == null) ? 0L : pollOptionInfo2.votes;
                List<PollOptionInfo> list5 = this.LLIZ;
                if (list5 != null && (pollOptionInfo = (PollOptionInfo) ListProtector.get(list5, 1)) != null) {
                    j = pollOptionInfo.votes;
                }
                if (j3 < j) {
                    i = 2;
                }
            }
            this.LLJJIII = i;
        }
        if (this.LLJJJJLIIL == 257) {
            int i2 = this.LLJJIII;
            if (i2 == 1) {
                C500260Jjc.LJL((int) C497740JfY.LIZIZ(39.0f), this.LLJL);
                C500260Jjc.LJLJI((int) C497740JfY.LIZIZ(16.0f), this.LLJLILLLLZIIL);
            } else if (i2 != 2) {
                C500260Jjc.LJL((int) C497740JfY.LIZIZ(29.0f), this.LLJL);
                C500260Jjc.LJLJI((int) C497740JfY.LIZIZ(30.0f), this.LLJLILLLLZIIL);
            } else {
                C500260Jjc.LJL((int) C497740JfY.LIZIZ(16.0f), this.LLJL);
                C500260Jjc.LJLJI((int) C497740JfY.LIZIZ(39.0f), this.LLJLILLLLZIIL);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        DataChannel dataChannel;
        super.hide();
        if (this.LLJJJJLIIL != 257 || (dataChannel = this.dataChannel) == null) {
            return;
        }
        dataChannel.zW(PublicScreenGiftPollStateVisibilityChannel.class, Boolean.FALSE);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void init() {
        super.init();
        this.LLILLJJLI = (C21567019am) findViewById(R.id.myk);
        this.LLJL = (C1324720kZq) this.contentView.findViewById(R.id.rft);
        this.LLJLIL = (C1324720kZq) this.contentView.findViewById(R.id.rg3);
        this.LLJLILLLLZIIL = (C16F5) this.contentView.findViewById(R.id.rg6);
        this.LLJLL = (C16F5) this.contentView.findViewById(R.id.rfw);
        if (!C497740JfY.LJJ()) {
            C16F5 c16f5 = this.LLJLL;
            if (c16f5 != null) {
                c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, c16f5.getContext()));
            }
            C16F5 c16f52 = this.LLJLILLLLZIIL;
            if (c16f52 != null) {
                c16f52.setTypeface(C1119920fFW.LIZJ(c16f52.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, c16f52.getContext()));
            }
        }
        this.LLJLLL = (ConstraintLayout) this.contentView.findViewById(R.id.izn);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void initData() {
        ViewGroup.LayoutParams layoutParams;
        Gift gift;
        Gift gift2;
        super.initData();
        C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        ViewGroup.LayoutParams layoutParams2 = null;
        C1324570kZb.LIZIZ((pollGifts == null || (gift2 = pollGifts.LIZ) == null) ? null : gift2.icon, this.LLJL);
        C1324570kZb.LIZIZ((pollGifts == null || (gift = pollGifts.LIZIZ) == null) ? null : gift.icon, this.LLJLIL);
        this.LLJLLIL.LIZ(C784440Upu.LIZ().LJ(C1086860eOC.class).LJJLJLI(new AfS186S0100000_17(this, 61)));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, AnchorResumePollEvent.class, new AwS596S0100000_17(this, 193));
        }
        switch (this.LLJJJJLIIL) {
            case 257:
                C1324720kZq c1324720kZq = this.LLJL;
                ViewGroup.LayoutParams layoutParams3 = c1324720kZq != null ? c1324720kZq.getLayoutParams() : null;
                C500260Jjc.LJL((int) C497740JfY.LIZIZ(29.0f), this.LLJL);
                if (layoutParams3 != null) {
                    layoutParams3.height = (int) C497740JfY.LIZIZ(24.0f);
                    layoutParams3.width = (int) C497740JfY.LIZIZ(24.0f);
                }
                C1324720kZq c1324720kZq2 = this.LLJL;
                if (c1324720kZq2 != null) {
                    C786410Ut5.u6(c1324720kZq2, layoutParams3);
                }
                C1324720kZq c1324720kZq3 = this.LLJLIL;
                if (c1324720kZq3 != null) {
                    layoutParams = c1324720kZq3.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) C497740JfY.LIZIZ(24.0f);
                        layoutParams.width = (int) C497740JfY.LIZIZ(24.0f);
                    }
                } else {
                    layoutParams = null;
                }
                C1324720kZq c1324720kZq4 = this.LLJLIL;
                if (c1324720kZq4 != null) {
                    C786410Ut5.u6(c1324720kZq4, layoutParams);
                }
                C16F5 c16f5 = this.LLJLILLLLZIIL;
                ViewGroup.LayoutParams layoutParams4 = c16f5 != null ? c16f5.getLayoutParams() : null;
                C500260Jjc.LJLJI((int) C497740JfY.LIZIZ(30.0f), this.LLJLILLLLZIIL);
                C16F5 c16f52 = this.LLJLILLLLZIIL;
                if (c16f52 != null) {
                    C786410Ut5.y6(c16f52, layoutParams4);
                }
                ConstraintLayout constraintLayout = this.LLJLLL;
                if (constraintLayout != null && (layoutParams2 = constraintLayout.getLayoutParams()) != null) {
                    layoutParams2.width = (int) C497740JfY.LIZIZ(214.0f);
                }
                ConstraintLayout constraintLayout2 = this.LLJLLL;
                if (constraintLayout2 != null) {
                    C786410Ut5.m6(constraintLayout2, layoutParams2);
                }
                C1();
                break;
            case 258:
                PollMessage pollMessage = EnumC1087550ePJ.INSTANCE.pollMessage;
                this.LLIZLLLIL = pollMessage;
                this.LLILZLL = pollMessage != null ? pollMessage.startContent : null;
                break;
            case 259:
                D1(EnumC1086920eOI.GIFT);
                break;
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        this.LLJLLIL.LJ();
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void x1() {
        Gift gift;
        Gift gift2;
        super.x1();
        C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        if (this.LLJJJJLIIL != 257) {
            ImageModel imageModel = null;
            C1324570kZb.LIZIZ((pollGifts == null || (gift2 = pollGifts.LIZ) == null) ? null : gift2.image, this.LLJL);
            C1324720kZq c1324720kZq = this.LLJLIL;
            if (pollGifts != null && (gift = pollGifts.LIZIZ) != null) {
                imageModel = gift.image;
            }
            C1324570kZb.LIZIZ(imageModel, c1324720kZq);
        }
        C1324720kZq c1324720kZq2 = this.LLJL;
        if (c1324720kZq2 != null) {
            C786410Ut5.h5(c1324720kZq2, 1.0f);
        }
        C1324720kZq c1324720kZq3 = this.LLJLIL;
        if (c1324720kZq3 != null) {
            C786410Ut5.h5(c1324720kZq3, 1.0f);
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void y1() {
        C1324720kZq c1324720kZq;
        super.y1();
        C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        if (this.LLJJJJLIIL != 257) {
            C1324570kZb.LIZIZ(pollGifts != null ? pollGifts.LIZJ : null, this.LLJL);
            C1324570kZb.LIZIZ(pollGifts != null ? pollGifts.LIZLLL : null, this.LLJLIL);
        }
        if (this.LLJJJJLIIL == 257) {
            int i = this.LLJJIII;
            if (i != 1) {
                if (i != 2 || (c1324720kZq = this.LLJL) == null) {
                    return;
                }
                C786410Ut5.h5(c1324720kZq, 0.4f);
                return;
            }
            C1324720kZq c1324720kZq2 = this.LLJLIL;
            if (c1324720kZq2 != null) {
                C786410Ut5.h5(c1324720kZq2, 0.4f);
            }
        }
    }

    public LiveGiftPollEffectWidget(int i) {
        super(i);
        this.LLJJJJLIIL = i;
        this.LLJJL = 1000000;
        this.LLJJLIIIJLLLLLLLZ = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LLJLLIL = new C11NJ();
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void I1(float f) {
        super.I1(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1.gg0(com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel.class), java.lang.Boolean.TRUE) != false) goto L31;
     */
    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1(com.bytedance.android.livesdk.model.message.PollMessage r6) {
        /*
            r5 = this;
            r2 = 1
            if (r6 == 0) goto Le
            java.lang.Integer r0 = r6.pollKind
            if (r0 == 0) goto Le
            int r0 = r0.intValue()
            if (r0 == r2) goto Le
            return
        Le:
            super.J1(r6)
            int r0 = r5.LLJJJJLIIL
            r4 = 257(0x101, float:3.6E-43)
            if (r0 != r4) goto L54
            java.util.List<com.bytedance.android.livesdk.model.message.PollOptionInfo> r0 = r5.LLIZ
            if (r0 == 0) goto L50
            int r1 = r0.size()
            r0 = 2
            if (r1 < r0) goto L50
            com.bytedance.android.livesdk.model.message.PollMessage r0 = r5.LLIZLLLIL
            if (r0 == 0) goto L50
            java.lang.Integer r3 = r0.pollKind
            X.0eOI r0 = X.EnumC1086920eOI.GIFT
            int r1 = r0.ordinal()
            if (r3 == 0) goto L50
            int r0 = r3.intValue()
            if (r0 != r1) goto L50
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r5.LLJI
            if (r0 == 0) goto L54
            boolean r0 = r0.giftPollVoteEnabled
            if (r0 != 0) goto L54
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            if (r1 == 0) goto L50
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel> r0 = com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel.class
            java.lang.Object r1 = r1.gg0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L54
        L50:
            r5.hide()
            return
        L54:
            r5.show()
            r5.L1()
            int r0 = r5.LL
            if (r0 != r4) goto L6f
            boolean r0 = r5.LLJIJIL
            if (r0 != 0) goto L6f
            boolean r0 = r5.LLJ
            if (r0 != 0) goto L6f
            com.bytedance.android.livesdk.model.message.PollMessage r1 = r5.LLIZLLLIL
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            X.C1086690eNv.LIZ(r1, r0)
            r5.LLJIJIL = r2
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget.J1(com.bytedance.android.livesdk.model.message.PollMessage):void");
    }

    public final String Q1(long j) {
        int i = this.LLJJL;
        if (j >= i) {
            long j2 = j * 1;
            if (j > i * 999) {
                j2 = ((long) (i * 999)) * 1;
            }
            String strJ4 = C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf((j2 * 1.0d) / ((double) i))}, 1));
            if (C497740JfY.LJJ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(R1(strJ4));
                sbLIZ.append("m x");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("x ");
            sbLIZ2.append(R1(strJ4));
            sbLIZ2.append('m');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        int i2 = this.LLJJLIIIJLLLLLLLZ;
        if (j >= i2) {
            String strJ42 = C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf((j * 1.0d) / ((double) i2))}, 1));
            if (C497740JfY.LJJ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(R1(strJ42));
                sbLIZ3.append("k x");
                return C2188811AlT.LIZIZ(sbLIZ3);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("x ");
            sbLIZ4.append(R1(strJ42));
            sbLIZ4.append('k');
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (C497740JfY.LJJ()) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(j);
            sbLIZ5.append(" x");
            return C2188811AlT.LIZIZ(sbLIZ5);
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("x ");
        sbLIZ6.append(j);
        return C2188811AlT.LIZIZ(sbLIZ6);
    }

    public final String R1(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 3) {
            String strSubstring = str.substring(0, 4);
            if (u.LJIIZILJ(strSubstring, e3.d, false)) {
                return strSubstring.substring(0, 3);
            }
            return strSubstring;
        }
        return str;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void H1(long j, long j2) {
        if (j > this.LLJILLL || j2 > this.LLJJ) {
            this.LLJILLL = j;
            this.LLJJ = j2;
            A1().LJFF(j, j2);
            TextView textView = (TextView) this.contentView.findViewById(R.id.rfw);
            TextView textView2 = (TextView) this.contentView.findViewById(R.id.rg6);
            if (C497740JfY.LJJ()) {
                textView.setText(Q1(j));
                textView2.setText(Q1(j2));
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(Q1(j));
                sbLIZ.append(' ');
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(Q1(j2));
                sbLIZ2.append(' ');
                textView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
            }
            HandlerHook.viewPost(A1(), new ARunnableS1S0100200_17(j, j2, this, 4));
        }
    }
}
