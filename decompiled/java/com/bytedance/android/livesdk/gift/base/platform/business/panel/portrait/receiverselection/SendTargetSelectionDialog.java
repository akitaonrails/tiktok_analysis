package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.receiverselection;

import X.C0TZM;
import X.C13BV;
import X.C19719212De;
import X.C20441214yg;
import X.C23250099c;
import X.C437170HCh;
import X.C465640INu;
import X.C500980Jkm;
import X.C932850aNn;
import X.C951540arw;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS115S0100000_15;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS451S0200000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class SendTargetSelectionDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LywqPWExKTYpZz8/KTEqJj0+Zic5OiY9LTY/ZzHELIOS8yJiAgZz88OjE+KCYnZjcpKio6PiA+Oio/LSY4ICA9ZhYpJysHKTcrLDsALSkpKjs6JysIIC4/JyI=";
    public C951540arw LL;
    public Function1<? super List<? extends User>, Unit> LLILLJJLI;
    public List<? extends User> LLILLL = C13BV.INSTANCE;
    public Long LLILZ;
    public boolean LLILZIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        Boolean bool;
        int iLIZIZ = C465640INu.LIZIZ(getContext());
        DataChannel dataChannel = this.dataChannel;
        boolean zBooleanValue = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null) ? true : bool.booleanValue();
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gog);
        c500980Jkm.LIZJ = zBooleanValue ? R.style.ajr : R.style.ajs;
        c500980Jkm.LJII = zBooleanValue ? 80 : 8388629;
        c500980Jkm.LJIIIZ = zBooleanValue ? -1 : iLIZIZ;
        if (zBooleanValue) {
            iLIZIZ = -2;
        }
        c500980Jkm.LJIIJ = iLIZIZ;
        c500980Jkm.LJI = 0.5f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C932850aNn(this, null), 3);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<User> list;
        super.onViewCreated(view, bundle);
        C20441214yg.LJ("ComposeDebug", "onViewCreated ---");
        C951540arw c951540arw = this.LL;
        if (c951540arw != null) {
            list = c951540arw.LIZ;
        } else {
            list = null;
        }
        ComposeView composeView = (ComposeView) view.findViewById(R.id.eo_);
        C437170HCh.LIZ(composeView, this);
        ViewTreeLifecycleOwner.set(composeView, this);
        composeView.setContent(new C19719212De(1416131578, new AwS451S0200000_15(this, (SendTargetSelectionDialog) list, (List<? extends User>) 7), true));
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(composeView, new ARunnableS115S0100000_15(composeView, 83));
    }
}
