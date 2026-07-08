package com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business;

import X.AbstractC738140SxQ;
import X.C06US;
import X.C0LAB;
import X.C1216270hkv;
import X.C1251350ifV;
import X.C1383370m6R;
import X.C13LE;
import X.C1558520qew;
import X.C19659111vp;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C291001Au;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452070Ho5;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.base.IHeaderStoryHighlightsAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS50S0200000_2;
import irm.AkS75S0100000_2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class HeaderStoryHighlightsBannerComponent extends BaseUIComponent {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public LinearLayout LLJJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HeaderStoryHighlightsBannerComponent.class, "highlightsVM", "getHighlightsVM()Lcom/ss/android/ugc/profile/business/story/highlights/StoryHighlightsMyProfileVM;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        IHeaderStoryHighlightsAbility iHeaderStoryHighlightsAbility;
        View view = this.LLJJ;
        if (view == null || (iHeaderStoryHighlightsAbility = (IHeaderStoryHighlightsAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderStoryHighlightsAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderStoryHighlightsAbility.LJIIIZ(this.LLJILLL, view, str);
    }

    public HeaderStoryHighlightsBannerComponent() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryHighlightsMyProfileVM.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 891);
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(541);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS546S0100000_2((AbstractC738140SxQ) this, 892), aFwS229S0000000_2, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJLIIIJLLLLLLLZ = assemVMLazy;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        C1251350ifV state;
        C291001Au<Boolean> c291001Au;
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        up(!((profilePlatformViewModelZo == null || (state = profilePlatformViewModelZo.getState()) == null || (c291001Au = state.LL) == null) ? true : c291001Au.LIZ.booleanValue()));
        ProfilePlatformViewModel profilePlatformViewModelZo2 = Zo();
        if (profilePlatformViewModelZo2 != null) {
            profilePlatformViewModelZo2.JQ2(new AwS581S0100000_2(this, 361));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        int iLJFF;
        int i;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        layoutParams2.gravity = 17;
        C786410Ut5.d6(linearLayout2, layoutParams2);
        linearLayout2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        if ((linearLayout2.getResources().getConfiguration().uiMode & 48) == 32) {
            iLJFF = C1383370m6R.LJFF(R.attr.a03);
        } else {
            iLJFF = C1383370m6R.LJFF(R.attr.a1f);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(14));
        gradientDrawable.setColor(iLJFF);
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZ = C418440Gaw.LIZIZ(14);
        c19659111vp.LIZIZ(4);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(10);
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(1);
        linearLayout2.setBackground(C426750GoL.LJIILIIL(gradientDrawable, c19659111vp.LIZ(context)));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -1);
        layoutParams3.weight = 1.0f;
        C786410Ut5.d6(linearLayout3, layoutParams3);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_story_highlight_gradient;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        tuxIconView.setTuxIcon(c419910GdJ);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
        layoutParams4.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        C786410Ut5.M6(tuxIconView, layoutParams4);
        linearLayout3.addView(tuxIconView);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(C1216270hkv.LIZJ(2131848993));
        tuxTextView.setTuxFont(62);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf((tuxTextView.getResources().getDisplayMetrics().widthPixels / tuxTextView.getResources().getDisplayMetrics().density) - 120))));
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout3.addView(tuxTextView);
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        if (tuxIconView2.getLayoutDirection() == 1) {
            i = R.raw.icon_chevron_left_offset_fill_ltr;
        } else {
            i = R.raw.icon_chevron_right_offset_fill_ltr;
        }
        c419910GdJ2.LIZ = i;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        tuxIconView2.setTuxIcon(c419910GdJ2);
        C786410Ut5.M6(tuxIconView2, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
        linearLayout3.addView(tuxIconView2);
        C786410Ut5.I7(new AkS50S0200000_2(this, context, 3), linearLayout3);
        linearLayout2.addView(linearLayout3);
        View view = new View(context);
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), -1));
        linearLayout2.addView(view);
        TuxIconView tuxIconView3 = new TuxIconView(context, null, 0, 6, null);
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZ = R.raw.icon_x_mark_small;
        c419910GdJ3.LJ = Integer.valueOf(R.attr.a1k);
        c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        tuxIconView3.setTuxIcon(c419910GdJ3);
        C786410Ut5.M6(tuxIconView3, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        C786410Ut5.I7(new AkS75S0100000_2(this, 7), tuxIconView3);
        linearLayout2.addView(tuxIconView3);
        linearLayout.addView(linearLayout2);
        this.LLJJL = linearLayout;
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        assemVMLazy.getValue();
        C06US.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "personal_homepage");
        c0lab.LJ("enter_method", "new_user_prompt");
        C20684815ws.LJIILLIIL("ttsocial_story_highlight_create_btn_show", c0lab.LIZ);
        return this.LLJJL;
    }

    public final void up(boolean z) {
        LinearLayout linearLayout;
        IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager;
        if (z && !this.LLJL && (linearLayout = this.LLJJL) != null && linearLayout.isShown() && (iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null)) != null) {
            iStoryHighlightsMyDataManager.LJJIIZI();
        }
        this.LLJL = z;
    }
}
