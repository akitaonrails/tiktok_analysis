package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit;

import X.AnonymousClass0956;
import X.C011Z;
import X.C01GW;
import X.C054G;
import X.C0PEM;
import X.C0TND;
import X.C1091980eWS;
import X.C1092620eXU;
import X.C1217150hmL;
import X.C13LE;
import X.C16F5;
import X.C1790620whI;
import X.C1817560xOk;
import X.C1817570xOl;
import X.C1817590xOn;
import X.C1817600xOo;
import X.C1817610xOp;
import X.C1817620xOq;
import X.C1817640xOs;
import X.C1817650xOt;
import X.C1BNE;
import X.C2252321DDq;
import X.C2296808zG;
import X.C329001Pk;
import X.C329201Pm;
import X.C329501Pp;
import X.C329701Pr;
import X.C330101Pv;
import X.C441601ni;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C723850SaN;
import X.C748880TZe;
import X.C769220UFk;
import X.C786410Ut5;
import X.EnumC1154390g97;
import X.InterfaceC1097170eep;
import X.InterfaceC1814530xJr;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.BackToBoardsPageDialog;
import com.bytedance.android.live.CameraResumeEvent;
import com.bytedance.android.live.DecorationEditLogDataEvent;
import com.bytedance.android.live.DecorationJumpToItemEditorEvent;
import com.bytedance.android.live.PreviewBoardRenderDoneEvent;
import com.bytedance.android.live.broadcast.PreviewDecorationCreateSchemeEvent;
import com.bytedance.android.live.broadcast.PreviewDecorationEditSchemeEvent;
import com.bytedance.android.live.broadcast.PreviewSchemaCreateBoardEvent;
import com.bytedance.android.live.broadcast.api.PreviewBoardPlaceHolderVisibility;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.SmbLiveKickstarterSetting;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.BackToEditPageEvent;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.ShowDecorationTopButtonsEvent;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.ShowOrHideDecorationEditMaskEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.PreviewEditingDecorationToolsEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditAssem;
import com.bytedance.android.livesdk.dataChannel.BottomTabGroupVisiblityChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewBulletinEditVisibilityChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBoardUiConfigSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class PreviewBulletinEditWidget extends PreviewWidget {
    public LiveIconView LLILZ;
    public C16F5 LLILZIL;
    public FrameLayout LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public String LLJ = "live_take_page";
    public final C01GW LLJI = C452501pT.LIZIZ(new C1817570xOl());
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1817600xOo());
    public final C2252321DDq LLJILJIL = C1BNE.LIZ(Boolean.FALSE);
    public boolean LLJILJILJ = true;
    public final C054G LLJILLL = C2296808zG.LIZ(C0PEM.LIZ);
    public AnonymousClass0956 LLJJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.g26;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        J1(false);
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(BottomTabGroupVisiblityChannel.class, Boolean.TRUE);
        }
        this.dataChannel.zW(PreviewBoardPlaceHolderVisibility.class, Boolean.FALSE);
        Context context = this.context;
        View[] viewArr = {this.LLIZ};
        C769220UFk.LIZ.getClass();
        C769220UFk.LIZJ(context);
        View view = viewArr[0];
        if (view != null) {
            view.setBackgroundColor(0);
            C500260Jjc.LJIILIIL(view);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void G1() {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            C0TND.LIZ(LiveBoardsPageDialogFragment.LLJILJILJ, this.LLJ, null, this.dataChannel, null, null, 8).show(fragmentManager, "LiveBoardsPageDialogFragment");
        }
        hide();
        InterfaceC1814530xJr interfaceC1814530xJrH1 = H1();
        if (interfaceC1814530xJrH1 != null) {
            interfaceC1814530xJrH1.LJIILL(null);
        }
        C1790620whI.LJIIL();
    }

    public final InterfaceC1814530xJr H1() {
        return (InterfaceC1814530xJr) this.LLJIJIL.getValue();
    }

    public final void I1() {
        Long lLJ;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(BottomTabGroupVisiblityChannel.class, Boolean.FALSE);
        }
        C500260Jjc.LLFFF(this.LLILZ);
        View view = this.LLIZLLLIL;
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
        EnumC1154390g97 enumC1154390g97 = EnumC1154390g97.BOARD_EDIT;
        InterfaceC1814530xJr interfaceC1814530xJrH1 = H1();
        C1790620whI.LJIILIIL(enumC1154390g97, (interfaceC1814530xJrH1 == null || (lLJ = interfaceC1814530xJrH1.LJ()) == null) ? 0L : lLJ.longValue());
        J1(true);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        this.dataChannel.zW(PreviewBoardPlaceHolderVisibility.class, Boolean.TRUE);
        I1();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        float bottomBallHeight = (57.0f - LiveBoardUiConfigSetting.INSTANCE.getBottomBallHeight()) / 2;
        View view = getView();
        C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(bottomBallHeight), view != null ? view.findViewById(R.id.ces) : null);
        View view2 = getView();
        this.LLILZ = view2 != null ? (LiveIconView) view2.findViewById(R.id.bnb) : null;
        View view3 = getView();
        this.LLILZIL = view3 != null ? (C16F5) view3.findViewById(R.id.fhl) : null;
        View view4 = getView();
        this.LLILZLL = view4 != null ? (FrameLayout) view4.findViewById(R.id.fhm) : null;
        View view5 = getView();
        this.LLIZ = view5 != null ? view5.findViewById(R.id.c2x) : null;
        View view6 = getView();
        this.LLIZLLLIL = view6 != null ? view6.findViewById(R.id.yjd) : null;
        LiveIconView liveIconView = this.LLILZ;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0xOr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view7) {
                    this.LL.G1();
                }
            });
        }
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        Fragment fragment = interfaceC1097170eep != null ? interfaceC1097170eep.getFragment() : null;
        if (getView() != null && fragment != null) {
            C723850SaN.LIZ(fragment, false, null, new C441601ni(fragment, this), 3);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, PreviewBulletinEditVisibilityChannel.class, new C1091980eWS(this));
            dataChannel.BQ2(this, BackToEditPageEvent.class, new C1817640xOs(this));
            dataChannel.BQ2(this, ShowDecorationTopButtonsEvent.class, new C1817590xOn(this));
            dataChannel.BQ2(this, ShowOrHideDecorationEditMaskEvent.class, new C1092620eXU(this));
            dataChannel.BQ2(this, CameraResumeEvent.class, new C1817620xOq(this));
            dataChannel.BQ2(this, BackToBoardsPageDialog.class, new C1817650xOt(this));
            dataChannel.BQ2(this, DecorationEditLogDataEvent.class, new C1817560xOk(this));
            dataChannel.BQ2(this, PreviewEditingDecorationToolsEvent.class, new C1817610xOp(this));
            dataChannel.EQ2(this, PreviewBoardRenderDoneEvent.class, new C330101Pv(this));
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, PreviewSchemaCreateBoardEvent.class, new C329201Pm(this));
        DataChannelGlobal.LLILZ.BQ2(this, this, PreviewDecorationEditSchemeEvent.class, new C329501Pp(this));
        if (SmbLiveKickstarterSetting.INSTANCE.isEnabled()) {
            DataChannelGlobal.LLILZ.BQ2(this, this, PreviewDecorationCreateSchemeEvent.class, new C329001Pk(this));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, DecorationJumpToItemEditorEvent.class, new C329701Pr(this));
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void attach() {
        super.attach();
        C500260Jjc.LJLJL(C497740JfY.LJIJ(), this.LLILZ);
        C500260Jjc.LJLJL(C497740JfY.LJIJ(), this.LLILZIL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    public final void J1(boolean z) {
        Fragment fragment;
        Fragment fragment2 = null;
        if (z) {
            C500260Jjc.LLFFF(this.LLILZIL);
            C500260Jjc.LLFFF(this.LLILZLL);
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep != null) {
                fragment = interfaceC1097170eep.getFragment();
            } else {
                fragment = null;
            }
            if (getView() != null && fragment != null) {
                C723850SaN.LIZ(fragment, false, null, new C1217150hmL(fragment, this), 3);
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(this.LLILZIL);
        C500260Jjc.LJIILIIL(this.LLILZLL);
        InterfaceC1097170eep interfaceC1097170eep2 = this.widgetCallback;
        if (interfaceC1097170eep2 != null) {
            fragment2 = interfaceC1097170eep2.getFragment();
        }
        if (getView() == null || fragment2 == null) {
            return;
        }
        C723850SaN.LJIIIIZZ(fragment2, C13LE.LIZ(DecorationEditAssem.class));
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJIIIZ();
    }
}
