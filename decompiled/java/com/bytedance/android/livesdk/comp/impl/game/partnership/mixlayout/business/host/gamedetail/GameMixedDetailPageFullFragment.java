package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail;

import X.C0KYM;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1881590z41;
import X.C1884580z8q;
import X.C1884670z8z;
import X.C1902150zbB;
import X.C1908530zlT;
import X.C197039127h;
import X.C19EG;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1884610z8t;
import X.InterfaceC1886280zBa;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.base.view.MixPageInnerDialog;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameMixedDetailPageFullFragment;
import com.bytedance.android.livesdk.game.model.GameDetailHeaderCTA;
import com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class GameMixedDetailPageFullFragment extends GameDetailMixPageBaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITViJCYrJCHELIOSQ1JjonZic5OiY9LTY/Zyc8OzFiLi4+LSEpPS46JGsLKCI2BSw0LCsXLTEtICMDKSIpDzo/JAM+KCg+LSs4";
    public String LLLFZ = "";
    public GameDetailHeaderInfo LLLI;
    public C1908530zlT LLLII;
    public C1902150zbB LLLIIII;
    public C1884580z8q LLLIIIIL;
    public boolean LLLIIIL;

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final int PR() {
        return R.layout.gnb;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final boolean RR() {
        View view = this.LLJJJIL;
        return view == null || view.getAlpha() < 0.1f;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final void ZR() {
        GameDetailHeaderInfo gameDetailHeaderInfo;
        C1881590z41 c1881590z41 = this.LLJZIJLIL;
        if ((c1881590z41 != null && (gameDetailHeaderInfo = c1881590z41.LLJJI) != null) || (gameDetailHeaderInfo = this.LLLI) != null) {
            String strLIZ = C1884670z8z.LIZ(gameDetailHeaderInfo);
            if (strLIZ == null) {
                strLIZ = this.LLLFZ;
            }
            this.LLLFZ = strLIZ;
            C1908530zlT c1908530zlT = this.LLLII;
            if (c1908530zlT != null) {
                c1908530zlT.C0(gameDetailHeaderInfo, strLIZ, this.LLJZIJLIL);
            }
            C1902150zbB c1902150zbB = this.LLLIIII;
            if (c1902150zbB != null) {
                c1902150zbB.setGameHeaderView(this.LLLII);
            }
        }
        super.ZR();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment, com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C19EG activity;
        C0KYM c0kymLJJI;
        C1902150zbB c1902150zbB;
        C1884580z8q c1884580z8q = this.LLLIIIIL;
        if (c1884580z8q != null && (c1902150zbB = this.LLLIIII) != null) {
            c1902150zbB.LJII(c1884580z8q);
        }
        super.onDestroyView();
        C1881590z41 c1881590z41 = this.LLJZIJLIL;
        if (!Intrinsics.LJFF((c1881590z41 == null || (c0kymLJJI = c1881590z41.LJJI()) == null) ? null : c0kymLJJI.LIZIZ("from_out"), "1") || (activity = getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final void NR(View view) {
        GameDetailHeaderInfo gameDetailHeaderInfo;
        super.NR(view);
        this.LLLII = (C1908530zlT) view.findViewById(R.id.iqb);
        C1902150zbB c1902150zbB = (C1902150zbB) view.findViewById(R.id.iqd);
        this.LLLIIII = c1902150zbB;
        if (c1902150zbB != null) {
            c1902150zbB.setScrollEnabled(false);
        }
        C1908530zlT c1908530zlT = this.LLLII;
        if (c1908530zlT != null) {
            C1881590z41 c1881590z41 = this.LLJZIJLIL;
            if (c1881590z41 == null || (gameDetailHeaderInfo = c1881590z41.LLJJI) == null) {
                gameDetailHeaderInfo = this.LLLI;
            }
            c1908530zlT.C0(gameDetailHeaderInfo, this.LLLFZ, c1881590z41);
        }
        C1902150zbB c1902150zbB2 = this.LLLIIII;
        if (c1902150zbB2 != null) {
            c1902150zbB2.setGameHeaderView(this.LLLII);
        }
        C1908530zlT c1908530zlT2 = this.LLLII;
        if (c1908530zlT2 != null) {
            c1908530zlT2.setOnClickListener(new InterfaceC1886280zBa() { // from class: X.0z8p
                @Override // X.InterfaceC1886280zBa
                public final void LIZ() {
                    GameDetailHeaderInfo gameDetailHeaderInfo2;
                    GameDetailHeaderCTA gameDetailHeaderCTA;
                    String str;
                    IHostAction iHostAction;
                    GameMixedDetailPageFullFragment gameMixedDetailPageFullFragment = this.LIZ;
                    C1881590z41 c1881590z412 = gameMixedDetailPageFullFragment.LLJZIJLIL;
                    if (((c1881590z412 == null || (gameDetailHeaderInfo2 = c1881590z412.LLJJI) == null) && (gameDetailHeaderInfo2 = gameMixedDetailPageFullFragment.LLLI) == null) || (gameDetailHeaderCTA = gameDetailHeaderInfo2.gameDetailHeaderCta) == null || (str = gameDetailHeaderCTA.jumpLink) == null || (iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class)) == null) {
                        return;
                    }
                    iHostAction.handleSchema(gameMixedDetailPageFullFragment.getContext(), str, new Bundle());
                }
            });
        }
        LiveIconView liveIconView = this.LLJLIL;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0z8r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.dismissAllowingStateLoss();
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final void VR(boolean z) {
        super.VR(z);
        C1902150zbB c1902150zbB = this.LLLIIII;
        if (c1902150zbB != null) {
            c1902150zbB.setScrollEnabled(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0z8q] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0z8q] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment
    public final void iS(boolean z) {
        Integer numLIZJ;
        int iIntValue;
        Integer numLIZJ2;
        int i;
        MutableLiveData<Boolean> mutableLiveData;
        String str = this.LLLFZ;
        int iIntValue2 = 0;
        if (Intrinsics.LJFF(str, "interactive_full_screen")) {
            FrameLayout frameLayout = this.LLJL;
            if (frameLayout != null) {
                frameLayout.setBackground(C497740JfY.LJIIJ(R.drawable.f0u));
            }
            View view = this.LLJJJJLIIL;
            if (view != null) {
                C1881590z41 c1881590z41 = this.LLJZIJLIL;
                if (c1881590z41 != null && (mutableLiveData = c1881590z41.LLJLL) != null && mutableLiveData.getValue() != null) {
                    i = 0;
                } else {
                    i = 4;
                }
                C786410Ut5.LJLLLLLL(i, view);
            }
            cS(0.0f);
            gS();
            kS(false);
            C1902150zbB c1902150zbB = this.LLLIIII;
            if (c1902150zbB != 0) {
                ?? r0 = new InterfaceC1884610z8t() { // from class: X.0z8q
                    @Override // X.InterfaceC1884610z8t
                    public final void LIZ(int i2, int i3) {
                        float f = (i2 * 1.0f) / i3;
                        this.LIZ.cS(f);
                        this.LIZ.gS();
                        if (f >= 0.9f) {
                            GameMixedDetailPageFullFragment gameMixedDetailPageFullFragment = this.LIZ;
                            if (!gameMixedDetailPageFullFragment.LLLIIIL) {
                                gameMixedDetailPageFullFragment.kS(true);
                                this.LIZ.LLLIIIL = true;
                                return;
                            }
                        }
                        if (f >= 0.9f) {
                            return;
                        }
                        GameMixedDetailPageFullFragment gameMixedDetailPageFullFragment2 = this.LIZ;
                        if (!gameMixedDetailPageFullFragment2.LLLIIIL) {
                            return;
                        }
                        gameMixedDetailPageFullFragment2.kS(false);
                        this.LIZ.LLLIIIL = false;
                    }
                };
                this.LLLIIIIL = r0;
                c1902150zbB.LJ(r0);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, "immersive_full_screen")) {
            FrameLayout frameLayout2 = this.LLJL;
            if (frameLayout2 != null) {
                Context context = getContext();
                if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.c63, context)) != null) {
                    iIntValue = numLIZJ2.intValue();
                } else {
                    iIntValue = 0;
                }
                frameLayout2.setBackgroundColor(iIntValue);
            }
            View view2 = this.LLJJJJLIIL;
            if (view2 != null) {
                C500260Jjc.LJIILLIIL(view2);
            }
            cS(0.0f);
            gS();
            kS(false);
            C1902150zbB c1902150zbB2 = this.LLLIIII;
            if (c1902150zbB2 == 0) {
                return;
            }
            ?? r02 = new InterfaceC1884610z8t() { // from class: X.0z8q
                @Override // X.InterfaceC1884610z8t
                public final void LIZ(int i2, int i3) {
                    float f = (i2 * 1.0f) / i3;
                    this.LIZ.cS(f);
                    this.LIZ.gS();
                    if (f >= 0.9f) {
                        GameMixedDetailPageFullFragment gameMixedDetailPageFullFragment = this.LIZ;
                        if (!gameMixedDetailPageFullFragment.LLLIIIL) {
                            gameMixedDetailPageFullFragment.kS(true);
                            this.LIZ.LLLIIIL = true;
                            return;
                        }
                    }
                    if (f >= 0.9f) {
                        return;
                    }
                    GameMixedDetailPageFullFragment gameMixedDetailPageFullFragment2 = this.LIZ;
                    if (!gameMixedDetailPageFullFragment2.LLLIIIL) {
                        return;
                    }
                    gameMixedDetailPageFullFragment2.kS(false);
                    this.LIZ.LLLIIIL = false;
                }
            };
            this.LLLIIIIL = r02;
            c1902150zbB2.LJ(r02);
            return;
        }
        FrameLayout frameLayout3 = this.LLJL;
        if (frameLayout3 != null) {
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c63, context2)) != null) {
                iIntValue2 = numLIZJ.intValue();
            }
            frameLayout3.setBackgroundColor(iIntValue2);
        }
        C197039127h c197039127h = this.LLJJJJ;
        if (c197039127h != null) {
            C500260Jjc.LJIILLIIL(c197039127h);
        }
        View view3 = this.LLJJJJLIIL;
        if (view3 != null) {
            C500260Jjc.LJIILLIIL(view3);
        }
        cS(1.0f);
        gS();
        kS(true);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        MixPageInnerDialog mixPageInnerDialog = new MixPageInnerDialog(getContext(), getTheme());
        mixPageInnerDialog.LLJILJILJ = this;
        Window window = mixPageInnerDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(mixPageInnerDialog);
        return mixPageInnerDialog;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment, com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            super.onViewCreated(r6, r7)
            r0 = 0
            com.bytedance.tux.system.TuxImmersionBar r1 = X.C1766560w4U.LIZJ(r5, r0)
            com.bytedance.immersionbar.ImmersionBar r0 = r1.LIZIZ
            r0.LJIIL()
            r1.LIZLLL()
            java.lang.String r1 = r5.LLLFZ
            java.lang.String r0 = "interactive_full_screen"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.String r3 = "immersive_full_screen"
            if (r0 == 0) goto L7f
            X.0z41 r0 = r5.LLJZIJLIL
            r4 = 0
            if (r0 == 0) goto L5b
            X.0KYM r1 = r0.LJJI()
            if (r1 == 0) goto L5b
            java.lang.String r0 = "header_info"
            java.lang.String r2 = r1.LIZIZ(r0)
            if (r2 == 0) goto L5b
            int r0 = r2.length()
            if (r0 == 0) goto L5b
            if (r2 == 0) goto L38
            goto L3a
        L38:
            r0 = r4
            goto L51
        L3a:
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L38
            com.google.gson.Gson r1 = X.C293501Bt.LIZ()     // Catch: java.lang.Throwable -> L5e
            X.0z4T r0 = new X.0z4T     // Catch: java.lang.Throwable -> L5e
            r0.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.reflect.Type r0 = r0.getType()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r1.LJIIIIZZ(r2, r0)     // Catch: java.lang.Throwable -> L5e
        L51:
            com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo r0 = (com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo) r0     // Catch: java.lang.Throwable -> L5e
            r5.LLLI = r0     // Catch: java.lang.Throwable -> L5e
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L5e
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L5e
            goto L6a
        L5b:
            r5.LLLFZ = r3
            goto L7f
        L5e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L6a:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r2 == 0) goto L79
            r5.LLLI = r4
            java.lang.String r1 = "GameMixedDetailPageFullFragment"
            java.lang.String r0 = "parse header info error"
            X.C20441214yg.LJFF(r1, r0, r2)
        L79:
            com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo r0 = r5.LLLI
            if (r0 != 0) goto L7f
            r5.LLLFZ = r3
        L7f:
            java.lang.String r0 = r5.LLLFZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto La4
            com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo r2 = new com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo
            r2.<init>()
            X.0z41 r0 = r5.LLJZIJLIL
            if (r0 == 0) goto L9e
            X.0KYM r1 = r0.LJJI()
            if (r1 == 0) goto L9e
            java.lang.String r0 = "header_image_url"
            java.lang.String r0 = r1.LIZIZ(r0)
            if (r0 != 0) goto La0
        L9e:
            java.lang.String r0 = ""
        La0:
            r2.headerImageUrl = r0
            r5.LLLI = r2
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameMixedDetailPageFullFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
