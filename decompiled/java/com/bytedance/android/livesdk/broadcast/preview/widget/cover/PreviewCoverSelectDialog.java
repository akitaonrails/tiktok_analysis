package com.bytedance.android.livesdk.broadcast.preview.widget.cover;

import X.C1161920gLG;
import X.C200400pu;
import X.C475510Ikn;
import X.C486790J7d;
import X.C500980Jkm;
import X.C786410Ut5;
import X.InterfaceC1097170eep;
import Y.ACListenerS116S0200000_12;
import Y.ACListenerS147S0100000_12;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment;
import com.bytedance.android.livesdk.comp.api.game.GameAutoCoverChannel;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.game.preview.widget.GameAutoCoverWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewCoverSelectDialog extends BasePreviewDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTHELIOSMlLDh9PywoLionZiYjPyohZhU+LDk6LTIPJjk2OhYpJSowPAElKCM8Lw==";
    public View LL;
    public TuxIconView LLILLJJLI;
    public LinearLayout LLILLL;
    public LinearLayout LLILZ;
    public boolean LLILZIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final String MR() {
        DataChannel dataChannel = this.dataChannel;
        LiveMode liveMode = dataChannel != null ? (LiveMode) dataChannel.gg0(LiveModeChannel.class) : null;
        int i = liveMode == null ? -1 : C200400pu.LIZ[liveMode.ordinal()];
        return (i == -1 || i == 1) ? "video_live" : i != 2 ? i == 3 ? "screen_share" : "video_live" : "third_party";
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g4w);
        c500980Jkm.LIZJ = R.style.aim;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJI = 0.5f;
        if (LivePreviewComponentsSimplifyTypeSetting.INSTANCE.inExperiment()) {
            c500980Jkm.LJIIIIZZ = 2;
        }
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean requireE2EAdaption() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Object objGg0;
        DataChannel dataChannelLJ;
        LiveMode liveMode;
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.pw6);
            } else {
                viewFindViewById = null;
            }
            this.LL = viewFindViewById;
        }
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 451), viewFindViewById);
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.yom);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = (TuxIconView) viewFindViewById3;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById3, new ACListenerS147S0100000_12(this, 452));
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("autoClose");
        } else {
            z = false;
        }
        this.LLILZIL = z;
        View viewFindViewById4 = this.LLILLL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.mg_);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILLL = (LinearLayout) viewFindViewById4;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById4, new ACListenerS116S0200000_12(dataChannelLJ2, this, 97));
        View view5 = this.LLILZ;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById2 = view6.findViewById(R.id.met);
            }
            this.LLILZ = (LinearLayout) viewFindViewById2;
            view5 = viewFindViewById2;
        }
        C786410Ut5.R7((LinearLayout) view5, new ACListenerS116S0200000_12(dataChannelLJ2, this, 98));
        if (dataChannelLJ2 != null && (objGg0 = dataChannelLJ2.gg0(LiveModeChannel.class)) != null) {
            if ((objGg0 == LiveMode.SCREEN_RECORD || objGg0 == LiveMode.THIRD_PARTY) && (dataChannelLJ = C475510Ikn.LJ(this)) != null && (liveMode = (LiveMode) dataChannelLJ.gg0(LiveModeChannel.class)) != null) {
                WidgetManager widgetManager = new WidgetManager();
                widgetManager.config(false, this, getView(), getContext(), C486790J7d.LIZ);
                GameAutoCoverWidget gameAutoCoverWidgetDK = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).DK(liveMode.logStreamingType);
                if (gameAutoCoverWidgetDK != null) {
                    gameAutoCoverWidgetDK.setWidgetCallback(new InterfaceC1097170eep() { // from class: X.0TiW
                        @Override // X.InterfaceC1097170eep
                        public final /* synthetic */ void attachContentView(Widget widget, ViewGroup viewGroup, View view7) {
                        }

                        @Override // X.InterfaceC1097170eep
                        public final /* synthetic */ WidgetLoadScatter getWidgetLoadScatter() {
                            return null;
                        }

                        @Override // X.InterfaceC1097170eep
                        public final /* synthetic */ WidgetManager getWidgetManager() {
                            return null;
                        }

                        @Override // X.InterfaceC1097170eep
                        public final /* synthetic */ boolean isScatterLoadEnable() {
                            return false;
                        }

                        @Override // X.InterfaceC1097170eep
                        public final /* synthetic */ boolean isSubWidget() {
                            return false;
                        }

                        @Override // X.InterfaceC1097170eep
                        public final void loadWidget(int i, Widget widget, boolean z2) {
                        }

                        @Override // X.InterfaceC1097170eep
                        public final void loadWidget(Widget widget) {
                        }

                        @Override // X.InterfaceC1097170eep
                        public final /* synthetic */ void onHide(Widget widget) {
                        }

                        @Override // X.InterfaceC1097170eep
                        public final /* synthetic */ void onPostCreate(Widget widget) {
                        }

                        @Override // X.InterfaceC1097170eep
                        public final /* synthetic */ void onPostDestroy(Widget widget) {
                        }

                        @Override // X.InterfaceC1097170eep
                        public final /* synthetic */ void onPreCreate(Widget widget) {
                        }

                        @Override // X.InterfaceC1097170eep
                        public final /* synthetic */ void onPreDestroy(Widget widget) {
                        }

                        @Override // X.InterfaceC1097170eep
                        public final /* synthetic */ void onShow(Widget widget) {
                        }

                        @Override // X.InterfaceC1097170eep
                        public final /* synthetic */ void removeAllMessages(Object obj) {
                        }

                        @Override // X.InterfaceC1097170eep
                        public final void unloadWidget(Widget widget) {
                        }

                        @Override // X.InterfaceC1097170eep
                        public final Fragment getFragment() {
                            return this.LIZ;
                        }

                        @Override // X.InterfaceC1097170eep
                        public final LifecycleOwner getRootLifeCycleOwner() {
                            return this.LIZ;
                        }
                    });
                    widgetManager.load(R.id.widget_container_game_auto_cover, gameAutoCoverWidgetDK);
                }
                dataChannelLJ.EQ2(this, GameAutoCoverChannel.class, new AwS591S0100000_12(this, 1177));
            }
        }
    }
}
