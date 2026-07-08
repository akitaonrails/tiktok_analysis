package kotlin.jvm.internal;

import X.AbstractC1563960qni;
import X.ActivityC2196911AyX;
import X.C09AY;
import X.C1075800e6M;
import X.C123100dR;
import X.C1236610iHj;
import X.C1397620mTQ;
import X.C1909107dp;
import X.C197039127h;
import X.C2196041Ax8;
import X.C2196061AxA;
import X.C2238181Ciu;
import X.C2238251Cj1;
import X.C418440Gaw;
import X.C637220Oz2;
import X.C736460Sui;
import X.C786410Ut5;
import X.C814420VxA;
import X.C816940W2y;
import X.EnumC1262370ixH;
import X.EnumC19415410xc;
import X.EnumC21632119lH;
import X.InterfaceC1877250yx1;
import X.InterfaceC20621715mh;
import X.InterfaceC2194551Auj;
import X.InterfaceC2195651AwV;
import X.InterfaceC2238201Ciw;
import X.InterfaceC634840OvC;
import Y.ACListenerS98S0300000_34;
import Y.ARunnableS42S0400000_34;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profilebanner.data.ButtonInfo;
import com.ss.android.ugc.aweme.profilebanner.data.HighLightInfo;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerInfoModel;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerModel;
import com.ss.android.ugc.aweme.recommend.RecUserInMainActivityViewModel;
import com.ss.android.ugc.aweme.recommend.RecUserPopupInMainActivityController;
import com.ss.android.ugc.common.component.fragment.ComponentFragment;
import com.ss.android.ugc.profile.platform.base.data.DialogButtonModel;
import com.ss.android.ugc.profile.platform.base.data.DialogInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AwS243S0300000_34 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS243S0300000_34 awS243S0300000_34, Object obj) {
        C1075800e6M c1075800e6M = (C1075800e6M) obj;
        if (c1075800e6M.LJ()) {
            int iLIZIZ = c1075800e6M.LIZIZ();
            RecUserInMainActivityViewModel recUserInMainActivityViewModel = ((RecUserPopupInMainActivityController) awS243S0300000_34.l0).LLILZ;
            EnumC1262370ixH enumC1262370ixH = (EnumC1262370ixH) awS243S0300000_34.l1;
            recUserInMainActivityViewModel.getClass();
            EnumC1262370ixH enumC1262370ixH2 = EnumC1262370ixH.FYP_POPUP;
            if (enumC1262370ixH == enumC1262370ixH2 && iLIZIZ > 0 && Intrinsics.LJFF(recUserInMainActivityViewModel.LLILZIL.getValue(), Boolean.FALSE) && !C816940W2y.LIZ()) {
                recUserInMainActivityViewModel.LLILZIL.setValue(Boolean.TRUE);
            }
            if (enumC1262370ixH == enumC1262370ixH2 && iLIZIZ <= 0 && Intrinsics.LJFF(recUserInMainActivityViewModel.LLILZLL.getValue(), Boolean.FALSE) && !C816940W2y.LIZ()) {
                recUserInMainActivityViewModel.LLILZLL.setValue(Boolean.TRUE);
            }
            EnumC1262370ixH enumC1262370ixH3 = EnumC1262370ixH.INBOX_PROFILE_POPUP;
            if (enumC1262370ixH == enumC1262370ixH3 && iLIZIZ > 0 && !C816940W2y.LIZ()) {
                recUserInMainActivityViewModel.LLILLL = true;
            }
            if (!RecUserPopupInMainActivityController.LLJIJIL && ((EnumC1262370ixH) awS243S0300000_34.l1) == enumC1262370ixH3 && iLIZIZ > 0) {
                InterfaceC20621715mh interfaceC20621715mh = (InterfaceC20621715mh) awS243S0300000_34.l2;
                if (interfaceC20621715mh != null) {
                    interfaceC20621715mh.M71(new AbstractC1563960qni() { // from class: X.15mm
                    });
                }
                RecUserPopupInMainActivityController.LLJIJIL = true;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS243S0300000_34 awS243S0300000_34, Object obj) {
        String remoteButtonText;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        for (DialogButtonModel dialogButtonModel : (List) awS243S0300000_34.l0) {
            Integer buttonStyle = dialogButtonModel.getButtonStyle();
            if (buttonStyle != null) {
                if (buttonStyle.intValue() == 0) {
                    String remoteButtonText2 = dialogButtonModel.getRemoteButtonText();
                    if (remoteButtonText2 != null) {
                        c1397620mTQ.LIZJ(0, remoteButtonText2, new AwS400S0200000_34((Context) awS243S0300000_34.l2, dialogButtonModel, 16));
                    }
                } else if (buttonStyle.intValue() == 1) {
                    String remoteButtonText3 = dialogButtonModel.getRemoteButtonText();
                    if (remoteButtonText3 != null) {
                        c1397620mTQ.LIZJ(1, remoteButtonText3, new AwS400S0200000_34((Context) awS243S0300000_34.l2, dialogButtonModel, 17));
                    }
                } else if (buttonStyle.intValue() == 2 && (remoteButtonText = dialogButtonModel.getRemoteButtonText()) != null) {
                    c1397620mTQ.LIZJ(2, remoteButtonText, new AwS400S0200000_34((Context) awS243S0300000_34.l2, dialogButtonModel, 18));
                }
            }
        }
        Boolean boolIsVertical = ((DialogInfo) awS243S0300000_34.l1).isVertical();
        if (boolIsVertical != null) {
            c1397620mTQ.LJFF = boolIsVertical.booleanValue();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS243S0300000_34 awS243S0300000_34, Object obj) {
        String str;
        C2238181Ciu c2238181Ciu = (C2238181Ciu) awS243S0300000_34.l0;
        Context context = (Context) awS243S0300000_34.l1;
        HighLightInfo highLightInfo = ((ProfileBannerInfoModel) awS243S0300000_34.l2).highLightInfo;
        if (highLightInfo != null) {
            str = highLightInfo.schemaUrl;
        } else {
            str = null;
        }
        c2238181Ciu.getClass();
        C2238181Ciu.LIZLLL(context, str);
        InterfaceC2238201Ciw interfaceC2238201Ciw = ((C2238181Ciu) awS243S0300000_34.l0).LIZ;
        if (interfaceC2238201Ciw != null) {
            interfaceC2238201Ciw.LIZIZ((ProfileBannerInfoModel) awS243S0300000_34.l2, "click_rich_text", true);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS243S0300000_34 awS243S0300000_34, Object obj) {
        C786410Ut5.S7((RelativeLayout) obj, new ACListenerS98S0300000_34((View) awS243S0300000_34.l1, (ProfileBannerInfoModel) awS243S0300000_34.l2, (C2238181Ciu) awS243S0300000_34.l0, 2));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS243S0300000_34 awS243S0300000_34, Object obj) {
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ;
        C197039127h c197039127h = (C197039127h) obj;
        ButtonInfo buttonInfo = ((ProfileBannerInfoModel) awS243S0300000_34.l0).buttonInfo;
        String str2 = null;
        if (buttonInfo != null) {
            str = buttonInfo.title;
        } else {
            str = null;
        }
        c197039127h.setText(str);
        C786410Ut5.U8(c197039127h, new ACListenerS98S0300000_34((View) awS243S0300000_34.l2, (ProfileBannerInfoModel) awS243S0300000_34.l0, (C2238181Ciu) awS243S0300000_34.l1, 3));
        ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i = 0;
        if (marginLayoutParams != null) {
            if (((ProfileBannerInfoModel) awS243S0300000_34.l0).showCloseButton) {
                iLIZIZ = 0;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            marginLayoutParams.setMarginEnd(iLIZIZ);
        } else {
            marginLayoutParams = null;
        }
        C786410Ut5.J6(c197039127h, marginLayoutParams);
        ButtonInfo buttonInfo2 = ((ProfileBannerInfoModel) awS243S0300000_34.l0).buttonInfo;
        if (buttonInfo2 != null) {
            str2 = buttonInfo2.title;
        }
        if (!C736460Sui.LIZIZ(str2)) {
            i = 8;
        }
        C786410Ut5.LLLLLLJ(c197039127h, i);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS243S0300000_34 awS243S0300000_34, Object obj) {
        boolean z;
        Activity activityLIZLLL;
        C2196061AxA c2196061AxA = (C2196061AxA) obj;
        String str = c2196061AxA.LIZ;
        if (str != null && str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String clientKey = ((InterfaceC2194551Auj) awS243S0300000_34.l0).getClientKey();
            String clientKey2 = ((InterfaceC2194551Auj) awS243S0300000_34.l0).getClientKey();
            InterfaceC634840OvC interfaceC634840OvC = ((C2196041Ax8) awS243S0300000_34.l1).IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                activityLIZLLL = interfaceC634840OvC.LIZLLL();
            } else {
                activityLIZLLL = null;
            }
            C1236610iHj.LIZIZ(clientKey, "auth_success", CardStruct.IStatusCode.DEFAULT, C1236610iHj.LIZ(clientKey2, true, activityLIZLLL instanceof ActivityC2196911AyX), EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
        }
        InterfaceC1877250yx1 interfaceC1877250yx1 = (InterfaceC1877250yx1) awS243S0300000_34.l2;
        if (interfaceC1877250yx1 != null) {
            interfaceC1877250yx1.LIZJ();
        }
        InterfaceC2195651AwV interfaceC2195651AwV = (InterfaceC2195651AwV) C1909107dp.LIZJ(InterfaceC2195651AwV.class, null);
        interfaceC2195651AwV.setAuthCode(c2196061AxA.LIZ);
        interfaceC2195651AwV.setScopes(c2196061AxA.LIZIZ);
        interfaceC2195651AwV.setErrorCode(c2196061AxA.LIZJ);
        interfaceC2195651AwV.setErrorMsg(c2196061AxA.LIZLLL);
        interfaceC2195651AwV.setStatus(c2196061AxA.LJ);
        String str2 = "";
        if (Intrinsics.LJFF(interfaceC2195651AwV.getErrorCode(), 0) && (C123100dR.LIZ(interfaceC2195651AwV.getAuthCode()) || C123100dR.LIZ(interfaceC2195651AwV.getStatus()))) {
            CompletionBlock<InterfaceC2195651AwV> completionBlock = ((C2196041Ax8) awS243S0300000_34.l1).LLILZ;
            if (completionBlock != null) {
                completionBlock.onSuccess(interfaceC2195651AwV, "");
            }
        } else {
            CompletionBlock<InterfaceC2195651AwV> completionBlock2 = ((C2196041Ax8) awS243S0300000_34.l1).LLILZ;
            if (completionBlock2 != null) {
                String errorMsg = interfaceC2195651AwV.getErrorMsg();
                if (errorMsg != null) {
                    str2 = errorMsg;
                }
                completionBlock2.onFailure(0, str2, interfaceC2195651AwV);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS243S0300000_34 awS243S0300000_34, Object obj) {
        C637220Oz2 c637220Oz2 = (C637220Oz2) awS243S0300000_34.l0;
        C786410Ut5.LJJZZIII(c637220Oz2.LIZIZ, new ARunnableS42S0400000_34((ProfileBannerModel) obj, (C2238251Cj1) awS243S0300000_34.l1, c637220Oz2, (Fragment) awS243S0300000_34.l2, 6));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS243S0300000_34(android.view.View r3, com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerInfoModel r4, X.C2238181Ciu r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 3 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS243S0300000_34.<init>(android.view.View, com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerInfoModel, X.1Ciu, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS243S0300000_34(C637220Oz2 c637220Oz2, C2238251Cj1 c2238251Cj1, ComponentFragment componentFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = c637220Oz2;
        this.l1 = c2238251Cj1;
        this.l2 = componentFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS243S0300000_34(InterfaceC2194551Auj interfaceC2194551Auj, C2196041Ax8 c2196041Ax8, InterfaceC1877250yx1 interfaceC1877250yx1, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC2194551Auj;
        this.l1 = c2196041Ax8;
        this.l2 = interfaceC1877250yx1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS243S0300000_34(C2238181Ciu c2238181Ciu, Context context, ProfileBannerInfoModel profileBannerInfoModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2238181Ciu;
        this.l1 = context;
        this.l2 = profileBannerInfoModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS243S0300000_34(RecUserPopupInMainActivityController recUserPopupInMainActivityController, EnumC1262370ixH enumC1262370ixH, InterfaceC20621715mh interfaceC20621715mh, int i) {
        super(1);
        this.$t = i;
        this.l0 = recUserPopupInMainActivityController;
        this.l1 = enumC1262370ixH;
        this.l2 = interfaceC20621715mh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS243S0300000_34(List list, List<DialogButtonModel> list2, DialogInfo dialogInfo, Context context) {
        super(1);
        this.$t = context;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = dialogInfo;
    }
}
