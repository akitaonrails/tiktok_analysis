package com.bytedance.android.livesdk.commonactionpanel;

import X.AbstractC752950TgD;
import X.AbstractC755190Tjp;
import X.C01C5;
import X.C1161920gLG;
import X.C20736316Cj;
import X.C475510Ikn;
import X.C497740JfY;
import X.C755140Tjk;
import X.EnumC755280Tjy;
import X.InterfaceC465670INx;
import X.InterfaceC752920TgA;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCommentSheetPanel extends LiveSheetFragment implements InterfaceC752920TgA {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohJCHELIOSA9KSY4ICA9OCQiLCN9BCw6LAw8JSgpJzsAICApPR8yJiAg";
    public EnumC755280Tjy LLJLLL = EnumC755280Tjy.VIEWER;
    public List<Pair<AbstractC755190Tjp, AbstractC752950TgD>> LLJZ;
    public Function1<? super Integer, Unit> LLJZIJLIL;

    @Override // X.InterfaceC752920TgA
    public final LifecycleOwner LLILLIZIL() {
        return this;
    }

    @Override // X.InterfaceC752920TgA
    public final void dismiss() {
        close(1);
    }

    public static final float uS() {
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            return (InterfaceC465670INx.LJLILLLLZI.LIZIZ().booleanValue() || C497740JfY.LJIL()) ? 24.0f : 266.0f;
        }
        return 0.0f;
    }

    @Override // X.InterfaceC752920TgA
    public final FragmentManager oc() {
        return getChildFragmentManager();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezk, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            return null;
        }
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.gravity = 3;
        sheetOptions.marginEnd = uS();
        sheetOptions.marginStart = uS();
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        Function1<? super Integer, Unit> function1 = this.LLJZIJLIL;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean zBooleanValue;
        EnumC755280Tjy enumC755280Tjy;
        Boolean bool;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        boolean zLIZ = false;
        if (dataChannelLJ != null && (bool = (Boolean) dataChannelLJ.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            zLIZ = C01C5.LIZ(dataChannelLJ2);
        }
        if (zBooleanValue) {
            enumC755280Tjy = EnumC755280Tjy.ANCHOR;
        } else if (zLIZ) {
            enumC755280Tjy = EnumC755280Tjy.ADMIN;
        } else {
            enumC755280Tjy = EnumC755280Tjy.VIEWER;
        }
        this.LLJLLL = enumC755280Tjy;
        C755140Tjk c755140Tjk = new C755140Tjk(enumC755280Tjy, this);
        c755140Tjk.LIZ(this.LLJZ);
        return c755140Tjk.LIZJ(viewGroup);
    }
}
