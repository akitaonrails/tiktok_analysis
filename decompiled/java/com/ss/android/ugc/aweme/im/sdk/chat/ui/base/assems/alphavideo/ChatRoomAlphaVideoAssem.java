package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo;

import X.C019F;
import X.C01GW;
import X.C0I0B;
import X.C0QSJ;
import X.C127G;
import X.C1294120jmU;
import X.C12ES;
import X.C13LE;
import X.C1559260qg8;
import X.C1584506Ih;
import X.C1629106Zl;
import X.C1637806bA;
import X.C1637906bB;
import X.C1654006dm;
import X.C1655006dw;
import X.C1716106nn;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C2485509ob;
import X.C447810HhD;
import X.C452501pT;
import X.C457640Hx4;
import X.C457780HxI;
import X.C458720Hyo;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C894660Z7w;
import X.InterfaceC1146704e9;
import X.InterfaceC1602806Pi;
import X.InterfaceC1715506nh;
import X.InterfaceC2217461Bqa;
import X.InterfaceC458730Hyp;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObjectS378S0100000_2;
import Y.ARunnableS71S0200000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatRoomAlphaVideoAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final C1654006dm LLJJIJIIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final C1559260qg8 LLJIJIL;
    public C1294120jmU LLJILJIL;
    public DataSource LLJILJILJ;
    public final C01GW LLJILLL;
    public volatile InterfaceC1602806Pi LLJJ;
    public C127G LLJJI;
    public InterfaceC665370Q7z LLJJIII;
    public C0QSJ LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatRoomAlphaVideoAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/alphavideo/ChatRoomAlphaVideoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(ChatRoomAlphaVideoAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0), new C2217381BqS(ChatRoomAlphaVideoAssem.class, "inputSizeVM", "getInputSizeVM()Lcom/ss/android/ugc/aweme/im/viewmodel/InputPanelSizeViewModel;", 0), new C2217381BqS(ChatRoomAlphaVideoAssem.class, "chatRoomAlphaVideoAbility", "getChatRoomAlphaVideoAbility()Lcom/ss/android/ugc/aweme/im/lightinteract/api/assem/ChatRoomAlphaVideoAbility;", 0)};
        LLJJIJIIJIL = new C1654006dm();
    }

    public ChatRoomAlphaVideoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatRoomAlphaVideoViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 407), AFwS229S0000000_2.get$arr$(273), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 408), AFwS229S0000000_2.get$arr$(274), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(InputPanelSizeViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 409), AFwS229S0000000_2.get$arr$(275), null, true);
        this.LLJIJIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 406));
    }

    public final InterfaceC1602806Pi Jo() {
        InterfaceC1602806Pi interfaceC1602806Pi = this.LLJJ;
        if (interfaceC1602806Pi == null) {
            synchronized (this) {
                interfaceC1602806Pi = this.LLJJ;
                if (interfaceC1602806Pi == null) {
                    InterfaceC1602806Pi interfaceC1602806PiHo = Ho();
                    this.LLJJ = interfaceC1602806PiHo;
                    return interfaceC1602806PiHo;
                }
            }
        }
        return interfaceC1602806Pi;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final InterfaceC1602806Pi Ho() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJIJI;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIII;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJIII = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLJJIJI = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1602806Pi interfaceC1602806Pi = (InterfaceC1602806Pi) c0qsjLIZLLL.getAbility(InterfaceC1602806Pi.class);
        C687700QyG.LJ(interfaceC1602806Pi, InterfaceC1602806Pi.class);
        return interfaceC1602806Pi;
    }

    public final PanelStateViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (PanelStateViewModel) assemVMLazy.getValue();
    }

    public final void Oo() {
        try {
            C1294120jmU c1294120jmU = this.LLJILJIL;
            if (c1294120jmU != null) {
                C1584506Ih.LIZ(c1294120jmU);
                c1294120jmU.LIZLLL();
            }
            Jo().bc(false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatRoomAlphaVideoViewModel.class, new AObjectS378S0100000_2(this, 20)}, defaultViewModelProviderFactory);
                    this.LLJJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1294120jmU c1294120jmU = this.LLJILJIL;
        if (c1294120jmU != null) {
            c1294120jmU.LIZIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        Oo();
    }

    public final int Go(boolean z) {
        int iIntValue;
        View view;
        if (z) {
            C0I0B c0i0b = C0I0B.LJFF;
            c0i0b.LIZJ();
            int iLJIIIIZZ = C12ES.LJIIIIZZ(C894660Z7w.LIZ());
            c0i0b.LIZJ();
            int iLJIIJJI = C12ES.LJIIJJI(C894660Z7w.LIZ());
            PanelStateViewModel panelStateViewModelLo = Lo();
            Object value = panelStateViewModelLo.LLIZ.getValue();
            if (Intrinsics.LJFF(value, C1629106Zl.LL)) {
                iIntValue = 0;
            } else if ((value instanceof InterfaceC458730Hyp) || (value instanceof C447810HhD)) {
                iIntValue = ((Number) panelStateViewModelLo.LLIZLLLIL.getValue()).intValue();
            } else {
                throw new C1954807lC();
            }
            AssemVMLazy assemVMLazy = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
            int i = iIntValue + ((C457640Hx4) assemVMLazy.getValue().getState()).LLILLJJLI;
            if (((C457780HxI) this.LLJIJIL.getValue()).LLILLJJLI) {
                C1294120jmU c1294120jmU = this.LLJILJIL;
                Object parent = null;
                if (c1294120jmU != null) {
                    parent = c1294120jmU.getParent();
                }
                if ((parent instanceof View) && (view = (View) parent) != null) {
                    Integer numValueOf = Integer.valueOf(view.getHeight());
                    if (numValueOf.intValue() > 0) {
                        return numValueOf.intValue();
                    }
                    return iLJIIIIZZ;
                }
                return iLJIIIIZZ;
            }
            int iLIZ = C458720Hyo.LIZ(0);
            if (i <= iLIZ) {
                i += iLIZ;
            }
            return (iLJIIJJI + iLJIIIIZZ) - i;
        }
        return -1;
    }

    public final void So(int i) {
        ViewGroup.LayoutParams layoutParams;
        C1294120jmU c1294120jmU = this.LLJILJIL;
        if (c1294120jmU == null || (layoutParams = c1294120jmU.getLayoutParams()) == null || layoutParams.height == i) {
            return;
        }
        layoutParams.height = i;
        C1294120jmU c1294120jmU2 = this.LLJILJIL;
        if (c1294120jmU2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1294120jmU2);
            c1294120jmU2.setLayoutParams(layoutParams);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ILightInteractionPlatformService iLightInteractionPlatformService;
        super.onViewCreated(view);
        if (C1716106nn.LIZ() || ((iLightInteractionPlatformService = (ILightInteractionPlatformService) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class)) != null && iLightInteractionPlatformService.LJIJJLI())) {
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06dp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1715206ne) obj).LL;
                }
            }, null, new AwS616S0100000_2(this, 39), 6);
            C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.06nd
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1715206ne) obj).LLILLJJLI;
                }
            }, null, new AwS616S0100000_2(this, 40), 6);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1655006dw(this, null), 3);
    }

    public final void No(DataSource dataSource, final InterfaceC1715506nh interfaceC1715506nh, Map<String, Bitmap> map, boolean z) {
        View viewLJLLLL;
        ViewStub viewStub;
        Jo().bc(true);
        if (this.LLJILJIL == null) {
            View viewLJJIJL = LJJIJL();
            C1294120jmU c1294120jmU = null;
            if ((viewLJJIJL instanceof ViewStub) && (viewStub = (ViewStub) viewLJJIJL) != null) {
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            } else {
                viewLJLLLL = null;
            }
            if (viewLJLLLL instanceof C1294120jmU) {
                c1294120jmU = (C1294120jmU) viewLJLLLL;
            }
            this.LLJILJIL = c1294120jmU;
        }
        C1294120jmU c1294120jmU2 = this.LLJILJIL;
        if (c1294120jmU2 != null) {
            Context context = c1294120jmU2.getContext();
            getActualLifecycleOwner();
            c1294120jmU2.LIZ(context, this, new AlphaPlayerAction() { // from class: X.06nf
                @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
                public final void onVideoSizeChange(int i, int i2, DataSource.ScaleType scaleType) {
                }

                @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
                public final void endAction() {
                    this.Oo();
                    InterfaceC1715506nh interfaceC1715506nh2 = interfaceC1715506nh;
                    if (interfaceC1715506nh2 != null) {
                        interfaceC1715506nh2.onPlayEnd();
                    }
                }

                @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
                public final void startAction() {
                    InterfaceC1715506nh interfaceC1715506nh2 = interfaceC1715506nh;
                    if (interfaceC1715506nh2 != null) {
                        interfaceC1715506nh2.LJLIIIL();
                    }
                }
            }, z);
            if (map != null) {
                for (Map.Entry<String, Bitmap> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Bitmap value = entry.getValue();
                    PlayerController playerController = c1294120jmU2.LL;
                    if (playerController != null) {
                        MaskSrc maskSrc = new MaskSrc();
                        maskSrc.setName(key);
                        maskSrc.setType(1);
                        maskSrc.setBitmap(value);
                        playerController.setMask(maskSrc);
                    }
                }
            }
            PlayerController playerController2 = c1294120jmU2.LL;
            if (playerController2 != null) {
                playerController2.attachAlphaView(c1294120jmU2);
            }
        }
        C1294120jmU c1294120jmU3 = this.LLJILJIL;
        if (c1294120jmU3 != null) {
            C1584506Ih.LIZIZ(c1294120jmU3);
        }
        So(Go(Lo().Ld()));
        C2485509ob.LIZIZ(new ARunnableS71S0200000_2(this, dataSource, 5));
    }
}
