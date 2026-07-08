package com.ss.android.ugc.aweme.assem;

import X.C019F;
import X.C06SA;
import X.C06Z6;
import X.C09R3;
import X.C0I0B;
import X.C0PEM;
import X.C0YNY;
import X.C0ZMF;
import X.C1383370m6R;
import X.C1389890mGx;
import X.C13LE;
import X.C1400340mXo;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23250099c;
import X.C457780HxI;
import X.C461160I6o;
import X.C687700QyG;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C869590Y9l;
import X.C909830Zmf;
import X.C910370ZnX;
import X.EnumC909380Zlw;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC874680YTa;
import X.InterfaceC904740ZeS;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.gesture.ChatroomBackPressProtocol;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.ScrollToMessageViewModel;
import com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager;
import com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService;
import com.ss.android.ugc.aweme.im.strategy.commonresource.GreetingCardResource;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.util.GreetingCardAbility;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS450S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GreetingCardPopupAssem extends UIContentAssem implements GreetingCardAbility, ChatroomBackPressProtocol, IMessageEventProtocol, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public C910370ZnX LLJILLL;
    public final C06Z6 LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GreetingCardPopupAssem.class, "greetingCardViewModel", "getGreetingCardViewModel()Lcom/ss/android/ugc/aweme/viewmodel/GreetingCardViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GreetingCardPopupAssem.class, "scrollToMessageViewModel", "getScrollToMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/messagelist/skeleton/ability/ScrollToMessageViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(GreetingCardPopupAssem.class, "panelStateViewModel", "getPanelStateViewModel()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(GreetingCardPopupAssem.class, "inputFieldViewModel", "getInputFieldViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public GreetingCardPopupAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GreetingCardViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 44), AFwS248S0000000_14.get$arr$(19), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ScrollToMessageViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 45), AFwS248S0000000_14.get$arr$(20), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, 46), AFwS248S0000000_14.get$arr$(21), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(InputFieldVM.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ4, 47), AFwS248S0000000_14.get$arr$(22), null, true);
        checkSupervisorPrepared();
        new C723580SZw(this, C457780HxI.class, null);
        this.LLJJ = C06Z6.MAIN;
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

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Map<String, C0ZMF> mapLJIIJ;
        String geckoChannelName;
        IDMGreetingCardGeckoChannelManager iDMGreetingCardGeckoChannelManager;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        super.onCreate();
        C1558520qew.LJI(this, ChatRoomScope.class, this, GreetingCardAbility.class, null, null);
        Context context = getContext();
        if (context != null) {
            GreetingCardViewModel greetingCardViewModelGo = Go();
            IStrategyPlatformService iStrategyPlatformService = (IStrategyPlatformService) greetingCardViewModelGo.LLJ.getValue();
            if (iStrategyPlatformService != null) {
                EnumC909380Zlw enumC909380Zlw = EnumC909380Zlw.GREETING_CARD_COMMON_RESOURCE;
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                mapLJIIJ = iStrategyPlatformService.LJIIJ(enumC909380Zlw, curUserId, true);
            } else {
                mapLJIIJ = null;
            }
            boolean z = mapLJIIJ instanceof Map;
            Map mapLJ = mapLJIIJ;
            if (!z || mapLJIIJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            greetingCardViewModelGo.LLILLL = mapLJ;
            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpiForReal(I18nServiceApi.class);
            greetingCardViewModelGo.LLIZLLLIL = (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null) ? null : i18nManagerServiceApiLIZ.LJIILJJIL(context);
            for (String str : mapLJ.keySet()) {
                GreetingCardResource greetingCardResource = greetingCardViewModelGo.LLILLL.get(str);
                if (greetingCardResource != null && (geckoChannelName = greetingCardResource.getGeckoChannelName()) != null && (iDMGreetingCardGeckoChannelManager = (IDMGreetingCardGeckoChannelManager) PluggableExtentionKt.pluggableSpiForReal(IDMGreetingCardGeckoChannelManager.class)) != null) {
                    C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(greetingCardViewModelGo.getLifecycle()), C0PEM.LIZJ, null, new C909830Zmf(iDMGreetingCardGeckoChannelManager, geckoChannelName, str, greetingCardViewModelGo, greetingCardResource, null), 2);
                }
            }
        }
    }

    public final GreetingCardViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (GreetingCardViewModel) assemVMLazy.getValue();
    }

    public final PanelStateViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (PanelStateViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.gesture.ChatroomBackPressProtocol
    public final boolean LLZLL() {
        if (Go().getState().LL == null) {
            return false;
        }
        Go().yQ2();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.util.GreetingCardAbility
    public final boolean gU() {
        return Go().getState().LL != null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws IllegalAccessException {
        super.onDestroy();
        C910370ZnX c910370ZnX = this.LLJILLL;
        if (c910370ZnX != null) {
            c910370ZnX.LIZLLL(Go());
        }
        C1558520qew.LJIIJ(this, ChatRoomScope.class, GreetingCardAbility.class, null);
        C1554610qYd.LIZLLL(this, ChatroomBackPressProtocol.class, this);
        C1554610qYd.LIZLLL(this, IMessageEventProtocol.class, this);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.util.GreetingCardAbility
    public final void Dv2(C869590Y9l c869590Y9l) {
        Go().zQ2(c869590Y9l, false);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        if (!(interfaceC904740ZeS instanceof C06SA)) {
            return;
        }
        C06SA c06sa = (C06SA) interfaceC904740ZeS;
        if (Intrinsics.LJFF(c06sa.LIZJ.getScene(), "greeting_card") && c06sa.LIZJ.getMsgStatus() == 2 && gU()) {
            this.LLJILJILJ = true;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            final InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, ChatroomBackPressProtocol.class, C1697810uHb.LJIILJJIL(this));
            Lifecycle lifecycle = getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.assem.GreetingCardPopupAssem$onViewCreated$lambda$1$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, ChatroomBackPressProtocol.class, this);
                        }
                    }
                });
            }
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMessageEventProtocol.class, C1697810uHb.LJIILJJIL(this));
            Lifecycle lifecycle2 = getLifecycle();
            if (lifecycle2 != null) {
                lifecycle2.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.assem.GreetingCardPopupAssem$onViewCreated$lambda$1$$inlined$registerProtocol$2
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMessageEventProtocol.class, this);
                        }
                    }
                });
            }
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0Zmd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C908950ZlF) obj).LL;
            }
        }, C736820SvI.LJ(), new AwS450S0200000_14(this, view, 1), 4);
    }

    public final C910370ZnX Jo(Context context, View view) {
        ViewGroup viewGroup;
        C910370ZnX c910370ZnX = this.LLJILLL;
        if (c910370ZnX != null) {
            return c910370ZnX;
        }
        C910370ZnX c910370ZnX2 = new C910370ZnX(context);
        this.LLJILLL = c910370ZnX2;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.addView(c910370ZnX2);
        }
        return c910370ZnX2;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean z;
        if (Go().getState().LL != null) {
            z = true;
            this.LLJILJIL = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.util.GreetingCardAbility
    public final void sv2(long j, long j2) {
        C869590Y9l c869590Y9lLJJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(j2);
        if (c869590Y9lLJJJ != null && Long.valueOf(c869590Y9lLJJJ.getIndex()) != null && !c869590Y9lLJJJ.isDeleted() && !c869590Y9lLJJJ.isRecalled()) {
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
            ScrollToMessageViewModel scrollToMessageViewModel = (ScrollToMessageViewModel) assemVMLazy.getValue();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(scrollToMessageViewModel), C0PEM.LIZJ, null, new C461160I6o(j2, scrollToMessageViewModel, j, null), 2);
            return;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
            c1389890mGx.LJIIJ(C1383370m6R.LJIIJ(2131831558));
            c1389890mGx.LJIIJJI();
        }
    }
}
