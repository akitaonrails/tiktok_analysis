package com.ss.android.ugc.aweme.im.chatlist.impl;

import X.AbstractC20660015ss;
import X.AbstractC883730Ylf;
import X.C01GW;
import X.C06SP;
import X.C06SR;
import X.C0BBD;
import X.C0CYM;
import X.C0PEM;
import X.C0Y2X;
import X.C0YHJ;
import X.C0YSQ;
import X.C0Z31;
import X.C0Z4E;
import X.C0ZB7;
import X.C0ZCZ;
import X.C0ZHM;
import X.C1308910kAL;
import X.C1391960mKI;
import X.C1391990mKL;
import X.C13LE;
import X.C1477105qL;
import X.C1492005sk;
import X.C15438062q;
import X.C1697810uHb;
import X.C1729806q0;
import X.C1906570ziJ;
import X.C19212010Ec;
import X.C19719912Dl;
import X.C19EG;
import X.C20673215v0;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2296808zG;
import X.C23250099c;
import X.C270040AiA;
import X.C287770BPr;
import X.C287790BPt;
import X.C300720BqY;
import X.C300740Bqa;
import X.C419910GdJ;
import X.C452501pT;
import X.C622680Oba;
import X.C876590Ya9;
import X.C878970Ydz;
import X.C879730YfD;
import X.C880980YhE;
import X.C881270Yhh;
import X.C881500Yi4;
import X.C882120Yj4;
import X.C884080YmE;
import X.C885100Yns;
import X.C885150Ynx;
import X.C885830Yp3;
import X.C886310Ypp;
import X.C888520YtO;
import X.C888530YtP;
import X.C888540YtQ;
import X.C888550YtR;
import X.C888590YtV;
import X.C888640Yta;
import X.C888650Ytb;
import X.C888660Ytc;
import X.C888680Yte;
import X.C888690Ytf;
import X.C888700Ytg;
import X.C888710Yth;
import X.C888730Ytj;
import X.C888800Ytq;
import X.C888830Ytt;
import X.C888940Yu4;
import X.C889570Yv5;
import X.C890510Ywb;
import X.C897280ZHy;
import X.EnumC888580YtU;
import X.EnumC894560Z7m;
import X.InterfaceC1412005fq;
import X.InterfaceC1603190roz;
import X.InterfaceC1719806oO;
import X.InterfaceC754190TiD;
import X.InterfaceC876950Yaj;
import X.InterfaceC882680Yjy;
import X.InterfaceC882750Yk5;
import X.InterfaceC884180YmO;
import X.InterfaceC888840Ytu;
import X.InterfaceC889880Yva;
import X.InterfaceC889950Yvh;
import X.InterfaceC889970Yvj;
import X.InterfaceC890150Yw1;
import X.InterfaceC890430YwT;
import X.InterfaceC890500Ywa;
import X.InterfaceC893700Z4e;
import X.InterfaceC913280ZsE;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.chatlist.api.model.ChatInviteViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.DmFilterAddKeywordsBottomSheet;
import com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.DmFilterReportEventObserver;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.bubble.ChatListBubbleService;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui.MafChatListWidgetV2Injector;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.viewmodel.ChatInviteViewModelImpl;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.MessageInboxWidgetInjector;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.agegraduation.AgeGraduationWidgetInjector;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.TopNoticeInboxWidgetV2Injector;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatVH;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatWithStoryVH;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListMessageRequestCellVH;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS450S0200000_14;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMChatListImpl implements IMChatListApi, InterfaceC889970Yvj {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final List<InboxFragmentWidgetInjectProtocol> LJIILLIIL() {
        return C1697810uHb.LJIIJJI(new TopNoticeInboxWidgetV2Injector(), new AgeGraduationWidgetInjector(), new MessageInboxWidgetInjector(), new MafChatListWidgetV2Injector());
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final List<InboxFragmentWidgetInjectProtocol> LJJIIZI() {
        return C1697810uHb.LJIIJJI(new MessageInboxWidgetInjector(), new MafChatListWidgetV2Injector());
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final void LIZ() {
        ((C06SR) this.LLJIJIL.getValue()).LIZ().LJFF();
        C876590Ya9 c876590Ya9 = C876590Ya9.LIZ;
        boolean z = C0YHJ.LIZ().enableSessionScope;
        c876590Ya9.getClass();
        C876590Ya9.LIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi, com.ss.android.ugc.aweme.im.core.chatlist.api.service.IIMChatListApi
    public final InterfaceC890150Yw1 LIZIZ() {
        return (InterfaceC890150Yw1) this.LLIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final InterfaceC888840Ytu LIZLLL() {
        return (InterfaceC888840Ytu) this.LLILLJJLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final C0Y2X LJFF() {
        return new C0Y2X() { // from class: X.0YU7
            /* JADX WARN: Removed duplicated region for block: B:83:0x012f  */
            @Override // X.C0Y2X
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final long LIZ(X.C0Y8T r9) {
                /*
                    Method dump skipped, instruction units count: 310
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0YU7.LIZ(X.0Y8T):long");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final InterfaceC754190TiD LJI() {
        return (InterfaceC754190TiD) this.LLJILJILJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final void LJII() {
        C876590Ya9.LIZ.getClass();
        C876590Ya9.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final InterfaceC913280ZsE LJIIIIZZ() {
        return (InterfaceC913280ZsE) this.LLIZLLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final InterfaceC1412005fq LJIIJ() {
        return (ChatListBubbleService) this.LLJILJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final InterfaceC890500Ywa LJIIL() {
        return (InterfaceC890500Ywa) this.LLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final C0ZB7 LJIILIIL() {
        return (C0ZB7) this.LL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final void LJIILJJIL() {
        C0Z4E.LIZ.getClass();
        C0Z4E.LJIIJ("chat_inline_msg");
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final void LJIILL() {
        C888590YtV.LIZ.getClass();
        C888590YtV.LIZJ.set(true);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final C0Z31 LJIIZILJ() {
        return (C0Z31) this.LLILZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final void LJIJJ() {
        C888590YtV.LIZ.getClass();
        C888590YtV.LJFF.clear();
        C888590YtV.LJI = null;
        ((AtomicBoolean) C888590YtV.LJII.getValue()).set(false);
        C888590YtV.LJ = null;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final C890510Ywb LJIJJLI() {
        C270040AiA.LIZ();
        C270040AiA.LIZ();
        C270040AiA.LIZ();
        C270040AiA.LIZ();
        C270040AiA.LIZ();
        boolean z = (C287770BPr.LIZ() & 2) != 0;
        C287770BPr.LIZ();
        return new C890510Ywb(z, (C300740Bqa.LIZ() & 262144) != 0, C884080YmE.LIZ().useRecyclerViewPool, 16);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final InterfaceC1719806oO LJJI() {
        return (InterfaceC1719806oO) this.LLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final void LJJII() {
        C881270Yhh.LIZ.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C880980YhE(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final boolean LJJIII() {
        return C0CYM.LIZJ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final C0ZCZ LJJIIJ() {
        return (C0ZCZ) this.LLILZLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final void LJJIIJZLJL() {
        ((C06SR) this.LLJIJIL.getValue()).LIZ().LJFF();
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIILLIIL(((C06SR) this.LLJIJIL.getValue()).LIZ());
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final InterfaceC882750Yk5 LJJIJIL() {
        return (InterfaceC882750Yk5) this.LLILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final InterfaceC882680Yjy LJJIL() {
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        return C881500Yi4.LJ();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final boolean LJJJI() {
        C0Z4E.LIZ.getClass();
        return C0Z4E.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final InterfaceC884180YmO LJJJIL() {
        return (InterfaceC884180YmO) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final IMUserArchiveSettings LJJJJ() {
        ArchiveSettingPageViewModel.LL.getClass();
        return C878970Ydz.LIZ(true);
    }

    public IMChatListImpl() {
        C19212010Ec.LIZJ.LJJIFFI(this);
        this.LL = C452501pT.LIZIZ(new C888540YtQ());
        this.LLILLJJLI = C452501pT.LIZIZ(new C888710Yth());
        this.LLILLL = C452501pT.LIZIZ(new C888530YtP());
        this.LLILZ = C452501pT.LIZIZ(new C888520YtO());
        this.LLILZIL = C452501pT.LIZIZ(new C888550YtR());
        this.LLILZLL = C452501pT.LIZIZ(new C888660Ytc());
        this.LLIZ = C452501pT.LIZIZ(new C888650Ytb());
        this.LLIZLLLIL = C452501pT.LIZIZ(new C888680Yte());
        this.LLJ = C452501pT.LIZIZ(new C888700Ytg());
        this.LLJI = C452501pT.LIZIZ(new C888730Ytj());
        this.LLJIJIL = C452501pT.LIZIZ(new C06SP());
        this.LLJILJIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(348));
        this.LLJILJILJ = C452501pT.LIZIZ(new C888690Ytf());
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final InterfaceC893700Z4e LJIIJJI() {
        return C885150Ynx.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final boolean LJIJI() {
        return C287790BPt.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final void LJJ() {
        Activity activity;
        TikTokImApi tikTokImApiLIZJ = C1477105qL.LIZJ();
        if (tikTokImApiLIZJ != null) {
            tikTokImApiLIZJ.hashCode();
        }
        Boolean boolValueOf = Boolean.valueOf(C300720BqY.LIZ());
        if (boolValueOf != null) {
            boolValueOf.hashCode();
        }
        int i = 0;
        List<EnumC888580YtU> listLJIIJJI = C1697810uHb.LJIIJJI(EnumC888580YtU.SINGLE_CHAT, EnumC888580YtU.GROUP_CHAT, EnumC888580YtU.MESSAGE_REQUEST_CELL);
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJIIJJI, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EnumC888580YtU enumC888580YtU : listLJIIJJI) {
            Pair pair = new Pair(Integer.valueOf(enumC888580YtU.getResId()), enumC888580YtU.getResName());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Map<Integer, String> map = C1906570ziJ.LIZ;
        map.putAll(linkedHashMap);
        map.putAll(C2097908Jt.LIZJ(new Pair(Integer.valueOf(R.layout.cl0), "im_item_maf_chat_list_new")));
        map.putAll(C2097908Jt.LIZJ(new Pair(Integer.valueOf(R.layout.ckz), "im_item_maf_chat_list")));
        if ((C287770BPr.LIZ() & 32) != 0) {
            C888590YtV.LIZ.getClass();
            AtomicBoolean atomicBoolean = C888590YtV.LIZIZ;
            if (atomicBoolean.get() || C888590YtV.LIZJ.get()) {
                return;
            }
            atomicBoolean.set(true);
            synchronized (C885830Yp3.LL) {
                C885830Yp3.LLIZLLLIL = 1;
            }
            C888590YtV.LIZ("boot_finish");
            Object objLJFF = C2214201BlK.LJFF();
            Object obj = objLJFF instanceof InterfaceC1603190roz ? (InterfaceC1603190roz) objLJFF : null;
            if (!(obj instanceof C19EG) || (activity = (Activity) obj) == null) {
                return;
            }
            if (C19212010Ec.LIZJ.LJJIII()) {
                int[] iArr = {R.layout.cl0, R.layout.cl0};
                if (activity.isFinishing()) {
                    return;
                }
                do {
                    C20673215v0.LJI(iArr[i], activity);
                    i++;
                } while (i < 2);
                return;
            }
            int[] iArr2 = {R.layout.ckz, R.layout.ckz};
            if (activity.isFinishing()) {
                return;
            }
            do {
                C20673215v0.LJI(iArr2[i], activity);
                i++;
            } while (i < 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final InterfaceC890430YwT LJJJ() {
        return C882120Yj4.LIZ();
    }

    @Override // X.InterfaceC889970Yvj
    public final void QH0() {
        LJIILIIL().LJIIIIZZ();
        ((C06SR) this.LLJIJIL.getValue()).LIZ().LJFF();
        C886310Ypp c886310Ypp = C886310Ypp.LIZ;
        Keva kevaLJ = C886310Ypp.LJ();
        if (kevaLJ != null) {
            kevaLJ.clear();
        }
    }

    @Override // X.InterfaceC889970Yvj
    public final void eV0() {
        LJIILIIL().LJI();
        LJIILIIL().LIZJ();
        LJJIIJZLJL();
        LJJIJIL().LIZJ();
        ((C885100Yns) LJIIJJI()).LJII();
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C1492005sk(null));
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final InterfaceC889950Yvh LJIIIZ() {
        return C886310Ypp.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final InterfaceC889880Yva LJJIZ() {
        return C879730YfD.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final ChatInviteViewModel LJ(C19EG c19eg) {
        ChatInviteViewModel chatInviteViewModel;
        ChatInviteViewModelImpl.LLILZ.getClass();
        if (c19eg == null || (chatInviteViewModel = (ChatInviteViewModel) ViewModelProviders.of(c19eg, new ViewModelProvider.Factory() { // from class: X.06LE
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                return new ChatInviteViewModelImpl(0);
            }
        }).get(ChatInviteViewModelImpl.class)) == null) {
            return null;
        }
        return chatInviteViewModel;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final View LJJIIZ(Context context) {
        if (context != null) {
            try {
                return C0ZHM.LIZ(context).LIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final boolean LJJIJIIJIL(Context context) {
        C0Z4E.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableChatInlineMsg(): MessageRequestPromptExperiment.enableChatInlineMsg():");
        sbLIZ.append(C888800Ytq.LIZ());
        sbLIZ.append(", isU18FeatureEnabled():");
        sbLIZ.append(C0Z4E.LJI());
        sbLIZ.append(", isBusinessUser(): ");
        sbLIZ.append(C0Z4E.LJFF());
        sbLIZ.append(", checkPromptCanShow(SCENE_CHAT_INLINE_MSG):");
        sbLIZ.append(C0Z4E.LIZJ("chat_inline_msg"));
        C889570Yv5.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (C888800Ytq.LIZ() && C0Z4E.LJI() && !C0Z4E.LJFF() && C0Z4E.LIZJ("chat_inline_msg") && C0Z4E.LJ(context, "chat_inline_msg") != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final int LJJIJLIJ(C19719912Dl c19719912Dl) {
        if (Intrinsics.LJFF(c19719912Dl, C13LE.LIZ(SessionListSingleChatVH.class))) {
            return C884080YmE.LIZ().dmViewHolderCacheSize;
        }
        if (Intrinsics.LJFF(c19719912Dl, C13LE.LIZ(SessionListGroupChatVH.class))) {
            return C884080YmE.LIZ().dmViewHolderCacheSize;
        }
        if (Intrinsics.LJFF(c19719912Dl, C13LE.LIZ(SessionListGroupChatWithStoryVH.class))) {
            return C884080YmE.LIZ().dmViewHolderCacheSize;
        }
        if (Intrinsics.LJFF(c19719912Dl, C13LE.LIZ(SessionListMessageRequestCellVH.class))) {
            return 1;
        }
        return 5;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final boolean LJIL(String str, Lifecycle.State state) {
        if (Intrinsics.LJFF(str, "chatReportSubmit") && state.isAtLeast(Lifecycle.State.STARTED)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final void LJJIJ(LifecycleOwner lifecycleOwner, AwS546S0100000_2 awS546S0100000_2) {
        DmFilterReportEventObserver dmFilterReportEventObserver = new DmFilterReportEventObserver(this, lifecycleOwner, awS546S0100000_2);
        lifecycleOwner.getLifecycle().addObserver(dmFilterReportEventObserver);
        if (!C622680Oba.LIZ(dmFilterReportEventObserver)) {
            C622680Oba.LIZJ(dmFilterReportEventObserver);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final void LJJIJL(FragmentManager fragmentManager, EnumC894560Z7m enumC894560Z7m) {
        String str = DmFilterAddKeywordsBottomSheet._pnsPageId;
        if (((Number) C0BBD.LIZ.getValue()).intValue() > 0 && DmFilterAddKeywordsBottomSheet.LLJILLL == null) {
            C01GW c01gw = C888940Yu4.LIZ;
            if (((Keva) c01gw.getValue()).getInt("BottomSheetDisplayCount", 0) < 4 && !((Keva) c01gw.getValue()).getBoolean("KeywordsEditedBefore", false)) {
                C888830Ytt.LIZ(fragmentManager, enumC894560Z7m, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.service.IIMChatListApi
    public final void LIZJ(FragmentManager fragmentManager, EnumC894560Z7m enumC894560Z7m, String str) {
        String str2 = DmFilterAddKeywordsBottomSheet._pnsPageId;
        if (((Number) C0BBD.LIZ.getValue()).intValue() > 0 && DmFilterAddKeywordsBottomSheet.LLJILLL == null) {
            C01GW c01gw = C888940Yu4.LIZ;
            if (((Keva) c01gw.getValue()).getInt("BottomSheetDisplayCount", 0) < 4 && !((Keva) c01gw.getValue()).getBoolean("KeywordsEditedBefore", false)) {
                C888830Ytt.LIZ(fragmentManager, enumC894560Z7m, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d8  */
    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(X.C0Y8T r21, android.app.Activity r22, X.InterfaceC1364105Vn<? super java.lang.Boolean> r23) {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.IMChatListImpl.LJIJ(X.0Y8T, android.app.Activity, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final AbstractC20660015ss<DialogFragment> LJJIFFI(final Context context, final LifecycleOwner lifecycleOwner, final FragmentManager fragmentManager) {
        return new AbstractC20660015ss<DialogFragment>(context, lifecycleOwner, fragmentManager) { // from class: X.0Ytn
            public final Context LL;
            public final LifecycleOwner LLILLJJLI;
            public final FragmentManager LLILLL;
            public final int LLILZ = 551;

            @Override // X.AbstractC20656215sG
            public final boolean canShow() {
                C01GW c01gw = C888940Yu4.LIZ;
                return ((Keva) c01gw.getValue()).getInt("BottomSheetDisplayCount", 0) < 4 && !((Keva) c01gw.getValue()).getBoolean("KeywordsEditedBefore", false);
            }

            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                return new C688120Qyw(this.LL, this.LLILLJJLI, null);
            }

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return this.LLILZ;
            }

            @Override // com.bytedance.poplayer.IPopupTask
            public final Object showPopup(C688120Qyw c688120Qyw) {
                String str = DmFilterAddKeywordsBottomSheet._pnsPageId;
                return C888830Ytt.LIZ(this.LLILLL, EnumC894560Z7m.REPORT, null);
            }

            {
                this.LL = context;
                this.LLILLJJLI = lifecycleOwner;
                this.LLILLL = fragmentManager;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi
    public final void LJJIJIIJI(Context context, FragmentManager fragmentManager, C897280ZHy c897280ZHy) {
        Integer numLIZJ;
        String str;
        String str2;
        String str3;
        C0Z4E.LIZ.getClass();
        C888640Yta c888640YtaLJ = C0Z4E.LJ(context, "chat_inline_msg");
        C1391960mKI c1391960mKI = new C1391960mKI();
        c1391960mKI.LJI = 0;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_bell_activation_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        String str4 = null;
        if (context != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        } else {
            numLIZJ = null;
        }
        c1391960mKI.LIZIZ = c419910GdJ;
        c1391960mKI.LIZJ = numLIZJ;
        if (c888640YtaLJ != null) {
            str4 = c888640YtaLJ.LIZ;
        }
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        c1391960mKI.LJII = str4;
        if (c888640YtaLJ == null || (str = c888640YtaLJ.LIZIZ) == null) {
            str = "";
        }
        c1391960mKI.LJIIIIZZ = str;
        c1391960mKI.LIZ = false;
        C1391990mKL c1391990mKL = new C1391990mKL();
        if (c888640YtaLJ == null || (str2 = c888640YtaLJ.LIZJ) == null) {
            str2 = "";
        }
        c1391990mKL.LIZ(str2);
        c1391990mKL.LIZJ = new AwS450S0200000_14(c888640YtaLJ, c897280ZHy, 14);
        c1391960mKI.LJIIJJI = c1391990mKL;
        C1391990mKL c1391990mKL2 = new C1391990mKL();
        if (c888640YtaLJ != null && (str3 = c888640YtaLJ.LIZLLL) != null) {
            str5 = str3;
        }
        c1391990mKL2.LIZ(str5);
        c1391990mKL2.LIZJ = new AwS450S0200000_14(c888640YtaLJ, c897280ZHy, 15);
        c1391960mKI.LJIILIIL = c1391990mKL2;
        TuxPanel tuxPanel = c1391960mKI.LIZ().LIZ;
        tuxPanel.LLJI = false;
        tuxPanel.LLJIJIL = false;
        tuxPanel.LLJILJIL = false;
        tuxPanel.show(fragmentManager, "MessageRequestPromptSheet");
    }
}
