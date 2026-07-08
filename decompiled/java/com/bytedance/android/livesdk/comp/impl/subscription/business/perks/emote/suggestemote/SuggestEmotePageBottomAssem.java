package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote;

import X.C019F;
import X.C0JQ3;
import X.C0JV8;
import X.C0JV9;
import X.C0JVA;
import X.C0JVC;
import X.C0JVE;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C16F5;
import X.C16FS;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C497740JfY;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubscriptionAnchorEmotesSettingItemPolicy;
import com.bytedance.android.livesdk.livesetting.subscription.SubEuRegionSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public final class SuggestEmotePageBottomAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public C16F5 LLJI;
    public C16FS LLJIJIL;
    public boolean LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SuggestEmotePageBottomAssem.class, "suggestEmotePageViewModel", "getSuggestEmotePageViewModel()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/suggestemote/SuggestEmotePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SuggestEmotePageBottomAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SuggestEmotePageViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C0JVC(c19719912DlLIZ), new C0JVE(), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C0JQ3.class, null), checkSupervisorPrepared());
    }

    public final SuggestEmotePageViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (SuggestEmotePageViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        super.onViewCreated(view);
        this.LLJI = (C16F5) view.findViewById(R.id.h0u);
        C16FS c16fs = (C16FS) view.findViewById(R.id.h0w);
        this.LLJIJIL = c16fs;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJI(2131852093));
        }
        C16F5 c16f5 = this.LLJI;
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, new View.OnClickListener() { // from class: X.0JVG
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
                    if (((C0JQ3) this.LL.LLJ.getValue()).LLILZIL) {
                        C495520Jby c495520Jby = new C495520Jby("sslocal://webcast_webview_popup?");
                        c495520Jby.LIZJ("url", url);
                        c495520Jby.LIZJ("lang", C19263510Xx.LIZ(this.LL.getContext()).toString());
                        c495520Jby.LIZJ("height", "60%");
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LL.getContext(), UriProtector.parse(c495520Jby.LIZLLL()));
                        return;
                    }
                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                    C494790Jan.LJII(view.getContext(), url, C2097608Jq.LJIIJ(new Pair("lang", C19263510Xx.LIZ(this.LL.getContext()).toString())));
                }
            });
        }
        C16FS c16fs2 = this.LLJIJIL;
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new View.OnClickListener() { // from class: X.0JVB
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C16FS c16fs3 = this.LL.LLJIJIL;
                    if (c16fs3 != null) {
                        c16fs3.LJ();
                    }
                    C16FS c16fs4 = this.LL.LLJIJIL;
                    if (c16fs4 != null) {
                        c16fs4.setEnabled(false);
                    }
                    Context context = this.LL.getContext();
                    if (context != null) {
                        SuggestEmotePageViewModel suggestEmotePageViewModelGo = this.LL.Go();
                        suggestEmotePageViewModelGo.withState(new C0JVD(suggestEmotePageViewModelGo, context));
                    }
                }
            });
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0JUx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C492830JUj) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new C0JV9(this), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0JV5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C492830JUj) obj).LLILZLL;
            }
        }, null, new C0JVA(this), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0JUz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C492830JUj) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new C0JV8(this), 4);
    }
}
