package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0TYA;
import X.C0TYC;
import X.C1115360f8A;
import X.C1115380f8C;
import X.C1119920fFW;
import X.C292401Bi;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C745220TLc;
import X.C786180Usi;
import X.C786410Ut5;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.text.a0;
import webcast.api.room.MuteRule;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAddHotCommentMuteRuleSheet extends LiveSheetFragment implements C0TYA {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTHELIOSE4ICE0ZgklPyoSLCEEJjsQJyghLCEnBTA4LB0mJCAfISo2PA==";
    public int LLJZ;
    public final C01GW LLJLLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 85));
    public final C01GW LLJZIJLIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 84));
    public final C01GW LLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 87));
    public final C01GW LLLF = C292401Bi.LIZ(new AwS556S0100000_12(this, 86));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        c500060JjI.LIZ(Collections.singletonList(new C510160Jza(C497740JfY.LJIJI(2131821725), R.style.a7g, new C786180Usi(this, 0))));
        return c500060JjI;
    }

    @Override // X.C0TYA
    public final void Ju(MuteRule muteRule) {
        this.LLJZ = (int) muteRule.durationSecond;
        TextView textView = (TextView) this.LLJLLL.getValue();
        if (textView != null) {
            textView.setText(C497740JfY.LJIJJ(2131821727, C0TYC.LIZIZ(new C745220TLc(this.LLJZ))));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Resources resources;
        int i;
        super.onViewCreated(view, bundle);
        C786410Ut5.I7(new AbS694S0100000_12(this, 4), view.findViewById(R.id.e1g));
        String strLJIJJ = C497740JfY.LJIJJ(2131821726, String.valueOf(((Number) this.LLL.getValue()).intValue()), this.LLJZIJLIL.getValue());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJIJJ);
        int iLJJJ = a0.LJJJ(strLJIJJ, (String) this.LLJZIJLIL.getValue(), 0, false, 6);
        C1119920fFW.LJ(getContext(), spannableStringBuilder, iLJJJ, iLJJJ + ((String) this.LLJZIJLIL.getValue()).length(), 33, 4, OppoPermissionPopupMaskDelayExp.DEFAULT);
        C1115360f8A c1115360f8A = C1115380f8C.LIZ;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Context context = getContext();
        if (context != null) {
            resources = context.getResources();
        } else {
            resources = null;
        }
        C1115380f8C.LIZLLL(spannableStringBuilder2, resources, this, new AwS626S0100000_12(view, 9));
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("mute_duration");
        } else {
            i = 0;
        }
        this.LLJZ = i;
        TextView textView = (TextView) this.LLJLLL.getValue();
        if (textView != null) {
            textView.setText(C497740JfY.LJIJJ(2131821727, C0TYC.LIZIZ(new C745220TLc(this.LLJZ))));
        }
        C786410Ut5.I7(new AbS694S0100000_12(this, 5), view.findViewById(R.id.oxv));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h64, viewGroup, false);
    }
}
