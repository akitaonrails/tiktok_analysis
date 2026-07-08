package com.ss.android.ugc.aweme.publish.detail;

import X.C019F;
import X.C11VU;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2217381BqS;
import X.C420290Gdv;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS128S0200000_26;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.publish.EffectMobilePublishVM;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectPublishHintAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public LinearLayout LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectPublishHintAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publish/EffectMobilePublishVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EffectPublishHintAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectMobilePublishVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 851), AFwS268S0000000_26.get$arr$(460), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, MobileEffectData.class, "effect_init_data"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ri;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LinearLayout linearLayout;
        super.onViewCreated(view);
        Context context = view.getContext();
        ViewGroup.LayoutParams layoutParams = getContentView().getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = (int) C11VU.LIZIZ(16.0f, context);
        } else {
            marginLayoutParams = null;
        }
        C786410Ut5.W5(getContentView(), marginLayoutParams);
        C420290Gdv c420290Gdv = (C420290Gdv) view.findViewById(R.id.gw7);
        if (c420290Gdv != null) {
            c420290Gdv.LIZ(((MobileEffectData) this.LLJJIII.getValue()).iconViewType);
            EffectPackageDataWrapper effectPackageDataWrapper = ((MobileEffectData) this.LLJJIII.getValue()).publishData;
            if (effectPackageDataWrapper != null) {
                List<EffectHint> list = effectPackageDataWrapper.availableEffectHintList;
                c420290Gdv.setTitleText(C20642515q3.LJI(2131821233));
                View viewSd = C786410Ut5.Sd(R.layout.fub, C786410Ut5.ne(view.getContext()), null);
                if ((viewSd instanceof LinearLayout) && (linearLayout = (LinearLayout) viewSd) != null) {
                    c420290Gdv.setContentFieldView(linearLayout);
                } else {
                    linearLayout = null;
                }
                this.LLJJIJI = linearLayout;
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                tuxTextView.setText(C20642515q3.LJI(2131821231));
                tuxTextView.setTuxFont(61);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
                if (numLIZJ != null) {
                    tuxTextView.setTextColor(numLIZJ.intValue());
                    c420290Gdv.setFooterFieldView(tuxTextView);
                    C786410Ut5.na(c420290Gdv, new ACListenerS128S0200000_26(this, list, 12));
                }
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0vHf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJI;
            }
        }, null, new AwS640S0100000_26(this, 64), 6);
    }
}
