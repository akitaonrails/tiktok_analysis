package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.text;

import X.C123100dR;
import X.C20741716El;
import X.C2188811AlT;
import X.C444200HbO;
import X.C724270Sb3;
import X.EnumC684990Qtt;
import X.InterfaceC685060Qu0;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.nimblecard.model.search.NimbleConfig;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNimbleTextAssem extends SearchNimbleBaseAssem<String> {
    public TuxTextView LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ez3;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    /* JADX INFO: renamed from: Fp, reason: merged with bridge method [inline-methods] */
    public final String tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str = (String) C444200HbO.LIZ(up(), ((InterfaceC685060Qu0) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLJJI().getTexts());
        if (str != null && C123100dR.LIZ(str)) {
            return str;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        return ((InterfaceC685060Qu0) (c724270Sb32 != null ? c724270Sb32.LL : null)).LLJJI().getSubTitle();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    /* JADX INFO: renamed from: Bp */
    public final void tp(InterfaceC685060Qu0 interfaceC685060Qu0) {
        super.tp(interfaceC685060Qu0);
        TuxTextView tuxTextView = this.LLJZIJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(tp());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zz6);
        if (tuxTextView != null) {
            NimbleConfig nimbleConfigSp = sp();
            if (nimbleConfigSp != null) {
                tuxTextView.getContext();
                Integer numLIZ = C20741716El.LIZ(nimbleConfigSp.textColor, null);
                if (numLIZ != null) {
                    tuxTextView.setTextColor(numLIZ.intValue());
                }
                Integer num = nimbleConfigSp.lineLimit;
                if (num != null) {
                    tuxTextView.setMaxLines(num.intValue());
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(nimbleConfigSp.fontClassName);
                sbLIZ.append('_');
                sbLIZ.append(nimbleConfigSp.fontWeightName);
                tuxTextView.setTuxFont(C20741716El.LJ(C2188811AlT.LIZIZ(sbLIZ)));
            }
        } else {
            tuxTextView = null;
        }
        this.LLJZIJLIL = tuxTextView;
        SearchNimbleBaseAssem.Ep(this, view, EnumC684990Qtt.WORD, new AwS554S0100000_10(this, 580), null, 8);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    public final boolean op(String str) {
        return C123100dR.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC685060Qu0 interfaceC685060Qu0) {
        tp(interfaceC685060Qu0);
    }
}
