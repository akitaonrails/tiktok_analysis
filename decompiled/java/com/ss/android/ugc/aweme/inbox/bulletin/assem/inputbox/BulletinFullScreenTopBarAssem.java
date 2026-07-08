package com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C0DTR;
import X.C0OLV;
import X.C0OPX;
import X.C0ORQ;
import X.C0OSF;
import X.C0OSP;
import X.C0OWM;
import X.C1220000hqw;
import X.C12ES;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C617890OLj;
import X.C620650OVz;
import X.C624550Oeb;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC617880OLi;
import X.EnumC619890OTb;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC617820OLc;
import X.InterfaceC623330Ocd;
import Y.ACListenerS144S0100000_9;
import Y.ALAdapterS6S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinFullScreenGamePlayAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinGamePlayThemeAbility;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import irm.AkS81S0100000_9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinFullScreenTopBarAssem extends UISlotAssem implements BulletinGamePlayThemeAbility, InterfaceC623330Ocd, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final EnumC619890OTb LLJJI = EnumC619890OTb.FULLSCREEN_TOP_BAR;
    public final AssemVMLazy LLJJIII;
    public final C1559260qg8 LLJJIJI;
    public final C736950SvV LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinFullScreenTopBarAssem.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a70;
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
        if (str.hashCode() != -1397187293) {
            return null;
        }
        return this;
    }

    public BulletinFullScreenTopBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 409), AFwS240S0000000_9.get$arr$(234), null, true);
        this.LLJJIJI = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 405);
        this.LLJJIJIIJIL = new C736950SvV(C13LE.LIZ(BulletinEditViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(235), new AwS553S0100000_9((AbstractC738140SxQ) this, 410), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 406));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 407));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 408));
        this.LLJJJJJIL = true;
    }

    public final TuxIconView hp() {
        return (TuxIconView) this.LLJJJ.getValue();
    }

    public final TuxIconView ip() {
        return (TuxIconView) this.LLJJJIL.getValue();
    }

    public final void lp() {
        if (this.LLJJJJJIL) {
            BulletinFullScreenGamePlayAbility bulletinFullScreenGamePlayAbilityKp = kp();
            boolean z = !(bulletinFullScreenGamePlayAbilityKp != null ? bulletinFullScreenGamePlayAbilityKp.bI() : false);
            BulletinFullScreenGamePlayAbility bulletinFullScreenGamePlayAbilityKp2 = kp();
            if (bulletinFullScreenGamePlayAbilityKp2 != null) {
                bulletinFullScreenGamePlayAbilityKp2.oG(z);
            }
            switchIconView(z, true, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinGamePlayThemeAbility
    public final void Ms0() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        View viewFindViewById = LJJIJL().findViewById(R.id.iot);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TuxIconView tuxIconView = this.LLJJIJIL;
            if (tuxIconView != null) {
                tuxIconView.setTintColor(iIntValue);
            }
        }
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(0);
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final View dk() {
        return LJJIJL().findViewById(R.id.iot);
    }

    public final BulletinFullScreenGamePlayAbility kp() {
        return (BulletinFullScreenGamePlayAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinFullScreenGamePlayAbility.class, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.iA(this.LLJJI);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC623330Ocd
    public final EnumC619890OTb pd() {
        return this.LLJJI;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.HK2(this);
        }
        LJJIJL().findViewById(R.id.iot);
        TuxIconView tuxIconView = (TuxIconView) LJJIJL().findViewById(R.id.iok);
        this.LLJJIJIL = tuxIconView;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS144S0100000_9(this, 39));
        }
        C786410Ut5.I7(new AkS81S0100000_9(this, 11, 42), hp());
        C786410Ut5.I7(new AkS81S0100000_9(this, 12, 42), ip());
        if (!C0OSP.LIZIZ()) {
            C0DTR.LIZIZ((View) this.LLJJJJ.getValue());
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final List Gl(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC623330Ocd
    public final List eb(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinGamePlayThemeAbility
    public final void gk0(int i, String str) {
        Float fValueOf;
        Context context = getContext();
        if (context == null) {
            return;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, new ContextThemeWrapper(context, i));
        View viewFindViewById = LJJIJL().findViewById(R.id.iot);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TuxIconView tuxIconView = this.LLJJIJIL;
            if (tuxIconView != null) {
                tuxIconView.setTintColor(iIntValue);
            }
        }
        if (str != null && str.length() != 0) {
            try {
                int color = Color.parseColor(str);
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundColor(color);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[ColorDiag] TopBar.applyTheme: raw=");
                sbLIZ.append(str);
                sbLIZ.append(", parsed=");
                sbLIZ.append(C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(color)}, 1)));
                sbLIZ.append(", alpha=");
                sbLIZ.append(color >>> 24);
                sbLIZ.append(", viewAlpha=");
                if (viewFindViewById == null) {
                    fValueOf = null;
                } else {
                    fValueOf = Float.valueOf(viewFindViewById.getAlpha());
                }
                sbLIZ.append(fValueOf);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[ColorDiag] TopBar.applyTheme: parse failed for ");
                sbLIZ2.append(str);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) {
        int i;
        Integer numValueOf;
        boolean zBI;
        View viewFindViewById = LJJIJL().findViewById(R.id.iot);
        if (viewFindViewById == null) {
            return;
        }
        if (c620650OVz.LIZ()) {
            int i2 = C617890OLj.LIZ[enumC617880OLi.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C786410Ut5.LJLLLLLL(0, viewFindViewById);
                        C786410Ut5.T4(viewFindViewById, 1.0f);
                        if (!this.LLJJJJLIIL) {
                            this.LLJJJJLIIL = true;
                            BulletinFullScreenGamePlayAbility bulletinFullScreenGamePlayAbilityKp = kp();
                            if (bulletinFullScreenGamePlayAbilityKp != null) {
                                zBI = bulletinFullScreenGamePlayAbilityKp.bI();
                            } else {
                                zBI = false;
                            }
                            switchIconView(zBI, false, true);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[ColorDiag] TopBar.COMPLETE: viewAlpha=");
                        sbLIZ.append(viewFindViewById.getAlpha());
                        sbLIZ.append(", bgAlpha=");
                        Drawable background = viewFindViewById.getBackground();
                        if (background != null) {
                            numValueOf = Integer.valueOf(background.getAlpha());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ.append(numValueOf);
                        sbLIZ.append(", visibility=");
                        sbLIZ.append(viewFindViewById.getVisibility());
                        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    throw new C1954807lC();
                }
                interfaceC617820OLc.S7(viewFindViewById, 150L, 0L, false);
                return;
            }
            C786410Ut5.LJLLLLLL(4, viewFindViewById);
            C786410Ut5.T4(viewFindViewById, 0.0f);
            return;
        }
        if (!c620650OVz.LIZJ() || (i = C617890OLj.LIZ[enumC617880OLi.ordinal()]) == 1) {
            return;
        }
        if (i != 2) {
            if (i == 3) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
                C786410Ut5.T4(viewFindViewById, 1.0f);
                this.LLJJJJLIIL = false;
                return;
            }
            throw new C1954807lC();
        }
        interfaceC617820OLc.Nc(viewFindViewById, 150L, 0L, true, false);
    }

    public final void switchIconView(boolean z, boolean z2, boolean z3) {
        TuxImageModel tuxImageModelGW0;
        TuxImageModel tuxImageModelKV;
        BulletinFullScreenGamePlayAbility bulletinFullScreenGamePlayAbilityKp = kp();
        if (bulletinFullScreenGamePlayAbilityKp != null && (tuxImageModelKV = bulletinFullScreenGamePlayAbilityKp.kV()) != null) {
            C624550Oeb.LJ(hp(), tuxImageModelKV);
        }
        BulletinFullScreenGamePlayAbility bulletinFullScreenGamePlayAbilityKp2 = kp();
        if (bulletinFullScreenGamePlayAbilityKp2 != null && (tuxImageModelGW0 = bulletinFullScreenGamePlayAbilityKp2.gW0()) != null) {
            C624550Oeb.LJ(ip(), tuxImageModelGW0);
        }
        if (z2 && !z3) {
            if (z) {
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(hp(), PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
                objectAnimatorOfPropertyValuesHolder.setDuration(888L);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(new C0ORQ(0.492f));
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(ip(), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
                objectAnimatorOfPropertyValuesHolder2.setDuration(888L);
                objectAnimatorOfPropertyValuesHolder2.setInterpolator(new C0ORQ(0.492f));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
                animatorSet.addListener(new ALAdapterS6S0100000_9(this, 14));
                animatorSet.start();
                return;
            }
            ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(ip(), PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
            objectAnimatorOfPropertyValuesHolder3.setDuration(888L);
            objectAnimatorOfPropertyValuesHolder3.setInterpolator(new C0ORQ(0.492f));
            ObjectAnimator objectAnimatorOfPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(hp(), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
            objectAnimatorOfPropertyValuesHolder4.setDuration(888L);
            objectAnimatorOfPropertyValuesHolder4.setInterpolator(new C0ORQ(0.492f));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimatorOfPropertyValuesHolder3, objectAnimatorOfPropertyValuesHolder4);
            animatorSet2.addListener(new ALAdapterS6S0100000_9(this, 15));
            animatorSet2.start();
            return;
        }
        TuxIconView tuxIconViewHp = hp();
        C786410Ut5.Ob(tuxIconViewHp, 1.0f);
        C786410Ut5.pc(tuxIconViewHp, 1.0f);
        C786410Ut5.T4(tuxIconViewHp, 1.0f);
        TuxIconView tuxIconViewIp = ip();
        C786410Ut5.Ob(tuxIconViewIp, 1.0f);
        C786410Ut5.pc(tuxIconViewIp, 1.0f);
        C786410Ut5.T4(tuxIconViewIp, 1.0f);
        if (z) {
            C12ES.LJIILL(0, ip());
            C0DTR.LIZIZ(hp());
        } else {
            C0DTR.LIZIZ(ip());
            C12ES.LJIILL(0, hp());
        }
    }
}
