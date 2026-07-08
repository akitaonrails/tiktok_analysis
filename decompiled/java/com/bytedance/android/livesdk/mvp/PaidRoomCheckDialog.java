package com.bytedance.android.livesdk.mvp;

import X.C036E;
import X.C0IGV;
import X.C0IJT;
import X.C0IL2;
import X.C0JDI;
import X.C0UO0;
import X.C1121670fIL;
import X.C11NJ;
import X.C16F5;
import X.C16FS;
import X.C16FV;
import X.C16FZ;
import X.C2188811AlT;
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C500980Jkm;
import X.C513200KAs;
import X.C521840KdK;
import X.C786410Ut5;
import Y.ACListenerS111S0200000_7;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.AfS176S0100000_7;
import Y.AfS55S0110000_7;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.ReplacementTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.PaidRoomChannel;
import com.bytedance.android.livesdk.mvp.PaidRoomCheckDialog;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class PaidRoomCheckDialog extends LiveDialogFragment implements WeakHandler.IHandler {
    public static final C0JDI Companion = new Object() { // from class: X.0JDI
    };
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/HELIOSLSR9JTM8Zx8yISEeJiA+Cy0pKiQXISQgJig=";
    public ImageView avatarViewFromXml;
    public LiveIconView closeViewFromXml;
    public C16F5 contentFromXml;
    public C16F5 contentViewFromXml;
    public int counts;
    public LinearLayout detailsViewFromXml;
    public ConstraintLayout dialogViewFromXml;
    public LiveEditText editViewFromXml;
    public EnterRoomConfig enterRoomConfig;
    public ViewStub errorFromXml;
    public C16FV errorIconFromXml;
    public C16F5 errorMsgFromXml;
    public C16FZ loadingViewFromXml;
    public InputFilter mFilter;
    public boolean mIsHide;
    public C16FS retryFromXml;
    public long roomId;
    public boolean status;
    public C16FS submitViewFromXml;
    public C16F5 titleFromXml;
    public C16F5 titleViewFromXml;
    public ConstraintLayout warnViewFromXml;
    public C11NJ disposable = new C11NJ();
    public boolean isInput = true;
    public String mInput = "";
    public final Handler mHandler = new WeakHandler(this);
    public final TextWatcher mTextWatcher = new C521840KdK(this, 1);

    private final void clearFromXmlViewCache() {
        this.editViewFromXml = null;
        this.submitViewFromXml = null;
        this.warnViewFromXml = null;
        this.closeViewFromXml = null;
        this.loadingViewFromXml = null;
        this.errorFromXml = null;
        this.retryFromXml = null;
        this.errorIconFromXml = null;
        this.titleFromXml = null;
        this.contentFromXml = null;
        this.dialogViewFromXml = null;
        this.avatarViewFromXml = null;
        this.titleViewFromXml = null;
        this.contentViewFromXml = null;
        this.detailsViewFromXml = null;
        this.errorMsgFromXml = null;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, X.InterfaceC513210KAt
    public /* bridge */ /* synthetic */ int getThemeOverlay(Context context) {
        return C513200KAs.LIZ(context);
    }

    public /* bridge */ /* synthetic */ boolean isLight(Context context) {
        return C513200KAs.LIZIZ(this, context);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g52);
        c500980Jkm.LIZIZ = 0;
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -2;
        c500980Jkm.LJ = false;
        return c500980Jkm;
    }

    public final ImageView getAvatarViewFromXml() {
        View viewFindViewById = this.avatarViewFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bkz) : null;
            this.avatarViewFromXml = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final LiveIconView getCloseViewFromXml() {
        View viewFindViewById = this.closeViewFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.e2x) : null;
            this.closeViewFromXml = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    public final C16F5 getContentFromXml() {
        View viewFindViewById = this.contentFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eu1) : null;
            this.contentFromXml = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C16F5 getContentViewFromXml() {
        View viewFindViewById = this.contentViewFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ex3) : null;
            this.contentViewFromXml = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final LinearLayout getDetailsViewFromXml() {
        View viewFindViewById = this.detailsViewFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fs5) : null;
            this.detailsViewFromXml = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final ConstraintLayout getDialogViewFromXml() {
        View viewFindViewById = this.dialogViewFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ftl) : null;
            this.dialogViewFromXml = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final LiveEditText getEditViewFromXml() {
        View viewFindViewById = this.editViewFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gsw) : null;
            this.editViewFromXml = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    public final ViewStub getErrorFromXml() {
        View viewFindViewById = this.errorFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hau) : null;
            this.errorFromXml = (ViewStub) viewFindViewById;
        }
        return (ViewStub) viewFindViewById;
    }

    public final C16FV getErrorIconFromXml() {
        View viewFindViewById = this.errorIconFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hav) : null;
            this.errorIconFromXml = (C16FV) viewFindViewById;
        }
        return (C16FV) viewFindViewById;
    }

    public final C16F5 getErrorMsgFromXml() {
        View viewFindViewById = this.errorMsgFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hbg) : null;
            this.errorMsgFromXml = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C16FZ getLoadingViewFromXml() {
        View viewFindViewById = this.loadingViewFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nnp) : null;
            this.loadingViewFromXml = (C16FZ) viewFindViewById;
        }
        return (C16FZ) viewFindViewById;
    }

    public final C16FS getRetryFromXml() {
        View viewFindViewById = this.retryFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tec) : null;
            this.retryFromXml = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    public final C16FS getSubmitViewFromXml() {
        View viewFindViewById = this.submitViewFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.whp) : null;
            this.submitViewFromXml = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    public final C16F5 getTitleFromXml() {
        View viewFindViewById = this.titleFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.title) : null;
            this.titleFromXml = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C16F5 getTitleViewFromXml() {
        View viewFindViewById = this.titleViewFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.y3o) : null;
            this.titleViewFromXml = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final ConstraintLayout getWarnViewFromXml() {
        View viewFindViewById = this.warnViewFromXml;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.warn_view) : null;
            this.warnViewFromXml = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final void loadError() {
        C786410Ut5.LJLLLL(getErrorFromXml());
        C786410Ut5.h8(getRetryFromXml(), new ACListenerS142S0100000_7(this, 92));
    }

    public final void loadErrorMsg() {
        if (INVOKESTATIC_com_bytedance_android_livesdk_mvp_PaidRoomCheckDialog_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(getContext())) {
            getErrorIconFromXml().setBackground(C497740JfY.LJIIJ(R.drawable.fak));
            getTitleFromXml().setText(C497740JfY.LJIJI(2131844666));
            getContentFromXml().setText(C497740JfY.LJIJI(2131844601));
            return;
        }
        getErrorIconFromXml().setBackground(C497740JfY.LJIIJ(R.drawable.f9o));
        getTitleFromXml().setText(C497740JfY.LJIJI(2131843632));
        C16F5 contentFromXml = getContentFromXml();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C497740JfY.LJIJI(2131843633));
        sbLIZ.append(' ');
        sbLIZ.append(C497740JfY.LJIJI(2131844601));
        contentFromXml.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C0IGV c0igv = new C0IGV();
        c0igv.LIZ = this.status;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(PaidRoomChannel.class, c0igv);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    public static boolean INVOKESTATIC_com_bytedance_android_livesdk_mvp_PaidRoomCheckDialog_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final void checkCode(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig.LogData logData;
        EnterRoomConfig.RoomsData roomsData3;
        EnterRoomConfig.RoomsData roomsData4;
        EnterRoomConfig.RoomsData roomsData5;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_event_gate_popup_continue");
        EnterRoomConfig enterRoomConfig = this.enterRoomConfig;
        String str7 = null;
        if (enterRoomConfig != null && (roomsData5 = enterRoomConfig.mRoomsData) != null) {
            str2 = roomsData5.enterFromMerge;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "enter_from_merge");
        EnterRoomConfig enterRoomConfig2 = this.enterRoomConfig;
        if (enterRoomConfig2 != null && (roomsData4 = enterRoomConfig2.mRoomsData) != null) {
            str3 = roomsData4.enterMethod;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "enter_method");
        EnterRoomConfig enterRoomConfig3 = this.enterRoomConfig;
        if (enterRoomConfig3 != null && (roomsData3 = enterRoomConfig3.mRoomsData) != null) {
            str4 = roomsData3.userId;
        } else {
            str4 = null;
        }
        c474500IjALIZ.LJJII(str4, "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.roomId), "room_id");
        EnterRoomConfig enterRoomConfig4 = this.enterRoomConfig;
        if (enterRoomConfig4 != null && (logData = enterRoomConfig4.mLogData) != null) {
            str5 = logData.requestId;
        } else {
            str5 = null;
        }
        c474500IjALIZ.LJJII(str5, "request_id");
        EnterRoomConfig enterRoomConfig5 = this.enterRoomConfig;
        if (enterRoomConfig5 != null && (roomsData2 = enterRoomConfig5.mRoomsData) != null) {
            str6 = roomsData2.actionType;
        } else {
            str6 = null;
        }
        c474500IjALIZ.LJJII(str6, "action_type");
        EnterRoomConfig enterRoomConfig6 = this.enterRoomConfig;
        if (enterRoomConfig6 != null && (roomsData = enterRoomConfig6.mRoomsData) != null) {
            str7 = roomsData.followStatus;
        }
        c474500IjALIZ.LJJII(str7, "follow_status");
        c474500IjALIZ.LIZ();
        getSubmitViewFromXml().LJ();
        C480460Ism.LIZ().getClass();
        this.disposable.LIZ(((PaidRoomApi) C480460Ism.LIZLLL(PaidRoomApi.class)).checkCode(str, Long.valueOf(this.roomId)).LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(this, 84), new AfS176S0100000_7(this, 85)));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (this.counts >= 4) {
            getSubmitViewFromXml().setEnabled(true);
        }
        this.mIsHide = false;
    }

    public final void initData(boolean z) {
        C786410Ut5.LLLIZZ(getLoadingViewFromXml(), 0);
        C480460Ism.LIZ().getClass();
        this.disposable.LIZ(((PaidRoomApi) C480460Ism.LIZLLL(PaidRoomApi.class)).queryRoomData(Long.valueOf(this.roomId)).LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(this, 86), new AfS55S0110000_7(this, z, 3)));
    }

    public final void initView(GatedRoomData gatedRoomData) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.LogData logData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig.RoomsData roomsData3;
        EnterRoomConfig.RoomsData roomsData4;
        EnterRoomConfig.RoomsData roomsData5;
        getSubmitViewFromXml().setEnabled(false);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_event_gate_popup_show");
        EnterRoomConfig enterRoomConfig = this.enterRoomConfig;
        ImageModel avatarThumb = null;
        if (enterRoomConfig != null && (roomsData5 = enterRoomConfig.mRoomsData) != null) {
            str = roomsData5.enterFromMerge;
        } else {
            str = null;
        }
        c474500IjALIZ.LJJII(str, "enter_from_merge");
        EnterRoomConfig enterRoomConfig2 = this.enterRoomConfig;
        if (enterRoomConfig2 != null && (roomsData4 = enterRoomConfig2.mRoomsData) != null) {
            str2 = roomsData4.enterMethod;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "enter_method");
        EnterRoomConfig enterRoomConfig3 = this.enterRoomConfig;
        if (enterRoomConfig3 != null && (roomsData3 = enterRoomConfig3.mRoomsData) != null) {
            str3 = roomsData3.userId;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.roomId), "room_id");
        EnterRoomConfig enterRoomConfig4 = this.enterRoomConfig;
        if (enterRoomConfig4 != null && (roomsData2 = enterRoomConfig4.mRoomsData) != null) {
            str4 = roomsData2.actionType;
        } else {
            str4 = null;
        }
        c474500IjALIZ.LJJII(str4, "action_type");
        EnterRoomConfig enterRoomConfig5 = this.enterRoomConfig;
        if (enterRoomConfig5 != null && (logData = enterRoomConfig5.mLogData) != null) {
            str5 = logData.requestId;
        } else {
            str5 = null;
        }
        c474500IjALIZ.LJJII(str5, "request_id");
        EnterRoomConfig enterRoomConfig6 = this.enterRoomConfig;
        if (enterRoomConfig6 != null && (roomsData = enterRoomConfig6.mRoomsData) != null) {
            str6 = roomsData.followStatus;
        } else {
            str6 = null;
        }
        c474500IjALIZ.LJJII(str6, "follow_status");
        c474500IjALIZ.LIZ();
        C786410Ut5.LL(0, getDialogViewFromXml());
        ImageView avatarViewFromXml = getAvatarViewFromXml();
        User user = gatedRoomData.owner;
        if (user != null) {
            avatarThumb = user.getAvatarThumb();
        }
        C1121670fIL.LJIILIIL(avatarViewFromXml, avatarThumb, getAvatarViewFromXml().getWidth(), getAvatarViewFromXml().getHeight(), R.drawable.eze);
        getTitleViewFromXml().setText(gatedRoomData.eventName);
        getContentViewFromXml().setText(gatedRoomData.description);
        getEditViewFromXml().setTransformationMethod(new ReplacementTransformationMethod() { // from class: X.0JDH
            @Override // android.text.method.ReplacementTransformationMethod
            public final char[] getOriginal() {
                return new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            }

            @Override // android.text.method.ReplacementTransformationMethod
            public final char[] getReplacement() {
                return new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            }
        });
        C786410Ut5.R7(getDetailsViewFromXml(), new ACListenerS111S0200000_7(this, gatedRoomData, 16));
        C786410Ut5.h8(getSubmitViewFromXml(), new ACListenerS142S0100000_7(this, 91));
        LiveEditText editViewFromXml = getEditViewFromXml();
        editViewFromXml.addTextChangedListener(this.mTextWatcher);
        editViewFromXml.setOnKeyListener(new View.OnKeyListener() { // from class: X.0JDG
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (66 == i && 1 == keyEvent.getAction()) {
                    PaidRoomCheckDialog paidRoomCheckDialog = this.LL;
                    paidRoomCheckDialog.checkCode(String.valueOf(C2204961BRm.LLLFZ(paidRoomCheckDialog.getEditViewFromXml(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5jz7uHu0b4XGRa0ioFiY3CLo9Epb8uk=", null))).toUpperCase(Locale.ROOT));
                    return true;
                }
                return false;
            }
        });
        HandlerHook.viewPostDelay(getEditViewFromXml(), new ARunnableS107S0100000_7(this, 93), 100L);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        long j;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            j = arguments.getLong("roomId");
        } else {
            j = 0;
        }
        this.roomId = j;
        this.enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.mHandler.removeMessages(101);
        this.disposable.LJ();
    }

    public final void removeFilter(EditText editText) {
        if (this.mFilter != null) {
            editText.setFilters(new InputFilter[0]);
            this.mFilter = null;
        }
    }

    public final void setAvatarViewFromXml(ImageView imageView) {
        this.avatarViewFromXml = imageView;
    }

    public final void setCloseViewFromXml(LiveIconView liveIconView) {
        this.closeViewFromXml = liveIconView;
    }

    public final void setContentFromXml(C16F5 c16f5) {
        this.contentFromXml = c16f5;
    }

    public final void setContentViewFromXml(C16F5 c16f5) {
        this.contentViewFromXml = c16f5;
    }

    public final void setDetailsViewFromXml(LinearLayout linearLayout) {
        this.detailsViewFromXml = linearLayout;
    }

    public final void setDialogViewFromXml(ConstraintLayout constraintLayout) {
        this.dialogViewFromXml = constraintLayout;
    }

    public final void setEditViewFromXml(LiveEditText liveEditText) {
        this.editViewFromXml = liveEditText;
    }

    public final void setErrorFromXml(ViewStub viewStub) {
        this.errorFromXml = viewStub;
    }

    public final void setErrorIconFromXml(C16FV c16fv) {
        this.errorIconFromXml = c16fv;
    }

    public final void setErrorMsgFromXml(C16F5 c16f5) {
        this.errorMsgFromXml = c16f5;
    }

    public final void setLoadingViewFromXml(C16FZ c16fz) {
        this.loadingViewFromXml = c16fz;
    }

    public final void setRetryFromXml(C16FS c16fs) {
        this.retryFromXml = c16fs;
    }

    public final void setSubmitViewFromXml(C16FS c16fs) {
        this.submitViewFromXml = c16fs;
    }

    public final void setTitleFromXml(C16F5 c16f5) {
        this.titleFromXml = c16f5;
    }

    public final void setTitleViewFromXml(C16F5 c16f5) {
        this.titleViewFromXml = c16f5;
    }

    public final void setWarnViewFromXml(ConstraintLayout constraintLayout) {
        this.warnViewFromXml = constraintLayout;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.g8(getCloseViewFromXml(), new ACListenerS142S0100000_7(this, 93));
        initData(false);
    }

    public final void setCharLimit(EditText editText, int i) {
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(i);
        this.mFilter = lengthFilter;
        editText.setFilters(new InputFilter[]{lengthFilter});
    }
}
