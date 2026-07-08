package com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C0DTR;
import X.C0OLV;
import X.C0OPX;
import X.C0OSF;
import X.C0OSO;
import X.C0OSP;
import X.C0OWM;
import X.C0P4G;
import X.C1220000hqw;
import X.C12ES;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1766560w4U;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C291001Au;
import X.C426710GoH;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C620650OVz;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC617880OLi;
import X.EnumC619890OTb;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469401sC;
import X.InterfaceC494301wD;
import X.InterfaceC617820OLc;
import X.InterfaceC623330Ocd;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinBottomContainerThemeAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinFullScreenGamePlayAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInputTopicAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemEditPageConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinTextStruct;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinFullScreenGamePlayAssem extends UIContentAssem implements BulletinFullScreenGamePlayAbility, InterfaceC623330Ocd, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final EnumC619890OTb LLIZLLLIL = EnumC619890OTb.GAMEPLAY_BACKGROUND;
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJI;
    public final C736950SvV LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public BulletinItemEditPageConfig LLJILJILJ;
    public boolean LLJILLL;
    public Bitmap LLJJ;
    public InterfaceC469401sC LLJJI;
    public final C01GW LLJJIII;
    public C0P4G LLJJIJI;
    public View LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinFullScreenGamePlayAssem.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinEditFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinEditFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1891042189) {
            return null;
        }
        return this;
    }

    public BulletinFullScreenGamePlayAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 401);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinProfileViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(232);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((AbstractC738140SxQ) this, 403);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJI = new C736950SvV(c19719912DlLIZ, awS553S0100000_9, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, awS553S0100000_92, c451610HnL, c723700Sa8);
        AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9(this, 400);
        this.LLJIJIL = new C736950SvV(C13LE.LIZ(BulletinEditViewModel.class), awS553S0100000_93, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(233), new AwS553S0100000_9((AbstractC738140SxQ) this, 404), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ2, 402), AFwS240S0000000_9.get$arr$(231), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS553S0100000_9(this, 399));
    }

    public final void Go() {
        BulletinItemEditPageConfig bulletinItemEditPageConfig = this.LLJILJILJ;
        if (bulletinItemEditPageConfig == null) {
            return;
        }
        Bitmap bitmap = this.LLJJ;
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(Lo().getContext().getResources(), bitmap);
            Lo().setFixedDrawable(bitmapDrawable);
            Lo().setImageDrawable(bitmapDrawable);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[ColorDiag] GamePlay.applyActivityUI: bitmap=");
            sbLIZ.append(bitmap.getWidth());
            sbLIZ.append('x');
            sbLIZ.append(bitmap.getHeight());
            sbLIZ.append(", hasAlpha=");
            sbLIZ.append(bitmap.hasAlpha());
            sbLIZ.append(", config=");
            sbLIZ.append(bitmap.getConfig());
            sbLIZ.append(", topLeftPixel=");
            sbLIZ.append(C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(bitmap.getPixel(0, 0))}, 1)));
            sbLIZ.append(", topCenterPixel=");
            sbLIZ.append(C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(bitmap.getPixel(bitmap.getWidth() / 2, 0))}, 1)));
            sbLIZ.append(", bottomCenterPixel=");
            sbLIZ.append(C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 1))}, 1)));
            sbLIZ.append(", imageViewAlpha=");
            sbLIZ.append(Lo().getAlpha());
            sbLIZ.append(", imageAlpha=");
            sbLIZ.append(Lo().getImageAlpha());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        }
        Zo(Oo().getState().LL);
        Ho(bulletinItemEditPageConfig, null);
        ap(null);
        BulletinBottomContainerThemeAbility bulletinBottomContainerThemeAbility = (BulletinBottomContainerThemeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinBottomContainerThemeAbility.class, null);
        if (bulletinBottomContainerThemeAbility != null) {
            bulletinBottomContainerThemeAbility.zZ1();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[ColorDiag] GamePlay.applyActivityUI done: statusBarColor=");
        sbLIZ2.append(bulletinItemEditPageConfig.statusBarColor);
        sbLIZ2.append(", containerAlpha=");
        sbLIZ2.append(LJJIJL().getAlpha());
        sbLIZ2.append(", containerVisibility=");
        sbLIZ2.append(LJJIJL().getVisibility());
        sbLIZ2.append(", bgImageViewAlpha=");
        sbLIZ2.append(Lo().getAlpha());
        sbLIZ2.append(", bgImageAlpha=");
        sbLIZ2.append(Lo().getImageAlpha());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final C426710GoH Lo() {
        return (C426710GoH) this.LLJJIII.getValue();
    }

    public final BulletinEditViewModel No() {
        return (BulletinEditViewModel) this.LLJIJIL.getValue();
    }

    public final BulletinInputStateViewModel Oo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (BulletinInputStateViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinFullScreenGamePlayAbility
    public final TuxImageModel gW0() {
        BulletinItemEditPageConfig bulletinItemEditPageConfig = this.LLJILJILJ;
        if (bulletinItemEditPageConfig != null) {
            return bulletinItemEditPageConfig.inactiveIconUrl;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinFullScreenGamePlayAbility
    public final TuxImageModel kV() {
        BulletinItemEditPageConfig bulletinItemEditPageConfig = this.LLJILJILJ;
        if (bulletinItemEditPageConfig != null) {
            return bulletinItemEditPageConfig.activeIconUrl;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinFullScreenGamePlayAbility
    public final String zs0() {
        BulletinTextStruct bulletinTextStruct;
        BulletinItemEditPageConfig bulletinItemEditPageConfig = this.LLJILJILJ;
        if (bulletinItemEditPageConfig == null || (bulletinTextStruct = bulletinItemEditPageConfig.guideTextStruct) == null) {
            return null;
        }
        return bulletinTextStruct.text;
    }

    public final boolean So() {
        return No().LLIZLLLIL;
    }

    public final void Vo() {
        BulletinEditInputAbility bulletinEditInputAbility = (BulletinEditInputAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinEditInputAbility.class, null);
        BulletinInputTopicAbility bulletinInputTopicAbility = (BulletinInputTopicAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinInputTopicAbility.class, null);
        if (bulletinInputTopicAbility != null) {
            bulletinInputTopicAbility.gY0();
        }
        if (bulletinEditInputAbility != null) {
            bulletinEditInputAbility.O72();
            bulletinEditInputAbility.nL();
            bulletinEditInputAbility.o91();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinFullScreenGamePlayAbility
    public final boolean bI() {
        return So();
    }

    @Override // X.InterfaceC623330Ocd
    public final View dk() {
        return LJJIJL();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        View view;
        super.onDestroy();
        InterfaceC469401sC interfaceC469401sC = this.LLJJI;
        if (interfaceC469401sC != null) {
            interfaceC469401sC.cancel();
        }
        C0P4G c0p4g = this.LLJJIJI;
        if (c0p4g != null && (view = this.LLJJIJIIJIL) != null) {
            view.removeOnLayoutChangeListener(c0p4g);
        }
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.iA(this.LLIZLLLIL);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinFullScreenGamePlayAbility
    public final BulletinItemEditPageConfig nb2() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC623330Ocd
    public final EnumC619890OTb pd() {
        return this.LLIZLLLIL;
    }

    public final void Zo(C0OSF c0osf) {
        if (So() && c0osf == C0OSF.FULL_SCREEN && this.LLJILLL) {
            C12ES.LJIILL(0, LJJIJL());
        } else {
            C0DTR.LIZIZ(LJJIJL());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ap(X.C0OSF r11) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinFullScreenGamePlayAssem.ap(X.0OSF):void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinFullScreenGamePlayAbility
    public final void oG(boolean z) {
        Oo().setState(new AwS588S0100000_9(new AwS24S0010000_9(z, 1), (Function1<? super C291001Au<Boolean>, Unit>) 537));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View view2;
        View viewFindViewById;
        FrameLayout.LayoutParams layoutParams;
        super.onViewCreated(view);
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.HK2(this);
        }
        Object parent = LJJIJL().getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null && (viewFindViewById = view2.findViewById(R.id.er9)) != null) {
            this.LLJJIJIIJIL = viewFindViewById;
            C0P4G c0p4g = new C0P4G(view2, this, 1);
            this.LLJJIJI = c0p4g;
            viewFindViewById.addOnLayoutChangeListener(c0p4g);
            if (viewFindViewById.getHeight() > 0) {
                ViewGroup.LayoutParams layoutParams2 = LJJIJL().getLayoutParams();
                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null && layoutParams.bottomMargin != viewFindViewById.getHeight()) {
                    layoutParams.bottomMargin = viewFindViewById.getHeight();
                    C786410Ut5.W5(LJJIJL(), layoutParams);
                }
            }
        }
        if (!C0OSP.LIZIZ()) {
            return;
        }
        C736680Sv4.LJIIIIZZ(this, this.LLJI.getValue(), new C2217381BqS() { // from class: X.0OSM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJJJJJIL;
            }
        }, null, new AwS623S0100000_9(this, 183), 6);
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0OVP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LLILZIL;
            }
        }, null, new AwS623S0100000_9(this, 182), 6);
    }

    @Override // X.InterfaceC623330Ocd
    public final List Gl(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    public final void Ho(BulletinItemEditPageConfig bulletinItemEditPageConfig, C0OSF c0osf) {
        BulletinEditInputAbility bulletinEditInputAbility = (BulletinEditInputAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinEditInputAbility.class, null);
        BulletinInputTopicAbility bulletinInputTopicAbility = (BulletinInputTopicAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinInputTopicAbility.class, null);
        if (c0osf == null) {
            c0osf = Oo().getState().LL;
        }
        if (c0osf == C0OSF.NORMAL) {
            if (bulletinInputTopicAbility != null) {
                bulletinInputTopicAbility.wY();
            }
        } else if (bulletinInputTopicAbility != null) {
            bulletinInputTopicAbility.gY0();
        }
        if (c0osf == C0OSF.FULL_SCREEN) {
            BulletinTextStruct bulletinTextStruct = bulletinItemEditPageConfig.textStruct;
            if (bulletinTextStruct != null && bulletinEditInputAbility != null) {
                bulletinEditInputAbility.RN2(bulletinTextStruct);
            }
            String str = bulletinItemEditPageConfig.cursorColor;
            if (str != null && bulletinEditInputAbility != null) {
                bulletinEditInputAbility.a10(str);
            }
            BulletinTextStruct bulletinTextStruct2 = bulletinItemEditPageConfig.guideTextStruct;
            if (bulletinTextStruct2 != null && bulletinEditInputAbility != null) {
                bulletinEditInputAbility.qv1(bulletinTextStruct2);
                return;
            }
            return;
        }
        if (bulletinEditInputAbility == null) {
            return;
        }
        bulletinEditInputAbility.nL();
        bulletinEditInputAbility.o91();
        bulletinEditInputAbility.O72();
    }

    public final void Jo(int i, boolean z) {
        Window window;
        Integer numLIZJ;
        Integer numLIZJ2;
        String str;
        Integer numValueOf;
        boolean z2;
        String strJ4;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null) {
            return;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        String strJ42 = null;
        if (c19egLIZ != null) {
            window = c19egLIZ.getWindow();
        } else {
            window = null;
        }
        if (z) {
            if (So()) {
                BulletinItemEditPageConfig bulletinItemEditPageConfig = this.LLJILJILJ;
                if (bulletinItemEditPageConfig == null || (str = bulletinItemEditPageConfig.statusBarColor) == null) {
                    str = "";
                }
                TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(fragmentLJI);
                if (str.length() > 0) {
                    try {
                        numValueOf = Integer.valueOf(Color.parseColor(str));
                        try {
                            tuxImmersionBarLIZLLL.LJIIIZ(numValueOf.intValue());
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("changeImmersiveBar: invalid statusBarColor=");
                            sbLIZ.append(str);
                            sbLIZ.append(", ");
                            sbLIZ.append(e.getMessage());
                            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
                            tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.zm);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        numValueOf = null;
                    }
                } else {
                    tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.zm);
                    numValueOf = null;
                }
                tuxImmersionBarLIZLLL.LIZ(false);
                if (i == R.style.y3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(z2);
                tuxImmersionBarLIZLLL.LIZLLL();
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    if (window != null) {
                        window.setStatusBarColor(iIntValue);
                    }
                }
                StringBuilder sb = new StringBuilder("[ColorDiag] changeImmersiveBar: barColor=");
                sb.append(str);
                sb.append(", resolved=");
                if (numValueOf != null) {
                    strJ4 = C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(numValueOf.intValue())}, 1));
                } else {
                    strJ4 = null;
                }
                sb.append(strJ4);
                sb.append(", windowStatusBarColor=");
                if (window != null) {
                    strJ42 = C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(window.getStatusBarColor())}, 1));
                }
                sb.append(strJ42);
                C0OPX.LJII(sb.toString());
                return;
            }
            TuxImmersionBar tuxImmersionBarLIZLLL2 = C1766560w4U.LIZLLL(fragmentLJI);
            tuxImmersionBarLIZLLL2.LJIIIIZZ(R.attr.zo);
            tuxImmersionBarLIZLLL2.LIZ(true);
            tuxImmersionBarLIZLLL2.LIZLLL();
            Context context = getContext();
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.zo, context)) != null) {
                int iIntValue2 = numLIZJ2.intValue();
                if (window != null) {
                    window.setStatusBarColor(iIntValue2);
                    return;
                }
                return;
            }
            return;
        }
        TuxImmersionBar tuxImmersionBarLIZLLL3 = C1766560w4U.LIZLLL(fragmentLJI);
        tuxImmersionBarLIZLLL3.LJIIIIZZ(R.attr.zm);
        tuxImmersionBarLIZLLL3.LIZ(true);
        tuxImmersionBarLIZLLL3.LIZLLL();
        Context context2 = getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context2)) != null) {
            int iIntValue3 = numLIZJ.intValue();
            if (window != null) {
                window.setStatusBarColor(iIntValue3);
            }
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final List eb(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) {
        Integer numValueOf;
        C0OSF c0osf = c620650OVz.LIZLLL;
        int i = C0OSO.LIZ[enumC617880OLi.ordinal()];
        if (i != 1) {
            if (i == 2 && c620650OVz.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[ColorDiag] GamePlay.COMPLETE: containerAlpha=");
                sbLIZ.append(LJJIJL().getAlpha());
                sbLIZ.append(", containerVis=");
                sbLIZ.append(LJJIJL().getVisibility());
                sbLIZ.append(", bgImageViewAlpha=");
                sbLIZ.append(Lo().getAlpha());
                sbLIZ.append(", bgImageAlpha=");
                sbLIZ.append(Lo().getImageAlpha());
                sbLIZ.append(", bgDrawableAlpha=");
                Drawable drawable = Lo().getDrawable();
                if (drawable != null) {
                    numValueOf = Integer.valueOf(drawable.getAlpha());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        if (c620650OVz.LIZ()) {
            Zo(c0osf);
            BulletinItemEditPageConfig bulletinItemEditPageConfig = this.LLJILJILJ;
            if (bulletinItemEditPageConfig != null) {
                if (So()) {
                    Ho(bulletinItemEditPageConfig, c0osf);
                } else {
                    Vo();
                }
            }
            ap(c0osf);
            return;
        }
        if (!c620650OVz.LIZJ()) {
            return;
        }
        Zo(c0osf);
        BulletinItemEditPageConfig bulletinItemEditPageConfig2 = this.LLJILJILJ;
        if (bulletinItemEditPageConfig2 != null) {
            if (So()) {
                Ho(bulletinItemEditPageConfig2, c0osf);
            } else {
                Vo();
            }
        }
        ap(c0osf);
    }
}
