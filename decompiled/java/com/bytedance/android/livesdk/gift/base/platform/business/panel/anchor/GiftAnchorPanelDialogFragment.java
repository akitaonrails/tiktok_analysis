package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor;

import X.C01GW;
import X.C0JOK;
import X.C0QSJ;
import X.C1133630fbd;
import X.C1133640fbe;
import X.C1138630fjh;
import X.C1140890fnL;
import X.C1146150fvp;
import X.C1308910kAL;
import X.C247500xV;
import X.C452501pT;
import X.C500980Jkm;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C784440Upu;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC687730QyJ;
import Y.ACListenerS152S0100000_17;
import Y.AfS186S0100000_17;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceManagerSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftAnchorPanelDialogFragment extends LiveDialogFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LywqPWExKTYpZz8/KTEqJj0+Zic5HELIOSOiY9LTY/Zz8yJiAgZy49Ky0jO2EUISM4CCEwICo+GS49LSkIIC4/JyIKOy40JSAiPQ==";
    public Room LL;
    public DataChannel LLILLJJLI;
    public Context LLILLL;
    public String LLILZ = "";
    public final C1133630fbd LLILZIL = new C1133630fbd();
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 139));
    public C1146150fvp LLIZ;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{GiftAnchorPanelScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(GiftAnchorPanelScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(GiftAnchorPanelScope.class);
        return arrayList;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gno);
        c500980Jkm.LIZJ = R.style.aim;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setStatusBarColor(0);
            window2.addFlags(Integer.MIN_VALUE);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.exu, (Context) this.LLILZLL.getValue());
            window2.setNavigationBarColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        boolean zLJI = MethodIDManager.LJI(202113);
        super.onCreate(bundle);
        setStyle(1, R.style.aim);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            int iIntValue = 0;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.exu, (Context) this.LLILZLL.getValue());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            window.setNavigationBarColor(iIntValue);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zW(GiftDialogVisibilityChannel.class, Boolean.FALSE);
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.LC0(GiftDialogDismissEvent.class, Boolean.FALSE);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (LiveGiftResourceManagerSettings.INSTANCE.getPreloadStrategy() == 1) {
            C1140890fnL.LIZLLL().getClass();
            C1138630fjh.LJIIIZ();
        }
        if (this.LL == null || this.LLILLJJLI == null) {
            return;
        }
        C723850SaN.LIZ(this, false, null, new AwS596S0100000_17(this, 124), 3);
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 32), view.findViewById(R.id.izc));
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zW(GiftDialogVisibilityChannel.class, Boolean.TRUE);
            dataChannel.BQ2(this, GiftDialogDismissEvent.class, new AwS596S0100000_17(this, 426));
            dataChannel.BQ2(this, LiveEndDismissDialogEvent.class, new AwS596S0100000_17(this, 427));
            C784440Upu.LIZ().LIZJ(this, C0JOK.class).LIZJ(new AfS186S0100000_17(this, 111));
        }
    }

    public final void MR(long j, long j2, long j3, boolean z, boolean z2, boolean z3) {
        this.LLILZIL.LJIIIZ = j3;
        int iLIZ = C247500xV.LIZ(z2, this.LL);
        this.LLILZIL.getClass();
        C1133640fbe.LJII(iLIZ, this.LLILZ, z2);
        if (z) {
            C1133640fbe.LJIIIIZZ(iLIZ, j, j2, System.currentTimeMillis() - j3, this.LLILZ, z2, z3);
            C1133640fbe.LJIIL(4, this.LLILZ, null, null, 12);
            return;
        }
        C1133640fbe.LJIIL(3, this.LLILZ, null, null, 12);
    }
}
