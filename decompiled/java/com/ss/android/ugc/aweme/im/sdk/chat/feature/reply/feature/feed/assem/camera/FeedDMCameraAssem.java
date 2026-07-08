package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.assem.camera;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0IBF;
import X.C1220000hqw;
import X.C1383370m6R;
import X.C13LE;
import X.C14MI;
import X.C1509305vX;
import X.C1559260qg8;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C451610HnL;
import X.C452070Ho5;
import X.C457680Hx8;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.viewmodel.CloseDetailFeedViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.CameraEffectViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class FeedDMCameraAssem extends IMUISlotViewAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C457680Hx8.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final C736950SvV LLJJIJI;
    public final C736950SvV LLJJIJIIJIL;
    public final C736950SvV LLJJIJIL;
    public boolean LLJJJ;
    public TuxIconView LLJJJIL;
    public final C01GW LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedDMCameraAssem.class, "cameraEntranceVM", "getCameraEntranceVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/camera/ChatRoomCameraVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem, com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        C426750GoL.LJIIIZ(LJJIJL(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, null, false, 30);
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0Hx5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C232000v0) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS289S0000000_6.get$arr$(11), 4);
    }

    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setBackground(C14MI.LIZ(tuxIconView.getContext(), R.drawable.c_7));
        tuxIconView.setBackgroundTintMode(PorterDuff.Mode.SRC_OVER);
        tuxIconView.setBackgroundTintList(ColorStateList.valueOf(C1383370m6R.LJFF(R.attr.dy)));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
        tuxIconView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_camera_fill;
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        c419910GdJ.LIZLLL = Integer.valueOf(C1383370m6R.LJFF(R.attr.ee));
        tuxIconView.setTuxIcon(c419910GdJ);
        return tuxIconView;
    }

    public final CameraEffectViewModel hp() {
        return (CameraEffectViewModel) this.LLJJIJIL.getValue();
    }

    public final ChatRoomCameraVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (ChatRoomCameraVM) assemVMLazy.getValue();
    }

    public final C457680Hx8 kp() {
        return (C457680Hx8) this.LLJJI.getValue();
    }

    public FeedDMCameraAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatRoomCameraVM.class);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ, 214);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(112);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS550S0100000_6, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS550S0100000_6((AbstractC738140SxQ) this, 215), aFwS236S0000000_6, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJIII = assemVMLazy;
        AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6(this, 213);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CloseDetailFeedViewModel.class);
        AFwS236S0000000_6 aFwS236S0000000_62 = AFwS236S0000000_6.get$arr$(113);
        this.LLJJIJI = new C736950SvV(c19719912DlLIZ2, new AwS550S0100000_6(awS550S0100000_62, 216), c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS236S0000000_62, new AwS550S0100000_6((AbstractC738140SxQ) this, 217), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIJIIJIL = new C736950SvV(C13LE.LIZ(SendMessageViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(114), new AwS550S0100000_6((AbstractC738140SxQ) this, 218), new C451610HnL(this, true, true), new C723700Sa8(this));
        AwS550S0100000_6 awS550S0100000_63 = new AwS550S0100000_6(this, 212);
        this.LLJJIJIL = new C736950SvV(C13LE.LIZ(CameraEffectViewModel.class), awS550S0100000_63, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(115), new AwS550S0100000_6((AbstractC738140SxQ) this, 219), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJJ = true;
        this.LLJJJJ = C1509305vX.LIZ(new AwS550S0100000_6(this, 211));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView;
        super.onViewCreated(view);
        if (view instanceof TuxIconView) {
            tuxIconView = (TuxIconView) view;
        } else {
            tuxIconView = null;
        }
        this.LLJJJIL = tuxIconView;
        if (ip().getState().LL == C0IBF.FEATURE_STATUS_UNKNOWN || ip().getState().LL == C0IBF.FEATURE_STATUS_SHOW) {
            C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.09ho
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C2443309hn) obj).LL;
                }
            }, null, new AwS620S0100000_6(this, 122), 6);
            C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.09hp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C2443309hn) obj).LLILLJJLI;
                }
            }, null, new AwS620S0100000_6(this, 123), 6);
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Hwf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C457970Hxb) obj).LL;
            }
        }, null, new AwS620S0100000_6(this, 121), 6);
        TuxIconView tuxIconView2 = this.LLJJJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS141S0100000_6(this, 108));
        }
    }
}
