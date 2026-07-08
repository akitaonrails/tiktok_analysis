package com.ss.android.ugc.aweme.inbox.bulletin.assem.input;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0DTR;
import X.C0OM6;
import X.C0ONE;
import X.C0ORQ;
import X.C0OSD;
import X.C0OSP;
import X.C0OWL;
import X.C10UZ;
import X.C1220000hqw;
import X.C12ES;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1361400lX0;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1618770sE7;
import X.C1766560w4U;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C426710GoH;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C624550Oeb;
import X.C639010P4p;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1331910klR;
import X.InterfaceC1554640qYg;
import X.InterfaceC469401sC;
import X.InterfaceC494301wD;
import Y.ALAdapterS6S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.input.BulletinEditEventGamePlayAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditEventGamePlayAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputEmojiAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditPreviewAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBubbleStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemEditPageConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinTextStruct;
import com.ss.android.ugc.aweme.notification.api.EventExtra;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import irm.AkS81S0100000_9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEditEventGamePlayAssem extends UIContentAssem implements BulletinEditEventGamePlayAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0OWL.class, "bulletin_board_edit_param"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public final C736950SvV LLJI;
    public final C01GW LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public BulletinItemEditPageConfig LLJJIII;
    public boolean LLJJIJI;
    public InterfaceC469401sC LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final C639010P4p LLJJJIL;

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
        if (str.hashCode() != -1947376122) {
            return null;
        }
        return this;
    }

    public final void Go() {
        BulletinBubbleStruct bulletinBubbleStruct;
        String str;
        if (this.LLJJIJI) {
            So(!Ho().LLIZLLLIL, true, false);
            String str2 = Ho().LLIZ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            BulletinItemEditPageConfig bulletinItemEditPageConfig = this.LLJJIII;
            if (bulletinItemEditPageConfig != null && (bulletinBubbleStruct = bulletinItemEditPageConfig.bubbleStruct) != null && (str = bulletinBubbleStruct.id) != null) {
                str3 = str;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EventExtra("bubble_id", str3));
            arrayList.add(new EventExtra("activity_id", str2));
            Oo().VQ2(C0OM6.ACTIVITY_SKIN_BUBBLE, C0ONE.CLICK, arrayList);
            Oo().LLJJJJ = true;
        }
    }

    public final BulletinEditViewModel Ho() {
        return (BulletinEditViewModel) this.LLJI.getValue();
    }

    public final TuxIconView Jo() {
        return (TuxIconView) this.LLJILJILJ.getValue();
    }

    public final TuxIconView Lo() {
        return (TuxIconView) this.LLJILLL.getValue();
    }

    public final C426710GoH No() {
        return (C426710GoH) this.LLJIJIL.getValue();
    }

    public final BulletinProfileViewModel Oo() {
        return (BulletinProfileViewModel) this.LLJ.getValue();
    }

    public BulletinEditEventGamePlayAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 382);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinProfileViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(221);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((AbstractC738140SxQ) this, 383);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJ = new C736950SvV(c19719912DlLIZ, awS553S0100000_9, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, awS553S0100000_92, c451610HnL, c723700Sa8);
        AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9(this, 376);
        this.LLJI = new C736950SvV(C13LE.LIZ(BulletinEditViewModel.class), awS553S0100000_93, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(222), new AwS553S0100000_9((AbstractC738140SxQ) this, 384), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 379));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 377));
        this.LLJILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 378));
        this.LLJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 381));
        this.LLJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 380));
        this.LLJJIJI = true;
        this.LLJJJ = true;
        this.LLJJJIL = new C639010P4p(this, 0);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC469401sC interfaceC469401sC = this.LLJJIJIIJIL;
        if (interfaceC469401sC != null) {
            interfaceC469401sC.cancel();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void Zo(int i) {
        String str;
        C1361400lX0 c1361400lX0 = new C1361400lX0(getContext(), i);
        ((TuxNavBar) this.LLJJ.getValue()).LJIJ(i);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJJ.getValue();
        if (tuxNavBar != null) {
            tuxNavBar.setNavBackground(C1618770sE7.LIZ(R.attr.uk));
        }
        C197039127h c197039127h = (C197039127h) this.LLJJI.getValue();
        if (c197039127h != null) {
            c197039127h.LJJJJL(new AwS588S0100000_9(c1361400lX0, 140));
        }
        BulletinEditInputEmojiAbility bulletinEditInputEmojiAbility = (BulletinEditInputEmojiAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinEditInputEmojiAbility.class, null);
        if (bulletinEditInputEmojiAbility != null) {
            bulletinEditInputEmojiAbility.cY0(i);
        }
        BulletinEditPreviewAbility bulletinEditPreviewAbility = (BulletinEditPreviewAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinEditPreviewAbility.class, null);
        if (bulletinEditPreviewAbility != null) {
            bulletinEditPreviewAbility.UJ1(i);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            boolean z = true;
            if (Ho().LLIZLLLIL) {
                BulletinItemEditPageConfig bulletinItemEditPageConfig = this.LLJJIII;
                if (bulletinItemEditPageConfig == null || (str = bulletinItemEditPageConfig.statusBarColor) == null) {
                    str = "";
                }
                TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(fragmentLJI);
                if (str.length() > 0) {
                    tuxImmersionBarLIZLLL.LJIIIZ(ColorProtector.parseColor(str));
                } else {
                    tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.zm);
                }
                tuxImmersionBarLIZLLL.LIZ(false);
                if (R.style.y3 != i) {
                    z = false;
                }
                tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(z);
                tuxImmersionBarLIZLLL.LIZLLL();
                return;
            }
            TuxImmersionBar tuxImmersionBarLIZLLL2 = C1766560w4U.LIZLLL(fragmentLJI);
            tuxImmersionBarLIZLLL2.LJIIIIZZ(R.attr.zm);
            tuxImmersionBarLIZLLL2.LIZ(true);
            tuxImmersionBarLIZLLL2.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditEventGamePlayAbility
    public final void fD(boolean z) {
        if (!this.LLJJIJIL && this.LLJJJ && z != Ho().LLIZLLLIL) {
            So(z, false, false);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (!C0OSP.LIZIZ()) {
            return;
        }
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0OSL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJJJJJIL;
            }
        }, null, new AwS623S0100000_9(this, 176), 6);
        C786410Ut5.I7(new AkS81S0100000_9(this, 2, 42), Jo());
        C786410Ut5.I7(new AkS81S0100000_9(this, 3, 42), Lo());
    }

    public final void So(boolean z, final boolean z2, final boolean z3) {
        final BulletinItemEditPageConfig bulletinItemEditPageConfig = this.LLJJIII;
        if (bulletinItemEditPageConfig == null) {
            return;
        }
        if (z2) {
            this.LLJJIJIL = true;
        }
        InterfaceC469401sC interfaceC469401sCLJJIIJZLJL = null;
        if (z) {
            if (bulletinItemEditPageConfig.backgroundUrl == null) {
                return;
            }
            this.LLJJIJI = false;
            this.LLJJJ = false;
            InterfaceC469401sC interfaceC469401sC = this.LLJJIJIIJIL;
            if (interfaceC469401sC != null) {
                interfaceC469401sC.cancel();
            }
            this.LLJJIJIIJIL = null;
            TuxImageModel tuxImageModel = bulletinItemEditPageConfig.backgroundUrl;
            if (tuxImageModel != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C0OSD.LIZIZ(No().getContext(), tuxImageModel));
                c1331670kl3LJIIIIZZ.LJJIJL(No().getContext());
                c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                interfaceC469401sCLJJIIJZLJL = c1331670kl3LJIIIIZZ.LJJIIJZLJL(new InterfaceC1331910klR() { // from class: X.0OVO
                    @Override // X.InterfaceC1331910klR
                    public final void onProgress(float f) {
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onCanceled() {
                        this.LL.So(false, true, false);
                        C0OPX.LJIIIIZZ("event game play bitmap load cancel");
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        BulletinEditInputAbility bulletinEditInputAbility;
                        BulletinEditInputAbility bulletinEditInputAbility2;
                        BulletinEditInputAbility bulletinEditInputAbility3;
                        try {
                            BulletinEditEventGamePlayAssem bulletinEditEventGamePlayAssem = this.LL;
                            bulletinEditEventGamePlayAssem.LLJJIJI = true;
                            bulletinEditEventGamePlayAssem.LLJJJ = true;
                            bulletinEditEventGamePlayAssem.Ho().LLIZLLLIL = true;
                            Integer num = bulletinItemEditPageConfig.frontStyle;
                            int value = EnumC621190OYb.BULLETIN_FRONT_STYLE_DARK.getValue();
                            if (num != null && num.intValue() == value) {
                                this.LL.Zo(R.style.y0);
                            } else {
                                this.LL.Zo(R.style.y3);
                            }
                            BulletinTextStruct bulletinTextStruct = bulletinItemEditPageConfig.textStruct;
                            if (bulletinTextStruct != null && (bulletinEditInputAbility3 = (BulletinEditInputAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), BulletinEditInputAbility.class, null)) != null) {
                                bulletinEditInputAbility3.RN2(bulletinTextStruct);
                            }
                            BulletinTextStruct bulletinTextStruct2 = bulletinItemEditPageConfig.guideTextStruct;
                            if (bulletinTextStruct2 != null && (bulletinEditInputAbility2 = (BulletinEditInputAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), BulletinEditInputAbility.class, null)) != null) {
                                bulletinEditInputAbility2.qv1(bulletinTextStruct2);
                            }
                            String str = bulletinItemEditPageConfig.cursorColor;
                            if (str != null && (bulletinEditInputAbility = (BulletinEditInputAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), BulletinEditInputAbility.class, null)) != null) {
                                bulletinEditInputAbility.a10(str);
                            }
                            this.LL.switchIconView(true, z2, z3);
                            if (this.LL.Ho().LLIZLLLIL && bitmap != null) {
                                BulletinEditEventGamePlayAssem bulletinEditEventGamePlayAssem2 = this.LL;
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(bulletinEditEventGamePlayAssem2.No().getContext().getResources(), bitmap);
                                bulletinEditEventGamePlayAssem2.No().setFixedDrawable(bitmapDrawable);
                                bulletinEditEventGamePlayAssem2.No().setImageDrawable(bitmapDrawable);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LL.So(false, true, false);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("event game play bitmap load failed");
                            sbLIZ.append(e.getMessage());
                            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        String message;
                        this.LL.So(false, true, false);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("event game play bitmap load failed");
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ.append(message);
                        C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                });
            }
            this.LLJJIJIIJIL = interfaceC469401sCLJJIIJZLJL;
            return;
        }
        this.LLJJIJI = true;
        this.LLJJJ = true;
        Ho().LLIZLLLIL = false;
        if (C10UZ.LIZLLL(LJJIJL().getContext())) {
            Zo(R.style.y0);
        } else {
            Zo(R.style.y3);
        }
        switchIconView(false, z2, z3);
        BulletinEditInputAbility bulletinEditInputAbility = (BulletinEditInputAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinEditInputAbility.class, null);
        if (bulletinEditInputAbility != null) {
            bulletinEditInputAbility.nL();
        }
        BulletinEditInputAbility bulletinEditInputAbility2 = (BulletinEditInputAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinEditInputAbility.class, null);
        if (bulletinEditInputAbility2 != null) {
            bulletinEditInputAbility2.O72();
        }
        BulletinEditInputAbility bulletinEditInputAbility3 = (BulletinEditInputAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinEditInputAbility.class, null);
        if (bulletinEditInputAbility3 != null) {
            bulletinEditInputAbility3.o91();
        }
        No().setFixedDrawable(null);
        No().setImageDrawable(null);
    }

    public final void switchIconView(boolean z, boolean z2, boolean z3) {
        TuxImageModel tuxImageModel;
        ImageUrlModel imageUrlModelLIZIZ;
        TuxImageModel tuxImageModel2;
        if (z2 && !z3) {
            if (z) {
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(Jo(), PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
                objectAnimatorOfPropertyValuesHolder.setDuration(888L);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(new C0ORQ(0.492f));
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(Lo(), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
                objectAnimatorOfPropertyValuesHolder2.setDuration(888L);
                objectAnimatorOfPropertyValuesHolder2.setInterpolator(new C0ORQ(0.492f));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
                animatorSet.addListener(new ALAdapterS6S0100000_9(this, 11));
                animatorSet.start();
                return;
            }
            ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(Lo(), PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
            objectAnimatorOfPropertyValuesHolder3.setDuration(888L);
            objectAnimatorOfPropertyValuesHolder3.setInterpolator(new C0ORQ(0.492f));
            ObjectAnimator objectAnimatorOfPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(Jo(), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
            objectAnimatorOfPropertyValuesHolder4.setDuration(888L);
            objectAnimatorOfPropertyValuesHolder4.setInterpolator(new C0ORQ(0.492f));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimatorOfPropertyValuesHolder3, objectAnimatorOfPropertyValuesHolder4);
            animatorSet2.addListener(new ALAdapterS6S0100000_9(this, 12));
            animatorSet2.start();
            return;
        }
        TuxImageModel tuxImageModel3 = null;
        if (z) {
            C12ES.LJIILL(0, Lo());
            C0DTR.LIZIZ(Jo());
            TuxIconView tuxIconViewJo = Jo();
            BulletinItemEditPageConfig bulletinItemEditPageConfig = this.LLJJIII;
            if (bulletinItemEditPageConfig != null) {
                tuxImageModel2 = bulletinItemEditPageConfig.activeIconUrl;
            } else {
                tuxImageModel2 = null;
            }
            C624550Oeb.LJ(tuxIconViewJo, tuxImageModel2);
            TuxIconView tuxIconViewLo = Lo();
            BulletinItemEditPageConfig bulletinItemEditPageConfig2 = this.LLJJIII;
            if (bulletinItemEditPageConfig2 != null) {
                tuxImageModel3 = bulletinItemEditPageConfig2.inactiveIconUrl;
            }
            C624550Oeb.LJ(tuxIconViewLo, tuxImageModel3);
            return;
        }
        C0DTR.LIZIZ(Lo());
        C12ES.LJIILL(0, Jo());
        TuxIconView tuxIconViewJo2 = Jo();
        BulletinItemEditPageConfig bulletinItemEditPageConfig3 = this.LLJJIII;
        if (bulletinItemEditPageConfig3 != null) {
            tuxImageModel = bulletinItemEditPageConfig3.activeIconUrl;
        } else {
            tuxImageModel = null;
        }
        C639010P4p c639010P4p = this.LLJJJIL;
        if (tuxIconViewJo2 != null) {
            if (tuxImageModel != null) {
                imageUrlModelLIZIZ = C0OSD.LIZIZ(tuxIconViewJo2.getContext(), tuxImageModel);
            } else {
                imageUrlModelLIZIZ = null;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZIZ);
            c1331670kl3LJIIIIZZ.LJJI(tuxIconViewJo2);
            c1331670kl3LJIIIIZZ.LJIIJ(c639010P4p);
        }
        TuxIconView tuxIconViewLo2 = Lo();
        BulletinItemEditPageConfig bulletinItemEditPageConfig4 = this.LLJJIII;
        if (bulletinItemEditPageConfig4 != null) {
            tuxImageModel3 = bulletinItemEditPageConfig4.inactiveIconUrl;
        }
        C624550Oeb.LJ(tuxIconViewLo2, tuxImageModel3);
    }
}
