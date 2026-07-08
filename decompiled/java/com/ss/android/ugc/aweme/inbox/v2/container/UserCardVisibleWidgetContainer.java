package com.ss.android.ugc.aweme.inbox.v2.container;

import X.C0QSJ;
import X.C0ZAV;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1889140zGC;
import X.C1889180zGG;
import X.C1889330zGV;
import X.C1889340zGW;
import X.C1889360zGY;
import X.C1904490zex;
import X.C2217381BqS;
import X.C687700QyG;
import X.C885880Yp8;
import X.C890610Ywl;
import X.EnumC1889770zHD;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObserverS218S0100000_14;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxVisibilityWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IMessageInboxWidgetAbility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class UserCardVisibleWidgetContainer extends InboxVisibilityWidgetContainer implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public boolean LLJJ;
    public volatile InboxAbilityCenter$IInboxImFilterAbility LLJJI;
    public InterfaceC665370Q7z LLJJIII;
    public C0QSJ LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UserCardVisibleWidgetContainer.class, "inboxImFilterAbility", "getInboxImFilterAbility()Lcom/ss/android/ugc/aweme/inbox/widget/v2/ability/InboxAbilityCenter$IInboxImFilterAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{InboxFragmentScope.class});
    }

    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InboxFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public List<C1889180zGG> Oo() {
        C1889180zGG c1889180zGG = (C1889180zGG) C1889140zGC.LIZ.LJI(this).get(C0ZAV.LIZIZ);
        return (c1889180zGG == null || !c1889180zGG.LIZLLL) ? C13BV.INSTANCE : Collections.singletonList(c1889180zGG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer, com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public void onCreate() {
        Pair<? extends InboxWidgetStatus, C885880Yp8> pair;
        NextLiveData nextLiveDataWc2;
        super.onCreate();
        InboxAbilityCenter$IMessageInboxWidgetAbility inboxAbilityCenter$IMessageInboxWidgetAbility = (InboxAbilityCenter$IMessageInboxWidgetAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IMessageInboxWidgetAbility.class, null);
        if (inboxAbilityCenter$IMessageInboxWidgetAbility == null || (nextLiveDataWc2 = inboxAbilityCenter$IMessageInboxWidgetAbility.wc2()) == null) {
            this.LLJJ = false;
            if (inboxAbilityCenter$IMessageInboxWidgetAbility == null) {
                return;
            }
        } else {
            nextLiveDataWc2.observe(this, new AObserverS218S0100000_14(this, 7));
        }
        NextLiveData nextLiveDataWc22 = inboxAbilityCenter$IMessageInboxWidgetAbility.wc2();
        if (nextLiveDataWc22 == null || (pair = (Pair) nextLiveDataWc22.getValue()) == null) {
            return;
        }
        ap(pair);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer
    public void Zo(InboxWidget inboxWidget) {
        super.Zo(inboxWidget);
    }

    public final void ap(Pair<? extends InboxWidgetStatus, C885880Yp8> pair) {
        int size;
        List<C890610Ywl> list;
        InboxWidgetStatus first = pair.getFirst();
        C885880Yp8 second = pair.getSecond();
        boolean z = false;
        if (second != null && (list = second.LIZ) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (Intrinsics.LJFF(first, C1889330zGV.LIZ)) {
            this.LLJJ = false;
            return;
        }
        if (!Intrinsics.LJFF(first, C1889360zGY.LIZ) && !Intrinsics.LJFF(first, C1889340zGW.LIZ)) {
            return;
        }
        if (size >= 100) {
            z = true;
        }
        this.LLJJ = z;
        if (!z) {
            return;
        }
        C1904490zex.LJFF.LJIIJ("recommend", EnumC1889770zHD.NO_NEED_SHOW);
    }
}
