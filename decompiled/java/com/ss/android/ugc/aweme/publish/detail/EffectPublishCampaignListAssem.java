package com.ss.android.ugc.aweme.publish.detail;

import X.C019F;
import X.C01GW;
import X.C11VU;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2217381BqS;
import X.C420290Gdv;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.publish.EffectMobilePublishVM;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectPublishCampaignListAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public LinearLayout LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectPublishCampaignListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publish/EffectMobilePublishVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EffectPublishCampaignListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectMobilePublishVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 850), AFwS268S0000000_26.get$arr$(459), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, MobileEffectData.class, "effect_init_data"), checkSupervisorPrepared());
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1117));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ri;
    }

    public final MobileEffectData hp() {
        return (MobileEffectData) this.LLJJIII.getValue();
    }

    public final EffectMobilePublishVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (EffectMobilePublishVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LinearLayout linearLayout;
        TextView textView;
        String str;
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
            c420290Gdv.LIZ(hp().iconViewType);
            c420290Gdv.setTitleText(C20642515q3.LJI(2131821222));
            View viewSd = C786410Ut5.Sd(R.layout.fub, C786410Ut5.ne(view.getContext()), null);
            if ((viewSd instanceof LinearLayout) && (linearLayout = (LinearLayout) viewSd) != null) {
                c420290Gdv.setContentFieldView(linearLayout);
            } else {
                linearLayout = null;
            }
            this.LLJJIJI = linearLayout;
            EffectPackageDataWrapper effectPackageDataWrapper = hp().publishData;
            if ((effectPackageDataWrapper == null || (str = effectPackageDataWrapper.campaignId) == null || str.length() == 0) && (textView = (TextView) this.LLJJIJIIJIL.getValue()) != null) {
                textView.setText("");
            }
            TextView textView2 = (TextView) this.LLJJIJIIJIL.getValue();
            if (textView2 != null) {
                textView2.setHint(C20642515q3.LJI(2131821221));
            }
            C786410Ut5.na(c420290Gdv, new ACListenerS160S0100000_26(this, 37));
        }
        C736680Sv4.LJIIIZ(this, ip(), new C2217381BqS() { // from class: X.0vHj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJJI;
            }
        }, new C2217381BqS() { // from class: X.0vHm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJILLL;
            }
        }, null, new AwS675S0100000_26(this, 9), 12);
    }
}
