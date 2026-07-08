package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote;

import X.C019F;
import X.C055Q;
import X.C0JQ2;
import X.C0JQ3;
import X.C1161920gLG;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C497740JfY;
import X.C500260Jjc;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubscriptionEmoteUrl;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageTitleBarAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SuggestEmotePageTitleBarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SuggestEmotePageTitleBarAssem.class, "suggestEmotePageViewModel", "getSuggestEmotePageViewModel()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/suggestemote/SuggestEmotePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SuggestEmotePageTitleBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SuggestEmotePageViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055Q(c19719912DlLIZ), new C0JQ2(), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C0JQ3.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        super.onViewCreated(view);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.vym);
        if (!((C0JQ3) this.LLJ.getValue()).LLILZIL) {
            C500260Jjc.LJLJLJ(liveIconView, true);
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0JQ1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OnBackPressedDispatcher onBackPressedDispatcher;
                    C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
                    if (c19egLIZ != null && (onBackPressedDispatcher = c19egLIZ.getOnBackPressedDispatcher()) != null) {
                        onBackPressedDispatcher.LJ();
                    }
                }
            });
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Cg2()) {
            i = 2131839350;
        } else {
            i = 2131852095;
        }
        textView.setText(C497740JfY.LJIJI(i));
        LiveIconView liveIconView2 = (LiveIconView) view.findViewById(R.id.h4q);
        C500260Jjc.LJLJLJ(liveIconView2, true);
        C786410Ut5.g8(liveIconView2, new View.OnClickListener() { // from class: X.0JQ4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                Context context = this.LL.getContext();
                if (context != null) {
                    AssemVMLazy assemVMLazy = this.LL.LLIZLLLIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SuggestEmotePageTitleBarAssem.LLJI;
                    SuggestEmotePageViewModel suggestEmotePageViewModel = (SuggestEmotePageViewModel) assemVMLazy.getValue();
                    C495520Jby c495520Jby = new C495520Jby(LiveSubscriptionEmoteUrl.INSTANCE.getValue().getUserEmoteFaq());
                    if (suggestEmotePageViewModel.wQ2().LLILZIL) {
                        str = "60%";
                    } else {
                        str = "100%";
                    }
                    c495520Jby.LIZJ("height", str);
                    c495520Jby.LIZJ("use_live_sheet", "1");
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_suggest_emotes_upload_page_faq_click");
                    c474500IjALIZ.LJJII(suggestEmotePageViewModel.wQ2().LLILZ, "anchor_id");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "user_id");
                    c474500IjALIZ.LJJII(suggestEmotePageViewModel.wQ2().LLILLJJLI, "entrance_page");
                    c474500IjALIZ.LJJII(suggestEmotePageViewModel.wQ2().LLILLL, "upload_user_type");
                    c474500IjALIZ.LIZ();
                }
            }
        });
    }
}
