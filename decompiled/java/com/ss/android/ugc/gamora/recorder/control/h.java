package com.ss.android.ugc.gamora.recorder.control;

import X.AbstractC1252750ihl;
import X.AnonymousClass0206;
import X.AnonymousClass0956;
import X.AnonymousClass1250;
import X.C004I;
import X.C01GW;
import X.C09R3;
import X.C0CHQ;
import X.C0LCS;
import X.C0PEM;
import X.C1001760cAw;
import X.C1001770cAx;
import X.C1170060gYO;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1292030jj7;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1342405Ne;
import X.C13LE;
import X.C1429780nJI;
import X.C1444870nhd;
import X.C1621220sI4;
import X.C1626330sQJ;
import X.C1626350sQL;
import X.C1634100scq;
import X.C1638070sjF;
import X.C1638560sk2;
import X.C1642020spc;
import X.C1642110spl;
import X.C1644460stY;
import X.C1647390syH;
import X.C1659630tI1;
import X.C1664740tQG;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C1698060uI0;
import X.C1698330uIR;
import X.C1765020w20;
import X.C19A3;
import X.C19GS;
import X.C1DFH;
import X.C1DRG;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C23073092h;
import X.C23076092k;
import X.C23250099c;
import X.C2502109rH;
import X.C267510Ae5;
import X.C267530Ae7;
import X.C299990BpN;
import X.C384050F3z;
import X.C385670FAf;
import X.C418440Gaw;
import X.C426750GoL;
import X.C443120HZe;
import X.C452501pT;
import X.C522630Keb;
import X.C524780Ki4;
import X.C525780Kjg;
import X.C560530Lyd;
import X.C577270MkX;
import X.C577300Mka;
import X.C577390Mkj;
import X.C578130Mlv;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1166920gTK;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1625470sOv;
import X.InterfaceC1625520sP0;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1648020szI;
import X.InterfaceC1648570t0B;
import X.InterfaceC1650190t2n;
import X.InterfaceC1650230t2r;
import X.InterfaceC1650620t3U;
import X.InterfaceC1653650t8N;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC420801kM;
import X.InterfaceC566960MLm;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObjectS238S0100000_2;
import Y.AObjectS239S0100000_3;
import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS125S0100000_25;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.experiment.cq0;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.shortvideo.FirstPhotoViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.control.h;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.l;
import lnn.q;
import mn3.e0;

/* JADX INFO: loaded from: classes26.dex */
public final class h extends C19A3 implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLII;
    public final C1DRG LLJILLL;
    public final C385670FAf<Integer> LLJJ;
    public final C385670FAf<Integer> LLJJI;
    public final C385670FAf<Boolean> LLJJIII;
    public final C577390Mkj LLJJIJI;
    public final Function1<Boolean, Unit> LLJJIJIIJIL;
    public final Function1<Boolean, Unit> LLJJIJIL;
    public final C1664750tQH LLJJJIL;
    public final C1664750tQH LLJJJJ;
    public final C1664750tQH LLJJJJJIL;
    public final C1664740tQG LLJJJJLIIL;
    public final C1664750tQH LLJJL;
    public final C1664740tQG LLJJLIIIJLLLLLLLZ;
    public final C1664740tQG LLJL;
    public boolean LLJLILLLLZIIL;
    public final int LLLF;
    public boolean LLLFF;
    public C1626350sQL LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public AnonymousClass0956 LLLII;
    public volatile boolean LLLIIII;
    public final C01GW LLLIIIIL;
    public final C23073092h LLLIIIL;
    public volatile boolean LLLIIL;
    public volatile boolean LLLIILIL;
    public volatile boolean LLLIL;
    public final C1342405Ne LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public C1292030jj7<C1294720jnS> LLLIZZ;
    public final C1698330uIR LLLJ;
    public final C2502109rH LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C560530Lyd LLJJJ = new C560530Lyd();
    public final C1638560sk2 LLJLIL = new C1638560sk2();
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 554));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 558));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 555));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 557));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 553));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 549));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(h.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(h.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(h.class, "tiktokCameraApiComponent", "getTiktokCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(h.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(h.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(h.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(h.class, "frontFlashApiComponent", "getFrontFlashApiComponent()Lcom/ss/android/ugc/gamora/recorder/frontflash/FrontFlashApiComponent;", 0);
        c09r3.getClass();
        LLLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final InterfaceC1648020szI LLLLIIIILLL() {
        return (InterfaceC1648020szI) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLLII[5]);
    }

    public final ViewGroup LLLLIILL() {
        return (ViewGroup) this.LLJZIJLIL.getValue();
    }

    public final ShortVideoContext LLLLIL() {
        return (ShortVideoContext) this.LLJJJIL.getValue(this, LLLLII[0]);
    }

    public final boolean LLLLILI() {
        return ((Boolean) this.LLLILZJ.getValue()).booleanValue();
    }

    public final q LLLLJ() {
        return (q) this.LLJJJJLIIL.getValue(this, LLLLII[3]);
    }

    public final C1642110spl LLLLJI() {
        return (C1642110spl) this.LLJLL.getValue();
    }

    public final TuxIconView LLLLL() {
        return (TuxIconView) this.LLJLLL.getValue();
    }

    public final C1295960jpS LLLLLIL() {
        return (C1295960jpS) this.LLLIIIIL.getValue();
    }

    public final View LLLLLILLIL() {
        return (View) this.LLLILZLLLI.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0sQL] */
    public final void LLLLLJLJLL() {
        q qVarLLLLJ;
        InterfaceC1625410sOp interfaceC1625410sOpW4;
        InterfaceC1625410sOp interfaceC1625410sOpW42;
        IConfigService iConfigServiceConfigService;
        IAVSettingsService iAVSettingsServiceAvsettingsConfig;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (!Intrinsics.LJFF((iExternalService == null || (iConfigServiceConfigService = iExternalService.configService()) == null || (iAVSettingsServiceAvsettingsConfig = iConfigServiceConfigService.avsettingsConfig()) == null) ? null : Boolean.valueOf(iAVSettingsServiceAvsettingsConfig.isDuetAutoApplyEffectEnabled()), Boolean.TRUE) || !LLLLIL().LJJLL()) {
            C1626350sQL c1626350sQL = this.LLLFFI;
            if (c1626350sQL != null && (qVarLLLLJ = LLLLJ()) != null && (interfaceC1625410sOpW4 = qVarLLLLJ.w4()) != null) {
                interfaceC1625410sOpW4.LIZ(c1626350sQL);
            }
            this.LLLFFI = null;
            return;
        }
        if (this.LLLFFI == null) {
            this.LLLFFI = new InterfaceC1625520sP0() { // from class: X.0sQL
                @Override // X.InterfaceC1625520sP0
                public final void LIZ(C1627360sRy c1627360sRy) {
                }

                @Override // X.InterfaceC1625520sP0
                public final void LIZIZ(C1627370sRz c1627370sRz) {
                    if (c1627370sRz.LIZJ == EnumC1448980noG.MANUAL_SET) {
                        this.LL.LLLLIL().duetEnterRecordPageWithProps = true;
                    }
                }
            };
        }
        q qVarLLLLJ2 = LLLLJ();
        if (qVarLLLLJ2 == null || (interfaceC1625410sOpW42 = qVarLLLLJ2.w4()) == null) {
            return;
        }
        interfaceC1625410sOpW42.LJFF(this.LLLFFI);
    }

    public final float LLLLLLJ() {
        int measuredWidth = LLLLJI().getMeasuredWidth();
        if (measuredWidth <= 0) {
            measuredWidth = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C267510Ae5.LIZ() ? 40 : 36)));
        }
        return measuredWidth;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        q qVarLLLLJ;
        InterfaceC1625410sOp interfaceC1625410sOpW4;
        super.onDestroyView();
        if (C299990BpN.LIZ()) {
            C1626350sQL c1626350sQL = this.LLLFFI;
            if (c1626350sQL != null && (qVarLLLLJ = LLLLJ()) != null && (interfaceC1625410sOpW4 = qVarLLLLJ.w4()) != null) {
                interfaceC1625410sOpW4.LIZ(c1626350sQL);
            }
            this.LLLFFI = null;
        }
        C1292030jj7<C1294720jnS> c1292030jj7 = this.LLLIZZ;
        if (c1292030jj7 != null) {
            c1292030jj7.LJII(this.LLLJ);
        }
        this.LLLIZZ = null;
        LLLLLIL().setFailureListener(null);
        AnonymousClass0956 anonymousClass0956 = this.LLLII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final void LLLLLJIL(final boolean z) {
        int i;
        if (this.LLJLILLLLZIIL) {
            return;
        }
        if (z && LLLLILI()) {
            ((InterfaceC1650190t2n) this.LLJJJJJIL.getValue(this, LLLLII[2])).xF1().LIZ(this, new AObjectS238S0100000_2(this, 1));
        }
        C1642110spl c1642110splLLLLJI = LLLLJI();
        if (C267510Ae5.LIZ()) {
            i = 40;
        } else {
            i = 36;
        }
        c1642110splLLLLJI.setFullHorizontalCarrouselStyleButton(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
        this.LLJLILLLLZIIL = true;
        ((FirstPhotoViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(FirstPhotoViewModel.class)).LL.observe(this, new Observer() { // from class: X.0spk
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean z2;
                C535700Kzg c535700Kzg = (C535700Kzg) obj;
                if (c535700Kzg != null) {
                    h hVar = this.LL;
                    boolean z3 = z;
                    if (C1621220sI4.LIZ() && z3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hVar.getClass();
                    if (z2) {
                        hVar.LLLLJI().setBitmapReadyCallback(new AwS369S0200000_3(hVar, c535700Kzg, 9));
                    }
                    hVar.LLLLJI().LIZ(true, c535700Kzg.LIZ.LIZ, c535700Kzg.LIZIZ, C530370Kr5.LIZ);
                }
            }
        });
        C1698060uI0 c1698060uI0 = new C1698060uI0(this, 0);
        if (!((Boolean) this.LLLL.getValue()).booleanValue() && !C1621220sI4.LIZ()) {
            C786410Ut5.wa(LLLLJI(), c1698060uI0);
        } else {
            C786410Ut5.I7(c1698060uI0, (View) this.LLJLLIL.getValue());
        }
    }

    public final void LLLLLL(int i) {
        C786410Ut5.LJLZ(i, (ViewGroup) this.LLJZ.getValue());
        if (((Boolean) this.LLLL.getValue()).booleanValue()) {
            C786410Ut5.LJLLLLLL(i, (View) this.LLJLLIL.getValue());
        }
        if (i == 0 && !C426750GoL.LIZLLL(((View) this.LLJZ.getValue()).getContext())) {
            HandlerHook.viewPost(LLLLL(), new ARunnableS116S0100000_16(this, 81));
        } else {
            if (!this.LLLFF) {
                return;
            }
            InterfaceC1648020szI interfaceC1648020szILLLLIIIILLL = LLLLIIIILLL();
            if (interfaceC1648020szILLLLIIIILLL != null) {
                interfaceC1648020szILLLLIIIILLL.setBottomTabStartMargin(0);
            }
            this.LLLFF = false;
        }
    }

    public final void LLLLLLIL(boolean z) {
        if (C23076092k.LIZ()) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1001760cAw(z, this, null), 2);
        } else {
            LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh2 = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope2, C2107308Nj.LIZ.LLIILII(), null, new C1001770cAx(z, this, null), 2);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        q qVarLLLLJ;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLIZ;
        InterfaceC566960MLm storyService;
        C385670FAf<Integer> c385670FAfZu0;
        InterfaceC1648020szI interfaceC1648020szILLLLIIIILLL;
        C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
        LiveEvent<C443120HZe<Integer, Integer, Intent>> liveEventLLZIL;
        Boolean boolValueOf;
        super.onActivityCreated(bundle);
        if (getSceneContext() != null) {
            Context sceneContext = getSceneContext();
            if (sceneContext != null) {
                boolValueOf = Boolean.valueOf(C426750GoL.LIZLLL(sceneContext));
            } else {
                boolValueOf = null;
            }
            if (LLLLILI()) {
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    LLLLLILLIL().setBackgroundResource(R.drawable.btm);
                } else {
                    LLLLLILLIL().setBackgroundResource(R.drawable.btl);
                }
            }
        }
        if (C426750GoL.LIZLLL(LLLLL().getContext())) {
            C786410Ut5.hc(LLLLL(), -1.0f);
        }
        boolean zLIZ = C267510Ae5.LIZ();
        boolean zBooleanValue = ((Boolean) C267530Ae7.LIZ.getValue()).booleanValue();
        if (zLIZ) {
            i = 40;
        } else {
            i = 36;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
        if (zLIZ) {
            i2 = 40;
        } else {
            i2 = 36;
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
        LLLLJI().setRoundRectRadius(10);
        LLLLJI().setDefaultIconWidth(iLIZIZ2);
        C1642110spl c1642110splLLLLJI = LLLLJI();
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c1642110splLLLLJI.LLILLJJLI.setIconWidth(iLIZIZ3);
        c1642110splLLLLJI.LLILLJJLI.setIconHeight(iLIZIZ3);
        LLLLJI().LIZIZ();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJI = iLIZIZ;
        c384050F3z.LJII = iLIZIZ2;
        c384050F3z.LJ = C1308910kAL.LIZJ(R.attr.a1h, (Context) this.LLLFZ.getValue());
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        Drawable drawableLIZ = c384050F3z.LIZ((Context) this.LLLFZ.getValue());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LLLLJI().getLayoutParams();
        if (zBooleanValue) {
            i3 = 20;
        } else {
            i3 = 16;
        }
        marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i3)));
        marginLayoutParams.width = iLIZIZ2;
        marginLayoutParams.height = iLIZIZ;
        C1642110spl c1642110splLLLLJI2 = LLLLJI();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1642110splLLLLJI2);
        c1642110splLLLLJI2.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = LLLLL().getLayoutParams();
        if (zLIZ) {
            i4 = 9;
        } else {
            i4 = 8;
        }
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4)));
        if (zLIZ) {
            i5 = 33;
        } else {
            i5 = 30;
        }
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i5)));
        C786410Ut5.M6(LLLLL(), layoutParams);
        boolean z2 = true;
        if (C522630Keb.LIZ() == 5) {
            LLLLJI().LIZJ(false);
        } else {
            LLLLJI().LIZJ(true);
        }
        LLLLJI().setBgBorderDrawable(drawableLIZ);
        LLLLJI().LIZLLL("full_horizontal_carrousel", C525780Kjg.LIZ(LLLLIL()));
        HandlerHook.viewPost(LLLLJI(), new ARunnableS116S0100000_16(this, 80));
        cq0.LIZ.getClass();
        if (!((Boolean) cq0.LIZIZ.getValue()).booleanValue()) {
            AnonymousClass1250.LIZJ(LLLLJI());
        }
        boolean zLJFF = Intrinsics.LJFF(C1642020spc.LIZ().getResourceType(), "effect");
        C1642020spc.LIZ().getClass();
        if (C1429780nJI.LIZ() && zLJFF && C1642020spc.LIZ().getQuickPromoCount() > 0 && Intrinsics.LJFF(LLLLIL().enterFrom, "super_entrance")) {
            z = true;
        } else {
            z = false;
        }
        C1638070sjF c1638070sjF = l.LLJJIII;
        C19GS c19gs = (C19GS) this.mActivity;
        View view = this.mView;
        q qVarLLLLJ2 = LLLLJ();
        C1DRG c1drg = this.LLJILLL;
        AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(this, 355);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 662);
        c1638070sjF.getClass();
        C1638070sjF.LIZ(c19gs, this, view, z, qVarLLLLJ2, c1drg, awS604S0100000_25, awS556S0100000_12);
        ShortVideoContext shortVideoContextLLLLIL = LLLLIL();
        if (!shortVideoContextLLLLIL.LJJLL() && !shortVideoContextLLLLIL.LJJJJLL()) {
            LLLLLJIL(true);
        } else {
            LLLLLL(4);
        }
        if (TextUtils.equals(LLLLIL().shootWay, "upload_anchor") || Intrinsics.LJFF(LLLLIL().enterFrom, "homepage_explore")) {
            C524780Ki4.LIZ.start(OpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
            this.LLJJIJIL.invoke(Boolean.FALSE);
            C1444870nhd c1444870nhd = C1444870nhd.LIZ;
            Activity activityRequireActivity = requireActivity();
            ShortVideoContext shortVideoContextLLLLIL2 = LLLLIL();
            C1DRG c1drg2 = this.LLJILLL;
            c1444870nhd.getClass();
            C1444870nhd.LIZIZ(activityRequireActivity, shortVideoContextLLLLIL2, c1drg2, null, null);
        }
        this.LLJJIII.LIZ(this, new AObjectS246S0100000_25(this, 430));
        this.LLJJI.LIZ(this, new AObjectS246S0100000_25(this, 442));
        LiveEvent<Effect> liveEvent = this.LLJJIJI.LIZJ;
        if (liveEvent != null) {
            liveEvent.LIZ(this, new AObjectS239S0100000_3(this, 2));
        }
        a aVar = (a) this.LLJILLL.LJIIL(null, a.class);
        if (aVar != null && (liveEventLLZIL = aVar.LLZIL()) != null) {
            liveEventLLZIL.LIZ(this, new AObjectS246S0100000_25(this, 426));
        }
        InterfaceC1648020szI interfaceC1648020szILLLLIIIILLL2 = LLLLIIIILLL();
        if (interfaceC1648020szILLLLIIIILLL2 != null && (bottomTabIndexChangeEvent = interfaceC1648020szILLLLIIIILLL2.getBottomTabIndexChangeEvent()) != null) {
            bottomTabIndexChangeEvent.LIZ(this, new AObjectS246S0100000_25(this, 429));
        }
        if (LLLLILI() && (interfaceC1648020szILLLLIIIILLL = LLLLIIIILLL()) != null) {
            interfaceC1648020szILLLLIIIILLL.setBottomTabWidgetGestureListener(new InterfaceC1653650t8N() { // from class: X.0spa
                @Override // X.InterfaceC1653650t8N
                public final void LJII() {
                }

                @Override // X.InterfaceC1653650t8N
                public final void LJIIZILJ(int i6, Object obj, Function0<Unit> function0) {
                }

                @Override // X.InterfaceC1653650t8N
                public final void a1(int i6) {
                }

                @Override // X.InterfaceC1653650t8N
                public final void LJI() {
                    if (this.LL.LLLIIII) {
                        return;
                    }
                    C06PR.LIZ(this.LL.LLLLLLJ(), 0L, 0L, this.LL.LLLLLILLIL());
                    this.LL.LLLIIII = true;
                }
            });
        }
        InterfaceC1650620t3U interfaceC1650620t3U = (InterfaceC1650620t3U) this.LLJL.getValue(this, LLLLII[6]);
        if (interfaceC1650620t3U != null && (c385670FAfZu0 = interfaceC1650620t3U.zu0()) != null) {
            c385670FAfZu0.LIZ(this, new AObjectS246S0100000_25(this, 432));
        }
        this.LLJJ.LIZ(this, new AObjectS246S0100000_25(this, 431));
        if (LLLLJI().getVisibility() == 0 && !this.LLJLIL.LIZ.getBoolean("upload_tip_show", false)) {
            IAVServiceProxy iAVServiceProxy = (IAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IAVServiceProxy.class, false, false, false, 14, null);
            if (iAVServiceProxy == null || (storyService = iAVServiceProxy.getStoryService()) == null || !storyService.LJI()) {
                z2 = false;
            }
            if (!Intrinsics.LJFF(LLLLIL().shootWay, "duet") && !Intrinsics.LJFF(LLLLIL().shootWay, "split") && !Intrinsics.LJFF(LLLLIL().shootWay, "react") && (!z2 || C0CHQ.LIZ().getAccountService().LIZ())) {
                HandlerHook.viewPostDelay(LLLLJI(), new ARunnableS125S0100000_25(this, 56), 100L);
            }
        }
        LLLLLJLJLL();
        if (LLLLILI() && (qVarLLLLJ = LLLLJ()) != null && (interfaceC1624480sNKC0 = qVarLLLLJ.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) != null && (mutableLiveDataLIZ = interfaceC1625470sOvLJII.LIZ()) != null) {
            mutableLiveDataLIZ.observe(this, new AObserverS227S0100000_25(this, 52));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1626330sQJ(this, null), 3);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ILayoutPreloadService iLayoutPreloadService = (ILayoutPreloadService) PluggableExtentionKt.pluggableSpi$default(ILayoutPreloadService.class, false, false, false, 14, null);
        if (iLayoutPreloadService == null) {
            return new FrameLayout(viewGroup.getContext());
        }
        return (ViewGroup) iLayoutPreloadService.loadLayoutFiles("dockBar", getSceneContext(), layoutInflater, R.layout.ce0, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    public h(C1DRG c1drg, h0 h0Var, h0 h0Var2, C385670FAf c385670FAf, C577390Mkj c577390Mkj, C577270MkX c577270MkX, C577300Mka c577300Mka) {
        int i;
        this.LLJILLL = c1drg;
        this.LLJJ = h0Var;
        this.LLJJI = h0Var2;
        this.LLJJIII = c385670FAf;
        this.LLJJIJI = c577390Mkj;
        this.LLJJIJIIJIL = c577270MkX;
        this.LLJJIJIL = c577300Mka;
        this.LLJJJIL = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(c1drg, e0.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(c1drg, q.class, null);
        this.LLJJL = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1648020szI.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1650620t3U.class, null);
        if (C578130Mlv.LIZJ()) {
            i = 5;
        } else {
            i = 20;
        }
        this.LLLF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        this.LLLFZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 552));
        this.LLLI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(219));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 556));
        this.LLLIIIL = new C23073092h();
        this.LLLILZ = new C1342405Ne();
        this.LLLILZJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 550));
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 559));
        this.LLLJ = new C1698330uIR(this, 1);
        this.LLLJIL = new C2502109rH(this, 0);
        this.LLLJL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 598));
        this.LLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(597));
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
