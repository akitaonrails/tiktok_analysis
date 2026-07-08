package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote;

import X.C019F;
import X.C0JV1;
import X.C0JV2;
import X.C0JV3;
import X.C0JV6;
import X.C1119920fFW;
import X.C13LE;
import X.C1637806bA;
import X.C16F5;
import X.C16FS;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C497740JfY;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageBottomAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubscriptionAnchorEmotesSettingItemPolicy;
import com.bytedance.android.livesdk.livesetting.subscription.SubEuRegionSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class SubWaveEmotePageBottomAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public C16F5 LLJ;
    public C16FS LLJI;
    public boolean LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubWaveEmotePageBottomAssem.class, "subWaveEmotePageViewModel", "getSubWaveEmotePageViewModel()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subwave/emote/SubWaveEmotePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubWaveEmotePageBottomAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubWaveEmotePageViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C0JV3(c19719912DlLIZ), new C0JV6(), null, true);
    }

    public final SubWaveEmotePageViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (SubWaveEmotePageViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        String strLJIJI;
        super.onViewCreated(view);
        this.LLJ = (C16F5) view.findViewById(R.id.h0u);
        this.LLJI = (C16FS) view.findViewById(R.id.h0w);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (SubEuRegionSetting.INSTANCE.isEuRegion()) {
            strLJIJI = C497740JfY.LJIJI(2131844384);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131844385);
        }
        int length = strLJIJI.length();
        String strLJIJJ = C497740JfY.LJIJJ(2131844382, strLJIJI);
        int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
        spannableStringBuilder.append((CharSequence) new SpannableString(strLJIJJ));
        int i = length + iLJJJ;
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C497740JfY.LIZLLL(R.attr.ex3, getContext())), iLJJJ, i, 33);
        C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJJ, i, 33, 500);
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            c16f5.setText(spannableStringBuilder);
        }
        C16F5 c16f52 = this.LLJ;
        if (c16f52 != null) {
            C786410Ut5.l8(c16f52, new View.OnClickListener() { // from class: X.0JVH
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String url;
                    if (SubEuRegionSetting.INSTANCE.isEuRegion()) {
                        url = "https://www.tiktok.com/community-guidelines";
                    } else if (C497740JfY.LJJ()) {
                        url = "https://sf19-draftcdn-sg.ibytedtos.com/obj/ies-hotsoon-draft-sg/tiktok-live/634e6d93-67b9-4e98-b706-b87accc60611_ar.html";
                    } else {
                        url = SubscriptionAnchorEmotesSettingItemPolicy.INSTANCE.getUrl();
                    }
                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                    C494790Jan.LJII(view.getContext(), url, C2097608Jq.LJIIJ(new Pair("lang", C19263510Xx.LIZ(this.getContext()).toString())));
                }
            });
        }
        C16FS c16fs = this.LLJI;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0JV0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C16FS c16fs2 = this.LL.LLJI;
                    if (c16fs2 != null) {
                        c16fs2.LJ();
                    }
                    C16FS c16fs3 = this.LL.LLJI;
                    if (c16fs3 != null) {
                        c16fs3.setEnabled(false);
                    }
                    Context context = this.LL.getContext();
                    if (context != null) {
                        SubWaveEmotePageBottomAssem subWaveEmotePageBottomAssem = this.LL;
                        SubWaveEmotePageViewModel subWaveEmotePageViewModelGo = subWaveEmotePageBottomAssem.Go();
                        subWaveEmotePageViewModelGo.withState(new C0JUB(subWaveEmotePageViewModelGo, context));
                        subWaveEmotePageBottomAssem.Go().yQ2("click");
                    }
                }
            });
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0JUy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JUV) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new C0JV1(this), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0JV4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JUV) obj).LLIZ;
            }
        }, null, new C0JV2(this), 6);
    }
}
