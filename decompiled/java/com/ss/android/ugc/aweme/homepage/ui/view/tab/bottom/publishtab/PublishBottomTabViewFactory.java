package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab;

import X.AbstractC1320710kTN;
import X.AbstractC1335900krs;
import X.C07MK;
import X.C0C64;
import X.C0F8J;
import X.C0P0T;
import X.C0SPE;
import X.C0VSJ;
import X.C1239204t4;
import X.C1320810kTX;
import X.C1322200kVm;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1388190mED;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1584460rKm;
import X.C1585030rLh;
import X.C1591080rVS;
import X.C1592050rX1;
import X.C1592950rYT;
import X.C1593020rYa;
import X.C1593500rZM;
import X.C1593700rZg;
import X.C19EG;
import X.C2188811AlT;
import X.C2274271E0b;
import X.C285090BFj;
import X.C418440Gaw;
import X.C422830Gi1;
import X.C487280J9a;
import X.C786410Ut5;
import X.C799900VZk;
import X.C814420VxA;
import X.C823050WQl;
import X.EnumC1338240kve;
import X.InterfaceC1320850kTb;
import X.InterfaceC1583080rIY;
import X.InterfaceC1592060rX2;
import X.InterfaceC487330J9f;
import Y.ARunnableS124S0100000_24;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.guide.publish.IProGuidePublishService;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class PublishBottomTabViewFactory extends C1584460rKm implements InterfaceC1592060rX2, PublishTabAbility, InterfaceC487330J9f {
    public C1592950rYT LLILLJJLI;
    public C1593700rZg LLILLL;
    public boolean LLILZ;
    public C1593500rZM LLILZIL;
    public C0P0T LLILZLL;

    @Override // X.InterfaceC1592060rX2
    public final void r(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility
    public final void Bn0() {
        C0P0T c0p0t = this.LLILZLL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility
    public final boolean D80() {
        C1593700rZg c1593700rZg = this.LLILLL;
        return c1593700rZg != null && c1593700rZg.LIZLLL();
    }

    @Override // X.InterfaceC1592060rX2
    public final void Hb() {
        final C1593700rZg c1593700rZg = this.LLILLL;
        if (c1593700rZg != null) {
            C1591080rVS c1591080rVS = C1591080rVS.LIZIZ;
            c1593700rZg.LJIIIZ = c1591080rVS.LJIL();
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "plus_button_add_text", true) > 0) {
                c1593700rZg.LJIIIIZZ = c1591080rVS.LJJ();
            }
            View view = c1593700rZg.LJIIIZ;
            if (view != null) {
                HandlerHook.viewPost(view, new Runnable() { // from class: X.0TAS
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SuperEntranceTab@35b0.onTabBarViewBuild$1");
                        try {
                            View view2 = c1593700rZg.LJIIIZ;
                            if (view2 != null) {
                                view2.setPivotX(view2.getMeasuredWidth() / 2.0f);
                                view2.setPivotY(view2.getMeasuredHeight() / 2.0f);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SuperEntranceTab@35b0.onTabBarViewBuild$1");
                    }
                });
            }
        }
        this.LLILZ = true;
        C1593500rZM c1593500rZM = this.LLILZIL;
        if (c1593500rZM != null) {
            LIZIZ(c1593500rZM.LIZ, c1593500rZM.LIZJ, c1593500rZM.LIZIZ, c1593500rZM.LIZLLL);
            this.LLILZIL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility
    public final void mW() {
        C1591080rVS.LIZIZ.LJJJLIIL();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility
    public final void oh0() {
        C1591080rVS.LIZIZ.LJJIJIIJI();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility
    public final String getResourceType() {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService().getResourceType();
    }

    @C14EU
    public final void onScrollToProfileEvent(C0SPE c0spe) {
        if (c0spe == null) {
            return;
        }
        Bn0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f7  */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuperEntranceEvent(com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent r15) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishBottomTabViewFactory.onSuperEntranceEvent(com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent):void");
    }

    @Override // X.C1584460rKm
    public final View LIZ(InterfaceC1583080rIY interfaceC1583080rIY, C1593020rYa c1593020rYa) {
        C1593700rZg c1593700rZg;
        C1592950rYT c1592950rYT = (C1592950rYT) super.LIZ(interfaceC1583080rIY, c1593020rYa);
        this.LLILLJJLI = c1592950rYT;
        Context context = c1593020rYa.LIZ;
        C1592950rYT c1592950rYT2 = null;
        if (C1585030rLh.LJIIL()) {
            c1593700rZg = null;
        } else if (((Boolean) C285090BFj.LIZLLL.getValue()).booleanValue()) {
            C799900VZk c799900VZk = C799900VZk.LIZ;
            X2CFragmentMainPageIcon x2CFragmentMainPageIcon = new X2CFragmentMainPageIcon();
            c799900VZk.getClass();
            X2CFragmentMainPageIcon x2CFragmentMainPageIcon2 = (X2CFragmentMainPageIcon) C799900VZk.LIZLLL(x2CFragmentMainPageIcon);
            c1593700rZg = x2CFragmentMainPageIcon2.LLILLJJLI;
            if (c1593700rZg == null) {
                C1592950rYT c1592950rYT3 = this.LLILLJJLI;
                if (c1592950rYT3 == null) {
                    c1592950rYT3 = null;
                }
                c1593700rZg = new C1593700rZg(context, c1592950rYT3);
            } else {
                x2CFragmentMainPageIcon2.LLILLJJLI = null;
            }
        } else {
            C1592950rYT c1592950rYT4 = this.LLILLJJLI;
            if (c1592950rYT4 == null) {
                c1592950rYT4 = null;
            }
            c1593700rZg = new C1593700rZg(context, c1592950rYT4);
        }
        this.LLILLL = c1593700rZg;
        if (!C1585030rLh.LJIIL()) {
            final C1592950rYT c1592950rYT5 = this.LLILLJJLI;
            if (c1592950rYT5 == null) {
                c1592950rYT5 = null;
            }
            new Object(c1592950rYT5) { // from class: X.0GpZ
                public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
                public final ViewGroup LIZ;

                static {
                    C0GY9.LIZIZ(0.36f, 0.0f, 0.66f, -0.56f);
                    C0GY9.LIZIZ(0.4f, 1.25f, 0.26f, 1.0f);
                }

                {
                    this.LIZ = c1592950rYT5;
                    SmartImageView smartImageView = new SmartImageView(c1592950rYT5.getContext());
                    smartImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    C786410Ut5.fc(smartImageView, 0.0f);
                    C786410Ut5.Bc(smartImageView, 0.0f);
                    int i = LIZIZ;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
                    layoutParams.gravity = 17;
                    C786410Ut5.G6(smartImageView, layoutParams);
                    C786410Ut5.Q8(smartImageView, new View.OnClickListener() { // from class: X.0Gpa
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            getClass();
                        }
                    });
                    smartImageView.setClickable(false);
                    c1592950rYT5.addView(smartImageView);
                }
            };
        }
        final C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            C1592950rYT c1592950rYT6 = this.LLILLJJLI;
            if (c1592950rYT6 == null) {
                c1592950rYT6 = null;
            }
            if (c1592950rYT6.isAttachedToWindow() && !C1585030rLh.LJIIL()) {
                C1558520qew.LJII(C1558360qeg.LJI(c19egLIZIZ, null), this, PublishTabAbility.class, null, null);
            }
            C1592950rYT c1592950rYT7 = this.LLILLJJLI;
            if (c1592950rYT7 != null) {
                c1592950rYT2 = c1592950rYT7;
            }
            c1592950rYT2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0rZK
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    EventBus.LIZLLL().LJIJJ(this.LL);
                    if (C1585030rLh.LJIIL()) {
                        return;
                    }
                    C1558520qew.LJII(C1558360qeg.LJI(c19egLIZIZ, null), this.LL, PublishTabAbility.class, null, null);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                    EventBus.LIZLLL().LJJI(this.LL);
                    if (C1585030rLh.LJIIL()) {
                        return;
                    }
                    C1592050rX1.LIZIZ(this.LL);
                    C1593700rZg c1593700rZg2 = this.LL.LLILLL;
                    if (c1593700rZg2 != null) {
                        AnimatorSet animatorSet = c1593700rZg2.LJII;
                        if (animatorSet != null) {
                            animatorSet.removeAllListeners();
                        }
                        AnimatorSet animatorSet2 = c1593700rZg2.LJII;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                        }
                        c1593700rZg2.LJII = null;
                        c1593700rZg2.LJI();
                    }
                    C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZIZ, null), PublishTabAbility.class, null);
                }
            });
            if (!C1585030rLh.LJIIL()) {
                if (((Boolean) C2274271E0b.LJ.getValue()).booleanValue()) {
                    C823050WQl.LIZJ().execute(new ARunnableS124S0100000_24(this, 96));
                } else if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService().isNeedShowSpecialPlusDirect()) {
                    C07MK.LIZ.getClass();
                    C1239204t4.LIZ(new ARunnableS124S0100000_24(this, 97), "nuj_premain", false);
                }
            }
            ((ArrayList) C1592050rX1.LIZ).add(new WeakReference(this));
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ2 != null) {
                C487280J9a.LIZ(c19egLIZIZ2.hashCode(), this);
            }
            return c1592950rYT;
        }
        "activity is null".toString();
        throw new IllegalArgumentException("activity is null");
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C0P0T c0p0t = this.LLILZLL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public final void LIZIZ(int i, String str, boolean z, boolean z2) {
        InterfaceC1320850kTb controller;
        if (!this.LLILZ) {
            this.LLILZIL = new C1593500rZM(i, z, str, z2);
            return;
        }
        C1593700rZg c1593700rZg = this.LLILLL;
        int i2 = 2;
        if (c1593700rZg != null) {
            C0F8J.LIZ("showTabSuperEntrance", "showTabSuperEntrance");
            int i3 = c1593700rZg.LJ;
            if (i3 != 1 && i3 != 2) {
                c1593700rZg.LJFF = i;
                if (i != 1) {
                    if (i != 3) {
                        if (i == 5) {
                            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
                            EnumC1338240kve enumC1338240kve = EnumC1338240kve.CENTER;
                            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(new ImageUrlModel("", Collections.singletonList(str)));
                            c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(302));
                            c1331670kl3LJIIIIZZ.LJJI(c1593700rZg.LIZLLL);
                            c1331670kl3LJIIIIZZ.LJJ = enumC1338240kve;
                            C1331750klB c1331750klB = new C1331750klB();
                            c1331750klB.LIZ = true;
                            c1331750klB.LJ = C418440Gaw.LIZIZ(25);
                            c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
                            c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ;
                            c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ;
                            c1331670kl3LJIIIIZZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0rZL
                                @Override // X.InterfaceC427850Gq7
                                public final void cm(Uri uri, View view, Throwable th) {
                                }

                                @Override // X.InterfaceC427850Gq7
                                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                                    ((IProGuidePublishService) ServiceManager.get().getService(IProGuidePublishService.class)).LIZIZ();
                                }
                            });
                            c1593700rZg.LJFF(z2);
                        }
                    } else {
                        ISpecialPlusService iSpecialPlusServiceSpecialPlusService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService();
                        String resourceType = iSpecialPlusServiceSpecialPlusService.getResourceType();
                        String iconType = iSpecialPlusServiceSpecialPlusService.getIconType();
                        if (Intrinsics.LJFF(resourceType, "template")) {
                            if (iconType != null && u.LJIIZILJ(iconType, ".webp", false)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(c1593700rZg.LIZIZ);
                                sbLIZ.append(File.separator);
                                sbLIZ.append("special_plus_icon.webp");
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                                c1320810kTXLIZJ.LJIIJJI = true;
                                RemoteImageView remoteImageView = c1593700rZg.LIZLLL;
                                if (remoteImageView != null) {
                                    controller = remoteImageView.getController();
                                } else {
                                    controller = null;
                                }
                                c1320810kTXLIZJ.LJIILJJIL = controller;
                                c1320810kTXLIZJ.LJI(Uri.fromFile(new C0VSJ(strLIZIZ)));
                                AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
                                RemoteImageView remoteImageView2 = c1593700rZg.LIZLLL;
                                if (remoteImageView2 != null) {
                                    remoteImageView2.setController(abstractC1320710kTNLIZ);
                                }
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(c1593700rZg.LIZIZ);
                                sbLIZ2.append(File.separator);
                                sbLIZ2.append("special_plus_icon.png");
                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                RemoteImageView remoteImageView3 = c1593700rZg.LIZLLL;
                                if (remoteImageView3 != null) {
                                    remoteImageView3.setImageURI(Uri.fromFile(new C0VSJ(strLIZIZ2)));
                                }
                            }
                            c1593700rZg.LJFF(z2);
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(c1593700rZg.LIZIZ);
                            sbLIZ3.append(File.separator);
                            sbLIZ3.append("special_plus_icon.png");
                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                            RemoteImageView remoteImageView4 = c1593700rZg.LIZLLL;
                            if (remoteImageView4 != null) {
                                remoteImageView4.setImageURI(Uri.fromFile(new C0VSJ(strLIZIZ3)));
                            }
                            View view = c1593700rZg.LJIIIIZZ;
                            if (view != null) {
                                C786410Ut5.LJLLLLLL(4, view);
                            }
                            RemoteImageView remoteImageView5 = c1593700rZg.LIZLLL;
                            if (remoteImageView5 != null) {
                                C786410Ut5.l(remoteImageView5, 0);
                            }
                            c1593700rZg.LJ(z, z2);
                        }
                    }
                } else {
                    RemoteImageView remoteImageView6 = c1593700rZg.LIZLLL;
                    if (remoteImageView6 != null) {
                        remoteImageView6.setImageURI(Uri.fromFile(new C0VSJ(c1593700rZg.LIZJ)));
                    }
                    RemoteImageView remoteImageView7 = c1593700rZg.LIZLLL;
                    if (remoteImageView7 != null) {
                        C786410Ut5.l(remoteImageView7, 0);
                    }
                    c1593700rZg.LJ(z, z2);
                }
            }
        }
        C1593700rZg c1593700rZg2 = this.LLILLL;
        if (c1593700rZg2 != null) {
            int i4 = c1593700rZg2.LJFF;
            if (i4 != 1) {
                if (i4 != 3) {
                    if (i4 != 5) {
                        i2 = 0;
                    } else {
                        i2 = 3;
                    }
                }
            } else {
                i2 = 1;
            }
            c1593700rZg2.LJ = i2;
        }
    }
}
