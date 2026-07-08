package com.ss.android.ugc.aweme.story.note;

import X.AnonymousClass1278;
import X.C01GW;
import X.C098200Yq;
import X.C0C64;
import X.C0FRP;
import X.C0ID9;
import X.C0LAB;
import X.C0S1B;
import X.C0TI1;
import X.C11GO;
import X.C11GW;
import X.C11GZ;
import X.C123100dR;
import X.C127K;
import X.C127M;
import X.C12BX;
import X.C1449410nox;
import X.C1449420noy;
import X.C1608750rxx;
import X.C1609930rzr;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C16H9;
import X.C16HQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20097413kK;
import X.C20581915gH;
import X.C20584715gj;
import X.C20684815ws;
import X.C20748116Gx;
import X.C23250099c;
import X.C281330B0x;
import X.C287180BNk;
import X.C298260Bma;
import X.C298620BnA;
import X.C418440Gaw;
import X.C444910HcX;
import X.C452501pT;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.C856230XiP;
import X.EnumC1216650hlX;
import X.EnumC1257160ios;
import X.EnumC19387610t8;
import X.EnumC20581215gA;
import X.InterfaceC497601wk;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS133S0200000_31;
import Y.ACListenerS165S0100000_31;
import Y.AObserverS131S0300000_31;
import Y.AObserverS180S0200000_16;
import Y.AObserverS190S0200000_31;
import Y.AObserverS208S0100000_4;
import Y.AObserverS233S0100000_31;
import Y.ARunnableS107S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS43S1400000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS92S1300000_31;
import wh6.AbS334S0300000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class StoryThoughtCreationFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZisjHELIOSPSp9GzEjOzYHICo5LicnCzcpKDs6JysKOy40JSAiPQ==";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1059));
    public C20748116Gx LLIZLLLIL;
    public C20581915gH LLJ;
    public TuxSheet LLJI;
    public C127K LLJIJIL;
    public C127K LLJILJIL;
    public C127K LLJILJILJ;

    public final StoryThoughtCreationVM SR() {
        return (StoryThoughtCreationVM) this.LLIZ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C20748116Gx c20748116Gx = this.LLIZLLLIL;
        if (c20748116Gx == null) {
            c20748116Gx = null;
        }
        c20748116Gx.LJ();
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void UR(String str) {
        Object objValueOf;
        int i;
        String strLJJ;
        String str2;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", "story");
        c0lab.LJ("shoot_enter_from", SR().LLJJIJIIJIL);
        c0lab.LJ("shoot_enter_method", SR().LLJJIJIL);
        c0lab.LJ("exit_method", str);
        if (SR().LLJJJJ > 0) {
            objValueOf = Long.valueOf(System.currentTimeMillis() - SR().LLJJJJ);
        } else {
            objValueOf = "-1";
        }
        c0lab.LIZLLL(objValueOf, "shoot_exit_duration");
        c0lab.LIZ(C123100dR.LIZ(SR().LLILZIL.getValue()) ? 1 : 0, "has_gif");
        if (SR().yQ2() == 0) {
            i = 0;
        } else {
            i = 1;
        }
        c0lab.LIZ(i, "has_festivals_custom");
        String strLJIJJLI = C1609930rzr.LJIJJLI(Integer.valueOf(SR().yQ2()));
        if (strLJIJJLI != null) {
            c0lab.LJ("holiday_type", strLJIJJLI);
        }
        StoryThoughtCreationVM storyThoughtCreationVMSR = SR();
        c0lab.LJ("thought_text_type", C1609930rzr.LJJI(storyThoughtCreationVMSR.LLIZ.getValue(), (List) storyThoughtCreationVMSR.LLJ.getValue()));
        BackgroundModel backgroundModel = (BackgroundModel) SR().LLJJ.getValue();
        String str3 = "";
        if (backgroundModel == null) {
            strLJJ = "";
        } else {
            strLJJ = C1609930rzr.LJJ(Integer.valueOf(backgroundModel.backgroundType));
        }
        c0lab.LJ("thought_background_type", strLJJ);
        BackgroundModel backgroundModel2 = (BackgroundModel) SR().LLJJ.getValue();
        if (backgroundModel2 != null && (str2 = backgroundModel2.backgroundGeckoId) != null) {
            str3 = str2;
        }
        c0lab.LJ("thought_bg_gecko_id", str3);
        c0lab.LJ("story_archive_tab_name", SR().LLJJJ);
        C20684815ws.LJIILLIIL("shoot_exit", c0lab.LIZ);
    }

    public final void WR(EnumC20581215gA enumC20581215gA) {
        C127M accessory;
        C11GO c11go;
        C127M accessory2;
        C11GO c11go2;
        C11GO c11go3;
        boolean z;
        boolean z2;
        C127K c127k = this.LLJIJIL;
        C127M accessory3 = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof AnonymousClass1278) {
            c11go = (C11GO) accessory;
        } else {
            c11go = null;
        }
        boolean z3 = true;
        if (c11go != null) {
            if (enumC20581215gA == EnumC20581215gA.EVERYONE) {
                z2 = true;
            } else {
                z2 = false;
            }
            c11go.LJIILJJIL(z2);
        }
        C127K c127k2 = this.LLJILJIL;
        if (c127k2 != null) {
            accessory2 = c127k2.getAccessory();
        } else {
            accessory2 = null;
        }
        if ((accessory2 instanceof AnonymousClass1278) && (c11go3 = (C11GO) accessory2) != null) {
            if (enumC20581215gA == EnumC20581215gA.FRIENDS) {
                z = true;
            } else {
                z = false;
            }
            c11go3.LJIILJJIL(z);
        }
        C127K c127k3 = this.LLJILJILJ;
        if (c127k3 != null) {
            accessory3 = c127k3.getAccessory();
        }
        if ((accessory3 instanceof AnonymousClass1278) && (c11go2 = (C11GO) accessory3) != null) {
            if (enumC20581215gA != EnumC20581215gA.ONLY_YOU) {
                z3 = false;
            }
            c11go2.LJIILJJIL(z3);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String creationId;
        int iLIZJ;
        C20581915gH c20581915gH;
        int i;
        String creationId2;
        Window window;
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onViewCreated(view, bundle);
        C11GZ.LIZ.getClass();
        C11GZ.LIZJ.clear();
        C23250099c.LIZLLL((InterfaceC497601wk) C11GZ.LIZIZ.getValue(), null, null, new C11GW(null), 3);
        this.LLIZLLLIL = new C20748116Gx(this, 1);
        C19EG activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            C20748116Gx c20748116Gx = this.LLIZLLLIL;
            if (c20748116Gx == null) {
                c20748116Gx = null;
            }
            onBackPressedDispatcher.LIZ(viewLifecycleOwner, c20748116Gx);
        }
        C20581915gH c20581915gH2 = this.LLJ;
        if (C298620BnA.LIZ() && c20581915gH2 != null) {
            new StoryThoughtMentionManagerImpl(c20581915gH2.LLJILLL, c20581915gH2.LLJJIJI, c20581915gH2.LLJJ, SR(), null, 16);
        }
        C20581915gH c20581915gH3 = this.LLJ;
        String str = "";
        if (c20581915gH3 != null) {
            User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
            C19EG activity2 = getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                window.setNavigationBarColor(-16777216);
            }
            c20581915gH3.LLJILLL.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(SR().LLILZ.getBubbleViewMaxWidthDp()))));
            c20581915gH3.LLJILLL.setEnableDarkMode(false);
            c20581915gH3.LLJILLL.setBubbleStyle(EnumC1257160ios.NORMAL);
            c20581915gH3.LLJILLL.setMaxLength(60);
            C197039127h c197039127h = c20581915gH3.LLJJIJI;
            ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(SR().LLILZ.getYourStoryButtonHeightDp())));
                C786410Ut5.W5(c197039127h, layoutParams2);
                c20581915gH3.LLJ.setShadowLayer(C418440Gaw.LIZIZ(Float.valueOf(1.0f)), C418440Gaw.LIZIZ(Float.valueOf(0.0f)), C418440Gaw.LIZIZ(Float.valueOf(1.0f)), 520093696);
                FrameLayout frameLayout = c20581915gH3.LLJIJIL;
                C19EG activity3 = getActivity();
                if (activity3 != null) {
                    iLIZJ = C497820Jfg.LIZJ(activity3);
                } else {
                    iLIZJ = 0;
                }
                frameLayout.setPadding(frameLayout.getPaddingLeft(), iLIZJ, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                FrameLayout frameLayout2 = c20581915gH3.LLJIJIL;
                if (frameLayout2.isLaidOut() && !frameLayout2.isLayoutRequested()) {
                    C12BX c12bx = c20581915gH3.LLJILJILJ;
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams3.bottomMargin = SR().LLILZ.backgroundViewMarginBottom();
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12bx);
                    c12bx.setLayoutParams(layoutParams3);
                } else {
                    frameLayout2.addOnLayoutChangeListener(new C16H9(this, c20581915gH3, 0));
                }
                c20581915gH3.LLJILLL.LJIIJ();
                C20584715gj c20584715gj = c20581915gH3.LLJILLL;
                String value = SR().LLIZ.getValue();
                if (value != null && C123100dR.LIZ(value)) {
                    c20584715gj.setText(value);
                    c20584715gj.setSelection(value.length());
                }
                ImageView imageView = c20581915gH3.LLJJI;
                if (imageView != null) {
                    C786410Ut5.LJZI(4, imageView);
                }
                ImageView imageView2 = c20581915gH3.LLJJI;
                if (imageView2 != null) {
                    imageView2.setImageBitmap(null);
                }
                C20097413kK.LIZLLL(c20584715gj);
                HandlerHook.viewPost(c20584715gj, new ARunnableS107S0100000_7(c20584715gj, 275));
                C20581915gH c20581915gH4 = this.LLJ;
                if (c20581915gH4 != null) {
                    FrameLayout frameLayout3 = c20581915gH4.LLILLL;
                    ViewGroup.LayoutParams layoutParams4 = frameLayout3.getLayoutParams();
                    if (layoutParams4 != null) {
                        layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(SR().LLILZ.getAvatarSizeDp())));
                        layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(SR().LLILZ.getAvatarSizeDp())));
                        C786410Ut5.W5(frameLayout3, layoutParams4);
                        AvatarComponentView avatarComponentView = c20581915gH4.LLILLJJLI;
                        C1608750rxx config = avatarComponentView.getConfig();
                        new AwS603S0100000_24(this, 308).invoke(config.LIZ);
                        new AwS603S0100000_24(this, 688).invoke(config.LIZJ);
                        avatarComponentView.LJFF(avatarComponentView.getConfig());
                        if (currentUser.getUid() != null) {
                            C0S1B.LIZ(c20581915gH4.LLILLJJLI, currentUser.getUid(), currentUser, getViewLifecycleOwner(), false, null, 56);
                        }
                        C19EG activity4 = getActivity();
                        if (activity4 != null) {
                            C20097413kK.LIZJ(activity4.getWindow(), c20581915gH4.LLIZ, AFwS231S0000000_3.get$arr$(274), new AwS638S0100000_24(this, 109));
                        }
                        SR().LLJI.observe(getViewLifecycleOwner(), new AObserverS180S0200000_16(this, c20581915gH4, 4));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                C786410Ut5.a9(c20581915gH3.LLILZLL, new ACListenerS165S0100000_31(this, 245));
                C786410Ut5.za(c20581915gH3.LLILZ, new ACListenerS165S0100000_31(this, 246));
                C786410Ut5.Q8(c20581915gH3.LLIZLLLIL, new ACListenerS165S0100000_31(this, 239));
                if (!((Boolean) C281330B0x.LIZ.getValue()).booleanValue()) {
                    C786410Ut5.R7(c20581915gH3.LLILZIL, new ACListenerS165S0100000_31(c20584715gj, 240));
                }
                c20584715gj.addTextChangedListener(new C16HQ(this, 7));
                ((LiveData) SR().LLJJIII.getValue()).observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(this, c20581915gH3, 54));
                SR().LLJ.observe(getViewLifecycleOwner(), new AObserverS131S0300000_31(this, c20584715gj, c20581915gH3, 2));
                SR().LLJIJIL.observe(getViewLifecycleOwner(), new AObserverS190S0200000_31(this, c20581915gH3, 4));
                c20581915gH3.LLJILJILJ.setOnFetchSwitchColorListener(new AwS610S0100000_31(this, 556));
                SR().LLJJ.observe(getViewLifecycleOwner(), new AObserverS190S0200000_31(c20581915gH3, currentUser, 6));
                SR().LLJJI.observe(getViewLifecycleOwner(), new AObserverS233S0100000_31(c20581915gH3, 59));
                C786410Ut5.U8(c20581915gH3.LLJJIJI, new ACListenerS133S0200000_31(this, c20581915gH3, 49));
                C786410Ut5.a9(c20581915gH3.LLJI, new AbS334S0300000_31(this, c20584715gj, c20581915gH3, 1));
                SR().LLJJJJLIIL.observe(getViewLifecycleOwner(), new AObserverS190S0200000_31(this, c20581915gH3, 7));
                SR().LLILLL.observe(getViewLifecycleOwner(), new AObserverS208S0100000_4(this, 15));
                StoryThoughtCreationVM storyThoughtCreationVMSR = SR();
                if (storyThoughtCreationVMSR.LLJJJJLIIL.getValue() == EnumC20581215gA.FRIENDS) {
                    storyThoughtCreationVMSR.LL.getClass();
                    if (C0TI1.LIZ()) {
                        storyThoughtCreationVMSR.LLILLJJLI.setValue(Unit.LIZ);
                    }
                }
                ImageView imageView3 = c20581915gH3.LLJJI;
                if (imageView3 != null) {
                    imageView3.setClipToOutline(true);
                    imageView3.setOutlineProvider(new C0ID9(36));
                }
                ImageView imageView4 = c20581915gH3.LLJJIII;
                if (imageView4 != null) {
                    imageView4.setClipToOutline(true);
                    imageView4.setOutlineProvider(new C0ID9(37));
                }
                c20581915gH3.LLJILLL.setOnExceedMaxLength(new AwS575S0100000_31(this, 1591));
                C20581915gH c20581915gH5 = this.LLJ;
                if (c20581915gH5 != null && C287180BNk.LIZ() && C0C64.LJIILLIIL().LJIJ(31744, 0, "holiday_thoughts_quick_input_single_tap", true) == 1) {
                    C786410Ut5.Aa(c20581915gH5.LLJILLL, new ACListenerS133S0200000_31(this, c20581915gH5, 47));
                }
                if (!SR().LLJJJIL && (c20581915gH = this.LLJ) != null) {
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("enter_method", SR().LLJJIJIL);
                    if (c20581915gH.LLJILLL.getPrompt().LIZIZ != EnumC19387610t8.HOLIDAY && c20581915gH.LLJILLL.getPrompt().LIZIZ != EnumC19387610t8.DYNAMIC) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    c0lab.LIZ(i, "has_note_prompt");
                    c0lab.LJ("note_prompt_text", c20581915gH.LLJILLL.getPrompt().LIZ);
                    c0lab.LJ("story_archive_tab_name", SR().LLJJJ);
                    if (C298260Bma.LIZ()) {
                        IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
                        CreativeInfo creativeInfo = SR().LLJJIJI;
                        if (creativeInfo == null || (creationId2 = creativeInfo.getCreationId()) == null) {
                            creationId2 = "";
                        }
                        String str2 = SR().LLJJIJIIJIL;
                        if (str2 == null) {
                            str2 = "";
                        }
                        iRecordMobService.LIZIZ(new C1449410nox(creationId2, "story", str2, null, null, null, null, null, 248), c0lab, null);
                    } else {
                        String creationId3 = null;
                        CreativeInfo creativeInfo2 = SR().LLJJIJI;
                        if (creativeInfo2 != null) {
                            creationId3 = creativeInfo2.getCreationId();
                        }
                        c0lab.LJ("creation_id", creationId3);
                        c0lab.LJ("enter_from", SR().LLJJIJIIJIL);
                        c0lab.LJ("shoot_way", "story");
                        C20684815ws.LJIILLIIL("shoot", c0lab.LIZ);
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        IRecordMobService iRecordMobService2 = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
        CreativeInfo creativeInfo3 = SR().LLJJIJI;
        if (creativeInfo3 != null && (creationId = creativeInfo3.getCreationId()) != null) {
            str = creationId;
        }
        C1449420noy c1449420noy = new C1449420noy(str, "story");
        C0LAB c0lab2 = new C0LAB();
        c0lab2.LJ("shoot_enter_method", SR().LLJJIJIL);
        c0lab2.LJ("shoot_enter_from", SR().LLJJIJIIJIL);
        c0lab2.LIZ(1, "is_note");
        c0lab2.LJ("content_type", "text");
        c0lab2.LJ("content_source", "shoot_and_upload");
        c0lab2.LJ("story_archive_tab_name", SR().LLJJJ);
        iRecordMobService2.LIZJ(c1449420noy, c0lab2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fdr, viewGroup, false);
        int i = R.id.bh2;
        AvatarComponentView avatarComponentView = (AvatarComponentView) C1616006Uk.LIZ(R.id.bh2, viewTd);
        if (avatarComponentView != null) {
            i = R.id.bi2;
            FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.bi2, viewTd);
            if (frameLayout != null) {
                i = R.id.bo2;
                C0FRP c0frp = (C0FRP) C1616006Uk.LIZ(R.id.bo2, viewTd);
                if (c0frp != null) {
                    i = R.id.dmd;
                    LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.dmd, viewTd);
                    if (linearLayout != null) {
                        i = R.id.e1g;
                        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.e1g, viewTd);
                        if (tuxIconView != null) {
                            i = R.id.evd;
                            FrameLayout frameLayout2 = (FrameLayout) C1616006Uk.LIZ(R.id.evd, viewTd);
                            if (frameLayout2 != null) {
                                i = R.id.jcl;
                                SmartImageView smartImageView = (SmartImageView) C1616006Uk.LIZ(R.id.jcl, viewTd);
                                if (smartImageView != null) {
                                    i = R.id.jjp;
                                    TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.jjp, viewTd);
                                    if (tuxTextView != null) {
                                        i = R.id.o7h;
                                        if (C1616006Uk.LIZ(R.id.o7h, viewTd) != null) {
                                            i = R.id.ru8;
                                            TuxIconView tuxIconView2 = (TuxIconView) C1616006Uk.LIZ(R.id.ru8, viewTd);
                                            if (tuxIconView2 != null) {
                                                FrameLayout frameLayout3 = (FrameLayout) viewTd;
                                                i = R.id.u3e;
                                                ScrollView scrollView = (ScrollView) C1616006Uk.LIZ(R.id.u3e, viewTd);
                                                if (scrollView != null) {
                                                    i = R.id.w9l;
                                                    C12BX c12bx = (C12BX) C1616006Uk.LIZ(R.id.w9l, viewTd);
                                                    if (c12bx != null) {
                                                        i = R.id.w9m;
                                                        C20584715gj c20584715gj = (C20584715gj) C1616006Uk.LIZ(R.id.w9m, viewTd);
                                                        if (c20584715gj != null) {
                                                            i = R.id.w9p;
                                                            FrameLayout frameLayout4 = (FrameLayout) C1616006Uk.LIZ(R.id.w9p, viewTd);
                                                            if (frameLayout4 != null) {
                                                                i = R.id.ya8;
                                                                if (C1616006Uk.LIZ(R.id.ya8, viewTd) != null) {
                                                                    i = R.id.yi4;
                                                                    ImageView imageView = (ImageView) C1616006Uk.LIZ(R.id.yi4, viewTd);
                                                                    if (imageView != null) {
                                                                        i = R.id.yi5;
                                                                        ImageView imageView2 = (ImageView) C1616006Uk.LIZ(R.id.yi5, viewTd);
                                                                        if (imageView2 != null) {
                                                                            i = R.id.your_story_button;
                                                                            C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.your_story_button, viewTd);
                                                                            if (c197039127h != null) {
                                                                                this.LLJ = new C20581915gH(frameLayout3, avatarComponentView, frameLayout, c0frp, linearLayout, tuxIconView, frameLayout2, smartImageView, tuxTextView, tuxIconView2, frameLayout3, scrollView, c12bx, c20584715gj, frameLayout4, imageView, imageView2, c197039127h);
                                                                                C19GS c19gs = null;
                                                                                if (!(frameLayout3 instanceof View)) {
                                                                                    frameLayout3 = null;
                                                                                }
                                                                                if (frameLayout3 != null) {
                                                                                    try {
                                                                                        ViewTreeLifecycleOwner.set(frameLayout3, getViewLifecycleOwner());
                                                                                        ViewTreeViewModelStoreOwner.set(frameLayout3, this);
                                                                                        frameLayout3.setTag(R.id.view_tree_saved_state_registry_owner, this);
                                                                                        C19EG activity = getActivity();
                                                                                        if (activity instanceof C19GS) {
                                                                                            c19gs = (C19GS) activity;
                                                                                        }
                                                                                        C1685300txQ.LIZ(c19gs);
                                                                                    } catch (Throwable th) {
                                                                                        TryCatchGuardChecker.doCheck(th);
                                                                                        C189200o6.m2constructorimpl(new C098200Yq(th));
                                                                                        return frameLayout3;
                                                                                    }
                                                                                }
                                                                                C189200o6.m2constructorimpl(Unit.LIZ);
                                                                                return frameLayout3;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }

    public final void VR(C127K c127k, int i, int i2, EnumC20581215gA enumC20581215gA, String str) {
        PrivacySettingsRestrictionOption privacySettingsRestrictionOptionLIZ;
        boolean z;
        C11GO c11go;
        C11GO c11go2;
        C444910HcX c444910HcX = new C444910HcX(getString(i));
        c444910HcX.LIZ(101);
        c127k.setTitle(c444910HcX);
        if (i2 != 0) {
            c127k.setSubtitle(getString(i2));
        }
        c127k.LIZJ(EnumC1216650hlX.PADDING_28, EnumC1216650hlX.PADDING_16);
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(2, "visibility");
        Boolean boolValueOf = null;
        if (privacySettingsRestrictionItemLJIIIZ != null) {
            privacySettingsRestrictionOptionLIZ = C856230XiP.LIZ(privacySettingsRestrictionItemLJIIIZ, Integer.valueOf(enumC20581215gA.getValue()));
        } else {
            privacySettingsRestrictionOptionLIZ = null;
        }
        if (privacySettingsRestrictionOptionLIZ != null && privacySettingsRestrictionOptionLIZ.showType == 1) {
            z = true;
        } else {
            z = false;
        }
        c127k.setCellEnabled(true ^ z);
        C127M accessory = c127k.getAccessory();
        if ((accessory instanceof AnonymousClass1278) && (c11go2 = (C11GO) accessory) != null) {
            c11go2.LJIILL(new AwS92S1300000_31(str, c127k, enumC20581215gA, this, 1));
        }
        C127M accessory2 = c127k.getAccessory();
        if ((accessory2 instanceof AnonymousClass1278) && accessory2 != null) {
            accessory2.LJI(new AwS43S1400000_31(str, c127k, enumC20581215gA, this, privacySettingsRestrictionOptionLIZ, 1));
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("setting_value", String.valueOf(SR().LLJJJJLIIL.getValue().getValue()));
        c0lab.LJ("page_tag", "story_thought_quick_publish");
        c0lab.LJ("item_name", str);
        c0lab.LJFF("is_enabled", c127k.getCellEnabled());
        c0lab.LJ("item_type", "Radio");
        C127M accessory3 = c127k.getAccessory();
        if ((accessory3 instanceof AnonymousClass1278) && (c11go = (C11GO) accessory3) != null) {
            boolValueOf = Boolean.valueOf(c11go.LJIILIIL());
        }
        c0lab.LJ("is_checked", String.valueOf(boolValueOf));
        C20684815ws.LJIILLIIL("pns_tpsc_item_show", c0lab.LIZ);
    }
}
