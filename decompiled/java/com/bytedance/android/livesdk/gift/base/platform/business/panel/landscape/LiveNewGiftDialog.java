package com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape;

import X.AbstractC1132980faa;
import X.AbstractC1252750ihl;
import X.C004I;
import X.C0IJT;
import X.C0U56;
import X.C0UX6;
import X.C1124340fMe;
import X.C1125380fOK;
import X.C1126810fQd;
import X.C1128590fTV;
import X.C1128630fTZ;
import X.C1128680fTe;
import X.C1128760fTm;
import X.C1129180fUS;
import X.C1129310fUf;
import X.C1129900fVc;
import X.C1130100fVw;
import X.C1130220fW8;
import X.C1130430fWT;
import X.C1130790fX3;
import X.C1131900fYq;
import X.C1132570fZv;
import X.C1133010fad;
import X.C1133890fc3;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C11NJ;
import X.C1324720kZq;
import X.C13IQ;
import X.C13LE;
import X.C158B;
import X.C1634100scq;
import X.C1644460stY;
import X.C16FZ;
import X.C1765020w20;
import X.C177100m9;
import X.C19719912Dl;
import X.C19MX;
import X.C2284981EcC;
import X.C454590Hs9;
import X.C474500IjA;
import X.C486790J7d;
import X.C497740JfY;
import X.C498240JgM;
import X.C498250JgN;
import X.C500260Jjc;
import X.C500950Jkj;
import X.C500980Jkm;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1125400fOM;
import X.InterfaceC1075600e62;
import X.InterfaceC1118490fDD;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.ACListenerS111S0200000_7;
import Y.ACListenerS152S0100000_17;
import Y.AObserverS211S0100000_7;
import Y.AObserverS221S0100000_17;
import Y.AfS186S0100000_17;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.LiveNewGiftDialog;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftBottomWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftGuestInfoWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPageIndicatorWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.LiveCPCViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.viewmodel.GiftPrivilegeCenterViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManagerKotlin;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftStrategyData;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftJavaToKotlinGiftManagerSetting;
import com.bytedance.android.livesdk.livesetting.reddot.RedDotAssetsSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS301S0000000_17;
import kotlin.jvm.internal.AwS146S0400000_17;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveNewGiftDialog extends LiveDialogFragment implements InterfaceC1171660gay, InterfaceC1075600e62<ViewModelProvider.AndroidViewModelFactory> {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LywqPWExKTYpZz8/KTEqJjHELIOS0+Zic5OiY9LTY/Zz8yJiAgZyMyJiE/Ki4jLWsAIDk2BiA7DiY1PAElKCM8Lw==";
    public C1133890fc3 LL;
    public List<GiftPage> LLILLJJLI;
    public Room LLILLL;
    public boolean LLILZ;
    public LiveNewGiftPanelWidget LLILZIL;
    public EnumC1125400fOM LLILZLL;
    public C1128630fTZ LLIZ;
    public GiftPrivilegeCenterViewModel LLIZLLLIL;
    public LiveNewGiftBottomWidget LLJ;
    public C1130790fX3 LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public C1324720kZq LLJILJILJ;
    public C1324720kZq LLJILLL;
    public View LLJJ;
    public long LLJJI;
    public Runnable LLJJIJI;
    public int LLJJIJIL;
    public String LLJJJJ;
    public C1129180fUS LLJJJJJIL;
    public C16FZ LLJJJJLIIL;
    public View LLJJL;
    public C1129900fVc LLJJLIIIJLLLLLLLZ;
    public String LLJJIII = "";
    public final List<GiftPage> LLJJIJIIJIL = new ArrayList();
    public final C11NJ LLJJJ = new C11NJ();
    public final WidgetCreateTimeUtil LLJJJIL = new WidgetCreateTimeUtil(null);

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

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(GiftDialogDismissEvent.class, Boolean.FALSE);
        }
        this.LLJJJ.LJ();
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC1118490fDD genLandscapeDialogProxy() {
        return new C500950Jkj(R.layout.g78);
    }

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        ViewModelProvider.AndroidViewModelFactory.Companion companion = ViewModelProvider.AndroidViewModelFactory.Companion;
        Context context = getContext();
        return companion.getInstance((Application) (context != null ? C786410Ut5.N3(context) : null));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(GiftDialogDismissEvent.class, Boolean.FALSE);
        }
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        int i = C454590Hs9.LIZ(getActivity()) ? 8388611 : 8388613;
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g78);
        c500980Jkm.LIZJ = R.style.ahe;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = i;
        c500980Jkm.LJIIIZ = (int) C497740JfY.LIZIZ(375.0f);
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        MutableLiveData<Integer> mutableLiveData;
        super.onDestroy();
        C1126810fQd.LIZ.LIZLLL();
        DataChannelGlobal.LLILZ.zQ2(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C1128630fTZ c1128630fTZ = this.LLIZ;
        if (c1128630fTZ == null || c1128630fTZ.LIZJ == null || c1128630fTZ.LIZLLL == null || c1128630fTZ.LJ == null) {
            return;
        }
        this.LLJJJIL.send();
        C1128630fTZ c1128630fTZ2 = this.LLIZ;
        if (c1128630fTZ2 != null) {
            c1128630fTZ2.LIZJ.removeObservers(this);
            c1128630fTZ2.LIZLLL.removeObservers(this);
            c1128630fTZ2.LJ.removeObservers(this);
        }
        C1128630fTZ c1128630fTZ3 = this.LLIZ;
        Integer value = (c1128630fTZ3 == null || (mutableLiveData = c1128630fTZ3.LIZIZ) == null) ? null : mutableLiveData.getValue();
        int size = ((ArrayList) this.LLJJIJIIJIL).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            int i2 = ((GiftPage) ListProtector.get(this.LLJJIJIIJIL, i)).pageType;
            if (value != null && i2 == value.intValue()) {
                C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
                GiftPage giftPage = (GiftPage) ListProtector.get(this.LLJJIJIIJIL, i);
                c1128760fTm.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("tab_leave");
                c474500IjALIZ.LJIL();
                C1129310fUf.LIZ.getClass();
                c474500IjALIZ.LJJII(C1129310fUf.LIZIZ, "gift_dialog_request_id");
                c474500IjALIZ.LJJII(giftPage.pageName, "live");
                c474500IjALIZ.LJJII(Integer.valueOf(i + 1), "tab_position");
                c474500IjALIZ.LJJII(Long.valueOf((C158B.LIZ() - c1128760fTm.LJFF) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "stay_duration");
                c474500IjALIZ.LIZ();
                break;
            }
            i++;
        }
        C1130100fVw.LIZ.LJIILIIL = false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.LLILZIL;
        if (liveNewGiftPanelWidget != null) {
            liveNewGiftPanelWidget.LLJLL = SystemClock.uptimeMillis() - this.LLJJI;
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        if (this.dataChannel != null) {
            Dialog dialog = getDialog();
            if (dialog != null && (window2 = dialog.getWindow()) != null) {
                window2.setNavigationBarColor(-16777216);
                window2.setLayout((int) C497740JfY.LIZIZ(375.0f), -1);
            }
            Runnable runnable = this.LLJJIJI;
            if (runnable != null) {
                C786410Ut5.LJLIIL(10L, new BPEAHandler(Looper.getMainLooper()), runnable);
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(GiftDialogVisibilityChannel.class, Boolean.TRUE);
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(GiftDialogVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C0U56 getPanelType() {
        return C0U56.PANEL_GIFT;
    }

    public final void MR(AbstractC1132980faa abstractC1132980faa) {
        Room room = this.LLILLL;
        if (room != null && room.getId() != 0) {
            GiftManager.inst().getGiftRepository().LJFF(3, room.getId(), this.LLILZ, abstractC1132980faa, "");
        }
    }

    public final void OR(List<? extends GiftPage> list) {
        User user;
        long id;
        int iIntValue;
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        C1128630fTZ c1128630fTZ;
        MutableLiveData<Integer> mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3;
        C177100m9 filterManager = GiftManager.inst().getFilterManager();
        ArrayList arrayList = new ArrayList();
        C1130790fX3 c1130790fX3 = this.LLJI;
        if (c1130790fX3 != null) {
            user = c1130790fX3.LIZ;
        } else {
            user = null;
        }
        EnumC1125400fOM enumC1125400fOM = this.LLILZLL;
        if (user != null && enumC1125400fOM != null) {
            arrayList.add(new C1125380fOK(user, enumC1125400fOM));
        }
        Room room = this.LLILLL;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        filterManager.LIZ(id, list, arrayList);
        ((ArrayList) this.LLJJIJIIJIL).clear();
        Iterator<? extends GiftPage> it2 = list.iterator();
        boolean z = false;
        while (true) {
            iIntValue = 1;
            if (!it2.hasNext()) {
                break;
            }
            GiftPage next = it2.next();
            C1128630fTZ c1128630fTZ2 = this.LLIZ;
            if (c1128630fTZ2 != null && (mutableLiveData3 = c1128630fTZ2.LIZIZ) != null) {
                Integer value2 = mutableLiveData3.getValue();
                int i = next.pageType;
                if (value2 != null && value2.intValue() == i) {
                    z = true;
                }
            }
            ((ArrayList) this.LLJJIJIIJIL).add(next);
        }
        if (!z && (c1128630fTZ = this.LLIZ) != null && (mutableLiveData2 = c1128630fTZ.LIZIZ) != null) {
            mutableLiveData2.setValue(1);
        }
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.LLILZIL;
        if (liveNewGiftPanelWidget != null) {
            List<GiftPage> list2 = this.LLJJIJIIJIL;
            liveNewGiftPanelWidget.LLIZLLLIL.clear();
            liveNewGiftPanelWidget.LLIZLLLIL.addAll(list2);
            for (GiftPage giftPage : liveNewGiftPanelWidget.LLIZLLLIL) {
                if (LiveGiftJavaToKotlinGiftManagerSetting.isEnabled()) {
                    if (liveNewGiftPanelWidget.LLIZ == EnumC1125400fOM.GUEST) {
                        C1133010fad c1133010fad = GiftManagerKotlin.Companion;
                        List<Gift> list3 = giftPage.gifts;
                        c1133010fad.getClass();
                        C1133010fad.LIZIZ(list3);
                    } else {
                        C1133010fad c1133010fad2 = GiftManagerKotlin.Companion;
                        List<Gift> list4 = giftPage.gifts;
                        c1133010fad2.getClass();
                        C1133010fad.LIZLLL(list4);
                    }
                    C1133010fad c1133010fad3 = GiftManagerKotlin.Companion;
                    List<Gift> list5 = giftPage.gifts;
                    c1133010fad3.getClass();
                    C1133010fad.LIZJ(list5);
                    C1133010fad.LIZ(giftPage.gifts);
                } else {
                    if (liveNewGiftPanelWidget.LLIZ == EnumC1125400fOM.GUEST) {
                        GiftManager.filterInteractNotSupportGift(giftPage.gifts, liveNewGiftPanelWidget.LLILZLL);
                    } else {
                        GiftManager.filterNotSupportGift(giftPage.gifts, liveNewGiftPanelWidget.LLILZLL);
                    }
                    GiftManager.filterNotDisplayedOnPanel(giftPage.gifts);
                    GiftManager.filterFirstRechargeGift(giftPage.gifts);
                }
                Iterator<Gift> it3 = giftPage.gifts.iterator();
                while (it3.hasNext()) {
                    Gift next2 = it3.next();
                    if (next2.isRandomGift || next2.LIZIZ() || next2.LJFF() || next2.LIZJ() || next2.LJI() || next2.LJIIIIZZ() || next2.LJII()) {
                        it3.remove();
                    }
                }
            }
            if (!liveNewGiftPanelWidget.LLJJIJI) {
                liveNewGiftPanelWidget.LLJJIJI = true;
                C1128630fTZ c1128630fTZ3 = liveNewGiftPanelWidget.LLJI;
                if (c1128630fTZ3 != null && (mutableLiveData = c1128630fTZ3.LIZIZ) != null && (value = mutableLiveData.getValue()) != null) {
                    iIntValue = value.intValue();
                }
                liveNewGiftPanelWidget.z1(iIntValue, false, liveNewGiftPanelWidget.LLIZLLLIL);
            }
        }
        LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.LLJ;
        if (liveNewGiftBottomWidget != null) {
            List<GiftPage> list6 = this.LLJJIJIIJIL;
            String str = this.LLJJJJ;
            liveNewGiftBottomWidget.LLJIJIL = list6;
            liveNewGiftBottomWidget.y1(str);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<PrivilegeCenterConfig> mutableLiveData3;
        super.onCreate(bundle);
        C1128590fTV.LJIIIIZZ = SystemClock.uptimeMillis();
        C1130220fW8.LIZ.LIZ = true;
        this.LLJJI = SystemClock.uptimeMillis();
        C1130430fWT.LIZ.LIZ = true;
        C1130100fVw.LIZ.LJIILIIL = true;
        this.LLIZLLLIL = (GiftPrivilegeCenterViewModel) ViewModelProviders.of(this).get(GiftPrivilegeCenterViewModel.class);
        if (isAdded()) {
            GiftPrivilegeCenterViewModel giftPrivilegeCenterViewModel = this.LLIZLLLIL;
            if (giftPrivilegeCenterViewModel != null && (mutableLiveData3 = giftPrivilegeCenterViewModel.LL) != null) {
                mutableLiveData3.observe(this, new AObserverS211S0100000_7(this, 5));
            }
            GiftPrivilegeCenterViewModel giftPrivilegeCenterViewModel2 = this.LLIZLLLIL;
            if (giftPrivilegeCenterViewModel2 != null && (mutableLiveData2 = giftPrivilegeCenterViewModel2.LLILLJJLI) != null) {
                mutableLiveData2.observe(this, new AObserverS211S0100000_7(this, 6));
            }
            GiftPrivilegeCenterViewModel giftPrivilegeCenterViewModel3 = this.LLIZLLLIL;
            if (giftPrivilegeCenterViewModel3 != null && (mutableLiveData = giftPrivilegeCenterViewModel3.LLILLL) != null) {
                mutableLiveData.observe(this, new AObserverS211S0100000_7(this, 7));
            }
        }
    }

    public final void NR(PrivilegeCenterConfig privilegeCenterConfig, boolean z) {
        if (privilegeCenterConfig.showEntrance) {
            View view = this.LLJIJIL;
            boolean z2 = false;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            View view2 = this.LLJILJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            C498240JgM.LIZ(new C498250JgN(this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, privilegeCenterConfig, this.dataChannel, C0UX6.RED_DOT_LIVE_PRIVILEGE_CENTER, R.drawable.dl8, R.drawable.dth, z));
            if (z) {
                DataChannel dataChannel = this.dataChannel;
                Room room = this.LLILLL;
                View view3 = this.LLJJ;
                if (view3 != null && C500260Jjc.LJJJJIZL(view3)) {
                    z2 = true;
                }
                C498240JgM.LJFF("show", "gift_panel", dataChannel, room, z2);
            }
        } else {
            View view4 = this.LLJIJIL;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            View view5 = this.LLJILJIL;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            View view6 = this.LLJJ;
            if (view6 != null) {
                C786410Ut5.LJLLLLLL(8, view6);
            }
        }
        View view7 = this.LLJILJIL;
        if (view7 != null) {
            C786410Ut5.I7(new ACListenerS111S0200000_7(this, privilegeCenterConfig, 14), view7);
        }
    }

    /* JADX WARN: Type inference failed for: r0v77, types: [X.0fUS] */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<C2284981EcC> mutableLiveData2;
        MutableLiveData<C1128680fTe> mutableLiveData3;
        long jLongValue;
        View viewFindViewById;
        View viewFindViewById2;
        C1324720kZq c1324720kZq;
        C1324720kZq c1324720kZq2;
        View viewFindViewById3;
        MutableLiveData<Long> mutableLiveData4;
        Long value;
        boolean zBooleanValue;
        super.onViewCreated(view, bundle);
        C1129310fUf.LIZ.getClass();
        C1129310fUf.LJFF = C1129310fUf.LJI;
        C1129310fUf.LIZLLL = C1129310fUf.LJ;
        String str = C1129310fUf.LIZJ;
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C1129310fUf.LIZIZ = str;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            this.LLILLL = (Room) dataChannel.gg0(RoomChannel.class);
            Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.LLILZ = zBooleanValue;
        }
        View view3 = getView();
        if (view3 != null) {
            this.LLJJLIIIJLLLLLLLZ = (C1129900fVc) view3.findViewById(R.id.iz0);
            this.LLJJJJLIIL = (C16FZ) view3.findViewById(R.id.iz7);
            this.LLJJL = view3.findViewById(R.id.h2v);
            ((C19MX) view3.findViewById(R.id.btf)).setReferencedIds(new int[]{R.id.jf9, R.id.nka, R.id.y_b});
        }
        View view4 = getView();
        if (view4 != null && getContext() != null && this.dataChannel != null) {
            C1128590fTV.LJIIIZ = SystemClock.uptimeMillis();
            C1128590fTV.LJIIJ = SystemClock.uptimeMillis();
            WidgetManager widgetManagerOf = WidgetManager.of(this, view4, C486790J7d.LIZ);
            widgetManagerOf.mWidgetCreateTimeListener = this.LLJJJIL;
            LiveNewGiftPanelWidget liveNewGiftPanelWidget = new LiveNewGiftPanelWidget();
            liveNewGiftPanelWidget.LLLFF = this.LLJJJJ;
            liveNewGiftPanelWidget.LLJI = this.LLIZ;
            EnumC1125400fOM enumC1125400fOM = this.LLILZLL;
            if (enumC1125400fOM != null) {
                liveNewGiftPanelWidget.LLIZ = enumC1125400fOM;
            }
            liveNewGiftPanelWidget.LLJILJILJ = this.LLJJIII;
            liveNewGiftPanelWidget.LLJJJ = getDialog();
            liveNewGiftPanelWidget.LLJLILLLLZIIL = this.LLJJI;
            this.LLILZIL = liveNewGiftPanelWidget;
            C1128630fTZ c1128630fTZ = this.LLIZ;
            if (c1128630fTZ != null && (mutableLiveData4 = c1128630fTZ.LJI) != null && (value = mutableLiveData4.getValue()) != null) {
                jLongValue = value.longValue();
            } else {
                jLongValue = 0;
            }
            long jLIZIZ = C1131900fYq.LIZIZ(getContext(), "default_dialog_item");
            if (jLongValue == 0) {
                jLongValue = jLIZIZ;
            }
            LiveNewGiftPanelWidget liveNewGiftPanelWidget2 = this.LLILZIL;
            if (liveNewGiftPanelWidget2 != null) {
                liveNewGiftPanelWidget2.LLJIJIL = jLongValue;
            }
            widgetManagerOf.load(R.id.p77, liveNewGiftPanelWidget2, false);
            LiveNewGiftPageIndicatorWidget liveNewGiftPageIndicatorWidget = new LiveNewGiftPageIndicatorWidget();
            liveNewGiftPageIndicatorWidget.LLILLL = this.LLIZ;
            widgetManagerOf.load(R.id.pyf, liveNewGiftPageIndicatorWidget);
            LiveNewGiftBottomWidget liveNewGiftBottomWidget = new LiveNewGiftBottomWidget();
            liveNewGiftBottomWidget.LLJJJJ = this.LLIZ;
            liveNewGiftBottomWidget.LLJILJIL = this.LLJJIII;
            this.LLJ = liveNewGiftBottomWidget;
            widgetManagerOf.load(R.id.p5v, liveNewGiftBottomWidget, false);
            List<GiftPage> list = this.LLILLJJLI;
            View viewFindViewById4 = null;
            if (list == null) {
                list = null;
            }
            LiveNewGiftPanelWidget liveNewGiftPanelWidget3 = this.LLILZIL;
            if (liveNewGiftPanelWidget3 != null) {
                liveNewGiftPanelWidget3.LLJZIJLIL = 1;
            }
            if (list.isEmpty()) {
                this.LLJJJJJIL = new AbstractC1132980faa() { // from class: X.0fUS
                    @Override // X.AbstractC1132980faa
                    public final void LIZIZ(List<Gift> list2) {
                    }

                    @Override // X.AbstractC1132980faa
                    public final void LIZLLL() {
                        C20441214yg.LIZIZ("LiveNewGiftDialog", "onSyncLoading: ");
                        C1129900fVc c1129900fVc = this.LIZ.LLJJLIIIJLLLLLLLZ;
                        if (c1129900fVc == null) {
                            c1129900fVc = null;
                        }
                        C786410Ut5.LJLLLLLL(8, c1129900fVc);
                        C1128590fTV.LJ++;
                        C1128590fTV.LJFF = SystemClock.uptimeMillis();
                        C16FZ c16fz = this.LIZ.LLJJJJLIIL;
                        C786410Ut5.LJLLLLLL(0, c16fz != null ? c16fz : null);
                        LiveNewGiftPanelWidget liveNewGiftPanelWidget4 = this.LIZ.LLILZIL;
                        if (liveNewGiftPanelWidget4 != null) {
                            liveNewGiftPanelWidget4.LLJZ = 2;
                        }
                    }

                    @Override // X.AbstractC1132980faa
                    public final void LIZ(int i, String str2) {
                        C1128590fTV.LIZJ = i;
                        C1128590fTV.LIZLLL = str2;
                        C16FZ c16fz = this.LIZ.LLJJJJLIIL;
                        C1129900fVc c1129900fVc = null;
                        if (c16fz == null) {
                            c16fz = null;
                        }
                        C786410Ut5.LJLLLLLL(8, c16fz);
                        C1129900fVc c1129900fVc2 = this.LIZ.LLJJLIIIJLLLLLLLZ;
                        if (c1129900fVc2 == null) {
                            c1129900fVc2 = null;
                        }
                        C786410Ut5.LJLLLLLL(0, c1129900fVc2);
                        LiveNewGiftDialog liveNewGiftDialog = this.LIZ;
                        LiveNewGiftPanelWidget liveNewGiftPanelWidget4 = liveNewGiftDialog.LLILZIL;
                        if (liveNewGiftPanelWidget4 != null) {
                            liveNewGiftPanelWidget4.LLJZ = 0;
                        }
                        C1129900fVc c1129900fVc3 = liveNewGiftDialog.LLJJLIIIJLLLLLLLZ;
                        if (c1129900fVc3 != null) {
                            c1129900fVc = c1129900fVc3;
                        }
                        C786410Ut5.h8(c1129900fVc.LL, new ACListenerS152S0100000_17(new AwS561S0100000_17(liveNewGiftDialog, 601), 165));
                    }

                    @Override // X.AbstractC1132980faa
                    public final void LIZJ(List list2, GiftsInfo giftsInfo, GiftStrategyData giftStrategyData, long j, int i) {
                        C1129900fVc c1129900fVc = this.LIZ.LLJJLIIIJLLLLLLLZ;
                        C16FZ c16fz = null;
                        if (c1129900fVc == null) {
                            c1129900fVc = null;
                        }
                        C786410Ut5.LJLLLLLL(8, c1129900fVc);
                        C16FZ c16fz2 = this.LIZ.LLJJJJLIIL;
                        if (c16fz2 != null) {
                            c16fz = c16fz2;
                        }
                        C786410Ut5.LJLLLLLL(8, c16fz);
                        if (list2 != null) {
                            LiveNewGiftDialog liveNewGiftDialog = this.LIZ;
                            LiveNewGiftPanelWidget liveNewGiftPanelWidget4 = liveNewGiftDialog.LLILZIL;
                            if (liveNewGiftPanelWidget4 != null) {
                                liveNewGiftPanelWidget4.LLJZIJLIL = 0;
                            }
                            liveNewGiftDialog.OR(list2);
                            C1128590fTV.LJJIZ = SystemClock.uptimeMillis();
                        }
                    }
                };
                MR(this.LLJJJJJIL);
            } else {
                OR(list);
                C1128590fTV.LJJIZ = SystemClock.uptimeMillis();
                MR(null);
            }
            if (this.LLILZLL == EnumC1125400fOM.GUEST) {
                LiveNewGiftGuestInfoWidget liveNewGiftGuestInfoWidget = new LiveNewGiftGuestInfoWidget();
                liveNewGiftGuestInfoWidget.LL = this.LLIZ;
                widgetManagerOf.load(R.id.ixt, liveNewGiftGuestInfoWidget);
                View view5 = getView();
                if (view5 != null && (viewFindViewById3 = view5.findViewById(R.id.ixt)) != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById3);
                }
            }
            if (getView() != null) {
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveCPCViewModel.class);
                AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 920);
                LiveCPCViewModel liveCPCViewModel = (LiveCPCViewModel) new lifecycleAwareLazy(this, awS560S0100000_16, new AwS146S0400000_17(this, awS560S0100000_16, c19719912DlLIZ, AFwS301S0000000_17.get$arr$(21), 5)).getValue();
                View viewFindViewById5 = this.LL;
                if (viewFindViewById5 == null) {
                    View view6 = getView();
                    if (view6 != null) {
                        viewFindViewById5 = view6.findViewById(R.id.nka);
                    } else {
                        viewFindViewById5 = null;
                    }
                    this.LL = (C1133890fc3) viewFindViewById5;
                }
                C1132570fZv.LJ(this, liveCPCViewModel, (C1133890fc3) viewFindViewById5, true, new AwS596S0100000_17(this, 655), null);
            }
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById = view7.findViewById(R.id.rvu);
            } else {
                viewFindViewById = null;
            }
            this.LLJIJIL = viewFindViewById;
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById2 = view8.findViewById(R.id.rvq);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJILJIL = viewFindViewById2;
            View view9 = getView();
            if (view9 != null) {
                c1324720kZq = (C1324720kZq) view9.findViewById(R.id.lrx);
            } else {
                c1324720kZq = null;
            }
            this.LLJILJILJ = c1324720kZq;
            View view10 = getView();
            if (view10 != null) {
                c1324720kZq2 = (C1324720kZq) view10.findViewById(R.id.lry);
            } else {
                c1324720kZq2 = null;
            }
            this.LLJILLL = c1324720kZq2;
            View view11 = getView();
            if (view11 != null) {
                viewFindViewById4 = view11.findViewById(R.id.rvz);
            }
            this.LLJJ = viewFindViewById4;
            PrivilegeCenterConfig privilegeCenterConfigLJI = C498240JgM.LJI();
            NR(privilegeCenterConfigLJI, false);
            GiftPrivilegeCenterViewModel giftPrivilegeCenterViewModel = this.LLIZLLLIL;
            if (giftPrivilegeCenterViewModel != null) {
                giftPrivilegeCenterViewModel.vQ2(privilegeCenterConfigLJI, this.LLILLL);
            }
            C1128590fTV.LJIIJJI = SystemClock.uptimeMillis();
        }
        C1128630fTZ c1128630fTZ2 = this.LLIZ;
        if (c1128630fTZ2 != null && (mutableLiveData3 = c1128630fTZ2.LIZJ) != null) {
            mutableLiveData3.observe(this, new AObserverS221S0100000_17(this, 50));
        }
        C1128630fTZ c1128630fTZ3 = this.LLIZ;
        if (c1128630fTZ3 != null && (mutableLiveData2 = c1128630fTZ3.LIZLLL) != null) {
            mutableLiveData2.observe(this, new AObserverS221S0100000_17(this, 51));
        }
        C1128630fTZ c1128630fTZ4 = this.LLIZ;
        if (c1128630fTZ4 != null && (mutableLiveData = c1128630fTZ4.LJ) != null) {
            mutableLiveData.observe(this, new AObserverS221S0100000_17(this, 52));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.LC0(GiftDialogDismissEvent.class, Boolean.TRUE);
            dataChannel2.CQ2(GiftDialogDismissEvent.class, this, new AwS586S0100000_7(this, 553));
        }
        this.LLJJJ.LIZ(C784440Upu.LIZ().LJ(C1124340fMe.class).LJJLJLI(new AfS186S0100000_17(this, 167)));
        if (RedDotAssetsSetting.INSTANCE.enableAssetsRedDot() && (view2 = this.LLJJ) != null) {
            RedDotExtensionKt.LJIIJ(C0UX6.RED_DOT_LIVE_PRIVILEGE_CENTER, view2, this, null, "watch_gift", 4);
        }
        C1130790fX3 c1130790fX3 = this.LLJI;
        if (c1130790fX3 != null) {
            getContext();
            c1130790fX3.getClass();
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
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

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
