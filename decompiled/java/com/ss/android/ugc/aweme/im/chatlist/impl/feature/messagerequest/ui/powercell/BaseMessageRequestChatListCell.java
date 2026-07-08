package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell;

import X.AbstractC884010Ym7;
import X.AbstractC885530YoZ;
import X.AbstractC885540Yoa;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0I0B;
import X.C0PEM;
import X.C13LE;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C300860Bqm;
import X.C443120HZe;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C878960Ydy;
import X.C879050Ye7;
import X.C882940YkO;
import X.C885310YoD;
import X.C885320YoE;
import X.C886410Ypz;
import X.C886420Yq0;
import X.C894470Z7d;
import X.EnumC871430YGn;
import X.InterfaceC1493505sz;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS114S0100000_14;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVMV2;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestPageVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestRootPageVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseMessageRequestChatListCell<ITEM extends AbstractC885540Yoa<?>> extends PowerCell<ITEM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19((BaseMessageRequestChatListCell) this, 1491));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19((BaseMessageRequestChatListCell) this, 1492));
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public AbstractC885530YoZ LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseMessageRequestChatListCell.class, "newListVM", "getNewListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVMV2;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BaseMessageRequestChatListCell.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVM;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public abstract void P5();

    public void R5(AbstractC885530YoZ abstractC885530YoZ) {
    }

    public abstract void S5(AbstractC885530YoZ abstractC885530YoZ);

    public void T5(AbstractC885530YoZ abstractC885530YoZ) {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cfb;
    }

    public BaseMessageRequestChatListCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestListVMV2.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 393);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(112);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 380), awS558S0100000_14, AFwS201S0000000_14.get$arr$(109), new AwS558S0100000_14((C03K6) this, 370), new AwS558S0100000_14((C03K6) this, 381), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 384), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 387), null, new AwS558S0100000_14((C03K6) this, 390));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14((C03K6) this, 366);
            AwS558S0100000_14 awS558S0100000_143 = new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 368);
            AwS558S0100000_14 awS558S0100000_144 = new AwS558S0100000_14(c19719912DlLIZ, 371);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS415S0200000_14((InterfaceC451590HnJ) obj, awS558S0100000_142, 29));
            AwS558S0100000_14 awS558S0100000_145 = new AwS558S0100000_14(c01gwLIZIZ, 376);
            AwS558S0100000_14 awS558S0100000_146 = new AwS558S0100000_14(c01gwLIZIZ, 379);
            AwS558S0100000_14 awS558S0100000_147 = new AwS558S0100000_14(c01gwLIZIZ, 382);
            AwS558S0100000_14 awS558S0100000_148 = new AwS558S0100000_14(c01gwLIZIZ, 385);
            AwS558S0100000_14 awS558S0100000_149 = new AwS558S0100000_14(c01gwLIZIZ, 388);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS558S0100000_144, awS558S0100000_14, new C452080Ho6(), awS558S0100000_145, awS558S0100000_146, awS558S0100000_143, aFwS248S0000000_14, awS558S0100000_147, awS558S0100000_148, awS558S0100000_149);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 391), awS558S0100000_14, AFwS201S0000000_14.get$arr$(108), new AwS558S0100000_14((C03K6) this, 328), new AwS558S0100000_14((C03K6) this, 332), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 336), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 339), null, new AwS558S0100000_14((C03K6) this, 342));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 345), awS558S0100000_14, AFwS201S0000000_14.get$arr$(110), new AwS558S0100000_14((C03K6) this, 349), new AwS558S0100000_14((C03K6) this, 351), new AwS558S0100000_14((C03K6) this, 354), aFwS248S0000000_14, null, null, new AwS558S0100000_14((C03K6) this, 357));
        }
        this.LLILLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageRequestListVM.class);
        AwS558S0100000_14 awS558S0100000_1410 = new AwS558S0100000_14(c19719912DlLIZ2, 360);
        AFwS248S0000000_14 aFwS248S0000000_142 = AFwS248S0000000_14.get$arr$(113);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ2, 365), awS558S0100000_1410, AFwS201S0000000_14.get$arr$(113), new AwS558S0100000_14((C03K6) this, 369), new AwS558S0100000_14((C03K6) this, 372), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 374), aFwS248S0000000_142, new AwS558S0100000_14((C03K6) this, 377), null, new AwS558S0100000_14((C03K6) this, 383));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS558S0100000_14 awS558S0100000_1411 = new AwS558S0100000_14((C03K6) this, 386);
            AwS558S0100000_14 awS558S0100000_1412 = new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 389);
            AwS558S0100000_14 awS558S0100000_1413 = new AwS558S0100000_14(c19719912DlLIZ2, 392);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS415S0200000_14((InterfaceC451590HnJ) obj, awS558S0100000_1411, 28));
            AwS558S0100000_14 awS558S0100000_1414 = new AwS558S0100000_14(c01gwLIZIZ2, 329);
            AwS558S0100000_14 awS558S0100000_1415 = new AwS558S0100000_14(c01gwLIZIZ2, 333);
            AwS558S0100000_14 awS558S0100000_1416 = new AwS558S0100000_14(c01gwLIZIZ2, 337);
            AwS558S0100000_14 awS558S0100000_1417 = new AwS558S0100000_14(c01gwLIZIZ2, 340);
            AwS558S0100000_14 awS558S0100000_1418 = new AwS558S0100000_14(c01gwLIZIZ2, 343);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS558S0100000_1413, awS558S0100000_1410, new C452080Ho6(), awS558S0100000_1414, awS558S0100000_1415, awS558S0100000_1412, aFwS248S0000000_142, awS558S0100000_1416, awS558S0100000_1417, awS558S0100000_1418);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ2, 347), awS558S0100000_1410, AFwS201S0000000_14.get$arr$(111), new AwS558S0100000_14((C03K6) this, 352), new AwS558S0100000_14((C03K6) this, 353), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 355), aFwS248S0000000_142, new AwS558S0100000_14((C03K6) this, 358), null, new AwS558S0100000_14((C03K6) this, 361));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ2, 363), awS558S0100000_1410, AFwS201S0000000_14.get$arr$(112), new AwS558S0100000_14((C03K6) this, 367), new AwS558S0100000_14((C03K6) this, 373), new AwS558S0100000_14((C03K6) this, 375), aFwS248S0000000_142, null, null, new AwS558S0100000_14((C03K6) this, 378));
        }
        this.LLILZ = assemVMLazy2;
        this.LLILZIL = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 344));
        this.LLILZLL = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 327));
        this.LLIZ = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 350));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 338));
        this.LLJ = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 359));
        this.LLJI = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 362));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 330));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 348));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 341));
        this.LLJILLL = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 334));
        this.LLJJ = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 346));
        this.LLJJI = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 335));
        this.LLJJIII = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 364));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 331));
        View view = this.itemView;
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS114S0100000_14(view, 12));
    }

    public final C443120HZe<AbstractC885530YoZ, C878960Ydy, Integer> L5() {
        C878960Ydy c878960YdyI5;
        AbstractC885530YoZ abstractC885530YoZ = this.LLJJIJIIJIL;
        if (abstractC885530YoZ == null || (c878960YdyI5 = I5()) == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(getBindingAdapterPosition());
        if (numValueOf.intValue() == -1) {
            numValueOf = Integer.valueOf(getAbsoluteAdapterPosition());
            if (numValueOf.intValue() == -1) {
                return null;
            }
        }
        return new C443120HZe<>(abstractC885530YoZ, c878960YdyI5, Integer.valueOf(numValueOf.intValue()));
    }

    public final C878960Ydy I5() {
        return getChunk() instanceof C894470Z7d ? N5().getState().LLILZ : N5().getState().LLILLL;
    }

    public final BaseMessageRequestListVM N5() {
        if (C300860Bqm.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
            return (BaseMessageRequestListVM) assemVMLazy.getValue();
        }
        AssemVMLazy assemVMLazy2 = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJIJIL;
        return (BaseMessageRequestListVM) assemVMLazy2.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        AbstractC885530YoZ abstractC885530YoZ;
        C886410Ypz c886410Ypz;
        super.onViewAttachedToWindow();
        C879050Ye7 c879050Ye7 = C879050Ye7.LIZ;
        EnumC871430YGn enumC871430YGnA1 = N5().a1();
        List<AbstractC885540Yoa<?>> list = N5().getState().LLILLJJLI;
        int size = list != null ? list.size() : -1;
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14((BaseMessageRequestChatListCell) this, 356);
        C0I0B c0i0b = C0I0B.LJFF;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = c0i0b.LIZIZ();
        if (!C879050Ye7.LIZJ) {
            C879050Ye7.LIZJ = true;
            c879050Ye7.LIZ("first_cell_show");
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C882940YkO(enumC871430YGnA1, interfaceC1493505szLIZIZ, size, awS558S0100000_14, null), 3);
        }
        if (C300860Bqm.LIZ()) {
            ((MessageRequestPageVM) this.LL.getValue()).An();
        } else {
            ((MessageRequestRootPageVM) this.LLILLJJLI.getValue()).An();
        }
        if (!(getChunk() instanceof C894470Z7d)) {
            N5().IQ2(getAbsoluteAdapterPosition());
        }
        C878960Ydy c878960YdyI5 = I5();
        if (c878960YdyI5 == null || (abstractC885530YoZ = this.LLJJIJIIJIL) == null) {
            return;
        }
        C885310YoD c885310YoD = C885310YoD.LIZ;
        int bindingAdapterPosition = getBindingAdapterPosition();
        InterfaceC1493505sz interfaceC1493505szLIZIZ2 = c0i0b.LIZIZ();
        c885310YoD.getClass();
        boolean z = abstractC885530YoZ instanceof C886410Ypz;
        if (!z && (abstractC885530YoZ instanceof C886420Yq0)) {
            String conversationId = ((C886420Yq0) abstractC885530YoZ).getKey().getConversationId();
            LinkedHashMap linkedHashMap = (LinkedHashMap) C885310YoD.LIZLLL;
            Object linkedHashSet = linkedHashMap.get(c878960YdyI5);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(c878960YdyI5, linkedHashSet);
            }
            Set set = (Set) linkedHashSet;
            if (!set.contains(conversationId)) {
                set.add(conversationId);
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) C885310YoD.LJ;
                Object linkedHashSet2 = linkedHashMap2.get(c878960YdyI5);
                if (linkedHashSet2 == null) {
                    linkedHashSet2 = new LinkedHashSet();
                    linkedHashMap2.put(c878960YdyI5, linkedHashSet2);
                }
                ((Set) linkedHashSet2).add(conversationId);
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C885320YoE(bindingAdapterPosition, abstractC885530YoZ, c878960YdyI5, interfaceC1493505szLIZIZ2, null), 3);
            }
        }
        c0i0b.LIZIZ();
        if (!z || (c886410Ypz = (C886410Ypz) abstractC885530YoZ) == null) {
            return;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("enter_from", "notification_page");
        AbstractC884010Ym7 unreadState = abstractC885530YoZ.getUnreadState();
        linkedHashMap3.put("unread_cnt", String.valueOf(Math.max(0, unreadState != null ? unreadState.getNum() : 0)));
        linkedHashMap3.put("cell_type", Intrinsics.LJFF(c886410Ypz.getKey().getKey(), "message_request_spam") ? "message_request_spam_entrance" : "");
        Integer numValueOf = Integer.valueOf(c886410Ypz.getConversations().size());
        if (numValueOf.intValue() > 0) {
            linkedHashMap3.put("total_chat_cnt", String.valueOf(numValueOf.intValue()));
        }
        C20684815ws.LJIILLIIL("im_stranger_request_list_cell_show", linkedHashMap3);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) this.LLJJIJI.getValue();
        if (iDMAvatarLoader != null) {
            iDMAvatarLoader.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r15, java.util.List r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.BaseMessageRequestChatListCell.onBindItemView(X.0zJl, java.util.List):void");
    }
}
