package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.settingpage;

import X.AnonymousClass0101;
import X.C011W;
import X.C01BC;
import X.C09JN;
import X.C0JKJ;
import X.C0K70;
import X.C0K8F;
import X.C0KPJ;
import X.C0UO0;
import X.C1086960eOM;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C1440005kM;
import X.C16F5;
import X.C16FZ;
import X.C197039127h;
import X.C19R6;
import X.C20743716Ff;
import X.C2097608Jq;
import X.C21538619Qy;
import X.C2660011e;
import X.C426770GoN;
import X.C470590Icr;
import X.C480460Ism;
import X.C493910JYn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C509550Jyb;
import X.C509770Jyx;
import X.C509840Jz4;
import X.C509850Jz5;
import X.C509890Jz9;
import X.C509950JzF;
import X.C509960JzG;
import X.C509990JzJ;
import X.C510380Jzw;
import X.C512750K8z;
import X.C748880TZe;
import X.C770500UKi;
import X.C786410Ut5;
import X.EnumC510330Jzr;
import X.InterfaceC500500Jk0;
import X.InterfaceC509740Jyu;
import X.InterfaceC509940JzE;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.settingpage.SubscriptionCommunityFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeGoalsLynxUrlSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.GetAnchorSubscriptionResponse;
import webcast.api.sub.SubPinRequest;
import webcast.api.sub.SubPinResponse;
import webcast.api.sub.SubUnPinRequest;
import webcast.api.sub.SubUnPinResponse;
import webcast.api.sub.Tip;
import webcast.api.sub.TipAction;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriptionCommunityFragment extends LiveDialogFragment implements InterfaceC509940JzE {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlHELIOSJyogO2sqJjo9LCQ4ICA9ZjYpPTs6JiI8KCg2ZhY5KzwwOiw8PSY8JgYjJCImJiw4MAkhKSIhLCEn";
    public C16FZ LL;
    public LinearLayout LLILLJJLI;
    public ConstraintLayout LLILLL;
    public C16F5 LLILZ;
    public ConstraintLayout LLILZIL;
    public ConstraintLayout LLILZLL;
    public C426770GoN LLIZ;
    public LinearLayout LLIZLLLIL;
    public C16F5 LLJ;
    public C509550Jyb LLJI;
    public C16F5 LLJIJIL;
    public LiveIconView LLJILJIL;
    public C19R6 LLJILJILJ;
    public C21538619Qy LLJILLL;
    public C509850Jz5 LLJJ;
    public ViewGroup LLJJI;
    public ViewGroup LLJJIII;
    public View LLJJIJI;
    public ProgressBar LLJJIJIIJIL;
    public C16F5 LLJJIJIL;
    public C16F5 LLJJJ;
    public ViewGroup LLJJJIL;
    public ViewGroup LLJJJJ;
    public ViewGroup LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public C16F5 LLJJL;
    public LiveIconView LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public C16F5 LLJLIL;
    public boolean LLJLILLLLZIIL;
    public ViewGroup LLJLL;
    public C16F5 LLJLLIL;
    public ViewGroup LLJLLL;
    public C20743716Ff LLJZ;
    public ViewGroup LLJZIJLIL;
    public C16F5 LLL;
    public ViewGroup LLLF;
    public int LLLFF;
    public FragmentManager LLLFFI;
    public Room LLLFZ;
    public C509770Jyx LLLI;
    public C11JF LLLII;
    public long LLLIIII;
    public boolean LLLIIIL;
    public ViewGroup LLLILZ;
    public C16F5 LLLILZJ;
    public C197039127h LLLILZLLLI;
    public LiveIconView LLLIZZ;
    public ViewGroup LLLJ;
    public C16F5 LLLJIL;
    public C16F5 LLLJL;
    public LiveIconView LLLL;
    public ViewGroup LLLLII;
    public C16F5 LLLLIIIILLL;
    public String LLLIIIIL = "";
    public final C509990JzJ LLLIIL = new Object() { // from class: X.0JzJ
    };
    public final C01BC LLLIILIL = new C01BC();
    public final C509960JzG LLLIL = new Object() { // from class: X.0JzG
    };

    static {
        new C0JKJ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final String NR() {
        int iIntValue;
        C1086960eOM c1086960eOMLI = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).lI();
        if (c1086960eOMLI == null) {
            return "quick_poll";
        }
        Room room = this.LLLFZ;
        Integer numLIZLLL = c1086960eOMLI.LIZLLL(room != null ? room.getId() : 0L);
        if (numLIZLLL == null || (iIntValue = numLIZLLL.intValue()) == 0) {
            return "quick_poll";
        }
        if (iIntValue == 2) {
            return "text_poll";
        }
        if (iIntValue == 3) {
            return "text_gift_poll";
        }
        if (iIntValue == 4) {
            return "quick_gift_poll";
        }
        if (iIntValue != 5) {
            return null;
        }
        return "emote_poll";
    }

    public final int OR() {
        C1086960eOM c1086960eOMLI = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).lI();
        if (c1086960eOMLI == null) {
            return 0;
        }
        Room room = this.LLLFZ;
        return c1086960eOMLI.LJIIIZ(room != null ? room.getId() : 0L) ? 1 : 0;
    }

    public final C426770GoN PR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wfz) : null;
            this.LLIZ = (C426770GoN) viewFindViewById;
        }
        return (C426770GoN) viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a2 A[PHI: r13
      0x03a2: PHI (r13v10 java.lang.Integer) = (r13v5 java.lang.Integer), (r13v11 java.lang.Integer) binds: [B:514:0x08be, B:223:0x03a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Type inference failed for: r0v207 */
    /* JADX WARN: Type inference failed for: r0v208, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v386 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12, types: [X.0IjA] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v28 int, still in use, count: 2, list:
          (r6v28 int) from 0x0070: IF  (r6v28 int) < (10 int)  -> B:24:0x0072 A[HIDDEN] (LINE:112)
          (r6v28 int) from 0x0072: PHI (r6v27 int) = (r6v26 int), (r6v28 int) binds: [B:146:0x024f, B:23:0x0070] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RR() {
        /*
            Method dump skipped, instruction units count: 2512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.settingpage.SubscriptionCommunityFragment.RR():void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gbf);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 73;
        return c500980Jkm;
    }

    public final C16FZ getLoadingViewFromXml() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nnp) : null;
            this.LL = (C16FZ) viewFindViewById;
        }
        return (C16FZ) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C11JF c11jf = this.LLLII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        Context context = getContext();
        if (context != null) {
            ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).HW1(context, "subscription_pin_card_info", null);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLJ = null;
        this.LLIZLLLIL = null;
    }

    public final Map<String, String> MR(String str) {
        String string;
        String str2;
        User owner;
        SubscribeInfo subscribeInfo;
        User owner2;
        String string2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room = this.LLLFZ;
        String str3 = "";
        if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("room_id", string);
        Room room2 = this.LLLFZ;
        if (room2 != null && (owner2 = room2.getOwner()) != null && (string2 = Long.valueOf(owner2.getId()).toString()) != null) {
            str3 = string2;
        }
        linkedHashMap.put("anchor_id", str3);
        if (str == null) {
            str = this.LLLIIIIL;
        }
        linkedHashMap.put("show_entrance", str);
        Room room3 = this.LLLFZ;
        if (room3 != null && (owner = room3.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && subscribeInfo.isSubscribed()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_subscribe", str2);
        linkedHashMap.put("previous_page_name", "subscription_management_popup");
        return linkedHashMap;
    }

    public final void WR(boolean z) {
        ViewGroup viewGroup = this.LLJJI;
        if (viewGroup != null) {
            C500260Jjc.LJLJLJ(viewGroup, z);
        }
        ViewGroup viewGroup2 = this.LLLILZ;
        if (viewGroup2 != null) {
            C500260Jjc.LJLJLJ(viewGroup2, z);
        }
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.y69);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (LinearLayout) viewFindViewById;
            if (viewFindViewById == null) {
                return;
            }
        }
        C500260Jjc.LJLJLJ(viewFindViewById, z);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C1440005kM.LIZ(new IEvent() { // from class: X.0JzC
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        super.onCancel(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FragmentManager fragmentManager;
        String string;
        long id;
        User owner;
        String secUid;
        boolean zLJI = MethodIDManager.LJI(202243);
        super.onCreate(bundle);
        C0K70.LJFF(requireContext(), "SubscriptionCommunityFragment", this.LLLIIIIL, "sub_community");
        DataChannel dataChannel = this.dataChannel;
        Room room = null;
        if (dataChannel != null) {
            fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        } else {
            fragmentManager = null;
        }
        this.LLLFFI = fragmentManager;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.gg0(RoomChannel.class);
        }
        this.LLLFZ = room;
        boolean zLJI2 = MethodIDManager.LJI(202493);
        C480460Ism.LIZ().getClass();
        SubscribeApi subscribeApi = (SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class);
        Room room2 = this.LLLFZ;
        String str = "";
        if (room2 == null || (string = Long.valueOf(room2.getId()).toString()) == null) {
            string = "";
        }
        C11NZ<C470590Icr<GetAnchorSubscriptionResponse.Data>> anchorSubscriptionInfo = subscribeApi.getAnchorSubscriptionInfo(string);
        EnumC510330Jzr enumC510330Jzr = EnumC510330Jzr.GENERAL;
        C11NZ c11nzLJIILIIL = C510380Jzw.LJIILJJIL(anchorSubscriptionInfo, enumC510330Jzr, this.LLLIIIIL, "sub/anchor/subscription/management", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0());
        Room room3 = this.LLLFZ;
        if (room3 != null && (owner = room3.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
            str = secUid;
        }
        Room room4 = this.LLLFZ;
        if (room4 != null) {
            id = room4.getId();
        } else {
            id = 0;
        }
        C11NZ.LJLLILLLL(c11nzLJIILIIL, C510380Jzw.LJIILJJIL(subscribeApi.getAnchorSubscriptionManagement(str, id), enumC510330Jzr, this.LLLIIIIL, "sub/anchor/tools/management", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0()), new InterfaceC500500Jk0() { // from class: X.0Jz1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
            @Override // X.InterfaceC500500Jk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r33, java.lang.Object r34) {
                /*
                    r32 = this;
                    r2 = r34
                    r0 = r33
                    com.bytedance.android.live.network.response.BaseResponse r0 = (com.bytedance.android.live.network.response.BaseResponse) r0
                    com.bytedance.android.live.network.response.BaseResponse r2 = (com.bytedance.android.live.network.response.BaseResponse) r2
                    X.0Jyx r16 = new X.0Jyx
                    T r14 = r0.data
                    webcast.api.sub.GetAnchorSubscriptionResponse$Data r14 = (webcast.api.sub.GetAnchorSubscriptionResponse.Data) r14
                    r0 = 0
                    if (r14 == 0) goto L6d
                    webcast.api.sub.PerksPinPanel r15 = r14.perksPinPanel
                    webcast.api.sub.Tip r13 = r14.tip
                    java.util.List<webcast.api.sub.SubscriberCountInfo> r12 = r14.countInfo
                    webcast.api.sub.SubGoal r11 = r14.subGoal
                L19:
                    r10 = 0
                    if (r14 == 0) goto L6b
                    boolean r1 = r14.hasPastGoal
                    r9 = 1
                    if (r1 != r9) goto L6b
                L21:
                    T r1 = r2.data
                    webcast.api.sub.SubManagementResponse$Data r1 = (webcast.api.sub.SubManagementResponse.Data) r1
                    if (r1 == 0) goto L69
                    com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig r8 = r1.liveSubOnlyConfig
                L29:
                    if (r14 == 0) goto L61
                    com.bytedance.android.livesdk.chatroom.api.TimerDetail r7 = r14.timerDetail
                    boolean r6 = r14.enableWaveStatus
                    com.bytedance.android.livesdk.subscribe.model.gift.SubGifInfo r5 = r14.giftSub
                    com.bytedance.android.livesdk.subscribe.model.SubLiveBanner r4 = r14.banner
                    com.bytedance.android.livesdk.chatroom.api.SubMilestoneInfo r3 = r14.milestoneInfo
                    boolean r2 = r14.anchorSendSubGiftAuth
                    com.bytedance.android.livesdk.chatroom.api.RedDot r1 = r14.redDot
                    boolean r10 = r14.hasQueue
                L3b:
                    if (r14 == 0) goto L3f
                    java.util.List<com.bytedance.android.livesdk.chatroom.api.UpdateTips> r0 = r14.transactionTips
                L3f:
                    r30 = r10
                    r31 = r0
                    r27 = r3
                    r28 = r2
                    r29 = r1
                    r26 = r4
                    r25 = r5
                    r24 = r6
                    r23 = r7
                    r22 = r8
                    r21 = r9
                    r20 = r11
                    r19 = r12
                    r18 = r13
                    r17 = r15
                    r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                    return r16
                L61:
                    r7 = r0
                    r6 = 0
                    r5 = r0
                    r4 = r0
                    r3 = r0
                    r2 = 0
                    r1 = r0
                    goto L3b
                L69:
                    r8 = r0
                    goto L29
                L6b:
                    r9 = 0
                    goto L21
                L6d:
                    r15 = r0
                    r13 = r0
                    r12 = r0
                    r11 = r0
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C509810Jz1.apply(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }).LJJLL(new C09JN() { // from class: X.0Jaf
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SubscriptionCommunityFragment@71f5.fetchSubscriptionInfo$1");
                C509770Jyx c509770Jyx = (C509770Jyx) obj;
                C0K70.LIZLLL(this.LL.getClass().getSimpleName(), this.LL.getContext());
                C16FZ loadingViewFromXml = this.LL.getLoadingViewFromXml();
                if (loadingViewFromXml != null) {
                    C500260Jjc.LJIILIIL(loadingViewFromXml);
                }
                SubscriptionCommunityFragment subscriptionCommunityFragment = this.LL;
                subscriptionCommunityFragment.LLLI = c509770Jyx;
                if (subscriptionCommunityFragment.isViewValid) {
                    subscriptionCommunityFragment.RR();
                }
                C1C7U.LIZIZ("SubscriptionCommunityFragment@71f5.fetchSubscriptionInfo$1");
            }
        }, new C09JN() { // from class: X.0JKv
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SubscriptionCommunityFragment@71f5.fetchSubscriptionInfo$2");
                C501540Jlg.LIZJ(this.LL.getContext(), (Throwable) obj);
                C16FZ loadingViewFromXml = this.LL.getLoadingViewFromXml();
                if (loadingViewFromXml != null) {
                    C500260Jjc.LJIILIIL(loadingViewFromXml);
                }
                C1C7U.LIZIZ("SubscriptionCommunityFragment@71f5.fetchSubscriptionInfo$2");
            }
        });
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final void UR(C509770Jyx c509770Jyx, ViewGroup viewGroup) {
        boolean z;
        String strLIZLLL;
        long id;
        String secUid;
        User owner;
        TipAction tipAction;
        TipAction tipAction2;
        TipAction tipAction3;
        TipAction tipAction4;
        DataChannel dataChannel;
        long id2;
        String secUid2;
        User owner2;
        TipAction tipAction5;
        TipAction tipAction6;
        Tip tip = c509770Jyx.LIZIZ;
        if (tip != null) {
            int i = tip.tipType;
            boolean z2 = true;
            int iLIZJ = 0;
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            String str = null;
            AnonymousClass0101 anonymousClass0101LIZ = null;
            AnonymousClass0101 anonymousClass0101LIZ2 = null;
            if (z) {
                TipAction tipAction7 = tip.tipAction;
                if (tipAction7 != null) {
                    int i2 = tipAction7.actionType;
                    long jLIZIZ = 0;
                    if (i2 != 1) {
                        if (i2 == 2 && (dataChannel = this.dataChannel) != null) {
                            C2660011e c2660011e = (C2660011e) dataChannel.gg0(C770500UKi.class);
                            if (c2660011e != null) {
                                anonymousClass0101LIZ = c2660011e.LIZ(InterfaceC509740Jyu.class);
                            }
                            InterfaceC509740Jyu interfaceC509740Jyu = (InterfaceC509740Jyu) anonymousClass0101LIZ;
                            if (interfaceC509740Jyu != null) {
                                SubUnPinRequest subUnPinRequest = new SubUnPinRequest();
                                Room room = this.LLLFZ;
                                if (room != null) {
                                    id2 = room.getId();
                                } else {
                                    id2 = 0;
                                }
                                subUnPinRequest.roomId = id2;
                                Tip tip2 = c509770Jyx.LIZIZ;
                                if (tip2 != null && (tipAction6 = tip2.tipAction) != null) {
                                    jLIZIZ = tipAction6.LIZIZ();
                                }
                                subUnPinRequest.unpinId = jLIZIZ;
                                Tip tip3 = c509770Jyx.LIZIZ;
                                if (tip3 != null && (tipAction5 = tip3.tipAction) != null) {
                                    iLIZJ = tipAction5.LIZJ();
                                }
                                subUnPinRequest.type = iLIZJ;
                                Room room2 = this.LLLFZ;
                                if (room2 == null || (owner2 = room2.getOwner()) == null || (secUid2 = owner2.getSecUid()) == null) {
                                    secUid2 = "";
                                }
                                subUnPinRequest.secAnchorId = secUid2;
                                C512750K8z<SubUnPinResponse> c512750K8z = new C512750K8z<>();
                                c512750K8z.LIZ = new C509890Jz9(this);
                                c512750K8z.LIZIZ = new C509950JzF();
                                interfaceC509740Jyu.LJIJJ(subUnPinRequest, c512750K8z);
                            }
                        }
                    } else {
                        String strLIZ = tipAction7.LIZ();
                        Tip tip4 = c509770Jyx.LIZIZ;
                        if (tip4 == null || (tipAction4 = tip4.tipAction) == null || tipAction4.LIZLLL().length() <= 0) {
                            z2 = false;
                        }
                        Tip tip5 = c509770Jyx.LIZIZ;
                        if (tip5 == null || (tipAction3 = tip5.tipAction) == null) {
                            strLIZLLL = "";
                        } else {
                            strLIZLLL = tipAction3.LIZLLL();
                        }
                        C011W.LIZ(strLIZ, false, z2, strLIZLLL, i2, String.valueOf(UserService.getInstance().user().getCurrentUserId()));
                        DataChannel dataChannel2 = this.dataChannel;
                        if (dataChannel2 != null) {
                            C2660011e c2660011e2 = (C2660011e) dataChannel2.gg0(C770500UKi.class);
                            if (c2660011e2 != null) {
                                anonymousClass0101LIZ2 = c2660011e2.LIZ(InterfaceC509740Jyu.class);
                            }
                            InterfaceC509740Jyu interfaceC509740Jyu2 = (InterfaceC509740Jyu) anonymousClass0101LIZ2;
                            if (interfaceC509740Jyu2 != null) {
                                SubPinRequest subPinRequest = new SubPinRequest();
                                Room room3 = this.LLLFZ;
                                if (room3 != null) {
                                    id = room3.getId();
                                } else {
                                    id = 0;
                                }
                                subPinRequest.roomId = id;
                                Tip tip6 = c509770Jyx.LIZIZ;
                                if (tip6 != null && (tipAction2 = tip6.tipAction) != null) {
                                    jLIZIZ = tipAction2.LIZIZ();
                                }
                                subPinRequest.pinId = jLIZIZ;
                                Tip tip7 = c509770Jyx.LIZIZ;
                                if (tip7 != null && (tipAction = tip7.tipAction) != null) {
                                    iLIZJ = tipAction.LIZJ();
                                }
                                subPinRequest.type = iLIZJ;
                                Room room4 = this.LLLFZ;
                                if (room4 == null || (owner = room4.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                                    secUid = "";
                                }
                                subPinRequest.secAnchorId = secUid;
                                C512750K8z<SubPinResponse> c512750K8z2 = new C512750K8z<>();
                                c512750K8z2.LIZ = new C509840Jz4(this, c509770Jyx);
                                interfaceC509740Jyu2.LIZLLL(subPinRequest, c512750K8z2);
                            }
                        }
                    }
                }
                SR(Integer.valueOf(c509770Jyx.LIZIZ.tipType), "livesdk_anchor_subscription_page_tips_click", "", "");
                dismiss();
                return;
            }
            if (i != 3 && i != 4) {
                if (i == 6) {
                    SR(Integer.valueOf(i), "livesdk_anchor_subscription_page_tips_click", "", "");
                    C0KPJ.f122me.LIZJ(Boolean.TRUE);
                    C0K8F c0k8f = C0K8F.LIZ;
                    Context context = getContext();
                    String edit_popup = SubscribeGoalsLynxUrlSetting.INSTANCE.getEdit_popup();
                    Map<String, String> mapMR = MR("anchor_subscription_tip");
                    c0k8f.getClass();
                    C0K8F.LJII(context, edit_popup, mapMR);
                    dismiss();
                    C500260Jjc.LJIILIIL(viewGroup);
                    return;
                }
                if (i == 7) {
                    SR(Integer.valueOf(i), "livesdk_anchor_subscription_page_tips_click", "", "");
                    C0K8F c0k8f2 = C0K8F.LIZ;
                    Context context2 = getContext();
                    String management_popup = SubscribeGoalsLynxUrlSetting.INSTANCE.getManagement_popup();
                    Map<String, String> mapMR2 = MR("anchor_subscription_tip");
                    c0k8f2.getClass();
                    C0K8F.LJII(context2, management_popup, mapMR2);
                    dismiss();
                    return;
                }
                TipAction tipAction8 = tip.tipAction;
                if (tipAction8 == null || tipAction8.actionType != 0) {
                    return;
                }
                IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                Context context3 = getContext();
                TipAction tipAction9 = c509770Jyx.LIZIZ.tipAction;
                if (tipAction9 != null) {
                    str = tipAction9.actionUrl;
                }
                iActionHandlerService.handle(context3, str);
                return;
            }
            SR(Integer.valueOf(i), "livesdk_anchor_subscription_page_tips_click", "", "");
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                C493910JYn c493910JYn = SubOnlyLiveSettingDialogNew.LLJLL;
                LiveSubOnlyConfig liveSubOnlyConfig = c509770Jyx.LJFF;
                boolean zKw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.dataChannel);
                c493910JYn.getClass();
                C493910JYn.LIZ(dataChannel3, "anchor_subscription_tip", liveSubOnlyConfig, "", false, zKw0);
            }
            dismiss();
        }
    }

    public final void VR(String str, Map<String, String> map) {
        C0K8F c0k8f = C0K8F.LIZ;
        Context context = getContext();
        String strPinManagementIntro = LiveSubscriptionAnchorUrlSetting.pinManagementIntro();
        c0k8f.getClass();
        C0K8F.LJII(context, strPinManagementIntro, map);
        Context context2 = getContext();
        if (context2 != null) {
            ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).CM(context2, Boolean.TRUE, str, null);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0K70.LIZJ(requireContext(), "SubscriptionCommunityFragment");
        this.LLJI = (C509550Jyb) view.findViewById(R.id.wea);
        this.LLJIJIL = (C16F5) view.findViewById(R.id.wef);
        this.LLJILJIL = (LiveIconView) view.findViewById(R.id.wed);
        this.LLJILJILJ = (C19R6) view.findViewById(R.id.wee);
        this.LLJILLL = (C21538619Qy) view.findViewById(R.id.bnu);
        this.LLJJ = (C509850Jz5) view.findViewById(R.id.ex3);
        this.LLJJI = (ViewGroup) view.findViewById(R.id.kml);
        this.LLLILZ = (ViewGroup) view.findViewById(R.id.p8d);
        this.LLLILZJ = (C16F5) view.findViewById(R.id.p7d);
        this.LLLILZLLLI = (C197039127h) view.findViewById(R.id.p7c);
        this.LLLIZZ = (LiveIconView) view.findViewById(R.id.e2v);
        this.LLLJ = (ViewGroup) view.findViewById(R.id.wip);
        this.LLLJIL = (C16F5) view.findViewById(R.id.yfv);
        this.LLLJL = (C16F5) view.findViewById(R.id.f774p86);
        this.LLLLIIIILLL = (C16F5) view.findViewById(R.id.watching_subscribers_count_v2);
        this.LLLL = (LiveIconView) view.findViewById(R.id.p85);
        this.LLLLII = (ViewGroup) view.findViewById(R.id.p88);
        this.LLJJIII = (ViewGroup) view.findViewById(R.id.wer);
        this.LLJJIJI = view.findViewById(R.id.fyx);
        this.LLJJIJIIJIL = (ProgressBar) view.findViewById(R.id.wet);
        this.LLJJIJIL = (C16F5) view.findViewById(R.id.wes);
        this.LLJJJ = (C16F5) view.findViewById(R.id.weu);
        this.LLJJJIL = (ViewGroup) view.findViewById(R.id.fdz);
        view.findViewById(R.id.fe0);
        this.LLJJJJ = (ViewGroup) view.findViewById(R.id.bw1);
        this.LLJJJJJIL = (ViewGroup) view.findViewById(R.id.slf);
        this.LLJJJJLIIL = (ViewGroup) view.findViewById(R.id.wha);
        this.LLJJL = (C16F5) view.findViewById(R.id.wh9);
        this.LLJJLIIIJLLLLLLLZ = (LiveIconView) view.findViewById(R.id.wh_);
        this.LLJL = (ViewGroup) view.findViewById(R.id.wn2);
        this.LLJLIL = (C16F5) view.findViewById(R.id.wn1);
        this.LLJLL = (ViewGroup) view.findViewById(R.id.wfo);
        this.LLJLLIL = (C16F5) view.findViewById(R.id.wfq);
        this.LLJLLL = (ViewGroup) view.findViewById(R.id.wf8);
        this.LLJZ = (C20743716Ff) view.findViewById(R.id.wf9);
        this.LLJZIJLIL = (ViewGroup) view.findViewById(R.id.wem);
        this.LLL = (C16F5) view.findViewById(R.id.wen);
        this.LLLF = (ViewGroup) view.findViewById(R.id.f5u);
        C16FZ loadingViewFromXml = getLoadingViewFromXml();
        if (loadingViewFromXml != null) {
            C500260Jjc.LLFFF(loadingViewFromXml);
        }
        ViewGroup viewGroup = this.LLJJI;
        if (viewGroup != null) {
            HandlerHook.viewPost(viewGroup, new Runnable() { // from class: X.0Jz3
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SubscriptionCommunityFragment@71f5.onViewCreated$1");
                    try {
                        SubscriptionCommunityFragment subscriptionCommunityFragment = this.LL;
                        ViewGroup viewGroup2 = subscriptionCommunityFragment.LLJJI;
                        subscriptionCommunityFragment.LLLFF = (viewGroup2 != null ? viewGroup2.getTop() : 0) - ((int) C497740JfY.LIZIZ(52.0f));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SubscriptionCommunityFragment@71f5.onViewCreated$1");
                }
            });
        }
        C509850Jz5 c509850Jz5 = this.LLJJ;
        if (c509850Jz5 != null) {
            ((ArrayList) c509850Jz5.LL).add(this);
        }
        WR(false);
        RR();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void SR(java.lang.Integer r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            X.0IjA r2 = X.C0IJT.LIZ(r6)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.dataChannel
            r2.LJIJJLI(r0)
            java.lang.String r1 = "show_entrance"
            java.lang.String r0 = r4.LLLIIIIL
            r2.LJJII(r0, r1)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LLLFZ
            r3 = 0
            if (r0 == 0) goto L93
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto L93
            long r0 = r0.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L23:
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LLLFZ
            if (r0 == 0) goto L34
            long r0 = r0.getId()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L34:
            java.lang.String r0 = "room_id"
            r2.LJJII(r3, r0)
            java.lang.String r0 = "pin_perk_id"
            r2.LJJII(r7, r0)
            java.lang.String r0 = "pin_template_id"
            r2.LJJII(r8, r0)
            if (r5 == 0) goto L90
            int r0 = r5.intValue()
            if (r0 != 0) goto L56
            java.lang.String r1 = "subscribers"
        L4d:
            java.lang.String r0 = "show_type"
            r2.LJJII(r1, r0)
            r2.LIZ()
            return
        L56:
            int r1 = r5.intValue()
            r0 = 1
            if (r1 != r0) goto L60
            java.lang.String r1 = "sub_goal"
            goto L4d
        L60:
            int r1 = r5.intValue()
            r0 = 2
            if (r1 != r0) goto L6a
            java.lang.String r1 = "customized_perks_pin"
            goto L4d
        L6a:
            int r1 = r5.intValue()
            r0 = 4
            if (r1 == r0) goto L8d
            int r1 = r5.intValue()
            r0 = 3
            if (r1 == r0) goto L8d
            int r1 = r5.intValue()
            r0 = 6
            if (r1 != r0) goto L82
            java.lang.String r1 = "sub_goal_edit"
            goto L4d
        L82:
            int r1 = r5.intValue()
            r0 = 8
            if (r1 != r0) goto L90
            java.lang.String r1 = "incentive_program"
            goto L4d
        L8d:
            java.lang.String r1 = "sub_only_live"
            goto L4d
        L90:
            java.lang.String r1 = ""
            goto L4d
        L93:
            r1 = r3
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.settingpage.SubscriptionCommunityFragment.SR(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC509940JzE
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        ViewGroup viewGroup = this.LLLF;
        if (viewGroup != null) {
            C786410Ut5.R4(C497740JfY.LJJI(i2 - this.LLLFF) / 24, viewGroup);
            if (viewGroup.getAlpha() > 0.0f) {
                C500260Jjc.LLFFF(viewGroup);
            } else {
                C500260Jjc.LJIILIIL(viewGroup);
            }
        }
    }
}
