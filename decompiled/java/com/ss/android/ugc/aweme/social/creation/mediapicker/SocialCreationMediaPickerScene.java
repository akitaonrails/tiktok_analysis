package com.ss.android.ugc.aweme.social.creation.mediapicker;

import X.AbstractC214814194y;
import X.C1388005by;
import X.C1390380mHk;
import X.C14EU;
import X.C1654320t9S;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1669670tYD;
import X.C19719212De;
import X.C19EG;
import X.C1DRG;
import X.C301590Brx;
import X.C536350L1t;
import X.C537340L5o;
import X.C560370LyN;
import X.C786410Ut5;
import X.EnumC1427810nG7;
import X.InterfaceC536360L1u;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS622S0100000_8;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes9.dex */
public final class SocialCreationMediaPickerScene extends AbstractC214814194y implements InterfaceC536360L1u {
    public final EnterStoryParam LLJJIJIL;
    public final SocialMediaPickerViewModel LLJJJ;

    @Override // X.InterfaceC536360L1u
    public final Context LJJIZ() {
        return requireContext();
    }

    @Override // X.InterfaceC536360L1u
    public final C19EG LLJJIJIIJIL() {
        return requireFragmentActivity();
    }

    @Override // X.AbstractC214814194y
    public final boolean LLLLIILL() {
        return C301590Brx.LIZ();
    }

    @Override // X.InterfaceC536360L1u
    public final C1DRG getDiContainer() {
        return C1664600tQ2.LJIIIZ(this);
    }

    @Override // X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJJI(this);
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        this.LLJJJ.onEvent$social_creation_mediapicker_release(new C560370LyN(this));
    }

    @Override // X.InterfaceC536360L1u
    public final void LLIIJI(CreativeToastBuilder creativeToastBuilder) {
        C1390380mHk.LIZ(requireActivity(), 3047, creativeToastBuilder);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C537340L5o c537340L5o) {
        this.LLJJJ.onEvent$social_creation_mediapicker_release(new C1388005by(c537340L5o.LIZ));
    }

    public SocialCreationMediaPickerScene(EnterStoryParam enterStoryParam, SocialMediaPickerViewModel socialMediaPickerViewModel) {
        this.LLJJIJIL = enterStoryParam;
        this.LLJJJ = socialMediaPickerViewModel;
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EnumC1427810nG7 enumC1427810nG7;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            C536350L1t c536350L1tEQ2 = this.LLJJJ.EQ2(bundle2, this.LLJJIJIL, this);
            C1654320t9S.LIZIZ(this, AFwS239S0000000_8.get$arr$(252));
            C1664590tQ1.LIZLLL(this, "SocialCreationMediaPickerScene", false, new AwS374S0200000_8(this, c536350L1tEQ2, 143), 2);
            C1664600tQ2.LIZ(this, "SocialCreationMediaPickerScene", new AwS374S0200000_8(this, c536350L1tEQ2, 145));
        }
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.f9r, viewGroup, false);
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        if (this.LLJJJ.LL.getPageUIConfig().getSupportDaylightMode()) {
            enumC1427810nG7 = EnumC1427810nG7.Auto;
        } else {
            enumC1427810nG7 = EnumC1427810nG7.Dark;
        }
        C1669670tYD.LJ(composeView, enumC1427810nG7, new C19719212De(42411830, new AwS622S0100000_8(this, 20), true));
        viewGroup2.addView(composeView, 0);
        return viewGroup2;
    }
}
