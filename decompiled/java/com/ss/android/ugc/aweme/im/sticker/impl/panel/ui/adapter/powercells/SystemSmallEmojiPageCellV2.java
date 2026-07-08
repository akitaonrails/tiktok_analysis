package com.ss.android.ugc.aweme.im.sticker.impl.panel.ui.adapter.powercells;

import X.AnonymousClass0956;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0H3I;
import X.C0H3J;
import X.C0H3N;
import X.C0IDE;
import X.C12ES;
import X.C1388190mED;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C158600jA;
import X.C1622206Wu;
import X.C1876507Wp;
import X.C19659111vp;
import X.C19719912Dl;
import X.C21673919s1;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C23250099c;
import X.C338490DOt;
import X.C340640DXa;
import X.C384050F3z;
import X.C418440Gaw;
import X.C424230GkH;
import X.C424250GkJ;
import X.C424420Gka;
import X.C426750GoL;
import X.C449650HkB;
import X.C449750HkL;
import X.C450350HlJ;
import X.C450360HlK;
import X.C450580Hlg;
import X.C451030HmP;
import X.C451430Hn3;
import X.C451440Hn4;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452080Ho6;
import X.C452501pT;
import X.C456970Hvz;
import X.C5182020e;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C946803n0;
import X.C987103tV;
import X.EnumC429160GsE;
import X.EnumC451500HnA;
import X.InterfaceC1891350zJl;
import X.InterfaceC21676019sM;
import X.InterfaceC2217461Bqa;
import X.InterfaceC450890HmB;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import Y.ACListenerS141S0100000_6;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.emoji.common.sysemoji.ImSysEmojiModel;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.EmojiPanelBottomPaddingVM;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService;
import com.ss.android.ugc.aweme.im.sticker.impl.panel.ui.adapter.poweritems.SmallEmojiSectionTitleCell;
import com.ss.android.ugc.aweme.im.sticker.impl.panel.ui.adapter.poweritems.SystemSmallEmojiCell;
import com.ss.android.ugc.aweme.stickerpanel.ISysSmallEmojiPageCellVM;
import com.ss.android.ugc.aweme.ui.BaseStickerPanelCell;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SystemSmallEmojiPageCellV2 extends BaseStickerPanelCell<C1876507Wp> implements C0H3J {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final C449750HkL LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;
    public AnonymousClass0956 LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final C01GW LLJJJ;
    public final int LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SystemSmallEmojiPageCellV2.class, "powerListVM", "getPowerListVM()Lcom/ss/android/ugc/aweme/stickerpanel/ISysSmallEmojiPageCellVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SystemSmallEmojiPageCellV2.class, "emojiPanelBottomPaddingVM", "getEmojiPanelBottomPaddingVM()Lcom/ss/android/ugc/aweme/emoji/emojiPageV2/EmojiPanelBottomPaddingVM;", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU = new C2217401BqU(SystemSmallEmojiPageCellV2.class, "emojiPanelBottomPaddingVM", "<v#0>", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217401BqU};
    }

    @Override // com.ss.android.ugc.aweme.ui.BaseStickerPanelCell
    public final C449750HkL T5() {
        this.LLJILJILJ = true;
        return this.LLJILJIL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cqw;
    }

    public SystemSmallEmojiPageCellV2() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ISysSmallEmojiPageCellVM.class);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ, 408);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(190);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 395), awS550S0100000_6, AFwS192S0000000_6.get$arr$(102), new AwS550S0100000_6((C03K6) this, 385), new AwS550S0100000_6((C03K6) this, 396), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 399), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) this, 402), null, new AwS550S0100000_6((C03K6) this, 405));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6((C03K6) this, 381);
            AwS550S0100000_6 awS550S0100000_63 = new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 383);
            AwS550S0100000_6 awS550S0100000_64 = new AwS550S0100000_6(c19719912DlLIZ, 386);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS407S0200000_6((InterfaceC451590HnJ) obj, awS550S0100000_62, 22));
            AwS550S0100000_6 awS550S0100000_65 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 391);
            AwS550S0100000_6 awS550S0100000_66 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 394);
            AwS550S0100000_6 awS550S0100000_67 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 397);
            AwS550S0100000_6 awS550S0100000_68 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 400);
            AwS550S0100000_6 awS550S0100000_69 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 403);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS550S0100000_64, awS550S0100000_6, new C452080Ho6(), awS550S0100000_65, awS550S0100000_66, awS550S0100000_63, aFwS236S0000000_6, awS550S0100000_67, awS550S0100000_68, awS550S0100000_69);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 406), awS550S0100000_6, AFwS192S0000000_6.get$arr$(107), new AwS550S0100000_6((C03K6) this, 410), new AwS550S0100000_6((C03K6) this, 412), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 356), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) this, 358), null, new AwS550S0100000_6((C03K6) this, 361));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 364), awS550S0100000_6, AFwS192S0000000_6.get$arr$(103), new AwS550S0100000_6((C03K6) this, 367), new AwS550S0100000_6((C03K6) this, 368), new AwS550S0100000_6((C03K6) this, 371), aFwS236S0000000_6, null, null, new AwS550S0100000_6((C03K6) this, 373));
        }
        this.LLJI = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(EmojiPanelBottomPaddingVM.class);
        AwS550S0100000_6 awS550S0100000_610 = new AwS550S0100000_6(c19719912DlLIZ2, 375);
        AFwS236S0000000_6 aFwS236S0000000_62 = AFwS236S0000000_6.get$arr$(191);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ2, 380), awS550S0100000_610, AFwS192S0000000_6.get$arr$(106), new AwS550S0100000_6((C03K6) this, 384), new AwS550S0100000_6((C03K6) this, 387), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 389), aFwS236S0000000_62, new AwS550S0100000_6((C03K6) this, 392), null, new AwS550S0100000_6((C03K6) this, 398));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS550S0100000_6 awS550S0100000_611 = new AwS550S0100000_6((C03K6) this, 401);
            AwS550S0100000_6 awS550S0100000_612 = new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 404);
            AwS550S0100000_6 awS550S0100000_613 = new AwS550S0100000_6(c19719912DlLIZ2, 407);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS407S0200000_6((InterfaceC451590HnJ) obj, awS550S0100000_611, 23));
            AwS550S0100000_6 awS550S0100000_614 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 409);
            AwS550S0100000_6 awS550S0100000_615 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 411);
            AwS550S0100000_6 awS550S0100000_616 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 357);
            AwS550S0100000_6 awS550S0100000_617 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 359);
            AwS550S0100000_6 awS550S0100000_618 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 362);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS550S0100000_613, awS550S0100000_610, new C452080Ho6(), awS550S0100000_614, awS550S0100000_615, awS550S0100000_612, aFwS236S0000000_62, awS550S0100000_616, awS550S0100000_617, awS550S0100000_618);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ2, 366), awS550S0100000_610, AFwS192S0000000_6.get$arr$(104), new AwS550S0100000_6((C03K6) this, 369), new AwS550S0100000_6((C03K6) this, 370), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 372), aFwS236S0000000_62, new AwS550S0100000_6((C03K6) this, 374), null, new AwS550S0100000_6((C03K6) this, 376));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ2, 378), awS550S0100000_610, AFwS192S0000000_6.get$arr$(105), new AwS550S0100000_6((C03K6) this, 382), new AwS550S0100000_6((C03K6) this, 388), new AwS550S0100000_6((C03K6) this, 390), aFwS236S0000000_62, null, null, new AwS550S0100000_6((C03K6) this, 393));
        }
        this.LLJIJIL = assemVMLazy2;
        this.LLJILJIL = new C449750HkL((Integer) 5, 2);
        this.LLJILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 360));
        this.LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 363));
        this.LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 377));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 365));
        this.LLJJIJIIJIL = (int) C12ES.LIZJ(16.0f, this.itemView.getContext());
        C12ES.LIZJ(24.0f, this.itemView.getContext());
        this.LLJJIJIL = (int) C12ES.LIZJ(29.0f, this.itemView.getContext());
        this.LLJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 379));
        this.LLJJJIL = 5;
    }

    public final TuxIconView W5() {
        return (TuxIconView) this.LLJJI.getValue();
    }

    public final C450580Hlg X5() {
        return (C450580Hlg) this.LLJJIII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ui.BaseStickerPanelCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        AssemVMLazy assemVMLazy;
        View view;
        super.onItemViewCreated();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) X5().getLayoutParams();
        int i = this.LLJJIJIIJIL;
        marginLayoutParams.setMargins(i, 0, i, 0);
        C450580Hlg c450580HlgX5 = X5();
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(this.itemView.getContext()) { // from class: com.ss.android.ugc.aweme.im.sticker.impl.panel.ui.adapter.powercells.SystemSmallEmojiPageCellV2.onItemViewCreated.1
            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                super.onLayoutCompleted(c21673919s1);
                if (c21673919s1.LIZIZ() > 0) {
                    SystemSmallEmojiPageCellV2 systemSmallEmojiPageCellV2 = SystemSmallEmojiPageCellV2.this;
                    if (systemSmallEmojiPageCellV2.LLJILJILJ) {
                        DurationPerfMon.LIZ.LIZJ(systemSmallEmojiPageCellV2.LLJILJIL, new C158600jA(EnumC451500HnA.EMOJI.getScene(), null));
                        SystemSmallEmojiPageCellV2.this.LLJILJILJ = false;
                    }
                }
                SystemSmallEmojiPageCellV2.this.getClass();
            }
        };
        wrapGridLayoutManager.LLIZ = new C0IDE(this, wrapGridLayoutManager, 0);
        c450580HlgX5.setLayoutManager(wrapGridLayoutManager);
        C450580Hlg c450580HlgX52 = X5();
        Object parent = this.itemView.getParent();
        int width = (!(parent instanceof ViewGroup) || (view = (View) parent) == null) ? 0 : view.getWidth();
        int i2 = this.LLJJIJIL;
        int i3 = this.LLJJIJIIJIL;
        if (width == 0) {
            width = C12ES.LJIIJ(this.itemView.getContext());
        }
        c450580HlgX52.addItemDecoration(new C340640DXa(7, (int) ((((((double) width) - (((double) i3) * 2.0d)) - ((double) (i2 * 7))) * ((double) 1.0f)) / ((double) 6))));
        X5().setHasFixedSize(true);
        AssemVMLazy assemVMLazy2 = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy2.getValue(), new C2217381BqS() { // from class: X.0Hmy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C451400Hn0) obj).LL;
            }
        }, null, new AwS620S0100000_6(this, 35), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJI.getValue(), new C2217381BqS() { // from class: X.0Hmz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C451400Hn0) obj).LLILLJJLI;
            }
        }, null, new AwS620S0100000_6(this, 36), 6);
        IDMResourceManagementService iDMResourceManagementService = (IDMResourceManagementService) PluggableExtentionKt.pluggableSpiForReal(IDMResourceManagementService.class);
        if (iDMResourceManagementService != null) {
            iDMResourceManagementService.LJ(X5());
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C450360HlK(this, null), 3);
        C786410Ut5.LLLLLLZZ(W5(), 0);
        C786410Ut5.a9(W5(), new ACListenerS141S0100000_6(this, 110));
        Drawable drawable = W5().getDrawable();
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        Drawable drawableLIZ = c384050F3z.LIZ(W5().getContext());
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(8);
        c19659111vp.LJ = Integer.valueOf(R.attr.p0);
        c19659111vp.LIZ = C418440Gaw.LIZIZ(4);
        W5().setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(W5().getContext())));
        View view2 = this.itemView;
        if (!(view2 instanceof ViewGroup)) {
            view2 = null;
        }
        final Fragment fragmentLIZ = C946803n0.LIZ(view2);
        if (fragmentLIZ != null) {
            InterfaceC724530SbT interfaceC724530SbT = new InterfaceC724530SbT() { // from class: X.03H6
                @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
                public final LifecycleOwner getActualLifecycleOwner() {
                    return this;
                }

                @Override // X.InterfaceC725030ScH
                public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
                    return this;
                }

                @Override // X.InterfaceC725050ScJ
                public final C03H5 getActualReceiver() {
                    return this;
                }

                @Override // X.InterfaceC725030ScH
                public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
                    return this;
                }

                @Override // X.InterfaceC725030ScH
                public final LifecycleOwner getHostLifecycleOwner() {
                    return null;
                }

                @Override // X.InterfaceC725030ScH
                public final LifecycleOwner getOwnLifecycleOwner() {
                    return this;
                }

                @Override // X.InterfaceC725030ScH
                public final C03H5 getReceiverForHostVM() {
                    return null;
                }

                @Override // X.InterfaceC725030ScH
                public final boolean getUniqueOnlyDefault() {
                    return true;
                }

                @Override // androidx.lifecycle.LifecycleOwner
                public final Lifecycle getLifecycle() {
                    return fragmentLIZ.getLifecycle();
                }

                @Override // X.InterfaceC725030ScH
                public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
                    return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
                }

                @Override // X.InterfaceC725030ScH
                public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
                    return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
                }

                @Override // X.InterfaceC725030ScH
                public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
                    return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
                }

                @Override // X.InterfaceC725030ScH
                public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
                    return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
                }

                @Override // X.InterfaceC725030ScH
                public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
                    return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
                }

                @Override // X.InterfaceC725030ScH
                public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
                    return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
                }

                @Override // X.InterfaceC725030ScH
                public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
                    return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
                }
            };
            InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmojiPanelBottomPaddingVM.class);
            C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 273);
            AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(440);
            if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZ, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragmentLIZ, true), new C338490DOt(fragmentLIZ, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragmentLIZ, 1131), aFwS236S0000000_6, new C451460Hn6(fragmentLIZ, true), new C451620HnM(fragmentLIZ, true), new C987103tV(fragmentLIZ, true));
            } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                assemVMLazy = C451650HnP.LIZ(fragmentLIZ, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragmentLIZ, c19719912DlLIZ), c5182020e, new AwS550S0100000_6(fragmentLIZ, 1132), aFwS236S0000000_6, null, null, null);
            } else {
                if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                    throw new IllegalArgumentException("Do not support this scope here.");
                }
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZ, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ), C724750Sbp.LJIIIZ(fragmentLIZ), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragmentLIZ, 1133), aFwS236S0000000_6, new C451460Hn6(fragmentLIZ, false), new C451620HnM(fragmentLIZ, false), new C987103tV(fragmentLIZ, false));
            }
            this.LLJJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(interfaceC724530SbT), null, null, new C450350HlJ(assemVMLazy, this, null), 3);
        }
        X5().setItemAnimator(null);
        Activity activityLIZ = C1388190mED.LIZ(X5().getContext());
        if (activityLIZ != null) {
            final C0H3I c0h3i = new C0H3I(activityLIZ, X5());
            c0h3i.LLILZ = this;
            C450580Hlg c450580HlgX53 = X5();
            final C0H3N c0h3n = (C0H3N) this.LLJJJ.getValue();
            final int i4 = this.LLJJIJIL;
            c450580HlgX53.addOnItemTouchListener(new InterfaceC21676019sM(c0h3i, c0h3n, i4) { // from class: X.0H3M
                public final C0H3I LL;
                public final C0H3N LLILLJJLI;
                public long LLILLL;
                public int LLILZ = -1;
                public float LLILZIL = -1.0f;
                public float LLILZLL = -1.0f;
                public final float LLIZ;
                public boolean LLIZLLLIL;

                @Override // X.InterfaceC21676019sM
                public final void LJIIZILJ(boolean z) {
                }

                @Override // X.InterfaceC21676019sM
                public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
                    if (!(recyclerView instanceof C450580Hlg)) {
                        return;
                    }
                    List<InterfaceC1891350zJl> listItems = ((ViewOnAttachStateChangeListenerC20604515jv) recyclerView).getListItems();
                    int action = motionEvent.getAction();
                    if (action != 1) {
                        if (action != 2) {
                            if (action == 3 && this.LL.isShowing()) {
                                this.LLILLJJLI.LIZ(true);
                                this.LLILZ = -1;
                                this.LL.dismiss();
                                return;
                            }
                            return;
                        }
                        if (!this.LL.isShowing() || !(ListProtector.get(listItems, this.LLILZ) instanceof C424250GkJ)) {
                            return;
                        }
                        this.LL.LJJIIJ(((C424250GkJ) ListProtector.get(listItems, this.LLILZ)).LLILLL, motionEvent, this.LLILZ, null);
                        return;
                    }
                    if (!this.LL.isShowing()) {
                        return;
                    }
                    if (ListProtector.get(listItems, this.LLILZ) instanceof C424250GkJ) {
                        this.LL.LJJIIJ(((C424250GkJ) ListProtector.get(listItems, this.LLILZ)).LLILLL, motionEvent, this.LLILZ, null);
                    }
                    this.LLILLJJLI.LIZ(true);
                    this.LLILZ = -1;
                }

                @Override // X.InterfaceC21676019sM
                public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                    View viewFindChildViewUnder;
                    int absoluteAdapterPosition;
                    int i5;
                    if (!(recyclerView instanceof C450580Hlg) || (viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null) {
                        return false;
                    }
                    RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(viewFindChildViewUnder);
                    if (!(childViewHolder instanceof SystemSmallEmojiCell) || (absoluteAdapterPosition = childViewHolder.getAbsoluteAdapterPosition()) == -1) {
                        return false;
                    }
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action != 2) {
                                if (action == 3 && this.LL.isShowing()) {
                                    this.LLILLJJLI.LIZ(true);
                                    this.LLILZ = -1;
                                    this.LL.dismiss();
                                }
                            } else {
                                if (Math.abs(motionEvent.getRawX() - this.LLILZIL) > this.LLIZ || Math.abs(motionEvent.getRawY() - this.LLILZLL) > this.LLIZ) {
                                    this.LLIZLLLIL = true;
                                }
                                if (this.LLIZLLLIL) {
                                    return false;
                                }
                                int i6 = this.LLILZ;
                                if (i6 != absoluteAdapterPosition) {
                                    this.LLILZ = -1;
                                    return false;
                                }
                                if (i6 != -1 && this.LLILLL != 0 && System.currentTimeMillis() - this.LLILLL > 150 && !this.LL.isShowing() && this.LLILZ == absoluteAdapterPosition) {
                                    viewFindChildViewUnder.performHapticFeedback(0);
                                    List<InterfaceC1891350zJl> listItems = ((ViewOnAttachStateChangeListenerC20604515jv) recyclerView).getListItems();
                                    if (absoluteAdapterPosition <= listItems.size() && (ListProtector.get(listItems, this.LLILZ) instanceof C424250GkJ)) {
                                        this.LL.LJJIIJ(((C424250GkJ) ListProtector.get(listItems, this.LLILZ)).LLILLL, motionEvent, absoluteAdapterPosition, viewFindChildViewUnder);
                                    }
                                    C0H3I c0h3i2 = this.LL;
                                    View contentView = c0h3i2.getContentView();
                                    int width2 = c0h3i2.getWidth();
                                    int i7 = 1073741824;
                                    if (width2 == -2) {
                                        i5 = 0;
                                    } else {
                                        i5 = 1073741824;
                                    }
                                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width2), i5);
                                    int height = c0h3i2.getHeight();
                                    if (height == -2) {
                                        i7 = 0;
                                    }
                                    contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), i7));
                                    C0H3I c0h3i3 = this.LL;
                                    c0h3i3.getClass();
                                    viewFindChildViewUnder.getGlobalVisibleRect(new Rect());
                                    new Rect();
                                    c0h3i3.LL.getWindow().getDecorView().getGlobalVisibleRect(new Rect());
                                    c0h3i3.showAsDropDown(viewFindChildViewUnder, (-(c0h3i3.getContentView().getMeasuredWidth() - viewFindChildViewUnder.getMeasuredWidth())) / 2, ((-viewFindChildViewUnder.getMeasuredHeight()) - c0h3i3.getContentView().getMeasuredHeight()) - 21);
                                    this.LLILLJJLI.LIZ(false);
                                    return true;
                                }
                            }
                            return false;
                        }
                        this.LLILLJJLI.LIZ(true);
                        this.LLILZ = -1;
                        return false;
                    }
                    this.LLILZIL = motionEvent.getRawX();
                    this.LLILZLL = motionEvent.getRawY();
                    this.LLILLL = System.currentTimeMillis();
                    this.LLILZ = absoluteAdapterPosition;
                    this.LLIZLLLIL = false;
                    return false;
                }

                {
                    this.LL = c0h3i;
                    this.LLILLJJLI = c0h3n;
                    this.LLIZ = i4 / 2.0f;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.BaseStickerPanelCell
    public final void LJJJJLI() {
        X5().scrollToPosition(0);
    }

    @Override // com.ss.android.ugc.aweme.ui.BaseStickerPanelCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        X5().LJIILJJIL(SmallEmojiSectionTitleCell.class, SystemSmallEmojiCell.class);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.13BV] */
    public final void refresh() {
        ArrayList arrayList;
        ?? arrayList2;
        List<String> listLIZIZ;
        ImSysEmojiModel imSysEmojiModel;
        List<String> emojiList;
        Object next;
        ImSysEmojiModel next2;
        List<String> emojiList2;
        List<String> emojiList3;
        C1876507Wp c1876507Wp = (C1876507Wp) getItem();
        if (c1876507Wp == null) {
            return;
        }
        C449650HkB c449650HkBWQ2 = R5().wQ2();
        List<ImSysEmojiModel> list = c449650HkBWQ2.LLJZIJLIL;
        boolean z = c449650HkBWQ2.LLJZ;
        if (list == null || list.isEmpty()) {
            List<C451030HmP> listLIZ = c1876507Wp.LL.LIZ();
            arrayList = new ArrayList();
            for (C451030HmP c451030HmP : listLIZ) {
                String previewEmoji = ((ImSysEmojiModel) c451030HmP.LIZJ).getPreviewEmoji();
                if (previewEmoji == null) {
                    previewEmoji = c451030HmP.LIZIZ;
                }
                List<String> emojiList4 = ((ImSysEmojiModel) c451030HmP.LIZJ).getEmojiList();
                if (emojiList4 == null) {
                    emojiList4 = C13BV.INSTANCE;
                }
                arrayList.add(new C424250GkJ(previewEmoji, emojiList4, new AwS585S0100000_6(c451030HmP, 275), false));
            }
        } else {
            arrayList = new ArrayList();
            for (ImSysEmojiModel imSysEmojiModel2 : list) {
                String previewEmoji2 = imSysEmojiModel2.getPreviewEmoji();
                if (previewEmoji2 != null || ((emojiList3 = imSysEmojiModel2.getEmojiList()) != null && (previewEmoji2 = (String) C13LP.LJJJLL(emojiList3)) != null)) {
                    List<String> emojiList5 = imSysEmojiModel2.getEmojiList();
                    if (emojiList5 == null) {
                        emojiList5 = C13BV.INSTANCE;
                    }
                    arrayList.add(new C424250GkJ(previewEmoji2, emojiList5, new AwS585S0100000_6(imSysEmojiModel2, 276), false));
                }
            }
        }
        if (!z || (listLIZIZ = C424420Gka.LIZ().LIZIZ(7)) == null) {
            arrayList2 = C13BV.INSTANCE;
        } else if (list == null || list.isEmpty()) {
            C451430Hn3 c451430Hn3 = (C451430Hn3) c1876507Wp.LL;
            C451440Hn4 c451440Hn4 = c451430Hn3.LIZIZ;
            int i = c451430Hn3.LIZLLL;
            c451440Hn4.getClass();
            List listLIZIZ2 = C451440Hn4.LIZIZ(i);
            arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            for (String str : listLIZIZ) {
                if (listLIZIZ2 != null) {
                    Iterator it2 = listLIZIZ2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        List<String> emojiList6 = ((ImSysEmojiModel) next).getEmojiList();
                        if (emojiList6 != null && !emojiList6.isEmpty()) {
                            Iterator<String> it3 = emojiList6.iterator();
                            while (it3.hasNext()) {
                                if (Intrinsics.LJFF(it3.next(), str)) {
                                    break;
                                }
                            }
                        }
                    }
                    imSysEmojiModel = (ImSysEmojiModel) next;
                } else {
                    imSysEmojiModel = null;
                }
                if (imSysEmojiModel == null || (emojiList = imSysEmojiModel.getEmojiList()) == null) {
                    emojiList = C13BV.INSTANCE;
                }
                arrayList2.add(new C424250GkJ(str, emojiList, new AwS585S0100000_6(imSysEmojiModel, 274), true));
            }
        } else {
            arrayList2 = new ArrayList();
            for (String str2 : listLIZIZ) {
                Iterator<ImSysEmojiModel> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                    ImSysEmojiModel imSysEmojiModel3 = next2;
                    if (Intrinsics.LJFF(imSysEmojiModel3.getPreviewEmoji(), str2) || ((emojiList2 = imSysEmojiModel3.getEmojiList()) != null && emojiList2.contains(str2))) {
                        break;
                    }
                }
                ImSysEmojiModel imSysEmojiModel4 = next2;
                if (imSysEmojiModel4 != null) {
                    List<String> emojiList7 = imSysEmojiModel4.getEmojiList();
                    if (emojiList7 == null) {
                        emojiList7 = Collections.singletonList(str2);
                    }
                    arrayList2.add(new C424250GkJ(str2, emojiList7, new AwS585S0100000_6(imSysEmojiModel4, 273), true));
                }
            }
        }
        X5().getState().LJIILL(arrayList2.isEmpty() ^ true ? C13LP.LJLIL(arrayList, C13LP.LJLIL(Collections.singletonList(new C424230GkH(EnumC429160GsE.ALL_EMOJIS)), C13LP.LJLIL(arrayList2, Collections.singletonList(new C424230GkH(EnumC429160GsE.RECENT))))) : C13LP.LJLIL(arrayList, Collections.singletonList(new C424230GkH(EnumC429160GsE.ALL_EMOJIS))), null);
    }

    @Override // com.ss.android.ugc.aweme.ui.BaseStickerPanelCell
    public final int I5() {
        return this.LLJJJIL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        refresh();
    }

    @Override // com.ss.android.ugc.aweme.ui.BaseStickerPanelCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        refresh();
        LJJJJLI();
    }

    @Override // X.C0H3J
    public final void O2(int i, String str, List list) {
        ArrayList arrayList = new ArrayList(X5().getListItems());
        if (ListProtector.get(arrayList, i) instanceof C424230GkH) {
            return;
        }
        ((C424250GkJ) ListProtector.get(arrayList, i)).LLILZ.invoke(str);
        ListProtector.set(arrayList, i, C424250GkJ.LIZ((C424250GkJ) ListProtector.get(arrayList, i), str));
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
            if (interfaceC1891350zJl instanceof C424250GkJ) {
                C424250GkJ c424250GkJ = (C424250GkJ) interfaceC1891350zJl;
                if (!c424250GkJ.LL && Intrinsics.LJFF(c424250GkJ.LLILLL, list)) {
                    if (i2 != -1) {
                        ListProtector.set(arrayList, i2, C424250GkJ.LIZ((C424250GkJ) ListProtector.get(arrayList, i2), str));
                    }
                }
            }
            i2++;
        }
        X5().getState().LJIILL(arrayList, null);
        ((InterfaceC450890HmB) this.LLJJIJI.getValue()).LJI(str);
        C424420Gka.LIZ().LIZJ(str);
    }
}
